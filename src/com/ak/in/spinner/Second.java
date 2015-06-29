package com.ak.in.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		TextView name = (TextView)findViewById(R.id.name);
		
		name.setText(getIntent().getExtras().getString("name"));
	}

}
