package p613o0oo0o00;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p607o0oo0OOo.k1;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f57014OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList<OooOO0> f57015OooO0O0;

    public OooOO0O(@NotNull k1.OooO0O0 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f57015OooO0O0 = new ArrayList<>();
        this.f57014OooO00o = data.f56918OooO00o;
        List<k1.OooO00o> list = data.f56919OooO0O0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f57015OooO0O0.add(new OooOO0(list.get(i)));
        }
    }
}
