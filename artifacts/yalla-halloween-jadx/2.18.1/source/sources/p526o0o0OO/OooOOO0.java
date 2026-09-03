package p526o0o0OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o00000O;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.protobuf.MessageIM;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.db.table.SimpleMessage;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.model.SystemMessageModel;
import kotlin.ResultKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 extends OooOo {

    @DebugMetadata(c = "com.yalla.yalla.service.im.processor.IMCommonMsgProcessor$parseMessage$1", f = "IMCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.im.processor.IMCommonMsgProcessor$parseMessage$2", f = "IMCommonMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        SimpleMessage.FansMessage fansMessage;
        SimpleMessage.VisitorMessage visitorMessage;
        MessageIM.Message2123 from;
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00O00.OooO0OO("IMCommonMsgProcessor", "msg.head = " + msg.getHead() + " parseMessage = " + msg);
        int head = msg.getHead();
        if (head != 2102) {
            if (head == 2110) {
                MessageIM.Message2110 from2 = MessageIM.Message2110.parseFrom(msg.getBody());
                if (from2 == null) {
                    return;
                }
                OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(from2.getBalance()));
                return;
            }
            if (head != 2116) {
                if (head == 2123 && (from = MessageIM.Message2123.parseFrom(msg.getBody())) != null) {
                    o00000O.OooO0O0().OooO0o(OooOOO.f41216OooO00o.OooOo().getValue() + "MORA_RED_POINT", from.getMoraRecordId());
                    LiveEventBus.get("MORA_RED_POINT").post(from);
                    return;
                }
                return;
            }
            MessageIM.Message2116 from3 = MessageIM.Message2116.parseFrom(msg.getBody());
            if (from3 != null) {
                if (from3.getAttr() == 0) {
                    o00000O.OooO0O0().OooOOo(true);
                    LiveEventBus.get("SHOW_CLOCK_ANIMATION").post(null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(null), 3, null);
                    return;
                } else {
                    if (from3.getAttr() == 1) {
                        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                        p497o0o00Oo.OooOOO0.OooO0oo().OooOO0O(true);
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(null), 3, null);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        SystemMessageModel systemMessageModel = (SystemMessageModel) o0Oo0oo.OooO0O0(MessageIM.Message2102.parseFrom(msg.getBody()).getMsg(), SystemMessageModel.class);
        if (systemMessageModel == null) {
            return;
        }
        int type = systemMessageModel.getType();
        int fansNum = 0;
        if (type == 5) {
            SimpleMessage message = new SimpleMessage();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            message.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue());
            message.setType(2);
            SimpleMessage.FansMessage fansMessage2 = new SimpleMessage.FansMessage();
            SimpleMessage simpleMessageOooO0o = OooO0OO.OooO00o().Oooo00O().OooO0o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue());
            if (simpleMessageOooO0o != null && (fansMessage = simpleMessageOooO0o.getFansMessage()) != null) {
                fansNum = fansMessage.getFansNum();
            }
            fansMessage2.setFansNum(fansNum + 1);
            message.setFansMessage(fansMessage2);
            Intrinsics.checkNotNullParameter(message, "message");
            OooO0OO.OooO00o().Oooo00O().OooO0oo(message);
            return;
        }
        if (type != 6) {
            return;
        }
        SimpleMessage message2 = new SimpleMessage();
        OooOOO oooOOO2 = OooOOO.f41216OooO00o;
        message2.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO2)).longValue());
        message2.setType(3);
        SimpleMessage.VisitorMessage visitorMessage2 = new SimpleMessage.VisitorMessage();
        SimpleMessage simpleMessageOooOO0 = OooO0OO.OooO00o().Oooo00O().OooOO0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO2)).longValue());
        if (simpleMessageOooOO0 != null && (visitorMessage = simpleMessageOooOO0.getVisitorMessage()) != null) {
            fansNum = visitorMessage.getVisitorNum();
        }
        visitorMessage2.setVisitorNum(fansNum + 1);
        message2.setVisitorMessage(visitorMessage2);
        Intrinsics.checkNotNullParameter(message2, "message");
        OooO0OO.OooO00o().Oooo00O().OooO0oo(message2);
    }
}
