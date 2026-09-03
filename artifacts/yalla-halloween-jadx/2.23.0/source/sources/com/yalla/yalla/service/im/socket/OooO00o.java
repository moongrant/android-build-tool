package com.yalla.yalla.service.im.socket;

import androidx.compose.material.TextFieldImplKt;
import io.agora.rtc.Constants;
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
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1", f = "IMSocketManagerOld.kt", i = {}, l = {Constants.ERR_WATERMARK_READ, 137, 140, 144, TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24965OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f24966OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ IMSocketManagerOld f24967OooO0o0;

    /* JADX INFO: renamed from: com.yalla.yalla.service.im.socket.OooO00o$OooO00o, reason: collision with other inner class name */
    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1$1", f = "IMSocketManagerOld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0315OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ IMSocketManagerOld f24968OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0315OooO00o(IMSocketManagerOld iMSocketManagerOld, Continuation<? super C0315OooO00o> continuation) {
            super(2, continuation);
            this.f24968OooO0Oo = iMSocketManagerOld;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0315OooO00o(this.f24968OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0315OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IMSocketManagerOld iMSocketManagerOld = this.f24968OooO0Oo;
            IMSocketManagerOld.State value = iMSocketManagerOld.f24953OooO0o.getValue();
            IMSocketManagerOld.State state = IMSocketManagerOld.State.Connectting;
            if (value != state) {
                iMSocketManagerOld.f24953OooO0o.setValue(state);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1$2", f = "IMSocketManagerOld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ IMSocketManagerOld f24969OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(IMSocketManagerOld iMSocketManagerOld, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f24969OooO0Oo = iMSocketManagerOld;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f24969OooO0Oo, continuation);
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
            IMSocketManagerOld iMSocketManagerOld = this.f24969OooO0Oo;
            IMSocketManagerOld.State value = iMSocketManagerOld.f24953OooO0o.getValue();
            IMSocketManagerOld.State state = IMSocketManagerOld.State.ConnectLost;
            if (value != state) {
                iMSocketManagerOld.f24953OooO0o.setValue(state);
            }
            OooOOO0.OooO0O0("SocketManager connectWhenAvailable when Connected time " + iMSocketManagerOld.f24948OooO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$connectWhenAvailable$1$3", f = "IMSocketManagerOld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ IMSocketManagerOld f24970OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(IMSocketManagerOld iMSocketManagerOld, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f24970OooO0Oo = iMSocketManagerOld;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f24970OooO0Oo, continuation);
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
            IMSocketManagerOld iMSocketManagerOld = this.f24970OooO0Oo;
            IMSocketManagerOld.State value = iMSocketManagerOld.f24953OooO0o.getValue();
            IMSocketManagerOld.State state = IMSocketManagerOld.State.Connectting;
            if (value != state) {
                iMSocketManagerOld.f24953OooO0o.setValue(state);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(IMSocketManagerOld iMSocketManagerOld, boolean z, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f24967OooO0o0 = iMSocketManagerOld;
        this.f24966OooO0o = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO00o(this.f24967OooO0o0, this.f24966OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ca -> B:36:0x00cd). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalla.yalla.service.im.socket.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
