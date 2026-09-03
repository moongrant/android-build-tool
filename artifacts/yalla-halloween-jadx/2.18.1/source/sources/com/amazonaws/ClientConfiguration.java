package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClientConfiguration {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f10277OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final RetryPolicy f10278OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f10279OooO00o = f10277OooO0oO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f10280OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public RetryPolicy f10281OooO0OO = f10278OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Protocol f10282OooO0Oo = Protocol.HTTPS;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f10284OooO0o0 = 15000;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f10283OooO0o = 15000;

    static {
        if (VersionInfoUtils.f11191OooO00o == null) {
            synchronized (VersionInfoUtils.class) {
                if (VersionInfoUtils.f11191OooO00o == null) {
                    VersionInfoUtils.OooO00o();
                }
            }
        }
        f10277OooO0oO = VersionInfoUtils.f11191OooO00o;
        f10278OooO0oo = PredefinedRetryPolicies.f10562OooO0O0;
    }
}
