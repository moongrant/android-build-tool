package com.facebook;

import android.net.Uri;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements FacebookSdk.GraphRequestCreator, p296o0O0OoO0.o00O0O, p150o00Oo0Oo.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f12689OooO0Oo = new OooOO0O();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f12691OooO0o0 = new OooOO0O();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f12690OooO0o = new OooOO0O();

    public final Extractor[] OooO00o() {
        return new Extractor[]{new Mp4Extractor()};
    }

    @Override // p296o0O0OoO0.o00O0O
    public final Extractor[] OooO0O0(Uri uri, Map map) {
        return OooO00o();
    }

    @Override // p150o00Oo0Oo.OooOOOO
    public final void OooO0OO(Editable editable, int i, int i2) {
        int i3 = MomentsMessagesEditView.f24998OoooO0O;
        editable.setSpan(new ForegroundColorSpan(-16721719), i, i2, 33);
    }

    @Override // com.facebook.FacebookSdk.GraphRequestCreator
    public final GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return FacebookSdk.m92graphRequestCreator$lambda0(accessToken, str, jSONObject, callback);
    }
}
