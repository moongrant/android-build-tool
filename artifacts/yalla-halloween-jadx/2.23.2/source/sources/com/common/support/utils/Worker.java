package com.common.support.utils;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/common/support/utils/Worker;", "T", "Ljava/lang/Runnable;", "Ljava/io/Closeable;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "runJob", "Lkotlinx/coroutines/Job;", "taskChannel", "Lkotlinx/coroutines/channels/Channel;", "close", "", "doTask", "work", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueTask", "(Ljava/lang/Object;)V", "onDoTaskError", "e", "", "run", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Worker<T> implements Runnable, Closeable {

    @Nullable
    private Job runJob;

    @NotNull
    private final CoroutineScope scope;

    @Nullable
    private Channel<T> taskChannel;

    /* JADX INFO: renamed from: com.common.support.utils.Worker$enqueueTask$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.common.support.utils.Worker$enqueueTask$1", f = "Worker.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $work;
        int label;
        final /* synthetic */ Worker<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Worker<T> worker, T t, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = worker;
            this.$work = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$work, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = ((Worker) this.this$0).taskChannel;
                if (channel != null) {
                    T t = this.$work;
                    if (!channel.isClosedForSend()) {
                        this.label = 1;
                        if (channel.send(t, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.utils.Worker$run$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.common.support.utils.Worker$run$1", f = "Worker.kt", i = {}, l = {25, 27}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<T> $channel;
        Object L$0;
        int label;
        final /* synthetic */ Worker<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08811(Channel<T> channel, Worker<T> worker, Continuation<? super C08811> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.this$0 = worker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C08811(this.$channel, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x003f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0040  */
        /* JADX WARN: Code duplicated, block: B:25:0x004c A[Catch: Exception -> 0x0066, TRY_LEAVE, TryCatch #2 {Exception -> 0x0066, blocks: (B:19:0x0035, B:23:0x0044, B:25:0x004c, B:30:0x005e, B:14:0x0026, B:17:0x002e), top: B:40:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x005c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x0063  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L17
                r8 = r1
                goto L34
            L17:
                r8 = move-exception
                r4 = r7
                goto L5e
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L66
                r4 = r7
                goto L44
            L2b:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlinx.coroutines.channels.Channel<T> r8 = r7.$channel     // Catch: java.lang.Exception -> L66
                kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L66
            L34:
                r1 = r7
            L35:
                r1.L$0 = r8     // Catch: java.lang.Exception -> L66
                r1.label = r3     // Catch: java.lang.Exception -> L66
                java.lang.Object r4 = r8.hasNext(r1)     // Catch: java.lang.Exception -> L66
                if (r4 != r0) goto L40
                return r0
            L40:
                r6 = r1
                r1 = r8
                r8 = r4
                r4 = r6
            L44:
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L66
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> L66
                if (r8 == 0) goto L6a
                java.lang.Object r8 = r1.next()     // Catch: java.lang.Exception -> L66
                com.common.support.utils.Worker<T> r5 = r4.this$0     // Catch: java.lang.Exception -> L5d
                r4.L$0 = r1     // Catch: java.lang.Exception -> L5d
                r4.label = r2     // Catch: java.lang.Exception -> L5d
                java.lang.Object r8 = r5.doTask(r8, r4)     // Catch: java.lang.Exception -> L5d
                if (r8 != r0) goto L63
                return r0
            L5d:
                r8 = move-exception
            L5e:
                com.common.support.utils.Worker<T> r5 = r4.this$0     // Catch: java.lang.Exception -> L66
                r5.onDoTaskError(r8)     // Catch: java.lang.Exception -> L66
            L63:
                r8 = r1
                r1 = r4
                goto L35
            L66:
                r8 = move-exception
                r8.printStackTrace()
            L6a:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.common.support.utils.Worker.C08811.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Worker(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Channel<T> channel = this.taskChannel;
        if (channel != null) {
            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        }
        Job job = this.runJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.taskChannel = null;
        this.runJob = null;
    }

    @Nullable
    public abstract Object doTask(T t, @NotNull Continuation<? super Unit> continuation);

    public final void enqueueTask(T work) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(this, work, null), 3, null);
    }

    public void onDoTaskError(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // java.lang.Runnable
    public void run() {
        Job job = this.runJob;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        Channel<T> channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.taskChannel = channelChannel$default;
        this.runJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C08811(channelChannel$default, this, null), 3, null);
    }
}
