package p328o0O0ooOO;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.zzh;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p328o0O0ooOO.o0O00o0;
import p328o0O0ooOO.o0oOO;
import p328o0O0ooOO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOO implements ServiceConnection {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0O00o0 f37037OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzs f37039OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public int f37035OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Messenger f37036OooO0O0 = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            o0oOO o0ooo2 = this.zza;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (o0ooo2) {
                o0oOOo<?> o0oooo2 = o0ooo2.f37040OooO0o0.get(i);
                if (o0oooo2 == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                o0ooo2.f37040OooO0o0.remove(i);
                o0ooo2.OooO0OO();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    o0oooo2.OooO0OO(new zzq("Not supported by GmsCore", null));
                    return true;
                }
                o0oooo2.OooO00o(data);
                return true;
            }
        }
    }));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public final Queue<o0oOOo<?>> f37038OooO0Oo = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public final SparseArray<o0oOOo<?>> f37040OooO0o0 = new SparseArray<>();

    public /* synthetic */ o0oOO(zzs zzsVar) {
        this.f37039OooO0o = zzsVar;
    }

    public final synchronized void OooO00o(int i, @Nullable String str) {
        OooO0O0(i, str, null);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    public final synchronized void OooO0O0(int i, @Nullable String str, @Nullable Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i2 = this.f37035OooO00o;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.f37035OooO00o = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f37035OooO00o = 4;
        ConnectionTracker.getInstance().unbindService(this.f37039OooO0o.f15087OooO00o, this);
        zzq zzqVar = new zzq(str, th);
        Iterator it = this.f37038OooO0Oo.iterator();
        while (it.hasNext()) {
            ((o0oOOo) it.next()).OooO0OO(zzqVar);
        }
        this.f37038OooO0Oo.clear();
        for (int i3 = 0; i3 < this.f37040OooO0o0.size(); i3++) {
            this.f37040OooO0o0.valueAt(i3).OooO0OO(zzqVar);
        }
        this.f37040OooO0o0.clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    public final synchronized void OooO0OO() {
        if (this.f37035OooO00o == 2 && this.f37038OooO0Oo.isEmpty() && this.f37040OooO0o0.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f37035OooO00o = 3;
            ConnectionTracker.getInstance().unbindService(this.f37039OooO0o.f15087OooO00o, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    public final synchronized boolean OooO0Oo(o0oOOo<?> o0oooo2) {
        int i = this.f37035OooO00o;
        if (i != 0) {
            if (i == 1) {
                this.f37038OooO0Oo.add(o0oooo2);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f37038OooO0Oo.add(o0oooo2);
            this.f37039OooO0o.f15088OooO0O0.execute(new zzh(this));
            return true;
        }
        this.f37038OooO0Oo.add(o0oooo2);
        Preconditions.checkState(this.f37035OooO00o == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f37035OooO00o = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.f37039OooO0o.f15087OooO00o, intent, this, 1)) {
                this.f37039OooO0o.f15088OooO0O0.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0oOO o0ooo2 = this.zza;
                        synchronized (o0ooo2) {
                            if (o0ooo2.f37035OooO00o == 1) {
                                o0ooo2.OooO00o(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                OooO00o(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            OooO0O0(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f37039OooO0o.f15088OooO0O0.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                o0oOO o0ooo2 = this.zza;
                IBinder iBinder2 = iBinder;
                synchronized (o0ooo2) {
                    try {
                        if (iBinder2 == null) {
                            o0ooo2.OooO00o(0, "Null service connection");
                            return;
                        }
                        try {
                            o0ooo2.f37037OooO0OO = new o0O00o0(iBinder2);
                            o0ooo2.f37035OooO00o = 2;
                            o0ooo2.f37039OooO0o.f15088OooO0O0.execute(new zzh(o0ooo2));
                        } catch (RemoteException e) {
                            o0ooo2.OooO00o(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f37039OooO0o.f15088OooO0O0.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.OooO00o(2, "Service disconnected");
            }
        });
    }
}
