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
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p677oo0oOOo.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, OooO0O0> implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private Internal.ProtobufList<PerfSession> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    public enum HttpMethod implements Internal.EnumLite {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final Internal.EnumLiteMap<HttpMethod> internalValueMap = new OooO00o();
        private final int value;

        public class OooO00o implements Internal.EnumLiteMap<HttpMethod> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return HttpMethod.OooO00o(i);
            }
        }

        public static final class OooO0O0 implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0O0 f20022OooO00o = new OooO0O0();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return HttpMethod.OooO00o(i) != null;
            }
        }

        HttpMethod(int i) {
            this.value = i;
        }

        public static HttpMethod OooO00o(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

    public enum NetworkClientErrorReason implements Internal.EnumLite {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<NetworkClientErrorReason> internalValueMap = new OooO00o();
        private final int value;

        public class OooO00o implements Internal.EnumLiteMap<NetworkClientErrorReason> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                if (i == 0) {
                    return NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
            }
        }

        public static final class OooO0O0 implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0O0 f20023OooO00o = new OooO0O0();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                NetworkClientErrorReason networkClientErrorReason;
                if (i != 0) {
                    networkClientErrorReason = i != 1 ? null : NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
                } else {
                    networkClientErrorReason = NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                return networkClientErrorReason != null;
            }
        }

        NetworkClientErrorReason(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

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

    public static final class OooO0O0 extends GeneratedMessageLite.Builder<NetworkRequestMetric, OooO0O0> implements MessageLiteOrBuilder {
        public OooO0O0() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }

        public final void OooO(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setClientStartTimeUs(j);
        }

        public final void OooO0O0(List list) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addAllPerfSessions(list);
        }

        public final void OooO0Oo() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearResponseContentType();
        }

        public final boolean OooO0o() {
            return ((NetworkRequestMetric) this.instance).hasClientStartTimeUs();
        }

        public final long OooO0o0() {
            return ((NetworkRequestMetric) this.instance).getTimeToResponseInitiatedUs();
        }

        public final boolean OooO0oO() {
            return ((NetworkRequestMetric) this.instance).hasHttpResponseCode();
        }

        public final boolean OooO0oo() {
            return ((NetworkRequestMetric) this.instance).hasTimeToResponseCompletedUs();
        }

        public final void OooOO0(HttpMethod httpMethod) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpMethod(httpMethod);
        }

        public final void OooOO0O(int i) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpResponseCode(i);
        }

        public final void OooOO0o(NetworkClientErrorReason networkClientErrorReason) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setNetworkClientErrorReason(networkClientErrorReason);
        }

        public final void OooOOO(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponseContentType(str);
        }

        public final void OooOOO0(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setRequestPayloadBytes(j);
        }

        public final void OooOOOO(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponsePayloadBytes(j);
        }

        public final void OooOOOo(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToRequestCompletedUs(j);
        }

        public final void OooOOo(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseInitiatedUs(j);
        }

        public final void OooOOo0(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseCompletedUs(j);
        }

        public final void OooOOoo(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setUrl(str);
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final MapEntryLite<String, String> f20025OooO00o;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f20025OooO00o = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    private NetworkRequestMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        Internal.ProtobufList<PerfSession> protobufList = this.perfSessions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static NetworkRequestMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
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

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NetworkRequestMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod_ = httpMethod.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpResponseCode(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
        this.networkClientErrorReason_ = networkClientErrorReason.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestPayloadBytes(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentType(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentTypeBytes(ByteString byteString) {
        this.responseContentType_ = byteString.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponsePayloadBytes(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j) {
        this.bitField0_ |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.timeToRequestCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j) {
        this.bitField0_ |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        this.timeToResponseCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j) {
        this.bitField0_ |= ConstantsKt.MINIMUM_BLOCK_SIZE;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        this.url_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (OooO00o.f20024OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new OooO0O0();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.OooO0O0.f20022OooO00o, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.OooO0O0.f20023OooO00o, "customAttributes_", OooO0OO.f20025OooO00o, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NetworkRequestMetric> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NetworkRequestMetric.class) {
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

    public HttpMethod getHttpMethod() {
        HttpMethod httpMethodOooO00o = HttpMethod.OooO00o(this.httpMethod_);
        return httpMethodOooO00o == null ? HttpMethod.HTTP_METHOD_UNKNOWN : httpMethodOooO00o;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    public NetworkClientErrorReason getNetworkClientErrorReason() {
        NetworkClientErrorReason networkClientErrorReason;
        int i = this.networkClientErrorReason_;
        if (i != 0) {
            networkClientErrorReason = i != 1 ? null : NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
        } else {
            networkClientErrorReason = NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }
        return networkClientErrorReason == null ? NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : networkClientErrorReason;
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

    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    public String getResponseContentType() {
        return this.responseContentType_;
    }

    public ByteString getResponseContentTypeBytes() {
        return ByteString.copyFromUtf8(this.responseContentType_);
    }

    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasHttpMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHttpResponseCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNetworkClientErrorReason() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestPayloadBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasResponseContentType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResponsePayloadBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeToRequestCompletedUs() {
        return (this.bitField0_ & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    public boolean hasTimeToResponseCompletedUs() {
        return (this.bitField0_ & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
    }

    public boolean hasTimeToResponseInitiatedUs() {
        return (this.bitField0_ & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static OooO0O0 newBuilder(NetworkRequestMetric networkRequestMetric) {
        return DEFAULT_INSTANCE.createBuilder(networkRequestMetric);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, perfSession);
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NetworkRequestMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
