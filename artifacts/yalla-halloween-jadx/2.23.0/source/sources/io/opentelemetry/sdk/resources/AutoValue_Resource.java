package io.opentelemetry.sdk.resources;

import io.opentelemetry.api.common.Attributes;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_Resource extends Resource {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f33436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Attributes f33437OooO0o0;

    public AutoValue_Resource(Attributes attributes, @Nullable String str) {
        this.f33436OooO0Oo = str;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f33437OooO0o0 = attributes;
    }

    @Override // io.opentelemetry.sdk.resources.Resource
    public final Attributes OooO0O0() {
        return this.f33437OooO0o0;
    }

    @Override // io.opentelemetry.sdk.resources.Resource
    @Nullable
    public final String OooO0OO() {
        return this.f33436OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        String str = this.f33436OooO0Oo;
        if (str != null ? str.equals(resource.OooO0OO()) : resource.OooO0OO() == null) {
            if (this.f33437OooO0o0.equals(resource.OooO0O0())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f33436OooO0Oo;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f33437OooO0o0.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f33436OooO0Oo + ", attributes=" + this.f33437OooO0o0 + "}";
    }
}
