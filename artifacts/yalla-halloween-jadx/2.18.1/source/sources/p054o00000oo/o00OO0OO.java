package p054o00000oo;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0OO implements o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f27218OooO00o;

    public o00OO0OO(o00OO00O o00oo00o) {
        this.f27218OooO00o = o00oo00o;
    }

    @Override // p054o00000oo.o00O00O
    public final void OooO00o(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((BaseInputConnection) this.f27218OooO00o.f27200OooO.getValue()).sendKeyEvent(event);
    }

    @Override // p054o00000oo.o00O00O
    public final void OooO0O0(int i) {
        this.f27218OooO00o.f27206OooO0o0.invoke(new o00O000o(i));
    }

    @Override // p054o00000oo.o00O00O
    public final void OooO0OO(@NotNull List<? extends o000O> editCommands) {
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        this.f27218OooO00o.f27204OooO0Oo.invoke(editCommands);
    }
}
