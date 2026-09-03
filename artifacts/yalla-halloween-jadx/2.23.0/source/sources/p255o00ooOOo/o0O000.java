package p255o00ooOOo;

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
public final class o0O000 extends GmsClientSupervisor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ConnectionTracker f41024OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f41025OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("connectionStatus")
    public final HashMap f41026OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile zzi f41027OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O0000O f41028OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f41029OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f41030OooOO0O;

    public o0O000(Context context, Looper looper) {
        o0O0000O o0o0000o2 = new o0O0000O(this);
        this.f41028OooO0oo = o0o0000o2;
        this.f41025OooO0o = context.getApplicationContext();
        this.f41027OooO0oO = new zzi(looper, o0o0000o2);
        this.f41024OooO = ConnectionTracker.getInstance();
        this.f41029OooOO0 = 5000L;
        this.f41030OooOO0O = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void OooO00o(zzn zznVar, ServiceConnection serviceConnection) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f41026OooO0o0) {
            try {
                o0O00000 o0o00000 = (o0O00000) this.f41026OooO0o0.get(zznVar);
                if (o0o00000 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + zznVar.toString());
                }
                if (!o0o00000.f41031OooO00o.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zznVar.toString());
                }
                o0o00000.f41031OooO00o.remove(serviceConnection);
                if (o0o00000.f41031OooO00o.isEmpty()) {
                    this.f41027OooO0oO.sendMessageDelayed(this.f41027OooO0oO.obtainMessage(0, zznVar), this.f41029OooOO0);
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
        synchronized (this.f41026OooO0o0) {
            try {
                o0O00000 o0o00000 = (o0O00000) this.f41026OooO0o0.get(zznVar);
                if (o0o00000 == null) {
                    o0o00000 = new o0O00000(this, zznVar);
                    o0o00000.f41031OooO00o.put(serviceConnection, serviceConnection);
                    o0o00000.OooO00o(str, executor);
                    this.f41026OooO0o0.put(zznVar, o0o00000);
                } else {
                    this.f41027OooO0oO.removeMessages(0, zznVar);
                    if (o0o00000.f41031OooO00o.containsKey(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zznVar.toString());
                    }
                    o0o00000.f41031OooO00o.put(serviceConnection, serviceConnection);
                    int i = o0o00000.f41032OooO0O0;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(o0o00000.f41035OooO0o, o0o00000.f41034OooO0Oo);
                    } else if (i == 2) {
                        o0o00000.OooO00o(str, executor);
                    }
                }
                z = o0o00000.f41033OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void OooO0OO(Looper looper) {
        synchronized (this.f41026OooO0o0) {
            this.f41027OooO0oO = new zzi(looper, this.f41028OooO0oo);
        }
    }
}
