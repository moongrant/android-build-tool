package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.MainApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.SmsCodeModel;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0Oo0oo;
import p498o0o00Oo0.o00O00OO;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;
import p617o0oo0o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0000O extends o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000O f42365OooO00o = new o0000O();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {79}, m = "loginByPhone", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42366Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42368Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42366Oooo0o = obj;
            this.f42368Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO0o0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {53}, m = "checkPhoneRegister", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42369Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42371Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42369Oooo0o = obj;
            this.f42371Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO00o(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {110}, m = "checkVerCodeSendType", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42372Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42374Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42372Oooo0o = obj;
            this.f42374Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO0O0(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {19}, m = "loginByFacebook", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42375Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42377Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42375Oooo0o = obj;
            this.f42377Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO0OO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {38}, m = "loginByInstagram", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42378Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42380Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42378Oooo0o = obj;
            this.f42380Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO0Oo(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {16}, m = "loginByTourists", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42381Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42383Oooo0oo;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42381Oooo0o = obj;
            this.f42383Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {24}, m = "loginByTwitter", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42384Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42386Oooo0oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42384Oooo0o = obj;
            this.f42386Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO0oO(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {48}, m = "loginByYallaChat", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42387Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42389Oooo0oo;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42387Oooo0o = obj;
            this.f42389Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {34}, m = "loginByWeChat", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42390Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42392Oooo0oo;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42390Oooo0o = obj;
            this.f42392Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooO0oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {99}, m = "phoneChange", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42393Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42395Oooo0oo;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42393Oooo0o = obj;
            this.f42395Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooOO0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {65}, m = "registerByPhone", n = {}, s = {})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42396Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42398Oooo0oo;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42396Oooo0o = obj;
            this.f42398Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooOO0o(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {82}, m = "protectionLoginByPhone", n = {}, s = {})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42399Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42401Oooo0oo;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42399Oooo0o = obj;
            this.f42401Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooOO0O(null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {76}, m = "userResetPassword", n = {}, s = {})
    public static final class Oooo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42402Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42404Oooo0oo;

        public Oooo0(Continuation<? super Oooo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42402Oooo0o = obj;
            this.f42404Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooOOO(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {86}, m = "sendPhoneSmsCode", n = {}, s = {})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42405Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42407Oooo0oo;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42405Oooo0o = obj;
            this.f42407Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooOOO0(null, null, 0, 0, 0, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {106}, m = "userUnblockAppeal", n = {}, s = {})
    public static final class o000oOoO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42408Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42410Oooo0oo;

        public o000oOoO(Continuation<? super o000oOoO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42408Oooo0o = obj;
            this.f42410Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooOOOO(0L, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {103}, m = "verCode", n = {}, s = {})
    public static final class o0OoOo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42411Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42413Oooo0oo;

        public o0OoOo0(Continuation<? super o0OoOo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42411Oooo0o = obj;
            this.f42413Oooo0oo |= Integer.MIN_VALUE;
            return o0000O.this.OooOOOo(null, null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginModel>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f42389Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f42389Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        Object objYallaChatLogin = oooOOO.f42387Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f42389Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objYallaChatLogin);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o = o0Oo0oo.OooO00o();
                String strOooO00o2 = oo000o.OooO00o();
                oooOOO.f42389Oooo0oo = 1;
                objYallaChatLogin = mainApiServiceOooO0OO.yallaChatLogin(str, strOooO00o, strOooO00o2, oooOOO);
                if (objYallaChatLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objYallaChatLogin);
            }
            return objYallaChatLogin;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<Boolean>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42371Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42371Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0O0 = oooO00o.f42369Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42371Oooo0oo;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objOooO0O0);
                o0o0000.OooO00o oooO00o2 = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO00o.f42371Oooo0oo = 1;
                objOooO0O0 = mainApiServiceOooO0OO.checkPhoneRegister(str, str2, oooO00o);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
            }
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
        }
        ApiResult apiResult = (ApiResult) objOooO0O0;
        if (apiResult.isSuccess()) {
            apiResult.setData(Boxing.boxBoolean(false));
        } else if (apiResult.getCode() == 1011) {
            apiResult.setCode(1000);
            apiResult.setData(Boxing.boxBoolean(true));
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0O0(@NotNull String str, int i, @NotNull Continuation<? super ApiResult<Integer>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f42374Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42374Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object phoneCodeSendType = oooO0O0.f42372Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f42374Oooo0oo;
        String str2 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(phoneCodeSendType);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO0O0.f42374Oooo0oo = 1;
                phoneCodeSendType = mainApiServiceOooO0OO.getPhoneCodeSendType(i, str, oooO0O0);
                if (phoneCodeSendType == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(phoneCodeSendType);
            }
            return phoneCodeSendType;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0OO(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f42377Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42377Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objFbLogin = oooO0OO.f42375Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f42377Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFbLogin);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o = o0Oo0oo.OooO00o();
                String strOooO00o2 = oo000o.OooO00o();
                oooO0OO.f42377Oooo0oo = 1;
                objFbLogin = mainApiServiceOooO0OO.fbLogin(strOooO00o, str, strOooO00o2, oooO0OO);
                if (objFbLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFbLogin);
            }
            return objFbLogin;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0Oo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f42380Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f42380Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        OooO0o oooO0o2 = oooO0o;
        Object objInstagramLogin = oooO0o2.f42378Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o2.f42380Oooo0oo;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInstagramLogin);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o = o0Oo0oo.OooO00o();
                String strOooO00o2 = oo000o.OooO00o();
                oooO0o2.f42380Oooo0oo = 1;
                objInstagramLogin = mainApiServiceOooO0OO.instagramLogin(str, str2, strOooO00o, strOooO00o2, oooO0o2);
                if (objInstagramLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInstagramLogin);
            }
            return objInstagramLogin;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginModel>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f42383Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f42383Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objUserDevcieRegister = oooOO1.f42381Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f42383Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserDevcieRegister);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o = o0Oo0oo.OooO00o();
                oooOO1.f42383Oooo0oo = 1;
                objUserDevcieRegister = mainApiServiceOooO0OO.userDevcieRegister(strOooO00o, str, oooOO1);
                if (objUserDevcieRegister == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserDevcieRegister);
            }
            return objUserDevcieRegister;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f42368Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f42368Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objUserLogin = oooO.f42366Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f42368Oooo0oo;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserLogin);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                String strOooO00o = p516o0o0O000.o000oOoO.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(password)");
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o2 = o0Oo0oo.OooO00o();
                oooO.f42368Oooo0oo = 1;
                objUserLogin = mainApiServiceOooO0OO.userLogin(str, strOooO00o, strOooO00o2, oooO);
                if (objUserLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserLogin);
            }
            return objUserLogin;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oO(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f42386Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f42386Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        OooOO0O oooOO0O2 = oooOO0O;
        Object objTwitterLogin = oooOO0O2.f42384Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O2.f42386Oooo0oo;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objTwitterLogin);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o = o0Oo0oo.OooO00o();
                String strOooO00o2 = oo000o.OooO00o();
                oooOO0O2.f42386Oooo0oo = 1;
                objTwitterLogin = mainApiServiceOooO0OO.twitterLogin(strOooO00o, str, str2, strOooO00o2, oooOO0O2);
                if (objTwitterLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objTwitterLogin);
            }
            return objTwitterLogin;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oo(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f42392Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f42392Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object objWeChatLogin = oooOOO0.f42390Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO0.f42392Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWeChatLogin);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o = o0Oo0oo.OooO00o();
                String strOooO00o2 = oo000o.OooO00o();
                oooOOO0.f42392Oooo0oo = 1;
                objWeChatLogin = mainApiServiceOooO0OO.weChatLogin(str, strOooO00o, strOooO00o2, oooOOO0);
                if (objWeChatLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWeChatLogin);
            }
            return objWeChatLogin;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOO0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i = oooOOOO.f42395Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f42395Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        OooOOOO oooOOOO2 = oooOOOO;
        Object objOooO0OO = oooOOOO2.f42393Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOOO2.f42395Oooo0oo;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objOooO0OO);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooOOOO2.f42395Oooo0oo = 1;
                objOooO0OO = MainApiService.OooO00o.OooO0OO(mainApiServiceOooO0OO, str, str2, null, null, null, oooOOOO2, 28, null);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0OO);
            }
            return objOooO0OO;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOO0O(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super ApiResult<LoginModel>> continuation) {
        OooOo00 oooOo00;
        String str3;
        if (continuation instanceof OooOo00) {
            oooOo00 = (OooOo00) continuation;
            int i2 = oooOo00.f42401Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOo00.f42401Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        OooOo00 oooOo01 = oooOo00;
        Object objOooO0Oo = oooOo01.f42399Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOo01.f42401Oooo0oo;
        String str4 = "";
        String str5 = "gson.toJson(model) ?: \"\"";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objOooO0Oo);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooOo01.f42401Oooo0oo = 1;
                str3 = "gson.toJson(model) ?: \"\"";
                str5 = null;
                try {
                    objOooO0Oo = MainApiService.OooO00o.OooO0Oo(mainApiServiceOooO0OO, str, str2, i, null, null, null, oooOo01, 56, null);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str3);
                        str4 = strOooO0oo;
                    }
                    Object objOooO0O0 = o0OOO0o.OooO0O0(str4, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    ApiError apiError = new ApiError(3, "canceled");
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str3);
                        str4 = strOooO0oo2;
                    }
                    Object objOooO0O1 = o0OOO0o.OooO0O0(str4, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O1);
                    return objOooO0O1;
                } catch (Exception e2) {
                    e = e2;
                    o00O00.OooO0o0("WebAPIException", e.getMessage());
                    e.printStackTrace();
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getName();
                    }
                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                    ApiError apiError2 = new ApiError(2, message);
                    o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str3);
                        str4 = strOooO0oo3;
                    }
                    Object objOooO0O2 = o0OOO0o.OooO0O0(str4, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0Oo);
            }
            return objOooO0Oo;
        } catch (IOException e3) {
            e = e3;
            str3 = str5;
        } catch (CancellationException unused2) {
            str3 = str5;
        } catch (Exception e4) {
            e = e4;
            str3 = str5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooOO0o(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooOo oooOo;
        if (continuation instanceof OooOo) {
            oooOo = (OooOo) continuation;
            int i = oooOo.f42398Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f42398Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        OooOo oooOo2 = oooOo;
        Object objUserSmRegister = oooOo2.f42396Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo2.f42398Oooo0oo;
        String str4 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserSmRegister);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                String strOooO00o = p516o0o0O000.o000oOoO.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(password)");
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o2 = o0Oo0oo.OooO00o();
                String strOooO00o3 = oo000o.OooO00o();
                oooOo2.f42398Oooo0oo = 1;
                objUserSmRegister = mainApiServiceOooO0OO.userSmRegister(str, strOooO00o, str3, strOooO00o2, strOooO00o3, oooOo2);
                if (objUserSmRegister == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserSmRegister);
            }
            return objUserSmRegister;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        Oooo0 oooo0;
        String str4;
        if (continuation instanceof Oooo0) {
            oooo0 = (Oooo0) continuation;
            int i = oooo0.f42404Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f42404Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(continuation);
            }
        } else {
            oooo0 = new Oooo0(continuation);
        }
        Oooo0 oooo1 = oooo0;
        Object objOooO0oO = oooo1.f42402Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo1.f42404Oooo0oo;
        String str5 = "";
        String str6 = "gson.toJson(model) ?: \"\"";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objOooO0oO);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                String strOooO00o = p516o0o0O000.o000oOoO.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(password)");
                oooo1.f42404Oooo0oo = 1;
                str4 = "gson.toJson(model) ?: \"\"";
                str6 = null;
                try {
                    objOooO0oO = MainApiService.OooO00o.OooO0oO(mainApiServiceOooO0OO, str, strOooO00o, str3, null, null, null, oooo1, 56, null);
                    if (objOooO0oO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str4);
                        str5 = strOooO0oo;
                    }
                    Object objOooO0O0 = o0OOO0o.OooO0O0(str5, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    ApiError apiError = new ApiError(3, "canceled");
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str4);
                        str5 = strOooO0oo2;
                    }
                    Object objOooO0O1 = o0OOO0o.OooO0O0(str5, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O1);
                    return objOooO0O1;
                } catch (Exception e2) {
                    e = e2;
                    o00O00.OooO0o0("WebAPIException", e.getMessage());
                    e.printStackTrace();
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getName();
                    }
                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                    ApiError apiError2 = new ApiError(2, message);
                    o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str4);
                        str5 = strOooO0oo3;
                    }
                    Object objOooO0O2 = o0OOO0o.OooO0O0(str5, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0oO);
            }
            return objOooO0oO;
        } catch (IOException e3) {
            e = e3;
            str4 = str6;
        } catch (CancellationException unused2) {
            str4 = str6;
        } catch (Exception e4) {
            e = e4;
            str4 = str6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOO0(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @Nullable String str3, @NotNull Continuation<? super ApiResult<SmsCodeModel>> continuation) {
        Oooo000 oooo000;
        String str4;
        if (continuation instanceof Oooo000) {
            oooo000 = (Oooo000) continuation;
            int i4 = oooo000.f42407Oooo0oo;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oooo000.f42407Oooo0oo = i4 - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Oooo000 oooo001 = oooo000;
        Object objSendPhoneCode = oooo001.f42405Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = oooo001.f42407Oooo0oo;
        String str5 = "";
        String str6 = "gson.toJson(model) ?: \"\"";
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(objSendPhoneCode);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                String strOooO00o = o0Oo0oo.OooO00o();
                String strOooO0OO = p168o00Ooo0.OooOOOO.OooO0OO(str2 + '|' + str + '|' + i);
                Intrinsics.checkNotNullExpressionValue(strOooO0OO, "encode(\"$countryCode|$phone|$type\")");
                oooo001.f42407Oooo0oo = 1;
                str4 = "gson.toJson(model) ?: \"\"";
                str6 = str3;
                try {
                    objSendPhoneCode = mainApiServiceOooO0OO.sendPhoneCode(str, str2, i, i2, strOooO00o, strOooO0OO, i3, str6, oooo001);
                    if (objSendPhoneCode == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str4);
                        str5 = strOooO0oo;
                    }
                    Object objOooO0O0 = o0OOO0o.OooO0O0(str5, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    ApiError apiError = new ApiError(3, "canceled");
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str4);
                        str5 = strOooO0oo2;
                    }
                    Object objOooO0O1 = o0OOO0o.OooO0O0(str5, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O1);
                    return objOooO0O1;
                } catch (Exception e2) {
                    e = e2;
                    o00O00.OooO0o0("WebAPIException", e.getMessage());
                    e.printStackTrace();
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getName();
                    }
                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                    ApiError apiError2 = new ApiError(2, message);
                    o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str4);
                        str5 = strOooO0oo3;
                    }
                    Object objOooO0O2 = o0OOO0o.OooO0O0(str5, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendPhoneCode);
            }
            return objSendPhoneCode;
        } catch (IOException e3) {
            e = e3;
            str4 = str6;
        } catch (CancellationException unused2) {
            str4 = str6;
        } catch (Exception e4) {
            e = e4;
            str4 = str6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOOOO(long j, @NotNull String str, @NotNull Continuation<? super ApiResult<String>> continuation) {
        o000oOoO o000oooo2;
        if (continuation instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) continuation;
            int i = o000oooo2.f42410Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f42410Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(continuation);
            }
        } else {
            o000oooo2 = new o000oOoO(continuation);
        }
        Object objUserUnblockAppeal = o000oooo2.f42408Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000oooo2.f42410Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserUnblockAppeal);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                String strOooO0O0 = p516o0o0O000.o000oOoO.OooO0O0(str);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(reason)");
                o000oooo2.f42410Oooo0oo = 1;
                objUserUnblockAppeal = mainApiServiceOooO0OO.userUnblockAppeal(j, strOooO0O0, o000oooo2);
                if (objUserUnblockAppeal == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserUnblockAppeal);
            }
            return objUserUnblockAppeal;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOOOo(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        o0OoOo0 o0oooo1;
        if (continuation instanceof o0OoOo0) {
            o0oooo1 = (o0OoOo0) continuation;
            int i2 = o0oooo1.f42413Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0oooo1.f42413Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o0oooo1 = new o0OoOo0(continuation);
            }
        } else {
            o0oooo1 = new o0OoOo0(continuation);
        }
        Object objVerCode = o0oooo1.f42411Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o0oooo1.f42413Oooo0oo;
        String str3 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objVerCode);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                o0oooo1.f42413Oooo0oo = 1;
                objVerCode = mainApiServiceOooO0OO.verCode(str, str2, i, o0oooo1);
                if (objVerCode == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objVerCode);
            }
            return objVerCode;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }
}
