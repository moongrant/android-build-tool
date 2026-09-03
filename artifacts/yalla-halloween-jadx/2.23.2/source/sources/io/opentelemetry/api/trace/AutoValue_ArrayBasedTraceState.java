package io.opentelemetry.api.trace;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ArrayBasedTraceState extends ArrayBasedTraceState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f32526OooO00o;

    public AutoValue_ArrayBasedTraceState(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f32526OooO00o = list;
    }

    @Override // io.opentelemetry.api.trace.ArrayBasedTraceState
    public final List<String> OooO0O0() {
        return this.f32526OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ArrayBasedTraceState) {
            return this.f32526OooO00o.equals(((ArrayBasedTraceState) obj).OooO0O0());
        }
        return false;
    }

    public final int hashCode() {
        return this.f32526OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ArrayBasedTraceState{entries=" + this.f32526OooO00o + "}";
    }
}
