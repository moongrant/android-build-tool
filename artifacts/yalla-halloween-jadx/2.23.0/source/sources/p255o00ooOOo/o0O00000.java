package p255o00ooOOo;

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
public final class o0O00000 implements ServiceConnection, zzs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f41031OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f41032OooO0O0 = 2;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f41033OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public IBinder f41034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ComponentName f41035OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zzn f41036OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O000 f41037OooO0oO;

    public o0O00000(o0O000 o0o001, zzn zznVar) {
        this.f41037OooO0oO = o0o001;
        this.f41036OooO0o0 = zznVar;
    }

    public final void OooO00o(String str, @Nullable Executor executor) {
        this.f41032OooO0O0 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            o0O000 o0o001 = this.f41037OooO0oO;
            ConnectionTracker connectionTracker = o0o001.f41024OooO;
            Context context = o0o001.f41025OooO0o;
            boolean zZza = connectionTracker.zza(context, str, this.f41036OooO0o0.zzc(context), this, this.f41036OooO0o0.zza(), executor);
            this.f41033OooO0OO = zZza;
            if (zZza) {
                this.f41037OooO0oO.f41027OooO0oO.sendMessageDelayed(this.f41037OooO0oO.f41027OooO0oO.obtainMessage(1, this.f41036OooO0o0), this.f41037OooO0oO.f41030OooOO0O);
            } else {
                this.f41032OooO0O0 = 2;
                try {
                    o0O000 o0o002 = this.f41037OooO0oO;
                    o0o002.f41024OooO.unbindService(o0o002.f41025OooO0o, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f41037OooO0oO.f41026OooO0o0) {
            this.f41037OooO0oO.f41027OooO0oO.removeMessages(1, this.f41036OooO0o0);
            this.f41034OooO0Oo = iBinder;
            this.f41035OooO0o = componentName;
            Iterator it = this.f41031OooO00o.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f41032OooO0O0 = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f41037OooO0oO.f41026OooO0o0) {
            this.f41037OooO0oO.f41027OooO0oO.removeMessages(1, this.f41036OooO0o0);
            this.f41034OooO0Oo = null;
            this.f41035OooO0o = componentName;
            Iterator it = this.f41031OooO00o.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f41032OooO0O0 = 2;
        }
    }
}
