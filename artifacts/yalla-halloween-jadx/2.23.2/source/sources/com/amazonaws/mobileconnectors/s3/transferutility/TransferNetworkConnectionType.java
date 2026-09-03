package com.amazonaws.mobileconnectors.s3.transferutility;

import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum TransferNetworkConnectionType {
    ANY { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.1
        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
        public final boolean OooO00o(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected();
        }
    },
    WIFI { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.2
        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
        public final boolean OooO00o(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
        }
    },
    MOBILE { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.3
        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
        public final boolean OooO00o(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
        }
    };

    private static final Log LOGGER;
    private static final Map<String, TransferNetworkConnectionType> MAP = new HashMap();

    static {
        for (TransferNetworkConnectionType transferNetworkConnectionType : values()) {
            MAP.put(transferNetworkConnectionType.toString(), transferNetworkConnectionType);
        }
        LOGGER = LogFactory.OooO00o(TransferNetworkConnectionType.class);
    }

    TransferNetworkConnectionType() {
        throw null;
    }

    public abstract boolean OooO00o(NetworkInfo networkInfo);
}
