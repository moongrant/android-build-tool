package com.yalla.yalla.ui.activity.message;

import com.code.android.videoplayer.PlayState;
import com.code.android.videoplayer.view.VideoView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.z4;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo implements p152o00OoO.OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ z4 f25968OooO00o;

    public o0o0Oo(z4 z4Var) {
        this.f25968OooO00o = z4Var;
    }

    @Override // p152o00OoO.OooOO0O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == PlayState.Playing) {
            VideoView videoView = this.f25968OooO00o.f59452OooOOO;
            Intrinsics.checkNotNullExpressionValue(videoView, "binding.videoView");
            com.code.android.util.o000OO00.OooOOOO(videoView);
        }
    }
}
