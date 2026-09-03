package com.twitter.sdk.android.core.internal.oauth;

import android.os.Build;
import androidx.compose.foundation.layout.oo000o;
import com.google.gson.OooOOO0;
import com.twitter.sdk.android.core.o0OOO0o;
import java.text.Normalizer;
import o0OOOOO.OooOo00;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p647o0ooOooo.nc;
import p665o0oooOo.oOo00OO0;
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f22018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f22019OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f22020OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OO f22021OooO0Oo;

    public OooOO0O(o0OOO0o o0ooo0o2, OooOo00 oooOo00) {
        this.f22018OooO00o = o0ooo0o2;
        this.f22019OooO0O0 = oooOo00;
        o0ooo0o2.getClass();
        StringBuilder sb = new StringBuilder("TwitterAndroidSDK/3.3.0.12 ");
        String str = Build.MODEL;
        sb.append(str);
        sb.append('/');
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (");
        sb.append(Build.MANUFACTURER);
        sb.append(';');
        sb.append(str);
        sb.append(';');
        sb.append(Build.BRAND);
        sb.append(';');
        String strNormalize = Normalizer.normalize(oo000o.OooO00o(sb, Build.PRODUCT, ')'), Normalizer.Form.NFD);
        StringBuilder sb2 = new StringBuilder(strNormalize.length());
        for (int i = 0; i < strNormalize.length(); i++) {
            char cCharAt = strNormalize.charAt(i);
            if (cCharAt > 31 && cCharAt < 127) {
                sb2.append(cCharAt);
            }
        }
        this.f22020OooO0OO = sb2.toString();
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        oooO00o.OooO00o(new o00OOO00() { // from class: com.twitter.sdk.android.core.internal.oauth.OooOO0
            @Override // p634o0ooO0oO.o00OOO00
            public final o0oOOo intercept(o00OOO00.OooO00o oooO00o2) {
                OooOO0O oooOO0O = this.f22017OooO00o;
                oooOO0O.getClass();
                nc ncVar = (nc) oooO00o2;
                o00OOOOo o00ooooo2 = ncVar.f59720OooO0o0;
                o00ooooo2.getClass();
                o00OOOOo.OooO00o oooO00o3 = new o00OOOOo.OooO00o(o00ooooo2);
                oooO00o3.OooO0Oo("User-Agent", oooOO0O.f22020OooO0OO);
                return ncVar.OooO0O0(oooO00o3.OooO0O0());
            }
        });
        oooO00o.OooO0O0(o0OOOOOO.OooO.OooO00o());
        o00OOOO0 o00oooo1 = new o00OOOO0(oooO00o);
        o000OO.OooO0O0 oooO0O0 = new o000OO.OooO0O0();
        this.f22019OooO0O0.getClass();
        oooO0O0.OooO0O0("https://api.twitter.com");
        oooO0O0.f61144OooO0O0 = o00oooo1;
        oooO0O0.OooO00o(oOo00OO0.OooO0OO(new OooOOO0()));
        this.f22021OooO0Oo = oooO0O0.OooO0OO();
    }
}
