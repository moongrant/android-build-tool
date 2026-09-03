package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryPolicy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RetryCondition f9248OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final BackoffStrategy f9249OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f9250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f9251OooO0Oo;

    public interface BackoffStrategy {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final BackoffStrategy f9252OooO00o = new BackoffStrategy() { // from class: com.amazonaws.retry.RetryPolicy.BackoffStrategy.1
            @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
            public final long OooO00o(int i) {
                return 0L;
            }
        };

        long OooO00o(int i);
    }

    public interface RetryCondition {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final RetryCondition f9253OooO00o = new RetryCondition() { // from class: com.amazonaws.retry.RetryPolicy.RetryCondition.1
            @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
            public final boolean OooO00o(AmazonClientException amazonClientException, int i) {
                return false;
            }
        };

        boolean OooO00o(AmazonClientException amazonClientException, int i);
    }

    public RetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy, int i, boolean z) {
        retryCondition = retryCondition == null ? PredefinedRetryPolicies.f9243OooO0OO : retryCondition;
        backoffStrategy = backoffStrategy == null ? PredefinedRetryPolicies.f9244OooO0Oo : backoffStrategy;
        if (i < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }
        this.f9248OooO00o = retryCondition;
        this.f9249OooO0O0 = backoffStrategy;
        this.f9250OooO0OO = i;
        this.f9251OooO0Oo = z;
    }
}
