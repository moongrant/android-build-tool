package com.yalla.yalla.ui.vm.account;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.android.billingclient.api.o00000O;
import com.app.base.model.CountryCodeItemModel;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.ApiResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o0000O0O;
import p520o0o0O0O0.o0000O;
import p617o0oo0o.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/PhNumberVM;", "Lo00OO/OooO00o;", "", "phone", "", "savePhoneInfo", "countryCode", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "checkPhoneRegister", "Lcom/app/base/model/CountryCodeItemModel;", "phoneAreaCodeInfo", "Lcom/app/base/model/CountryCodeItemModel;", "getPhoneAreaCodeInfo", "()Lcom/app/base/model/CountryCodeItemModel;", "setPhoneAreaCodeInfo", "(Lcom/app/base/model/CountryCodeItemModel;)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PhNumberVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private CountryCodeItemModel phoneAreaCodeInfo;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PhNumberVM$checkPhoneRegister$1", f = "PhNumberVM.kt", i = {0, 0}, l = {19, 24}, m = "invokeSuspend", n = {"$this$liveDataAsync", "tel"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25357Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public String f25358Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25359Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25360Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ PhNumberVM f25361OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25362OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, PhNumberVM phNumberVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25357Oooo = str;
            this.f25362OoooO00 = str2;
            this.f25361OoooO0 = phNumberVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25357Oooo, this.f25362OoooO00, this.f25361OoooO0, continuation);
            oooO00o.f25360Oooo0oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String string;
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25359Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    string = this.f25358Oooo0o;
                    liveDataScope = (LiveDataScope) this.f25360Oooo0oo;
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
            LiveDataScope liveDataScope2 = (LiveDataScope) this.f25360Oooo0oo;
            string = this.f25357Oooo.subSequence(this.f25362OoooO00.length(), this.f25357Oooo.length()).toString();
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25357Oooo;
            String str2 = this.f25362OoooO00;
            this.f25360Oooo0oo = liveDataScope2;
            this.f25358Oooo0o = string;
            this.f25359Oooo0oO = 1;
            Object objOooO00o = o0000o2.OooO00o(str, str2, this);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope2;
            obj = objOooO00o;
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f25361OoooO0.savePhoneInfo(string);
            }
            this.f25360Oooo0oo = null;
            this.f25358Oooo0o = null;
            this.f25359Oooo0oO = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public PhNumberVM() {
        Context context = p031OoooO.o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        this.phoneAreaCodeInfo = new o00Ooo(context).OooO0O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void savePhoneInfo(String phone) {
        o00000O.OooO0O0().OooO0oO("LOGIN_PHONE_NUMBER", phone);
        o00000O.OooO0O0().OooO0o0("LOGIN_PHONE_COUNTRYNAME_ID", o0O0O00.OooOO0o(this.phoneAreaCodeInfo.getId()));
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> checkPhoneRegister(@NotNull String phone, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return o0000O0O.OooO00o(new OooO00o(phone, countryCode, this, null));
    }

    @NotNull
    public final CountryCodeItemModel getPhoneAreaCodeInfo() {
        return this.phoneAreaCodeInfo;
    }

    public final void setPhoneAreaCodeInfo(@NotNull CountryCodeItemModel countryCodeItemModel) {
        Intrinsics.checkNotNullParameter(countryCodeItemModel, "<set-?>");
        this.phoneAreaCodeInfo = countryCodeItemModel;
    }
}
