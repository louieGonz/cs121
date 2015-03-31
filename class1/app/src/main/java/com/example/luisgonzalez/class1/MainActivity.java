package com.example.luisgonzalez.class1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void clickEnter(View v) {
        // Gets the string in the input field.
        EditText et = (EditText) findViewById(R.id.editText);
        String t = et.getText().toString();                   //getText() returns psuedo-string
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(t);
    }

    public void clickEnter2(View v){
        //EditText et2 = (EditText) findViewById(R.id.editText2);
        //String t = et2.getText().toString();
        String t = "BANANA";
        TextView tv2 = (TextView) findViewById(R.id.textView);
        tv2.setText(t);
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
