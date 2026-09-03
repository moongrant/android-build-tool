package p660o0ooo0o0;

import oO000O0O.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f51481OooO00o = 0;

    public static byte[] OooO00o(OooO0OO oooO0OO, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= oooO0OO.OooO0O0()) {
            System.arraycopy(oooO0OO.OooO00o(), 0, bArr, 0, i);
        } else {
            int iOooO0O0 = oooO0OO.OooO0O0() / 8;
            for (int i2 = 0; i2 < i; i2 += iOooO0O0) {
                byte[] bArrOooO00o = oooO0OO.OooO00o();
                int i3 = i - i2;
                if (bArrOooO00o.length <= i3) {
                    System.arraycopy(bArrOooO00o, 0, bArr, i2, bArrOooO00o.length);
                } else {
                    System.arraycopy(bArrOooO00o, 0, bArr, i2, i3);
                }
            }
        }
        return bArr;
    }

    public static Class OooO0O0(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }
}
