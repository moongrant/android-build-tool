package io.opentelemetry.sdk.common;

import com.google.auto.value.AutoValue;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class InstrumentationLibraryInfo {
    static {
        new AutoValue_InstrumentationLibraryInfo("", null, null);
    }

    public static InstrumentationLibraryInfo OooO00o(String str, @Nullable String str2, @Nullable String str3) {
        Objects.requireNonNull(str, "name");
        return new AutoValue_InstrumentationLibraryInfo(str, str2, str3);
    }

    public abstract String OooO0O0();

    @Nullable
    public abstract String OooO0OO();

    @Nullable
    public abstract String OooO0Oo();
}
