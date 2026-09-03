package p450o0OoOoo;

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
import androidx.lifecycle.Observer;
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
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import com.yalla.yalla.module.event.vm.EventMineViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
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
import p188o00o00oO.o000;
import p194o00o0OO.oo00o;
import p425o0OoO0OO.o00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventMineSubscribePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMineSubscribePage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineSubscribePageKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n76#2:68\n81#3,11:69\n1#4:80\n*S KotlinDebug\n*F\n+ 1 EventMineSubscribePage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineSubscribePageKt\n*L\n28#1:68\n29#1:69,11\n*E\n"})
public final class o00O0O0O {

    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOOO<EventModel> f47411OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOOO<EventModel> oooOOOO) {
            super(3);
            this.f47411OooO0Oo = oooOOOO;
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
                    ComposerKt.traceEventStart(-1745512888, iIntValue, -1, "com.yalla.yalla.module.event.ui.page.EventMineSubscribePage.<anonymous> (EventMineSubscribePage.kt:56)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, null, false, new o00O0O0(this.f47411OooO0Oo), composer2, 6, 254);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47412OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f47413OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventViewModel eventViewModel, int i) {
            super(2);
            this.f47412OooO0Oo = eventViewModel;
            this.f47413OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47413OooO0o0 | 1);
            o00O0O0O.OooO00o(this.f47412OooO0Oo, composer, iUpdateChangedFlags);
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
            T tNewInstance = modelClass.getConstructor(EventPage.class).newInstance(EventPage.MineSubscribe);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "newInstance(...)");
            return tNewInstance;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull EventViewModel eventVM, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(eventVM, "eventVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(1346542244);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1346542244, i, -1, "com.yalla.yalla.module.event.ui.page.EventMineSubscribePage (EventMineSubscribePage.kt:26)");
            }
            OooO0OO oooO0OO = new OooO0OO();
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventMineViewModel.class, current, null, oooO0OO, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final EventMineViewModel eventMineViewModel = (EventMineViewModel) viewModel;
            final OooOOOO oooOOOOOooO00o = o00O0O.OooO00o(eventMineViewModel.getMineEventPager().f38496OooO0oo, composerStartRestartGroup);
            Observable<Object> observable = LiveEventBus.get("EVENT_DELETED");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00.OooO00o(observable, new o00O00o0(eventMineViewModel, 0), composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00.OooO00o(observable2, new Observer() { // from class: o0OoOoo.oo00o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Object next;
                    SubscribeNotifyModel it = (SubscribeNotifyModel) obj;
                    OooOOOO lazyPagingItems = oooOOOOOooO00o;
                    Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
                    EventMineViewModel mineVM = eventMineViewModel;
                    Intrinsics.checkNotNullParameter(mineVM, "$mineVM");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it.getHasSubscribe()) {
                        lazyPagingItems.OooO0Oo();
                        return;
                    }
                    o000<EventModel> mineEventPager = mineVM.getMineEventPager();
                    Iterator<T> it2 = mineEventPager.f38492OooO0Oo.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!(((EventModel) next).getId() == it.getEventId()));
                    EventModel eventModel = (EventModel) next;
                    List<EventModel> list = mineEventPager.f38492OooO0Oo;
                    if (eventModel == null) {
                        return;
                    }
                    list.remove(eventModel);
                    mineEventPager.OooO0O0();
                }
            }, composerStartRestartGroup, 72);
            ComposableLambda composableLambda = o000OO00.f47394OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1745512888, true, new OooO00o(oooOOOOOooO00o));
            int i2 = OooOOOO.f35800OooO0o0;
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
