package com.yalla.yalla.ui.activity.message;

import com.yalla.android.videoplayer.PlayState;
import com.yalla.android.videoplayer.view.VideoView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.oO0OO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O implements p204o00o0o0O.o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0OO00o f25459OooO00o;

    public o00OOO0O(oO0OO00o oo0oo00o) {
        this.f25459OooO00o = oo0oo00o;
    }

    @Override // p204o00o0o0O.o0000O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            VideoView videoView = this.f25459OooO00o.f44914OooOOO;
            Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
            com.code.android.util.o000O.OooOOOO(videoView);
        }
    }
}
