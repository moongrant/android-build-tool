package p371o0OOo0Oo;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f38666OooO00o;

    public o00Oo0(o00Ooo o00ooo2) {
        this.f38666OooO00o = o00ooo2;
    }

    public final void OooO00o(@NonNull Object obj, @NonNull Writer writer) throws IOException {
        o00Ooo o00ooo2 = this.f38666OooO00o;
        oo000o oo000oVar = new oo000o(writer, o00ooo2.f38668OooO00o, o00ooo2.f38669OooO0O0, o00ooo2.f38670OooO0OO, o00ooo2.f38671OooO0Oo);
        oo000oVar.OooO0oO(obj);
        oo000oVar.OooO();
        oo000oVar.f38675OooO0O0.flush();
    }
}
