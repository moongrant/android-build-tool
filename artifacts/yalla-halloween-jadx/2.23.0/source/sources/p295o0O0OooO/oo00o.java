package p295o0O0OooO;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O0 f42325OooO00o;

    public oo00o(o00O0 o00o1) {
        this.f42325OooO00o = o00o1;
    }

    public final void OooO00o(@NonNull Writer writer, @NonNull Object obj) throws IOException {
        o00O0 o00o1 = this.f42325OooO00o;
        o00O0O00 o00o0o01 = new o00O0O00(writer, o00o1.f42314OooO00o, o00o1.f42315OooO0O0, o00o1.f42316OooO0OO, o00o1.f42317OooO0Oo);
        o00o0o01.OooO0oO(obj);
        o00o0o01.OooO();
        o00o0o01.f42320OooO0O0.flush();
    }
}
