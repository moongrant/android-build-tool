package com.yalla.yalla.manager.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o00000O;
import com.facebook.share.internal.ShareConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.ApkUpVM;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0OOO0o;
import p524o0o0O0oO.o0O;
import p524o0o0O0oO.o0O0oo00;
import p524o0o0O0oO.o0oOo0O0;
import p525o0o0O0oo.o0OO000o;
import p579o0oOoOOo.q1;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class MainUpApkManager extends o0OO000o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f21620OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public UpdateAppModel f21621OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21622OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f21623OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<q1> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final q1 invoke() {
            return new q1(MainUpApkManager.this.f21620OooO0Oo);
        }
    }

    public MainUpApkManager(@NotNull final MainActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f21620OooO0Oo = activity;
        this.f21622OooO0o0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ApkUpVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.manager.main.MainUpApkManager$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.manager.main.MainUpApkManager$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.manager.main.MainUpApkManager$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f21627Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f21627Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f21623OooO0oO = LazyKt.lazy(new OooO00o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO0O0() {
        ApkUpVM apkUpVM = (ApkUpVM) this.f21622OooO0o0.getValue();
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        apkUpVM.apkUp(String.valueOf(o0OOO0o.OooO00o())).observe(this.f21620OooO0Oo, new OooOo(new o0oOo0O0(this), o0O0oo00.f43087Oooo0o, o0O.f43016Oooo0o, false));
    }

    public final void OooO0o() {
        Exception e;
        double dDoubleValue;
        UpdateAppModel updateAppModel = new UpdateAppModel();
        updateAppModel.setNotificationInfo(R.drawable.ic_logo, this.f21620OooO0Oo.getString(R.string.update_Download), this.f21620OooO0Oo.getString(R.string.download_Progress));
        String strOooOO0O = o00000O.OooO0O0().OooOO0O();
        Intrinsics.checkNotNullExpressionValue(strOooOO0O, "getTableXJ().apkInfo_version");
        updateAppModel.setTargetVersionCode(strOooOO0O);
        String strOooO0OO = o00000O.OooO0O0().OooO0OO("Neme");
        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "getTableXJ().apkInfo_name");
        updateAppModel.setTargetVersionName(strOooO0OO);
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        updateAppModel.setCurrentVersionCode(String.valueOf(o0OOO0o.OooO00o()));
        String strOooO0OO2 = o00000O.OooO0O0().OooO0OO(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        Intrinsics.checkNotNullExpressionValue(strOooO0OO2, "getTableXJ().apkInfo_message");
        updateAppModel.setContent(strOooO0OO2);
        String strOooO0OO3 = o00000O.OooO0O0().OooO0OO("upLoadApkUrl");
        Intrinsics.checkNotNullExpressionValue(strOooO0OO3, "getTableXJ().apkInfo_Url");
        updateAppModel.setApkUrl(strOooO0OO3);
        updateAppModel.setUpApkCode(0);
        double dDoubleValue2 = 0.0d;
        try {
            Double dValueOf = Double.valueOf(updateAppModel.getTargetVersionCode());
            Intrinsics.checkNotNullExpressionValue(dValueOf, "valueOf(apkUpdateModel.targetVersionCode)");
            dDoubleValue = dValueOf.doubleValue();
            try {
                Double dValueOf2 = Double.valueOf(updateAppModel.getCurrentVersionCode());
                Intrinsics.checkNotNullExpressionValue(dValueOf2, "valueOf(apkUpdateModel.currentVersionCode)");
                dDoubleValue2 = dValueOf2.doubleValue();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
            dDoubleValue = 0.0d;
        }
        if (dDoubleValue <= dDoubleValue2) {
            updateAppModel.setUpApkCode(0);
            return;
        }
        updateAppModel.setUpApkCode(1);
        if (o00000O.OooO0O0().OooOO0()) {
            updateAppModel.setUpApkCode(2);
            this.f21621OooO0o = updateAppModel;
            ((q1) this.f21623OooO0oO.getValue()).OooOOOO(this.f21621OooO0o);
        }
    }
}
