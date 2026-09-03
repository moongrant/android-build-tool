package p426o0OoOO;

import com.android.billingclient.api.o0000OO0;
import com.yalla.yalla.manager.main.MainUpApkManager;
import com.yalla.yalla.model.ApkUpResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function1<ApkUpResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainUpApkManager f45620OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(MainUpApkManager mainUpApkManager) {
        super(1);
        this.f45620OooO0Oo = mainUpApkManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApkUpResultModel apkUpResultModel) {
        ApkUpResultModel apkUpResultModel2 = apkUpResultModel;
        if (apkUpResultModel2 == null || !apkUpResultModel2.getIsUpdate()) {
            o0000OO0.OooO0O0().OooO0oO();
        } else {
            o0000OO0.OooO0O0().OooO0o0("App_Version", apkUpResultModel2.getAppVersion());
            o0000OO0.OooO0O0().OooO(Boolean.valueOf(apkUpResultModel2.getIsForce()), o0OOO0o.OooO00o(apkUpResultModel2.getBuild()), apkUpResultModel2.getContent(), apkUpResultModel2.getAppUrl(), apkUpResultModel2.getAppVersion());
            this.f45620OooO0Oo.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
