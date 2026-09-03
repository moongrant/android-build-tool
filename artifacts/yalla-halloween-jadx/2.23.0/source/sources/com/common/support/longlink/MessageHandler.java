package com.common.support.longlink;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/common/support/longlink/MessageHandler;", "OUT", "", "handle", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Ljava/lang/Object;)V", "handlePulseMessage", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface MessageHandler<OUT> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <OUT> void handlePulseMessage(@NotNull MessageHandler<OUT> messageHandler, OUT out) {
            Intrinsics.checkNotNullParameter(messageHandler, "this");
        }
    }

    void handle(OUT message);

    void handlePulseMessage(OUT message);
}
