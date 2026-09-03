package io.opentelemetry.sdk.metrics.common;

/* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.common.$AutoValue_InstrumentDescriptor, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
abstract class C$AutoValue_InstrumentDescriptor extends InstrumentDescriptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f33238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f33239OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f33240OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InstrumentType f33241OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InstrumentValueType f33242OooO0o0;

    public C$AutoValue_InstrumentDescriptor(String str, String str2, String str3, InstrumentType instrumentType, InstrumentValueType instrumentValueType) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f33238OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f33239OooO0O0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f33240OooO0OO = str3;
        if (instrumentType == null) {
            throw new NullPointerException("Null type");
        }
        this.f33241OooO0Oo = instrumentType;
        if (instrumentValueType == null) {
            throw new NullPointerException("Null valueType");
        }
        this.f33242OooO0o0 = instrumentValueType;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final String OooO0O0() {
        return this.f33239OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final String OooO0OO() {
        return this.f33238OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final InstrumentType OooO0Oo() {
        return this.f33241OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final InstrumentValueType OooO0o() {
        return this.f33242OooO0o0;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final String OooO0o0() {
        return this.f33240OooO0OO;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentDescriptor)) {
            return false;
        }
        InstrumentDescriptor instrumentDescriptor = (InstrumentDescriptor) obj;
        return this.f33238OooO00o.equals(instrumentDescriptor.OooO0OO()) && this.f33239OooO0O0.equals(instrumentDescriptor.OooO0O0()) && this.f33240OooO0OO.equals(instrumentDescriptor.OooO0o0()) && this.f33241OooO0Oo.equals(instrumentDescriptor.OooO0Oo()) && this.f33242OooO0o0.equals(instrumentDescriptor.OooO0o());
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public int hashCode() {
        return ((((((((this.f33238OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f33239OooO0O0.hashCode()) * 1000003) ^ this.f33240OooO0OO.hashCode()) * 1000003) ^ this.f33241OooO0Oo.hashCode()) * 1000003) ^ this.f33242OooO0o0.hashCode();
    }

    public final String toString() {
        return "InstrumentDescriptor{name=" + this.f33238OooO00o + ", description=" + this.f33239OooO0O0 + ", unit=" + this.f33240OooO0OO + ", type=" + this.f33241OooO0Oo + ", valueType=" + this.f33242OooO0o0 + "}";
    }
}
