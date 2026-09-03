package p429o0OoOO;

import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.repository.WalletRepo;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0Oo0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.FixRechargeOrderManager$checkOrderState$1", f = "FixRechargeOrderManager.kt", i = {}, l = {34, 35, 36, 38, 43}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFixRechargeOrderManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixRechargeOrderManager.kt\ncom/yalla/yalla/manager/FixRechargeOrderManager$checkOrderState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1855#2,2:137\n*S KotlinDebug\n*F\n+ 1 FixRechargeOrderManager.kt\ncom/yalla/yalla/manager/FixRechargeOrderManager$checkOrderState$1\n*L\n38#1:137,2\n*E\n"})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46771OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f46772OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f46773OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f46774OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.manager.FixRechargeOrderManager$checkOrderState$1$2", f = "FixRechargeOrderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f46775OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo000 oooo000, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46775OooO0Oo = oooo000;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46775OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Oooo000.OooO00o(this.f46775OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(Oooo000 oooo000, int i, boolean z, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f46773OooO0o0 = oooo000;
        this.f46772OooO0o = i;
        this.f46774OooO0oO = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo(this.f46773OooO0o0, this.f46772OooO0o, this.f46774OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MainCoroutineDispatcher main;
        OooO00o oooO00o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46771OooO0Oo;
        boolean z = this.f46774OooO0oO;
        Oooo000 oooo000 = this.f46773OooO0o0;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24376OooO00o;
                this.f46771OooO0Oo = 3;
                walletRepo.getClass();
                o00Oo0.OooO00o().OooOoO().OooO0Oo((List) obj);
                if (Unit.INSTANCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo000.f46784OooO0Oo.clear();
                WalletRepo walletRepo2 = WalletRepo.f24376OooO00o;
                this.f46771OooO0Oo = 4;
                walletRepo2.getClass();
                obj = o00Oo0.OooO00o().OooOoO().OooO0o0();
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                for (PayOrder payOrder : (Iterable) obj) {
                    if (payOrder.getIsSubscription() == z) {
                        oooo000.f46784OooO0Oo.add(payOrder);
                    }
                }
                main = Dispatchers.getMain();
                oooO00o = new OooO00o(oooo000, null);
                this.f46771OooO0Oo = 5;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                oooo000.f46784OooO0Oo.clear();
                WalletRepo walletRepo3 = WalletRepo.f24376OooO00o;
                this.f46771OooO0Oo = 4;
                walletRepo3.getClass();
                obj = o00Oo0.OooO00o().OooOoO().OooO0o0();
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                while (r12.hasNext()) {
                    if (payOrder.getIsSubscription() == z) {
                        oooo000.f46784OooO0Oo.add(payOrder);
                    }
                }
                main = Dispatchers.getMain();
                oooO00o = new OooO00o(oooo000, null);
                this.f46771OooO0Oo = 5;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 4) {
                ResultKt.throwOnFailure(obj);
                while (r12.hasNext()) {
                    if (payOrder.getIsSubscription() == z) {
                        oooo000.f46784OooO0Oo.add(payOrder);
                    }
                }
                main = Dispatchers.getMain();
                oooO00o = new OooO00o(oooo000, null);
                this.f46771OooO0Oo = 5;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
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
        this.f46771OooO0Oo = 1;
        if (DelayKt.delay(2000L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        PayManager payManager = oooo000.f46782OooO0O0;
        this.f46771OooO0Oo = 2;
        obj = payManager.queryPurchases(this.f46772OooO0o, z, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        WalletRepo walletRepo4 = WalletRepo.f24376OooO00o;
        this.f46771OooO0Oo = 3;
        walletRepo4.getClass();
        o00Oo0.OooO00o().OooOoO().OooO0Oo((List) obj);
        if (Unit.INSTANCE == coroutine_suspended) {
            return coroutine_suspended;
        }
        oooo000.f46784OooO0Oo.clear();
        WalletRepo walletRepo5 = WalletRepo.f24376OooO00o;
        this.f46771OooO0Oo = 4;
        walletRepo5.getClass();
        obj = o00Oo0.OooO00o().OooOoO().OooO0o0();
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        while (r12.hasNext()) {
            if (payOrder.getIsSubscription() == z) {
                oooo000.f46784OooO0Oo.add(payOrder);
            }
        }
        main = Dispatchers.getMain();
        oooO00o = new OooO00o(oooo000, null);
        this.f46771OooO0Oo = 5;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
