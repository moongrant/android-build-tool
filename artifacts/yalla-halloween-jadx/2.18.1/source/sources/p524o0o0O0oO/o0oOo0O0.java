package p524o0o0O0oO;

import com.android.billingclient.api.o00000O;
import com.yalla.yalla.manager.main.MainUpApkManager;
import com.yalla.yalla.model.ApkUpResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOo0O0 extends Lambda implements Function1<ApkUpResultModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainUpApkManager f43099Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(MainUpApkManager mainUpApkManager) {
        super(1);
        this.f43099Oooo0o = mainUpApkManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApkUpResultModel apkUpResultModel) {
        ApkUpResultModel apkUpResultModel2 = apkUpResultModel;
        if (apkUpResultModel2 == null || !apkUpResultModel2.getIsUpdate()) {
            o00000O.OooO0O0().OooO();
        } else {
            o00000O.OooO0O0().OooO0oO("App_Version", apkUpResultModel2.getAppVersion());
            o00000O.OooO0O0().OooOOO(Boolean.valueOf(apkUpResultModel2.getIsForce()), apkUpResultModel2.getBuild() + "", apkUpResultModel2.getContent(), apkUpResultModel2.getAppUrl(), apkUpResultModel2.getAppVersion());
            this.f43099Oooo0o.OooO0o();
        }
        return Unit.INSTANCE;
    }
}
