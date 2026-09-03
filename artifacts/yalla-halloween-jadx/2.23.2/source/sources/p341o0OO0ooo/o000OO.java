package p341o0OO0ooo;

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
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000O0O[] f42730OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<ByteString, Integer> f42731OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0o0000 f42733OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f42732OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0000O0O[] f42737OooO0o0 = new o0000O0O[8];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f42736OooO0o = 7;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f42738OooO0oO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f42739OooO0oo = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f42734OooO0OO = 4096;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f42735OooO0Oo = 4096;

        public OooO00o(o0000O.OooO00o oooO00o) {
            this.f42733OooO0O0 = o0OO.OooO0O0(oooO00o);
        }

        public final int OooO00o(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f42737OooO0o0.length;
                while (true) {
                    length--;
                    i2 = this.f42736OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f42737OooO0o0[length].f42700OooO0OO;
                    i -= i4;
                    this.f42739OooO0oo -= i4;
                    this.f42738OooO0oO--;
                    i3++;
                }
                o0000O0O[] o0000o0oArr = this.f42737OooO0o0;
                System.arraycopy(o0000o0oArr, i2 + 1, o0000o0oArr, i2 + 1 + i3, this.f42738OooO0oO);
                this.f42736OooO0o += i3;
            }
            return i3;
        }

        public final ByteString OooO0O0(int i) {
            if (i >= 0 && i <= o000OO.f42730OooO00o.length - 1) {
                return o000OO.f42730OooO00o[i].f42698OooO00o;
            }
            return this.f42737OooO0o0[this.f42736OooO0o + 1 + (i - o000OO.f42730OooO00o.length)].f42698OooO00o;
        }

        public final void OooO0OO(o0000O0O o0000o0o2) {
            ArrayList arrayList = this.f42732OooO00o;
            arrayList.add(o0000o0o2);
            int i = this.f42735OooO0Oo;
            int i2 = o0000o0o2.f42700OooO0OO;
            if (i2 > i) {
                arrayList.clear();
                Arrays.fill(this.f42737OooO0o0, (Object) null);
                this.f42736OooO0o = this.f42737OooO0o0.length - 1;
                this.f42738OooO0oO = 0;
                this.f42739OooO0oo = 0;
                return;
            }
            OooO00o((this.f42739OooO0oo + i2) - i);
            int i3 = this.f42738OooO0oO + 1;
            o0000O0O[] o0000o0oArr = this.f42737OooO0o0;
            if (i3 > o0000o0oArr.length) {
                o0000O0O[] o0000o0oArr2 = new o0000O0O[o0000o0oArr.length * 2];
                System.arraycopy(o0000o0oArr, 0, o0000o0oArr2, o0000o0oArr.length, o0000o0oArr.length);
                this.f42736OooO0o = this.f42737OooO0o0.length - 1;
                this.f42737OooO0o0 = o0000o0oArr2;
            }
            int i4 = this.f42736OooO0o;
            this.f42736OooO0o = i4 - 1;
            this.f42737OooO0o0[i4] = o0000o0o2;
            this.f42738OooO0oO++;
            this.f42739OooO0oo += i2;
        }

        public final ByteString OooO0Oo() throws IOException {
            int i;
            o0o0000 o0o0000Var = this.f42733OooO0O0;
            int i2 = o0o0000Var.readByte() & UByte.MAX_VALUE;
            boolean z = (i2 & 128) == 128;
            int iOooO0o0 = OooO0o0(i2, 127);
            if (!z) {
                return o0o0000Var.Oooooo0(iOooO0o0);
            }
            o0000OO0 o0000oo1 = o0000OO0.f42703OooO0Oo;
            long j = iOooO0o0;
            o0o0000Var.OoooOoO(j);
            byte[] bArrOooo0OO = o0o0000Var.f59801OooO0o0.Oooo0OO(j);
            o0000oo1.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            o0000OO0.OooO00o oooO00o = o0000oo1.f42704OooO00o;
            o0000OO0.OooO00o oooO00o2 = oooO00o;
            int i3 = 0;
            int i4 = 0;
            for (byte b : bArrOooo0OO) {
                i3 = (i3 << 8) | (b & UByte.MAX_VALUE);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    oooO00o2 = oooO00o2.f42705OooO00o[(i3 >>> i5) & 255];
                    if (oooO00o2.f42705OooO00o == null) {
                        byteArrayOutputStream.write(oooO00o2.f42706OooO0O0);
                        i4 -= oooO00o2.f42707OooO0OO;
                        oooO00o2 = oooO00o;
                    } else {
                        i4 = i5;
                    }
                }
            }
            while (i4 > 0) {
                o0000OO0.OooO00o oooO00o3 = oooO00o2.f42705OooO00o[(i3 << (8 - i4)) & 255];
                if (oooO00o3.f42705OooO00o != null || (i = oooO00o3.f42707OooO0OO) > i4) {
                    break;
                }
                byteArrayOutputStream.write(oooO00o3.f42706OooO0O0);
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
                int i5 = this.f42733OooO0O0.readByte() & UByte.MAX_VALUE;
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
        public final oo0OOoo f42740OooO00o;

        public OooO0O0(oo0OOoo oo0oooo) {
            this.f42740OooO00o = oo0oooo;
        }

        public final void OooO00o(ArrayList arrayList) throws IOException {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ByteString byteStringOooOOo = ((o0000O0O) arrayList.get(i)).f42698OooO00o.OooOOo();
                Integer num = o000OO.f42731OooO0O0.get(byteStringOooOOo);
                oo0OOoo oo0oooo = this.f42740OooO00o;
                if (num != null) {
                    OooO0O0(num.intValue() + 1, 15);
                    ByteString byteString = ((o0000O0O) arrayList.get(i)).f42699OooO0O0;
                    OooO0O0(byteString.OooO0o0(), 127);
                    oo0oooo.o00O0O(byteString);
                } else {
                    oo0oooo.o00o0O(0);
                    OooO0O0(byteStringOooOOo.OooO0o0(), 127);
                    oo0oooo.o00O0O(byteStringOooOOo);
                    ByteString byteString2 = ((o0000O0O) arrayList.get(i)).f42699OooO0O0;
                    OooO0O0(byteString2.OooO0o0(), 127);
                    oo0oooo.o00O0O(byteString2);
                }
            }
        }

        public final void OooO0O0(int i, int i2) throws IOException {
            oo0OOoo oo0oooo = this.f42740OooO00o;
            if (i < i2) {
                oo0oooo.o00o0O(i | 0);
                return;
            }
            oo0oooo.o00o0O(0 | i2);
            int i3 = i - i2;
            while (i3 >= 128) {
                oo0oooo.o00o0O(128 | (i3 & 127));
                i3 >>>= 7;
            }
            oo0oooo.o00o0O(i3);
        }
    }

    static {
        o0000O0O o0000o0o2 = new o0000O0O("", o0000O0O.f42696OooO0oo);
        ByteString byteString = o0000O0O.f42694OooO0o0;
        ByteString byteString2 = o0000O0O.f42693OooO0o;
        ByteString byteString3 = o0000O0O.f42695OooO0oO;
        ByteString byteString4 = o0000O0O.f42692OooO0Oo;
        o0000O0O[] o0000o0oArr = {o0000o0o2, new o0000O0O("GET", byteString), new o0000O0O("POST", byteString), new o0000O0O("/", byteString2), new o0000O0O("/index.html", byteString2), new o0000O0O("http", byteString3), new o0000O0O("https", byteString3), new o0000O0O("200", byteString4), new o0000O0O("204", byteString4), new o0000O0O("206", byteString4), new o0000O0O("304", byteString4), new o0000O0O("400", byteString4), new o0000O0O("404", byteString4), new o0000O0O("500", byteString4), new o0000O0O("accept-charset", ""), new o0000O0O("accept-encoding", "gzip, deflate"), new o0000O0O("accept-language", ""), new o0000O0O("accept-ranges", ""), new o0000O0O("accept", ""), new o0000O0O("access-control-allow-origin", ""), new o0000O0O("age", ""), new o0000O0O("allow", ""), new o0000O0O("authorization", ""), new o0000O0O("cache-control", ""), new o0000O0O("content-disposition", ""), new o0000O0O("content-encoding", ""), new o0000O0O("content-language", ""), new o0000O0O("content-length", ""), new o0000O0O("content-location", ""), new o0000O0O("content-range", ""), new o0000O0O("content-type", ""), new o0000O0O("cookie", ""), new o0000O0O("date", ""), new o0000O0O("etag", ""), new o0000O0O("expect", ""), new o0000O0O("expires", ""), new o0000O0O("from", ""), new o0000O0O(ReportItem.RequestKeyHost, ""), new o0000O0O("if-match", ""), new o0000O0O("if-modified-since", ""), new o0000O0O("if-none-match", ""), new o0000O0O("if-range", ""), new o0000O0O("if-unmodified-since", ""), new o0000O0O("last-modified", ""), new o0000O0O("link", ""), new o0000O0O("location", ""), new o0000O0O("max-forwards", ""), new o0000O0O("proxy-authenticate", ""), new o0000O0O("proxy-authorization", ""), new o0000O0O("range", ""), new o0000O0O("referer", ""), new o0000O0O("refresh", ""), new o0000O0O("retry-after", ""), new o0000O0O("server", ""), new o0000O0O("set-cookie", ""), new o0000O0O("strict-transport-security", ""), new o0000O0O("transfer-encoding", ""), new o0000O0O("user-agent", ""), new o0000O0O("vary", ""), new o0000O0O("via", ""), new o0000O0O("www-authenticate", "")};
        f42730OooO00o = o0000o0oArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0000o0oArr.length);
        for (int i = 0; i < o0000o0oArr.length; i++) {
            if (!linkedHashMap.containsKey(o0000o0oArr[i].f42698OooO00o)) {
                linkedHashMap.put(o0000o0oArr[i].f42698OooO00o, Integer.valueOf(i));
            }
        }
        f42731OooO0O0 = Collections.unmodifiableMap(linkedHashMap);
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
