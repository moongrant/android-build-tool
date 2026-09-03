package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/StabilityBits;", "", "", "bits", "I", "getBits", "()I", "UNSTABLE", "STABLE", "compiler-hosted"}, k = 1, mv = {1, 7, 1})
public enum StabilityBits {
    UNSTABLE(4),
    STABLE(0);

    private final int bits;

    StabilityBits(int i) {
        this.bits = i;
    }
}
