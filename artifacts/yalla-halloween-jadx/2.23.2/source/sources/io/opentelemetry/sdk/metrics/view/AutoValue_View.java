package io.opentelemetry.sdk.metrics.view;

import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_View extends View {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f32893OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f32894OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Aggregation f32895OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AttributesProcessor f32896OooO0Oo;

    public AutoValue_View(Aggregation aggregation, AttributesProcessor attributesProcessor) {
        if (aggregation == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.f32895OooO0OO = aggregation;
        if (attributesProcessor == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.f32896OooO0Oo = attributesProcessor;
    }

    @Override // io.opentelemetry.sdk.metrics.view.View
    public final Aggregation OooO00o() {
        return this.f32895OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.view.View
    public final AttributesProcessor OooO0O0() {
        return this.f32896OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.view.View
    @Nullable
    public final String OooO0OO() {
        return this.f32894OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.view.View
    @Nullable
    public final String OooO0Oo() {
        return this.f32893OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof View)) {
            return false;
        }
        View view = (View) obj;
        String str = this.f32893OooO00o;
        if (str != null ? str.equals(view.OooO0Oo()) : view.OooO0Oo() == null) {
            String str2 = this.f32894OooO0O0;
            if (str2 != null ? str2.equals(view.OooO0OO()) : view.OooO0OO() == null) {
                if (this.f32895OooO0OO.equals(view.OooO00o()) && this.f32896OooO0Oo.equals(view.OooO0O0())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f32893OooO00o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f32894OooO0O0;
        return (((((str2 != null ? str2.hashCode() : 0) ^ iHashCode) * 1000003) ^ this.f32895OooO0OO.hashCode()) * 1000003) ^ this.f32896OooO0Oo.hashCode();
    }

    public final String toString() {
        return "View{name=" + this.f32893OooO00o + ", description=" + this.f32894OooO0O0 + ", aggregation=" + this.f32895OooO0OO + ", attributesProcessor=" + this.f32896OooO0Oo + "}";
    }
}
