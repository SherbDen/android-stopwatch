package com.redballoonsoftware.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Stopwatch extends Activity {
	private static String TAG = "StopwatchActivity";
	private com.redballoonsoftware.widgets.Stopwatch mStopwatch;
	
	private Button mStartStop;
	private Button mResetLap; 
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Log.d(TAG, "Setting members");
        
        mStopwatch = (com.redballoonsoftware.widgets.Stopwatch)findViewById(R.id.Stopwatch01);
        mStartStop = (Button)findViewById(R.id.StartStopButton);
        mResetLap = (Button)findViewById(R.id.ResetLapButton);
        
        Log.d(TAG, "Setting View");
        
        setContentView(R.layout.stopwatch);
    }
    
    
    public void onStartStopButtonClick(View v) {
    	Log.d(TAG, "onStartStopButtonClick called");
    	mStopwatch.start();
    }
    
    public void onResetLapButtonClick(View v) {
    	Log.d(TAG, "onResetLapButtonClick called");
    }
    
    /*
    private void setOnClickListeners() {
    	
        findViewById(R.id.StartStopButton).setOnClickListener(
    		new View.OnClickListener() {
    			@Override
    			public void onClick(View v) {
    		    	Log.d(TAG, "onStartStopButtonClick called");
    		    	if (mStopwatch.isStarted() && !mStopwatch.isPaused()) {
    		    		Log.d(TAG, "stopping");
    		    		mStopwatch.stop();
    		    		mStartStop.setText("Start");
    		    		mResetLap.setText("Reset");
    		    	} else {
    		    		Log.d(TAG, "starting");
    		    		mStopwatch.start();
    		    		mStartStop.setText("Stop");
    		    		mResetLap.setTag("Lap");
    		    	}
    			}
    		}
        );

        findViewById(R.id.ResetLapButton).setOnClickListener(
        		new View.OnClickListener() {
        			@Override
        			public void onClick(View v) {
        		    	if (mStopwatch.isStarted() && !mStopwatch.isPaused()) {
        		    		// Lap
        		    	} else {
        		    		mStopwatch.reset();
        		    	}
        			}
        		}
        );
		
    }
	*/
}