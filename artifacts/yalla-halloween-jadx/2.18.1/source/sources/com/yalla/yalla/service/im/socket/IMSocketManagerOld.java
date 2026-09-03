package com.yalla.yalla.service.im.socket;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.MutableLiveData;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.support.common.util.NetworkUtil;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o000Oo0;
import p469o0Oooo.o00oO0o;
import p469o0Oooo.o0OO00O;
import p469o0Oooo.o0Oo0oo;
import p472o0OoooO.o0O0ooO;
import p475o0OoooOo.oO000O0;
import p477o0Ooooo0.o00OO00O;
import p487o0o000oO.o0OOO0o;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p531o0o0OOO0.o00O0;
import p531o0o0OOO0.o00O00OO;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class IMSocketManagerOld implements o0O0ooO.OooO00o, o00O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f21668OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f21669OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO00O f21670OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public State f21671OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OO00O f21672OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<State> f21673OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f21674OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f21675OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Job f21676OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f21677OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f21678OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f21679OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Job f21680OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f21681OooOOO0;

    public static final class OooO00o implements o00OO00O {
        public OooO00o() {
        }

        @Override // p477o0Ooooo0.o00OO00O
        public final void OooO0O0(@NotNull byte[] rawMsg) {
            Intrinsics.checkNotNullParameter(rawMsg, "msg");
            Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
            if ((rawMsg[0] & UByte.MAX_VALUE) != 100) {
                IMSocketManagerOld.this.f21670OooO0O0.OooO0O0(rawMsg);
            } else {
                o00O00.OooO0O0("SocketManager handle : 100");
                IMSocketManagerOld.this.OooO();
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$handleHeartbeat$1", f = "IMSocketManagerOld.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21683Oooo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IMSocketManagerOld.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21683Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = IMSocketManagerOld.this.f21681OooOOO0;
                this.f21683Oooo0o = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            IMSocketManagerOld iMSocketManagerOld = IMSocketManagerOld.this;
            Objects.requireNonNull(iMSocketManagerOld);
            if (!Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.FALSE) && iMSocketManagerOld.f21675OooO0oO) {
                o00O00.OooO0O0("SocketManager heartBeatLost");
                iMSocketManagerOld.f21671OooO0OO = State.ConnectLost;
                iMSocketManagerOld.OooO0oO();
                o0OO00O o0oo00o2 = iMSocketManagerOld.f21672OooO0Oo;
                if (!o0oo00o2.f40592OooO0OO.get()) {
                    o0oo00o2.OooO0OO(true);
                }
                IMSocketManagerOld.OooO0oo(iMSocketManagerOld, false, false, 3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/service/im/socket/IMSocketManagerOld$State;", "", "Connectting", "ConnectSuccess", "ConnectLost", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum State {
        Connectting,
        ConnectSuccess,
        ConnectLost
    }

    public IMSocketManagerOld(@NotNull LifecycleService context, @NotNull o00OO00O messageHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.f21669OooO00o = context;
        this.f21670OooO0O0 = messageHandler;
        this.f21671OooO0OO = State.ConnectLost;
        this.f21673OooO0o = new MutableLiveData<>();
        this.f21668OooO = 5000L;
        this.f21677OooOO0 = 20000L;
        this.f21678OooOO0O = 2000L;
        this.f21679OooOO0o = 60000L;
        this.f21681OooOOO0 = (((long) 2) * 20000) + ((long) 5000);
        o00oO0o o00oo0o2 = new o00oO0o();
        Intrinsics.checkNotNullParameter("SocketManager ", "<set-?>");
        o00oo0o2.f40584OooO0Oo = "SocketManager ";
        o00oo0o2.f40585OooO0o = 0L;
        o00oo0o2.f40581OooO00o = 1;
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(oooO00o, "<set-?>");
        o00oo0o2.f40587OooO0oO = oooO00o;
        Intrinsics.checkNotNullParameter(this, "eventListener");
        o0O0ooO o0o0ooo = o00oo0o2.f40588OooO0oo;
        Objects.requireNonNull(o0o0ooo);
        Intrinsics.checkNotNullParameter(this, "eventListener");
        o0o0ooo.f40638OoooO00 = this;
        this.f21672OooO0Oo = new o0OO00O(o00oo0o2);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        List listSplit$default = StringsKt__StringsKt.split$default(o0ooOOo.f32243OooOoOO.get(0), new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
        this.f21674OooO0o0 = new o0Oo0oo((String) listSplit$default.get(0), o000Oo0.OooO0OO((String) listSplit$default.get(1), 0));
        NetworkUtil.f20498OooO00o.OooO0o0();
        NetworkUtil.f20500OooO0OO.observe(context, new o00O(this, 2));
        o00O00.OooO0O0("SocketManager SocketManager : init \nsplit = " + listSplit$default);
    }

    public static void OooO0oo(IMSocketManagerOld iMSocketManagerOld, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        synchronized (iMSocketManagerOld) {
            o00O00.OooO0O0("SocketManager connectWhenAvailable check needAutoConnect = " + iMSocketManagerOld.f21675OooO0oO + " state = " + iMSocketManagerOld.f21671OooO0OO);
            if (!z2) {
                if (iMSocketManagerOld.f21675OooO0oO) {
                    if (iMSocketManagerOld.f21671OooO0OO != State.ConnectLost) {
                    }
                }
                return;
            } else if (iMSocketManagerOld.f21671OooO0OO != State.ConnectSuccess) {
                Job job = iMSocketManagerOld.f21680OooOOO;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                iMSocketManagerOld.f21680OooOOO = null;
            }
            Job job2 = iMSocketManagerOld.f21680OooOOO;
            if (job2 != null) {
                return;
            }
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            iMSocketManagerOld.f21680OooOOO = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(iMSocketManagerOld.f21669OooO00o), Dispatchers.getIO(), null, new o00O00OO(iMSocketManagerOld, z, null), 2, null);
        }
    }

    public final void OooO() {
        Job job = this.f21676OooO0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f21676OooO0oo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f21669OooO00o), null, null, new OooO0O0(null), 3, null);
    }

    @Override // p531o0o0OOO0.o00O0
    public final void OooO00o() {
        State state;
        o00O00.OooO0O0("SocketManager connectIfLost");
        if (!this.f21675OooO0oO || (state = this.f21671OooO0OO) == State.Connectting || state == State.ConnectSuccess) {
            return;
        }
        OooO0oo(this, false, false, 3);
    }

    @Override // o0OoooO.o0O0ooO.OooO00o
    public final void OooO0O0() {
        oO000O0 oo000o0;
        State state = State.ConnectSuccess;
        this.f21671OooO0OO = state;
        Job job = this.f21680OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f21680OooOOO = null;
        this.f21678OooOO0O = 2000L;
        o00O00.OooO0O0("SocketManager override onConnectSuccess");
        this.f21673OooO0o.postValue(state);
        StringBuilder sb = new StringBuilder();
        sb.append(OooOOO.f41216OooO00o.OooOo0O().getValue());
        sb.append('\n');
        p487o0o000oO.o0Oo0oo o0oo0oo2 = p487o0o000oO.o0Oo0oo.f40947OooO00o;
        sb.append(p487o0o000oO.o0Oo0oo.OooO00o());
        sb.append(";Yalla ");
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        sb.append(o0OOO0o.OooO0O0());
        sb.append(";Android ");
        sb.append(p487o0o000oO.o0Oo0oo.OooO0Oo());
        sb.append('\n');
        byte[] msg = sb.toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(msg, "this as java.lang.String).getBytes(charset)");
        o00O00.OooO0O0("SocketManager loginIM");
        o0OO00O o0oo00o2 = this.f21672OooO0Oo;
        Objects.requireNonNull(o0oo00o2);
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("send message, state = ");
        sbOooO0o0.append(o0oo00o2.f40591OooO0O0);
        oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
        if (o0oo00o2.f40591OooO0O0 == 2 && (oo000o0 = o0oo00o2.f40597OooO0oo) != null) {
            oo000o0.OooO0o(msg);
        }
        OooO();
    }

    @Override // o0OoooO.o0O0ooO.OooO00o
    public final void OooO0OO() {
    }

    @Override // o0OoooO.o0O0ooO.OooO00o
    public final void OooO0Oo(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        State state = State.ConnectLost;
        this.f21671OooO0OO = state;
        Job job = this.f21680OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f21680OooOOO = null;
        o00O00.OooO0O0("SocketManager override onSocketDead msg: = " + msg);
        this.f21673OooO0o.postValue(state);
        OooO0oO();
        OooO0oo(this, true, false, 2);
    }

    @Override // o0OoooO.o0O0ooO.OooO00o
    public final void OooO0o(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f21671OooO0OO = State.ConnectLost;
        Job job = this.f21680OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f21680OooOOO = null;
        o00O00.OooO0O0("SocketManager override onConnectFailed msg: = " + msg);
        OooO0oO();
        OooO0oo(this, true, false, 2);
    }

    @Override // p531o0o0OOO0.o00O0
    public final void OooO0o0() {
        o00O00.OooO0O0("SocketManager connect");
        this.f21675OooO0oO = true;
        OooO0oo(this, false, false, 3);
    }

    public final void OooO0oO() {
        o00O00.OooO0O0("SocketManager cancelHeartbeatCheck");
        Job job = this.f21676OooO0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f21676OooO0oo = null;
    }

    @Override // p531o0o0OOO0.o00O0
    public final void disconnect() {
        o00O00.OooO0O0("SocketManager disconnect");
        this.f21675OooO0oO = false;
        OooO0oO();
        o0OO00O o0oo00o2 = this.f21672OooO0Oo;
        o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("isClosed = ");
        sbOooO0o0.append(o0oo00o2.f40592OooO0OO);
        oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
        if (o0oo00o2.f40592OooO0OO.compareAndSet(false, true)) {
            o0oo00o2.OooO0OO(false);
        }
        this.f21673OooO0o.postValue(State.ConnectLost);
    }
}
