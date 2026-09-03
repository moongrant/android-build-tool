package o0O0OOO0;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import o0O0OOO.o00O0O;
import p286o0O0O0oO.o000000;
import p286o0O0O0oO.o0OO00O;
import p286o0O0O0oO.oo000o;
import p287o0O0O0oo.o0000OO0;
import p287o0O0O0oo.o0000Ooo;
import p288o0O0OOo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Logger f35617OooO0o = Logger.getLogger(o000000.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O f35618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f35619OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000Ooo f35620OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0OOOo.OooO0o f35621OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo0 f35622OooO0o0;

    @Inject
    public OooO0OO(Executor executor, o0000Ooo o0000ooo, o00O0O o00o0o2, o0O0OOOo.OooO0o oooO0o, o00Oo0 o00oo1) {
        this.f35619OooO0O0 = executor;
        this.f35620OooO0OO = o0000ooo;
        this.f35618OooO00o = o00o0o2;
        this.f35621OooO0Oo = oooO0o;
        this.f35622OooO0o0 = o00oo1;
    }

    @Override // o0O0OOO0.OooO
    public final void OooO00o(final o0OO00O o0oo00o2, final oo000o oo000oVar, final o0O0O0Oo.OooOO0O oooOO0O) {
        this.f35619OooO0O0.execute(new Runnable() { // from class: o0O0OOO0.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                final OooO0OO oooO0OO = this.f35611Oooo0o;
                final o0OO00O o0oo00o3 = o0oo00o2;
                o0O0O0Oo.OooOO0O oooOO0O2 = oooOO0O;
                oo000o oo000oVar2 = oo000oVar;
                Objects.requireNonNull(oooO0OO);
                try {
                    o0000OO0 o0000oo1 = oooO0OO.f35620OooO0OO.get(o0oo00o3.OooO0O0());
                    if (o0000oo1 == null) {
                        String str = String.format("Transport backend '%s' is not registered", o0oo00o3.OooO0O0());
                        OooO0OO.f35617OooO0o.warning(str);
                        oooOO0O2.OooO0O0(new IllegalArgumentException(str));
                    } else {
                        final oo000o oo000oVarOooO00o = o0000oo1.OooO00o(oo000oVar2);
                        oooO0OO.f35622OooO0o0.OooO0O0(new o00Oo0.OooO00o() { // from class: o0O0OOO0.OooO0O0
                            @Override // o0O0OOo.o00Oo0.OooO00o
                            public final Object OooO0O0() {
                                OooO0OO oooO0OO2 = oooO0OO;
                                o0OO00O o0oo00o4 = o0oo00o3;
                                oooO0OO2.f35621OooO0Oo.o0OOO0o(o0oo00o4, oo000oVarOooO00o);
                                oooO0OO2.f35618OooO00o.OooO00o(o0oo00o4, 1);
                                return null;
                            }
                        });
                        oooOO0O2.OooO0O0(null);
                    }
                } catch (Exception e) {
                    Logger logger = OooO0OO.f35617OooO0o;
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error scheduling event ");
                    sbOooO0o0.append(e.getMessage());
                    logger.warning(sbOooO0o0.toString());
                    oooOO0O2.OooO0O0(e);
                }
            }
        });
    }
}
