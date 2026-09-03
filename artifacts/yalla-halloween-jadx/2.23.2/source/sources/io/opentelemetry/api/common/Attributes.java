package io.opentelemetry.api.common;

import io.opentelemetry.compat.BiConsumer;
import java.util.Map;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public interface Attributes {
    Map<AttributeKey<?>, Object> OooO0Oo();

    void OooO0o(BiConsumer<? super AttributeKey<?>, ? super Object> biConsumer);

    boolean isEmpty();

    int size();
}
