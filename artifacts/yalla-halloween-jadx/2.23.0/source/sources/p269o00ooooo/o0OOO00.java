package p269o00ooooo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzlh;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO00 extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzlh f41229OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f41230OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f41231OooO0OO;

    public o0OOO00(zzlh zzlhVar) {
        Preconditions.checkNotNull(zzlhVar);
        this.f41229OooO00o = zzlhVar;
    }

    @WorkerThread
    public final void OooO00o() {
        zzlh zzlhVar = this.f41229OooO00o;
        zzlhVar.OooO0O0();
        zzlhVar.zzaB().zzg();
        zzlhVar.zzaB().zzg();
        if (this.f41230OooO0O0) {
            zzlhVar.zzaA().zzj().zza("Unregistering connectivity change receiver");
            this.f41230OooO0O0 = false;
            this.f41231OooO0OO = false;
            try {
                zzlhVar.zzaw().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                zzlhVar.zzaA().zzd().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        zzlh zzlhVar = this.f41229OooO00o;
        zzlhVar.OooO0O0();
        String action = intent.getAction();
        zzlhVar.zzaA().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzlhVar.zzaA().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZza = zzlhVar.zzj().zza();
        if (this.f41231OooO0OO != zZza) {
            this.f41231OooO0OO = zZza;
            zzlhVar.zzaB().zzp(new o0OO(this, zZza));
        }
    }
}
