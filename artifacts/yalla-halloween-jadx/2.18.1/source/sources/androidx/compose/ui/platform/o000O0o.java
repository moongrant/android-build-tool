package androidx.compose.ui.platform;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
public final class o000O0o implements o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final p054o00000oo.o00OO000 f6440OooO00o;

    public o000O0o(@NotNull p054o00000oo.o00OO000 textInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        this.f6440OooO00o = textInputService;
    }

    @Override // androidx.compose.ui.platform.o00OO0O0
    public final void OooO00o() {
        p054o00000oo.o00OO000 o00oo001 = this.f6440OooO00o;
        if (o00oo001.f27199OooO0O0.get() != null) {
            o00oo001.f27198OooO00o.OooO00o();
        }
    }

    @Override // androidx.compose.ui.platform.o00OO0O0
    public final void OooO0O0() {
        this.f6440OooO00o.f27198OooO00o.OooO0o0();
    }
}
