package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
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
import p022Oooo00O.o00O000o;
import p377o0OOoOo.o0000OO0;
import p485o0o00O0.oOO0;
import p485o0o00O0.oOO00;
import p485o0o00O0.oOO000o;
import p485o0o00O0.oOO00O0;
import p485o0o00O0.oOO00OO;
import p485o0o00O0.oOO0O0;
import p485o0o00O0.oOO0O000;
import p485o0o00O0.oOO0O00O;
import p485o0o00O0.oOO0O0O;
import p485o0o00O0.oOO0O0O0;
import p485o0o00O0.ooooO000;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.h6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicInfoActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicInfoActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicInfoActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,233:1\n22#2,2:234\n75#3,13:236\n*S KotlinDebug\n*F\n+ 1 TopicInfoActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicInfoActivity\n*L\n42#1:234,2\n55#1:236,13\n*E\n"})
public final class TopicInfoActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26367OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f26369OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public TextView f26370OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TopicInfoModel f26371OooOo00;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26368OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(h6.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26372OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicManagerVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicInfoActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26380OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26380OooO0Oo;
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
    public final ArrayList f26373OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f26375OooOoO0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f26374OooOoO = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o extends Lambda implements Function0<oo0o0Oo> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo0o0Oo invoke() {
            int i = oO00OO0O.item_member_list_topic;
            TopicInfoActivity topicInfoActivity = TopicInfoActivity.this;
            oo0o0Oo oo0o0oo = new oo0o0Oo(topicInfoActivity, i);
            oo0o0oo.Oooo000(oO00OOo0.no_data);
            String loadEndHint = o0000.OooO0OO(oO00OOo0.topic_info_Display_up_to_200_users);
            p562o0oOo0O.o0OoOo0 o0oooo0 = oo0o0oo.f56199OooOoOO;
            if (o0oooo0 != null) {
                Intrinsics.checkNotNullParameter(loadEndHint, "loadEndHint");
                o0oooo0.f56194OooO0Oo = loadEndHint;
            }
            oo0o0oo.OooOooo(oOo00OO0.ic_empty_delete);
            oo0o0oo.Oooo0OO(new o0O0O00(topicInfoActivity));
            oo0o0oo.f10098OooO0o = new oOO0O0O(topicInfoActivity, oo0o0oo, 0);
            o00O000o o00o000o2 = new o00O000o(topicInfoActivity);
            int i2 = TopicInfoActivity.f26367OooOoOO;
            oo0o0oo.OooOoO(o00o000o2, ((h6) topicInfoActivity.f26368OooOOoo.getValue()).f58038OooO0O0);
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
        TopicManagerVM topicManagerVM = (TopicManagerVM) topicInfoActivity.f26372OooOo0O.getValue();
        TopicInfoModel topicInfoModel = topicInfoActivity.f26371OooOo00;
        if (topicInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel = null;
        }
        topicManagerVM.circleMemberList(String.valueOf(topicInfoModel.getId()), z).observe(topicInfoActivity, new o0000OO0(new oOO0O0(topicInfoActivity, z), null, new oOO0O0O0(topicInfoActivity, z), false, 10));
    }

    public final TopicInfoHeadView OooOoO() {
        return (TopicInfoHeadView) this.f26374OooOoO.getValue();
    }

    public final o000O<UserInfo> OooOoO0() {
        return (o000O) this.f26375OooOoO0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TopicInfoModel topicInfoModel;
        TextView textView;
        super.onCreate(bundle);
        o000O0Oo o000o0oo2 = this.f26368OooOOoo;
        setContentView(((h6) o000o0oo2.getValue()).f58037OooO00o);
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
            this.f26371OooOo00 = topicInfoModel;
        }
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.Topic_Profile);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        TextView textViewOooOoO0 = headerLayout2 != null ? headerLayout2.OooOoO0(oO00OOo0.room_profile_settings, new oOO0(this)) : null;
        this.f26370OooOo0 = textViewOooOoO0;
        if (textViewOooOoO0 != null) {
            o000OO00.OooO0O0(textViewOooOoO0);
        }
        TopicInfoModel topicInfoModel3 = this.f26371OooOo00;
        if (topicInfoModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel3 = null;
        }
        if (topicInfoModel3.isOwner() && (textView = this.f26370OooOo0) != null) {
            o000OO00.OooOOOO(textView);
        }
        ((h6) o000o0oo2.getValue()).f58038OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        ((h6) o000o0oo2.getValue()).f58038OooO0O0.setAdapter(OooOoO0());
        OooOoO0().OooOo(OooOoO());
        TopicInfoHeadView topicInfoHeadViewOooOoO = OooOoO();
        TopicInfoModel topicInfoModel4 = this.f26371OooOo00;
        if (topicInfoModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel4 = null;
        }
        topicInfoHeadViewOooOoO.setTopicInfo(topicInfoModel4);
        this.f26373OooOo0o.clear();
        ViewModelLazy viewModelLazy = this.f26372OooOo0O;
        TopicManagerVM topicManagerVM = (TopicManagerVM) viewModelLazy.getValue();
        TopicInfoModel topicInfoModel5 = this.f26371OooOo00;
        if (topicInfoModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
        } else {
            topicInfoModel2 = topicInfoModel5;
        }
        topicManagerVM.circleAdmin(String.valueOf(topicInfoModel2.getId())).observe(this, new o0000OO0(new oOO0O000(this), null, new oOO0O00O(this), false, 10));
        LiveEventBus.get("TOPIC_HEADER", String.class).observe(this, new oOO000o(this));
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new oOO00(this));
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new oOO00O0(this));
        LiveEventBus.get("TOPIC_MANAGER_ADD", UserInfo.class).observe(this, new oOO00OO(this));
        LiveEventBus.get("TOPIC_MANAGER_DEL", String.class).observe(this, new ooooO000(this));
        ((TopicManagerVM) viewModelLazy.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicManagerVM) this.f26372OooOo0O.getValue()).statisticalTime();
    }
}
