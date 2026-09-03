package p299o0O0o00;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f41731OooO00o;

    public oo000o(o00oO0o o00oo0o2) {
        this.f41731OooO00o = o00oo0o2;
    }

    public final void OooO00o(@NonNull Writer writer, @NonNull Object obj) throws IOException {
        o00oO0o o00oo0o2 = this.f41731OooO00o;
        o0ooOOo o0ooooo = new o0ooOOo(writer, o00oo0o2.f41720OooO00o, o00oo0o2.f41721OooO0O0, o00oo0o2.f41722OooO0OO, o00oo0o2.f41723OooO0Oo);
        o0ooooo.OooO0oO(obj);
        o0ooooo.OooO();
        o0ooooo.f41726OooO0O0.flush();
    }
}
