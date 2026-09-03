package com.yalla.yalla.module.event.ui.screen;

import android.content.Context;
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
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p022Oooo00O.o0O00oO0;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventRoomPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$Content$3$1$2$1$1$4$1$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,372:1\n72#2,6:373\n78#2:407\n82#2:416\n78#3,11:379\n91#3:415\n456#4,8:390\n464#4,3:404\n467#4,3:412\n4144#5,6:398\n154#6:408\n154#6:409\n154#6:410\n154#6:411\n*S KotlinDebug\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$Content$3$1$2$1$1$4$1$2$1\n*L\n187#1:373,6\n187#1:407\n187#1:416\n187#1:379,11\n187#1:415\n187#1:390,8\n187#1:404,3\n187#1:412,3\n187#1:398,6\n196#1:408\n200#1:409\n204#1:410\n220#1:411\n*E\n"})
public final class o0OO00O extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<EventModel> f23497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f23498OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f23499OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(p107o000ooO0.OooOOOO<EventModel> oooOOOO, Context context, EventViewModel eventViewModel) {
        super(4);
        this.f23497OooO0Oo = oooOOOO;
        this.f23499OooO0o0 = context;
        this.f23498OooO0o = eventViewModel;
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
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1919259628, iIntValue2, -1, "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventRoomPreviewScreen.kt:185)");
            }
            EventModel eventModelOooO00o = this.f23497OooO0Oo.OooO00o(iIntValue);
            if (eventModelOooO00o != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0OOo000.f48135OooO0O0, null, 2, null), false, false, 0L, false, null, null, null, new o00oO0o(eventModelOooO00o), 253);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                p454o0Ooo000.OooOOOO oooOOOO = p454o0Ooo000.OooOOOO.f47605OooO00o;
                int i = EventModel.$stable;
                oooOOOO.OooO00o(eventModelOooO00o, 0L, composer2, i | 384, 2);
                float f = 12;
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), composer2, 6);
                EventKt.OooO00o(eventModelOooO00o, composer2, i);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(9)), composer2, 6);
                EventKt.OooO0O0(eventModelOooO00o, composer2, i);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), composer2, 6);
                EventKt.OooO0o0(eventModelOooO00o, o0ooOOo.f23509OooO0Oo, new o0Oo0oo(this.f23499OooO0o0, this.f23498OooO0o), composer2, i | 48, 0);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(20)), composer2, 6);
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
