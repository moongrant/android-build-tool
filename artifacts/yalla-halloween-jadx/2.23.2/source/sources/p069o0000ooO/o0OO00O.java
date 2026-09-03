package p069o0000ooO;

import android.os.Bundle;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.OooO0OO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO00O implements OooO0OO.OooO00o {
    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final OooO0OO OooO0OO(Bundle bundle) {
        AdPlaybackState.OooO00o[] oooO00oArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(AdPlaybackState.f6178OooOO0o);
        if (parcelableArrayList == null) {
            oooO00oArr = new AdPlaybackState.OooO00o[0];
        } else {
            AdPlaybackState.OooO00o[] oooO00oArr2 = new AdPlaybackState.OooO00o[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                oooO00oArr2[i] = (AdPlaybackState.OooO00o) AdPlaybackState.OooO00o.f6197OooOo00.OooO0OO((Bundle) parcelableArrayList.get(i));
            }
            oooO00oArr = oooO00oArr2;
        }
        return new AdPlaybackState(null, oooO00oArr, bundle.getLong(AdPlaybackState.f6180OooOOO0, 0L), bundle.getLong(AdPlaybackState.f6179OooOOO, -9223372036854775807L), bundle.getInt(AdPlaybackState.f6181OooOOOO, 0));
    }
}
