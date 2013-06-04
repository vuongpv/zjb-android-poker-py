package com.android.zjb.pokerGame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MixView extends Activity {
	int[] imgs = new int[]{
		R.drawable.my_girl,
		R.drawable.my_girlfriend,
		R.drawable.my_lover
	};
	
	int currImg = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pic_main);
		
		LinearLayout main = (LinearLayout) findViewById(R.id.root);
		final ImageView img = new ImageView(this);
		main.addView(img);
		
		img.setImageResource(imgs[0]);
		img.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				if(currImg > 2){
					currImg = 0;
				}
				img.setImageResource(imgs[currImg++]);
			}
		});
	}
}
