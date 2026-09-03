package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f20539OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f20540OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f20541OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f20542OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Date f20538OooO0o0 = new Date(-1);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public static final Date f20537OooO0o = new Date(-1);

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f20543OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Date f20544OooO0O0;

        public OooO00o(int i, Date date) {
            this.f20543OooO00o = i;
            this.f20544OooO0O0 = date;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0258OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f20545OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Date f20546OooO0O0;

        public C0258OooO0O0(int i, Date date) {
            this.f20545OooO00o = i;
            this.f20546OooO0O0 = date;
        }
    }

    public OooO0O0(SharedPreferences sharedPreferences) {
        this.f20539OooO00o = sharedPreferences;
    }

    public final OooO00o OooO00o() {
        OooO00o oooO00o;
        synchronized (this.f20541OooO0OO) {
            oooO00o = new OooO00o(this.f20539OooO00o.getInt("num_failed_fetches", 0), new Date(this.f20539OooO00o.getLong("backoff_end_time_in_millis", -1L)));
        }
        return oooO00o;
    }

    public final C0258OooO0O0 OooO0O0() {
        C0258OooO0O0 c0258OooO0O0;
        synchronized (this.f20542OooO0Oo) {
            c0258OooO0O0 = new C0258OooO0O0(this.f20539OooO00o.getInt("num_failed_realtime_streams", 0), new Date(this.f20539OooO00o.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return c0258OooO0O0;
    }

    public final void OooO0OO(int i, Date date) {
        synchronized (this.f20541OooO0OO) {
            this.f20539OooO00o.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void OooO0Oo(String str) {
        synchronized (this.f20540OooO0O0) {
            this.f20539OooO00o.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void OooO0o() {
        synchronized (this.f20540OooO0O0) {
            this.f20539OooO00o.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void OooO0o0(int i, Date date) {
        synchronized (this.f20542OooO0Oo) {
            this.f20539OooO00o.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void OooO0oO() {
        synchronized (this.f20540OooO0O0) {
            this.f20539OooO00o.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
