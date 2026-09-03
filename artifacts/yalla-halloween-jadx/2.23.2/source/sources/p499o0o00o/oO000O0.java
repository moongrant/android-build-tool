package p499o0o00o;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$3$1\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,496:1\n91#2:497\n92#2,2:499\n1#3:498\n*E\n"})
public final class oO000O0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f50024OooO00o;

    public oO000O0(MutableState mutableState) {
        this.f50024OooO00o = mutableState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        MutableState mutableState = this.f50024OooO00o;
        TreasureBoxDialog treasureBoxDialog = (TreasureBoxDialog) mutableState.getValue();
        if (treasureBoxDialog != null && treasureBoxDialog.OooO0OO()) {
            treasureBoxDialog.OooO0O0();
        }
        mutableState.setValue(null);
    }
}
