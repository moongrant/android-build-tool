package com.yalla.yalla.common.manager.googlepay.quick;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuModel;
import com.yalla.yalla.common.repository.WalletRepo;
import com.yalla.yalla.common.repository.WalletRepo$loadShopListGoogle$$inlined$call$1;
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
import o00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p486o0o000o0.o00000;
import p491o0o00O00.OooO0OO;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\nJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/quick/GooglePayQuickVM;", "Lo00OO/OooO00o;", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/common/model/RechargeMenuModel;", "loadRechargeMenu", "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderResultModel;", "createOrder", "Lcom/yalla/yalla/common/db/table/PayOrder;", "Lcom/yalla/yalla/common/model/RechargeMenuConfirmOrderResultModel;", "confirmRechargeOrder", "payOrder", "Landroidx/lifecycle/MutableLiveData;", "", "saveOrderToDB", "", "updateOrderToDB", "", "orderId", "deleteOrderToDB", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GooglePayQuickVM extends OooO00o {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$confirmRechargeOrder$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/common/model/RechargeMenuConfirmOrderResultModel;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$confirmRechargeOrder$1", f = "GooglePayQuickVM.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuConfirmOrderResultModel>>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PayOrder $model;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PayOrder payOrder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$model = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$model, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull LiveDataScope<ApiResult<RechargeMenuConfirmOrderResultModel>> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            WalletRepo walletRepo = WalletRepo.f20785OooO00o;
            PayOrder payOrder = this.$model;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = walletRepo.OooO0O0(payOrder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$createOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderResultModel;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$createOrder$1", f = "GooglePayQuickVM.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04921 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ RechargeMenuCreateOrderModel $model;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04921(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, Continuation<? super C04921> continuation) {
            super(2, continuation);
            this.$model = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04921 c04921 = new C04921(this.$model, continuation);
            c04921.L$0 = obj;
            return c04921;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04921) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            WalletRepo walletRepo = WalletRepo.f20785OooO00o;
            RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = this.$model;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = walletRepo.OooO0oo(rechargeMenuCreateOrderModel, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$deleteOrderToDB$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$deleteOrderToDB$1", f = "GooglePayQuickVM.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $orderId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04931(String str, Continuation<? super C04931> continuation) {
            super(2, continuation);
            this.$orderId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04931(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$orderId;
                this.label = 1;
                Object objOooO0OO = OooO0OO.OooO00o().OooOoOO().OooO0OO(str, this);
                if (objOooO0OO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0OO = Unit.INSTANCE;
                }
                if (objOooO0OO == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$loadRechargeMenu$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/common/model/RechargeMenuModel;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$loadRechargeMenu$1", f = "GooglePayQuickVM.kt", i = {}, l = {22, 22}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04941 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuModel>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public C04941(Continuation<? super C04941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04941 c04941 = new C04941(continuation);
            c04941.L$0 = obj;
            return c04941;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull LiveDataScope<ApiResult<RechargeMenuModel>> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04941) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            this.L$0 = liveDataScope;
            this.label = 1;
            o00000 o00000Var = o00000.f40902OooO00o;
            String url = o00000.f40904OooO0OO;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO00o();
            o00o000o2.OooO0O0("sources", Boxing.boxInt(2));
            obj = o0000O0.OooO0OO(new WalletRepo$loadShopListGoogle$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$saveOrderToDB$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$saveOrderToDB$1", f = "GooglePayQuickVM.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableLiveData<Boolean> $mutableLiveData;
        public final /* synthetic */ PayOrder $payOrder;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04951(PayOrder payOrder, MutableLiveData<Boolean> mutableLiveData, Continuation<? super C04951> continuation) {
            super(2, continuation);
            this.$payOrder = payOrder;
            this.$mutableLiveData = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04951(this.$payOrder, this.$mutableLiveData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PayOrder payOrder = this.$payOrder;
                this.label = 1;
                Object objOooO00o = OooO0OO.OooO00o().OooOoOO().OooO00o(payOrder, this);
                if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO00o = Unit.INSTANCE;
                }
                if (objOooO00o == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$mutableLiveData.postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$updateOrderToDB$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickVM$updateOrderToDB$1", f = "GooglePayQuickVM.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PayOrder $payOrder;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04961(PayOrder payOrder, Continuation<? super C04961> continuation) {
            super(2, continuation);
            this.$payOrder = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04961(this.$payOrder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PayOrder payOrder = this.$payOrder;
                this.label = 1;
                Object objOooO0o0 = OooO0OO.OooO00o().OooOoOO().OooO0o0(payOrder.getOrderId(), payOrder.getIsConsume(), this);
                if (objOooO0o0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0o0 = Unit.INSTANCE;
                }
                if (objOooO0o0 == coroutine_suspended) {
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
        return o0000O0O.OooO00o(new AnonymousClass1(model, null));
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuCreateOrderResultModel>> createOrder(@NotNull RechargeMenuCreateOrderModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return o0000O0O.OooO00o(new C04921(model, null));
    }

    public final void deleteOrderToDB(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C04931(orderId, null), 2, null);
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuModel>> loadRechargeMenu() {
        return o0000O0O.OooO00o(new C04941(null));
    }

    @NotNull
    public final MutableLiveData<Boolean> saveOrderToDB(@NotNull PayOrder payOrder) {
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C04951(payOrder, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    public final void updateOrderToDB(@NotNull PayOrder payOrder) {
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C04961(payOrder, null), 2, null);
    }
}
