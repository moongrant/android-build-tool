package p069o0000ooO;

import androidx.media3.common.util.UnstableApi;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashSet<String> f33812OooO00o = new HashSet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static String f33813OooO0O0 = "media3.common";

    public static synchronized void OooO00o(String str) {
        if (f33812OooO00o.add(str)) {
            f33813OooO0O0 += ", " + str;
        }
    }
}
