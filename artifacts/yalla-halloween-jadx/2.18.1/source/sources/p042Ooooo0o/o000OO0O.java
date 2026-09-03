package p042Ooooo0o;

import kotlin.jvm.JvmStatic;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O {
    @JvmStatic
    public static final void OooO00o(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(o00O00OO.OooO00o("index: ", i, ", size: ", i2));
        }
    }

    @JvmStatic
    public static final void OooO0O0(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(o00O00OO.OooO00o("index: ", i, ", size: ", i2));
        }
    }

    @JvmStatic
    public static final void OooO0OO(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbOooO0O0.append(i3);
            throw new IndexOutOfBoundsException(sbOooO0O0.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("fromIndex: ", i, " > toIndex: ", i2));
        }
    }
}
