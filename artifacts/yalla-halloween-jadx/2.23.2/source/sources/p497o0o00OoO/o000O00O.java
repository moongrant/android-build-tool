package p497o0o00OoO;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$MessageEditTextCompose$3\n*L\n1#1,496:1\n223#2,2:497\n*E\n"})
public final class o000O00O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000 f49803OooO00o;

    public o000O00O(o0000 o0000Var) {
        this.f49803OooO00o = o0000Var;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f49803OooO00o.OooO00o().setTextIsSelectable(false);
    }
}
