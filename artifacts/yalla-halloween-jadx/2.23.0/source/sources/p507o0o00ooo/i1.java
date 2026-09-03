package p507o0o00ooo;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScrollableTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$tabIndicatorOffset$2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,326:1\n81#2:327\n81#2:328\n*S KotlinDebug\n*F\n+ 1 ScrollableTabRow.kt\ncom/yalla/yalla/ui/composable/common/ScrollableTabRowKt$tabIndicatorOffset$2\n*L\n216#1:327\n220#1:328\n*E\n"})
public final class i1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p1 f49914OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(p1 p1Var) {
        super(3);
        this.f49914OooO0Oo = p1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-1623425172);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1623425172, iIntValue, -1, "com.yalla.yalla.ui.composable.common.tabIndicatorOffset.<anonymous> (ScrollableTabRow.kt:214)");
        }
        p1 p1Var = this.f49914OooO0Oo;
        State<Dp> stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(p1Var.f50174OooO0O0, AnimationSpecKt.tween$default(SQLiteDatabase.MAX_SQL_CACHE_SIZE, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer2, 0, 12);
        Modifier modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(OffsetKt.m437offsetVpY3zN4$default(SizeKt.wrapContentSize$default(composed, Alignment.INSTANCE.getCenter(), false, 2, null), AnimateAsStateKt.m70animateDpAsStateAjpBEmI(p1Var.f50173OooO00o, AnimationSpecKt.tween$default(SQLiteDatabase.MAX_SQL_CACHE_SIZE, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer2, 0, 12).getValue().m3779unboximpl(), 0.0f, 2, null), stateM70animateDpAsStateAjpBEmI.getValue().m3779unboximpl());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierM528width3ABfNKs;
    }
}
