package p101o000oo;

import androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nConflatedEventBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,35:1\n54#2:36\n57#2:40\n50#3:37\n55#3:39\n106#4:38\n*S KotlinDebug\n*F\n+ 1 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n*L\n30#1:36\n30#1:40\n30#1:37\n30#1:39\n30#1:38\n*E\n"})
public final class o0O0O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Pair<Integer, T>> f35566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ConflatedEventBus$special$$inlined$mapNotNull$1 f35567OooO0O0;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1] */
    public o0O0O00(int i) {
        final MutableStateFlow<Pair<Integer, T>> MutableStateFlow = StateFlowKt.MutableStateFlow(new Pair(Integer.MIN_VALUE, null));
        this.f35566OooO00o = MutableStateFlow;
        this.f35567OooO0O0 = new Flow<Object>() { // from class: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n*L\n1#1,222:1\n55#2:223\n56#2:225\n30#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10153OooO0Oo;

                /* JADX INFO: renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public /* synthetic */ Object f10154OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public int f10156OooO0o0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f10154OooO0Oo = obj;
                        this.f10156OooO0o0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f10153OooO0Oo = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f10156OooO0o0;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f10156OooO0o0 = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f10154OooO0Oo;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f10156OooO0o0;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        Object second = ((Pair) obj).getSecond();
                        if (second != null) {
                            anonymousClass1.f10156OooO0o0 = 1;
                            if (this.f10153OooO0Oo.emit(second, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public final Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = MutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final void OooO00o(@NotNull T data) {
        Intrinsics.checkNotNullParameter(data, "data");
        MutableStateFlow<Pair<Integer, T>> mutableStateFlow = this.f35566OooO00o;
        mutableStateFlow.setValue(new Pair<>(Integer.valueOf(mutableStateFlow.getValue().getFirst().intValue() + 1), data));
    }
}
