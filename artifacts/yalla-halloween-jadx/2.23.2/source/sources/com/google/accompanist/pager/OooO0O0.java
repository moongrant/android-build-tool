package com.google.accompanist.pager;

import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p230o00oOo0o.o000OOo;
import p230o00oOo0o.o0O0O00;
import p230o00oOo0o.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager$Pager$8$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,580:1\n67#2,6:581\n73#2:613\n77#2:618\n75#3:587\n76#3,11:589\n89#3:617\n76#4:588\n460#5,13:600\n473#5,3:614\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager$Pager$8$1$1\n*L\n469#1:581,6\n469#1:613\n469#1:618\n469#1:587\n469#1:589,11\n469#1:617\n469#1:588\n469#1:600,13\n469#1:614,3\n*E\n"})
public final class OooO0O0 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f13799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000OOo f13800OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function4<o0O0O00, Integer, Composer, Integer, Unit> f13801OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f13802OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0O0(o0Oo0oo o0oo0oo2, Function4<? super o0O0O00, ? super Integer, ? super Composer, ? super Integer, Unit> function4, o000OOo o000ooo2, int i) {
        super(4);
        this.f13799OooO0Oo = o0oo0oo2;
        this.f13801OooO0o0 = function4;
        this.f13800OooO0o = o000ooo2;
        this.f13802OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 14) == 0) {
            i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((i & 731) == 146 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-70560628, i, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:467)");
            }
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(androidx.compose.foundation.lazy.OooO00o.OooO0Oo(items, NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, this.f13799OooO0Oo, null, 2, null), 0.0f, 1, null), null, false, 3, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierWrapContentSize$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Updater.m1327setimpl(composerM1320constructorimpl, measurePolicyOooO00o, companion.getSetMeasurePolicy());
            Updater.m1327setimpl(composerM1320constructorimpl, density, companion.getSetDensity());
            Updater.m1327setimpl(composerM1320constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1327setimpl(composerM1320constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer2.enableReusing();
            OooOO0.OooO00o(0, function3MaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            this.f13801OooO0o0.invoke(this.f13800OooO0o, Integer.valueOf(iIntValue), composer2, Integer.valueOf((i & 112) | (this.f13802OooO0oO & 896)));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
