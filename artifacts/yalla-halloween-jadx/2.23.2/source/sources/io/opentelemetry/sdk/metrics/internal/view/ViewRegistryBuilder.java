package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.sdk.metrics.view.InstrumentSelector;
import io.opentelemetry.sdk.metrics.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class ViewRegistryBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f32872OooO00o = new ArrayList();

    public final void OooO00o(InstrumentSelector instrumentSelector, View view) {
        this.f32872OooO00o.add(new AutoValue_RegisteredView(instrumentSelector, view));
    }
}
