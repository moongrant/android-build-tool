package p448o0OoOoo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Oooo000;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import com.yalla.yalla.module.event.vm.EventMineViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.o00O0O;
import p194o00o0OO.oo00o;
import p423o0OoO0OO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventMineCreatorPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMineCreatorPage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineCreatorPageKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n76#2:62\n81#3,11:63\n1#4:74\n*S KotlinDebug\n*F\n+ 1 EventMineCreatorPage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineCreatorPageKt\n*L\n27#1:62\n28#1:63,11\n*E\n"})
public final class oOO00O {

    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOOO<EventModel> f47512OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOOO<EventModel> oooOOOO) {
            super(3);
            this.f47512OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(899118152, iIntValue, -1, "com.yalla.yalla.module.event.ui.page.EventMineCreatorPage.<anonymous> (EventMineCreatorPage.kt:48)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, null, false, new o00O00O(this.f47512OooO0Oo), composer2, 6, 254);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47513OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f47514OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventViewModel eventViewModel, int i) {
            super(2);
            this.f47513OooO0Oo = eventViewModel;
            this.f47514OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47514OooO0o0 | 1);
            oOO00O.OooO00o(this.f47513OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return Oooo000.OooO0O0(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(EventPage.class).newInstance(EventPage.MineCreator);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "newInstance(...)");
            return tNewInstance;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull EventViewModel eventVM, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(eventVM, "eventVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(300746404);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(300746404, i, -1, "com.yalla.yalla.module.event.ui.page.EventMineCreatorPage (EventMineCreatorPage.kt:25)");
            }
            OooO0OO oooO0OO = new OooO0OO();
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventMineViewModel.class, current, null, oooO0OO, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventMineViewModel eventMineViewModel = (EventMineViewModel) viewModel;
            OooOOOO oooOOOOOooO00o = o00O0O.OooO00o(eventMineViewModel.getMineEventPager().f38501OooO0oo, composerStartRestartGroup);
            Observable<Object> observable = LiveEventBus.get("EVENT_CREATE_SUCCESS");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new o0O0ooO(oooOOOOOooO00o, 0), composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("EVENT_DELETED");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00O0000.OooO00o(observable2, new o00oOoo(eventMineViewModel, 0), composerStartRestartGroup, 72);
            ComposableLambda composableLambda = o000O.f47394OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 899118152, true, new OooO00o(oooOOOOOooO00o));
            int i2 = OooOOOO.f35803OooO0o0;
            oo00o.OooO00o(oooOOOOOooO00o, null, null, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236168, FacebookRequestErrorClassification.EC_INVALID_TOKEN);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(eventVM, i));
    }
}
