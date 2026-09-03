package p102o000oo;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static o0OoOo0 f29821OooO00o;

    public static class OooO00o extends o0OoOo0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f29822OooO0O0;

        public OooO00o(int i) {
            this.f29822OooO0O0 = i;
        }

        @Override // p102o000oo.o0OoOo0
        public final void OooO00o(String str, String str2, Throwable... thArr) {
            if (this.f29822OooO0O0 <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // p102o000oo.o0OoOo0
        public final void OooO0O0(String str, String str2, Throwable... thArr) {
            if (this.f29822OooO0O0 <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // p102o000oo.o0OoOo0
        public final void OooO0Oo(String str, String str2, Throwable... thArr) {
            if (this.f29822OooO0O0 <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // p102o000oo.o0OoOo0
        public final void OooO0o(String str, String str2, Throwable... thArr) {
            if (this.f29822OooO0O0 <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized o0OoOo0 OooO0OO() {
        if (f29821OooO00o == null) {
            f29821OooO00o = new OooO00o(3);
        }
        return f29821OooO00o;
    }

    public static String OooO0o0(@NonNull String str) {
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

    public abstract void OooO00o(String str, String str2, Throwable... thArr);

    public abstract void OooO0O0(String str, String str2, Throwable... thArr);

    public abstract void OooO0Oo(String str, String str2, Throwable... thArr);

    public abstract void OooO0o(String str, String str2, Throwable... thArr);
}
