package p032OoooO0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import o00000O.oo0o0Oo;
import o0000O00.OooO0o;
import o0000O0O.OooO;
import o0000O0O.OooO0OO;
import o0000O0O.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import p053o00000oO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final String f3175OooO00o = StringsKt.repeat("H", 10);

    public static final long OooO00o(@NotNull oo0o0Oo style, @NotNull OooO density, @NotNull o000OOo.OooO0O0 fontFamilyResolver, @NotNull String text, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(text, "text");
        List spanStyles = CollectionsKt.emptyList();
        long jOooO0O0 = OooO0OO.OooO0O0(0, 0, 15);
        List placeholders = CollectionsKt.emptyList();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        OooO0o oooO0o = new OooO0o(text, style, spanStyles, placeholders, fontFamilyResolver, density);
        return o0OoOo0.OooO00o(MathKt.roundToInt((float) Math.ceil(oooO0o.OooO0O0())), MathKt.roundToInt((float) Math.ceil(new o0000O00.OooO0OO(oooO0o, i, false, jOooO0O0).getHeight())));
    }
}
