package p519o0o0O0OO;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooOO0O;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.core.content.ContextCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.ui.vm.main.MainVM;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p414o0Oo0oO.oO00O0o0;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o00O000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentTabAddVideo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentTabAddVideo.kt\ncom/yalla/yalla/ui/composable/moment/MomentTabAddVideoKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,113:1\n81#2,11:114\n73#3,6:125\n79#3:159\n83#3:219\n78#4,11:131\n78#4,11:177\n91#4:213\n91#4:218\n78#4,11:227\n91#4:259\n456#5,8:142\n464#5,3:156\n25#5:161\n456#5,8:188\n464#5,3:202\n467#5,3:210\n467#5,3:215\n456#5,8:238\n464#5,3:252\n467#5,3:256\n4144#6,6:150\n4144#6,6:196\n4144#6,6:246\n76#7:160\n1097#8,6:162\n154#9:168\n154#9:169\n154#9:170\n154#9:206\n154#9:207\n154#9:208\n154#9:209\n154#9:220\n72#10,6:171\n78#10:205\n82#10:214\n66#11,6:221\n72#11:255\n76#11:260\n81#12:261\n81#12:262\n*S KotlinDebug\n*F\n+ 1 MomentTabAddVideo.kt\ncom/yalla/yalla/ui/composable/moment/MomentTabAddVideoKt\n*L\n48#1:114,11\n70#1:125,6\n70#1:159\n70#1:219\n70#1:131,11\n78#1:177,11\n78#1:213\n70#1:218\n106#1:227,11\n106#1:259\n70#1:142,8\n70#1:156,3\n75#1:161\n78#1:188,8\n78#1:202,3\n78#1:210,3\n70#1:215,3\n106#1:238,8\n106#1:252,3\n106#1:256,3\n70#1:150,6\n78#1:196,6\n106#1:246,6\n74#1:160\n75#1:162,6\n80#1:168\n82#1:169\n83#1:170\n85#1:206\n92#1:207\n93#1:208\n95#1:209\n108#1:220\n78#1:171,6\n78#1:205\n78#1:214\n106#1:221,6\n106#1:255\n106#1:260\n49#1:261\n50#1:262\n*E\n"})
public final class o0OO0O0 {

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentTabAddVideoKt$MomentTabAddVideoGuide$1", f = "MomentTabAddVideo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainVM f52438OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MainVM mainVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f52438OooO0Oo = mainVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f52438OooO0Oo, continuation);
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
            oO00O0o0 oo00o0o0OooO = o00Ooo.OooO();
            oo00o0o0OooO.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            this.f52438OooO0Oo.setShowingMomentTabAddVideoGuide(oo00o0o0OooO.OooO0O0("showMomentTabAddVideoGuide" + o0O00oO0.OooOOo0().getValue(), true));
            oO00O0o0 oo00o0o0OooO2 = o00Ooo.OooO();
            oo00o0o0OooO2.getClass();
            oo00o0o0OooO2.OooO0o("showMomentTabAddVideoGuide" + o0O00oO0.OooOOo0().getValue(), false);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentTabAddVideoKt$MomentTabAddVideoGuide$2", f = "MomentTabAddVideo.kt", i = {}, l = {65, 66}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52439OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainVM f52440OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentTabAddVideoKt$MomentTabAddVideoGuide$2$1", f = "MomentTabAddVideo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MainVM f52441OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainVM mainVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f52441OooO0Oo = mainVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f52441OooO0Oo, continuation);
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
                this.f52441OooO0Oo.setShowingMomentTabAddVideoGuide(false);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MainVM mainVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f52440OooO0o0 = mainVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f52440OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f52439OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f52439OooO0Oo = 1;
            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(this.f52440OooO0o0, null);
            this.f52439OooO0Oo = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52442OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52443OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, int i) {
            super(2);
            this.f52442OooO0Oo = boxScope;
            this.f52443OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52443OooO0o0 | 1);
            o0OO0O0.OooO00o(this.f52442OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x02b9  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope boxScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1140907375);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1140907375, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentTabAddVideoGuide (MomentTabAddVideo.kt:46)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MainVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MainVM mainVM = (MainVM) viewModel;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(p536o0o0Oo00.OooO0OO.f54352OooO0O0, null, composerStartRestartGroup, 56);
            MutableLiveData<Boolean> mutableLiveData = o0OO0.f52405OooO00o;
            Boolean bool = Boolean.TRUE;
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(mutableLiveData, bool, composerStartRestartGroup, 56);
            if (Intrinsics.areEqual((Boolean) stateObserveAsState.getValue(), bool)) {
                Boolean bool2 = (Boolean) stateObserveAsState2.getValue();
                Intrinsics.checkNotNullExpressionValue(bool2, "MomentTabAddVideoGuide$lambda$1(...)");
                if (bool2.booleanValue()) {
                    EffectsKt.LaunchedEffect((Boolean) stateObserveAsState.getValue(), new OooO00o(mainVM, null), composerStartRestartGroup, 64);
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), bool) && mainVM.isShowingMomentTabAddVideoGuide()) {
                        EffectsKt.LaunchedEffect(Dispatchers.getIO(), new OooO0O0(mainVM, null), composerStartRestartGroup, 72);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Modifier modifierAlign = boxScope.align(companion, companion2.getBottomEnd());
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = OooOO0O.OooO00o(companion2, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
                        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            int i3 = o0O0O00.ic_moment_tab_add_video;
                            Object obj = ContextCompat.f5281OooO00o;
                            objRememberedValue = ContextCompat.OooO0OO.OooO0O0(context, i3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        float f = 62;
                        Modifier modifierM531widthInVpY3zN4 = SizeKt.m531widthInVpY3zN4(SizeKt.m512heightInVpY3zN4(o00O000.OooO00o(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(85), Dp.m3775constructorimpl(f), 3, null), (Drawable) objRememberedValue, composerStartRestartGroup, 70), Dp.m3775constructorimpl(42), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(121), Dp.m3775constructorimpl(216));
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM531widthInVpY3zN4);
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
                        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(13), null, composerStartRestartGroup, 6, 2);
                        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.moment_tab_add_video_guide, composerStartRestartGroup, 0), SizeKt.m531widthInVpY3zN4(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(21), 0.0f, 2, null), Dp.m3775constructorimpl(79), Dp.m3775constructorimpl(174)), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3072, 122864);
                        composer2 = composerStartRestartGroup;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(19), null, composer2, 6, 2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                } else {
                    composer2 = composerStartRestartGroup;
                }
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(boxScope, i));
    }
}
