package p102o000oo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.OverwritingInputMerger;
import java.util.UUID;
import o00O0000.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends o0OOO0o {

    public static final class OooO00o extends o0OOO0o.OooO00o<OooO00o, o00O0O> {
        public OooO00o() {
            this.f29819OooO0O0.f30155OooO0Oo = OverwritingInputMerger.class.getName();
        }
    }

    public o00O0O(OooO00o oooO00o) {
        super(oooO00o.f29818OooO00o, oooO00o.f29819OooO0O0, oooO00o.f29820OooO0OO);
    }

    @NonNull
    public static o00O0O OooO0O0() {
        OooO00o oooO00o = new OooO00o();
        o00O0O o00o0o2 = new o00O0O(oooO00o);
        OooOO0O oooOO0O = oooO00o.f29819OooO0O0.f30160OooOO0;
        int i = Build.VERSION.SDK_INT;
        boolean z = (i >= 24 && oooOO0O.OooO00o()) || oooOO0O.f29792OooO0Oo || oooOO0O.f29790OooO0O0 || (i >= 23 && oooOO0O.f29791OooO0OO);
        o0OoOo0 o0oooo1 = oooO00o.f29819OooO0O0;
        if (o0oooo1.f30168OooOOo0) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (o0oooo1.f30158OooO0oO > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        oooO00o.f29818OooO00o = UUID.randomUUID();
        o0OoOo0 o0oooo2 = new o0OoOo0(oooO00o.f29819OooO0O0);
        oooO00o.f29819OooO0O0 = o0oooo2;
        o0oooo2.f30152OooO00o = oooO00o.f29818OooO00o.toString();
        return o00o0o2;
    }
}
