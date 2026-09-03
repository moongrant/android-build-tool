package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.repository.AccountRepo$getTrustDeviceList$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$switchUserDevice$$inlined$call$1;
import com.yalla.yalla.model.TrustedDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o0000O0;
import p255o00ooO0O.o0000O0O;
import p520o0o0O00o.o0000OO0;
import p549o0o0o00O.o00O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/AccountProtectionVM;", "Lo00OO/OooO00o;", "", "getAccountPrivacy", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/yalla/yalla/model/TrustedDevice;", "getTrustDeviceList", "", "isOpenProtected", "", "switchUserDevice", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AccountProtectionVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountProtectionVM$getAccountPrivacy$1", f = "AccountProtectionVM.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25280Oooo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25280Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000OO0 o0000oo1 = o0000OO0.f42194OooO00o;
                this.f25280Oooo = 1;
                if (o0000oo1.OooO00o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountProtectionVM$getTrustDeviceList$1", f = "AccountProtectionVM.kt", i = {}, l = {22, 22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TrustedDevice>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25281Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25282OoooO00;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f25282OoooO00 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<TrustedDevice>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25281Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25282OoooO00;
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
            liveDataScope = (LiveDataScope) this.f25282OoooO00;
            this.f25282OoooO00 = liveDataScope;
            this.f25281Oooo = 1;
            p482o0o000.OooO0OO oooO0OO = p482o0o000.OooO0OO.f40773OooO00o;
            String str = p482o0o000.OooO0OO.f40776OooO0Oo;
            obj = o0000O0.OooO0OO(new AccountRepo$getTrustDeviceList$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25282OoooO00 = null;
            this.f25281Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountProtectionVM$switchUserDevice$1", f = "AccountProtectionVM.kt", i = {}, l = {26, 26}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25283Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f25284OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25285OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25284OoooO0 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25284OoooO0, continuation);
            oooO0OO.f25285OoooO00 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<String>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25283Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25285OoooO00;
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
            liveDataScope = (LiveDataScope) this.f25285OoooO00;
            int i2 = this.f25284OoooO0;
            this.f25285OoooO00 = liveDataScope;
            this.f25283Oooo = 1;
            p482o0o000.OooO0OO oooO0OO = p482o0o000.OooO0OO.f40773OooO00o;
            String str = p482o0o000.OooO0OO.f40778OooO0o0;
            o00O000 o00o000OooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 1);
            o00o000OooO0O0.OooO0O0("isOpenProtected", Boxing.boxInt(i2));
            obj = o0000O0.OooO0OO(new AccountRepo$switchUserDevice$$inlined$call$1(o00o000OooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25285OoooO00 = null;
            this.f25283Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void getAccountPrivacy() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    @NotNull
    public final LiveData<ApiResult<List<TrustedDevice>>> getTrustDeviceList() {
        return o0000O0O.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final LiveData<ApiResult<String>> switchUserDevice(int isOpenProtected) {
        return o0000O0O.OooO00o(new OooO0OO(isOpenProtected, null));
    }
}
