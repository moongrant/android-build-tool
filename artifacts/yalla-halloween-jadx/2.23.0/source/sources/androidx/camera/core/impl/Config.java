package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface Config {

    @AutoValue
    public static abstract class OooO00o<T> {
        @NonNull
        public static OooO0o OooO00o(@NonNull Class cls, @NonNull String str) {
            return new OooO0o(str, cls, null);
        }

        @NonNull
        public abstract String OooO0O0();

        @Nullable
        public abstract Object OooO0OO();

        @NonNull
        public abstract Class<T> OooO0Oo();
    }

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    @Nullable
    <ValueT> ValueT OooO0O0(@NonNull OooO00o<ValueT> oooO00o);

    boolean OooO0o0(@NonNull OooO00o<?> oooO00o);

    @Nullable
    <ValueT> ValueT OooO0oO(@NonNull OooO00o<ValueT> oooO00o, @NonNull OptionPriority optionPriority);

    @NonNull
    Set<OooO00o<?>> OooO0oo();

    void OooOO0o(@NonNull p026Oooo0o.OooOOOO oooOOOO);

    @NonNull
    Set<OptionPriority> OooOOO0(@NonNull OooO00o<?> oooO00o);

    @Nullable
    <ValueT> ValueT OooOoO(@NonNull OooO00o<ValueT> oooO00o, @Nullable ValueT valuet);

    @NonNull
    OptionPriority OooOoo(@NonNull OooO00o<?> oooO00o);
}
