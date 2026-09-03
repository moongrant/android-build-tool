package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class o0OoOo0 {
    @CanIgnoreReturnValue
    public static void OooO(@CheckForNull Object obj, @CheckForNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String OooO00o(int i, int i2, String str) {
        if (i < 0) {
            return o0O0O00.OooO00o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return o0O0O00.OooO00o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(android.support.v4.media.session.OooO0OO.OooO00o(26, "negative size: ", i2));
    }

    public static void OooO0O0(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(o0O0O00.OooO00o(str, Long.valueOf(j)));
        }
    }

    public static void OooO0OO(String str, int i, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(o0O0O00.OooO00o(str, Integer.valueOf(i)));
        }
    }

    public static void OooO0Oo(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void OooO0o(boolean z, String str, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(o0O0O00.OooO00o(str, obj));
        }
    }

    public static void OooO0o0(boolean z, @CheckForNull String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void OooO0oO(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(o0O0O00.OooO00o(str, obj, obj2));
        }
    }

    @CanIgnoreReturnValue
    public static void OooO0oo(int i, int i2) {
        String strOooO00o;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strOooO00o = o0O0O00.OooO00o("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(android.support.v4.media.session.OooO0OO.OooO00o(26, "negative size: ", i2));
                }
                strOooO00o = o0O0O00.OooO00o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strOooO00o);
        }
    }

    @CanIgnoreReturnValue
    public static void OooOO0(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(OooO00o(i, i2, "index"));
        }
    }

    public static void OooOO0O(int i, int i2, int i3) {
        String strOooO00o;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strOooO00o = OooO00o(i, i3, "start index");
            } else {
                strOooO00o = (i2 < 0 || i2 > i3) ? OooO00o(i2, i3, "end index") : o0O0O00.OooO00o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strOooO00o);
        }
    }

    public static void OooOO0o(String str, @CheckForNull Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(o0O0O00.OooO00o(str, obj));
        }
    }

    public static void OooOOO(boolean z, @CheckForNull String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void OooOOO0(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
