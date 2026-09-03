package o00OO00O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public interface o0OoOo0<Model, Data> {

    public static class OooO00o<Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOo f37150OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<o000OOo> f37151OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final com.bumptech.glide.load.data.OooO0o<Data> f37152OooO0OO;

        public OooO00o() {
            throw null;
        }

        public OooO00o(@NonNull o000OOo o000ooo2, @NonNull com.bumptech.glide.load.data.OooO0o<Data> oooO0o) {
            List<o000OOo> listEmptyList = Collections.emptyList();
            o0000O00.OooO0O0(o000ooo2);
            this.f37150OooO00o = o000ooo2;
            o0000O00.OooO0O0(listEmptyList);
            this.f37151OooO0O0 = listEmptyList;
            o0000O00.OooO0O0(oooO0o);
            this.f37152OooO0OO = oooO0o;
        }
    }

    boolean OooO00o(@NonNull Model model);

    @Nullable
    OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var);
}
