package org.conscrypt;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIServerName;
import p630o0ooO00o.o00000OO;

/* JADX INFO: loaded from: classes5.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
    }

    public final List<SNIServerName> getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        if (requestedServerName == null) {
            return null;
        }
        return Collections.singletonList(o00000OO.OooO00o(requestedServerName));
    }
}
