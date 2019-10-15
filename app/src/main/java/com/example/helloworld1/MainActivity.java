package com.example.helloworld1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.math.*;
import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager sManager;
    private TextView tv;
    public int m_n1;
    public int m_n2;
    public double m_result;
    public int m_calc;
    public boolean m_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        tv = (TextView) findViewById(R.id.tv);
        sManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        m_n1 = 0;
        m_n2 = 0;
        m_b = false;
        m_result = 0.0;
        m_calc = 1;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void one(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "1");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "1");
            updateText(2);
        }

    }
    public void two(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "2");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "2");
            updateText(2);
        }
    }
    public void three(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "3");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "3");
            updateText(2);
        }
    }
    public void four(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "4");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "4");
            updateText(2);
        }
    }
    public void five(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "5");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "5");
            updateText(2);
        }
    }
    public void six(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "6");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "6");
            updateText(2);
        }
    }
    public void seven(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "7");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "7");
            updateText(2);
        }
    }
    public void eight(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "8");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "8");
            updateText(2);
        }
    }
    public void nine(View v)
    {
        if (m_b)
        {
            m_n1 = Integer.parseInt(Integer.toString(m_n1) + "9");
            updateText(1);
        }
        else
        {
            m_n2 = Integer.parseInt(Integer.toString(m_n2) + "9");
            updateText(2);
        }
    }
    public void sin(View v)
    {
        updateText(8);
        m_calc = 4;
    }
    public void cos(View v)
    {
        updateText(9);
        m_calc = 5;
    }
    public void tan(View v)
    {
        updateText(10);
        m_calc = 5;
    }
    public void add(View v)
    {
        updateText(4);
        if (m_b) {
        m_b = false;
        }
        else
        {
            m_b = true;
        }
        m_calc = 1;
    }
    public void sub(View v)
    {
        updateText(5);
        if (m_b) {
            m_b = false;
        }
        else
        {
            m_b = true;
        }
        m_calc = 0;
    }
    public void mult(View v)
    {
        updateText(6);
        if (m_b){
            m_b = false;
        }
        else
        {
            m_b = true;
        }
        m_calc = 2;
    }
    public void divide(View v)
    {
        updateText(7);
        if (m_b){
            m_b = false;
        }
        else
        {
            m_b = true;
        }
        m_calc = 3;
    }
    public void calc(View v)
    {
        TextView txtView = (TextView) findViewById(R.id.textView4);
        double result = 0.0;
        if (m_calc == 0)
        {
            if (m_b)
            {
                result = (double)(m_n2)- (double)(m_n1);
            }
            else {
                result = (double)(m_n1) - (double)(m_n2);
                }
        }
        else if (m_calc == 1)
        {
            result = m_n1 + m_n2;
        }
        else if (m_calc == 2)
        {
            result = m_n1 * m_n2;
        }
        else if (m_calc == 3)
        {
            if(m_b) {
                result = (double)(m_n2) / (double)(m_n1);
            }
            else
            {
                result = (double)(m_n1) / (double)(m_n2);
            }
        }
        else if (m_calc==4)
        {
            if(m_b) {
                result = Math.sin((double)(m_n1));
            }
            else
            {
                result = Math.sin((double)(m_n2));
            }
        }
        else if (m_calc==5)
        {
            if(m_b) {
                result = Math.cos((double)(m_n1));
            }
            else
            {
                result = Math.cos((double)(m_n2));
            }
        }
        else if (m_calc==6)
        {
            if(m_b) {
                result = Math.tan((double)(m_n1));
            }
            else
            {
                result = Math.tan((double)(m_n2));
            }
        }
        m_result = result;
        txtView.setText(Double.toString(result));
        updateText(3);

    }
    public void updateText(int i)
    {

        TextView txtView = (TextView) findViewById(R.id.textView4);
        txtView.setTextSize(100);
        if(i == 1)
            txtView.setText(Integer.toString(m_n1));
        if(i == 2)
            txtView.setText(Integer.toString(m_n2));
        if(i == 3)
            txtView.setText(Double.toString(m_result));
        if(i == 4)
            txtView.setText("+");
        if(i == 5)
            txtView.setText("-");
        if(i == 6)
            txtView.setText("*");
        if(i == 7)
            txtView.setText("/");
        if(i == 8)
            txtView.setText("sine");
        if(i == 9)
            txtView.setText("cosine");
        if(i == 10)
            txtView.setText("tangent");
    }
    public void ClearAll(View v)
    {
        TextView txtView = (TextView) findViewById(R.id.textView4);
        txtView.setText("");
        m_n2 = 0;
        m_n1 = 0;

    }

    public void onClick(View v)
    {
        TextView txtView = (TextView) findViewById(R.id.textView);
        float size = txtView.getTextSize();
        txtView.setTextSize(size + 5);
    }
    protected void onResume()
    {
        super.onResume();
        /*register the sensor listener to listen to the gyroscope sensor, use the
        callbacks defined in this class, and gather the sensor information as quick
        as possible*/
        sManager.registerListener(this, sManager.getDefaultSensor(Sensor.TYPE_ORIENTATION),SensorManager.SENSOR_DELAY_FASTEST);
    }
    @Override
    protected void onStop()
    {
        //unregister the sensor listener
        sManager.unregisterListener(this);
        super.onStop();
    }

    @Override
    public void onAccuracyChanged(Sensor arg0, int arg1)
    {
        //Do nothing.
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        //if sensor is unreliable, return void
        if (event.accuracy == SensorManager.SENSOR_STATUS_UNRELIABLE)
        {
            return;
        }

        //else it will output the Roll, Pitch and Yawn values
        tv.setText("Orientation X (Roll) :"+ Float.toString(event.values[2]) +"\n"+
                "Orientation Y (Pitch) :"+ Float.toString(event.values[1]) +"\n"+
                "Orientation Z (Yaw) :"+ Float.toString(event.values[0]));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
