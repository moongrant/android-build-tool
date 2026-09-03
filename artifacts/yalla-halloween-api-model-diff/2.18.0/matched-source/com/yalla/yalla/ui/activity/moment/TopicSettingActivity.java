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
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o000O000;
import p143o00OOooO.o000Oo0;
import p255o00ooO0O.o00O000o;
import p540o0o0Oo0.oO000O0O;
import p540o0o0Oo0.oO0o0o;
import p618o0oo0Ooo.oO0O000o;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;
import p651o0ooOOoo.ed;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22685Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f22687OooooOO;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22686OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(ed.class), this, null);

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22688OooooOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSettingActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22691Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22691Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
    }

    public final ed OooOoo() {
        return (ed) this.f22686OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicEditVM OooOooO() {
        return (TopicEditVM) this.f22688OooooOo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        switch (view.getId()) {
            case R.id.bgTopicDesc /* 2131296477 */:
            case R.id.vTopicDesc /* 2131300193 */:
                TopicInfoModel topicInfoModel = this.f22687OooooOO;
                if (topicInfoModel != null) {
                    String desc = OooOoo().f49307OooO0oO.getText().toString();
                    long id = topicInfoModel.getId();
                    Intrinsics.checkNotNullParameter(this, "context");
                    Intrinsics.checkNotNullParameter(desc, "desc");
                    Intent intent = new Intent(this, (Class<?>) TopicEditDescActivity.class);
                    intent.putExtra("desc", desc);
                    intent.putExtra("edit_topic_id", id);
                    startActivity(intent);
                }
                break;
            case R.id.bgTopicHeader /* 2131296478 */:
            case R.id.vTopicHeader /* 2131300194 */:
                OooOoo().f49311OooOO0o.setEnabled(false);
                o0O0O00.OooO0OO(this, oo0o0Oo.f48624OooO0O0, new oO000O0O(this), new oO0o0o(this));
                break;
            case R.id.bgTopicRule /* 2131296480 */:
            case R.id.vTopicRule /* 2131300197 */:
                TopicInfoModel topicInfoModel2 = this.f22687OooooOO;
                if (topicInfoModel2 != null) {
                    String rule = OooOoo().f49300OooO.getText().toString();
                    long id2 = topicInfoModel2.getId();
                    Intrinsics.checkNotNullParameter(this, "context");
                    Intrinsics.checkNotNullParameter(rule, "rule");
                    Intent intent2 = new Intent(this, (Class<?>) TopicEditRuleActivity.class);
                    intent2.putExtra("rule", rule);
                    intent2.putExtra("edit_topic_id", id2);
                    startActivity(intent2);
                }
                break;
            case R.id.vTopicBlackList /* 2131300192 */:
                TopicInfoModel topicInfoModel3 = this.f22687OooooOO;
                if (topicInfoModel3 != null) {
                    long id3 = topicInfoModel3.getId();
                    Intrinsics.checkNotNullParameter(this, "context");
                    Intent intent3 = new Intent(this, (Class<?>) TopicBlackListActivity.class);
                    intent3.putExtra("ID", id3);
                    startActivity(intent3);
                }
                break;
            case R.id.vTopicManager /* 2131300195 */:
                TopicInfoModel topicInfoModel4 = this.f22687OooooOO;
                if (topicInfoModel4 != null) {
                    long id4 = topicInfoModel4.getId();
                    int maxAdminCount = topicInfoModel4.getMaxAdminCount();
                    Intrinsics.checkNotNullParameter(this, "context");
                    ArrayList arrayList = new ArrayList();
                    Intent intent4 = new Intent(this, (Class<?>) TopicManagerActivity.class);
                    intent4.putExtra("TopicId", id4);
                    intent4.putExtra("Max_Admin_Count", maxAdminCount);
                    intent4.putExtra("User_List", arrayList);
                    startActivity(intent4);
                }
                break;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49301OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("info");
        this.f22687OooooOO = serializableExtra instanceof TopicInfoModel ? (TopicInfoModel) serializableExtra : null;
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.setting);
        }
        TextView textView = OooOoo().f49308OooO0oo;
        TopicInfoModel topicInfoModel = this.f22687OooooOO;
        textView.setText(topicInfoModel != null ? topicInfoModel.getName() : null);
        TextView textView2 = OooOoo().f49307OooO0oO;
        TopicInfoModel topicInfoModel2 = this.f22687OooooOO;
        textView2.setText(topicInfoModel2 != null ? topicInfoModel2.getDescribe() : null);
        TextView textView3 = OooOoo().f49300OooO;
        TopicInfoModel topicInfoModel3 = this.f22687OooooOO;
        textView3.setText(topicInfoModel3 != null ? topicInfoModel3.getRule() : null);
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this);
        TopicInfoModel topicInfoModel4 = this.f22687OooooOO;
        oooO00o.f48447OooO0OO = topicInfoModel4 != null ? topicInfoModel4.getImage() : null;
        oooO00o.f48445OooO00o = 0;
        oooO00o.OooO00o(o00OOO.OooO00o.OooO());
        oooO00o.OooO0oO(4);
        oooO00o.OooO0o(OooOoo().f49305OooO0o);
        OooOoo().f49303OooO0OO.setOnClickListener(this);
        OooOoo().f49311OooOO0o.setOnClickListener(this);
        OooOoo().f49310OooOO0O.setOnClickListener(this);
        OooOoo().f49302OooO0O0.setOnClickListener(this);
        OooOoo().f49312OooOOO.setOnClickListener(this);
        OooOoo().f49306OooO0o0.setOnClickListener(this);
        OooOoo().f49313OooOOO0.setOnClickListener(this);
        OooOoo().f49309OooOO0.setOnClickListener(this);
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new o000Oo0(this, 6));
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new o000O000(this, 3));
        OooOooO().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOooO().statisticalTime();
    }
}
