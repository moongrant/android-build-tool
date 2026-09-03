package io.opentelemetry.exporter.otlp.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.UnsafeByteOperations;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.proto.trace.v1.InstrumentationLibrarySpans;
import io.opentelemetry.proto.trace.v1.ResourceSpans;
import io.opentelemetry.proto.trace.v1.Span;
import io.opentelemetry.proto.trace.v1.Status;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p037OoooOo0.o000OOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class SpanAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<ThreadLocalCache> f33128OooO00o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Status f33129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Status f33130OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Status f33131OooO0Oo;

    /* JADX INFO: renamed from: io.opentelemetry.exporter.otlp.internal.SpanAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33132OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f33133OooO0O0;

        static {
            int[] iArr = new int[StatusCode.values().length];
            f33133OooO0O0 = iArr;
            try {
                iArr[StatusCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33133OooO0O0[StatusCode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33133OooO0O0[StatusCode.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SpanKind.values().length];
            f33132OooO00o = iArr2;
            try {
                iArr2[SpanKind.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33132OooO00o[SpanKind.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33132OooO00o[SpanKind.CLIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33132OooO00o[SpanKind.PRODUCER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33132OooO00o[SpanKind.CONSUMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class ThreadLocalCache {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f33134OooO00o = new HashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Span.Builder f33135OooO0O0 = Span.newBuilder();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Span.Event.Builder f33136OooO0OO = Span.Event.newBuilder();

        public ThreadLocalCache() {
            Span.Link.newBuilder();
        }
    }

    static {
        Status.Builder builderNewBuilder = Status.newBuilder();
        builderNewBuilder.OooO0O0(Status.StatusCode.STATUS_CODE_OK);
        Status.DeprecatedStatusCode deprecatedStatusCode = Status.DeprecatedStatusCode.DEPRECATED_STATUS_CODE_OK;
        builderNewBuilder.OooO0Oo(deprecatedStatusCode);
        f33129OooO0O0 = builderNewBuilder.build();
        Status.Builder builderNewBuilder2 = Status.newBuilder();
        builderNewBuilder2.OooO0O0(Status.StatusCode.STATUS_CODE_ERROR);
        builderNewBuilder2.OooO0Oo(Status.DeprecatedStatusCode.DEPRECATED_STATUS_CODE_UNKNOWN_ERROR);
        f33130OooO0OO = builderNewBuilder2.build();
        Status.Builder builderNewBuilder3 = Status.newBuilder();
        builderNewBuilder3.OooO0O0(Status.StatusCode.STATUS_CODE_UNSET);
        builderNewBuilder3.OooO0Oo(deprecatedStatusCode);
        f33131OooO0Oo = builderNewBuilder3.build();
    }

    private SpanAdapter() {
    }

    public static ArrayList OooO0O0(Collection collection) {
        Span.SpanKind spanKind;
        ByteString byteStringUnsafeWrap;
        ByteString byteStringUnsafeWrap2;
        ByteString byteStringUnsafeWrap3;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        ThreadLocal<ThreadLocalCache> threadLocal = f33128OooO00o;
        ThreadLocalCache threadLocalCache = threadLocal.get();
        if (threadLocalCache == null) {
            threadLocalCache = new ThreadLocalCache();
            threadLocal.set(threadLocalCache);
        }
        Iterator it = collection.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            HashMap map = threadLocalCache.f33134OooO00o;
            if (!zHasNext) {
                map.clear();
                ArrayList arrayList = new ArrayList(identityHashMap.size());
                for (Map.Entry entry : identityHashMap.entrySet()) {
                    Resource resource = (Resource) entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    ResourceSpans.Builder builderNewBuilder = ResourceSpans.newBuilder();
                    builderNewBuilder.OooO0Oo(ResourceAdapter.OooO00o(resource));
                    if (resource.OooO0OO() != null) {
                        builderNewBuilder.OooO0o0(resource.OooO0OO());
                    }
                    for (Map.Entry entry2 : map2.entrySet()) {
                        InstrumentationLibraryInfo instrumentationLibraryInfo = (InstrumentationLibraryInfo) entry2.getKey();
                        List list = (List) entry2.getValue();
                        InstrumentationLibrarySpans.Builder builderNewBuilder2 = InstrumentationLibrarySpans.newBuilder();
                        builderNewBuilder2.OooO0Oo(CommonAdapter.OooO0O0(instrumentationLibraryInfo));
                        builderNewBuilder2.OooO0O0(list);
                        if (instrumentationLibraryInfo.OooO0OO() != null) {
                            builderNewBuilder2.OooO0o0(instrumentationLibraryInfo.OooO0OO());
                        }
                        builderNewBuilder.OooO0O0(builderNewBuilder2.build());
                    }
                    arrayList.add(builderNewBuilder.build());
                }
                return arrayList;
            }
            SpanData spanData = (SpanData) it.next();
            Resource resourceOooOO0 = spanData.OooOO0();
            Object identityHashMap2 = identityHashMap.get(resourceOooOO0);
            if (identityHashMap2 == null) {
                identityHashMap2 = new IdentityHashMap(8);
                identityHashMap.put(resourceOooOO0, identityHashMap2);
            }
            Map map3 = (Map) identityHashMap2;
            InstrumentationLibraryInfo instrumentationLibraryInfoOooO0o0 = spanData.OooO0o0();
            Object arrayList2 = map3.get(instrumentationLibraryInfoOooO0o0);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map3.put(instrumentationLibraryInfoOooO0o0, arrayList2);
            }
            List list2 = (List) arrayList2;
            String strOooO0Oo = spanData.OooO0O0().OooO0Oo();
            Object obj = map.get(strOooO0Oo);
            if (obj == null && (byteStringUnsafeWrap3 = UnsafeByteOperations.unsafeWrap(spanData.OooO0O0().OooO())) != null) {
                map.put(strOooO0Oo, byteStringUnsafeWrap3);
                obj = byteStringUnsafeWrap3;
            }
            Span.Builder builder = threadLocalCache.f33135OooO0O0;
            builder.OooOOO((ByteString) obj);
            String strOooO0OO = spanData.OooO0O0().OooO0OO();
            Object obj2 = map.get(strOooO0OO);
            if (obj2 == null && (byteStringUnsafeWrap2 = UnsafeByteOperations.unsafeWrap(spanData.OooO0O0().OooO0o())) != null) {
                map.put(strOooO0OO, byteStringUnsafeWrap2);
                obj2 = byteStringUnsafeWrap2;
            }
            builder.OooOO0O((ByteString) obj2);
            if (spanData.OooOO0o().isValid()) {
                String strOooO0OO2 = spanData.OooOO0o().OooO0OO();
                Object obj3 = map.get(strOooO0OO2);
                if (obj3 == null && (byteStringUnsafeWrap = UnsafeByteOperations.unsafeWrap(spanData.OooOO0o().OooO0o())) != null) {
                    map.put(strOooO0OO2, byteStringUnsafeWrap);
                    obj3 = byteStringUnsafeWrap;
                }
                builder.OooOO0((ByteString) obj3);
            }
            builder.OooO(spanData.getName());
            int i = AnonymousClass1.f33132OooO00o[spanData.getKind().ordinal()];
            if (i == 1) {
                spanKind = Span.SpanKind.SPAN_KIND_INTERNAL;
            } else if (i == 2) {
                spanKind = Span.SpanKind.SPAN_KIND_SERVER;
            } else if (i == 3) {
                spanKind = Span.SpanKind.SPAN_KIND_CLIENT;
            } else if (i != 4) {
                spanKind = i != 5 ? Span.SpanKind.UNRECOGNIZED : Span.SpanKind.SPAN_KIND_CONSUMER;
            } else {
                spanKind = Span.SpanKind.SPAN_KIND_PRODUCER;
            }
            builder.OooO0oo(spanKind);
            builder.OooOO0o(spanData.OooO0OO());
            builder.OooO0oO(spanData.OooO0oO());
            spanData.OooO00o().OooO0Oo(new o000OOo0(builder));
            builder.OooO0Oo(spanData.OooO0Oo() - spanData.OooO00o().size());
            Iterator<EventData> it2 = spanData.OooOO0O().iterator();
            if (it2.hasNext()) {
                EventData next = it2.next();
                next.getName();
                Span.Event.Builder builder2 = threadLocalCache.f33136OooO0OO;
                builder2.OooO0O0(null);
                next.OooO0O0();
                builder2.OooO0Oo(0L);
                next.OooO00o();
                throw null;
            }
            builder.OooO0o0(spanData.OooO() - spanData.OooOO0O().size());
            Iterator<LinkData> it3 = spanData.OooO0oo().iterator();
            if (it3.hasNext()) {
                it3.next().OooO0O0();
                throw null;
            }
            builder.OooO0o(spanData.OooO0o() - spanData.OooO0oo().size());
            StatusData status = spanData.getStatus();
            int i2 = AnonymousClass1.f33133OooO0O0[status.OooO00o().ordinal()];
            Status statusBuild = i2 != 1 ? i2 != 2 ? f33131OooO0Oo : f33130OooO0OO : f33129OooO0O0;
            if (!status.getDescription().isEmpty()) {
                Status.Builder builder3 = statusBuild.toBuilder();
                builder3.OooO0o0(status.getDescription());
                statusBuild = builder3.build();
            }
            builder.OooOOO0(statusBuild);
            Span spanBuild = builder.build();
            builder.clear();
            list2.add(spanBuild);
        }
    }
}
