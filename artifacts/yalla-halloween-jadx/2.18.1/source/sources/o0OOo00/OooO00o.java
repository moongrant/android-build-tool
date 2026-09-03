package o0OOo00;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o0O0O0Oo.OooO0o;
import p279o0O00OoO.OooOO0;
import p364o0OOOooO.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000O0 f38584OooO0O0 = new o000O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f38585OooO0OO = OooO00o("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f38586OooO0Oo = OooO00o("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0o<CrashlyticsReport, byte[]> f38587OooO0o0 = OooOO0.f35145OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f38588OooO00o;

    public OooO00o(OooO0OO oooO0OO) {
        this.f38588OooO00o = oooO0OO;
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
