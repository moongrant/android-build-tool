package p495o0o00Ooo;

import android.app.Activity;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooOOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.room.RoomActivityModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p150o00Oo0oO.o00000OO;
import p417o0OoO0.o00Oo0;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomActivityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt$ActivityBanner$1$pagerStateAndPageMapper$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,226:1\n76#2:227\n72#3,6:228\n78#3:262\n82#3:310\n78#4,11:234\n78#4,11:272\n91#4:304\n91#4:309\n456#5,8:245\n464#5,3:259\n456#5,8:283\n464#5,3:297\n467#5,3:301\n467#5,3:306\n4144#6,6:253\n4144#6,6:291\n154#7:263\n154#7:264\n65#8,7:265\n72#8:300\n76#8:305\n*S KotlinDebug\n*F\n+ 1 RoomActivityManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomActivityManagerKt$ActivityBanner$1$pagerStateAndPageMapper$1\n*L\n87#1:227\n91#1:228,6\n91#1:262\n91#1:310\n91#1:234,11\n108#1:272,11\n108#1:304\n91#1:309\n91#1:245,8\n91#1:259,3\n108#1:283,8\n108#1:297,3\n108#1:301,3\n91#1:306,3\n91#1:253,6\n108#1:291,6\n102#1:263\n106#1:264\n108#1:265,7\n108#1:300\n108#1:305\n*E\n"})
public final class o00OOO00 extends Lambda implements Function3<Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RoomActivityModel.RoomActivitys> f48766OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(List<RoomActivityModel.RoomActivitys> list) {
        super(3);
        this.f48766OooO0Oo = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Composer composer, Integer num2) {
        int i;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i = (composer2.changed(iIntValue) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2147470895, iIntValue2, -1, "com.yalla.yalla.ui.activity.room.live.side.ActivityBanner.<anonymous>.<anonymous> (RoomActivityManager.kt:85)");
            }
            Object objConsume = composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            if (objConsume instanceof Activity) {
            }
            RoomActivityModel.RoomActivitys roomActivitys = this.f48766OooO0Oo.get(iIntValue);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, false, 0L, false, null, null, null, new o00OO(roomActivitys), 253);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(o00Oo0.OooO0Oo(roomActivitys.imageurl, null, composer2, 0, 1), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(40)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(4), null, composer2, 6, 2);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(10);
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            int iM3719getEllipsisgIe3tQ8 = companion4.m3719getEllipsisgIe3tQ8();
            long j = o0oO0O0o.f46945OooO00o;
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            TextKt.m1251Text4IGK_g(" \n", (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion5.m3671getCentere0LSkKk()), 0L, iM3719getEllipsisgIe3tQ8, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 3120, 120306);
            String title = roomActivitys.title;
            long sp2 = TextUnitKt.getSp(10);
            int iM3719getEllipsisgIe3tQ9 = companion4.m3719getEllipsisgIe3tQ8();
            long j2 = o0oO0O0o.f46958OooOOOO;
            int iM3671getCentere0LSkKk = companion5.m3671getCentere0LSkKk();
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextKt.m1251Text4IGK_g(title, (Modifier) null, j2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, iM3719getEllipsisgIe3tQ9, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120306);
            if (o00000OO.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
