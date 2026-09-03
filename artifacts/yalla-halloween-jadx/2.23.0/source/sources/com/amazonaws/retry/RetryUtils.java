package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class RetryUtils {
    public static boolean OooO00o(AmazonServiceException amazonServiceException) {
        String strOooO00o = amazonServiceException.OooO00o();
        return "RequestTimeTooSkewed".equals(strOooO00o) || "RequestExpired".equals(strOooO00o) || "InvalidSignatureException".equals(strOooO00o) || "SignatureDoesNotMatch".equals(strOooO00o);
    }

    public static boolean OooO0O0(Exception exc) {
        if (exc instanceof AbortedException) {
            return true;
        }
        if (exc.getCause() == null) {
            return false;
        }
        Throwable cause = exc.getCause();
        return (cause instanceof InterruptedException) || ((cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException));
    }
}
