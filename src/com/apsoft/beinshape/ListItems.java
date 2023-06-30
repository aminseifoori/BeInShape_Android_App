package com.apsoft.beinshape;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;

public class ListItems extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_items);
		switch(MainActivity.whichpage)
		{
			case 1:
				getActionBar().setTitle("غذاهای رژیمی");
				break;
			case 2:
				getActionBar().setTitle("برنامه رژیم غذایی");
				break;
			case 3:
				getActionBar().setTitle("توصیه های تناسب اندام");
				break;
			case 4:
				getActionBar().setTitle("توصیه های ورزشی");
				break;
			case 5:
				getActionBar().setTitle("میان وعده های کم کالری");
				break;
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
    	MenuInflater inflater = getMenuInflater();
		getMenuInflater().inflate(R.menu.list_items, menu);
		return true;
	}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
        // action with ID action_refresh was selected
        case android.R.id.home:
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            break;
    	case R.id.action_back:
        		finish();
          break;
        default:
          break;
        }

    	return super.onOptionsItemSelected(item);
    }
}
