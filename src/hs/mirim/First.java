package hs.mirim;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class First extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		
		ImageButton btn1 = (ImageButton)findViewById(R.id.btn1);
		ImageButton btn2 = (ImageButton)findViewById(R.id.btn2);
		final long down;
		final long up;
		final long a;
        btn1.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(event.getAction()==MotionEvent.ACTION_DOWN)
					Log.d("test", "´­·¶´Ù");
				    down =  System.currentTimeMillis(); 
				else if(event.getAction()==MotionEvent.ACTION_UP)
					Log.d("test","¶Ã´Ù");
				    up=  System.currentTimeMillis(); 
			a=up-down ;
				return false;
             }
		});
        
        btn2.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				return false;
			}
		});
	}
}
