package p497o0o00OoO;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$bottomButtonBackground$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,585:1\n154#2:586\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$bottomButtonBackground$1\n*L\n474#1:586\n*E\n"})
public final class o000OO00 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f49808OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f49809OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(float f, float f2) {
        super(3);
        this.f49808OooO0Oo = f;
        this.f49809OooO0o0 = f2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(2076483431);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2076483431, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.bottomButtonBackground.<anonymous> (RoomBottomMessageInputComp.kt:470)");
        }
        Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(composed, this.f49808OooO0Oo, 0.0f, this.f49809OooO0o0, 0.0f, 10, null), Dp.m3775constructorimpl(27));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierM525size3ABfNKs;
    }
}
