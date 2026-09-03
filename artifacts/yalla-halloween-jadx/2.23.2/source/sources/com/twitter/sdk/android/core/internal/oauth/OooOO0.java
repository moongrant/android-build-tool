package com.twitter.sdk.android.core.internal.oauth;

import android.os.Build;
import androidx.compose.foundation.layout.oo000o;
import com.google.gson.OooOOO0;
import com.twitter.sdk.android.core.o0ooOOo;
import java.text.Normalizer;
import o0OOOOOO.OooOo00;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;
import p670o0oooo0.o00O000o;
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f21547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f21548OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f21549OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000O0O f21550OooO0Oo;

    public OooOO0(o0ooOOo o0ooooo, OooOo00 oooOo00) {
        this.f21547OooO00o = o0ooooo;
        this.f21548OooO0O0 = oooOo00;
        o0ooooo.getClass();
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
        String strNormalize = Normalizer.normalize(oo000o.OooO0O0(sb, Build.PRODUCT, ')'), Normalizer.Form.NFD);
        StringBuilder sb2 = new StringBuilder(strNormalize.length());
        for (int i = 0; i < strNormalize.length(); i++) {
            char cCharAt = strNormalize.charAt(i);
            if (cCharAt > 31 && cCharAt < 127) {
                sb2.append(cCharAt);
            }
        }
        this.f21549OooO0OO = sb2.toString();
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        oooO00o.OooO00o(new o0OoOoOo() { // from class: com.twitter.sdk.android.core.internal.oauth.OooO
            @Override // p641o0ooOO0o.o0OoOoOo
            public final o0O00o00 intercept(o0OoOoOo.OooO00o oooO00o2) {
                OooOO0 oooOO1 = this.f21536OooO00o;
                oooOO1.getClass();
                o000O o000o = (o000O) oooO00o2;
                o0O00O0o o0o00o0o = o000o.f59401OooO0o0;
                o0o00o0o.getClass();
                o0O00O0o.OooO00o oooO00o3 = new o0O00O0o.OooO00o(o0o00o0o);
                oooO00o3.OooO0Oo("User-Agent", oooOO1.f21549OooO0OO);
                return o000o.OooO0OO(oooO00o3.OooO0O0());
            }
        });
        o0OoO00O o0ooo00o2 = new o0OoO00O(oooO00o);
        o0000O0O.OooO0O0 oooO0O0 = new o0000O0O.OooO0O0();
        this.f21548OooO0O0.getClass();
        oooO0O0.OooO0O0("https://api.twitter.com");
        oooO0O0.f60575OooO0O0 = o0ooo00o2;
        oooO0O0.OooO00o(o00O000o.OooO0OO(new OooOOO0()));
        this.f21550OooO0Oo = oooO0O0.OooO0OO();
    }
}
