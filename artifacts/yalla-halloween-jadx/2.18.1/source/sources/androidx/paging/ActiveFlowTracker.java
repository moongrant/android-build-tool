package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public interface ActiveFlowTracker {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/ActiveFlowTracker$FlowType;", "", "PAGED_DATA_FLOW", "PAGE_EVENT_FLOW", "paging-common"}, k = 1, mv = {1, 6, 0})
    public enum FlowType {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    void OooO00o();

    @Nullable
    Object onComplete();

    @Nullable
    Object onStart();
}
