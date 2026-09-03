package com.yalla.yalla.module.event.ui.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import com.yalla.yalla.module.event.ui.screen.EventSettingScreen;
import com.yalla.yalla.module.event.vm.EventDisplayViewModel;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p401o0Oo0OO0.o00Oo0;
import p508o0o0O.OooOO0O;
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.c2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/module/event/ui/page/EventMineFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/c2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "Lcom/yalla/yalla/module/event/vm/EventDisplayViewModel;", "displayVM$delegate", "Lkotlin/Lazy;", "getDisplayVM", "()Lcom/yalla/yalla/module/event/vm/EventDisplayViewModel;", "displayVM", "", "", "titles", "Ljava/util/List;", "Lcom/yalla/yalla/module/event/ui/page/EventDisplayChildFragment;", "fragments", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventMineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMineFragment.kt\ncom/yalla/yalla/module/event/ui/page/EventMineFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,68:1\n172#2,9:69\n*S KotlinDebug\n*F\n+ 1 EventMineFragment.kt\ncom/yalla/yalla/module/event/ui/page/EventMineFragment\n*L\n22#1:69,9\n*E\n"})
public final class EventMineFragment extends OooOO0O<c2> {
    public static final int $stable = 8;

    @NotNull
    private final List<EventDisplayChildFragment> fragments;

    /* JADX INFO: renamed from: displayVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayVM = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(EventDisplayViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.module.event.ui.page.EventMineFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.module.event.ui.page.EventMineFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f23648OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23648OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.module.event.ui.page.EventMineFragment$special$$inlined$activityViewModels$default$3
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

    @NotNull
    private final List<String> titles = CollectionsKt.mutableListOf(o0000.OooO0OO(oO00OOo0.event_mine_subscribe), o0000.OooO0OO(oO00OOo0.event_mine_creator));

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f23645OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0OO000.OooO00o("101082");
            EventSettingScreen.INSTANCE.navigate();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Object> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            o0OO000.OooO0O0("101003", obj instanceof Map ? (Map) obj : null);
            EventMineFragment eventMineFragment = EventMineFragment.this;
            eventMineFragment.getDisplayVM().setEventPageState(EventPage.MineCreator);
            RtlViewPager rtlViewPager = eventMineFragment.getBinding().f57640OooO0OO;
            EventPage eventPageState = eventMineFragment.getDisplayVM().getEventPageState();
            eventPageState.getClass();
            int i = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
            rtlViewPager.setCurrentItem((i == 1 || i == 3) ? 0 : 1);
        }
    }

    public EventMineFragment() {
        EventDisplayChildFragment.Companion oooO00o = EventDisplayChildFragment.INSTANCE;
        EventPage eventPage = EventPage.MineSubscribe;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(eventPage, "eventPage");
        EventDisplayChildFragment eventDisplayChildFragment = new EventDisplayChildFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("EventPage", eventPage);
        eventDisplayChildFragment.setArguments(bundle);
        EventPage eventPage2 = EventPage.MineCreator;
        Intrinsics.checkNotNullParameter(eventPage2, "eventPage");
        EventDisplayChildFragment eventDisplayChildFragment2 = new EventDisplayChildFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("EventPage", eventPage2);
        eventDisplayChildFragment2.setArguments(bundle2);
        this.fragments = CollectionsKt.mutableListOf(eventDisplayChildFragment, eventDisplayChildFragment2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventDisplayViewModel getDisplayVM() {
        return (EventDisplayViewModel) this.displayVM.getValue();
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        ImageView imageView = getBinding().f57639OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSetting");
        o000OO00.OooO0oo(imageView, OooO00o.f23645OooO0Oo);
        Context context = getBinding().f57640OooO0OO.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.vpEvent.context");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(context);
        oooO00o.OooO0O0(this.titles);
        oooO00o.f56022OooO0o0 = o0000.OooO00o(oO00O0o.color_333333);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_999999);
        float f = 8;
        oooO00o.f56037OooOo0O = o0000O0.OooO00o(f);
        oooO00o.f56020OooO0Oo = 15.0f;
        oooO00o.f56019OooO0OO = 15.0f;
        oooO00o.f56035OooOo0 = o0000O0.OooO00o(f);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_alpha_38_A3);
        RtlViewPager rtlViewPager = getBinding().f57640OooO0OO;
        Intrinsics.checkNotNullExpressionValue(rtlViewPager, "binding.vpEvent");
        oooO00o.OooO0Oo(rtlViewPager);
        oooO00o.f56016OooO = o0000O0.OooO00o(2);
        oooO00o.f56025OooOO0 = o0000.OooO00o(oO00O0o.color_00d8c9);
        oooO00o.f56026OooOO0O = o0000O0.OooO00o(12);
        oooO00o.f56027OooOO0o = o0000O0.OooO00o(3);
        int i = 0;
        oooO00o.f56017OooO00o.setAdjustMode(false);
        YlTableLayout ylTableLayout = getBinding().f57641OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylEvent");
        oooO00o.OooO00o(ylTableLayout);
        getBinding().f57640OooO0OO.setOffscreenPageLimit(this.fragments.size());
        RtlViewPager rtlViewPager2 = getBinding().f57640OooO0OO;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        rtlViewPager2.setAdapter(new o00Oo0(childFragmentManager, this.fragments));
        RtlViewPager rtlViewPager3 = getBinding().f57640OooO0OO;
        EventPage eventPageState = getDisplayVM().getEventPageState();
        eventPageState.getClass();
        int i2 = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
        if (i2 != 1 && i2 != 3) {
            i = 1;
        }
        rtlViewPager3.setCurrentItem(i);
        LiveEventBus.get("EVENT_CREATE_SUCCESS").observe(this, new OooO0O0());
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public c2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        c2 c2VarInflate = c2.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c2VarInflate, "inflate(inflater, container, false)");
        return c2VarInflate;
    }
}
