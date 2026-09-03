package com.yalla.yalla.common.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.billingclient.api.o0Oo0oo;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.common.repository.WalletRepo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p493o0o00O00.OooO0OO;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/common/manager/FixRechargeOrderManager;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "payManager", "Lcom/yalla/yalla/common/manager/PayManager;", "(Landroidx/fragment/app/FragmentActivity;Lcom/yalla/yalla/common/manager/PayManager;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "failedOrderList", "", "Lcom/yalla/yalla/common/db/table/PayOrder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "getListener", "()Lkotlin/jvm/functions/Function0;", "setListener", "(Lkotlin/jvm/functions/Function0;)V", "checkOrderState", "type", "", "isSubscription", "", "confirmRechargeOrder", DeviceRequestsHelper.DEVICE_INFO_MODEL, "start", "toConsumeOrder", "payOrder", "toConsumeOrderFirst", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FixRechargeOrderManager {
    public static final int $stable = 8;

    @NotNull
    private final FragmentActivity activity;

    @NotNull
    private final List<PayOrder> failedOrderList;

    @Nullable
    private Function0<Unit> listener;

    @NotNull
    private final PayManager payManager;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$checkOrderState$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$checkOrderState$1", f = "FixRechargeOrderManager.kt", i = {}, l = {33, 34, 35, 37, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isSubscription;
        public final /* synthetic */ int $type;
        public int label;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$checkOrderState$1$2, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$checkOrderState$1$2", f = "FixRechargeOrderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ FixRechargeOrderManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FixRechargeOrderManager fixRechargeOrderManager, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = fixRechargeOrderManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.toConsumeOrderFirst();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$isSubscription = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FixRechargeOrderManager.this.new AnonymousClass1(this.$type, this.$isSubscription, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0070 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x008a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x009b  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x0095 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOooO0O0;
            boolean z;
            FixRechargeOrderManager fixRechargeOrderManager;
            MainCoroutineDispatcher main;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 3;
                    objOooO0O0 = OooO0OO.OooO00o().OooOoOO().OooO0O0((List) obj, this);
                    if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO0O0 = Unit.INSTANCE;
                    }
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    FixRechargeOrderManager.this.failedOrderList.clear();
                    this.label = 4;
                    obj = OooO0OO.OooO00o().OooOoOO().OooO0Oo(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = this.$isSubscription;
                    fixRechargeOrderManager = FixRechargeOrderManager.this;
                    for (PayOrder payOrder : (Iterable) obj) {
                        if (payOrder.getIsSubscription() == z) {
                            fixRechargeOrderManager.failedOrderList.add(payOrder);
                        }
                    }
                    main = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(FixRechargeOrderManager.this, null);
                    this.label = 5;
                    if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    FixRechargeOrderManager.this.failedOrderList.clear();
                    this.label = 4;
                    obj = OooO0OO.OooO00o().OooOoOO().OooO0Oo(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = this.$isSubscription;
                    fixRechargeOrderManager = FixRechargeOrderManager.this;
                    while (r10.hasNext()) {
                        if (payOrder.getIsSubscription() == z) {
                            fixRechargeOrderManager.failedOrderList.add(payOrder);
                        }
                    }
                    main = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(FixRechargeOrderManager.this, null);
                    this.label = 5;
                    if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    z = this.$isSubscription;
                    fixRechargeOrderManager = FixRechargeOrderManager.this;
                    while (r10.hasNext()) {
                        if (payOrder.getIsSubscription() == z) {
                            fixRechargeOrderManager.failedOrderList.add(payOrder);
                        }
                    }
                    main = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(FixRechargeOrderManager.this, null);
                    this.label = 5;
                    if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            PayManager payManager = FixRechargeOrderManager.this.payManager;
            int i2 = this.$type;
            boolean z2 = this.$isSubscription;
            this.label = 2;
            obj = payManager.queryPurchases(i2, z2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 3;
            objOooO0O0 = OooO0OO.OooO00o().OooOoOO().OooO0O0((List) obj, this);
            if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO0O0 = Unit.INSTANCE;
            }
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            FixRechargeOrderManager.this.failedOrderList.clear();
            this.label = 4;
            obj = OooO0OO.OooO00o().OooOoOO().OooO0Oo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = this.$isSubscription;
            fixRechargeOrderManager = FixRechargeOrderManager.this;
            while (r10.hasNext()) {
                if (payOrder.getIsSubscription() == z) {
                    fixRechargeOrderManager.failedOrderList.add(payOrder);
                }
            }
            main = Dispatchers.getMain();
            anonymousClass2 = new AnonymousClass2(FixRechargeOrderManager.this, null);
            this.label = 5;
            if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$confirmRechargeOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$confirmRechargeOrder$1", f = "FixRechargeOrderManager.kt", i = {}, l = {99, 106, 113, 119, 123, 128}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PayOrder $model;
        public int label;
        public final /* synthetic */ FixRechargeOrderManager this$0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$confirmRechargeOrder$1$2, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$confirmRechargeOrder$1$2", f = "FixRechargeOrderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ FixRechargeOrderManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FixRechargeOrderManager fixRechargeOrderManager, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = fixRechargeOrderManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.toConsumeOrderFirst();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04591(PayOrder payOrder, FixRechargeOrderManager fixRechargeOrderManager, Continuation<? super C04591> continuation) {
            super(2, continuation);
            this.$model = payOrder;
            this.this$0 = fixRechargeOrderManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04591(this.$model, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0041  */
        /* JADX WARN: Code duplicated, block: B:16:0x004c  */
        /* JADX WARN: Code duplicated, block: B:19:0x005e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0066  */
        /* JADX WARN: Code duplicated, block: B:28:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:47:0x0109  */
        /* JADX WARN: Code duplicated, block: B:50:0x0125  */
        /* JADX WARN: Code duplicated, block: B:52:0x0129 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:55:0x013e A[RETURN] */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b6, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ApiResult apiResult;
            String strOooO0Oo;
            int code2;
            Object objOooO0OO;
            RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel;
            Long value;
            MainCoroutineDispatcher main;
            FixRechargeOrderManager$confirmRechargeOrder$1$1$1 fixRechargeOrderManager$confirmRechargeOrder$1$1$1;
            Object objOooO0OO2;
            MainCoroutineDispatcher main2;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    WalletRepo walletRepo = WalletRepo.f20805OooO00o;
                    PayOrder payOrder = this.$model;
                    this.label = 1;
                    obj = walletRepo.OooO00o(payOrder, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Google补单 App确认 结果 result:");
                    if (apiResult != null) {
                        strOooO0Oo = o0Oo0oo.OooO0Oo(apiResult);
                        Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
                    } else {
                        strOooO0Oo = "";
                    }
                    sbOooO0O0.append(strOooO0Oo);
                    o00O00.OooO0oO(sbOooO0O0.toString());
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel != null) {
                            long userId = this.$model.getUserId();
                            value = OooOOO.f41235OooO00o.OooOo().getValue();
                            if (value != null && userId == value.longValue()) {
                                main = Dispatchers.getMain();
                                fixRechargeOrderManager$confirmRechargeOrder$1$1$1 = new FixRechargeOrderManager$confirmRechargeOrder$1$1$1(rechargeMenuConfirmOrderResultModel, null);
                                this.label = 2;
                                if (BuildersKt.withContext(main, fixRechargeOrderManager$confirmRechargeOrder$1$1$1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        String orderId = this.$model.getOrderId();
                        this.label = 3;
                        objOooO0OO2 = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId, this);
                        if (objOooO0OO2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objOooO0OO2 = Unit.INSTANCE;
                        }
                        if (objOooO0OO2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        o00O00.OooOO0O("Google补单 App确认 失败 result:" + apiResult);
                        code2 = apiResult.getCode();
                        if (code2 != 2000 || code2 == 2005) {
                            String orderId2 = this.$model.getOrderId();
                            this.label = 4;
                            objOooO0OO = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId2, this);
                            if (objOooO0OO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objOooO0OO = Unit.INSTANCE;
                            }
                            if (objOooO0OO == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (System.currentTimeMillis() - this.$model.getCreateTime() > 259200000) {
                            String orderId3 = this.$model.getOrderId();
                            this.label = 5;
                            Object objOooO0OO3 = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId3, this);
                            if (objOooO0OO3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objOooO0OO3 = Unit.INSTANCE;
                            }
                            if (objOooO0OO3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    main2 = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 6;
                    if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Google补单 App确认 结果 result:");
                    if (apiResult != null) {
                        strOooO0Oo = o0Oo0oo.OooO0Oo(apiResult);
                        Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
                    } else {
                        strOooO0Oo = "";
                    }
                    sbOooO0O1.append(strOooO0Oo);
                    o00O00.OooO0oO(sbOooO0O1.toString());
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel != null) {
                            long userId2 = this.$model.getUserId();
                            value = OooOOO.f41235OooO00o.OooOo().getValue();
                            if (value != null) {
                                main = Dispatchers.getMain();
                                fixRechargeOrderManager$confirmRechargeOrder$1$1$1 = new FixRechargeOrderManager$confirmRechargeOrder$1$1$1(rechargeMenuConfirmOrderResultModel, null);
                                this.label = 2;
                                if (BuildersKt.withContext(main, fixRechargeOrderManager$confirmRechargeOrder$1$1$1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        String orderId4 = this.$model.getOrderId();
                        this.label = 3;
                        objOooO0OO2 = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId4, this);
                        if (objOooO0OO2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objOooO0OO2 = Unit.INSTANCE;
                        }
                        if (objOooO0OO2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        o00O00.OooOO0O("Google补单 App确认 失败 result:" + apiResult);
                        code2 = apiResult.getCode();
                        if (code2 != 2000) {
                            String orderId5 = this.$model.getOrderId();
                            this.label = 4;
                            objOooO0OO = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId5, this);
                            if (objOooO0OO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objOooO0OO = Unit.INSTANCE;
                            }
                            if (objOooO0OO == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            String orderId6 = this.$model.getOrderId();
                            this.label = 4;
                            objOooO0OO = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId6, this);
                            if (objOooO0OO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objOooO0OO = Unit.INSTANCE;
                            }
                            if (objOooO0OO == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    main2 = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 6;
                    if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    String orderId7 = this.$model.getOrderId();
                    this.label = 3;
                    objOooO0OO2 = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId7, this);
                    if (objOooO0OO2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO0OO2 = Unit.INSTANCE;
                    }
                    if (objOooO0OO2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    main2 = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 6;
                    if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                case 4:
                case 5:
                    ResultKt.throwOnFailure(obj);
                    main2 = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 6;
                    if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$1", f = "FixRechargeOrderManager.kt", i = {}, l = {67, 68}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PayOrder $payOrder;
        public int label;
        public final /* synthetic */ FixRechargeOrderManager this$0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$1$1", f = "FixRechargeOrderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ FixRechargeOrderManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02001(FixRechargeOrderManager fixRechargeOrderManager, Continuation<? super C02001> continuation) {
                super(2, continuation);
                this.this$0 = fixRechargeOrderManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02001(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C02001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.toConsumeOrderFirst();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04601(PayOrder payOrder, FixRechargeOrderManager fixRechargeOrderManager, Continuation<? super C04601> continuation) {
            super(2, continuation);
            this.$payOrder = payOrder;
            this.this$0 = fixRechargeOrderManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04601(this.$payOrder, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
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
            String orderId = this.$payOrder.getOrderId();
            this.label = 1;
            Object objOooO0OO = OooO0OO.OooO00o().OooOoOO().OooO0OO(orderId, this);
            if (objOooO0OO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO0OO = Unit.INSTANCE;
            }
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C02001 c02001 = new C02001(this.this$0, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c02001, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$2", f = "FixRechargeOrderManager.kt", i = {}, l = {75, 76}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PayOrder $payOrder;
        public int label;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$2$1, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$toConsumeOrder$2$1", f = "FixRechargeOrderManager.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Boolean $consumeOrder;
            public final /* synthetic */ PayOrder $payOrder;
            public int label;
            public final /* synthetic */ FixRechargeOrderManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Boolean bool, PayOrder payOrder, FixRechargeOrderManager fixRechargeOrderManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$consumeOrder = bool;
                this.$payOrder = payOrder;
                this.this$0 = fixRechargeOrderManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$consumeOrder, this.$payOrder, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Boolean bool = this.$consumeOrder;
                    if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                        this.$payOrder.setConsume(true);
                        PayOrder payOrder = this.$payOrder;
                        this.label = 1;
                        Object objOooO0o0 = OooO0OO.OooO00o().OooOoOO().OooO0o0(payOrder.getOrderId(), payOrder.getIsConsume(), this);
                        if (objOooO0o0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objOooO0o0 = Unit.INSTANCE;
                        }
                        if (objOooO0o0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                        this.this$0.confirmRechargeOrder(this.$payOrder);
                    } else {
                        this.this$0.toConsumeOrderFirst();
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.confirmRechargeOrder(this.$payOrder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PayOrder payOrder, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$payOrder = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FixRechargeOrderManager.this.new AnonymousClass2(this.$payOrder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
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
            PayManager payManager = FixRechargeOrderManager.this.payManager;
            PayOrder payOrder = this.$payOrder;
            this.label = 1;
            obj = payManager.consumeOrder(payOrder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Boolean) obj, this.$payOrder, FixRechargeOrderManager.this, null);
            this.label = 2;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public FixRechargeOrderManager(@NotNull FragmentActivity activity, @NotNull PayManager payManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payManager, "payManager");
        this.activity = activity;
        this.payManager = payManager;
        this.failedOrderList = new ArrayList();
    }

    private final void checkOrderState(int type, boolean isSubscription) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new AnonymousClass1(type, isSubscription, null), 2, null);
    }

    public static /* synthetic */ void checkOrderState$default(FixRechargeOrderManager fixRechargeOrderManager, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        fixRechargeOrderManager.checkOrderState(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmRechargeOrder(PayOrder model) {
        o00O00.OooO0O0("Google补单 App确认 model:" + model);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new C04591(model, this, null), 2, null);
    }

    public static /* synthetic */ void start$default(FixRechargeOrderManager fixRechargeOrderManager, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        fixRechargeOrderManager.start(i, z);
    }

    private final void toConsumeOrder(PayOrder payOrder) {
        o00O00.OooO0O0("Google补单 SDK消费 payOrder:" + payOrder);
        if (StringsKt.isBlank(payOrder.getPurchaseToken())) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new C04601(payOrder, this, null), 2, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new AnonymousClass2(payOrder, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toConsumeOrderFirst() {
        List<PayOrder> list = this.failedOrderList;
        if (list == null || list.isEmpty()) {
            Function0<Unit> function0 = this.listener;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        PayOrder payOrder = this.failedOrderList.get(0);
        this.failedOrderList.remove(payOrder);
        if (payOrder.getIsConsume()) {
            confirmRechargeOrder(payOrder);
        } else {
            toConsumeOrder(payOrder);
        }
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Function0<Unit> getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable Function0<Unit> function0) {
        this.listener = function0;
    }

    public final void start(int type, boolean isSubscription) {
        checkOrderState(type, isSubscription);
    }
}
