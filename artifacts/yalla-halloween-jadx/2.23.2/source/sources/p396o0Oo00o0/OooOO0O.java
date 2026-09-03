package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.Sailfish;
import com.common.support.atd.Detector;
import com.common.support.atd.base.Env;
import com.common.support.atd.base.InitResult;
import com.common.support.sailfish_commons.logmodels.SecModel;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p187o00o00o0.OooO;
import p191o00o0O0.o00Oo0;
import p285o0O0OOo.OooOo;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p488o0o00O0.OooOO0;
import p590o0oOooo0.oOO0;
import p590o0oOooo0.oOO0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0O extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43624OooO0Oo;

    public OooOO0O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43624OooO0Oo = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(Context context) throws IllegalAccessException {
        SecModel secModelStart = Detector.INSTANCE.start(context);
        String appInstallS = secModelStart.getAppInstallS();
        if (appInstallS.length() == 0) {
            appInstallS = oOO0.OooO00o(oOO0.f57167OooO00o);
        }
        secModelStart.setAppInstallS(appInstallS);
        secModelStart.setIden(o000000.OooO00o());
        secModelStart.setTime(OooOO0.OooO0O0());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        secModelStart.setUserId(l != null ? String.valueOf(l) : "");
        secModelStart.setVersion(oo0o0Oo.OooO0Oo());
        oo0o0Oo.f43515OooOO0 = secModelStart;
        oOO0000.OooO0O0(false);
        Sailfish.INSTANCE.writeSecLog(secModelStart);
        OooO.OooO00o(secModelStart);
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43624OooO0Oo;
        try {
            Detector detector = Detector.INSTANCE;
            InitResult initResultInit = detector.init(context, oo0o0Oo.OooO0o0() ? Env.PRO : Env.FAT);
            if (initResultInit.getCode() == 0) {
                OooO0Oo(context);
                oo0o0Oo.f43506OooO = OooO.OooO00o(detector.getDetectResult());
                return;
            }
            Sailfish.INSTANCE.logE("ATD init failed\nInitResult : { code : " + initResultInit.getCode() + ", message : " + initResultInit.getMessage() + "}");
        } catch (Exception e) {
            try {
                Sailfish.INSTANCE.logE("ATD init failed\n" + ExceptionsKt.stackTraceToString(e));
            } catch (Throwable th) {
                OooOo.OooO00o().OooO0O0(e);
                OooOo.OooO00o().OooO0O0(th);
            }
        }
    }
}
