package p650o0ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.dialog.MenuDialogTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p202o00o0o.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OO<D> implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final D f58674OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f58675OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OO(MenuDialogTag menuDialogTag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f58674OooO0Oo = menuDialogTag;
        this.f58675OooO0o0 = content;
    }

    @Override // p202o00o0o.o0OoOo0
    @NotNull
    public final String getShowText() {
        return this.f58675OooO0o0;
    }
}
