package com.google.accompanist.pager;

import androidx.compose.runtime.SnapshotStateKt;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$4$1", f = "Pager.kt", i = {}, l = {YallaTeamMessage.JumpId.YallaPremium_Patrician}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager$Pager$4$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,580:1\n20#2:581\n22#2:585\n50#3:582\n55#3:584\n106#4:583\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager$Pager$4$1\n*L\n397#1:581\n397#1:585\n397#1:582\n397#1:584\n397#1:583\n*E\n"})
public final class Pager$Pager$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000000 f13870OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f13871OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000000 o000000Var) {
            super(0);
            this.f13871OooO0Oo = o000000Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f13871OooO0Oo.isScrollInProgress());
        }
    }

    public static final class OooO0O0 implements FlowCollector<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f13872OooO0Oo;

        public OooO0O0(o000000 o000000Var) {
            this.f13872OooO0Oo = o000000Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Boolean bool, Continuation continuation) {
            bool.booleanValue();
            this.f13872OooO0Oo.OooOO0O(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pager$Pager$4$1(o000000 o000000Var, Continuation<? super Pager$Pager$4$1> continuation) {
        super(2, continuation);
        this.f13870OooO0o0 = o000000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Pager$Pager$4$1(this.f13870OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Pager$Pager$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f13869OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o000000 o000000Var = this.f13870OooO0o0;
            final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new OooO00o(o000000Var));
            Flow flowDrop = FlowKt.drop(new Flow<Boolean>() { // from class: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Pager.kt\ncom/google/accompanist/pager/Pager$Pager$4$1\n*L\n1#1,222:1\n21#2:223\n22#2:225\n397#3:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f13874OooO0Oo;

                    /* JADX INFO: renamed from: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2", f = "Pager.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                        public /* synthetic */ Object f13875OooO0Oo;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public int f13877OooO0o0;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f13875OooO0Oo = obj;
                            this.f13877OooO0o0 |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f13874OooO0Oo = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f13877OooO0o0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f13877OooO0o0 = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f13875OooO0Oo;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f13877OooO0o0;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            if (!((Boolean) obj).booleanValue()) {
                                anonymousClass1.f13877OooO0o0 = 1;
                                if (this.f13874OooO0Oo.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                public final Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, 1);
            OooO0O0 oooO0O0 = new OooO0O0(o000000Var);
            this.f13869OooO0Oo = 1;
            if (flowDrop.collect(oooO0O0, this) == coroutine_suspended) {
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
