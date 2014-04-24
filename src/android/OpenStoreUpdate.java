package hu.dpal.phonegap.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class OpenStoreUpdate extends CordovaPlugin {

    private Context context;

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    	  
        if (action.equals("go")) {
        
        	this.context = cordova.getActivity().getApplicationContext();
        	final String appid = args.getString(0);
        	
        	Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appid));
            cordova.startActivity(intent);
            
            return true;
        }

        return false;
    }

}