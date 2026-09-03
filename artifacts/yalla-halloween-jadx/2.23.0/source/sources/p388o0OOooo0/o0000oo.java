package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.Sailfish;
import com.common.support.apm.SailfishConfiguration;
import com.common.support.apm.base.Env;
import com.common.support.apm.xlog.FileLogConfig;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p379o0OOoo.OooOOOO;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p416o0Oo0ooo.y0;
import p464o0Oooo.o000000O;
import p579o0oOoo.oO000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000oo extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44386OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f44387OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f44388OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f44389OooO0oO;

    public o0000oo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44386OooO0Oo = context;
        this.f44388OooO0o0 = "yalla";
        this.f44387OooO0o = "8267947";
        this.f44389OooO0oO = "6f9b9d15d58847da938dfb72a61a91de";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        try {
            Result.Companion companion = Result.INSTANCE;
            String logPath = ((File) y0.f45413OooO0oO.getValue()).getPath();
            FileLogConfig.Builder builder = new FileLogConfig.Builder();
            Intrinsics.checkNotNullExpressionValue(logPath, "logPath");
            FileLogConfig fileLogConfigBuild = builder.setLogDir(logPath).setLogLevel(2).setNamePrefix("yalla").build();
            SailfishConfiguration.Builder env = new SailfishConfiguration.Builder().setEnv(o00Ooo.OooO0o() ? Env.pro : Env.fat);
            if (OooOOOO.f44240OooO00o == null) {
                OooOOOO.f44240OooO00o = Executors.newScheduledThreadPool(5);
            }
            ScheduledExecutorService scheduledExecutorService = OooOOOO.f44240OooO00o;
            Intrinsics.checkNotNullExpressionValue(scheduledExecutorService, "getScheduledExecutorService()");
            SailfishConfiguration sailfishConfigurationBuild = env.setExecutorService(scheduledExecutorService).setFileLogConfig(fileLogConfigBuild).build();
            String strOooO00o = oO000O0.OooO00o(oO000O0.f56533OooO00o);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            Sailfish.INSTANCE.init(this.f44386OooO0Oo, this.f44387OooO0o, this.f44388OooO0o0, this.f44389OooO0oO, strOooO00o, sailfishConfigurationBuild, oo000o.OooO00o(), l != null ? String.valueOf(l) : "", "Yalla", !o00Ooo.OooO0o0());
            Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
    }
}
