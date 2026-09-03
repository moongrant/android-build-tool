package p257o00ooOOo;

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

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOo000 implements ServiceConnection, zzs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f40360OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f40361OooO0O0 = 2;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f40362OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public IBinder f40363OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ComponentName f40364OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zzn f40365OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f40366OooO0oO;

    public o0OOo000(oO0Oo oo0oo, zzn zznVar) {
        this.f40366OooO0oO = oo0oo;
        this.f40365OooO0o0 = zznVar;
    }

    public final void OooO00o(String str, @Nullable Executor executor) {
        this.f40361OooO0O0 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            oO0Oo oo0oo = this.f40366OooO0oO;
            ConnectionTracker connectionTracker = oo0oo.f40368OooO;
            Context context = oo0oo.f40369OooO0o;
            boolean zZza = connectionTracker.zza(context, str, this.f40365OooO0o0.zzc(context), this, this.f40365OooO0o0.zza(), executor);
            this.f40362OooO0OO = zZza;
            if (zZza) {
                this.f40366OooO0oO.f40371OooO0oO.sendMessageDelayed(this.f40366OooO0oO.f40371OooO0oO.obtainMessage(1, this.f40365OooO0o0), this.f40366OooO0oO.f40374OooOO0O);
            } else {
                this.f40361OooO0O0 = 2;
                try {
                    oO0Oo oo0oo2 = this.f40366OooO0oO;
                    oo0oo2.f40368OooO.unbindService(oo0oo2.f40369OooO0o, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f40366OooO0oO.f40370OooO0o0) {
            this.f40366OooO0oO.f40371OooO0oO.removeMessages(1, this.f40365OooO0o0);
            this.f40363OooO0Oo = iBinder;
            this.f40364OooO0o = componentName;
            Iterator it = this.f40360OooO00o.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f40361OooO0O0 = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f40366OooO0oO.f40370OooO0o0) {
            this.f40366OooO0oO.f40371OooO0oO.removeMessages(1, this.f40365OooO0o0);
            this.f40363OooO0Oo = null;
            this.f40364OooO0o = componentName;
            Iterator it = this.f40360OooO00o.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f40361OooO0O0 = 2;
        }
    }
}
