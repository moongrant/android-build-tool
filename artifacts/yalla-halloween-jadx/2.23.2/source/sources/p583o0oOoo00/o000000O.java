package p583o0oOoo00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O00O;
import com.yalla.yalla.data.repository.LoginRepo$loadLoginTypeConfig$$inlined$call$1;
import com.yalla.yalla.model.LoginMethod;
import com.yalla.yalla.model.LoginMethodConfigModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.o00O0O;
import p414o0Oo0oO.oO000Oo;
import p415o0Oo0oO0.o00Ooo;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;
import p590o0oOooo0.oOO0O0O;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000000O {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static boolean f56643OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f56636OooO00o = new MutableLiveData<>(Boolean.valueOf(o00Ooo.OooO0oO().OooO0O0("showFacebookLogin", false)));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f56637OooO0O0 = new MutableLiveData<>(Boolean.valueOf(o00Ooo.OooO0oO().OooO0O0("showYallaChatLogin", true)));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f56638OooO0OO = new MutableLiveData<>(Boolean.valueOf(o00Ooo.OooO0oO().OooO0O0("showTwitterLogin", true)));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f56639OooO0Oo = new MutableLiveData<>(Boolean.valueOf(o00Ooo.OooO0oO().OooO0O0("showWeChatLogin", false)));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f56641OooO0o0 = new MutableLiveData<>(Boolean.valueOf(o00Ooo.OooO0oO().OooO0O0("showPhoneLogin", false)));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f56640OooO0o = new MutableLiveData<>(Boolean.valueOf(o00Ooo.OooO0oO().OooO0O0("showPhoneRegister", false)));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f56642OooO0oO = new MutableLiveData<>(Boolean.FALSE);

    @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedLoginMethodManager$syncLoginMethod$1", f = "SharedLoginMethodManager.kt", i = {0, 0}, l = {43, 44}, m = "invokeSuspend", n = {"$this$jobLiveData", "smidBlank"}, s = {"L$0", "I$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<o00OO0O0<Unit>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56644OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f56645OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f56646OooO0o0;

        /* JADX INFO: renamed from: o0oOoo00.o000000O$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedLoginMethodManager$syncLoginMethod$1$1", f = "SharedLoginMethodManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0488OooO00o extends SuspendLambda implements Function2<ApiResult<LoginMethodConfigModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OO0O0<Unit> f56647OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0488OooO00o(o00OO0O0<Unit> o00oo0o1, Continuation<? super C0488OooO00o> continuation) {
                super(2, continuation);
                this.f56647OooO0Oo = o00oo0o1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0488OooO00o(this.f56647OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<LoginMethodConfigModel> apiResult, Continuation<? super Unit> continuation) {
                return ((C0488OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Unit unit = Unit.INSTANCE;
                this.f56647OooO0Oo.postValue(unit);
                return unit;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedLoginMethodManager$syncLoginMethod$1$2", f = "SharedLoginMethodManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<LoginMethodConfigModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f56648OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ boolean f56649OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(boolean z, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f56649OooO0o0 = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f56649OooO0o0, continuation);
                oooO0O0.f56648OooO0Oo = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LoginMethodConfigModel loginMethodConfigModel, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(loginMethodConfigModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                LoginMethodConfigModel loginMethodConfigModel = (LoginMethodConfigModel) this.f56648OooO0Oo;
                if (loginMethodConfigModel != null) {
                    StringBuilder sb = new StringBuilder("ShuMeiService onsuccess smidBlank = ");
                    boolean z = this.f56649OooO0o0;
                    sb.append(z);
                    o0000O00.OooO0O0(sb.toString());
                    boolean z2 = true;
                    if (!z) {
                        o000000O.f56643OooO0oo = true;
                    }
                    oO000Oo oo000ooOooO0oO = o00Ooo.OooO0oO();
                    LoginMethod faceBook = loginMethodConfigModel.getFaceBook();
                    oo000ooOooO0oO.OooO0o("showFacebookLogin", faceBook != null && faceBook.isShowLogin());
                    oO000Oo oo000ooOooO0oO2 = o00Ooo.OooO0oO();
                    LoginMethod phone = loginMethodConfigModel.getPhone();
                    oo000ooOooO0oO2.OooO0o("showPhoneLogin", phone != null && phone.isShowLogin());
                    oO000Oo oo000ooOooO0oO3 = o00Ooo.OooO0oO();
                    LoginMethod yallaChat = loginMethodConfigModel.getYallaChat();
                    oo000ooOooO0oO3.OooO0o("showYallaChatLogin", yallaChat != null && yallaChat.isShowLogin());
                    oO000Oo oo000ooOooO0oO4 = o00Ooo.OooO0oO();
                    LoginMethod twitter = loginMethodConfigModel.getTwitter();
                    oo000ooOooO0oO4.OooO0o("showTwitterLogin", twitter != null && twitter.isShowLogin());
                    oO000Oo oo000ooOooO0oO5 = o00Ooo.OooO0oO();
                    LoginMethod weChat = loginMethodConfigModel.getWeChat();
                    oo000ooOooO0oO5.OooO0o("showWeChatLogin", weChat != null && weChat.isShowLogin());
                    oO000Oo oo000ooOooO0oO6 = o00Ooo.OooO0oO();
                    LoginMethod phone2 = loginMethodConfigModel.getPhone();
                    oo000ooOooO0oO6.OooO0o("showPhoneRegister", phone2 != null && phone2.isShowSign());
                    o000000O.f56636OooO00o.postValue(Boxing.boxBoolean(o00Ooo.OooO0oO().OooO0O0("showFacebookLogin", false)));
                    o000000O.f56641OooO0o0.postValue(Boxing.boxBoolean(o00Ooo.OooO0oO().OooO0O0("showPhoneLogin", false)));
                    o000000O.f56637OooO0O0.postValue(Boxing.boxBoolean(o00Ooo.OooO0oO().OooO0O0("showYallaChatLogin", true)));
                    o000000O.f56638OooO0OO.postValue(Boxing.boxBoolean(o00Ooo.OooO0oO().OooO0O0("showTwitterLogin", true)));
                    o000000O.f56639OooO0Oo.postValue(Boxing.boxBoolean(o00Ooo.OooO0oO().OooO0O0("showWeChatLogin", false)));
                    o000000O.f56640OooO0o.postValue(Boxing.boxBoolean(o00Ooo.OooO0oO().OooO0O0("showPhoneRegister", false)));
                    MutableLiveData<Boolean> mutableLiveData = o000000O.f56642OooO0oO;
                    if (!o00Ooo.OooO0oO().OooO0O0("showFacebookLogin", false) && !o00Ooo.OooO0oO().OooO0O0("showPhoneLogin", false)) {
                        z2 = false;
                    }
                    mutableLiveData.postValue(Boxing.boxBoolean(z2));
                }
                return Unit.INSTANCE;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f56645OooO0o = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<Unit> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            ?? r1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56646OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    int i2 = this.f56644OooO0Oo;
                    o00oo0o1 = (o00OO0O0) this.f56645OooO0o;
                    ResultKt.throwOnFailure(obj);
                    r1 = i2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o00oo0o1 = (o00OO0O0) this.f56645OooO0o;
            if (o000000O.f56643OooO0oo) {
                Unit unit = Unit.INSTANCE;
                o00oo0o1.postValue(unit);
                return unit;
            }
            String strOooO0O0 = oOO0O0O.OooO0O0(o000O00O.OooO00o());
            String strOooO00o = oOO0O0O.OooO00o();
            String str = o0o0000.OooO00o.f48382OooO00o;
            ?? r7 = (str == null || StringsKt.isBlank(str)) ? 1 : 0;
            o0000O00.OooO0O0("ShuMeiService sync smidBlank = " + r7);
            this.f56645OooO0o = o00oo0o1;
            this.f56644OooO0Oo = r7;
            this.f56646OooO0o0 = 1;
            String url = oo000o.OooO0OO("/Webservers/Api/GetConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(strOooO0O0, "SimCountryCode");
            o0ooooo.OooO0O0(strOooO00o, "DeviceCountryCode");
            obj = OooOOO.OooO0Oo(new LoginRepo$loadLoginTypeConfig$$inlined$call$1(o0ooooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            r1 = r7;
            ApiResult apiResult = (ApiResult) obj;
            C0488OooO00o c0488OooO00o = new C0488OooO00o(o00oo0o1, null);
            OooO0O0 oooO0O0 = new OooO0O0(r1 != 0, null);
            this.f56645OooO0o = null;
            this.f56646OooO0o0 = 2;
            if (o00O0O.OooO0OO(apiResult, false, c0488OooO00o, null, oooO0O0, this, 5) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static o00OO0O0 OooO00o() {
        return o00O.OooO0O0(GlobalScope.INSTANCE, new OooO00o(null));
    }
}
