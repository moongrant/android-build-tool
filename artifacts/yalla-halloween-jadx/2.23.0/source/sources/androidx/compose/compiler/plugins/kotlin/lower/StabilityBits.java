package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/StabilityBits;", "", "bits", "", "(Ljava/lang/String;II)V", "getBits", "()I", "bitsForSlot", "slot", "UNSTABLE", "STABLE", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum StabilityBits {
    UNSTABLE(4),
    STABLE(0);

    private final int bits;

    StabilityBits(int i) {
        this.bits = i;
    }

    public final int bitsForSlot(int slot) {
        return this.bits << ((slot * 3) + 1);
    }

    public final int getBits() {
        return this.bits;
    }
}
