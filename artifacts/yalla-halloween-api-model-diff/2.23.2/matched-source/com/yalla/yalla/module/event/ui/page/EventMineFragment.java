package com.yalla.yalla.module.event.ui.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.module.event.ui.page.EventMineFragment;
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
import p405o0Oo0OOO.o0O0oo0o;
import p527o0o0OO0o.o000O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p563o0oOo00O.o0O0O00;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/module/event/ui/page/EventMineFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/o0O0oo0o;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "Lcom/yalla/yalla/module/event/vm/EventDisplayViewModel;", "displayVM$delegate", "Lkotlin/Lazy;", "getDisplayVM", "()Lcom/yalla/yalla/module/event/vm/EventDisplayViewModel;", "displayVM", "", "", "titles", "Ljava/util/List;", "Lcom/yalla/yalla/module/event/ui/page/EventDisplayChildFragment;", "fragments", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEventMineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMineFragment.kt\ncom/yalla/yalla/module/event/ui/page/EventMineFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,68:1\n172#2,9:69\n*S KotlinDebug\n*F\n+ 1 EventMineFragment.kt\ncom/yalla/yalla/module/event/ui/page/EventMineFragment\n*L\n22#1:69,9\n*E\n"})
public final class EventMineFragment extends o000O<o0O0oo0o> {
    public static final int $stable = 8;

    @NotNull
    private final List<EventDisplayChildFragment> fragments;

    /* JADX INFO: renamed from: displayVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayVM = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(EventDisplayViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.module.event.ui.page.EventMineFragment$special$$inlined$activityViewModels$default$1
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
        public final /* synthetic */ Function0 f23187OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23187OooO0Oo;
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
    private final List<String> titles = CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.event_mine_subscribe), o0000.OooO0OO(o000000.event_mine_creator));

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f23185OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0oo0000.OooO00o.OooO0O0("101082");
            EventSettingScreen.INSTANCE.navigate();
            return Unit.INSTANCE;
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

    private final EventDisplayViewModel getDisplayVM() {
        return (EventDisplayViewModel) this.displayVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLazyInit$lambda$0(EventMineFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0oo0000.OooO00o.OooO0OO("101003", obj instanceof Map ? (Map) obj : null);
        this$0.getDisplayVM().setEventPageState(EventPage.MineCreator);
        RtlViewPager rtlViewPager = this$0.getBinding().f44545OooO0OO;
        EventPage eventPageState = this$0.getDisplayVM().getEventPageState();
        eventPageState.getClass();
        int i = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
        rtlViewPager.setCurrentItem((i == 1 || i == 3) ? 0 : 1);
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        ImageView ivSetting = getBinding().f44544OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ivSetting, "ivSetting");
        com.code.android.util.o000O.OooO0oo(ivSetting, OooO00o.f23185OooO0Oo);
        Context context = getBinding().f44545OooO0OO.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(context);
        oooO00o.OooO0O0(this.titles);
        oooO00o.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.color_333333);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_999999);
        float f = 8;
        oooO00o.f56277OooOo0O = o0000O0.OooO00o(f);
        oooO00o.f56260OooO0Oo = 15.0f;
        oooO00o.f56259OooO0OO = 15.0f;
        oooO00o.f56275OooOo0 = o0000O0.OooO00o(f);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_alpha_38_A3);
        RtlViewPager vpEvent = getBinding().f44545OooO0OO;
        Intrinsics.checkNotNullExpressionValue(vpEvent, "vpEvent");
        oooO00o.OooO0Oo(vpEvent);
        oooO00o.f56256OooO = o0000O0.OooO00o(2);
        oooO00o.f56265OooOO0 = o0000.OooO00o(o0OOO0o.color_00d8c9);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(12);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(3);
        int i = 0;
        oooO00o.f56257OooO00o.setAdjustMode(false);
        YlTableLayout ylEvent = getBinding().f44546OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ylEvent, "ylEvent");
        oooO00o.OooO00o(ylEvent);
        getBinding().f44545OooO0OO.setOffscreenPageLimit(this.fragments.size());
        RtlViewPager rtlViewPager = getBinding().f44545OooO0OO;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rtlViewPager.setAdapter(new oO0o0000(childFragmentManager, this.fragments));
        RtlViewPager rtlViewPager2 = getBinding().f44545OooO0OO;
        EventPage eventPageState = getDisplayVM().getEventPageState();
        eventPageState.getClass();
        int i2 = EventPage.OooO00o.$EnumSwitchMapping$0[eventPageState.ordinal()];
        if (i2 != 1 && i2 != 3) {
            i = 1;
        }
        rtlViewPager2.setCurrentItem(i);
        LiveEventBus.get("EVENT_CREATE_SUCCESS").observe(this, new Observer() { // from class: o0OoOoo.o00O00OO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EventMineFragment.onLazyInit$lambda$0(this.f47408OooO0Oo, obj);
            }
        });
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public o0O0oo0o getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0O0oo0o o0o0oo0oInflate = o0O0oo0o.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(o0o0oo0oInflate, "inflate(...)");
        return o0o0oo0oInflate;
    }
}
