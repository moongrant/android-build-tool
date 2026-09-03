package p391o0OOooo0;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.GiftRepo$getUserBackpackPropInventory$$inlined$call$1;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.o00O0O;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$loadGiftBackpackPropInventory$2", f = "GiftPropManager.kt", i = {}, l = {266, 267, 267}, m = "invokeSuspend", n = {}, s = {})
public final class o000000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43557OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f43558OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$loadGiftBackpackPropInventory$2$1", f = "GiftPropManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<GiftPropAll, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f43559OooO0Oo;

        /* JADX INFO: renamed from: o0OOooo0.o000000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0450OooO00o extends Lambda implements Function1<GiftPropAll, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0450OooO00o f43560OooO0Oo = new C0450OooO00o();

            public C0450OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GiftPropAll giftPropAll) {
                GiftPropAll item = giftPropAll;
                Intrinsics.checkNotNullParameter(item, "item");
                return Boolean.valueOf(item.getGiftPropTypeUser() == GiftPropTypeUser.Backpack.getValue());
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f43559OooO0Oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GiftPropAll giftPropAll, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(giftPropAll, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            GiftPropAll giftPropAll = (GiftPropAll) this.f43559OooO0Oo;
            Map<Integer, GiftPropModel> value = oo0o0Oo.f43574OooO0O0.getValue();
            if (value != null) {
                value.clear();
            }
            try {
                List<GiftPropAll> value2 = oo0o0Oo.f43576OooO0Oo.getValue();
                if (value2 != null) {
                    Boxing.boxBoolean(CollectionsKt.removeAll((List) value2, (Function1) C0450OooO00o.f43560OooO0Oo));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (giftPropAll != null) {
                giftPropAll.initBackpack();
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
                OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o0O0O00(giftPropAll, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(long j, Continuation<? super o000000O> continuation) {
        super(2, continuation);
        this.f43558OooO0o0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000000O(this.f43558OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OooO00o oooO00o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43557OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                oooO00o = new OooO00o(null);
                this.f43557OooO0Oo = 3;
                if (o00O0O.OooO0OO((ApiResult) obj, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boxing.boxBoolean(false))) {
            return Unit.INSTANCE;
        }
        this.f43557OooO0Oo = 1;
        if (DelayKt.delay(this.f43558OooO0o0, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f43557OooO0Oo = 2;
        String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/GetUserBackpackPropInventory");
        obj = OooOOO.OooO0Oo(new GiftRepo$getUserBackpackPropInventory$$inlined$call$1(oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        oooO00o = new OooO00o(null);
        this.f43557OooO0Oo = 3;
        if (o00O0O.OooO0OO((ApiResult) obj, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
