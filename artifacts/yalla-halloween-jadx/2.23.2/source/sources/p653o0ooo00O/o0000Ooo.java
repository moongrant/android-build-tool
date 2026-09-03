package p653o0ooo00O;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000Ooo implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000Ooo f59362OooO00o = new o0000Ooo();

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O chain2 = (o000O) chain;
        o0000O0 o0000o1 = chain2.f59396OooO00o;
        o0000o1.getClass();
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (o0000o1) {
            if (!o0000o1.f59317OooOOo) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!o0000o1.f59318OooOOo0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!o0000o1.f59316OooOOOo)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        o0000oo o0000ooVar = o0000o1.f59312OooOO0o;
        Intrinsics.checkNotNull(o0000ooVar);
        o0OoO00O client = o0000o1.f59305OooO0Oo;
        o0000ooVar.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            o0000O00 o0000o00 = new o0000O00(o0000o1, o0000o1.f59309OooO0oo, o0000ooVar, o0000ooVar.OooO00o(chain2.f59400OooO0o, chain2.f59402OooO0oO, chain2.f59403OooO0oo, client.f57910OooOooO, client.f57884OooO, !Intrinsics.areEqual(chain2.f59401OooO0o0.f57829OooO0O0, "GET")).OooOO0O(client, chain2));
            o0000o1.f59315OooOOOO = o0000o00;
            o0000o1.f59321OooOo00 = o0000o00;
            synchronized (o0000o1) {
                o0000o1.f59316OooOOOo = true;
                o0000o1.f59318OooOOo0 = true;
            }
            if (o0000o1.f59319OooOOoo) {
                throw new IOException("Canceled");
            }
            return o000O.OooO0Oo(chain2, 0, o0000o00, null, 61).OooO0OO(chain2.f59401OooO0o0);
        } catch (IOException e) {
            o0000ooVar.OooO0OO(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            o0000ooVar.OooO0OO(e2.f60180OooO0o0);
            throw e2;
        }
    }
}
