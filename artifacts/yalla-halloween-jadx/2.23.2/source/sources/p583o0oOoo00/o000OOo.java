package p583o0oOoo00;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$getAccountPrivacy$$inlined$call$1;
import com.yalla.yalla.model.AccountPrivacy;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo.OooOOO0;
import p384o0OOoo0O.o00O0O;
import p391o0OOooo0.oo000o;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.cache.SharedAccountProtectManager$syncAccountProtection$1", f = "SharedAccountProtectManager.kt", i = {0, 1}, l = {25, 26}, m = "invokeSuspend", n = {"$this$jobLiveData", "$this$jobLiveData"}, s = {"L$0", "L$0"})
public final class o000OOo extends SuspendLambda implements Function2<o00OO0O0<Unit>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56686OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56687OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedAccountProtectManager$syncAccountProtection$1$1", f = "SharedAccountProtectManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<AccountPrivacy, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f56688OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f56688OooO0Oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountPrivacy accountPrivacy, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(accountPrivacy, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AccountPrivacy accountPrivacy = (AccountPrivacy) this.f56688OooO0Oo;
            MutableLiveData<Boolean> mutableLiveData = o000000.f56634OooO00o;
            o000000.f56634OooO00o.postValue(Boxing.boxBoolean(accountPrivacy != null && accountPrivacy.getIsShowProtection()));
            o000000.f56635OooO0O0.postValue(Boxing.boxBoolean(accountPrivacy != null && accountPrivacy.getIsOpenProtection()));
            return Unit.INSTANCE;
        }
    }

    public o000OOo(Continuation<? super o000OOo> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000OOo o000ooo2 = new o000OOo(continuation);
        o000ooo2.f56687OooO0o0 = obj;
        return o000ooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00OO0O0<Unit> o00oo0o1, Continuation<? super Unit> continuation) {
        return ((o000OOo) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00OO0O0 o00oo0o1;
        o00OO0O0 o00oo0o2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56686OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                o00oo0o1 = (o00OO0O0) this.f56687OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o2 = (o00OO0O0) this.f56687OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            o00oo0o2.postValue(unit);
            return unit;
        }
        ResultKt.throwOnFailure(obj);
        o00OO0O0 o00oo0o3 = (o00OO0O0) this.f56687OooO0o0;
        AccountRepo accountRepo = AccountRepo.f22385OooO00o;
        this.f56687OooO0o0 = o00oo0o3;
        this.f56686OooO0Oo = 1;
        accountRepo.getClass();
        String str = OooOOO0.f43299OooOOO;
        Object objOooO0Oo = OooOOO.OooO0Oo(new AccountRepo$getAccountPrivacy$$inlined$call$1(oo000o.OooO00o(str, "url", str, 0), null), this);
        if (objOooO0Oo == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00oo0o1 = o00oo0o3;
        obj = objOooO0Oo;
        OooO00o oooO00o = new OooO00o(null);
        this.f56687OooO0o0 = o00oo0o1;
        this.f56686OooO0Oo = 2;
        if (o00O0O.OooO0OO((ApiResult) obj, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00oo0o2 = o00oo0o1;
        Unit unit2 = Unit.INSTANCE;
        o00oo0o2.postValue(unit2);
        return unit2;
    }
}
