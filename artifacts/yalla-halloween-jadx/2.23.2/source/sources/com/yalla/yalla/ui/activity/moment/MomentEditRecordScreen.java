package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
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
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.yalla.yalla.ui.vm.moment.MomentRecordEditVM;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
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
import p022Oooo00O.o0O00oO0;
import p195o00o0OO0.o00000OO;
import p196o00o0OOO.oOO00O;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p521o0o0O0o0.o000OO;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\t\u001a\u00020\u0004*\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen;", "Lo0o0OOo0/o000O0;", "", "momentId", "", "ListContent", "(JLandroidx/compose/runtime/Composer;I)V", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Lo0o0O0o0/o000OO;", "momentGifPlayManager", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentEditRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,143:1\n76#2:144\n76#2:197\n72#3,6:145\n78#3:179\n82#3:185\n78#4,11:151\n91#4:184\n456#5,8:162\n464#5,3:176\n467#5,3:181\n50#5:198\n49#5:199\n25#5:206\n50#5:213\n49#5:214\n4144#6,6:170\n154#7:180\n81#8,11:186\n1097#9,6:200\n1097#9,6:207\n1097#9,6:215\n81#10:221\n*S KotlinDebug\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen\n*L\n49#1:144\n78#1:197\n53#1:145,6\n53#1:179\n53#1:185\n53#1:151,11\n53#1:184\n53#1:162,8\n53#1:176,3\n53#1:181,3\n80#1:198\n80#1:199\n88#1:206\n96#1:213\n96#1:214\n53#1:170,6\n64#1:180\n76#1:186,11\n80#1:200,6\n88#1:207,6\n96#1:215,6\n88#1:221\n*E\n"})
public final class MomentEditRecordScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final MomentEditRecordScreen INSTANCE = new MomentEditRecordScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25652OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f25653OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, int i) {
            super(2);
            this.f25653OooO0o0 = j;
            this.f25652OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25652OooO0o | 1);
            MomentEditRecordScreen.this.ListContent(this.f25653OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25655OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f25656OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f25656OooO0o0 = columnScope;
            this.f25655OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25655OooO0o | 1);
            MomentEditRecordScreen.this.Content(this.f25656OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen$ListContent$1$1", f = "MomentEditRecordScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentRecordEditVM f25657OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f25658OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentRecordEditVM momentRecordEditVM, long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25657OooO0Oo = momentRecordEditVM;
            this.f25658OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25657OooO0Oo, this.f25658OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MomentRecordEditVM.loadData$default(this.f25657OooO0Oo, this.f25658OooO0o0, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentRecordEditVM f25659OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f25660OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentRecordEditVM momentRecordEditVM, long j) {
            super(0);
            this.f25659OooO0Oo = momentRecordEditVM;
            this.f25660OooO0o0 = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentRecordEditVM.loadData$default(this.f25659OooO0Oo, this.f25660OooO0o0, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentEditRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen$ListContent$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,143:1\n50#2:144\n49#2:145\n1097#3,6:146\n*S KotlinDebug\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen$ListContent$3\n*L\n102#1:144\n102#1:145\n102#1:146,6\n*E\n"})
    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o000OO> f25661OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentRecordEditVM f25662OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25663OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f25664OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LazyListState f25665OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f25666OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, long j, LazyListState lazyListState, MutableState mutableState, FragmentActivity fragmentActivity, MomentRecordEditVM momentRecordEditVM) {
            super(2);
            this.f25662OooO0Oo = momentRecordEditVM;
            this.f25664OooO0o0 = j;
            this.f25663OooO0o = i;
            this.f25665OooO0oO = lazyListState;
            this.f25666OooO0oo = fragmentActivity;
            this.f25661OooO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1927003388, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen.ListContent.<anonymous> (MomentEditRecordScreen.kt:99)");
                }
                MomentRecordEditVM momentRecordEditVM = this.f25662OooO0Oo;
                ContentState value = momentRecordEditVM.getContentState().getValue();
                long j = this.f25664OooO0o0;
                Long lValueOf = Long.valueOf(j);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(lValueOf) | composer2.changed(momentRecordEditVM);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOo00(momentRecordEditVM, j);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                LazyListState lazyListState = this.f25665OooO0oO;
                MomentRecordEditVM momentRecordEditVM2 = this.f25662OooO0Oo;
                FragmentActivity fragmentActivity = this.f25666OooO0oo;
                MutableState<o000OO> mutableState = this.f25661OooO;
                oOO00O.OooO0o0(value, false, null, null, null, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composer2, -1851030462, true, new o000oOoO(this.f25663OooO0o, this.f25664OooO0o0, lazyListState, mutableState, fragmentActivity, momentRecordEditVM2)), composer2, 12582912, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private MomentEditRecordScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ListContent(long j, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(520060599);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(520060599, i2, -1, "com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen.ListContent (MomentEditRecordScreen.kt:70)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            RefreshState refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentRecordEditVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentRecordEditVM momentRecordEditVM = (MomentRecordEditVM) viewModel;
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            FragmentActivity fragmentActivity = objConsume instanceof FragmentActivity ? (FragmentActivity) objConsume : null;
            Unit unit = Unit.INSTANCE;
            Long lValueOf = Long.valueOf(j);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(lValueOf) | composerStartRestartGroup.changed(momentRecordEditVM);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO0O0(momentRecordEditVM, j, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 70);
            if (!momentRecordEditVM.isRefreshIng().getValue().booleanValue()) {
                refreshStateOooO0OO.OooO0Oo(false);
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o000OO(lazyListStateRememberLazyListState), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            int i3 = i2;
            ListContent$lambda$3(mutableState).OooO0O0(momentRecordEditVM.getListData().size(), null, composerStartRestartGroup, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
            Long lValueOf2 = Long.valueOf(j);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(lValueOf2) | composerStartRestartGroup.changed(momentRecordEditVM);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO0OO(momentRecordEditVM, j);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshStateOooO0OO, (Function0) objRememberedValue3, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1927003388, true, new OooO0o(i3, j, lazyListStateRememberLazyListState, mutableState, fragmentActivity, momentRecordEditVM)), composer2, 196616, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(j, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o000OO ListContent$lambda$3(MutableState<o000OO> mutableState) {
        return mutableState.getValue();
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-927023539);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-927023539, i, -1, "com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen.Content (MomentEditRecordScreen.kt:47)");
            }
            long j = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup).getLong("momentId");
            o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(p562o0oOo000.o000000.Moment_Edit_Record_Title, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 0, 510);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.Moment_Edit_Record_Tips, composer2, 0), PaddingKt.m479paddingVpY3zN4(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0OOo000.f48270o000o0Oo, null, 2, null), Dp.m3775constructorimpl(10), Dp.m3775constructorimpl(8)), o0OOo000.f48158OooOoO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            INSTANCE.ListContent(j, composer2, 48);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    public final void navigate(long momentId) {
        Bundle bundleOooO00o = p063o0000oO.o000oOoO.OooO00o();
        bundleOooO00o.putLong("momentId", momentId);
        o00O00.OooO0o0(INSTANCE, bundleOooO00o, false, null, 12);
    }
}
