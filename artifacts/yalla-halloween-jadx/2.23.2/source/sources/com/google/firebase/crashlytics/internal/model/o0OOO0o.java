package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o extends CrashlyticsReport.OooO.OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19654OooO00o;

    public o0OOO0o(String str) {
        this.f19654OooO00o = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooOO0
    @NonNull
    public final String OooO00o() {
        return this.f19654OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.OooO.OooOO0) {
            return this.f19654OooO00o.equals(((CrashlyticsReport.OooO.OooOO0) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f19654OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return o0oOO.OooO0O0(new StringBuilder("User{identifier="), this.f19654OooO00o, "}");
    }
}
