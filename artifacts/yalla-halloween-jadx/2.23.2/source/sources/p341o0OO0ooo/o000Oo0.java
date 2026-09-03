package p341o0OO0ooo;

import android.support.v4.media.OooO00o;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO0;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO0 f42741OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f42742OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0o0000 f42743OooO0OO;

    public o000Oo0(o0o0000 o0o0000Var) {
        o0OO0 o0oo1 = new o0OO0(new o000O000(this, o0o0000Var), new o000O0o());
        this.f42741OooO00o = o0oo1;
        this.f42743OooO0OO = o0OO.OooO0O0(o0oo1);
    }

    public final ArrayList OooO00o(int i) throws IOException {
        this.f42742OooO0O0 += i;
        o0o0000 o0o0000Var = this.f42743OooO0OO;
        int i2 = o0o0000Var.readInt();
        if (i2 < 0) {
            throw new IOException(OooO00o.OooO00o("numberOfPairs < 0: ", i2));
        }
        if (i2 > 1024) {
            throw new IOException(OooO00o.OooO00o("numberOfPairs > 1024: ", i2));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteString byteStringOooOOo = o0o0000Var.Oooooo0(o0o0000Var.readInt()).OooOOo();
            ByteString byteStringOooooo0 = o0o0000Var.Oooooo0(o0o0000Var.readInt());
            if (byteStringOooOOo.OooO0o0() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new o0000O0O(byteStringOooOOo, byteStringOooooo0));
        }
        if (this.f42742OooO0O0 > 0) {
            this.f42741OooO00o.OooO0OO();
            if (this.f42742OooO0O0 != 0) {
                throw new IOException("compressedLimit > 0: " + this.f42742OooO0O0);
            }
        }
        return arrayList;
    }
}
