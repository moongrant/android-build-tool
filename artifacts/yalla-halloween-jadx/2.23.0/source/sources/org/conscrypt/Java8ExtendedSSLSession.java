package org.conscrypt;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIServerName;

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
        return Collections.singletonList(OooOO0.OooO00o(requestedServerName));
    }
}
