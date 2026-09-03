package p497o0o00OoO;

import androidx.compose.runtime.DisposableEffectResult;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManager$Content$1$5\n*L\n1#1,496:1\n107#2,2:497\n*E\n"})
public final class o00 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1 f49679OooO00o;

    public o00(o00O0000 o00o0001) {
        this.f49679OooO00o = o00o0001;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        LiveEventBus.get("Room_Show_Gift_Dialog").removeObserver(new o00O0.OooO00o(this.f49679OooO00o));
    }
}
