package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends o0ooOOo<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f53794OooO00o;

    public o00oO0o(o0ooOOo o0ooooo2) {
        this.f53794OooO00o = o0ooooo2;
    }

    @Override // retrofit2.o0ooOOo
    public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f53794OooO00o.OooO00o(o0oo0oo2, Array.get(obj, i));
        }
    }
}
