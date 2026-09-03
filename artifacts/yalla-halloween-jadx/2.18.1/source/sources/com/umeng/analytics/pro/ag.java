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
public class ag implements z {
    private static final String a = "DeviceIdService";
    private static final String b = "com.samsung.android.deviceidservice";
    private static final String c = "com.samsung.android.deviceidservice.DeviceIdService";
    private CountDownLatch e;
    private String d = "";
    private final ServiceConnection f = new ServiceConnection() { // from class: com.umeng.analytics.pro.ag.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                b bVarA = b.a.a(iBinder);
                ag.this.d = bVarA.a();
                Log.d(ag.a, "onServiceConnected");
            } catch (RemoteException | NullPointerException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("onServiceConnected failed e=");
                sbOooO0o0.append(e.getMessage());
                Log.e(ag.a, sbOooO0o0.toString());
            }
            ag.this.e.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ag.a, "onServiceDisconnected");
        }
    };

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName(b, c);
            if (context.bindService(intent, this.f, 1)) {
            } else {
                throw new UnsupportedOperationException("not supported service");
            }
        } catch (Error | Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("bindService failed. e=");
            sbOooO0o0.append(e.getMessage());
            Log.e(a, sbOooO0o0.toString());
            this.e.countDown();
        }
    }

    private void c(Context context) {
        try {
            context.unbindService(this.f);
        } catch (Error | Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unbindService failed. e=");
            sbOooO0o0.append(e.getMessage());
            Log.e(a, sbOooO0o0.toString());
        }
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        this.e = new CountDownLatch(1);
        try {
            b(context);
            if (!this.e.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(a, "getOAID time-out");
            }
            return this.d;
        } catch (InterruptedException e) {
            Log.e(a, "getOAID interrupted. e=" + e.getMessage());
            return null;
        } finally {
            c(context);
        }
    }
}
