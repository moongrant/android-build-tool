package o0O00O0;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0o<T> implements Runnable, Closeable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35119Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Channel<T> f35120Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Job f35121Oooo0oo;

    @DebugMetadata(c = "com.common.support.utils.Worker$run$1", f = "Worker.kt", i = {}, l = {25, 27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO0o<T> f35122Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ChannelIterator f35123Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f35124Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Channel<T> f35125Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Channel<T> channel, OooO0o<T> oooO0o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f35125Oooo0oo = channel;
            this.f35122Oooo = oooO0o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f35125Oooo0oo, this.f35122Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x003e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x003f  */
        /* JADX WARN: Code duplicated, block: B:25:0x004c A[Catch: Exception -> 0x0099, TRY_LEAVE, TryCatch #1 {Exception -> 0x0099, blocks: (B:19:0x0034, B:23:0x0044, B:25:0x004c, B:33:0x007a, B:14:0x0023, B:17:0x002d), top: B:41:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0073  */
        /* JADX WARN: Code duplicated, block: B:29:0x0074 A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #0 {Exception -> 0x0079, blocks: (B:26:0x0050, B:29:0x0074), top: B:39:0x0050 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0095  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
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
                int r1 = r9.f35124Oooo0oO
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L2a
                if (r1 == r2) goto L21
                if (r1 != r3) goto L19
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.f35123Oooo0o
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L14
                goto L33
            L14:
                r10 = move-exception
                r4 = r1
                r1 = r0
                r0 = r9
                goto L7a
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.f35123Oooo0o
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L99
                r4 = r1
                r1 = r0
                r0 = r9
                goto L44
            L2a:
                kotlin.ResultKt.throwOnFailure(r10)
                kotlinx.coroutines.channels.Channel<T> r10 = r9.f35125Oooo0oo     // Catch: java.lang.Exception -> L99
                kotlinx.coroutines.channels.ChannelIterator r1 = r10.iterator()     // Catch: java.lang.Exception -> L99
            L33:
                r10 = r9
            L34:
                r10.f35123Oooo0o = r1     // Catch: java.lang.Exception -> L99
                r10.f35124Oooo0oO = r2     // Catch: java.lang.Exception -> L99
                java.lang.Object r4 = r1.hasNext(r10)     // Catch: java.lang.Exception -> L99
                if (r4 != r0) goto L3f
                return r0
            L3f:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r1
                r1 = r8
            L44:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L99
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Exception -> L99
                if (r10 == 0) goto L9d
                java.lang.Object r10 = r4.next()     // Catch: java.lang.Exception -> L99
                o0O00O0.OooO0o<T> r5 = r0.f35122Oooo     // Catch: java.lang.Exception -> L79
                r0.f35123Oooo0o = r4     // Catch: java.lang.Exception -> L79
                r0.f35124Oooo0oO = r3     // Catch: java.lang.Exception -> L79
                o0O000o0.OooO0o r5 = (o0O000o0.OooO0o) r5     // Catch: java.lang.Exception -> L79
                java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Exception -> L79
                byte[] r10 = (byte[]) r10     // Catch: java.lang.Exception -> L79
                o0O000O.OooOO0<?, OUT> r6 = r5.f35088Oooo     // Catch: java.lang.Exception -> L79
                java.lang.Object r10 = r6.OooO0Oo(r10)     // Catch: java.lang.Exception -> L79
                o0O000o0.OooO0OO r6 = new o0O000o0.OooO0OO     // Catch: java.lang.Exception -> L79
                r7 = 0
                r6.<init>(r5, r10, r7)     // Catch: java.lang.Exception -> L79
                kotlinx.coroutines.Job r10 = o0O000O.OooO0o.OooO0O0(r6)     // Catch: java.lang.Exception -> L79
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Exception -> L79
                if (r10 != r5) goto L74
                goto L76
            L74:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L79
            L76:
                if (r10 != r1) goto L95
                return r1
            L79:
                r10 = move-exception
            L7a:
                o0O00O0.OooO0o<T> r5 = r0.f35122Oooo     // Catch: java.lang.Exception -> L99
                o0O000o0.OooO0o r5 = (o0O000o0.OooO0o) r5     // Catch: java.lang.Exception -> L99
                java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Exception -> L99
                java.lang.String r6 = "e"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r6)     // Catch: java.lang.Exception -> L99
                java.lang.String r5 = r5.f35089OoooO0     // Catch: java.lang.Exception -> L99
                java.lang.String r10 = kotlin.ExceptionsKt.stackTraceToString(r10)     // Catch: java.lang.Exception -> L99
                java.lang.String r6 = "Parsing data error! \n"
                java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r10)     // Catch: java.lang.Exception -> L99
                o0O000Oo.OooO00o.OooO0O0(r5, r10)     // Catch: java.lang.Exception -> L99
            L95:
                r10 = r0
                r0 = r1
                r1 = r4
                goto L34
            L99:
                r10 = move-exception
                r10.printStackTrace()
            L9d:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o0O00O0.OooO0o.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public OooO0o(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f35119Oooo0o = scope;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Channel<T> channel = this.f35120Oooo0oO;
        if (channel != null) {
            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        }
        Job job = this.f35121Oooo0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f35120Oooo0oO = null;
        this.f35121Oooo0oo = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Job job = this.f35121Oooo0oo;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        Channel<T> channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.f35120Oooo0oO = channelChannel$default;
        this.f35121Oooo0oo = BuildersKt__Builders_commonKt.launch$default(this.f35119Oooo0o, null, null, new OooO00o(channelChannel$default, this, null), 3, null);
    }
}
