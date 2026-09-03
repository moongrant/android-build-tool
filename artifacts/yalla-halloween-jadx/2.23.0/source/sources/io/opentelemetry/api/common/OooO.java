package io.opentelemetry.api.common;

import io.opentelemetry.api.internal.InternalAttributeKeyImpl;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO {
    public static AttributesBuilder OooO00o() {
        return new ArrayBackedAttributesBuilder();
    }

    public static Attributes OooO0O0() {
        return ArrayBackedAttributes.f33028OooO0o;
    }

    public static <T> Attributes OooO0OO(AttributeKey<T> attributeKey, T t) {
        return (attributeKey == null || attributeKey.getKey().isEmpty() || t == null) ? ArrayBackedAttributes.f33028OooO0o : new ArrayBackedAttributes(new Object[]{attributeKey, t});
    }

    public static Attributes OooO0Oo(InternalAttributeKeyImpl internalAttributeKeyImpl, String str, InternalAttributeKeyImpl internalAttributeKeyImpl2, Boolean bool) {
        if (internalAttributeKeyImpl != null) {
            String str2 = internalAttributeKeyImpl.f33041OooO0O0;
            if (!str2.isEmpty() && str != null) {
                if (internalAttributeKeyImpl2 != null) {
                    String str3 = internalAttributeKeyImpl2.f33041OooO0O0;
                    if (!str3.isEmpty() && bool != null) {
                        if (str2.equals(str3)) {
                            return OooO0OO(internalAttributeKeyImpl2, bool);
                        }
                        return str2.compareTo(str3) > 0 ? new ArrayBackedAttributes(new Object[]{internalAttributeKeyImpl2, bool, internalAttributeKeyImpl, str}) : new ArrayBackedAttributes(new Object[]{internalAttributeKeyImpl, str, internalAttributeKeyImpl2, bool});
                    }
                }
                return OooO0OO(internalAttributeKeyImpl, str);
            }
        }
        return OooO0OO(internalAttributeKeyImpl2, bool);
    }
}
