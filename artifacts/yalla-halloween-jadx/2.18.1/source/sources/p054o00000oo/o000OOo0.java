package p054o00000oo;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00000O.OooO00o;
import o00000O.OooO0O0;
import o00000O.o0OO00O;
import org.jetbrains.annotations.NotNull;
import p042Ooooo0o.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public oo0oOO0 f27167OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public o00 f27168OooO0O0;

    public o000OOo0() {
        OooO00o oooO00o = OooO0O0.f26772OooO00o;
        o0OO00O.OooO00o oooO00o2 = o0OO00O.f26874OooO0O0;
        oo0oOO0 oo0ooo0 = new oo0oOO0(oooO00o, o0OO00O.f26875OooO0OO, (o0OO00O) null);
        this.f27167OooO00o = oo0ooo0;
        this.f27168OooO0O0 = new o00(oooO00o, oo0ooo0.f27237OooO0O0);
    }

    @NotNull
    public final oo0oOO0 OooO00o(@NotNull List<? extends o000O> editCommands) {
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i = 0; i < size; i++) {
            editCommands.get(i).OooO00o(this.f27168OooO0O0);
        }
        OooO00o oooO00o = new OooO00o(this.f27168OooO0O0.toString(), null, 6);
        o00 o00Var = this.f27168OooO0O0;
        oo0oOO0 oo0ooo0 = new oo0oOO0(oooO00o, o000O0O0.OooO00o(o00Var.f27157OooO0O0, o00Var.f27158OooO0OO), this.f27168OooO0O0.OooO0Oo());
        this.f27167OooO00o = oo0ooo0;
        return oo0ooo0;
    }
}
