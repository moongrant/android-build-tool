package p519o0o0O0OO;

import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0OoO.o00OO00O;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O00OO;
import p429o0OoOO.OooOo00;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.z0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendAnimIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendAnimIcon.kt\ncom/yalla/yalla/ui/composable/moment/MomentSendAnimIcon\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,186:1\n66#2,6:187\n72#2:221\n76#2:268\n78#3,11:193\n78#3,11:229\n91#3:262\n91#3:267\n456#4,8:204\n464#4,3:218\n456#4,8:240\n464#4,3:254\n467#4,3:259\n467#4,3:264\n25#4:269\n36#4:276\n36#4:283\n50#4:290\n49#4:291\n36#4:300\n36#4:307\n36#4:314\n4144#5,6:212\n4144#5,6:248\n154#6:222\n154#6:258\n154#6:298\n154#6:299\n72#7,6:223\n78#7:257\n82#7:263\n1097#8,6:270\n1097#8,6:277\n1097#8,6:284\n1097#8,6:292\n1097#8,6:301\n1097#8,6:308\n1097#8,6:315\n81#9:321\n81#9:322\n107#9,2:323\n81#9:325\n*S KotlinDebug\n*F\n+ 1 MomentSendAnimIcon.kt\ncom/yalla/yalla/ui/composable/moment/MomentSendAnimIcon\n*L\n53#1:187,6\n53#1:221\n53#1:268\n53#1:193,11\n57#1:229,11\n57#1:262\n53#1:267\n53#1:204,8\n53#1:218,3\n57#1:240,8\n57#1:254,3\n57#1:259,3\n53#1:264,3\n71#1:269\n74#1:276\n107#1:283\n109#1:290\n109#1:291\n130#1:300\n139#1:307\n149#1:314\n53#1:212,6\n57#1:248,6\n59#1:222\n62#1:258\n122#1:298\n125#1:299\n57#1:223,6\n57#1:257\n57#1:263\n71#1:270,6\n74#1:277,6\n107#1:284,6\n109#1:292,6\n130#1:301,6\n139#1:308,6\n149#1:315,6\n51#1:321\n71#1:322\n71#1:323,2\n103#1:325\n*E\n"})
public final class o0O0o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0o000 f52369OooO00o = new o0O0o000();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52370OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52372OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52373OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52374OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52375OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52376OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, int i, Function0<Unit> function0, Function0<Unit> function1, int i2, int i3) {
            super(2);
            this.f52373OooO0o0 = str;
            this.f52372OooO0o = i;
            this.f52374OooO0oO = function0;
            this.f52375OooO0oo = function1;
            this.f52370OooO = i2;
            this.f52376OooOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0o000.this.OooO0OO(this.f52373OooO0o0, this.f52372OooO0o, this.f52374OooO0oO, this.f52375OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52370OooO | 1), this.f52376OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f52378OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f52379OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52380OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52381OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Modifier modifier, Function1<? super Integer, Unit> function1, int i, int i2) {
            super(2);
            this.f52379OooO0o0 = modifier;
            this.f52378OooO0o = function1;
            this.f52380OooO0oO = i;
            this.f52381OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0o000.this.OooO00o(this.f52379OooO0o0, this.f52378OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52380OooO0oO | 1), this.f52381OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f52383OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f52384OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52385OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52386OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Modifier modifier, Function1<? super Integer, Unit> function1, int i, int i2) {
            super(2);
            this.f52384OooO0o0 = modifier;
            this.f52383OooO0o = function1;
            this.f52385OooO0oO = i;
            this.f52386OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0o000.this.OooO00o(this.f52384OooO0o0, this.f52383OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52385OooO0oO | 1), this.f52386OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52387OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0) {
            super(0);
            this.f52387OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f52387OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52388OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(1);
            this.f52388OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = this.f52388OooO0Oo;
            it.OooO0Oo(i);
            o000OO.OooO0o0(it, i);
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52389OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Function0<Unit> function0) {
            super(0);
            this.f52389OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f52389OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:71:0x0178  */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Modifier modifier, @Nullable Function1<? super Integer, Unit> function1, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super Integer, Unit> function2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function1<? super Integer, Unit> function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-689520001);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                function2 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    function2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-689520001, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.Content (MomentSendAnimIcon.kt:49)");
                }
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (!((Boolean) LiveDataAdapterKt.observeAsState(o0O00oO0.OooOo0O(), Boolean.FALSE, composerStartRestartGroup, 56).getValue()).booleanValue()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier3, function2, i, i2));
                    return;
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierThen = companion.then(modifier3);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(74)), companion2.getBottomEnd());
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(12), null, composerStartRestartGroup, 6, 2);
                f52369OooO00o.OooO0O0(((i3 >> 3) & 14) | 48, 0, composerStartRestartGroup, function2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            function3 = function2;
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(modifier3, function3, i, i2));
        }
        i3 |= 48;
        function2 = function1;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                function2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-689520001, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.Content (MomentSendAnimIcon.kt:49)");
            }
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            if (!((Boolean) LiveDataAdapterKt.observeAsState(o0O00oO0.OooOo0O(), Boolean.FALSE, composerStartRestartGroup, 56).getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier3, function2, i, i2));
                return;
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierThen2 = companion4.then(modifier3);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion5, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierAlign2 = BoxScopeInstance.INSTANCE.align(SizeKt.m530width3ABfNKs(companion4, Dp.m3775constructorimpl(74)), companion5.getBottomEnd());
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O1 = p022Oooo00O.o0O00oO0.OooO0O0(companion5, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap4);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(12), null, composerStartRestartGroup, 6, 2);
            f52369OooO00o.OooO0O0(((i3 >> 3) & 14) | 48, 0, composerStartRestartGroup, function2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                function2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-689520001, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.Content (MomentSendAnimIcon.kt:49)");
            }
            o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
            if (!((Boolean) LiveDataAdapterKt.observeAsState(o0O00oO0.OooOo0O(), Boolean.FALSE, composerStartRestartGroup, 56).getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier3, function2, i, i2));
                return;
            }
            Modifier.Companion companion7 = Modifier.INSTANCE;
            Modifier modifierThen3 = companion7.then(modifier3);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion8 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o3 = Oooo000.OooO00o(companion8, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            constructor = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierThen3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyOooO00o3, composerM1320constructorimpl, currentCompositionLocalMap5);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierAlign3 = BoxScopeInstance.INSTANCE.align(SizeKt.m530width3ABfNKs(companion7, Dp.m3775constructorimpl(74)), companion8.getBottomEnd());
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O2 = p022Oooo00O.o0O00oO0.OooO0O0(companion8, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierAlign3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl2, measurePolicyOooO0O2, composerM1320constructorimpl2, currentCompositionLocalMap6);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(12), null, composerStartRestartGroup, 6, 2);
            f52369OooO00o.OooO0O0(((i3 >> 3) & 14) | 48, 0, composerStartRestartGroup, function2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        function3 = function2;
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(modifier3, function3, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(int i, int i2, Composer composer, Function1 function1) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1773901266);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                function1 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1773901266, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.CreateIcon (MomentSendAnimIcon.kt:69)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new o0O0o00O(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(io2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 72);
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(OooOo00.f46776OooO00o, 0, composerStartRestartGroup, 56);
            String str = ((Boolean) mutableState.getValue()).booleanValue() ? "svga/anim_moment_create.svga" : "";
            z0 z0Var = z0.f57313OooO00o;
            Integer num = (Integer) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(num, "CreateIcon$lambda$7(...)");
            int iOooO0Oo = z0.OooO0Oo(num.intValue());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new o0O0o0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0<Unit> function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new o0oOo0O0(function1, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0OO(str, iOooO0Oo, function0, (Function0) objRememberedValue4, composerStartRestartGroup, (i3 << 9) & 57344, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0oo00(this, function1, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0205  */
    /* JADX WARN: Code duplicated, block: B:106:0x0212  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0185  */
    /* JADX WARN: Code duplicated, block: B:89:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(String str, int i, Function0<Unit> function0, Function0<Unit> function1, Composer composer, int i2, int i3) {
        String str2;
        int i4;
        Function0<Unit> function2;
        int i5;
        Function0<Unit> function3;
        int i6;
        int i7;
        String str3;
        Function0<Unit> function4;
        Function0<Unit> function5;
        Modifier.Companion companion;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifierOooO0O0;
        Function0<Unit> function6;
        Function0<Unit> function7;
        boolean zChanged2;
        Object objRememberedValue2;
        Function0<Unit> function8;
        Function0<Unit> function9;
        boolean zChanged3;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(212612748);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else if ((i2 & 14) == 0) {
            str2 = str;
            i4 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 896) == 0) {
                function2 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    function3 = function1;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                if ((46811 & i4) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (i9 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i5 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(212612748, i4, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.ItemView (MomentSendAnimIcon.kt:120)");
                    }
                    float fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    long jM1716getTransparent0d7_KjU = Color.INSTANCE.m1716getTransparent0d7_KjU();
                    companion = Modifier.INSTANCE;
                    Modifier modifierBorder = BorderKt.border(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(74)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3775constructorimpl, new SolidColor(jM1716getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function5);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new OooOO0(function5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    if (o00O00OO.OooO0oO(str3)) {
                        composerStartRestartGroup.startReplaceableGroup(-1259569113);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged3 = composerStartRestartGroup.changed(function4);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new OooO0OO(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function6 = function5;
                        function7 = function4;
                        o00OO00O.OooO00o(str3, true, 3, null, (Function0) objRememberedValue3, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 432, 8);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        function6 = function5;
                        function7 = function4;
                        if (o00O00OO.OooO0o0(str3)) {
                            composerStartRestartGroup.startReplaceableGroup(-1259568747);
                            Integer numValueOf = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(numValueOf);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new OooO0o(i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(o000OO.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1259568254);
                            if (i > 0) {
                                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function6;
                    function9 = function7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    str3 = str2;
                    function9 = function2;
                    function8 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(str3, i, function9, function8, i2, i3));
            }
            i4 |= 3072;
            function3 = function1;
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((46811 & i4) == 9362) {
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i5 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(212612748, i4, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.ItemView (MomentSendAnimIcon.kt:120)");
                }
                float fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                long jM1716getTransparent0d7_KjU2 = Color.INSTANCE.m1716getTransparent0d7_KjU();
                companion = Modifier.INSTANCE;
                Modifier modifierBorder2 = BorderKt.border(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(74)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3775constructorimpl2, new SolidColor(jM1716getTransparent0d7_KjU2, null), null), RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                if (o00O00OO.OooO0oO(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(-1259569113);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    function7 = function4;
                    o00OO00O.OooO00o(str3, true, 3, null, (Function0) objRememberedValue3, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 432, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    function6 = function5;
                    function7 = function4;
                    if (o00O00OO.OooO0o0(str3)) {
                        composerStartRestartGroup.startReplaceableGroup(-1259568747);
                        Integer numValueOf2 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(o000OO.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1259568254);
                        if (i > 0) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function6;
                function9 = function7;
            } else {
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i5 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(212612748, i4, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.ItemView (MomentSendAnimIcon.kt:120)");
                }
                float fM3775constructorimpl3 = Dp.m3775constructorimpl(0);
                long jM1716getTransparent0d7_KjU3 = Color.INSTANCE.m1716getTransparent0d7_KjU();
                companion = Modifier.INSTANCE;
                Modifier modifierBorder3 = BorderKt.border(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(74)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3775constructorimpl3, new SolidColor(jM1716getTransparent0d7_KjU3, null), null), RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                if (o00O00OO.OooO0oO(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(-1259569113);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    function7 = function4;
                    o00OO00O.OooO00o(str3, true, 3, null, (Function0) objRememberedValue3, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 432, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    function6 = function5;
                    function7 = function4;
                    if (o00O00OO.OooO0o0(str3)) {
                        composerStartRestartGroup.startReplaceableGroup(-1259568747);
                        Integer numValueOf3 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(o000OO.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1259568254);
                        if (i > 0) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function6;
                function9 = function7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(str3, i, function9, function8, i2, i3));
        }
        i4 |= 384;
        function2 = function0;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                function3 = function1;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((46811 & i4) == 9362) {
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i5 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(212612748, i4, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.ItemView (MomentSendAnimIcon.kt:120)");
                }
                float fM3775constructorimpl4 = Dp.m3775constructorimpl(0);
                long jM1716getTransparent0d7_KjU4 = Color.INSTANCE.m1716getTransparent0d7_KjU();
                companion = Modifier.INSTANCE;
                Modifier modifierBorder4 = BorderKt.border(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(74)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3775constructorimpl4, new SolidColor(jM1716getTransparent0d7_KjU4, null), null), RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder4, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                if (o00O00OO.OooO0oO(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(-1259569113);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    function7 = function4;
                    o00OO00O.OooO00o(str3, true, 3, null, (Function0) objRememberedValue3, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 432, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    function6 = function5;
                    function7 = function4;
                    if (o00O00OO.OooO0o0(str3)) {
                        composerStartRestartGroup.startReplaceableGroup(-1259568747);
                        Integer numValueOf4 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(o000OO.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1259568254);
                        if (i > 0) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function6;
                function9 = function7;
            } else {
                if (i8 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i5 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(212612748, i4, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.ItemView (MomentSendAnimIcon.kt:120)");
                }
                float fM3775constructorimpl5 = Dp.m3775constructorimpl(0);
                long jM1716getTransparent0d7_KjU5 = Color.INSTANCE.m1716getTransparent0d7_KjU();
                companion = Modifier.INSTANCE;
                Modifier modifierBorder5 = BorderKt.border(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(74)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3775constructorimpl5, new SolidColor(jM1716getTransparent0d7_KjU5, null), null), RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(function5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                if (o00O00OO.OooO0oO(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(-1259569113);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO0OO(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function6 = function5;
                    function7 = function4;
                    o00OO00O.OooO00o(str3, true, 3, null, (Function0) objRememberedValue3, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 432, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    function6 = function5;
                    function7 = function4;
                    if (o00O00OO.OooO0o0(str3)) {
                        composerStartRestartGroup.startReplaceableGroup(-1259568747);
                        Integer numValueOf5 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf5);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0o(i);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(o000OO.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1259568254);
                        if (i > 0) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function6;
                function9 = function7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(str3, i, function9, function8, i2, i3));
        }
        i4 |= 3072;
        function3 = function1;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((46811 & i4) == 9362) {
            if (i8 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (i9 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i5 != 0) {
                function5 = null;
            } else {
                function5 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(212612748, i4, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.ItemView (MomentSendAnimIcon.kt:120)");
            }
            float fM3775constructorimpl6 = Dp.m3775constructorimpl(0);
            long jM1716getTransparent0d7_KjU6 = Color.INSTANCE.m1716getTransparent0d7_KjU();
            companion = Modifier.INSTANCE;
            Modifier modifierBorder6 = BorderKt.border(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(74)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3775constructorimpl6, new SolidColor(jM1716getTransparent0d7_KjU6, null), null), RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function5);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(function5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(function5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder6, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            if (o00O00OO.OooO0oO(str3)) {
                composerStartRestartGroup.startReplaceableGroup(-1259569113);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged3 = composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = new OooO0OO(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO0OO(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function6 = function5;
                function7 = function4;
                o00OO00O.OooO00o(str3, true, 3, null, (Function0) objRememberedValue3, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 432, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                function6 = function5;
                function7 = function4;
                if (o00O00OO.OooO0o0(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(-1259568747);
                    Integer numValueOf6 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf6);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0o(i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0o(i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(o000OO.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1259568254);
                    if (i > 0) {
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function6;
            function9 = function7;
        } else {
            if (i8 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (i9 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i5 != 0) {
                function5 = null;
            } else {
                function5 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(212612748, i4, -1, "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon.ItemView (MomentSendAnimIcon.kt:120)");
            }
            float fM3775constructorimpl7 = Dp.m3775constructorimpl(0);
            long jM1716getTransparent0d7_KjU7 = Color.INSTANCE.m1716getTransparent0d7_KjU();
            companion = Modifier.INSTANCE;
            Modifier modifierBorder7 = BorderKt.border(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(74)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3775constructorimpl7, new SolidColor(jM1716getTransparent0d7_KjU7, null), null), RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function5);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(function5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(function5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder7, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            if (o00O00OO.OooO0oO(str3)) {
                composerStartRestartGroup.startReplaceableGroup(-1259569113);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged3 = composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = new OooO0OO(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO0OO(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function6 = function5;
                function7 = function4;
                o00OO00O.OooO00o(str3, true, 3, null, (Function0) objRememberedValue3, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 432, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                function6 = function5;
                function7 = function4;
                if (o00O00OO.OooO0o0(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(-1259568747);
                    Integer numValueOf7 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf7);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0o(i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0o(i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(o000OO.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1259568254);
                    if (i > 0) {
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function6;
            function9 = function7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(str3, i, function9, function8, i2, i3));
    }
}
