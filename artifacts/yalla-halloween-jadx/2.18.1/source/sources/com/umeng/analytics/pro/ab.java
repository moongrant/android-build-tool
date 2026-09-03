package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ab implements z {
    private static final String a = "Coolpad";
    private static final String b = "com.coolpad.deviceidsupport";
    private static final String c = "com.coolpad.deviceidsupport.DeviceIdService";
    private static a d;
    private CountDownLatch f;
    private Context g;
    private String e = "";
    private final ServiceConnection h = new ServiceConnection() { // from class: com.umeng.analytics.pro.ab.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                a unused = ab.d = a.AbstractBinderC0184a.a(iBinder);
                ab.this.e = ab.d.b(ab.this.g.getPackageName());
                Log.d(ab.a, "onServiceConnected: oaid = " + ab.this.e);
            } catch (RemoteException | NullPointerException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onServiceConnected failed e=");
                sbOooO0o0.append(e.getMessage());
                Log.e(ab.a, sbOooO0o0.toString());
            }
            ab.this.f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ab.a, "onServiceDisconnected");
            a unused = ab.d = null;
        }
    };

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(b, c));
            if (context.bindService(intent, this.h, 1)) {
                return;
            }
            Log.e(a, "bindService return false");
        } catch (Throwable th) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("bindService failed. e=");
            sbOooO0o0.append(th.getMessage());
            Log.e(a, sbOooO0o0.toString());
            this.f.countDown();
        }
    }

    private void c(Context context) {
        try {
            Log.d(a, "call unbindService.");
            context.unbindService(this.h);
        } catch (Throwable th) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unbindService failed. e=");
            sbOooO0o0.append(th.getMessage());
            Log.e(a, sbOooO0o0.toString());
        }
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.g = context.getApplicationContext();
        this.f = new CountDownLatch(1);
        try {
            b(context);
            if (!this.f.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(a, "getOAID time-out");
            }
            return this.e;
        } catch (InterruptedException e) {
            Log.e(a, "getOAID interrupted. e=" + e.getMessage());
            return null;
        } finally {
            c(context);
        }
    }
}
