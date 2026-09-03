package com.common.support.longlinksocket;

import com.facebook.appevents.integrity.IntegrityManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/common/support/longlinksocket/SocketConfig;", "", "connectTimeout", "", "getConnectTimeout", "()I", "socketProtocol", "Lcom/common/support/longlinksocket/SocketProtocol;", "getSocketProtocol", "()Lcom/common/support/longlinksocket/SocketProtocol;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/common/support/longlinksocket/Address;", "longlink-socket_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface SocketConfig {
    @NotNull
    Address address();

    int getConnectTimeout();

    @NotNull
    SocketProtocol getSocketProtocol();
}
