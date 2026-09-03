package p331o0O0oooO;

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
public final class o0OO000o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f37118Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37119Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f37120Oooo0oo;

    public /* synthetic */ o0OO000o(Object obj, Object obj2, int i) {
        this.f37118Oooo0o = i;
        this.f37120Oooo0oo = obj;
        this.f37119Oooo0oO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37118Oooo0o) {
            case 0:
                zact zactVar = (zact) this.f37120Oooo0oo;
                zak zakVar = (zak) this.f37119Oooo0oO;
                Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder = zact.f15401OooO0oo;
                ConnectionResult connectionResultZaa = zakVar.zaa();
                if (connectionResultZaa.isSuccess()) {
                    zav zavVar = (zav) Preconditions.checkNotNull(zakVar.zab());
                    ConnectionResult connectionResultZaa2 = zavVar.zaa();
                    if (!connectionResultZaa2.isSuccess()) {
                        String strValueOf = String.valueOf(connectionResultZaa2);
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                        zactVar.f15408OooO0oO.zae(connectionResultZaa2);
                        zactVar.f15406OooO0o.disconnect();
                        return;
                    }
                    zactVar.f15408OooO0oO.zaf(zavVar.zab(), zactVar.f15405OooO0Oo);
                } else {
                    zactVar.f15408OooO0oO.zae(connectionResultZaa);
                }
                zactVar.f15406OooO0o.disconnect();
                return;
            default:
                synchronized (((zzjr) this.f37120Oooo0oo)) {
                    ((zzjr) this.f37120Oooo0oo).f16263OooO00o = false;
                    if (!((zzjr) this.f37120Oooo0oo).f16265OooO0OO.zzL()) {
                        ((zzjr) this.f37120Oooo0oo).f16265OooO0OO.f37615OooO00o.zzay().zzj().zza("Connected to service");
                        zzjs zzjsVar = ((zzjr) this.f37120Oooo0oo).f16265OooO0OO;
                        zzee zzeeVar = (zzee) this.f37119Oooo0oO;
                        zzjsVar.zzg();
                        Preconditions.checkNotNull(zzeeVar);
                        zzjsVar.f16268OooO0Oo = zzeeVar;
                        zzjsVar.OooO();
                        zzjsVar.OooO0oo();
                    }
                    break;
                }
                return;
        }
    }
}
