package p495o0o00Ooo;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$1$1\n*L\n1#1,496:1\n41#2,3:497\n*E\n"})
public final class o0OO00OO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f48921OooO00o;

    public o0OO00OO(MutableState mutableState) {
        this.f48921OooO00o = mutableState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        MutableState mutableState = this.f48921OooO00o;
        RoomVoteDialog roomVoteDialog = (RoomVoteDialog) mutableState.getValue();
        if (roomVoteDialog != null) {
            roomVoteDialog.OooOO0();
        }
        mutableState.setValue(null);
    }
}
