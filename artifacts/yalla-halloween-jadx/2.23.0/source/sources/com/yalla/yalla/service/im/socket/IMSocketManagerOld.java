package com.yalla.yalla.service.im.socket;

import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o000000;
import com.common.support.networkstate.NetworkStateUtil;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.service.im.IMMessageService;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
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
import p368o0OOo0oO.o00Ooo;
import p368o0OOo0oO.o0OoOo0;
import p368o0OOo0oO.oo000o;
import p369o0OOo0oo.o00oO0o;
import p371o0OOoO0.OooO0o;
import p373o0OOoO0O.OooOOO0;
import p377o0OOoOo.o0000O;
import p464o0Oooo.o000000O;
import p542o0o0o00O.o0OO00O;
import p542o0o0o00O.o0Oo0oo;
import p542o0o0o00O.o0ooOOo;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class IMSocketManagerOld implements o00oO0o.OooO00o, o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f24948OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f24949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f24950OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public State f24951OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oo000o f24952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<State> f24953OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f24954OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f24955OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Job f24956OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f24957OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f24958OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f24959OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Job f24960OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f24961OooOOO0;

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$handleHeartbeat$1", f = "IMSocketManagerOld.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24962OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IMSocketManagerOld.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24962OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = IMSocketManagerOld.this.f24961OooOOO0;
                this.f24962OooO0Oo = 1;
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
            iMSocketManagerOld.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (!Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.FALSE) && iMSocketManagerOld.f24955OooO0oO) {
                p592o0oo00O.OooOOO0.OooO0O0("SocketManager heartBeatLost");
                iMSocketManagerOld.f24951OooO0OO = State.ConnectLost;
                iMSocketManagerOld.OooO0oO();
                oo000o oo000oVar = iMSocketManagerOld.f24952OooO0Oo;
                if (!oo000oVar.f44002OooO0OO.get()) {
                    oo000oVar.OooO0OO(true);
                }
                IMSocketManagerOld.OooO0oo(iMSocketManagerOld, false, false, 3);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24964OooO0Oo;

        public OooO0O0(com.yalla.yalla.service.im.socket.OooO0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24964OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24964OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24964OooO0Oo;
        }

        public final int hashCode() {
            return this.f24964OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24964OooO0Oo.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/service/im/socket/IMSocketManagerOld$State;", "", "Connectting", "ConnectSuccess", "ConnectLost", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum State {
        Connectting,
        ConnectSuccess,
        ConnectLost
    }

    public IMSocketManagerOld(@NotNull IMMessageService context, @NotNull o0Oo0oo messageHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.f24949OooO00o = context;
        this.f24950OooO0O0 = messageHandler;
        this.f24951OooO0OO = State.ConnectLost;
        this.f24953OooO0o = new MutableLiveData<>();
        this.f24948OooO = 5000L;
        this.f24957OooOO0 = 20000L;
        this.f24958OooOO0O = 2000L;
        this.f24959OooOO0o = 60000L;
        this.f24961OooOOO0 = (((long) 2) * 20000) + ((long) 5000);
        o0OoOo0 o0oooo0 = new o0OoOo0();
        Intrinsics.checkNotNullParameter("SocketManager ", "<set-?>");
        o0oooo0.f43994OooO0Oo = "SocketManager ";
        o0oooo0.f43991OooO00o = 1;
        o0ooOOo o0ooooo = new o0ooOOo(this);
        Intrinsics.checkNotNullParameter(o0ooooo, "<set-?>");
        o0oooo0.f43995OooO0o = o0ooooo;
        Intrinsics.checkNotNullParameter(this, "eventListener");
        o00oO0o o00oo0o2 = o0oooo0.f43997OooO0oO;
        o00oo0o2.getClass();
        Intrinsics.checkNotNullParameter(this, "eventListener");
        o00oo0o2.f44014OooO0oo = this;
        this.f24952OooO0Oo = new oo000o(o0oooo0);
        List listSplit$default = StringsKt__StringsKt.split$default(o0000O.f44099OooOoOO.get(0), new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
        this.f24954OooO0o0 = new o00Ooo((String) listSplit$default.get(0), o000000.OooO0o0((String) listSplit$default.get(1)));
        NetworkStateUtil.INSTANCE.networkStateLiveData(context).observe(context, new OooO0O0(new com.yalla.yalla.service.im.socket.OooO0O0(this)));
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager SocketManager : init \nsplit = " + listSplit$default);
    }

    public static void OooO0oo(IMSocketManagerOld iMSocketManagerOld, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        synchronized (iMSocketManagerOld) {
            p592o0oo00O.OooOOO0.OooO0O0("SocketManager connectWhenAvailable check needAutoConnect = " + iMSocketManagerOld.f24955OooO0oO + " state = " + iMSocketManagerOld.f24951OooO0OO);
            if (!z2) {
                if (iMSocketManagerOld.f24955OooO0oO) {
                    if (iMSocketManagerOld.f24951OooO0OO != State.ConnectLost) {
                    }
                }
                return;
            } else if (iMSocketManagerOld.f24951OooO0OO != State.ConnectSuccess) {
                Job job = iMSocketManagerOld.f24960OooOOO;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                iMSocketManagerOld.f24960OooOOO = null;
            }
            Job job2 = iMSocketManagerOld.f24960OooOOO;
            if (job2 != null) {
                return;
            }
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            iMSocketManagerOld.f24960OooOOO = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(iMSocketManagerOld.f24949OooO00o), Dispatchers.getIO(), null, new com.yalla.yalla.service.im.socket.OooO00o(iMSocketManagerOld, z, null), 2, null);
        }
    }

    public final void OooO() {
        Job job = this.f24956OooO0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24956OooO0oo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f24949OooO00o), null, null, new OooO00o(null), 3, null);
    }

    @Override // p542o0o0o00O.o0OO00O
    public final void OooO00o() {
        State state;
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager connectIfLost");
        if (!this.f24955OooO0oO || (state = this.f24951OooO0OO) == State.Connectting || state == State.ConnectSuccess) {
            return;
        }
        OooO0oo(this, false, false, 3);
    }

    @Override // o0OOo0oo.o00oO0o.OooO00o
    public final void OooO0O0() {
        OooO0o oooO0o;
        State state = State.ConnectSuccess;
        this.f24951OooO0OO = state;
        Job job = this.f24960OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24960OooOOO = null;
        this.f24958OooOO0O = 2000L;
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager override onConnectSuccess");
        this.f24953OooO0o.postValue(state);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Object value = o000000O.OooOOOo().getValue();
        String strOooO00o = p382o0OOoo0o.oo000o.OooO00o();
        String strOooO0Oo = p382o0OOoo0o.o00Ooo.OooO0Oo();
        String strOooO0Oo2 = p382o0OOoo0o.oo000o.OooO0Oo();
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append("\n");
        sb.append(strOooO00o);
        sb.append(";Yalla ");
        sb.append(strOooO0Oo);
        byte[] msg = OooO0OO.OooO0OO(sb, ";Android ", strOooO0Oo2, "\n").getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(msg, "this as java.lang.String).getBytes(charset)");
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager loginIM");
        oo000o oo000oVar = this.f24952OooO0Oo;
        oo000oVar.getClass();
        Intrinsics.checkNotNullParameter(msg, "msg");
        wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO00o("send message, state = " + oo000oVar.f44001OooO0O0, new Object[0]);
        if (oo000oVar.f44001OooO0O0 == 2 && (oooO0o = oo000oVar.f44007OooO0oo) != null) {
            oooO0o.OooO0o(msg);
        }
        OooO();
    }

    @Override // p542o0o0o00O.o0OO00O
    public final void OooO0OO() {
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager connect");
        this.f24955OooO0oO = true;
        OooO0oo(this, false, false, 3);
    }

    @Override // o0OOo0oo.o00oO0o.OooO00o
    public final void OooO0Oo(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f24951OooO0OO = State.ConnectLost;
        Job job = this.f24960OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24960OooOOO = null;
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager override onConnectFailed msg: = ".concat(msg));
        OooO0oO();
        OooO0oo(this, true, false, 2);
    }

    @Override // o0OOo0oo.o00oO0o.OooO00o
    public final void OooO0o(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        State state = State.ConnectLost;
        this.f24951OooO0OO = state;
        Job job = this.f24960OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24960OooOOO = null;
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager override onSocketDead msg: = ".concat(msg));
        this.f24953OooO0o.postValue(state);
        OooO0oO();
        OooO0oo(this, true, false, 2);
    }

    @Override // o0OOo0oo.o00oO0o.OooO00o
    public final void OooO0o0() {
    }

    public final void OooO0oO() {
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager cancelHeartbeatCheck");
        Job job = this.f24956OooO0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24956OooO0oo = null;
    }

    @Override // p542o0o0o00O.o0OO00O
    public final void disconnect() {
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager disconnect");
        this.f24955OooO0oO = false;
        OooO0oO();
        oo000o oo000oVar = this.f24952OooO0Oo;
        wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO00o("isClosed = " + oo000oVar.f44002OooO0OO, new Object[0]);
        if (oo000oVar.f44002OooO0OO.compareAndSet(false, true)) {
            oo000oVar.OooO0OO(false);
        }
        this.f24953OooO0o.postValue(State.ConnectLost);
    }
}
