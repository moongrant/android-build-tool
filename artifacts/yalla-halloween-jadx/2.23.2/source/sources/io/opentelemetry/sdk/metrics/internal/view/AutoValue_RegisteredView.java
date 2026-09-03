package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.sdk.metrics.view.InstrumentSelector;
import io.opentelemetry.sdk.metrics.view.View;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_RegisteredView extends RegisteredView {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InstrumentSelector f32867OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f32868OooO0O0;

    public AutoValue_RegisteredView(InstrumentSelector instrumentSelector, View view) {
        this.f32867OooO00o = instrumentSelector;
        this.f32868OooO0O0 = view;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.RegisteredView
    public final InstrumentSelector OooO00o() {
        return this.f32867OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.RegisteredView
    public final View OooO0O0() {
        return this.f32868OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisteredView)) {
            return false;
        }
        RegisteredView registeredView = (RegisteredView) obj;
        return this.f32867OooO00o.equals(registeredView.OooO00o()) && this.f32868OooO0O0.equals(registeredView.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f32867OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f32868OooO0O0.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f32867OooO00o + ", view=" + this.f32868OooO0O0 + "}";
    }
}
