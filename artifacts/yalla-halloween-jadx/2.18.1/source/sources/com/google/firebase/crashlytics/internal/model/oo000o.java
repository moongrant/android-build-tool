package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19086OooO00o;

    public oo000o(String str) {
        this.f19086OooO00o = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o
    @NonNull
    public final String OooO00o() {
        return this.f19086OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o) {
            return this.f19086OooO00o.equals(((CrashlyticsReport.OooO.OooO0o.AbstractC0147OooO0o) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f19086OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("Log{content="), this.f19086OooO00o, "}");
    }
}
