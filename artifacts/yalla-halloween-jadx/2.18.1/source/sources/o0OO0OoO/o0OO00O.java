package o0OO0OoO;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzkz;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzkz f37820OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f37821OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f37822OooO0OO;

    public o0OO00O(zzkz zzkzVar) {
        Preconditions.checkNotNull(zzkzVar);
        this.f37820OooO00o = zzkzVar;
    }

    @WorkerThread
    public final void OooO00o() {
        this.f37820OooO00o.OooO0O0();
        this.f37820OooO00o.zzaz().zzg();
        this.f37820OooO00o.zzaz().zzg();
        if (this.f37821OooO0O0) {
            this.f37820OooO00o.zzay().zzj().zza("Unregistering connectivity change receiver");
            this.f37821OooO0O0 = false;
            this.f37822OooO0OO = false;
            try {
                this.f37820OooO00o.zzau().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f37820OooO00o.zzay().zzd().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.f37820OooO00o.OooO0O0();
        String action = intent.getAction();
        this.f37820OooO00o.zzay().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f37820OooO00o.zzay().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZza = this.f37820OooO00o.zzl().zza();
        if (this.f37822OooO0OO != zZza) {
            this.f37822OooO0OO = zZza;
            this.f37820OooO00o.zzaz().zzp(new o0Oo0oo(this, zZza));
        }
    }
}
