package retrofit2;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo extends o000000O<Iterable<Object>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000000O f61148OooO00o;

    public o000OOo(o000000O o000000o2) {
        this.f61148OooO00o = o000000o2;
    }

    @Override // retrofit2.o000000O
    public final void OooO00o(o0000oo o0000ooVar, @Nullable Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f61148OooO00o.OooO00o(o0000ooVar, it.next());
        }
    }
}
