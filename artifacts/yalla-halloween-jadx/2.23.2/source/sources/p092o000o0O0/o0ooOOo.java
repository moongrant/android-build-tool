package p092o000o0O0;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0ooOOo {
    public static byte[] OooO00o(List list) {
        ArrayList<Bundle> arrayListOooO0O0 = o00oO0o.OooO0O0(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListOooO0O0);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
