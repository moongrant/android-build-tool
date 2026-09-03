package io.opentelemetry.exporter.otlp.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class MarshalerWithSize extends Marshaler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f33122OooO00o;

    public MarshalerWithSize(int i) {
        this.f33122OooO00o = i;
    }

    @Override // io.opentelemetry.exporter.otlp.internal.Marshaler
    public final int OooO00o() {
        return this.f33122OooO00o;
    }
}
