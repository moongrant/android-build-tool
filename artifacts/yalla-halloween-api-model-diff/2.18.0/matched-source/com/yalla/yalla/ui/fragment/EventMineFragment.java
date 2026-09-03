package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.screen.event.EventPage;
import com.yalla.yalla.ui.vm.event.EventDisplayViewModel;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o00;
import p586o0oOoo.o000O;
import p593o0oOooOo.c5;
import p651o0ooOOoo.n8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/fragment/EventMineFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/n8;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "Lcom/yalla/yalla/ui/vm/event/EventDisplayViewModel;", "displayVM$delegate", "Lkotlin/Lazy;", "getDisplayVM", "()Lcom/yalla/yalla/ui/vm/event/EventDisplayViewModel;", "displayVM", "", "", "titles", "Ljava/util/List;", "Lcom/yalla/yalla/ui/fragment/EventDisplayChildFragment;", "fragments", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventMineFragment extends p505o0o00o00.OooO<n8> {
    public static final int $stable = 8;

    @NotNull
    private final List<EventDisplayChildFragment> fragments;

    /* JADX INFO: renamed from: displayVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayVM = androidx.fragment.app.o0000OO0.OooO0O0(this, Reflection.getOrCreateKotlinClass(EventDisplayViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.EventMineFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.EventMineFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f23852Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23852Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.EventMineFragment$special$$inlined$activityViewModels$default$3
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
    private final List<String> titles = CollectionsKt.mutableListOf(p255o00ooO0O.o000O0O0.OooO0OO(R.string.event_mine_subscribe), p255o00ooO0O.o000O0O0.OooO0OO(R.string.event_mine_creator));

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO00o f23850Oooo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o000O.OooO00o(c5.f47222OooO00o, null);
            return Unit.INSTANCE;
        }
    }

    public EventMineFragment() {
        EventDisplayChildFragment.Companion oooO00o = EventDisplayChildFragment.INSTANCE;
        this.fragments = CollectionsKt.mutableListOf(oooO00o.OooO00o(EventPage.MineSubscribe), oooO00o.OooO00o(EventPage.MineCreator));
    }

    private final EventDisplayViewModel getDisplayVM() {
        return (EventDisplayViewModel) this.displayVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-0, reason: not valid java name */
    public static final void m322onLazyInit$lambda0(EventMineFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter("101003", "eventId");
        p613o0oo0OO0.o0000.f48379OooO00o.OooO00o("101003", p608o0oo0O.OooOo.OooO00o(), str);
        this$0.getDisplayVM().setEventPageState(EventPage.MineCreator);
        RtlViewPager rtlViewPager = this$0.getBinding().f50087OooO0OO;
        EventPage eventPageState = this$0.getDisplayVM().getEventPageState();
        Objects.requireNonNull(eventPageState);
        int i = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
        rtlViewPager.setCurrentItem((i == 1 || i == 3) ? 0 : 1);
    }

    @Override // p464o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        ImageView imageView = getBinding().f50086OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSetting");
        com.yalla.support.common.util.o00O0O.OooO0Oo(imageView, OooO00o.f23850Oooo);
        Context context = getBinding().f50087OooO0OO.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.vpEvent.context");
        Intrinsics.checkNotNullParameter(context, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(context);
        oooO00o.OooO0O0(this.titles);
        oooO00o.f33004OooO0o = p255o00ooO0O.o000O0O0.OooO00o(R.color.color_333333);
        oooO00o.f33006OooO0oO = p255o00ooO0O.o000O0O0.OooO00o(R.color.color_999999);
        float f = 8;
        oooO00o.f33018OooOo0 = com.yalla.support.common.util.OooOo00.OooO00o(f);
        oooO00o.f33005OooO0o0 = 15.0f;
        oooO00o.f33003OooO0Oo = 15.0f;
        oooO00o.f33019OooOo00 = com.yalla.support.common.util.OooOo00.OooO00o(f);
        oooO00o.f33006OooO0oO = p255o00ooO0O.o000O0O0.OooO00o(R.color.color_alpha_38_A3);
        RtlViewPager rtlViewPager = getBinding().f50087OooO0OO;
        Intrinsics.checkNotNullExpressionValue(rtlViewPager, "binding.vpEvent");
        oooO00o.OooO0OO(rtlViewPager);
        oooO00o.f33007OooO0oo = com.yalla.support.common.util.OooOo00.OooO00o(2);
        oooO00o.f32999OooO = p255o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9);
        oooO00o.f33008OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(12);
        oooO00o.f33009OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3);
        int i = 0;
        oooO00o.f33001OooO0O0.setAdjustMode(false);
        YlTableLayout ylTableLayout = getBinding().f50088OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylEvent");
        oooO00o.OooO00o(ylTableLayout);
        getBinding().f50087OooO0OO.setOffscreenPageLimit(this.fragments.size());
        RtlViewPager rtlViewPager2 = getBinding().f50087OooO0OO;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        rtlViewPager2.setAdapter(new p464o0Ooo0o.o0000O00(childFragmentManager, this.fragments));
        RtlViewPager rtlViewPager3 = getBinding().f50087OooO0OO;
        EventPage eventPageState = getDisplayVM().getEventPageState();
        Objects.requireNonNull(eventPageState);
        int i2 = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
        if (i2 != 1 && i2 != 3) {
            i = 1;
        }
        rtlViewPager3.setCurrentItem(i);
        LiveEventBus.get("EVENT_CREATE_SUCCESS", String.class).observe(this, new o00(this, 6));
    }

    @Override // p505o0o00o00.OooO
    @NotNull
    public n8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        n8 n8VarInflate = n8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(n8VarInflate, "inflate(inflater, container, false)");
        return n8VarInflate;
    }
}
