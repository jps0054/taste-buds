package com.tastebuds;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TasteBuds extends Activity implements OnClickListener{

	Button b1;
	Button b2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taste_buds);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_taste_buds, menu);
        return true;

    }

	@Override
	public void onClick(View v) {
		if(v.getId()== R.id.button1){
      	Intent next1 = new Intent (this,Indian1.class);
    	startActivity(next1);
		}
    	if(v.getId()== R.id.button2){
    	Intent next2 = new Intent (this,Italian.class);
    	startActivity(next2);
    	}
    	
		
	}
}
