package com.common.support.atd;

import com.common.support.sailfish_commons.logmodels.SecModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/common/support/atd/DetectorChain;", "", "detectors", "", "Lcom/common/support/atd/AbstractDetector;", "index", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "(Ljava/util/List;ILcom/common/support/sailfish_commons/logmodels/SecModel;Lcom/common/support/atd/DetectResult;)V", "process", "reset", "", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DetectorChain {

    @NotNull
    private final List<AbstractDetector> detectors;
    private int index;

    @NotNull
    private final DetectResult resultForApi;

    @NotNull
    private final SecModel sailfishSecModel;

    /* JADX WARN: Multi-variable type inference failed */
    public DetectorChain(@NotNull List<? extends AbstractDetector> detectors, int i, @NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        Intrinsics.checkNotNullParameter(detectors, "detectors");
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        this.detectors = detectors;
        this.index = i;
        this.sailfishSecModel = sailfishSecModel;
        this.resultForApi = resultForApi;
    }

    @NotNull
    public final SecModel process() {
        if (this.index < this.detectors.size()) {
            this.detectors.get(this.index).detect(this.sailfishSecModel, this.resultForApi);
            this.index++;
            process();
        }
        return this.sailfishSecModel;
    }

    public final void reset() {
        this.index = 0;
    }

    public /* synthetic */ DetectorChain(List list, int i, SecModel secModel, DetectResult detectResult, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i, secModel, detectResult);
    }
}
