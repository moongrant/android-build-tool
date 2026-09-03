package o0000O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27298OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final int[] f27299OooO0OO = {18, 20, 17, 15};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final int[] f27300OooO0Oo = {65535, 262143, 32767, 8191};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final int[] f27301OooO0o0 = {32767, 8191, 65535, 262143};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27302OooO00o;

    public static final class OooO00o {
        public final int OooO00o(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("Can't represent a size of ", i, " in Constraints"));
        }

        public final long OooO0O0(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int iOooO00o = OooO00o(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int iOooO00o2 = OooO00o(i6);
            if (iOooO00o + iOooO00o2 > 31) {
                throw new IllegalArgumentException(Oooo000.Oooo0.OooO00o("Can't represent a width of ", i6, " and height of ", i5, " in Constraints"));
            }
            if (iOooO00o2 == 13) {
                j = 3;
            } else if (iOooO00o2 == 18) {
                j = 1;
            } else if (iOooO00o2 == 15) {
                j = 2;
            } else {
                if (iOooO00o2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j = 0;
            }
            int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
            int i9 = OooO0O0.f27299OooO0OO[(int) j];
            return (((long) i7) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i8) << (i9 + 31));
        }

        @Stable
        public final long OooO0OO(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return OooO0O0(i, i, i2, i2);
            }
            throw new IllegalArgumentException(Oooo000.Oooo0.OooO00o("width(", i, ") and height(", i2, ") must be >= 0").toString());
        }

        @Stable
        public final long OooO0Oo(int i) {
            if (i >= 0) {
                return OooO0O0(0, Integer.MAX_VALUE, i, i);
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("height(", i, ") must be >= 0").toString());
        }

        @Stable
        public final long OooO0o0(int i) {
            if (i >= 0) {
                return OooO0O0(i, i, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("width(", i, ") must be >= 0").toString());
        }
    }

    public /* synthetic */ OooO0O0(long j) {
        this.f27302OooO00o = j;
    }

    public static final int OooO(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> f27299OooO0OO[i])) & f27301OooO0o0[i];
    }

    public static long OooO00o(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = OooOO0(j);
        }
        if ((i5 & 2) != 0) {
            i2 = OooO0oo(j);
        }
        if ((i5 & 4) != 0) {
            i3 = OooO(j);
        }
        if ((i5 & 8) != 0) {
            i4 = OooO0oO(j);
        }
        if (!(i3 >= 0 && i >= 0)) {
            throw new IllegalArgumentException(Oooo000.Oooo0.OooO00o("minHeight(", i3, ") and minWidth(", i, ") must be >= 0").toString());
        }
        if (!(i2 >= i || i2 == Integer.MAX_VALUE)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
            return f27298OooO0O0.OooO0O0(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
    }

    public static final boolean OooO0O0(long j, long j2) {
        return j == j2;
    }

    public static final boolean OooO0OO(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> (f27299OooO0OO[i] + 31))) & f27301OooO0o0[i]) != 0;
    }

    public static final boolean OooO0Oo(long j) {
        return (((int) (j >> 33)) & f27300OooO0Oo[(int) (3 & j)]) != 0;
    }

    public static final boolean OooO0o(long j) {
        return OooO0oo(j) == OooOO0(j);
    }

    public static final boolean OooO0o0(long j) {
        return OooO0oO(j) == OooO(j);
    }

    public static final int OooO0oO(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (f27299OooO0OO[i] + 31))) & f27301OooO0o0[i];
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int OooO0oo(long j) {
        int i = ((int) (j >> 33)) & f27300OooO0Oo[(int) (3 & j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int OooOO0(long j) {
        return ((int) (j >> 2)) & f27300OooO0Oo[(int) (3 & j)];
    }

    @NotNull
    public static String OooOO0O(long j) {
        int iOooO0oo = OooO0oo(j);
        String strValueOf = iOooO0oo == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iOooO0oo);
        int iOooO0oO = OooO0oO(j);
        String strValueOf2 = iOooO0oO != Integer.MAX_VALUE ? String.valueOf(iOooO0oO) : "Infinity";
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Constraints(minWidth = ");
        sbOooO0o0.append(OooOO0(j));
        sbOooO0o0.append(", maxWidth = ");
        sbOooO0o0.append(strValueOf);
        sbOooO0o0.append(", minHeight = ");
        sbOooO0o0.append(OooO(j));
        sbOooO0o0.append(", maxHeight = ");
        sbOooO0o0.append(strValueOf2);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooO0O0) && this.f27302OooO00o == ((OooO0O0) obj).f27302OooO00o;
    }

    public final int hashCode() {
        long j = this.f27302OooO00o;
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public final String toString() {
        return OooOO0O(this.f27302OooO00o);
    }
}
