package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f20342OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Intent f20343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScheduledExecutorService f20344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque f20345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f20346OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o000Oo0 f20347OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Intent f20348OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TaskCompletionSource<Void> f20349OooO0O0 = new TaskCompletionSource<>();

        public OooO00o(Intent intent) {
            this.f20348OooO00o = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public o000O0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f20345OooO0Oo = new ArrayDeque();
        this.f20346OooO0o = false;
        Context applicationContext = context.getApplicationContext();
        this.f20342OooO00o = applicationContext;
        this.f20343OooO0O0 = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f20344OooO0OO = scheduledThreadPoolExecutor;
    }

    public final synchronized void OooO00o() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f20345OooO0Oo.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            o000Oo0 o000oo1 = this.f20347OooO0o0;
            if (o000oo1 == null || !o000oo1.isBinderAlive()) {
                OooO0OO();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f20347OooO0o0.OooO00o((OooO00o) this.f20345OooO0Oo.poll());
        }
    }

    public final synchronized Task<Void> OooO0O0(Intent intent) {
        final OooO00o oooO00o;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        oooO00o = new OooO00o(intent);
        ScheduledExecutorService scheduledExecutorService = this.f20344OooO0OO;
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.o000O00
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                o000O0.OooO00o oooO00o2 = oooO00o;
                sb.append(oooO00o2.f20348OooO00o.getAction());
                sb.append(" Releasing WakeLock.");
                Log.w("FirebaseMessaging", sb.toString());
                oooO00o2.f20349OooO0O0.trySetResult(null);
            }
        }, (oooO00o.f20348OooO00o.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY) != 0 ? o000O000.f20351OooO00o : 9000L, TimeUnit.MILLISECONDS);
        oooO00o.f20349OooO0O0.getTask().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.o000O00O
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                scheduledFutureSchedule.cancel(false);
            }
        });
        this.f20345OooO0Oo.add(oooO00o);
        OooO00o();
        return oooO00o.f20349OooO0O0.getTask();
    }

    @GuardedBy("this")
    public final void OooO0OO() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f20346OooO0o);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f20346OooO0o) {
            return;
        }
        this.f20346OooO0o = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f20342OooO00o, this.f20343OooO0O0, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f20345OooO0Oo;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((OooO00o) arrayDeque.poll()).f20349OooO0O0.trySetResult(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f20346OooO0o = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f20346OooO0o = false;
        if (iBinder instanceof o000Oo0) {
            this.f20347OooO0o0 = (o000Oo0) iBinder;
            OooO00o();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        while (true) {
            ArrayDeque arrayDeque = this.f20345OooO0Oo;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((OooO00o) arrayDeque.poll()).f20349OooO0O0.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        OooO00o();
    }
}
