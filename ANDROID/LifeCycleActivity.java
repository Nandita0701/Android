package lifecycle.tuts4mobile.sat.lifecycle;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import lifecycle.tuts4mobile.sat.lifecycle.R;

public class LifeCycleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_main);
        Toast.makeText(LifeCycleActivity.this,"ON CREATE", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Toast.makeText(LifeCycleActivity.this,"ON START", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Toast.makeText(LifeCycleActivity.this,"ON RESUME", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Toast.makeText(LifeCycleActivity.this,"ON PAUSE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText(LifeCycleActivity.this,"ON RESTART", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Toast.makeText(LifeCycleActivity.this,"ON STOP", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Toast.makeText(LifeCycleActivity.this,"ON DESTROY", Toast.LENGTH_SHORT).show();
    }
}