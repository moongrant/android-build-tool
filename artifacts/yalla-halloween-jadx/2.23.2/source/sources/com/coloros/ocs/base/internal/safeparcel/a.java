package com.coloros.ocs.base.internal.safeparcel;

import android.os.Parcel;
import androidx.appcompat.widget.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: com.coloros.ocs.base.internal.safeparcel.a$a, reason: collision with other inner class name */
    public static class C0203a extends RuntimeException {
    }

    public static int OooO00o(Parcel parcel, int i) {
        int iOooO0O0 = OooO0O0(parcel, i);
        if (iOooO0O0 == 4) {
            return parcel.readInt();
        }
        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Expected size 4 got ", iOooO0O0, " (0x");
        sbOooO0O0.append(Integer.toHexString(iOooO0O0));
        sbOooO0O0.append(")");
        throw new C0203a(sbOooO0O0.toString());
    }

    public static int OooO0O0(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }
}
