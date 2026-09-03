package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements FeatureManager.Callback, com.google.android.exoplayer2.OooO.OooO00o {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        AdPlaybackState.OooO00o[] oooO00oArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(AdPlaybackState.f13127OooOO0o);
        if (parcelableArrayList == null) {
            oooO00oArr = new AdPlaybackState.OooO00o[0];
        } else {
            AdPlaybackState.OooO00o[] oooO00oArr2 = new AdPlaybackState.OooO00o[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                oooO00oArr2[i] = (AdPlaybackState.OooO00o) AdPlaybackState.OooO00o.f13146OooOo00.OooO0O0((Bundle) parcelableArrayList.get(i));
            }
            oooO00oArr = oooO00oArr2;
        }
        return new AdPlaybackState(null, oooO00oArr, bundle.getLong(AdPlaybackState.f13129OooOOO0, 0L), bundle.getLong(AdPlaybackState.f13128OooOOO, -9223372036854775807L), bundle.getInt(AdPlaybackState.f13130OooOOOO, 0));
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m4065onSuccess$lambda1(z);
    }
}
