package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.ApkUpVM;
import com.yalla.yalla.util.WebPageInfo;
import com.zego.zegoavkit2.ZegoConstants;
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
import p269o00oooo0.o0O0oo0o;
import p386o0OOooO.oo0o0Oo;
import p405o0Oo0OOO.o;
import p487o0o00O.o00Ooo;
import p487o0o00O.o00oO0o;
import p487o0o00O.oo000o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOO0;
import p650o0ooo.p4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/AboutActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAboutActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutActivity.kt\ncom/yalla/yalla/ui/activity/main/AboutActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,243:1\n22#2,2:244\n75#3,13:246\n*S KotlinDebug\n*F\n+ 1 AboutActivity.kt\ncom/yalla/yalla/ui/activity/main/AboutActivity\n*L\n44#1:244,2\n46#1:246,13\n*E\n"})
public final class AboutActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f24899OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public p561o0oOo00.OooOO0 f24902OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public p561o0oOo00.OooOO0 f24904OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public p561o0oOo00.OooOO0 f24905OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public UpdateAppModel f24907OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24900OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24903OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ApkUpVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.AboutActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24912OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24912OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f24901OooOo = LazyKt.lazy(OooO00o.f24908OooO0Oo);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f24906OooOoO = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f24908OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return String.valueOf(oo0o0Oo.OooO0OO());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<p4> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p4 invoke() {
            return new p4(AboutActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == o0OO00O.includeCheckVersion) {
            onResume();
            ((ApkUpVM) this.f24903OooOo00.getValue()).apkUp((String) this.f24901OooOo.getValue()).observe(this, new p384o0OOoo0O.o000oOoO(new o00Ooo(this), oo000o.f48905OooO0Oo, o00oO0o.f48834OooO0Oo, false));
            return;
        }
        if (id == o0OO00O.includeTermsOfService) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
            webPageInfo.OooO0o0(p384o0OOoo0O.Oooo0.f43429o000oOoO);
            webPageInfo.OooO00o("type", "1");
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent = new Intent(this, (Class<?>) WebActivity.class);
            intent.putExtra("pageinfo", webPageInfo);
            startActivity(intent);
            return;
        }
        if (id == o0OO00O.includePrivacyPolicy) {
            WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.TermsOfService);
            webPageInfo2.OooO0o0(p384o0OOoo0O.Oooo0.f43429o000oOoO);
            webPageInfo2.OooO00o("type", FeedbackType.Suggestions);
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent2 = new Intent(this, (Class<?>) WebActivity.class);
            intent2.putExtra("pageinfo", webPageInfo2);
            startActivity(intent2);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        View view;
        View view2;
        View view3;
        View view4;
        super.onCreate(bundle);
        o000O0 o000o0 = this.f24900OooOOoo;
        setContentView(((o) o000o0.getValue()).f44199OooO00o);
        OooOOoo(o000000.about);
        OooOOo0(1);
        this.f24902OooOo0 = new p561o0oOo00.OooOO0(this, o0OO00O.includeCheckVersion);
        this.f24904OooOo0O = new p561o0oOo00.OooOO0(this, o0OO00O.includeTermsOfService);
        this.f24905OooOo0o = new p561o0oOo00.OooOO0(this, o0OO00O.includePrivacyPolicy);
        p561o0oOo00.OooOO0 oooOO1 = this.f24902OooOo0;
        if (oooOO1 != null) {
            oooOO1.OooO0O0(o0Oo0oo.ic_account_right, o0000.OooO0OO(o000000.check_for_updates), androidx.camera.core.impl.OooOOOO.OooO00o(o0O0oo0o.OooO00o().OooO00o("App_Version"), "    "));
        }
        p561o0oOo00.OooOO0 oooOO2 = this.f24904OooOo0O;
        if (oooOO2 != null) {
            oooOO2.OooO0O0(o0Oo0oo.ic_account_right, o0000.OooO0OO(o000000.agreement_lab), null);
        }
        p561o0oOo00.OooOO0 oooOO3 = this.f24905OooOo0o;
        if (oooOO3 != null) {
            oooOO3.OooO0O0(o0Oo0oo.ic_account_right, o0000.OooO0OO(o000000.privacy_policy), null);
        }
        p561o0oOo00.OooOO0 oooOO4 = this.f24902OooOo0;
        if (oooOO4 != null && (view4 = oooOO4.f56242OooOO0) != null) {
            view4.setVisibility(8);
        }
        p561o0oOo00.OooOO0 oooOO5 = this.f24902OooOo0;
        if (oooOO5 != null && (view3 = oooOO5.f43656OooO0Oo) != null) {
            view3.setOnClickListener(this);
        }
        p561o0oOo00.OooOO0 oooOO6 = this.f24904OooOo0O;
        if (oooOO6 != null && (view2 = oooOO6.f43656OooO0Oo) != null) {
            view2.setOnClickListener(this);
        }
        p561o0oOo00.OooOO0 oooOO7 = this.f24905OooOo0o;
        if (oooOO7 != null && (view = oooOO7.f43656OooO0Oo) != null) {
            view.setOnClickListener(this);
        }
        String strOooO0O0 = p031OoooO0.o0OoOo0.OooO0O0(o0000.OooO0OO(o000000.single_Yalla), ZegoConstants.ZegoVideoDataAuxPublishingStream, oo0o0Oo.OooO0Oo());
        if (!oo0o0Oo.OooO0o0()) {
            ((o) o000o0.getValue()).f44200OooO0O0.setOnLongClickListener(new p487o0o00O.o00Oo0(this, 0));
            strOooO0O0 = oOO0.OooO00o(oOO0.f57167OooO00o) + "\n" + oo0o0Oo.OooO0Oo() + "_" + oo0o0Oo.OooO0OO() + "\nrelease";
        }
        ((o) o000o0.getValue()).f44201OooO0OO.setText(strOooO0O0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    public final void onEventMainThread(@Nullable p545o0oO0O00.OooOOO<?> oooOOO) {
        super.onEventMainThread(oooOOO);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean z;
        p561o0oOo00.OooOO0 oooOO1;
        View view;
        View view2;
        super.onResume();
        p561o0oOo00.OooOO0 oooOO2 = this.f24902OooOo0;
        if (oooOO2 != null && (view2 = oooOO2.f56242OooOO0) != null) {
            view2.setVisibility(8);
        }
        Intrinsics.checkNotNullParameter(this, "context");
        try {
            z = com.code.android.util.o000000.OooO0o0(o0O0oo0o.OooO00o().OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION)) > oo0o0Oo.OooO0OO();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z && (oooOO1 = this.f24902OooOo0) != null && (view = oooOO1.f56242OooOO0) != null) {
            view.setVisibility(0);
        }
        p561o0oOo00.OooOO0 oooOO3 = this.f24902OooOo0;
        if (oooOO3 != null) {
            oooOO3.OooO0O0(o0Oo0oo.ic_account_right, o0000.OooO0OO(o000000.check_for_updates), androidx.camera.core.impl.OooOOOO.OooO00o(o0O0oo0o.OooO00o().OooO00o("App_Version"), "    "));
        }
    }
}
