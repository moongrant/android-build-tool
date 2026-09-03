package com.common.support.roomgiftplayer;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010#\u001a\u00020\u0014H\u0002J\u0006\u0010$\u001a\u00020\u0014J\u0006\u0010%\u001a\u00020\u0014J\u0013\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00028\u0000¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00142\u0006\u0010'\u001a\u00028\u0000¢\u0006\u0002\u0010(J\u001d\u0010*\u001a\u00020\u0014*\u00020\u00042\u0006\u0010'\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0011\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u0015X\u0086\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RH\u0010\u001b\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u001c¢\u0006\u0002\b\u0015X\u0086\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/common/support/roomgiftplayer/CustomChannel;", "T", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "nextByResume", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "innerPollingContinuationState", "Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/CancellableContinuation;", "mQueue", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getMQueue", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "mQueue$delegate", "Lkotlin/Lazy;", "onDataEmpty", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "getOnDataEmpty", "()Lkotlin/jvm/functions/Function2;", "setOnDataEmpty", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "onReceive", "Lkotlin/Function3;", "getOnReceive", "()Lkotlin/jvm/functions/Function3;", "setOnReceive", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "outContinuationState", "arouseQueuePolling", "clear", "resume", "send", "item", "(Ljava/lang/Object;)V", "sendFirst", "executeItem", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomChannel.kt\ncom/common/support/roomgiftplayer/CustomChannel\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,103:1\n314#2,11:104\n*S KotlinDebug\n*F\n+ 1 CustomChannel.kt\ncom/common/support/roomgiftplayer/CustomChannel\n*L\n89#1:104,11\n*E\n"})
public final class CustomChannel<T> {
    public static final int $stable = 8;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private MutableState<CancellableContinuation<Boolean>> innerPollingContinuationState;

