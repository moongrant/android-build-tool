package io.opentelemetry.api.baggage;

import io.opentelemetry.context.ContextKey;
import io.opentelemetry.context.OooO0OO;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
class BaggageContextKey {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ContextKey<Baggage> f32486OooO00o = OooO0OO.OooO00o("opentelemetry-baggage-key");

    private BaggageContextKey() {
    }
}
