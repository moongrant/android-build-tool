package io.opentelemetry.api.trace.propagation;

import com.facebook.appevents.AppEventsConstants;
import io.opentelemetry.context.propagation.TextMapPropagator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public final class W3CTraceContextPropagator implements TextMapPropagator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<String> f33070OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f33071OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f33072OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f33073OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final W3CTraceContextPropagator f33074OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final HashSet f33075OooO0o0;

    static {
        Logger.getLogger(W3CTraceContextPropagator.class.getName());
        f33070OooO00o = Collections.unmodifiableList(Arrays.asList("traceparent", "tracestate"));
        f33071OooO0O0 = 36;
        f33072OooO0OO = 53;
        f33073OooO0Oo = 55;
        Pattern.compile("[ \t]*,[ \t]*");
        f33074OooO0o = new W3CTraceContextPropagator();
        f33075OooO0o0 = new HashSet();
        for (int i = 0; i < 255; i++) {
            String hexString = Long.toHexString(i);
            if (hexString.length() < 2) {
                hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(hexString);
            }
            f33075OooO0o0.add(hexString);
        }
    }

    private W3CTraceContextPropagator() {
    }
}
