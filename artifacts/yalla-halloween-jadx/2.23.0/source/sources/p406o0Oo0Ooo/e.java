package p406o0Oo0Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.SmsCodeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o00;
import p376o0OOoOOO.o00O0000;
import p377o0OOoOo.o0000O00;
import p382o0OOoo0o.oo000o;
import p464o0Oooo.o0O0oo0o;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo0;
import p579o0oOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLoginRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginRepo.kt\ncom/yalla/yalla/data/repository/LoginRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 4 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,137:1\n18#2,7:138\n25#2,10:146\n18#2,7:156\n25#2,10:164\n18#2,7:174\n25#2,10:182\n18#2,7:192\n25#2,10:200\n18#2,7:210\n25#2,10:218\n18#2,7:228\n25#2,10:236\n18#2,7:246\n25#2,10:254\n18#2,7:264\n25#2,10:272\n18#2,7:282\n25#2,10:290\n18#2,7:300\n25#2,10:308\n18#2,7:318\n25#2,10:326\n18#2,7:336\n25#2,10:344\n18#2,7:354\n25#2,10:362\n18#2,7:372\n25#2,10:380\n18#2,7:390\n25#2,10:398\n18#2,7:408\n25#2,10:416\n109#3:145\n109#3:163\n109#3:181\n109#3:199\n109#3:217\n109#3:235\n109#3:253\n109#3:271\n109#3:289\n109#3:307\n109#3:325\n109#3:343\n109#3:361\n109#3:379\n109#3:397\n109#3:415\n62#4:426\n62#4:427\n*S KotlinDebug\n*F\n+ 1 LoginRepo.kt\ncom/yalla/yalla/data/repository/LoginRepo\n*L\n24#1:138,7\n24#1:146,10\n27#1:156,7\n27#1:164,10\n31#1:174,7\n31#1:182,10\n42#1:192,7\n42#1:200,10\n45#1:210,7\n45#1:218,10\n55#1:228,7\n55#1:236,10\n61#1:246,7\n61#1:254,10\n72#1:264,7\n72#1:272,10\n84#1:282,7\n84#1:290,10\n87#1:300,7\n87#1:308,10\n90#1:318,7\n90#1:326,10\n93#1:336,7\n93#1:344,10\n109#1:354,7\n109#1:362,10\n113#1:372,7\n113#1:380,10\n116#1:390,7\n116#1:398,10\n119#1:408,7\n119#1:416,10\n24#1:145\n27#1:163\n31#1:181\n42#1:199\n45#1:217\n55#1:235\n61#1:253\n72#1:271\n84#1:289\n87#1:307\n90#1:325\n93#1:343\n109#1:361\n113#1:379\n116#1:397\n119#1:415\n130#1:426\n136#1:427\n*E\n"})
public final class e extends o0O0oo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final e f44768OooO00o = new e();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {24}, m = "loginByTourists", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44769OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44770OooO0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44769OooO0Oo = obj;
            this.f44770OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {61}, m = "checkPhoneRegister", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44772OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44773OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44772OooO0Oo = obj;
            this.f44773OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO00o(null, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {27}, m = "loginByFacebook", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44775OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44776OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44775OooO0Oo = obj;
            this.f44776OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO0OO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {46}, m = "loginByInstagram", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44778OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44779OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44778OooO0Oo = obj;
            this.f44779OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO0Oo(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {87}, m = "loginByPhone", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44781OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44782OooO0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44781OooO0Oo = obj;
            this.f44782OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO0o0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {32}, m = "loginByTwitter", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44784OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44785OooO0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44784OooO0Oo = obj;
            this.f44785OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO0oO(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {42}, m = "loginByWeChat", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44787OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44788OooO0o;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44787OooO0Oo = obj;
            this.f44788OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO0oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {109}, m = "phoneChange", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44790OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44791OooO0o;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44790OooO0Oo = obj;
            this.f44791OooO0o |= Integer.MIN_VALUE;
            return e.this.OooOO0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {56}, m = "loginByYallaChat", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44793OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44794OooO0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44793OooO0Oo = obj;
            this.f44794OooO0o |= Integer.MIN_VALUE;
            return e.this.OooO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {90}, m = "protectionLoginByPhone", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44796OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44797OooO0o;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44796OooO0Oo = obj;
            this.f44797OooO0o |= Integer.MIN_VALUE;
            return e.this.OooOO0O(null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {94}, m = "sendPhoneSmsCode", n = {}, s = {})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44799OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44800OooO0o;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44799OooO0Oo = obj;
            this.f44800OooO0o |= Integer.MIN_VALUE;
            return e.this.OooOOO0(null, null, 0, 0, 0, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {73}, m = "registerByPhone", n = {}, s = {})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44802OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44803OooO0o;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44802OooO0Oo = obj;
            this.f44803OooO0o |= Integer.MIN_VALUE;
            return e.this.OooOO0o(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {116}, m = "userUnblockAppeal", n = {}, s = {})
    public static final class Oooo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44805OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44806OooO0o;

        public Oooo0(Continuation<? super Oooo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44805OooO0Oo = obj;
            this.f44806OooO0o |= Integer.MIN_VALUE;
            return e.this.OooOOOO(0L, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {84}, m = "userResetPassword", n = {}, s = {})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44808OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44809OooO0o;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44808OooO0Oo = obj;
            this.f44809OooO0o |= Integer.MIN_VALUE;
            return e.this.OooOOO(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {113}, m = "verCode", n = {}, s = {})
    public static final class o000oOoO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44811OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44812OooO0o;

        public o000oOoO(Continuation<? super o000oOoO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44811OooO0Oo = obj;
            this.f44812OooO0o |= Integer.MIN_VALUE;
            return e.this.OooOOOo(null, null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO(@NotNull String str, @NotNull Continuation<? super ApiResult<LoginModel>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f44794OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f44794OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object objYallaChatLogin = oooOOO0.f44793OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO0.f44794OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objYallaChatLogin);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oo000o.OooO00o();
                String strOooO0OO = oO0Oo0oo.OooO0OO();
                oooOOO0.f44794OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i2 = oooO00o.f44773OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f44773OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        OooO00o oooO00o2 = oooO00o;
        Object objOooO0OO = oooO00o2.f44772OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o2.f44773OooO0o;
        boolean z = true;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(objOooO0OO);
                    try {
                        MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                        oooO00o2.f44773OooO0o = 1;
                        objOooO0OO = mainApiServiceOooO00o.checkPhoneRegister(str, str2, str3, i, oooO00o2);
                        if (objOooO0OO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (IOException e) {
                        iOException = e;
                        String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", iOException, 1, "time out", null, 4, null));
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
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e3, 3, "canceled", null, 4, null));
            objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO);
        } catch (Exception e4) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e4.getMessage(), e4);
            String message = e4.getMessage();
            String name = message == null ? e4.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.f44818OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.f44818OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, continuation);
            }
        } else {
            fVar = new f(this, continuation);
        }
        Object phoneCodeSendType = fVar.f44817OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fVar.f44818OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(phoneCodeSendType);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                fVar.f44818OooO0o = 1;
                phoneCodeSendType = mainApiServiceOooO00o.getPhoneCodeSendType(i, str, fVar);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooO0O0.f44776OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f44776OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objFbLogin = oooO0O0.f44775OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f44776OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFbLogin);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oo000o.OooO00o();
                String strOooO0OO = oO0Oo0oo.OooO0OO();
                oooO0O0.f44776OooO0o = 1;
                objFbLogin = mainApiServiceOooO00o.fbLogin(strOooO00o, str, strOooO0OO, oooO0O0);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
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
            int i = oooO0OO.f44779OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f44779OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object objInstagramLogin = oooO0OO2.f44778OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO2.f44779OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInstagramLogin);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oo000o.OooO00o();
                String strOooO0OO = oO0Oo0oo.OooO0OO();
                oooO0OO2.f44779OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooO.f44770OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f44770OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objUserDevcieRegister = oooO.f44769OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f44770OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserDevcieRegister);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oo000o.OooO00o();
                oooO.f44770OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooO0o.f44782OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f44782OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objUserLogin = oooO0o.f44781OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f44782OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserLogin);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oO000Oo0.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(password)");
                String strOooO00o2 = oo000o.OooO00o();
                oooO0o.f44782OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooOO1.f44785OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f44785OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        OooOO0 oooOO2 = oooOO1;
        Object objTwitterLogin = oooOO2.f44784OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO2.f44785OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objTwitterLogin);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oo000o.OooO00o();
                String strOooO0OO = oO0Oo0oo.OooO0OO();
                oooOO2.f44785OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooOO0O.f44788OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f44788OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objWeChatLogin = oooOO0O.f44787OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f44788OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWeChatLogin);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oo000o.OooO00o();
                String strOooO0OO = oO0Oo0oo.OooO0OO();
                oooOO0O.f44788OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooOOO.f44791OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f44791OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        Object objPhoneChange = oooOOO.f44790OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f44791OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPhoneChange);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                oooOOO.f44791OooO0o = 1;
                objPhoneChange = mainApiServiceOooO00o.phoneChange(str, str2, oo000o.OooO0O0(), oo000o.OooO0OO(), oo000o.OooO0Oo(), oooOOO);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i2 = oooOOOO.f44797OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOOO.f44797OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        Object objPhoneSaleLogin = oooOOOO.f44796OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOOOO.f44797OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objPhoneSaleLogin);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                oooOOOO.f44797OooO0o = 1;
                objPhoneSaleLogin = mainApiServiceOooO00o.phoneSaleLogin(str, str2, i, oo000o.OooO0O0(), oo000o.OooO0OO(), oo000o.OooO0Oo(), oooOOOO);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooOo00.f44803OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f44803OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        OooOo00 oooOo01 = oooOo00;
        Object objUserSmRegister = oooOo01.f44802OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo01.f44803OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserSmRegister);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oO000Oo0.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(password)");
                String strOooO00o2 = oo000o.OooO00o();
                String strOooO0OO = oO0Oo0oo.OooO0OO();
                oooOo01.f44803OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooo000.f44809OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f44809OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Object objUserSmRetrievePwd = oooo000.f44808OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo000.f44809OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserSmRetrievePwd);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oO000Oo0.OooO00o(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "MD5(password)");
                oooo000.f44809OooO0o = 1;
                objUserSmRetrievePwd = mainApiServiceOooO00o.userSmRetrievePwd(str, strOooO00o, str3, oo000o.OooO0O0(), oo000o.OooO0OO(), oo000o.OooO0Oo(), oooo000);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i5 = oooOo.f44800OooO0o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oooOo.f44800OooO0o = i5 - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        OooOo oooOo2 = oooOo;
        Object objSendPhoneCode = oooOo2.f44799OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = oooOo2.f44800OooO0o;
        ?? r14 = ApiResult.class;
        String str6 = "WebAPIException";
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(objSendPhoneCode);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO00o = oo000o.OooO00o();
                String strBase64EncodeToString = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(str2 + "|" + str + "|" + i, o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, (String) null, 4, (Object) null));
                oooOo2.f44800OooO0o = 1;
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
                    String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o(str5, "time out ", e, 1, "time out", null, 4, null));
                    if (strOooO0oo == null) {
                        strOooO0oo = "";
                    }
                    Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(r3, strOooO0oo);
                    Intrinsics.checkNotNull(objOooO0OO);
                    return objOooO0OO;
                } catch (CancellationException e2) {
                    e = e2;
                    String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o(str5, "canceled ", e, 3, "canceled", null, 4, null));
                    if (strOooO0oo2 == null) {
                        strOooO0oo2 = "";
                    }
                    Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(r3, strOooO0oo2);
                    Intrinsics.checkNotNull(objOooO0OO2);
                    return objOooO0OO2;
                } catch (Exception e3) {
                    e = e3;
                    p592o0oo00O.OooOOO0.OooO0o0(str5, e.getMessage(), e);
                    String message = e.getMessage();
                    String name = message == null ? e.getClass().getName() : message;
                    Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i = oooo0.f44806OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f44806OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(continuation);
            }
        } else {
            oooo0 = new Oooo0(continuation);
        }
        Object objUserUnblockAppeal = oooo0.f44805OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo0.f44806OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserUnblockAppeal);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                String strOooO0O0 = oO000Oo0.OooO0O0(str);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(reason)");
                oooo0.f44806OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
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
            int i2 = o000oooo2.f44812OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000oooo2.f44812OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(continuation);
            }
        } else {
            o000oooo2 = new o000oOoO(continuation);
        }
        Object objVerCode = o000oooo2.f44811OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o000oooo2.f44812OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objVerCode);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                o000oooo2.f44812OooO0o = 1;
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p592o0oo00O.OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
