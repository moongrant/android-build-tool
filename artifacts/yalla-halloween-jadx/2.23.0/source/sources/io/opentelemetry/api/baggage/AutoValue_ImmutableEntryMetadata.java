package io.opentelemetry.api.baggage;

import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ImmutableEntryMetadata extends ImmutableEntryMetadata {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f33020OooO00o = "";

    @Override // io.opentelemetry.api.baggage.ImmutableEntryMetadata
    public final String OooO00o() {
        return this.f33020OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEntryMetadata) {
            return this.f33020OooO00o.equals(((ImmutableEntryMetadata) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f33020OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return o0O00o0.OooO0O0(new StringBuilder("ImmutableEntryMetadata{value="), this.f33020OooO00o, "}");
    }
}
