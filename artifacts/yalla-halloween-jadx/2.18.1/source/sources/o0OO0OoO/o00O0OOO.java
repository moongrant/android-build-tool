package o0OO0OoO;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzlh;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f37673Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f37674Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Uri f37675Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37676Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f37677OoooO00;

    public o00O0OOO(oo0oOO0 oo0ooo0, boolean z, Uri uri, String str, String str2) {
        this.f37677OoooO00 = oo0ooo0;
        this.f37674Oooo0o = z;
        this.f37675Oooo0oO = uri;
        this.f37676Oooo0oo = str;
        this.f37673Oooo = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleOoooO0;
        Bundle bundleOoooO1;
        oo0oOO0 oo0ooo0 = this.f37677OoooO00;
        boolean z = this.f37674Oooo0o;
        Uri uri = this.f37675Oooo0oO;
        String str = this.f37676Oooo0oo;
        String str2 = this.f37673Oooo;
        oo0ooo0.f37905Oooo0o.zzg();
        try {
            zzlh zzlhVarZzv = oo0ooo0.f37905Oooo0o.f37615OooO00o.zzv();
            if (TextUtils.isEmpty(str2)) {
                bundleOoooO0 = null;
            } else if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid")) {
                bundleOoooO0 = zzlhVarZzv.OoooO0(Uri.parse("https://google.com/search?".concat(str2)));
                if (bundleOoooO0 != null) {
                    bundleOoooO0.putString("_cis", "referrer");
                }
            } else {
                zzlhVarZzv.f37615OooO00o.zzay().zzc().zza("Activity created with data 'referrer' without required params");
                bundleOoooO0 = null;
            }
            if (z && (bundleOoooO1 = oo0ooo0.f37905Oooo0o.f37615OooO00o.zzv().OoooO0(uri)) != null) {
                bundleOoooO1.putString("_cis", "intent");
                if (!bundleOoooO1.containsKey("gclid") && bundleOoooO0 != null && bundleOoooO0.containsKey("gclid")) {
                    bundleOoooO1.putString("_cer", String.format("gclid=%s", bundleOoooO0.getString("gclid")));
                }
                oo0ooo0.f37905Oooo0o.OooO0OO(str, "_cmp", bundleOoooO1);
                oo0ooo0.f37905Oooo0o.f16248OooOOO.OooO00o(str, bundleOoooO1);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            oo0ooo0.f37905Oooo0o.f37615OooO00o.zzay().zzc().zzb("Activity created with referrer", str2);
            if (oo0ooo0.f37905Oooo0o.f37615OooO00o.zzf().zzs(null, zzeb.zzY)) {
                if (bundleOoooO0 != null) {
                    oo0ooo0.f37905Oooo0o.OooO0OO(str, "_cmp", bundleOoooO0);
                    oo0ooo0.f37905Oooo0o.f16248OooOOO.OooO00o(str, bundleOoooO0);
                } else {
                    oo0ooo0.f37905Oooo0o.f37615OooO00o.zzay().zzc().zzb("Referrer does not contain valid parameters", str2);
                }
                oo0ooo0.f37905Oooo0o.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                oo0ooo0.f37905Oooo0o.f37615OooO00o.zzay().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                oo0ooo0.f37905Oooo0o.zzW(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", str2, true);
            }
        } catch (RuntimeException e) {
            oo0ooo0.f37905Oooo0o.f37615OooO00o.zzay().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
