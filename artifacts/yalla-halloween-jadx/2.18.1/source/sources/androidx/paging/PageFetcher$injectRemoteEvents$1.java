package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0000O0O;
import p089o000o000.o0000Ooo;
import p089o000o000.o000O000;
import p089o000o000.o00O0O00;
import p089o000o000.o00O0O0O;
import p089o000o000.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$injectRemoteEvents$1 extends SuspendLambda implements Function2<o00O0OO0<o0000O0O<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O000<Object, Object> f8726Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8727Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f8728Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O00<Object, Object> f8729Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f8730OoooO00;

    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0OO0<o0000O0O<Object>> f8731Oooo0o;

        public OooO00o(o00O0OO0<o0000O0O<Object>> o00o0oo1) {
            this.f8731Oooo0o = o00o0oo1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Object objSend = this.f8731Oooo0o.send((o0000O0O) obj, continuation);
            return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1(o00O0O00<Object, Object> o00o0o01, o000O000<Object, Object> o000o001, o0000Ooo o0000ooo, Continuation<? super PageFetcher$injectRemoteEvents$1> continuation) {
        super(2, continuation);
        this.f8729Oooo0oo = o00o0o01;
        this.f8726Oooo = o000o001;
        this.f8730OoooO00 = o0000ooo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1 = new PageFetcher$injectRemoteEvents$1(this.f8729Oooo0oo, this.f8726Oooo, this.f8730OoooO00, continuation);
        pageFetcher$injectRemoteEvents$1.f8728Oooo0oO = obj;
        return pageFetcher$injectRemoteEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0OO0<o0000O0O<Object>> o00o0oo1, Continuation<? super Unit> continuation) {
        return ((PageFetcher$injectRemoteEvents$1) create(o00o0oo1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8727Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0OO0 o00o0oo1 = (o00O0OO0) this.f8728Oooo0oO;
            Flow flowOooO00o = o00O0O0O.OooO00o(new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.f8729Oooo0oo.getState(), this.f8726Oooo.f28797OooOOO0, null, this.f8730OoooO00));
            OooO00o oooO00o = new OooO00o(o00o0oo1);
            this.f8727Oooo0o = 1;
            if (flowOooO00o.collect(oooO00o, this) == coroutine_suspended) {
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
