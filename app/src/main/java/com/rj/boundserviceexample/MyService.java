package com.rj.boundserviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    private final IBinder binder = new MyBinder();
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public int getSum(int a, int b){
        return a+b;
    }


    class MyBinder extends Binder{
        public MyService getMyService(){
            return MyService.this;
        }
    }
}
