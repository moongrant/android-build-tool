package p089o000o000;

import androidx.annotation.CheckResult;
import androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00000;
import p089o000o000.o00000O;
import p089o000o000.o00000O0;
import p089o000o000.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {
    @CheckResult
    @NotNull
    public static final <T> Flow<o0O0ooO<T>> OooO00o(@NotNull Flow<o0O0ooO<T>> flow, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        final Flow flowOooO00o = o00Ooo.OooO00o(o00Ooo.OooO0O0(flow, new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(null, scope, null)), new OooOO0(null));
        return FlowKt.shareIn(FlowKt.onCompletion(FlowKt.onStart(new Flow<o0O0ooO<Object>>() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1

            /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector, SuspendFunction {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8663Oooo0o;

                /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public /* synthetic */ Object f8664Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public int f8665Oooo0oO;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f8664Oooo0o = obj;
                        this.f8665Oooo0oO |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f8663Oooo0o = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f8665Oooo0oO;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8665Oooo0oO = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f8664Oooo0o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f8665Oooo0oO;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.f8663Oooo0o;
                        o00000O o00000o = (o00000O) obj;
                        o0O0ooO o0o0ooo = new o0O0ooO(FlowKt.onCompletion(FlowKt.onStart(o00000o.f28708OooO0Oo.f28621OooO0o0, new o00000(o00000o, null)), new o00000O0(o00000o, null)), o00000o.f28706OooO0O0.f29066OooO0O0);
                        anonymousClass1.f8665Oooo0oO = 1;
                        if (flowCollector.emit(o0o0ooo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public final Object collect(@NotNull FlowCollector<? super o0O0ooO<Object>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowOooO00o.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new OooOO0O(null, null)), new OooOOO0(null, null)), scope, SharingStarted.INSTANCE.getLazily(), 1);
    }
}
