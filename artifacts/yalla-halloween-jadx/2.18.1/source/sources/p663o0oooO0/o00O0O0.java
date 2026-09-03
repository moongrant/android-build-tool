package p663o0oooO0;

import com.qiniu.android.http.request.Request;
import java.io.IOException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOOO0;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O0 f51721OooO00o = new o00O0O0();

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        oOo00o0o chain2 = (oOo00o0o) chain;
        o00O0OO o00o0oo2 = chain2.f51880OooO0O0;
        Objects.requireNonNull(o00o0oo2);
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (o00o0oo2) {
            if (!o00o0oo2.f51736OoooOOo) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!o00o0oo2.f51735OoooOOO)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!o00o0oo2.f51743o000oOoO)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        oo0o0O0 oo0o0o0 = o00o0oo2.f51731OoooO0;
        Intrinsics.checkNotNull(oo0o0o0);
        o00OO client = o00o0oo2.f51740Ooooo00;
        Objects.requireNonNull(oo0o0o0);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            o00O0OO0 o00o0oo1 = new o00O0OO0(o00o0oo2, o00o0oo2.f51728Oooo0oO, oo0o0o0, oo0o0o0.OooO00o(chain2.f51885OooO0oO, chain2.f51886OooO0oo, chain2.f51878OooO, client.f51344o00Oo0, client.f51324OoooO0, !Intrinsics.areEqual(chain2.f51883OooO0o.f51426OooO0OO, Request.HttpMethodGet)).OooOO0o(client, chain2));
            o00o0oo2.f51734OoooOO0 = o00o0oo1;
            o00o0oo2.f51738OoooOoO = o00o0oo1;
            synchronized (o00o0oo2) {
                o00o0oo2.f51743o000oOoO = true;
                o00o0oo2.f51735OoooOOO = true;
            }
            if (o00o0oo2.f51737OoooOo0) {
                throw new IOException("Canceled");
            }
            return oOo00o0o.OooO0Oo(chain2, 0, o00o0oo1, null, 61).OooO0O0(chain2.f51883OooO0o);
        } catch (IOException e) {
            oo0o0o0.OooO0OO(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            oo0o0o0.OooO0OO(e2.f53032Oooo0o);
            throw e2;
        }
    }
}
