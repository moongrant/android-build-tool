package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzrd;
import java.util.HashMap;
import p269o00ooooo.oO0O0OoO;
import p269o00ooooo.oOOO00o0;
import p269o00ooooo.oOOO0OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkw extends oOOO00o0 {
    /* JADX WARN: Multi-variable type inference failed */
    public final String OooO00o(String str) {
        zzfu zzfuVarZzm = this.f41477OooO0O0.zzm();
        zzfuVarZzm.zzg();
        zzfuVarZzm.OooO0o0(str);
        String str2 = (String) zzfuVarZzm.f15975OooOO0o.getOrDefault(str, null);
        if (TextUtils.isEmpty(str2)) {
            return (String) zzeg.zzq.zza(null);
        }
        Uri uri = Uri.parse((String) zzeg.zzq.zza(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(str2 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    public final oOOO0OO0 zza(String str) {
        zzrd.zzc();
        zzgd zzgdVar = this.f41276OooO00o;
        oOOO0OO0 oooo0oo0 = null;
        if (zzgdVar.zzf().zzs(null, zzeg.zzaq)) {
            zzgdVar.zzaA().zzj().zza("sgtm feature flag enabled.");
            zzlh zzlhVar = this.f41477OooO0O0;
            oO0O0OoO oo0o0oooOooOOoo = zzlhVar.zzh().OooOOoo(str);
            if (oo0o0oooOooOOoo == null) {
                return new oOOO0OO0(OooO00o(str));
            }
            oo0o0oooOooOOoo.f41349OooO00o.zzaB().zzg();
            if (oo0o0oooOooOOoo.f41370OooOo0O) {
                zzgdVar.zzaA().zzj().zza("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzff zzffVarOooO = zzlhVar.zzm().OooO(oo0o0oooOooOOoo.OooOo0o());
                if (zzffVarOooO != null) {
                    String strZzj = zzffVarOooO.zzj();
                    if (!TextUtils.isEmpty(strZzj)) {
                        String strZzi = zzffVarOooO.zzi();
                        zzgdVar.zzaA().zzj().zzc("sgtm configured with upload_url, server_info", strZzj, true != TextUtils.isEmpty(strZzi) ? "N" : "Y");
                        if (TextUtils.isEmpty(strZzi)) {
                            zzgdVar.zzay();
                            oooo0oo0 = new oOOO0OO0(strZzj);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strZzi);
                            oooo0oo0 = new oOOO0OO0(strZzj, map);
                        }
                    }
                }
            }
            if (oooo0oo0 != null) {
                return oooo0oo0;
            }
        }
        return new oOOO0OO0(OooO00o(str));
    }
}
