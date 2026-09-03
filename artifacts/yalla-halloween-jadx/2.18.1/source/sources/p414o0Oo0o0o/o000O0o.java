package p414o0Oo0o0o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.ByteString;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O000O;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O000O f39546OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39547OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00OO f39548OooO0OO;

    public class OooO00o extends o0O00000 {
        public OooO00o(o0O0O0O o0o0o0o) {
            super(o0o0o0o);
        }

        @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
        public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
            int i = o000O0o.this.f39547OooO0O0;
            if (i == 0) {
                return -1L;
            }
            long jOooo0O0 = super.Oooo0O0(o0ooo2, Math.min(j, i));
            if (jOooo0O0 == -1) {
                return -1L;
            }
            o000O0o o000o0o2 = o000O0o.this;
            o000o0o2.f39547OooO0O0 = (int) (((long) o000o0o2.f39547OooO0O0) - jOooo0O0);
            return jOooo0O0;
        }
    }

    public class OooO0O0 extends Inflater {
        @Override // java.util.zip.Inflater
        public final int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
            int iInflate = super.inflate(bArr, i, i2);
            if (iInflate != 0 || !needsDictionary()) {
                return iInflate;
            }
            setDictionary(o000O0.f39531OooO00o);
            return super.inflate(bArr, i, i2);
        }
    }

    public o000O0o(o0oOOo o0oooo2) {
        o0O000O o0o000o = new o0O000O(new OooO00o(o0oooo2), new OooO0O0());
        this.f39546OooO00o = o0o000o;
        this.f39548OooO0OO = (o0O00OO) o0O000Oo.OooO0OO(o0o000o);
    }

    public final List<o000OO> OooO00o(int i) throws IOException {
        this.f39547OooO0O0 += i;
        int i2 = this.f39548OooO0OO.readInt();
        if (i2 < 0) {
            throw new IOException(android.support.v4.media.OooO00o.OooO00o("numberOfPairs < 0: ", i2));
        }
        if (i2 > 1024) {
            throw new IOException(android.support.v4.media.OooO00o.OooO00o("numberOfPairs > 1024: ", i2));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteString byteStringOooOO0o = this.f39548OooO0OO.OooOOOo(this.f39548OooO0OO.readInt()).OooOO0o();
            ByteString byteStringOooOOOo = this.f39548OooO0OO.OooOOOo(this.f39548OooO0OO.readInt());
            if (byteStringOooOO0o.OooO0o0() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new o000OO(byteStringOooOO0o, byteStringOooOOOo));
        }
        if (this.f39547OooO0O0 > 0) {
            this.f39546OooO00o.OooO0O0();
            if (this.f39547OooO0O0 != 0) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("compressedLimit > 0: ");
                sbOooO0o0.append(this.f39547OooO0O0);
                throw new IOException(sbOooO0o0.toString());
            }
        }
        return arrayList;
    }
}
