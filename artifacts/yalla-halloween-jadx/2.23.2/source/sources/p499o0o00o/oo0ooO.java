package p499o0o00o;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;
import p650o0ooo.o0O0OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager$Content$2$1\n*L\n1#1,496:1\n50#2,3:497\n*E\n"})
public final class oo0ooO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f50099OooO00o;

    public oo0ooO(MutableState mutableState) {
        this.f50099OooO00o = mutableState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        MutableState mutableState = this.f50099OooO00o;
        o0O0OO0 o0o0oo0 = (o0O0OO0) mutableState.getValue();
        if (o0o0oo0 != null) {
            o0o0oo0.OooOO0().f43869OooO0Oo.OooO0Oo();
        }
        mutableState.setValue(null);
    }
}
