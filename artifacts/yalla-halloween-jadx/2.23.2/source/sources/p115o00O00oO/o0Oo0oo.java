package p115o00O00oO;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f36157OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile o0Oo0oo f36158OooO0O0;

    public static class OooO00o extends o0Oo0oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36159OooO0OO;

        public OooO00o(int i) {
            this.f36159OooO0OO = i;
        }

        @Override // p115o00O00oO.o0Oo0oo
        public final void OooO00o(@NonNull String str, @NonNull String str2) {
            if (this.f36159OooO0OO <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // p115o00O00oO.o0Oo0oo
        public final void OooO0O0(@NonNull String str, @NonNull String str2) {
            if (this.f36159OooO0OO <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // p115o00O00oO.o0Oo0oo
        public final void OooO0OO(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.f36159OooO0OO <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // p115o00O00oO.o0Oo0oo
        public final void OooO0o0(@NonNull String str, @NonNull String str2) {
            if (this.f36159OooO0OO <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // p115o00O00oO.o0Oo0oo
        public final void OooO0oO(@NonNull String str, @NonNull String str2) {
            if (this.f36159OooO0OO <= 5) {
                Log.w(str, str2);
            }
        }
    }

    @NonNull
    public static o0Oo0oo OooO0Oo() {
        o0Oo0oo o0oo0oo2;
        synchronized (f36157OooO00o) {
            if (f36158OooO0O0 == null) {
                f36158OooO0O0 = new OooO00o(3);
            }
            o0oo0oo2 = f36158OooO0O0;
        }
        return o0oo0oo2;
    }

    @NonNull
    public static String OooO0o(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void OooO00o(@NonNull String str, @NonNull String str2);

    public abstract void OooO0O0(@NonNull String str, @NonNull String str2);

    public abstract void OooO0OO(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    public abstract void OooO0o0(@NonNull String str, @NonNull String str2);

    public abstract void OooO0oO(@NonNull String str, @NonNull String str2);
}
