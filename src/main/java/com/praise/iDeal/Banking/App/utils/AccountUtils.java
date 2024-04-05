package com.praise.iDeal.Banking.App.utils;

import java.time.Year;

public class AccountUtils {
    public static String ACCOUNT_EXISTS_CODE = "001";
    public static String ACCOUNT_EXISTS_MESSAGE = "This user already exists";
    public static String ACCOUNT_CREATION_SUCCESS_CODE ="002";
    public static String ACCOUNT_CREATION_SUCCESS_MESSAGE ="Your account has been created successfully";
    public static String ACCOUNT_NUMBER_NOT_FOUND_CODE ="003";
    public static String ACCOUNT_NUMBER_NOT_FOUND_MESSAGE ="Provided account number does not exists";
    public static String ACCOUNT_CREDITED_SUCCESS_CODE ="004";
    public static String ACCOUNT_CREDITED_SUCCESS_MESSAGE ="Account has been credited successfully";
    public static String ACCOUNT_CREDITED_INSUFFICIENT_BALANCE_CODE ="005";
    public static String ACCOUNT_CREDITED_INSUFFICIENT_BALANCE_MESSAGE ="Insufficient funds";
    public static String ACCOUNT_DEBITED_SUCCESS_CODE ="006";
    public static String ACCOUNT_DEBITED_SUCCESS_MESSAGE ="Transfer Successful";
    public static String ACCOUNT_NUMBER_FOUND_CODE ="007";
    public static String ACCOUNT_NUMBER_FOUND_MESSAGE ="Account Number Found";
    public static String TRANSFER_SUCCESS_CODE ="008";
    public static String TRANSFER_SUCCESS_MESSAGE ="Transfer Successful";







    public static String generateAccountNumber(){

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String year = String.valueOf(currentYear);
        String randomNum = String.valueOf(randomNumber);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNum).toString();
    }
}
