package com.ssmith1975.passingdata;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	int request_Code = 1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn =  (Button) findViewById(R.id.btnEnter);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//startActivityForResult(new Intent("com.ssmith1975.passing.data.ACTIVITY2"), request_Code);
			}
		});
    } // end onCreate
    
/*    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	super.onActivityResult(requestCode, resultCode, data);
    	if (requestCode == request_Code) {
    		if(resultCode == RESULT_OK){
    			Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT).show();
    		}
    	}
    }*/


}
