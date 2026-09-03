package o0OOo000;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.yalla.android.videoplayer.exoplayer.VideoPlayerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt$VideoPlayerView$1$1\n*L\n1#1,496:1\n189#2,11:497\n*E\n"})
public final class OooO0o implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f43848OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f43849OooO0O0;

    public OooO0o(MutableState mutableState, MutableState mutableState2) {
        this.f43848OooO00o = mutableState;
        this.f43849OooO0O0 = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        MutableState mutableState = this.f43848OooO00o;
        VideoPlayerView player = (VideoPlayerView) mutableState.getValue();
        if (player != null) {
            StyledPlayerView styledPlayerView = player.playerView;
            if (styledPlayerView != null) {
                styledPlayerView.setPlayer(null);
            }
            ViewParent parent = player.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView((VideoPlayerView) mutableState.getValue());
            }
            o000OO.OooOO0O<VideoPlayerView> oooOO0O = OooOO0.f43850OooO00o;
            Intrinsics.checkNotNullParameter(player, "player");
            OooOO0.f43850OooO00o.OooO00o(player);
            mutableState.setValue(null);
        }
        OooO0OO player2 = (OooO0OO) this.f43849OooO0O0.getValue();
        if (player2 != null) {
            player2.OooO0o(true);
            List<OooO0OO> list = OooOOOO.f43866OooO00o;
            Intrinsics.checkNotNullParameter(player2, "player");
            OooOOOO.f43867OooO0O0.OooO00o(player2);
        }
    }
}
