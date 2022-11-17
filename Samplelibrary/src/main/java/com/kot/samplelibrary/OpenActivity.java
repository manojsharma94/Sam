package com.kot.samplelibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class OpenActivity extends Intent {
    void  start(Context context){
        context.startActivity(this,Dashboard.class);
    }
    public  static void Toaster(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }


}
