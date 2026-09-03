package com.yalla.yalla.manager.unBlur.googlepay.quick;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o00oO0o;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.RechargeMenuModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.WalletRepo;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo00oO.o0O0O00;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\nJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/manager/unBlur/googlepay/quick/GooglePayQuickVM;", "Lo0Oo00oO/o0O0O00;", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/RechargeMenuModel;", "loadRechargeMenu", "Lcom/yalla/yalla/model/RechargeMenuCreateOrderModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/model/RechargeMenuCreateOrderResultModel;", "createOrder", "Lcom/yalla/yalla/data/db/table/PayOrder;", "Lcom/yalla/yalla/model/RechargeMenuConfirmOrderResultModel;", "confirmRechargeOrder", "payOrder", "Landroidx/lifecycle/MutableLiveData;", "", "saveOrderToDB", "", "updateOrderToDB", "", "orderId", "deleteOrderToDB", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class GooglePayQuickVM extends o0O0O00 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM$saveOrderToDB$1", f = "GooglePayQuickVM.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23410OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Boolean> f23411OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f23412OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PayOrder payOrder, MutableLiveData<Boolean> mutableLiveData, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f23412OooO0o0 = payOrder;
            this.f23411OooO0o = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f23412OooO0o0, this.f23411OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23410OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24837OooO00o;
                this.f23410OooO0Oo = 1;
                walletRepo.getClass();
                o000OOo.OooO00o().OooOoO0().OooO00o(this.f23412OooO0o0);
                if (Unit.INSTANCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f23411OooO0o.postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM$confirmRechargeOrder$1", f = "GooglePayQuickVM.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuConfirmOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23413OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PayOrder f23414OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f23415OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PayOrder payOrder, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f23414OooO0o = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f23414OooO0o, continuation);
            oooO00o.f23415OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuConfirmOrderResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23413OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f23415OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f23415OooO0o0;
            WalletRepo walletRepo = WalletRepo.f24837OooO00o;
            this.f23415OooO0o0 = liveDataScope;
            this.f23413OooO0Oo = 1;
            obj = walletRepo.OooO0O0(this.f23414OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f23415OooO0o0 = null;
            this.f23413OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM$createOrder$1", f = "GooglePayQuickVM.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23416OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuCreateOrderModel f23417OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f23418OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f23417OooO0o = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f23417OooO0o, continuation);
            oooO0O0.f23418OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23416OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f23418OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f23418OooO0o0;
            WalletRepo walletRepo = WalletRepo.f24837OooO00o;
            this.f23418OooO0o0 = liveDataScope;
            this.f23416OooO0Oo = 1;
            obj = walletRepo.OooO0oo(this.f23417OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f23418OooO0o0 = null;
            this.f23416OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM$deleteOrderToDB$1", f = "GooglePayQuickVM.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23419OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f23420OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f23420OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f23420OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23419OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24837OooO00o;
                this.f23419OooO0Oo = 1;
                walletRepo.getClass();
                if (WalletRepo.OooOO0o(this.f23420OooO0o0) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM$loadRechargeMenu$1", f = "GooglePayQuickVM.kt", i = {}, l = {22, 22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23421OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f23422OooO0o0;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(continuation);
            oooO0o.f23422OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23421OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f23422OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f23422OooO0o0;
            WalletRepo walletRepo = WalletRepo.f24837OooO00o;
            this.f23422OooO0o0 = liveDataScope;
            this.f23421OooO0Oo = 1;
            walletRepo.getClass();
            obj = WalletRepo.OooOOO(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f23422OooO0o0 = null;
            this.f23421OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM$updateOrderToDB$1", f = "GooglePayQuickVM.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23423OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f23424OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PayOrder payOrder, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f23424OooO0o0 = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f23424OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23423OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24837OooO00o;
                this.f23423OooO0Oo = 1;
                walletRepo.getClass();
                if (WalletRepo.OooOOo(this.f23424OooO0o0) == coroutine_suspended) {
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

    @NotNull
    public final LiveData<ApiResult<RechargeMenuConfirmOrderResultModel>> confirmRechargeOrder(@NotNull PayOrder model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return o00oO0o.OooO00o(new OooO00o(model, null));
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuCreateOrderResultModel>> createOrder(@NotNull RechargeMenuCreateOrderModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return o00oO0o.OooO00o(new OooO0O0(model, null));
    }

    public final void deleteOrderToDB(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0OO(orderId, null), 2, null);
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuModel>> loadRechargeMenu() {
        return o00oO0o.OooO00o(new OooO0o(null));
    }

    @NotNull
    public final MutableLiveData<Boolean> saveOrderToDB(@NotNull PayOrder payOrder) {
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(payOrder, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    public final void updateOrderToDB(@NotNull PayOrder payOrder) {
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOO0(payOrder, null), 2, null);
    }
}
