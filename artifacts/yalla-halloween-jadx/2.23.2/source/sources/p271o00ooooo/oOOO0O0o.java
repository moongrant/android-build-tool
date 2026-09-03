package p271o00ooooo;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzef;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzlp;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO0O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f40740OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f40741OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Uri f40742OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f40743OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oOOO0OO0 f40744OooO0oo;

    public oOOO0O0o(oOOO0OO0 oooo0oo0, boolean z, Uri uri, String str, String str2) {
        this.f40744OooO0oo = oooo0oo0;
        this.f40740OooO0Oo = z;
        this.f40742OooO0o0 = uri;
        this.f40741OooO0o = str;
        this.f40743OooO0oO = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleOooo;
        Uri uri = this.f40742OooO0o0;
        String str = this.f40743OooO0oO;
        oOOO0OO0 oooo0oo0 = this.f40744OooO0oo;
        zzik zzikVar = oooo0oo0.f40745OooO0Oo;
        zzik zzikVar2 = oooo0oo0.f40745OooO0Oo;
        zzikVar.zzg();
        try {
            zzlp zzlpVarZzv = zzikVar2.f40788OooO00o.zzv();
            zzra.zzc();
            zzag zzagVarZzf = zzikVar2.f40788OooO00o.zzf();
            zzef zzefVar = zzeg.zzav;
            boolean zZzs = zzagVarZzf.zzs(null, zzefVar);
            if (TextUtils.isEmpty(str)) {
                bundleOooo = null;
            } else {
                if (!str.contains("gclid") && !str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_id") && !str.contains("dclid") && !str.contains("srsltid")) {
                    if (zZzs && str.contains("sfmc_id")) {
                        zZzs = true;
                    }
                    zzlpVarZzv.f40788OooO00o.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
                    bundleOooo = null;
                }
                bundleOooo = zzlpVarZzv.Oooo(zZzs, Uri.parse("https://google.com/search?".concat(str)));
                if (bundleOooo != null) {
                    bundleOooo.putString("_cis", "referrer");
                }
            }
            boolean z = this.f40740OooO0Oo;
            String str2 = this.f40741OooO0o;
            if (z) {
                zzlp zzlpVarZzv2 = zzikVar2.f40788OooO00o.zzv();
                zzra.zzc();
                Bundle bundleOooo2 = zzlpVarZzv2.Oooo(zzikVar2.f40788OooO00o.zzf().zzs(null, zzefVar), uri);
                if (bundleOooo2 != null) {
                    bundleOooo2.putString("_cis", "intent");
                    if (!bundleOooo2.containsKey("gclid") && bundleOooo != null && bundleOooo.containsKey("gclid")) {
                        bundleOooo2.putString("_cer", String.format("gclid=%s", bundleOooo.getString("gclid")));
                    }
                    zzikVar2.OooO0OO(bundleOooo2, str2, "_cmp");
                    zzikVar2.f15569OooOO0o.OooO00o(bundleOooo2, str2);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zzikVar2.f40788OooO00o.zzaA().zzc().zzb("Activity created with referrer", str);
            if (zzikVar2.f40788OooO00o.zzf().zzs(null, zzeg.zzaa)) {
                if (bundleOooo != null) {
                    zzikVar2.OooO0OO(bundleOooo, str2, "_cmp");
                    zzikVar2.f15569OooOO0o.OooO00o(bundleOooo, str2);
                } else {
                    zzikVar2.f40788OooO00o.zzaA().zzc().zzb("Referrer does not contain valid parameters", str);
                }
                zzikVar2.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                zzikVar2.f40788OooO00o.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                zzikVar2.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", str, true);
            }
        } catch (RuntimeException e) {
            zzikVar2.f40788OooO00o.zzaA().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
