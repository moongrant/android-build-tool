package p533o0o0OOO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.billingclient.api.o00000O;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ImResult;
import com.yalla.yalla.common.statistical.event.ImEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import java.util.List;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import o0O000O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p154o00Oo0oO.o0ooOOo;
import p167o00OoOoo.o0O00O0o;
import p190o00o00oO.oo0o0Oo;
import p479o0Ooooo0.o00OO00O;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p529o0o0OO0.OooOo;
import p530o0o0OO0O.o000O;
import p530o0o0OO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O00OO implements OooO<Integer>, o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f43429OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo f43430OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f43431OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Job f43432OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler$getMessageFromServer$1", f = "IMSocketMessageHandler.kt", i = {}, l = {69, 81}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f43433Oooo;

        /* JADX INFO: renamed from: o0o0OOO0.o00O00OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler$getMessageFromServer$1$result$1", f = "IMSocketMessageHandler.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0406OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImResult>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f43435Oooo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ MessageIM.ReceiveRequest.Builder f43436OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0406OooO00o(MessageIM.ReceiveRequest.Builder builder, Continuation<? super C0406OooO00o> continuation) {
                super(2, continuation);
                this.f43436OoooO00 = builder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0406OooO00o(this.f43436OoooO00, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImResult> continuation) {
                return ((C0406OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f43435Oooo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o00oOoo o00oooo2 = o00oOoo.f43437OooO00o;
                    o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
                    String str = o0ooOOo.f32242OooO0Oo;
                    MessageIM.ReceiveRequest.Builder mRequest = this.f43436OoooO00;
                    Intrinsics.checkNotNullExpressionValue(mRequest, "mRequest");
                    this.f43435Oooo = 1;
                    obj = o00oooo2.OooO0O0(str, mRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o00O00OO.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00f8 A[PHI: r8
          0x00f8: PHI (r8v7 o0o0OOO0.o00O00OO) = (r8v4 o0o0OOO0.o00O00OO), (r8v18 o0o0OOO0.o00O00OO) binds: [B:55:0x011a, B:51:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00O00OO o00o00oo2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f43433Oooo;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        o00o00oo2 = o00O00OO.this;
                        o00o00oo2.f43432OooO0Oo = null;
                        if (o00o00oo2.f43431OooO0OO) {
                            o00o00oo2.OooO0o0();
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    MessageIM.ReceiveRequest.Builder builderNewBuilder = MessageIM.ReceiveRequest.newBuilder();
                    builderNewBuilder.setMaxMsgTime(o00000O.OooO0O0().OooOO0o());
                    o00O00.OooO0O0("SocketManager getMessageFromServer");
                    C0406OooO00o c0406OooO00o = new C0406OooO00o(builderNewBuilder, null);
                    this.f43433Oooo = 1;
                    obj = TimeoutKt.withTimeoutOrNull(20000L, c0406OooO00o, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ImResult imResult = (ImResult) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SocketManager getMessageFromServer onResponse code = ");
                    sb.append(imResult != null ? Boxing.boxInt(imResult.getCode()) : null);
                    sb.append(' ');
                    o00O00.OooO0O0(sb.toString());
                    if ((imResult != null ? imResult.getBody() : null) != null) {
                        MessageIM.ReceiveReply from = MessageIM.ReceiveReply.parseFrom(imResult.getBody());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SocketManager getMessageFromServer onResponse size = ");
                        sb2.append(from != null ? Boxing.boxInt(from.getMessagesCount()) : null);
                        o00O00.OooO0O0(sb2.toString());
                        List<MessageIM.Message> messagesList = from != null ? from.getMessagesList() : null;
                        if (!(messagesList == null || messagesList.isEmpty())) {
                            o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
                            Intrinsics.checkNotNull(from);
                            o0o00o0oOooO0O0.OooOOOo(from.getMessages(from.getMessagesCount() - 1).getTime());
                            List<String> listOooO00o = o00O00OO.this.f43430OooO0O0.OooO00o(from);
                            if (from.getMore()) {
                                o00O00OO.this.f43431OooO0OO = true;
                            }
                            o00O00OO o00o00oo3 = o00O00OO.this;
                            this.f43433Oooo = 2;
                            if (o00O00OO.OooO0Oo(o00o00oo3, listOooO00o, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    o00o00oo2 = o00O00OO.this;
                    o00o00oo2.f43432OooO0Oo = null;
                    if (o00o00oo2.f43431OooO0OO) {
                        o00o00oo2.OooO0o0();
                    }
                } catch (Exception e) {
                    o00O00.OooO0O0("SocketManager getMessageFromServer error = " + e.getMessage());
                    o00o00oo2 = o00O00OO.this;
                    o00o00oo2.f43432OooO0Oo = null;
                    if (o00o00oo2.f43431OooO0OO) {
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                o00O00OO o00o00oo4 = o00O00OO.this;
                o00o00oo4.f43432OooO0Oo = null;
                if (o00o00oo4.f43431OooO0OO) {
                    o00o00oo4.OooO0o0();
                }
                throw th;
            }
        }
    }

    public o00O00OO(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f43429OooO00o = lifecycleOwner;
        this.f43430OooO0O0 = new OooOo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0Oo(o00O00OO o00o00oo2, List list, Continuation continuation) throws BadPaddingException, IllegalBlockSizeException {
        oOO00O ooo00o;
        Objects.requireNonNull(o00o00oo2);
        if (continuation instanceof oOO00O) {
            ooo00o = (oOO00O) continuation;
            int i = ooo00o.f43444OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo00o.f43444OoooO0 = i - Integer.MIN_VALUE;
            } else {
                ooo00o = new oOO00O(o00o00oo2, continuation);
            }
        } else {
            ooo00o = new oOO00O(o00o00oo2, continuation);
        }
        Object objOooO0O0 = ooo00o.f43443Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ooo00o.f43444OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            MessageIM.ConfirmRequest.Builder mRequest = MessageIM.ConfirmRequest.newBuilder();
            mRequest.addAllMessages(list);
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("SocketManager confirmMessage size = ");
            sbOooO0O0.append(list.size());
            sbOooO0O0.append(" endItem = ");
            sbOooO0O0.append((String) list.get(list.size() - 1));
            o00O00.OooO0O0(sbOooO0O0.toString());
            o00oOoo o00oooo2 = o00oOoo.f43437OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
            String str = o0ooOOo.f32244OooO0o0;
            Intrinsics.checkNotNullExpressionValue(mRequest, "mRequest");
            ooo00o.f43444OoooO0 = 1;
            objOooO0O0 = o00oooo2.OooO0O0(str, mRequest, ooo00o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0O0);
        }
        if (((ImResult) objOooO0O0).getBody() == null) {
            FLog.INSTANCE.imLog(ImEventType.IM_ConfirmMsgFailed);
        }
        return Unit.INSTANCE;
    }

    @Override // o0O000O.OooO
    public final void OooO00o(Integer num) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(this, "this");
        o00O00.OooO0O0("SocketManager handle " + iIntValue);
    }

    @Override // p479o0Ooooo0.o00OO00O
    public final void OooO0O0(@NotNull byte[] rawMsg) {
        Intrinsics.checkNotNullParameter(rawMsg, "msg");
        StringBuilder sb = new StringBuilder();
        sb.append("SocketManager handle ");
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        sb.append(rawMsg[0] & UByte.MAX_VALUE);
        o00O00.OooO0O0(sb.toString());
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        int i = rawMsg[0] & UByte.MAX_VALUE;
        if (i == 200) {
            OooO0o0();
        }
        switch (i) {
            case 111:
            case 112:
            case 113:
                oo0o0Oo.OooO0O0(CommonError.Other_Device_Login, null, 2, null, CommonErrorHandler.INSTANCE);
                break;
            case 114:
                o000O0O0 error = new o000O0O0(618);
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O(error, null), 3, null);
                break;
        }
    }

    @Override // o0O000O.OooO
    public final void OooO0OO(Integer num) {
        int iIntValue = num.intValue();
        o00O00.OooO0O0("SocketManager handle " + iIntValue);
        if (iIntValue == 200) {
            OooO0o0();
        }
        switch (iIntValue) {
            case 111:
            case 112:
            case 113:
                oo0o0Oo.OooO0O0(CommonError.Other_Device_Login, null, 2, null, CommonErrorHandler.INSTANCE);
                break;
            case 114:
                o000O0O0 error = new o000O0O0(618);
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O(error, null), 3, null);
                break;
        }
    }

    public final synchronized void OooO0o0() {
        if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            if (this.f43432OooO0Oo != null) {
                this.f43431OooO0OO = true;
            } else {
                this.f43431OooO0OO = false;
                this.f43432OooO0Oo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f43429OooO00o), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
            }
        }
    }
}
