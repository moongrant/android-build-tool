package p536o0o0Oo0o;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.screen.main.VipSettingScreen;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Function;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00Ooo;
import p158o00OoOOO.oo000o;
import p402o0Oo0OOO.o00O000o;
import p417o0OoO0.o00000O;
import p464o0Oooo.o000000O;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCommonDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonDialog.kt\ncom/yalla/yalla/ui/screen/user/CommonDialogKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,94:1\n81#2,11:95\n36#3:106\n1097#4,6:107\n76#5:113\n81#6:114\n*S KotlinDebug\n*F\n+ 1 CommonDialog.kt\ncom/yalla/yalla/ui/screen/user/CommonDialogKt\n*L\n40#1:95,11\n54#1:106\n54#1:107,6\n74#1:113\n44#1:114\n*E\n"})
public final class o0OO00OO {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f54967OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.CommonDialogKt$VipHiddenDialog$1", f = "CommonDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f54968OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(VipVm vipVm, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f54968OooO0Oo = vipVm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f54968OooO0Oo, continuation);
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
            this.f54968OooO0Oo.loadPersonData();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<PersonalVipModel> f54969OooO0Oo;

        public OooO0O0(State<PersonalVipModel> state) {
            this.f54969OooO0Oo = state;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            this.f54969OooO0Oo.getValue().setShowPremiumFirst(bool.booleanValue());
        }
    }

    public static final class OooO0OO implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<PersonalVipModel> f54970OooO0Oo;

        public OooO0OO(State<PersonalVipModel> state) {
            this.f54970OooO0Oo = state;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            this.f54970OooO0Oo.getValue().setStealthVisit(bool.booleanValue());
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<PersonalVipModel> f54971OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(State<PersonalVipModel> state) {
            super(0);
            this.f54971OooO0Oo = state;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Bundle bundleOooO00o = o00Ooo.OooO00o();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Pair pair = (Pair) o000000O.OooOO0().getValue();
            bundleOooO00o.putBoolean(VipSettingScreen.HideVip, !(pair != null && ((Number) pair.getFirst()).intValue() == VipState.Vip.getValue()));
            State<PersonalVipModel> state = this.f54971OooO0Oo;
            bundleOooO00o.putBoolean(VipSettingScreen.ShowPremiumFirst, state.getValue().getShowPremiumFirst());
            bundleOooO00o.putBoolean(VipSettingScreen.InvisibleVisitor, state.getValue().getStealthVisit());
            oo0oOO0.OooO0o0(VipSettingScreen.INSTANCE, bundleOooO00o, false, null, 12);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54972OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54973OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f54972OooO0Oo = mutableState;
            this.f54973OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54973OooO0o0 | 1);
            o0OO00OO.OooO00o(this.f54972OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f54974OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(AppCompatActivity appCompatActivity) {
            super(0);
            this.f54974OooO0Oo = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AppCompatActivity appCompatActivity = this.f54974OooO0Oo;
            if (appCompatActivity != null) {
                o00O000o.f44511OooOo0O.observe(appCompatActivity, new OooOOOO(new o0OO00o0(appCompatActivity)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54975OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54976OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f54975OooO0Oo = mutableState;
            this.f54976OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54976OooO0o0 | 1);
            o0OO00OO.OooO0O0(this.f54975OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f54977OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f54978OooO0Oo;

        public OooOOOO(o0OO00o0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f54978OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f54978OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f54978OooO0Oo;
        }

        public final int hashCode() {
            return this.f54978OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54978OooO0Oo.invoke(obj);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull MutableState<Boolean> show, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(show, "show");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1529980253);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(show) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1529980253, i2, -1, "com.yalla.yalla.ui.screen.user.VipHiddenDialog (CommonDialog.kt:38)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(VipVm.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            VipVm vipVm = (VipVm) viewModel;
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO00o(vipVm, null), composerStartRestartGroup, 70);
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(vipVm.getPersonalKaVipModel(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
            Observable<Object> observable = LiveEventBus.get("KA_VIP_SHOW_PREMIUM_FIRST");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.KA_VIP_SHOW_PREMIUM_FIRST)");
            o00000O.OooO00o(observable, new OooO0O0(stateCollectAsStateWithLifecycle), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("KA_VIP_INVISIBLE_ISITOR");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.KA_VIP_INVISIBLE_ISITOR)");
            o00000O.OooO00o(observable2, new OooO0OO(stateCollectAsStateWithLifecycle), composerStartRestartGroup, 8);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.my_outfit_is_vip_hidden, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.Go_to_Settings, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO0o(stateCollectAsStateWithLifecycle);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(show, null, strStringResource, null, false, false, null, null, strStringResource2, false, null, false, (Function0) objRememberedValue, null, false, false, null, OooO.f54967OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(show, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull MutableState<Boolean> show, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(show, "show");
        Composer composerStartRestartGroup = composer.startRestartGroup(-313313585);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(show) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313313585, i2, -1, "com.yalla.yalla.ui.screen.user.WealthHiddenDialog (CommonDialog.kt:72)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(show, null, StringResources_androidKt.stringResource(oO00OOo0.my_outfit_is_wealth_hidden, composerStartRestartGroup, 0), null, false, false, null, null, StringResources_androidKt.stringResource(oO00OOo0.Go_to_Settings, composerStartRestartGroup, 0), false, null, false, new OooOO0O(objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null), null, false, false, null, OooOOO0.f54977OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(show, i));
    }
}
