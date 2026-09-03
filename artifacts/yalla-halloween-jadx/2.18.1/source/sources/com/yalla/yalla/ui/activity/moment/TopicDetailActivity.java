package com.yalla.yalla.ui.activity.moment;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.TopicFollowChange;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00oO0o;
import p142o00OOooO.o0ooOOo;
import p142o00OOooO.oo0o0Oo;
import p143o00OOooo.o00O0OOO;
import p143o00OOooo.o00OOO0;
import p143o00OOooo.o00OOO0O;
import p143o00OOooo.o00OOOO0;
import p143o00OOooo.o00OOOOo;
import p163o00OoOo.o00O00O;
import p164o00OoOo0.o00OO0OO;
import p173o00OooO0.o0o0Oo;
import p175o00OooOo.o0OOooO0;
import p177o00Ooooo.oOo000Oo;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OOo0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p518o0o0O00o.o00O0000;
import p524o0o0O0oO.o0O00OO;
import p524o0o0O0oO.o0O00oO0;
import p524o0o0O0oO.o0O0O0O;
import p534o0o0OOo0.o00O0O0;
import p538o0o0Oo0.o0O0O0Oo;
import p538o0o0Oo0.o0O0OOOo;
import p538o0o0Oo0.oo0OOoo;
import p584o0oOoo.o000O;
import p594o0oOoooO.r5;
import p594o0oOoooO.s5;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.zc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22567o0OoOo0 = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TopicInfoModel f22569Ooooo00;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public TextView f22577Ooooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22568OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(zc.class), this, null);

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22570Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22591Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22591Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22571OooooO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22595Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22595Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22572OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$8
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$7
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$9

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22599Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22599Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22573OooooOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(YallaChatVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$11
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$10
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$12

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22588Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22588Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final ArgbEvaluator f22575Oooooo0 = new ArgbEvaluator();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final TopicPostPopularFragment f22574Oooooo = new TopicPostPopularFragment();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final TopicPostLatestFragment f22576OoooooO = new TopicPostLatestFragment();

    public static final class OooO extends Lambda implements Function0<Unit> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
            Response response = (Response) topicDetailActivity.Oooo000().getTopicDetailLiveData().getValue();
            TopicInfoModel topicInfo = response != null ? (TopicInfoModel) response.getData() : null;
            if (topicInfo == null) {
                return null;
            }
            TopicDetailActivity context = TopicDetailActivity.this;
            TopicInfoActivity.OooO00o oooO00o2 = TopicInfoActivity.f22623OoooooO;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
            Intent intent = new Intent(context, (Class<?>) TopicInfoActivity.class);
            intent.putExtra("info", topicInfo);
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @NotNull TopicInfoModel topicInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
            Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
            intent.putExtra("topic", topicInfo);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
            topicDetailActivity.Oooo000().followTopic(false).observe(topicDetailActivity, new o0O0O0Oo(false, topicDetailActivity));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f22580Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00000.OooO0OO("Moments_topics_follow");
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
            topicDetailActivity.Oooo000().followTopic(true).observe(topicDetailActivity, new o0O0O0Oo(true, topicDetailActivity));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TopicInfoModel topicInfoModel;
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
            Response response = (Response) topicDetailActivity.Oooo000().getTopicDetailLiveData().getValue();
            if (response == null || (topicInfoModel = (TopicInfoModel) response.getData()) == null) {
                return null;
            }
            TopicDetailActivity topicDetailActivity2 = TopicDetailActivity.this;
            o0O00000.OooO0OO("Moments_topics_post");
            ((TopicInfoVM) topicDetailActivity2.f22572OooooOO.getValue()).topicUserVerify(String.valueOf(topicInfoModel.getId())).observe(topicDetailActivity2, new o0ooOOo(topicDetailActivity2, 3));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
            TopicGroupInfoModel value = topicDetailActivity.Oooo00O().getTopicGroupInfoModel().getValue();
            if (value == null) {
                return null;
            }
            Bundle bundleOooO0O0 = o000O00O.OooO0OO.OooO0O0(TuplesKt.to("DATA", value));
            if (value.getType() != 2) {
                p606o0oo0O.OooOo.OooO0O0("103001");
                o000O.OooO00o(r5.f47512OooO00o, bundleOooO0O0);
            } else if (value.getIsDisbanded() || value.getCircleUserIsCancel()) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.topic_group_join_dissolved));
            } else {
                p606o0oo0O.OooOo.OooO0O0("103005");
                o000O.OooO00o(s5.f47537OooO00o, bundleOooO0O0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<MomentDetailModel, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2 != null) {
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                PostDetailActivity.f22417o0O0O00.OooO00o(TopicDetailActivity.this, momentDetailModel2, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : false, (256 & 64) != 0 ? null : MomentAdapterTag.TopicDetailNotificationBar, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void OooOoo() {
        Boolean value = Oooo000().isFollow().getValue();
        if (value != null) {
            if (value.booleanValue()) {
                o0O00000.OooO0OO("Moments_topics_followed");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this);
                oo0ooo0.OooOo0(R.string.sure_unfollow_topic);
                oo0ooo0.OooOo0o(new OooO0O0());
                oo0ooo0.OooOo(OooO0OO.f22580Oooo0o);
                oo0ooo0.OooOOO0();
                return;
            }
            OooO0o onLogin = new OooO0o();
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

    public final void OooOooO(String str) {
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            if (str == null || str.length() == 0) {
                return;
            }
            Oooo000().circleAdmin(str).observe(this, o00O0000.f42202OooO0OO);
        }
    }

    public final zc OooOooo() {
        return (zc) this.f22568OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0(long j) {
        MomentVM.momentDetail$default((MomentVM) this.f22571OooooO0.getValue(), String.valueOf(j), 0, 2, null).observe(this, new o0o0000.OooOo(new OooOOO0(), null, null, false, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicDetailVM Oooo000() {
        return (TopicDetailVM) this.f22570Ooooo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final YallaChatVM Oooo00O() {
        return (YallaChatVM) this.f22573OooooOo.getValue();
    }

    public final void Oooo00o(TopicInfoModel topicInfoModel) {
        String content;
        String content2;
        String content3;
        CoordinatorLayout coordinatorLayout = OooOooo().f51077OooO0OO;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "binding.clTopics");
        oOO00O.OooO(coordinatorLayout);
        ImageView imageView = OooOooo().f51079OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCreate");
        oOO00O.OooO(imageView);
        OooOooO(String.valueOf(topicInfoModel.getId()));
        String image = topicInfoModel.getImage();
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
        boolean z = false;
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgPng(CloudImageUtilKt.imgSize$default(image, com.yalla.support.common.util.OooOo00.OooO00o(55), false, 2, null));
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO00o(o00OOO.OooO00o.OooO());
        oooO00o.OooO0o(OooOooo().f51080OooO0o0.f49841OooO0o);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this);
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgBlur(image, 15);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.f48441OooOOOo = R.drawable.icon_topic_detail_bg;
        oooO00o2.f48431OooO0o = R.drawable.icon_topic_detail_bg;
        oooO00o2.OooO0o(OooOooo().f51080OooO0o0.f49842OooO0o0);
        OooOooo().f51080OooO0o0.f49845OooOO0.setText(topicInfoModel.getName());
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(topicInfoModel.getName());
        }
        OooOooo().f51080OooO0o0.f49843OooO0oO.setType(true);
        OooOooo().f51080OooO0o0.f49843OooO0oO.OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
        OooOooo().f51080OooO0o0.f49843OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
        OooOooo().f51080OooO0o0.f49844OooO0oo.setText(topicInfoModel.getDescribe());
        boolean zIsOwner = topicInfoModel.isOwner();
        Button button = OooOooo().f51080OooO0o0.f49838OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button, "binding.head.btJoin");
        boolean z2 = !zIsOwner;
        com.yalla.support.common.util.o00O0O.OooO0oO(button, z2);
        TextView textView = this.f22577Ooooooo;
        if (textView != null) {
            com.yalla.support.common.util.o00O0O.OooO0oO(textView, z2);
        }
        ArrayList<MomentDetailModel> notice = topicInfoModel.getNotice();
        if (notice == null || notice.size() <= 2) {
            OooOooo().f51080OooO0o0.f49848OooOOO0.setVisibility(8);
        } else {
            OooOooo().f51080OooO0o0.f49848OooOOO0.setVisibility(0);
            MomentSendContentModel content4 = notice.get(2).getContent();
            if ((content4 == null || (content3 = content4.getContent()) == null || !StringsKt.isBlank(content3)) ? false : true) {
                OooOooo().f51080OooO0o0.f49848OooOOO0.setText(R.string.topic_post_photo);
            } else {
                o0o0Oo.OooO0OO(this, content4, OooOooo().f51080OooO0o0.f49848OooOOO0);
            }
        }
        if (notice == null || notice.size() <= 1) {
            OooOooo().f51080OooO0o0.f49847OooOO0o.setVisibility(8);
        } else {
            OooOooo().f51080OooO0o0.f49847OooOO0o.setVisibility(0);
            MomentSendContentModel content5 = notice.get(1).getContent();
            if ((content5 == null || (content2 = content5.getContent()) == null || !StringsKt.isBlank(content2)) ? false : true) {
                OooOooo().f51080OooO0o0.f49847OooOO0o.setText(R.string.topic_post_photo);
            } else {
                o0o0Oo.OooO0OO(this, content5, OooOooo().f51080OooO0o0.f49847OooOO0o);
            }
        }
        if (notice == null || notice.size() <= 0) {
            OooOooo().f51080OooO0o0.f49846OooOO0O.setVisibility(8);
            return;
        }
        OooOooo().f51080OooO0o0.f49846OooOO0O.setVisibility(0);
        MomentSendContentModel content6 = notice.get(0).getContent();
        if (content6 != null && (content = content6.getContent()) != null && StringsKt.isBlank(content)) {
            z = true;
        }
        if (z) {
            OooOooo().f51080OooO0o0.f49846OooOO0O.setText(R.string.topic_post_photo);
        } else {
            o0o0Oo.OooO0OO(this, content6, OooOooo().f51080OooO0o0.f49846OooOO0O);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        TopicInfoModel topicInfoModel;
        ArrayList<MomentDetailModel> notice;
        TopicInfoModel topicInfoModel2;
        ArrayList<MomentDetailModel> notice2;
        TopicInfoModel topicInfoModel3;
        ArrayList<MomentDetailModel> notice3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOooo().f51080OooO0o0.f49842OooO0o0)) {
            OooO onLogin = new OooO();
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
        if (Intrinsics.areEqual(view, OooOooo().f51080OooO0o0.f49838OooO0O0)) {
            OooOoo();
            return;
        }
        if (Intrinsics.areEqual(view, OooOooo().f51080OooO0o0.f49846OooOO0O)) {
            Response response = (Response) Oooo000().getTopicDetailLiveData().getValue();
            if (response == null || (topicInfoModel3 = (TopicInfoModel) response.getData()) == null || (notice3 = topicInfoModel3.getNotice()) == null || notice3.size() <= 0) {
                return;
            }
            Oooo0(notice3.get(0).getId());
            return;
        }
        if (Intrinsics.areEqual(view, OooOooo().f51080OooO0o0.f49847OooOO0o)) {
            Response response2 = (Response) Oooo000().getTopicDetailLiveData().getValue();
            if (response2 == null || (topicInfoModel2 = (TopicInfoModel) response2.getData()) == null || (notice2 = topicInfoModel2.getNotice()) == null || notice2.size() <= 1) {
                return;
            }
            Oooo0(notice2.get(1).getId());
            return;
        }
        if (Intrinsics.areEqual(view, OooOooo().f51080OooO0o0.f49848OooOOO0)) {
            Response response3 = (Response) Oooo000().getTopicDetailLiveData().getValue();
            if (response3 == null || (topicInfoModel = (TopicInfoModel) response3.getData()) == null || (notice = topicInfoModel.getNotice()) == null || notice.size() <= 2) {
                return;
            }
            Oooo0(notice.get(2).getId());
            return;
        }
        if (Intrinsics.areEqual(view, OooOooo().f51079OooO0o)) {
            OooOO0 onLogin2 = new OooOO0();
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
        if (Intrinsics.areEqual(view, OooOooo().f51080OooO0o0.f49840OooO0Oo)) {
            OooOO0O onLogin3 = new OooOO0O();
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

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooo().f51075OooO00o);
        if (!getIntent().hasExtra("topic") || getIntent().getSerializableExtra("topic") == null) {
            finish();
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("topic");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.TopicInfoModel");
            this.f22569Ooooo00 = (TopicInfoModel) serializableExtra;
            MutableLiveData<TopicInfoModel> topicDetailLocal = Oooo000().getTopicDetailLocal();
            TopicInfoModel topicInfoModel = this.f22569Ooooo00;
            if (topicInfoModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel = null;
            }
            topicDetailLocal.setValue(topicInfoModel);
            MutableLiveData<Boolean> mutableLiveDataIsFollow = Oooo000().isFollow();
            TopicInfoModel topicInfoModel2 = this.f22569Ooooo00;
            if (topicInfoModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel2 = null;
            }
            mutableLiveDataIsFollow.setValue(Boolean.valueOf(topicInfoModel2.getIsJoin() == 1));
            YallaChatVM yallaChatVMOooo00O = Oooo00O();
            TopicInfoModel topicInfoModel3 = this.f22569Ooooo00;
            if (topicInfoModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel3 = null;
            }
            yallaChatVMOooo00O.setTopicInfoModel(topicInfoModel3);
        }
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setBackgroundColor(o000O0O0.OooO00o(R.color.transparent));
        }
        OooOOO(this.f11463OoooO);
        o000OOo0.OooO0o(this);
        HeaderLayout headerLayout2 = this.f11463OoooO;
        Intrinsics.checkNotNull(headerLayout2);
        o000OOo0.OooO0O0(headerLayout2);
        Toolbar toolbar = OooOooo().f51082OooO0oo;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbarHolder");
        o000OOo0.OooO00o(toolbar);
        NetImageView netImageView = OooOooo().f51080OooO0o0.f49841OooO0o;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.head.nivHeader");
        o000OOo0.OooO00o(netImageView);
        HeaderLayout headerLayout3 = this.f11463OoooO;
        if (headerLayout3 != null) {
            headerLayout3.OooOoOO(R.drawable.ic_tool_menu, new o0O0OOOo(this));
        }
        HeaderLayout headerLayout4 = this.f11463OoooO;
        int i = 4;
        if (headerLayout4 != null) {
            int i2 = HeaderLayout.f12042o00000O;
            TextView textViewOooOoo0 = headerLayout4.OooOoo0(R.string.Follow, null);
            if (textViewOooOoo0 != null) {
                textViewOooOoo0.setBackgroundResource(R.drawable.shape_corner_solid_ffffff);
                textViewOooOoo0.setGravity(17);
                textViewOooOoo0.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
                textViewOooOoo0.setOnClickListener(new oOo000Oo(this, 4));
                this.f22577Ooooooo = textViewOooOoo0;
            }
        }
        OooOooo().f51076OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o0Oo0.o0O0O0o0
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i3) {
                TopicDetailActivity this$0 = this.f44011OooO00o;
                TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Objects.requireNonNull(this$0);
                int iOooO0O0 = OooOo00.OooO0O0(i3) + 30;
                if (iOooO0O0 >= 0) {
                    HeaderLayout headerLayout5 = this$0.f11463OoooO;
                    if (headerLayout5 != null) {
                        headerLayout5.setBackgroundColor(o000O0O0.OooO00o(R.color.transparent));
                    }
                    HeaderLayout headerLayout6 = this$0.f11463OoooO;
                    if (headerLayout6 != null) {
                        headerLayout6.setTitleTextColor(o000O0O0.OooO00o(R.color.transparent));
                    }
                    TextView textView = this$0.f22577Ooooooo;
                    if (textView != null) {
                        textView.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    }
                    TextView textView2 = this$0.f22577Ooooooo;
                    if (textView2 != null) {
                        textView2.setEnabled(false);
                    }
                    this$0.OooOooo().f51080OooO0o0.f49838OooO0O0.setAlpha(1.0f);
                    this$0.OooOooo().f51080OooO0o0.f49838OooO0O0.setEnabled(true);
                    return;
                }
                float fAbs = Math.abs(iOooO0O0) / 70.0f;
                float f = fAbs <= 1.0f ? fAbs : 1.0f;
                Object objEvaluate = this$0.f22575Oooooo0.evaluate(f, Integer.valueOf(o000O0O0.OooO00o(R.color.transparent)), Integer.valueOf(o000O0O0.OooO00o(R.color.color_00d8c9)));
                Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = this$0.f22575Oooooo0.evaluate(f, Integer.valueOf(o000O0O0.OooO00o(R.color.transparent)), Integer.valueOf(o000O0O0.OooO00o(R.color.color_white)));
                Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) objEvaluate2).intValue();
                HeaderLayout headerLayout7 = this$0.f11463OoooO;
                if (headerLayout7 != null) {
                    headerLayout7.setBackgroundColor(iIntValue);
                }
                HeaderLayout headerLayout8 = this$0.f11463OoooO;
                if (headerLayout8 != null) {
                    headerLayout8.setTitleTextColor(iIntValue2);
                }
                TextView textView3 = this$0.f22577Ooooooo;
                if (textView3 != null) {
                    textView3.setAlpha(f);
                }
                TextView textView4 = this$0.f22577Ooooooo;
                if (textView4 != null) {
                    textView4.setEnabled(((double) f) > 0.5d);
                }
                this$0.OooOooo().f51080OooO0o0.f49838OooO0O0.setAlpha(1 - f);
                this$0.OooOooo().f51080OooO0o0.f49838OooO0O0.setEnabled(((double) f) < 0.5d);
            }
        });
        OooOooo().f51080OooO0o0.f49840OooO0Oo.setOnClickListener(this);
        OooOooo().f51080OooO0o0.f49838OooO0O0.setOnClickListener(this);
        OooOooo().f51080OooO0o0.f49846OooOO0O.setOnClickListener(this);
        OooOooo().f51080OooO0o0.f49847OooOO0o.setOnClickListener(this);
        OooOooo().f51080OooO0o0.f49848OooOOO0.setOnClickListener(this);
        OooOooo().f51079OooO0o.setOnClickListener(this);
        OooOooo().f51080OooO0o0.f49842OooO0o0.setOnClickListener(this);
        o0OOooO0 o0ooooo1 = new o0OOooO0(getSupportFragmentManager());
        o0ooooo1.OooOOoo(this.f22574Oooooo, o000O0O0.OooO0OO(R.string.Popular));
        o0ooooo1.OooOOoo(this.f22576OoooooO, o000O0O0.OooO0OO(R.string.Latest));
        OooOooo().f51074OooO.setAdapter(o0ooooo1);
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o.f32980OooO0Oo = 15.0f;
        oooO00o.f32982OooO0o0 = 15.0f;
        List<String> list = o0ooooo1.f32754OooO;
        Intrinsics.checkNotNullExpressionValue(list, "adapter.fragmentsTitleList");
        oooO00o.OooO0O0(list);
        oooO00o.f32981OooO0o = o000O0O0.OooO00o(R.color.color_333333);
        oooO00o.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_999999);
        ViewPagerFixed viewPagerFixed = OooOooo().f51074OooO;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.vpTopicDetail");
        oooO00o.OooO0OO(viewPagerFixed);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32976OooO = o000O0O0.OooO00o(R.color.color_00d8c9);
        oooO00o.f32985OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(20.0f);
        oooO00o.f32986OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        YlTableLayout ylTableLayout = OooOooo().f51081OooO0oO;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tabLayout");
        oooO00o.OooO00o(ylTableLayout);
        OooOooo().f51074OooO.OooO0O0(new oo0OOoo());
        int i3 = 3;
        Oooo00O().getTopicGroupInfoModel().observe(this, new o0O00OO(this, i3));
        Class cls = Long.TYPE;
        int i4 = 2;
        LiveEventBus.get("TOPIC_FOLLOW_SUCCESS", cls).observe(this, new o0O00oO0(this, i4));
        LiveEventBus.get("MOMENT_LIST_REFRESH_OF_TOPIC", Boolean.TYPE).observe(this, new o00OOO0(this, i));
        int i5 = 5;
        LiveEventBus.get("MOMENT_TOP_OF_TOPIC", OnTopPostForTopicModel.class).observe(this, new o00OOOO0(this, i5));
        LiveEventBus.get("MOMENT_UN_TOP_OF_TOPIC", OnTopPostForTopicModel.class).observe(this, new o00O00O(this, i3));
        LiveEventBus.get("POST_REMOVE_OF_TOPIC", OnTopPostForTopicModel.class).observe(this, new p142o00OOooO.o00O0O(this, i5));
        LiveEventBus.get("POST_DELETE_OF_TOPIC", OnTopPostForTopicModel.class).observe(this, new p143o00OOooo.o0o0Oo(this, i3));
        Oooo000().getTopicDetailLocal().observe(this, new o00OOOOo(this, i3));
        Oooo000().getTopicDetailLiveData().observe(this, new p142o00OOooO.o0OOO0o(this, i5));
        Oooo000().isFollow().observe(this, new o00oO0o(this, i3));
        LiveEventBus.get("TOPIC_HEADER", String.class).observe(this, new oo0o0Oo(this, i4));
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new o0O0O0O(this, i4));
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new o00O0OOO(this, i4));
        LiveEventBus.get("TOPIC_FOLLOW_CHANGE", TopicFollowChange.class).observe(this, new o00O0O0(this, i4));
        LiveEventBus.get("Post_send_success", MomentSendModel.class).observe(this, new p524o0o0O0oO.o0O0O0Oo(this, i));
        LiveEventBus.get("TOPIC_GROUP_RESULT_CREATE", cls).observe(this, new o00OO0OO(this, i5));
        LiveEventBus.get("TOPIC_GROUP_RESULT_JOIN", cls).observe(this, new o00OOO0O(this, i));
        Oooo00O().getGroupInfo();
        Oooo000().loadTopicDetail();
        Oooo000().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo000().statisticalTime();
    }
}
