package com.yalla.yalla.ui.vm.account;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.o0000O0O;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.MyUserInfoModel;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p384o0OOoo0O.o00O0O;
import p385o0OOoo0o.o000OOo;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o00O0OO;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.oo000o;
import p590o0oOooo0.oOO0O0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/LoginTouristVM;", "Lo0Oo0/OooOO0;", "", "loginByTourists", "Lcom/code/android/uikit/contentstate/ContentState;", "<set-?>", "contentState$delegate", "Landroidx/compose/runtime/MutableState;", "getContentState", "()Lcom/code/android/uikit/contentstate/ContentState;", "setContentState", "(Lcom/code/android/uikit/contentstate/ContentState;)V", "contentState", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginTouristVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginTouristVM.kt\ncom/yalla/yalla/ui/vm/account/LoginTouristVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,71:1\n81#2:72\n107#2,2:73\n*S KotlinDebug\n*F\n+ 1 LoginTouristVM.kt\ncom/yalla/yalla/ui/vm/account/LoginTouristVM\n*L\n29#1:72\n29#1:73,2\n*E\n"})
public final class LoginTouristVM extends OooOO0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginTouristVM$loginByTourists$1", f = "LoginTouristVM.kt", i = {}, l = {42, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31096OooO0Oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.account.LoginTouristVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginTouristVM$loginByTourists$1$1", f = "LoginTouristVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0351OooO00o extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ LoginTouristVM f31098OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0351OooO00o(LoginTouristVM loginTouristVM, Continuation<? super C0351OooO00o> continuation) {
                super(2, continuation);
                this.f31098OooO0Oo = loginTouristVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0351OooO00o(this.f31098OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((C0351OooO00o) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f31098OooO0Oo.setContentState(ContentState.Error);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginTouristVM$loginByTourists$1$2", f = "LoginTouristVM.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<LoginModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f31099OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ LoginTouristVM f31100OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f31101OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(LoginTouristVM loginTouristVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f31100OooO0o = loginTouristVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f31100OooO0o, continuation);
                oooO0O0.f31101OooO0o0 = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LoginModel loginModel, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(loginModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f31099OooO0Oo;
                LoginTouristVM loginTouristVM = this.f31100OooO0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LoginModel loginModel = (LoginModel) this.f31101OooO0o0;
                    if ((loginModel != null ? loginModel.getData() : null) != null) {
                        Intrinsics.checkNotNull(loginModel);
                        MyUserInfoModel data = loginModel.getData();
                        Intrinsics.checkNotNull(data);
                        LoginToken token = loginModel.getToken();
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        o0O00oO0.OooOoo0(true, data);
                        o0O00oO0.OooOoOO(token != null ? token.getToken() : null, "", "", token != null ? token.getTokenRoom() : null);
                        o0O00oO0.f47939OooO0Oo = o0OoOo0.OooO00o(Boxing.boxBoolean(loginModel.getIsFirst()));
                        if (loginModel.getIsFirst()) {
                            oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
                            oo0ooo0oOooO0o0.getClass();
                            o0000O0O.OooO0O0("touristLoginRoom", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, true);
                        }
                        AppConfigRepo appConfigRepo = AppConfigRepo.f24292OooO00o;
                        this.f31099OooO0Oo = 1;
                        if (appConfigRepo.OooO0Oo(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        loginTouristVM.setContentState(ContentState.Error);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                o0o0000.OooO00o.OooO00o();
                o000OOo o000oooOooO00o = o000OOo.OooO00o();
                Context contextOooO00o = o000O00O.OooO00o();
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                long jLongValue = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
                String str = (String) o0O00oO0.OooOOOO().getValue();
                o000oooOooO00o.getClass();
                o000OOo.OooO0O0(jLongValue, str, contextOooO00o);
                if (com.code.android.util.OooO0O0.OooO0O0() != null) {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i2 = MainActivity.f24940OooOoo;
                        MainActivity.OooO00o.OooO00o(activityOooO0O0, 0, 6);
                        activityOooO0O0.overridePendingTransition(oo000o.alpha_in, oo000o.anim_empty);
                    }
                } else {
                    loginTouristVM.setContentState(ContentState.Error);
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
            return LoginTouristVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31096OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String countryCode = oOO0O0O0.OooO0O0(new oOO0O0O0()).getCountryCode();
            o00O0OO o00o0oo2 = o00O0OO.f46099OooO00o;
            this.f31096OooO0Oo = 1;
            obj = o00o0oo2.OooO0o(countryCode, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            LoginTouristVM loginTouristVM = LoginTouristVM.this;
            C0351OooO00o c0351OooO00o = new C0351OooO00o(loginTouristVM, null);
            OooO0O0 oooO0O0 = new OooO0O0(loginTouristVM, null);
            this.f31096OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, null, c0351OooO00o, oooO0O0, this, 3) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public LoginTouristVM() {
        loginByTourists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getContentState() {
        return (ContentState) this.contentState.getValue();
    }

    public final void loginByTourists() {
        setContentState(ContentState.Loading);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    public final void setContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.contentState.setValue(contentState);
    }
}
