package p337o0OO0ooO;

import android.support.v4.media.OooO00o;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000O0o;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0o f43364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f43365OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0000 f43366OooO0OO;

    public o000000O(o00O0000 o00o0001) {
        o000O0o o000o0o2 = new o000O0o(new o000OOo(this, o00o0001), new o000000());
        this.f43364OooO00o = o000o0o2;
        this.f43366OooO0OO = o000O0Oo.OooO0O0(o000o0o2);
    }

    public final ArrayList OooO00o(int i) throws IOException {
        this.f43365OooO0O0 += i;
        o00O0000 o00o0001 = this.f43366OooO0OO;
        int i2 = o00o0001.readInt();
        if (i2 < 0) {
            throw new IOException(OooO00o.OooO00o("numberOfPairs < 0: ", i2));
        }
        if (i2 > 1024) {
            throw new IOException(OooO00o.OooO00o("numberOfPairs > 1024: ", i2));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteString byteStringOooOOo = o00o0001.Oooooo0(o00o0001.readInt()).OooOOo();
            ByteString byteStringOooooo0 = o00o0001.Oooooo0(o00o0001.readInt());
            if (byteStringOooOOo.OooO0o0() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new o0OOO0o(byteStringOooOOo, byteStringOooooo0));
        }
        if (this.f43365OooO0O0 > 0) {
            this.f43364OooO00o.OooO0OO();
            if (this.f43365OooO0O0 != 0) {
                throw new IOException("compressedLimit > 0: " + this.f43365OooO0O0);
            }
        }
        return arrayList;
    }
}
