package io.opentelemetry.exporter.otlp.internal;

import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ProtoFieldInfo extends ProtoFieldInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f32580OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f32581OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f32582OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f32583OooO0Oo;

    public AutoValue_ProtoFieldInfo(int i, int i2, int i3, String str) {
        this.f32580OooO00o = i;
        this.f32581OooO0O0 = i2;
        this.f32582OooO0OO = i3;
        this.f32583OooO0Oo = str;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final int OooO0O0() {
        return this.f32580OooO00o;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final String OooO0OO() {
        return this.f32583OooO0Oo;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final int OooO0Oo() {
        return this.f32581OooO0O0;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo
    public final int OooO0o0() {
        return this.f32582OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoFieldInfo)) {
            return false;
        }
        ProtoFieldInfo protoFieldInfo = (ProtoFieldInfo) obj;
        return this.f32580OooO00o == protoFieldInfo.OooO0O0() && this.f32581OooO0O0 == protoFieldInfo.OooO0Oo() && this.f32582OooO0OO == protoFieldInfo.OooO0o0() && this.f32583OooO0Oo.equals(protoFieldInfo.OooO0OO());
    }

    public final int hashCode() {
        return ((((((this.f32580OooO00o ^ 1000003) * 1000003) ^ this.f32581OooO0O0) * 1000003) ^ this.f32582OooO0OO) * 1000003) ^ this.f32583OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f32580OooO00o);
        sb.append(", tag=");
        sb.append(this.f32581OooO0O0);
        sb.append(", tagSize=");
        sb.append(this.f32582OooO0OO);
        sb.append(", jsonName=");
        return o0oOO.OooO0O0(sb, this.f32583OooO0Oo, "}");
    }
}
