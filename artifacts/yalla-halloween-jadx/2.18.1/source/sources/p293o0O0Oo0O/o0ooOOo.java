package p293o0O0Oo0O;

import androidx.annotation.Nullable;
import com.uc.crashsdk.export.LogType;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f35807OooO00o = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f35808OooO0O0 = {44100, 48000, LogType.UNEXP_KNOWN_REASON};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f35809OooO0OO = {LogType.UNEXP_KNOWN_REASON, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f35810OooO0Oo = {LogType.UNEXP_KNOWN_REASON, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f35812OooO0o0 = {LogType.UNEXP_KNOWN_REASON, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f35811OooO0o = {LogType.UNEXP_KNOWN_REASON, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f35813OooO0oO = {8000, 16000, 24000, LogType.UNEXP_KNOWN_REASON, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f35814OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String f35815OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f35816OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35817OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f35818OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f35819OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f35820OooO0oO;

        public final boolean OooO00o(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!o0ooOOo.OooO0OO(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f35814OooO00o = i2;
            this.f35815OooO0O0 = o0ooOOo.f35807OooO00o[3 - i3];
            int i6 = o0ooOOo.f35808OooO0O0[i5];
            this.f35817OooO0Oo = i6;
            if (i2 == 2) {
                this.f35817OooO0Oo = i6 / 2;
            } else if (i2 == 0) {
                this.f35817OooO0Oo = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f35820OooO0oO = o0ooOOo.OooO0O0(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? o0ooOOo.f35809OooO0OO[i4 - 1] : o0ooOOo.f35810OooO0Oo[i4 - 1];
                this.f35818OooO0o = i8;
                this.f35816OooO0OO = (((i8 * 12) / this.f35817OooO0Oo) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? o0ooOOo.f35812OooO0o0[i4 - 1] : o0ooOOo.f35811OooO0o[i4 - 1];
                    this.f35818OooO0o = i9;
                    this.f35816OooO0OO = ((i9 * 144) / this.f35817OooO0Oo) + i7;
                } else {
                    int i10 = o0ooOOo.f35813OooO0oO[i4 - 1];
                    this.f35818OooO0o = i10;
                    this.f35816OooO0OO = (((i3 == 1 ? 72 : 144) * i10) / this.f35817OooO0Oo) + i7;
                }
            }
            this.f35819OooO0o0 = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int OooO00o(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!OooO0OO(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f35808OooO0O0[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f35809OooO0OO[i4 - 1] : f35810OooO0Oo[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f35812OooO0o0[i4 - 1] : f35811OooO0o[i4 - 1];
        } else {
            i6 = f35813OooO0oO[i4 - 1];
        }
        if (i2 == 3) {
            return com.app.base.protobuf.OooO00o.OooO00o(i6, 144, i7, i8);
        }
        return com.app.base.protobuf.OooO00o.OooO00o(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    public static int OooO0O0(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean OooO0OO(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int OooO0Oo(int i) {
        int i2;
        int i3;
        if (!OooO0OO(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return OooO0O0(i2, i3);
    }
}
