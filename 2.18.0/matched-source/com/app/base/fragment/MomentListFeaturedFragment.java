package com.app.base.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o0000OO0;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o00000O;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.impl.PostGifPlayControl;
import com.app.base.model.RoomModel;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.facebook.share.internal.ShareConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.MomentAdDataModel;
import com.yalla.yalla.model.MomentBannerModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import java.util.Collection;
import java.util.Iterator;
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
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o000;
import p143o00OOooO.o000O0;
import p143o00OOooO.o000O000;
import p143o00OOooO.o000O00O;
import p143o00OOooO.o000O0Oo;
import p143o00OOooO.o000O0o;
import p143o00OOooO.o000Oo0;
import p255o00ooO0O.oOO00O;
import p393o0OOooOo.o0O00000;
import p480o0OooooO.oO0OoOO0;
import p517o0o0O00.o00O00;
import p565o0oOo0.o00000;
import p565o0oOo0.o00000OO;
import p651o0ooOOoo.a9;
import p656o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0014J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0006\u0010\u001c\u001a\u00020\u0003R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006-"}, d2 = {"Lcom/app/base/fragment/MomentListFeaturedFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/a9;", "", "initObserver", "", ShareConstants.RESULT_POST_ID, "squareSingle4Edited", "initView", "refreshLoad", "", "position", "onBannerClick", "", "getPostDetail", "loadMomentBanner", "", "isRefresh", "loadMomentList", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "onPause", "scrollToTop", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm", "Lcom/app/base/impl/PostGifPlayControl;", "mPostGifPlayControl", "Lcom/app/base/impl/PostGifPlayControl;", "dateSort", "J", "pageIndex", "I", "lastPageIndex", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentListFeaturedFragment extends p505o0o00o00.OooO<a9> {
    public static final int $stable = 8;

    @Nullable
    private o00000 bannerAdapter;
    private long dateSort;
    private int lastPageIndex;
    private o00000OO mAdapter;
    private PostGifPlayControl mPostGifPlayControl;
    private int pageIndex;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<ApiResult<MomentBannerModel>, Unit> {
        public OooO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003c  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<MomentBannerModel> apiResult) {
            ApiResult<MomentBannerModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getData() == null) {
                AppBarLayout appBarLayout = MomentListFeaturedFragment.this.getBinding().f48945OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(appBarLayout, "binding.layoutBanner");
                oOO00O.OooO00o(appBarLayout);
            } else {
                MomentBannerModel data = it.getData();
                List<MomentBannerModel.MomentBannerItem> bannerList = data != null ? data.getBannerList() : null;
                if (bannerList == null || bannerList.isEmpty()) {
                    AppBarLayout appBarLayout2 = MomentListFeaturedFragment.this.getBinding().f48945OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(appBarLayout2, "binding.layoutBanner");
                    oOO00O.OooO00o(appBarLayout2);
                } else {
                    AppBarLayout appBarLayout3 = MomentListFeaturedFragment.this.getBinding().f48945OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(appBarLayout3, "binding.layoutBanner");
                    oOO00O.OooO(appBarLayout3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<MomentDetailModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            Context it1;
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2 != null && (it1 = MomentListFeaturedFragment.this.getContext()) != null) {
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullExpressionValue(it1, "it1");
                PostDetailActivity.f22436o000000O.OooO00o(it1, momentDetailModel2, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : false, (256 & 64) != 0 ? null : MomentAdapterTag.MomentBanner, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p656o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00000OO o00000oo2 = MomentListFeaturedFragment.this.mAdapter;
            if (o00000oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo2 = null;
            }
            o00000oo2.setFirstLoading(true);
            MomentListFeaturedFragment.this.refreshLoad();
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<MomentBannerModel, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentBannerModel momentBannerModel) {
            MomentBannerModel momentBannerModel2 = momentBannerModel;
            if (momentBannerModel2 != null) {
                MomentListFeaturedFragment momentListFeaturedFragment = MomentListFeaturedFragment.this;
                if (momentListFeaturedFragment.bannerAdapter == null) {
                    momentListFeaturedFragment.bannerAdapter = new o00000(momentBannerModel2.getBannerList());
                    Banner banner = momentListFeaturedFragment.getBinding().f48943OooO0O0;
                    o00000 o00000Var = momentListFeaturedFragment.bannerAdapter;
                    Intrinsics.checkNotNull(o00000Var);
                    banner.setAdapter(o00000Var);
                    momentListFeaturedFragment.getBinding().f48943OooO0O0.addBannerLifecycleObserver(momentListFeaturedFragment.getViewLifecycleOwner());
                    momentListFeaturedFragment.getBinding().f48943OooO0O0.isAutoLoop(true);
                    momentListFeaturedFragment.getBinding().f48943OooO0O0.setDelayTime(momentBannerModel2.delayTime());
                    momentListFeaturedFragment.getBinding().f48943OooO0O0.setIntercept(false);
                    o00000 o00000Var2 = momentListFeaturedFragment.bannerAdapter;
                    if (o00000Var2 != null) {
                        o00000Var2.setOnBannerListener(new o000O0Oo(momentListFeaturedFragment));
                    }
                    momentListFeaturedFragment.getBinding().f48943OooO0O0.setIndicator(new CircleIndicator(momentListFeaturedFragment.getContext()));
                    momentListFeaturedFragment.getBinding().f48943OooO0O0.start();
                } else {
                    o00000 o00000Var3 = momentListFeaturedFragment.bannerAdapter;
                    int itemCount = o00000Var3 != null ? o00000Var3.getItemCount() : 0;
                    o00000 o00000Var4 = momentListFeaturedFragment.bannerAdapter;
                    if (o00000Var4 != null) {
                        o00000Var4.setDatas(null);
                    }
                    o00000 o00000Var5 = momentListFeaturedFragment.bannerAdapter;
                    if (o00000Var5 != null) {
                        o00000Var5.notifyItemRangeRemoved(0, itemCount);
                    }
                    o00000 o00000Var6 = momentListFeaturedFragment.bannerAdapter;
                    if (o00000Var6 != null) {
                        o00000Var6.setDatas(momentBannerModel2.getBannerList());
                    }
                    List<MomentBannerModel.MomentBannerItem> bannerList = momentBannerModel2.getBannerList();
                    int size = bannerList != null ? bannerList.size() : 0;
                    o00000 o00000Var7 = momentListFeaturedFragment.bannerAdapter;
                    if (o00000Var7 != null) {
                        o00000Var7.notifyItemRangeInserted(0, size);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            AppBarLayout appBarLayout = MomentListFeaturedFragment.this.getBinding().f48945OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(appBarLayout, "binding.layoutBanner");
            oOO00O.OooO00o(appBarLayout);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<List<MomentDetailModel>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f11609Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ MomentListFeaturedFragment f11610OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, MomentListFeaturedFragment momentListFeaturedFragment) {
            super(1);
            this.f11609Oooo = z;
            this.f11610OoooO00 = momentListFeaturedFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentDetailModel> list) {
            List<MomentDetailModel> list2 = list;
            o00000OO o00000oo2 = null;
            PostGifPlayControl postGifPlayControl = null;
            o00000OO o00000oo3 = null;
            if (this.f11609Oooo) {
                if (this.f11610OoooO00.lastPageIndex == 1) {
                    o00000OO o00000oo4 = this.f11610OoooO00.mAdapter;
                    if (o00000oo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o00000oo4 = null;
                    }
                    o00000oo4.setNewData(list2);
                    PostGifPlayControl postGifPlayControl2 = this.f11610OoooO00.mPostGifPlayControl;
                    if (postGifPlayControl2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPostGifPlayControl");
                    } else {
                        postGifPlayControl = postGifPlayControl2;
                    }
                    postGifPlayControl.OooO0O0();
                } else if (list2 != null) {
                    o00000OO o00000oo5 = this.f11610OoooO00.mAdapter;
                    if (o00000oo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        o00000oo3 = o00000oo5;
                    }
                    o00000oo3.addData(0, (Collection) list2);
                }
                this.f11610OoooO00.getBinding().f48947OooO0o0.scrollToPosition(0);
            } else if (list2 != null) {
                o00000OO o00000oo6 = this.f11610OoooO00.mAdapter;
                if (o00000oo6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    o00000oo2 = o00000oo6;
                }
                o00000oo2.addData((Collection) list2);
            }
            SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<List<MomentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f11612OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(1);
            this.f11612OoooO00 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentDetailModel>> apiResult) {
            ApiResult<List<MomentDetailModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                List<MomentDetailModel> data = it.getData();
                if (data != null && (data.isEmpty() ^ true)) {
                    MomentListFeaturedFragment momentListFeaturedFragment = MomentListFeaturedFragment.this;
                    Long dateSort = it.getPage().getDateSort();
                    momentListFeaturedFragment.dateSort = dateSort != null ? dateSort.longValue() : 0L;
                    MomentListFeaturedFragment.this.pageIndex = it.getPage().getPageIndex() + 1;
                }
            }
            MomentListFeaturedFragment.this.getBinding().f48946OooO0o.Oooo0OO(this.f11612OoooO00, it.isSuccess());
            o00000OO o00000oo2 = MomentListFeaturedFragment.this.mAdapter;
            o00000OO o00000oo3 = null;
            if (o00000oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo2 = null;
            }
            Boolean boolValueOf = Boolean.valueOf(this.f11612OoooO00);
            Boolean boolValueOf2 = Boolean.valueOf(it.isSuccess());
            List<MomentDetailModel> data2 = it.getData();
            o00000oo2.setLoadComplete(boolValueOf, boolValueOf2, Boolean.valueOf(data2 == null || data2.isEmpty()));
            o00000OO o00000oo4 = MomentListFeaturedFragment.this.mAdapter;
            if (o00000oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                o00000oo3 = o00000oo4;
            }
            o00000oo3.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f11614OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(long j) {
            super(1);
            this.f11614OoooO00 = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2 != null) {
                o00000OO o00000oo2 = MomentListFeaturedFragment.this.mAdapter;
                o00000OO o00000oo3 = null;
                if (o00000oo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o00000oo2 = null;
                }
                List<MomentDetailModel> data = o00000oo2.getData();
                Intrinsics.checkNotNullExpressionValue(data, "mAdapter.data");
                long j = this.f11614OoooO00;
                Iterator<MomentDetailModel> it = data.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().getId() == j) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    o00000OO o00000oo4 = MomentListFeaturedFragment.this.mAdapter;
                    if (o00000oo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o00000oo4 = null;
                    }
                    if (o00000oo4.getData().size() > i) {
                        if (momentDetailModel2.getPower() == MomentTypePower.Self.getValue()) {
                            o00000OO o00000oo5 = MomentListFeaturedFragment.this.mAdapter;
                            if (o00000oo5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                                o00000oo5 = null;
                            }
                            o00000oo5.remove(i);
                            o00000OO o00000oo6 = MomentListFeaturedFragment.this.mAdapter;
                            if (o00000oo6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                                o00000oo6 = null;
                            }
                            o00000OO o00000oo7 = MomentListFeaturedFragment.this.mAdapter;
                            if (o00000oo7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            } else {
                                o00000oo3 = o00000oo7;
                            }
                            o00000oo6.notifyItemRemoved(o00000oo3.getHeaderLayoutCount() + i);
                        } else {
                            o00000OO o00000oo8 = MomentListFeaturedFragment.this.mAdapter;
                            if (o00000oo8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            } else {
                                o00000oo3 = o00000oo8;
                            }
                            o00000oo3.setData(i, momentDetailModel2);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public MomentListFeaturedFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.app.base.fragment.MomentListFeaturedFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.app.base.fragment.MomentListFeaturedFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = o0000OO0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.app.base.fragment.MomentListFeaturedFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.app.base.fragment.MomentListFeaturedFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Function0 f11618Oooo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f11618Oooo;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000OO0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.fragment.MomentListFeaturedFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000OO0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.pageIndex = 1;
        this.lastPageIndex = 1;
    }

    private final void getPostDetail(String postId) {
        if (postId.length() == 0) {
            return;
        }
        MomentVM.momentDetail$default(getVm(), postId, 0, 2, null).observe(this, new OooOo(new OooO00o(), null, null, false, 14));
    }

    private final MomentVM getVm() {
        return (MomentVM) this.vm.getValue();
    }

    private final void initObserver() {
        int i = 0;
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o000(this, i));
        LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH", MomentDetailModel.class).observe(this, new p143o00OOooO.o0000OO0(this, i));
        Class cls = Long.TYPE;
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new o000O0o(this, i));
        LiveEventBus.get("POST_FEATURED_AD_DELETE", Integer.TYPE).observe(this, new o000Oo0(this, i));
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new o000O000(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-0, reason: not valid java name */
    public static final void m35initObserver$lambda0(MomentListFeaturedFragment this$0, MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00000OO o00000oo2 = this$0.mAdapter;
        o00000OO o00000oo3 = null;
        if (o00000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00000oo2 = null;
        }
        int size = o00000oo2.getData().size();
        for (int i = 0; i < size; i++) {
            o00000OO o00000oo4 = this$0.mAdapter;
            if (o00000oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo4 = null;
            }
            if (o00000oo4.getData().get(i).getId() == momentDetailModel.getId()) {
                o00000OO o00000oo5 = this$0.mAdapter;
                if (o00000oo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o00000oo5 = null;
                }
                o00000oo5.getData().set(i, momentDetailModel);
                o00000OO o00000oo6 = this$0.mAdapter;
                if (o00000oo6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o00000oo6 = null;
                }
                o00000OO o00000oo7 = this$0.mAdapter;
                if (o00000oo7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    o00000oo3 = o00000oo7;
                }
                o00000oo6.notifyItemChanged(o00000oo3.getHeaderLayoutCount() + i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-2, reason: not valid java name */
    public static final void m36initObserver$lambda2(MomentListFeaturedFragment this$0, MomentDetailModel momentDetailModel) {
        MomentDetailModel forward;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = 0;
        while (true) {
            o00000OO o00000oo2 = this$0.mAdapter;
            o00000OO o00000oo3 = null;
            if (o00000oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo2 = null;
            }
            if (i >= o00000oo2.getData().size()) {
                return;
            }
            o00000OO o00000oo4 = this$0.mAdapter;
            if (o00000oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo4 = null;
            }
            MomentDetailModel momentDetailModel2 = o00000oo4.getData().get(i);
            int type = momentDetailModel2.getType();
            if (type == MomentType.Poll.getValue()) {
                if (momentDetailModel2.getId() == momentDetailModel.getId()) {
                    o00000OO o00000oo5 = this$0.mAdapter;
                    if (o00000oo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o00000oo5 = null;
                    }
                    o00000oo5.getData().set(i, momentDetailModel);
                    o00000OO o00000oo6 = this$0.mAdapter;
                    if (o00000oo6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o00000oo6 = null;
                    }
                    o00000OO o00000oo7 = this$0.mAdapter;
                    if (o00000oo7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        o00000oo3 = o00000oo7;
                    }
                    o00000oo6.notifyItemChanged(o00000oo3.getHeaderLayoutCount() + i);
                }
            } else if (type == MomentType.Forward.getValue() && (forward = momentDetailModel2.getForward()) != null && forward.getId() == momentDetailModel.getId()) {
                o00000OO o00000oo8 = this$0.mAdapter;
                if (o00000oo8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o00000oo8 = null;
                }
                MomentDetailModel momentDetailModel3 = o00000oo8.getData().get(i);
                if (momentDetailModel3 != null) {
                    momentDetailModel3.setForward(momentDetailModel);
                }
                o00000OO o00000oo9 = this$0.mAdapter;
                if (o00000oo9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o00000oo9 = null;
                }
                o00000OO o00000oo10 = this$0.mAdapter;
                if (o00000oo10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    o00000oo3 = o00000oo10;
                }
                o00000oo9.notifyItemChanged(o00000oo3.getHeaderLayoutCount() + i);
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-3, reason: not valid java name */
    public static final void m37initObserver$lambda3(MomentListFeaturedFragment this$0, Long l) {
        MomentForwardContent forwardContent;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00000OO o00000oo2 = this$0.mAdapter;
        o00000OO o00000oo3 = null;
        if (o00000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00000oo2 = null;
        }
        int size = o00000oo2.getData().size();
        for (int i = 0; i < size; i++) {
            o00000OO o00000oo4 = this$0.mAdapter;
            if (o00000oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo4 = null;
            }
            MomentDetailModel momentDetailModel = o00000oo4.getData().get(i);
            if ((momentDetailModel == null || (forwardContent = momentDetailModel.getForwardContent()) == null || forwardContent.getShareType() != 20) ? false : true) {
                MomentForwardContent forwardContent2 = momentDetailModel.getForwardContent();
                if (Intrinsics.areEqual(forwardContent2 != null ? Long.valueOf(forwardContent2.getId()) : null, l)) {
                    momentDetailModel.setDeleteType(MomentTypeDelete.EVENT.getValue());
                    o00000OO o00000oo5 = this$0.mAdapter;
                    if (o00000oo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o00000oo5 = null;
                    }
                    o00000OO o00000oo6 = this$0.mAdapter;
                    if (o00000oo6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        o00000oo3 = o00000oo6;
                    }
                    o00000oo5.notifyItemChanged(o00000oo3.getHeaderLayoutCount() + i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-6, reason: not valid java name */
    public static final void m38initObserver$lambda6(final MomentListFeaturedFragment this$0, final Integer position) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(position, "position");
        if (position.intValue() > -1) {
            int iIntValue = position.intValue();
            o00000OO o00000oo2 = this$0.mAdapter;
            o00000OO o00000oo3 = null;
            if (o00000oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo2 = null;
            }
            if (iIntValue < o00000oo2.getData().size()) {
                o00000OO o00000oo4 = this$0.mAdapter;
                if (o00000oo4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    o00000oo3 = o00000oo4;
                }
                MomentAdDataModel adData = o00000oo3.getData().get(position.intValue()).getAdData();
                if (adData != null) {
                    this$0.getVm().adAddBlockIns(adData.getAdId()).observe(this$0.getViewLifecycleOwner(), new Observer() { // from class: o00OOooO.o000O00
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            MomentListFeaturedFragment.m39initObserver$lambda6$lambda5$lambda4(this.f31962OooO00o, position, (ApiResult) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-6$lambda-5$lambda-4, reason: not valid java name */
    public static final void m39initObserver$lambda6$lambda5$lambda4(MomentListFeaturedFragment this$0, Integer position, ApiResult apiResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (apiResult.isSuccess()) {
            o00000OO o00000oo2 = this$0.mAdapter;
            if (o00000oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                o00000oo2 = null;
            }
            Intrinsics.checkNotNullExpressionValue(position, "position");
            o00000oo2.remove(position.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-7, reason: not valid java name */
    public static final void m40initObserver$lambda7(MomentListFeaturedFragment this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O00.OooOO0O("动态编辑 发送成功 刷新 = " + it);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.squareSingle4Edited(it.longValue());
    }

    private final void initView() {
        getBinding().f48946OooO0o.setOnRefreshListener(new o000O0(this));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        o00000OO o00000oo2 = new o00000OO(fragmentActivityRequireActivity, MomentAdapterTag.MomentListFeaturedFragment);
        this.mAdapter = o00000oo2;
        o00000oo2.f45010OooO0o = EnterRoomParentPage.Moments_Feature_SharedRoom;
        o00000OO o00000oo3 = this.mAdapter;
        o00000OO o00000oo4 = null;
        if (o00000oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00000oo3 = null;
        }
        o00000oo3.setLoadErrorClickListener(new OooO0O0());
        o00000OO o00000oo5 = this.mAdapter;
        if (o00000oo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00000oo5 = null;
        }
        o00000oo5.setOnLoadMoreListener(new o000O00O(this), getBinding().f48947OooO0o0);
        o00000OO o00000oo6 = this.mAdapter;
        if (o00000oo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00000oo6 = null;
        }
        o00000oo6.setEmptyImageRes(R.drawable.ic_empty_fans);
        o00000OO o00000oo7 = this.mAdapter;
        if (o00000oo7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00000oo7 = null;
        }
        o00000oo7.setEmptyText(R.string.moments_none);
        getBinding().f48947OooO0o0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        FixedRecyclerView fixedRecyclerView = getBinding().f48947OooO0o0;
        o00000OO o00000oo8 = this.mAdapter;
        if (o00000oo8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            o00000oo4 = o00000oo8;
        }
        fixedRecyclerView.setAdapter(o00000oo4);
        this.mPostGifPlayControl = new PostGifPlayControl(this, getBinding().f48947OooO0o0);
        p619o0oo0o.o00000OO o00000oo9 = p619o0oo0o.o00000OO.f48493OooO00o;
        FixedRecyclerView fixedRecyclerView2 = getBinding().f48947OooO0o0;
        Intrinsics.checkNotNullExpressionValue(fixedRecyclerView2, "binding.recyclerView");
        p619o0oo0o.o00000OO.OooO00o(fixedRecyclerView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-8, reason: not valid java name */
    public static final void m41initView$lambda8(MomentListFeaturedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PostGifPlayControl postGifPlayControl = this$0.mPostGifPlayControl;
        if (postGifPlayControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostGifPlayControl");
            postGifPlayControl = null;
        }
        postGifPlayControl.OooO0OO();
        this$0.refreshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-9, reason: not valid java name */
    public static final void m42initView$lambda9(MomentListFeaturedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadMomentList(false);
    }

    private final void loadMomentBanner() {
        if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.FALSE)) {
            return;
        }
        getVm().loadBannerList().observe(this, new OooOo(new OooO0OO(), new OooO0o(), new OooO(), false, 8));
    }

    private final void loadMomentList(boolean isRefresh) {
        if (isRefresh) {
            loadMomentBanner();
        }
        this.lastPageIndex = this.pageIndex;
        getVm().momentFeaturedList(this.dateSort, this.pageIndex).observe(this, new OooOo(new OooOO0(isRefresh, this), null, new OooOO0O(isRefresh), false, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerClick(int position) {
        Context context;
        o00000 o00000Var = this.bannerAdapter;
        MomentBannerModel.MomentBannerItem data = o00000Var != null ? o00000Var.getData(position) : null;
        if (data == null) {
            return;
        }
        int jumpType = data.getJumpType();
        if (jumpType == 0) {
            if (data.getUrl().length() > 0) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.MomentActivityBanner);
                webPageInfo.OooO0Oo(data.getUrl());
                webPageInfo.OooO0OO(data.getTitle());
                webPageInfo.OooO0O0(WebPageInfo.ShareType.INSTANCE.OooO00o(data.getIsShare()), data.getImageUrl(), "");
                webPageInfo.OooO00o("barId", String.valueOf(data.getId()));
                Context context2 = getContext();
                if (context2 != null) {
                    WebActivity.f22127ooOO.OooO00o(context2, webPageInfo);
                    return;
                }
                return;
            }
            return;
        }
        if (jumpType == 1) {
            if (data.getRoomServerIp().length() > 0) {
                RoomModel roomModel = new RoomModel();
                roomModel.setRoomIp(data.getRoomServerIp());
                roomModel.setId(data.getTargetId());
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.AII_Banner_Room);
                return;
            }
            return;
        }
        if (jumpType == 2) {
            getPostDetail(com.yalla.support.common.util.OooO.OooO(Long.valueOf(data.getTargetId()), ""));
        } else if (jumpType == 3 && (context = getContext()) != null) {
            TopicInfoModel topicInfoModel = new TopicInfoModel();
            topicInfoModel.setId(data.getTargetId());
            TopicDetailActivity.f22586o00Oo0.OooO00o(context, topicInfoModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshLoad() {
        loadMomentList(true);
    }

    private final void squareSingle4Edited(long postId) {
        MomentVM.momentDetail$default(getVm(), String.valueOf(postId), 0, 2, null).observe(getViewLifecycleOwner(), new OooOo(new OooOOO0(postId), null, null, false, 14));
    }

    @Override // p505o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getVm().statisticalTime();
    }

    @Override // p464o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        refreshLoad();
        initObserver();
        getVm().statisticalTime();
    }

    @Override // p505o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd(MomentListFeaturedFragment.class.getName());
        o0O00000.OooO0o0("Moments_Featured_stay", getTimeLengthStr());
    }

    @Override // p505o0o00o00.OooO, p464o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o00000O.OooO0O0().OooOOOO(1);
        MobclickAgent.onPageStart(MomentListFeaturedFragment.class.getName());
        o0O00000.OooO0OO("Moments_Featured");
    }

    public final void scrollToTop() {
        getBinding().f48947OooO0o0.scrollToPosition(0);
        PostGifPlayControl postGifPlayControl = this.mPostGifPlayControl;
        if (postGifPlayControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostGifPlayControl");
            postGifPlayControl = null;
        }
        postGifPlayControl.OooO0O0();
        getBinding().f48946OooO0o.OooO();
        getBinding().f48946OooO0o.Oooo00o();
    }

    @Override // p505o0o00o00.OooO
    @NotNull
    public a9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        a9 a9VarInflate = a9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(a9VarInflate, "inflate(inflater)");
        CollapsingToolbarLayout unconsumeWindowInset = a9VarInflate.f48944OooO0OO;
        Intrinsics.checkNotNullExpressionValue(unconsumeWindowInset, "inflate.ctl");
        Intrinsics.checkNotNullParameter(unconsumeWindowInset, "$this$unconsumeWindowInset");
        unconsumeWindowInset.setOnApplyWindowInsetsListener(oO0OoOO0.f40686OooO00o);
        return a9VarInflate;
    }
}
