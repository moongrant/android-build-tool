package p402o0Oo0OOO;

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
import p377o0OOoOo.o000O000;
import p381o0OOoo0O.Oooo0;
import p385o0OOooOO.o00oOoo;
import p420o0OoO0OO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.cache.SharedAccountProtectManager$syncAccountProtection$1", f = "SharedAccountProtectManager.kt", i = {0, 1}, l = {25, 26}, m = "invokeSuspend", n = {"$this$jobLiveData", "$this$jobLiveData"}, s = {"L$0", "L$0"})
public final class o000OOo0 extends SuspendLambda implements Function2<o0OO00O<Unit>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44466OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f44467OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedAccountProtectManager$syncAccountProtection$1$1", f = "SharedAccountProtectManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<AccountPrivacy, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44468OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f44468OooO0Oo = obj;
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
            AccountPrivacy accountPrivacy = (AccountPrivacy) this.f44468OooO0Oo;
            MutableLiveData<Boolean> mutableLiveData = o00.f44461OooO00o;
            o00.f44461OooO00o.postValue(Boxing.boxBoolean(accountPrivacy != null && accountPrivacy.getIsShowProtection()));
            o00.f44462OooO0O0.postValue(Boxing.boxBoolean(accountPrivacy != null && accountPrivacy.getIsOpenProtection()));
            return Unit.INSTANCE;
        }
    }

    public o000OOo0(Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000OOo0 o000ooo1 = new o000OOo0(continuation);
        o000ooo1.f44467OooO0o0 = obj;
        return o000ooo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0OO00O<Unit> o0oo00o2, Continuation<? super Unit> continuation) {
        return ((o000OOo0) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0OO00O o0oo00o2;
        o0OO00O o0oo00o3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44466OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                o0oo00o2 = (o0OO00O) this.f44467OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o3 = (o0OO00O) this.f44467OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            o0oo00o3.postValue(unit);
            return unit;
        }
        ResultKt.throwOnFailure(obj);
        o0OO00O o0oo00o4 = (o0OO00O) this.f44467OooO0o0;
        AccountRepo accountRepo = AccountRepo.f22858OooO00o;
        this.f44467OooO0o0 = o0oo00o4;
        this.f44466OooO0Oo = 1;
        accountRepo.getClass();
        String str = Oooo0.f44260OooOOO;
        Object objOooO0Oo = OooOOO.OooO0Oo(new AccountRepo$getAccountPrivacy$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null), this);
        if (objOooO0Oo == coroutine_suspended) {
            return coroutine_suspended;
        }
        o0oo00o2 = o0oo00o4;
        obj = objOooO0Oo;
        OooO00o oooO00o = new OooO00o(null);
        this.f44467OooO0o0 = o0oo00o2;
        this.f44466OooO0Oo = 2;
        if (o000O000.OooO0OO((ApiResult) obj, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
            return coroutine_suspended;
        }
        o0oo00o3 = o0oo00o2;
        Unit unit2 = Unit.INSTANCE;
        o0oo00o3.postValue(unit2);
        return unit2;
    }
}
