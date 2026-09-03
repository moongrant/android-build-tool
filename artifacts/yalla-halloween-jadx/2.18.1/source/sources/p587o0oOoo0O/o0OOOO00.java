package p587o0oOoo0O;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.OooOOOO;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.paging.compose.OooOO0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.screen.event.EventPage;
import com.yalla.yalla.ui.vm.event.EventMineViewModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.Oooo000;
import p028Oooo0o0.o00O00o0;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o00oO0o;
import p510o0o00oo0.o0O00OO;
import p522o0o0O0o.o00O000o;
import p558o0oOOoo.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOOO00 {

    public static final class OooO00o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<EventModel> f47002Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(androidx.paging.compose.OooO0OO<EventModel> oooO0OO) {
            super(3);
            this.f47002Oooo0o = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 PagingContentState = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(PagingContentState, "$this$PagingContentState");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                Oooo000.OooO00o(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), null, null, false, null, null, null, false, new o0OOO0OO(this.f47002Oooo0o), ooo00o2, 6, 254);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47003Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47004Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventViewModel eventViewModel, int i) {
            super(2);
            this.f47003Oooo0o = eventViewModel;
            this.f47004Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OOOO00.OooO00o(this.f47003Oooo0o, ooo00o, this.f47004Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(EventPage.class).newInstance(EventPage.MineSubscribe);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getConstructo…(EventPage.MineSubscribe)");
            return tNewInstance;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return OooOOOO.OooO0O0(this, cls, creationExtras);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull EventViewModel eventVM, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(eventVM, "eventVM");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(105183730);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            OooO0OO oooO0OO = new OooO0OO();
            ooo00oOooOOo.OooO0o0(1729797275);
            int i2 = 6;
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventMineViewModel.class, current, null, oooO0OO, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            EventMineViewModel eventMineViewModel = (EventMineViewModel) viewModel;
            androidx.paging.compose.OooO0OO oooO0OOOooO00o = OooOO0.OooO00o(eventMineViewModel.getMineEventPager().f48686OooO0oo, ooo00oOooOOo);
            Observable<Object> observable = LiveEventBus.get("EVENT_DELETED");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.EVENT_DELETED)");
            o00O000o.OooO00o(observable, new o00oO0o(eventMineViewModel, i2), ooo00oOooOOo, 72);
            Observable<Object> observable2 = LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.EVENT_UPDATE_SUBSCRIBE_NUMBER)");
            o00O000o.OooO00o(observable2, new o0o0Oo(oooO0OOOooO00o, eventMineViewModel, 1), ooo00oOooOOo, 72);
            o0OO0 o0oo1 = o0OO0.f46977OooO00o;
            o0O00OO.OooO00o(oooO0OOOooO00o, null, null, o0OO0.f46978OooO0O0, null, o00O0000.OooO00o(ooo00oOooOOo, -1391983393, new OooO00o(oooO0OOOooO00o)), ooo00oOooOOo, 199688, 22);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(eventVM, i));
    }
}
