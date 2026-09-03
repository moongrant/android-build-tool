package p510o0o0O00;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.OooOOOO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.layout.o00oO0o;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o0O0O00;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.OooOo;
import p018OooOoo0.OooOOO;
import p149o00Oo0o0.o00000O;
import p367o0OOo0o0.OooOo00;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,301:1\n486#2,4:302\n490#2,2:310\n494#2:316\n25#3:306\n25#3:318\n36#3:325\n456#3,8:351\n464#3,3:365\n467#3,3:369\n456#3,8:391\n464#3,3:405\n36#3:409\n467#3,3:416\n36#3:424\n1097#4,3:307\n1100#4,3:313\n1097#4,6:319\n1097#4,3:326\n1100#4,3:331\n1097#4,6:410\n1097#4,6:425\n486#5:312\n154#6:317\n154#6:421\n154#6:422\n154#6:423\n154#6:431\n58#7:329\n75#7:330\n66#8,6:334\n72#8:368\n76#8:373\n66#8,6:374\n72#8:408\n76#8:420\n78#9,11:340\n91#9:372\n78#9,11:380\n91#9:419\n4144#10,6:359\n4144#10,6:399\n81#11:432\n107#11,2:433\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt\n*L\n69#1:302,4\n69#1:310,2\n69#1:316\n69#1:306\n80#1:318\n143#1:325\n144#1:351,8\n144#1:365,3\n144#1:369,3\n253#1:391,8\n253#1:405,3\n257#1:409\n253#1:416,3\n294#1:424\n69#1:307,3\n69#1:313,3\n80#1:319,6\n143#1:326,3\n143#1:331,3\n257#1:410,6\n294#1:425,6\n69#1:312\n72#1:317\n289#1:421\n290#1:422\n291#1:423\n297#1:431\n143#1:329\n143#1:330\n144#1:334,6\n144#1:368\n144#1:373\n253#1:374,6\n253#1:408\n253#1:420\n144#1:340,11\n144#1:372\n253#1:380,11\n253#1:419\n144#1:359,6\n253#1:399,6\n80#1:432\n80#1:433,2\n*E\n"})
public final class o00000OO {

