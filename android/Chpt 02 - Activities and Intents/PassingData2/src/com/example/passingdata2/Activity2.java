package com.example.passingdata2;

//import com.ssmith1975.passingdata.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		
		String defaultName="";
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			defaultName = extras.getString("Name");
		}
		
		//--=get the EditText view---
		EditText txt_username = 
				(EditText) findViewById(R.id.txt_username);
		txt_username.setHint(defaultName);
		
		// --get the OK button ---
		Button btn = (Button) findViewById(R.id.btn_OK);

		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent();

				// ---get the EditText view---
				EditText txt_username = (EditText) findViewById(R.id.txt_username);

				// ---set the data to pass back---
				data.setData(Uri.parse(txt_username.getText().toString()));
				setResult(RESULT_OK, data);

				// --closes the activity---
				finish();
			}
		});
	} // end onCreate
}
