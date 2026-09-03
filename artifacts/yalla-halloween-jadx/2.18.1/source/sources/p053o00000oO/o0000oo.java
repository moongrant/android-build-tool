package p053o00000oO;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o0000oo extends o000O0o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final String f27136Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final String f27137Oooo0oo;

    public o0000oo(@NotNull String name, @NotNull String fontFamilyName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        this.f27137Oooo0oo = name;
        this.f27136Oooo = fontFamilyName;
    }

    @NotNull
    public final String toString() {
        return this.f27136Oooo;
    }
}
