package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o0000O0;
import p101o000oo.o0000O0O;
import p101o000oo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
public final class oo0o0Oo extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10512OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o<Object> f10513OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo<Object> f10514OooO0o0;

    @SourceDebugExtension({"SMAP\nPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$collectFrom$2$1\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,548:1\n41#2,10:549\n*S KotlinDebug\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer$collectFrom$2$1\n*L\n141#1:549,10\n*E\n"})
    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo<T> f10515OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<T> f10516OooO0o0;

        public OooO00o(o0Oo0oo<T> o0oo0oo2, o0OOO0o<T> o0ooo0o2) {
            this.f10515OooO0Oo = o0oo0oo2;
            this.f10516OooO0o0 = o0ooo0o2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x000f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) throws Throwable {
            boolean z;
            Oooo000 oooo000 = (Oooo000) obj;
            o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
            if (o0000o1 != null) {
                z = o0000o1.OooO0O0(2);
            }
            if (z) {
                o0000o1.OooO00o(2, "Collected " + oooo000);
            }
            o0Oo0oo<T> o0oo0oo2 = this.f10515OooO0Oo;
            Object objWithContext = BuildersKt.withContext(o0oo0oo2.f10466OooO0O0, new o0OO00O(oooo000, o0oo0oo2, this.f10516OooO0o0, null), continuation);
            return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(o0Oo0oo<Object> o0oo0oo2, o0OOO0o<Object> o0ooo0o2, Continuation<? super oo0o0Oo> continuation) {
        super(1, continuation);
        this.f10514OooO0o0 = o0oo0oo2;
        this.f10513OooO0o = o0ooo0o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new oo0o0Oo(this.f10514OooO0o0, this.f10513OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((oo0o0Oo) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10512OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0OOO0o<Object> o0ooo0o2 = this.f10513OooO0o;
            oo0oOO0 oo0ooo0 = o0ooo0o2.f10461OooO0O0;
            o0Oo0oo<Object> o0oo0oo2 = this.f10514OooO0o0;
            o0oo0oo2.f10468OooO0Oo = oo0ooo0;
            Flow<Oooo000<Object>> flow = o0ooo0o2.f10460OooO00o;
            OooO00o oooO00o = new OooO00o(o0oo0oo2, o0ooo0o2);
            this.f10512OooO0Oo = 1;
            if (flow.collect(oooO00o, this) == coroutine_suspended) {
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
