package p542o0o0o00O;

import androidx.compose.animation.OooO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0000OO0;
import com.app.base.protobuf.MessageIM;
import com.common.support.longlink.MessageHandler;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.yalla.yalla.model.ImResult;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.statistical.event.ImEventType;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p373o0OOoO0O.OooOOO0;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00O00o0;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p471o0Ooooo.o0O00O;
import p471o0Ooooo.o0OoO00O;
import p472o0Ooooo0.oO0000O;
import p480o0o000Oo.o0OOO0o;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo implements MessageHandler<Integer>, OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f55797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oO0000O f55798OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f55799OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Job f55800OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler$getMessageFromServer$1", f = "IMSocketMessageHandler.kt", i = {}, l = {114, 125}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55801OooO0Oo;

        /* JADX INFO: renamed from: o0o0o00O.o0Oo0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler$getMessageFromServer$1$result$1", f = "IMSocketMessageHandler.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0507OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImResult>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f55803OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MessageIM.ReceiveRequest.Builder f55804OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0507OooO00o(MessageIM.ReceiveRequest.Builder builder, Continuation<? super C0507OooO00o> continuation) {
                super(2, continuation);
                this.f55804OooO0o0 = builder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0507OooO00o(this.f55804OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImResult> continuation) {
                return ((C0507OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f55803OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
                    String str = o0000O.f44076OooO0OO;
                    MessageIM.ReceiveRequest.Builder mRequest = this.f55804OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(mRequest, "mRequest");
                    this.f55803OooO0Oo = 1;
                    obj = o000oOoO.OooO0O0(str, mRequest, this);
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
            return o0Oo0oo.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0106 A[DONT_GENERATE] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55801OooO0Oo;
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
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
                    o0oo0oo2.f55800OooO0Oo = null;
                    if (o0oo0oo2.f55799OooO0OO) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                MessageIM.ReceiveRequest.Builder builderNewBuilder = MessageIM.ReceiveRequest.newBuilder();
                builderNewBuilder.setMaxMsgTime(o0000OO0.OooO0O0().OooO0oo());
                p592o0oo00O.OooOOO0.OooO0O0("SocketManager getMessageFromServer");
                C0507OooO00o c0507OooO00o = new C0507OooO00o(builderNewBuilder, null);
                this.f55801OooO0Oo = 1;
                obj = TimeoutKt.withTimeoutOrNull(20000L, c0507OooO00o, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ImResult imResult = (ImResult) obj;
                p592o0oo00O.OooOOO0.OooO0O0("SocketManager getMessageFromServer onResponse code = " + (imResult != null ? Boxing.boxInt(imResult.getCode()) : null) + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                if ((imResult != null ? imResult.getBody() : null) != null) {
                    MessageIM.ReceiveReply from = MessageIM.ReceiveReply.parseFrom(imResult.getBody());
                    p592o0oo00O.OooOOO0.OooO0O0("SocketManager getMessageFromServer onResponse size = " + (from != null ? Boxing.boxInt(from.getMessagesCount()) : null));
                    List<MessageIM.Message> messagesList = from != null ? from.getMessagesList() : null;
                    if (!(messagesList == null || messagesList.isEmpty())) {
                        o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
                        Intrinsics.checkNotNull(from);
                        o0ooo0oOooO0O0.OooOO0O(from.getMessages(from.getMessagesCount() - 1).getTime());
                        ArrayList arrayListOooO00o = o0oo0oo2.f55798OooO0O0.OooO00o(from);
                        if (from.getMore()) {
                            o0oo0oo2.f55799OooO0OO = true;
                        }
                        this.f55801OooO0Oo = 2;
                        if (o0Oo0oo.OooO0O0(o0oo0oo2, arrayListOooO00o, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                o0oo0oo2.f55800OooO0Oo = null;
                if (o0oo0oo2.f55799OooO0OO) {
                }
            } catch (Exception e) {
                p592o0oo00O.OooOOO0.OooO0O0("SocketManager getMessageFromServer error = " + e.getMessage());
            } finally {
                o0oo0oo2.f55800OooO0Oo = null;
                if (o0oo0oo2.f55799OooO0OO) {
                    o0oo0oo2.OooO0OO();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public o0Oo0oo(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f55797OooO00o = lifecycleOwner;
        this.f55798OooO0O0 = new oO0000O();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0O0(o0Oo0oo o0oo0oo2, ArrayList arrayList, Continuation continuation) {
        o0OOO0o o0ooo0o2;
        o0oo0oo2.getClass();
        if (continuation instanceof o0OOO0o) {
            o0ooo0o2 = (o0OOO0o) continuation;
            int i = o0ooo0o2.f55795OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0ooo0o2.f55795OooO0o = i - Integer.MIN_VALUE;
            } else {
                o0ooo0o2 = new o0OOO0o(o0oo0oo2, continuation);
            }
        } else {
            o0ooo0o2 = new o0OOO0o(o0oo0oo2, continuation);
        }
        Object objOooO0O0 = o0ooo0o2.f55794OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0ooo0o2.f55795OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            MessageIM.ConfirmRequest.Builder mRequest = MessageIM.ConfirmRequest.newBuilder();
            mRequest.addAllMessages(arrayList);
            p592o0oo00O.OooOOO0.OooO0O0("SocketManager confirmMessage size = " + arrayList.size() + " endItem = " + OooOOO.OooO0O0(arrayList, 1));
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44077OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(mRequest, "mRequest");
            o0ooo0o2.f55795OooO0o = 1;
            objOooO0O0 = o000oOoO.OooO0O0(str, mRequest, o0ooo0o2);
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
            Lazy lazy = p482o0o000oO.o0Oo0oo.f47701OooO00o;
            ImEventType tag = ImEventType.IM_ConfirmMsgFailed;
            Intrinsics.checkNotNullParameter(tag, "tag");
            CustomLogModel customLogModel = new CustomLogModel();
            customLogModel.setLevel("ERROR");
            customLogModel.setTag(tag.toString());
            p482o0o000oO.o0Oo0oo.OooO00o(customLogModel);
        }
        return Unit.INSTANCE;
    }

    @Override // p373o0OOoO0O.OooOOO0
    public final void OooO00o(@NotNull byte[] rawMsg) {
        Intrinsics.checkNotNullParameter(rawMsg, "msg");
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager handle " + (rawMsg[0] & UByte.MAX_VALUE));
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        int i = rawMsg[0] & UByte.MAX_VALUE;
        if (i == 200) {
            OooO0OO();
        }
        switch (i) {
            case 111:
            case 112:
            case 113:
                OooO.OooO0O0(oOO00O.Other_Device_Login, null, 2, null, o00O0.f45732OooO00o);
                break;
            case 114:
                o0OoO00O error = new o0OoO00O();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00O(error, null), 3, null);
                break;
        }
    }

    public final synchronized void OooO0OO() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            if (this.f55800OooO0Oo != null) {
                this.f55799OooO0OO = true;
            } else {
                this.f55799OooO0OO = false;
                this.f55800OooO0Oo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f55797OooO00o), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
            }
        }
    }

    @Override // com.common.support.longlink.MessageHandler
    public final void handle(Integer num) {
        int iIntValue = num.intValue();
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager handle " + iIntValue);
        if (iIntValue == 200) {
            OooO0OO();
            return;
        }
        if ((iIntValue == 111 || iIntValue == 112) || iIntValue == 113) {
            OooO.OooO0O0(oOO00O.Other_Device_Login, null, 2, null, o00O0.f45732OooO00o);
            return;
        }
        if (iIntValue == 114) {
            o0OoO00O error = new o0OoO00O();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00O(error, null), 3, null);
        } else if (iIntValue == 202) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p385o0OOooOO.oOO00O.f44351OooO00o;
            com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o00O00o0(0L, null));
        }
    }

    @Override // com.common.support.longlink.MessageHandler
    public final void handlePulseMessage(Integer num) {
        int iIntValue = num.intValue();
        MessageHandler.DefaultImpls.handlePulseMessage(this, Integer.valueOf(iIntValue));
        p592o0oo00O.OooOOO0.OooO0O0("SocketManager handle " + iIntValue);
    }
}
