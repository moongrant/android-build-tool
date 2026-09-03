package io.opentelemetry.api.common;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO {
    public static AttributesBuilder OooO00o() {
        return new ArrayBackedAttributesBuilder();
    }

    public static Attributes OooO0O0() {
        return ArrayBackedAttributes.f32493OooO0o;
    }

    public static <T> Attributes OooO0OO(AttributeKey<T> attributeKey, T t) {
        return (attributeKey == null || attributeKey.getKey().isEmpty() || t == null) ? ArrayBackedAttributes.f32493OooO0o : new ArrayBackedAttributes(new Object[]{attributeKey, t});
    }
}
