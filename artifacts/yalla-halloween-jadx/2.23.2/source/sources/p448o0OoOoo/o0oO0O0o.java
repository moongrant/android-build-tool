package p448o0OoOoo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p022Oooo00O.o0O00oO0;
import p107o000ooO0.OooOOOO;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomEventInfoPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventInfoPage.kt\ncom/yalla/yalla/module/event/ui/page/RoomEventInfoPage$SetPage$2$5$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,390:1\n72#2,6:391\n78#2:425\n82#2:434\n78#3,11:397\n91#3:433\n456#4,8:408\n464#4,3:422\n467#4,3:430\n4144#5,6:416\n154#6:426\n154#6:427\n154#6:428\n154#6:429\n*S KotlinDebug\n*F\n+ 1 RoomEventInfoPage.kt\ncom/yalla/yalla/module/event/ui/page/RoomEventInfoPage$SetPage$2$5$1$1\n*L\n139#1:391,6\n139#1:425\n139#1:434\n139#1:397,11\n139#1:433\n139#1:408,8\n139#1:422,3\n139#1:430,3\n139#1:416,6\n155#1:426\n157#1:427\n159#1:428\n161#1:429\n*E\n"})
public final class o0oO0O0o extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<EventModel> f47493OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(OooOOOO<EventModel> oooOOOO) {
        super(4);
        this.f47493OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        int i = iIntValue2;
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(614775155, i, -1, "com.yalla.yalla.module.event.ui.page.RoomEventInfoPage.SetPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RoomEventInfoPage.kt:137)");
            }
            EventModel eventModelOooO00o = this.f47493OooO0Oo.OooO00o(iIntValue);
            if (eventModelOooO00o != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0OOo000.f48135OooO0O0, null, 2, null), false, false, 0L, false, null, null, null, new o0O0O0O(eventModelOooO00o, iIntValue), 253);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                p454o0Ooo000.OooOOOO oooOOOO = p454o0Ooo000.OooOOOO.f47605OooO00o;
                int i2 = EventModel.$stable;
                int i3 = i2 | 384;
                oooOOOO.OooO00o(eventModelOooO00o, 0L, composer2, i3, 2);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(10)), composer2, 6);
                EventKt.OooO00o(eventModelOooO00o, composer2, i2);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(9)), composer2, 6);
                EventKt.OooO0O0(eventModelOooO00o, composer2, i2);
                androidx.compose.ui.semantics.OooO0O0.OooO0O0(12, companion, composer2, 6);
                o0oO0Ooo.OooO0o0(o0oO0Ooo.f47494OooO00o, eventModelOooO00o, iIntValue, composer2, (i & 112) | i3);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(15)), composer2, 6);
                EventKt.OooO0Oo(composer2, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
