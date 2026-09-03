package com.google.firebase.messaging;

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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.sqlcipher.database.SQLiteDatabase;
import p192o00o0O0.o0OO00O;
import p303o0O0o00o.OooO;
import p381o0OOoOOO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f19197OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Intent f19198OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScheduledExecutorService f19199OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Queue<OooO00o> f19200OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f19201OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f19202OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Intent f19203OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TaskCompletionSource<Void> f19204OooO0O0 = new TaskCompletionSource<>();

        public OooO00o(Intent intent) {
            this.f19203OooO00o = intent;
        }

        public final void OooO00o() {
            this.f19204OooO0O0.trySetResult(null);
        }
    }

    public OooO0OO(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f19200OooO0Oo = new ArrayDeque();
        this.f19201OooO0o = false;
        Context applicationContext = context.getApplicationContext();
        this.f19197OooO00o = applicationContext;
        this.f19198OooO0O0 = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f19199OooO0OO = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<com.google.firebase.messaging.OooO0OO$OooO00o>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayDeque, java.util.Queue<com.google.firebase.messaging.OooO0OO$OooO00o>] */
    @GuardedBy("this")
    public final void OooO00o() {
        while (!this.f19200OooO0Oo.isEmpty()) {
            ((OooO00o) this.f19200OooO0Oo.poll()).OooO00o();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayDeque, java.util.Queue<com.google.firebase.messaging.OooO0OO$OooO00o>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayDeque, java.util.Queue<com.google.firebase.messaging.OooO0OO$OooO00o>] */
    public final synchronized void OooO0O0() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f19200OooO0Oo.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            OooO0O0 oooO0O0 = this.f19202OooO0o0;
            if (oooO0O0 == null || !oooO0O0.isBinderAlive()) {
                OooO0Oo();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f19202OooO0o0.OooO00o((OooO00o) this.f19200OooO0Oo.poll());
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayDeque, java.util.Queue<com.google.firebase.messaging.OooO0OO$OooO00o>] */
    public final synchronized Task<Void> OooO0OO(Intent intent) {
        OooO00o oooO00o;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        oooO00o = new OooO00o(intent);
        ScheduledExecutorService scheduledExecutorService = this.f19199OooO0OO;
        oooO00o.f19204OooO0O0.getTask().addOnCompleteListener(scheduledExecutorService, new o0OO00O(scheduledExecutorService.schedule(new OooO(oooO00o, 1), (oooO00o.f19203OooO00o.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY) != 0 ? o0oOO.f38822OooO00o : 9000L, TimeUnit.MILLISECONDS), 1));
        this.f19200OooO0Oo.add(oooO00o);
        OooO0O0();
        return oooO00o.f19204OooO0O0.getTask();
    }

    @GuardedBy("this")
    public final void OooO0Oo() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("binder is dead. start connection? ");
            sbOooO0o0.append(!this.f19201OooO0o);
            Log.d("FirebaseMessaging", sbOooO0o0.toString());
        }
        if (this.f19201OooO0o) {
            return;
        }
        this.f19201OooO0o = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f19197OooO00o, this.f19198OooO0O0, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f19201OooO0o = false;
        OooO00o();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f19201OooO0o = false;
        if (iBinder instanceof OooO0O0) {
            this.f19202OooO0o0 = (OooO0O0) iBinder;
            OooO0O0();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        OooO00o();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        OooO0O0();
    }
}
