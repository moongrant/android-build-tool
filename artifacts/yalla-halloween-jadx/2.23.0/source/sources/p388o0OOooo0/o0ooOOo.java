package p388o0OOooo0;

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
import p140o00OOooo.OooOO0;
import p145o00Oo0O.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p464o0Oooo.o000000O;
import p482o0o000oO.o0Oo0oo;
import p579o0oOoo.o;
import p579o0oOoo.oO000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44395OooO0Oo;

    public o0ooOOo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44395OooO0Oo = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(Context context) throws IllegalAccessException {
        SecModel secModelStart = Detector.INSTANCE.start(context);
        String appInstallS = secModelStart.getAppInstallS();
        if (appInstallS.length() == 0) {
            appInstallS = oO000O0.OooO00o(oO000O0.f56533OooO00o);
        }
        secModelStart.setAppInstallS(appInstallS);
        secModelStart.setIden(oo000o.OooO00o());
        secModelStart.setTime(o0Oo0oo.OooO0O0());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        secModelStart.setUserId(l != null ? String.valueOf(l) : "");
        secModelStart.setVersion(o00Ooo.OooO0Oo());
        o00Ooo.f44292OooOO0 = secModelStart;
        o.OooO0O0(false);
        Sailfish.INSTANCE.writeSecLog(secModelStart);
        OooOO0.OooO00o(secModelStart);
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Context context = this.f44395OooO0Oo;
        try {
            Detector detector = Detector.INSTANCE;
            InitResult initResultInit = detector.init(context, o00Ooo.OooO0o0() ? Env.PRO : Env.FAT);
            if (initResultInit.getCode() == 0) {
                OooO0Oo(context);
                o00Ooo.f44283OooO = OooOO0.OooO00o(detector.getDetectResult());
                return;
            }
            Sailfish.INSTANCE.logE("ATD init failed\nInitResult : { code : " + initResultInit.getCode() + ", message : " + initResultInit.getMessage() + "}");
        } catch (Exception e) {
            try {
                Sailfish.INSTANCE.logE("ATD init failed\n" + ExceptionsKt.stackTraceToString(e));
            } catch (Throwable th) {
                o0O0OOO.OooOO0.OooO00o().OooO0O0(e);
                o0O0OOO.OooOO0.OooO00o().OooO0O0(th);
            }
        }
    }
}
