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
import p466o0Oooo0o.oo00o;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.t4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0014R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/yalla/yalla/ui/fragment/TopDataFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/t4;", "", "initView", "initData", "", "Lcom/yalla/yalla/model/TopRankData;", "data", "setHeaderView", "topRankData", "showItem0", "showItem1", "showItem2", DeviceRequestsHelper.DEVICE_INFO_MODEL, "itemClick", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onResume", "onLazyInit", "Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "vm", "", "rankType", "Ljava/lang/String;", TopDataVM.DATA_TYPE_KEY, "Lo0oOo0OO/o000O;", "adapter", "Lo0oOo0OO/o000O;", "adapterListData", "Ljava/util/List;", "adapterAllData", "Lcom/code/android/uikit/svga/SVGAView;", "mHeaderFrameSVGA1", "Lcom/code/android/uikit/svga/SVGAView;", "mHeaderFrameSVGA2", "mHeaderFrameSVGA3", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "topVM", "Lcom/yalla/yalla/ui/vm/main/TopVM;", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopDataFragment.kt\ncom/yalla/yalla/ui/fragment/TopDataFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n106#2,15:430\n1#3:445\n*S KotlinDebug\n*F\n+ 1 TopDataFragment.kt\ncom/yalla/yalla/ui/fragment/TopDataFragment\n*L\n54#1:430,15\n*E\n"})
public final class TopDataFragment extends p508o0o0O.OooOO0O<t4> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private p564o0oOo0OO.o000O<TopRankData> adapter;

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

    public static final class OooO extends oo00o {
        public OooO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            TopDataFragment topDataFragment = TopDataFragment.this;
            p564o0oOo0OO.o000O o000o = topDataFragment.adapter;
            if (o000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000o = null;
            }
            o000o.Oooo00O(true);
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
            p564o0oOo0OO.o000O o000o = TopDataFragment.this.adapter;
            if (o000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000o = null;
            }
            o000o.Oooo0O0(it.isSuccess());
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
                p564o0oOo0OO.o000O o000o = topDataFragment.adapter;
                if (o000o == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o000o = null;
                }
                List list3 = topDataFragment.adapterListData;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterListData");
                } else {
                    list = list3;
                }
                o000o.OooOoO0(list);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends p564o0oOo0OO.o000O<TopRankData> {
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
            Context context = this.f56196OooOo;
            if (zAreEqual) {
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(context);
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0o());
                oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.item_top_header));
            } else {
                o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(context);
                oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
                oooO00o2.f43909OooO00o = 0;
                oooO00o2.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.item_top_header));
            }
            viewHolder.setText(oO00O0oO.tv_ranking, String.valueOf(topRankData.getNum()));
            UserTagView userTagView = (UserTagView) viewHolder.getView(oO00O0oO.topDataUserTagView);
            SVGAView sVGAView = (SVGAView) viewHolder.getView(oO00O0oO.item_top_header_frame_svga);
            LifecycleOwner viewLifecycleOwner = topDataFragment.getViewLifecycleOwner();
            String headFrameUrl = topRankData.getHeadFrameUrl();
            sVGAView.setImageDrawable(null);
            sVGAView.setVisibility(4);
            sVGAView.OooO0oO(false);
            if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
                sVGAView.setVisibility(0);
                sVGAView.f10172OooOooO = 0;
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
                userTagView.setNameTextColor(oO00O0o.color_alpha_87_A1);
            }
            userTagView.setName(topRankData.getName());
            userTagView.OooO0Oo(topRankData.getKaVIPLv(), true, topDataFragment.getViewLifecycleOwner());
            Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
            UserTagView.OooOO0o(userTagView, topDataFragment.getViewLifecycleOwner(), Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8);
            viewHolder.setText(oO00O0oO.tv_num, Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p590o0oo0.OooOOOO.OooO0Oo(topRankData.getNumber()));
        }
    }

    @SourceDebugExtension({"SMAP\nTopDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopDataFragment.kt\ncom/yalla/yalla/ui/fragment/TopDataFragment$itemClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f28290OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(TopRankData topRankData) {
            super(0);
            this.f28290OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = TopDataFragment.this.getActivity();
            if (activity != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, activity, this.f28290OooO0o0.getId(), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f28292OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(TopRankData topRankData) {
            super(1);
            this.f28292OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f28292OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f28294OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(TopRankData topRankData) {
            super(1);
            this.f28294OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f28294OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopRankData f28296OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(TopRankData topRankData) {
            super(1);
            this.f28296OooO0o0 = topRankData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            TopDataFragment.this.itemClick(this.f28296OooO0o0);
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
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(TopDataVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.TopDataFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28300OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28300OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
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
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
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
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        p377o0OOoOo.o000O000.OooO0Oo(liveDataRankingList, viewLifecycleOwner, false, new OooO0O0(), null, new OooO0OO(), 10);
    }

    @SuppressLint({"Range"})
    private final void initView() {
        ImageView imageView = getBinding().f58863OooO0Oo.f59258OooOOo;
        if (p591o0oo000O.OooO.OooO0o0()) {
            Resources resources = imageView.getResources();
            TopDataVM vm = getVm();
            String str = this.rankType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankType");
                str = null;
            }
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, vm.getHeadBgResource(str));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), bitmapDecodeResource.getConfig());
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(bm.width, bm.height, bm.config)");
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
        OooO0o oooO0o = new OooO0o(getContext(), oO00OO0O.main_activity_top_item);
        this.adapter = oooO0o;
        oooO0o.Oooo00O(true);
        p564o0oOo0OO.o000O<TopRankData> o000o = this.adapter;
        if (o000o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o = null;
        }
        o000o.OooOo0o();
        p564o0oOo0OO.o000O<TopRankData> o000o2 = this.adapter;
        if (o000o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o2 = null;
        }
        o000o2.OooOooO(true);
        p564o0oOo0OO.o000O<TopRankData> o000o3 = this.adapter;
        if (o000o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o3 = null;
        }
        o000o3.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: com.yalla.yalla.ui.fragment.o0000O
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                TopDataFragment.initView$lambda$2(this.f28898OooO0Oo, baseQuickAdapter, view, i);
            }
        };
        p564o0oOo0OO.o000O<TopRankData> o000o4 = this.adapter;
        if (o000o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o4 = null;
        }
        o000o4.Oooo0OO(new OooO());
        p564o0oOo0OO.o000O<TopRankData> o000o5 = this.adapter;
        if (o000o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o5 = null;
        }
        o000o5.OooOooO(true);
        getBinding().f58864OooO0o0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        RecyclerView recyclerView = getBinding().f58864OooO0o0;
        p564o0oOo0OO.o000O<TopRankData> o000o6 = this.adapter;
        if (o000o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o6 = null;
        }
        recyclerView.setAdapter(o000o6);
        getBinding().f58860OooO00o.f31260o00000o0.setBackgroundResource(oO00O0o.white);
        getBinding().f58860OooO00o.OooOo0(0.0f);
        getBinding().f58861OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: com.yalla.yalla.ui.fragment.o0000OO0
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                TopDataFragment.initView$lambda$3(this.f28904OooO00o, appBarLayout, i);
            }
        });
        getBinding().f58861OooO0O0.setOutlineProvider(null);
        getBinding().f58862OooO0OO.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(TopDataFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.TopRankData");
        this$0.itemClick((TopRankData) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(TopDataFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float height = this$0.getBinding().f58863OooO0Oo.f59248OooO0o0.getHeight();
        if (Math.abs(i) <= height) {
            this$0.getBinding().f58863OooO0Oo.f59248OooO0o0.setAlpha((height - Math.abs(i)) / height);
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
            roomModel.setId(p590o0oo0.OooOOOO.OooOO0o(model.getId()));
            roomModel.setRoomIp(model.getRoomServerIp());
            roomModel.websocketaddr = model.getWebsocketaddr();
            roomModel.setName(model.getName());
            MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Explore_Top);
            return;
        }
        OooOO0 onLogin = new OooOO0(model);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
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
        NetImageView netImageView = getBinding().f58863OooO0Oo.f59267OooOoO0;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ilTop.userPhoto1");
        SVGAView sVGAView = getBinding().f58863OooO0Oo.f59247OooO0o;
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
            ConstraintLayout constraintLayout = getBinding().f58863OooO0Oo.f59244OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilTop.clTopRank1");
            com.code.android.util.o000OO00.OooO0OO(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = getBinding().f58863OooO0Oo.f59244OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilTop.clTopRank1");
        com.code.android.util.o000OO00.OooOOOO(constraintLayout2);
        ConstraintLayout constraintLayout3 = getBinding().f58863OooO0Oo.f59244OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.ilTop.clTopRank1");
        com.code.android.util.o000OO00.OooO0oo(constraintLayout3, new OooOO0O(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            int i = oOo00OO0.icon_head_default;
            oooO00o.f43923OooOOOo = i;
            oooO00o.f43913OooO0o = i;
            oooO00o.f43936OooOoo0 = 2;
            oooO00o.OooO0o0(12);
            oooO00o.f43937OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o.f43938OooOooo = -1;
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(netImageView);
        } else {
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o2.f43937OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o2.f43938OooOooo = -1;
            oooO00o2.f43940Oooo00O = true;
            oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo(netImageView);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView2.setImageDrawable(null);
        sVGAView2.setVisibility(4);
        sVGAView2.OooO0oO(false);
        if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView2.setVisibility(0);
            sVGAView2.f10172OooOooO = 0;
            sVGAView2.setImageResource(0);
            sVGAView2.OooOO0O(headFrameUrl, viewLifecycleOwner);
            sVGAView2.OooOO0o();
        }
        getBinding().f58863OooO0Oo.f59242OooO.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f58863OooO0Oo.f59260OooOOoo.setText(topRankData.getName());
        getBinding().f58863OooO0Oo.f59260OooOOoo.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        getBinding().f58863OooO0Oo.f59253OooOO0o.OooOOOO(topRankData.getKaVIPLv(), true, getViewLifecycleOwner());
        getBinding().f58863OooO0Oo.f59256OooOOOO.OooO0O0(this, Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8.0f);
        UserNameView userNameView = getBinding().f58863OooO0Oo.f59260OooOOoo;
        ViewLocation viewLocation = ViewLocation.end;
        oO000Oo.OooO00o(userNameView, null, viewLocation, p591o0oo000O.OooO.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59260OooOOoo, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_male), viewLocation, p591o0oo000O.OooO.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59260OooOOoo, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_female), viewLocation, p591o0oo000O.OooO.OooO0o0());
        } else {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59260OooOOoo, null, viewLocation, p591o0oo000O.OooO.OooO0o0());
        }
        getBinding().f58863OooO0Oo.f59264OooOo0O.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p590o0oo0.OooOOOO.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f58863OooO0Oo.f59264OooOo0O;
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
        SVGAView sVGAView = getBinding().f58863OooO0Oo.f59249OooO0oO;
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
            ConstraintLayout constraintLayout = getBinding().f58863OooO0Oo.f59245OooO0OO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilTop.clTopRank2");
            com.code.android.util.o000OO00.OooO0OO(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = getBinding().f58863OooO0Oo.f59245OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilTop.clTopRank2");
        com.code.android.util.o000OO00.OooOOOO(constraintLayout2);
        ConstraintLayout constraintLayout3 = getBinding().f58863OooO0Oo.f59245OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.ilTop.clTopRank2");
        com.code.android.util.o000OO00.OooO0oo(constraintLayout3, new OooOOO0(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            int i = oOo00OO0.icon_head_default;
            oooO00o.f43923OooOOOo = i;
            oooO00o.f43913OooO0o = i;
            oooO00o.f43936OooOoo0 = 2;
            oooO00o.OooO0o0(12);
            oooO00o.f43937OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o.f43938OooOooo = -1;
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(getBinding().f58863OooO0Oo.f59266OooOoO);
        } else {
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o2.f43937OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o2.f43938OooOooo = -1;
            oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo(getBinding().f58863OooO0Oo.f59266OooOoO);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView2.setImageDrawable(null);
        sVGAView2.setVisibility(4);
        sVGAView2.OooO0oO(false);
        if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView2.setVisibility(0);
            sVGAView2.f10172OooOooO = 0;
            sVGAView2.setImageResource(0);
            sVGAView2.OooOO0O(headFrameUrl, viewLifecycleOwner);
            sVGAView2.OooOO0o();
        }
        getBinding().f58863OooO0Oo.f59251OooOO0.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f58863OooO0Oo.f59263OooOo00.setText(topRankData.getName());
        getBinding().f58863OooO0Oo.f59263OooOo00.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        getBinding().f58863OooO0Oo.f59255OooOOO0.OooOOOO(topRankData.getKaVIPLv(), true, getViewLifecycleOwner());
        getBinding().f58863OooO0Oo.f59257OooOOOo.OooO0O0(this, Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8.0f);
        UserNameView userNameView = getBinding().f58863OooO0Oo.f59263OooOo00;
        ViewLocation viewLocation = ViewLocation.end;
        oO000Oo.OooO00o(userNameView, null, viewLocation, p591o0oo000O.OooO.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59263OooOo00, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_male), viewLocation, p591o0oo000O.OooO.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59263OooOo00, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_female), viewLocation, p591o0oo000O.OooO.OooO0o0());
        }
        getBinding().f58863OooO0Oo.f59263OooOo00.setText(topRankData.getName());
        getBinding().f58863OooO0Oo.f59265OooOo0o.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p590o0oo0.OooOOOO.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f58863OooO0Oo.f59265OooOo0o;
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
        SVGAView sVGAView = getBinding().f58863OooO0Oo.f59250OooO0oo;
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
            ConstraintLayout constraintLayout = getBinding().f58863OooO0Oo.f59246OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilTop.clTopRank3");
            com.code.android.util.o000OO00.OooO0OO(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = getBinding().f58863OooO0Oo.f59246OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilTop.clTopRank3");
        com.code.android.util.o000OO00.OooOOOO(constraintLayout2);
        ConstraintLayout constraintLayout3 = getBinding().f58863OooO0Oo.f59246OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.ilTop.clTopRank3");
        com.code.android.util.o000OO00.OooO0oo(constraintLayout3, new OooOOO(topRankData));
        String str2 = this.rankType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
            str2 = null;
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            int i = oOo00OO0.icon_head_default;
            oooO00o.f43923OooOOOo = i;
            oooO00o.f43913OooO0o = i;
            oooO00o.f43936OooOoo0 = 2;
            oooO00o.OooO0o0(12);
            oooO00o.f43937OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o.f43938OooOooo = -1;
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(getBinding().f58863OooO0Oo.f59268OooOoOO);
        } else {
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o2.f43937OooOooO = com.code.android.util.o0000O0.OooO00o(1.0f);
            oooO00o2.f43938OooOooo = -1;
            oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(topRankData.getImageUrl());
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo(getBinding().f58863OooO0Oo.f59268OooOoOO);
        }
        String headFrameUrl = topRankData.getHeadFrameUrl();
        sVGAView2.setImageDrawable(null);
        sVGAView2.setVisibility(4);
        sVGAView2.OooO0oO(false);
        if (!com.code.android.util.OooOo00.OooO00o(headFrameUrl) && !"/headframe/0.png".equals(headFrameUrl)) {
            sVGAView2.setVisibility(0);
            sVGAView2.f10172OooOooO = 0;
            sVGAView2.setImageResource(0);
            sVGAView2.OooOO0O(headFrameUrl, viewLifecycleOwner);
            sVGAView2.OooOO0o();
        }
        getBinding().f58863OooO0Oo.f59252OooOO0O.OooO0OO(topRankData.getVip(), topRankData.getVipLevel());
        getBinding().f58863OooO0Oo.f59262OooOo0.setText(topRankData.getName());
        getBinding().f58863OooO0Oo.f59262OooOo0.setFlash(topRankData.getKaVIPLv() >= VipLevel.Vip4.getValue());
        getBinding().f58863OooO0Oo.f59254OooOOO.OooOOOO(topRankData.getKaVIPLv(), true, getViewLifecycleOwner());
        getBinding().f58863OooO0Oo.f59259OooOOo0.OooO0O0(this, Integer.valueOf(topRankData.getCurrWealLv()), topRankData.getCurrBadgeImg(), 8.0f);
        UserNameView userNameView = getBinding().f58863OooO0Oo.f59262OooOo0;
        ViewLocation viewLocation = ViewLocation.end;
        oO000Oo.OooO00o(userNameView, null, viewLocation, p591o0oo000O.OooO.OooO0o0());
        if (Intrinsics.areEqual("1", topRankData.getSex())) {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59262OooOo0, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_male), viewLocation, p591o0oo000O.OooO.OooO0o0());
        } else if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, topRankData.getSex())) {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59262OooOo0, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_female), viewLocation, p591o0oo000O.OooO.OooO0o0());
        } else {
            oO000Oo.OooO00o(getBinding().f58863OooO0Oo.f59262OooOo0, null, viewLocation, p591o0oo000O.OooO.OooO0o0());
        }
        getBinding().f58863OooO0Oo.f59262OooOo0.setText(topRankData.getName());
        getBinding().f58863OooO0Oo.f59261OooOo.setText(Intrinsics.areEqual(topRankData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : p590o0oo0.OooOOOO.OooO0Oo(topRankData.getNumber()));
        TextView textView = getBinding().f58863OooO0Oo.f59261OooOo;
        TopDataVM vm = getVm();
        String str3 = this.rankType;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankType");
        } else {
            str = str3;
        }
        textView.setBackgroundResource(vm.getTextResource(str));
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
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
            Intrinsics.checkNotNullExpressionValue(string2, "arguments?.getString(DAT…EY, TYPE_DAY) ?: TYPE_DAY");
            str2 = string2;
        }
        this.dataType = str2;
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TopVM topVM = this.topVM;
        if (topVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topVM");
            topVM = null;
        }
        topVM.getUpdateTopRank().postValue(getVm().getLoadedTopRankData());
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public t4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        t4 t4VarInflate = t4.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(t4VarInflate, "inflate(inflater)");
        return t4VarInflate;
    }
}
