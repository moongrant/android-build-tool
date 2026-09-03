package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo extends o000000<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000000 f60615OooO00o;

    public o000OOo(o000000 o000000Var) {
        this.f60615OooO00o = o000000Var;
    }

    @Override // retrofit2.o000000
    public final void OooO00o(o0000O00 o0000o00, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f60615OooO00o.OooO00o(o0000o00, Array.get(obj, i));
        }
    }
}
