package io.opentelemetry.api.internal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.AttributeType;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class InternalAttributeKeyImpl<T> implements AttributeKey<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AttributeType f33040OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f33041OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f33042OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f33043OooO0Oo;

    public InternalAttributeKeyImpl(AttributeType attributeType, String str) {
        if (attributeType == null) {
            throw new NullPointerException("Null type");
        }
        this.f33040OooO00o = attributeType;
        this.f33041OooO0O0 = str;
        this.f33042OooO0OO = ((attributeType.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternalAttributeKeyImpl)) {
            return false;
        }
        InternalAttributeKeyImpl internalAttributeKeyImpl = (InternalAttributeKeyImpl) obj;
        return this.f33040OooO00o.equals(internalAttributeKeyImpl.f33040OooO00o) && this.f33041OooO0O0.equals(internalAttributeKeyImpl.f33041OooO0O0);
    }

    @Override // io.opentelemetry.api.common.AttributeKey
    public final String getKey() {
        return this.f33041OooO0O0;
    }

    @Override // io.opentelemetry.api.common.AttributeKey
    public final AttributeType getType() {
        return this.f33040OooO00o;
    }

    public final int hashCode() {
        return this.f33042OooO0OO;
    }

    public final String toString() {
        return this.f33041OooO0O0;
    }
}
