package retrofit2;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends o0ooOOo<Iterable<Object>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f53905OooO00o;

    public oo000o(o0ooOOo o0ooooo2) {
        this.f53905OooO00o = o0ooooo2;
    }

    @Override // retrofit2.o0ooOOo
    public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f53905OooO00o.OooO00o(o0oo0oo2, it.next());
        }
    }
}
