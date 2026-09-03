package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeFlags;", "", "()V", "FRAMED_COMPONENTS", "", "getFRAMED_COMPONENTS", "()Z", "setFRAMED_COMPONENTS", "(Z)V", "FRAMED_MODEL_CLASSES", "getFRAMED_MODEL_CLASSES", "setFRAMED_MODEL_CLASSES", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeFlags {
    private static boolean FRAMED_COMPONENTS;

    @NotNull
    public static final ComposeFlags INSTANCE = new ComposeFlags();
    private static boolean FRAMED_MODEL_CLASSES = true;

    private ComposeFlags() {
    }

    public final boolean getFRAMED_COMPONENTS() {
        return FRAMED_COMPONENTS;
    }

    public final boolean getFRAMED_MODEL_CLASSES() {
        return FRAMED_MODEL_CLASSES;
    }

    public final void setFRAMED_COMPONENTS(boolean z) {
        FRAMED_COMPONENTS = z;
    }

    public final void setFRAMED_MODEL_CLASSES(boolean z) {
        FRAMED_MODEL_CLASSES = z;
    }
}
