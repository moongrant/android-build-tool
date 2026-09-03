package p402o0Oo0OOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
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
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o000O000;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000000;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;
import p470o0OoooOo.o0O0oo0o;
import p579o0oOoo.oO0Oo0oo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f44482OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f44476OooO00o = new MutableLiveData<>(Boolean.valueOf(o00Oo0.OooO0oO().OooO0O0("showFacebookLogin", true)));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f44477OooO0O0 = new MutableLiveData<>(Boolean.valueOf(o00Oo0.OooO0oO().OooO0O0("showYallaChatLogin", true)));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f44478OooO0OO = new MutableLiveData<>(Boolean.valueOf(o00Oo0.OooO0oO().OooO0O0("showTwitterLogin", true)));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f44479OooO0Oo = new MutableLiveData<>(Boolean.valueOf(o00Oo0.OooO0oO().OooO0O0("showWeChatLogin", false)));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f44481OooO0o0 = new MutableLiveData<>(Boolean.valueOf(o00Oo0.OooO0oO().OooO0O0("showPhoneLogin", false)));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f44480OooO0o = new MutableLiveData<>(Boolean.valueOf(o00Oo0.OooO0oO().OooO0O0("showPhoneRegister", false)));

    @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedLoginMethodManager$syncLoginMethod$1", f = "SharedLoginMethodManager.kt", i = {0, 0}, l = {41, 42}, m = "invokeSuspend", n = {"$this$jobLiveData", "smidBlank"}, s = {"L$0", "I$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OO00O<Unit>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f44483OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f44484OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f44485OooO0o0;

        /* JADX INFO: renamed from: o0Oo0OOO.o00O0000$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedLoginMethodManager$syncLoginMethod$1$1", f = "SharedLoginMethodManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0463OooO00o extends SuspendLambda implements Function2<ApiResult<LoginMethodConfigModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0OO00O<Unit> f44486OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0463OooO00o(o0OO00O<Unit> o0oo00o2, Continuation<? super C0463OooO00o> continuation) {
                super(2, continuation);
                this.f44486OooO0Oo = o0oo00o2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0463OooO00o(this.f44486OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<LoginMethodConfigModel> apiResult, Continuation<? super Unit> continuation) {
                return ((C0463OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Unit unit = Unit.INSTANCE;
                this.f44486OooO0Oo.postValue(unit);
                return unit;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedLoginMethodManager$syncLoginMethod$1$2", f = "SharedLoginMethodManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<LoginMethodConfigModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f44487OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ boolean f44488OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(boolean z, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f44488OooO0o0 = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f44488OooO0o0, continuation);
                oooO0O0.f44487OooO0Oo = obj;
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
                LoginMethodConfigModel loginMethodConfigModel = (LoginMethodConfigModel) this.f44487OooO0Oo;
                if (loginMethodConfigModel != null) {
                    StringBuilder sb = new StringBuilder("ShuMeiService onsuccess smidBlank = ");
                    boolean z = this.f44488OooO0o0;
                    sb.append(z);
                    OooOOO0.OooO0O0(sb.toString());
                    if (!z) {
                        o00O0000.f44482OooO0oO = true;
                    }
                    o000000 o000000VarOooO0oO = o00Oo0.OooO0oO();
                    LoginMethod faceBook = loginMethodConfigModel.getFaceBook();
                    o000000VarOooO0oO.OooO0o("showFacebookLogin", faceBook != null && faceBook.isShowLogin());
                    o000000 o000000VarOooO0oO2 = o00Oo0.OooO0oO();
                    LoginMethod phone = loginMethodConfigModel.getPhone();
                    o000000VarOooO0oO2.OooO0o("showPhoneLogin", phone != null && phone.isShowLogin());
                    o000000 o000000VarOooO0oO3 = o00Oo0.OooO0oO();
                    LoginMethod yallaChat = loginMethodConfigModel.getYallaChat();
                    o000000VarOooO0oO3.OooO0o("showYallaChatLogin", yallaChat != null && yallaChat.isShowLogin());
                    o000000 o000000VarOooO0oO4 = o00Oo0.OooO0oO();
                    LoginMethod twitter = loginMethodConfigModel.getTwitter();
                    o000000VarOooO0oO4.OooO0o("showTwitterLogin", twitter != null && twitter.isShowLogin());
                    o000000 o000000VarOooO0oO5 = o00Oo0.OooO0oO();
                    LoginMethod weChat = loginMethodConfigModel.getWeChat();
                    o000000VarOooO0oO5.OooO0o("showWeChatLogin", weChat != null && weChat.isShowLogin());
                    o000000 o000000VarOooO0oO6 = o00Oo0.OooO0oO();
                    LoginMethod phone2 = loginMethodConfigModel.getPhone();
                    o000000VarOooO0oO6.OooO0o("showPhoneRegister", phone2 != null && phone2.isShowSign());
                    o00O0000.f44476OooO00o.postValue(Boxing.boxBoolean(o00Oo0.OooO0oO().OooO0O0("showFacebookLogin", true)));
                    o00O0000.f44481OooO0o0.postValue(Boxing.boxBoolean(o00Oo0.OooO0oO().OooO0O0("showPhoneLogin", false)));
                    o00O0000.f44477OooO0O0.postValue(Boxing.boxBoolean(o00Oo0.OooO0oO().OooO0O0("showYallaChatLogin", true)));
                    o00O0000.f44478OooO0OO.postValue(Boxing.boxBoolean(o00Oo0.OooO0oO().OooO0O0("showTwitterLogin", true)));
                    o00O0000.f44479OooO0Oo.postValue(Boxing.boxBoolean(o00Oo0.OooO0oO().OooO0O0("showWeChatLogin", false)));
                    o00O0000.f44480OooO0o.postValue(Boxing.boxBoolean(o00Oo0.OooO0oO().OooO0O0("showPhoneRegister", false)));
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
            oooO00o.f44484OooO0o = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<Unit> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
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
            o0OO00O o0oo00o2;
            ?? r1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f44485OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    int i2 = this.f44483OooO0Oo;
                    o0oo00o2 = (o0OO00O) this.f44484OooO0o;
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
            o0oo00o2 = (o0OO00O) this.f44484OooO0o;
            if (o00O0000.f44482OooO0oO) {
                Unit unit = Unit.INSTANCE;
                o0oo00o2.postValue(unit);
                return unit;
            }
            String strOooO0O0 = oO0Oo0oo.OooO0O0(o000O0.OooO00o());
            String strOooO00o = oO0Oo0oo.OooO00o();
            String str = o0O0oo0o.f47183OooO00o;
            ?? r7 = (str == null || StringsKt.isBlank(str)) ? 1 : 0;
            OooOOO0.OooO0O0("ShuMeiService sync smidBlank = " + r7);
            this.f44484OooO0o = o0oo00o2;
            this.f44483OooO0Oo = r7;
            this.f44485OooO0o0 = 1;
            String url = o000OOo0.OooO0OO("/Webservers/Api/GetConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strOooO0O0, "SimCountryCode");
            o0o0ooo.OooO0O0(strOooO00o, "DeviceCountryCode");
            obj = OooOOO.OooO0Oo(new LoginRepo$loadLoginTypeConfig$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            r1 = r7;
            ApiResult apiResult = (ApiResult) obj;
            C0463OooO00o c0463OooO00o = new C0463OooO00o(o0oo00o2, null);
            OooO0O0 oooO0O0 = new OooO0O0(r1 != 0, null);
            this.f44484OooO0o = null;
            this.f44485OooO0o0 = 2;
            if (o000O000.OooO0OO(apiResult, false, c0463OooO00o, null, oooO0O0, this, 5) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static o0OO00O OooO00o() {
        return o0ooOOo.OooO0O0(GlobalScope.INSTANCE, new OooO00o(null));
    }
}
