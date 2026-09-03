package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.FeatureManager;
import java.util.ArrayList;
import p226o00oOo00.o000O0;
import p226o00oOo00.o000O00O;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO implements FeatureManager.Callback, com.google.android.exoplayer2.OooO.OooO00o {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o000O0.f39865OooO0oo);
        return parcelableArrayList == null ? new o000O0(new o000O00O[0]) : new o000O0((o000O00O[]) oOO00O.OooO00o(o000O00O.f39872OooOO0O, parcelableArrayList).toArray(new o000O00O[0]));
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m4064onSuccess$lambda0(z);
    }
}
