package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f19020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f19021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19022OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19023OooO0Oo;

    public static final class OooO00o extends CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o.AbstractC0139OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f19024OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f19025OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f19026OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f19027OooO0Oo;

        public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o OooO00o() {
            String strOooO0Oo = this.f19024OooO00o == null ? " baseAddress" : "";
            if (this.f19025OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " size");
            }
            if (this.f19026OooO0OO == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " name");
            }
            if (strOooO0Oo.isEmpty()) {
                return new Oooo0(this.f19024OooO00o.longValue(), this.f19025OooO0O0.longValue(), this.f19026OooO0OO, this.f19027OooO0Oo);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
    }

    public Oooo0(long j, long j2, String str, String str2) {
        this.f19020OooO00o = j;
        this.f19021OooO0O0 = j2;
        this.f19022OooO0OO = str;
        this.f19023OooO0Oo = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o
    @NonNull
    public final long OooO00o() {
        return this.f19020OooO00o;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o
    @NonNull
    public final String OooO0O0() {
        return this.f19022OooO0OO;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o
    public final long OooO0OO() {
        return this.f19021OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o
    @Nullable
    @Encodable.Ignore
    public final String OooO0Oo() {
        return this.f19023OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o abstractC0138OooO00o = (CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o) obj;
        if (this.f19020OooO00o == abstractC0138OooO00o.OooO00o() && this.f19021OooO0O0 == abstractC0138OooO00o.OooO0OO() && this.f19022OooO0OO.equals(abstractC0138OooO00o.OooO0O0())) {
            String str = this.f19023OooO0Oo;
            if (str == null) {
                if (abstractC0138OooO00o.OooO0Oo() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0138OooO00o.OooO0Oo())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19020OooO00o;
        long j2 = this.f19021OooO0O0;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19022OooO0OO.hashCode()) * 1000003;
        String str = this.f19023OooO0Oo;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BinaryImage{baseAddress=");
        sbOooO0o0.append(this.f19020OooO00o);
        sbOooO0o0.append(", size=");
        sbOooO0o0.append(this.f19021OooO0O0);
        sbOooO0o0.append(", name=");
        sbOooO0o0.append(this.f19022OooO0OO);
        sbOooO0o0.append(", uuid=");
        return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f19023OooO0Oo, "}");
    }
}
