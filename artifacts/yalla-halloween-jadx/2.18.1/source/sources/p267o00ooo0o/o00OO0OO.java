package p267o00ooo0o;

import android.content.SharedPreferences;
import com.common.support.apm.api.ApmApi;
import com.common.support.apm.model.ResponseModel;
import com.common.support.apm.model.TokenModel;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p268o00oooO.o0oO0Ooo;
import p272o00oooo0.o0O0o000;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0OO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static TokenModel f34924OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO000 f34925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f34926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f34927OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f34928OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f34929OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f34930OooO0o0;

    @DebugMetadata(c = "com.common.support.apm.TokenManager", f = "TokenManager.kt", i = {0}, l = {90, 115}, m = "login", n = {"this"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f34931Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00OO0OO f34932Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f34933Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34933Oooo0oO = obj;
            this.f34931Oooo |= Integer.MIN_VALUE;
            return o00OO0OO.this.OooO0O0(this);
        }
    }

    @DebugMetadata(c = "com.common.support.apm.TokenManager$login$2$1", f = "TokenManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TokenModel f34936Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TokenModel tokenModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f34936Oooo0oO = tokenModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o00OO0OO.this.new OooO0O0(this.f34936Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO0OO.OooO00o(o00OO0OO.this, this.f34936Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.common.support.apm.TokenManager", f = "TokenManager.kt", i = {}, l = {53, 66, 74}, m = "refreshTokenBoolean$apm_release", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f34937Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00OO0OO f34938Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f34939Oooo0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34939Oooo0oO = obj;
            this.f34937Oooo |= Integer.MIN_VALUE;
            return o00OO0OO.this.OooO0OO(this);
        }
    }

    @DebugMetadata(c = "com.common.support.apm.TokenManager$refreshTokenBoolean$2$1$1", f = "TokenManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TokenModel f34942Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TokenModel tokenModel, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f34942Oooo0oO = tokenModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o00OO0OO.this.new OooO0o(this.f34942Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO0OO.OooO00o(o00OO0OO.this, this.f34942Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    public o00OO0OO(@NotNull o00OO000 sailfishApmConfig) {
        Intrinsics.checkNotNullParameter(sailfishApmConfig, "sailfishApmConfig");
        this.f34925OooO00o = sailfishApmConfig;
        this.f34926OooO0O0 = "sailfish_apm";
        this.f34927OooO0OO = "access_tk";
        this.f34928OooO0Oo = "refresh_tk";
        this.f34930OooO0o0 = "tk_type";
        this.f34929OooO0o = "tk_expires";
    }

    public static final void OooO00o(o00OO0OO o00oo0oo, TokenModel tokenModel) {
        Objects.requireNonNull(o00oo0oo);
        f34924OooO0oO = tokenModel;
        SharedPreferences.Editor editorEdit = o00oo0oo.f34925OooO00o.f34909OooO00o.getSharedPreferences(o00oo0oo.f34926OooO0O0, 0).edit();
        editorEdit.putString(o00oo0oo.f34927OooO0OO, tokenModel.getAccessToken());
        editorEdit.putString(o00oo0oo.f34928OooO0Oo, tokenModel.getRefreshToken());
        editorEdit.putString(o00oo0oo.f34930OooO0o0, tokenModel.getTokenType());
        editorEdit.putString(o00oo0oo.f34929OooO0o, tokenModel.getExpiresIn());
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:12:0x0030, B:32:0x00eb, B:41:0x0118, B:35:0x00f2, B:17:0x0040, B:24:0x00c0, B:26:0x00c8, B:29:0x00d1, B:36:0x00f7, B:39:0x010f, B:20:0x004b), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object OooO0O0(Continuation<? super Boolean> continuation) {
        OooO00o oooO00o;
        boolean z;
        Object objOooO00o;
        o00OO0OO o00oo0oo;
        boolean zBooleanValue;
        Boolean boolBoxBoolean;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f34931Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f34931Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f34933Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f34931Oooo;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    o00OO0OO o00oo0oo2 = oooO00o.f34932Oooo0o;
                    ResultKt.throwOnFailure(obj);
                    o00oo0oo = o00oo0oo2;
                    objOooO00o = obj;
                    z = true;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    z = true;
                }
                boolBoxBoolean = Boxing.boxBoolean(z);
                if (boolBoxBoolean != null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            ResultKt.throwOnFailure(obj);
            ApmApi api = o0oO0Ooo.OooO00o();
            Intrinsics.checkNotNullExpressionValue(api, "api");
            o00OO0O0.OooO00o oooO00o2 = o00OO0O0.f51401OooO0oO;
            o0o0Oo o0o0ooCreate = o0o0Oo.create(oooO00o2.OooO00o("text/plain"), this.f34925OooO00o.f34910OooO0O0);
            Intrinsics.checkNotNullExpressionValue(o0o0ooCreate, "create(\n                    MediaType.get(\"text/plain\"),\n                    sailfishApmConfig.clientId\n                )");
            o0o0Oo o0o0ooCreate2 = o0o0Oo.create(oooO00o2.OooO00o("text/plain"), this.f34925OooO00o.f34911OooO0OO);
            Intrinsics.checkNotNullExpressionValue(o0o0ooCreate2, "create(\n                    MediaType.get(\"text/plain\"),\n                    sailfishApmConfig.clientName\n                )");
            o0o0Oo o0o0ooCreate3 = o0o0Oo.create(oooO00o2.OooO00o("text/plain"), this.f34925OooO00o.f34912OooO0Oo);
            Intrinsics.checkNotNullExpressionValue(o0o0ooCreate3, "create(\n                    MediaType.get(\"text/plain\"),\n                    sailfishApmConfig.clientVersion\n                )");
            o0o0Oo o0o0ooCreate4 = o0o0Oo.create(oooO00o2.OooO00o("text/plain"), this.f34925OooO00o.f34914OooO0o0);
            Intrinsics.checkNotNullExpressionValue(o0o0ooCreate4, "create(\n                    MediaType.get(\"text/plain\"),\n                    sailfishApmConfig.accessKey\n                )");
            o0o0Oo o0o0ooCreate5 = o0o0Oo.create(oooO00o2.OooO00o("text/plain"), this.f34925OooO00o.f34913OooO0o);
            Intrinsics.checkNotNullExpressionValue(o0o0ooCreate5, "create(\n                    MediaType.get(\"text/plain\"),\n                    sailfishApmConfig.deviceId\n                )");
            oooO00o.f34932Oooo0o = this;
            oooO00o.f34931Oooo = 1;
            z = true;
            objOooO00o = ApmApi.OooO0O0.OooO00o(api, o0o0ooCreate, o0o0ooCreate2, o0o0ooCreate3, o0o0ooCreate4, o0o0ooCreate5, null, null, oooO00o, 96, null);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00oo0oo = this;
            ResponseModel responseModel = (ResponseModel) objOooO00o;
            if (responseModel.getSuccess()) {
                TokenModel tokenModel = (TokenModel) responseModel.getData();
                if (tokenModel != null) {
                    f34924OooO0oO = tokenModel;
                    Dispatchers dispatchers = Dispatchers.INSTANCE;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    OooO0O0 oooO0O0 = o00oo0oo.new OooO0O0(tokenModel, null);
                    oooO00o.f34932Oooo0o = null;
                    oooO00o.f34931Oooo = 2;
                    if (BuildersKt.withContext(io2, oooO0O0, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    boolBoxBoolean = Boxing.boxBoolean(z);
                    if (boolBoxBoolean != null) {
                        zBooleanValue = boolBoxBoolean.booleanValue();
                    }
                    return Boxing.boxBoolean(zBooleanValue);
                }
            } else {
                String info = Intrinsics.stringPlus("login failed, error code is ", Boxing.boxInt(responseModel.getCode()));
                Intrinsics.checkNotNullParameter(info, "info");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(4, o0O0o000.f34970OooO0OO, info);
                }
            }
            zBooleanValue = false;
            return Boxing.boxBoolean(zBooleanValue);
        } catch (Throwable th) {
            String error = Intrinsics.stringPlus("login throws exception, error msg is ", th);
            Intrinsics.checkNotNullParameter(error, "error");
            if (o0O0o000.f34971OooO0Oo) {
                o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, error);
            }
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101 A[Catch: all -> 0x010a, TryCatch #0 {all -> 0x010a, blocks: (B:13:0x002e, B:48:0x00d4, B:54:0x00f9, B:58:0x0105, B:57:0x0101, B:17:0x003b, B:20:0x0042, B:30:0x0083, B:32:0x008c, B:35:0x0095, B:38:0x00ad, B:41:0x00b8, B:45:0x00c9, B:44:0x00c2, B:49:0x00db, B:52:0x00f1, B:23:0x0049, B:26:0x004f), top: B:67:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0OO(@NotNull Continuation<? super Boolean> continuation) {
        OooO0OO oooO0OO;
        o00OO0OO o00oo0oo;
        boolean zBooleanValue;
        Boolean boolBoxBoolean;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f34937Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f34937Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objRefreshToken = oooO0OO.f34939Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f34937Oooo;
        boolean zBooleanValue2 = true;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    o00oo0oo = oooO0OO.f34938Oooo0o;
                    ResultKt.throwOnFailure(objRefreshToken);
                } else if (i2 == 2) {
                    ResultKt.throwOnFailure(objRefreshToken);
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objRefreshToken);
                    zBooleanValue2 = ((Boolean) objRefreshToken).booleanValue();
                }
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue2);
                if (boolBoxBoolean == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            ResultKt.throwOnFailure(objRefreshToken);
            TokenModel tokenModel = f34924OooO0oO;
            if (tokenModel != null) {
                ApmApi apmApiOooO00o = o0oO0Ooo.OooO00o();
                o00OO0O0.OooO00o oooO00o = o00OO0O0.f51401OooO0oO;
                o0o0Oo o0o0ooCreate = o0o0Oo.create(oooO00o.OooO00o("text/plain"), this.f34925OooO00o.f34914OooO0o0);
                Intrinsics.checkNotNullExpressionValue(o0o0ooCreate, "create(\n                        MediaType.get(\"text/plain\"),\n                        sailfishApmConfig.accessKey\n                    )");
                o0o0Oo o0o0ooCreate2 = o0o0Oo.create(oooO00o.OooO00o("text/plain"), tokenModel.getRefreshToken());
                Intrinsics.checkNotNullExpressionValue(o0o0ooCreate2, "create(\n                        MediaType.get(\"text/plain\"),\n                        refreshToken\n                    )");
                oooO0OO.f34938Oooo0o = this;
                oooO0OO.f34937Oooo = 1;
                objRefreshToken = apmApiOooO00o.refreshToken(o0o0ooCreate, o0o0ooCreate2, oooO0OO);
                if (objRefreshToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0oo = this;
            }
            zBooleanValue = false;
            return Boxing.boxBoolean(zBooleanValue);
            ResponseModel responseModel = (ResponseModel) objRefreshToken;
            if (responseModel.getSuccess()) {
                TokenModel tokenModel2 = (TokenModel) responseModel.getData();
                if (tokenModel2 != null) {
                    f34924OooO0oO = tokenModel2;
                    Dispatchers dispatchers = Dispatchers.INSTANCE;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    OooO0o oooO0o = o00oo0oo.new OooO0o(tokenModel2, null);
                    oooO0OO.f34938Oooo0o = null;
                    oooO0OO.f34937Oooo = 2;
                    if (BuildersKt.withContext(io2, oooO0o, oooO0OO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (responseModel.getCode() == 10202) {
                Intrinsics.checkNotNullParameter("refresh token expired, so login", "info");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(4, o0O0o000.f34970OooO0OO, "refresh token expired, so login");
                }
                oooO0OO.f34938Oooo0o = null;
                oooO0OO.f34937Oooo = 3;
                objRefreshToken = o00oo0oo.OooO0O0(oooO0OO);
                if (objRefreshToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zBooleanValue2 = ((Boolean) objRefreshToken).booleanValue();
            } else {
                String info = Intrinsics.stringPlus("refresh token failed, error code is ", Boxing.boxInt(responseModel.getCode()));
                Intrinsics.checkNotNullParameter(info, "info");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(4, o0O0o000.f34970OooO0OO, info);
                }
                zBooleanValue2 = false;
            }
            boolBoxBoolean = Boxing.boxBoolean(zBooleanValue2);
            if (boolBoxBoolean == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        } catch (Throwable th) {
            String error = Intrinsics.stringPlus("refreshing token throws exception, the msg is \n", th);
            Intrinsics.checkNotNullParameter(error, "error");
            if (o0O0o000.f34971OooO0Oo) {
                o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, error);
            }
            return Boxing.boxBoolean(false);
        }
    }
}
