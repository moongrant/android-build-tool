package p056o0000Oo0;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.Comparator;
import o0000O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    public interface OooO00o<T> {
    }

    public static class OooO0O0<T> implements Comparator<T> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f34155OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO00o<T> f34157OooO0oO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Rect f34154OooO0Oo = new Rect();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Rect f34156OooO0o0 = new Rect();

        public OooO0O0(boolean z, o0000Oo0.OooO0O0.OooO00o oooO00o) {
            this.f34155OooO0o = z;
            this.f34157OooO0oO = oooO00o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            o0000Oo0.OooO0O0.OooO00o oooO00o = (o0000Oo0.OooO0O0.OooO00o) this.f34157OooO0oO;
            oooO00o.getClass();
            Rect rect = this.f34154OooO0Oo;
            ((o0Oo0oo) t).OooO0o0(rect);
            oooO00o.getClass();
            Rect rect2 = this.f34156OooO0o0;
            ((o0Oo0oo) t2).OooO0o0(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            boolean z = this.f34155OooO0o;
            if (i3 < i4) {
                return z ? 1 : -1;
            }
            if (i3 > i4) {
                return z ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return z ? 1 : -1;
            }
            if (i7 > i8) {
                return z ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    public static boolean OooO00o(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean z;
        int i2;
        int i3;
        boolean zOooO0O0 = OooO0O0(i, rect, rect2);
        if (OooO0O0(i, rect, rect3) || !zOooO0O0) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (rect.right <= rect3.left) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (rect.top >= rect3.bottom) {
                z = true;
            } else {
                z = false;
            }
        } else if (rect.left >= rect3.right) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i == 17 || i == 66) {
            return true;
        }
        int iOooO0Oo = OooO0Oo(i, rect, rect2);
        if (i == 17) {
            i2 = rect.left;
            i3 = rect3.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect3.top;
        } else if (i == 66) {
            i2 = rect3.right;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect3.bottom;
            i3 = rect.bottom;
        }
        return iOooO0Oo < Math.max(1, i2 - i3);
    }

    public static boolean OooO0O0(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean OooO0OO(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static int OooO0Oo(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int OooO0o0(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
