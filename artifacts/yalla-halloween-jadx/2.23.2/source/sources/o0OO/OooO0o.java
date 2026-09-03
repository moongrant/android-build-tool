package o0OO;

import com.google.android.gms.internal.measurement.o00oOoo;
import com.google.firebase.perf.FirebasePerformance;
import com.qiniu.android.collect.ReportItem;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.o00Oo0;
import com.squareup.okhttp.o00Ooo;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import p340o0OO0ooO.o000OOo;
import p341o0OO0ooo.o00000;
import p341o0OO0ooo.o0000O0;
import p341o0OO0ooo.o0000O0O;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<ByteString> f42177OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<ByteString> f42178OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f42179OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000 f42180OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000O0 f42181OooO0OO;

    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        f42177OooO0Oo = o000OOo.OooO0o(ByteString.OooO00o.OooO0OO("connection"), ByteString.OooO00o.OooO0OO(ReportItem.RequestKeyHost), ByteString.OooO00o.OooO0OO("keep-alive"), ByteString.OooO00o.OooO0OO("proxy-connection"), ByteString.OooO00o.OooO0OO("transfer-encoding"));
        f42178OooO0o0 = o000OOo.OooO0o(ByteString.OooO00o.OooO0OO("connection"), ByteString.OooO00o.OooO0OO(ReportItem.RequestKeyHost), ByteString.OooO00o.OooO0OO("keep-alive"), ByteString.OooO00o.OooO0OO("proxy-connection"), ByteString.OooO00o.OooO0OO("te"), ByteString.OooO00o.OooO0OO("transfer-encoding"), ByteString.OooO00o.OooO0OO("encoding"), ByteString.OooO00o.OooO0OO("upgrade"));
    }

    public OooO0o(OooOO0O oooOO0O, o00000 o00000Var) {
        this.f42179OooO00o = oooOO0O;
        this.f42180OooO0O0 = o00000Var;
    }

    @Override // o0OO.o0OoOo0
    public final void OooO00o() throws IOException {
        this.f42181OooO0OO.OooO0o().close();
    }

    @Override // o0OO.o0OoOo0
    public final ooo0Oo0 OooO0O0(o00Oo0 o00oo1, long j) throws IOException {
        return this.f42181OooO0OO.OooO0o();
    }

    @Override // o0OO.o0OoOo0
    public final void OooO0OO(o00Oo0 o00oo1) throws IOException {
        int i;
        o0000O0 o0000o1;
        boolean zContains;
        if (this.f42181OooO0OO != null) {
            return;
        }
        OooOO0O oooOO0O = this.f42179OooO00o;
        if (oooOO0O.f42195OooO0oo != -1) {
            throw new IllegalStateException();
        }
        oooOO0O.f42195OooO0oo = System.currentTimeMillis();
        String str = this.f42179OooO00o.f42197OooOO0O.f21165OooO0O0;
        boolean z = o00oOoo.OooO0O0(str) || str.equals(FirebasePerformance.HttpMethod.DELETE);
        String str2 = this.f42179OooO00o.f42189OooO0O0.f21088OooO0oO == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
        o00000 o00000Var = this.f42180OooO0O0;
        Protocol protocol = o00000Var.f42606OooO0Oo;
        com.squareup.okhttp.Oooo0 oooo0 = o00oo1.f21166OooO0OO;
        ArrayList arrayList = new ArrayList((oooo0.f21113OooO00o.length / 2) + 10);
        arrayList.add(new o0000O0O(o00oo1.f21165OooO0O0, o0000O0O.f42694OooO0o0));
        ByteString byteString = o0000O0O.f42693OooO0o;
        com.squareup.okhttp.o000oOoO o000oooo2 = o00oo1.f21164OooO00o;
        arrayList.add(new o0000O0O(OooOo.OooO00o(o000oooo2), byteString));
        String strOooO0o0 = o000OOo.OooO0o0(o000oooo2);
        if (Protocol.SPDY_3 == protocol) {
            arrayList.add(new o0000O0O(str2, o0000O0O.f42697OooOO0));
            arrayList.add(new o0000O0O(strOooO0o0, o0000O0O.f42691OooO));
        } else {
            if (Protocol.HTTP_2 != protocol) {
                throw new AssertionError();
            }
            arrayList.add(new o0000O0O(strOooO0o0, o0000O0O.f42696OooO0oo));
        }
        arrayList.add(new o0000O0O(o000oooo2.f21121OooO00o, o0000O0O.f42695OooO0oO));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = oooo0.f21113OooO00o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            ByteString byteStringOooO0OO = ByteString.OooO00o.OooO0OO(oooo0.OooO0O0(i2).toLowerCase(Locale.US));
            String strOooO0Oo = oooo0.OooO0Oo(i2);
            if (protocol == Protocol.SPDY_3) {
                zContains = f42177OooO0Oo.contains(byteStringOooO0OO);
            } else {
                if (protocol != Protocol.HTTP_2) {
                    throw new AssertionError(protocol);
                }
                zContains = f42178OooO0o0.contains(byteStringOooO0OO);
            }
            if (!zContains && !byteStringOooO0OO.equals(o0000O0O.f42694OooO0o0) && !byteStringOooO0OO.equals(o0000O0O.f42693OooO0o) && !byteStringOooO0OO.equals(o0000O0O.f42695OooO0oO) && !byteStringOooO0OO.equals(o0000O0O.f42696OooO0oo) && !byteStringOooO0OO.equals(o0000O0O.f42691OooO) && !byteStringOooO0OO.equals(o0000O0O.f42697OooOO0)) {
                if (linkedHashSet.add(byteStringOooO0OO)) {
                    arrayList.add(new o0000O0O(strOooO0Oo, byteStringOooO0OO));
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (((o0000O0O) arrayList.get(i3)).f42698OooO00o.equals(byteStringOooO0OO)) {
                            arrayList.set(i3, new o0000O0O(((o0000O0O) arrayList.get(i3)).f42699OooO0O0.OooOo00() + (char) 0 + strOooO0Oo, byteStringOooO0OO));
                            break;
                        }
                    }
                }
            }
        }
        boolean z2 = !z;
        synchronized (o00000Var.f42623OooOo0O) {
            synchronized (o00000Var) {
                if (o00000Var.f42612OooOO0O) {
                    throw new IOException("shutdown");
                }
                i = o00000Var.f42611OooOO0;
                o00000Var.f42611OooOO0 = i + 2;
                o0000o1 = new o0000O0(i, o00000Var, z2, false, arrayList);
                if (o0000o1.OooO0oO()) {
                    o00000Var.f42609OooO0oO.put(Integer.valueOf(i), o0000o1);
                    o00000Var.OooOOo(false);
                }
            }
            o00000Var.f42623OooOo0O.OooOo0o(z2, false, i, arrayList);
        }
        if (!z) {
            o00000Var.f42623OooOo0O.flush();
        }
        this.f42181OooO0OO = o0000o1;
        o0000o1.f42667OooO.OooO0oO(this.f42179OooO00o.f42188OooO00o.f21161OooOoO, TimeUnit.MILLISECONDS);
    }

    @Override // o0OO.o0OoOo0
    public final o00Ooo.OooO00o OooO0Oo() throws IOException {
        List<o0000O0O> list;
        boolean zContains;
        o0000O0 o0000o1 = this.f42181OooO0OO;
        synchronized (o0000o1) {
            o0000o1.f42667OooO.OooO();
            while (o0000o1.f42672OooO0o == null && o0000o1.f42677OooOO0O == null) {
                try {
                    try {
                        o0000o1.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    o0000o1.f42667OooO.OooOOO0();
                    throw th;
                }
            }
            o0000o1.f42667OooO.OooOOO0();
            list = o0000o1.f42672OooO0o;
            if (list == null) {
                throw new IOException("stream was reset: " + o0000o1.f42677OooOO0O);
            }
        }
        Protocol protocol = this.f42180OooO0O0.f42606OooO0Oo;
        com.squareup.okhttp.Oooo0.OooO00o oooO00o = new com.squareup.okhttp.Oooo0.OooO00o();
        oooO00o.OooO0o(OooOOOO.f42215OooO0Oo, protocol.toString());
        int size = list.size();
        String str = "HTTP/1.1";
        String str2 = null;
        for (int i = 0; i < size; i++) {
            ByteString byteString = list.get(i).f42698OooO00o;
            String strOooOo00 = list.get(i).f42699OooO0O0.OooOo00();
            int i2 = 0;
            while (i2 < strOooOo00.length()) {
                int iIndexOf = strOooOo00.indexOf(0, i2);
                if (iIndexOf == -1) {
                    iIndexOf = strOooOo00.length();
                }
                String strSubstring = strOooOo00.substring(i2, iIndexOf);
                if (byteString.equals(o0000O0O.f42692OooO0Oo)) {
                    str2 = strSubstring;
                } else if (byteString.equals(o0000O0O.f42697OooOO0)) {
                    str = strSubstring;
                } else {
                    if (protocol == Protocol.SPDY_3) {
                        zContains = f42177OooO0Oo.contains(byteString);
                    } else {
                        if (protocol != Protocol.HTTP_2) {
                            throw new AssertionError(protocol);
                        }
                        zContains = f42178OooO0o0.contains(byteString);
                    }
                    if (!zContains) {
                        oooO00o.OooO00o(byteString.OooOo00(), strSubstring);
                    }
                }
                i2 = iIndexOf + 1;
            }
        }
        if (str2 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        o000oOoO o000ooooOooO00o = o000oOoO.OooO00o(str + ZegoConstants.ZegoVideoDataAuxPublishingStream + str2);
        o00Ooo.OooO00o oooO00o2 = new o00Ooo.OooO00o();
        oooO00o2.f21187OooO0O0 = protocol;
        oooO00o2.f21188OooO0OO = o000ooooOooO00o.f42232OooO0O0;
        oooO00o2.f21189OooO0Oo = o000ooooOooO00o.f42233OooO0OO;
        ArrayList arrayList = oooO00o.f21114OooO00o;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        com.squareup.okhttp.Oooo0.OooO00o oooO00o3 = new com.squareup.okhttp.Oooo0.OooO00o();
        Collections.addAll(oooO00o3.f21114OooO00o, strArr);
        oooO00o2.f21190OooO0o = oooO00o3;
        return oooO00o2;
    }

    @Override // o0OO.o0OoOo0
    public final void OooO0o() {
    }

    @Override // o0OO.o0OoOo0
    public final OooOo00 OooO0o0(o00Ooo o00ooo2) throws IOException {
        return new OooOo00(o00ooo2.f21179OooO0o, o0OO.OooO0O0(this.f42181OooO0OO.f42674OooO0oO));
    }

    @Override // o0OO.o0OoOo0
    public final boolean OooO0oO() {
        return true;
    }

    @Override // o0OO.o0OoOo0
    public final void OooO0oo(Oooo000 oooo000) throws IOException {
        o0000O0.OooO00o oooO00oOooO0o = this.f42181OooO0OO.OooO0o();
        oooo000.getClass();
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0OOoo oo0oooo2 = oooo000.f42229OooO0o;
        oo0oooo2.OooOo0(0L, oo0oooo2.f59828OooO0o0, oo0oooo);
        oooO00oOooO0o.write(oo0oooo, oo0oooo.f59828OooO0o0);
    }
}
