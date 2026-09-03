package p669oO0Oo;

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
import p147o00Oo0Oo.o000OOo;
import p577o0oOoOoO.oOO000o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$TaskItem$1$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,641:1\n154#2:642\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$TaskItem$1$1$3\n*L\n510#1:642\n*E\n"})
public final class o00O00O extends Lambda implements Function3<String, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO000o f60533OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(oOO000o ooo000o) {
        super(3);
        this.f60533OooO0Oo = ooo000o;
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
                ComposerKt.traceEventStart(1548897795, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.TaskItem.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskDialog.kt:503)");
            }
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_doubt, composer2, 0), (String) null, o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(14)), new o00O000o(this.f60533OooO0Oo)), false, false, 0L, false, null, null, null, o00O00.f60520OooO0Oo, 253), o000OOo.OooO0OO(composer2).f37712OooOO0o, composer2, 56, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
