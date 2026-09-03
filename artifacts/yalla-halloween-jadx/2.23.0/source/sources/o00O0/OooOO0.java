package o00O0;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f35970OooO00o = new OooO();

    public static void OooO00o() {
        f35970OooO00o.getClass();
    }

    public static void OooO0O0(String str) {
        f35970OooO00o.getClass();
        HashSet hashSet = OooO.f35967OooO00o;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void OooO0OO(String str, Throwable th) {
        f35970OooO00o.getClass();
        HashSet hashSet = OooO.f35967OooO00o;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
