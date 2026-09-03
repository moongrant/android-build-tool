package o00OoO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public interface o0OoOo0<Model, Data> {

    public static class OooO00o<Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final p154o00Oo0oo.o0OOO0o f37912OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<p154o00Oo0oo.o0OOO0o> f37913OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final com.bumptech.glide.load.data.OooO0o<Data> f37914OooO0OO;

        public OooO00o() {
            throw null;
        }

        public OooO00o(@NonNull p154o00Oo0oo.o0OOO0o o0ooo0o2, @NonNull com.bumptech.glide.load.data.OooO0o<Data> oooO0o) {
            List<p154o00Oo0oo.o0OOO0o> listEmptyList = Collections.emptyList();
            o00OO00O.OooO0O0(o0ooo0o2);
            this.f37912OooO00o = o0ooo0o2;
            o00OO00O.OooO0O0(listEmptyList);
            this.f37913OooO0O0 = listEmptyList;
            o00OO00O.OooO0O0(oooO0o);
            this.f37914OooO0OO = oooO0o;
        }
    }

    boolean OooO00o(@NonNull Model model);

    @Nullable
    OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo);
}
