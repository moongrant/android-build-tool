package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p676oo0oOOo.OooOO0O;
import p676oo0oOOo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class TraceMetric extends GeneratedMessageLite<TraceMetric, OooO0O0> implements OooOOO0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<TraceMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<TraceMetric> subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<PerfSession> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20024OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20024OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20024OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20024OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20024OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20024OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20024OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20024OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class OooO0O0 extends GeneratedMessageLite.Builder<TraceMetric, OooO0O0> implements OooOOO0 {
        public OooO0O0() {
            super(TraceMetric.DEFAULT_INSTANCE);
        }

        public final void OooO(long j, String str) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().put(str, Long.valueOf(j));
        }

        public final void OooO0O0(List list) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllPerfSessions(list);
        }

        public final void OooO0Oo(ArrayList arrayList) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllSubtraces(arrayList);
        }

        public final void OooO0o(TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).addSubtraces(traceMetric);
        }

        public final void OooO0o0(PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).addPerfSessions(perfSession);
        }

        public final void OooO0oO(HashMap map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().putAll(map);
        }

        public final void OooO0oo(Map map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().putAll(map);
        }

        public final void OooOO0(String str) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
        }

        public final void OooOO0O(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).setClientStartTimeUs(j);
        }

        public final void OooOO0o(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).setDurationUs(j);
        }

        public final void OooOOO0(String str) {
            copyOnWrite();
            ((TraceMetric) this.instance).setName(str);
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final MapEntryLite<String, Long> f20025OooO00o = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final MapEntryLite<String, String> f20026OooO00o;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f20026OooO00o = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        GeneratedMessageLite.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    private TraceMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
        ensureSubtracesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(traceMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        Internal.ProtobufList<PerfSession> protobufList = this.perfSessions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSubtracesIsMutable() {
        Internal.ProtobufList<TraceMetric> protobufList = this.subtraces_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private MapFieldLite<String, Long> internalGetCounters() {
        return this.counters_;
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private MapFieldLite<String, Long> internalGetMutableCounters() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    private MapFieldLite<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public static OooO0O0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TraceMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubtraces(int i) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationUs(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        this.name_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtraces(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.set(i, traceMetric);
    }

    public boolean containsCounters(String str) {
        str.getClass();
        return internalGetCounters().containsKey(str);
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (OooO00o.f20024OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new TraceMetric();
            case 2:
                return new OooO0O0();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", OooO0OO.f20025OooO00o, "subtraces_", TraceMetric.class, "customAttributes_", OooO0o.f20026OooO00o, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TraceMetric> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TraceMetric.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Deprecated
    public Map<String, Long> getCounters() {
        return getCountersMap();
    }

    public int getCountersCount() {
        return internalGetCounters().size();
    }

    public Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(internalGetCounters());
    }

    public long getCountersOrDefault(String str, long j) {
        str.getClass();
        MapFieldLite<String, Long> mapFieldLiteInternalGetCounters = internalGetCounters();
        return mapFieldLiteInternalGetCounters.containsKey(str) ? mapFieldLiteInternalGetCounters.get(str).longValue() : j;
    }

    public long getCountersOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Long> mapFieldLiteInternalGetCounters = internalGetCounters();
        if (mapFieldLiteInternalGetCounters.containsKey(str)) {
            return mapFieldLiteInternalGetCounters.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetCustomAttributes = internalGetCustomAttributes();
        return mapFieldLiteInternalGetCustomAttributes.containsKey(str) ? mapFieldLiteInternalGetCustomAttributes.get(str) : str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetCustomAttributes = internalGetCustomAttributes();
        if (mapFieldLiteInternalGetCustomAttributes.containsKey(str)) {
            return mapFieldLiteInternalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getDurationUs() {
        return this.durationUs_;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public PerfSession getPerfSessions(int i) {
        return this.perfSessions_.get(i);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public OooOO0O getPerfSessionsOrBuilder(int i) {
        return this.perfSessions_.get(i);
    }

    public List<? extends OooOO0O> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public TraceMetric getSubtraces(int i) {
        return this.subtraces_.get(i);
    }

    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public List<TraceMetric> getSubtracesList() {
        return this.subtraces_;
    }

    public OooOOO0 getSubtracesOrBuilder(int i) {
        return this.subtraces_.get(i);
    }

    public List<? extends OooOOO0> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDurationUs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static OooO0O0 newBuilder(TraceMetric traceMetric) {
        return DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(i, traceMetric);
    }

    public static TraceMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
