package io.opentelemetry.api.common;

import io.opentelemetry.compat.BiConsumer;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public interface Attributes {
    void OooO0Oo(BiConsumer<? super AttributeKey<?>, ? super Object> biConsumer);

    boolean isEmpty();

    int size();
}
