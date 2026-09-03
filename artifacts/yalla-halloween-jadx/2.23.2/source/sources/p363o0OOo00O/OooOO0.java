package p363o0OOo00O;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import androidx.media3.ui.PlayerView;
import com.yalla.android.videoplayer.exoplayer.VideoPlayerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000OO.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt$VideoPlayerView$1$1\n*L\n1#1,496:1\n191#2,11:497\n*E\n"})
public final class OooOO0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f43023OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f43024OooO0O0;

    public OooOO0(MutableState mutableState, MutableState mutableState2) {
        this.f43023OooO00o = mutableState;
        this.f43024OooO0O0 = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        MutableState mutableState = this.f43023OooO00o;
        VideoPlayerView player = (VideoPlayerView) mutableState.getValue();
        if (player != null) {
            PlayerView playerView = player.playerView;
            if (playerView != null) {
                playerView.setPlayer(null);
            }
            ViewParent parent = player.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView((VideoPlayerView) mutableState.getValue());
            }
            OooOO0O<VideoPlayerView> oooOO0O = OooOOO0.f43053OooO00o;
            Intrinsics.checkNotNullParameter(player, "player");
            OooOOO0.f43053OooO00o.OooO00o(player);
            mutableState.setValue(null);
        }
        OooO player2 = (OooO) this.f43024OooO0O0.getValue();
        if (player2 != null) {
            player2.OooO0o(true);
            List<OooO> list = Oooo000.f43069OooO00o;
            Intrinsics.checkNotNullParameter(player2, "player");
            Oooo000.f43070OooO0O0.OooO00o(player2);
        }
    }
}
