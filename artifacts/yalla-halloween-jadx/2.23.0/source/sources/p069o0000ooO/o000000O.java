package p069o0000ooO;

import androidx.media3.common.util.UnstableApi;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashSet<String> f34322OooO00o = new HashSet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static String f34323OooO0O0 = "media3.common";

    public static synchronized void OooO00o() {
        if (f34322OooO00o.add("media3.ui")) {
            f34323OooO0O0 += ", media3.ui";
        }
    }
}
