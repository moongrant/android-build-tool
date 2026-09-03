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
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p144o00OOooo.o00OO00O;
import p177o00OoooO.oO00o00O;
import p255o00ooO0O.o00O000o;
import p393o0OOooOo.o0O00000;
import p526o0o0O0oO.oo00oO;
import p540o0o0Oo0.o0O00OOO;
import p540o0o0Oo0.o0O00o00;
import p618o0oo0Ooo.oO0O000o;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;
import p651o0ooOOoo.vc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicCreateActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final /* synthetic */ int f22568Oooooo0 = 0;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22569OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(vc.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22570OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22574Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22574Oooo;
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
    public String f22571OooooOo = "";

    public final vc OooOoo() {
        return (vc) this.f22569OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicEditVM OooOooO() {
        return (TopicEditVM) this.f22570OooooOO.getValue();
    }

    public final void OooOooo() {
        CharSequence text = OooOoo().f50826OooO0OO.f50908OooO0Oo.getText();
        boolean z = false;
        boolean z2 = !(text == null || StringsKt.isBlank(text));
        boolean z3 = !StringsKt.isBlank(this.f22571OooooOo);
        Button button = OooOoo().f50825OooO0O0;
        if (z3 && z2) {
            z = true;
        }
        button.setEnabled(z);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        switch (view.getId()) {
            case R.id.btSubmit /* 2131296527 */:
                o0O00000.OooO0OO("Moments_topics_CreateSubmit");
                String string = OooOoo().f50826OooO0OO.f50908OooO0Oo.getText().toString();
                String string2 = OooOoo().f50826OooO0OO.f50907OooO0OO.getText().toString();
                if (!StringsKt.isBlank(this.f22571OooooOo) && !StringsKt.isBlank(string)) {
                    OooOooO().createTopic(this.f22571OooooOo, string, string2).observe(this, new o00OO00O(this, 4));
                    break;
                }
                break;
            case R.id.nivTopicHeader /* 2131298650 */:
                OooOoo().f50826OooO0OO.f50906OooO0O0.setEnabled(false);
                o0O0O00.OooO0OO(this, oo0o0Oo.f48624OooO0O0, new o0O00OOO(this), new o0O00o00(this));
                break;
            case R.id.vIntroduction /* 2131300160 */:
                String desc = OooOoo().f50826OooO0OO.f50907OooO0OO.getText().toString();
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter(desc, "desc");
                Intent intent = new Intent(this, (Class<?>) TopicEditDescActivity.class);
                intent.putExtra("desc", desc);
                intent.putExtra("edit_topic_id", 0L);
                startActivity(intent);
                break;
            case R.id.vName /* 2131300173 */:
                String topicName = OooOoo().f50826OooO0OO.f50908OooO0Oo.getText().toString();
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter(topicName, "topicName");
                Intent intent2 = new Intent(this, (Class<?>) TopicCreateNameActivity.class);
                intent2.putExtra("name", topicName);
                startActivity(intent2);
                break;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50824OooO00o);
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Create_Topic);
        }
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this);
        oooO00o.f48451OooO0oO = R.drawable.ic_header_placeholder_color;
        oooO00o.f48445OooO00o = 1;
        oooO00o.OooO0oO(6);
        oooO00o.f48459OooOOOo = R.drawable.ic_header_placeholder_color;
        oooO00o.OooO0o(OooOoo().f50826OooO0OO.f50906OooO0O0);
        OooOoo().f50826OooO0OO.f50906OooO0O0.setOnClickListener(this);
        OooOoo().f50826OooO0OO.f50911OooO0oO.setOnClickListener(this);
        OooOoo().f50826OooO0OO.f50910OooO0o0.setOnClickListener(this);
        OooOoo().f50825OooO0O0.setOnClickListener(this);
        OooOooo();
        LiveEventBus.get("TOPIC_NAME", String.class).observe(this, new oo00oO(this, 2));
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new oO00o00O(this, 3));
        OooOooO().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOooO().statisticalTime();
    }
}
