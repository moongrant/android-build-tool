package com.facebook.appevents;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.facebook.internal.FeatureManager;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements FeatureManager.Callback, p150o00Oo0Oo.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOo f12725OooO0Oo = new OooOo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOo f12726OooO0o0 = new OooOo();

    @Override // p150o00Oo0Oo.OooOOOO
    public final void OooO0OO(Editable editable, int i, int i2) {
        PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
        editable.setSpan(new ForegroundColorSpan(-16721719), i, i2, 33);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m120onSuccess$lambda1(z);
    }
}
