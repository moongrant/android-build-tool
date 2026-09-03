package p253o00ooO0O;

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
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p253o00ooO0O.o0000O0O;
import p253o00ooO0O.o0000OO0;
import p253o00ooO0O.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O implements ServiceConnection {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000OO f40228OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzs f40230OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public int f40226OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Messenger f40227OooO0O0 = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            o0000O0O o0000o0o2 = this.zza;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (o0000o0o2) {
                o0000OO0<?> o0000oo1 = o0000o0o2.f40231OooO0o0.get(i);
                if (o0000oo1 == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                o0000o0o2.f40231OooO0o0.remove(i);
                o0000o0o2.OooO0OO();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    o0000oo1.OooO0OO(new zzq(null, "Not supported by GmsCore"));
                    return true;
                }
                o0000oo1.OooO00o(data);
                return true;
            }
        }
    }));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayDeque f40229OooO0Oo = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public final SparseArray<o0000OO0<?>> f40231OooO0o0 = new SparseArray<>();

    public /* synthetic */ o0000O0O(zzs zzsVar) {
        this.f40230OooO0o = zzsVar;
    }

    public final synchronized void OooO00o(int i, @Nullable String str) {
        OooO0O0(null, i, str);
    }

    public final synchronized void OooO0O0(@Nullable SecurityException securityException, int i, @Nullable String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i2 = this.f40226OooO00o;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.f40226OooO00o = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f40226OooO00o = 4;
        ConnectionTracker.getInstance().unbindService(this.f40230OooO0o.f14110OooO00o, this);
        zzq zzqVar = new zzq(securityException, str);
        Iterator it = this.f40229OooO0Oo.iterator();
        while (it.hasNext()) {
            ((o0000OO0) it.next()).OooO0OO(zzqVar);
        }
        this.f40229OooO0Oo.clear();
        for (int i3 = 0; i3 < this.f40231OooO0o0.size(); i3++) {
            this.f40231OooO0o0.valueAt(i3).OooO0OO(zzqVar);
        }
        this.f40231OooO0o0.clear();
    }

    public final synchronized void OooO0OO() {
        if (this.f40226OooO00o == 2 && this.f40229OooO0Oo.isEmpty() && this.f40231OooO0o0.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f40226OooO00o = 3;
            ConnectionTracker.getInstance().unbindService(this.f40230OooO0o.f14110OooO00o, this);
        }
    }

    public final synchronized boolean OooO0Oo(o0000OO0<?> o0000oo1) {
        int i = this.f40226OooO00o;
        if (i != 0) {
            if (i == 1) {
                this.f40229OooO0Oo.add(o0000oo1);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f40229OooO0Oo.add(o0000oo1);
            this.f40230OooO0o.f14111OooO0O0.execute(new zzh(this));
            return true;
        }
        this.f40229OooO0Oo.add(o0000oo1);
        Preconditions.checkState(this.f40226OooO00o == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f40226OooO00o = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.f40230OooO0o.f14110OooO00o, intent, this, 1)) {
                this.f40230OooO0o.f14111OooO0O0.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0000O0O o0000o0o2 = this.zza;
                        synchronized (o0000o0o2) {
                            if (o0000o0o2.f40226OooO00o == 1) {
                                o0000o0o2.OooO00o(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                OooO00o(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            OooO0O0(e, 0, "Unable to bind to service");
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f40230OooO0o.f14111OooO0O0.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                o0000O0O o0000o0o2 = this.zza;
                IBinder iBinder2 = iBinder;
                synchronized (o0000o0o2) {
                    try {
                        if (iBinder2 == null) {
                            o0000o0o2.OooO00o(0, "Null service connection");
                            return;
                        }
                        try {
                            o0000o0o2.f40228OooO0OO = new o000OO(iBinder2);
                            o0000o0o2.f40226OooO00o = 2;
                            o0000o0o2.f40230OooO0o.f14111OooO0O0.execute(new zzh(o0000o0o2));
                        } catch (RemoteException e) {
                            o0000o0o2.OooO00o(0, e.getMessage());
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
        this.f40230OooO0o.f14111OooO0O0.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.OooO00o(2, "Service disconnected");
            }
        });
    }
}
