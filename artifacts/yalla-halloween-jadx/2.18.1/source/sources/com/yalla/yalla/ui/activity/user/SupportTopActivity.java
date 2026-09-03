package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.SupportInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.user.SupportTopVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00Oo0;
import p142o00OOooO.o0OOO0o;
import p254o00ooO0O.o00O000o;
import p466o0OooO0.o0000Ooo;
import p478o0OooooO.oO0OoOO0;
import p566o0oOo00O.o00O0O0;
import p566o0oOo00O.o00O0O0O;
import p649o0ooOOoo.ph;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/SupportTopActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SupportTopActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23411OooooO0 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23412OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ph.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23413Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SupportTopVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.SupportTopActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23417Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23417Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<SupportInfo.UserData> f23414Ooooo0o;

    public static final class OooO00o {
    }

    public final ph OooOoo() {
        return (ph) this.f23412OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO() {
        ((SupportTopVM) this.f23413Ooooo00.getValue()).loadSupportInfo().observe(this, new o0OOO0o(this, 8));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50328OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO0O0(headerLayout, true, 2);
        }
        OooOo(R.string.user_support_top_tag);
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.transparent));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        if (headerLayout3 != null) {
            headerLayout3.OooOoOO(R.drawable.icon_aristocracy_doubt, new o00O0O0(this));
        }
        o00O0O0O o00o0o0o2 = new o00O0O0O(this);
        this.f23414Ooooo0o = o00o0o0o2;
        o00o0o0o2.setFirstLoading(true);
        p188o00o00o0.OooO0OO<SupportInfo.UserData> oooO0OO = this.f23414Ooooo0o;
        p188o00o00o0.OooO0OO<SupportInfo.UserData> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setHeaderAndEmpty(true);
        p188o00o00o0.OooO0OO<SupportInfo.UserData> oooO0OO3 = this.f23414Ooooo0o;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setEmptyFullScreen(true);
        OooOoo().f50329OooO0O0.f19553o0ooOO0 = false;
        OooOoo().f50329OooO0O0.f19554o0ooOOo = false;
        p188o00o00o0.OooO0OO<SupportInfo.UserData> oooO0OO4 = this.f23414Ooooo0o;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setOnItemClickListener(new o00Oo0(this, 4));
        OooOoo().f50330OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView = OooOoo().f50330OooO0OO;
        p188o00o00o0.OooO0OO<SupportInfo.UserData> oooO0OO5 = this.f23414Ooooo0o;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO5;
        }
        recyclerView.setAdapter(oooO0OO2);
        OooOoo().f50329OooO0O0.f19505o00000OO = new o0000Ooo(this);
        OooOooO();
    }
}
