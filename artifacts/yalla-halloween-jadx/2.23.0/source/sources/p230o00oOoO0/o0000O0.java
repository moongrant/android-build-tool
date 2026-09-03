package p230o00oOoO0;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O0 {
    public static byte[] OooO00o(List list) {
        ArrayList<Bundle> arrayListOooO0O0 = oOO00O.OooO0O0(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListOooO0O0);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
