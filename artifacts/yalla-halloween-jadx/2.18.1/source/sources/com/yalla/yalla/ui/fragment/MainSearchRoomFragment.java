package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.model.RoomIndexModel;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.ui.view.UserPrettyIdView;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.SearchVM;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOo.oO000Oo;
import p538o0o0Oo0.o0O0o00O;
import p544o0o0OoOO.m4;
import p579o0oOoOOo.l1;
import p579o0oOoOOo.oOO0OO;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.hb;
import p649o0ooOOoo.kb;
import p649o0ooOOoo.lb;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainSearchRoomFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/hb;", "", "observerSearchText", "loadRecommendRoom", "initView", "initSearchHistory", "", ViewHierarchyConstants.TEXT_KEY, "", "isRefresh", "searchRoom", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/app/base/adapter/room/RoomBaseAdapter;", "Lcom/app/base/model/RoomIndexModel;", "recommendAdapter", "Lcom/app/base/adapter/room/RoomBaseAdapter;", "searchText", "Ljava/lang/String;", "", "pageIndex", "I", "Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm", "Landroidx/recyclerview/widget/ConcatAdapter;", "adapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "Lkotlin/Function0;", "onScrollListener", "Lkotlin/jvm/functions/Function0;", "getOnScrollListener", "()Lkotlin/jvm/functions/Function0;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function0;)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainSearchRoomFragment extends p503o0o00o00.OooO<hb> {
    public static final int $stable = 8;

    @Nullable
    private p464o0Ooo0oO.o0000OO0 historyAdapter;

    @Nullable
    private p464o0Ooo0oO.o0000OO0 hotTagAdapter;

    @Nullable
    private Function0<Unit> onScrollListener;

    @Nullable
    private RoomBaseAdapter<RoomIndexModel> recommendAdapter;

    @Nullable
    private p188o00o00o0.OooO0OO<RoomIndexModel> searchAdapter;

    @Nullable
    private String searchText;
    private int pageIndex = 1;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchRoomFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainSearchRoomFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23996Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23996Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainSearchRoomFragment$special$$inlined$activityViewModels$default$3
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
    private final ConcatAdapter adapter = new ConcatAdapter(new RecyclerView.Adapter[0]);

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f23986Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainSearchRoomFragment f23987Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, MainSearchRoomFragment mainSearchRoomFragment) {
            super(1);
            this.f23986Oooo0o = z;
            this.f23987Oooo0oO = mainSearchRoomFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f23986Oooo0o) {
                this.f23987Oooo0oO.getBinding().f49545OooO0Oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends p188o00o00o0.OooO0OO<RoomIndexModel> {
        public OooO00o(Context context) {
            super(context, R.layout.item_search_room_search);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            RoomIndexModel roomIndexModel = (RoomIndexModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (roomIndexModel == null) {
                return;
            }
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0oo());
            oooO00o2.f48429OooO0OO = roomIndexModel.barimage;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.head_pic));
            String str = roomIndexModel.isencrypt;
            String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            helper.OooO0oO(R.id.iv_lock, !Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, str));
            helper.OooO0oO(R.id.iv_official, roomIndexModel.isofficial == 1);
            helper.OooO0oO(R.id.iv_honor, true);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) helper.OooO0Oo(R.id.iv_honor);
            lottieAnimationView.OooO0Oo();
            if (Intrinsics.areEqual("4", roomIndexModel.bartype)) {
                helper.OooO0oo(R.id.iv_honor, R.drawable.upgraderoom_crown_somall);
            } else if (Intrinsics.areEqual(FeedbackType.Recharge, roomIndexModel.bartype)) {
                helper.OooO0oo(R.id.iv_honor, R.drawable.room_dreamland1);
            } else if (Intrinsics.areEqual(FeedbackType.Suggestions, roomIndexModel.bartype)) {
                helper.OooO0oo(R.id.iv_honor, R.drawable.room_princess_garden1);
            } else if (Intrinsics.areEqual(FeedbackType.Others, roomIndexModel.bartype)) {
                lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.OooOO0();
            } else {
                helper.OooO0oo(R.id.iv_honor, R.drawable.upgraderoom_crown_somall);
                helper.OooO0oO(R.id.iv_honor, false);
            }
            ((TextView) helper.OooO0Oo(R.id.tv_room_name)).setText(p168o00Ooo0.o0O0O00.OooO0O0(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9), roomIndexModel.barname, MainSearchRoomFragment.this.searchText));
            TextView textView = (TextView) helper.OooO0Oo(R.id.tv_id);
            int iOooO00o = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9);
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ID:");
            sbOooO0o0.append(roomIndexModel.baridx);
            textView.setText(p168o00Ooo0.o0O0O00.OooO0O0(iOooO00o, sbOooO0o0.toString(), MainSearchRoomFragment.this.searchText));
            String str3 = roomIndexModel.onlinenum;
            if (str3 != null) {
                str2 = str3;
            }
            helper.OooOO0(R.id.tv_online_num, str2);
            helper.OooO0Oo(R.id.item_bg).setOnClickListener(new com.yalla.yalla.ui.fragment.OooOO0(this, roomIndexModel));
            Drawable background = helper.OooO0Oo(R.id.lav_item_all).getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((AnimationDrawable) background).start();
            View viewOooO0Oo = helper.OooO0Oo(R.id.sv_room_id);
            Intrinsics.checkNotNull(viewOooO0Oo, "null cannot be cast to non-null type com.yalla.yalla.common.ui.view.UserPrettyIdView");
            ((UserPrettyIdView) viewOooO0Oo).setRoomPrettyId(roomIndexModel.isPrettyBarId);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String str = MainSearchRoomFragment.this.searchText;
            if (str != null) {
                MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
                mainSearchRoomFragment.getBinding().f49545OooO0Oo.OooO0oo();
                mainSearchRoomFragment.searchRoom(str, true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<? extends RoomIndexModel>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends RoomIndexModel> list) {
            List<? extends RoomIndexModel> list2 = list;
            RoomBaseAdapter roomBaseAdapter = MainSearchRoomFragment.this.recommendAdapter;
            if (roomBaseAdapter != null) {
                roomBaseAdapter.setNewData(list2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<? extends RoomIndexModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23992Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f23992Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends RoomIndexModel> list) {
            List<? extends RoomIndexModel> list2 = list;
            if (list2 != null) {
                boolean z = this.f23992Oooo0oO;
                MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
                if (z) {
                    p188o00o00o0.OooO0OO oooO0OO = mainSearchRoomFragment.searchAdapter;
                    if (oooO0OO != null) {
                        oooO0OO.setNewData(list2);
                    }
                } else {
                    p188o00o00o0.OooO0OO oooO0OO2 = mainSearchRoomFragment.searchAdapter;
                    if (oooO0OO2 != null) {
                        oooO0OO2.addData((Collection) list2);
                    }
                }
            }
            MainSearchRoomFragment.this.adapter.notifyDataSetChanged();
            p188o00o00o0.OooO0OO oooO0OO3 = MainSearchRoomFragment.this.searchAdapter;
            Collection data = oooO0OO3 != null ? oooO0OO3.getData() : null;
            if (data == null || data.isEmpty()) {
                MainSearchRoomFragment.this.getBinding().f49545OooO0Oo.OooO0o0();
            } else {
                if (this.f23992Oooo0oO) {
                    MainSearchRoomFragment.this.getBinding().f49544OooO0OO.scrollToPosition(0);
                }
                MainSearchRoomFragment.this.getBinding().f49545OooO0Oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiResult<List<? extends RoomIndexModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23994Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z) {
            super(1);
            this.f23994Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends RoomIndexModel>> apiResult) {
            List<T> data;
            ApiResult<List<? extends RoomIndexModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RefreshLayout refreshLayout = MainSearchRoomFragment.this.getBinding().f49543OooO0O0;
            boolean z = this.f23994Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            List<? extends RoomIndexModel> data2 = it.getData();
            refreshLayout.Oooo00o(z, zIsSuccess, data2 == null || data2.isEmpty());
            if (it.isSuccess()) {
                MainSearchRoomFragment.this.pageIndex++;
                p188o00o00o0.OooO0OO oooO0OO = MainSearchRoomFragment.this.searchAdapter;
                if (oooO0OO != null && (data = oooO0OO.getData()) != 0) {
                    p522o0o0O0o.o000O0.OooO0Oo(data, OooOO0O.f24063Oooo0o);
                }
                p188o00o00o0.OooO0OO oooO0OO2 = MainSearchRoomFragment.this.searchAdapter;
                if (oooO0OO2 != null) {
                    oooO0OO2.notifyDataSetChanged();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final SearchVM getVm() {
        return (SearchVM) this.vm.getValue();
    }

    private final void initSearchHistory() {
        kb kbVarInflate = kb.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(kbVarInflate, "inflate(layoutInflater)");
        int i = 1;
        kbVarInflate.f49854OooO0O0.setOnClickListener(new l1(this, i));
        FrameLayout frameLayout = kbVarInflate.f49853OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "inflateHistory.root");
        p464o0Ooo0oO.o0000OO0 o0000oo1 = new p464o0Ooo0oO.o0000OO0(frameLayout);
        this.historyAdapter = o0000oo1;
        ConcatAdapter concatAdapter = this.adapter;
        Intrinsics.checkNotNull(o0000oo1);
        concatAdapter.OooO0O0(o0000oo1);
        getVm().getSearchHistoryList().observe(getViewLifecycleOwner(), new o0O0o00O(kbVarInflate, this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initSearchHistory$lambda-11, reason: not valid java name */
    public static final void m365initSearchHistory$lambda11(MainSearchRoomFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVm().clearSearchHistory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initSearchHistory$lambda-15, reason: not valid java name */
    public static final void m366initSearchHistory$lambda15(kb inflateHistory, MainSearchRoomFragment this$0, List list) {
        int i;
        Intrinsics.checkNotNullParameter(inflateHistory, "$inflateHistory");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        inflateHistory.f49855OooO0OO.removeAllViews();
        Iterator it = list.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            SearchHistoryTable searchHistoryTable = (SearchHistoryTable) it.next();
            View viewInflate = View.inflate(this$0.getContext(), R.layout.tv_search_history, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(context, R.layout.tv_search_history, null)");
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.tag_item_relative);
            View childAt = relativeLayout.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setText(searchHistoryTable.getTag());
            relativeLayout.setOnClickListener(new oOO0OO(this$0, i));
            inflateHistory.f49855OooO0OO.addView(relativeLayout);
        }
        if (list.isEmpty()) {
            p464o0Ooo0oO.o0000OO0 o0000oo1 = this$0.historyAdapter;
            if (o0000oo1 != null) {
                this$0.adapter.OooO0Oo(o0000oo1);
            }
            this$0.adapter.notifyDataSetChanged();
            return;
        }
        String str = this$0.searchText;
        if (str != null && !StringsKt.isBlank(str)) {
            i = 0;
        }
        if (i != 0) {
            p464o0Ooo0oO.o0000OO0 o0000oo2 = this$0.historyAdapter;
            if (o0000oo2 != null) {
                this$0.adapter.OooO00o(0, o0000oo2);
            }
            this$0.adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initSearchHistory$lambda-15$lambda-12, reason: not valid java name */
    public static final void m367initSearchHistory$lambda15$lambda12(MainSearchRoomFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view instanceof RelativeLayout) {
            View childAt = ((RelativeLayout) view).getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            CharSequence text = ((TextView) childAt).getText();
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
            this$0.getVm().getSearchText().postValue((String) text);
        }
    }

    private final void initView() {
        getBinding().f49544OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49543OooO0O0.Oooo0(new m4(this));
        initSearchHistory();
        lb lbVarInflate = lb.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lbVarInflate, "inflate(layoutInflater)");
        FrameLayout frameLayout = lbVarInflate.f49949OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "inflateHot.root");
        p464o0Ooo0oO.o0000OO0 o0000oo1 = new p464o0Ooo0oO.o0000OO0(frameLayout);
        this.hotTagAdapter = o0000oo1;
        ConcatAdapter concatAdapter = this.adapter;
        Intrinsics.checkNotNull(o0000oo1);
        concatAdapter.OooO0O0(o0000oo1);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(getContext());
        this.recommendAdapter = roomBaseAdapter;
        roomBaseAdapter.isUseEmpty(false);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter2 = this.recommendAdapter;
        if (roomBaseAdapter2 != null) {
            roomBaseAdapter2.f11362OooO0Oo = EnterRoomParentPage.Search_RecommendRoom;
        }
        ConcatAdapter concatAdapter2 = this.adapter;
        Intrinsics.checkNotNull(roomBaseAdapter2);
        concatAdapter2.OooO0O0(roomBaseAdapter2);
        getBinding().f49544OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49544OooO0OO.setAdapter(this.adapter);
        getBinding().f49544OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: o0oOoOoO.c2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MainSearchRoomFragment.m368initView$lambda10(this.f46844Oooo0o, view, motionEvent);
            }
        });
        this.searchAdapter = new OooO00o(getContext());
        getBinding().f49545OooO0Oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.No_search_results));
        getBinding().f49545OooO0Oo.setEmptyImage(R.drawable.ic_empty_search);
        StateLayout stateLayout = getBinding().f49545OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooO0O0(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-10, reason: not valid java name */
    public static final boolean m368initView$lambda10(MainSearchRoomFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onScrollListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-9, reason: not valid java name */
    public static final void m369initView$lambda9(MainSearchRoomFragment this$0, oO000Oo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this$0.searchText;
        if (str == null || StringsKt.isBlank(str)) {
            this$0.getBinding().f49543OooO0O0.setLoadComplete(true);
            return;
        }
        String str2 = this$0.searchText;
        Intrinsics.checkNotNull(str2);
        this$0.searchRoom(str2, false);
    }

    private final void loadRecommendRoom() {
        getVm().loadRecommendRoom().observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0OO(), null, null, false, 14));
    }

    private final void observerSearchText() {
        getVm().getSearchText().observe(getViewLifecycleOwner(), new p142o00OOooO.o00000O(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observerSearchText$lambda-8, reason: not valid java name */
    public static final void m370observerSearchText$lambda8(MainSearchRoomFragment this$0, String text) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (text == null || StringsKt.isBlank(text)) {
            this$0.getBinding().f49545OooO0Oo.OooO0Oo();
            p188o00o00o0.OooO0OO<RoomIndexModel> oooO0OO = this$0.searchAdapter;
            if (oooO0OO != null) {
                this$0.adapter.OooO0Oo(oooO0OO);
            }
            p188o00o00o0.OooO0OO<RoomIndexModel> oooO0OO2 = this$0.searchAdapter;
            if (oooO0OO2 != null) {
                oooO0OO2.setNewData(null);
            }
            p464o0Ooo0oO.o0000OO0 o0000oo1 = this$0.historyAdapter;
            if (o0000oo1 != null) {
                this$0.adapter.OooO0O0(o0000oo1);
            }
            p464o0Ooo0oO.o0000OO0 o0000oo2 = this$0.hotTagAdapter;
            if (o0000oo2 != null) {
                this$0.adapter.OooO0O0(o0000oo2);
            }
            RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = this$0.recommendAdapter;
            if (roomBaseAdapter != null) {
                this$0.adapter.OooO0O0(roomBaseAdapter);
            }
            this$0.adapter.notifyDataSetChanged();
            this$0.getBinding().f49543OooO0O0.OooOoOO(false);
        } else {
            p464o0Ooo0oO.o0000OO0 o0000oo3 = this$0.historyAdapter;
            if (o0000oo3 != null) {
                this$0.adapter.OooO0Oo(o0000oo3);
            }
            p464o0Ooo0oO.o0000OO0 o0000oo4 = this$0.hotTagAdapter;
            if (o0000oo4 != null) {
                this$0.adapter.OooO0Oo(o0000oo4);
            }
            RoomBaseAdapter<RoomIndexModel> roomBaseAdapter2 = this$0.recommendAdapter;
            if (roomBaseAdapter2 != null) {
                this$0.adapter.OooO0Oo(roomBaseAdapter2);
            }
            p188o00o00o0.OooO0OO<RoomIndexModel> oooO0OO3 = this$0.searchAdapter;
            if (oooO0OO3 != null) {
                this$0.adapter.OooO0O0(oooO0OO3);
            }
            String str = this$0.searchText;
            if (str == null || StringsKt.isBlank(str)) {
                this$0.getBinding().f49545OooO0Oo.OooO0oo();
            }
            Intrinsics.checkNotNullExpressionValue(text, "text");
            this$0.searchRoom(text, true);
        }
        this$0.searchText = text;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchRoom(String text, boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().searchRoom(text, this.pageIndex).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(isRefresh), new OooO(isRefresh, this), new OooOO0(isRefresh), false, 8));
    }

    @Nullable
    public final Function0<Unit> getOnScrollListener() {
        return this.onScrollListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadRecommendRoom();
        observerSearchText();
    }

    public final void setOnScrollListener(@Nullable Function0<Unit> function0) {
        this.onScrollListener = function0;
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public hb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        hb hbVarInflate = hb.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(hbVarInflate, "inflate(inflater)");
        return hbVarInflate;
    }
}
