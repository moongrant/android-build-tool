package p412o0Oo0o00;

import com.android.billingclient.api.o00000;
import com.qiniu.android.http.ResponseInfo;
import com.squareup.okhttp.Protocol;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p413o0Oo0o0O.o000000;
import p413o0Oo0o0O.o0O0O00;
import p413o0Oo0o0O.o0OO00O;
import p413o0Oo0o0O.o0OOO0o;
import p413o0Oo0o0O.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class o000 implements Cloneable {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static SSLSocketFactory f39174o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final List<Protocol> f39175o0OoOo0 = o000000.OooO(Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final List<o0000oo> f39176ooOO = o000000.OooO(o0000oo.f39289OooO0o0, o0000oo.f39288OooO0o, o0000oo.f39290OooO0oO);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public List<Protocol> f39177Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00000 f39178Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0000O0 f39179Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Proxy f39180Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ProxySelector f39181OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final List<o0000OO0> f39182OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public List<o0000oo> f39183OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final List<o0000OO0> f39184OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public CookieHandler f39185OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public o000000O f39186OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public SocketFactory f39187OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public SSLSocketFactory f39188OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public HostnameVerifier f39189OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public o00000OO f39190OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public o000000 f39191Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public o0000O00 f39192Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public o0OO00O f39193OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f39194OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f39195OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f39196Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f39197Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f39198OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f39199Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o0OOO0o f39200o000oOoO;

    public static class OooO00o extends o0ooOOo {
        public final void OooO00o(o0000O00 o0000o00, o0000 o0000Var) {
            boolean z;
            Objects.requireNonNull(o0000o00);
            if (o0000Var.OooO0OO()) {
                return;
            }
            synchronized (o0000Var.f39202OooO00o) {
                if (o0000Var.f39211OooOO0O == null) {
                    z = false;
                } else {
                    o0000Var.f39211OooOO0O = null;
                    z = true;
                }
            }
            if (z) {
                if (!o0000Var.OooO0O0()) {
                    o000000.OooO0Oo(o0000Var.f39204OooO0OO);
                    return;
                }
                try {
                    o0O0O00.f39356OooO00o.OooO0oO(o0000Var.f39204OooO0OO);
                    synchronized (o0000o00) {
                        o0000o00.OooO00o(o0000Var);
                        o0000Var.f39210OooOO0++;
                        if (o0000Var.f39206OooO0o != null) {
                            throw new IllegalStateException("framedConnection != null");
                        }
                        o0000Var.f39209OooO0oo = System.nanoTime();
                    }
                } catch (SocketException e) {
                    o0O0O00.f39356OooO00o.OooO0o0("Unable to untagSocket(): " + e);
                    o000000.OooO0Oo(o0000Var.f39204OooO0OO);
                }
            }
        }
    }

    static {
        o0ooOOo.f39374OooO0O0 = new OooO00o();
    }

    public o000() {
        this.f39182OoooO0 = new ArrayList();
        this.f39184OoooO0O = new ArrayList();
        this.f39194OooooOO = true;
        this.f39195OooooOo = true;
        this.f39197Oooooo0 = true;
        this.f39196Oooooo = ResponseInfo.UnknownError;
        this.f39198OoooooO = ResponseInfo.UnknownError;
        this.f39199Ooooooo = ResponseInfo.UnknownError;
        this.f39178Oooo0o = new o00000();
        this.f39179Oooo0oO = new o0000O0();
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o000(this);
    }

    public o000(o000 o000Var) {
        ArrayList arrayList = new ArrayList();
        this.f39182OoooO0 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f39184OoooO0O = arrayList2;
        this.f39194OooooOO = true;
        this.f39195OooooOo = true;
        this.f39197Oooooo0 = true;
        this.f39196Oooooo = ResponseInfo.UnknownError;
        this.f39198OoooooO = ResponseInfo.UnknownError;
        this.f39199Ooooooo = ResponseInfo.UnknownError;
        this.f39178Oooo0o = o000Var.f39178Oooo0o;
        this.f39179Oooo0oO = o000Var.f39179Oooo0oO;
        this.f39180Oooo0oo = o000Var.f39180Oooo0oo;
        this.f39177Oooo = o000Var.f39177Oooo;
        this.f39183OoooO00 = o000Var.f39183OoooO00;
        arrayList.addAll(o000Var.f39182OoooO0);
        arrayList2.addAll(o000Var.f39184OoooO0O);
        this.f39181OoooO = o000Var.f39181OoooO;
        this.f39185OoooOO0 = o000Var.f39185OoooOO0;
        o000000O o000000o2 = o000Var.f39186OoooOOO;
        this.f39186OoooOOO = o000000o2;
        this.f39200o000oOoO = o000000o2 != null ? o000000o2.f39213OooO00o : o000Var.f39200o000oOoO;
        this.f39187OoooOOo = o000Var.f39187OoooOOo;
        this.f39188OoooOo0 = o000Var.f39188OoooOo0;
        this.f39189OoooOoO = o000Var.f39189OoooOoO;
        this.f39190OoooOoo = o000Var.f39190OoooOoo;
        this.f39191Ooooo00 = o000Var.f39191Ooooo00;
        this.f39192Ooooo0o = o000Var.f39192Ooooo0o;
        this.f39193OooooO0 = o000Var.f39193OooooO0;
        this.f39194OooooOO = o000Var.f39194OooooOO;
        this.f39195OooooOo = o000Var.f39195OooooOo;
        this.f39197Oooooo0 = o000Var.f39197Oooooo0;
        this.f39196Oooooo = o000Var.f39196Oooooo;
        this.f39198OoooooO = o000Var.f39198OoooooO;
        this.f39199Ooooooo = o000Var.f39199Ooooooo;
    }
}
