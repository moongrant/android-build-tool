package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.user.SupportTopVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000O0Oo;
import o000O00O.o000OO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.u1;
import p506o0o00oOo.oO0O00;
import p506o0o00oOo.oO0O000;
import p506o0o00oOo.oO0O000o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/SupportTopActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSupportTopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportTopActivity.kt\ncom/yalla/yalla/ui/activity/user/SupportTopActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,154:1\n22#2,2:155\n75#3,13:157\n*S KotlinDebug\n*F\n+ 1 SupportTopActivity.kt\ncom/yalla/yalla/ui/activity/user/SupportTopActivity\n*L\n40#1:155,2\n41#1:157,13\n*E\n"})
public final class SupportTopActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26727OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oO0O00 f26729OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26728OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(u1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26730OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SupportTopVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.SupportTopActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.SupportTopActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.SupportTopActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26733OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26733OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final u1 OooOo() {
        return (u1) this.f26728OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45573OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        int i = 0;
        oOO00O.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            oOO00O.OooO00o(headerLayout, true, 2);
        }
        OooOOoo(o000000.user_support_top_tag);
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(o0000.OooO00o(o0OOO0o.transparent));
        }
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(o0Oo0oo.icon_aristocracy_doubt, new oO0O000o(this));
        }
        oO0O00 oo0o00 = new oO0O00(this, oo0o0Oo.user_activity_support_top_item);
        this.f26729OooOo0 = oo0o00;
        oo0o00.Oooo00O(true);
        oO0O00 oo0o01 = this.f26729OooOo0;
        oO0O00 oo0o02 = null;
        if (oo0o01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o01 = null;
        }
        oo0o01.OooOo0o();
        oO0O00 oo0o03 = this.f26729OooOo0;
        if (oo0o03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o03 = null;
        }
        oo0o03.OooOooO(true);
        OooOo().f45574OooO0O0.f20867Oooo0o0 = false;
        OooOo().f45574OooO0O0.f20866Oooo0o = false;
        oO0O00 oo0o04 = this.f26729OooOo0;
        if (oo0o04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o04 = null;
        }
        oo0o04.f13176OooO0o = new o000O0Oo(this);
        OooOo().f45575OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOo().f45575OooO0OO;
        oO0O00 oo0o05 = this.f26729OooOo0;
        if (oo0o05 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oo0o02 = oo0o05;
        }
        recyclerView.setAdapter(oo0o02);
        OooOo().f45574OooO0O0.f20877OoooOo0 = new o000OO0O(this);
        ((SupportTopVM) this.f26730OooOo00.getValue()).loadSupportInfo().observe(this, new oO0O000(this, i));
    }
}
