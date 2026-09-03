package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ClientConfiguration {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f8967OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final RetryPolicy f8968OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f8969OooO00o = f8967OooO0oO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f8970OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RetryPolicy f8971OooO0OO = f8968OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Protocol f8972OooO0Oo = Protocol.HTTPS;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f8974OooO0o0 = 15000;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f8973OooO0o = 15000;

    static {
        if (VersionInfoUtils.f9595OooO00o == null) {
            synchronized (VersionInfoUtils.class) {
                if (VersionInfoUtils.f9595OooO00o == null) {
                    VersionInfoUtils.OooO00o();
                }
            }
        }
        f8967OooO0oO = VersionInfoUtils.f9595OooO00o;
        f8968OooO0oo = PredefinedRetryPolicies.f9242OooO0O0;
    }
}
