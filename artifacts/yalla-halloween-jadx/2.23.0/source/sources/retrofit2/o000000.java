package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o000000 extends o000000O<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000000O f61028OooO00o;

    public o000000(o000000O o000000o2) {
        this.f61028OooO00o = o000000o2;
    }

    @Override // retrofit2.o000000O
    public final void OooO00o(o0000oo o0000ooVar, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f61028OooO00o.OooO00o(o0000ooVar, Array.get(obj, i));
        }
    }
}
