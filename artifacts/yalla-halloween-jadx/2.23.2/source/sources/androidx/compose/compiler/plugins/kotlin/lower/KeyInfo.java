package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/KeyInfo;", "", "name", "", "startOffset", "", "endOffset", "hasDuplicates", "", "(Ljava/lang/String;IIZ)V", "getEndOffset", "()I", "getHasDuplicates", "()Z", "key", "getKey", "getName", "()Ljava/lang/String;", "getStartOffset", "used", "getUsed", "setUsed", "(Z)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyInfo {
    private final int endOffset;
    private final boolean hasDuplicates;

    @NotNull
    private final String name;
    private final int startOffset;
    private boolean used;

    public KeyInfo(@NotNull String str, int i, int i2, boolean z) {
        this.name = str;
        this.startOffset = i;
        this.endOffset = i2;
        this.hasDuplicates = z;
    }

    public final int getEndOffset() {
        return this.endOffset;
    }

    public final boolean getHasDuplicates() {
        return this.hasDuplicates;
    }

    public final int getKey() {
        return this.name.hashCode();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final boolean getUsed() {
        return this.used;
    }

    public final void setUsed(boolean z) {
        this.used = z;
    }
}
