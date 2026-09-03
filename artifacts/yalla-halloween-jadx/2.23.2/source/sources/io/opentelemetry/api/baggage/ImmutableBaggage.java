package io.opentelemetry.api.baggage;

import io.opentelemetry.api.internal.ImmutableKeyValuePairs;
import io.opentelemetry.compat.ComparatorsCompat;
import io.opentelemetry.context.Context;
import java.util.ArrayList;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class ImmutableBaggage extends ImmutableKeyValuePairs<String, BaggageEntry> implements Baggage {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Baggage f32487OooO0o0 = new ImmutableBaggage(new Builder().f32488OooO00o.toArray());

    public static class Builder implements BaggageBuilder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f32488OooO00o = new ArrayList();
    }

    public ImmutableBaggage(Object[] objArr) {
        super(ComparatorsCompat.NaturalOrderComparator.INSTANCE, objArr);
    }

    @Override // io.opentelemetry.context.ImplicitContextKeyed
    public final Context OooO0oO(Context context) {
        return context.OooO0Oo(BaggageContextKey.f32486OooO00o, this);
    }
}
