package io.opentelemetry.sdk.trace.data;

import io.opentelemetry.api.common.Attributes;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ImmutableEventData extends ImmutableEventData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f33009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Attributes f33010OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f33011OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f33012OooO0Oo;

    public AutoValue_ImmutableEventData(int i, long j, Attributes attributes, String str) {
        this.f33009OooO00o = str;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f33010OooO0O0 = attributes;
        this.f33011OooO0OO = j;
        this.f33012OooO0Oo = i;
    }

    @Override // io.opentelemetry.sdk.trace.data.EventData
    public final Attributes OooO00o() {
        return this.f33010OooO0O0;
    }

    @Override // io.opentelemetry.sdk.trace.data.EventData
    public final long OooO0O0() {
        return this.f33011OooO0OO;
    }

    @Override // io.opentelemetry.sdk.trace.data.EventData
    public final int OooO0OO() {
        return this.f33012OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableEventData)) {
            return false;
        }
        ImmutableEventData immutableEventData = (ImmutableEventData) obj;
        if (this.f33009OooO00o.equals(((AutoValue_ImmutableEventData) immutableEventData).f33009OooO00o)) {
            AutoValue_ImmutableEventData autoValue_ImmutableEventData = (AutoValue_ImmutableEventData) immutableEventData;
            if (this.f33010OooO0O0.equals(autoValue_ImmutableEventData.f33010OooO0O0) && this.f33011OooO0OO == autoValue_ImmutableEventData.f33011OooO0OO && this.f33012OooO0Oo == autoValue_ImmutableEventData.f33012OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opentelemetry.sdk.trace.data.EventData
    public final String getName() {
        return this.f33009OooO00o;
    }

    public final int hashCode() {
        int iHashCode = (((this.f33009OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f33010OooO0O0.hashCode()) * 1000003;
        long j = this.f33011OooO0OO;
        return ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f33012OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEventData{name=");
        sb.append(this.f33009OooO00o);
        sb.append(", attributes=");
        sb.append(this.f33010OooO0O0);
        sb.append(", epochNanos=");
        sb.append(this.f33011OooO0OO);
        sb.append(", totalAttributeCount=");
        return OooOO0.OooO00o(sb, this.f33012OooO0Oo, "}");
    }
}
