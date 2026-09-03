package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.common.vm.ApkUpVM;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.AboutActivity;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.o00O000o;
import p487o0o000oO.o0OOO0o;
import p516o0o0O000.o00000O;
import p535o0o0OOoO.oO00OOOo;
import p535o0o0OOoO.oO00OOo0;
import p535o0o0OOoO.oO00Oo00;
import p579o0oOoOOo.q1;
import p649o0ooOOoo.da;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/AboutActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AboutActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final /* synthetic */ int f21906OoooooO = 0;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public p181o00o000.OooO0OO f21909Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public p181o00o000.OooO0OO f21910OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public p181o00o000.OooO0OO f21911OooooOO;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public UpdateAppModel f21914Oooooo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21907OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(da.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21908Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ApkUpVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.AboutActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.AboutActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.AboutActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21919Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21919Oooo0o;
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
    public final Lazy f21912OooooOo = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f21913Oooooo = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o extends Lambda implements Function0<String> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            AboutActivity aboutActivity = AboutActivity.this;
            Objects.requireNonNull(aboutActivity);
            return o00000O.OooO0O0(aboutActivity);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<q1> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final q1 invoke() {
            return new q1(AboutActivity.this);
        }
    }

    public final da OooOoo() {
        return (da) this.f21907OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        switch (view.getId()) {
            case R.id.includeCheckVersion /* 2131297306 */:
                onResume();
                ApkUpVM apkUpVM = (ApkUpVM) this.f21908Ooooo00.getValue();
                Object value = this.f21912OooooOo.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-mCurrentVersionCode>(...)");
                apkUpVM.apkUp((String) value).observe(this, new OooOo(new oO00OOOo(this), oO00OOo0.f43633Oooo0o, oO00Oo00.f43636Oooo0o, false));
                break;
            case R.id.includePrivacyPolicy /* 2131297307 */:
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                webPageInfo.OooO0Oo(o0ooOOo.f32324o000oOoO);
                webPageInfo.OooO00o("type", FeedbackType.Suggestions);
                Intrinsics.checkNotNullParameter(this, "context");
                Intent intent = new Intent(this, (Class<?>) WebActivity.class);
                intent.putExtra("pageinfo", webPageInfo);
                startActivity(intent);
                break;
            case R.id.includeTermsOfService /* 2131297308 */:
                WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.TermsOfService);
                o0ooOOo o0ooooo3 = o0ooOOo.f32218OooO00o;
                webPageInfo2.OooO0Oo(o0ooOOo.f32324o000oOoO);
                webPageInfo2.OooO00o("type", "1");
                Intrinsics.checkNotNullParameter(this, "context");
                Intent intent2 = new Intent(this, (Class<?>) WebActivity.class);
                intent2.putExtra("pageinfo", webPageInfo2);
                startActivity(intent2);
                break;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        View view;
        View view2;
        View view3;
        super.onCreate(bundle);
        setContentView(OooOoo().f49158OooO00o);
        OooOo(R.string.about);
        OooOo0O(1);
        this.f21909Ooooo0o = new p181o00o000.OooO0OO(this, R.id.includeCheckVersion);
        this.f21910OooooO0 = new p181o00o000.OooO0OO(this, R.id.includeTermsOfService);
        this.f21911OooooOO = new p181o00o000.OooO0OO(this, R.id.includePrivacyPolicy);
        p181o00o000.OooO0OO oooO0OO = this.f21909Ooooo0o;
        if (oooO0OO != null) {
            oooO0OO.OooO0o(o000O0O0.OooO0OO(R.string.check_for_updates), com.android.billingclient.api.o00000O.OooO0O0().OooO0OO("App_Version") + "    ");
        }
        p181o00o000.OooO0OO oooO0OO2 = this.f21910OooooO0;
        if (oooO0OO2 != null) {
            oooO0OO2.OooO0o(o000O0O0.OooO0OO(R.string.agreement_lab), null);
        }
        p181o00o000.OooO0OO oooO0OO3 = this.f21911OooooOO;
        if (oooO0OO3 != null) {
            oooO0OO3.OooO0o(o000O0O0.OooO0OO(R.string.privacy_policy), null);
        }
        p181o00o000.OooO0OO oooO0OO4 = this.f21909Ooooo0o;
        if (oooO0OO4 != null) {
            oooO0OO4.OooO0o0(8);
        }
        p181o00o000.OooO0OO oooO0OO5 = this.f21909Ooooo0o;
        if (oooO0OO5 != null && (view3 = oooO0OO5.f32161Oooo0o) != null) {
            view3.setOnClickListener(this);
        }
        p181o00o000.OooO0OO oooO0OO6 = this.f21910OooooO0;
        if (oooO0OO6 != null && (view2 = oooO0OO6.f32161Oooo0o) != null) {
            view2.setOnClickListener(this);
        }
        p181o00o000.OooO0OO oooO0OO7 = this.f21911OooooOO;
        if (oooO0OO7 != null && (view = oooO0OO7.f32161Oooo0o) != null) {
            view.setOnClickListener(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o000O0O0.OooO0OO(R.string.single_Yalla));
        sb.append(' ');
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        sb.append(o0OOO0o.OooO0O0());
        String string = sb.toString();
        if (!o0OOO0o.OooO0OO()) {
            OooOoo().f49159OooO0O0.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o0OOoO.oO00OOO
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view4) {
                    AboutActivity context = this.f43631Oooo0o;
                    int i = AboutActivity.f21906OoooooO;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    Intrinsics.checkNotNullParameter(context, "context");
                    return true;
                }
            });
            string = p516o0o0O000.OooOo.f42064OooO00o.OooO00o() + '\n' + o0OOO0o.OooO0O0() + '_' + o0OOO0o.OooO00o() + "\nrelease_";
        }
        OooOoo().f49160OooO0OO.setText(string);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> oooO0OO) {
        super.onEventMainThread(oooO0OO);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean z;
        p181o00o000.OooO0OO oooO0OO;
        super.onResume();
        p181o00o000.OooO0OO oooO0OO2 = this.f21909Ooooo0o;
        if (oooO0OO2 != null) {
            oooO0OO2.OooO0o0(8);
        }
        Intrinsics.checkNotNullParameter(this, "context");
        try {
            z = o000Oo0.OooO0OO(com.android.billingclient.api.o00000O.OooO0O0().OooOO0O(), 0) > o000Oo0.OooO0OO(o00000O.OooO0O0(this), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z && (oooO0OO = this.f21909Ooooo0o) != null) {
            oooO0OO.OooO0o0(0);
        }
        p181o00o000.OooO0OO oooO0OO3 = this.f21909Ooooo0o;
        if (oooO0OO3 != null) {
            oooO0OO3.OooO0o(o000O0O0.OooO0OO(R.string.check_for_updates), com.android.billingclient.api.o00000O.OooO0O0().OooO0OO("App_Version") + "    ");
        }
    }
}
