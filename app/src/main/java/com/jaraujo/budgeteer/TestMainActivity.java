package com.jaraujo.budgeteer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jaraujo.budgeteer.exceptions.ReadDataException;
import com.jaraujo.budgeteer.models.BudgetStruct;
import com.jaraujo.budgeteer.utils.JsonDataParser;

import java.io.InputStream;

public class TestMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_main);

        InputStream is = this.getResources().openRawResource(R.raw.example_budget);

        JsonDataParser parser = new JsonDataParser();

        try {
            BudgetStruct budget = parser.readBudgetStruct(is);
        } catch (ReadDataException e) {
            e.printStackTrace();
        }
    }

}
