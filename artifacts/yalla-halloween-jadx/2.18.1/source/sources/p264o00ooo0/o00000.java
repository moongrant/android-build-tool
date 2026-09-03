package p264o00ooo0;

import android.os.Parcel;
import com.umeng.analytics.pro.bl;
import p490o0o00O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements Oooo000 {
    public static void OooO00o(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static int OooO0O0(Parcel parcel, int i) {
        parcel.writeInt(i | bl.a);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
}
