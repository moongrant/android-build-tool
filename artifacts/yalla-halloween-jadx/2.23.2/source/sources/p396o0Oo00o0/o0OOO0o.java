package p396o0Oo00o0;

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
import p191o00o0O0.o00Oo0;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p388o0OOooOO.o00O00o0;
import p466o0OooOoo.o0O0o00O;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43637OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f43638OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f43639OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f43640OooO0oO;

    public o0OOO0o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43637OooO0Oo = context;
        this.f43639OooO0o0 = "yalla";
        this.f43638OooO0o = "8267947";
        this.f43640OooO0oO = "6f9b9d15d58847da938dfb72a61a91de";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p191o00o0O0.o00O0O
    public final void run() {
        try {
            Result.Companion companion = Result.INSTANCE;
            String path = ((File) o0O0o00O.f47850OooO0oO.getValue()).getPath();
            FileLogConfig.Builder builder = new FileLogConfig.Builder();
            Intrinsics.checkNotNull(path);
            FileLogConfig fileLogConfigBuild = builder.setLogDir(path).setLogLevel(2).setNamePrefix("yalla").build();
            SailfishConfiguration.Builder env = new SailfishConfiguration.Builder().setEnv(oo0o0Oo.OooO0o() ? Env.pro : Env.fat);
            if (o00O00o0.f43546OooO00o == null) {
                o00O00o0.f43546OooO00o = Executors.newScheduledThreadPool(5);
            }
            ScheduledExecutorService scheduledExecutorService = o00O00o0.f43546OooO00o;
            Intrinsics.checkNotNullExpressionValue(scheduledExecutorService, "getScheduledExecutorService(...)");
            SailfishConfiguration sailfishConfigurationBuild = env.setExecutorService(scheduledExecutorService).setFileLogConfig(fileLogConfigBuild).build();
            String strOooO00o = oOO0.OooO00o(oOO0.f57167OooO00o);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            Sailfish.INSTANCE.init(this.f43637OooO0Oo, this.f43638OooO0o, this.f43639OooO0o0, this.f43640OooO0oO, strOooO00o, sailfishConfigurationBuild, o000000.OooO00o(), l != null ? String.valueOf(l) : "", "Yalla", !oo0o0Oo.OooO0o0());
            Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
    }
}
