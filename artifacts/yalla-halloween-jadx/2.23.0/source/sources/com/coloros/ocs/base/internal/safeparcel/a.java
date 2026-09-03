package com.coloros.ocs.base.internal.safeparcel;

import android.os.Parcel;
import androidx.appcompat.widget.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: com.coloros.ocs.base.internal.safeparcel.a$a, reason: collision with other inner class name */
    public static class C0184a extends RuntimeException {
    }

    public static int OooO00o(Parcel parcel, int i) {
        int iOooO0O0 = OooO0O0(parcel, i);
        if (iOooO0O0 == 4) {
            return parcel.readInt();
        }
        StringBuilder sbOooO00o = o0000O0.OooO00o("Expected size 4 got ", iOooO0O0, " (0x");
        sbOooO00o.append(Integer.toHexString(iOooO0O0));
        sbOooO00o.append(")");
        throw new C0184a(sbOooO00o.toString());
    }

    public static int OooO0O0(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }
}
