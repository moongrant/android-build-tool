package io.opentelemetry.exporter.otlp.internal;

import androidx.media3.session.o000O0o;
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
import o000O00O.o000OO;

/* JADX INFO: loaded from: classes5.dex */
public final class SpanAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<ThreadLocalCache> f32595OooO00o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Status f32596OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Status f32597OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Status f32598OooO0Oo;

    /* JADX INFO: renamed from: io.opentelemetry.exporter.otlp.internal.SpanAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32599OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f32600OooO0O0;

        static {
            int[] iArr = new int[StatusCode.values().length];
            f32600OooO0O0 = iArr;
            try {
                iArr[StatusCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32600OooO0O0[StatusCode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32600OooO0O0[StatusCode.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SpanKind.values().length];
            f32599OooO00o = iArr2;
            try {
                iArr2[SpanKind.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32599OooO00o[SpanKind.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32599OooO00o[SpanKind.CLIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32599OooO00o[SpanKind.PRODUCER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32599OooO00o[SpanKind.CONSUMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class ThreadLocalCache {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f32601OooO00o = new HashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Span.Builder f32602OooO0O0 = Span.newBuilder();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Span.Event.Builder f32603OooO0OO = Span.Event.newBuilder();

        public ThreadLocalCache() {
            Span.Link.newBuilder();
        }
    }

    static {
        Status.Builder builderNewBuilder = Status.newBuilder();
        builderNewBuilder.OooO0O0(Status.StatusCode.STATUS_CODE_OK);
        Status.DeprecatedStatusCode deprecatedStatusCode = Status.DeprecatedStatusCode.DEPRECATED_STATUS_CODE_OK;
        builderNewBuilder.OooO0Oo(deprecatedStatusCode);
        f32596OooO0O0 = builderNewBuilder.build();
        Status.Builder builderNewBuilder2 = Status.newBuilder();
        builderNewBuilder2.OooO0O0(Status.StatusCode.STATUS_CODE_ERROR);
        builderNewBuilder2.OooO0Oo(Status.DeprecatedStatusCode.DEPRECATED_STATUS_CODE_UNKNOWN_ERROR);
        f32597OooO0OO = builderNewBuilder2.build();
        Status.Builder builderNewBuilder3 = Status.newBuilder();
        builderNewBuilder3.OooO0O0(Status.StatusCode.STATUS_CODE_UNSET);
        builderNewBuilder3.OooO0Oo(deprecatedStatusCode);
        f32598OooO0Oo = builderNewBuilder3.build();
    }

    private SpanAdapter() {
    }

    public static ArrayList OooO0Oo(Collection collection) {
        Span.SpanKind spanKind;
        ByteString byteStringUnsafeWrap;
        ByteString byteStringUnsafeWrap2;
        ByteString byteStringUnsafeWrap3;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        ThreadLocal<ThreadLocalCache> threadLocal = f32595OooO00o;
        ThreadLocalCache threadLocalCache = threadLocal.get();
        if (threadLocalCache == null) {
            threadLocalCache = new ThreadLocalCache();
            threadLocal.set(threadLocalCache);
        }
        Iterator it = collection.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            HashMap map = threadLocalCache.f32601OooO00o;
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
            Span.Builder builder = threadLocalCache.f32602OooO0O0;
            builder.OooOOOO((ByteString) obj);
            String strOooO0OO = spanData.OooO0O0().OooO0OO();
            Object obj2 = map.get(strOooO0OO);
            if (obj2 == null && (byteStringUnsafeWrap2 = UnsafeByteOperations.unsafeWrap(spanData.OooO0O0().OooO0o())) != null) {
                map.put(strOooO0OO, byteStringUnsafeWrap2);
                obj2 = byteStringUnsafeWrap2;
            }
            builder.OooOO0o((ByteString) obj2);
            if (spanData.OooOO0o().isValid()) {
                String strOooO0OO2 = spanData.OooOO0o().OooO0OO();
                Object obj3 = map.get(strOooO0OO2);
                if (obj3 == null && (byteStringUnsafeWrap = UnsafeByteOperations.unsafeWrap(spanData.OooOO0o().OooO0o())) != null) {
                    map.put(strOooO0OO2, byteStringUnsafeWrap);
                    obj3 = byteStringUnsafeWrap;
                }
                builder.OooOO0O((ByteString) obj3);
            }
            builder.OooOO0(spanData.getName());
            int i = AnonymousClass1.f32599OooO00o[spanData.getKind().ordinal()];
            int i2 = 5;
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
            builder.OooO(spanKind);
            builder.OooOOO0(spanData.OooO0Oo());
            builder.OooO0oo(spanData.OooO0oO());
            spanData.OooO00o().OooO0o(new o000OO(builder, i2));
            builder.OooO0o0(spanData.OooO0OO() - spanData.OooO00o().size());
            for (EventData eventData : spanData.OooOO0O()) {
                String name = eventData.getName();
                Span.Event.Builder builder2 = threadLocalCache.f32603OooO0OO;
                builder2.OooO0o0(name);
                builder2.OooO0o(eventData.OooO0O0());
                eventData.OooO00o().OooO0o(new o000O0o(builder2));
                builder2.OooO0Oo(eventData.OooO0OO() - eventData.OooO00o().size());
                Span.Event eventBuild = builder2.build();
                builder2.clear();
                builder.OooO0Oo(eventBuild);
            }
            builder.OooO0o(spanData.OooO() - spanData.OooOO0O().size());
            Iterator<LinkData> it2 = spanData.OooO0oo().iterator();
            if (it2.hasNext()) {
                it2.next().OooO0O0();
                throw null;
            }
            builder.OooO0oO(spanData.OooO0o() - spanData.OooO0oo().size());
            StatusData status = spanData.getStatus();
            int i3 = AnonymousClass1.f32600OooO0O0[status.OooO00o().ordinal()];
            Status statusBuild = i3 != 1 ? i3 != 2 ? f32598OooO0Oo : f32597OooO0OO : f32596OooO0O0;
            if (!status.getDescription().isEmpty()) {
                Status.Builder builder3 = statusBuild.toBuilder();
                builder3.OooO0o0(status.getDescription());
                statusBuild = builder3.build();
            }
            builder.OooOOO(statusBuild);
            Span spanBuild = builder.build();
            builder.clear();
            list2.add(spanBuild);
        }
    }
}
