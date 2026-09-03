package p273o00ooooO;

import com.common.support.apm.api.ApmApi;
import com.common.support.apm.model.ResponseModel;
import java.io.File;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p267o00ooo0o.o00OO000;
import p267o00ooo0o.o00OO0OO;
import p268o00oooO.o0oO0Ooo;
import p270o00oooOo.a0;
import p272o00oooo0.o0O0o000;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO000 f34987OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f34988OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f34989OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Job f34990OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final a0 f34991OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f34992OooO0o0;

    public e0(@NotNull String logDir, @NotNull o00OO000 sailfishApmConfig, @NotNull o00OO0OO tokenManager, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(logDir, "logDir");
        Intrinsics.checkNotNullParameter(sailfishApmConfig, "sailfishApmConfig");
        Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
        this.f34987OooO00o = sailfishApmConfig;
        this.f34988OooO0O0 = tokenManager;
        this.f34989OooO0OO = function0;
        this.f34992OooO0o0 = 1800000L;
        this.f34991OooO0o = new a0(logDir, sailfishApmConfig.f34916OooO0oo);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0127 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:13:0x003a, B:18:0x004f, B:43:0x011f, B:45:0x0127, B:21:0x005e, B:27:0x00b8, B:29:0x00c0, B:33:0x00f0, B:35:0x00f8, B:39:0x0109, B:38:0x0102, B:32:0x00e9, B:48:0x0142, B:51:0x014e, B:24:0x0090), top: B:60:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object OooO00o(e0 e0Var, File file, Continuation continuation) {
        d0 d0Var;
        o0ooo0o0.o00OO0OO.OooO0OO part;
        o0o0Oo clientVersionBody;
        Object objUpload;
        o0o0Oo clientVersionBody2;
        ApmApi apmApi;
        e0 e0Var2 = e0Var;
        Objects.requireNonNull(e0Var);
        if (continuation instanceof d0) {
            d0Var = (d0) continuation;
            int i = d0Var.f34985OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0Var.f34985OoooO0 = i - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(e0Var2, continuation);
            }
        } else {
            d0Var = new d0(e0Var2, continuation);
        }
        Object obj = d0Var.f34981Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = d0Var.f34985OoooO0;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    o0o0Oo o0o0oo = d0Var.f34984Oooo0oo;
                    part = (o0ooo0o0.o00OO0OO.OooO0OO) d0Var.f34983Oooo0oO;
                    e0 e0Var3 = (e0) d0Var.f34982Oooo0o;
                    ResultKt.throwOnFailure(obj);
                    clientVersionBody = o0o0oo;
                    e0Var2 = e0Var3;
                    objUpload = obj;
                } else if (i2 == 2) {
                    clientVersionBody2 = (o0o0Oo) d0Var.f34983Oooo0oO;
                    part = (o0ooo0o0.o00OO0OO.OooO0OO) d0Var.f34982Oooo0o;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        apmApi = (ApmApi) o0oO0Ooo.f34946OooO0O0.getValue();
                        Intrinsics.checkNotNullExpressionValue(clientVersionBody2, "clientVersionBody");
                        Intrinsics.checkNotNullExpressionValue(part, "part");
                        d0Var.f34982Oooo0o = null;
                        d0Var.f34983Oooo0oO = null;
                        d0Var.f34985OoooO0 = 3;
                        if (apmApi.upload(clientVersionBody2, part, d0Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o00OO0O0.OooO00o oooO00o = o00OO0O0.f51401OooO0oO;
            o0o0Oo o0o0ooCreate = o0o0Oo.create(oooO00o.OooO0O0("application/json"), file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            part = o0ooo0o0.o00OO0OO.OooO0OO.f51419OooO0OO.OooO0O0("stream", StringsKt.removeSuffix(name, (CharSequence) "_"), o0o0ooCreate);
            clientVersionBody = o0o0Oo.create(oooO00o.OooO00o("text/plain"), e0Var2.f34987OooO00o.f34912OooO0Oo);
            ApmApi apmApiOooO00o = o0oO0Ooo.OooO00o();
            Intrinsics.checkNotNullExpressionValue(clientVersionBody, "clientVersionBody");
            Intrinsics.checkNotNullExpressionValue(part, "part");
            d0Var.f34982Oooo0o = e0Var2;
            d0Var.f34983Oooo0oO = part;
            d0Var.f34984Oooo0oo = clientVersionBody;
            d0Var.f34985OoooO0 = 1;
            objUpload = apmApiOooO00o.upload(clientVersionBody, part, d0Var);
            if (objUpload == coroutine_suspended) {
                return coroutine_suspended;
            }
            ResponseModel responseModel = (ResponseModel) objUpload;
            if (responseModel.getSuccess()) {
                Intrinsics.checkNotNullParameter("log uploaded successfully", "info");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(4, o0O0o000.f34970OooO0OO, "log uploaded successfully");
                }
            } else {
                String error = "log upload failed with " + responseModel.getCode() + ", and error msg is " + responseModel.getMessage();
                Intrinsics.checkNotNullParameter(error, "error");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, error);
                }
                if (responseModel.getCode() == 10201) {
                    Intrinsics.checkNotNullParameter("token expired, to refresh token", "error");
                    if (o0O0o000.f34971OooO0Oo) {
                        o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, "token expired, to refresh token");
                    }
                    o00OO0OO o00oo0oo = e0Var2.f34988OooO0O0;
                    d0Var.f34982Oooo0o = part;
                    d0Var.f34983Oooo0oO = clientVersionBody;
                    d0Var.f34984Oooo0oo = null;
                    d0Var.f34985OoooO0 = 2;
                    Object objOooO0OO = o00oo0oo.OooO0OO(d0Var);
                    if (objOooO0OO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0o0Oo o0o0oo2 = clientVersionBody;
                    obj = objOooO0OO;
                    clientVersionBody2 = o0o0oo2;
                    if (((Boolean) obj).booleanValue()) {
                        apmApi = (ApmApi) o0oO0Ooo.f34946OooO0O0.getValue();
                        Intrinsics.checkNotNullExpressionValue(clientVersionBody2, "clientVersionBody");
                        Intrinsics.checkNotNullExpressionValue(part, "part");
                        d0Var.f34982Oooo0o = null;
                        d0Var.f34983Oooo0oO = null;
                        d0Var.f34985OoooO0 = 3;
                        if (apmApi.upload(clientVersionBody2, part, d0Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            String error2 = th.toString();
            Intrinsics.checkNotNullParameter(error2, "error");
            if (o0O0o000.f34971OooO0Oo) {
                o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, error2);
            }
        }
        return Unit.INSTANCE;
    }
}
