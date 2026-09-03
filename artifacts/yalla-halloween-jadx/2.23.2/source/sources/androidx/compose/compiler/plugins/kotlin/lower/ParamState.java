package androidx.compose.compiler.plugins.kotlin.lower;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ParamState;", "", "bits", "", "(Ljava/lang/String;II)V", "getBits", "()I", "bitsForSlot", "slot", "Uncertain", "Same", "Different", "Static", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Mask", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ParamState {
    Uncertain(0),
    Same(1),
    Different(2),
    Static(3),
    Unknown(4),
    Mask(7);

    private final int bits;

    ParamState(int i) {
        this.bits = i;
    }

    public final int bitsForSlot(int slot) {
        return ComposableFunctionBodyTransformerKt.bitsForSlot(this.bits, slot);
    }

    public final int getBits() {
        return this.bits;
    }
}
