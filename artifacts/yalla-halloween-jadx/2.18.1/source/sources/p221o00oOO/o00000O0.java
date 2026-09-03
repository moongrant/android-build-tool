package p221o00oOO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.OooO0o;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000;

/* JADX INFO: loaded from: classes.dex */
public interface o00000O0<Model, Data> {

    public static class OooO00o<Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000 f33696OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<o000000> f33697OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o<Data> f33698OooO0OO;

        public OooO00o(@NonNull o000000 o000000Var, @NonNull OooO0o<Data> oooO0o) {
            List<o000000> listEmptyList = Collections.emptyList();
            Objects.requireNonNull(o000000Var, "Argument must not be null");
            this.f33696OooO00o = o000000Var;
            Objects.requireNonNull(listEmptyList, "Argument must not be null");
            this.f33697OooO0O0 = listEmptyList;
            Objects.requireNonNull(oooO0o, "Argument must not be null");
            this.f33698OooO0OO = oooO0o;
        }
    }

    boolean OooO00o(@NonNull Model model);

    @Nullable
    OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var);
}
