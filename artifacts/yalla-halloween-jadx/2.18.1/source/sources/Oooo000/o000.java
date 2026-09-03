package Oooo000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000 extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O00OO f830OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(@NotNull o00O00OO data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f830OooO0OO = data;
    }

    @Override // Oooo000.o0000OO0
    @NotNull
    public final o00O00OO OooO00o() {
        return this.f830OooO0OO;
    }
}
