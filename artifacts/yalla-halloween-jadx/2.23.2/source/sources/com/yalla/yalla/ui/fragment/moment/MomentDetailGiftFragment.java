package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentGift;
import com.yalla.yalla.ui.view.EmptyView;
import com.yalla.yalla.ui.view.moment.MomentDetailGiftHeaderView;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oOO0OO;
import p414o0Oo0oO.oO00O0o0;
import p475o0Ooooo0.o0O00oO0;
import p527o0o0OO0o.o000O;
import p650o0ooo.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bH\u0010IJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0013J\u001e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\nJ\b\u0010!\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\nH\u0002J\b\u0010#\u001a\u00020\nH\u0002J\"\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u0010H\u0002R!\u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010B\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0016\u0010C\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R\u0016\u0010D\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00109R\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010@¨\u0006L"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MomentDetailGiftFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oOO0OO;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "", "isShowCurrentFragment", "showFragment", "", ShareConstants.RESULT_POST_ID, "setData", "count", "setCount", "giftId", "", "giftNum", "", "giftImage", "addSendGiftItem", "isMoveToListTop", "tabRefreshData", "initData", "showFirstPostSendGiftInfo", "init", "showHotOrNewHeaderView", "isRefresh", "showLoading", "loadData", "Lo0oOoO0/o0000oo;", "Lcom/yalla/yalla/model/moment/MomentGift;", "baseAdapter$delegate", "Lkotlin/Lazy;", "getBaseAdapter", "()Lo0oOoO0/o0000oo;", "baseAdapter", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm", "Lcom/yalla/yalla/ui/view/moment/MomentDetailGiftHeaderView;", "mPostDetailGiftHeaderView", "Lcom/yalla/yalla/ui/view/moment/MomentDetailGiftHeaderView;", "mPostId", "Ljava/lang/Long;", "giftListType", "I", "Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView$delegate", "getEmptyView", "()Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView", "mIsShowCurrentFragment", "Z", "mIsRefresh", "mIsSuccess", "mIsNoMoreData", "pageIndex", "dateSort", "J", "isInitLoadData", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentDetailGiftFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailGiftFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailGiftFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,339:1\n106#2,15:340\n*S KotlinDebug\n*F\n+ 1 MomentDetailGiftFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailGiftFragment\n*L\n108#1:340,15\n*E\n"})
public final class MomentDetailGiftFragment extends o000O<oOO0OO> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String GIFT_LIST_TYPE = "GIFT_LIST_TYPE";

    @NotNull
    private static final String POST_ID = "POST_ID";

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter = LazyKt.lazy(new OooO0O0());
    private long dateSort;

    /* JADX INFO: renamed from: emptyView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyView;
    private int giftListType;
    private boolean isInitLoadData;
    private boolean mIsNoMoreData;
    private boolean mIsRefresh;
    private boolean mIsShowCurrentFragment;
    private boolean mIsSuccess;

    @Nullable
    private MomentDetailGiftHeaderView mPostDetailGiftHeaderView;

    @Nullable
    private Long mPostId;
    private int pageIndex;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<List<MomentGift>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28215OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f28215OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentGift> list) {
            List<MomentGift> list2 = list;
            MomentDetailGiftFragment momentDetailGiftFragment = MomentDetailGiftFragment.this;
            if (list2 != null) {
                if (this.f28215OooO0o0) {
                    momentDetailGiftFragment.getBaseAdapter().OooOoO0(list2);
                    momentDetailGiftFragment.showHotOrNewHeaderView();
                } else {
                    momentDetailGiftFragment.getBaseAdapter().OooO0O0(list2);
                }
            }
            momentDetailGiftFragment.pageIndex++;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00000OO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            MomentDetailGiftFragment momentDetailGiftFragment = MomentDetailGiftFragment.this;
            return new o00000OO(momentDetailGiftFragment, momentDetailGiftFragment.getContext(), p562o0oOo000.oo0o0Oo.item_post_detail_gift_list);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<EmptyView> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EmptyView invoke() {
            MomentDetailGiftFragment momentDetailGiftFragment = MomentDetailGiftFragment.this;
            Context contextRequireContext = momentDetailGiftFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            EmptyView emptyView = new EmptyView(contextRequireContext, null, 6, 0);
            emptyView.setImage(Integer.valueOf(p562o0oOo000.o0Oo0oo.icon_no_list_gift));
            emptyView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.No_gifts_yet));
            EmptyView.OooO00o(emptyView, new o0000Ooo(momentDetailGiftFragment));
            return emptyView;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o0oo0000.OooO00o.OooO0O0("103048");
            MomentDetailGiftFragment momentDetailGiftFragment = MomentDetailGiftFragment.this;
            momentDetailGiftFragment.giftListType = iIntValue;
            momentDetailGiftFragment.loadData(true, false, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f28219OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j) {
            super(1);
            this.f28219OooO0Oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int code = it.getCode();
            long j = this.f28219OooO0Oo;
            if (code == 2095) {
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Long.valueOf(j));
            } else if (code == 4000) {
                LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(Long.valueOf(j));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<List<MomentGift>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28220OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f28221OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailGiftFragment f28222OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z, MomentDetailGiftFragment momentDetailGiftFragment, boolean z2) {
            super(1);
            this.f28220OooO0Oo = z;
            this.f28222OooO0o0 = momentDetailGiftFragment;
            this.f28221OooO0o = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentGift>> apiResult) {
            ApiResult<List<MomentGift>> result = apiResult;
            Intrinsics.checkNotNullParameter(result, "result");
            Long dateSort = result.getPage().getDateSort();
            MomentDetailGiftFragment momentDetailGiftFragment = this.f28222OooO0o0;
            if (dateSort != null) {
                momentDetailGiftFragment.dateSort = dateSort.longValue();
            }
            if (this.f28220OooO0Oo) {
                momentDetailGiftFragment.getBinding().f45107OooO0O0.scrollToPosition(0);
            }
            momentDetailGiftFragment.mIsRefresh = this.f28221OooO0o;
            momentDetailGiftFragment.mIsSuccess = result.isSuccess();
            List<MomentGift> data = result.getData();
            momentDetailGiftFragment.mIsNoMoreData = data == null || data.isEmpty();
            if (momentDetailGiftFragment.getBaseAdapter().f13189OooOOoo.isEmpty()) {
                if (result.isSuccess()) {
                    momentDetailGiftFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                } else {
                    momentDetailGiftFragment.getEmptyView().OooO0O0(EmptyView.State.DataError);
                }
                momentDetailGiftFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailGiftFragment.getBinding().f45109OooO0Oo.OooO0Oo();
            LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").post(Boolean.TRUE);
            momentDetailGiftFragment.getBaseAdapter().Oooo0(Boolean.valueOf(momentDetailGiftFragment.mIsRefresh), Boolean.valueOf(momentDetailGiftFragment.mIsSuccess), Boolean.valueOf(momentDetailGiftFragment.mIsNoMoreData));
            momentDetailGiftFragment.getBinding().f45108OooO0OO.OooOoOO(momentDetailGiftFragment.mIsRefresh, momentDetailGiftFragment.mIsSuccess, momentDetailGiftFragment.mIsNoMoreData);
            momentDetailGiftFragment.showFirstPostSendGiftInfo();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment$special$$inlined$viewModels$default$1] */
    public MomentDetailGiftFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28226OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28226OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment$special$$inlined$viewModels$default$5
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
        this.giftListType = 1;
        this.emptyView = LazyKt.lazy(new OooO0OO());
        this.pageIndex = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p571o0oOoO0.o0000oo<MomentGift> getBaseAdapter() {
        return (p571o0oOoO0.o0000oo) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyView getEmptyView() {
        return (EmptyView) this.emptyView.getValue();
    }

    private final BaseMomentDetailVM getVm() {
        return (BaseMomentDetailVM) this.vm.getValue();
    }

    private final void init() {
        getBinding().f45107OooO0O0.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().f45107OooO0O0.setAdapter(getBaseAdapter());
        getBaseAdapter().OooOo0(getEmptyView());
        int i = 0;
        getBinding().f45108OooO0OO.f20857OooOooO = false;
        getBinding().f45108OooO0OO.OooOo00(true);
        getBinding().f45108OooO0OO.OooOoo0(new p289o0O0Oo0.o000O(this));
        Context context = getContext();
        if (context != null) {
            MomentDetailGiftHeaderView momentDetailGiftHeaderView = new MomentDetailGiftHeaderView(context, null, 6, i);
            momentDetailGiftHeaderView.setData(this.giftListType);
            momentDetailGiftHeaderView.setItemListener(new OooO0o());
            this.mPostDetailGiftHeaderView = momentDetailGiftHeaderView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(MomentDetailGiftFragment this$0, o0OO0oO0.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        loadData$default(this$0, false, false, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh, boolean isMoveToListTop, boolean showLoading) {
        Long l = this.mPostId;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.mPostId;
            if (l2 != null && l2.longValue() == 0) {
                return;
            }
            if (!this.isInitLoadData) {
                this.isInitLoadData = true;
            }
            if (isRefresh) {
                this.pageIndex = 1;
                this.dateSort = 0L;
                if (showLoading) {
                    getBinding().f45109OooO0Oo.OooO0oo();
                }
            }
            getVm().momentGiftList(jLongValue, this.giftListType, this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO(isRefresh), new OooOO0(jLongValue), new OooOO0O(isMoveToListTop, this, isRefresh), false));
        }
    }

    public static /* synthetic */ void loadData$default(MomentDetailGiftFragment momentDetailGiftFragment, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = true;
        }
        momentDetailGiftFragment.loadData(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFirstPostSendGiftInfo() {
        if (this.mIsShowCurrentFragment) {
            List<MomentGift> list = getBaseAdapter().f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
            if (!list.isEmpty()) {
                oO00O0o0 oo00o0o0OooO = p415o0Oo0oO0.o00Ooo.OooO();
                oo00o0o0OooO.getClass();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (oo00o0o0OooO.OooO0O0("momentFirstSendGiftInfo" + o0O00oO0.OooOOo0().getValue(), false)) {
                    return;
                }
                oO00O0o0 oo00o0o0OooO2 = p415o0Oo0oO0.o00Ooo.OooO();
                oo00o0o0OooO2.getClass();
                oo00o0o0OooO2.OooO0o("momentFirstSendGiftInfo" + o0O00oO0.OooOOo0().getValue(), true);
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
                BaseFragmentActivity activity = (BaseFragmentActivity) fragmentActivityRequireActivity;
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.showDialog((String) null, oOO00O.f58931OooO0O0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHotOrNewHeaderView() {
        List<MomentGift> list = getBaseAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        if (!(!list.isEmpty())) {
            getBaseAdapter().OooOOoo();
            return;
        }
        MomentDetailGiftHeaderView momentDetailGiftHeaderView = this.mPostDetailGiftHeaderView;
        if ((momentDetailGiftHeaderView != null ? momentDetailGiftHeaderView.getParent() : null) == null) {
            getBaseAdapter().OooO0o0(this.mPostDetailGiftHeaderView, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addSendGiftItem(long giftId, int giftNum, @NotNull String giftImage) {
        String imageUrl;
        Intrinsics.checkNotNullParameter(giftImage, "giftImage");
        try {
            if (giftImage.length() == 0) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p391o0OOooo0.oo0o0Oo.f43573OooO00o;
                GiftPropModel giftPropModelOooO0O0 = p391o0OOooo0.oo0o0Oo.OooO0O0((int) giftId);
                giftImage = (giftPropModelOooO0O0 == null || (imageUrl = giftPropModelOooO0O0.getImageUrl()) == null) ? null : com.code.android.util.o0OoOo0.OooOOO(imageUrl, "");
            }
            MomentGift momentGift = new MomentGift();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            momentGift.setHeadUrl((String) o0O00oO0.OooO().getValue());
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            momentGift.setUserId(l == null ? 0L : l.longValue());
            momentGift.setNickname((String) o0O00oO0.OooOOoo().getValue());
            Integer num = (Integer) o0O00oO0.OooOOO().getValue();
            momentGift.setSex(num == null ? 2 : num.intValue());
            Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
            if (pair != null) {
                momentGift.setIsVip(((Boolean) pair.getFirst()).booleanValue() ? 1 : 0);
                momentGift.setVipLevel(((Number) pair.getSecond()).intValue());
            }
            momentGift.setPropId((int) giftId);
            momentGift.setPropNum(giftNum);
            momentGift.setPropImage(giftImage);
            momentGift.kaVIPLv = 0;
            Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
            if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) {
                momentGift.kaVIPLv = ((Number) pair2.getSecond()).intValue();
            }
            getBaseAdapter().OooO00o(momentGift);
            getBinding().f45107OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + 0);
            if (getBaseAdapter().f13189OooOOoo.isEmpty()) {
                getEmptyView().OooO0O0(EmptyView.State.DataNull);
                getBaseAdapter().OooOoOO(true);
            }
            getBinding().f45109OooO0Oo.OooO0Oo();
            showHotOrNewHeaderView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void initData() {
        if (this.isInitLoadData) {
            return;
        }
        loadData$default(this, true, false, false, 4, null);
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mPostId = Long.valueOf(arguments.getLong(POST_ID, 0L));
            this.giftListType = com.code.android.util.o0OoOo0.OooO0o0(1, Integer.valueOf(arguments.getInt(GIFT_LIST_TYPE, 1)));
        }
        if (this.giftListType == -1) {
            this.giftListType = 1;
        }
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getVm().statisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        init();
        getVm().statisticalTime();
    }

    public final void setCount(long count) {
        MomentDetailGiftHeaderView momentDetailGiftHeaderView = this.mPostDetailGiftHeaderView;
        if (momentDetailGiftHeaderView != null) {
            momentDetailGiftHeaderView.setCount(count);
        }
    }

    public final void setData(long postId) {
        this.mPostId = Long.valueOf(postId);
    }

    public final void showFragment(boolean isShowCurrentFragment) {
        this.mIsShowCurrentFragment = isShowCurrentFragment;
        showFirstPostSendGiftInfo();
    }

    public final void tabRefreshData(boolean isMoveToListTop) {
        loadData$default(this, true, isMoveToListTop, false, 4, null);
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oOO0OO getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oOO0OO ooo0ooInflate = oOO0OO.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(ooo0ooInflate, "inflate(...)");
        return ooo0ooInflate;
    }
}
