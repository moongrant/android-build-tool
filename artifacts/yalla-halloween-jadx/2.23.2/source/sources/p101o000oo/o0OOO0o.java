package p101o000oo;

import androidx.annotation.CheckResult;
import androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o0000O;
import p101o000oo.o0000OO0;
import p101o000oo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCachedPagingData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n+ 2 FlowExt.kt\nandroidx/paging/FlowExtKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,134:1\n106#2:135\n47#3:136\n49#3:140\n50#4:137\n55#4:139\n106#5:138\n*S KotlinDebug\n*F\n+ 1 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n*L\n97#1:135\n106#1:136\n106#1:140\n106#1:137\n106#1:139\n106#1:138\n*E\n"})
public final class o0OOO0o {
    @CheckResult
    @NotNull
    public static final SharedFlow OooO00o(@NotNull Flow flow, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Flow flowOooO00o = o00000O.OooO00o(flow, new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(null, scope));
        oo000o operation = new oo000o(null);
        Intrinsics.checkNotNullParameter(flowOooO00o, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        final Flow flow2 = FlowKt.flow(new o00000(flowOooO00o, operation, null));
        return FlowKt.shareIn(FlowKt.onCompletion(FlowKt.onStart(new Flow<androidx.paging.o0OOO0o<Object>>() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1

            /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n*L\n1#1,222:1\n48#2:223\n107#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10144OooO0Oo;

                /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public /* synthetic */ Object f10145OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public int f10147OooO0o0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f10145OooO0Oo = obj;
                        this.f10147OooO0o0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f10144OooO0Oo = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f10147OooO0o0;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f10147OooO0o0 = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f10145OooO0Oo;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f10147OooO0o0;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        o0000OO0 o0000oo1 = (o0000OO0) obj;
                        Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.onStart(o0000oo1.f35431OooO0OO.f10194OooO0o0, new o000OO(o0000oo1, null)), new o0000O(o0000oo1, null));
                        o0OOO0o<T> o0ooo0o2 = o0000oo1.f35430OooO0O0;
                        o0OOO0o o0ooo0o3 = new o0OOO0o(flowOnCompletion, o0ooo0o2.f10461OooO0O0, o0ooo0o2.f10462OooO0OO, new OooOOOO(o0000oo1));
                        anonymousClass1.f10147OooO0o0 = 1;
                        if (this.f10144OooO0Oo.emit(o0ooo0o3, anonymousClass1) == coroutine_suspended) {
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
            public final Object collect(@NotNull FlowCollector<? super o0OOO0o<Object>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new o00oO0o(null)), new o0ooOOo(null)), scope, SharingStarted.INSTANCE.getLazily(), 1);
    }
}
