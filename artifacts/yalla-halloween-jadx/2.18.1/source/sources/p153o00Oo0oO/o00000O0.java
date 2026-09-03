package p153o00Oo0oO;

import java.util.Objects;
import p144o00Oo.OooO0o;
import p158o00OoO0o.OooO0O0;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile o00000O0 f32198OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OO f32199OooO00o = new o00OO(new o00OO.OooO00o());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f32200OooO0O0 = OooO0O0.f32362OooO00o;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f32201Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f32202Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0ooO f32203Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Exception f32204Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f32205OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f32206OoooO00;

        public OooO00o(OooO0o oooO0o, o0O0ooO o0o0ooo, Exception exc, int i, int i2, String str) {
            this.f32202Oooo0o = oooO0o;
            this.f32203Oooo0oO = o0o0ooo;
            this.f32204Oooo0oo = exc;
            this.f32201Oooo = i;
            this.f32206OoooO00 = i2;
            this.f32205OoooO0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f32202Oooo0o.OooO00o(this.f32204Oooo0oo);
            Objects.requireNonNull(this.f32202Oooo0o);
            this.f32202Oooo0o.OooO0OO(this.f32206OoooO00, this.f32205OoooO0, this.f32201Oooo);
        }
    }

    public static o00000O0 OooO0O0() {
        if (f32198OooO0OO == null) {
            synchronized (o00000O0.class) {
                if (f32198OooO0OO == null) {
                    f32198OooO0OO = new o00000O0();
                }
            }
        }
        return f32198OooO0OO;
    }

    public final void OooO00o(Object obj) {
        for (o0O0ooO o0o0ooo : this.f32199OooO00o.f51320Oooo0o.OooO0Oo()) {
            if (obj.equals(o0o0ooo.OooO00o().OooO0OO())) {
                o0o0ooo.cancel();
            }
        }
        for (o0O0ooO o0o0ooo2 : this.f32199OooO00o.f51320Oooo0o.OooO0o0()) {
            if (obj.equals(o0o0ooo2.OooO00o().OooO0OO())) {
                o0o0ooo2.cancel();
            }
        }
    }

    public final void OooO0OO(o0O0ooO o0o0ooo, Exception exc, OooO0o oooO0o, int i, String str, int i2) {
        if (oooO0o == null) {
            return;
        }
        OooO0O0 oooO0O0 = this.f32200OooO0O0;
        oooO0O0.OooO00o().execute(new OooO00o(oooO0o, o0o0ooo, exc, i2, i, str));
    }
}
