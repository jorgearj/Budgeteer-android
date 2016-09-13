package com.jaraujo.budgeteer;

import com.bluelinelabs.logansquare.LoganSquare;
import com.jaraujo.budgeteer.models.Account;
import com.jaraujo.budgeteer.models.BudgetStruct;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jaraujo on 05/09/2016.
 */
public class JsonParsingTest {

    private File testFile;

    @Before
    public void setup() throws IOException {

    }

    @Test
    public void serializeAnAccount() throws IOException{
        Account ac1 = new Account();
        ac1.setId("Acc1");
        ac1.setName("TestAcc");
        ac1.setAmount(1000.2);
        Account ac2 = new Account();
        ac2.setId("Acc2");
        ac2.setName("TestAcc2");
        ac2.setAmount(10.2);

        List<Account> list = new ArrayList<Account>();
        list.add(ac1);
        list.add(ac2);

        System.out.println(LoganSquare.serialize(ac2));

        System.out.println(LoganSquare.serialize(list));

    }

    @Test
    public void parseBudgetStruct() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("example_budget.json");
        BudgetStruct budget = LoganSquare.parse(is, BudgetStruct.class);
        System.out.println(budget.toString());
    }

    @Test
    public void parseAccounts() throws IOException{
        String jsonString = "[{\"amount\":1000.2,\"id\":\"Acc1\",\"name\":\"TestAcc\"},{\"amount\":10.2,\"id\":\"Acc2\",\"name\":\"TestAcc2\"}]";

        List<Account> list = LoganSquare.parseList(jsonString, Account.class);

        for(Account a : list){
            System.out.println(a.toString());
        }
    }

    @Test
    public void parseAccountsMap() throws IOException{
        String jsonString = "{\n" +
                "  \"accounts\": [\n" +
                "    {\n" +
                "      \"id\":\"acc_1\",\n" +
                "      \"name\": \"CGD\",\n" +
                "      \"amount\": 1000.2\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\":\"acc_2\",\n" +
                "      \"name\": \"BES\",\n" +
                "      \"amount\": 10.2\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        Map<String, Object> map = LoganSquare.parseMap(jsonString, Object.class);


        for(String a : map.keySet()){
            System.out.println(a);
            System.out.println(map.get(a).toString());
            String accounts = LoganSquare.serialize(map.get(a));
            List<Account> listAccount = LoganSquare.parseList(accounts, Account.class);
            for(Account acc : listAccount){
                System.out.println(acc.toString());
            }
        }
    }
}
