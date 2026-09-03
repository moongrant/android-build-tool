package p053o00000oO;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@VisibleForTesting
public final class o000 implements o0000OO0 {
    @Override // p053o00000oO.o0000OO0
    @NotNull
    public final Typeface OooO00o(@NotNull o0000oo name, @NotNull o0000O00 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return OooO0OO(name.f27137Oooo0oo, fontWeight, i);
    }

    @Override // p053o00000oO.o0000OO0
    @NotNull
    public final Typeface OooO0O0(@NotNull o0000O00 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return OooO0OO(null, fontWeight, i);
    }

    public final Typeface OooO0OO(String str, o0000O00 o0000o00, int i) {
        if (i == 0) {
            o0000O00.OooO00o oooO00o = o0000O00.f27125Oooo0oO;
            if (Intrinsics.areEqual(o0000o00, o0000O00.f27128OoooO0)) {
                if (str == null || str.length() == 0) {
                    Typeface DEFAULT = Typeface.DEFAULT;
                    Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                    return DEFAULT;
                }
            }
        }
        Typeface typefaceCreate = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), o0000o00.f27133Oooo0o, i == 1);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
    }
}
