package p257o00ooOOo;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Oo extends GmsClientSupervisor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ConnectionTracker f40368OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f40369OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("connectionStatus")
    public final HashMap f40370OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile zzi f40371OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0o0000 f40372OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f40373OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f40374OooOO0O;

    public oO0Oo(Context context, Looper looper) {
        o0o0000 o0o0000Var = new o0o0000(this);
        this.f40372OooO0oo = o0o0000Var;
        this.f40369OooO0o = context.getApplicationContext();
        this.f40371OooO0oO = new zzi(looper, o0o0000Var);
        this.f40368OooO = ConnectionTracker.getInstance();
        this.f40373OooOO0 = 5000L;
        this.f40374OooOO0O = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void OooO00o(zzn zznVar, ServiceConnection serviceConnection) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f40370OooO0o0) {
            try {
                o0OOo000 o0ooo001 = (o0OOo000) this.f40370OooO0o0.get(zznVar);
                if (o0ooo001 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + zznVar.toString());
                }
                if (!o0ooo001.f40360OooO00o.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zznVar.toString());
                }
                o0ooo001.f40360OooO00o.remove(serviceConnection);
                if (o0ooo001.f40360OooO00o.isEmpty()) {
                    this.f40371OooO0oO.sendMessageDelayed(this.f40371OooO0oO.obtainMessage(0, zznVar), this.f40373OooOO0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean OooO0O0(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean z;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f40370OooO0o0) {
            try {
                o0OOo000 o0ooo001 = (o0OOo000) this.f40370OooO0o0.get(zznVar);
                if (o0ooo001 == null) {
                    o0ooo001 = new o0OOo000(this, zznVar);
                    o0ooo001.f40360OooO00o.put(serviceConnection, serviceConnection);
                    o0ooo001.OooO00o(str, executor);
                    this.f40370OooO0o0.put(zznVar, o0ooo001);
                } else {
                    this.f40371OooO0oO.removeMessages(0, zznVar);
                    if (o0ooo001.f40360OooO00o.containsKey(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zznVar.toString());
                    }
                    o0ooo001.f40360OooO00o.put(serviceConnection, serviceConnection);
                    int i = o0ooo001.f40361OooO0O0;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(o0ooo001.f40364OooO0o, o0ooo001.f40363OooO0Oo);
                    } else if (i == 2) {
                        o0ooo001.OooO00o(str, executor);
                    }
                }
                z = o0ooo001.f40362OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void OooO0OO(Looper looper) {
        synchronized (this.f40370OooO0o0) {
            this.f40371OooO0oO = new zzi(looper, this.f40372OooO0oo);
        }
    }
}
