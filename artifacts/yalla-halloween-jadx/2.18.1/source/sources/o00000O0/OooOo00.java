package o00000O0;

import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class OooO00o<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f26937Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.LinkedHashMap, java.util.Map<o00000O0.o0Oo0oo<?>, java.lang.Object>] */
    @Nullable
    public static final <T> T OooO00o(@NotNull OooOOOO oooOOOO, @NotNull o0Oo0oo<T> key) {
        Intrinsics.checkNotNullParameter(oooOOOO, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        OooO00o defaultValue = OooO00o.f26937Oooo0o;
        Objects.requireNonNull(oooOOOO);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) oooOOOO.f26934Oooo0o.get(key);
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(defaultValue);
        return null;
    }
}
