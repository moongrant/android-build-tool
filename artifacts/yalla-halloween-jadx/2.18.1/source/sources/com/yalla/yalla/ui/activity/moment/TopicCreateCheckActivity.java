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
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p522o0o0O0o.o000O0Oo;
import p522o0o0O0o.oo0o0O0;
import p649o0ooOOoo.xc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateCheckActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicCreateCheckActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22557Ooooo0o = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22558OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(xc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22559Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22562Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22562Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) TopicCreateCheckActivity.class);
            intent.putExtra("level", bool);
            intent.putExtra("time", bool2);
            intent.putExtra("law", bool3);
            context.startActivity(intent);
        }
    }

    public final xc OooOoo() {
        return (xc) this.f22558OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == R.id.btCreateTopic) {
            o0O00000.OooO0OO("Moments_topics_CreateTopic");
            Intrinsics.checkNotNullParameter(this, "context");
            startActivity(new Intent(this, (Class<?>) TopicCreateActivity.class));
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50963OooO00o);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Create_Topic);
        }
        OooOoo().f50964OooO0O0.setOnClickListener(this);
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("level", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("time", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("law", false);
        Drawable drawableOooO00o = o000O0Oo.OooO00o(this, R.drawable.ic_topic_create_check_ok);
        Drawable drawableOooO00o2 = o000O0Oo.OooO00o(this, R.drawable.ic_topic_create_check_not_ok);
        TextView textView = OooOoo().f50966OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvLevel");
        oo0o0O0.OooO0oo(textView, booleanExtra ? drawableOooO00o : drawableOooO00o2);
        TextView textView2 = OooOoo().f50965OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvJoin");
        oo0o0O0.OooO0oo(textView2, booleanExtra2 ? drawableOooO00o : drawableOooO00o2);
        TextView textView3 = OooOoo().f50967OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvViolation");
        if (!booleanExtra3) {
            drawableOooO00o = drawableOooO00o2;
        }
        oo0o0O0.OooO0oo(textView3, drawableOooO00o);
        Button button = OooOoo().f50964OooO0O0;
        if (booleanExtra && booleanExtra2 && booleanExtra3) {
            z = true;
        }
        button.setEnabled(z);
        ((MomentVM) this.f22559Ooooo00.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((MomentVM) this.f22559Ooooo00.getValue()).statisticalTime();
    }
}
