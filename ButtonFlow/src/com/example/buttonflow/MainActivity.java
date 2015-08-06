package com.example.buttonflow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends Activity implements OnClickListener {
	private Button select;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		select = (Button) findViewById(R.id.select);
		select.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.select:
			Intent intent=new Intent(MainActivity.this,Menu.class);
			startActivity(intent);
			break;

		default:
			break;
		}
	}
   
}
