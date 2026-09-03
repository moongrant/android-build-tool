package com.facebook.appevents;

import android.util.JsonReader;
import com.facebook.internal.FeatureManager;
import p364o0OOOooO.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements FeatureManager.Callback, o000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ Oooo0 f12729OooO0Oo = new Oooo0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ Oooo0 f12731OooO0o0 = new Oooo0();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ Oooo0 f12730OooO0o = new Oooo0();

    @Override // o0OOOooO.o000O0.OooO00o
    public final Object OooO00o(JsonReader jsonReader) {
        return o000O0.OooO00o(jsonReader);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m119onSuccess$lambda0(z);
    }
}
