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
import androidx.fragment.app.o00000;
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
import p142o00OOooO.o000000;
import p142o00OOooO.o000000O;
import p142o00OOooO.o00000OO;
import p142o00OOooO.o0000oo;
import p142o00OOooO.o000OOo;
import p142o00OOooO.o00oO0o;
import p142o00OOooO.o0O0O00;
import p142o00OOooO.o0Oo0oo;
import p142o00OOooO.o0ooOOo;
import p142o00OOooO.oo0o0Oo;
import p143o00OOooo.o00OOOO0;
import p143o00OOooo.o00OOOOo;
import p143o00OOooo.o0o0Oo;
import p163o00OoOo.o00O00O;
import p192o00o0O0.o0OO00O;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p470o0Oooo0.o00O000;
import p470o0Oooo0.o00O0000;
import p478o0OooooO.oO0OoOO0;
import p515o0o0O00.o00O00;
import p536o0o0OOoo.n;
import p538o0o0Oo0.o00;
import p538o0o0Oo0.o000OO00;
import p538o0o0Oo0.o000OOo0;
import p538o0o0Oo0.o00oOoo;
import p538o0o0Oo0.o0O0ooO;
import p617o0oo0o.o000O000;
import p620o0oo0o0O.oo00o;
import p649o0ooOOoo.sc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/PostDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ak.aE, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22417o0O0O00 = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f22420Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f22421OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f22422OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public MomentAdapterTag f22423OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f22424Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public String f22425Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f22426OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f22427Ooooooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f22431o00o0O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public int f22436o0OOO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public PostCommentDetailModel f22438o0OoOo0;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f22443oo0o0Oo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22418OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(sc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final int f22419Ooooo00 = 7;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22444ooOO = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22428o00O0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22463Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22463Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22429o00Oo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$5
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22467Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22467Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22430o00Ooo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PrivateChatVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.PostDetailActivity$special$$inlined$viewModels$default$8
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22471Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22471Oooo0o;
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
    public List<Fragment> f22434o00ooo = new ArrayList();

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f22442oo000o = -1;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22433o00oO0o = LazyKt.lazy(new OooOo());

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f22432o00oO0O = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22439o0ooOO0 = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22440o0ooOOo = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f22441o0ooOoO = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f22437o0Oo0oo = LazyKt.lazy(new OooOo00());

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @Nullable
    public String f22435o0OO00O = "";

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
            OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
            PanelLayout panelLayout = postDetailActivity.OooOooO().f50580OooO0o;
            Intrinsics.checkNotNullExpressionValue(panelLayout, "binding.inputPanelLayout");
            EditTextSpan editTextSpan = PostDetailActivity.this.OooOooO().f50578OooO0OO;
            Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.editTextInput");
            o00O0000 o00o0001 = new o00O0000(panelLayout, editTextSpan);
            ImageView imageView = PostDetailActivity.this.OooOooO().f50583OooO0oo;
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
                    if (momentDetailModel2.getIsInRoom() != postDetailActivity.f22421OooooO0) {
                        MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel = new MomentChangeUserIsInRoomModel();
                        momentChangeUserIsInRoomModel.setUserId(String.valueOf(momentDetailModel2.getUserId()));
                        momentChangeUserIsInRoomModel.setInRoom(momentDetailModel2.getIsInRoom());
                        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM").post(momentChangeUserIsInRoomModel);
                    }
                    int i = 0;
                    postDetailActivity.OooOooO().f50589OooOOOO.setVisibility(0);
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel2);
                    postDetailActivity.Oooo0o0();
                    MomentAdapterTag momentAdapterTag = postDetailActivity.f22423OooooOo;
                    int i2 = 1;
                    if ((momentAdapterTag == null ? -1 : OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()]) == 1) {
                        postDetailActivity.OooOooO().f50589OooOOOO.postDelayed(new p293o0O0Oo0O.OooOo(postDetailActivity, momentDetailModel2, i2), 500L);
                    }
                    ((PostGifPlayControl) postDetailActivity.f22437o0Oo0oo.getValue()).OooO0O0();
                    if (postDetailActivity.f22426OoooooO) {
                        postDetailActivity.OooOooO().f50588OooOOO0.postDelayed(new o00oOoo(postDetailActivity, i), 500L);
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
            MomentDetailModel momentDetailModel = PostDetailActivity.this.f22420Ooooo0o;
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            int i = PostDetailActivity.this.f22442oo000o;
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
            MomentDetailModel momentDetailModel = PostDetailActivity.this.f22420Ooooo0o;
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
            MomentDetailModel momentDetailModel = PostDetailActivity.this.f22420Ooooo0o;
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
            OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
            return new PostGifPlayControl(postDetailActivity, postDetailActivity.OooOooO().f50589OooOOOO);
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {
        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PostDetailActivity postDetailActivity = PostDetailActivity.this;
            OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
            postDetailActivity.OooOooO().f50589OooOOOO.OooOOO0();
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
            PostDetailActivity.this.f22443oo0o0Oo = false;
            if (intent2 != null) {
                FriendInfo friendInfo = (FriendInfo) intent2.getSerializableExtra("Data");
                if (friendInfo != null) {
                    UserInfo userInfo = friendInfo.getUserInfo();
                    Intrinsics.checkNotNull(userInfo);
                    if (userInfo.getUserId() > 0) {
                        EditTextSpan editTextSpan = PostDetailActivity.this.OooOooO().f50578OooO0OO;
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo2);
                        String userName = userInfo2.getUserName();
                        UserInfo userInfo3 = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo3);
                        editTextSpan.OooO00o("@", new p150o00Oo0Oo.OooOo(userName, userInfo3.getUserId()));
                    }
                }
                EditTextSpan editTextSpan2 = PostDetailActivity.this.OooOooO().f50578OooO0OO;
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
            if (postDetailActivity.f22427Ooooooo) {
                postDetailActivity.OooOooO().f50589OooOOOO.OooOOOo(PostDetailActivity.this.OooOooO().f50586OooOO0o);
                return null;
            }
            postDetailActivity.OooOooO().f50589OooOOOO.OooOOOo(PostDetailActivity.this.OooOooO().f50584OooOO0);
            return null;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<MomentPoll, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentPoll, Unit> f22458Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00O0O(Function1<? super MomentPoll, Unit> function1) {
            super(1);
            this.f22458Oooo0o = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentPoll momentPoll) {
            Function1<MomentPoll, Unit> function1;
            MomentPoll momentPoll2 = momentPoll;
            if (momentPoll2 != null && (function1 = this.f22458Oooo0o) != null) {
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
                OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                ImageView imageView = postDetailActivity.OooOooO().f50588OooOOO0;
                final PostDetailActivity postDetailActivity2 = PostDetailActivity.this;
                imageView.postDelayed(new Runnable() { // from class: o0o0Oo0.oOO00O
                    @Override // java.lang.Runnable
                    public final void run() {
                        PostDetailActivity this$0 = postDetailActivity2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22417o0O0O00;
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
            if (PostDetailActivity.this.f22427Ooooooo) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.gift_cannot_send_to_yourself));
                return null;
            }
            o0O00000.OooO0OO("Moments_gifts");
            ((o000O000) PostDetailActivity.this.f22433o00oO0o.getValue()).OooO0O0(PostDetailActivity.this.f22420Ooooo0o);
            return null;
        }
    }

    public final void OooOoo(boolean z) {
        OooOooO().f50577OooO0O0.setExpanded(z);
    }

    public final sc OooOooO() {
        return (sc) this.f22418OoooOoo.getValue();
    }

    public final o00O0000 OooOooo() {
        return (o00O0000) this.f22444ooOO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentVM Oooo0() {
        return (MomentVM) this.f22429o00Oo0.getValue();
    }

    public final PostDetailCommentFragment Oooo000() {
        return (PostDetailCommentFragment) this.f22439o0ooOO0.getValue();
    }

    public final PostDetailGiftFragment Oooo00O() {
        return (PostDetailGiftFragment) this.f22441o0ooOoO.getValue();
    }

    public final PostDetailPraiseFragment Oooo00o() {
        return (PostDetailPraiseFragment) this.f22440o0ooOOo.getValue();
    }

    public final void Oooo0O0() {
        OooOoOO(o000O0O0.OooO0OO(R.string.loading), 500L);
        MomentDetailModel momentDetailModel = this.f22420Ooooo0o;
        if (momentDetailModel != null) {
            Oooo0().momentDetail(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel.getId()), AppEventsConstants.EVENT_PARAM_VALUE_NO), this.f22431o00o0O).observe(this, new o0o0000.OooOo(new OooO0o(), new OooO(), new OooOO0(), false));
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
            OooOooO().f50582OooO0oO.setVisibility(0);
            OooOooO().f50583OooO0oo.setVisibility(0);
            OooOooO().f50588OooOOO0.setVisibility(0);
            OooOooO().f50587OooOOO.setVisibility(8);
            OooOooO().f50585OooOO0O.setVisibility(8);
            OooOooO().f50584OooOO0.setVisibility(8);
            OooOooO().f50586OooOO0o.setVisibility(8);
            OooOooO().f50575OooO.setVisibility(8);
            return;
        }
        OooOooO().f50582OooO0oO.setVisibility(8);
        OooOooO().f50583OooO0oo.setVisibility(8);
        OooOooO().f50588OooOOO0.setVisibility(8);
        MomentDetailModel momentDetailModel = this.f22420Ooooo0o;
        if (momentDetailModel != null && momentDetailModel.getPower() == MomentTypePower.Open.getValue()) {
            MomentDetailModel momentDetailModel2 = this.f22420Ooooo0o;
            if (momentDetailModel2 != null && momentDetailModel2.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
                OooOooO().f50587OooOOO.setVisibility(0);
            }
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("showAtView MySelfUserId = ");
        sbOooO0o0.append(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue());
        sbOooO0o0.append(" isSelfPost = ");
        sbOooO0o0.append(this.f22427Ooooooo);
        o00O00.OooO0O0(sbOooO0o0.toString());
        if (this.f22427Ooooooo) {
            OooOooO().f50586OooOO0o.setVisibility(0);
            OooOooO().f50584OooOO0.setVisibility(8);
            OooOooO().f50585OooOO0O.setVisibility(0);
            OooOooO().f50575OooO.setVisibility(8);
            return;
        }
        OooOooO().f50586OooOO0o.setVisibility(8);
        OooOooO().f50584OooOO0.setVisibility(0);
        OooOooO().f50585OooOO0O.setVisibility(0);
        OooOooO().f50575OooO.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0o0() {
        MomentDetailModel momentDetailModel = this.f22420Ooooo0o;
        if (momentDetailModel != null) {
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            long userId = momentDetailModel.getUserId();
            int i = 1;
            if (value != null && value.longValue() == userId) {
                this.f22427Ooooooo = true;
            }
            MomentDetailView momentDetailView = OooOooO().f50589OooOOOO;
            momentDetailView.setPostDetailHeaderView(this);
            momentDetailView.setForwarding(true);
            momentDetailView.setShowReply(true);
            momentDetailView.setFromTopicDetail(this.f22422OooooOO);
            momentDetailView.setListener(new o00Oo0());
            momentDetailView.OooOOo0(this.f22420Ooooo0o, 0);
            MomentSendContentModel content = momentDetailModel.getContent();
            int i2 = 2;
            if (content != null && content.getCircleId() > 0 && !this.f22422OooooOO) {
                ((TopicInfoVM) this.f22428o00O0O.getValue()).getCircleInfoByDyId(momentDetailModel.getId() + "").observe(this, new o0000oo(this, i2));
            }
            boolean isPraise = momentDetailModel.getIsPraise();
            OooOooO().f50586OooOO0o.OooO0OO(isPraise);
            OooOooO().f50584OooOO0.OooO0OO(isPraise);
            if (this.f22427Ooooooo) {
                OooOooO().f50586OooOO0o.setVisibility(0);
                OooOooO().f50584OooOO0.setVisibility(8);
            } else {
                OooOooO().f50586OooOO0o.setVisibility(8);
                OooOooO().f50584OooOO0.setVisibility(0);
            }
            Oooo000().setData(momentDetailModel, this.f22438o0OoOo0, OooOooO().f50578OooO0OO);
            Oooo00o().setData(momentDetailModel.getId());
            Oooo00O().setData(momentDetailModel.getId());
            Oooo0o(false);
            if (this.f22442oo000o != -1) {
                this.f22436o0OOO0o = 2;
                OooOooO().f50575OooO.postDelayed(new o0O0OOO.Oooo0(this, i), 500L);
            }
        }
    }

    public final void Oooo0oO(boolean z) {
        if (!z) {
            OooOooo().OooO0OO();
            return;
        }
        LiveEventBus.get("POST_DETAIL_REFRESH_CLOSE_HEADER_OR_FOOTER").post(Boolean.TRUE);
        EditTextSpan view = OooOooO().f50578OooO0OO;
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
        if (Intrinsics.areEqual(v, OooOooO().f50582OooO0oO)) {
            if (OooOooO().f50578OooO0OO.getSpanManager().OooO0Oo("@") >= this.f22419Ooooo00) {
                ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12567OooO00o;
                String strOooO0OO = o000O0O0.OooO0OO(R.string.Mention_a_maximum_of_XXX_people);
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
                sbOooO0o0.append(this.f22419Ooooo00);
                oooO0O0.OooO0O0(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, sbOooO0o0.toString()));
                return;
            }
            this.f22443oo0o0Oo = true;
            Oooo0oO(false);
            oo00o oo00oVarOooO00o = oo00o.f48621OooO0OO.OooO00o(this);
            oo00oVarOooO00o.f48623OooO0O0 = AtFriendsActivity.class;
            oo00oVarOooO00o.OooO00o(new Oooo000());
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50588OooOOO0)) {
            Oooo000().sendComment();
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50587OooOOO)) {
            Oooo0 onLogin = new Oooo0();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50584OooOO0) || Intrinsics.areEqual(v, OooOooO().f50585OooOO0O) || Intrinsics.areEqual(v, OooOooO().f50586OooOO0o)) {
            o000oOoO onLogin2 = new o000oOoO();
            Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin2.invoke();
                return;
            }
            Activity activityOooO0O1 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O1 != null) {
                o0OOO0o.OooO0O0(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(v, OooOooO().f50575OooO)) {
            o0OoOo0 onLogin3 = new o0OoOo0();
            Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin3.invoke();
                return;
            }
            Activity activityOooO0O2 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O2 != null) {
                o0OOO0o.OooO0O0(activityOooO0O2, d.R, activityOooO0O2, LoginActivity.class);
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
        oO0OoOO0.OooO0Oo(window, 0);
        setContentView(OooOooO().f50576OooO00o);
        this.f22420Ooooo0o = (MomentDetailModel) getIntent().getSerializableExtra("Module");
        this.f22426OoooooO = getIntent().getBooleanExtra("Type", false);
        this.f22442oo000o = getIntent().getIntExtra("ShowGiftListType", -1);
        this.f22422OooooOO = getIntent().getBooleanExtra("FromTopicDetail", false);
        if (getIntent().hasExtra("FromMomentTag")) {
            this.f22423OooooOo = (MomentAdapterTag) getIntent().getSerializableExtra("FromMomentTag");
        }
        if (getIntent().hasExtra("FromDbMid")) {
            this.f22425Oooooo0 = getIntent().getStringExtra("FromDbMid");
        }
        if (this.f22423OooooOo == null) {
            this.f22423OooooOo = MomentAdapterTag.PostDetailActivity;
        }
        MomentAdapterTag momentAdapterTag = this.f22423OooooOo;
        int i = momentAdapterTag != null ? OooO0O0.$EnumSwitchMapping$0[momentAdapterTag.ordinal()] : -1;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        if (i == 1 || i == 2 || i == 3) {
            this.f22431o00o0O = 1;
        }
        this.f22424Oooooo = getIntent().getBooleanExtra("isExpandedHeadView", false);
        this.f22438o0OoOo0 = (PostCommentDetailModel) getIntent().getSerializableExtra("Data");
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("initData mPostDetailModel:");
        sbOooO0o0.append(this.f22420Ooooo0o);
        sbOooO0o0.append("  postCommentDetailModel:");
        sbOooO0o0.append(this.f22438o0OoOo0);
        o00O00.OooO0Oo(sbOooO0o0.toString());
        MomentDetailModel momentDetailModel = this.f22420Ooooo0o;
        if (momentDetailModel != null && momentDetailModel.getId() >= 1) {
            this.f22421OooooO0 = momentDetailModel.getIsInRoom();
            this.f22435o0OO00O = momentDetailModel.getSessionId();
        } else {
            finish();
        }
        OooOoO0(o000O0O0.OooO0OO(R.string.Moment_Content));
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO00o(headerLayout, true, false);
        }
        OooOooO().f50591OooOOo.f19554o0ooOOo = false;
        OooOooO().f50591OooOOo.f19541o00O0O = true;
        OooOooO().f50591OooOOo.OooOoOO(false);
        OooOooO().f50591OooOOo.Oooo0O0(new o0OO00O(this, i3));
        OooOooO().f50593OooOOoo.setOnTouchListener(new n(this, 1));
        EmojiFaceView emojiFaceView = OooOooO().f50581OooO0o0;
        EditTextSpan editTextSpan = OooOooO().f50578OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.editTextInput");
        emojiFaceView.OooO00o(editTextSpan, true);
        OooOooO().f50578OooO0OO.f11729Oooo = com.facebook.appevents.OooOo.f12726OooO0o0;
        OooOooO().f50578OooO0OO.addTextChangedListener(new o000OO00(this));
        OooOooo().f40623OooO0O0 = new o000OOo0(this);
        OooOooo().f40622OooO00o = new o00(this);
        OooOooO().f50578OooO0OO.setHint(o000O0O0.OooO0OO(R.string.Write_a_comment));
        OooOooO().f50582OooO0oO.setOnClickListener(this.f11465OoooO00);
        OooOooO().f50588OooOOO0.setOnClickListener(this.f11465OoooO00);
        OooOooO().f50587OooOOO.setOnClickListener(this.f11465OoooO00);
        OooOooO().f50585OooOO0O.setOnClickListener(this.f11465OoooO00);
        OooOooO().f50584OooOO0.setOnClickListener(this.f11465OoooO00);
        OooOooO().f50586OooOO0o.setOnClickListener(this.f11465OoooO00);
        OooOooO().f50575OooO.setOnClickListener(this.f11465OoooO00);
        this.f22434o00ooo.clear();
        this.f22434o00ooo.add(Oooo000());
        this.f22434o00ooo.add(Oooo00o());
        this.f22434o00ooo.add(Oooo00O());
        OooOooO().f50589OooOOOO.setEnterRoomParentPage(EnterRoomParentPage.Moments_details_SharedRoom);
        OooOooO().f50589OooOOOO.setMomentAdapterTag(this.f22423OooooOo);
        OooOooO().f50589OooOOOO.setIsPostDetailPage(true);
        OooOooO().f50589OooOOOO.setVisibility(8);
        OooOooO().f50594OooOo00.setOffscreenPageLimit(3);
        OooOooO().f50590OooOOOo.setItemListener(new o0Oo0oo(this));
        OooOooO().f50590OooOOOo.setCurrentItem(this.f22436o0OOO0o);
        if (this.f22424Oooooo) {
            OooOoo(false);
        }
        OooOooO().f50594OooOo00.OooO0O0(new p538o0o0Oo0.o00O0000(this));
        OooOooO().f50594OooOo00.setAdapter((o00000) this.f22432o00oO0O.getValue());
        OooOooO().f50594OooOo00.setCurrentItem(this.f22436o0OOO0o);
        OooOooO().f50578OooO0OO.setFocusable(false);
        OooOooO().f50578OooO0OO.clearFocus();
        OooOooO().f50578OooO0OO.setOnClickListener(new o0O0ooO(this));
        MomentDetailModel momentDetailModel2 = this.f22420Ooooo0o;
        if (momentDetailModel2 != null && momentDetailModel2.getPower() == MomentTypePower.Open.getValue()) {
            MomentDetailModel momentDetailModel3 = this.f22420Ooooo0o;
            if (momentDetailModel3 != null && momentDetailModel3.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
                OooOooO().f50587OooOOO.setVisibility(0);
            } else {
                OooOooO().f50587OooOOO.setVisibility(8);
            }
        } else {
            OooOooO().f50587OooOOO.setVisibility(8);
        }
        int i5 = 4;
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().observe(this, new o00OOOO0(this, i5));
        Class cls = Long.TYPE;
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new oo0o0Oo(this, i4));
        LiveEventBus.get("SEND_POST_GIFT_TOTEL_COIN", PostGiftResultModel.class).observe(this, new o0ooOOo(this, i3));
        LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH", MomentDetailModel.class).observe(this, new p142o00OOooO.o00000(this, i3));
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new p142o00OOooO.o00000O(this, i4));
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new o000000(this, i2));
        LiveEventBus.get("POST_DETAIL_DATA_DELETE_COMMENT", MomentDetailModel.class).observe(this, new o0O0O00(this, i3));
        LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM", MomentChangeUserIsInRoomModel.class).observe(this, new o000OOo(this, i2));
        LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_ADD", MomentDetailModel.class).observe(this, new o000000O(this, i2));
        LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_DELETE", MomentDetailModel.class).observe(this, new o00000OO(this, i2));
        LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").observe(this, new o00O00O(this, i3));
        LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").observe(this, new p142o00OOooO.o00O0O(this, i5));
        LiveEventBus.get("POST_DETAIL_REFRESH_CLOSE_HEADER_OR_FOOTER").observe(this, new o0o0Oo(this, i3));
        LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD_AND_FINISH").observe(this, new o00OOOOo(this, i3));
        LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD", Boolean.TYPE).observe(this, new p142o00OOooO.o0OOO0o(this, i5));
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
    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> oooO0OO) {
        super.onEventMainThread(oooO0OO);
        Integer numValueOf = oooO0OO != null ? Integer.valueOf(oooO0OO.f31885OooO00o) : null;
        if (numValueOf != null && numValueOf.intValue() == 19) {
            T t = oooO0OO.f31887OooO0OO;
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.String");
            String userId = (String) t;
            int i = oooO0OO.f31886OooO0O0;
            MomentDetailView momentDetailView = OooOooO().f50589OooOOOO;
            Objects.requireNonNull(momentDetailView);
            Intrinsics.checkNotNullParameter(userId, "userId");
            StringBuilder sb = new StringBuilder();
            MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
            sb.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null);
            sb.append("");
            if (Intrinsics.areEqual(userId, sb.toString())) {
                MomentDetailModel momentDetailModel2 = momentDetailView.f24941Oooo0oo;
                if (momentDetailModel2 != null && momentDetailModel2.getIsFollow()) {
                    MomentDetailModel momentDetailModel3 = momentDetailView.f24941Oooo0oo;
                    if (momentDetailModel3 != null) {
                        momentDetailModel3.setFollow(i == 1);
                    }
                    momentDetailView.f24939Oooo0o.f50259OooOo0O.OooO0OO();
                }
            }
        }
    }
}
