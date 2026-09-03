package p442o0OoOoO0;

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
import androidx.lifecycle.OooOo;
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
import o000O0.OooOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o0O0O00;
import p417o0OoO0.o00000O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventMineSubscribePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMineSubscribePage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineSubscribePageKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,70:1\n76#2:71\n81#3,11:72\n*S KotlinDebug\n*F\n+ 1 EventMineSubscribePage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineSubscribePageKt\n*L\n28#1:71\n29#1:72,11\n*E\n"})
public final class o00O {

    public static final class OooO implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return OooOo.OooO0O0(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(EventPage.class).newInstance(EventPage.MineSubscribe);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getConstructo….EventPage.MineSubscribe)");
            return tNewInstance;
        }
    }

    @SourceDebugExtension({"SMAP\nEventMineSubscribePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMineSubscribePage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineSubscribePageKt$EventMineSubscribePage$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
    public static final class OooO00o implements Observer<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventMineViewModel f46180OooO0Oo;

        public OooO00o(EventMineViewModel eventMineViewModel) {
            this.f46180OooO0Oo = eventMineViewModel;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            Object next;
            long jLongValue = l.longValue();
            p143o00Oo000.OooO0O0<EventModel> mineEventPager = this.f46180OooO0Oo.getMineEventPager();
            Iterator<T> it = mineEventPager.f37663OooO0Oo.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((EventModel) next).getId() == jLongValue));
            EventModel eventModel = (EventModel) next;
            List<EventModel> list = mineEventPager.f37663OooO0Oo;
            if (eventModel == null) {
                return;
            }
            list.remove(eventModel);
            mineEventPager.OooO0O0();
        }
    }

    @SourceDebugExtension({"SMAP\nEventMineSubscribePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMineSubscribePage.kt\ncom/yalla/yalla/module/event/ui/page/EventMineSubscribePageKt$EventMineSubscribePage$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
    public static final class OooO0O0 implements Observer<SubscribeNotifyModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<EventModel> f46181OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventMineViewModel f46182OooO0o0;

        public OooO0O0(o000O0.OooO0O0<EventModel> oooO0O0, EventMineViewModel eventMineViewModel) {
            this.f46181OooO0Oo = oooO0O0;
            this.f46182OooO0o0 = eventMineViewModel;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(SubscribeNotifyModel subscribeNotifyModel) {
            Object next;
            SubscribeNotifyModel it = subscribeNotifyModel;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getHasSubscribe()) {
                this.f46181OooO0Oo.OooO0Oo();
                return;
            }
            p143o00Oo000.OooO0O0<EventModel> mineEventPager = this.f46182OooO0o0.getMineEventPager();
            Iterator<T> it2 = mineEventPager.f37663OooO0Oo.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((EventModel) next).getId() == it.getEventId()));
            EventModel eventModel = (EventModel) next;
            List<EventModel> list = mineEventPager.f37663OooO0Oo;
            if (eventModel == null) {
                return;
            }
            list.remove(eventModel);
            mineEventPager.OooO0O0();
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<EventModel> f46183OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O0.OooO0O0<EventModel> oooO0O0) {
            super(3);
            this.f46183OooO0Oo = oooO0O0;
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
                    ComposerKt.traceEventStart(-1745512888, iIntValue, -1, "com.yalla.yalla.module.event.ui.page.EventMineSubscribePage.<anonymous> (EventMineSubscribePage.kt:55)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, null, false, new o00OO0OO(this.f46183OooO0Oo), composer2, 6, 254);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f46184OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46185OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(EventViewModel eventViewModel, int i) {
            super(2);
            this.f46184OooO0Oo = eventViewModel;
            this.f46185OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46185OooO0o0 | 1);
            o00O.OooO00o(this.f46184OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
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
            OooO oooO = new OooO();
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventMineViewModel.class, current, null, oooO, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventMineViewModel eventMineViewModel = (EventMineViewModel) viewModel;
            o000O0.OooO0O0 oooO0O0OooO00o = OooOOO.OooO00o(eventMineViewModel.getMineEventPager().f37667OooO0oo, composerStartRestartGroup);
            Observable<Object> observable = LiveEventBus.get("EVENT_DELETED");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.EVENT_DELETED)");
            o00000O.OooO00o(observable, new OooO00o(eventMineViewModel), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.EVENT_UPDATE_SUBSCRIBE_NUMBER)");
            o00000O.OooO00o(observable2, new OooO0O0(oooO0O0OooO00o, eventMineViewModel), composerStartRestartGroup, 8);
            ComposableLambda composableLambda = o00O0.f46186OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1745512888, true, new OooO0OO(oooO0O0OooO00o));
            int i2 = o000O0.OooO0O0.f34327OooO0o0;
            o0O0O00.OooO00o(oooO0O0OooO00o, null, null, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236168, FacebookRequestErrorClassification.EC_INVALID_TOKEN);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(eventVM, i));
    }
}
