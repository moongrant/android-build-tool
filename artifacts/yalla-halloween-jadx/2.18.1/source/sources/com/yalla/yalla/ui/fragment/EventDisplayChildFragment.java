package com.yalla.yalla.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.ui.screen.event.EventPage;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p261o00ooOoO.u;
import p649o0ooOOoo.n8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0014R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/fragment/EventDisplayChildFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/n8;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "getViewBinding", "", "onLazyInit", "Lcom/yalla/yalla/ui/vm/event/EventViewModel;", "eventVM$delegate", "Lkotlin/Lazy;", "getEventVM", "()Lcom/yalla/yalla/ui/vm/event/EventViewModel;", "eventVM", "Lcom/yalla/yalla/ui/screen/event/EventPage;", "eventPage", "Lcom/yalla/yalla/ui/screen/event/EventPage;", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventDisplayChildFragment extends p503o0o00o00.OooO<n8> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private EventPage eventPage;

    /* JADX INFO: renamed from: eventVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eventVM = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(EventViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.EventDisplayChildFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.EventDisplayChildFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23828Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23828Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.EventDisplayChildFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.EventDisplayChildFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final EventDisplayChildFragment OooO00o(@NotNull EventPage eventPage) {
            Intrinsics.checkNotNullParameter(eventPage, "eventPage");
            EventDisplayChildFragment eventDisplayChildFragment = new EventDisplayChildFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EventPage", eventPage);
            eventDisplayChildFragment.setArguments(bundle);
            return eventDisplayChildFragment;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                u.OooO00o(false, o00O0000.OooO00o(ooo00o2, -1593002393, new com.yalla.yalla.ui.fragment.OooO0O0(EventDisplayChildFragment.this)), ooo00o2, 48, 1);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventViewModel getEventVM() {
        return (EventViewModel) this.eventVM.getValue();
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("EventPage") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.yalla.yalla.ui.screen.event.EventPage");
        this.eventPage = (EventPage) serializable;
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        getBinding().f50075OooO0O0.setContent(o00O0000.OooO0O0(-1718191606, true, new OooO0O0()));
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public n8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        n8 n8VarInflate = n8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(n8VarInflate, "inflate(inflater, container, false)");
        return n8VarInflate;
    }
}
