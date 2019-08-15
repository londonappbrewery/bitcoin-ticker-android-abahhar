package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyDataModel {
    private String mPrice;

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    public static CurrencyDataModel fromJson(JSONObject jsonObject) {

        try {
            CurrencyDataModel currencyData = new CurrencyDataModel();
            currencyData.mPrice = jsonObject.getString("last");
            return currencyData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }
}
