package io.opentelemetry.api.common;

import io.opentelemetry.compat.BiConsumer;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
class ArrayBackedAttributesBuilder implements AttributesBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f32495OooO00o = new ArrayList();

    @Override // io.opentelemetry.api.common.AttributesBuilder
    public final AttributesBuilder OooO00o(long j, String str) {
        OooO0Oo(OooO0o.OooO0O0(str), Long.valueOf(j));
        return this;
    }

    @Override // io.opentelemetry.api.common.AttributesBuilder
    public final AttributesBuilder OooO0O0(boolean z) {
        OooO0Oo(OooO0o.OooO00o("first_launch"), Boolean.valueOf(z));
        return this;
    }

    @Override // io.opentelemetry.api.common.AttributesBuilder
    public final AttributesBuilder OooO0OO(Attributes attributes) {
        if (attributes == null) {
            return this;
        }
        attributes.OooO0o(new BiConsumer<AttributeKey<?>, Object>() { // from class: io.opentelemetry.api.common.ArrayBackedAttributesBuilder.1
            @Override // io.opentelemetry.compat.BiConsumer
            public final void accept(AttributeKey<?> attributeKey, Object obj) {
                ArrayBackedAttributesBuilder.this.OooO0Oo(attributeKey, obj);
            }
        });
        return this;
    }

    @Override // io.opentelemetry.api.common.AttributesBuilder
    public final <T> AttributesBuilder OooO0Oo(AttributeKey<T> attributeKey, T t) {
        if (attributeKey != null && !attributeKey.getKey().isEmpty() && t != null) {
            ArrayList arrayList = this.f32495OooO00o;
            arrayList.add(attributeKey);
            arrayList.add(t);
        }
        return this;
    }

    @Override // io.opentelemetry.api.common.AttributesBuilder
    public final Attributes build() {
        ArrayList arrayList = this.f32495OooO00o;
        if (arrayList.size() == 2) {
            return new ArrayBackedAttributes(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator<AttributeKey<?>> comparator = ArrayBackedAttributes.f32494OooO0o0;
        for (int i = 0; i < array.length; i += 2) {
            AttributeKey attributeKey = (AttributeKey) array[i];
            if (attributeKey != null && attributeKey.getKey().isEmpty()) {
                array[i] = null;
            }
        }
        return new ArrayBackedAttributes(ArrayBackedAttributes.f32494OooO0o0, array);
    }
}
