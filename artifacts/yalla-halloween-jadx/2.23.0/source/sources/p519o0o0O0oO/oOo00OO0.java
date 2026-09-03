package p519o0o0O0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.dialog.MenuDialogTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p156o00OoOO.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOo00OO0<D> implements OooOo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final D f53006OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f53007OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public oOo00OO0(MenuDialogTag menuDialogTag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f53006OooO0Oo = menuDialogTag;
        this.f53007OooO0o0 = content;
    }

    @Override // p156o00OoOO.OooOo00
    @NotNull
    public final String getShowText() {
        return this.f53007OooO0o0;
    }
}
