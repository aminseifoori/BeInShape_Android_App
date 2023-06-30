package com.apsoft.beinshape;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	ImageButton btn1;
	ImageButton btn2;
	ImageButton btn3;
	ImageButton btn4;
	ImageButton btn5;
	public static int whichpage=0;
	Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ActionBar actionBar = getActionBar();
        //actionBar.setHomeButtonEnabled(true);
        btn1=(ImageButton)findViewById(R.id.imageButton1);
        btn2=(ImageButton)findViewById(R.id.imageButton2);
        btn3=(ImageButton)findViewById(R.id.imageButton3);
        btn4=(ImageButton)findViewById(R.id.imageButton4);
        btn5=(ImageButton)findViewById(R.id.imageButton5);
        
        btn1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				whichpage=1;
				in=new Intent(MainActivity.this,ListItems.class);
				startActivity(in);
			}
		});
        
        btn2.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				whichpage=2;
				in=new Intent(MainActivity.this,ListItems.class);
				startActivity(in);
			}
		});
        
        btn3.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				whichpage=3;
				in=new Intent(MainActivity.this,ListItems.class);
				startActivity(in);
			}
		});
        
        btn4.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				whichpage=4;
				in=new Intent(MainActivity.this,ListItems.class);
				startActivity(in);
			}
		});
        
        btn5.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				whichpage=5;
				in=new Intent(MainActivity.this,ListItems.class);
				startActivity(in);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	MenuInflater inflater = getMenuInflater();
    	getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
        // action with ID action_refresh was selected
    	case R.id.action_share:
        		String shareBody = "بدو بدو بخرین";
     	        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
     	        sharingIntent.setType("text/plain");
     	        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "نرم افزار اعجاز تناسب اندام");
     	        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
     	        startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.hello_world)));
          break;
        // action with ID action_settings was selected
         case R.id.action_back:
        	 	finish();
            break;
        default:
          break;
        }

    	return super.onOptionsItemSelected(item);
    }
    
}
