package com.yalla.yalla.ui.screen.user;

import android.os.Bundle;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p536o0o0Oo0o.O0OO00;
import p536o0o0Oo0o.oOO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\tH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/UserMomentListScreen;", "Lo0o0OOO0/o00O00O;", "", "userID", "", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,537:1\n81#2,11:538\n81#2,11:549\n76#3:560\n66#4,6:561\n72#4:595\n76#4:600\n78#5,11:567\n91#5:599\n456#6,8:578\n464#6,3:592\n467#6,3:596\n4144#7,6:586\n*S KotlinDebug\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreen\n*L\n111#1:538,11\n112#1:549,11\n114#1:560\n131#1:561,6\n131#1:595\n131#1:600\n131#1:567,11\n131#1:599\n131#1:578,8\n131#1:592,3\n131#1:596,3\n131#1:586,6\n*E\n"})
public final class UserMomentListScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final UserMomentListScreen INSTANCE = new UserMomentListScreen();

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.UserMomentListScreen$Content$1", f = "UserMomentListScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentUserListVM f30133OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentUserListVM momentUserListVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30133OooO0Oo = momentUserListVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f30133OooO0Oo, continuation);
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
            MomentUserListVM momentUserListVM = this.f30133OooO0Oo;
            if (momentUserListVM.getFirstInitScreen()) {
                momentUserListVM.setFirstInitScreen(false);
                MomentUserListVM.userMomentList$default(momentUserListVM, true, null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreen$Content$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,537:1\n63#2,5:538\n*S KotlinDebug\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreen$Content$3\n*L\n138#1:538,5\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f30134OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BaseMomentDetailVM baseMomentDetailVM) {
            super(1);
            this.f30134OooO0Oo = baseMomentDetailVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            BaseMomentDetailVM baseMomentDetailVM = this.f30134OooO0Oo;
            baseMomentDetailVM.statisticalTime();
            return new oOO000(baseMomentDetailVM);
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f30136OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30137OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, int i) {
            super(2);
            this.f30137OooO0o0 = columnScope;
            this.f30136OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30136OooO0o | 1);
            UserMomentListScreen.this.Content(this.f30137OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private UserMomentListScreen() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        long jOooOO0;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2018318143);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2018318143, i, -1, "com.yalla.yalla.ui.screen.user.UserMomentListScreen.Content (UserMomentListScreen.kt:109)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentUserListVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentUserListVM momentUserListVM = (MomentUserListVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(BaseMomentDetailVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            BaseMomentDetailVM baseMomentDetailVM = (BaseMomentDetailVM) viewModel2;
            Bundle bundleOooO0O0 = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup);
            MutableLongState toUserId = momentUserListVM.getToUserId();
            String string = bundleOooO0O0.getString("Id");
            if (string != null) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                jOooOO0 = com.code.android.util.o0OoOo0.OooO(com.code.android.util.o0OoOo0.OooOO0((Long) o000000O.OooOOo0().getValue()), string);
            } else {
                o000000O o000000o3 = o000000O.f46674OooO00o;
                jOooOO0 = com.code.android.util.o0OoOo0.OooOO0((Long) o000000O.OooOOo0().getValue());
            }
            toUserId.setValue(jOooOO0);
            Unit unit = Unit.INSTANCE;
            EffectsKt.LaunchedEffect(unit, new OooO00o(momentUserListVM, null), composerStartRestartGroup, 70);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            O0OO00.OooO0O0(momentUserListVM, String.valueOf(momentUserListVM.getToUserId().getValue().longValue()), lazyListStateRememberLazyListState, composerStartRestartGroup, 8);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
            O0OO00.OooO0Oo(momentUserListVM, String.valueOf(momentUserListVM.getToUserId().getValue().longValue()), lazyListStateRememberLazyListState, composerStartRestartGroup, 8);
            O0OO00.OooO0o0(boxScopeInstance, momentUserListVM.getToUserId().getValue().longValue(), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, new OooO0O0(baseMomentDetailVM), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(columnScope, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4198getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1103843066);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1103843066, i, -1, "com.yalla.yalla.ui.screen.user.UserMomentListScreen.getWindowBackgroundColor (UserMomentListScreen.kt:144)");
        }
        int i2 = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f46946OooO0O0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate(@NotNull String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        oo0oOO0.OooO0o0(INSTANCE, p063o0000oO.o00Ooo.OooO0O0(TuplesKt.to("Id", userID)), false, null, 12);
    }
}
