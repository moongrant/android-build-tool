package p507o0o00ooo;

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
import com.android.billingclient.api.o000O000;
import com.google.firebase.messaging.o0OO00O;
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
import p018OooOoo0.OooOOO;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTipBubble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TipBubble.kt\ncom/yalla/yalla/ui/composable/common/TipBubble\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,99:1\n81#2:100\n107#2,2:101\n81#2:252\n107#2,2:253\n25#3:103\n25#3:110\n456#3,8:135\n464#3,3:149\n36#3:153\n456#3,8:180\n464#3,3:194\n456#3,8:217\n464#3,3:231\n467#3,3:235\n467#3,3:240\n467#3,3:247\n1097#4,6:104\n1097#4,6:111\n1097#4,6:154\n174#5:117\n154#5:160\n154#5:161\n154#5:162\n154#5:198\n154#5:199\n154#5:245\n154#5:246\n72#6,6:118\n78#6:152\n82#6:251\n78#7,11:124\n78#7,11:169\n78#7,11:206\n91#7:238\n91#7:243\n91#7:250\n4144#8,6:143\n4144#8,6:188\n4144#8,6:225\n73#9,6:163\n79#9:197\n83#9:244\n66#10,6:200\n72#10:234\n76#10:239\n*S KotlinDebug\n*F\n+ 1 TipBubble.kt\ncom/yalla/yalla/ui/composable/common/TipBubble\n*L\n38#1:100\n38#1:101,2\n48#1:252\n48#1:253,2\n48#1:103\n49#1:110\n56#1:135,8\n56#1:149,3\n60#1:153\n57#1:180,8\n57#1:194,3\n71#1:217,8\n71#1:231,3\n71#1:235,3\n57#1:240,3\n56#1:247,3\n48#1:104,6\n49#1:111,6\n60#1:154,6\n56#1:117\n64#1:160\n65#1:161\n67#1:162\n70#1:198\n73#1:199\n92#1:245\n95#1:246\n56#1:118,6\n56#1:152\n56#1:251\n56#1:124,11\n57#1:169,11\n71#1:206,11\n71#1:238\n57#1:243\n56#1:250\n56#1:143,6\n57#1:188,6\n71#1:225,6\n57#1:163,6\n57#1:197\n57#1:244\n71#1:200,6\n71#1:234\n71#1:239\n*E\n"})
public final class s1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final s1 f50206OooO00o = new s1();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableState f50207OooO0O0;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f50208OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            s1 s1Var = s1.f50206OooO00o;
            s1.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50210OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f50211OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, int i) {
            super(2);
            this.f50211OooO0o0 = f;
            this.f50210OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50210OooO0o | 1);
            s1.this.OooO00o(this.f50211OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.TipBubble$RoomHook$2", f = "TipBubble.kt", i = {}, l = {52, 53}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f50212OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f50213OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f50214OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f50214OooO0o0 = animatable;
            this.f50213OooO0o = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f50214OooO0o0, this.f50213OooO0o, continuation);
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
                int r2 = r1.f50212OooO0Oo
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
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r11 = r2.f50214OooO0o0
                float r12 = r2.f50213OooO0o
                int r12 = com.android.billingclient.api.o000O000.OooO0O0(r12)
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
                r2.f50212OooO0Oo = r9
                r16 = r2
                java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r11, r12, r13, r14, r15, r16, r17, r18)
                if (r11 != r0) goto L50
                return r0
            L50:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r11 = r2.f50214OooO0o0
                float r12 = r2.f50213OooO0o
                int r12 = com.android.billingclient.api.o000O000.OooO0O0(r12)
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
                r2.f50212OooO0Oo = r8
                r16 = r2
                java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r11, r12, r13, r14, r15, r16, r17, r18)
                if (r11 != r0) goto L2b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o0o00ooo.s1.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f50215OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Float> mutableState) {
            super(1);
            this.f50215OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            Float fValueOf = Float.valueOf(o000O000.OooO0O0(LayoutCoordinatesKt.boundsInWindow(it).getWidth()));
            MutableState<Float> mutableState = this.f50215OooO0Oo;
            mutableState.setValue(fValueOf);
            OooOOO0.OooO0O0("bubbleWidth = " + mutableState.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f50216OooO0Oo = new OooO0o();

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
        public final /* synthetic */ int f50218OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f50219OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(float f, int i) {
            super(2);
            this.f50219OooO0o0 = f;
            this.f50218OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50218OooO0o | 1);
            s1.this.OooO00o(this.f50219OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    static {
        o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
        o0o0o00OooO0o0.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        f50207OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(o0o0o00OooO0o0.OooO0O0("roomHook" + o000000O.OooOOo0().getValue(), false)), null, 2, null);
    }

    public static void OooO0O0() {
        f50207OooO0O0.setValue(Boolean.FALSE);
        o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
        o0o0o00OooO0o0.getClass();
        o0OO00O.OooO00o("roomHook", o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
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
                ComposerKt.traceEventStart(886869979, i, -1, "com.yalla.yalla.ui.composable.common.TipBubble.RoomHook (TipBubble.kt:45)");
            }
            if (!((Boolean) f50207OooO0O0.getValue()).booleanValue()) {
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
                objRememberedValue2 = AnimatableKt.Animatable$default((o000O000.OooO0O0(f) - 10.0f) - 58, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue2;
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO0O0(animatable, f, null), composerStartRestartGroup, 70);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM436offsetVpY3zN4 = OffsetKt.m436offsetVpY3zN4(companion2, Dp.m3765constructorimpl((360 - ((Number) mutableState.getValue()).floatValue()) - 10), Dp.m3765constructorimpl(((Number) animatable.getValue()).floatValue()));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion3, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM436offsetVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
            Modifier modifierM1348shadows4CzXII$default = ShadowKt.m1348shadows4CzXII$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) objRememberedValue3), Dp.m3765constructorimpl(2), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2)), false, 0L, 0L, 28, null);
            long j = o0oO0O0o.f47084o000o0oO;
            Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m168backgroundbw27NRU(modifierM1348shadows4CzXII$default, j, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), false, false, 0L, false, null, null, null, OooO0o.f50216OooO0Oo, 253), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(6));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM477paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.tips_close_hook_window, composerStartRestartGroup, 0);
            long j2 = o0oO0O0o.f46946OooO0O0;
            TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, j2, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(ClipKt.clip(BackgroundKt.m168backgroundbw27NRU(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(36)), j2, RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, OooO.f50208OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.OK, composerStartRestartGroup, 0), BoxScopeInstance.INSTANCE.align(companion2, companion3.getCenter()), o0oO0O0o.f47082o000o0o, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130544);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            BoxKt.Box(SizeKt.m525sizeVpY3zN4(columnScopeInstance.align(BackgroundKt.m168backgroundbw27NRU(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3765constructorimpl(42), 0.0f, 11, null), j, u1.f50293OooO00o), companion3.getEnd()), Dp.m3765constructorimpl(15), Dp.m3765constructorimpl(f2)), composer2, 0);
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
