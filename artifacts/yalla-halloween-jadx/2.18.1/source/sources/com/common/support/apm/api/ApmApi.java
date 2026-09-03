package com.common.support.apm.api;

import com.common.support.apm.model.ResponseModel;
import com.common.support.apm.model.TokenModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OO0OO;
import p660o0ooo0o0.o0o0Oo;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0015J_\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/common/support/apm/api/ApmApi;", "", "Lo0ooo0o0/o0o0Oo;", "clientId", "clientName", "clientVersion", "accessKey", "deviceID", "deviceType", "platform", "Lcom/common/support/apm/model/ResponseModel;", "Lcom/common/support/apm/model/TokenModel;", "login", "(Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o0o0Oo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "(Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o0o0Oo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0ooo0o0/o00OO0OO$OooO0OO;", "filePart", "", "upload", "(Lo0ooo0o0/o0o0Oo;Lo0ooo0o0/o00OO0OO$OooO0OO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OooO00o", "apm_release"}, k = 1, mv = {1, 5, 1})
public interface ApmApi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f12652OooO00o = 0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f12653OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static String f12654OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static o00OO f12655OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public static String f12656OooO0Oo = "";
    }

    public static final class OooO0O0 {
        public static Object OooO00o(ApmApi apmApi, o0o0Oo o0o0oo, o0o0Oo o0o0oo2, o0o0Oo o0o0oo3, o0o0Oo o0o0oo4, o0o0Oo o0o0oo5, o0o0Oo o0o0oo6, o0o0Oo o0o0oo7, Continuation continuation, int i, Object obj) {
            o00OO0O0.OooO00o oooO00o = o00OO0O0.f51401OooO0oO;
            o0o0Oo o0o0ooCreate = o0o0Oo.create(oooO00o.OooO00o("text/plain"), "android");
            Intrinsics.checkNotNullExpressionValue(o0o0ooCreate, "create(\n            MediaType.get(\"text/plain\"),\n            DEVICE_TYPE\n        )");
            o0o0Oo o0o0ooCreate2 = o0o0Oo.create(oooO00o.OooO00o("text/plain"), "app");
            Intrinsics.checkNotNullExpressionValue(o0o0ooCreate2, "create(\n            MediaType.get(\"text/plain\"),\n            PLATFORM_TYPE\n        )");
            return apmApi.login(o0o0oo, o0o0oo2, o0o0oo3, o0o0oo4, o0o0oo5, o0o0ooCreate, o0o0ooCreate2, continuation);
        }
    }

    @POST("yallagatewayservice/userlogin/v1.0/elklogin")
    @Nullable
    @Multipart
    Object login(@NotNull @Part("ClientId") o0o0Oo o0o0oo, @NotNull @Part("ClientName") o0o0Oo o0o0oo2, @NotNull @Part("ClientVersion") o0o0Oo o0o0oo3, @NotNull @Part("AccessKey") o0o0Oo o0o0oo4, @NotNull @Part("DeviceID") o0o0Oo o0o0oo5, @NotNull @Part("DeviceType") o0o0Oo o0o0oo6, @NotNull @Part("PlatformType") o0o0Oo o0o0oo7, @NotNull Continuation<? super ResponseModel<TokenModel>> continuation);

    @POST("yallagatewayservice/userlogin/v1.0/elkrefreshtoken")
    @Nullable
    @Multipart
    Object refreshToken(@NotNull @Part("AccessKey") o0o0Oo o0o0oo, @NotNull @Part("RefreshToken") o0o0Oo o0o0oo2, @NotNull Continuation<? super ResponseModel<TokenModel>> continuation);

    @POST("yallasystem_communicateservice/elkfile/v1.0/uploadclientelkxlogfile")
    @Nullable
    @Multipart
    Object upload(@NotNull @Part("ClientVersion") o0o0Oo o0o0oo, @NotNull @Part o00OO0OO.OooO0OO oooO0OO, @NotNull Continuation<? super ResponseModel<String>> continuation);
}
