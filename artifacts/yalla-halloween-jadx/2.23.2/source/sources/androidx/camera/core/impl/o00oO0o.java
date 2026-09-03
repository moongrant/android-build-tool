package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f3761OooO00o = new OooO00o();

    public static final class OooO00o implements CameraConfig {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final OooOOO0 f3762OooOooo = new OooOOO0(new Object());

        @Override // androidx.camera.core.impl.Config
        public final Object OooO0O0(Config.OooO00o oooO00o) {
            return ((o00O0O00) getConfig()).OooO0O0(oooO00o);
        }

        @Override // androidx.camera.core.impl.Config
        public final boolean OooO0o0(Config.OooO00o oooO00o) {
            return ((o00O0O00) getConfig()).OooO0o0(oooO00o);
        }

        @Override // androidx.camera.core.impl.Config
        public final Object OooO0oO(Config.OooO00o oooO00o, Config.OptionPriority optionPriority) {
            return ((o00O0O00) getConfig()).OooO0oO(oooO00o, optionPriority);
        }

        @Override // androidx.camera.core.impl.Config
        public final Set OooO0oo() {
            return ((o00O0O00) getConfig()).OooO0oo();
        }

        @Override // androidx.camera.core.impl.Config
        public final /* synthetic */ void OooOO0o(p026Oooo0o.OooOOOO oooOOOO) {
            o00O0OO.OooO00o(this, oooOOOO);
        }

        @Override // androidx.camera.core.impl.Config
        public final Set OooOOO0(Config.OooO00o oooO00o) {
            return ((o00O0O00) getConfig()).OooOOO0(oooO00o);
        }

        @Override // androidx.camera.core.impl.Config
        public final Object OooOoO(Config.OooO00o oooO00o, Object obj) {
            return ((o00O0O00) getConfig()).OooOoO(oooO00o, obj);
        }

        @Override // androidx.camera.core.impl.Config
        public final Config.OptionPriority OooOoo(Config.OooO00o oooO00o) {
            return ((o00O0O00) getConfig()).OooOoo(oooO00o);
        }

        @Override // androidx.camera.core.impl.o00O0OOO
        @NonNull
        public final Config getConfig() {
            return o00O0O00.f3722Oooo00O;
        }
    }
}
