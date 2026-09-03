package p053o00000oO;

import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class o000O000 implements o0000OO0 {
    @Override // p053o00000oO.o0000OO0
    @NotNull
    public final Typeface OooO00o(@NotNull o0000oo name, @NotNull o0000O00 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        String name2 = name.f27137Oooo0oo;
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int i2 = fontWeight.f27133Oooo0o / 100;
        if (i2 >= 0 && i2 < 2) {
            name2 = OooOo00.OooO0Oo(name2, "-thin");
        } else {
            if (2 <= i2 && i2 < 4) {
                name2 = OooOo00.OooO0Oo(name2, "-light");
            } else if (i2 != 4) {
                if (i2 == 5) {
                    name2 = OooOo00.OooO0Oo(name2, "-medium");
                } else {
                    if (!(6 <= i2 && i2 < 8)) {
                        if (8 <= i2 && i2 < 11) {
                            name2 = OooOo00.OooO0Oo(name2, "-black");
                        }
                    }
                }
            }
        }
        Typeface typeface = null;
        if (!(name2.length() == 0)) {
            Typeface typefaceOooO0OO = OooO0OO(name2, fontWeight, i);
            if ((Intrinsics.areEqual(typefaceOooO0OO, Typeface.create(Typeface.DEFAULT, o0Oo0oo.OooO0O0(fontWeight, i))) || Intrinsics.areEqual(typefaceOooO0OO, OooO0OO(null, fontWeight, i))) ? false : true) {
                typeface = typefaceOooO0OO;
            }
        }
        return typeface == null ? OooO0OO(name.f27137Oooo0oo, fontWeight, i) : typeface;
    }

    @Override // p053o00000oO.o0000OO0
    @NotNull
    public final Typeface OooO0O0(@NotNull o0000O00 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return OooO0OO(null, fontWeight, i);
    }

    public final Typeface OooO0OO(String str, o0000O00 o0000o00, int i) {
        boolean z = true;
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
        int iOooO0O0 = o0Oo0oo.OooO0O0(o0000o00, i);
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(iOooO0O0);
            Intrinsics.checkNotNullExpressionValue(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return typefaceDefaultFromStyle;
        }
        Typeface typefaceCreate = Typeface.create(str, iOooO0O0);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "{\n            Typeface.c…y, targetStyle)\n        }");
        return typefaceCreate;
    }
}
