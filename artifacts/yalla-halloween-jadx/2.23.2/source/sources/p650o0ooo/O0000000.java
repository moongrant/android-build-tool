package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p207o00o0oO0.o000O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMoveRoomDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoveRoomDialogUtil.kt\ncom/yalla/yalla/ui/dialog/MoveRoomDialogUtil$showMoveRoomDialog$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,175:1\n25#2:176\n1097#3,6:177\n*S KotlinDebug\n*F\n+ 1 MoveRoomDialogUtil.kt\ncom/yalla/yalla/ui/dialog/MoveRoomDialogUtil$showMoveRoomDialog$1\n*L\n48#1:176\n48#1:177,6\n*E\n"})
public final class O0000000 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f58133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Integer f58134OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(RoomUserInfoModel roomUserInfoModel, Integer num) {
        super(3);
        this.f58133OooO0Oo = roomUserInfoModel;
        this.f58134OooO0o0 = num;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-354292179, iIntValue, -1, "com.yalla.yalla.ui.dialog.MoveRoomDialogUtil.showMoveRoomDialog.<anonymous> (MoveRoomDialogUtil.kt:47)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue;
            RoomUserInfoModel roomUserInfoModel = this.f58133OooO0Oo;
            o000O0Oo.OooO0Oo(it, null, null, ComposableLambdaKt.composableLambda(composer2, 210724184, true, new oOo0o00(roomUserInfoModel, this.f58134OooO0o0, mutableState2)), false, false, null, null, null, false, null, false, new oo000000(mutableState2, roomUserInfoModel), null, false, false, null, oo00.f59041OooO0Oo, null, null, composer2, (iIntValue & 14) | 3072, 12582912, 913398);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
