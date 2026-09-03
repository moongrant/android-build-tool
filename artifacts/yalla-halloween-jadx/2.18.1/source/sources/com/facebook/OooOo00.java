package com.facebook;

import android.net.Uri;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import java.util.Map;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements FeatureManager.Callback, p296o0O0OoO0.o00O0O, p150o00Oo0Oo.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOo00 f12700OooO0Oo = new OooOo00();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOo00 f12701OooO0o0 = new OooOo00();

    public final Extractor[] OooO00o() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    @Override // p296o0O0OoO0.o00O0O
    public final Extractor[] OooO0O0(Uri uri, Map map) {
        return OooO00o();
    }

    @Override // p150o00Oo0Oo.OooOOOO
    public final void OooO0OO(Editable editable, int i, int i2) {
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        editable.setSpan(new ForegroundColorSpan(o000O0O0.OooO00o(R.color.color_00d8c9)), i, i2, 33);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookSdk.m95sdkInitialize$lambda4(z);
    }
}
