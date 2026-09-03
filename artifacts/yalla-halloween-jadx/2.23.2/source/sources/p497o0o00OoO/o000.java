package p497o0o00OoO;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomDefaultComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomDefaultComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomDefaultCompKt$bottomButtonBackground$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,575:1\n154#2:576\n154#2:577\n*S KotlinDebug\n*F\n+ 1 RoomBottomDefaultComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomDefaultCompKt$bottomButtonBackground$1\n*L\n554#1:576\n555#1:577\n*E\n"})
public final class o000 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f49680OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(boolean z) {
        super(3);
        this.f49680OooO0Oo = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(1467939585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1467939585, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.bottomButtonBackground.<anonymous> (RoomBottomDefaultComp.kt:550)");
        }
        Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(SizeKt.m525size3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(composed, RoundedCornerShapeKt.getCircleShape()), this.f49680OooO0Oo ? o0OOo000.f48152OooOo : o0OOo000.f48134OooO00o, null, 2, null), Dp.m3775constructorimpl(35)), Dp.m3775constructorimpl(7));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierM478padding3ABfNKs;
    }
}
