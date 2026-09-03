package p414o0Oo0o0o;

import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.http.request.Request;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import okio.ByteString;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO[] f39468OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<ByteString, Integer> f39469OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O00OO f39471OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<o000OO> f39470OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o000OO[] f39475OooO0o0 = new o000OO[8];

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f39474OooO0o = 7;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f39476OooO0oO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f39477OooO0oo = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f39472OooO0OO = 4096;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f39473OooO0Oo = 4096;

        public OooO00o(o0O0O0O o0o0o0o) {
            this.f39471OooO0O0 = (o0O00OO) o0O000Oo.OooO0OO(o0o0o0o);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0Oo0o0o.o000OO>] */
        public final void OooO00o() {
            this.f39470OooO00o.clear();
            Arrays.fill(this.f39475OooO0o0, (Object) null);
            this.f39474OooO0o = this.f39475OooO0o0.length - 1;
            this.f39476OooO0oO = 0;
            this.f39477OooO0oo = 0;
        }

        public final int OooO0O0(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f39475OooO0o0.length;
                while (true) {
                    length--;
                    i2 = this.f39474OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    o000OO[] o000ooArr = this.f39475OooO0o0;
                    i -= o000ooArr[length].f39559OooO0OO;
                    this.f39477OooO0oo -= o000ooArr[length].f39559OooO0OO;
                    this.f39476OooO0oO--;
                    i3++;
                }
                o000OO[] o000ooArr2 = this.f39475OooO0o0;
                System.arraycopy(o000ooArr2, i2 + 1, o000ooArr2, i2 + 1 + i3, this.f39476OooO0oO);
                this.f39474OooO0o += i3;
            }
            return i3;
        }

        public final ByteString OooO0OO(int i) {
            if (i >= 0 && i <= o0000O.f39468OooO00o.length - 1) {
                return o0000O.f39468OooO00o[i].f39557OooO00o;
            }
            return this.f39475OooO0o0[this.f39474OooO0o + 1 + (i - o0000O.f39468OooO00o.length)].f39557OooO00o;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0Oo0o0o.o000OO>] */
        public final void OooO0Oo(o000OO o000oo2) {
            this.f39470OooO00o.add(o000oo2);
            int i = o000oo2.f39559OooO0OO;
            int i2 = this.f39473OooO0Oo;
            if (i > i2) {
                OooO00o();
                return;
            }
            OooO0O0((this.f39477OooO0oo + i) - i2);
            int i3 = this.f39476OooO0oO + 1;
            o000OO[] o000ooArr = this.f39475OooO0o0;
            if (i3 > o000ooArr.length) {
                o000OO[] o000ooArr2 = new o000OO[o000ooArr.length * 2];
                System.arraycopy(o000ooArr, 0, o000ooArr2, o000ooArr.length, o000ooArr.length);
                this.f39474OooO0o = this.f39475OooO0o0.length - 1;
                this.f39475OooO0o0 = o000ooArr2;
            }
            int i4 = this.f39474OooO0o;
            this.f39474OooO0o = i4 - 1;
            this.f39475OooO0o0[i4] = o000oo2;
            this.f39476OooO0oO++;
            this.f39477OooO0oo += i;
        }

        public final int OooO0o(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = this.f39471OooO0O0.readByte() & UByte.MAX_VALUE;
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public final ByteString OooO0o0() throws IOException {
            int i = this.f39471OooO0O0.readByte() & UByte.MAX_VALUE;
            boolean z = (i & 128) == 128;
            int iOooO0o = OooO0o(i, 127);
            if (!z) {
                return this.f39471OooO0O0.OooOOOo(iOooO0o);
            }
            o000 o000Var = o000.f39419OooO0Oo;
            byte[] bArrO0OO00O = this.f39471OooO0O0.o0OO00O(iOooO0o);
            Objects.requireNonNull(o000Var);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            o000.OooO00o oooO00o = o000Var.f39420OooO00o;
            int i2 = 0;
            int i3 = 0;
            for (byte b : bArrO0OO00O) {
                i2 = (i2 << 8) | (b & UByte.MAX_VALUE);
                i3 += 8;
                while (i3 >= 8) {
                    int i4 = i3 - 8;
                    oooO00o = oooO00o.f39421OooO00o[(i2 >>> i4) & KotlinVersion.MAX_COMPONENT_VALUE];
                    if (oooO00o.f39421OooO00o == null) {
                        byteArrayOutputStream.write(oooO00o.f39422OooO0O0);
                        i3 -= oooO00o.f39423OooO0OO;
                        oooO00o = o000Var.f39420OooO00o;
                    } else {
                        i3 = i4;
                    }
                }
            }
            while (i3 > 0) {
                o000.OooO00o oooO00o2 = oooO00o.f39421OooO00o[(i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE];
                if (oooO00o2.f39421OooO00o != null || oooO00o2.f39423OooO0OO > i3) {
                    break;
                }
                byteArrayOutputStream.write(oooO00o2.f39422OooO0O0);
                i3 -= oooO00o2.f39423OooO0OO;
                oooO00o = o000Var.f39420OooO00o;
            }
            return ByteString.OooO(byteArrayOutputStream.toByteArray());
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0oOO f39478OooO00o;

        public OooO0O0(o0oOO o0ooo2) {
            this.f39478OooO00o = o0ooo2;
        }

        public final void OooO00o(ByteString byteString) throws IOException {
            OooO0OO(byteString.OooO0o0(), 127);
            this.f39478OooO00o.OoooOOO(byteString);
        }

        public final void OooO0O0(List<o000OO> list) throws IOException {
            ArrayList arrayList = (ArrayList) list;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ByteString byteStringOooOO0o = ((o000OO) arrayList.get(i)).f39557OooO00o.OooOO0o();
                Integer num = o0000O.f39469OooO0O0.get(byteStringOooOO0o);
                if (num != null) {
                    OooO0OO(num.intValue() + 1, 15);
                    OooO00o(((o000OO) arrayList.get(i)).f39558OooO0O0);
                } else {
                    this.f39478OooO00o.Ooooo0o(0);
                    OooO00o(byteStringOooOO0o);
                    OooO00o(((o000OO) arrayList.get(i)).f39558OooO0O0);
                }
            }
        }

        public final void OooO0OO(int i, int i2) throws IOException {
            if (i < i2) {
                this.f39478OooO00o.Ooooo0o(i | 0);
                return;
            }
            this.f39478OooO00o.Ooooo0o(i2 | 0);
            int i3 = i - i2;
            while (i3 >= 128) {
                this.f39478OooO00o.Ooooo0o(128 | (i3 & 127));
                i3 >>>= 7;
            }
            this.f39478OooO00o.Ooooo0o(i3);
        }
    }

    static {
        o000OO o000oo2 = new o000OO(o000OO.f39555OooO0oo, "");
        int i = 0;
        ByteString byteString = o000OO.f39553OooO0o0;
        ByteString byteString2 = o000OO.f39552OooO0o;
        ByteString byteString3 = o000OO.f39554OooO0oO;
        ByteString byteString4 = o000OO.f39551OooO0Oo;
        o000OO[] o000ooArr = {o000oo2, new o000OO(byteString, Request.HttpMethodGet), new o000OO(byteString, Request.HttpMethodPOST), new o000OO(byteString2, "/"), new o000OO(byteString2, "/index.html"), new o000OO(byteString3, "http"), new o000OO(byteString3, "https"), new o000OO(byteString4, "200"), new o000OO(byteString4, "204"), new o000OO(byteString4, "206"), new o000OO(byteString4, "304"), new o000OO(byteString4, "400"), new o000OO(byteString4, "404"), new o000OO(byteString4, "500"), new o000OO("accept-charset", ""), new o000OO("accept-encoding", "gzip, deflate"), new o000OO("accept-language", ""), new o000OO("accept-ranges", ""), new o000OO("accept", ""), new o000OO("access-control-allow-origin", ""), new o000OO("age", ""), new o000OO("allow", ""), new o000OO("authorization", ""), new o000OO("cache-control", ""), new o000OO("content-disposition", ""), new o000OO("content-encoding", ""), new o000OO("content-language", ""), new o000OO("content-length", ""), new o000OO("content-location", ""), new o000OO("content-range", ""), new o000OO("content-type", ""), new o000OO("cookie", ""), new o000OO("date", ""), new o000OO("etag", ""), new o000OO("expect", ""), new o000OO("expires", ""), new o000OO("from", ""), new o000OO(ReportItem.RequestKeyHost, ""), new o000OO("if-match", ""), new o000OO("if-modified-since", ""), new o000OO("if-none-match", ""), new o000OO("if-range", ""), new o000OO("if-unmodified-since", ""), new o000OO("last-modified", ""), new o000OO("link", ""), new o000OO("location", ""), new o000OO("max-forwards", ""), new o000OO("proxy-authenticate", ""), new o000OO("proxy-authorization", ""), new o000OO("range", ""), new o000OO("referer", ""), new o000OO("refresh", ""), new o000OO("retry-after", ""), new o000OO("server", ""), new o000OO("set-cookie", ""), new o000OO("strict-transport-security", ""), new o000OO("transfer-encoding", ""), new o000OO("user-agent", ""), new o000OO("vary", ""), new o000OO("via", ""), new o000OO("www-authenticate", "")};
        f39468OooO00o = o000ooArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o000ooArr.length);
        while (true) {
            o000OO[] o000ooArr2 = f39468OooO00o;
            if (i >= o000ooArr2.length) {
                f39469OooO0O0 = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(o000ooArr2[i].f39557OooO00o)) {
                    linkedHashMap.put(o000ooArr2[i].f39557OooO00o, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static ByteString OooO00o(ByteString byteString) throws IOException {
        int iOooO0o0 = byteString.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            byte bOooO0oo = byteString.OooO0oo(i);
            if (bOooO0oo >= 65 && bOooO0oo <= 90) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PROTOCOL_ERROR response malformed: mixed case name: ");
                sbOooO0o0.append(byteString.OooOOO());
                throw new IOException(sbOooO0o0.toString());
            }
        }
        return byteString;
    }
}
