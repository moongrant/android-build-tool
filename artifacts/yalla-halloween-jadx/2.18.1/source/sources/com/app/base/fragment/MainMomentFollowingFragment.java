package com.app.base.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000O;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.base.impl.PostGifPlayControl;
import com.app.base.view.MomentFollowHeadView;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.umeng.analytics.MobclickAgent;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00000;
import p142o00OOooO.o000000;
import p142o00OOooO.o000000O;
import p142o00OOooO.o00000O;
import p142o00OOooO.o00000O0;
import p142o00OOooO.o000OOo;
import p142o00OOooO.o00oO0o;
import p142o00OOooO.o0O0O00;
import p142o00OOooO.o0OO00O;
import p142o00OOooO.o0OOO0o;
import p142o00OOooO.o0Oo0oo;
import p142o00OOooO.o0ooOOo;
import p142o00OOooO.oo000o;
import p142o00OOooO.oo0o0Oo;
import p176o00OoooO.oO0000Oo;
import p391o0OOooOo.o0O00000;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o000O0;
import p522o0o0O0o.o00O00OO;
import p563o0oOo0.o00000OO;
import p649o0ooOOoo.c9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0012\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0014J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0006\u0010\u001c\u001a\u00020\u0003R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105¨\u0006="}, d2 = {"Lcom/app/base/fragment/MainMomentFollowingFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/c9;", "", "initObserver", "Lcom/yalla/yalla/model/MomentSendModel;", "post", "squareSingle", "", ShareConstants.RESULT_POST_ID, "squareSingle4Edited", "loadHaveNewPostUser", "", "isRefresh", "loadPostList", "loadRecommendPost", "initFollowHeader", "setHeaderView", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onDestroy", "onResume", "onPause", "scrollToTop", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "mMomentVM$delegate", "Lkotlin/Lazy;", "getMMomentVM", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "mMomentVM", "Lo0oOo0/o00000OO;", "postAdapter$delegate", "getPostAdapter", "()Lo0oOo0/o00000OO;", "postAdapter", "isRecommend", "Z", "Lcom/app/base/impl/PostGifPlayControl;", "mPostGifPlayControl", "Lcom/app/base/impl/PostGifPlayControl;", "Lcom/app/base/view/MomentFollowHeadView;", "headView", "Lcom/app/base/view/MomentFollowHeadView;", "", "Lcom/yalla/yalla/model/MomentDetailModel;", "listData", "Ljava/util/List;", "dataSortPostList", "J", "", "pageIndexPostList", "I", "pageIndexRecommendPost", "dateSortRecommendPost", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainMomentFollowingFragment extends p503o0o00o00.OooO<c9> {
    public static final int $stable = 8;
    private long dataSortPostList;
    private long dateSortRecommendPost;

    @Nullable
    private oO0000Oo followingNewPostDialog;

    @Nullable
    private MomentFollowHeadView headView;
    private boolean isRecommend;

    @NotNull
    private final List<MomentDetailModel> listData;

    /* JADX INFO: renamed from: mMomentVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMomentVM;

    @Nullable
    private PostGifPlayControl mPostGifPlayControl;
    private int pageIndexPostList;
    private int pageIndexRecommendPost;

    /* JADX INFO: renamed from: postAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy postAdapter;

    public static final class OooO extends Lambda implements Function1<ApiResult<List<MomentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f11546Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f11546Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentDetailModel>> apiResult) {
            ApiResult<List<MomentDetailModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z = true;
            if (it.isSuccess()) {
                MainMomentFollowingFragment mainMomentFollowingFragment = MainMomentFollowingFragment.this;
                Long dateSort = it.getPage().getDateSort();
                mainMomentFollowingFragment.dataSortPostList = dateSort != null ? dateSort.longValue() : 0L;
                MainMomentFollowingFragment.this.pageIndexPostList = it.getPage().getPageIndex() + 1;
            }
            MainMomentFollowingFragment.this.getBinding().f49086OooO0OO.Oooo0OO(this.f11546Oooo0oO, it.isSuccess());
            o00000OO postAdapter = MainMomentFollowingFragment.this.getPostAdapter();
            Boolean boolValueOf = Boolean.valueOf(this.f11546Oooo0oO);
            Boolean boolValueOf2 = Boolean.valueOf(it.isSuccess());
            List<MomentDetailModel> data = it.getData();
            if (data != null && !data.isEmpty()) {
                z = false;
            }
            postAdapter.setLoadComplete(boolValueOf, boolValueOf2, Boolean.valueOf(z));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<List<RecommendNewPostModel>, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(List<RecommendNewPostModel> list, Integer num) {
            List<RecommendNewPostModel> data = list;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(data, "data");
            if (!(MainMomentFollowingFragment.this.followingNewPostDialog != null)) {
                o0O00000.OooO0OO("Moments_following_ProfilePhoto");
                MainMomentFollowingFragment.this.followingNewPostDialog = new oO0000Oo(data, iIntValue);
                oO0000Oo oo0000oo = MainMomentFollowingFragment.this.followingNewPostDialog;
                if (oo0000oo != null) {
                    com.app.base.fragment.OooO00o listener = new com.app.base.fragment.OooO00o(MainMomentFollowingFragment.this);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    oo0000oo.f32787OoooO0 = listener;
                }
                oO0000Oo oo0000oo2 = MainMomentFollowingFragment.this.followingNewPostDialog;
                if (oo0000oo2 != null) {
                    FragmentManager childFragmentManager = MainMomentFollowingFragment.this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                    oo0000oo2.show(childFragmentManager, "");
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainMomentFollowingFragment.this.getPostAdapter().setFirstLoading(true);
            MainMomentFollowingFragment.loadPostList$default(MainMomentFollowingFragment.this, false, 1, null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<RecommendNewPostModel>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RecommendNewPostModel> list) {
            List<RecommendNewPostModel> list2 = list;
            MainMomentFollowingFragment.this.setHeaderView();
            MomentFollowHeadView momentFollowHeadView = MainMomentFollowingFragment.this.headView;
            if (momentFollowHeadView != null) {
                momentFollowHeadView.setData(list2);
            }
            MainMomentFollowingFragment.this.getBinding().f49085OooO0O0.scrollToPosition(0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<MomentDetailModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f11550Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainMomentFollowingFragment f11551Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, MainMomentFollowingFragment mainMomentFollowingFragment) {
            super(1);
            this.f11550Oooo0o = z;
            this.f11551Oooo0oO = mainMomentFollowingFragment;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentDetailModel> list) {
            List<MomentDetailModel> list2 = list;
            SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boolean.FALSE);
            if (this.f11550Oooo0o) {
                this.f11551Oooo0oO.listData.clear();
                if (list2 == null || list2.isEmpty()) {
                    this.f11551Oooo0oO.isRecommend = true;
                    this.f11551Oooo0oO.getPostAdapter().f44990OooO00o = MomentAdapterTag.MomentListFollowingFragment_Recommend;
                    this.f11551Oooo0oO.loadRecommendPost(true);
                } else {
                    this.f11551Oooo0oO.getPostAdapter().f44990OooO00o = MomentAdapterTag.MomentListFollowingFragment;
                    this.f11551Oooo0oO.isRecommend = false;
                    this.f11551Oooo0oO.setHeaderView();
                    MomentFollowHeadView momentFollowHeadView = this.f11551Oooo0oO.headView;
                    if (momentFollowHeadView != null) {
                        momentFollowHeadView.setVisibilityReCommentHead(8);
                    }
                    if (list2 != null) {
                        this.f11551Oooo0oO.listData.addAll(list2);
                    }
                    o000O0.OooO0Oo(this.f11551Oooo0oO.listData, com.app.base.fragment.OooO0O0.f11610Oooo0o);
                    o00000OO postAdapter = this.f11551Oooo0oO.getPostAdapter();
                    p169o00Ooo00.OooOOOO oooOOOO = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    postAdapter.setNewData(p169o00Ooo00.OooOOOO.OooO00o(this.f11551Oooo0oO.listData));
                }
            } else {
                if (list2 != null) {
                    this.f11551Oooo0oO.listData.addAll(list2);
                }
                o000O0.OooO0Oo(this.f11551Oooo0oO.listData, com.app.base.fragment.OooO0O0.f11610Oooo0o);
                o00000OO postAdapter2 = this.f11551Oooo0oO.getPostAdapter();
                p169o00Ooo00.OooOOOO oooOOOO2 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                postAdapter2.setNewData(p169o00Ooo00.OooOOOO.OooO00o(this.f11551Oooo0oO.listData));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<List<MomentDetailModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f11552Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainMomentFollowingFragment f11553Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, MainMomentFollowingFragment mainMomentFollowingFragment) {
            super(1);
            this.f11552Oooo0o = z;
            this.f11553Oooo0oO = mainMomentFollowingFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentDetailModel> list) {
            List<MomentDetailModel> list2 = list;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    ((MomentDetailModel) it.next()).setFeatured(true);
                }
            }
            if (this.f11552Oooo0o) {
                this.f11553Oooo0oO.listData.clear();
                this.f11553Oooo0oO.setHeaderView();
                MomentFollowHeadView momentFollowHeadView = this.f11553Oooo0oO.headView;
                if (momentFollowHeadView != null) {
                    momentFollowHeadView.setVisibilityReCommentHead(0);
                }
            }
            if (list2 != null) {
                this.f11553Oooo0oO.listData.addAll(list2);
            }
            o000O0.OooO0Oo(this.f11553Oooo0oO.listData, com.app.base.fragment.OooO0OO.f11611Oooo0o);
            this.f11553Oooo0oO.getPostAdapter().setNewData(this.f11553Oooo0oO.listData);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<List<MomentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f11555Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(1);
            this.f11555Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentDetailModel>> apiResult) {
            ApiResult<List<MomentDetailModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z = true;
            if (it.isSuccess()) {
                MainMomentFollowingFragment mainMomentFollowingFragment = MainMomentFollowingFragment.this;
                Long dateSort = it.getPage().getDateSort();
                mainMomentFollowingFragment.dateSortRecommendPost = dateSort != null ? dateSort.longValue() : 0L;
                MainMomentFollowingFragment.this.pageIndexRecommendPost = it.getPage().getPageIndex() + 1;
            }
            MainMomentFollowingFragment.this.getBinding().f49086OooO0OO.Oooo0OO(this.f11555Oooo0oO, it.isSuccess());
            List<MomentDetailModel> data = it.getData();
            if (!(data == null || data.isEmpty())) {
                List<MomentDetailModel> data2 = it.getData();
                Integer numValueOf = data2 != null ? Integer.valueOf(data2.size()) : null;
                Intrinsics.checkNotNull(numValueOf);
                if (numValueOf.intValue() >= Integer.parseInt("15")) {
                    z = false;
                }
            }
            MainMomentFollowingFragment.this.getPostAdapter().setLoadComplete(Boolean.valueOf(this.f11555Oooo0oO), Boolean.valueOf(it.isSuccess()), Boolean.valueOf(z));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f11557Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentSendModel momentSendModel) {
            super(1);
            this.f11557Oooo0oO = momentSendModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            List<MomentDetailModel> data = MainMomentFollowingFragment.this.getPostAdapter().getData();
            Intrinsics.checkNotNullExpressionValue(data, "postAdapter.data");
            MomentSendModel momentSendModel = this.f11557Oooo0oO;
            Iterator<MomentDetailModel> it = data.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                MomentSendModel sendPostModel = it.next().getSendPostModel();
                if (sendPostModel != null && sendPostModel.getTaskId() == momentSendModel.getTaskId()) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                if (this.f11557Oooo0oO.getPower() == MomentTypePower.Self.getValue() && MainMomentFollowingFragment.this.getPostAdapter().getData().size() > i) {
                    MainMomentFollowingFragment.this.getPostAdapter().remove(i);
                    MainMomentFollowingFragment.this.getPostAdapter().notifyItemRemoved(MainMomentFollowingFragment.this.getPostAdapter().getHeaderLayoutCount() + i);
                } else if (momentDetailModel2 != null) {
                    MainMomentFollowingFragment mainMomentFollowingFragment = MainMomentFollowingFragment.this;
                    if (mainMomentFollowingFragment.getPostAdapter().getData().size() > i) {
                        mainMomentFollowingFragment.getPostAdapter().setData(i, momentDetailModel2);
                    }
                }
            } else if (momentDetailModel2 != null) {
                MomentSendModel momentSendModel2 = this.f11557Oooo0oO;
                MainMomentFollowingFragment mainMomentFollowingFragment2 = MainMomentFollowingFragment.this;
                if (momentSendModel2.getPower() != MomentTypePower.Self.getValue()) {
                    mainMomentFollowingFragment2.getPostAdapter().addData(0, momentDetailModel2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<o00000OO> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            FragmentActivity fragmentActivityRequireActivity = MainMomentFollowingFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new o00000OO(fragmentActivityRequireActivity, MomentAdapterTag.MomentListFollowingFragment);
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<MomentDetailModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f11560Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(long j) {
            super(1);
            this.f11560Oooo0oO = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2 != null) {
                List<MomentDetailModel> data = MainMomentFollowingFragment.this.getPostAdapter().getData();
                Intrinsics.checkNotNullExpressionValue(data, "postAdapter.data");
                long j = this.f11560Oooo0oO;
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
                if (i != -1 && MainMomentFollowingFragment.this.getPostAdapter().getData().size() > i) {
                    if (momentDetailModel2.getPower() == MomentTypePower.Self.getValue()) {
                        MainMomentFollowingFragment.this.getPostAdapter().remove(i);
                        MainMomentFollowingFragment.this.getPostAdapter().notifyItemRemoved(MainMomentFollowingFragment.this.getPostAdapter().getHeaderLayoutCount() + i);
                    } else {
                        MainMomentFollowingFragment.this.getPostAdapter().setData(i, momentDetailModel2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public MainMomentFollowingFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.app.base.fragment.MainMomentFollowingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.app.base.fragment.MainMomentFollowingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.mMomentVM = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.app.base.fragment.MainMomentFollowingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.app.base.fragment.MainMomentFollowingFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f11564Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f11564Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.fragment.MainMomentFollowingFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.postAdapter = LazyKt.lazy(new OooOOO0());
        this.listData = new ArrayList();
        this.pageIndexPostList = 1;
        this.pageIndexRecommendPost = 1;
    }

    private final MomentVM getMMomentVM() {
        return (MomentVM) this.mMomentVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o00000OO getPostAdapter() {
        return (o00000OO) this.postAdapter.getValue();
    }

    private final void initFollowHeader() {
        Context context = getContext();
        if (context != null) {
            MomentFollowHeadView momentFollowHeadView = new MomentFollowHeadView(context, null, 0);
            this.headView = momentFollowHeadView;
            momentFollowHeadView.setListener(new OooO00o());
            setHeaderView();
        }
    }

    private final void initObserver() {
        int i = 0;
        LiveEventBus.get("MOMENT_POST_DELETE", MomentDetailModel.class).observe(this, new o0OOO0o(this, i));
        LiveEventBus.get("MOMENT_POST_COMMENT", MomentDetailModel.class).observe(this, new o00000(this, i));
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().observe(this, new o00000O(this, i));
        LiveEventBus.get("POST_READ_NEW").observe(this, new o000000(this, i));
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o0O0O00(this, i));
        LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o000OOo(this, i));
        Class cls = Long.TYPE;
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new o000000O(this, i));
        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM", MomentChangeUserIsInRoomModel.class).observe(this, new p142o00OOooO.o00000OO(this, i));
        LiveEventBus.get("Post_send_add", MomentSendModel.class).observe(this, new oo000o(this, i));
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new o00000O0(this, i));
        LiveEventBus.get("Post_send_success", MomentSendModel.class).observe(this, new o00oO0o(this, i));
        LiveEventBus.get("Post_send_filed", MomentSendModel.class).observe(this, new oo0o0Oo(this, i));
        LiveEventBus.get("Post_send_delete", MomentSendModel.class).observe(this, new o0ooOOo(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-1, reason: not valid java name */
    public static final void m11initObserver$lambda1(MainMomentFollowingFragment this$0, MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<MomentDetailModel> data = this$0.getPostAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "postAdapter.data");
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((MomentDetailModel) obj).getId() == momentDetailModel.getId()) {
                this$0.getPostAdapter().remove(i);
                if (this$0.getPostAdapter().getData().isEmpty()) {
                    this$0.getPostAdapter().setLoadComplete(true);
                    loadPostList$default(this$0, false, 1, null);
                    return;
                }
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-10, reason: not valid java name */
    public static final void m12initObserver$lambda10(MainMomentFollowingFragment this$0, Long l) {
        MomentForwardContent forwardContent;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getPostAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            MomentDetailModel momentDetailModel = this$0.getPostAdapter().getData().get(i);
            if ((momentDetailModel == null || (forwardContent = momentDetailModel.getForwardContent()) == null || forwardContent.getShareType() != 20) ? false : true) {
                MomentForwardContent forwardContent2 = momentDetailModel.getForwardContent();
                if (Intrinsics.areEqual(forwardContent2 != null ? Long.valueOf(forwardContent2.getId()) : null, l)) {
                    momentDetailModel.setDeleteType(MomentTypeDelete.EVENT.getValue());
                    FixedRecyclerView fixedRecyclerView = this$0.getBinding().f49085OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
                    o00O00OO.OooO00o(fixedRecyclerView, this$0.getPostAdapter().getHeaderLayoutCount() + i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-11, reason: not valid java name */
    public static final void m13initObserver$lambda11(MainMomentFollowingFragment this$0, MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (int i = 0; i < this$0.getPostAdapter().getData().size(); i++) {
            MomentDetailModel momentDetailModel = this$0.getPostAdapter().getData().get(i);
            if (momentDetailModel.getUserId() == com.yalla.support.common.util.OooO.OooO0o(momentChangeUserIsInRoomModel.getUserId()) && momentDetailModel.getIsInRoom() != momentChangeUserIsInRoomModel.getIsInRoom()) {
                momentDetailModel.setInRoom(momentChangeUserIsInRoomModel.getIsInRoom());
                FixedRecyclerView fixedRecyclerView = this$0.getBinding().f49085OooO0O0;
                Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
                o00O00OO.OooO00o(fixedRecyclerView, this$0.getPostAdapter().getHeaderLayoutCount() + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-12, reason: not valid java name */
    public static final void m14initObserver$lambda12(MainMomentFollowingFragment this$0, MomentSendModel momentSendModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O00.OooO0O0("动态任务 新增 刷新 ");
        if (this$0.isRecommend) {
            this$0.getPostAdapter().getData().clear();
            this$0.getPostAdapter().removeAllHeaderView();
        }
        o00000OO postAdapter = this$0.getPostAdapter();
        p169o00Ooo00.OooOOOO oooOOOO = p169o00Ooo00.OooOOOO.f32671OooO00o;
        postAdapter.setNewData(p169o00Ooo00.OooOOOO.OooO00o(this$0.getPostAdapter().getData()));
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this$0.getBinding().f49085OooO0O0.getLayoutManager();
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(0, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-13, reason: not valid java name */
    public static final void m15initObserver$lambda13(MainMomentFollowingFragment this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O00.OooOO0O("动态编辑 发送成功 刷新 = " + it);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.squareSingle4Edited(it.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-15, reason: not valid java name */
    public static final void m16initObserver$lambda15(MainMomentFollowingFragment this$0, MomentSendModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O00.OooO0O0("动态任务 发送成功 刷新 taskModel = " + it);
        List<MomentDetailModel> data = this$0.getPostAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "postAdapter.data");
        Iterator<MomentDetailModel> it2 = data.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            MomentSendModel sendPostModel = it2.next().getSendPostModel();
            if (sendPostModel != null && sendPostModel.getTaskId() == it.getTaskId()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            FixedRecyclerView fixedRecyclerView = this$0.getBinding().f49085OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
            o00O00OO.OooO00o(fixedRecyclerView, this$0.getPostAdapter().getHeaderLayoutCount() + i);
        }
        if (this$0.isRecommend) {
            loadPostList$default(this$0, false, 1, null);
            return;
        }
        if (it.getPower() != MomentTypePower.Self.getValue()) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.squareSingle(it);
        } else if (i != -1) {
            this$0.getPostAdapter().remove(i);
            this$0.getPostAdapter().notifyItemRemoved(this$0.getPostAdapter().getHeaderLayoutCount() + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-18, reason: not valid java name */
    public static final void m17initObserver$lambda18(MainMomentFollowingFragment this$0, MomentSendModel momentSendModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<MomentDetailModel> data = this$0.getPostAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "postAdapter.data");
        Iterator<MomentDetailModel> it = data.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            MomentSendModel sendPostModel = it.next().getSendPostModel();
            if (sendPostModel != null && sendPostModel.getTaskId() == momentSendModel.getTaskId()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            List<MomentDetailModel> data2 = this$0.getPostAdapter().getData();
            MomentDetailModel momentDetailModel = new MomentDetailModel();
            momentDetailModel.setSendPostModel(momentSendModel);
            momentDetailModel.setId(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
            Unit unit = Unit.INSTANCE;
            data2.set(i, momentDetailModel);
            FixedRecyclerView fixedRecyclerView = this$0.getBinding().f49085OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
            o00O00OO.OooO00o(fixedRecyclerView, this$0.getPostAdapter().getHeaderLayoutCount() + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-20, reason: not valid java name */
    public static final void m18initObserver$lambda20(MainMomentFollowingFragment this$0, MomentSendModel momentSendModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<MomentDetailModel> data = this$0.getPostAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "postAdapter.data");
        Iterator<MomentDetailModel> it = data.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            MomentSendModel sendPostModel = it.next().getSendPostModel();
            if (sendPostModel != null && sendPostModel.getTaskId() == momentSendModel.getTaskId()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this$0.getPostAdapter().getData().remove(i);
            this$0.getPostAdapter().notifyItemRemoved(this$0.getPostAdapter().getHeaderLayoutCount() + i);
        }
        if (this$0.getPostAdapter().getData().isEmpty()) {
            loadPostList$default(this$0, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-3, reason: not valid java name */
    public static final void m19initObserver$lambda3(MainMomentFollowingFragment this$0, MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<MomentDetailModel> data = this$0.getPostAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "postAdapter.data");
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MomentDetailModel momentDetailModel2 = (MomentDetailModel) obj;
            if (momentDetailModel2.getId() == momentDetailModel.getId()) {
                momentDetailModel2.setCommentNum(momentDetailModel.getCommentNum());
                FixedRecyclerView fixedRecyclerView = this$0.getBinding().f49085OooO0O0;
                Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
                o00O00OO.OooO00o(fixedRecyclerView, this$0.getPostAdapter().getHeaderLayoutCount() + i);
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-4, reason: not valid java name */
    public static final void m20initObserver$lambda4(MainMomentFollowingFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.getMMomentVM().startCheckNewPostJob();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-6, reason: not valid java name */
    public static final void m21initObserver$lambda6(MainMomentFollowingFragment this$0, Object obj) {
        List<RecommendNewPostModel> data;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setHeaderView();
        MomentFollowHeadView momentFollowHeadView = this$0.headView;
        if (momentFollowHeadView == null || (data = momentFollowHeadView.getData()) == null) {
            return;
        }
        this$0.getMMomentVM().checkUnreadPost(data, false);
        MomentFollowHeadView momentFollowHeadView2 = this$0.headView;
        if (momentFollowHeadView2 != null) {
            momentFollowHeadView2.OooO0OO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-7, reason: not valid java name */
    public static final void m22initObserver$lambda7(MainMomentFollowingFragment this$0, MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (int i = 0; i < this$0.getPostAdapter().getData().size(); i++) {
            if (this$0.getPostAdapter().getData().get(i).getId() == momentDetailModel.getId()) {
                this$0.getPostAdapter().getData().set(i, momentDetailModel);
                FixedRecyclerView fixedRecyclerView = this$0.getBinding().f49085OooO0O0;
                Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
                o00O00OO.OooO00o(fixedRecyclerView, this$0.getPostAdapter().getHeaderLayoutCount() + i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-9, reason: not valid java name */
    public static final void m23initObserver$lambda9(MainMomentFollowingFragment this$0, MomentDetailModel momentDetailModel) {
        MomentDetailModel forward;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (int i = 0; i < this$0.getPostAdapter().getData().size(); i++) {
            MomentDetailModel momentDetailModel2 = this$0.getPostAdapter().getData().get(i);
            int type = momentDetailModel2.getType();
            if (type == MomentType.Poll.getValue()) {
                if (momentDetailModel2.getId() == momentDetailModel.getId()) {
                    o00O00.OooO0oO("POST_DETAIL_POLL_DATA_REFRESH FollowingFragment i= " + i + "\nresult = " + momentDetailModel);
                    this$0.getPostAdapter().getData().set(i, momentDetailModel);
                    FixedRecyclerView fixedRecyclerView = this$0.getBinding().f49085OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
                    o00O00OO.OooO00o(fixedRecyclerView, this$0.getPostAdapter().getHeaderLayoutCount() + i);
                }
            } else if (type == MomentType.Forward.getValue() && (forward = momentDetailModel2.getForward()) != null && forward.getId() == momentDetailModel.getId()) {
                o00O00.OooO0oO("POST_DETAIL_POLL_DATA_REFRESH FollowingFragment i= " + i + "\nresult = " + momentDetailModel);
                MomentDetailModel momentDetailModel3 = this$0.getPostAdapter().getData().get(i);
                if (momentDetailModel3 != null) {
                    momentDetailModel3.setForward(momentDetailModel);
                }
                FixedRecyclerView fixedRecyclerView2 = this$0.getBinding().f49085OooO0O0;
                Intrinsics.checkNotNullExpressionValue(fixedRecyclerView2, "binding.rvMomentFollowing");
                o00O00OO.OooO00o(fixedRecyclerView2, this$0.getPostAdapter().getHeaderLayoutCount() + i);
            }
        }
    }

    private final void initView() {
        getBinding().f49086OooO0OO.setOnRefreshListener(new o0OO00O(this, 0));
        getPostAdapter().f44994OooO0o = EnterRoomParentPage.Moments_Following_SharedRoom;
        getPostAdapter().setLoadErrorClickListener(new OooO0O0());
        getPostAdapter().setOnLoadMoreListener(new o0Oo0oo(this), getBinding().f49085OooO0O0);
        getBinding().f49085OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49085OooO0O0.setAdapter(getPostAdapter());
        this.mPostGifPlayControl = new PostGifPlayControl(this, getBinding().f49085OooO0O0);
        p617o0oo0o.o00000OO o00000oo2 = p617o0oo0o.o00000OO.f48476OooO00o;
        FixedRecyclerView fixedRecyclerView = getBinding().f49085OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMomentFollowing");
        p617o0oo0o.o00000OO.OooO00o(fixedRecyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-22, reason: not valid java name */
    public static final void m24initView$lambda22(MainMomentFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PostGifPlayControl postGifPlayControl = this$0.mPostGifPlayControl;
        if (postGifPlayControl != null) {
            postGifPlayControl.OooO0OO();
        }
        loadPostList$default(this$0, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-23, reason: not valid java name */
    public static final void m25initView$lambda23(MainMomentFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isRecommend) {
            this$0.loadRecommendPost(false);
        } else {
            this$0.loadPostList(false);
        }
    }

    private final void loadHaveNewPostUser() {
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.FALSE)) {
            return;
        }
        getMMomentVM().momentRecommendUserList().observe(getViewLifecycleOwner(), new OooOo(new OooO0OO(), null, null, false, 14));
    }

    private final void loadPostList(boolean isRefresh) {
        if (isRefresh) {
            this.dataSortPostList = 0L;
            this.pageIndexPostList = 1;
            this.isRecommend = false;
            loadHaveNewPostUser();
        }
        getMMomentVM().momentFollowList(Long.valueOf(this.dataSortPostList), this.pageIndexPostList).observe(getViewLifecycleOwner(), new OooOo(new OooO0o(isRefresh, this), null, new OooO(isRefresh), false, 10));
    }

    public static /* synthetic */ void loadPostList$default(MainMomentFollowingFragment mainMomentFollowingFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentFollowingFragment.loadPostList(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadRecommendPost(boolean isRefresh) {
        if (isRefresh) {
            this.dateSortRecommendPost = 0L;
            this.pageIndexRecommendPost = 1;
        }
        getMMomentVM().momentRecommendList(this.dateSortRecommendPost, this.pageIndexRecommendPost).observe(getViewLifecycleOwner(), new OooOo(new OooOO0(isRefresh, this), null, new OooOO0O(isRefresh), false, 10));
    }

    public static /* synthetic */ void loadRecommendPost$default(MainMomentFollowingFragment mainMomentFollowingFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        mainMomentFollowingFragment.loadRecommendPost(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHeaderView() {
        MomentFollowHeadView momentFollowHeadView = this.headView;
        if ((momentFollowHeadView != null ? momentFollowHeadView.getParent() : null) == null) {
            getPostAdapter().setHeaderView(this.headView);
        }
    }

    private final void squareSingle(MomentSendModel post) {
        MomentVM.momentDetail$default(getMMomentVM(), String.valueOf(post.getPostId()), 0, 2, null).observe(getViewLifecycleOwner(), new OooOo(new OooOOO(post), null, null, false, 14));
    }

    private final void squareSingle4Edited(long postId) {
        MomentVM.momentDetail$default(getMMomentVM(), String.valueOf(postId), 0, 2, null).observe(getViewLifecycleOwner(), new OooOo(new OooOOOO(postId), null, null, false, 14));
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMMomentVM().statisticalTime();
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initFollowHeader();
        initObserver();
        loadPostList$default(this, false, 1, null);
        loadHaveNewPostUser();
        getMMomentVM().statisticalTime();
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("MainMomentFollowingFragment");
        o0O00000.OooO0o0("Moments_Following_stay", getTimeLengthStr());
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.android.billingclient.api.o00000O.OooO0O0().OooOOOO(0);
        MobclickAgent.onPageStart("MainMomentFollowingFragment");
        o0O00000.OooO0OO("Moments_Following");
    }

    public final void scrollToTop() {
        getBinding().f49085OooO0O0.scrollToPosition(0);
        if (getBinding().f49086OooO0OO.getState() == RefreshState.None) {
            getBinding().f49086OooO0OO.OooO();
            getBinding().f49086OooO0OO.Oooo00o();
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public c9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        c9 c9VarInflate = c9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(c9VarInflate, "inflate(inflater)");
        return c9VarInflate;
    }
}
