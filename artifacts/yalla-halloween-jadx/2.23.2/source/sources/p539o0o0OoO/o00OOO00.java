package p539o0o0OoO;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o000000;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomUserActionRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,318:1\n25#2:319\n1097#3,3:320\n1100#3,3:324\n154#4:323\n81#5:327\n107#5,2:328\n*S KotlinDebug\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$4\n*L\n114#1:319\n114#1:320,3\n114#1:324,3\n114#1:323\n114#1:327\n114#1:328,2\n*E\n"})
public final class o00OOO00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f54576OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f54577OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(o000000 o000000Var, CoroutineScope coroutineScope) {
        super(2);
        this.f54576OooO0Oo = o000000Var;
        this.f54577OooO0o0 = coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2062154871, iIntValue, -1, "com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreenContent.<anonymous>.<anonymous> (RoomUserActionRecordScreen.kt:113)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Object obj = null;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(50)), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            int i = 0;
            while (i < 3) {
                o000000 o000000Var = this.f54576OooO0Oo;
                TabKt.m1219TabEVJuX4I(o000000Var.OooO0oO() == i, new o00OO0OO(this.f54577OooO0o0, o000000Var, i), SizeKt.m513heightInVpY3zN4$default(BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, o0OOo000.f48134OooO00o, null, 2, null), ((Dp) mutableState.getValue()).m3789unboximpl(), 0.0f, 2, obj), false, null, 0L, 0L, ComposableLambdaKt.composableLambda(composer2, -336783148, true, new o00OO(mutableState, i, o000000Var)), composer2, 12582912, 120);
                i++;
                mutableState = mutableState;
                obj = obj;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
