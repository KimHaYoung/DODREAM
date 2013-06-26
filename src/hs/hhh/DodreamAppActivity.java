package hs.hhh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class DodreamAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView ImgFirst_do=(ImageView)findViewById(R.id.ImgFirst_dodream);
        ImgFirst_do.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent Living=new Intent(DodreamAppActivity.this,LivingRoom.class);
				startActivity(Living);
			}
		});
    }
}