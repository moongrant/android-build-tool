package io.opentelemetry.api.baggage.propagation;

import io.opentelemetry.context.propagation.TextMapPropagator;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class W3CBaggagePropagator implements TextMapPropagator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<String> f32492OooO00o = Collections.singletonList("baggage");

    static {
        new W3CBaggagePropagator();
    }

    private W3CBaggagePropagator() {
    }
}
