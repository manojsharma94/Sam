package com.kot.samplelibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;


public class OpenActivity extends Intent {
    void  start(Context context){
        context.startActivity(this,Dashboard.class);
    }


}
