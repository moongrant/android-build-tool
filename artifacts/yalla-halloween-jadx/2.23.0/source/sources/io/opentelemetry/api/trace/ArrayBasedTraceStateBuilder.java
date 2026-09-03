package io.opentelemetry.api.trace;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
final class ArrayBasedTraceStateBuilder implements TraceStateBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AutoValue_ArrayBasedTraceState f33058OooO00o = new AutoValue_ArrayBasedTraceState(Collections.unmodifiableList(Collections.emptyList()));

    public ArrayBasedTraceStateBuilder() {
        new ArrayList();
    }
}
