package io.opentelemetry.api.trace;

import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public interface TracerProvider {
    Tracer get();
}
