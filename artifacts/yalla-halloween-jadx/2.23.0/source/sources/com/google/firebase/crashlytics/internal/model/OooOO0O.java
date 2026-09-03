package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends CrashlyticsReport.OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f20027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f20028OooO0O0;

    public OooOO0O(String str, byte[] bArr) {
        this.f20027OooO00o = str;
        this.f20028OooO0O0 = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o.OooO00o
    @NonNull
    public final byte[] OooO00o() {
        return this.f20028OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o.OooO00o
    @NonNull
    public final String OooO0O0() {
        return this.f20027OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO0o.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO0o.OooO00o) obj;
        if (this.f20027OooO00o.equals(oooO00o.OooO0O0())) {
            if (Arrays.equals(this.f20028OooO0O0, oooO00o instanceof OooOO0O ? ((OooOO0O) oooO00o).f20028OooO0O0 : oooO00o.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20027OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20028OooO0O0);
    }

    public final String toString() {
        return "File{filename=" + this.f20027OooO00o + ", contents=" + Arrays.toString(this.f20028OooO0O0) + "}";
    }
}
