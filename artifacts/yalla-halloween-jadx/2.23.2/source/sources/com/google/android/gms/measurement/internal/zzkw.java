package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzrd;
import java.util.HashMap;
import p271o00ooooo.i0;
import p271o00ooooo.k0;
import p271o00ooooo.oOO0000;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkw extends i0 {
    /* JADX WARN: Multi-variable type inference failed */
    public final String OooO00o(String str) {
        zzfu zzfuVarZzm = this.f40509OooO0O0.zzm();
        zzfuVarZzm.zzg();
        zzfuVarZzm.OooO0o0(str);
        String str2 = (String) zzfuVarZzm.f15499OooOO0o.getOrDefault(str, null);
        if (TextUtils.isEmpty(str2)) {
            return (String) zzeg.zzq.zza(null);
        }
        Uri uri = Uri.parse((String) zzeg.zzq.zza(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(str2 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    public final k0 zza(String str) {
        zzrd.zzc();
        zzgd zzgdVar = this.f40788OooO00o;
        k0 k0Var = null;
        if (zzgdVar.zzf().zzs(null, zzeg.zzaq)) {
            zzgdVar.zzaA().zzj().zza("sgtm feature flag enabled.");
            zzlh zzlhVar = this.f40509OooO0O0;
            oOO0000 ooo0000OooOOoo = zzlhVar.zzh().OooOOoo(str);
            if (ooo0000OooOOoo == null) {
                return new k0(OooO00o(str));
            }
            ooo0000OooOOoo.f40653OooO00o.zzaB().zzg();
            if (ooo0000OooOOoo.f40674OooOo0O) {
                zzgdVar.zzaA().zzj().zza("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzff zzffVarOooO = zzlhVar.zzm().OooO(ooo0000OooOOoo.OooOo0o());
                if (zzffVarOooO != null) {
                    String strZzj = zzffVarOooO.zzj();
                    if (!TextUtils.isEmpty(strZzj)) {
                        String strZzi = zzffVarOooO.zzi();
                        zzgdVar.zzaA().zzj().zzc("sgtm configured with upload_url, server_info", strZzj, true != TextUtils.isEmpty(strZzi) ? "N" : "Y");
                        if (TextUtils.isEmpty(strZzi)) {
                            zzgdVar.zzay();
                            k0Var = new k0(strZzj);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strZzi);
                            k0Var = new k0(strZzj, map);
                        }
                    }
                }
            }
            if (k0Var != null) {
                return k0Var;
            }
        }
        return new k0(OooO00o(str));
    }
}
