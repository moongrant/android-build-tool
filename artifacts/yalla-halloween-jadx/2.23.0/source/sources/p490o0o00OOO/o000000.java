package p490o0o00OOO;

import androidx.compose.runtime.DisposableEffectResult;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomGiftIconManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomGiftIconManager$Content$1$5\n*L\n1#1,496:1\n106#2,2:497\n*E\n"})
public final class o000000 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1 f48566OooO00o;

    public o000000(o000000O o000000o2) {
        this.f48566OooO00o = o000000o2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        LiveEventBus.get("Room_Show_Gift_Dialog").removeObserver(new o0000O0O.OooO00o(this.f48566OooO00o));
    }
}
