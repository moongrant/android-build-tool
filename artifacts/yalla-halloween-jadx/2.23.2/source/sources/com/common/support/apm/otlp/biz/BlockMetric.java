package com.common.support.apm.otlp.biz;

import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.otlp.YallaOtlpSdk;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.api.metrics.LongCounter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/common/support/apm/otlp/biz/BlockMetric;", "", "()V", "blockCounter", "Lio/opentelemetry/api/metrics/LongCounter;", "kotlin.jvm.PlatformType", "counter", "", "isForeground", "", "Companion", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BlockMetric {

    @NotNull
    private static final String ATTRIBUTE_KEY_APP_PAGE = "app.page";

    @NotNull
    private static final String ATTRIBUTE_KEY_DURATION = "duration";

    @NotNull
    private static final String ATTRIBUTE_KEY_OCCUR_TIMESTAMP = "occur_timestamp";

    @NotNull
    private static final String ATTRIBUTE_KEY_STACK_INFO = "stack_info";
    private static final long BACKGROUND = 2;
    private static final long FOREGROUND = 1;

    @NotNull
    public static final String INSTRUMENTATION_NAME_BLOCK = "app-caton-metrics-instrumentation";

    @NotNull
    public static final String METER_NAME_BLOCK = "app-caton-metrics";
    private final LongCounter blockCounter = YallaOtlpSdk.INSTANCE.getMeterProvider().OooO0O0().OooO00o().build();

    @NotNull
    private static final String ATTRIBUTE_KEY_PROCESS_STATUS = "process.status";
    private static final AttributeKey<Long> processStatusKey = OooO0o.OooO0O0(ATTRIBUTE_KEY_PROCESS_STATUS);

    public final void counter(boolean isForeground) {
        final long j = isForeground ? 1L : BACKGROUND;
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.otlp.biz.BlockMetric.counter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "BlockCounter processStatus: " + j;
            }
        }, 1, null);
        this.blockCounter.OooO00o(OooO.OooO0OO(processStatusKey, Long.valueOf(j)));
    }
}
