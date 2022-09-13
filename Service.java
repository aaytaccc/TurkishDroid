import android.content.Intent;
import android.os.IBinder;

.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

@Override
public void onItemSelected(AdapterView<?> parent, View view, int position, long itemId) {

}

@Override
public void onNothingSelected(AdapterView<?> parent) {

}
});.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

@Override
public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long itemId) {

return false;
}
});.setOnItemClickListener(new AdapterView.OnItemClickListener() {

@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long itemId) {

}
});new Handler().postDelayed(new Runnable(){

@Override
public void run() {

}
}, 1000);startActivity(new Intent(this, Object.class));runOnUiThread(new Runnable(){

@Override
public void run() {

}
});runOnUiThread(new Runnable(){

@Override
public void run() {

}
});.setOnTouchListener(new View.OnTouchListener(){

@Override
public boolean onTouch(View view, MotionEvent event) {
int action = event.getAction();
if (action == MotionEvent.ACTION_DOWN) {
//click
} else if (action == MotionEvent.ACTION_UP) {
//up
} else if (action == MotionEvent.ACTION_MOVE) {
//move
}
return true;
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
dialog.show();runOnUiThread(new Runnable(){

@Override
public void run() {

}
});for (int i = 0; i < 0; i++) {

}Toast.makeText(getApplication(), "", Toast.LENGTH_SHORT).show();package com.aytaccakir.aaytaccc.superuser;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class Service extends Service
    {

        public static final String TAG = "Service";

        @Override
        public IBinder onBind ( Intent intent )
            {

                return null;
            }

    }
