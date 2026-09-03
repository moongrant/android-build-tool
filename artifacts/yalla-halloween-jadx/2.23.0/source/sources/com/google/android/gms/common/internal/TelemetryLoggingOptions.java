package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    @NonNull
    public static final TelemetryLoggingOptions zaa = builder().build();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f15119OooO0Oo;

    @KeepForSdk
    public static class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f15120OooO00o;

        public Builder() {
        }

        public /* synthetic */ Builder(int i) {
        }

        @NonNull
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.f15120OooO00o);
        }

        @NonNull
        @KeepForSdk
        public Builder setApi(@Nullable String str) {
            this.f15120OooO00o = str;
            return this;
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str) {
        this.f15119OooO0Oo = str;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        return new Builder(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.equal(this.f15119OooO0Oo, ((TelemetryLoggingOptions) obj).f15119OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15119OooO0Oo);
    }

    @NonNull
    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.f15119OooO0Oo;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
