package com.yalla.yalla.service.im.socket;

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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
import p373o0OOoO.OooO0o;
import p374o0OOoO0.OooOOOO;
import p375o0OOoO00.Oooo0;
import p375o0OOoO00.o00O0O;
import p375o0OOoO00.o00Oo0;
import p377o0OOoO0o.OooOOO0;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p480o0o000O.Oooo000;
import p480o0o000O.o000oOoO;
import p480o0o000O.o0OoOo0;
import p598o0oo00Oo.o0000O00;
import p672o0oooo0O.oO000O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class IMSocketManagerOld implements OooOOOO.OooO00o, o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f24486OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f24487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0o f24488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public State f24489OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f24490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<State> f24491OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O0O f24492OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f24493OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Job f24494OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f24495OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f24496OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f24497OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Job f24498OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f24499OooOOO0;

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketManagerOld$handleHeartbeat$1", f = "IMSocketManagerOld.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24500OooO0Oo;

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
            int i = this.f24500OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = IMSocketManagerOld.this.f24499OooOOO0;
                this.f24500OooO0Oo = 1;
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
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (!Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.FALSE) && iMSocketManagerOld.f24493OooO0oO) {
                o0000O00.OooO0O0("SocketManager heartBeatLost");
                iMSocketManagerOld.f24489OooO0OO = State.ConnectLost;
                iMSocketManagerOld.OooO0oO();
                o00Oo0 o00oo1 = iMSocketManagerOld.f24490OooO0Oo;
                if (!o00oo1.f43226OooO0OO.get()) {
                    o00oo1.OooO0OO(true);
                }
                IMSocketManagerOld.OooO0oo(iMSocketManagerOld, false, false, 3);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24502OooO0Oo;

        public OooO0O0(com.yalla.yalla.service.im.socket.OooO0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24502OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24502OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24502OooO0Oo;
        }

        public final int hashCode() {
            return this.f24502OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24502OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yalla.yalla.service.im.socket.IMSocketManagerOld$State[], still in use, count: 1, list:
      (r5v2 com.yalla.yalla.service.im.socket.IMSocketManagerOld$State[]) from 0x0029: INVOKE (r5v2 com.yalla.yalla.service.im.socket.IMSocketManagerOld$State[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/service/im/socket/IMSocketManagerOld$State;", "", "Connectting", "ConnectSuccess", "ConnectLost", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class State {
        Connectting,
        ConnectSuccess,
        ConnectLost;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr);
        }

        public State() {
            super(str, i);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public IMSocketManagerOld(@NotNull IMMessageService context, @NotNull o000oOoO messageHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.f24487OooO00o = context;
        this.f24488OooO0O0 = messageHandler;
        this.f24489OooO0OO = State.ConnectLost;
        this.f24491OooO0o = new MutableLiveData<>();
        this.f24486OooO = 5000L;
        this.f24495OooOO0 = 20000L;
        this.f24496OooOO0O = 2000L;
        this.f24497OooOO0o = 60000L;
        this.f24499OooOOO0 = (((long) 2) * 20000) + ((long) 5000);
        Oooo0 oooo0 = new Oooo0();
        Intrinsics.checkNotNullParameter("SocketManager ", "<set-?>");
        oooo0.f43211OooO0Oo = "SocketManager ";
        oooo0.f43208OooO00o = 1;
        Oooo000 oooo000 = new Oooo000(this);
        Intrinsics.checkNotNullParameter(oooo000, "<set-?>");
        oooo0.f43212OooO0o = oooo000;
        Intrinsics.checkNotNullParameter(this, "eventListener");
        OooOOOO oooOOOO = oooo0.f43214OooO0oO;
        oooOOOO.getClass();
        Intrinsics.checkNotNullParameter(this, "eventListener");
        oooOOOO.f43193OooO0oo = this;
        this.f24490OooO0Oo = new o00Oo0(oooo0);
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) p384o0OOoo0O.Oooo0.f43358OooOoOO.get(0), new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
        this.f24492OooO0o0 = new o00O0O((String) listSplit$default.get(0), o000000.OooO0o0((String) listSplit$default.get(1)));
        NetworkStateUtil.INSTANCE.networkStateLiveData(context).observe(context, new OooO0O0(new com.yalla.yalla.service.im.socket.OooO0O0(this)));
        o0000O00.OooO0O0("SocketManager SocketManager : init \nsplit = " + listSplit$default);
    }

    public static void OooO0oo(IMSocketManagerOld iMSocketManagerOld, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        synchronized (iMSocketManagerOld) {
            o0000O00.OooO0O0("SocketManager connectWhenAvailable check needAutoConnect = " + iMSocketManagerOld.f24493OooO0oO + " state = " + iMSocketManagerOld.f24489OooO0OO);
            if (!z2) {
                if (iMSocketManagerOld.f24493OooO0oO) {
                    if (iMSocketManagerOld.f24489OooO0OO != State.ConnectLost) {
                    }
                }
                return;
            } else if (iMSocketManagerOld.f24489OooO0OO != State.ConnectSuccess) {
                Job job = iMSocketManagerOld.f24498OooOOO;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                iMSocketManagerOld.f24498OooOOO = null;
            }
            Job job2 = iMSocketManagerOld.f24498OooOOO;
            if (job2 != null) {
                return;
            }
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            iMSocketManagerOld.f24498OooOOO = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(iMSocketManagerOld.f24487OooO00o), Dispatchers.getIO(), null, new com.yalla.yalla.service.im.socket.OooO00o(iMSocketManagerOld, z, null), 2, null);
        }
    }

    public final void OooO() {
        Job job = this.f24494OooO0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24494OooO0oo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f24487OooO00o), null, null, new OooO00o(null), 3, null);
    }

    @Override // p480o0o000O.o0OoOo0
    public final void OooO00o() {
        State state;
        o0000O00.OooO0O0("SocketManager connectIfLost");
        if (!this.f24493OooO0oO || (state = this.f24489OooO0OO) == State.Connectting || state == State.ConnectSuccess) {
            return;
        }
        OooO0oo(this, false, false, 3);
    }

    @Override // o0OOoO0.OooOOOO.OooO00o
    public final void OooO0O0() {
        OooOOO0 oooOOO0;
        State state = State.ConnectSuccess;
        this.f24489OooO0OO = state;
        Job job = this.f24498OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24498OooOOO = null;
        this.f24496OooOO0O = 2000L;
        o0000O00.OooO0O0("SocketManager override onConnectSuccess");
        this.f24491OooO0o.postValue(state);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Object value = o0O00oO0.OooOOOo().getValue();
        String strOooO00o = p386o0OOooO.o000000.OooO00o();
        String strOooO0Oo = oo0o0Oo.OooO0Oo();
        String strOooO0Oo2 = p386o0OOooO.o000000.OooO0Oo();
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append("\n");
        sb.append(strOooO00o);
        sb.append(";Yalla ");
        sb.append(strOooO0Oo);
        byte[] msg = androidx.compose.compiler.plugins.kotlin.OooO0O0.OooO00o(sb, ";Android ", strOooO0Oo2, "\n").getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(msg, "this as java.lang.String).getBytes(charset)");
        o0000O00.OooO0O0("SocketManager loginIM");
        o00Oo0 o00oo1 = this.f24490OooO0Oo;
        o00oo1.getClass();
        Intrinsics.checkNotNullParameter(msg, "msg");
        oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO00o("send message, state = " + o00oo1.f43225OooO0O0, new Object[0]);
        if (o00oo1.f43225OooO0O0 == 2 && (oooOOO0 = o00oo1.f43231OooO0oo) != null) {
            oooOOO0.OooO0o(msg);
        }
        OooO();
    }

    @Override // p480o0o000O.o0OoOo0
    public final void OooO0OO() {
        o0000O00.OooO0O0("SocketManager connect");
        this.f24493OooO0oO = true;
        OooO0oo(this, false, false, 3);
    }

    @Override // o0OOoO0.OooOOOO.OooO00o
    public final void OooO0Oo(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f24489OooO0OO = State.ConnectLost;
        Job job = this.f24498OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24498OooOOO = null;
        o0000O00.OooO0O0("SocketManager override onConnectFailed msg: = ".concat(msg));
        OooO0oO();
        OooO0oo(this, true, false, 2);
    }

    @Override // o0OOoO0.OooOOOO.OooO00o
    public final void OooO0o(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        State state = State.ConnectLost;
        this.f24489OooO0OO = state;
        Job job = this.f24498OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24498OooOOO = null;
        o0000O00.OooO0O0("SocketManager override onSocketDead msg: = ".concat(msg));
        this.f24491OooO0o.postValue(state);
        OooO0oO();
        OooO0oo(this, true, false, 2);
    }

    @Override // o0OOoO0.OooOOOO.OooO00o
    public final void OooO0o0() {
    }

    public final void OooO0oO() {
        o0000O00.OooO0O0("SocketManager cancelHeartbeatCheck");
        Job job = this.f24494OooO0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f24494OooO0oo = null;
    }

    @Override // p480o0o000O.o0OoOo0
    public final void disconnect() {
        o0000O00.OooO0O0("SocketManager disconnect");
        this.f24493OooO0oO = false;
        OooO0oO();
        o00Oo0 o00oo1 = this.f24490OooO0Oo;
        oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO00o("isClosed = " + o00oo1.f43226OooO0OO, new Object[0]);
        if (o00oo1.f43226OooO0OO.compareAndSet(false, true)) {
            o00oo1.OooO0OO(false);
        }
        this.f24491OooO0o.postValue(State.ConnectLost);
    }
}
