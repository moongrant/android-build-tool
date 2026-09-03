package p197o00o0Oo0;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import p176o00o0.o00O0O;
import p191o00o0O0O.OooOo;
import p191o00o0O0O.Oooo0;
import p191o00o0O0O.o000000;
import p191o00o0O0O.o00Oo0;
import p191o00o0O0O.o0Oo0oo;
import p193o00o0OO0.Oooo000;
import p193o00o0OO0.o00oO0o;
import p196o00o0Oo.o00O00;
import p198o00o0OoO.o00;
import p199o00o0Ooo.o00OOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Logger f39056OooO0o = Logger.getLogger(o000000.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00 f39057OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f39058OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo000 f39059OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00 f39060OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOOO0 f39061OooO0o0;

    @Inject
    public o0Oo0oo(Executor executor, Oooo000 oooo000, o00O00 o00o01, o00 o00Var, o00OOOO0 o00oooo1) {
        this.f39058OooO0O0 = executor;
        this.f39059OooO0OO = oooo000;
        this.f39057OooO00o = o00o01;
        this.f39060OooO0Oo = o00Var;
        this.f39061OooO0o0 = o00oooo1;
    }

    @Override // p197o00o0Oo0.oo0o0Oo
    public final void OooO00o(final o00O0O o00o0o2, final OooOo oooOo, final Oooo0 oooo0) {
        this.f39058OooO0O0.execute(new Runnable() { // from class: o00o0Oo0.o0ooOOo
            @Override // java.lang.Runnable
            public final void run() {
                final o0Oo0oo o0oo0oo2 = oooo0;
                o00O0O o00o0o3 = o00o0o2;
                o00Oo0 o00oo1 = oooOo;
                final o0Oo0oo o0oo0oo3 = this.f39062OooO0Oo;
                o0oo0oo3.getClass();
                Logger logger = o0Oo0oo.f39056OooO0o;
                try {
                    o00oO0o o00oo0o2 = o0oo0oo3.f39059OooO0OO.get(o0oo0oo2.OooO0O0());
                    if (o00oo0o2 == null) {
                        String str = String.format("Transport backend '%s' is not registered", o0oo0oo2.OooO0O0());
                        logger.warning(str);
                        o00o0o3.OooO00o(new IllegalArgumentException(str));
                    } else {
                        final OooOo oooOoOooO00o = o00oo0o2.OooO00o(o00oo1);
                        o0oo0oo3.f39061OooO0o0.OooO0OO(new o00OOOO0.OooO00o() { // from class: o00o0Oo0.o0OOO0o
                            @Override // o00o0Ooo.o00OOOO0.OooO00o
                            public final Object OooO0OO() {
                                o0Oo0oo o0oo0oo4 = o0oo0oo3;
                                o00 o00Var = o0oo0oo4.f39060OooO0Oo;
                                o00Oo0 o00oo2 = oooOoOooO00o;
                                o0Oo0oo o0oo0oo5 = o0oo0oo2;
                                o00Var.o0OO00O(o0oo0oo5, o00oo2);
                                o0oo0oo4.f39057OooO00o.OooO0O0(o0oo0oo5, 1);
                                return null;
                            }
                        });
                        o00o0o3.OooO00o(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    o00o0o3.OooO00o(e);
                }
            }
        });
    }
}
