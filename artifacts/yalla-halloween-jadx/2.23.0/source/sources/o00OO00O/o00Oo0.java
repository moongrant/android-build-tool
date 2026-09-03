package o00OO00O;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f37125OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f37126OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f37127OooO00o = new HashMap();

        /* JADX INFO: renamed from: o00OO00O.o00Oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0431OooO00o<Model> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final List<o0OoOo0<Model, ?>> f37128OooO00o;

            public C0431OooO00o(List<o0OoOo0<Model, ?>> list) {
                this.f37128OooO00o = list;
            }
        }
    }

    public o00Oo0(@NonNull o00OOO.OooO00o.OooO0OO oooO0OO) {
        oo000o oo000oVar = new oo000o(oooO0OO);
        this.f37126OooO0O0 = new OooO00o();
        this.f37125OooO00o = oo000oVar;
    }

    @NonNull
    public final synchronized ArrayList OooO00o(@NonNull Class cls) {
        return this.f37125OooO00o.OooO0o0(cls);
    }
}
