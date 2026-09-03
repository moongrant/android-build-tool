package p617o0oo0o0O;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p612o0oo0OoO.o5;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f57545OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList<oo0OOoo> f57546OooO0O0;

    public o0O0o000(@NotNull o5.OooO0O0 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f57546OooO0O0 = new ArrayList<>();
        this.f57545OooO00o = data.f57433OooO00o;
        List<o5.OooO00o> list = data.f57434OooO0O0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f57546OooO0O0.add(new oo0OOoo(list.get(i)));
        }
    }
}
