package retrofit2;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0O00 extends o000000<Iterable<Object>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000000 f60622OooO00o;

    public o0O0O00(o000000 o000000Var) {
        this.f60622OooO00o = o000000Var;
    }

    @Override // retrofit2.o000000
    public final void OooO00o(o0000O00 o0000o00, @Nullable Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f60622OooO00o.OooO00o(o0000o00, it.next());
        }
    }
}
