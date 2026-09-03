package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class BillingFlowParams {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f11199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f11200OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f11201OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f11202OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public zzu f11203OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f11204OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ArrayList f11205OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11206OooO0oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f11207OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f11208OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f11209OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f11210OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ArrayList f11211OooO0o0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }
}
