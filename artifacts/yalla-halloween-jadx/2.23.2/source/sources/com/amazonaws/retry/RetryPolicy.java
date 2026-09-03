package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryPolicy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RetryCondition f12338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final BackoffStrategy f12339OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f12340OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f12341OooO0Oo;

    public interface BackoffStrategy {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final BackoffStrategy f12342OooO00o = new BackoffStrategy() { // from class: com.amazonaws.retry.RetryPolicy.BackoffStrategy.1
            @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
            public final long OooO00o(int i) {
                return 0L;
            }
        };

        long OooO00o(int i);
    }

    public interface RetryCondition {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final RetryCondition f12343OooO00o = new RetryCondition() { // from class: com.amazonaws.retry.RetryPolicy.RetryCondition.1
            @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
            public final boolean OooO00o(AmazonClientException amazonClientException, int i) {
                return false;
            }
        };

        boolean OooO00o(AmazonClientException amazonClientException, int i);
    }

    public RetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy, int i, boolean z) {
        retryCondition = retryCondition == null ? PredefinedRetryPolicies.f12333OooO0OO : retryCondition;
        backoffStrategy = backoffStrategy == null ? PredefinedRetryPolicies.f12334OooO0Oo : backoffStrategy;
        if (i < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }
        this.f12338OooO00o = retryCondition;
        this.f12339OooO0O0 = backoffStrategy;
        this.f12340OooO0OO = i;
        this.f12341OooO0Oo = z;
    }
}
