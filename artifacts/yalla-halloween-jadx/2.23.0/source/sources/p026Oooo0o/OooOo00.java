package p026Oooo0o;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0OO;
import java.util.Set;
import p028Oooo0oO.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@ExperimentalCamera2Interop
public class OooOo00 implements o00O0OO {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Config f1097OooOooo;

    @RequiresApi(21)
    public static final class OooO00o implements o00O000o<OooOo00> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O00O f1098OooO00o = o00O00O.Oooo0OO();

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static OooO00o OooO0Oo(@NonNull Config config) {
            OooO00o oooO00o = new OooO00o();
            config.OooOO0o(new OooOOOO(oooO00o, config));
            return oooO00o;
        }

        @Override // p028Oooo0oO.o00O000o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final o00O00 OooO00o() {
            throw null;
        }

        @NonNull
        public final OooOo00 OooO0OO() {
            return new OooOo00(o00O0.Oooo0O0(this.f1098OooO00o));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooOo00(@NonNull Config config) {
        this.f1097OooOooo = config;
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0O0(Config.OooO00o oooO00o) {
        return getConfig().OooO0O0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean OooO0o0(Config.OooO00o oooO00o) {
        return getConfig().OooO0o0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0oO(Config.OooO00o oooO00o, Config.OptionPriority optionPriority) {
        return getConfig().OooO0oO(oooO00o, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooO0oo() {
        return getConfig().OooO0oo();
    }

    @Override // androidx.camera.core.impl.Config
    public final void OooOO0o(OooOOOO oooOOOO) {
        getConfig().OooOO0o(oooOOOO);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooOOO0(Config.OooO00o oooO00o) {
        return getConfig().OooOOO0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooOoO(Config.OooO00o oooO00o, Object obj) {
        return getConfig().OooOoO(oooO00o, obj);
    }

    @Override // androidx.camera.core.impl.Config
    public final Config.OptionPriority OooOoo(Config.OooO00o oooO00o) {
        return getConfig().OooOoo(oooO00o);
    }

    @Override // androidx.camera.core.impl.o00O0OO
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Config getConfig() {
        return this.f1097OooOooo;
    }
}
