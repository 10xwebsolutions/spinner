package com.ak.in.spinner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

Spinner spinner1;
String item = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		spinner1 = (Spinner)findViewById(R.id.spinner1);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.res);
		adapter.add("ram");
		adapter.add("sita");
		adapter.add("ravan");
		adapter.add("duryodhan");
		adapter.add("khalnaak");
		adapter.add("shyam");
		
		spinner1.setAdapter(adapter);
		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
			item = adapter.getItem(arg2);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Button textView1 = (Button)findViewById(R.id.textView1);
		textView1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,Second.class);
				intent.putExtra("name", item);
				startActivity(intent);
			}
		});
	}



}
