package com.yalla.yalla.ui.activity.moment;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.base.impl.PostGifPlayControl;
import com.app.base.view.HeaderLayout;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.AddedTopicHeadView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00;
import p142o00OOooO.o0000O;
import p142o00OOooO.o000O0O0;
import p142o00OOooO.o000OO0O;
import p142o00OOooO.o00O0000;
import p143o00OOooo.o00O0;
import p143o00OOooo.o00oOoo;
import p159o00OoOO.o00000;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o00O000o;
import p501o0o00o.o0000O0;
import p501o0o00o.o0000O0O;
import p501o0o00o.o0000OO0;
import p501o0o00o.o0000oo;
import p501o0o00o.o000OO;
import p524o0o0O0oO.oo00oO;
import p538o0o0Oo0.o0O000O;
import p538o0o0Oo0.oO0Oo0oo;
import p538o0o0Oo0.oO0OoOO0;
import p563o0oOo0.o00000OO;
import p649o0ooOOoo.tc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/UserPostListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onMomentCreate", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserPostListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22674Ooooooo = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public long f22678OooooO0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public long f22683OoooooO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22675OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(tc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22676Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.UserPostListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.UserPostListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.UserPostListActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22696Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22696Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public String f22677Ooooo0o = "";

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f22679OooooOO = 1;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22680OooooOo = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22682Oooooo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22681Oooooo = LazyKt.lazy(new OooOO0O());

    public static final class OooO extends Lambda implements Function1<ApiResult<List<MomentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f22685Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f22685Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentDetailModel>> apiResult) {
            ApiResult<List<MomentDetailModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            UserPostListActivity userPostListActivity = UserPostListActivity.this;
            Long dateSort = it.getPage().getDateSort();
            userPostListActivity.f22678OooooO0 = dateSort != null ? dateSort.longValue() : 0L;
            o00000OO o00000ooOooOooo = UserPostListActivity.this.OooOooo();
            Boolean boolValueOf = Boolean.valueOf(this.f22685Oooo0oO);
            Boolean bool = Boolean.TRUE;
            List<MomentDetailModel> data = it.getData();
            o00000ooOooOooo.setLoadComplete(boolValueOf, bool, Boolean.valueOf(data == null || data.isEmpty()));
            XRefreshLayout xRefreshLayout = UserPostListActivity.this.OooOoo().f50652OooO0Oo;
            boolean z = this.f22685Oooo0oO;
            List<MomentDetailModel> data2 = it.getData();
            xRefreshLayout.Oooo0o0(z, true, data2 == null || data2.isEmpty());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<AddedTopicHeadView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AddedTopicHeadView invoke() {
            UserPostListActivity userPostListActivity = UserPostListActivity.this;
            Objects.requireNonNull(userPostListActivity);
            return new AddedTopicHeadView(userPostListActivity, null, 0, 6, null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<MomentDetailModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f22688Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f22688Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentDetailModel> list) {
            List<MomentDetailModel> list2 = list;
            UserPostListActivity userPostListActivity = UserPostListActivity.this;
            userPostListActivity.f22679OooooOO++;
            if (list2 != null) {
                boolean z = this.f22688Oooo0oO;
                for (MomentDetailModel momentDetailModel : list2) {
                    momentDetailModel.setFollow(false);
                    if (momentDetailModel.getIsTop()) {
                        userPostListActivity.OooOooo().f44995OooO0o0 = momentDetailModel.getId();
                    }
                }
                if (z) {
                    userPostListActivity.OooOooo().setNewData(list2);
                    ((PostGifPlayControl) userPostListActivity.f22681Oooooo.getValue()).OooO0O0();
                    if (o0000O.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, userPostListActivity.f22677Ooooo0o)) {
                        o00000OO o00000ooOooOooo = userPostListActivity.OooOooo();
                        p169o00Ooo00.OooOOOO oooOOOO = p169o00Ooo00.OooOOOO.f32671OooO00o;
                        o00000ooOooOooo.setNewData(p169o00Ooo00.OooOOOO.OooO00o(userPostListActivity.OooOooo().getData()));
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) userPostListActivity.OooOoo().f50651OooO0OO.getLayoutManager();
                        Intrinsics.checkNotNull(linearLayoutManager);
                        linearLayoutManager.scrollToPositionWithOffset(0, 0);
                    }
                } else {
                    userPostListActivity.OooOooo().addData((Collection) list2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f22690Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f22690Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            UserPostListActivity userPostListActivity = UserPostListActivity.this;
            OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
            userPostListActivity.OooOooo().loadError();
            UserPostListActivity.this.OooOooo().setLoadComplete(Boolean.valueOf(this.f22690Oooo0oO), Boolean.TRUE, Boolean.FALSE);
            UserPostListActivity.this.OooOoo().f50652OooO0Oo.Oooo0o0(this.f22690Oooo0oO, true, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o00000OO> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            return new o00000OO(UserPostListActivity.this, MomentAdapterTag.UserPostListActivity);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<PostGifPlayControl> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostGifPlayControl invoke() {
            UserPostListActivity userPostListActivity = UserPostListActivity.this;
            OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
            return new PostGifPlayControl(userPostListActivity, userPostListActivity.OooOoo().f50651OooO0OO);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentSendActivity.f22367o00oO0o.OooO00o(UserPostListActivity.this);
            return null;
        }
    }

    public final tc OooOoo() {
        return (tc) this.f22675OoooOoo.getValue();
    }

    public final AddedTopicHeadView OooOooO() {
        return (AddedTopicHeadView) this.f22682Oooooo0.getValue();
    }

    public final o00000OO OooOooo() {
        return (o00000OO) this.f22680OooooOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicInfoVM Oooo000() {
        return (TopicInfoVM) this.f22676Ooooo00.getValue();
    }

    public final void Oooo00O(boolean z) {
        if (z) {
            Oooo000().loadUserTopicListCount3(this.f22677Ooooo0o).observe(this, new o00oOoo(this, 2));
            Unit unit = Unit.INSTANCE;
            this.f22678OooooO0 = 0L;
            this.f22679OooooOO = 1;
        }
        Oooo000().userMomentList(com.yalla.support.common.util.OooO.OooO0o(this.f22677Ooooo0o), this.f22678OooooO0, this.f22679OooooOO, 0).observe(this, new o0o0000.OooOo(new OooO0OO(z), new OooO0o(z), new OooO(z), false, 8));
    }

    public final void Oooo00o(long j) {
        this.f22683OoooooO = j;
        OooOooo().f44995OooO0o0 = j;
        int size = OooOooo().getData().size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            MomentDetailModel momentDetailModel = OooOooo().getData().get(i2);
            if (momentDetailModel.getIsTop()) {
                momentDetailModel.setTop(false);
                if (i == -1) {
                    i = i2;
                }
            }
            if (momentDetailModel.getId() == this.f22683OoooooO) {
                momentDetailModel.setTop(true);
            }
        }
        Oooo00O(true);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        HeaderLayout headerLayout;
        super.onCreate(bundle);
        setContentView(OooOoo().f50649OooO00o);
        String stringExtra = getIntent().getStringExtra("Id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f22677Ooooo0o = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f22677Ooooo0o = kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o);
        }
        int i = 2;
        OooOoo().f50652OooO0Oo.setOnRefreshListener(new o00000(this, i));
        int i2 = 1;
        OooOoo().f50652OooO0Oo.setOnLoadMoreListener(new o0O000O(this, 1));
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setTitle(R.string.moments);
        }
        String str = this.f22677Ooooo0o;
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (o0000O.OooO00o(oooOOO, str) && (headerLayout = this.f11463OoooO) != null) {
            headerLayout.OooOoOO(R.drawable.icon_post_message_news, new oO0OoOO0(this));
        }
        if (!o0000O.OooO00o(oooOOO, this.f22677Ooooo0o)) {
            OooOoo().f50650OooO0O0.setVisibility(8);
        }
        OooOooo().f44994OooO0o = EnterRoomParentPage.Moments_Other_SharedRoom;
        OooOooo().setLoadErrorClickListener(new oO0Oo0oo(this));
        OooOooo().setEmptyText(R.string.moments_none);
        OooOooo().setEmptyImageRes(R.drawable.ic_empty_moment);
        OooOoo().f50651OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoo().f50651OooO0OO.setAdapter(OooOooo());
        OooOooO().setVisibility(8);
        OooOooo().setHeaderView(OooOooO());
        Oooo00O(true);
        LiveEventBus.get("MOMENT_POST_DELETE", MomentDetailModel.class).observe(this, new o000OO0O(this, i));
        int i3 = 3;
        LiveEventBus.get("MOMENT_POST_COMMENT", MomentDetailModel.class).observe(this, new o00O0000(this, i3));
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o0000O0O(this, i2));
        LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o0000O0(this, i3));
        Class cls = Long.TYPE;
        int i4 = 4;
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new o000OO(this, i4));
        LiveEventBus.get("Post_send_add", MomentSendModel.class).observe(this, new o0000oo(this, 5));
        LiveEventBus.get("Post_send_success", MomentSendModel.class).observe(this, new p501o0o00o.o0000O(this, i4));
        LiveEventBus.get("Post_send_filed", MomentSendModel.class).observe(this, new oo00oO(this, i3));
        LiveEventBus.get("Post_send_delete", MomentSendModel.class).observe(this, new o0000OO0(this, i4));
        LiveEventBus.get("MOMENT_TOP_OF_USER_POST", OnTopPostForUserPostModel.class).observe(this, new o00O0(this, i3));
        LiveEventBus.get("MOMENT_UN_TOP_OF_USER_POST", OnTopPostForUserPostModel.class).observe(this, new o000O0O0(this, i3));
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new o00(this, i3));
        Oooo000().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo000().statisticalTime();
    }

    public final void onMomentCreate(@Nullable View view) {
        OooOOO0 onLogin = new OooOOO0();
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }
}
