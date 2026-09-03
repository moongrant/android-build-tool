package o0O;

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

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends GmsClientSupervisor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ConnectionTracker f35009OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f35010OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("connectionStatus")
    public final HashMap f35011OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile zzi f35012OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOOO0 f35013OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f35014OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f35015OooOO0O;

    public OooOOO(Context context, Looper looper) {
        OooOOO0 oooOOO0 = new OooOOO0(this);
        this.f35013OooO0oo = oooOOO0;
        this.f35010OooO0o = context.getApplicationContext();
        this.f35012OooO0oO = new zzi(looper, oooOOO0);
        this.f35009OooO = ConnectionTracker.getInstance();
        this.f35014OooOO0 = 5000L;
        this.f35015OooOO0O = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void OooO00o(zzn zznVar, ServiceConnection serviceConnection) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f35011OooO0o0) {
            OooOO0O oooOO0O = (OooOO0O) this.f35011OooO0o0.get(zznVar);
            if (oooOO0O == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + zznVar.toString());
            }
            if (!oooOO0O.f35002OooO00o.containsKey(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zznVar.toString());
            }
            oooOO0O.f35002OooO00o.remove(serviceConnection);
            if (oooOO0O.f35002OooO00o.isEmpty()) {
                this.f35012OooO0oO.sendMessageDelayed(this.f35012OooO0oO.obtainMessage(0, zznVar), this.f35014OooOO0);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean OooO0O0(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean z;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f35011OooO0o0) {
            OooOO0O oooOO0O = (OooOO0O) this.f35011OooO0o0.get(zznVar);
            if (oooOO0O == null) {
                oooOO0O = new OooOO0O(this, zznVar);
                oooOO0O.f35002OooO00o.put(serviceConnection, serviceConnection);
                oooOO0O.OooO00o(str, executor);
                this.f35011OooO0o0.put(zznVar, oooOO0O);
            } else {
                this.f35012OooO0oO.removeMessages(0, zznVar);
                if (oooOO0O.f35002OooO00o.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zznVar.toString());
                }
                oooOO0O.f35002OooO00o.put(serviceConnection, serviceConnection);
                int i = oooOO0O.f35003OooO0O0;
                if (i == 1) {
                    serviceConnection.onServiceConnected(oooOO0O.f35006OooO0o, oooOO0O.f35005OooO0Oo);
                } else if (i == 2) {
                    oooOO0O.OooO00o(str, executor);
                }
            }
            z = oooOO0O.f35004OooO0OO;
        }
        return z;
    }
}
