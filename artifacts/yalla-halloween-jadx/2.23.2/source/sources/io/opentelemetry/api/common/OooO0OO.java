package io.opentelemetry.api.common;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0OO implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparator<AttributeKey<?>> comparator = ArrayBackedAttributes.f32494OooO0o0;
        return ((AttributeKey) obj).getKey().compareTo(((AttributeKey) obj2).getKey());
    }
}
