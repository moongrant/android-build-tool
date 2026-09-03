package androidx.paging;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.OooOOOO;
import p089o000o000.o0000Ooo;
import p089o000o000.o000O000;
import p089o000o000.o000OO;
import p089o000o000.o00O0O00;
import p089o000o000.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "androidx/paging/FlowExtKt$simpleMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super o0O0ooO<Object>>, o000OO.OooO00o<Object, Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000OO f8721Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8722Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ FlowCollector f8723Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f8724Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f8725OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(Continuation continuation, o000OO o000oo2, o00O0O00 o00o0o01) {
        super(3, continuation);
        this.f8721Oooo = o000oo2;
        this.f8725OoooO00 = o00o0o01;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super o0O0ooO<Object>> flowCollector, o000OO.OooO00o<Object, Object> oooO00o, Continuation<? super Unit> continuation) {
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(continuation, this.f8721Oooo, this.f8725OoooO00);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.f8723Oooo0oO = flowCollector;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.f8724Oooo0oo = oooO00o;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8722Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = this.f8723Oooo0oO;
            o000OO.OooO00o oooO00o = (o000OO.OooO00o) this.f8724Oooo0oo;
            o000OO o000oo2 = this.f8721Oooo;
            o000O000<Key, Value> o000o001 = oooO00o.f28879OooO00o;
            Job job = oooO00o.f28881OooO0OO;
            o00O0O00 o00o0o01 = this.f8725OoooO00;
            Objects.requireNonNull(o000oo2);
            Flow flowOooO00o = o00o0o01 == null ? o000o001.f28797OooOOO0 : OooOOOO.OooO00o(job, new PageFetcher$injectRemoteEvents$1(o00o0o01, o000o001, new o0000Ooo(), null));
            o000OO o000oo3 = this.f8721Oooo;
            o0O0ooO o0o0ooo = new o0O0ooO(flowOooO00o, new o000OO.OooO0O0(o000oo3, oooO00o.f28879OooO00o, o000oo3.f28878OooO0o0));
            this.f8722Oooo0o = 1;
            if (flowCollector.emit(o0o0ooo, this) == coroutine_suspended) {
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
