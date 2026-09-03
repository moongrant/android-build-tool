package com.yalla.yalla.ui.activity.moment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p485o0o00O0.e;
import p485o0o00O0.g;
import p485o0o00O0.h;
import p485o0o00O0.i;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.k6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicSettingActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSettingActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n22#2,2:160\n75#3,13:162\n1#4:175\n*S KotlinDebug\n*F\n+ 1 TopicSettingActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSettingActivity\n*L\n29#1:160,2\n42#1:162,13\n*E\n"})
public final class TopicSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26415OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26416OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(k6.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26417OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSettingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSettingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSettingActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26421OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26421OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f26418OooOo00;

    public final k6 OooOo() {
        return (k6) this.f26416OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        TopicInfoModel topicInfoModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int id = view.getId();
        if (id == oO00O0oO.bgTopicHeader || id == oO00O0oO.vTopicHeader) {
            OooOo().f58276OooOO0o.setEnabled(false);
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32883OooO0o, new e(this), new g(this));
            return;
        }
        if (id == oO00O0oO.bgTopicDesc || id == oO00O0oO.vTopicDesc) {
            TopicInfoModel topicInfoModel2 = this.f26418OooOo00;
            if (topicInfoModel2 != null) {
                String desc = OooOo().f58272OooO0oO.getText().toString();
                long id2 = topicInfoModel2.getId();
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter(desc, "desc");
                Intent intent = new Intent(this, (Class<?>) TopicEditDescActivity.class);
                intent.putExtra("desc", desc);
                intent.putExtra("edit_topic_id", id2);
                startActivity(intent);
                return;
            }
            return;
        }
        if (id == oO00O0oO.bgTopicRule || id == oO00O0oO.vTopicRule) {
            TopicInfoModel topicInfoModel3 = this.f26418OooOo00;
            if (topicInfoModel3 != null) {
                String rule = OooOo().f58265OooO.getText().toString();
                long id3 = topicInfoModel3.getId();
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter(rule, "rule");
                Intent intent2 = new Intent(this, (Class<?>) TopicEditRuleActivity.class);
                intent2.putExtra("rule", rule);
                intent2.putExtra("edit_topic_id", id3);
                startActivity(intent2);
                return;
            }
            return;
        }
        if (id != oO00O0oO.vTopicManager) {
            if (id != oO00O0oO.vTopicBlackList || (topicInfoModel = this.f26418OooOo00) == null) {
                return;
            }
            long id4 = topicInfoModel.getId();
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent3 = new Intent(this, (Class<?>) TopicBlackListActivity.class);
            intent3.putExtra("ID", id4);
            startActivity(intent3);
            return;
        }
        TopicInfoModel topicInfoModel4 = this.f26418OooOo00;
        if (topicInfoModel4 != null) {
            long id5 = topicInfoModel4.getId();
            int maxAdminCount = topicInfoModel4.getMaxAdminCount();
            Intrinsics.checkNotNullParameter(this, "context");
            ArrayList arrayList = new ArrayList();
            Intent intent4 = new Intent(this, (Class<?>) TopicManagerActivity.class);
            intent4.putExtra("TopicId", id5);
            intent4.putExtra("Max_Admin_Count", maxAdminCount);
            intent4.putExtra("User_List", arrayList);
            startActivity(intent4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58266OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("info");
        this.f26418OooOo00 = serializableExtra instanceof TopicInfoModel ? (TopicInfoModel) serializableExtra : null;
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.setting);
        }
        TextView textView = OooOo().f58273OooO0oo;
        TopicInfoModel topicInfoModel = this.f26418OooOo00;
        textView.setText(topicInfoModel != null ? topicInfoModel.getName() : null);
        TextView textView2 = OooOo().f58272OooO0oO;
        TopicInfoModel topicInfoModel2 = this.f26418OooOo00;
        textView2.setText(topicInfoModel2 != null ? topicInfoModel2.getDescribe() : null);
        TextView textView3 = OooOo().f58265OooO;
        TopicInfoModel topicInfoModel3 = this.f26418OooOo00;
        textView3.setText(topicInfoModel3 != null ? topicInfoModel3.getRule() : null);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
        TopicInfoModel topicInfoModel4 = this.f26418OooOo00;
        oooO00o.f43911OooO0OO = topicInfoModel4 != null ? topicInfoModel4.getImage() : null;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0oO());
        oooO00o.OooO0o0(4);
        oooO00o.OooO0Oo(OooOo().f58270OooO0o);
        OooOo().f58268OooO0OO.setOnClickListener(this);
        OooOo().f58276OooOO0o.setOnClickListener(this);
        OooOo().f58275OooOO0O.setOnClickListener(this);
        OooOo().f58267OooO0O0.setOnClickListener(this);
        OooOo().f58277OooOOO.setOnClickListener(this);
        OooOo().f58271OooO0o0.setOnClickListener(this);
        OooOo().f58278OooOOO0.setOnClickListener(this);
        OooOo().f58274OooOO0.setOnClickListener(this);
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new h(this));
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new i(this));
        ((TopicEditVM) this.f26417OooOo0.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicEditVM) this.f26417OooOo0.getValue()).statisticalTime();
    }
}
