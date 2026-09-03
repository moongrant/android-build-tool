package o0O00000;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o0O0000O.OooO;
import o0O0000O.OooO0o;
import o0O0000O.OooOO0;
import o0O0000O.OooOO0O;
import o0O0000O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p275o0O0000o.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {
    @NotNull
    public static final o0O00.OooO00o OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List detectors = CollectionsKt.listOf((Object[]) new OooO00o[]{new o0O0000O.OooO00o(context), new o0O0000O.OooO0O0(context), new o0O0000O.OooO0OO(context), new OooO0o(context), new OooO(context), new OooOO0(), new OooOO0O(context), new OooOOOO(context), new OooOOO0(context)});
        o0O00.OooO00o model = new o0O00.OooO00o();
        Intrinsics.checkNotNullParameter(detectors, "detectors");
        Intrinsics.checkNotNullParameter(model, "model");
        ((OooO00o) detectors.get(0)).OooO00o(model);
        if (detectors.size() - 1 > 0) {
            new OooO0OO(detectors, 0 + 1, model).OooO00o();
        }
        return model;
    }
}
