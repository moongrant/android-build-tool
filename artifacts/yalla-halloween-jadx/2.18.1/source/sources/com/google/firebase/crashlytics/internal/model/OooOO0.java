package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends CrashlyticsReport.OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f18949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f18950OooO0O0;

    public static final class OooO00o extends CrashlyticsReport.OooO0o.OooO00o.AbstractC0149OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f18951OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public byte[] f18952OooO0O0;

        public final CrashlyticsReport.OooO0o.OooO00o OooO00o() {
            String strOooO0Oo = this.f18951OooO00o == null ? " filename" : "";
            if (this.f18952OooO0O0 == null) {
                strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " contents");
            }
            if (strOooO0Oo.isEmpty()) {
                return new OooOO0(this.f18951OooO00o, this.f18952OooO0O0);
            }
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }

        public final CrashlyticsReport.OooO0o.OooO00o.AbstractC0149OooO00o OooO0O0(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f18952OooO0O0 = bArr;
            return this;
        }

        public final CrashlyticsReport.OooO0o.OooO00o.AbstractC0149OooO00o OooO0OO(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f18951OooO00o = str;
            return this;
        }
    }

    public OooOO0(String str, byte[] bArr) {
        this.f18949OooO00o = str;
        this.f18950OooO0O0 = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o.OooO00o
    @NonNull
    public final byte[] OooO00o() {
        return this.f18950OooO0O0;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.OooO0o.OooO00o
    @NonNull
    public final String OooO0O0() {
        return this.f18949OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.OooO0o.OooO00o)) {
            return false;
        }
        CrashlyticsReport.OooO0o.OooO00o oooO00o = (CrashlyticsReport.OooO0o.OooO00o) obj;
        if (this.f18949OooO00o.equals(oooO00o.OooO0O0())) {
            if (Arrays.equals(this.f18950OooO0O0, oooO00o instanceof OooOO0 ? ((OooOO0) oooO00o).f18950OooO0O0 : oooO00o.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18949OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18950OooO0O0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("File{filename=");
        sbOooO0o0.append(this.f18949OooO00o);
        sbOooO0o0.append(", contents=");
        sbOooO0o0.append(Arrays.toString(this.f18950OooO0O0));
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
