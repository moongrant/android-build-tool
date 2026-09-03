package p483o0o000O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apmwrapper.model.SecModel;
import com.common.support.zeus.SV2;
import com.yalla.yalla.common.statistical.net.FLog;
import kotlin.jvm.internal.Intrinsics;
import o0O00.OooO00o;
import o0O00000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;
import p485o0o000Oo.o000oOoO;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.OooOo;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooO extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40870OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f40871OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f40872OooO0o0;

    public OooO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, o000O0O0.OooO00o(-5350701112848L));
        this.f40870OooO0OO = context;
        this.f40871OooO0Oo = o000O0O0.OooO00o(-5385060851216L);
        this.f40872OooO0o0 = o000O0O0.OooO00o(-5664233725456L);
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        try {
            String strOooO0o0 = OooO0o0(this.f40870OooO0OO);
            String appKey = !o0OOO0o.OooO0OO() ? this.f40871OooO0Oo : this.f40872OooO0o0;
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            SV2.INSTANCE.init(appKey);
            o000oOoO.f40896OooO0O0 = strOooO0o0;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public final String OooO0o0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, o000O0O0.OooO00o(-5943406599696L));
        OooO00o OooO00o2 = OooO0O0.OooO00o(context);
        SecModel secModel = new SecModel();
        secModel.setAccessibilityS(OooO00o2.f35031OooOOOO);
        String strOooO00o = OooO00o2.f35020OooO0OO;
        if ((strOooO00o.length() == 0) && (strOooO00o = OooOo.f42064OooO00o.OooO00o()) == null) {
            strOooO00o = o000O0O0.OooO00o(-5977766338064L);
        }
        secModel.setAppInstallS(strOooO00o);
        secModel.setAppVirtual(OooO00o2.f35017OooO);
        secModel.setAttachPort(OooO00o2.f35028OooOO0o);
        secModel.setCFlash(OooO00o2.f35027OooOO0O);
        secModel.setDebug(OooO00o2.f35018OooO00o);
        o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
        secModel.setDevice(o0Oo0oo.OooO00o());
        secModel.setEmulator(OooO00o2.f35019OooO0O0);
        secModel.setFrida(false);
        secModel.setInjection(OooO00o2.f35023OooO0o0);
        secModel.setLightSensor(OooO00o2.f35029OooOOO);
        secModel.setPtrace(false);
        secModel.setRoot(OooO00o2.f35021OooO0Oo);
        secModel.setSensor(OooO00o2.f35026OooOO0);
        secModel.setSubstrate(OooO00o2.f35024OooO0oO);
        secModel.setTime(FLog.INSTANCE.logFormattedDate());
        secModel.setUsb(OooO00o2.f35030OooOOO0);
        String value = OooOOO.f41216OooO00o.OooOoO0().getValue();
        if (value == null) {
            value = o000O0O0.OooO00o(-5982061305360L);
        }
        secModel.setUserId(value);
        secModel.setWifiProxy(OooO00o2.f35025OooO0oo);
        secModel.setXposed(OooO00o2.f35022OooO0o);
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        secModel.setVersion(o0OOO0o.OooO0O0());
        o0.OooO00o oooO00o = o0.OooO00o.f26553OooO0O0;
        o0.OooO00o.OooO0O0(secModel);
        return p516o0o0O000.o0Oo0oo.OooO0O0(secModel);
    }
}
