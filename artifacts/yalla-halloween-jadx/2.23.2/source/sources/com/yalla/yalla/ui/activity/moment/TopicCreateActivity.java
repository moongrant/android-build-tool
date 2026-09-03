package com.yalla.yalla.ui.activity.moment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
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
import p405o0Oo0OOO.oOO0000;
import p492o0o00OO0.o0o0000;
import p492o0o00OO0.oO0Oo;
import p492o0o00OO0.ooo0Oo0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicCreateActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,168:1\n22#2,2:169\n75#3,13:171\n*S KotlinDebug\n*F\n+ 1 TopicCreateActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateActivity\n*L\n28#1:169,2\n36#1:171,13\n*E\n"})
public final class TopicCreateActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f25836OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25837OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOO0000.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25839OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25842OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25842OooO0Oo;
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
    public String f25838OooOo0 = "";

    public final oOO0000 OooOo() {
        return (oOO0000) this.f25837OooOOoo.getValue();
    }

    public final void OooOoO0() {
        CharSequence text = OooOo().f45027OooO0OO.f45004OooO0Oo.getText();
        boolean z = false;
        boolean z2 = !(text == null || StringsKt.isBlank(text));
        boolean z3 = !StringsKt.isBlank(this.f25838OooOo0);
        Button button = OooOo().f45026OooO0O0;
        if (z3 && z2) {
            z = true;
        }
        button.setEnabled(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int id = view.getId();
        if (id == p562o0oOo000.o0OO00O.nivTopicHeader) {
            OooOo().f45027OooO0OO.f45002OooO0O0.setEnabled(false);
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32339OooO0o, new oO0Oo(this), new ooo0Oo0(this));
            return;
        }
        if (id == p562o0oOo000.o0OO00O.vName) {
            String topicName = OooOo().f45027OooO0OO.f45004OooO0Oo.getText().toString();
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(topicName, "topicName");
            Intent intent = new Intent(this, (Class<?>) TopicCreateNameActivity.class);
            intent.putExtra("name", topicName);
            startActivity(intent);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.vIntroduction) {
            String desc = OooOo().f45027OooO0OO.f45003OooO0OO.getText().toString();
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(desc, "desc");
            Intent intent2 = new Intent(this, (Class<?>) TopicEditDescActivity.class);
            intent2.putExtra("desc", desc);
            intent2.putExtra("edit_topic_id", 0L);
            startActivity(intent2);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.btSubmit) {
            o0oo0000.OooO00o.OooO0O0("103032");
            String string = OooOo().f45027OooO0OO.f45004OooO0Oo.getText().toString();
            String string2 = OooOo().f45027OooO0OO.f45003OooO0OO.getText().toString();
            if (StringsKt.isBlank(this.f25838OooOo0) || StringsKt.isBlank(string)) {
                return;
            }
            ((TopicEditVM) this.f25839OooOo00.getValue()).createTopic(this.f25838OooOo0, string, string2).observe(this, new o0o0000(this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45025OooO00o);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.Create_Topic);
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
        int i = p562o0oOo000.o0Oo0oo.ic_header_placeholder_color;
        oooO00o.f43130OooO0oO = i;
        oooO00o.f43124OooO00o = 1;
        oooO00o.OooO0o0(6);
        oooO00o.f43138OooOOOo = i;
        oooO00o.OooO0Oo(OooOo().f45027OooO0OO.f45002OooO0O0);
        OooOo().f45027OooO0OO.f45002OooO0O0.setOnClickListener(this);
        OooOo().f45027OooO0OO.f45007OooO0oO.setOnClickListener(this);
        OooOo().f45027OooO0OO.f45006OooO0o0.setOnClickListener(this);
        OooOo().f45026OooO0O0.setOnClickListener(this);
        OooOoO0();
        LiveEventBus.get("TOPIC_NAME", String.class).observe(this, new Observer() { // from class: o0o00OO0.o0OOOO00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String it = (String) obj;
                int i2 = TopicCreateActivity.f25836OooOo0O;
                TopicCreateActivity this$0 = this.f49328OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.OooOo().f45027OooO0OO.f45004OooO0Oo.setText(it);
                if (!StringsKt.isBlank(it)) {
                    this$0.OooOo().f45027OooO0OO.f45004OooO0Oo.setHint("");
                } else {
                    this$0.OooOo().f45027OooO0OO.f45004OooO0Oo.setHint(o000000.Name_your_topic);
                }
                this$0.OooOoO0();
            }
        });
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new Observer() { // from class: o0o00OO0.o0OOOO0o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String it = (String) obj;
                int i2 = TopicCreateActivity.f25836OooOo0O;
                TopicCreateActivity this$0 = this.f49329OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.OooOo().f45027OooO0OO.f45003OooO0OO.setText(it);
                if (!StringsKt.isBlank(it)) {
                    this$0.OooOo().f45027OooO0OO.f45003OooO0OO.setHint("");
                } else {
                    this$0.OooOo().f45027OooO0OO.f45003OooO0OO.setHint(o000000.create_topic_description_hint);
                }
            }
        });
        ((TopicEditVM) this.f25839OooOo00.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicEditVM) this.f25839OooOo00.getValue()).statisticalTime();
    }
}
