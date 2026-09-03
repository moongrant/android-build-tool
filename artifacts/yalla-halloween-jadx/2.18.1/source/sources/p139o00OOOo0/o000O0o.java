package p139o00OOOo0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p251o00ooO.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000O0o<D> implements o000Oo0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public D f31787Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public String f31788Oooo0oO;

    public o000O0o(D d, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f31787Oooo0o = d;
        this.f31788Oooo0oO = content;
    }

    @Override // p251o00ooO.o000Oo0
    @NotNull
    public final String getShowText() {
        return this.f31788Oooo0oO;
    }
}
