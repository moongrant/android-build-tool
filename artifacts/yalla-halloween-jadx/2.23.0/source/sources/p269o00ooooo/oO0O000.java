package p269o00ooooo;

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
public final class oO0O000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f41321OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f41322OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Uri f41323OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f41324OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oO0O000o f41325OooO0oo;

    public oO0O000(oO0O000o oo0o000o, boolean z, Uri uri, String str, String str2) {
        this.f41325OooO0oo = oo0o000o;
        this.f41321OooO0Oo = z;
        this.f41323OooO0o0 = uri;
        this.f41322OooO0o = str;
        this.f41324OooO0oO = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleOooo;
        Uri uri = this.f41323OooO0o0;
        String str = this.f41324OooO0oO;
        oO0O000o oo0o000o = this.f41325OooO0oo;
        zzik zzikVar = oo0o000o.f41326OooO0Oo;
        zzik zzikVar2 = oo0o000o.f41326OooO0Oo;
        zzikVar.zzg();
        try {
            zzlp zzlpVarZzv = zzikVar2.f41276OooO00o.zzv();
            zzra.zzc();
            zzag zzagVarZzf = zzikVar2.f41276OooO00o.zzf();
            zzef zzefVar = zzeg.zzav;
            boolean zZzs = zzagVarZzf.zzs(null, zzefVar);
            if (TextUtils.isEmpty(str)) {
                bundleOooo = null;
            } else {
                if (!str.contains("gclid") && !str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_id") && !str.contains("dclid") && !str.contains("srsltid")) {
                    if (zZzs && str.contains("sfmc_id")) {
                        zZzs = true;
                    }
                    zzlpVarZzv.f41276OooO00o.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
                    bundleOooo = null;
                }
                bundleOooo = zzlpVarZzv.Oooo(zZzs, Uri.parse("https://google.com/search?".concat(str)));
                if (bundleOooo != null) {
                    bundleOooo.putString("_cis", "referrer");
                }
            }
            boolean z = this.f41321OooO0Oo;
            String str2 = this.f41322OooO0o;
            if (z) {
                zzlp zzlpVarZzv2 = zzikVar2.f41276OooO00o.zzv();
                zzra.zzc();
                Bundle bundleOooo2 = zzlpVarZzv2.Oooo(zzikVar2.f41276OooO00o.zzf().zzs(null, zzefVar), uri);
                if (bundleOooo2 != null) {
                    bundleOooo2.putString("_cis", "intent");
                    if (!bundleOooo2.containsKey("gclid") && bundleOooo != null && bundleOooo.containsKey("gclid")) {
                        bundleOooo2.putString("_cer", String.format("gclid=%s", bundleOooo.getString("gclid")));
                    }
                    zzikVar2.OooO0OO(bundleOooo2, str2, "_cmp");
                    zzikVar2.f16045OooOO0o.OooO00o(bundleOooo2, str2);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zzikVar2.f41276OooO00o.zzaA().zzc().zzb("Activity created with referrer", str);
            if (zzikVar2.f41276OooO00o.zzf().zzs(null, zzeg.zzaa)) {
                if (bundleOooo != null) {
                    zzikVar2.OooO0OO(bundleOooo, str2, "_cmp");
                    zzikVar2.f16045OooOO0o.OooO00o(bundleOooo, str2);
                } else {
                    zzikVar2.f41276OooO00o.zzaA().zzc().zzb("Referrer does not contain valid parameters", str);
                }
                zzikVar2.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                zzikVar2.f41276OooO00o.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                zzikVar2.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", str, true);
            }
        } catch (RuntimeException e) {
            zzikVar2.f41276OooO00o.zzaA().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
