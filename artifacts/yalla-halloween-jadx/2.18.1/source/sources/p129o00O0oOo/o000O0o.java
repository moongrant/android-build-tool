package p129o00O0oOo;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<String> f31147OooO00o = new HashSet();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final void OooO00o(String str, Throwable th) {
        ?? r0 = f31147OooO00o;
        if (r0.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        r0.add(str);
    }
}
