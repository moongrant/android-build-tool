package com.yalla.yalla.ui.screen.moment.media;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o000O00O;
import com.common.support.roomgiftplayer.download.VideoDownLoadManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function1<VideoDownLoadManager.DownLoadState, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29435OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(1);
        this.f29433OooO0Oo = mutableState;
        this.f29435OooO0o0 = mutableState2;
        this.f29434OooO0o = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VideoDownLoadManager.DownLoadState downLoadState) {
        VideoDownLoadManager.DownLoadState state = downLoadState;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = state instanceof VideoDownLoadManager.DownLoadState.Success;
        MutableState<Boolean> mutableState = this.f29435OooO0o0;
        VideoFeedScreen.MainContent$lambda$16(mutableState, z);
        VideoFeedScreen.MainContent$lambda$19(this.f29434OooO0o, true);
        if (z) {
            VideoFeedScreen.MainContent$lambda$16(mutableState, true);
        } else {
            this.f29433OooO0Oo.setValue(Boolean.FALSE);
            o000O00O.OooO00o(oO00OOo0.Network_request_failed);
        }
        return Unit.INSTANCE;
    }
}
