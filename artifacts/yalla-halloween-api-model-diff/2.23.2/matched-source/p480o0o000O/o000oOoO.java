package p480o0o000O;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
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
import kotlin.collections.unsigned.OooO0OO;
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
import p269o00oooo0.o0O0oo0o;
import p373o0OOoO.OooO0o;
import p384o0OOoo0O.Oooo0;
import p391o0OOooo0.o000OOo;
import p391o0OOooo0.oo0o0Oo;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p479o0o0000o.o000;
import p479o0o0000o.o0000O;
import p488o0o00O0.OooOO0;
import p544o0o0o00O.o0O0OOOo;
import p598o0oo00Oo.o0000O00;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO implements MessageHandler<Integer>, OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f48408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0OOOo f48409OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f48410OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Job f48411OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler$getMessageFromServer$1", f = "IMSocketMessageHandler.kt", i = {}, l = {114, 125}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f48412OooO0Oo;

        /* JADX INFO: renamed from: o0o000O.o000oOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler$getMessageFromServer$1$result$1", f = "IMSocketMessageHandler.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0460OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImResult>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f48414OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MessageIM.ReceiveRequest.Builder f48415OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0460OooO00o(MessageIM.ReceiveRequest.Builder builder, Continuation<? super C0460OooO00o> continuation) {
                super(2, continuation);
                this.f48415OooO0o0 = builder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0460OooO00o(this.f48415OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImResult> continuation) {
                return ((C0460OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f48414OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
                    String str = Oooo0.f43335OooO0OO;
                    MessageIM.ReceiveRequest.Builder mRequest = this.f48415OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(mRequest, "$mRequest");
                    this.f48414OooO0Oo = 1;
                    obj = OooOO0.OooO0O0(str, mRequest, this);
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
            return o000oOoO.this.new OooO00o(continuation);
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
            int i = this.f48412OooO0Oo;
            o000oOoO o000oooo2 = o000oOoO.this;
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
                    o000oooo2.f48411OooO0Oo = null;
                    if (o000oooo2.f48410OooO0OO) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                MessageIM.ReceiveRequest.Builder builderNewBuilder = MessageIM.ReceiveRequest.newBuilder();
                builderNewBuilder.setMaxMsgTime(o0O0oo0o.OooO00o().OooO0oo());
                o0000O00.OooO0O0("SocketManager getMessageFromServer");
                C0460OooO00o c0460OooO00o = new C0460OooO00o(builderNewBuilder, null);
                this.f48412OooO0Oo = 1;
                obj = TimeoutKt.withTimeoutOrNull(20000L, c0460OooO00o, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ImResult imResult = (ImResult) obj;
                o0000O00.OooO0O0("SocketManager getMessageFromServer onResponse code = " + (imResult != null ? Boxing.boxInt(imResult.getCode()) : null) + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                if ((imResult != null ? imResult.getBody() : null) != null) {
                    MessageIM.ReceiveReply from = MessageIM.ReceiveReply.parseFrom(imResult.getBody());
                    o0000O00.OooO0O0("SocketManager getMessageFromServer onResponse size = " + (from != null ? Boxing.boxInt(from.getMessagesCount()) : null));
                    List<MessageIM.Message> messagesList = from != null ? from.getMessagesList() : null;
                    if (!(messagesList == null || messagesList.isEmpty())) {
                        p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
                        Intrinsics.checkNotNull(from);
                        oooO0oOooO00o.OooOO0O(from.getMessages(from.getMessagesCount() - 1).getTime());
                        ArrayList arrayListOooO00o = o000oooo2.f48409OooO0O0.OooO00o(from);
                        if (from.getMore()) {
                            o000oooo2.f48410OooO0OO = true;
                        }
                        this.f48412OooO0Oo = 2;
                        if (o000oOoO.OooO0O0(o000oooo2, arrayListOooO00o, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                o000oooo2.f48411OooO0Oo = null;
                if (o000oooo2.f48410OooO0OO) {
                }
            } catch (Exception e) {
                o0000O00.OooO0O0("SocketManager getMessageFromServer error = " + e.getMessage());
            } finally {
                o000oooo2.f48411OooO0Oo = null;
                if (o000oooo2.f48410OooO0OO) {
                    o000oooo2.OooO0OO();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public o000oOoO(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f48408OooO00o = lifecycleOwner;
        this.f48409OooO0O0 = new o0O0OOOo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0O0(o000oOoO o000oooo2, ArrayList arrayList, Continuation continuation) {
        Oooo0 oooo0;
        o000oooo2.getClass();
        if (continuation instanceof Oooo0) {
            oooo0 = (Oooo0) continuation;
            int i = oooo0.f48405OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f48405OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(o000oooo2, continuation);
            }
        } else {
            oooo0 = new Oooo0(o000oooo2, continuation);
        }
        Object objOooO0O0 = oooo0.f48404OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo0.f48405OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            MessageIM.ConfirmRequest.Builder builderNewBuilder = MessageIM.ConfirmRequest.newBuilder();
            builderNewBuilder.addAllMessages(arrayList);
            o0000O00.OooO0O0("SocketManager confirmMessage size = " + arrayList.size() + " endItem = " + OooOOO.OooO00o(arrayList, 1));
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43336OooO0Oo;
            Intrinsics.checkNotNull(builderNewBuilder);
            oooo0.f48405OooO0o = 1;
            objOooO0O0 = OooOO0.OooO0O0(str, builderNewBuilder, oooo0);
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
            Lazy lazy = OooOO0.f48912OooO00o;
            ImEventType tag = ImEventType.IM_ConfirmMsgFailed;
            Intrinsics.checkNotNullParameter(tag, "tag");
            CustomLogModel customLogModel = new CustomLogModel();
            customLogModel.setLevel("ERROR");
            customLogModel.setTag(tag.toString());
            OooOO0.OooO00o(customLogModel);
        }
        return Unit.INSTANCE;
    }

    @Override // p373o0OOoO.OooO0o
    public final void OooO00o(@NotNull byte[] rawMsg) {
        Intrinsics.checkNotNullParameter(rawMsg, "msg");
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        o0000O00.OooO0O0("SocketManager handle " + (rawMsg[0] & UByte.MAX_VALUE));
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        int i = rawMsg[0] & UByte.MAX_VALUE;
        if (i == 200) {
            OooO0OO();
        }
        switch (i) {
            case 111:
            case 112:
            case 113:
                OooO0OO.OooO0O0(o0O0o.Other_Device_Login, null, 2, null, o0O000.f47005OooO00o);
                break;
            case 114:
                o0000O error = new o0000O();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000(error, null), 3, null);
                break;
        }
    }

    public final synchronized void OooO0OO() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            if (this.f48411OooO0Oo != null) {
                this.f48410OooO0OO = true;
            } else {
                this.f48410OooO0OO = false;
                this.f48411OooO0Oo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f48408OooO00o), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
            }
        }
    }

    @Override // com.common.support.longlink.MessageHandler
    public final void handle(Integer num) {
        int iIntValue = num.intValue();
        o0000O00.OooO0O0("SocketManager handle " + iIntValue);
        if (iIntValue == 200) {
            OooO0OO();
            return;
        }
        if ((iIntValue == 111 || iIntValue == 112) || iIntValue == 113) {
            OooO0OO.OooO0O0(o0O0o.Other_Device_Login, null, 2, null, o0O000.f47005OooO00o);
            return;
        }
        if (iIntValue == 114) {
            o0000O error = new o0000O();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000(error, null), 3, null);
        } else if (iIntValue == 202) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
            com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o000OOo(0L, null));
        }
    }

    @Override // com.common.support.longlink.MessageHandler
    public final void handlePulseMessage(Integer num) {
        int iIntValue = num.intValue();
        MessageHandler.DefaultImpls.handlePulseMessage(this, Integer.valueOf(iIntValue));
        o0000O00.OooO0O0("SocketManager handle " + iIntValue);
    }
}
