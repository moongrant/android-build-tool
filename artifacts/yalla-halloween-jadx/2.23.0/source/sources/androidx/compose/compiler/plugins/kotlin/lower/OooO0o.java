package androidx.compose.compiler.plugins.kotlin.lower;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o {
    public static /* synthetic */ IrChangedBitMaskVariable OooO00o(IrChangedBitMaskValue irChangedBitMaskValue, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irCopyToTemporary");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return irChangedBitMaskValue.irCopyToTemporary(str, z, z2);
    }
}
