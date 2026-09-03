package oo0OOoo;

import p022Oooo00O.o0O00oO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p288o0O0Oo.OooO0O0 f60310OooO0O0 = new p288o0O0Oo.OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f60311OooO0OO = OooO00o("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f60312OooO0Oo = OooO00o("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0O00oO0 f60313OooO0o0 = new o0O00oO0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f60314OooO00o;

    public OooO00o(OooO0OO oooO0OO) {
        this.f60314OooO00o = oooO0OO;
    }

    public static String OooO00o(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
