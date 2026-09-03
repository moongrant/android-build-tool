package p331o0OO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO[] f42312OooO0Oo = OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f42313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0[] f42314OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f42315OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f42316OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f42317OooO0O0;

        public OooO00o(int i, int i2) {
            this.f42316OooO00o = i;
            this.f42317OooO0O0 = i2;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f42318OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o[] f42319OooO0O0;

        public OooO0O0(int i, OooO00o... oooO00oArr) {
            this.f42318OooO00o = i;
            this.f42319OooO0O0 = oooO00oArr;
        }
    }

    public OooO0OO(int i, OooO0O0... oooO0O0Arr) {
        this.f42313OooO00o = i;
        this.f42314OooO0O0 = oooO0O0Arr;
        OooO0O0 oooO0O0 = oooO0O0Arr[0];
        int i2 = oooO0O0.f42318OooO00o;
        int i3 = 0;
        for (OooO00o oooO00o : oooO0O0.f42319OooO0O0) {
            i3 += (oooO00o.f42317OooO0O0 + i2) * oooO00o.f42316OooO00o;
        }
        this.f42315OooO0OO = i3;
    }

    public static OooO0OO[] OooO00o() {
        return new OooO0OO[]{new OooO0OO(1, new OooO0O0(7, new OooO00o(1, 19)), new OooO0O0(10, new OooO00o(1, 16)), new OooO0O0(13, new OooO00o(1, 13)), new OooO0O0(17, new OooO00o(1, 9))), new OooO0OO(2, new OooO0O0(10, new OooO00o(1, 34)), new OooO0O0(16, new OooO00o(1, 28)), new OooO0O0(22, new OooO00o(1, 22)), new OooO0O0(28, new OooO00o(1, 16))), new OooO0OO(3, new OooO0O0(15, new OooO00o(1, 55)), new OooO0O0(26, new OooO00o(1, 44)), new OooO0O0(18, new OooO00o(2, 17)), new OooO0O0(22, new OooO00o(2, 13))), new OooO0OO(4, new OooO0O0(20, new OooO00o(1, 80)), new OooO0O0(18, new OooO00o(2, 32)), new OooO0O0(26, new OooO00o(2, 24)), new OooO0O0(16, new OooO00o(4, 9))), new OooO0OO(5, new OooO0O0(26, new OooO00o(1, 108)), new OooO0O0(24, new OooO00o(2, 43)), new OooO0O0(18, new OooO00o(2, 15), new OooO00o(2, 16)), new OooO0O0(22, new OooO00o(2, 11), new OooO00o(2, 12))), new OooO0OO(6, new OooO0O0(18, new OooO00o(2, 68)), new OooO0O0(16, new OooO00o(4, 27)), new OooO0O0(24, new OooO00o(4, 19)), new OooO0O0(28, new OooO00o(4, 15))), new OooO0OO(7, new OooO0O0(20, new OooO00o(2, 78)), new OooO0O0(18, new OooO00o(4, 31)), new OooO0O0(18, new OooO00o(2, 14), new OooO00o(4, 15)), new OooO0O0(26, new OooO00o(4, 13), new OooO00o(1, 14))), new OooO0OO(8, new OooO0O0(24, new OooO00o(2, 97)), new OooO0O0(22, new OooO00o(2, 38), new OooO00o(2, 39)), new OooO0O0(22, new OooO00o(4, 18), new OooO00o(2, 19)), new OooO0O0(26, new OooO00o(4, 14), new OooO00o(2, 15))), new OooO0OO(9, new OooO0O0(30, new OooO00o(2, 116)), new OooO0O0(22, new OooO00o(3, 36), new OooO00o(2, 37)), new OooO0O0(20, new OooO00o(4, 16), new OooO00o(4, 17)), new OooO0O0(24, new OooO00o(4, 12), new OooO00o(4, 13))), new OooO0OO(10, new OooO0O0(18, new OooO00o(2, 68), new OooO00o(2, 69)), new OooO0O0(26, new OooO00o(4, 43), new OooO00o(1, 44)), new OooO0O0(24, new OooO00o(6, 19), new OooO00o(2, 20)), new OooO0O0(28, new OooO00o(6, 15), new OooO00o(2, 16))), new OooO0OO(11, new OooO0O0(20, new OooO00o(4, 81)), new OooO0O0(30, new OooO00o(1, 50), new OooO00o(4, 51)), new OooO0O0(28, new OooO00o(4, 22), new OooO00o(4, 23)), new OooO0O0(24, new OooO00o(3, 12), new OooO00o(8, 13))), new OooO0OO(12, new OooO0O0(24, new OooO00o(2, 92), new OooO00o(2, 93)), new OooO0O0(22, new OooO00o(6, 36), new OooO00o(2, 37)), new OooO0O0(26, new OooO00o(4, 20), new OooO00o(6, 21)), new OooO0O0(28, new OooO00o(7, 14), new OooO00o(4, 15))), new OooO0OO(13, new OooO0O0(26, new OooO00o(4, 107)), new OooO0O0(22, new OooO00o(8, 37), new OooO00o(1, 38)), new OooO0O0(24, new OooO00o(8, 20), new OooO00o(4, 21)), new OooO0O0(22, new OooO00o(12, 11), new OooO00o(4, 12))), new OooO0OO(14, new OooO0O0(30, new OooO00o(3, 115), new OooO00o(1, 116)), new OooO0O0(24, new OooO00o(4, 40), new OooO00o(5, 41)), new OooO0O0(20, new OooO00o(11, 16), new OooO00o(5, 17)), new OooO0O0(24, new OooO00o(11, 12), new OooO00o(5, 13))), new OooO0OO(15, new OooO0O0(22, new OooO00o(5, 87), new OooO00o(1, 88)), new OooO0O0(24, new OooO00o(5, 41), new OooO00o(5, 42)), new OooO0O0(30, new OooO00o(5, 24), new OooO00o(7, 25)), new OooO0O0(24, new OooO00o(11, 12), new OooO00o(7, 13))), new OooO0OO(16, new OooO0O0(24, new OooO00o(5, 98), new OooO00o(1, 99)), new OooO0O0(28, new OooO00o(7, 45), new OooO00o(3, 46)), new OooO0O0(24, new OooO00o(15, 19), new OooO00o(2, 20)), new OooO0O0(30, new OooO00o(3, 15), new OooO00o(13, 16))), new OooO0OO(17, new OooO0O0(28, new OooO00o(1, 107), new OooO00o(5, 108)), new OooO0O0(28, new OooO00o(10, 46), new OooO00o(1, 47)), new OooO0O0(28, new OooO00o(1, 22), new OooO00o(15, 23)), new OooO0O0(28, new OooO00o(2, 14), new OooO00o(17, 15))), new OooO0OO(18, new OooO0O0(30, new OooO00o(5, 120), new OooO00o(1, 121)), new OooO0O0(26, new OooO00o(9, 43), new OooO00o(4, 44)), new OooO0O0(28, new OooO00o(17, 22), new OooO00o(1, 23)), new OooO0O0(28, new OooO00o(2, 14), new OooO00o(19, 15))), new OooO0OO(19, new OooO0O0(28, new OooO00o(3, 113), new OooO00o(4, 114)), new OooO0O0(26, new OooO00o(3, 44), new OooO00o(11, 45)), new OooO0O0(26, new OooO00o(17, 21), new OooO00o(4, 22)), new OooO0O0(26, new OooO00o(9, 13), new OooO00o(16, 14))), new OooO0OO(20, new OooO0O0(28, new OooO00o(3, 107), new OooO00o(5, 108)), new OooO0O0(26, new OooO00o(3, 41), new OooO00o(13, 42)), new OooO0O0(30, new OooO00o(15, 24), new OooO00o(5, 25)), new OooO0O0(28, new OooO00o(15, 15), new OooO00o(10, 16))), new OooO0OO(21, new OooO0O0(28, new OooO00o(4, 116), new OooO00o(4, 117)), new OooO0O0(26, new OooO00o(17, 42)), new OooO0O0(28, new OooO00o(17, 22), new OooO00o(6, 23)), new OooO0O0(30, new OooO00o(19, 16), new OooO00o(6, 17))), new OooO0OO(22, new OooO0O0(28, new OooO00o(2, 111), new OooO00o(7, 112)), new OooO0O0(28, new OooO00o(17, 46)), new OooO0O0(30, new OooO00o(7, 24), new OooO00o(16, 25)), new OooO0O0(24, new OooO00o(34, 13))), new OooO0OO(23, new OooO0O0(30, new OooO00o(4, 121), new OooO00o(5, 122)), new OooO0O0(28, new OooO00o(4, 47), new OooO00o(14, 48)), new OooO0O0(30, new OooO00o(11, 24), new OooO00o(14, 25)), new OooO0O0(30, new OooO00o(16, 15), new OooO00o(14, 16))), new OooO0OO(24, new OooO0O0(30, new OooO00o(6, 117), new OooO00o(4, 118)), new OooO0O0(28, new OooO00o(6, 45), new OooO00o(14, 46)), new OooO0O0(30, new OooO00o(11, 24), new OooO00o(16, 25)), new OooO0O0(30, new OooO00o(30, 16), new OooO00o(2, 17))), new OooO0OO(25, new OooO0O0(26, new OooO00o(8, 106), new OooO00o(4, 107)), new OooO0O0(28, new OooO00o(8, 47), new OooO00o(13, 48)), new OooO0O0(30, new OooO00o(7, 24), new OooO00o(22, 25)), new OooO0O0(30, new OooO00o(22, 15), new OooO00o(13, 16))), new OooO0OO(26, new OooO0O0(28, new OooO00o(10, 114), new OooO00o(2, 115)), new OooO0O0(28, new OooO00o(19, 46), new OooO00o(4, 47)), new OooO0O0(28, new OooO00o(28, 22), new OooO00o(6, 23)), new OooO0O0(30, new OooO00o(33, 16), new OooO00o(4, 17))), new OooO0OO(27, new OooO0O0(30, new OooO00o(8, 122), new OooO00o(4, 123)), new OooO0O0(28, new OooO00o(22, 45), new OooO00o(3, 46)), new OooO0O0(30, new OooO00o(8, 23), new OooO00o(26, 24)), new OooO0O0(30, new OooO00o(12, 15), new OooO00o(28, 16))), new OooO0OO(28, new OooO0O0(30, new OooO00o(3, 117), new OooO00o(10, 118)), new OooO0O0(28, new OooO00o(3, 45), new OooO00o(23, 46)), new OooO0O0(30, new OooO00o(4, 24), new OooO00o(31, 25)), new OooO0O0(30, new OooO00o(11, 15), new OooO00o(31, 16))), new OooO0OO(29, new OooO0O0(30, new OooO00o(7, 116), new OooO00o(7, 117)), new OooO0O0(28, new OooO00o(21, 45), new OooO00o(7, 46)), new OooO0O0(30, new OooO00o(1, 23), new OooO00o(37, 24)), new OooO0O0(30, new OooO00o(19, 15), new OooO00o(26, 16))), new OooO0OO(30, new OooO0O0(30, new OooO00o(5, 115), new OooO00o(10, 116)), new OooO0O0(28, new OooO00o(19, 47), new OooO00o(10, 48)), new OooO0O0(30, new OooO00o(15, 24), new OooO00o(25, 25)), new OooO0O0(30, new OooO00o(23, 15), new OooO00o(25, 16))), new OooO0OO(31, new OooO0O0(30, new OooO00o(13, 115), new OooO00o(3, 116)), new OooO0O0(28, new OooO00o(2, 46), new OooO00o(29, 47)), new OooO0O0(30, new OooO00o(42, 24), new OooO00o(1, 25)), new OooO0O0(30, new OooO00o(23, 15), new OooO00o(28, 16))), new OooO0OO(32, new OooO0O0(30, new OooO00o(17, 115)), new OooO0O0(28, new OooO00o(10, 46), new OooO00o(23, 47)), new OooO0O0(30, new OooO00o(10, 24), new OooO00o(35, 25)), new OooO0O0(30, new OooO00o(19, 15), new OooO00o(35, 16))), new OooO0OO(33, new OooO0O0(30, new OooO00o(17, 115), new OooO00o(1, 116)), new OooO0O0(28, new OooO00o(14, 46), new OooO00o(21, 47)), new OooO0O0(30, new OooO00o(29, 24), new OooO00o(19, 25)), new OooO0O0(30, new OooO00o(11, 15), new OooO00o(46, 16))), new OooO0OO(34, new OooO0O0(30, new OooO00o(13, 115), new OooO00o(6, 116)), new OooO0O0(28, new OooO00o(14, 46), new OooO00o(23, 47)), new OooO0O0(30, new OooO00o(44, 24), new OooO00o(7, 25)), new OooO0O0(30, new OooO00o(59, 16), new OooO00o(1, 17))), new OooO0OO(35, new OooO0O0(30, new OooO00o(12, 121), new OooO00o(7, 122)), new OooO0O0(28, new OooO00o(12, 47), new OooO00o(26, 48)), new OooO0O0(30, new OooO00o(39, 24), new OooO00o(14, 25)), new OooO0O0(30, new OooO00o(22, 15), new OooO00o(41, 16))), new OooO0OO(36, new OooO0O0(30, new OooO00o(6, 121), new OooO00o(14, 122)), new OooO0O0(28, new OooO00o(6, 47), new OooO00o(34, 48)), new OooO0O0(30, new OooO00o(46, 24), new OooO00o(10, 25)), new OooO0O0(30, new OooO00o(2, 15), new OooO00o(64, 16))), new OooO0OO(37, new OooO0O0(30, new OooO00o(17, 122), new OooO00o(4, 123)), new OooO0O0(28, new OooO00o(29, 46), new OooO00o(14, 47)), new OooO0O0(30, new OooO00o(49, 24), new OooO00o(10, 25)), new OooO0O0(30, new OooO00o(24, 15), new OooO00o(46, 16))), new OooO0OO(38, new OooO0O0(30, new OooO00o(4, 122), new OooO00o(18, 123)), new OooO0O0(28, new OooO00o(13, 46), new OooO00o(32, 47)), new OooO0O0(30, new OooO00o(48, 24), new OooO00o(14, 25)), new OooO0O0(30, new OooO00o(42, 15), new OooO00o(32, 16))), new OooO0OO(39, new OooO0O0(30, new OooO00o(20, 117), new OooO00o(4, 118)), new OooO0O0(28, new OooO00o(40, 47), new OooO00o(7, 48)), new OooO0O0(30, new OooO00o(43, 24), new OooO00o(22, 25)), new OooO0O0(30, new OooO00o(10, 15), new OooO00o(67, 16))), new OooO0OO(40, new OooO0O0(30, new OooO00o(19, 118), new OooO00o(6, 119)), new OooO0O0(28, new OooO00o(18, 47), new OooO00o(31, 48)), new OooO0O0(30, new OooO00o(34, 24), new OooO00o(34, 25)), new OooO0O0(30, new OooO00o(20, 15), new OooO00o(61, 16)))};
    }

    public static OooO0OO OooO0O0(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return f42312OooO0Oo[i - 1];
    }

    public final String toString() {
        return String.valueOf(this.f42313OooO00o);
    }
}
