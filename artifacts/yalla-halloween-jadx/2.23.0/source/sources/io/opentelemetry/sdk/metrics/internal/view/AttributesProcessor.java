package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public abstract class AttributesProcessor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AttributesProcessor f33399OooO00o;

    /* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor$2, reason: invalid class name */
    class AnonymousClass2 extends AttributesProcessor {
        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public final Attributes OooO00o(Attributes attributes, Context context) {
            io.opentelemetry.api.baggage.OooO00o.OooO00o(context);
            throw null;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public final boolean OooO0O0() {
            return true;
        }
    }

    @Immutable
    public static final class JoinedAttributesProcessor extends AttributesProcessor {
        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public final Attributes OooO00o(Attributes attributes, Context context) {
            throw null;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public final boolean OooO0O0() {
            return false;
        }
    }

    static {
        final OooO00o oooO00o = new OooO00o();
        f33399OooO00o = new AttributesProcessor() { // from class: io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
            public final Attributes OooO00o(Attributes attributes, Context context) {
                return (Attributes) oooO00o.apply(attributes);
            }

            @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
            public final boolean OooO0O0() {
                return false;
            }
        };
    }

    private AttributesProcessor() {
    }

    public /* synthetic */ AttributesProcessor(int i) {
        this();
    }

    public abstract Attributes OooO00o(Attributes attributes, Context context);

    public abstract boolean OooO0O0();
}
