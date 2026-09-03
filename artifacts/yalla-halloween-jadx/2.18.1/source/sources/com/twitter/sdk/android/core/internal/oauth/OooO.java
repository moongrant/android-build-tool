package com.twitter.sdk.android.core.internal.oauth;

import Oooo000.o00oO0o;
import android.os.Build;
import java.text.Normalizer;
import java.util.Objects;
import p433o0OoOO0o.o0O0oo0o;
import p435o0OoOOO0.o000000O;
import p440o0OoOOoO.o0OO00o0;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p666o0oooO0o.oOo00o0o;
import retrofit2.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0oo0o f19973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00o0 f19974OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19975OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0O00 f19976OooO0Oo;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public OooO(o0O0oo0o o0o0oo0o, o0OO00o0 o0oo00o1) {
        this.f19973OooO00o = o0o0oo0o;
        this.f19974OooO0O0 = o0oo00o1;
        Objects.requireNonNull(o0o0oo0o);
        StringBuilder sb = new StringBuilder("TwitterAndroidSDK");
        sb.append('/');
        sb.append("3.3.0.12");
        sb.append(' ');
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
        String strNormalize = Normalizer.normalize(o00oO0o.OooO0O0(sb, Build.PRODUCT, ')'), Normalizer.Form.NFD);
        StringBuilder sb2 = new StringBuilder(strNormalize.length());
        for (int i = 0; i < strNormalize.length(); i++) {
            char cCharAt = strNormalize.charAt(i);
            if (cCharAt > 31 && cCharAt < 127) {
                sb2.append(cCharAt);
            }
        }
        this.f19975OooO0OO = sb2.toString();
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        oooO00o.OooO00o(new o00OO00O() { // from class: com.twitter.sdk.android.core.internal.oauth.OooO0o
            @Override // p660o0ooo0o0.o00OO00O
            public final o00OOOO0 intercept(o00OO00O.OooO00o oooO00o2) {
                OooO oooO = this.f19986OooO00o;
                Objects.requireNonNull(oooO);
                oOo00o0o ooo00o0o = (oOo00o0o) oooO00o2;
                o00OOO00.OooO00o oooO00o3 = new o00OOO00.OooO00o(ooo00o0o.f51883OooO0o);
                oooO00o3.OooO0o0("User-Agent", oooO.f19975OooO0OO);
                return ooo00o0o.OooO0O0(oooO00o3.OooO0O0());
            }
        });
        oooO00o.OooO0O0(o000000O.OooO00o());
        o00OO o00oo2 = new o00OO(oooO00o);
        o0O0O00.OooO0O0 oooO0O0 = new o0O0O00.OooO0O0();
        Objects.requireNonNull(this.f19974OooO0O0);
        oooO0O0.OooO0O0("https://api.twitter.com");
        oooO0O0.f53806OooO0O0 = o00oo2;
        oooO0O0.f53808OooO0Oo.add(p693oO000oO.OooO.OooO0OO());
        this.f19976OooO0Oo = oooO0O0.OooO0OO();
    }
}
