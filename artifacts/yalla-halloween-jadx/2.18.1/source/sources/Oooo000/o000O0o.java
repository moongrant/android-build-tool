package Oooo000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000O0o extends o000O000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O00OO f878OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(@NotNull o00O00OO data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f878OooO0OO = data;
    }

    @Override // Oooo000.o000O000
    @NotNull
    public final o00O00OO OooO00o() {
        return this.f878OooO0OO;
    }
}
