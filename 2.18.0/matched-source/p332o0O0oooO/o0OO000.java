package p332o0O0oooO;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zae;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO000 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f37143Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f37144OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f37145OoooO00;

    public /* synthetic */ o0OO000(Object obj, Object obj2, int i) {
        this.f37143Oooo = i;
        this.f37144OoooO0 = obj;
        this.f37145OoooO00 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37143Oooo) {
            case 0:
                zact zactVar = (zact) this.f37144OoooO0;
                zak zakVar = (zak) this.f37145OoooO00;
                Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder = zact.f15419OooO0oo;
                ConnectionResult connectionResultZaa = zakVar.zaa();
                if (connectionResultZaa.isSuccess()) {
                    zav zavVar = (zav) Preconditions.checkNotNull(zakVar.zab());
                    ConnectionResult connectionResultZaa2 = zavVar.zaa();
                    if (!connectionResultZaa2.isSuccess()) {
                        String strValueOf = String.valueOf(connectionResultZaa2);
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                        zactVar.f15426OooO0oO.zae(connectionResultZaa2);
                        zactVar.f15424OooO0o.disconnect();
                        return;
                    }
                    zactVar.f15426OooO0oO.zaf(zavVar.zab(), zactVar.f15423OooO0Oo);
                } else {
                    zactVar.f15426OooO0oO.zae(connectionResultZaa);
                }
                zactVar.f15424OooO0o.disconnect();
                return;
            default:
                synchronized (((zzjr) this.f37144OoooO0)) {
                    ((zzjr) this.f37144OoooO0).f16281OooO00o = false;
                    if (!((zzjr) this.f37144OoooO0).f16283OooO0OO.zzL()) {
                        ((zzjr) this.f37144OoooO0).f16283OooO0OO.f37591OooO00o.zzay().zzj().zza("Connected to service");
                        zzjs zzjsVar = ((zzjr) this.f37144OoooO0).f16283OooO0OO;
                        zzee zzeeVar = (zzee) this.f37145OoooO00;
                        zzjsVar.zzg();
                        Preconditions.checkNotNull(zzeeVar);
                        zzjsVar.f16286OooO0Oo = zzeeVar;
                        zzjsVar.OooO();
                        zzjsVar.OooO0oo();
                    }
                    break;
                }
                return;
        }
    }
}
