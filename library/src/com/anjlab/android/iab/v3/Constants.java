package com.anjlab.android.iab.v3;

public class Constants {
	public static final int BILLING_RESPONSE_RESULT_OK = 0; 				//Success
	public static final int BILLING_RESPONSE_RESULT_USER_CANCELED =	1; 		//User pressed back or canceled a dialog
	public static final int BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE = 3;//Billing API version is not supported for the type requested
	public static final int BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE = 4; 	//Requested product is not available for purchase
	public static final int BILLING_RESPONSE_RESULT_DEVELOPER_ERROR = 5; 	//Invalid arguments provided to the API. This error can also indicate that the application was not correctly signed or properly set up for In-app Billing in Google Play, or does not have the necessary permissions in its manifest
	public static final int BILLING_RESPONSE_RESULT_ERROR =	6; 				//Fatal error during the API action
	public static final int BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED = 7; //Failure to purchase since item is already owned
	public static final int BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED = 8; 	//Failure to consume since item is not owned
	
	public static final String RESPONSE_CODE = "RESPONSE_CODE";
	public static final String DETAILS_LIST = "DETAILS_LIST";
	public static final String INAPP_PURCHASE_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
	public static final String BUY_INTENT = "BUY_INTENT";
	public static final String INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";

	public static final int BILLING_ERROR_FAILED_LOAD_PURCHASED_PRODUCTS = 100;
	public static final int BILLING_ERROR_FAILED_TO_INITIALIZE_PURCHASE = 101;
	public static final int BILLING_ERROR_INVALID_SIGNATURE = 102;
	public static final int BILLING_ERROR_LOST_CONTEXT = 103;
	public static final int BILLING_ERROR_OTHER_ERROR = 110;
}
