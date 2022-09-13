for (int i = 0; i < 0; i++) {

}runOnUiThread(new Runnable(){

@Override
public void run() {

}
});runOnUiThread(new Runnable(){

@Override
public void run() {

}
});AlertDialog dialog = new AlertDialog.Builder(this)
.setTitle("Titie")
.setMessage("Message")
.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

@Override
public void onClick(DialogInterface dia, int which) {

}
})
.setNegativeButton("Cancel", null)
.create();
dialog.show();CharSequence[] items={};
boolean[] checkedItems = {};
AlertDialog dialog = new AlertDialog.Builder(this)
.setTitle("Titie")
.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener(){

@Override
public void onClick(DialogInterface dia, int which, boolean isChecked) {

}
})
.setPositiveButton("Ok", null)
.setNegativeButton("Cancel", null)
.create();
dialog.show();.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

@Override
public void onItemSelected(AdapterView<?> parent, View view, int position, long itemId) {

}

@Override
public void onNothingSelected(AdapterView<?> parent) {

}
});runOnUiThread(new Runnable(){

@Override
public void run() {

}
});new Handler().postDelayed(new Runnable(){

@Override
public void run() {

}
}, 1000);.getText().toString()Toast.makeText(getApplication(), "", Toast.LENGTH_SHORT).show();package com.aytaccakir.aaytaccc.superuser;

import android.app.Activity;
import android.os.Bundle;

public abstract class Activity extends Activity {
    
    public static final String TAG = "Activity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }
    
}
