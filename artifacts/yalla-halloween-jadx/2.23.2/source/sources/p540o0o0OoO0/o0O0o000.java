package p540o0o0OoO0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;
import p562o0oOo000.o0Oo0oo;
import p581o0oOoo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$TaskItem$1$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,641:1\n154#2:642\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$TaskItem$1$1$3\n*L\n510#1:642\n*E\n"})
public final class o0O0o000 extends Lambda implements Function3<String, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f54805OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(o0000O0 o0000o1) {
        super(3);
        this.f54805OooO0Oo = o0000o1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, Composer composer, Integer num) {
        String it = str;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548897795, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.TaskItem.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskDialog.kt:504)");
            }
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_doubt, composer2, 0), (String) null, o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(14)), new o0O0OOOo(this.f54805OooO0Oo)), false, false, 0L, false, null, null, null, oo0OOoo.f55046OooO0Oo, 253), o0000oo.OooO0OO(composer2).f38627OooOO0o, composer2, 56, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
