package p049Ooooooo;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0000O f4212OooO00o = new o0O0000O();

    @DoNotInline
    @RequiresApi(23)
    public final int OooO00o(@NotNull ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.addChildCount(i);
    }

    @DoNotInline
    @RequiresApi(23)
    @Nullable
    public final ViewStructure OooO0O0(@NotNull ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.newChild(i);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void OooO0OO(@NotNull ViewStructure structure, int i, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setDimens(i, i2, i3, i4, i5, i6);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void OooO0Oo(@NotNull ViewStructure structure, int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setId(i, str, str2, str3);
    }
}
