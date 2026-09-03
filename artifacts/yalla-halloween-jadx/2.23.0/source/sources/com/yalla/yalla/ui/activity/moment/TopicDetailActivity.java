package com.yalla.yalla.ui.activity.moment;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O0O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen;
import com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p485o0o00O0.oO000OOo;
import p485o0o00O0.oO000Oo;
import p485o0o00O0.oO000Oo0;
import p485o0o00O0.oO000o00;
import p485o0o00O0.oO00O0o0;
import p485o0o00O0.oO00O0oO;
import p485o0o00O0.oO00OO0O;
import p485o0o00O0.oO00OOO;
import p485o0o00O0.oO00OOOo;
import p485o0o00O0.oO00Oo0;
import p485o0o00O0.oO00o00;
import p485o0o00O0.oO00o000;
import p485o0o00O0.oO0O0OoO;
import p485o0o00O0.oO0OOo0o;
import p485o0o00O0.oO0OoOO0;
import p485o0o00O0.oOOoOOO0;
import p485o0o00O0.ooOOOOoo;
import p526o0o0OOO0.oo0oOO0;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p595o0oo00Oo.o0000Ooo;
import p641o0ooOOOO.e6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,609:1\n22#2,2:610\n75#3,13:612\n75#3,13:625\n75#3,13:638\n75#3,13:651\n*S KotlinDebug\n*F\n+ 1 TopicDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailActivity\n*L\n69#1:610,2\n71#1:612,13\n72#1:625,13\n73#1:638,13\n74#1:651,13\n*E\n"})
public final class TopicDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26305OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TopicInfoModel f26309OooOo00;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public TextView f26312OooOoO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26306OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(e6.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26308OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26330OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26330OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26310OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$5
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26334OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26334OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26311OooOo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$8
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26338OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26338OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26307OooOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(YallaChatVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicDetailActivity$special$$inlined$viewModels$default$11
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26327OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26327OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ArgbEvaluator f26313OooOoO0 = new ArgbEvaluator();

    public static final class OooO extends Lambda implements Function1<Response<ArrayList<UserInfo>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f26314OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Response<ArrayList<UserInfo>> response) {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context, @NotNull TopicInfoModel topicInfo) {
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
            int i = TopicDetailActivity.f26305OooOoOO;
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            topicDetailActivity.OooOoo0().followTopic(false).observe(topicDetailActivity, new OooOOOO(new oO000OOo(topicDetailActivity, false)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f26316OooO0Oo = new OooO0OO();

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
            o0OO000.OooO00o("103034");
            int i = TopicDetailActivity.f26305OooOoOO;
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            topicDetailActivity.OooOoo0().followTopic(true).observe(topicDetailActivity, new OooOOOO(new oO000OOo(topicDetailActivity, true)));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nTopicDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailActivity$onClickNotDouble$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,609:1\n1#2:610\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = TopicDetailActivity.f26305OooOoOO;
            TopicDetailActivity context = TopicDetailActivity.this;
            Response response = (Response) context.OooOoo0().getTopicDetailLiveData().getValue();
            TopicInfoModel topicInfo = response != null ? (TopicInfoModel) response.getData() : null;
            if (topicInfo != null) {
                int i2 = TopicInfoActivity.f26367OooOoOO;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
                Intent intent = new Intent(context, (Class<?>) TopicInfoActivity.class);
                intent.putExtra("info", topicInfo);
                context.startActivity(intent);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TopicInfoModel topicInfoModel;
            int i = TopicDetailActivity.f26305OooOoOO;
            TopicDetailActivity topicDetailActivity = TopicDetailActivity.this;
            Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
            if (response != null && (topicInfoModel = (TopicInfoModel) response.getData()) != null) {
                o0OO000.OooO00o("203006");
                ((TopicInfoVM) topicDetailActivity.f26311OooOo0o.getValue()).topicUserVerify(String.valueOf(topicInfoModel.getId())).observe(topicDetailActivity, new OooOOOO(new o0Oo0oo(topicDetailActivity)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Integer, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            int i = TopicDetailActivity.f26305OooOoOO;
            ImageView imageView = TopicDetailActivity.this.OooOoOO().f57827OooO0oo;
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            imageView.setImageResource(oOOOOo0O.OooO0Oo(it.intValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = TopicDetailActivity.f26305OooOoOO;
            TopicGroupInfoModel value = TopicDetailActivity.this.OooOoo().getTopicGroupInfoModel().getValue();
            if (value != null) {
                boolean z = true;
                Bundle bundleOooO0O0 = p063o0000oO.o00Ooo.OooO0O0(TuplesKt.to("DATA", value));
                if (value.getType() != 2) {
                    o0OO000.OooO00o("103001");
                    oo0oOO0.OooO0o0(TopicGroupCreateScreen.INSTANCE, bundleOooO0O0, false, null, 12);
                } else if (value.getIsDisbanded() || value.getCircleUserIsCancel()) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.topic_group_join_dissolved);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    o0OO000.OooO00o("103005");
                    oo0oOO0.OooO0o0(TopicGroupJoinScreen.INSTANCE, bundleOooO0O0, false, null, 12);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26322OooO0Oo;

        public OooOOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26322OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26322OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26322OooO0Oo;
        }

        public final int hashCode() {
            return this.f26322OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26322OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<MomentDetailModel, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2 != null) {
                int i = MomentDetailActivity.f26057Oooo0;
                MomentDetailActivity.OooO00o.OooO00o(TopicDetailActivity.this, momentDetailModel2, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? 1 : -1, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? null : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? null : MomentAdapterTag.TopicDetailNotificationBar, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo(TopicDetailActivity topicDetailActivity, TopicInfoModel topicInfoModel) {
        String strOooO0OO;
        String content;
        String strOooO0OO2;
        String content2;
        String strOooO0OO3;
        String content3;
        CoordinatorLayout coordinatorLayout = topicDetailActivity.OooOoOO().f57822OooO0OO;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "binding.clTopics");
        o000OO00.OooOOOO(coordinatorLayout);
        ImageView imageView = topicDetailActivity.OooOoOO().f57827OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCreate");
        o000OO00.OooOOOO(imageView);
        topicDetailActivity.OooOoO(String.valueOf(topicInfoModel.getId()));
        String image = topicInfoModel.getImage();
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(topicDetailActivity);
        int iOooO00o = o0000O0.OooO00o(55);
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0o0(p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, image));
        boolean z = false;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0oO());
        oooO00o.OooO0o0(12);
        oooO00o.OooO0Oo(topicDetailActivity.OooOoOO().f57826OooO0oO.f58787OooO0o0);
        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(topicDetailActivity);
        oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO00o(50, image);
        oooO00o2.f43909OooO00o = 0;
        int i = oOo00OO0.icon_topic_detail_bg;
        oooO00o2.f43923OooOOOo = i;
        oooO00o2.f43913OooO0o = i;
        oooO00o2.OooO0Oo(topicDetailActivity.OooOoOO().f57826OooO0oO.f58785OooO0Oo);
        topicDetailActivity.OooOoOO().f57826OooO0oO.f58781OooO.setText(topicInfoModel.getName());
        HeaderLayout headerLayout = topicDetailActivity.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(topicInfoModel.getName());
        }
        topicDetailActivity.OooOoOO().f57826OooO0oO.f58786OooO0o.setType(true);
        topicDetailActivity.OooOoOO().f57826OooO0oO.f58786OooO0o.OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), topicInfoModel.getPropPriceTotal());
        topicDetailActivity.OooOoOO().f57826OooO0oO.f58786OooO0o.setTextColor(o0000.OooO00o(oO00O0o.white));
        topicDetailActivity.OooOoOO().f57826OooO0oO.f58788OooO0oO.setText(topicInfoModel.getDescribe());
        boolean zIsOwner = topicInfoModel.isOwner();
        TextView textView = topicDetailActivity.OooOoOO().f57826OooO0oO.f58783OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.head.btJoin");
        boolean z2 = !zIsOwner;
        o000OO00.OooOOO0(textView, z2);
        TextView textView2 = topicDetailActivity.f26312OooOoO;
        if (textView2 != null) {
            o000OO00.OooOOO0(textView2, z2);
        }
        ArrayList<MomentDetailModel> notice = topicInfoModel.getNotice();
        if (notice == null || notice.size() <= 2) {
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58792OooOO0o.setVisibility(8);
        } else {
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58792OooOO0o.setVisibility(0);
            MomentSendContentModel content4 = notice.get(2).getContent();
            if ((content4 == null || (content3 = content4.getContent()) == null || !StringsKt.isBlank(content3)) ? false : true) {
                TextView textView3 = topicDetailActivity.OooOoOO().f57826OooO0oO.f58792OooOO0o;
                int dyType = topicInfoModel.getDyType();
                if (dyType == MomentType.Image.getValue()) {
                    strOooO0OO3 = o0000.OooO0OO(oO00OOo0._photo_);
                } else if (dyType == MomentType.Video.getValue()) {
                    strOooO0OO3 = o0000.OooO0OO(oO00OOo0._Video_);
                } else {
                    strOooO0OO3 = dyType == MomentType.Poll.getValue() ? o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", o0000.OooO0OO(oO00OOo0.Other), "]");
                }
                textView3.setText(strOooO0OO3);
            } else {
                o0000Ooo.OooO0O0(topicDetailActivity, content4, topicDetailActivity.OooOoOO().f57826OooO0oO.f58792OooOO0o);
            }
        }
        if (notice == null || notice.size() <= 1) {
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58791OooOO0O.setVisibility(8);
        } else {
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58791OooOO0O.setVisibility(0);
            MomentSendContentModel content5 = notice.get(1).getContent();
            if ((content5 == null || (content2 = content5.getContent()) == null || !StringsKt.isBlank(content2)) ? false : true) {
                FixTextView fixTextView = topicDetailActivity.OooOoOO().f57826OooO0oO.f58791OooOO0O;
                int dyType2 = topicInfoModel.getDyType();
                if (dyType2 == MomentType.Image.getValue()) {
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0._photo_);
                } else if (dyType2 == MomentType.Video.getValue()) {
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0._Video_);
                } else {
                    strOooO0OO2 = dyType2 == MomentType.Poll.getValue() ? o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", o0000.OooO0OO(oO00OOo0.Other), "]");
                }
                fixTextView.setText(strOooO0OO2);
            } else {
                o0000Ooo.OooO0O0(topicDetailActivity, content5, topicDetailActivity.OooOoOO().f57826OooO0oO.f58791OooOO0O);
            }
        }
        if (notice == null || notice.size() <= 0) {
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58790OooOO0.setVisibility(8);
            return;
        }
        topicDetailActivity.OooOoOO().f57826OooO0oO.f58790OooOO0.setVisibility(0);
        MomentSendContentModel content6 = notice.get(0).getContent();
        if (content6 != null && (content = content6.getContent()) != null && StringsKt.isBlank(content)) {
            z = true;
        }
        if (!z) {
            o0000Ooo.OooO0O0(topicDetailActivity, content6, topicDetailActivity.OooOoOO().f57826OooO0oO.f58790OooOO0);
            return;
        }
        FixTextView fixTextView2 = topicDetailActivity.OooOoOO().f57826OooO0oO.f58790OooOO0;
        int dyType3 = topicInfoModel.getDyType();
        if (dyType3 == MomentType.Image.getValue()) {
            strOooO0OO = o0000.OooO0OO(oO00OOo0._photo_);
        } else if (dyType3 == MomentType.Video.getValue()) {
            strOooO0OO = o0000.OooO0OO(oO00OOo0._Video_);
        } else {
            strOooO0OO = dyType3 == MomentType.Poll.getValue() ? o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", o0000.OooO0OO(oO00OOo0.Other), "]");
        }
        fixTextView2.setText(strOooO0OO);
    }

    public final void OooOoO(String str) {
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            if (str == null || str.length() == 0) {
                return;
            }
            OooOoo0().circleAdmin(str).observe(this, new OooOOOO(OooO.f26314OooO0Oo));
        }
    }

    public final void OooOoO0() {
        Boolean value = OooOoo0().isFollow().getValue();
        if (value != null) {
            if (value.booleanValue()) {
                o0OO000.OooO00o("103035");
                p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
                o0oo00o2.OooOOoo(oO00OOo0.sure_unfollow_topic);
                o0oo00o2.OooOo0(new OooO0O0());
                o0oo00o2.OooOo0O(OooO0OO.f26316OooO0Oo);
                o0oo00o2.OooOO0o();
                return;
            }
            OooO0o onLogin = new OooO0o();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    public final e6 OooOoOO() {
        return (e6) this.f26306OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final YallaChatVM OooOoo() {
        return (YallaChatVM) this.f26307OooOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicDetailVM OooOoo0() {
        return (TopicDetailVM) this.f26308OooOo0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO(long j) {
        BaseMomentDetailVM.momentDetail$default((BaseMomentDetailVM) this.f26310OooOo0O.getValue(), String.valueOf(j), 0, 2, null).observe(this, new o0000OO0(new OooOo00(), null, null, false, 14));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        TopicInfoModel topicInfoModel;
        ArrayList<MomentDetailModel> notice;
        TopicInfoModel topicInfoModel2;
        ArrayList<MomentDetailModel> notice2;
        TopicInfoModel topicInfoModel3;
        ArrayList<MomentDetailModel> notice3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoOO().f57826OooO0oO.f58785OooO0Oo)) {
            OooOO0 onLogin = new OooOO0();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, OooOoOO().f57826OooO0oO.f58783OooO0O0)) {
            OooOoO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoOO().f57826OooO0oO.f58790OooOO0)) {
            Response response = (Response) OooOoo0().getTopicDetailLiveData().getValue();
            if (response == null || (topicInfoModel3 = (TopicInfoModel) response.getData()) == null || (notice3 = topicInfoModel3.getNotice()) == null || notice3.size() <= 0) {
                return;
            }
            OooOooO(notice3.get(0).getId());
            return;
        }
        if (Intrinsics.areEqual(view, OooOoOO().f57826OooO0oO.f58791OooOO0O)) {
            Response response2 = (Response) OooOoo0().getTopicDetailLiveData().getValue();
            if (response2 == null || (topicInfoModel2 = (TopicInfoModel) response2.getData()) == null || (notice2 = topicInfoModel2.getNotice()) == null || notice2.size() <= 1) {
                return;
            }
            OooOooO(notice2.get(1).getId());
            return;
        }
        if (Intrinsics.areEqual(view, OooOoOO().f57826OooO0oO.f58792OooOO0o)) {
            Response response3 = (Response) OooOoo0().getTopicDetailLiveData().getValue();
            if (response3 == null || (topicInfoModel = (TopicInfoModel) response3.getData()) == null || (notice = topicInfoModel.getNotice()) == null || notice.size() <= 2) {
                return;
            }
            OooOooO(notice.get(2).getId());
            return;
        }
        if (Intrinsics.areEqual(view, OooOoOO().f57827OooO0oo)) {
            OooOO0O onLogin2 = new OooOO0O();
            Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
            p464o0Oooo.o000000O o000000o3 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin2.invoke();
                return;
            }
            Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O1 != null) {
                LoginActivity.OooO00o.OooO00o(activityOooO0O1);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, OooOoOO().f57826OooO0oO.f58784OooO0OO)) {
            OooOOO0 onLogin3 = new OooOOO0();
            Intrinsics.checkNotNullParameter(onLogin3, "onLogin");
            p464o0Oooo.o000000O o000000o4 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin3.invoke();
                return;
            }
            Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O2 != null) {
                LoginActivity.OooO00o.OooO00o(activityOooO0O2);
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoOO().f57820OooO00o);
        if (!getIntent().hasExtra("topic") || getIntent().getSerializableExtra("topic") == null) {
            finish();
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("topic");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.topic.TopicInfoModel");
            this.f26309OooOo00 = (TopicInfoModel) serializableExtra;
            MutableLiveData<TopicInfoModel> topicDetailLocal = OooOoo0().getTopicDetailLocal();
            TopicInfoModel topicInfoModel = this.f26309OooOo00;
            if (topicInfoModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel = null;
            }
            topicDetailLocal.setValue(topicInfoModel);
            MutableLiveData<Boolean> mutableLiveDataIsFollow = OooOoo0().isFollow();
            TopicInfoModel topicInfoModel2 = this.f26309OooOo00;
            if (topicInfoModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel2 = null;
            }
            mutableLiveDataIsFollow.setValue(Boolean.valueOf(com.code.android.util.o000000.OooO00o(Integer.valueOf(topicInfoModel2.getIsJoin()))));
            YallaChatVM yallaChatVMOooOoo = OooOoo();
            TopicInfoModel topicInfoModel3 = this.f26309OooOo00;
            if (topicInfoModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel3 = null;
            }
            yallaChatVMOooOoo.setTopicInfoModel(topicInfoModel3);
        }
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setNavigationIcon(oOo00OO0.btn_return_black);
            headerLayout.setBackgroundColor(o0000.OooO00o(oO00O0o.transparent));
            headerLayout.OooOo(oOo00OO0.btn_menu, new oO00Oo0(this));
            TextView textViewOooOoO0 = headerLayout.OooOoO0(oO00OOo0.Follow, null);
            textViewOooOoO0.setBackgroundResource(oOo00OO0.shape_corner_solid_00d8c9);
            textViewOooOoO0.setGravity(17);
            textViewOooOoO0.setTextColor(o0000.OooO00o(oO00O0o.color_white));
            textViewOooOoO0.setOnClickListener(new oO0OoOO0(0, this));
            this.f26312OooOoO = textViewOooOoO0;
            textViewOooOoO0.setTextSize(12.0f);
            OooOO0o().OooOoO(headerLayout);
            o0000O0O.OooO0OO(headerLayout);
        }
        o0000O0O.OooO0oO(this);
        Toolbar toolbar = OooOoOO().f57819OooO;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbarHolder");
        o0000O0O.OooO0O0(toolbar);
        NetImageView netImageView = OooOoOO().f57826OooO0oO.f58787OooO0o0;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.head.nivHeader");
        o0000O0O.OooO0O0(netImageView);
        OooOoOO().f57821OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o00O0.oO0Oo0oo
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                int i2 = TopicDetailActivity.f26305OooOoOO;
                TopicDetailActivity this$0 = this.f48126OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                int iOooO0O0 = o0000O0.OooO0O0(i) + 30;
                if (iOooO0O0 >= 0) {
                    HeaderLayout headerLayout2 = this$0.f22755OooOO0;
                    if (headerLayout2 != null) {
                        headerLayout2.setBackgroundColor(o0000.OooO00o(oO00O0o.transparent));
                    }
                    HeaderLayout headerLayout3 = this$0.f22755OooOO0;
                    if (headerLayout3 != null) {
                        headerLayout3.setTitleTextColor(o0000.OooO00o(oO00O0o.transparent));
                    }
                    HeaderLayout headerLayout4 = this$0.f22755OooOO0;
                    if (headerLayout4 != null) {
                        headerLayout4.setNavigationIcon(oOo00OO0.btn_return);
                    }
                    HeaderLayout headerLayout5 = this$0.f22755OooOO0;
                    if (headerLayout5 != null) {
                        Drawable drawableOooO0O0 = o0000.OooO0O0(oOo00OO0.btn_menu);
                        ImageView imageView = headerLayout5.f30474OoooOo0;
                        imageView.setImageDrawable(drawableOooO0O0);
                        if (drawableOooO0O0 == null) {
                            o000OO00.OooO0O0(imageView);
                        } else {
                            o000OO00.OooOOOO(imageView);
                        }
                    }
                    TextView textView = this$0.f26312OooOoO;
                    if (textView != null) {
                        textView.setAlpha(0.0f);
                    }
                    TextView textView2 = this$0.f26312OooOoO;
                    if (textView2 != null) {
                        textView2.setEnabled(false);
                    }
                    this$0.OooOoOO().f57826OooO0oO.f58783OooO0O0.setAlpha(1.0f);
                    return;
                }
                float fAbs = Math.abs(iOooO0O0) / 70.0f;
                float f = fAbs <= 1.0f ? fAbs : 1.0f;
                ArgbEvaluator argbEvaluator = this$0.f26313OooOoO0;
                int i3 = oO00O0o.transparent;
                Object objEvaluate = argbEvaluator.evaluate(f, Integer.valueOf(o0000.OooO00o(i3)), Integer.valueOf(o0000.OooO00o(oO00O0o.color_white)));
                Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = argbEvaluator.evaluate(f, Integer.valueOf(o0000.OooO00o(i3)), Integer.valueOf(o0000.OooO00o(oO00O0o.color_333333)));
                Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) objEvaluate2).intValue();
                Object objEvaluate3 = argbEvaluator.evaluate(f, Integer.valueOf(oOo00OO0.btn_return), Integer.valueOf(oOo00OO0.btn_return_black));
                Intrinsics.checkNotNull(objEvaluate3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue3 = ((Integer) objEvaluate3).intValue();
                Object objEvaluate4 = argbEvaluator.evaluate(f, Integer.valueOf(oOo00OO0.btn_menu), Integer.valueOf(oOo00OO0.btn_menu_black));
                Intrinsics.checkNotNull(objEvaluate4, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue4 = ((Integer) objEvaluate4).intValue();
                HeaderLayout headerLayout6 = this$0.f22755OooOO0;
                if (headerLayout6 != null) {
                    headerLayout6.setNavigationIcon(iIntValue3);
                }
                HeaderLayout headerLayout7 = this$0.f22755OooOO0;
                if (headerLayout7 != null) {
                    Drawable drawableOooO0O1 = o0000.OooO0O0(iIntValue4);
                    ImageView imageView2 = headerLayout7.f30474OoooOo0;
                    imageView2.setImageDrawable(drawableOooO0O1);
                    if (drawableOooO0O1 == null) {
                        o000OO00.OooO0O0(imageView2);
                    } else {
                        o000OO00.OooOOOO(imageView2);
                    }
                }
                HeaderLayout headerLayout8 = this$0.f22755OooOO0;
                if (headerLayout8 != null) {
                    headerLayout8.setBackgroundColor(iIntValue);
                }
                HeaderLayout headerLayout9 = this$0.f22755OooOO0;
                if (headerLayout9 != null) {
                    headerLayout9.setTitleTextColor(iIntValue2);
                }
                TextView textView3 = this$0.f26312OooOoO;
                if (textView3 != null) {
                    textView3.setAlpha(f);
                }
                TextView textView4 = this$0.f26312OooOoO;
                if (textView4 != null) {
                    textView4.setEnabled(((double) f) > 0.5d);
                }
                this$0.OooOoOO().f57826OooO0oO.f58783OooO0O0.setAlpha(1 - f);
            }
        });
        OooOoOO().f57826OooO0oO.f58784OooO0OO.setOnClickListener(this);
        OooOoOO().f57826OooO0oO.f58783OooO0O0.setOnClickListener(this);
        OooOoOO().f57826OooO0oO.f58790OooOO0.setOnClickListener(this);
        OooOoOO().f57826OooO0oO.f58791OooOO0O.setOnClickListener(this);
        OooOoOO().f57826OooO0oO.f58792OooOO0o.setOnClickListener(this);
        OooOoOO().f57827OooO0oo.setOnClickListener(this);
        OooOoOO().f57826OooO0oO.f58785OooO0Oo.setOnClickListener(this);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ComposeView composeView = OooOoOO().f57825OooO0o0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeViewTabLayout");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1757956189, true, new oOOoOOO0(objectRef)));
        ComposeView composeView2 = OooOoOO().f57823OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.composeView");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView2, ComposableLambdaKt.composableLambdaInstance(1058459476, true, new oO00o000(this, objectRef)));
        OooOoo().getTopicGroupInfoModel().observe(this, new OooOOOO(new oO00o00(this)));
        Class cls = Long.TYPE;
        LiveEventBus.get("TOPIC_FOLLOW_SUCCESS", cls).observe(this, new oO0O0OoO(this));
        LiveEventBus.get("MOMENT_LIST_REFRESH_OF_TOPIC", Boolean.TYPE).observe(this, new oO00O0o0(this));
        LiveEventBus.get("MOMENT_TOP_OF_TOPIC", OnTopPostForTopicModel.class).observe(this, new p485o0o00O0.oO00O0o(this));
        LiveEventBus.get("MOMENT_UN_TOP_OF_TOPIC", OnTopPostForTopicModel.class).observe(this, new p485o0o00O0.oOo00OO0(this));
        OooOoo0().getTopicDetailLocal().observe(this, new OooOOOO(new oO00O0oO(this)));
        OooOoo0().getTopicDetailLiveData().observe(this, new OooOOOO(new oO00OO0O(this)));
        OooOoo0().isFollow().observe(this, new OooOOOO(new oO00OOO(this)));
        LiveEventBus.get("TOPIC_HEADER", String.class).observe(this, new oO00OOOo(this));
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new p485o0o00O0.oO00OOo0(this));
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new ooOOOOoo(this));
        LiveEventBus.get("TOPIC_FOLLOW_CHANGE", TopicFollowChange.class).observe(this, new oO0OOo0o(this));
        LiveEventBus.get("Post_send_success", MomentSendModel.class).observe(this, new oO000Oo0(this));
        LiveEventBus.get("TOPIC_GROUP_RESULT_CREATE", cls).observe(this, new oO000Oo(this));
        LiveEventBus.get("TOPIC_GROUP_RESULT_JOIN", cls).observe(this, new oO000o00(this));
        OooOoo().getGroupInfo();
        OooOoo0().loadTopicDetail();
        OooOoo0().statisticalTime();
        o0OO000.OooO00o("204016");
        p427o0OoOO00.OooOo.f45669OooO00o.observe(this, new OooOOOO(new OooOOO()));
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOoo0().statisticalTime();
    }
}