    /* JADX INFO: renamed from: mQueue$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mQueue;
    private final boolean nextByResume;

    @Nullable
    private Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> onDataEmpty;

    @Nullable
    private Function3<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> onReceive;

    @NotNull
    private MutableState<CancellableContinuation<Boolean>> outContinuationState;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.CustomChannel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.CustomChannel$1", f = "CustomChannel.kt", i = {0, 1, 2}, l = {35, 104, 46}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nCustomChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomChannel.kt\ncom/common/support/roomgiftplayer/CustomChannel$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,103:1\n314#2,11:104\n*S KotlinDebug\n*F\n+ 1 CustomChannel.kt\ncom/common/support/roomgiftplayer/CustomChannel$1\n*L\n38#1:104,11\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CustomChannel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CustomChannel<T> customChannel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = customChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0047  */
        /* JADX WARN: Code duplicated, block: B:18:0x0053  */
        /* JADX WARN: Code duplicated, block: B:20:0x005b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0067 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0093 A[PHI: r1 r10
          0x0093: PHI (r1v2 kotlinx.coroutines.CoroutineScope) = 
          (r1v3 kotlinx.coroutines.CoroutineScope)
          (r1v4 kotlinx.coroutines.CoroutineScope)
          (r1v11 kotlinx.coroutines.CoroutineScope)
         binds: [B:26:0x0090, B:17:0x0051, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
          0x0093: PHI (r10v3 com.common.support.roomgiftplayer.CustomChannel$1) = 
          (r10v4 com.common.support.roomgiftplayer.CustomChannel$1)
          (r10v5 com.common.support.roomgiftplayer.CustomChannel$1)
          (r10v9 com.common.support.roomgiftplayer.CustomChannel$1)
         binds: [B:26:0x0090, B:17:0x0051, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a7 -> B:14:0x0041). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:14:0x0041). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0047
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L38
                if (r1 == r5) goto L2f
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L40
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.L$1
                com.common.support.roomgiftplayer.CustomChannel r1 = (com.common.support.roomgiftplayer.CustomChannel) r1
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
                goto L93
            L2f:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
                goto L68
            L38:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                r1 = r10
            L40:
                r10 = r9
            L41:
                boolean r6 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r6 == 0) goto Lc1
                com.common.support.roomgiftplayer.CustomChannel<T> r6 = r10.this$0
                java.util.concurrent.CopyOnWriteArrayList r6 = com.common.support.roomgiftplayer.CustomChannel.access$getMQueue(r6)
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L93
                com.common.support.roomgiftplayer.CustomChannel<T> r6 = r10.this$0
                kotlin.jvm.functions.Function2 r6 = r6.getOnDataEmpty()
                if (r6 == 0) goto L68
                r10.L$0 = r1
                r10.L$1 = r4
                r10.label = r5
                java.lang.Object r6 = r6.invoke(r1, r10)
                if (r6 != r0) goto L68
                return r0
            L68:
                com.common.support.roomgiftplayer.CustomChannel<T> r6 = r10.this$0
                r10.L$0 = r1
                r10.L$1 = r6
                r10.label = r3
                kotlinx.coroutines.CancellableContinuationImpl r7 = new kotlinx.coroutines.CancellableContinuationImpl
                kotlin.coroutines.Continuation r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r10)
                r7.<init>(r8, r5)
                r7.initCancellability()
                androidx.compose.runtime.MutableState r6 = com.common.support.roomgiftplayer.CustomChannel.access$getInnerPollingContinuationState$p(r6)
                r6.setValue(r7)
                java.lang.Object r6 = r7.getResult()
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r6 != r7) goto L90
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
            L90:
                if (r6 != r0) goto L93
                return r0
            L93:
                com.common.support.roomgiftplayer.CustomChannel<T> r6 = r10.this$0
                androidx.compose.runtime.MutableState r6 = com.common.support.roomgiftplayer.CustomChannel.access$getInnerPollingContinuationState$p(r6)
                r6.setValue(r4)
                com.common.support.roomgiftplayer.CustomChannel<T> r6 = r10.this$0
                java.util.concurrent.CopyOnWriteArrayList r6 = com.common.support.roomgiftplayer.CustomChannel.access$getMQueue(r6)
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ r5
                if (r6 == 0) goto L41
                com.common.support.roomgiftplayer.CustomChannel<T> r6 = r10.this$0
                java.util.concurrent.CopyOnWriteArrayList r7 = com.common.support.roomgiftplayer.CustomChannel.access$getMQueue(r6)
                r8 = 0
                java.lang.Object r7 = r7.remove(r8)
                r10.L$0 = r1
                r10.L$1 = r4
                r10.label = r2
                java.lang.Object r6 = com.common.support.roomgiftplayer.CustomChannel.access$executeItem(r6, r1, r7, r10)
                if (r6 != r0) goto L41
                return r0
            Lc1:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.common.support.roomgiftplayer.CustomChannel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.CustomChannel$arouseQueuePolling$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.CustomChannel$arouseQueuePolling$1", f = "CustomChannel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CustomChannel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08651(CustomChannel<T> customChannel, Continuation<? super C08651> continuation) {
            super(2, continuation);
            this.this$0 = customChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C08651(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CancellableContinuation cancellableContinuation;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CancellableContinuation cancellableContinuation2 = (CancellableContinuation) ((CustomChannel) this.this$0).innerPollingContinuationState.getValue();
            boolean z = false;
            if (cancellableContinuation2 != null && cancellableContinuation2.isActive()) {
                z = true;
            }
            if (z && (cancellableContinuation = (CancellableContinuation) ((CustomChannel) this.this$0).innerPollingContinuationState.getValue()) != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4215constructorimpl(Boxing.boxBoolean(true)));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.CustomChannel$clear$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.CustomChannel$clear$1", f = "CustomChannel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CustomChannel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08661(CustomChannel<T> customChannel, Continuation<? super C08661> continuation) {
            super(2, continuation);
            this.this$0 = customChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C08661(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.getMQueue().clear();
            this.this$0.arouseQueuePolling();
            this.this$0.resume();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.CustomChannel$executeItem$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.common.support.roomgiftplayer.CustomChannel", f = "CustomChannel.kt", i = {0, 1}, l = {86, 104}, m = "executeItem", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class C08671 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CustomChannel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08671(CustomChannel<T> customChannel, Continuation<? super C08671> continuation) {
            super(continuation);
            this.this$0 = customChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.executeItem(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.CustomChannel$resume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.CustomChannel$resume$1", f = "CustomChannel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CustomChannel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08681(CustomChannel<T> customChannel, Continuation<? super C08681> continuation) {
            super(2, continuation);
            this.this$0 = customChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C08681(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CancellableContinuation cancellableContinuation;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CancellableContinuation cancellableContinuation2 = (CancellableContinuation) ((CustomChannel) this.this$0).outContinuationState.getValue();
            boolean z = false;
            if (cancellableContinuation2 != null && cancellableContinuation2.isActive()) {
                z = true;
            }
            if (z && (cancellableContinuation = (CancellableContinuation) ((CustomChannel) this.this$0).outContinuationState.getValue()) != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4215constructorimpl(Boxing.boxBoolean(true)));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CustomChannel(@NotNull CoroutineScope coroutineScope, boolean z) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.nextByResume = z;
        this.innerPollingContinuationState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.outContinuationState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.mQueue = LazyKt.lazy(new Function0<CopyOnWriteArrayList<T>>() { // from class: com.common.support.roomgiftplayer.CustomChannel$mQueue$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CopyOnWriteArrayList<T> invoke() {
                return new CopyOnWriteArrayList<>();
            }
        });
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void arouseQueuePolling() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C08651(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object executeItem(CoroutineScope coroutineScope, T t, Continuation<? super Unit> continuation) throws Throwable {
        C08671 c08671;
        CustomChannel<T> customChannel;
        if (continuation instanceof C08671) {
            c08671 = (C08671) continuation;
            int i = c08671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08671.label = i - Integer.MIN_VALUE;
            } else {
                c08671 = new C08671(this, continuation);
            }
        } else {
            c08671 = new C08671(this, continuation);
        }
        Object obj = c08671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c08671.label;
        if (i2 != 0) {
            if (i2 == 1) {
                customChannel = (CustomChannel) c08671.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Function3<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3 = this.onReceive;
        if (function3 != null) {
            c08671.L$0 = this;
            c08671.label = 1;
            if (function3.invoke(coroutineScope, t, c08671) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        customChannel = this;
        if (!customChannel.nextByResume) {
            return Unit.INSTANCE;
        }
        c08671.L$0 = customChannel;
        c08671.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c08671), 1);
        cancellableContinuationImpl.initCancellability();
        customChannel.outContinuationState.setValue(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c08671);
        }
        if (result == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CopyOnWriteArrayList<T> getMQueue() {
        return (CopyOnWriteArrayList) this.mQueue.getValue();
    }

    public final void clear() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getMain(), null, new C08661(this, null), 2, null);
    }

    @Nullable
    public final Function2<CoroutineScope, Continuation<? super Unit>, Object> getOnDataEmpty() {
        return this.onDataEmpty;
    }

    @Nullable
    public final Function3<CoroutineScope, T, Continuation<? super Unit>, Object> getOnReceive() {
        return this.onReceive;
    }

    public final void resume() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C08681(this, null), 3, null);
    }

    public final void send(T item) {
        getMQueue().add(item);
        arouseQueuePolling();
    }

    public final void sendFirst(T item) {
        getMQueue().add(0, item);
        arouseQueuePolling();
    }

    public final void setOnDataEmpty(@Nullable Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.onDataEmpty = function2;
    }

    public final void setOnReceive(@Nullable Function3<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        this.onReceive = function3;
    }

    public /* synthetic */ CustomChannel(CoroutineScope coroutineScope, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i & 2) != 0 ? false : z);
    }
}