    @SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$5$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,301:1\n66#2,6:302\n72#2:336\n76#2:353\n78#3,11:308\n91#3:352\n456#4,8:319\n464#4,3:333\n50#4:337\n49#4:338\n467#4,3:349\n4144#5,6:327\n1097#6,6:339\n154#7:345\n164#7:346\n154#7:347\n154#7:348\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$5$1\n*L\n152#1:302,6\n152#1:336\n152#1:353\n152#1:308,11\n152#1:352\n152#1:319,8\n152#1:333,3\n158#1:337\n158#1:338\n152#1:349,3\n152#1:327,6\n158#1:339,6\n172#1:345\n186#1:346\n189#1:347\n196#1:348\n*E\n"})
    public static final class OooO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51386OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f51387OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51388OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f51389OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51390OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51391OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51392OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51393OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(o0O0O00 o0o0o00, float f, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, int i, Function1<? super String, Unit> function3, Function0<Unit> function0, CoroutineScope coroutineScope) {
            super(3);
            this.f51387OooO0Oo = o0o0o00;
            this.f51389OooO0o0 = f;
            this.f51388OooO0o = function1;
            this.f51390OooO0oO = function2;
            this.f51391OooO0oo = i;
            this.f51386OooO = function3;
            this.f51392OooOO0 = function0;
            this.f51393OooOO0O = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            Object obj;
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1999275283, iIntValue, -1, "com.yalla.yalla.ui.composable.face_panel.FacePanel.<anonymous>.<anonymous> (FacePanel.kt:150)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM437offsetVpY3zN4$default = OffsetKt.m437offsetVpY3zN4$default(SizeKt.m512requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), this.f51387OooO0Oo.OooO0o0()), 0.0f, this.f51389OooO0o0, 1, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM437offsetVpY3zN4$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(511388516);
            Function1<String, Unit> function1 = this.f51388OooO0o;
            boolean zChanged = composer2.changed(function1) | composer2.changed(this.f51390OooO0oO);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new o0000O(-1));
                if (function1 != null) {
                    arrayList.add(new o0000O(-2));
                }
                composer2.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue;
            composer2.endReplaceableGroup();
            List list = (List) obj;
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new o000OO(list), composer2, 0, 3);
            float f = 42;
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 7, null);
            Function1<String, Unit> function2 = this.f51386OooO;
            int i = this.f51391OooO0oo;
            PagerKt.m685HorizontalPagerxYaah8o(pagerStateRememberPagerState, modifierM480paddingqDBjuR0$default, null, null, 0, 0.0f, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composer2, 519604330, true, new o0000(function2, i)), composer2, 48, 384, 4092);
            AnimatedVisibilityKt.AnimatedVisibility(pagerStateRememberPagerState.getCurrentPage() == 0, boxScopeInstance.align(companion, companion2.getBottomEnd()), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, -1660632203, true, new o0000O00(boxScopeInstance, this.f51392OooOO0, i)), composer2, 196608, 28);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl((float) 0.5d), BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomEnd()), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 7, null), 0.0f, 1, null), o0oO0O0o.f47088o000oo, null, 2, null), composer2, 6, 0);
            LazyDslKt.LazyRow(boxScopeInstance.align(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f)), companion2.getBottomEnd()), null, null, false, null, null, null, false, new o0000O0O(list, pagerStateRememberPagerState, this.f51393OooOO0O), composer2, 0, 254);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$1", f = "FacePanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,301:1\n154#2:302\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$1\n*L\n75#1:302\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f51394OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f51395OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, o0O0O00 o0o0o00, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f51394OooO0Oo = f;
            this.f51395OooO0o0 = o0o0o00;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f51394OooO0Oo, this.f51395OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            float fM3765constructorimpl = Dp.m3765constructorimpl(0);
            float f = this.f51394OooO0Oo;
            if (Dp.m3764compareTo0680j_4(f, fM3765constructorimpl) > 0) {
                o0O0O00 o0o0o00 = this.f51395OooO0o0;
                if (!Dp.m3770equalsimpl0(o0o0o00.OooO0o0(), f)) {
                    o0o0o00.f51436OooO0o0.setValue(Dp.m3763boximpl(f));
                    OooOo00 oooOo00 = OooOo00.f43977OooO00o;
                    Context context = o000O0.OooO00o();
                    int iOooO00o = o0000O0.OooO00o(f);
                    oooOo00.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    SharedPreferences sharedPreferencesOooO0O0 = OooOo00.OooO0O0(context);
                    Intrinsics.checkNotNull(sharedPreferencesOooO0O0);
                    sharedPreferencesOooO0O0.edit().putInt(OooOo00.f43979OooO0OO, iOooO00o).apply();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$2", f = "FacePanel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFacePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,301:1\n154#2:302\n154#2:303\n154#2:304\n*S KotlinDebug\n*F\n+ 1 FacePanel.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelKt$FacePanel$2\n*L\n86#1:302\n89#1:303\n114#1:304\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f51396OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f51397OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f51398OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51399OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f, o0O0O00 o0o0o00, MutableState<Boolean> mutableState, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f51398OooO0o0 = f;
            this.f51397OooO0o = o0o0o00;
            this.f51399OooO0oO = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f51398OooO0o0, this.f51397OooO0o, this.f51399OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51396OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float f = this.f51398OooO0o0;
                OooOOO0.OooO0OO("AAQQA", "imeTargetHeight = " + Dp.m3776toStringimpl(f));
                Boolean bool = Boolean.FALSE;
                MutableState<Boolean> mutableState = this.f51399OooO0oO;
                mutableState.setValue(bool);
                float f2 = 0;
                int iM3764compareTo0680j_4 = Dp.m3764compareTo0680j_4(f, Dp.m3765constructorimpl(f2));
                o0O0O00 o0o0o00 = this.f51397OooO0o;
                if (iM3764compareTo0680j_4 > 0) {
                    o0o0o00.f51438OooO0oo.setValue(bool);
                    if (Dp.m3770equalsimpl0(o0o0o00.OooO0O0(), Dp.m3765constructorimpl(f2))) {
                        o0o0o00.OooO0oo(true);
                        o0o0o00.f51433OooO0OO.invoke(Boxing.boxBoolean(true));
                    } else if (Dp.m3770equalsimpl0(f, o0o0o00.OooO0O0())) {
                        o0o0o00.OooO0oo(false);
                    } else if (Dp.m3764compareTo0680j_4(f, o0o0o00.OooO0O0()) < 0) {
                        o0o0o00.OooO0oo(false);
                        float fOooO0o0 = o0o0o00.OooO0o0();
                        this.f51396OooO0Oo = 1;
                        if (o0o0o00.OooO00o(fOooO0o0, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (Dp.m3764compareTo0680j_4(f, o0o0o00.OooO0O0()) > 0) {
                        mutableState.setValue(Boolean.TRUE);
                    }
                } else if (o0o0o00.OooO0OO()) {
                    o0o0o00.OooO0oo(false);
                } else if (Dp.m3764compareTo0680j_4(o0o0o00.OooO0O0(), Dp.m3765constructorimpl(f2)) > 0) {
                    o0o0o00.OooO0oo(true);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.face_panel.FacePanelKt$FacePanel$3", f = "FacePanel.kt", i = {}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f51400OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51401OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f51402OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0O0O00 o0o0o00, MutableState<Boolean> mutableState, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f51402OooO0o0 = o0o0o00;
            this.f51401OooO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f51402OooO0o0, this.f51401OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51400OooO0Oo;
            o0O0O00 o0o0o00 = this.f51402OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean zOooO0o = o0o0o00.OooO0o();
                MutableState mutableState = o0o0o00.f51434OooO0Oo;
                if (zOooO0o && this.f51401OooO0o.getValue().booleanValue() && Dp.m3764compareTo0680j_4(o0o0o00.OooO0Oo(), o0o0o00.OooO0O0()) >= 0 && !((Boolean) mutableState.getValue()).booleanValue()) {
                    o0o0o00.OooO0oo(true);
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    float fOooO0Oo = o0o0o00.OooO0Oo();
                    this.f51400OooO0Oo = 1;
                    Object objSnapTo = o0o0o00.f51432OooO0O0.snapTo(Boxing.boxFloat(fOooO0Oo), this);
                    if (objSnapTo != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objSnapTo = Unit.INSTANCE;
                    }
                    if (objSnapTo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (o0o0o00.OooO0Oo() == 0.0f) {
                o0o0o00.f51433OooO0OO.invoke(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f51403OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51404OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0O0O00 o0o0o00, CoroutineScope coroutineScope) {
            super(0);
            this.f51403OooO0Oo = o0o0o00;
            this.f51404OooO0o0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O0O00 o0o0o00 = this.f51403OooO0Oo;
            if (o0o0o00.OooO0OO()) {
                BuildersKt__Builders_commonKt.launch$default(this.f51404OooO0o0, null, null, new o0000Ooo(o0o0o00, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Modifier f51405OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f51406OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51407OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51408OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51409OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51410OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f51411OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f51412OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(o0O0O00 o0o0o00, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super String, Unit> function2, Function1<? super String, Unit> function3, Modifier modifier, int i, int i2) {
            super(2);
            this.f51406OooO0Oo = o0o0o00;
            this.f51408OooO0o0 = function1;
            this.f51407OooO0o = function0;
            this.f51409OooO0oO = function2;
            this.f51410OooO0oo = function3;
            this.f51405OooO = modifier;
            this.f51411OooOO0 = i;
            this.f51412OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00000OO.OooO00o(this.f51406OooO0Oo, this.f51408OooO0o0, this.f51407OooO0o, this.f51409OooO0oO, this.f51410OooO0oo, this.f51405OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51411OooOO0 | 1), this.f51412OooOO0O);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o0O0O00 controller, @NotNull Function1<? super String, Unit> onEmojiFaceClick, @NotNull Function0<Unit> onDeleteClick, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super String, Unit> function2, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        Continuation continuation;
        int i3;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onEmojiFaceClick, "onEmojiFaceClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1272711119);
        Function1<? super String, Unit> function3 = (i2 & 8) != 0 ? null : function1;
        Function1<? super String, Unit> function4 = (i2 & 16) != 0 ? null : function2;
        Modifier modifier2 = (i2 & 32) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1272711119, i, -1, "com.yalla.yalla.ui.composable.face_panel.FacePanel (FacePanel.kt:60)");
        }
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        Composer.Companion companion = Composer.INSTANCE;
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        WindowInsets.Companion companion2 = WindowInsets.INSTANCE;
        if (o00oO0o.OooO00o(companion2, "<this>", composerStartRestartGroup, 1872863614)) {
            ComposerKt.traceEventStart(1872863614, 8, -1, "com.code.android.theme.util.<get-imeTargetHeight> (SystemUiUtil.kt:73)");
        }
        float f = 0;
        float fM3779unboximpl = ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m3763boximpl(Dp.m3765constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getImeAnimationTarget(companion2, composerStartRestartGroup, 8), composerStartRestartGroup, 0).getBottom() - o00000O.OooO00o(companion2, composerStartRestartGroup))), Dp.m3763boximpl(Dp.m3765constructorimpl(f)))).m3779unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        controller.f51437OooO0oO.setValue(Boolean.valueOf(Dp.m3764compareTo0680j_4(fM3779unboximpl, Dp.m3765constructorimpl(f)) > 0));
        EffectsKt.LaunchedEffect(Dp.m3763boximpl(fM3779unboximpl), new OooO00o(fM3779unboximpl, controller, null), composerStartRestartGroup, 64);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == companion.getEmpty()) {
            continuation = null;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        } else {
            continuation = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(Dp.m3763boximpl(fM3779unboximpl), new OooO0O0(fM3779unboximpl, controller, mutableState, continuation), composerStartRestartGroup, 64);
        Intrinsics.checkNotNullParameter(companion2, "<this>");
        composerStartRestartGroup.startReplaceableGroup(1419080414);
        if (ComposerKt.isTraceInProgress()) {
            i3 = 8;
            ComposerKt.traceEventStart(1419080414, 8, -1, "com.code.android.theme.util.<get-imeHeight> (SystemUiUtil.kt:60)");
        } else {
            i3 = 8;
        }
        float fM3779unboximpl2 = ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m3763boximpl(Dp.m3765constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getIme(companion2, composerStartRestartGroup, i3), composerStartRestartGroup, 0).getBottom() - o00000O.OooO00o(companion2, composerStartRestartGroup))), Dp.m3763boximpl(Dp.m3765constructorimpl(f)))).m3779unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        controller.f51435OooO0o.setValue(Dp.m3763boximpl(fM3779unboximpl2));
        EffectsKt.LaunchedEffect(Dp.m3763boximpl(controller.OooO0Oo()), new OooO0OO(controller, mutableState, null), composerStartRestartGroup, 64);
        OooOo.OooO00o(controller.OooO0OO(), new OooO0o(controller, coroutineScope), composerStartRestartGroup, 0, 0);
        float fOooO0Oo = ((Boolean) controller.f51434OooO0Oo.getValue()).booleanValue() ? controller.OooO0Oo() : controller.OooO0O0();
        Dp dpM3763boximpl = Dp.m3763boximpl(fOooO0Oo);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(dpM3763boximpl);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = Dp.m3763boximpl(Dp.m3765constructorimpl(Dp.m3765constructorimpl(controller.OooO0o0() - fOooO0Oo) / 2));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        float fM3779unboximpl3 = ((Dp) objRememberedValue2).m3779unboximpl();
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier2), 0.0f, 1, null), fOooO0Oo);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifier3 = modifier2;
        AnimatedVisibilityKt.AnimatedVisibility(controller.OooO0OO(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1999275283, true, new OooO(controller, fM3779unboximpl3, function3, function4, i, onEmojiFaceClick, onDeleteClick, coroutineScope)), composerStartRestartGroup, 200064, 18);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(controller, onEmojiFaceClick, onDeleteClick, function3, function4, modifier3, i, i2));
    }

    public static final void OooO0O0(BoxScope boxScope, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(924573582);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(924573582, i2, -1, "com.yalla.yalla.ui.composable.face_panel.EmojiFaceDeleteButton (FacePanel.kt:284)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_new_face_emoji_delete, composerStartRestartGroup, 0);
            float f = 50;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(7), Dp.m3765constructorimpl(f), 3, null), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(35)), RoundedCornerShapeKt.getCircleShape()), o0oO0O0o.f47094o000ooO0, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o000000(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, boxScope.align(PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(modifierM169backgroundbw27NRU$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 251), Dp.m3765constructorimpl(4)), Alignment.INSTANCE.getBottomEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000O(boxScope, function0, i));
    }

    public static final void OooO0OO(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1766298791);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1766298791, i2, -1, "com.yalla.yalla.ui.composable.face_panel.EmojiFaceList (FacePanel.kt:249)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            GridCells.Fixed fixed = new GridCells.Fixed(7);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o00000O0(function1, i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, null, null, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00000O(function1, i));
    }
}
