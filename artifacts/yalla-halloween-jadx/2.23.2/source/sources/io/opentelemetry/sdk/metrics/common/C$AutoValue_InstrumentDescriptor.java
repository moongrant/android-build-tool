package io.opentelemetry.sdk.metrics.common;

/* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.common.$AutoValue_InstrumentDescriptor, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
abstract class C$AutoValue_InstrumentDescriptor extends InstrumentDescriptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f32704OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f32705OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f32706OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InstrumentType f32707OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InstrumentValueType f32708OooO0o0;

    public C$AutoValue_InstrumentDescriptor(String str, String str2, String str3, InstrumentType instrumentType, InstrumentValueType instrumentValueType) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f32704OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f32705OooO0O0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f32706OooO0OO = str3;
        if (instrumentType == null) {
            throw new NullPointerException("Null type");
        }
        this.f32707OooO0Oo = instrumentType;
        if (instrumentValueType == null) {
            throw new NullPointerException("Null valueType");
        }
        this.f32708OooO0o0 = instrumentValueType;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final String OooO0O0() {
        return this.f32705OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final String OooO0OO() {
        return this.f32704OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final InstrumentType OooO0Oo() {
        return this.f32707OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final InstrumentValueType OooO0o() {
        return this.f32708OooO0o0;
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final String OooO0o0() {
        return this.f32706OooO0OO;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentDescriptor)) {
            return false;
        }
        InstrumentDescriptor instrumentDescriptor = (InstrumentDescriptor) obj;
        return this.f32704OooO00o.equals(instrumentDescriptor.OooO0OO()) && this.f32705OooO0O0.equals(instrumentDescriptor.OooO0O0()) && this.f32706OooO0OO.equals(instrumentDescriptor.OooO0o0()) && this.f32707OooO0Oo.equals(instrumentDescriptor.OooO0Oo()) && this.f32708OooO0o0.equals(instrumentDescriptor.OooO0o());
    }

    @Override // io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public int hashCode() {
        return ((((((((this.f32704OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f32705OooO0O0.hashCode()) * 1000003) ^ this.f32706OooO0OO.hashCode()) * 1000003) ^ this.f32707OooO0Oo.hashCode()) * 1000003) ^ this.f32708OooO0o0.hashCode();
    }

    public final String toString() {
        return "InstrumentDescriptor{name=" + this.f32704OooO00o + ", description=" + this.f32705OooO0O0 + ", unit=" + this.f32706OooO0OO + ", type=" + this.f32707OooO0Oo + ", valueType=" + this.f32708OooO0o0 + "}";
    }
}
