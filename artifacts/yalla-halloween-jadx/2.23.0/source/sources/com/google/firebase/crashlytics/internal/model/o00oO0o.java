package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o extends CrashlyticsReport.OooO.OooO0o.AbstractC0252OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20125OooO00o;

    public o00oO0o(String str) {
        this.f20125OooO00o = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.AbstractC0252OooO0o
    @NonNull
    public final String OooO00o() {
        return this.f20125OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.OooO.OooO0o.AbstractC0252OooO0o) {
            return this.f20125OooO00o.equals(((CrashlyticsReport.OooO.OooO0o.AbstractC0252OooO0o) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20125OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return o0O00o0.OooO0O0(new StringBuilder("Log{content="), this.f20125OooO00o, "}");
    }
}
