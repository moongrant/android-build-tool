package com.yalla.yalla.manager.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.vm.ApkUpVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p382o0OOoo0o.o00Ooo;
import p426o0OoOO.o0OO00O;
import p426o0OoOO.o0Oo0oo;
import p426o0OoOO.oo0o0Oo;
import p435o0OoOOoO.o0O00O;
import p519o0o0O0oO.p4;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMainUpApkManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainUpApkManager.kt\ncom/yalla/yalla/manager/main/MainUpApkManager\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,100:1\n75#2,13:101\n*S KotlinDebug\n*F\n+ 1 MainUpApkManager.kt\ncom/yalla/yalla/manager/main/MainUpApkManager\n*L\n20#1:101,13\n*E\n"})
public final class MainUpApkManager extends o0O00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f23398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public UpdateAppModel f23399OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23400OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f23401OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<p4> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p4 invoke() {
            return new p4(MainUpApkManager.this.f23398OooO0Oo);
        }
    }

    public MainUpApkManager(@NotNull final MainActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23398OooO0Oo = activity;
        this.f23400OooO0o0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ApkUpVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.manager.main.MainUpApkManager$special$$inlined$viewModels$default$2
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

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f23405OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f23405OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f23401OooO0oO = LazyKt.lazy(new OooO00o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p435o0OoOOoO.o0O00O
    public final void OooO0O0() {
        ((ApkUpVM) this.f23400OooO0o0.getValue()).apkUp(String.valueOf(o00Ooo.OooO0OO())).observe(this.f23398OooO0Oo, new o0000OO0(new o0Oo0oo(this), o0OO00O.f45619OooO0Oo, oo0o0Oo.f45668OooO0Oo, false));
    }

    public final void OooO0OO() {
        Exception e;
        double dDoubleValue;
        UpdateAppModel updateAppModel = new UpdateAppModel();
        int i = oOo00OO0.ic_logo;
        int i2 = oO00OOo0.update_Download;
        MainActivity mainActivity = this.f23398OooO0Oo;
        updateAppModel.setNotificationInfo(i, mainActivity.getString(i2), mainActivity.getString(oO00OOo0.download_Progress));
        String strOooO00o = com.android.billingclient.api.o0000OO0.OooO0O0().OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
        Intrinsics.checkNotNullExpressionValue(strOooO00o, "getTableXJ().apkInfo_version");
        updateAppModel.setTargetVersionCode(strOooO00o);
        String strOooO00o2 = com.android.billingclient.api.o0000OO0.OooO0O0().OooO00o("Neme");
        Intrinsics.checkNotNullExpressionValue(strOooO00o2, "getTableXJ().apkInfo_name");
        updateAppModel.setTargetVersionName(strOooO00o2);
        updateAppModel.setCurrentVersionCode(String.valueOf(o00Ooo.OooO0OO()));
        String strOooO00o3 = com.android.billingclient.api.o0000OO0.OooO0O0().OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        Intrinsics.checkNotNullExpressionValue(strOooO00o3, "getTableXJ().apkInfo_message");
        updateAppModel.setContent(strOooO00o3);
        String strOooO00o4 = com.android.billingclient.api.o0000OO0.OooO0O0().OooO00o("upLoadApkUrl");
        Intrinsics.checkNotNullExpressionValue(strOooO00o4, "getTableXJ().apkInfo_Url");
        updateAppModel.setApkUrl(strOooO00o4);
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
        if (com.android.billingclient.api.o0000OO0.OooO0O0().OooO0O0("isUp", false)) {
            updateAppModel.setUpApkCode(2);
            this.f23399OooO0o = updateAppModel;
            ((p4) this.f23401OooO0oO.getValue()).OooOOO(this.f23399OooO0o);
        }
    }
}
