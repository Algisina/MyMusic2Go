package de.alessandra.mymusic.view;

import de.alessandra.mymusic.R;
import de.alessandra.mymusic.R.id;
import de.alessandra.mymusic.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class MyMusic2GoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_layout);
        
        EditText inputUrl = (EditText) findViewById(R.id.inputurl);
        
    }
}