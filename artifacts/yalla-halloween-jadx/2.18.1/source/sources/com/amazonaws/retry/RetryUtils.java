package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class RetryUtils {
    public static boolean OooO00o(AmazonServiceException amazonServiceException) {
        String strOooO0O0 = amazonServiceException.OooO0O0();
        return "RequestTimeTooSkewed".equals(strOooO0O0) || "RequestExpired".equals(strOooO0O0) || "InvalidSignatureException".equals(strOooO0O0) || "SignatureDoesNotMatch".equals(strOooO0O0);
    }

    public static boolean OooO0O0(Throwable th) {
        if (th instanceof AbortedException) {
            return true;
        }
        if (th.getCause() == null) {
            return false;
        }
        Throwable cause = th.getCause();
        return (cause instanceof InterruptedException) || ((cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException));
    }
}
