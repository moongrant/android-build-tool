package io.opentelemetry.exporter.otlp.internal;

import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ProtoFieldInfo extends ProtoFieldInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f33113OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f33114OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f33115OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f33116OooO0Oo;

    public AutoValue_ProtoFieldInfo(int i, int i2, int i3, String str) {
        this.f33113OooO00o = i;
        this.f33114OooO0O0 = i2;
        this.f33115OooO0OO = i3;
        this.f33116OooO0Oo = str;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final int OooO0O0() {
        return this.f33113OooO00o;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final String OooO0OO() {
        return this.f33116OooO0Oo;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final int OooO0Oo() {
        return this.f33114OooO0O0;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final int OooO0o0() {
        return this.f33115OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoFieldInfo)) {
            return false;
        }
        ProtoFieldInfo protoFieldInfo = (ProtoFieldInfo) obj;
        return this.f33113OooO00o == protoFieldInfo.OooO0O0() && this.f33114OooO0O0 == protoFieldInfo.OooO0Oo() && this.f33115OooO0OO == protoFieldInfo.OooO0o0() && this.f33116OooO0Oo.equals(protoFieldInfo.OooO0OO());
    }

    public final int hashCode() {
        return ((((((this.f33113OooO00o ^ 1000003) * 1000003) ^ this.f33114OooO0O0) * 1000003) ^ this.f33115OooO0OO) * 1000003) ^ this.f33116OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f33113OooO00o);
        sb.append(", tag=");
        sb.append(this.f33114OooO0O0);
        sb.append(", tagSize=");
        sb.append(this.f33115OooO0OO);
        sb.append(", jsonName=");
        return o0O00o0.OooO0O0(sb, this.f33116OooO0Oo, "}");
    }
}
