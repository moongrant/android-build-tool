package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.compat.BiConsumer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class AttributesMap extends HashMap<AttributeKey<?>, Object> implements Attributes {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f33451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33452OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f33453OooO0o0;

    public AttributesMap(long j, int i) {
        this.f33451OooO0Oo = j;
        this.f33453OooO0o0 = i;
    }

    public final <T> void OooO0O0(AttributeKey<T> attributeKey, T t) {
        this.f33452OooO0o++;
        if (size() < this.f33451OooO0Oo || containsKey(attributeKey)) {
            put(attributeKey, AttributeUtil.OooO00o(this.f33453OooO0o0, t));
        }
    }

    @Override // io.opentelemetry.api.common.Attributes
    public final void OooO0Oo(BiConsumer<? super AttributeKey<?>, ? super Object> biConsumer) {
        for (AttributeKey<?> attributeKey : keySet()) {
            biConsumer.accept(attributeKey, get(attributeKey));
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f33451OooO0Oo);
        sb.append(", totalAddedValues=");
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f33452OooO0o, '}');
    }
}
