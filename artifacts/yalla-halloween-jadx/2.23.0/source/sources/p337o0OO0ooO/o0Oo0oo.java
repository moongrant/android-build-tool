package p337o0OO0ooO;

import com.qiniu.android.collect.ReportItem;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.UByte;
import okio.ByteString;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OOO0o[] f43429OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<ByteString, Integer> f43430OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O0000 f43432OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f43431OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0OOO0o[] f43436OooO0o0 = new o0OOO0o[8];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f43435OooO0o = 7;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f43437OooO0oO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f43438OooO0oo = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f43433OooO0OO = 4096;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f43434OooO0Oo = 4096;

        public OooO00o(o0OO00O.OooO00o oooO00o) {
            this.f43432OooO0O0 = o000O0Oo.OooO0O0(oooO00o);
        }

        public final int OooO00o(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f43436OooO0o0.length;
                while (true) {
                    length--;
                    i2 = this.f43435OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f43436OooO0o0[length].f43428OooO0OO;
                    i -= i4;
                    this.f43438OooO0oo -= i4;
                    this.f43437OooO0oO--;
                    i3++;
                }
                o0OOO0o[] o0ooo0oArr = this.f43436OooO0o0;
                System.arraycopy(o0ooo0oArr, i2 + 1, o0ooo0oArr, i2 + 1 + i3, this.f43437OooO0oO);
                this.f43435OooO0o += i3;
            }
            return i3;
        }

        public final ByteString OooO0O0(int i) {
            if (i >= 0 && i <= o0Oo0oo.f43429OooO00o.length - 1) {
                return o0Oo0oo.f43429OooO00o[i].f43426OooO00o;
            }
            return this.f43436OooO0o0[this.f43435OooO0o + 1 + (i - o0Oo0oo.f43429OooO00o.length)].f43426OooO00o;
        }

        public final void OooO0OO(o0OOO0o o0ooo0o2) {
            ArrayList arrayList = this.f43431OooO00o;
            arrayList.add(o0ooo0o2);
            int i = this.f43434OooO0Oo;
            int i2 = o0ooo0o2.f43428OooO0OO;
            if (i2 > i) {
                arrayList.clear();
                Arrays.fill(this.f43436OooO0o0, (Object) null);
                this.f43435OooO0o = this.f43436OooO0o0.length - 1;
                this.f43437OooO0oO = 0;
                this.f43438OooO0oo = 0;
                return;
            }
            OooO00o((this.f43438OooO0oo + i2) - i);
            int i3 = this.f43437OooO0oO + 1;
            o0OOO0o[] o0ooo0oArr = this.f43436OooO0o0;
            if (i3 > o0ooo0oArr.length) {
                o0OOO0o[] o0ooo0oArr2 = new o0OOO0o[o0ooo0oArr.length * 2];
                System.arraycopy(o0ooo0oArr, 0, o0ooo0oArr2, o0ooo0oArr.length, o0ooo0oArr.length);
                this.f43435OooO0o = this.f43436OooO0o0.length - 1;
                this.f43436OooO0o0 = o0ooo0oArr2;
            }
            int i4 = this.f43435OooO0o;
            this.f43435OooO0o = i4 - 1;
            this.f43436OooO0o0[i4] = o0ooo0o2;
            this.f43437OooO0oO++;
            this.f43438OooO0oo += i2;
        }

        public final ByteString OooO0Oo() throws IOException {
            int i;
            o00O0000 o00o0001 = this.f43432OooO0O0;
            int i2 = o00o0001.readByte() & UByte.MAX_VALUE;
            boolean z = (i2 & 128) == 128;
            int iOooO0o0 = OooO0o0(i2, 127);
            if (!z) {
                return o00o0001.Oooooo0(iOooO0o0);
            }
            oo0o0Oo oo0o0oo = oo0o0Oo.f43469OooO0Oo;
            long j = iOooO0o0;
            o00o0001.OoooOoO(j);
            byte[] bArrOooo0OO = o00o0001.f60234OooO0o0.Oooo0OO(j);
            oo0o0oo.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            oo0o0Oo.OooO00o oooO00o = oo0o0oo.f43470OooO00o;
            oo0o0Oo.OooO00o oooO00o2 = oooO00o;
            int i3 = 0;
            int i4 = 0;
            for (byte b : bArrOooo0OO) {
                i3 = (i3 << 8) | (b & UByte.MAX_VALUE);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    oooO00o2 = oooO00o2.f43471OooO00o[(i3 >>> i5) & 255];
                    if (oooO00o2.f43471OooO00o == null) {
                        byteArrayOutputStream.write(oooO00o2.f43472OooO0O0);
                        i4 -= oooO00o2.f43473OooO0OO;
                        oooO00o2 = oooO00o;
                    } else {
                        i4 = i5;
                    }
                }
            }
            while (i4 > 0) {
                oo0o0Oo.OooO00o oooO00o3 = oooO00o2.f43471OooO00o[(i3 << (8 - i4)) & 255];
                if (oooO00o3.f43471OooO00o != null || (i = oooO00o3.f43473OooO0OO) > i4) {
                    break;
                }
                byteArrayOutputStream.write(oooO00o3.f43472OooO0O0);
                i4 -= i;
                oooO00o2 = oooO00o;
            }
            return ByteString.OooOOO0(byteArrayOutputStream.toByteArray());
        }

        public final int OooO0o0(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = this.f43432OooO0O0.readByte() & UByte.MAX_VALUE;
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00000O f43439OooO00o;

        public OooO0O0(o00000O o00000o) {
            this.f43439OooO00o = o00000o;
        }

        public final void OooO00o(ArrayList arrayList) throws IOException {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ByteString byteStringOooOOo = ((o0OOO0o) arrayList.get(i)).f43426OooO00o.OooOOo();
                Integer num = o0Oo0oo.f43430OooO0O0.get(byteStringOooOOo);
                o00000O o00000o = this.f43439OooO00o;
                if (num != null) {
                    OooO0O0(num.intValue() + 1, 15);
                    ByteString byteString = ((o0OOO0o) arrayList.get(i)).f43427OooO0O0;
                    OooO0O0(byteString.OooO0o0(), 127);
                    o00000o.OoooooO(byteString);
                } else {
                    o00000o.o00O0O(0);
                    OooO0O0(byteStringOooOOo.OooO0o0(), 127);
                    o00000o.OoooooO(byteStringOooOOo);
                    ByteString byteString2 = ((o0OOO0o) arrayList.get(i)).f43427OooO0O0;
                    OooO0O0(byteString2.OooO0o0(), 127);
                    o00000o.OoooooO(byteString2);
                }
            }
        }

        public final void OooO0O0(int i, int i2) throws IOException {
            o00000O o00000o = this.f43439OooO00o;
            if (i < i2) {
                o00000o.o00O0O(i | 0);
                return;
            }
            o00000o.o00O0O(0 | i2);
            int i3 = i - i2;
            while (i3 >= 128) {
                o00000o.o00O0O(128 | (i3 & 127));
                i3 >>>= 7;
            }
            o00000o.o00O0O(i3);
        }
    }

    static {
        o0OOO0o o0ooo0o2 = new o0OOO0o("", o0OOO0o.f43424OooO0oo);
        ByteString byteString = o0OOO0o.f43422OooO0o0;
        ByteString byteString2 = o0OOO0o.f43421OooO0o;
        ByteString byteString3 = o0OOO0o.f43423OooO0oO;
        ByteString byteString4 = o0OOO0o.f43420OooO0Oo;
        o0OOO0o[] o0ooo0oArr = {o0ooo0o2, new o0OOO0o("GET", byteString), new o0OOO0o("POST", byteString), new o0OOO0o("/", byteString2), new o0OOO0o("/index.html", byteString2), new o0OOO0o("http", byteString3), new o0OOO0o("https", byteString3), new o0OOO0o("200", byteString4), new o0OOO0o("204", byteString4), new o0OOO0o("206", byteString4), new o0OOO0o("304", byteString4), new o0OOO0o("400", byteString4), new o0OOO0o("404", byteString4), new o0OOO0o("500", byteString4), new o0OOO0o("accept-charset", ""), new o0OOO0o("accept-encoding", "gzip, deflate"), new o0OOO0o("accept-language", ""), new o0OOO0o("accept-ranges", ""), new o0OOO0o("accept", ""), new o0OOO0o("access-control-allow-origin", ""), new o0OOO0o("age", ""), new o0OOO0o("allow", ""), new o0OOO0o("authorization", ""), new o0OOO0o("cache-control", ""), new o0OOO0o("content-disposition", ""), new o0OOO0o("content-encoding", ""), new o0OOO0o("content-language", ""), new o0OOO0o("content-length", ""), new o0OOO0o("content-location", ""), new o0OOO0o("content-range", ""), new o0OOO0o("content-type", ""), new o0OOO0o("cookie", ""), new o0OOO0o("date", ""), new o0OOO0o("etag", ""), new o0OOO0o("expect", ""), new o0OOO0o("expires", ""), new o0OOO0o("from", ""), new o0OOO0o(ReportItem.RequestKeyHost, ""), new o0OOO0o("if-match", ""), new o0OOO0o("if-modified-since", ""), new o0OOO0o("if-none-match", ""), new o0OOO0o("if-range", ""), new o0OOO0o("if-unmodified-since", ""), new o0OOO0o("last-modified", ""), new o0OOO0o("link", ""), new o0OOO0o("location", ""), new o0OOO0o("max-forwards", ""), new o0OOO0o("proxy-authenticate", ""), new o0OOO0o("proxy-authorization", ""), new o0OOO0o("range", ""), new o0OOO0o("referer", ""), new o0OOO0o("refresh", ""), new o0OOO0o("retry-after", ""), new o0OOO0o("server", ""), new o0OOO0o("set-cookie", ""), new o0OOO0o("strict-transport-security", ""), new o0OOO0o("transfer-encoding", ""), new o0OOO0o("user-agent", ""), new o0OOO0o("vary", ""), new o0OOO0o("via", ""), new o0OOO0o("www-authenticate", "")};
        f43429OooO00o = o0ooo0oArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0ooo0oArr.length);
        for (int i = 0; i < o0ooo0oArr.length; i++) {
            if (!linkedHashMap.containsKey(o0ooo0oArr[i].f43426OooO00o)) {
                linkedHashMap.put(o0ooo0oArr[i].f43426OooO00o, Integer.valueOf(i));
            }
        }
        f43430OooO0O0 = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void OooO00o(ByteString byteString) throws IOException {
        int iOooO0o0 = byteString.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            byte bOooOO0 = byteString.OooOO0(i);
            if (bOooOO0 >= 65 && bOooOO0 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.OooOo00()));
            }
        }
    }
}
