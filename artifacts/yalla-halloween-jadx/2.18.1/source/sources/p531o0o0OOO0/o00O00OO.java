package p531o0o0OOO0;

import com.yalla.yalla.service.im.socket.IMSocketManagerOld;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1", f = "IMSocketManagerOld.kt", i = {}, l = {128, 136, 139, 143, 149}, m = "invokeSuspend", n = {}, s = {})
public final class o00O00OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43403Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ IMSocketManagerOld f43404Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f43405Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1$1", f = "IMSocketManagerOld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ IMSocketManagerOld f43406Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(IMSocketManagerOld iMSocketManagerOld, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43406Oooo0o = iMSocketManagerOld;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f43406Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IMSocketManagerOld.State value = this.f43406Oooo0o.f21673OooO0o.getValue();
            IMSocketManagerOld.State state = IMSocketManagerOld.State.Connectting;
            if (value != state) {
                this.f43406Oooo0o.f21673OooO0o.setValue(state);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1$2", f = "IMSocketManagerOld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ IMSocketManagerOld f43407Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(IMSocketManagerOld iMSocketManagerOld, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f43407Oooo0o = iMSocketManagerOld;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f43407Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IMSocketManagerOld.State value = this.f43407Oooo0o.f21673OooO0o.getValue();
            IMSocketManagerOld.State state = IMSocketManagerOld.State.ConnectLost;
            if (value != state) {
                this.f43407Oooo0o.f21673OooO0o.setValue(state);
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SocketManager connectWhenAvailable when Connected time ");
            sbOooO0o0.append(this.f43407Oooo0o.f21668OooO);
            o00O00.OooO0O0(sbOooO0o0.toString());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1$3", f = "IMSocketManagerOld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ IMSocketManagerOld f43408Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(IMSocketManagerOld iMSocketManagerOld, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f43408Oooo0o = iMSocketManagerOld;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f43408Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IMSocketManagerOld.State value = this.f43408Oooo0o.f21673OooO0o.getValue();
            IMSocketManagerOld.State state = IMSocketManagerOld.State.Connectting;
            if (value != state) {
                this.f43408Oooo0o.f21673OooO0o.setValue(state);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(IMSocketManagerOld iMSocketManagerOld, boolean z, Continuation<? super o00O00OO> continuation) {
        super(2, continuation);
        this.f43404Oooo0oO = iMSocketManagerOld;
        this.f43405Oooo0oo = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00OO(this.f43404Oooo0oO, this.f43405Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O00OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c7 -> B:36:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p531o0o0OOO0.o00O00OO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
