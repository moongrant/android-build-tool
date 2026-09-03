package p338o0OO0ooo;

import com.google.firebase.perf.FirebasePerformance;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 {
    public static boolean OooO00o(String str) {
        return str.equals("POST") || str.equals(FirebasePerformance.HttpMethod.PATCH) || str.equals("PUT") || str.equals(FirebasePerformance.HttpMethod.DELETE);
    }

    public static boolean OooO0O0(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals(FirebasePerformance.HttpMethod.PATCH);
    }
}
