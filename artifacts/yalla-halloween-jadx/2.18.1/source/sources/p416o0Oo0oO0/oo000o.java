package p416o0Oo0oO0;

import com.qiniu.android.collect.ReportItem;
import com.squareup.okhttp.Protocol;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import p412o0Oo0o00.o000O000;
import p412o0Oo0o00.o000O0o;
import p412o0Oo0o00.o000OO;
import p412o0Oo0o00.o000Oo0;
import p413o0Oo0o0O.o000000;
import p414o0Oo0o0o.o00000O0;
import p414o0Oo0o0o.o0000O0O;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00o00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o00000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<ByteString> f39645OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<ByteString> f39646OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f39647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0 f39648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000O0O f39649OooO0OO;

    static {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        f39645OooO0Oo = o000000.OooO(oooO00o.OooO0OO("connection"), oooO00o.OooO0OO(ReportItem.RequestKeyHost), oooO00o.OooO0OO("keep-alive"), oooO00o.OooO0OO("proxy-connection"), oooO00o.OooO0OO("transfer-encoding"));
        f39646OooO0o0 = o000000.OooO(oooO00o.OooO0OO("connection"), oooO00o.OooO0OO(ReportItem.RequestKeyHost), oooO00o.OooO0OO("keep-alive"), oooO00o.OooO0OO("proxy-connection"), oooO00o.OooO0OO("te"), oooO00o.OooO0OO("transfer-encoding"), oooO00o.OooO0OO("encoding"), oooO00o.OooO0OO("upgrade"));
    }

    public oo000o(o0Oo0oo o0oo0oo2, o00000O0 o00000o1) {
        this.f39647OooO00o = o0oo0oo2;
        this.f39648OooO0O0 = o00000o1;
    }

    public static boolean OooO(Protocol protocol, ByteString byteString) {
        if (protocol == Protocol.SPDY_3) {
            return f39645OooO0Oo.contains(byteString);
        }
        if (protocol == Protocol.HTTP_2) {
            return f39646OooO0o0.contains(byteString);
        }
        throw new AssertionError(protocol);
    }

    @Override // p416o0Oo0oO0.o00000O
    public final void OooO00o() throws IOException {
        ((o0000O0O.OooO00o) this.f39649OooO0OO.OooO0o()).close();
    }

    @Override // p416o0Oo0oO0.o00000O
    public final void OooO0O0() {
    }

    @Override // p416o0Oo0oO0.o00000O
    public final o0O00o00 OooO0OO(o000O000 o000o001, long j) throws IOException {
        return this.f39649OooO0OO.OooO0o();
    }

    @Override // p416o0Oo0oO0.o00000O
    public final void OooO0Oo(o000000O o000000o2) throws IOException {
        o000000o2.OooO00o(this.f39649OooO0OO.OooO0o());
    }

    @Override // p416o0Oo0oO0.o00000O
    public final o000Oo0 OooO0o(o000O0o o000o0o2) throws IOException {
        return new o000OOo(o000o0o2.f39317OooO0o, o0O000Oo.OooO0OO(this.f39649OooO0OO.f39490OooO0oO));
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    @Override // p416o0Oo0oO0.o00000O
    public final void OooO0o0(o000O000 o000o001) throws IOException {
        int i;
        o0000O0O o0000o0o2;
        if (this.f39649OooO0OO != null) {
            return;
        }
        this.f39647OooO00o.OooOOO();
        boolean zOooO0o0 = this.f39647OooO00o.OooO0o0();
        String str = this.f39647OooO00o.f39600OooO0O0.f39208OooO0oO == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
        o00000O0 o00000o1 = this.f39648OooO0O0;
        Protocol protocol = o00000o1.f39435Oooo0o;
        o000OO o000oo2 = o000o001.f39304OooO0OO;
        ArrayList arrayList = new ArrayList((o000oo2.f39333OooO00o.length / 2) + 10);
        arrayList.add(new p414o0Oo0o0o.o000OO(p414o0Oo0o0o.o000OO.f39553OooO0o0, o000o001.f39303OooO0O0));
        arrayList.add(new p414o0Oo0o0o.o000OO(p414o0Oo0o0o.o000OO.f39552OooO0o, o000000.OooO00o(o000o001.f39302OooO00o)));
        String strOooO0oO = o000000.OooO0oO(o000o001.f39302OooO00o);
        if (Protocol.SPDY_3 == protocol) {
            arrayList.add(new p414o0Oo0o0o.o000OO(p414o0Oo0o0o.o000OO.f39556OooOO0, str));
            arrayList.add(new p414o0Oo0o0o.o000OO(p414o0Oo0o0o.o000OO.f39550OooO, strOooO0oO));
        } else {
            if (Protocol.HTTP_2 != protocol) {
                throw new AssertionError();
            }
            arrayList.add(new p414o0Oo0o0o.o000OO(p414o0Oo0o0o.o000OO.f39555OooO0oo, strOooO0oO));
        }
        arrayList.add(new p414o0Oo0o0o.o000OO(p414o0Oo0o0o.o000OO.f39554OooO0oO, o000o001.f39302OooO00o.f39259OooO00o));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = o000oo2.f39333OooO00o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            ByteString byteStringOooO0Oo = ByteString.OooO0Oo(o000oo2.OooO0O0(i2).toLowerCase(Locale.US));
            String strOooO0Oo = o000oo2.OooO0Oo(i2);
            if (!OooO(protocol, byteStringOooO0Oo) && !byteStringOooO0Oo.equals(p414o0Oo0o0o.o000OO.f39553OooO0o0) && !byteStringOooO0Oo.equals(p414o0Oo0o0o.o000OO.f39552OooO0o) && !byteStringOooO0Oo.equals(p414o0Oo0o0o.o000OO.f39554OooO0oO) && !byteStringOooO0Oo.equals(p414o0Oo0o0o.o000OO.f39555OooO0oo) && !byteStringOooO0Oo.equals(p414o0Oo0o0o.o000OO.f39550OooO) && !byteStringOooO0Oo.equals(p414o0Oo0o0o.o000OO.f39556OooOO0)) {
                if (linkedHashSet.add(byteStringOooO0Oo)) {
                    arrayList.add(new p414o0Oo0o0o.o000OO(byteStringOooO0Oo, strOooO0Oo));
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (((p414o0Oo0o0o.o000OO) arrayList.get(i3)).f39557OooO00o.equals(byteStringOooO0Oo)) {
                            arrayList.set(i3, new p414o0Oo0o0o.o000OO(byteStringOooO0Oo, ((p414o0Oo0o0o.o000OO) arrayList.get(i3)).f39558OooO0O0.OooOOO() + (char) 0 + strOooO0Oo));
                            break;
                        }
                    }
                }
            }
        }
        boolean z = !zOooO0o0;
        synchronized (o00000o1.f39451OooooOO) {
            synchronized (o00000o1) {
                if (o00000o1.f39438OoooO) {
                    throw new IOException("shutdown");
                }
                i = o00000o1.f39441OoooO0O;
                o00000o1.f39441OoooO0O = i + 2;
                o0000o0o2 = new o0000O0O(i, o00000o1, z, false, arrayList);
                if (o0000o0o2.OooO0oO()) {
                    o00000o1.f39434Oooo.put(Integer.valueOf(i), o0000o0o2);
                    o00000o1.OooO0oo(false);
                }
            }
            o00000o1.f39451OooooOO.Oooooo(z, false, i, arrayList);
        }
        if (!zOooO0o0) {
            o00000o1.f39451OooooOO.flush();
        }
        this.f39649OooO0OO = o0000o0o2;
        o0000o0o2.f39483OooO.OooO0oO(this.f39647OooO00o.f39599OooO00o.f39198OoooooO, TimeUnit.MILLISECONDS);
    }

    @Override // p416o0Oo0oO0.o00000O
    public final o000O0o.OooO00o OooO0oO() throws IOException {
        List<p414o0Oo0o0o.o000OO> list;
        o0000O0O o0000o0o2 = this.f39649OooO0OO;
        synchronized (o0000o0o2) {
            o0000o0o2.f39483OooO.OooO();
            while (o0000o0o2.f39488OooO0o == null && o0000o0o2.f39493OooOO0O == null) {
                try {
                    try {
                        o0000o0o2.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    o0000o0o2.f39483OooO.OooOOO0();
                    throw th;
                }
            }
            o0000o0o2.f39483OooO.OooOOO0();
            list = o0000o0o2.f39488OooO0o;
            if (list == null) {
                throw new IOException("stream was reset: " + o0000o0o2.f39493OooOO0O);
            }
        }
        Protocol protocol = this.f39648OooO0O0.f39435Oooo0o;
        o000OO.OooO00o oooO00o = new o000OO.OooO00o();
        oooO00o.OooO0oO(o0O0O00.f39588OooO0Oo, protocol.toString());
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i = 0; i < size; i++) {
            ByteString byteString = list.get(i).f39557OooO00o;
            String strOooOOO = list.get(i).f39558OooO0O0.OooOOO();
            int i2 = 0;
            while (i2 < strOooOOO.length()) {
                int iIndexOf = strOooOOO.indexOf(0, i2);
                if (iIndexOf == -1) {
                    iIndexOf = strOooOOO.length();
                }
                String strSubstring = strOooOOO.substring(i2, iIndexOf);
                if (byteString.equals(p414o0Oo0o0o.o000OO.f39551OooO0Oo)) {
                    str = strSubstring;
                } else if (byteString.equals(p414o0Oo0o0o.o000OO.f39556OooOO0)) {
                    str2 = strSubstring;
                } else if (!OooO(protocol, byteString)) {
                    oooO00o.OooO00o(byteString.OooOOO(), strSubstring);
                }
                i2 = iIndexOf + 1;
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        o00000O0 o00000o0OooO00o = o00000O0.OooO00o(str2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
        o000O0o.OooO00o oooO00o2 = new o000O0o.OooO00o();
        oooO00o2.f39325OooO0O0 = protocol;
        oooO00o2.f39326OooO0OO = o00000o0OooO00o.f39576OooO0O0;
        oooO00o2.f39327OooO0Oo = o00000o0OooO00o.f39577OooO0OO;
        oooO00o2.f39328OooO0o = oooO00o.OooO0Oo().OooO0OO();
        return oooO00o2;
    }

    @Override // p416o0Oo0oO0.o00000O
    public final boolean OooO0oo() {
        return true;
    }
}
