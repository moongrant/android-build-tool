package com.common.support.longlink;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\tH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/common/support/longlink/Protocol;", "IN", "OUT", "", "isPulseMessage", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Ljava/lang/Object;)Z", "pack", "", "(Ljava/lang/Object;)[B", "pingMessage", "()Ljava/lang/Object;", "pongMessage", "unpack", "([B)Ljava/lang/Object;", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Protocol<IN, OUT> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static <IN, OUT> IN pingMessage(@NotNull Protocol<IN, OUT> protocol) {
            Intrinsics.checkNotNullParameter(protocol, "this");
            return null;
        }

        @Nullable
        public static <IN, OUT> IN pongMessage(@NotNull Protocol<IN, OUT> protocol) {
            Intrinsics.checkNotNullParameter(protocol, "this");
            return null;
        }
    }

    boolean isPulseMessage(OUT message);

    @NotNull
    byte[] pack(IN message);

    @Nullable
    IN pingMessage();

    @Nullable
    IN pongMessage();

    OUT unpack(@NotNull byte[] message);
}
