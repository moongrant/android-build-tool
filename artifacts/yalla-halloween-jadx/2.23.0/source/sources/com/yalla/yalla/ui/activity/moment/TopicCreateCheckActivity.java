package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o000O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.c6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateCheckActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicCreateCheckActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicCreateCheckActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateCheckActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,72:1\n22#2,2:73\n75#3,13:75\n*S KotlinDebug\n*F\n+ 1 TopicCreateCheckActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateCheckActivity\n*L\n19#1:73,2\n20#1:75,13\n*E\n"})
public final class TopicCreateCheckActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f26295OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26296OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(c6.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26297OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26300OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26300OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) TopicCreateCheckActivity.class);
            intent.putExtra("level", bool);
            intent.putExtra("time", bool2);
            intent.putExtra("law", bool3);
            context.startActivity(intent);
        }
    }

    public final c6 OooOo() {
        return (c6) this.f26296OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == oO00O0oO.btCreateTopic) {
            o0OO000.OooO00o("103031");
            Intrinsics.checkNotNullParameter(this, "context");
            startActivity(new Intent(this, (Class<?>) TopicCreateActivity.class));
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57658OooO00o);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.Create_Topic);
        }
        OooOo().f57659OooO0O0.setOnClickListener(this);
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("level", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("time", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("law", false);
        Drawable drawableOooO0O0 = o0000.OooO0O0(oOo00OO0.ic_topic_create_check_ok);
        Drawable drawableOooO0O1 = o0000.OooO0O0(oOo00OO0.ic_topic_create_check_not_ok);
        TextView textView = OooOo().f57661OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvLevel");
        o000O0o.OooO0oO(textView, booleanExtra ? drawableOooO0O0 : drawableOooO0O1);
        TextView textView2 = OooOo().f57660OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvJoin");
        o000O0o.OooO0oO(textView2, booleanExtra2 ? drawableOooO0O0 : drawableOooO0O1);
        TextView textView3 = OooOo().f57662OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvViolation");
        if (!booleanExtra3) {
            drawableOooO0O0 = drawableOooO0O1;
        }
        o000O0o.OooO0oO(textView3, drawableOooO0O0);
        Button button = OooOo().f57659OooO0O0;
        if (booleanExtra && booleanExtra2 && booleanExtra3) {
            z = true;
        }
        button.setEnabled(z);
        ((BaseMomentDetailVM) this.f26297OooOo00.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((BaseMomentDetailVM) this.f26297OooOo00.getValue()).statisticalTime();
    }
}
