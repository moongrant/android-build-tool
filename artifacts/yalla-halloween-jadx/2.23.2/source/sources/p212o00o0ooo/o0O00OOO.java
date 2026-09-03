package p212o00o0ooo;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00OOO {
    public static void OooO00o(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }
}
