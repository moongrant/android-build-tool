package com.yalla.yalla.ui.activity.moment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p485o0o00O0.o;
import p485o0o00O0.oO00000;
import p485o0o00O0.oO00000o;
import p485o0o00O0.oO0000O;
import p485o0o00O0.oO0000o0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.b6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicCreateActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,168:1\n22#2,2:169\n75#3,13:171\n*S KotlinDebug\n*F\n+ 1 TopicCreateActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateActivity\n*L\n28#1:169,2\n36#1:171,13\n*E\n"})
public final class TopicCreateActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26287OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26288OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(b6.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26290OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26293OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26293OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public String f26289OooOo0 = "";

    public final b6 OooOo() {
        return (b6) this.f26288OooOOoo.getValue();
    }

    public final void OooOoO0() {
        CharSequence text = OooOo().f57587OooO0OO.f58954OooO0Oo.getText();
        boolean z = false;
        boolean z2 = !(text == null || StringsKt.isBlank(text));
        boolean z3 = !StringsKt.isBlank(this.f26289OooOo0);
        Button button = OooOo().f57586OooO0O0;
        if (z3 && z2) {
            z = true;
        }
        button.setEnabled(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int id = view.getId();
        if (id == oO00O0oO.nivTopicHeader) {
            OooOo().f57587OooO0OO.f58952OooO0O0.setEnabled(false);
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32883OooO0o, new oO0000O(this), new oO0000o0(this));
            return;
        }
        if (id == oO00O0oO.vName) {
            String topicName = OooOo().f57587OooO0OO.f58954OooO0Oo.getText().toString();
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(topicName, "topicName");
            Intent intent = new Intent(this, (Class<?>) TopicCreateNameActivity.class);
            intent.putExtra("name", topicName);
            startActivity(intent);
            return;
        }
        if (id == oO00O0oO.vIntroduction) {
            String desc = OooOo().f57587OooO0OO.f58953OooO0OO.getText().toString();
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(desc, "desc");
            Intent intent2 = new Intent(this, (Class<?>) TopicEditDescActivity.class);
            intent2.putExtra("desc", desc);
            intent2.putExtra("edit_topic_id", 0L);
            startActivity(intent2);
            return;
        }
        if (id == oO00O0oO.btSubmit) {
            o0OO000.OooO00o("103032");
            String string = OooOo().f57587OooO0OO.f58954OooO0Oo.getText().toString();
            String string2 = OooOo().f57587OooO0OO.f58953OooO0OO.getText().toString();
            if (StringsKt.isBlank(this.f26289OooOo0) || StringsKt.isBlank(string)) {
                return;
            }
            ((TopicEditVM) this.f26290OooOo00.getValue()).createTopic(this.f26289OooOo0, string, string2).observe(this, new o(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57585OooO00o);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.Create_Topic);
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
        int i = oOo00OO0.ic_header_placeholder_color;
        oooO00o.f43915OooO0oO = i;
        oooO00o.f43909OooO00o = 1;
        oooO00o.OooO0o0(6);
        oooO00o.f43923OooOOOo = i;
        oooO00o.OooO0Oo(OooOo().f57587OooO0OO.f58952OooO0O0);
        OooOo().f57587OooO0OO.f58952OooO0O0.setOnClickListener(this);
        OooOo().f57587OooO0OO.f58957OooO0oO.setOnClickListener(this);
        OooOo().f57587OooO0OO.f58956OooO0o0.setOnClickListener(this);
        OooOo().f57586OooO0O0.setOnClickListener(this);
        OooOoO0();
        LiveEventBus.get("TOPIC_NAME", String.class).observe(this, new oO00000(this));
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new oO00000o(this));
        ((TopicEditVM) this.f26290OooOo00.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicEditVM) this.f26290OooOo00.getValue()).statisticalTime();
    }
}
