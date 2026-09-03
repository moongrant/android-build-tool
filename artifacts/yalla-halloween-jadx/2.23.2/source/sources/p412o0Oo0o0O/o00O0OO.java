package p412o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.SmsCodeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o00oO0o;
import p386o0OOooO.o000000;
import p475o0Ooooo0.oO0O00o0;
import p590o0oOooo0.oO0oO000;
import p590o0oOooo0.oOO0O0O;
import p590o0oOooo0.oOO0OOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLoginRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginRepo.kt\ncom/yalla/yalla/data/repository/LoginRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 4 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,151:1\n18#2,7:152\n25#2,10:160\n18#2,7:170\n25#2,10:178\n18#2,7:188\n25#2,10:196\n18#2,7:206\n25#2,10:214\n18#2,7:224\n25#2,10:232\n18#2,7:242\n25#2,10:250\n18#2,7:260\n25#2,10:268\n18#2,7:278\n25#2,10:286\n18#2,7:296\n25#2,10:304\n18#2,7:314\n25#2,10:322\n18#2,7:332\n25#2,10:340\n18#2,7:350\n25#2,10:358\n18#2,7:368\n25#2,10:376\n18#2,7:386\n25#2,10:394\n18#2,7:404\n25#2,10:412\n18#2,7:422\n25#2,10:430\n109#3:159\n109#3:177\n109#3:195\n109#3:213\n109#3:231\n109#3:249\n109#3:267\n109#3:285\n109#3:303\n109#3:321\n109#3:339\n109#3:357\n109#3:375\n109#3:393\n109#3:411\n109#3:429\n62#4:440\n62#4:441\n*S KotlinDebug\n*F\n+ 1 LoginRepo.kt\ncom/yalla/yalla/data/repository/LoginRepo\n*L\n26#1:152,7\n26#1:160,10\n31#1:170,7\n31#1:178,10\n45#1:188,7\n45#1:196,10\n56#1:206,7\n56#1:214,10\n59#1:224,7\n59#1:232,10\n69#1:242,7\n69#1:250,10\n75#1:260,7\n75#1:268,10\n86#1:278,7\n86#1:286,10\n98#1:296,7\n98#1:304,10\n101#1:314,7\n101#1:322,10\n104#1:332,7\n104#1:340,10\n107#1:350,7\n107#1:358,10\n123#1:368,7\n123#1:376,10\n127#1:386,7\n127#1:394,10\n130#1:404,7\n130#1:412,10\n133#1:422,7\n133#1:430,10\n26#1:159\n31#1:177\n45#1:195\n56#1:213\n59#1:231\n69#1:249\n75#1:267\n86#1:285\n98#1:303\n101#1:321\n104#1:339\n107#1:357\n123#1:375\n127#1:393\n130#1:411\n133#1:429\n144#1:440\n150#1:441\n*E\n"})
public final class o00O0OO extends oO0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0OO f46099OooO00o = new o00O0OO();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {26}, m = "loginByTourists", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46100OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46101OooO0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46100OooO0Oo = obj;
            this.f46101OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {75}, m = "checkPhoneRegister", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46103OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46104OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46103OooO0Oo = obj;
            this.f46104OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO00o(null, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {32}, m = "loginByFacebook", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46106OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46107OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46106OooO0Oo = obj;
            this.f46107OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO0OO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {60}, m = "loginByInstagram", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46109OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46110OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46109OooO0Oo = obj;
            this.f46110OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO0Oo(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {101}, m = "loginByPhone", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46112OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46113OooO0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46112OooO0Oo = obj;
            this.f46113OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO0o0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {46}, m = "loginByTwitter", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46115OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46116OooO0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46115OooO0Oo = obj;
            this.f46116OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO0oO(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {56}, m = "loginByWeChat", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46118OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46119OooO0o;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46118OooO0Oo = obj;
            this.f46119OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO0oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {123}, m = "phoneChange", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46121OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46122OooO0o;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46121OooO0Oo = obj;
            this.f46122OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooOO0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {70}, m = "loginByYallaChat", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46124OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46125OooO0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46124OooO0Oo = obj;
            this.f46125OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {104}, m = "protectionLoginByPhone", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46127OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46128OooO0o;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46127OooO0Oo = obj;
            this.f46128OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooOO0O(null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {108}, m = "sendPhoneSmsCode", n = {}, s = {})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46130OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46131OooO0o;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46130OooO0Oo = obj;
            this.f46131OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooOOO0(null, null, 0, 0, 0, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {87}, m = "registerByPhone", n = {}, s = {})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46133OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46134OooO0o;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46133OooO0Oo = obj;
            this.f46134OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooOO0o(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED}, m = "userUnblockAppeal", n = {}, s = {})
    public static final class Oooo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46136OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46137OooO0o;

        public Oooo0(Continuation<? super Oooo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46136OooO0Oo = obj;
            this.f46137OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooOOOO(0L, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {98}, m = "userResetPassword", n = {}, s = {})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46139OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46140OooO0o;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46139OooO0Oo = obj;
            this.f46140OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooOOO(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {127}, m = "verCode", n = {}, s = {})
    public static final class o000oOoO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46142OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46143OooO0o;

        public o000oOoO(Continuation<? super o000oOoO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46142OooO0Oo = obj;
            this.f46143OooO0o |= Integer.MIN_VALUE;
            return o00O0OO.this.OooOOOo(null, null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginModel>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f46125OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f46125OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object objYallaChatLogin = oooOOO0.f46124OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO0.f46125OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objYallaChatLogin);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = o000000.OooO00o();
                String strOooO0OO = oOO0O0O.OooO0OO();
                oooOOO0.f46125OooO0o = 1;
                objYallaChatLogin = mainApiServiceOooO00o.yallaChatLogin(str, strOooO00o, strOooO0OO, oooOOO0);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @NotNull Continuation<? super ApiResult<Boolean>> continuation) {
        OooO00o oooO00o;
        IOException iOException;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f46104OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f46104OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        OooO00o oooO00o2 = oooO00o;
        Object objOooO0OO = oooO00o2.f46103OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o2.f46104OooO0o;
        boolean z = true;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(objOooO0OO);
                    try {
                        MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                        oooO00o2.f46104OooO0o = 1;
                        objOooO0OO = mainApiServiceOooO00o.checkPhoneRegister(str, str2, str3, i, oooO00o2);
                        if (objOooO0OO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (IOException e) {
                        iOException = e;
                        String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", iOException, 1, "time out", null, 4, null));
                        objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
                        Intrinsics.checkNotNull(objOooO0OO);
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objOooO0OO);
                }
            } catch (IOException e2) {
                iOException = e2;
            }
        } catch (CancellationException e3) {
            z = true;
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e3, 3, "canceled", null, 4, null));
            objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO);
        } catch (Exception e4) {
            o0000O00.OooO0o0("WebAPIException", e4.getMessage(), e4);
            String message = e4.getMessage();
            String name = message == null ? e4.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO);
        }
        z = true;
        ApiResult apiResult = (ApiResult) objOooO0OO;
        if (apiResult.isSuccess()) {
            apiResult.setData(Boxing.boxBoolean(false));
        } else if (apiResult.getCode() == 1011) {
            apiResult.setCode(1000);
            apiResult.setData(Boxing.boxBoolean(z));
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0O0(int i, @NotNull String str, @NotNull Continuation continuation) {
        o00O0OOO o00o0ooo2;
        if (continuation instanceof o00O0OOO) {
            o00o0ooo2 = (o00O0OOO) continuation;
            int i2 = o00o0ooo2.f46149OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o00o0ooo2.f46149OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                o00o0ooo2 = new o00O0OOO(this, continuation);
            }
        } else {
            o00o0ooo2 = new o00O0OOO(this, continuation);
        }
        Object phoneCodeSendType = o00o0ooo2.f46148OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o00o0ooo2.f46149OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(phoneCodeSendType);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                o00o0ooo2.f46149OooO0o = 1;
                phoneCodeSendType = mainApiServiceOooO00o.getPhoneCodeSendType(i, str, o00o0ooo2);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0OO(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f46107OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f46107OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object objFbLogin = oooO0O1.f46106OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O1.f46107OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFbLogin);
                String strOooO0O0 = oOO0O0O.OooO0O0(o000O00O.OooO00o());
                String strOooO00o = oOO0O0O.OooO00o();
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o2 = o000000.OooO00o();
                String strOooO0OO = oOO0O0O.OooO0OO();
                if (strOooO0O0 == null) {
                    strOooO0O0 = "";
                }
                String str2 = strOooO00o == null ? "" : strOooO00o;
                oooO0O1.f46107OooO0o = 1;
                objFbLogin = mainApiServiceOooO00o.fbLogin(strOooO00o2, str, strOooO0OO, strOooO0O0, str2, oooO0O1);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            if (strOooO0oo == null) {
                strOooO0oo = "";
            }
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo);
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            if (strOooO0oo2 == null) {
                strOooO0oo2 = "";
            }
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2);
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            if (strOooO0oo3 == null) {
                strOooO0oo3 = "";
            }
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3);
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0Oo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f46110OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f46110OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object objInstagramLogin = oooO0OO2.f46109OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO2.f46110OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInstagramLogin);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = o000000.OooO00o();
                String strOooO0OO = oOO0O0O.OooO0OO();
                oooO0OO2.f46110OooO0o = 1;
                objInstagramLogin = mainApiServiceOooO00o.instagramLogin(str, str2, strOooO00o, strOooO0OO, oooO0OO2);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginModel>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f46101OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f46101OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objUserDevcieRegister = oooO.f46100OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f46101OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserDevcieRegister);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = o000000.OooO00o();
                oooO.f46101OooO0o = 1;
                objUserDevcieRegister = mainApiServiceOooO00o.userDevcieRegister(strOooO00o, str, oooO);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f46113OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f46113OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objUserLogin = oooO0o.f46112OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f46113OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserLogin);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = oOO0OOO.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(...)");
                String strOooO00o2 = o000000.OooO00o();
                oooO0o.f46113OooO0o = 1;
                objUserLogin = mainApiServiceOooO00o.userLogin(str, strOooO00o, strOooO00o2, oooO0o);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0oO(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f46116OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f46116OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        OooOO0 oooOO2 = oooOO1;
        Object objTwitterLogin = oooOO2.f46115OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO2.f46116OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objTwitterLogin);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = o000000.OooO00o();
                String strOooO0OO = oOO0O0O.OooO0OO();
                oooOO2.f46116OooO0o = 1;
                objTwitterLogin = mainApiServiceOooO00o.twitterLogin(strOooO00o, str, str2, strOooO0OO, oooOO2);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0oo(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f46119OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f46119OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objWeChatLogin = oooOO0O.f46118OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f46119OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWeChatLogin);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = o000000.OooO00o();
                String strOooO0OO = oOO0O0O.OooO0OO();
                oooOO0O.f46119OooO0o = 1;
                objWeChatLogin = mainApiServiceOooO00o.weChatLogin(str, strOooO00o, strOooO0OO, oooOO0O);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f46122OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f46122OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        Object objPhoneChange = oooOOO.f46121OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f46122OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPhoneChange);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                oooOOO.f46122OooO0o = 1;
                objPhoneChange = mainApiServiceOooO00o.phoneChange(str, str2, o000000.OooO0O0(), o000000.OooO0OO(), o000000.OooO0Oo(), oooOOO);
                if (objPhoneChange == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPhoneChange);
            }
            return objPhoneChange;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0O(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super ApiResult<LoginModel>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i2 = oooOOOO.f46128OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOOO.f46128OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        Object objPhoneSaleLogin = oooOOOO.f46127OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOOOO.f46128OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objPhoneSaleLogin);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                oooOOOO.f46128OooO0o = 1;
                objPhoneSaleLogin = mainApiServiceOooO00o.phoneSaleLogin(str, str2, i, o000000.OooO0O0(), o000000.OooO0OO(), o000000.OooO0Oo(), oooOOOO);
                if (objPhoneSaleLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPhoneSaleLogin);
            }
            return objPhoneSaleLogin;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0o(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooOo00 oooOo00;
        if (continuation instanceof OooOo00) {
            oooOo00 = (OooOo00) continuation;
            int i = oooOo00.f46134OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f46134OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        OooOo00 oooOo01 = oooOo00;
        Object objUserSmRegister = oooOo01.f46133OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo01.f46134OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserSmRegister);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = oOO0OOO.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(...)");
                String strOooO00o2 = o000000.OooO00o();
                String strOooO0OO = oOO0O0O.OooO0OO();
                oooOo01.f46134OooO0o = 1;
                objUserSmRegister = mainApiServiceOooO00o.userSmRegister(str, strOooO00o, str3, strOooO00o2, strOooO0OO, oooOo01);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOOO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        Oooo000 oooo000;
        if (continuation instanceof Oooo000) {
            oooo000 = (Oooo000) continuation;
            int i = oooo000.f46140OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f46140OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Object objUserSmRetrievePwd = oooo000.f46139OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo000.f46140OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserSmRetrievePwd);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = oOO0OOO.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(...)");
                oooo000.f46140OooO0o = 1;
                objUserSmRetrievePwd = mainApiServiceOooO00o.userSmRetrievePwd(str, strOooO00o, str3, o000000.OooO0O0(), o000000.OooO0OO(), o000000.OooO0Oo(), oooo000);
                if (objUserSmRetrievePwd == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserSmRetrievePwd);
            }
            return objUserSmRetrievePwd;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Class<com.yalla.yalla.model.http.ApiResult>] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Nullable
    public final Object OooOOO0(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @Nullable String str3, @Nullable String str4, int i4, @NotNull Continuation<? super ApiResult<SmsCodeModel>> continuation) {
        OooOo oooOo;
        String str5;
        ?? r3;
        if (continuation instanceof OooOo) {
            oooOo = (OooOo) continuation;
            int i5 = oooOo.f46131OooO0o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oooOo.f46131OooO0o = i5 - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        OooOo oooOo2 = oooOo;
        Object objSendPhoneCode = oooOo2.f46130OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = oooOo2.f46131OooO0o;
        ?? r14 = ApiResult.class;
        String str6 = "WebAPIException";
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(objSendPhoneCode);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO00o = o000000.OooO00o();
                String strBase64EncodeToString = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(str2 + "|" + str + "|" + i, oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, (String) null, 4, (Object) null));
                oooOo2.f46131OooO0o = 1;
                str5 = "WebAPIException";
                str6 = str4;
                r3 = r14;
                int i7 = i4;
                try {
                    objSendPhoneCode = mainApiServiceOooO00o.sendPhoneCode(str, str2, i, i2, strOooO00o, strBase64EncodeToString, i3, str3, str6, i7, oooOo2);
                    r14 = i7;
                    if (objSendPhoneCode == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o(str5, "time out ", e, 1, "time out", null, 4, null));
                    if (strOooO0oo == null) {
                        strOooO0oo = "";
                    }
                    Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(r3, strOooO0oo);
                    Intrinsics.checkNotNull(objOooO0OO);
                    return objOooO0OO;
                } catch (CancellationException e2) {
                    e = e2;
                    String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo(str5, "canceled ", e, 3, "canceled", null, 4, null));
                    if (strOooO0oo2 == null) {
                        strOooO0oo2 = "";
                    }
                    Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(r3, strOooO0oo2);
                    Intrinsics.checkNotNull(objOooO0OO2);
                    return objOooO0OO2;
                } catch (Exception e3) {
                    e = e3;
                    o0000O00.OooO0o0(str5, e.getMessage(), e);
                    String message = e.getMessage();
                    String name = message == null ? e.getClass().getName() : message;
                    Intrinsics.checkNotNull(name);
                    String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
                    if (strOooO0oo3 == null) {
                        strOooO0oo3 = "";
                    }
                    Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(r3, strOooO0oo3);
                    Intrinsics.checkNotNull(objOooO0OO3);
                    return objOooO0OO3;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendPhoneCode);
                r14 = r14;
            }
            return objSendPhoneCode;
        } catch (IOException e4) {
            e = e4;
            str5 = str6;
            r3 = r14;
        } catch (CancellationException e5) {
            e = e5;
            str5 = str6;
            r3 = r14;
        } catch (Exception e6) {
            e = e6;
            str5 = str6;
            r3 = r14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOOOO(long j, @NotNull String str, @NotNull Continuation<? super ApiResult<String>> continuation) {
        Oooo0 oooo0;
        if (continuation instanceof Oooo0) {
            oooo0 = (Oooo0) continuation;
            int i = oooo0.f46137OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f46137OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(continuation);
            }
        } else {
            oooo0 = new Oooo0(continuation);
        }
        Object objUserUnblockAppeal = oooo0.f46136OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo0.f46137OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserUnblockAppeal);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                String strOooO0O0 = oOO0OOO.OooO0O0(str);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(...)");
                oooo0.f46137OooO0o = 1;
                objUserUnblockAppeal = mainApiServiceOooO00o.userUnblockAppeal(j, strOooO0O0, oooo0);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOOOo(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        o000oOoO o000oooo2;
        if (continuation instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) continuation;
            int i2 = o000oooo2.f46143OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000oooo2.f46143OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(continuation);
            }
        } else {
            o000oooo2 = new o000oOoO(continuation);
        }
        Object objVerCode = o000oooo2.f46142OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o000oooo2.f46143OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objVerCode);
                MainApiService mainApiServiceOooO00o = p384o0OOoo0O.OooOOO.OooO00o();
                o000oooo2.f46143OooO0o = 1;
                objVerCode = mainApiServiceOooO00o.verCode(str, str2, i, o000oooo2);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
