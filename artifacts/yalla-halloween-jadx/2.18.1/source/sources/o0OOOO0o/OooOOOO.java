package o0OOOO0o;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class OooOOOO {
    @CanIgnoreReturnValue
    public static int OooO(int i, int i2) {
        String strOooO00o;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strOooO00o = o000oOoO.OooO00o("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("negative size: ", i2));
            }
            strOooO00o = o000oOoO.OooO00o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strOooO00o);
    }

    public static String OooO00o(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return o000oOoO.OooO00o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return o000oOoO.OooO00o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("negative size: ", i2));
    }

    public static void OooO0O0(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void OooO0OO(boolean z, long j) {
        if (!z) {
            throw new IllegalArgumentException(o000oOoO.OooO00o("too many occurrences: %s", Long.valueOf(j)));
        }
    }

    public static void OooO0Oo(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void OooO0o(boolean z, @NullableDecl String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(o000oOoO.OooO00o(str, Integer.valueOf(i)));
        }
    }

    public static void OooO0o0(boolean z, @NullableDecl String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(o000oOoO.OooO00o(str, Character.valueOf(c)));
        }
    }

    public static void OooO0oO(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(o000oOoO.OooO00o(str, obj));
        }
    }

    public static void OooO0oo(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(o000oOoO.OooO00o(str, obj, obj2));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T OooOO0(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    public static int OooOO0O(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(OooO00o(i, i2, "index"));
        }
        return i;
    }

    public static void OooOO0o(int i, int i2, int i3) {
        String strOooO00o;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strOooO00o = OooO00o(i, i3, "start index");
            } else {
                strOooO00o = (i2 < 0 || i2 > i3) ? OooO00o(i2, i3, "end index") : o000oOoO.OooO00o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strOooO00o);
        }
    }

    public static void OooOOO(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void OooOOO0(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void OooOOOO(boolean z, @NullableDecl String str, int i) {
        if (!z) {
            throw new IllegalStateException(o000oOoO.OooO00o(str, Integer.valueOf(i)));
        }
    }

    public static void OooOOOo(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(o000oOoO.OooO00o(str, obj));
        }
    }
}
