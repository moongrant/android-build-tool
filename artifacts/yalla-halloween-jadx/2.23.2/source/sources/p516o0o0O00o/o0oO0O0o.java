package p516o0o0O00o;

import androidx.appcompat.widget.o0000O0O;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTipBubble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TipBubble.kt\ncom/yalla/yalla/ui/composable/common/TipBubble\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,99:1\n81#2:100\n107#2,2:101\n81#2:252\n107#2,2:253\n25#3:103\n25#3:110\n456#3,8:135\n464#3,3:149\n36#3:153\n456#3,8:180\n464#3,3:194\n456#3,8:217\n464#3,3:231\n467#3,3:235\n467#3,3:240\n467#3,3:247\n1097#4,6:104\n1097#4,6:111\n1097#4,6:154\n174#5:117\n154#5:160\n154#5:161\n154#5:162\n154#5:198\n154#5:199\n154#5:245\n154#5:246\n72#6,6:118\n78#6:152\n82#6:251\n78#7,11:124\n78#7,11:169\n78#7,11:206\n91#7:238\n91#7:243\n91#7:250\n4144#8,6:143\n4144#8,6:188\n4144#8,6:225\n73#9,6:163\n79#9:197\n83#9:244\n66#10,6:200\n72#10:234\n76#10:239\n*S KotlinDebug\n*F\n+ 1 TipBubble.kt\ncom/yalla/yalla/ui/composable/common/TipBubble\n*L\n38#1:100\n38#1:101,2\n48#1:252\n48#1:253,2\n48#1:103\n49#1:110\n56#1:135,8\n56#1:149,3\n60#1:153\n57#1:180,8\n57#1:194,3\n71#1:217,8\n71#1:231,3\n71#1:235,3\n57#1:240,3\n56#1:247,3\n48#1:104,6\n49#1:111,6\n60#1:154,6\n56#1:117\n64#1:160\n65#1:161\n67#1:162\n70#1:198\n73#1:199\n92#1:245\n95#1:246\n56#1:118,6\n56#1:152\n56#1:251\n56#1:124,11\n57#1:169,11\n71#1:206,11\n71#1:238\n57#1:243\n56#1:250\n56#1:143,6\n57#1:188,6\n71#1:225,6\n57#1:163,6\n57#1:197\n57#1:244\n71#1:200,6\n71#1:234\n71#1:239\n*E\n"})
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0oO0O0o f51678OooO00o = new o0oO0O0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableState f51679OooO0O0;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f51680OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oO0O0o o0oo0o0o2 = o0oO0O0o.f51678OooO00o;
            o0oO0O0o.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51682OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f51683OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, int i) {
            super(2);
            this.f51683OooO0o0 = f;
            this.f51682OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51682OooO0o | 1);
            o0oO0O0o.this.OooO00o(this.f51683OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.TipBubble$RoomHook$2", f = "TipBubble.kt", i = {}, l = {52, 53}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f51684OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f51685OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f51686OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f51686OooO0o0 = animatable;
            this.f51685OooO0o = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f51686OooO0o0, this.f51685OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0074 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0072 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0015
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            /*
                r19 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r1 = r19
                int r2 = r1.f51684OooO0Oo
                r3 = 6
                r4 = 0
                r5 = 500(0x1f4, float:7.0E-43)
                r6 = 60
                r7 = 1073741824(0x40000000, float:2.0)
                r8 = 2
                r9 = 1
                r10 = 0
                if (r2 == 0) goto L27
                if (r2 == r9) goto L22
                if (r2 != r8) goto L1a
                goto L27
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L22:
                kotlin.ResultKt.throwOnFailure(r20)
                r2 = r1
                goto L50
            L27:
                kotlin.ResultKt.throwOnFailure(r20)
                r2 = r1
            L2b:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r11 = r2.f51686OooO0o0
                float r12 = r2.f51685OooO0o
                int r12 = com.google.gson.internal.OooO.OooO0o0(r12)
                float r12 = (float) r12
                float r12 = r12 + r7
                float r13 = (float) r6
                float r12 = r12 - r13
                java.lang.Float r12 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12)
                androidx.compose.animation.core.TweenSpec r13 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r4, r10, r3, r10)
                r14 = 0
                r15 = 0
                r17 = 12
                r18 = 0
                r2.f51684OooO0Oo = r9
                r16 = r2
                java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r11, r12, r13, r14, r15, r16, r17, r18)
                if (r11 != r0) goto L50
                return r0
            L50:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r11 = r2.f51686OooO0o0
                float r12 = r2.f51685OooO0o
                int r12 = com.google.gson.internal.OooO.OooO0o0(r12)
                float r12 = (float) r12
                float r12 = r12 - r7
                float r13 = (float) r6
                float r12 = r12 - r13
                java.lang.Float r12 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12)
                androidx.compose.animation.core.TweenSpec r13 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r4, r10, r3, r10)
                r14 = 0
                r15 = 0
                r17 = 12
                r18 = 0
                r2.f51684OooO0Oo = r8
                r16 = r2
                java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r11, r12, r13, r14, r15, r16, r17, r18)
                if (r11 != r0) goto L2b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o0o0O00o.o0oO0O0o.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f51687OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Float> mutableState) {
            super(1);
            this.f51687OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            Float fValueOf = Float.valueOf(com.google.gson.internal.OooO.OooO0o0(LayoutCoordinatesKt.boundsInWindow(it).getWidth()));
            MutableState<Float> mutableState = this.f51687OooO0Oo;
            mutableState.setValue(fValueOf);
            o0000O00.OooO0O0("bubbleWidth = " + mutableState.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f51688OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51690OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f51691OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(float f, int i) {
            super(2);
            this.f51691OooO0o0 = f;
            this.f51690OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51690OooO0o | 1);
            o0oO0O0o.this.OooO00o(this.f51691OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    static {
        oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
        oo0ooo0oOooO0o0.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        f51679OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(oo0ooo0oOooO0o0.OooO0O0("roomHook" + o0O00oO0.OooOOo0().getValue(), false)), null, 2, null);
    }

    public static void OooO0O0() {
        f51679OooO0O0.setValue(Boolean.FALSE);
        oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
        oo0ooo0oOooO0o0.getClass();
        o0000O0O.OooO0O0("roomHook", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(float f, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(886869979);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886869979, i2, -1, "com.yalla.yalla.ui.composable.common.TipBubble.RoomHook (TipBubble.kt:45)");
            }
            if (!((Boolean) f51679OooO0O0.getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(f, i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = AnimatableKt.Animatable$default((com.google.gson.internal.OooO.OooO0o0(f) - 10.0f) - 58, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue2;
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO0O0(animatable, f, null), composerStartRestartGroup, 70);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM438offsetVpY3zN4 = OffsetKt.m438offsetVpY3zN4(companion2, Dp.m3775constructorimpl((360 - ((Number) mutableState.getValue()).floatValue()) - 10), Dp.m3775constructorimpl(((Number) animatable.getValue()).floatValue()));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion3, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM438offsetVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO0OO(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float f2 = 8;
            Modifier modifierM1359shadows4CzXII$default = ShadowKt.m1359shadows4CzXII$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) objRememberedValue3), Dp.m3775constructorimpl(2), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2)), false, 0L, 0L, 28, null);
            long j = o0OOo000.f48279o000oo00;
            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(o0O0O00.OooO0O0(BackgroundKt.m170backgroundbw27NRU(modifierM1359shadows4CzXII$default, j, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2))), false, false, 0L, false, null, null, null, OooO0o.f51688OooO0Oo, 253), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(6));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(o000000.tips_close_hook_window, composerStartRestartGroup, 0);
            long j2 = o0OOo000.f48135OooO0O0;
            TextKt.m1261Text4IGK_g(strStringResource, (Modifier) null, j2, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(ClipKt.clip(BackgroundKt.m170backgroundbw27NRU(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(36)), j2, RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, OooO.f51680OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.OK, composerStartRestartGroup, 0), BoxScopeInstance.INSTANCE.align(companion2, companion3.getCenter()), o0OOo000.f48276o000oOoo, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130544);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            BoxKt.Box(SizeKt.m527sizeVpY3zN4(columnScopeInstance.align(BackgroundKt.m170backgroundbw27NRU(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(42), 0.0f, 11, null), j, o0O0O0Oo.f51547OooO00o), companion3.getEnd()), Dp.m3775constructorimpl(15), Dp.m3775constructorimpl(f2)), composer2, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0(f, i));
    }
}
