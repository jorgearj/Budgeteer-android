package com.jaraujo.budgeteer.utils;

import com.jaraujo.budgeteer.exceptions.ReadDataException;
import com.jaraujo.budgeteer.models.BudgetStruct;

import java.io.InputStream;

/**
 * Created by jaraujo on 06/09/2016.
 */
public interface DataParser {

    BudgetStruct readBudgetStruct(InputStream is) throws ReadDataException;

    void writeBudgetStruct();

}
