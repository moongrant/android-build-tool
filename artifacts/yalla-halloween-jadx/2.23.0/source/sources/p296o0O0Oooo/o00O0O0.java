package p296o0O0Oooo;

import androidx.compose.ui.graphics.colorspace.OooO0O0;
import p288o0O0Oo0O.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOOO f42326OooO0O0 = new OooOOO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f42327OooO0OO = OooO00o("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f42328OooO0Oo = OooO00o("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f42329OooO0o0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0OO0 f42330OooO00o;

    public o00O0O0(o00O0OO0 o00o0oo1) {
        this.f42330OooO00o = o00o0oo1;
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
