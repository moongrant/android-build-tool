package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.model.RoomModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.material.appbar.AppBarLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserNameView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.TopRankResponse;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.TopDataFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.TopVM;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O00;
import p143o00OOooo.o00O0OO;
import p152o00Oo0o0.o00Oo00;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.mb;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0014R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010+\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TopDataFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/mb;", "", "initView", "initData", "", "Lcom/yalla/yalla/model/TopRankData;", "data", "setHeaderView", "topRankData", "showItem0", "showItem1", "showItem2", DeviceRequestsHelper.DEVICE_INFO_MODEL, "itemClick", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onResume", "onLazyInit", "Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "vm", "", "rankType", "Ljava/lang/String;", TopDataVM.DATA_TYPE_KEY, "adapterListData", "Ljava/util/List;", "adapterAllData", "Lcom/yalla/yalla/common/ui/view/SVGAView;", "mHeaderFrameSVGA1", "Lcom/yalla/yalla/common/ui/view/SVGAView;", "mHeaderFrameSVGA2", "mHeaderFrameSVGA3", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "topVM", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopDataFragment extends p503o0o00o00.OooO<mb> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private p188o00o00o0.OooO0OO<TopRankData> adapter;

    @Nullable
    private List<TopRankData> adapterAllData;
    private List<TopRankData> adapterListData;
    private String dataType;
    private SVGAView mHeaderFrameSVGA1;
    private SVGAView mHeaderFrameSVGA2;
    private SVGAView mHeaderFrameSVGA3;
    private String rankType;
    private TopVM topVM;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TopRankData f24249Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(TopRankData topRankData) {
            super(1);
            this.f24249Oooo0oO = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f24249Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.TopDataFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final TopDataFragment OooO00o(@NotNull String rankType, @NotNull String dataType) {
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intrinsics.checkNotNullParameter(dataType, "dataType");
            TopDataFragment topDataFragment = new TopDataFragment();
            Bundle bundle = new Bundle();
            Objects.requireNonNull(TopVM.INSTANCE);
            bundle.putString(TopVM.RANK_TYPE_KEY, rankType);
            bundle.putString(TopDataVM.DATA_TYPE_KEY, dataType);
            topDataFragment.setArguments(bundle);
            return topDataFragment;
        }
    }

    public static final class OooO0O0 extends p188o00o00o0.OooO0OO<TopRankData> {
        public OooO0O0(Context context) {
            super(context, R.layout.main_activity_top_item);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            TopRankData topRankData = (TopRankData) obj;
            if (oooO0o == null || topRankData == null) {
                return;
            }
            String str = TopDataFragment.this.rankType;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
                str = null;
            }
            Objects.requireNonNull(TopVM.INSTANCE);
            if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0oo());
                oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.item_top_header));
            } else {
                oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getContext());
                oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
                oooO00o3.f48427OooO00o = 0;
                oooO00o3.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.item_top_header));
            }
            oooO0o.OooOO0(R.id.tv_ranking, String.valueOf(topRankData.getNum()));
            UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.topDataUserTagView);
            SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.item_top_header_frame_svga);
            LifecycleOwner viewLifecycleOwner = TopDataFragment.this.getViewLifecycleOwner();
            String headFrameUrl = topRankData.getHeadFrameUrl();
            sVGAView.setImageDrawable(null);
            sVGAView.setVisibility(4);
            sVGAView.OooO0o0(false);
            if (!com.yalla.support.common.util.OooO0OO.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
                sVGAView.setVisibility(0);
                sVGAView.f21010OooooO0 = 0;
                sVGAView.OooO0oo(headFrameUrl, viewLifecycleOwner);
                sVGAView.OooO();
            }
            String str3 = TopDataFragment.this.rankType;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
            } else {
                str2 = str3;
            }
            if (!Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
                userTagView.OooO0o(topRankData.getVip(), topRankData.getVipLevel());
                userTagView.setSex(com.yalla.support.common.util.OooO.OooO0o0(topRankData.getSex()));
            }
            if (topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue()) {
                userTagView.setNameFlash(true);
            } else {
                userTagView.setNameFlash(false);
                userTagView.setNameTextColor(R.color.color_alpha_87_A1);
            }
            userTagView.setName(topRankData.getName());
            userTagView.setKaVip(topRankData.getKaVIPLv());
            oooO0o.OooOO0(R.id.tv_num, Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p168o00Ooo0.o0O0O00.OooO0Oo(topRankData.getNumber()));
        }
    }

    public static final class OooO0OO extends p654o0ooo.o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            p188o00o00o0.OooO0OO oooO0OO = TopDataFragment.this.adapter;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            oooO0OO.setFirstLoading(true);
            TopDataFragment.this.initData();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TopRankData f24253Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TopRankData topRankData) {
            super(0);
            this.f24253Oooo0oO = topRankData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = TopDataFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, activity, this.f24253Oooo0oO.getId(), false, 12);
            return null;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TopRankData f24255Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(TopRankData topRankData) {
            super(1);
            this.f24255Oooo0oO = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f24255Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TopRankData f24257Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(TopRankData topRankData) {
            super(1);
            this.f24257Oooo0oO = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f24257Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    public TopDataFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(TopDataVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24261Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24261Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final TopDataVM getVm() {
        return (TopDataVM) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initData() {
        this.adapterListData = new ArrayList();
        TopDataVM vm = getVm();
        String str = this.rankType;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str = null;
        }
        String str3 = this.dataType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TopDataVM.DATA_TYPE_KEY);
        } else {
            str2 = str3;
        }
        vm.rankingList(str, str2).observe(this, new o00O0OO(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-5, reason: not valid java name */
    public static final void m398initData$lambda5(TopDataFragment this$0, TopRankResponse topRankResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO = null;
        if (topRankResponse.getIsSuccess() && topRankResponse.getData() != 0) {
            TopVM topVM = this$0.topVM;
            if (topVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topVM");
                topVM = null;
            }
            topVM.getUpdateTopRank().postValue(this$0.getVm().getLoadedTopRankData());
            this$0.adapterAllData = (List) topRankResponse.getData();
            Model data = topRankResponse.getData();
            Intrinsics.checkNotNull(data);
            this$0.setHeaderView((List) data);
            List<TopRankData> list = this$0.adapterListData;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterListData");
                list = null;
            }
            list.clear();
            Model data2 = topRankResponse.getData();
            Intrinsics.checkNotNull(data2);
            list.addAll((Collection) data2);
            for (int i = 0; i < 3; i++) {
                if (list.size() > 0) {
                    list.remove(0);
                }
            }
            p188o00o00o0.OooO0OO<TopRankData> oooO0OO2 = this$0.adapter;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO2 = null;
            }
            List<TopRankData> list2 = this$0.adapterListData;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterListData");
                list2 = null;
            }
            oooO0OO2.setNewData(list2);
        }
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO3 = this$0.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO3;
        }
        oooO0OO.setLoadComplete();
    }

    @SuppressLint({"Range"})
    private final void initView() {
        ImageView imageView = getBinding().f50018OooO0Oo.f50168OooOOOO;
        if (p168o00Ooo0.oo000o.OooO0o0()) {
            Resources resources = imageView.getResources();
            TopDataVM vm = getVm();
            String str = this.rankType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
                str = null;
            }
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, vm.getHeadBgResource(str));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), bitmapDecodeResource.getConfig());
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Matrix matrix = new Matrix();
            matrix.setScale(-1.0f, 1.0f);
            matrix.postTranslate(bitmapDecodeResource.getWidth(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            canvas.drawBitmap(bitmapDecodeResource, matrix, paint);
            imageView.setImageBitmap(bitmapCreateBitmap);
        } else {
            TopDataVM vm2 = getVm();
            String str2 = this.rankType;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
                str2 = null;
            }
            imageView.setBackgroundResource(vm2.getHeadBgResource(str2));
        }
        OooO0O0 oooO0O0 = new OooO0O0(getContext());
        this.adapter = oooO0O0;
        oooO0O0.setFirstLoading(true);
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO = this.adapter;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setHeaderAndEmpty(true);
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO2 = this.adapter;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setEmptyFullScreen(true);
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO3 = this.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setOnItemClickListener(new o00O00(this, 4));
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO4 = this.adapter;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setLoadErrorClickListener(new OooO0OO());
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO5 = this.adapter;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO5 = null;
        }
        oooO0OO5.setEmptyFullScreen(true);
        getBinding().f50019OooO0o0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView = getBinding().f50019OooO0o0;
        p188o00o00o0.OooO0OO<TopRankData> oooO0OO6 = this.adapter;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO6 = null;
        }
        recyclerView.setAdapter(oooO0OO6);
        getBinding().f50015OooO00o.f12221o000O0O0.setBackgroundResource(R.color.white);
        getBinding().f50015OooO00o.OooOoo0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        getBinding().f50016OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0oOoOoO.e3
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                TopDataFragment.m400initView$lambda3(this.f46850OooO00o, appBarLayout, i);
            }
        });
        getBinding().f50016OooO0O0.setOutlineProvider(null);
        getBinding().f50017OooO0OO.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m399initView$lambda2(TopDataFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.TopRankData");
        this$0.itemClick((TopRankData) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m400initView$lambda3(TopDataFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float height = this$0.getBinding().f50018OooO0Oo.f50160OooO0o0.getHeight();
        if (Math.abs(i) <= height) {
            this$0.getBinding().f50018OooO0Oo.f50160OooO0o0.setAlpha((height - Math.abs(i)) / height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void itemClick(TopRankData model) {
        if (model == null) {
            return;
        }
        String str = this.rankType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str = null;
        }
        Objects.requireNonNull(TopVM.INSTANCE);
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            RoomModel roomModel = new RoomModel();
            roomModel.setRoomIp(model.getRoomServerIp());
            roomModel.setName(model.getName());
            roomModel.setId(p168o00Ooo0.o0O0O00.OooOOO0(model.getId()));
            RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Explore_Top);
            return;
        }
        OooO0o onLogin = new OooO0o(model);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }

    private final void setHeaderView(List<TopRankData> data) {
        showItem0(data.size() > 0 ? data.get(0) : null);
        showItem1(data.size() > 1 ? data.get(1) : null);
        showItem2(data.size() > 2 ? data.get(2) : null);
    }

    private final void showItem0(TopRankData topRankData) {
        NetImageView netImageView = getBinding().f50018OooO0Oo.f50176OooOo0O;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ilTop.userPhoto1");
        SVGAView sVGAView = getBinding().f50018OooO0Oo.f50159OooO0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ilTop.headerFrameSVGA1");
        this.mHeaderFrameSVGA1 = sVGAView;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        SVGAView sVGAView2 = this.mHeaderFrameSVGA1;
        String str = null;
        if (sVGAView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameSVGA1");
            sVGAView2 = null;
        }
        if (topRankData == null) {
            ConstraintLayout constraintLayout = getBinding().f50018OooO0Oo.f50156OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilTop.clTopRank1");
            com.yalla.support.common.util.o00O0O.OooO0O0(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = getBinding().f50018OooO0Oo.f50156OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilTop.clTopRank1");
        com.yalla.support.common.util.o00O0O.OooO(constraintLayout2);
        ConstraintLayout constraintLayout3 = getBinding().f50018OooO0Oo.f50156OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.ilTop.clTopRank1");
        com.yalla.support.common.util.o00O0O.OooO0Oo(constraintLayout3, new OooO(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        Objects.requireNonNull(TopVM.INSTANCE);
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.f48441OooOOOo = R.drawable.icon_head_default;
            oooO00o.f48431OooO0o = R.drawable.icon_head_default;
            oooO00o.f48454OooOoo0 = 2;
            oooO00o.OooO0oO(12);
            oooO00o.OooO0O0();
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(netImageView);
        } else {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0OO());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o(netImageView);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView2.setImageDrawable(null);
        sVGAView2.setVisibility(4);
        sVGAView2.OooO0o0(false);
        if (!com.yalla.support.common.util.OooO0OO.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView2.setVisibility(0);
            sVGAView2.f21010OooooO0 = 0;
            sVGAView2.OooO0oo(headFrameUrl, viewLifecycleOwner);
            sVGAView2.OooO();
        }
        getBinding().f50018OooO0Oo.f50154OooO.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f50018OooO0Oo.f50169OooOOOo.setText(topRankData.getName());
        getBinding().f50018OooO0Oo.f50169OooOOOo.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        if (topRankData.getKaVIPLv() > VipLevel.Vip0.getValue()) {
            ImageView imageView = getBinding().f50018OooO0Oo.f50165OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ilTop.ivKaVip1");
            com.yalla.support.common.util.o00O0O.OooO(imageView);
            getBinding().f50018OooO0Oo.f50165OooOO0o.setImageResource(VipLevel.INSTANCE.OooO00o(topRankData.getKaVIPLv()));
        } else {
            ImageView imageView2 = getBinding().f50018OooO0Oo.f50165OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ilTop.ivKaVip1");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView2);
        }
        UserNameView userNameView = getBinding().f50018OooO0Oo.f50169OooOOOo;
        ViewLocation viewLocation = ViewLocation.end;
        o00Oo00.OooO00o(userNameView, null, viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50169OooOOOo, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_male), viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50169OooOOOo, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_female), viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        } else {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50169OooOOOo, null, viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        }
        getBinding().f50018OooO0Oo.f50172OooOOoo.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p168o00Ooo0.o0O0O00.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f50018OooO0Oo.f50172OooOOoo;
        TopDataVM vm = getVm();
        String str3 = this.rankType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
        } else {
            str = str3;
        }
        textView.setBackgroundResource(vm.getTextResource(str));
    }

    private final void showItem1(TopRankData topRankData) {
        SVGAView sVGAView = getBinding().f50018OooO0Oo.f50161OooO0oO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ilTop.headerFrameSVGA2");
        this.mHeaderFrameSVGA2 = sVGAView;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        SVGAView sVGAView2 = this.mHeaderFrameSVGA2;
        String str = null;
        if (sVGAView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameSVGA2");
            sVGAView2 = null;
        }
        if (topRankData == null) {
            ConstraintLayout constraintLayout = getBinding().f50018OooO0Oo.f50157OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilTop.clTopRank2");
            com.yalla.support.common.util.o00O0O.OooO0O0(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = getBinding().f50018OooO0Oo.f50157OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilTop.clTopRank2");
        com.yalla.support.common.util.o00O0O.OooO(constraintLayout2);
        ConstraintLayout constraintLayout3 = getBinding().f50018OooO0Oo.f50157OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.ilTop.clTopRank2");
        com.yalla.support.common.util.o00O0O.OooO0Oo(constraintLayout3, new OooOO0(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        Objects.requireNonNull(TopVM.INSTANCE);
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.f48441OooOOOo = R.drawable.icon_head_default;
            oooO00o.f48431OooO0o = R.drawable.icon_head_default;
            oooO00o.f48454OooOoo0 = 2;
            oooO00o.OooO0oO(12);
            oooO00o.OooO0O0();
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(getBinding().f50018OooO0Oo.f50177OooOo0o);
        } else {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0OO());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o(getBinding().f50018OooO0Oo.f50177OooOo0o);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView2.setImageDrawable(null);
        sVGAView2.setVisibility(4);
        sVGAView2.OooO0o0(false);
        if (!com.yalla.support.common.util.OooO0OO.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView2.setVisibility(0);
            sVGAView2.f21010OooooO0 = 0;
            sVGAView2.OooO0oo(headFrameUrl, viewLifecycleOwner);
            sVGAView2.OooO();
        }
        getBinding().f50018OooO0Oo.f50163OooOO0.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f50018OooO0Oo.f50171OooOOo0.setText(topRankData.getName());
        getBinding().f50018OooO0Oo.f50171OooOOo0.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        if (topRankData.getKaVIPLv() > VipLevel.Vip0.getValue()) {
            ImageView imageView = getBinding().f50018OooO0Oo.f50167OooOOO0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ilTop.ivKaVip2");
            com.yalla.support.common.util.o00O0O.OooO(imageView);
            getBinding().f50018OooO0Oo.f50167OooOOO0.setImageResource(VipLevel.INSTANCE.OooO00o(topRankData.getKaVIPLv()));
        } else {
            ImageView imageView2 = getBinding().f50018OooO0Oo.f50167OooOOO0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ilTop.ivKaVip2");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView2);
        }
        UserNameView userNameView = getBinding().f50018OooO0Oo.f50171OooOOo0;
        ViewLocation viewLocation = ViewLocation.end;
        o00Oo00.OooO00o(userNameView, null, viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50171OooOOo0, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_male), viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50171OooOOo0, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_female), viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        }
        getBinding().f50018OooO0Oo.f50171OooOOo0.setText(topRankData.getName());
        getBinding().f50018OooO0Oo.f50175OooOo00.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p168o00Ooo0.o0O0O00.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f50018OooO0Oo.f50175OooOo00;
        TopDataVM vm = getVm();
        String str3 = this.rankType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
        } else {
            str = str3;
        }
        textView.setBackgroundResource(vm.getTextResource(str));
    }

    private final void showItem2(TopRankData topRankData) {
        SVGAView sVGAView = getBinding().f50018OooO0Oo.f50162OooO0oo;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ilTop.headerFrameSVGA3");
        this.mHeaderFrameSVGA3 = sVGAView;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        SVGAView sVGAView2 = this.mHeaderFrameSVGA3;
        String str = null;
        if (sVGAView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameSVGA3");
            sVGAView2 = null;
        }
        if (topRankData == null) {
            ConstraintLayout constraintLayout = getBinding().f50018OooO0Oo.f50158OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilTop.clTopRank3");
            com.yalla.support.common.util.o00O0O.OooO0O0(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = getBinding().f50018OooO0Oo.f50158OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilTop.clTopRank3");
        com.yalla.support.common.util.o00O0O.OooO(constraintLayout2);
        ConstraintLayout constraintLayout3 = getBinding().f50018OooO0Oo.f50158OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.ilTop.clTopRank3");
        com.yalla.support.common.util.o00O0O.OooO0Oo(constraintLayout3, new OooOO0O(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        Objects.requireNonNull(TopVM.INSTANCE);
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.f48441OooOOOo = R.drawable.icon_head_default;
            oooO00o.f48431OooO0o = R.drawable.icon_head_default;
            oooO00o.f48454OooOoo0 = 2;
            oooO00o.OooO0oO(12);
            oooO00o.OooO0O0();
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(getBinding().f50018OooO0Oo.f50173OooOo);
        } else {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0OO());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o(getBinding().f50018OooO0Oo.f50173OooOo);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView2.setImageDrawable(null);
        sVGAView2.setVisibility(4);
        sVGAView2.OooO0o0(false);
        if (!com.yalla.support.common.util.OooO0OO.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView2.setVisibility(0);
            sVGAView2.f21010OooooO0 = 0;
            sVGAView2.OooO0oo(headFrameUrl, viewLifecycleOwner);
            sVGAView2.OooO();
        }
        getBinding().f50018OooO0Oo.f50164OooOO0O.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f50018OooO0Oo.f50170OooOOo.setText(topRankData.getName());
        getBinding().f50018OooO0Oo.f50170OooOOo.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        if (topRankData.getKaVIPLv() > VipLevel.Vip0.getValue()) {
            ImageView imageView = getBinding().f50018OooO0Oo.f50166OooOOO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ilTop.ivKaVip3");
            com.yalla.support.common.util.o00O0O.OooO(imageView);
            getBinding().f50018OooO0Oo.f50166OooOOO.setImageResource(VipLevel.INSTANCE.OooO00o(topRankData.getKaVIPLv()));
        } else {
            ImageView imageView2 = getBinding().f50018OooO0Oo.f50166OooOOO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ilTop.ivKaVip3");
            com.yalla.support.common.util.o00O0O.OooO00o(imageView2);
        }
        UserNameView userNameView = getBinding().f50018OooO0Oo.f50170OooOOo;
        ViewLocation viewLocation = ViewLocation.end;
        o00Oo00.OooO00o(userNameView, null, viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50170OooOOo, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_male), viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50170OooOOo, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_female), viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        } else {
            o00Oo00.OooO00o(getBinding().f50018OooO0Oo.f50170OooOOo, null, viewLocation, p168o00Ooo0.oo000o.OooO0o0());
        }
        getBinding().f50018OooO0Oo.f50170OooOOo.setText(topRankData.getName());
        getBinding().f50018OooO0Oo.f50174OooOo0.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p168o00Ooo0.o0O0O00.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f50018OooO0Oo.f50174OooOo0;
        TopDataVM vm = getVm();
        String str3 = this.rankType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
        } else {
            str = str3;
        }
        textView.setBackgroundResource(vm.getTextResource(str));
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.topVM = (TopVM) new ViewModelProvider(fragmentActivityRequireActivity).get(TopVM.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TopVM.Companion companion = TopVM.INSTANCE;
            Objects.requireNonNull(companion);
            String str = TopVM.RANK_TYPE_KEY;
            Objects.requireNonNull(companion);
            string = arguments.getString(str, TopVM.TYPE_ROOM_GIFT);
        } else {
            string = null;
        }
        if (string == null) {
            Objects.requireNonNull(TopVM.INSTANCE);
            string = TopVM.TYPE_ROOM_GIFT;
        }
        this.rankType = string;
        Bundle arguments2 = getArguments();
        String str2 = TopDataVM.TYPE_DAY;
        String string2 = arguments2 != null ? arguments2.getString(TopDataVM.DATA_TYPE_KEY, TopDataVM.TYPE_DAY) : null;
        if (string2 != null) {
            Intrinsics.checkNotNullExpressionValue(string2, "arguments?.getString(DAT…EY, TYPE_DAY) ?: TYPE_DAY");
            str2 = string2;
        }
        this.dataType = str2;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TopVM topVM = this.topVM;
        if (topVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topVM");
            topVM = null;
        }
        topVM.getUpdateTopRank().postValue(getVm().getLoadedTopRankData());
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public mb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        mb mbVarInflate = mb.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(mbVarInflate, "inflate(inflater)");
        return mbVarInflate;
    }
}
