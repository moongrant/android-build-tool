package com.yalla.yalla.module.media.preview;

import androidx.compose.runtime.MutableState;
import p455o0Ooo0O0.oo0o0Oo;
import p468o0OoooO0.o0OO0O0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements VideoTimelinePlayView.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f24607OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f24608OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ VideoTimelinePlayView f24609OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f24610OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f24611OooO0o0;

    public OooO00o(MutableState<Boolean> mutableState, oo0o0Oo oo0o0oo, VideoTimelinePlayView videoTimelinePlayView, MutableState<Float> mutableState2, MutableState<Long> mutableState3) {
        this.f24607OooO00o = mutableState;
        this.f24608OooO0O0 = oo0o0oo;
        this.f24609OooO0OO = videoTimelinePlayView;
        this.f24610OooO0Oo = mutableState2;
        this.f24611OooO0o0 = mutableState3;
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO00o() {
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0O0() {
        float f = OooO0O0.f24612OooO00o;
        o0OO0O0.OooO00o("_RangeChooseView", "didStartDragging");
        o0OOo000.OooO0OO oooO0OOOooO0o0 = this.f24608OooO0O0.OooO0o0();
        if (oooO0OOOooO0o0 != null) {
            oooO0OOOooO0o0.pause();
        }
        this.f24609OooO0OO.setShowProgress(false);
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0OO(boolean z) {
        if (z) {
            return;
        }
        float f = OooO0O0.f24612OooO00o;
        MutableState<Boolean> mutableState = this.f24607OooO00o;
        if (!mutableState.getValue().booleanValue()) {
            o0OO000.OooO00o("106102");
        }
        mutableState.setValue(Boolean.TRUE);
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0Oo(boolean z) {
        if (z) {
            return;
        }
        float f = OooO0O0.f24612OooO00o;
        MutableState<Boolean> mutableState = this.f24607OooO00o;
        if (!mutableState.getValue().booleanValue()) {
            o0OO000.OooO00o("106101");
        }
        mutableState.setValue(Boolean.TRUE);
    }

    @Override // com.yalla.yalla.module.media.preview.VideoTimelinePlayView.OooO0OO
    public final void OooO0o0() {
        float f = OooO0O0.f24612OooO00o;
        this.f24607OooO00o.setValue(Boolean.FALSE);
        VideoTimelinePlayView videoTimelinePlayView = this.f24609OooO0OO;
        MutableState<Float> mutableState = this.f24610OooO0Oo;
        MutableState<Long> mutableState2 = this.f24611OooO0o0;
        oo0o0Oo oo0o0oo = this.f24608OooO0O0;
        OooO0O0.OooO00o.OooO00o(mutableState, mutableState2, oo0o0oo, videoTimelinePlayView);
        oo0o0oo.OooOO0();
    }
}
