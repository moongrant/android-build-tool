package o0O;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements ServiceConnection, zzs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f35002OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35003OooO0O0 = 2;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f35004OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public IBinder f35005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ComponentName f35006OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zzn f35007OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOO f35008OooO0oO;

    public OooOO0O(OooOOO oooOOO, zzn zznVar) {
        this.f35008OooO0oO = oooOOO;
        this.f35007OooO0o0 = zznVar;
    }

    public final void OooO00o(String str, @Nullable Executor executor) {
        this.f35003OooO0O0 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            OooOOO oooOOO = this.f35008OooO0oO;
            ConnectionTracker connectionTracker = oooOOO.f35009OooO;
            Context context = oooOOO.f35010OooO0o;
            boolean zZza = connectionTracker.zza(context, str, this.f35007OooO0o0.zzc(context), this, this.f35007OooO0o0.zza(), executor);
            this.f35004OooO0OO = zZza;
            if (zZza) {
                this.f35008OooO0oO.f35012OooO0oO.sendMessageDelayed(this.f35008OooO0oO.f35012OooO0oO.obtainMessage(1, this.f35007OooO0o0), this.f35008OooO0oO.f35015OooOO0O);
            } else {
                this.f35003OooO0O0 = 2;
                try {
                    OooOOO oooOOO2 = this.f35008OooO0oO;
                    oooOOO2.f35009OooO.unbindService(oooOOO2.f35010OooO0o, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f35008OooO0oO.f35011OooO0o0) {
            this.f35008OooO0oO.f35012OooO0oO.removeMessages(1, this.f35007OooO0o0);
            this.f35005OooO0Oo = iBinder;
            this.f35006OooO0o = componentName;
            Iterator it = this.f35002OooO00o.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f35003OooO0O0 = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f35008OooO0oO.f35011OooO0o0) {
            this.f35008OooO0oO.f35012OooO0oO.removeMessages(1, this.f35007OooO0o0);
            this.f35005OooO0Oo = null;
            this.f35006OooO0o = componentName;
            Iterator it = this.f35002OooO00o.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f35003OooO0O0 = 2;
        }
    }
}
