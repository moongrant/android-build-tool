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
import com.code.android.util.o000O0;
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
import p405o0Oo0OOO.oOO0O00O;
import p491o0o00O0o.o0O00000;
import p491o0o00O0o.o0oO0Ooo;
import p492o0o00OO0.oOOO000o;
import p492o0o00OO0.ooooO0O0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicSettingActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSettingActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n22#2,2:160\n75#3,13:162\n1#4:175\n*S KotlinDebug\n*F\n+ 1 TopicSettingActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSettingActivity\n*L\n29#1:160,2\n42#1:162,13\n*E\n"})
public final class TopicSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f25963OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25964OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOO0O00O.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25965OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSettingActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25969OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25969OooO0Oo;
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
    public TopicInfoModel f25966OooOo00;

    public final oOO0O00O OooOo() {
        return (oOO0O00O) this.f25964OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        TopicInfoModel topicInfoModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int id = view.getId();
        if (id == p562o0oOo000.o0OO00O.bgTopicHeader || id == p562o0oOo000.o0OO00O.vTopicHeader) {
            OooOo().f45091OooOO0o.setEnabled(false);
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32339OooO0o, new ooooO0O0(this), new oOOO000o(this));
            return;
        }
        if (id == p562o0oOo000.o0OO00O.bgTopicDesc || id == p562o0oOo000.o0OO00O.vTopicDesc) {
            TopicInfoModel topicInfoModel2 = this.f25966OooOo00;
            if (topicInfoModel2 != null) {
                String desc = OooOo().f45087OooO0oO.getText().toString();
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
        if (id == p562o0oOo000.o0OO00O.bgTopicRule || id == p562o0oOo000.o0OO00O.vTopicRule) {
            TopicInfoModel topicInfoModel3 = this.f25966OooOo00;
            if (topicInfoModel3 != null) {
                String rule = OooOo().f45080OooO.getText().toString();
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
        if (id != p562o0oOo000.o0OO00O.vTopicManager) {
            if (id != p562o0oOo000.o0OO00O.vTopicBlackList || (topicInfoModel = this.f25966OooOo00) == null) {
                return;
            }
            long id4 = topicInfoModel.getId();
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent3 = new Intent(this, (Class<?>) TopicBlackListActivity.class);
            intent3.putExtra("ID", id4);
            startActivity(intent3);
            return;
        }
        TopicInfoModel topicInfoModel4 = this.f25966OooOo00;
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
        setContentView(OooOo().f45081OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("info");
        this.f25966OooOo00 = serializableExtra instanceof TopicInfoModel ? (TopicInfoModel) serializableExtra : null;
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.setting);
        }
        TextView textView = OooOo().f45088OooO0oo;
        TopicInfoModel topicInfoModel = this.f25966OooOo00;
        textView.setText(topicInfoModel != null ? topicInfoModel.getName() : null);
        TextView textView2 = OooOo().f45087OooO0oO;
        TopicInfoModel topicInfoModel2 = this.f25966OooOo00;
        textView2.setText(topicInfoModel2 != null ? topicInfoModel2.getDescribe() : null);
        TextView textView3 = OooOo().f45080OooO;
        TopicInfoModel topicInfoModel3 = this.f25966OooOo00;
        textView3.setText(topicInfoModel3 != null ? topicInfoModel3.getRule() : null);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
        TopicInfoModel topicInfoModel4 = this.f25966OooOo00;
        oooO00o.f43126OooO0OO = topicInfoModel4 != null ? topicInfoModel4.getImage() : null;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0oO());
        oooO00o.OooO0o0(4);
        oooO00o.OooO0Oo(OooOo().f45085OooO0o);
        OooOo().f45083OooO0OO.setOnClickListener(this);
        OooOo().f45091OooOO0o.setOnClickListener(this);
        OooOo().f45090OooOO0O.setOnClickListener(this);
        OooOo().f45082OooO0O0.setOnClickListener(this);
        OooOo().f45092OooOOO.setOnClickListener(this);
        OooOo().f45086OooO0o0.setOnClickListener(this);
        OooOo().f45093OooOOO0.setOnClickListener(this);
        OooOo().f45089OooOO0.setOnClickListener(this);
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new o0O00000(this, 1));
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new o0oO0Ooo(this, 1));
        ((TopicEditVM) this.f25965OooOo0.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicEditVM) this.f25965OooOo0.getValue()).statisticalTime();
    }
}
