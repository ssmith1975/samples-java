package com.commonsware.android.basic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public class CheckBoxDemoActivity extends Activity implements CompoundButton.OnCheckedChangeListener {
	  CheckBox cb;
	  RadioGroup rg;
	  RadioButton alpha;
	  RadioButton beta;
	  RadioButton gamma;
	  TextView tv;
	  
	  @Override
	  public void onCreate(Bundle icicle) {
	    super.onCreate(icicle);
	    setContentView(R.layout.main);

	    cb=(CheckBox)findViewById(R.id.check);
	    cb.setOnCheckedChangeListener(this);
	    
	    tv = (TextView)findViewById(R.id.rbResponse);
	    //tv.setText("oooo");
	    
	    rg = (RadioGroup)findViewById(R.id.rgroup);
	    alpha = (RadioButton)findViewById(R.id.rbAlpha);
	    beta = (RadioButton)findViewById(R.id.rbBeta);
	    gamma = (RadioButton)findViewById(R.id.rbGamma);
	    
	    rg.check(R.id.rbBeta);
	   
	  }

	  public void onCheckedChanged(CompoundButton buttonView, 	boolean isChecked) {
		 
			 
			    if (isChecked) {
			      cb.setText("This checkbox is: checked");
			      
			      if(alpha.isChecked()){
			    	tv.setText(alpha.getText());  
			      } else if (beta.isChecked()) {
			    	  tv.setText(beta.getText());
			    	  
			      } else if(gamma.isChecked()){
			    	  tv.setText(gamma.getText());
			      }
			      
			      
			    }
			    else {
			      cb.setText("This checkbox is: unchecked");
			      //rg.clearCheck();
			      tv.setText("");
			    }

	  }	 
}