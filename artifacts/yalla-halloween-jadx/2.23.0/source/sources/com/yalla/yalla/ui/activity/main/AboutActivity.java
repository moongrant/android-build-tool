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
import com.code.android.util.o000000;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.AboutActivity;
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
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o0000OO0;
import p382o0OOoo0o.o00Ooo;
import p463o0OooOoo.o0O0O0O;
import p519o0o0O0oO.p4;
import p554o0oOOoo0.oO000;
import p579o0oOoo.oO000O0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.m3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/AboutActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAboutActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutActivity.kt\ncom/yalla/yalla/ui/activity/main/AboutActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,243:1\n22#2,2:244\n75#3,13:246\n*S KotlinDebug\n*F\n+ 1 AboutActivity.kt\ncom/yalla/yalla/ui/activity/main/AboutActivity\n*L\n44#1:244,2\n46#1:246,13\n*E\n"})
public final class AboutActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f25353OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public oO000 f25356OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public oO000 f25358OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public oO000 f25359OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public UpdateAppModel f25361OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25354OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(m3.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25357OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ApkUpVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.AboutActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25366OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25366OooO0Oo;
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
    public final Lazy f25355OooOo = LazyKt.lazy(OooO00o.f25362OooO0Oo);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f25360OooOoO = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f25362OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return String.valueOf(o00Ooo.OooO0OO());
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
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == oO00O0oO.includeCheckVersion) {
            onResume();
            ((ApkUpVM) this.f25357OooOo00.getValue()).apkUp((String) this.f25355OooOo.getValue()).observe(this, new o0000OO0(new p486o0o00O00.o0OoOo0(this), p486o0o00O00.o00O0O.f48306OooO0Oo, p486o0o00O00.o00Oo0.f48328OooO0Oo, false));
            return;
        }
        if (id == oO00O0oO.includeTermsOfService) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
            webPageInfo.OooO0o0(o0000O.f44170o000oOoO);
            webPageInfo.OooO00o("type", "1");
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent = new Intent(this, (Class<?>) WebActivity.class);
            intent.putExtra("pageinfo", webPageInfo);
            startActivity(intent);
            return;
        }
        if (id == oO00O0oO.includePrivacyPolicy) {
            WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.TermsOfService);
            webPageInfo2.OooO0o0(o0000O.f44170o000oOoO);
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
        o000O0Oo o000o0oo2 = this.f25354OooOOoo;
        setContentView(((m3) o000o0oo2.getValue()).f58400OooO00o);
        OooOOoo(oO00OOo0.about);
        OooOOo0(1);
        this.f25356OooOo0 = new oO000(this, oO00O0oO.includeCheckVersion);
        this.f25358OooOo0O = new oO000(this, oO00O0oO.includeTermsOfService);
        this.f25359OooOo0o = new oO000(this, oO00O0oO.includePrivacyPolicy);
        oO000 oo000 = this.f25356OooOo0;
        if (oo000 != null) {
            oo000.OooO0O0(oOo00OO0.ic_account_right, o0000.OooO0OO(oO00OOo0.check_for_updates), androidx.camera.core.impl.OooOOOO.OooO00o(com.android.billingclient.api.o0000OO0.OooO0O0().OooO00o("App_Version"), "    "));
        }
        oO000 oo001 = this.f25358OooOo0O;
        if (oo001 != null) {
            oo001.OooO0O0(oOo00OO0.ic_account_right, o0000.OooO0OO(oO00OOo0.agreement_lab), null);
        }
        oO000 oo002 = this.f25359OooOo0o;
        if (oo002 != null) {
            oo002.OooO0O0(oOo00OO0.ic_account_right, o0000.OooO0OO(oO00OOo0.privacy_policy), null);
        }
        oO000 oo003 = this.f25356OooOo0;
        if (oo003 != null && (view4 = oo003.f56070OooOO0) != null) {
            view4.setVisibility(8);
        }
        oO000 oo004 = this.f25356OooOo0;
        if (oo004 != null && (view3 = oo004.f44419OooO0Oo) != null) {
            view3.setOnClickListener(this);
        }
        oO000 oo005 = this.f25358OooOo0O;
        if (oo005 != null && (view2 = oo005.f44419OooO0Oo) != null) {
            view2.setOnClickListener(this);
        }
        oO000 oo006 = this.f25359OooOo0o;
        if (oo006 != null && (view = oo006.f44419OooO0Oo) != null) {
            view.setOnClickListener(this);
        }
        String strOooO00o = p031OoooO0.o0OoOo0.OooO00o(o0000.OooO0OO(oO00OOo0.single_Yalla), ZegoConstants.ZegoVideoDataAuxPublishingStream, o00Ooo.OooO0Oo());
        if (!o00Ooo.OooO0o0()) {
            ((m3) o000o0oo2.getValue()).f58401OooO0O0.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00O00.o000oOoO
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view5) {
                    int i = AboutActivity.f25353OooOoOO;
                    AboutActivity context = this.f48294OooO0Oo;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    int i2 = o0O0O0O.f46666OooO00o;
                    Intrinsics.checkNotNullParameter(context, "context");
                    return true;
                }
            });
            strOooO00o = oO000O0.OooO00o(oO000O0.f56533OooO00o) + "\n" + o00Ooo.OooO0Oo() + "_" + o00Ooo.OooO0OO() + "\nrelease";
        }
        ((m3) o000o0oo2.getValue()).f58402OooO0OO.setText(strOooO00o);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> oooOo) {
        super.onEventMainThread(oooOo);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean z;
        oO000 oo000;
        View view;
        View view2;
        super.onResume();
        oO000 oo001 = this.f25356OooOo0;
        if (oo001 != null && (view2 = oo001.f56070OooOO0) != null) {
            view2.setVisibility(8);
        }
        Intrinsics.checkNotNullParameter(this, "context");
        try {
            z = o000000.OooO0o0(com.android.billingclient.api.o0000OO0.OooO0O0().OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION)) > o00Ooo.OooO0OO();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z && (oo000 = this.f25356OooOo0) != null && (view = oo000.f56070OooOO0) != null) {
            view.setVisibility(0);
        }
        oO000 oo002 = this.f25356OooOo0;
        if (oo002 != null) {
            oo002.OooO0O0(oOo00OO0.ic_account_right, o0000.OooO0OO(oO00OOo0.check_for_updates), androidx.camera.core.impl.OooOOOO.OooO00o(com.android.billingclient.api.o0000OO0.OooO0O0().OooO00o("App_Version"), "    "));
        }
    }
}
