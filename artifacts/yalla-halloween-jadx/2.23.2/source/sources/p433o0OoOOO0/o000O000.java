package p433o0OoOOO0;

import androidx.compose.foundation.layout.oo000o;
import com.yalla.yalla.manager.main.MainUpApkManager;
import com.yalla.yalla.model.ApkUpResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p269o00oooo0.o0O0oo0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<ApkUpResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainUpApkManager f46921OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(MainUpApkManager mainUpApkManager) {
        super(1);
        this.f46921OooO0Oo = mainUpApkManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApkUpResultModel apkUpResultModel) {
        ApkUpResultModel apkUpResultModel2 = apkUpResultModel;
        if (apkUpResultModel2 == null || !apkUpResultModel2.getIsUpdate()) {
            o0O0oo0o.OooO00o().OooO0oO();
        } else {
            o0O0oo0o.OooO00o().OooO0o0("App_Version", apkUpResultModel2.getAppVersion());
            o0O0oo0o.OooO00o().OooO(Boolean.valueOf(apkUpResultModel2.getIsForce()), oo000o.OooO00o(apkUpResultModel2.getBuild()), apkUpResultModel2.getContent(), apkUpResultModel2.getAppUrl(), apkUpResultModel2.getAppVersion());
            this.f46921OooO0Oo.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
