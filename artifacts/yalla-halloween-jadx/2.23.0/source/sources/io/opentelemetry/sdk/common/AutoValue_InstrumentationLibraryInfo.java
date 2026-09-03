package io.opentelemetry.sdk.common;

import javax.annotation.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_InstrumentationLibraryInfo extends InstrumentationLibraryInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f33189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f33190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f33191OooO0OO;

    public AutoValue_InstrumentationLibraryInfo(String str, @Nullable String str2, @Nullable String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f33189OooO00o = str;
        this.f33190OooO0O0 = str2;
        this.f33191OooO0OO = str3;
    }

    @Override // io.opentelemetry.sdk.common.InstrumentationLibraryInfo
    public final String OooO0O0() {
        return this.f33189OooO00o;
    }

    @Override // io.opentelemetry.sdk.common.InstrumentationLibraryInfo
    @Nullable
    public final String OooO0OO() {
        return this.f33191OooO0OO;
    }

    @Override // io.opentelemetry.sdk.common.InstrumentationLibraryInfo
    @Nullable
    public final String OooO0Oo() {
        return this.f33190OooO0O0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentationLibraryInfo)) {
            return false;
        }
        InstrumentationLibraryInfo instrumentationLibraryInfo = (InstrumentationLibraryInfo) obj;
        if (this.f33189OooO00o.equals(instrumentationLibraryInfo.OooO0O0()) && ((str = this.f33190OooO0O0) != null ? str.equals(instrumentationLibraryInfo.OooO0Oo()) : instrumentationLibraryInfo.OooO0Oo() == null)) {
            String str2 = this.f33191OooO0OO;
            if (str2 == null) {
                if (instrumentationLibraryInfo.OooO0OO() == null) {
                    return true;
                }
            } else if (str2.equals(instrumentationLibraryInfo.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f33189OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f33190OooO0O0;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f33191OooO0OO;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentationLibraryInfo{name=");
        sb.append(this.f33189OooO00o);
        sb.append(", version=");
        sb.append(this.f33190OooO0O0);
        sb.append(", schemaUrl=");
        return o0O00o0.OooO0O0(sb, this.f33191OooO0OO, "}");
    }
}
