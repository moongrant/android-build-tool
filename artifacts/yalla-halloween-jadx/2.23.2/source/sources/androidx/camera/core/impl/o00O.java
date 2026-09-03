package androidx.camera.core.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.AdPlaybackState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O implements androidx.media3.common.OooO0OO.OooO00o {
    public static int OooO00o(int i, ArrayList arrayList, int i2, int i3) {
        arrayList.add(Integer.valueOf(i));
        return i2 + i3;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        long j = bundle.getLong(AdPlaybackState.OooO00o.f6189OooOO0o);
        int i = bundle.getInt(AdPlaybackState.OooO00o.f6191OooOOO0);
        int i2 = bundle.getInt(AdPlaybackState.OooO00o.f6196OooOOoo);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(AdPlaybackState.OooO00o.f6190OooOOO);
        int[] intArray = bundle.getIntArray(AdPlaybackState.OooO00o.f6192OooOOOO);
        long[] longArray = bundle.getLongArray(AdPlaybackState.OooO00o.f6193OooOOOo);
        long j2 = bundle.getLong(AdPlaybackState.OooO00o.f6195OooOOo0);
        boolean z = bundle.getBoolean(AdPlaybackState.OooO00o.f6194OooOOo);
        if (intArray == null) {
            intArray = new int[0];
        }
        return new AdPlaybackState.OooO00o(j, i, i2, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
    }
}
