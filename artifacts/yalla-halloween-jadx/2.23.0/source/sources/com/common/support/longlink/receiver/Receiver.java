package com.common.support.longlink.receiver;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&¨\u0006\u000b"}, d2 = {"Lcom/common/support/longlink/receiver/Receiver;", "OUT", "Ljava/lang/Runnable;", "Ljava/io/Closeable;", "receive", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "setOnPulseMessageReceivedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/longlink/receiver/OnPulseMessageReceivedListener;", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Receiver<OUT> extends Runnable, Closeable {
    void receive(@NotNull byte[] message);

    void setOnPulseMessageReceivedListener(@NotNull OnPulseMessageReceivedListener<OUT> listener);
}
