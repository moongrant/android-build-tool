package p203o00o0o0o;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashSet<String> f39206OooO00o = new HashSet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static String f39207OooO0O0 = "goog.exo.core";

    public static synchronized void OooO00o(String str) {
        if (f39206OooO00o.add(str)) {
            f39207OooO0O0 += ", " + str;
        }
    }
}
