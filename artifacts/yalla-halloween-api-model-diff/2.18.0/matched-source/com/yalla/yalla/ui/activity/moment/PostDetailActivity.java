package com.yalla.yalla.ui.activity.moment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o00000O0;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.impl.PostGifPlayControl;
import com.app.base.view.EmojiFaceView;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostGiftResultModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import com.yalla.yalla.ui.fragment.PostDetailGiftFragment;
import com.yalla.yalla.ui.fragment.PostDetailPraiseFragment;
import com.yalla.yalla.ui.view.MomentDetailView;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o00000;
import p143o00OOooO.o000000;
import p143o00OOooO.o000000O;
import p143o00OOooO.o00000OO;
import p143o00OOooO.o0000oo;
import p143o00OOooO.o000OOo;
import p143o00OOooO.o00oO0o;
import p143o00OOooO.o0O0O00;
import p143o00OOooO.o0Oo0oo;
import p143o00OOooO.o0ooOOo;
import p143o00OOooO.oo0o0Oo;
import p144o00OOooo.o00OOOO0;
import p144o00OOooo.o00OOOOo;
import p144o00OOooo.o0o0Oo;
import p164o00OoOo.o00O00O;
import p193o00o0O0.o0OO00O;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p256o00ooO0o.oo0oOO0;
import p393o0OOooOo.o0O00000;
import p472o0Oooo0.o00O000;
import p472o0Oooo0.o00O0000;
import p480o0OooooO.oO0o0o;
import p517o0o0O00.o00O00;
import p538o0o0OOoo.m;
import p540o0o0Oo0.o00;
import p540o0o0Oo0.o000OO00;
import p540o0o0Oo0.o000OOo0;
import p540o0o0Oo0.o00oOoo;
import p540o0o0Oo0.o0O0ooO;
import p619o0oo0o.o000O000;
import p622o0oo0o0O.o00O00o0;
import p651o0ooOOoo.rc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/PostDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ak.aE, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22436o000000O = new OooO00o();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f22439OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f22440Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f22441Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public MomentAdapterTag f22442OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public String f22443Ooooooo;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f22444o000000;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f22446o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public PostCommentDetailModel f22447o00Oo0;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f22451o00oO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f22457o0OoOo0;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f22462oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f22463ooOO;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22437OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(rc.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f22438OooooOO = 7;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22448o00Ooo = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22449o00o0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22482Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22482Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22452o00ooo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22486Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22486Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22461oo000o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PrivateChatVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$8
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$7
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$9

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22490Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22490Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NotNull
    public List<Fragment> f22450o00oO0O = new ArrayList();

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public int f22458o0ooOO0 = -1;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22459o0ooOOo = LazyKt.lazy(new OooOo());

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f22460o0ooOoO = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22455o0OOO0o = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f22456o0Oo0oo = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @NotNull
    public final Lazy f22454o0OO00O = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    @NotNull
    public final Lazy f22453o0O0O00 = LazyKt.lazy(new OooOo00());

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    @Nullable
    public String f22445o000OOo = "";

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getCode() == 4000) {
                PostDetailActivity.this.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmStatic
        public final void OooO00o(@NotNull Context context, @Nullable MomentDetailModel momentDetailModel, boolean z, int i, @Nullable PostCommentDetailModel postCommentDetailModel, boolean z2, @Nullable MomentAdapterTag momentAdapterTag, boolean z3, @NotNull String fromDbMid) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fromDbMid, "fromDbMid");
            Intent intent = new Intent(context, (Class<?>) PostDetailActivity.class);
            intent.putExtra("Module", momentDetailModel);
            intent.putExtra("Type", z);
            intent.putExtra("ShowGiftListType", i);
            intent.putExtra("Data", postCommentDetailModel);
            intent.putExtra("FromTopicDetail", z2);
            intent.putExtra("FromMomentTag", momentAdapterTag);
            intent.putExtra("isExpandedHeadView", z3);
            intent.putExtra("FromDbMid", fromDbMid);
            context.startActivity(intent);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            iArr[MomentAdapterTag.MomentListFollowingFragment.ordinal()] = 1;
            iArr[MomentAdapterTag.MomentListFollowingFragment_Top.ordinal()] = 2;
            iArr[MomentAdapterTag.MomentListFollowingFragment_Recommend.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00O0000> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0000 invoke() {
            PostDetailActivity postDetailActivity = PostDetailActivity.this;
            OooO00o oooO00o = PostDetailActivity.f22436o000000O;
            PanelLayout panelLayout = postDetailActivity.OooOooO().f50517OooO0o;
            Intrinsics.checkNotNullExpressionValue(panelLayout, "binding.inputPanelLayout");
            EditTextSpan editTextSpan = PostDetailActivity.this.OooOooO().f50515OooO0OO;
            Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.editTextInput");
            o00O0000 o00o0001 = new o00O0000(panelLayout, editTextSpan);
            ImageView imageView = PostDetailActivity.this.OooOooO().f50520OooO0oo;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmoji");
            o00o0001.OooO0O0(imageView);
            return o00o0001;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<MomentDetailModel, Unit> {

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MomentAdapterTag.values().length];
                iArr[MomentAdapterTag.PrivateChat.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (!PostDetailActivity.this.isFinishing() && !PostDetailActivity.this.isDestroyed()) {
                if (momentDetailModel2 != null) {
                    PostDetailActivity postDetailActivity = PostDetailActivity.this;
                    if (momentDetailModel2.getIsInRoom() != postDetailActivity.f22441Oooooo0) {
                        MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel = new MomentChangeUserIsInRoomModel();
                        momentChangeUserIsInRoomModel.setUserId(String.valueOf(momentDetailModel2.getUserId()));
                        momentChangeUserIsInRoomModel.setInRoom(momentDetailModel2.getIsInRoom());
                        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM").post(momentChangeUserIsInRoomModel);
                    }
                    int i = 0;
                    postDetailActivity.OooOooO().f50526OooOOOO.setVisibility(0);
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel2);
                    postDetailActivity.Oooo0o0();
                    MomentAdapterTag momentAdapterTag = postDetailActivity.f22442OoooooO;
                    int i2 = 1;
                    if ((momentAdapterTag == null ? -1 : OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()]) == 1) {
                        postDetailActivity.OooOooO().f50526OooOOOO.postDelayed(new p294o0O0Oo0O.OooOo(postDetailActivity, momentDetailModel2, i2), 500L);
                    }
                    ((PostGifPlayControl) postDetailActivity.f22453o0O0O00.getValue()).OooO0O0();
                    if (postDetailActivity.f22463ooOO) {
                        postDetailActivity.OooOooO().f50525OooOOO0.postDelayed(new o00oOoo(postDetailActivity, i), 500L);
                    }
                } else if (!PostDetailActivity.this.isDestroyed()) {
                    PostDetailActivity postDetailActivity2 = PostDetailActivity.this;
                    Objects.requireNonNull(postDetailActivity2);
                    oo0oOO0 oo0ooo0 = new oo0oOO0(postDetailActivity2);
                    oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.dynami_del));
                    oo0ooo0.OooOo0o(new com.yalla.yalla.ui.activity.moment.OooOOO(PostDetailActivity.this));
                    oo0ooo0.OooOOO0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiResult<MomentDetailModel>, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<MomentDetailModel> apiResult) {
            ApiResult<MomentDetailModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PostDetailActivity.this.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<com.yalla.yalla.ui.activity.moment.OooOOOO> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.activity.moment.OooOOOO invoke() {
            return new com.yalla.yalla.ui.activity.moment.OooOOOO(PostDetailActivity.this, PostDetailActivity.this.getSupportFragmentManager());
        }
    }

    public static final class OooOOO extends Lambda implements Function0<PostDetailGiftFragment> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostDetailGiftFragment invoke() {
            PostDetailGiftFragment.Companion companion = PostDetailGiftFragment.INSTANCE;
            MomentDetailModel momentDetailModel = PostDetailActivity.this.f22439OooooOo;
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            int i = PostDetailActivity.this.f22458o0ooOO0;
            Objects.requireNonNull(companion);
            PostDetailGiftFragment postDetailGiftFragment = new PostDetailGiftFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("POST_ID", lValueOf != null ? lValueOf.longValue() : 0L);
            bundle.putInt("GIFT_LIST_TYPE", i);
            postDetailGiftFragment.setArguments(bundle);
            return postDetailGiftFragment;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<PostDetailCommentFragment> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostDetailCommentFragment invoke() {
            PostDetailCommentFragment.Companion companion = PostDetailCommentFragment.INSTANCE;
            MomentDetailModel momentDetailModel = PostDetailActivity.this.f22439OooooOo;
            Objects.requireNonNull(companion);
            PostDetailCommentFragment postDetailCommentFragment = new PostDetailCommentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("POST_DETAIL_MODEL", momentDetailModel);
            postDetailCommentFragment.setArguments(bundle);
            return postDetailCommentFragment;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<PostDetailPraiseFragment> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostDetailPraiseFragment invoke() {
            PostDetailPraiseFragment.Companion oooO00o = PostDetailPraiseFragment.INSTANCE;
            MomentDetailModel momentDetailModel = PostDetailActivity.this.f22439OooooOo;
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            Objects.requireNonNull(oooO00o);
            PostDetailPraiseFragment postDetailPraiseFragment = new PostDetailPraiseFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("POST_ID", lValueOf != null ? lValueOf.longValue() : 0L);
            postDetailPraiseFragment.setArguments(bundle);
            return postDetailPraiseFragment;
        }
    }

    public static final class OooOo extends Lambda implements Function0<o000O000> {
        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O000 invoke() {
            return new o000O000(PostDetailActivity.this, GiftPropTypeShow.InMomentDetail);
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<PostGifPlayControl> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostGifPlayControl invoke() {
            PostDetailActivity postDetailActivity = PostDetailActivity.this;
            OooO00o oooO00o = PostDetailActivity.f22436o000000O;
            return new PostGifPlayControl(postDetailActivity, postDetailActivity.OooOooO().f50526OooOOOO);
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {
        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PostDetailActivity postDetailActivity = PostDetailActivity.this;
            OooO00o oooO00o = PostDetailActivity.f22436o000000O;
            postDetailActivity.OooOooO().f50526OooOOOO.OooOOO0();
            return null;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Integer, Intent, Unit> {
        public Oooo000() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Intent intent) {
            Intent intent2 = intent;
            PostDetailActivity.this.f22444o000000 = false;
            if (intent2 != null) {
                FriendInfo friendInfo = (FriendInfo) intent2.getSerializableExtra("Data");
                if (friendInfo != null) {
                    UserInfo userInfo = friendInfo.getUserInfo();
                    Intrinsics.checkNotNull(userInfo);
                    if (userInfo.getUserId() > 0) {
                        EditTextSpan editTextSpan = PostDetailActivity.this.OooOooO().f50515OooO0OO;
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo2);
                        String userName = userInfo2.getUserName();
                        UserInfo userInfo3 = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo3);
                        editTextSpan.OooO00o("@", new p151o00Oo0Oo.OooOo(userName, userInfo3.getUserId()));
                    }
                }
                EditTextSpan editTextSpan2 = PostDetailActivity.this.OooOooO().f50515OooO0OO;
                final PostDetailActivity postDetailActivity = PostDetailActivity.this;
                editTextSpan2.postDelayed(new Runnable() { // from class: o0o0Oo0.o00O000
                    @Override // java.lang.Runnable
                    public final void run() {
                        PostDetailActivity this$0 = postDetailActivity;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.Oooo0oO(true);
                    }
                }, 200L);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {
        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PostDetailActivity postDetailActivity = PostDetailActivity.this;
            if (postDetailActivity.f22446o00O0O) {
                postDetailActivity.OooOooO().f50526OooOOOO.OooOOOo(PostDetailActivity.this.OooOooO().f50523OooOO0o);
                return null;
            }
            postDetailActivity.OooOooO().f50526OooOOOO.OooOOOo(PostDetailActivity.this.OooOooO().f50521OooOO0);
            return null;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<MomentPoll, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentPoll, Unit> f22477Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00O0O(Function1<? super MomentPoll, Unit> function1) {
            super(1);
            this.f22477Oooo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentPoll momentPoll) {
            Function1<MomentPoll, Unit> function1;
            MomentPoll momentPoll2 = momentPoll;
            if (momentPoll2 != null && (function1 = this.f22477Oooo) != null) {
                function1.invoke(momentPoll2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<PostDetailHeaderViewTag, Unit> {

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PostDetailHeaderViewTag.values().length];
                iArr[PostDetailHeaderViewTag.PostDetailHideKeyboard.ordinal()] = 1;
                iArr[PostDetailHeaderViewTag.PostDetailReply.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public o00Oo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PostDetailHeaderViewTag postDetailHeaderViewTag) {
            PostDetailHeaderViewTag tag = postDetailHeaderViewTag;
            Intrinsics.checkNotNullParameter(tag, "tag");
            int i = OooO00o.$EnumSwitchMapping$0[tag.ordinal()];
            if (i == 1) {
                PostDetailActivity.this.Oooo0oO(false);
            } else if (i == 2) {
                PostDetailActivity postDetailActivity = PostDetailActivity.this;
                OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                ImageView imageView = postDetailActivity.OooOooO().f50525OooOOO0;
                final PostDetailActivity postDetailActivity2 = PostDetailActivity.this;
                imageView.postDelayed(new Runnable() { // from class: o0o0Oo0.oOO00O
                    @Override // java.lang.Runnable
                    public final void run() {
                        PostDetailActivity this$0 = postDetailActivity2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22436o000000O;
                        this$0.Oooo000().commentReplaceCid();
                    }
                }, 200L);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {
        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (PostDetailActivity.this.f22446o00O0O) {
                ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.gift_cannot_send_to_yourself));
                return null;
            }
            o0O00000.OooO0OO("Moments_gifts");
            ((o000O000) PostDetailActivity.this.f22459o0ooOOo.getValue()).OooO0O0(PostDetailActivity.this.f22439OooooOo);
            return null;
        }
    }

    public final void OooOoo(boolean z) {
        OooOooO().f50514OooO0O0.setExpanded(z);
    }

    public final rc OooOooO() {
        return (rc) this.f22437OooooO0.getValue();
    }

    public final o00O0000 OooOooo() {
        return (o00O0000) this.f22448o00Ooo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentVM Oooo0() {
        return (MomentVM) this.f22452o00ooo.getValue();
    }

    public final PostDetailCommentFragment Oooo000() {
        return (PostDetailCommentFragment) this.f22455o0OOO0o.getValue();
    }

    public final PostDetailGiftFragment Oooo00O() {
        return (PostDetailGiftFragment) this.f22454o0OO00O.getValue();
    }

    public final PostDetailPraiseFragment Oooo00o() {
        return (PostDetailPraiseFragment) this.f22456o0Oo0oo.getValue();
    }

    public final void Oooo0O0() {
        OooOoOO(o000O0O0.OooO0OO(R.string.loading), 500L);
        MomentDetailModel momentDetailModel = this.f22439OooooOo;
        if (momentDetailModel != null) {
            Oooo0().momentDetail(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel.getId()), AppEventsConstants.EVENT_PARAM_VALUE_NO), this.f22451o00oO0o).observe(this, new o0o0000.OooOo(new OooO0o(), new OooO(), new OooOO0(), false));
        }
    }

    public final void Oooo0OO(long j, Function1<? super MomentPoll, Unit> function1) {
        if (j < 1) {
            return;
        }
        Oooo0().getPollInfo(j).observe(this, new o0o0000.OooOo(new o00O0O(function1), null, null, false, 14));
    }

    public final void Oooo0o(boolean z) {
        if (z) {
            OooOooO().f50519OooO0oO.setVisibility(0);
            OooOooO().f50520OooO0oo.setVisibility(0);
            OooOooO().f50525OooOOO0.setVisibility(0);
            OooOooO().f50524OooOOO.setVisibility(8);
            OooOooO().f50522OooOO0O.setVisibility(8);
            OooOooO().f50521OooOO0.setVisibility(8);
            OooOooO().f50523OooOO0o.setVisibility(8);
            OooOooO().f50512OooO.setVisibility(8);
            return;
        }
        OooOooO().f50519OooO0oO.setVisibility(8);
        OooOooO().f50520OooO0oo.setVisibility(8);
        OooOooO().f50525OooOOO0.setVisibility(8);
        MomentDetailModel momentDetailModel = this.f22439OooooOo;
        if (momentDetailModel != null && momentDetailModel.getPower() == MomentTypePower.Open.getValue()) {
            MomentDetailModel momentDetailModel2 = this.f22439OooooOo;
            if (momentDetailModel2 != null && momentDetailModel2.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
                OooOooO().f50524OooOOO.setVisibility(0);
            }
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("showAtView MySelfUserId = ");
        sbOooO0O0.append(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue());
        sbOooO0O0.append(" isSelfPost = ");
        sbOooO0O0.append(this.f22446o00O0O);
        o00O00.OooO0O0(sbOooO0O0.toString());
        if (this.f22446o00O0O) {
            OooOooO().f50523OooOO0o.setVisibility(0);
            OooOooO().f50521OooOO0.setVisibility(8);
            OooOooO().f50522OooOO0O.setVisibility(0);
            OooOooO().f50512OooO.setVisibility(8);
            return;
        }
        OooOooO().f50523OooOO0o.setVisibility(8);
        OooOooO().f50521OooOO0.setVisibility(0);
        OooOooO().f50522OooOO0O.setVisibility(0);
        OooOooO().f50512OooO.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0o0() {
        MomentDetailModel momentDetailModel = this.f22439OooooOo;
        if (momentDetailModel != null) {
            Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
            long userId = momentDetailModel.getUserId();
            int i = 1;
            if (value != null && value.longValue() == userId) {
                this.f22446o00O0O = true;
            }
            MomentDetailView momentDetailView = OooOooO().f50526OooOOOO;
            momentDetailView.setPostDetailHeaderView(this);
            momentDetailView.setForwarding(true);
            momentDetailView.setShowReply(true);
            momentDetailView.setFromTopicDetail(this.f22440Oooooo);
            momentDetailView.setListener(new o00Oo0());
            momentDetailView.OooOOo0(this.f22439OooooOo, 0);
            MomentSendContentModel content = momentDetailModel.getContent();
            int i2 = 2;
            if (content != null && content.getCircleId() > 0 && !this.f22440Oooooo) {
                ((TopicInfoVM) this.f22449o00o0O.getValue()).getCircleInfoByDyId(momentDetailModel.getId() + "").observe(this, new o0000oo(this, i2));
            }
            boolean isPraise = momentDetailModel.getIsPraise();
            OooOooO().f50523OooOO0o.OooO0OO(isPraise);
            OooOooO().f50521OooOO0.OooO0OO(isPraise);
            if (this.f22446o00O0O) {
                OooOooO().f50523OooOO0o.setVisibility(0);
                OooOooO().f50521OooOO0.setVisibility(8);
            } else {
                OooOooO().f50523OooOO0o.setVisibility(8);
                OooOooO().f50521OooOO0.setVisibility(0);
            }
            Oooo000().setData(momentDetailModel, this.f22447o00Oo0, OooOooO().f50515OooO0OO);
            Oooo00o().setData(momentDetailModel.getId());
            Oooo00O().setData(momentDetailModel.getId());
            Oooo0o(false);
            if (this.f22458o0ooOO0 != -1) {
                this.f22462oo0o0Oo = 2;
                OooOooO().f50512OooO.postDelayed(new o0O0OOO.Oooo0(this, i), 500L);
            }
        }
    }

    public final void Oooo0oO(boolean z) {
        if (!z) {
            OooOooo().OooO0OO();
            return;
        }
        LiveEventBus.get("POST_DETAIL_REFRESH_CLOSE_HEADER_OR_FOOTER").post(Boolean.TRUE);
        EditTextSpan view = OooOooO().f50515OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.editTextInput");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(context2.getApplicationContext(), new Handler()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (OooOooo().OooO0o0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (Intrinsics.areEqual(v, OooOooO().f50519OooO0oO)) {
            if (OooOooO().f50515OooO0OO.getSpanManager().OooO0Oo("@") >= this.f22438OooooOO) {
                ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12582OooO00o;
                String strOooO0OO = o000O0O0.OooO0OO(R.string.Mention_a_maximum_of_XXX_people);
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("");
                sbOooO0O0.append(this.f22438OooooOO);
                oooO0O0.OooO0O0(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, sbOooO0O0.toString()));
                return;
            }
            this.f22444o000000 = true;
            Oooo0oO(false);
            o00O00o0 o00o00o0OooO00o = o00O00o0.f48635OooO0OO.OooO00o(this);
            o00o00o0OooO00o.f48637OooO0O0 = AtFriendsActivity.class;
            o00o00o0OooO00o.OooO00o(new Oooo000());
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50525OooOOO0)) {
            Oooo000().sendComment();
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50524OooOOO)) {
            Oooo0 onLogin = new Oooo0();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50521OooOO0) || Intrinsics.areEqual(v, OooOooO().f50522OooOO0O) || Intrinsics.areEqual(v, OooOooO().f50523OooOO0o)) {
            o000oOoO onLogin2 = new o000oOoO();
            Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
            if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin2.invoke();
                return;
            }
            Activity activityOooO0O1 = o00000O.f34276OooO00o.OooO0O0();
            if (activityOooO0O1 != null) {
                o0OOO0o.OooO00o(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50512OooO)) {
            o0OoOo0 onLogin3 = new o0OoOo0();
            Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
            if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin3.invoke();
                return;
            }
            Activity activityOooO0O2 = o00000O.f34276OooO00o.OooO0O0();
            if (activityOooO0O2 != null) {
                o0OOO0o.OooO00o(activityOooO0O2, d.R, activityOooO0O2, LoginActivity.class);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x02ca  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0o0o.OooO0Oo(window, 0);
        setContentView(OooOooO().f50513OooO00o);
        this.f22439OooooOo = (MomentDetailModel) getIntent().getSerializableExtra("Module");
        this.f22463ooOO = getIntent().getBooleanExtra("Type", false);
        this.f22458o0ooOO0 = getIntent().getIntExtra("ShowGiftListType", -1);
        this.f22440Oooooo = getIntent().getBooleanExtra("FromTopicDetail", false);
        if (getIntent().hasExtra("FromMomentTag")) {
            this.f22442OoooooO = (MomentAdapterTag) getIntent().getSerializableExtra("FromMomentTag");
        }
        if (getIntent().hasExtra("FromDbMid")) {
            this.f22443Ooooooo = getIntent().getStringExtra("FromDbMid");
        }
        if (this.f22442OoooooO == null) {
            this.f22442OoooooO = MomentAdapterTag.PostDetailActivity;
        }
        MomentAdapterTag momentAdapterTag = this.f22442OoooooO;
        int i = momentAdapterTag != null ? OooO0O0.$EnumSwitchMapping$0[momentAdapterTag.ordinal()] : -1;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        if (i == 1 || i == 2 || i == 3) {
            this.f22451o00oO0o = 1;
        }
        this.f22457o0OoOo0 = getIntent().getBooleanExtra("isExpandedHeadView", false);
        this.f22447o00Oo0 = (PostCommentDetailModel) getIntent().getSerializableExtra("Data");
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("initData mPostDetailModel:");
        sbOooO0O0.append(this.f22439OooooOo);
        sbOooO0O0.append("  postCommentDetailModel:");
        sbOooO0O0.append(this.f22447o00Oo0);
        o00O00.OooO0Oo(sbOooO0O0.toString());
        MomentDetailModel momentDetailModel = this.f22439OooooOo;
        if (momentDetailModel != null && momentDetailModel.getId() >= 1) {
            this.f22441Oooooo0 = momentDetailModel.getIsInRoom();
            this.f22445o000OOo = momentDetailModel.getSessionId();
        } else {
            finish();
        }
        OooOoO0(o000O0O0.OooO0OO(R.string.Moment_Content));
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            oO0o0o.OooO00o(headerLayout, true, false);
        }
        OooOooO().f50528OooOOo.f19571o0Oo0oo = false;
        OooOooO().f50528OooOOo.f19564o00o0O = true;
        OooOooO().f50528OooOOo.OooOoOO(false);
        OooOooO().f50528OooOOo.Oooo0O0(new o0OO00O(this, i3));
        OooOooO().f50530OooOOoo.setOnTouchListener(new m(this, 1));
        EmojiFaceView emojiFaceView = OooOooO().f50518OooO0o0;
        EditTextSpan editTextSpan = OooOooO().f50515OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.editTextInput");
        emojiFaceView.OooO00o(editTextSpan, true);
        OooOooO().f50515OooO0OO.f11748OoooO0O = com.facebook.appevents.OooOo.f12742OoooO00;
        OooOooO().f50515OooO0OO.addTextChangedListener(new o000OO00(this));
        OooOooo().f40642OooO0O0 = new o000OOo0(this);
        OooOooo().f40641OooO00o = new o00(this);
        OooOooO().f50515OooO0OO.setHint(o000O0O0.OooO0OO(R.string.Write_a_comment));
        OooOooO().f50519OooO0oO.setOnClickListener(this.f11476OoooO);
        OooOooO().f50525OooOOO0.setOnClickListener(this.f11476OoooO);
        OooOooO().f50524OooOOO.setOnClickListener(this.f11476OoooO);
        OooOooO().f50522OooOO0O.setOnClickListener(this.f11476OoooO);
        OooOooO().f50521OooOO0.setOnClickListener(this.f11476OoooO);
        OooOooO().f50523OooOO0o.setOnClickListener(this.f11476OoooO);
        OooOooO().f50512OooO.setOnClickListener(this.f11476OoooO);
        this.f22450o00oO0O.clear();
        this.f22450o00oO0O.add(Oooo000());
        this.f22450o00oO0O.add(Oooo00o());
        this.f22450o00oO0O.add(Oooo00O());
        OooOooO().f50526OooOOOO.setEnterRoomParentPage(EnterRoomParentPage.Moments_details_SharedRoom);
        OooOooO().f50526OooOOOO.setMomentAdapterTag(this.f22442OoooooO);
        OooOooO().f50526OooOOOO.setIsPostDetailPage(true);
        OooOooO().f50526OooOOOO.setVisibility(8);
        OooOooO().f50531OooOo00.setOffscreenPageLimit(3);
        OooOooO().f50527OooOOOo.setItemListener(new o0Oo0oo(this));
        OooOooO().f50527OooOOOo.setCurrentItem(this.f22462oo0o0Oo);
        if (this.f22457o0OoOo0) {
            OooOoo(false);
        }
        OooOooO().f50531OooOo00.OooO0O0(new p540o0o0Oo0.o00O0000(this));
        OooOooO().f50531OooOo00.setAdapter((o00000O0) this.f22460o0ooOoO.getValue());
        OooOooO().f50531OooOo00.setCurrentItem(this.f22462oo0o0Oo);
        OooOooO().f50515OooO0OO.setFocusable(false);
        OooOooO().f50515OooO0OO.clearFocus();
        OooOooO().f50515OooO0OO.setOnClickListener(new o0O0ooO(this));
        MomentDetailModel momentDetailModel2 = this.f22439OooooOo;
        if (momentDetailModel2 != null && momentDetailModel2.getPower() == MomentTypePower.Open.getValue()) {
            MomentDetailModel momentDetailModel3 = this.f22439OooooOo;
            if (momentDetailModel3 != null && momentDetailModel3.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
                OooOooO().f50524OooOOO.setVisibility(0);
            } else {
                OooOooO().f50524OooOOO.setVisibility(8);
            }
        } else {
            OooOooO().f50524OooOOO.setVisibility(8);
        }
        int i5 = 4;
        p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().observe(this, new o00OOOO0(this, i5));
        Class cls = Long.TYPE;
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new oo0o0Oo(this, i4));
        LiveEventBus.get("SEND_POST_GIFT_TOTEL_COIN", PostGiftResultModel.class).observe(this, new o0ooOOo(this, i3));
        LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o00000(this, i3));
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new p143o00OOooO.o00000O(this, i4));
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new o000000(this, i2));
        LiveEventBus.get("POST_DETAIL_DATA_DELETE_COMMENT", MomentDetailModel.class).observe(this, new o0O0O00(this, i3));
        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM", MomentChangeUserIsInRoomModel.class).observe(this, new o000OOo(this, i2));
        LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_ADD", MomentDetailModel.class).observe(this, new o000000O(this, i2));
        LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_DELETE", MomentDetailModel.class).observe(this, new o00000OO(this, i2));
        LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").observe(this, new o00O00O(this, i3));
        LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").observe(this, new p143o00OOooO.o00O0O(this, i5));
        LiveEventBus.get("POST_DETAIL_REFRESH_CLOSE_HEADER_OR_FOOTER").observe(this, new o0o0Oo(this, i3));
        LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD_AND_FINISH").observe(this, new o00OOOOo(this, i3));
        LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD", Boolean.TYPE).observe(this, new p143o00OOooO.o0OOO0o(this, i5));
        LiveEventBus.get("POST_DETAIL_APPBARLAYOUTSETEXPANDED").observe(this, new o00oO0o(this, i3));
        Oooo0O0();
        o0O00000.OooO0OO("Moments_details");
        Oooo0().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo0().statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, p141o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p141o00OOOoO.OooO0OO<?> oooO0OO) {
        super.onEventMainThread(oooO0OO);
        Integer numValueOf = oooO0OO != null ? Integer.valueOf(oooO0OO.f31906OooO00o) : null;
        if (numValueOf != null && numValueOf.intValue() == 19) {
            T t = oooO0OO.f31908OooO0OO;
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.String");
            String userId = (String) t;
            int i = oooO0OO.f31907OooO0O0;
            MomentDetailView momentDetailView = OooOooO().f50526OooOOOO;
            Objects.requireNonNull(momentDetailView);
            Intrinsics.checkNotNullParameter(userId, "userId");
            StringBuilder sb = new StringBuilder();
            MomentDetailModel momentDetailModel = momentDetailView.f24959OoooO0;
            sb.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null);
            sb.append("");
            if (Intrinsics.areEqual(userId, sb.toString())) {
                MomentDetailModel momentDetailModel2 = momentDetailView.f24959OoooO0;
                if (momentDetailModel2 != null && momentDetailModel2.getIsFollow()) {
                    MomentDetailModel momentDetailModel3 = momentDetailView.f24959OoooO0;
                    if (momentDetailModel3 != null) {
                        momentDetailModel3.setFollow(i == 1);
                    }
                    momentDetailView.f24957Oooo.f50196OooOo0O.OooO0OO();
                }
            }
        }
    }
}
