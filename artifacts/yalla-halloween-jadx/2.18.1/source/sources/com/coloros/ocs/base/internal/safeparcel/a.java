package com.coloros.ocs.base.internal.safeparcel;

import android.os.Parcel;
import com.umeng.analytics.pro.bl;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: com.coloros.ocs.base.internal.safeparcel.a$a, reason: collision with other inner class name */
    public static class C0084a extends RuntimeException {
        public C0084a(String str) {
            super(str);
        }
    }

    public static int OooO00o(Parcel parcel, int i) {
        int iOooO0O0 = OooO0O0(parcel, i);
        if (iOooO0O0 == 4) {
            return parcel.readInt();
        }
        throw new C0084a("Expected size 4 got " + iOooO0O0 + " (0x" + Integer.toHexString(iOooO0O0) + ")");
    }

    public static int OooO0O0(Parcel parcel, int i) {
        return (i & bl.a) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }
}
