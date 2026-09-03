package com.facebook.appevents;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements FeatureManager.Callback, com.google.android.exoplayer2.OooO.OooO00o {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        long j = bundle.getLong(AdPlaybackState.OooO00o.f13138OooOO0o);
        int i = bundle.getInt(AdPlaybackState.OooO00o.f13140OooOOO0);
        int i2 = bundle.getInt(AdPlaybackState.OooO00o.f13145OooOOoo);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(AdPlaybackState.OooO00o.f13139OooOOO);
        int[] intArray = bundle.getIntArray(AdPlaybackState.OooO00o.f13141OooOOOO);
        long[] longArray = bundle.getLongArray(AdPlaybackState.OooO00o.f13142OooOOOo);
        long j2 = bundle.getLong(AdPlaybackState.OooO00o.f13144OooOOo0);
        boolean z = bundle.getBoolean(AdPlaybackState.OooO00o.f13143OooOOo);
        if (intArray == null) {
            intArray = new int[0];
        }
        return new AdPlaybackState.OooO00o(j, i, i2, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m4066onSuccess$lambda2(z);
    }
}
