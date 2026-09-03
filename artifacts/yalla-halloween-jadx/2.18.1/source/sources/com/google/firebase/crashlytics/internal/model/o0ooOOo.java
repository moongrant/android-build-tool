package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo extends CrashlyticsReport.OooO.OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19085OooO00o;

    public o0ooOOo(String str) {
        this.f19085OooO00o = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooOO0
    @NonNull
    public final String OooO00o() {
        return this.f19085OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.OooO.OooOO0) {
            return this.f19085OooO00o.equals(((CrashlyticsReport.OooO.OooOO0) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f19085OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("User{identifier="), this.f19085OooO00o, "}");
    }
}
