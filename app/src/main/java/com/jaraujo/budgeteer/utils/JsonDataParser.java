package com.jaraujo.budgeteer.utils;

import com.bluelinelabs.logansquare.LoganSquare;
import com.jaraujo.budgeteer.enums.Errors;
import com.jaraujo.budgeteer.exceptions.ReadDataException;
import com.jaraujo.budgeteer.models.BudgetStruct;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jaraujo on 06/09/2016.
 */
public class JsonDataParser implements DataParser {


    @Override
    public BudgetStruct readBudgetStruct(InputStream is) throws ReadDataException {
        BudgetStruct budget = null;
        try {
            budget = LoganSquare.parse(is, BudgetStruct.class);
        } catch (IOException e) {
            throw new ReadDataException(Errors.UNABLE_TO_READ_DATA.getMsg(), e);
        }

        return budget;
    }

    @Override
    public void writeBudgetStruct() {

    }
}
