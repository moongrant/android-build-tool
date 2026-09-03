package p495o0o00Ooo;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;
import p519o0o0O0oO.o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomFruitGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomFruitGameManager$Content$2$1\n*L\n1#1,496:1\n41#2,3:497\n*E\n"})
public final class o0O000O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f48793OooO00o;

    public o0O000O(MutableState mutableState) {
        this.f48793OooO00o = mutableState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        MutableState mutableState = this.f48793OooO00o;
        o oVar = (o) mutableState.getValue();
        if (oVar != null) {
            oVar.OooOO0().f58873OooO0Oo.OooO0Oo();
        }
        mutableState.setValue(null);
    }
}
