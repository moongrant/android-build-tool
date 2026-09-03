package p481o0o000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.db.table.SimpleMessage;
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
import p269o00oooo0.o0O0oo0o;
import p408o0Oo0Oo0.o00Oo0;
import p414o0Oo0oO.oO0O0OoO;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p477o0o00.OooO0o;
import p590o0oOooo0.oOOO00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
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
        o0000O00.OooO0OO("IMCommonMsgProcessor", "msg.head = " + msg.getHead() + " parseMessage = " + msg);
        int head = msg.getHead();
        if (head != 2102) {
            if (head == 2110) {
                MessageIM.Message2110 from2 = MessageIM.Message2110.parseFrom(msg.getBody());
                if (from2 == null) {
                    return;
                }
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().postValue(Long.valueOf(from2.getBalance()));
                return;
            }
            if (head != 2116) {
                if (head == 2123 && (from = MessageIM.Message2123.parseFrom(msg.getBody())) != null) {
                    OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    oooO0oOooO00o.OooO0Oo(from.getMoraRecordId(), o0O00oO0.OooOOo0().getValue() + "MORA_RED_POINT");
                    LiveEventBus.get("MORA_RED_POINT").post(from);
                    return;
                }
                return;
            }
            MessageIM.Message2116 from3 = MessageIM.Message2116.parseFrom(msg.getBody());
            if (from3 != null) {
                if (from3.getAttr() == 0) {
                    o0O0oo0o.OooO00o().OooOO0o(true);
                    LiveEventBus.get("SHOW_CLOCK_ANIMATION").post(null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(null), 3, null);
                    return;
                } else {
                    if (from3.getAttr() == 1) {
                        ((oO0O0OoO) o00Ooo.f46414OooO0oo.getValue()).OooOO0O(true);
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(null), 3, null);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        SystemMessageModel systemMessageModel = (SystemMessageModel) oOOO00.OooO00o(MessageIM.Message2102.parseFrom(msg.getBody()).getMsg(), SystemMessageModel.class);
        if (systemMessageModel == null) {
            return;
        }
        int type = systemMessageModel.getType();
        int fansNum = 0;
        if (type == 5) {
            SimpleMessage message = new SimpleMessage();
            o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
            message.setUid(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            message.setType(2);
            SimpleMessage.FansMessage fansMessage2 = new SimpleMessage.FansMessage();
            SimpleMessage simpleMessageOooO0Oo = o00Oo0.OooO00o().Oooo000().OooO0Oo(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            if (simpleMessageOooO0Oo != null && (fansMessage = simpleMessageOooO0Oo.getFansMessage()) != null) {
                fansNum = fansMessage.getFansNum();
            }
            fansMessage2.setFansNum(fansNum + 1);
            message.setFansMessage(fansMessage2);
            Intrinsics.checkNotNullParameter(message, "message");
            o00Oo0.OooO00o().Oooo000().OooO0O0(message);
            return;
        }
        if (type != 6) {
            return;
        }
        SimpleMessage message2 = new SimpleMessage();
        o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
        message2.setUid(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        message2.setType(3);
        SimpleMessage.VisitorMessage visitorMessage2 = new SimpleMessage.VisitorMessage();
        SimpleMessage simpleMessageOooO0oO = o00Oo0.OooO00o().Oooo000().OooO0oO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        if (simpleMessageOooO0oO != null && (visitorMessage = simpleMessageOooO0oO.getVisitorMessage()) != null) {
            fansNum = visitorMessage.getVisitorNum();
        }
        visitorMessage2.setVisitorNum(fansNum + 1);
        message2.setVisitorMessage(visitorMessage2);
        Intrinsics.checkNotNullParameter(message2, "message");
        o00Oo0.OooO00o().Oooo000().OooO0O0(message2);
    }
}
