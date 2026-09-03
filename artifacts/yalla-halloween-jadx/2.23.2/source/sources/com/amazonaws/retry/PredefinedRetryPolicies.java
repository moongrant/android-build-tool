package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class PredefinedRetryPolicies {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final RetryPolicy f12331OooO00o = new RetryPolicy(RetryPolicy.RetryCondition.f12343OooO00o, RetryPolicy.BackoffStrategy.f12342OooO00o, 0, false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final RetryPolicy f12332OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final SDKDefaultRetryCondition f12333OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final RetryPolicy.BackoffStrategy f12334OooO0Oo;

    public static final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Random f12335OooO0O0 = new Random();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f12336OooO0OO = 100;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f12337OooO0Oo = 20000;

        @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
        public final long OooO00o(int i) {
            if (i <= 0) {
                return 0L;
            }
            return this.f12335OooO0O0.nextInt(Math.min(this.f12337OooO0Oo, (1 << i) * this.f12336OooO0OO));
        }
    }

    public static class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
        public final boolean OooO00o(AmazonClientException amazonClientException, int i) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (amazonClientException instanceof AmazonServiceException) {
                AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
                int i2 = amazonServiceException.f12041OooO0oO;
                if (i2 != 500 && i2 != 503 && i2 != 502 && i2 != 504) {
                    String strOooO00o = amazonServiceException.OooO00o();
                    if (!("Throttling".equals(strOooO00o) || "ThrottlingException".equals(strOooO00o) || "ProvisionedThroughputExceededException".equals(strOooO00o)) && !RetryUtils.OooO00o(amazonServiceException)) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    static {
        SDKDefaultRetryCondition sDKDefaultRetryCondition = new SDKDefaultRetryCondition();
        f12333OooO0OO = sDKDefaultRetryCondition;
        SDKDefaultBackoffStrategy sDKDefaultBackoffStrategy = new SDKDefaultBackoffStrategy();
        f12334OooO0Oo = sDKDefaultBackoffStrategy;
        f12332OooO0O0 = new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 3, true);
        new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 10, true);
    }
}
