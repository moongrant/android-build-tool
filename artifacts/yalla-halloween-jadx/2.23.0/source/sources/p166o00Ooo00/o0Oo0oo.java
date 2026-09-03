package p166o00Ooo00;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.ocs.base.common.Status;
import com.coloros.ocs.base.internal.safeparcel.a;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        Parcelable parcelable;
        int i = parcel.readInt();
        int iOooO0O0 = a.OooO0O0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if ((i & 65535) != 20293) {
            throw new a.C0184a("Expected object header. Got 0x" + Integer.toHexString(i));
        }
        int i2 = iOooO0O0 + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new a.C0184a(OooOO0.OooO00o("Size read is invalid start=", iDataPosition, " end=", i2));
        }
        int iOooO00o = 0;
        int iOooO00o2 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        while (parcel.dataPosition() < i2) {
            int i3 = parcel.readInt();
            int i4 = i3 & 65535;
            if (i4 == 1) {
                iOooO00o2 = a.OooO00o(parcel, i3);
            } else if (i4 == 2) {
                int iOooO0O1 = a.OooO0O0(parcel, i3);
                int iDataPosition2 = parcel.dataPosition();
                if (iOooO0O1 == 0) {
                    str = null;
                } else {
                    String string = parcel.readString();
                    parcel.setDataPosition(iDataPosition2 + iOooO0O1);
                    str = string;
                }
            } else if (i4 == 3) {
                Parcelable.Creator creator = PendingIntent.CREATOR;
                int iOooO0O2 = a.OooO0O0(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                if (iOooO0O2 == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(parcel);
                    parcel.setDataPosition(iDataPosition3 + iOooO0O2);
                }
                pendingIntent = (PendingIntent) parcelable;
            } else if (i4 != 1000) {
                parcel.setDataPosition(parcel.dataPosition() + a.OooO0O0(parcel, i3));
            } else {
                iOooO00o = a.OooO00o(parcel, i3);
            }
        }
        if (parcel.dataPosition() == i2) {
            return new Status(iOooO00o, iOooO00o2, pendingIntent, str);
        }
        throw new a.C0184a("Overread allowed size end=".concat(String.valueOf(i2)));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
