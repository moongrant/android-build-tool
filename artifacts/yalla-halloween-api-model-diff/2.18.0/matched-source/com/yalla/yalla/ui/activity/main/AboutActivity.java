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
import p154o00Oo0oO.o0ooOOo;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.o00O000o;
import p518o0o0O000.o00000O;
import p537o0o0OOoO.oO00OOO;
import p537o0o0OOoO.oO00OOOo;
import p537o0o0OOoO.oO00OOo0;
import p581o0oOoOOo.p1;
import p651o0ooOOoo.ca;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/AboutActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AboutActivity extends BaseActivityK {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final /* synthetic */ int f21925ooOO = 0;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public p182o00o000.OooO0OO f21928OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public p182o00o000.OooO0OO f21929Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public p182o00o000.OooO0OO f21930Oooooo0;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public UpdateAppModel f21932Ooooooo;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f21926OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(ca.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21927OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ApkUpVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.AboutActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f21938Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21938Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final Lazy f21931OoooooO = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f21933o0OoOo0 = LazyKt.lazy(new OooO0O0());

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

    public static final class OooO0O0 extends Lambda implements Function0<p1> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p1 invoke() {
            return new p1(AboutActivity.this);
        }
    }

    public final ca OooOoo() {
        return (ca) this.f21926OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        switch (view.getId()) {
            case R.id.includeCheckVersion /* 2131297306 */:
                onResume();
                ApkUpVM apkUpVM = (ApkUpVM) this.f21927OooooOO.getValue();
                Object value = this.f21931OoooooO.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-mCurrentVersionCode>(...)");
                apkUpVM.apkUp((String) value).observe(this, new OooOo(new oO00OOO(this), oO00OOOo.f43649Oooo, oO00OOo0.f43650Oooo, false));
                break;
            case R.id.includePrivacyPolicy /* 2131297307 */:
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
                o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
                webPageInfo.OooO0Oo(o0ooOOo.f32346o000oOoO);
                webPageInfo.OooO00o("type", FeedbackType.Suggestions);
                Intrinsics.checkNotNullParameter(this, "context");
                Intent intent = new Intent(this, (Class<?>) WebActivity.class);
                intent.putExtra("pageinfo", webPageInfo);
                startActivity(intent);
                break;
            case R.id.includeTermsOfService /* 2131297308 */:
                WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.TermsOfService);
                o0ooOOo o0ooooo3 = o0ooOOo.f32239OooO00o;
                webPageInfo2.OooO0Oo(o0ooOOo.f32346o000oOoO);
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
        setContentView(OooOoo().f49095OooO00o);
        OooOo(R.string.about);
        OooOo0O(1);
        this.f21928OooooOo = new p182o00o000.OooO0OO(this, R.id.includeCheckVersion);
        this.f21930Oooooo0 = new p182o00o000.OooO0OO(this, R.id.includeTermsOfService);
        this.f21929Oooooo = new p182o00o000.OooO0OO(this, R.id.includePrivacyPolicy);
        p182o00o000.OooO0OO oooO0OO = this.f21928OooooOo;
        if (oooO0OO != null) {
            oooO0OO.OooO0o(o000O0O0.OooO0OO(R.string.check_for_updates), com.android.billingclient.api.o00000O.OooO0O0().OooO0OO("App_Version") + "    ");
        }
        p182o00o000.OooO0OO oooO0OO2 = this.f21930Oooooo0;
        if (oooO0OO2 != null) {
            oooO0OO2.OooO0o(o000O0O0.OooO0OO(R.string.agreement_lab), null);
        }
        p182o00o000.OooO0OO oooO0OO3 = this.f21929Oooooo;
        if (oooO0OO3 != null) {
            oooO0OO3.OooO0o(o000O0O0.OooO0OO(R.string.privacy_policy), null);
        }
        p182o00o000.OooO0OO oooO0OO4 = this.f21928OooooOo;
        if (oooO0OO4 != null) {
            oooO0OO4.OooO0o0(8);
        }
        p182o00o000.OooO0OO oooO0OO5 = this.f21928OooooOo;
        if (oooO0OO5 != null && (view3 = oooO0OO5.f32181Oooo) != null) {
            view3.setOnClickListener(this);
        }
        p182o00o000.OooO0OO oooO0OO6 = this.f21930Oooooo0;
        if (oooO0OO6 != null && (view2 = oooO0OO6.f32181Oooo) != null) {
            view2.setOnClickListener(this);
        }
        p182o00o000.OooO0OO oooO0OO7 = this.f21929Oooooo;
        if (oooO0OO7 != null && (view = oooO0OO7.f32181Oooo) != null) {
            view.setOnClickListener(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o000O0O0.OooO0OO(R.string.single_Yalla));
        sb.append(' ');
        p489o0o000oO.o0ooOOo o0ooooo2 = p489o0o000oO.o0ooOOo.f40966OooO00o;
        sb.append(p489o0o000oO.o0ooOOo.OooO0O0());
        String string = sb.toString();
        if (!p489o0o000oO.o0ooOOo.OooO0OO()) {
            OooOoo().f49096OooO0O0.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o0OOoO.oO00OO0O
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view4) {
                    AboutActivity context = this.f43647Oooo;
                    int i = AboutActivity.f21925ooOO;
                    Intrinsics.checkNotNullParameter(context, "this$0");
                    Intrinsics.checkNotNullParameter(context, "context");
                    return true;
                }
            });
            string = p518o0o0O000.OooOo.f42083OooO00o.OooO00o() + '\n' + p489o0o000oO.o0ooOOo.OooO0O0() + '_' + p489o0o000oO.o0ooOOo.OooO00o() + "\nrelease_";
        }
        OooOoo().f49097OooO0OO.setText(string);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, p141o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p141o00OOOoO.OooO0OO<?> oooO0OO) {
        super.onEventMainThread(oooO0OO);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean z;
        p182o00o000.OooO0OO oooO0OO;
        super.onResume();
        p182o00o000.OooO0OO oooO0OO2 = this.f21928OooooOo;
        if (oooO0OO2 != null) {
            oooO0OO2.OooO0o0(8);
        }
        Intrinsics.checkNotNullParameter(this, "context");
        try {
            z = o000Oo0.OooO0OO(com.android.billingclient.api.o00000O.OooO0O0().OooOO0O(), 0) > o000Oo0.OooO0OO(o00000O.OooO0O0(this), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z && (oooO0OO = this.f21928OooooOo) != null) {
            oooO0OO.OooO0o0(0);
        }
        p182o00o000.OooO0OO oooO0OO3 = this.f21928OooooOo;
        if (oooO0OO3 != null) {
            oooO0OO3.OooO0o(o000O0O0.OooO0OO(R.string.check_for_updates), com.android.billingclient.api.o00000O.OooO0O0().OooO0OO("App_Version") + "    ");
        }
    }
}
