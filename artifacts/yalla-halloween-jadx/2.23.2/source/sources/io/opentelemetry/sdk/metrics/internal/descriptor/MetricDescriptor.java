package io.opentelemetry.sdk.metrics.internal.descriptor;

import com.google.auto.value.AutoValue;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.view.View;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class MetricDescriptor {
    public static MetricDescriptor OooO00o(View view, InstrumentDescriptor instrumentDescriptor) {
        return new AutoValue_MetricDescriptor(view.OooO0Oo() == null ? instrumentDescriptor.OooO0OO() : view.OooO0Oo(), view.OooO0OO() == null ? instrumentDescriptor.OooO0O0() : view.OooO0OO(), instrumentDescriptor.OooO0o0());
    }

    public abstract String OooO0O0();

    public abstract String OooO0OO();

    public abstract String OooO0Oo();
}
