package p338o0OO0ooo;

import com.google.firebase.perf.FirebasePerformance;
import com.qiniu.android.collect.ReportItem;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.o00Ooo;
import com.squareup.okhttp.o0OoOo0;
import com.squareup.okhttp.oo000o;
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
import p336o0OO0oo0.o000oOoO;
import p337o0OO0ooO.Oooo0;
import p337o0OO0ooO.o0OOO0o;
import p337o0OO0ooO.o0ooOOo;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 implements o000O0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<ByteString> f43483OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<ByteString> f43484OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000OO0 f43485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0 f43486OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0ooOOo f43487OooO0OO;

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f43483OooO0Oo = o000oOoO.OooO0o(ByteString.OooO00o.OooO0OO("connection"), ByteString.OooO00o.OooO0OO(ReportItem.RequestKeyHost), ByteString.OooO00o.OooO0OO("keep-alive"), ByteString.OooO00o.OooO0OO("proxy-connection"), ByteString.OooO00o.OooO0OO("transfer-encoding"));
        f43484OooO0o0 = o000oOoO.OooO0o(ByteString.OooO00o.OooO0OO("connection"), ByteString.OooO00o.OooO0OO(ReportItem.RequestKeyHost), ByteString.OooO00o.OooO0OO("keep-alive"), ByteString.OooO00o.OooO0OO("proxy-connection"), ByteString.OooO00o.OooO0OO("te"), ByteString.OooO00o.OooO0OO("transfer-encoding"), ByteString.OooO00o.OooO0OO("encoding"), ByteString.OooO00o.OooO0OO("upgrade"));
    }

    public o0000O0(o0000OO0 o0000oo1, Oooo0 oooo0) {
        this.f43485OooO00o = o0000oo1;
        this.f43486OooO0O0 = oooo0;
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO00o() throws IOException {
        this.f43487OooO0OO.OooO0o().close();
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final o00O000 OooO0O0(o00Ooo o00ooo2, long j) throws IOException {
        return this.f43487OooO0OO.OooO0o();
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO0OO(o00Ooo o00ooo2) throws IOException {
        int i;
        o0ooOOo o0ooooo;
        boolean zContains;
        if (this.f43487OooO0OO != null) {
            return;
        }
        o0000OO0 o0000oo1 = this.f43485OooO00o;
        if (o0000oo1.f43497OooO0oo != -1) {
            throw new IllegalStateException();
        }
        o0000oo1.f43497OooO0oo = System.currentTimeMillis();
        String str = this.f43485OooO00o.f43499OooOO0O.f21621OooO0O0;
        boolean z = o000O000.OooO0O0(str) || str.equals(FirebasePerformance.HttpMethod.DELETE);
        String str2 = this.f43485OooO00o.f43491OooO0O0.f21561OooO0oO == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
        Oooo0 oooo0 = this.f43486OooO0O0;
        Protocol protocol = oooo0.f43333OooO0Oo;
        com.squareup.okhttp.o000oOoO o000oooo2 = o00ooo2.f21622OooO0OO;
        ArrayList arrayList = new ArrayList((o000oooo2.f21591OooO00o.length / 2) + 10);
        arrayList.add(new o0OOO0o(o00ooo2.f21621OooO0O0, o0OOO0o.f43422OooO0o0));
        ByteString byteString = o0OOO0o.f43421OooO0o;
        o0OoOo0 o0oooo0 = o00ooo2.f21620OooO00o;
        arrayList.add(new o0OOO0o(o000O00O.OooO00o(o0oooo0), byteString));
        String strOooO0o0 = o000oOoO.OooO0o0(o0oooo0);
        if (Protocol.SPDY_3 == protocol) {
            arrayList.add(new o0OOO0o(str2, o0OOO0o.f43425OooOO0));
            arrayList.add(new o0OOO0o(strOooO0o0, o0OOO0o.f43419OooO));
        } else {
            if (Protocol.HTTP_2 != protocol) {
                throw new AssertionError();
            }
            arrayList.add(new o0OOO0o(strOooO0o0, o0OOO0o.f43424OooO0oo));
        }
        arrayList.add(new o0OOO0o(o0oooo0.f21631OooO00o, o0OOO0o.f43423OooO0oO));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = o000oooo2.f21591OooO00o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            ByteString byteStringOooO0OO = ByteString.OooO00o.OooO0OO(o000oooo2.OooO0O0(i2).toLowerCase(Locale.US));
            String strOooO0Oo = o000oooo2.OooO0Oo(i2);
            if (protocol == Protocol.SPDY_3) {
                zContains = f43483OooO0Oo.contains(byteStringOooO0OO);
            } else {
                if (protocol != Protocol.HTTP_2) {
                    throw new AssertionError(protocol);
                }
                zContains = f43484OooO0o0.contains(byteStringOooO0OO);
            }
            if (!zContains && !byteStringOooO0OO.equals(o0OOO0o.f43422OooO0o0) && !byteStringOooO0OO.equals(o0OOO0o.f43421OooO0o) && !byteStringOooO0OO.equals(o0OOO0o.f43423OooO0oO) && !byteStringOooO0OO.equals(o0OOO0o.f43424OooO0oo) && !byteStringOooO0OO.equals(o0OOO0o.f43419OooO) && !byteStringOooO0OO.equals(o0OOO0o.f43425OooOO0)) {
                if (linkedHashSet.add(byteStringOooO0OO)) {
                    arrayList.add(new o0OOO0o(strOooO0Oo, byteStringOooO0OO));
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (((o0OOO0o) arrayList.get(i3)).f43426OooO00o.equals(byteStringOooO0OO)) {
                            arrayList.set(i3, new o0OOO0o(((o0OOO0o) arrayList.get(i3)).f43427OooO0O0.OooOo00() + (char) 0 + strOooO0Oo, byteStringOooO0OO));
                            break;
                        }
                    }
                }
            }
        }
        boolean z2 = !z;
        synchronized (oooo0.f43350OooOo0O) {
            synchronized (oooo0) {
                if (oooo0.f43339OooOO0O) {
                    throw new IOException("shutdown");
                }
                i = oooo0.f43338OooOO0;
                oooo0.f43338OooOO0 = i + 2;
                o0ooooo = new o0ooOOo(i, oooo0, z2, false, arrayList);
                if (o0ooooo.OooO0oO()) {
                    oooo0.f43336OooO0oO.put(Integer.valueOf(i), o0ooooo);
                    oooo0.OooOOo0(false);
                }
            }
            oooo0.f43350OooOo0O.OooOo0o(z2, false, i, arrayList);
        }
        if (!z) {
            oooo0.f43350OooOo0O.flush();
        }
        this.f43487OooO0OO = o0ooooo;
        o0ooooo.f43443OooO.OooO0oO(this.f43485OooO00o.f43490OooO00o.f21617OooOoO, TimeUnit.MILLISECONDS);
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final oo000o.OooO00o OooO0Oo() throws IOException {
        List<o0OOO0o> list;
        boolean zContains;
        o0ooOOo o0ooooo = this.f43487OooO0OO;
        synchronized (o0ooooo) {
            o0ooooo.f43443OooO.OooO();
            while (o0ooooo.f43448OooO0o == null && o0ooooo.f43453OooOO0O == null) {
                try {
                    try {
                        o0ooooo.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    o0ooooo.f43443OooO.OooOOO0();
                    throw th;
                }
            }
            o0ooooo.f43443OooO.OooOOO0();
            list = o0ooooo.f43448OooO0o;
            if (list == null) {
                throw new IOException("stream was reset: " + o0ooooo.f43453OooOO0O);
            }
        }
        Protocol protocol = this.f43486OooO0O0.f43333OooO0Oo;
        com.squareup.okhttp.o000oOoO.OooO00o oooO00o = new com.squareup.okhttp.o000oOoO.OooO00o();
        oooO00o.OooO0o(o000Oo0.f43558OooO0Oo, protocol.toString());
        int size = list.size();
        String str = "HTTP/1.1";
        String str2 = null;
        for (int i = 0; i < size; i++) {
            ByteString byteString = list.get(i).f43426OooO00o;
            String strOooOo00 = list.get(i).f43427OooO0O0.OooOo00();
            int i2 = 0;
            while (i2 < strOooOo00.length()) {
                int iIndexOf = strOooOo00.indexOf(0, i2);
                if (iIndexOf == -1) {
                    iIndexOf = strOooOo00.length();
                }
                String strSubstring = strOooOo00.substring(i2, iIndexOf);
                if (byteString.equals(o0OOO0o.f43420OooO0Oo)) {
                    str2 = strSubstring;
                } else if (byteString.equals(o0OOO0o.f43425OooOO0)) {
                    str = strSubstring;
                } else {
                    if (protocol == Protocol.SPDY_3) {
                        zContains = f43483OooO0Oo.contains(byteString);
                    } else {
                        if (protocol != Protocol.HTTP_2) {
                            throw new AssertionError(protocol);
                        }
                        zContains = f43484OooO0o0.contains(byteString);
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
        o000OO0O o000oo0oOooO00o = o000OO0O.OooO00o(str + ZegoConstants.ZegoVideoDataAuxPublishingStream + str2);
        oo000o.OooO00o oooO00o2 = new oo000o.OooO00o();
        oooO00o2.f21663OooO0O0 = protocol;
        oooO00o2.f21664OooO0OO = o000oo0oOooO00o.f43553OooO0O0;
        oooO00o2.f21665OooO0Oo = o000oo0oOooO00o.f43554OooO0OO;
        ArrayList arrayList = oooO00o.f21592OooO00o;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        com.squareup.okhttp.o000oOoO.OooO00o oooO00o3 = new com.squareup.okhttp.o000oOoO.OooO00o();
        Collections.addAll(oooO00o3.f21592OooO00o, strArr);
        oooO00o2.f21666OooO0o = oooO00o3;
        return oooO00o2;
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO0o() {
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final o000O00 OooO0o0(oo000o oo000oVar) throws IOException {
        return new o000O00(oo000oVar.f21655OooO0o, o000O0Oo.OooO0O0(this.f43487OooO0OO.f43450OooO0oO));
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final boolean OooO0oO() {
        return true;
    }

    @Override // p338o0OO0ooo.o000O0O0
    public final void OooO0oo(o000O0 o000o0) throws IOException {
        o0ooOOo.OooO00o oooO00oOooO0o = this.f43487OooO0OO.OooO0o();
        o000o0.getClass();
        o00000O o00000o = new o00000O();
        o00000O o00000o2 = o000o0.f43511OooO0o;
        o00000o2.OooOo0(0L, o00000o2.f60177OooO0o0, o00000o);
        oooO00oOooO0o.write(o00000o, o00000o.f60177OooO0o0);
    }
}
