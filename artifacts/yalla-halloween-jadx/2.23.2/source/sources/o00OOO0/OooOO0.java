package o00OOO0;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f37421OooO00o = new OooO();

    public static void OooO00o() {
        f37421OooO00o.getClass();
    }

    public static void OooO0O0(String str) {
        f37421OooO00o.getClass();
        HashSet hashSet = OooO.f37418OooO00o;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void OooO0OO(String str, Throwable th) {
        f37421OooO00o.getClass();
        HashSet hashSet = OooO.f37418OooO00o;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
