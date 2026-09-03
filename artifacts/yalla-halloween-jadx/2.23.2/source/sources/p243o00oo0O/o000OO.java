package p243o00oo0O;

import androidx.media3.session.o000Oo0;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import p233o00oOoOO.o0O00O0o;
import p238o00oOooo.o0O0OOOo;
import p238o00oOooo.o0O0o000;
import p238o00oOooo.o0O0oo00;
import p238o00oOooo.o0OO00OO;
import p238o00oOooo.o0OOooO0;
import p242o00oo00O.o000000O;
import p246o00oo0Oo.o000O0;
import p247o00oo0o.o000O00;
import p248o00oo0o0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO implements o0000OO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Logger f40088OooO0o = Logger.getLogger(o0OOooO0.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0 f40089OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f40090OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000000O f40091OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000oo f40092OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O00 f40093OooO0o0;

    @Inject
    public o000OO(Executor executor, o000000O o000000o2, o000O0 o000o0, o0000oo o0000ooVar, o000O00 o000o01) {
        this.f40090OooO0O0 = executor;
        this.f40091OooO0OO = o000000o2;
        this.f40089OooO00o = o000o0;
        this.f40092OooO0Oo = o0000ooVar;
        this.f40093OooO0o0 = o000o01;
    }

    @Override // p243o00oo0O.o0000OO0
    public final void OooO00o(final o0O00O0o o0o00o0o, final o0O0OOOo o0o0oooo, final o0O0o000 o0o0o000) {
        this.f40090OooO0O0.execute(new Runnable() { // from class: o00oo0O.o0000O0O
            @Override // java.lang.Runnable
            public final void run() {
                o0OO00OO o0oo00oo2 = o0o0o000;
                o0O00O0o o0o00o0o2 = o0o00o0o;
                o0O0oo00 o0o0oo00 = o0o0oooo;
                o000OO o000oo2 = this.f40083OooO0Oo;
                o000oo2.getClass();
                Logger logger = o000OO.f40088OooO0o;
                try {
                    p242o00oo00O.o0000oo o0000ooVar = o000oo2.f40091OooO0OO.get(o0oo00oo2.OooO0O0());
                    if (o0000ooVar == null) {
                        String str = String.format("Transport backend '%s' is not registered", o0oo00oo2.OooO0O0());
                        logger.warning(str);
                        o0o00o0o2.OooO00o(new IllegalArgumentException(str));
                    } else {
                        o000oo2.f40093OooO0o0.OooO0OO(new o000Oo0(o000oo2, o0oo00oo2, o0000ooVar.OooO00o(o0o0oo00)));
                        o0o00o0o2.OooO00o(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    o0o00o0o2.OooO00o(e);
                }
            }
        });
    }
}
