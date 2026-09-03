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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.material.appbar.AppBarLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.TopRankResponse;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.UserNameView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import com.yalla.yalla.ui.vm.main.TopVM;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO00o00;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p573o0oOoOO.o0O0o0;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0014R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TopDataFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO00o00;", "", "initView", "initData", "", "Lcom/yalla/yalla/model/TopRankData;", "data", "setHeaderView", "topRankData", "showItem0", "showItem1", "showItem2", DeviceRequestsHelper.DEVICE_INFO_MODEL, "itemClick", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onResume", "onLazyInit", "Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "vm", "", "rankType", "Ljava/lang/String;", TopDataVM.DATA_TYPE_KEY, "Lo0oOoO0/o0000oo;", "adapter", "Lo0oOoO0/o0000oo;", "adapterListData", "Ljava/util/List;", "adapterAllData", "Lcom/code/android/uikit/svga/SVGAView;", "mHeaderFrameSVGA1", "Lcom/code/android/uikit/svga/SVGAView;", "mHeaderFrameSVGA2", "mHeaderFrameSVGA3", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "topVM", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopDataFragment.kt\ncom/yalla/yalla/ui/fragment/TopDataFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n106#2,15:430\n1#3:445\n*S KotlinDebug\n*F\n+ 1 TopDataFragment.kt\ncom/yalla/yalla/ui/fragment/TopDataFragment\n*L\n54#1:430,15\n*E\n"})
public final class TopDataFragment extends p527o0o0OO0o.o000O<oO00o00> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private p571o0oOoO0.o0000oo<TopRankData> adapter;

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

    public static final class OooO extends o0OOOO0o {
        public OooO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            TopDataFragment topDataFragment = TopDataFragment.this;
            p571o0oOoO0.o0000oo o0000ooVar = topDataFragment.adapter;
            if (o0000ooVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o0000ooVar = null;
            }
            o0000ooVar.Oooo00O(true);
            topDataFragment.initData();
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.TopDataFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static TopDataFragment OooO00o(@NotNull String rankType, @NotNull String dataType) {
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intrinsics.checkNotNullParameter(dataType, "dataType");
            TopDataFragment topDataFragment = new TopDataFragment();
            Bundle bundle = new Bundle();
            TopVM.INSTANCE.getClass();
            bundle.putString(TopVM.RANK_TYPE_KEY, rankType);
            bundle.putString(TopDataVM.DATA_TYPE_KEY, dataType);
            topDataFragment.setArguments(bundle);
            return topDataFragment;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<TopRankResponse>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<TopRankResponse> apiResult) {
            ApiResult<TopRankResponse> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            p571o0oOoO0.o0000oo o0000ooVar = TopDataFragment.this.adapter;
            if (o0000ooVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o0000ooVar = null;
            }
            o0000ooVar.Oooo0O0(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<TopRankResponse, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TopRankResponse topRankResponse) {
            TopRankResponse topRankResponse2 = topRankResponse;
            List list = null;
            if ((topRankResponse2 != null ? topRankResponse2.getData() : null) != null) {
                TopDataFragment topDataFragment = TopDataFragment.this;
                TopVM topVM = topDataFragment.topVM;
                if (topVM == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topVM");
                    topVM = null;
                }
                topVM.getUpdateTopRank().postValue(topDataFragment.getVm().getLoadedTopRankData());
                topDataFragment.adapterAllData = topRankResponse2.getData();
                topDataFragment.setHeaderView(topRankResponse2.getData());
                List list2 = topDataFragment.adapterListData;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterListData");
                    list2 = null;
                }
                list2.clear();
                list2.addAll(topRankResponse2.getData());
                for (int i = 0; i < 3; i++) {
                    if (list2.size() > 0) {
                        list2.remove(0);
                    }
                }
                p571o0oOoO0.o0000oo o0000ooVar = topDataFragment.adapter;
                if (o0000ooVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o0000ooVar = null;
                }
                List list3 = topDataFragment.adapterListData;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterListData");
                } else {
                    list = list3;
                }
                o0000ooVar.OooOoO0(list);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends p571o0oOoO0.o0000oo<TopRankData> {
        public OooO0o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            TopRankData topRankData = (TopRankData) obj;
            if (viewHolder == null || topRankData == null) {
                return;
            }
            TopDataFragment topDataFragment = TopDataFragment.this;
            String str = topDataFragment.rankType;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
                str = null;
            }
            TopVM.INSTANCE.getClass();
            boolean zAreEqual = Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT);
            Context context = this.f56423OooOo;
            if (zAreEqual) {
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(context);
                oooO00o.OooO00o(d1.OooO0o());
                oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.item_top_header));
            } else {
                o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(context);
                oooO00o2.OooO00o(d1.OooO0OO());
                oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
                oooO00o2.f43124OooO00o = 0;
                oooO00o2.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.item_top_header));
            }
            viewHolder.setText(p562o0oOo000.o0OO00O.tv_ranking, String.valueOf(topRankData.getNum()));
            UserTagView userTagView = (UserTagView) viewHolder.getView(p562o0oOo000.o0OO00O.topDataUserTagView);
            SVGAView sVGAView = (SVGAView) viewHolder.getView(p562o0oOo000.o0OO00O.item_top_header_frame_svga);
            LifecycleOwner viewLifecycleOwner = topDataFragment.getViewLifecycleOwner();
            String headFrameUrl = topRankData.getHeadFrameUrl();
            sVGAView.setImageDrawable(null);
            sVGAView.setVisibility(4);
            sVGAView.OooO0oO(false);
            if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
                sVGAView.setVisibility(0);
                sVGAView.f13232OooOooO = 0;
                sVGAView.setImageResource(0);
                sVGAView.OooOO0O(headFrameUrl, viewLifecycleOwner);
                sVGAView.OooOO0o();
            }
            String str3 = topDataFragment.rankType;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
            } else {
                str2 = str3;
            }
            if (!Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
                userTagView.OooO0oO(topRankData.getVip(), topRankData.getVipLevel());
                userTagView.setSex(com.code.android.util.o0OoOo0.OooO0o(0, topRankData.getSex()));
            }
            if (topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue()) {
                userTagView.setNameFlash(true);
            } else {
                userTagView.setNameFlash(false);
                userTagView.setNameTextColor(p562o0oOo000.o0OOO0o.color_alpha_87_A1);
            }
            userTagView.setName(topRankData.getName());
            userTagView.OooO0Oo(topRankData.getKaVIPLv(), true, topDataFragment.getViewLifecycleOwner());
            Intrinsics.checkNotNull(userTagView);
            UserTagView.OooOO0o(userTagView, topDataFragment.getViewLifecycleOwner(), Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8);
            viewHolder.setText(p562o0oOo000.o0OO00O.tv_num, Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : o0O0O0Oo.OooO0Oo(topRankData.getNumber()));
        }
    }

    @SourceDebugExtension({"SMAP\nTopDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopDataFragment.kt\ncom/yalla/yalla/ui/fragment/TopDataFragment$itemClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f27802OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(TopRankData topRankData) {
            super(0);
            this.f27802OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = TopDataFragment.this.getActivity();
            if (activity != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activity, this.f27802OooO0o0.getId(), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f27804OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(TopRankData topRankData) {
            super(1);
            this.f27804OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f27804OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f27806OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(TopRankData topRankData) {
            super(1);
            this.f27806OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f27806OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f27808OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(TopRankData topRankData) {
            super(1);
            this.f27808OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f27808OooO0o0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$1] */
    public TopDataFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(TopDataVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27812OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27812OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TopDataVM getVm() {
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
        LiveData<ApiResult<TopRankResponse>> liveDataRankingList = vm.rankingList(str, str2);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        p384o0OOoo0O.o00O0O.OooO0Oo(liveDataRankingList, viewLifecycleOwner, false, new OooO0O0(), null, new OooO0OO(), 10);
    }

    @SuppressLint({"Range"})
    private final void initView() {
        ImageView imageView = getBinding().f44830OooO0Oo.f44957OooOOo;
        if (p595o0oo00O.OooOo00.OooO0o0()) {
            Resources resources = imageView.getResources();
            TopDataVM vm = getVm();
            String str = this.rankType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
                str = null;
            }
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, vm.getHeadBgResource(str));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), bitmapDecodeResource.getConfig());
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Matrix matrix = new Matrix();
            matrix.setScale(-1.0f, 1.0f);
            matrix.postTranslate(bitmapDecodeResource.getWidth(), 0.0f);
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
        OooO0o oooO0o = new OooO0o(getContext(), p562o0oOo000.oo0o0Oo.main_activity_top_item);
        this.adapter = oooO0o;
        oooO0o.Oooo00O(true);
        p571o0oOoO0.o0000oo<TopRankData> o0000ooVar = this.adapter;
        if (o0000ooVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar = null;
        }
        o0000ooVar.OooOo0o();
        p571o0oOoO0.o0000oo<TopRankData> o0000ooVar2 = this.adapter;
        if (o0000ooVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar2 = null;
        }
        o0000ooVar2.OooOooO(true);
        p571o0oOoO0.o0000oo<TopRankData> o0000ooVar3 = this.adapter;
        if (o0000ooVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar3 = null;
        }
        o0000ooVar3.f13176OooO0o = new androidx.media3.session.o0000Ooo(this, 3);
        p571o0oOoO0.o0000oo<TopRankData> o0000ooVar4 = this.adapter;
        if (o0000ooVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar4 = null;
        }
        o0000ooVar4.Oooo0OO(new OooO());
        p571o0oOoO0.o0000oo<TopRankData> o0000ooVar5 = this.adapter;
        if (o0000ooVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar5 = null;
        }
        o0000ooVar5.OooOooO(true);
        getBinding().f44831OooO0o0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView = getBinding().f44831OooO0o0;
        p571o0oOoO0.o0000oo<TopRankData> o0000ooVar6 = this.adapter;
        if (o0000ooVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar6 = null;
        }
        recyclerView.setAdapter(o0000ooVar6);
        getBinding().f44827OooO00o.f30719o00000o0.setBackgroundResource(p562o0oOo000.o0OOO0o.white);
        getBinding().f44827OooO00o.OooOo0(0.0f);
        getBinding().f44828OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: com.yalla.yalla.ui.fragment.o000O000
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                TopDataFragment.initView$lambda$3(this.f28380OooO00o, appBarLayout, i);
            }
        });
        getBinding().f44828OooO0O0.setOutlineProvider(null);
        getBinding().f44829OooO0OO.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(TopDataFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.TopRankData");
        this$0.itemClick((TopRankData) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(TopDataFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float height = this$0.getBinding().f44830OooO0Oo.f44947OooO0o0.getHeight();
        if (Math.abs(i) <= height) {
            this$0.getBinding().f44830OooO0Oo.f44947OooO0o0.setAlpha((height - Math.abs(i)) / height);
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
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            RoomModel roomModel = new RoomModel();
            roomModel.setId(o0O0O0Oo.OooOO0o(model.getId()));
            roomModel.setRoomIp(model.getRoomServerIp());
            roomModel.websocketaddr = model.getWebsocketaddr();
            roomModel.setName(model.getName());
            MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
            p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Explore_Top);
            return;
        }
        OooOO0 onLogin = new OooOO0(model);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHeaderView(List<TopRankData> data) {
        showItem0(data.size() > 0 ? data.get(0) : null);
        showItem1(data.size() > 1 ? data.get(1) : null);
        showItem2(data.size() > 2 ? data.get(2) : null);
    }

    private final void showItem0(TopRankData topRankData) {
        NetImageView userPhoto1 = getBinding().f44830OooO0Oo.f44966OooOoO0;
        Intrinsics.checkNotNullExpressionValue(userPhoto1, "userPhoto1");
        SVGAView headerFrameSVGA1 = getBinding().f44830OooO0Oo.f44946OooO0o;
        Intrinsics.checkNotNullExpressionValue(headerFrameSVGA1, "headerFrameSVGA1");
        this.mHeaderFrameSVGA1 = headerFrameSVGA1;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        SVGAView sVGAView = this.mHeaderFrameSVGA1;
        String str = null;
        if (sVGAView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameSVGA1");
            sVGAView = null;
        }
        if (topRankData == null) {
            ConstraintLayout clTopRank1 = getBinding().f44830OooO0Oo.f44943OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clTopRank1, "clTopRank1");
            com.code.android.util.o000O.OooO0OO(clTopRank1);
            return;
        }
        ConstraintLayout clTopRank2 = getBinding().f44830OooO0Oo.f44943OooO0O0;
        Intrinsics.checkNotNullExpressionValue(clTopRank2, "clTopRank1");
        com.code.android.util.o000O.OooOOOO(clTopRank2);
        ConstraintLayout clTopRank3 = getBinding().f44830OooO0Oo.f44943OooO0O0;
        Intrinsics.checkNotNullExpressionValue(clTopRank3, "clTopRank1");
        com.code.android.util.o000O.OooO0oo(clTopRank3, new OooOO0O(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(getContext());
            int i = p562o0oOo000.o0Oo0oo.icon_head_default;
            oooO00o.f43138OooOOOo = i;
            oooO00o.f43128OooO0o = i;
            oooO00o.f43151OooOoo0 = 2;
            oooO00o.OooO0o0(12);
            oooO00o.f43152OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o.f43153OooOooo = -1;
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(userPhoto1);
        } else {
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(getContext());
            oooO00o2.OooO00o(d1.OooO00o());
            oooO00o2.f43152OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o2.f43153OooOooo = -1;
            oooO00o2.f43155Oooo00O = true;
            oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(userPhoto1);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView.setVisibility(0);
            sVGAView.f13232OooOooO = 0;
            sVGAView.setImageResource(0);
            sVGAView.OooOO0O(headFrameUrl, viewLifecycleOwner);
            sVGAView.OooOO0o();
        }
        getBinding().f44830OooO0Oo.f44941OooO.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f44830OooO0Oo.f44959OooOOoo.setText(topRankData.getName());
        getBinding().f44830OooO0Oo.f44959OooOOoo.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        getBinding().f44830OooO0Oo.f44952OooOO0o.OooOOOO(topRankData.getKaVIPLv(), true, getViewLifecycleOwner());
        getBinding().f44830OooO0Oo.f44955OooOOOO.OooO0O0(this, Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8.0f);
        UserNameView userNameView = getBinding().f44830OooO0Oo.f44959OooOOoo;
        ViewLocation viewLocation = ViewLocation.end;
        o0O0o0.OooO00o(userNameView, null, viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44959OooOOoo, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_male), viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44959OooOOoo, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_female), viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        } else {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44959OooOOoo, null, viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        }
        getBinding().f44830OooO0Oo.f44963OooOo0O.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : o0O0O0Oo.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f44830OooO0Oo.f44963OooOo0O;
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
        SVGAView headerFrameSVGA2 = getBinding().f44830OooO0Oo.f44948OooO0oO;
        Intrinsics.checkNotNullExpressionValue(headerFrameSVGA2, "headerFrameSVGA2");
        this.mHeaderFrameSVGA2 = headerFrameSVGA2;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        SVGAView sVGAView = this.mHeaderFrameSVGA2;
        String str = null;
        if (sVGAView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameSVGA2");
            sVGAView = null;
        }
        if (topRankData == null) {
            ConstraintLayout clTopRank2 = getBinding().f44830OooO0Oo.f44944OooO0OO;
            Intrinsics.checkNotNullExpressionValue(clTopRank2, "clTopRank2");
            com.code.android.util.o000O.OooO0OO(clTopRank2);
            return;
        }
        ConstraintLayout clTopRank3 = getBinding().f44830OooO0Oo.f44944OooO0OO;
        Intrinsics.checkNotNullExpressionValue(clTopRank3, "clTopRank2");
        com.code.android.util.o000O.OooOOOO(clTopRank3);
        ConstraintLayout clTopRank4 = getBinding().f44830OooO0Oo.f44944OooO0OO;
        Intrinsics.checkNotNullExpressionValue(clTopRank4, "clTopRank2");
        com.code.android.util.o000O.OooO0oo(clTopRank4, new OooOOO0(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(getContext());
            int i = p562o0oOo000.o0Oo0oo.icon_head_default;
            oooO00o.f43138OooOOOo = i;
            oooO00o.f43128OooO0o = i;
            oooO00o.f43151OooOoo0 = 2;
            oooO00o.OooO0o0(12);
            oooO00o.f43152OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o.f43153OooOooo = -1;
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(getBinding().f44830OooO0Oo.f44965OooOoO);
        } else {
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(getContext());
            oooO00o2.OooO00o(d1.OooO00o());
            oooO00o2.f43152OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o2.f43153OooOooo = -1;
            oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(getBinding().f44830OooO0Oo.f44965OooOoO);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView.setVisibility(0);
            sVGAView.f13232OooOooO = 0;
            sVGAView.setImageResource(0);
            sVGAView.OooOO0O(headFrameUrl, viewLifecycleOwner);
            sVGAView.OooOO0o();
        }
        getBinding().f44830OooO0Oo.f44950OooOO0.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f44830OooO0Oo.f44962OooOo00.setText(topRankData.getName());
        getBinding().f44830OooO0Oo.f44962OooOo00.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        getBinding().f44830OooO0Oo.f44954OooOOO0.OooOOOO(topRankData.getKaVIPLv(), true, getViewLifecycleOwner());
        getBinding().f44830OooO0Oo.f44956OooOOOo.OooO0O0(this, Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8.0f);
        UserNameView userNameView = getBinding().f44830OooO0Oo.f44962OooOo00;
        ViewLocation viewLocation = ViewLocation.end;
        o0O0o0.OooO00o(userNameView, null, viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44962OooOo00, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_male), viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44962OooOo00, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_female), viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        }
        getBinding().f44830OooO0Oo.f44962OooOo00.setText(topRankData.getName());
        getBinding().f44830OooO0Oo.f44964OooOo0o.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : o0O0O0Oo.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f44830OooO0Oo.f44964OooOo0o;
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
        SVGAView headerFrameSVGA3 = getBinding().f44830OooO0Oo.f44949OooO0oo;
        Intrinsics.checkNotNullExpressionValue(headerFrameSVGA3, "headerFrameSVGA3");
        this.mHeaderFrameSVGA3 = headerFrameSVGA3;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        SVGAView sVGAView = this.mHeaderFrameSVGA3;
        String str = null;
        if (sVGAView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameSVGA3");
            sVGAView = null;
        }
        if (topRankData == null) {
            ConstraintLayout clTopRank3 = getBinding().f44830OooO0Oo.f44945OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(clTopRank3, "clTopRank3");
            com.code.android.util.o000O.OooO0OO(clTopRank3);
            return;
        }
        ConstraintLayout clTopRank4 = getBinding().f44830OooO0Oo.f44945OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(clTopRank4, "clTopRank3");
        com.code.android.util.o000O.OooOOOO(clTopRank4);
        ConstraintLayout clTopRank5 = getBinding().f44830OooO0Oo.f44945OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(clTopRank5, "clTopRank3");
        com.code.android.util.o000O.OooO0oo(clTopRank5, new OooOOO(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(getContext());
            int i = p562o0oOo000.o0Oo0oo.icon_head_default;
            oooO00o.f43138OooOOOo = i;
            oooO00o.f43128OooO0o = i;
            oooO00o.f43151OooOoo0 = 2;
            oooO00o.OooO0o0(12);
            oooO00o.f43152OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o.f43153OooOooo = -1;
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(getBinding().f44830OooO0Oo.f44967OooOoOO);
        } else {
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(getContext());
            oooO00o2.OooO00o(d1.OooO00o());
            oooO00o2.f43152OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o2.f43153OooOooo = -1;
            oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(topRankData.getImageUrl());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(getBinding().f44830OooO0Oo.f44967OooOoOO);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView.setVisibility(0);
            sVGAView.f13232OooOooO = 0;
            sVGAView.setImageResource(0);
            sVGAView.OooOO0O(headFrameUrl, viewLifecycleOwner);
            sVGAView.OooOO0o();
        }
        getBinding().f44830OooO0Oo.f44951OooOO0O.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f44830OooO0Oo.f44961OooOo0.setText(topRankData.getName());
        getBinding().f44830OooO0Oo.f44961OooOo0.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        getBinding().f44830OooO0Oo.f44953OooOOO.OooOOOO(topRankData.getKaVIPLv(), true, getViewLifecycleOwner());
        getBinding().f44830OooO0Oo.f44958OooOOo0.OooO0O0(this, Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8.0f);
        UserNameView userNameView = getBinding().f44830OooO0Oo.f44961OooOo0;
        ViewLocation viewLocation = ViewLocation.end;
        o0O0o0.OooO00o(userNameView, null, viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44961OooOo0, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_male), viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44961OooOo0, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_female), viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        } else {
            o0O0o0.OooO00o(getBinding().f44830OooO0Oo.f44961OooOo0, null, viewLocation, p595o0oo00O.OooOo00.OooO0o0());
        }
        getBinding().f44830OooO0Oo.f44961OooOo0.setText(topRankData.getName());
        getBinding().f44830OooO0Oo.f44960OooOo.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : o0O0O0Oo.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f44830OooO0Oo.f44960OooOo;
        TopDataVM vm = getVm();
        String str3 = this.rankType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
        } else {
            str = str3;
        }
        textView.setBackgroundResource(vm.getTextResource(str));
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.topVM = (TopVM) new ViewModelProvider(fragmentActivityRequireActivity).get(TopVM.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TopVM.Companion companion = TopVM.INSTANCE;
            companion.getClass();
            String str = TopVM.RANK_TYPE_KEY;
            companion.getClass();
            string = arguments.getString(str, TopVM.TYPE_ROOM_GIFT);
        } else {
            string = null;
        }
        if (string == null) {
            TopVM.INSTANCE.getClass();
            string = TopVM.TYPE_ROOM_GIFT;
        }
        this.rankType = string;
        Bundle arguments2 = getArguments();
        String str2 = TopDataVM.TYPE_DAY;
        String string2 = arguments2 != null ? arguments2.getString(TopDataVM.DATA_TYPE_KEY, TopDataVM.TYPE_DAY) : null;
        if (string2 != null) {
            Intrinsics.checkNotNull(string2);
            str2 = string2;
        }
        this.dataType = str2;
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    @Override // p527o0o0OO0o.o000O, p586o0oOooO0.oO0Oo0o0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TopVM topVM = this.topVM;
        if (topVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topVM");
            topVM = null;
        }
        topVM.getUpdateTopRank().postValue(getVm().getLoadedTopRankData());
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00o00 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00o00 oo00o00Inflate = oO00o00.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(oo00o00Inflate, "inflate(...)");
        return oo00o00Inflate;
    }
}
