package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f34746OooO00o = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f34747OooO0O0 = {44100, 48000, 32000};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f34748OooO0OO = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f34749OooO0Oo = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f34751OooO0o0 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f34750OooO0o = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f34752OooO0oO = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f34753OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String f34754OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f34755OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f34756OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f34757OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f34758OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f34759OooO0oO;

        public final boolean OooO00o(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f34753OooO00o = i2;
            this.f34754OooO0O0 = oo0o0Oo.f34746OooO00o[3 - i3];
            int i6 = oo0o0Oo.f34747OooO0O0[i5];
            this.f34756OooO0Oo = i6;
            if (i2 == 2) {
                this.f34756OooO0Oo = i6 / 2;
            } else if (i2 == 0) {
                this.f34756OooO0Oo = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            int i8 = 1152;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i8 = 384;
                }
            } else if (i2 != 3) {
                i8 = 576;
            }
            this.f34759OooO0oO = i8;
            if (i3 == 3) {
                int i9 = i2 == 3 ? oo0o0Oo.f34748OooO0OO[i4 - 1] : oo0o0Oo.f34749OooO0Oo[i4 - 1];
                this.f34757OooO0o = i9;
                this.f34755OooO0OO = (((i9 * 12) / this.f34756OooO0Oo) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i10 = i3 == 2 ? oo0o0Oo.f34751OooO0o0[i4 - 1] : oo0o0Oo.f34750OooO0o[i4 - 1];
                    this.f34757OooO0o = i10;
                    this.f34755OooO0OO = ((i10 * 144) / this.f34756OooO0Oo) + i7;
                } else {
                    int i11 = oo0o0Oo.f34752OooO0oO[i4 - 1];
                    this.f34757OooO0o = i11;
                    this.f34755OooO0OO = (((i3 == 1 ? 72 : 144) * i11) / this.f34756OooO0Oo) + i7;
                }
            }
            this.f34758OooO0o0 = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int OooO00o(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f34747OooO0O0[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f34748OooO0OO[i4 - 1] : f34749OooO0Oo[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f34751OooO0o0[i4 - 1] : f34750OooO0o[i4 - 1];
        } else {
            i6 = f34752OooO0oO[i4 - 1];
        }
        if (i2 == 3) {
            return o0OO00O.OooO00o(i6, 144, i7, i8);
        }
        return o0OO00O.OooO00o(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    public static int OooO0O0(int i) {
        int i2;
        int i3;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
