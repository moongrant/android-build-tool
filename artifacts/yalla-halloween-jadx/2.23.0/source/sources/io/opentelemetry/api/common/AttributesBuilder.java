package io.opentelemetry.api.common;

/* JADX INFO: loaded from: classes5.dex */
public interface AttributesBuilder {
    AttributesBuilder OooO00o(boolean z);

    AttributesBuilder OooO0O0(Attributes attributes);

    <T> AttributesBuilder OooO0OO(AttributeKey<T> attributeKey, T t);

    Attributes build();
}
