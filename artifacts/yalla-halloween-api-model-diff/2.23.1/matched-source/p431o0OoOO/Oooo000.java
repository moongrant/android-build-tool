package p431o0OoOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.WalletRepo;
import io.agora.rtc.Constants;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oOo00o0o;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46781OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final PayManager f46782OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f46783OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f46784OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.manager.FixRechargeOrderManager$confirmRechargeOrder$1", f = "FixRechargeOrderManager.kt", i = {}, l = {100, 108, 115, 121, 125, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46785OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f46786OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f46787OooO0o0;

        /* JADX INFO: renamed from: o0OoOO.Oooo000$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.manager.FixRechargeOrderManager$confirmRechargeOrder$1$1$1", f = "FixRechargeOrderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFixRechargeOrderManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixRechargeOrderManager.kt\ncom/yalla/yalla/manager/FixRechargeOrderManager$confirmRechargeOrder$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
        public static final class C0454OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RechargeMenuConfirmOrderResultModel f46788OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0454OooO00o(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel, Continuation<? super C0454OooO00o> continuation) {
                super(2, continuation);
                this.f46788OooO0Oo = rechargeMenuConfirmOrderResultModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0454OooO00o(this.f46788OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0454OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel = this.f46788OooO0Oo;
                Long balance = rechargeMenuConfirmOrderResultModel.getBalance();
                if (balance != null) {
                    long jLongValue = balance.longValue();
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    oo0oO0.OooO0O0().postValue(Boxing.boxLong(jLongValue));
                }
                LiveEventBus.get("FixRechargeOrder_Success").post(Boxing.boxBoolean(true));
                OooOOOO.OooO0O0("Google补单 App确认 成功 data:" + oOo00o0o.OooO00o(rechargeMenuConfirmOrderResultModel));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.manager.FixRechargeOrderManager$confirmRechargeOrder$1$2", f = "FixRechargeOrderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Oooo000 f46789OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(Oooo000 oooo000, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f46789OooO0Oo = oooo000;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f46789OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Oooo000.OooO00o(this.f46789OooO0Oo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PayOrder payOrder, Oooo000 oooo000, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46787OooO0o0 = payOrder;
            this.f46786OooO0o = oooo000;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46787OooO0o0, this.f46786OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0052  */
        /* JADX WARN: Code duplicated, block: B:17:0x0067  */
        /* JADX WARN: Code duplicated, block: B:24:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00a7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x010f A[RETURN] */
        /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a8, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ApiResult apiResult;
            int code;
            String orderId;
            RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel;
            Long l;
            MainCoroutineDispatcher main;
            C0454OooO00o c0454OooO00o;
            String orderId2;
            MainCoroutineDispatcher main2;
            OooO0O0 oooO0O0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46785OooO0Oo;
            PayOrder payOrder = this.f46787OooO0o0;
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                    this.f46785OooO0Oo = 1;
                    obj = walletRepo.OooO00o(payOrder, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    OooOOOO.OooO0o("Google补单 App确认 结果 result:" + oOo00o0o.OooO00o(apiResult));
                    if (apiResult.isSuccess()) {
                        LiveEventBus.get("ConfirmRechargeOrder_Success").post(Boxing.boxBoolean(true));
                        rechargeMenuConfirmOrderResultModel = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel != null) {
                            long userId = payOrder.getUserId();
                            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                            l = (Long) oo0oO0.OooOOo0().getValue();
                            if (l != null && userId == l.longValue()) {
                                main = Dispatchers.getMain();
                                c0454OooO00o = new C0454OooO00o(rechargeMenuConfirmOrderResultModel, null);
                                this.f46785OooO0Oo = 2;
                                if (BuildersKt.withContext(main, c0454OooO00o, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        WalletRepo walletRepo2 = WalletRepo.f24384OooO00o;
                        orderId2 = payOrder.getOrderId();
                        this.f46785OooO0Oo = 3;
                        walletRepo2.getClass();
                        if (WalletRepo.OooOO0o(orderId2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        OooOOOO.OooO("Google补单 App确认 失败 result:" + apiResult);
                        code = apiResult.getCode();
                        if (code != 2000 || code == 2005) {
                            WalletRepo walletRepo3 = WalletRepo.f24384OooO00o;
                            orderId = payOrder.getOrderId();
                            this.f46785OooO0Oo = 4;
                            walletRepo3.getClass();
                            if (WalletRepo.OooOO0o(orderId) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (System.currentTimeMillis() - payOrder.getCreateTime() > 259200000) {
                            WalletRepo walletRepo4 = WalletRepo.f24384OooO00o;
                            String orderId3 = payOrder.getOrderId();
                            this.f46785OooO0Oo = 5;
                            walletRepo4.getClass();
                            if (WalletRepo.OooOO0o(orderId3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    main2 = Dispatchers.getMain();
                    oooO0O0 = new OooO0O0(this.f46786OooO0o, null);
                    this.f46785OooO0Oo = 6;
                    if (BuildersKt.withContext(main2, oooO0O0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    OooOOOO.OooO0o("Google补单 App确认 结果 result:" + oOo00o0o.OooO00o(apiResult));
                    if (apiResult.isSuccess()) {
                        LiveEventBus.get("ConfirmRechargeOrder_Success").post(Boxing.boxBoolean(true));
                        rechargeMenuConfirmOrderResultModel = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel != null) {
                            long userId2 = payOrder.getUserId();
                            oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                            l = (Long) oo0oO0.OooOOo0().getValue();
                            if (l != null) {
                                main = Dispatchers.getMain();
                                c0454OooO00o = new C0454OooO00o(rechargeMenuConfirmOrderResultModel, null);
                                this.f46785OooO0Oo = 2;
                                if (BuildersKt.withContext(main, c0454OooO00o, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        WalletRepo walletRepo5 = WalletRepo.f24384OooO00o;
                        orderId2 = payOrder.getOrderId();
                        this.f46785OooO0Oo = 3;
                        walletRepo5.getClass();
                        if (WalletRepo.OooOO0o(orderId2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        OooOOOO.OooO("Google补单 App确认 失败 result:" + apiResult);
                        code = apiResult.getCode();
                        if (code != 2000) {
                            WalletRepo walletRepo6 = WalletRepo.f24384OooO00o;
                            orderId = payOrder.getOrderId();
                            this.f46785OooO0Oo = 4;
                            walletRepo6.getClass();
                            if (WalletRepo.OooOO0o(orderId) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            WalletRepo walletRepo7 = WalletRepo.f24384OooO00o;
                            orderId = payOrder.getOrderId();
                            this.f46785OooO0Oo = 4;
                            walletRepo7.getClass();
                            if (WalletRepo.OooOO0o(orderId) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    main2 = Dispatchers.getMain();
                    oooO0O0 = new OooO0O0(this.f46786OooO0o, null);
                    this.f46785OooO0Oo = 6;
                    if (BuildersKt.withContext(main2, oooO0O0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    WalletRepo walletRepo8 = WalletRepo.f24384OooO00o;
                    orderId2 = payOrder.getOrderId();
                    this.f46785OooO0Oo = 3;
                    walletRepo8.getClass();
                    if (WalletRepo.OooOO0o(orderId2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    main2 = Dispatchers.getMain();
                    oooO0O0 = new OooO0O0(this.f46786OooO0o, null);
                    this.f46785OooO0Oo = 6;
                    if (BuildersKt.withContext(main2, oooO0O0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                case 4:
                case 5:
                    ResultKt.throwOnFailure(obj);
                    main2 = Dispatchers.getMain();
                    oooO0O0 = new OooO0O0(this.f46786OooO0o, null);
                    this.f46785OooO0Oo = 6;
                    if (BuildersKt.withContext(main2, oooO0O0, this) == coroutine_suspended) {
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

    public Oooo000(@NotNull FragmentActivity activity, @NotNull PayManager payManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payManager, "payManager");
        this.f46781OooO00o = activity;
        this.f46782OooO0O0 = payManager;
        this.f46784OooO0Oo = new ArrayList();
    }

    public static final void OooO00o(Oooo000 oooo000) {
        ArrayList arrayList = oooo000.f46784OooO0Oo;
        if (arrayList == null || arrayList.isEmpty()) {
            Function0<Unit> function0 = oooo000.f46783OooO0OO;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        PayOrder payOrder = (PayOrder) arrayList.get(0);
        arrayList.remove(payOrder);
        if (payOrder.getIsConsume()) {
            oooo000.OooO0O0(payOrder);
            return;
        }
        OooOOOO.OooO0O0("Google补单 SDK消费 payOrder:" + payOrder);
        boolean zIsBlank = StringsKt.isBlank(payOrder.getPurchaseToken());
        FragmentActivity fragmentActivity = oooo000.f46781OooO00o;
        if (zIsBlank) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), Dispatchers.getIO(), null, new Oooo0(payOrder, oooo000, null), 2, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), Dispatchers.getIO(), null, new o000oOoO(payOrder, oooo000, null), 2, null);
        }
    }

    public final void OooO0O0(PayOrder payOrder) {
        OooOOOO.OooO0O0("Google补单 App确认 model:" + payOrder);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f46781OooO00o), Dispatchers.getIO(), null, new OooO00o(payOrder, this, null), 2, null);
    }

    public final void OooO0OO(int i, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f46781OooO00o), Dispatchers.getIO(), null, new OooOo(this, i, z, null), 2, null);
    }
}
