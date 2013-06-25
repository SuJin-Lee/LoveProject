package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class LoveActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageButton btn_test = (ImageButton)findViewById(R.id.btn_test);
        
        btn_test.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				go();
			}
		});
    }
    private void go(){
    	
    	Intent intent = new Intent(this, First.class);
    	startActivity(intent);
    }
    
}