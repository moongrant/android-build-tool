package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ClientConfiguration {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f12057OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final RetryPolicy f12058OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f12059OooO00o = f12057OooO0oO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f12060OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RetryPolicy f12061OooO0OO = f12058OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Protocol f12062OooO0Oo = Protocol.HTTPS;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f12064OooO0o0 = 15000;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f12063OooO0o = 15000;

    static {
        if (VersionInfoUtils.f12686OooO00o == null) {
            synchronized (VersionInfoUtils.class) {
                if (VersionInfoUtils.f12686OooO00o == null) {
                    VersionInfoUtils.OooO00o();
                }
            }
        }
        f12057OooO0oO = VersionInfoUtils.f12686OooO00o;
        f12058OooO0oo = PredefinedRetryPolicies.f12332OooO0O0;
    }
}
