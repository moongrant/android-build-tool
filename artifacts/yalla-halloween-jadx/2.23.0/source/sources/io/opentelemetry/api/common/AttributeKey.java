package io.opentelemetry.api.common;

import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public interface AttributeKey<T> {
    String getKey();

    AttributeType getType();
}
