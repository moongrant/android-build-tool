package oo00o;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {
    public static void OooO00o(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }
}
