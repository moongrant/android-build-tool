package com.yalla.yalla.module.media.preview;

import androidx.compose.runtime.MutableState;
import p460o0Ooo0o.oo0o0O0;
import p550o0oOOO0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements VideoTimelinePlayView.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f24145OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f24146OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ VideoTimelinePlayView f24147OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f24148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f24149OooO0o0;

    public OooO00o(MutableState<Boolean> mutableState, o00O00OO o00o00oo2, VideoTimelinePlayView videoTimelinePlayView, MutableState<Float> mutableState2, MutableState<Long> mutableState3) {
        this.f24145OooO00o = mutableState;
        this.f24146OooO0O0 = o00o00oo2;
        this.f24147OooO0OO = videoTimelinePlayView;
        this.f24148OooO0Oo = mutableState2;
        this.f24149OooO0o0 = mutableState3;
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO00o() {
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0O0() {
        float f = OooO0O0.f24150OooO00o;
        oo0o0O0.OooO00o("_RangeChooseView", "didStartDragging");
        p363o0OOo00O.OooO oooOOooO0o0 = this.f24146OooO0O0.OooO0o0();
        if (oooOOooO0o0 != null) {
            oooOOooO0o0.pause();
        }
        this.f24147OooO0OO.setShowProgress(false);
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0OO(boolean z) {
        if (z) {
            return;
        }
        float f = OooO0O0.f24150OooO00o;
        MutableState<Boolean> mutableState = this.f24145OooO00o;
        if (!mutableState.getValue().booleanValue()) {
            o0oo0000.OooO00o.OooO0O0("106102");
        }
        mutableState.setValue(Boolean.TRUE);
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0Oo(boolean z) {
        if (z) {
            return;
        }
        float f = OooO0O0.f24150OooO00o;
        MutableState<Boolean> mutableState = this.f24145OooO00o;
        if (!mutableState.getValue().booleanValue()) {
            o0oo0000.OooO00o.OooO0O0("106101");
        }
        mutableState.setValue(Boolean.TRUE);
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0o0() {
        float f = OooO0O0.f24150OooO00o;
        this.f24145OooO00o.setValue(Boolean.FALSE);
        VideoTimelinePlayView videoTimelinePlayView = this.f24147OooO0OO;
        MutableState<Float> mutableState = this.f24148OooO0Oo;
        MutableState<Long> mutableState2 = this.f24149OooO0o0;
        o00O00OO o00o00oo2 = this.f24146OooO0O0;
        OooO0O0.OooO00o.OooO00o(mutableState, mutableState2, o00o00oo2, videoTimelinePlayView);
        o00o00oo2.OooOO0();
    }
}
