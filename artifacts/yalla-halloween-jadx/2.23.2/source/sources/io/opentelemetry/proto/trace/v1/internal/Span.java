package io.opentelemetry.proto.trace.v1.internal;

import com.facebook.internal.AnalyticsEvents;
import io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class Span {

    public static final class Event {
        static {
            ProtoFieldInfo.OooO00o(1, 9, "timeUnixNano");
            ProtoFieldInfo.OooO00o(2, 18, "name");
            ProtoFieldInfo.OooO00o(3, 26, "attributes");
            ProtoFieldInfo.OooO00o(4, 32, "droppedAttributesCount");
        }
    }

    public static final class Link {
        static {
            ProtoFieldInfo.OooO00o(1, 10, "traceId");
            ProtoFieldInfo.OooO00o(2, 18, "spanId");
            ProtoFieldInfo.OooO00o(3, 26, "traceState");
            ProtoFieldInfo.OooO00o(4, 34, "attributes");
            ProtoFieldInfo.OooO00o(5, 40, "droppedAttributesCount");
        }
    }

    public final class SpanKind {
    }

    static {
        ProtoFieldInfo.OooO00o(1, 10, "traceId");
        ProtoFieldInfo.OooO00o(2, 18, "spanId");
        ProtoFieldInfo.OooO00o(3, 26, "traceState");
        ProtoFieldInfo.OooO00o(4, 34, "parentSpanId");
        ProtoFieldInfo.OooO00o(5, 42, "name");
        ProtoFieldInfo.OooO00o(6, 48, "kind");
        ProtoFieldInfo.OooO00o(7, 57, "startTimeUnixNano");
        ProtoFieldInfo.OooO00o(8, 65, "endTimeUnixNano");
        ProtoFieldInfo.OooO00o(9, 74, "attributes");
        ProtoFieldInfo.OooO00o(10, 80, "droppedAttributesCount");
        ProtoFieldInfo.OooO00o(11, 90, "events");
        ProtoFieldInfo.OooO00o(12, 96, "droppedEventsCount");
        ProtoFieldInfo.OooO00o(13, 106, "links");
        ProtoFieldInfo.OooO00o(14, 112, "droppedLinksCount");
        ProtoFieldInfo.OooO00o(15, 122, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
    }
}
