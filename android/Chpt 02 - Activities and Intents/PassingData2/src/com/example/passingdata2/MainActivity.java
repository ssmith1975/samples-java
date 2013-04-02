package com.example.passingdata2;

//import com.example.passingdata2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	String tag = "Event";
	int request_Code = 1;
    Context context = this;	
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    try {         
        setContentView(R.layout.main);

      
        Button btn =  (Button) findViewById(R.id.btnEnter);
        
        btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
					//((Activity) context).startActivityForResult(new Intent("com.example.passingdata2.ACTIVITY2"), request_Code);
			//startActivityForResult(new Intent("com.example.passingdata2.ACTIVITY2"), request_Code);
				
				Intent i = new Intent("com.example.passingdata2.ACTIVITY2");
				Bundle extras = new Bundle();
				extras.putString("Name", "Your name here");
				i.putExtras(extras);
				startActivityForResult(i,request_Code);
				Log.d(tag,"In the onCreate() event");

				
			}
		});
 		} catch (Exception ex) {
					Log.d(tag, ex.getMessage());
		}       
        
    } // end onCreate
    
   @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	   try {
	    	super.onActivityResult(requestCode, resultCode, data);
	    	if (requestCode == request_Code) {
	    		if(resultCode == RESULT_OK){
	    			Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT).show();
	    		}
	    	}
    	
	   }  catch (Exception ex) {
			Log.d(tag, ex.getMessage());
	   }	 
    }


}
