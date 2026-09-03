package com.code.android.uikit.swiprefresh;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import p194o00o0OO.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f13235OooO00o = ComposableLambdaKt.composableLambdaInstance(1741596362, false, C0196OooO00o.f13237OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f13236OooO0O0 = ComposableLambdaKt.composableLambdaInstance(614234507, false, OooO0O0.f13238OooO0Oo);

    /* JADX INFO: renamed from: com.code.android.uikit.swiprefresh.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0196OooO00o extends Lambda implements Function5<BoxScope, RefreshState.State, Dp, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C0196OooO00o f13237OooO0Oo = new C0196OooO00o();

        public C0196OooO00o() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(BoxScope boxScope, RefreshState.State state, Dp dp, Composer composer, Integer num) {
            int i;
            BoxScope EasyRefresh = boxScope;
            RefreshState.State _state = state;
            float fM3789unboximpl = dp.m3789unboximpl();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(EasyRefresh, "$this$EasyRefresh");
            Intrinsics.checkNotNullParameter(_state, "_state");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(EasyRefresh) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i |= composer2.changed(_state) ? 32 : 16;
            }
            if ((iIntValue & 896) == 0) {
                i |= composer2.changed(fM3789unboximpl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 5851) == 1170 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1741596362, i, -1, "com.code.android.uikit.swiprefresh.ComposableSingletons$SwipeRefreshKt.lambda-1.<anonymous> (SwipeRefresh.kt:36)");
                }
                OooO0o.OooO00o(EasyRefresh, _state, fM3789unboximpl, composer2, (i & 14) | (i & 112) | (i & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nSwipeRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/ComposableSingletons$SwipeRefreshKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,63:1\n154#2:64\n154#2:100\n66#3,6:65\n72#3:99\n76#3:105\n78#4,11:71\n91#4:104\n456#5,8:82\n464#5,3:96\n467#5,3:101\n4144#6,6:90\n*S KotlinDebug\n*F\n+ 1 SwipeRefresh.kt\ncom/code/android/uikit/swiprefresh/ComposableSingletons$SwipeRefreshKt$lambda-2$1\n*L\n53#1:64\n56#1:100\n53#1:65,6\n53#1:99\n53#1:105\n53#1:71,11\n53#1:104\n53#1:82,8\n53#1:96,3\n53#1:101,3\n53#1:90,6\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f13238OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(614234507, iIntValue, -1, "com.code.android.uikit.swiprefresh.ComposableSingletons$SwipeRefreshKt.lambda-2.<anonymous> (SwipeRefresh.kt:52)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM514requiredHeight3ABfNKs = SizeKt.m514requiredHeight3ABfNKs(companion, Dp.m3775constructorimpl(60));
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM514requiredHeight3ABfNKs);
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
                Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                o00O0000.f38681OooO00o.OooO0O0(BoxScopeInstance.INSTANCE.align(SizeKt.m527sizeVpY3zN4(companion, Dp.m3775constructorimpl(75), Dp.m3775constructorimpl(45)), companion2.getCenter()), composer2, 48);
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
}
