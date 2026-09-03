package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.mixedroom.o00000O;
import com.yalla.yalla.mixedroom.o00000O0;
import com.yalla.yalla.mixedroom.o00000OO;
import com.yalla.yalla.mixedroom.o0000Ooo;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.moment.oo0o0Oo;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.ooooO000;
import p492o0o00OO0.oO0O0Oo0;
import p492o0o00OO0.oO0OO00;
import p492o0o00OO0.oOo0o0oO;
import p492o0o00OO0.oOo0oooO;
import p492o0o00OO0.ooOOO00O;
import p492o0o00OO0.ooOOO0Oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicInfoActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicInfoActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicInfoActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,233:1\n22#2,2:234\n75#3,13:236\n*S KotlinDebug\n*F\n+ 1 TopicInfoActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicInfoActivity\n*L\n42#1:234,2\n55#1:236,13\n*E\n"})
public final class TopicInfoActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f25916OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f25918OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public TextView f25919OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TopicInfoModel f25920OooOo00;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25917OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(ooooO000.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25921OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicManagerVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicInfoActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicInfoActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicInfoActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25929OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25929OooO0Oo;
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
    public final ArrayList f25922OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f25924OooOoO0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f25923OooOoO = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o extends Lambda implements Function0<oo0o0Oo> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo0o0Oo invoke() {
            int i = p562o0oOo000.oo0o0Oo.item_member_list_topic;
            final TopicInfoActivity topicInfoActivity = TopicInfoActivity.this;
            final oo0o0Oo oo0o0oo = new oo0o0Oo(topicInfoActivity, i);
            oo0o0oo.Oooo000(p562o0oOo000.o000000.no_data);
            String loadEndHint = o0000.OooO0OO(p562o0oOo000.o000000.topic_info_Display_up_to_200_users);
            p559o0oOo.o00Oo0 o00oo1 = oo0o0oo.f56426OooOoOO;
            if (o00oo1 != null) {
                Intrinsics.checkNotNullParameter(loadEndHint, "loadEndHint");
                o00oo1.f56231OooO0Oo = loadEndHint;
            }
            oo0o0oo.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_delete);
            oo0o0oo.Oooo0OO(new o0O0O00(topicInfoActivity));
            oo0o0oo.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o00OO0.ooo0o
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                    TopicInfoActivity this$0 = topicInfoActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    oo0o0Oo this_apply = oo0o0oo;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this$0, String.valueOf(((UserInfo) this_apply.f13189OooOOoo.get(i2)).getUserId()), false, 12);
                }
            };
            oO0OO00 oo0oo00 = new oO0OO00(topicInfoActivity);
            int i2 = TopicInfoActivity.f25916OooOoOO;
            oo0o0oo.OooOoO(oo0oo00, ((ooooO000) topicInfoActivity.f25917OooOOoo.getValue()).f45347OooO0O0);
            return oo0o0oo;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<TopicInfoHeadView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TopicInfoHeadView invoke() {
            return new TopicInfoHeadView(TopicInfoActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOo(TopicInfoActivity topicInfoActivity, boolean z) {
        TopicManagerVM topicManagerVM = (TopicManagerVM) topicInfoActivity.f25921OooOo0O.getValue();
        TopicInfoModel topicInfoModel = topicInfoActivity.f25920OooOo00;
        if (topicInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel = null;
        }
        topicManagerVM.circleMemberList(String.valueOf(topicInfoModel.getId()), z).observe(topicInfoActivity, new p384o0OOoo0O.o000oOoO(new ooOOO0Oo(topicInfoActivity, z), null, new ooOOO00O(topicInfoActivity, z), false, 10));
    }

    public final TopicInfoHeadView OooOoO() {
        return (TopicInfoHeadView) this.f25923OooOoO.getValue();
    }

    public final o0000oo<UserInfo> OooOoO0() {
        return (o0000oo) this.f25924OooOoO0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TopicInfoModel topicInfoModel;
        TextView textView;
        super.onCreate(bundle);
        o000O0 o000o0 = this.f25917OooOOoo;
        setContentView(((ooooO000) o000o0.getValue()).f45346OooO00o);
        TopicInfoModel topicInfoModel2 = null;
        if (getIntent().hasExtra("info")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("info");
            if (serializableExtra instanceof TopicInfoModel) {
                topicInfoModel = (TopicInfoModel) serializableExtra;
            } else {
                topicInfoModel = null;
            }
        } else {
            topicInfoModel = null;
        }
        if (topicInfoModel == null || topicInfoModel.getId() <= 0) {
            finish();
        } else {
            this.f25920OooOo00 = topicInfoModel;
        }
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.Topic_Profile);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        TextView textViewOooOoO0 = headerLayout2 != null ? headerLayout2.OooOoO0(p562o0oOo000.o000000.room_profile_settings, new oOo0oooO(this)) : null;
        this.f25919OooOo0 = textViewOooOoO0;
        if (textViewOooOoO0 != null) {
            o000O.OooO0O0(textViewOooOoO0);
        }
        TopicInfoModel topicInfoModel3 = this.f25920OooOo00;
        if (topicInfoModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel3 = null;
        }
        if (topicInfoModel3.isOwner() && (textView = this.f25919OooOo0) != null) {
            o000O.OooOOOO(textView);
        }
        ((ooooO000) o000o0.getValue()).f45347OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        ((ooooO000) o000o0.getValue()).f45347OooO0O0.setAdapter(OooOoO0());
        OooOoO0().OooOo(OooOoO());
        TopicInfoHeadView topicInfoHeadViewOooOoO = OooOoO();
        TopicInfoModel topicInfoModel4 = this.f25920OooOo00;
        if (topicInfoModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel4 = null;
        }
        topicInfoHeadViewOooOoO.setTopicInfo(topicInfoModel4);
        this.f25922OooOo0o.clear();
        ViewModelLazy viewModelLazy = this.f25921OooOo0O;
        TopicManagerVM topicManagerVM = (TopicManagerVM) viewModelLazy.getValue();
        TopicInfoModel topicInfoModel5 = this.f25920OooOo00;
        if (topicInfoModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
        } else {
            topicInfoModel2 = topicInfoModel5;
        }
        topicManagerVM.circleAdmin(String.valueOf(topicInfoModel2.getId())).observe(this, new p384o0OOoo0O.o000oOoO(new oO0O0Oo0(this), null, new oOo0o0oO(this), false, 10));
        int i = 1;
        LiveEventBus.get("TOPIC_HEADER", String.class).observe(this, new p491o0o00O0o.o000O(this, i));
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new o00000O0(this, i));
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new o00000O(this, i));
        LiveEventBus.get("TOPIC_MANAGER_ADD", UserInfo.class).observe(this, new o00000OO(this, i));
        LiveEventBus.get("TOPIC_MANAGER_DEL", String.class).observe(this, new o0000Ooo(this, 2));
        ((TopicManagerVM) viewModelLazy.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicManagerVM) this.f25921OooOo0O.getValue()).statisticalTime();
    }
}
