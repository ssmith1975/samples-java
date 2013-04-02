package com.ssmith1975.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	CharSequence[] items = { "Google", "Apple", "Microsoft" };
	boolean[] itemsChecked = new boolean[items.length];
	
	private ProgressDialog _progressDialog;
	private int _progress = 0;
	private Handler _progressHandler;
			
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn = (Button) findViewById(R.id.btn_dialog);
        Button btn_progress = (Button) findViewById(R.id.btn_progress);
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(0);
			}
		});
        
        btn_progress.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showDialog(1);
				_progress = 0;
				_progressDialog.setProgress(0);
				_progressHandler.sendEmptyMessage(0);
				
			}
		});
        
        _progressHandler = new Handler() {
        	public void handleMessage(android.os.Message msg) {
        		super.handleMessage(msg);
        		if (_progress >= 100) {
        			_progressDialog.dismiss();
        		} else {
        			_progress++;
        			_progressDialog.incrementProgressBy(1);
        			_progressHandler.sendEmptyMessageDelayed(0, 100);
        		}
        	}
        };
        
    }

@Override
protected Dialog onCreateDialog(int id) {
	// TODO Auto-generated method stub
	switch(id) {
	case 0:
		return new AlertDialog.Builder(this)
		.setIcon(R.drawable.icon)
		.setTitle("This is a dialog with some simple text...")
		.setPositiveButton("OK", new
				DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getBaseContext(),
								"OK clicked!", Toast.LENGTH_SHORT).show();
						
					} // end onClick
				})
		.setNegativeButton("Cancel", new
				DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Toast.makeText(getBaseContext(), "Cancel clicked!", Toast.LENGTH_SHORT).show();
					} // end onClick
				})
		.setMultiChoiceItems(items, itemsChecked, new 
				DialogInterface.OnMultiChoiceClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which, boolean isChecked) {
						Toast.makeText(getBaseContext(), items[which] + (isChecked ? " checked!": 
							" unchecked!"), Toast.LENGTH_SHORT).show();
						
					} // end onClick
				})
				.create();
	
	case 1:
		_progressDialog = new ProgressDialog(this);
		_progressDialog.setIcon(R.drawable.icon);
		_progressDialog.setTitle("Downloading files...");
		_progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		_progressDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Hide", new 
				DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getBaseContext(), "Hide clicked!", Toast.LENGTH_SHORT).show();
						
					}
				});
		_progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new 
				DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getBaseContext(), "Cancel clicked!", Toast.LENGTH_SHORT).show();
						
					}
				});		
		
		return _progressDialog;
		
	} // end switch
	return null;
}
}
