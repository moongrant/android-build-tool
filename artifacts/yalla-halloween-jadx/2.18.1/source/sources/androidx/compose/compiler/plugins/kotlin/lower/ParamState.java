package androidx.compose.compiler.plugins.kotlin.lower;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ParamState;", "", "", "bits", "I", "getBits", "()I", "Uncertain", "Same", "Different", "Static", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Mask", "compiler-hosted"}, k = 1, mv = {1, 7, 1})
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
}
