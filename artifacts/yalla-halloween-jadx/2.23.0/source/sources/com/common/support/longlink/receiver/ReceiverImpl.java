package com.common.support.longlink.receiver;

import com.common.support.longlink.MessageHandler;
import com.common.support.longlink.Protocol;
import com.common.support.longlink.ScopedLongLink;
import com.common.support.longlink.log.LoggerKt;
import com.common.support.utils.Worker;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B3\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u0016\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/common/support/longlink/receiver/ReceiverImpl;", "IN", "OUT", "Lcom/common/support/longlink/receiver/Receiver;", "Lcom/common/support/utils/Worker;", "", "longLink", "Lcom/common/support/longlink/ScopedLongLink;", "protocol", "Lcom/common/support/longlink/Protocol;", "messageHandler", "Lcom/common/support/longlink/MessageHandler;", "(Lcom/common/support/longlink/ScopedLongLink;Lcom/common/support/longlink/Protocol;Lcom/common/support/longlink/MessageHandler;)V", "onPulseMessageReceivedListener", "Lcom/common/support/longlink/receiver/OnPulseMessageReceivedListener;", ViewHierarchyConstants.TAG_KEY, "", "doTask", "", "work", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDoTaskError", "e", "", "receive", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "setOnPulseMessageReceivedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ReceiverImpl<IN, OUT> extends Worker<byte[]> implements Receiver<OUT> {

    @NotNull
    private final ScopedLongLink<IN> longLink;

    @NotNull
    private final MessageHandler<OUT> messageHandler;

    @Nullable
    private OnPulseMessageReceivedListener<OUT> onPulseMessageReceivedListener;

    @NotNull
    private final Protocol<?, OUT> protocol;

    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: com.common.support.longlink.receiver.ReceiverImpl$doTask$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"IN", "OUT", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.common.support.longlink.receiver.ReceiverImpl$doTask$2", f = "ReceiverImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OUT $parsedMessage;
        int label;
        final /* synthetic */ ReceiverImpl<IN, OUT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReceiverImpl<IN, OUT> receiverImpl, OUT out, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = receiverImpl;
            this.$parsedMessage = out;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$parsedMessage, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((ReceiverImpl) this.this$0).protocol.isPulseMessage(this.$parsedMessage)) {
                OnPulseMessageReceivedListener onPulseMessageReceivedListener = ((ReceiverImpl) this.this$0).onPulseMessageReceivedListener;
                if (onPulseMessageReceivedListener != null) {
                    onPulseMessageReceivedListener.onMessage(this.$parsedMessage);
                }
                ((ReceiverImpl) this.this$0).messageHandler.handlePulseMessage(this.$parsedMessage);
            } else {
                ((ReceiverImpl) this.this$0).messageHandler.handle(this.$parsedMessage);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiverImpl(@NotNull ScopedLongLink<IN> longLink, @NotNull Protocol<?, OUT> protocol, @NotNull MessageHandler<OUT> messageHandler) {
        super(longLink.getLongLinkScope());
        Intrinsics.checkNotNullParameter(longLink, "longLink");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.longLink = longLink;
        this.protocol = protocol;
        this.messageHandler = messageHandler;
        this.tag = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
    }

    @Override // com.common.support.utils.Worker
    public /* bridge */ /* synthetic */ Object doTask(byte[] bArr, Continuation continuation) {
        return doTask2(bArr, (Continuation<? super Unit>) continuation);
    }

    @Override // com.common.support.utils.Worker
    public void onDoTaskError(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        LoggerKt.logE(this.tag, Intrinsics.stringPlus("Parsing data error! \n", ExceptionsKt.stackTraceToString(e)));
    }

    @Override // com.common.support.longlink.receiver.Receiver
    public void receive(@NotNull byte[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        enqueueTask(message);
    }

    @Override // com.common.support.longlink.receiver.Receiver
    public void setOnPulseMessageReceivedListener(@NotNull OnPulseMessageReceivedListener<OUT> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPulseMessageReceivedListener = listener;
    }

    @Nullable
    /* JADX INFO: renamed from: doTask, reason: avoid collision after fix types in other method */
    public Object doTask2(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        Job jobLaunch$longlink_release = this.longLink.launch$longlink_release(new AnonymousClass2(this, this.protocol.unpack(bArr), null));
        return jobLaunch$longlink_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? jobLaunch$longlink_release : Unit.INSTANCE;
    }
}
