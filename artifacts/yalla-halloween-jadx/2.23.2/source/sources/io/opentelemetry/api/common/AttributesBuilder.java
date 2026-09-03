package io.opentelemetry.api.common;

/* JADX INFO: loaded from: classes5.dex */
public interface AttributesBuilder {
    AttributesBuilder OooO00o(long j, String str);

    AttributesBuilder OooO0O0(boolean z);

    AttributesBuilder OooO0OO(Attributes attributes);

    <T> AttributesBuilder OooO0Oo(AttributeKey<T> attributeKey, T t);

    Attributes build();
}
