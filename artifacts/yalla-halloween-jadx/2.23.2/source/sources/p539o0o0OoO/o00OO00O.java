package p539o0o0OoO;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;
import p230o00oOo0o.o000000;
import p230o00oOo0o.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomUserActionRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,318:1\n154#2:319\n154#2:320\n*S KotlinDebug\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$3\n*L\n104#1:319\n107#1:320\n*E\n"})
public final class o00OO00O extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f54568OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(o000000 o000000Var) {
        super(3);
        this.f54568OooO0Oo = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
        List<? extends TabPosition> it = list;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-614806921, iIntValue, -1, "com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreenContent.<anonymous>.<anonymous> (RoomUserActionRecordScreen.kt:101)");
        }
        TabRowDefaults.INSTANCE.m1226Indicator9IZ8Weo(ClipKt.clip(SizeKt.m522requiredWidth3ABfNKs(o0000O00.OooO00o(Modifier.INSTANCE, this.f54568OooO0Oo, it), Dp.m3775constructorimpl(43)), RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3775constructorimpl(3), o0000oo.OooO0OO(composer2).f38617OooO00o, composer2, (TabRowDefaults.$stable << 9) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
