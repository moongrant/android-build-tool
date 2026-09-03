package com.common.support.apm.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
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
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class BuriedProto {

    /* JADX INFO: renamed from: com.common.support.apm.protobuf.BuriedProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Buried extends GeneratedMessageLite<Buried, Builder> implements BuriedOrBuilder {
        public static final int APP_CHANNEL_FIELD_NUMBER = 13;
        public static final int APP_ENV_FIELD_NUMBER = 14;
        public static final int APP_ID_FIELD_NUMBER = 10;
        public static final int APP_NAME_FIELD_NUMBER = 11;
        public static final int APP_VERSION_FIELD_NUMBER = 12;
        public static final int CARRIER_FIELD_NUMBER = 19;
        private static final Buried DEFAULT_INSTANCE;
        public static final int DEVICE_BRAND_FIELD_NUMBER = 17;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 18;
        public static final int DONEATTIME_FIELD_NUMBER = 22;
        public static final int EVENT_ID_FIELD_NUMBER = 7;
        public static final int EVENT_NAME_FIELD_NUMBER = 8;
        public static final int EVENT_TIME_FIELD_NUMBER = 5;
        public static final int EVENT_TYPE_FIELD_NUMBER = 9;
        public static final int EXT_INFO_FIELD_NUMBER = 20;
        public static final int IP_FIELD_NUMBER = 15;
        public static final int NETWORK_TYPE_FIELD_NUMBER = 16;
        public static final int OS_FIELD_NUMBER = 3;
        public static final int OS_VERSION_FIELD_NUMBER = 4;
        private static volatile Parser<Buried> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 21;
        public static final int URL_FIELD_NUMBER = 6;
        public static final int USER_ID_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 1;
        private int appEnv_;
        private long doneAtTime_;
        private long eventTime_;
        private int eventType_;
        private int networkType_;
        private int os_;
        private MapFieldLite<String, CommonProto.AnyValue> extInfo_ = MapFieldLite.emptyMapField();
        private String uuid_ = "";
        private String userId_ = "";
        private String osVersion_ = "";
        private String url_ = "";
        private String eventId_ = "";
        private String eventName_ = "";
        private String appId_ = "";
        private String appName_ = "";
        private String appVersion_ = "";
        private String appChannel_ = "";
        private String ip_ = "";
        private String deviceBrand_ = "";
        private String deviceModel_ = "";
        private String carrier_ = "";
        private String sessionId_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Buried, Builder> implements BuriedOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppChannel() {
                copyOnWrite();
                ((Buried) this.instance).clearAppChannel();
                return this;
            }

            public Builder clearAppEnv() {
                copyOnWrite();
                ((Buried) this.instance).clearAppEnv();
                return this;
            }

            public Builder clearAppId() {
                copyOnWrite();
                ((Buried) this.instance).clearAppId();
                return this;
            }

            public Builder clearAppName() {
                copyOnWrite();
                ((Buried) this.instance).clearAppName();
                return this;
            }

            public Builder clearAppVersion() {
                copyOnWrite();
                ((Buried) this.instance).clearAppVersion();
                return this;
            }

            public Builder clearCarrier() {
                copyOnWrite();
                ((Buried) this.instance).clearCarrier();
                return this;
            }

            public Builder clearDeviceBrand() {
                copyOnWrite();
                ((Buried) this.instance).clearDeviceBrand();
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((Buried) this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearDoneAtTime() {
                copyOnWrite();
                ((Buried) this.instance).clearDoneAtTime();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((Buried) this.instance).clearEventId();
                return this;
            }

            public Builder clearEventName() {
                copyOnWrite();
                ((Buried) this.instance).clearEventName();
                return this;
            }

            public Builder clearEventTime() {
                copyOnWrite();
                ((Buried) this.instance).clearEventTime();
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                ((Buried) this.instance).clearEventType();
                return this;
            }

            public Builder clearExtInfo() {
                copyOnWrite();
                ((Buried) this.instance).getMutableExtInfoMap().clear();
                return this;
            }

            public Builder clearIp() {
                copyOnWrite();
                ((Buried) this.instance).clearIp();
                return this;
            }

            public Builder clearNetworkType() {
                copyOnWrite();
                ((Buried) this.instance).clearNetworkType();
                return this;
            }

            public Builder clearOs() {
                copyOnWrite();
                ((Buried) this.instance).clearOs();
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((Buried) this.instance).clearOsVersion();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((Buried) this.instance).clearSessionId();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((Buried) this.instance).clearUrl();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((Buried) this.instance).clearUserId();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((Buried) this.instance).clearUuid();
                return this;
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public boolean containsExtInfo(String str) {
                str.getClass();
                return ((Buried) this.instance).getExtInfoMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getAppChannel() {
                return ((Buried) this.instance).getAppChannel();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getAppChannelBytes() {
                return ((Buried) this.instance).getAppChannelBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public int getAppEnv() {
                return ((Buried) this.instance).getAppEnv();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getAppId() {
                return ((Buried) this.instance).getAppId();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getAppIdBytes() {
                return ((Buried) this.instance).getAppIdBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getAppName() {
                return ((Buried) this.instance).getAppName();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getAppNameBytes() {
                return ((Buried) this.instance).getAppNameBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getAppVersion() {
                return ((Buried) this.instance).getAppVersion();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getAppVersionBytes() {
                return ((Buried) this.instance).getAppVersionBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getCarrier() {
                return ((Buried) this.instance).getCarrier();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getCarrierBytes() {
                return ((Buried) this.instance).getCarrierBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getDeviceBrand() {
                return ((Buried) this.instance).getDeviceBrand();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getDeviceBrandBytes() {
                return ((Buried) this.instance).getDeviceBrandBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getDeviceModel() {
                return ((Buried) this.instance).getDeviceModel();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((Buried) this.instance).getDeviceModelBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public long getDoneAtTime() {
                return ((Buried) this.instance).getDoneAtTime();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getEventId() {
                return ((Buried) this.instance).getEventId();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getEventIdBytes() {
                return ((Buried) this.instance).getEventIdBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getEventName() {
                return ((Buried) this.instance).getEventName();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getEventNameBytes() {
                return ((Buried) this.instance).getEventNameBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public long getEventTime() {
                return ((Buried) this.instance).getEventTime();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public int getEventType() {
                return ((Buried) this.instance).getEventType();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            @Deprecated
            public Map<String, CommonProto.AnyValue> getExtInfo() {
                return getExtInfoMap();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public int getExtInfoCount() {
                return ((Buried) this.instance).getExtInfoMap().size();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public Map<String, CommonProto.AnyValue> getExtInfoMap() {
                return Collections.unmodifiableMap(((Buried) this.instance).getExtInfoMap());
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public CommonProto.AnyValue getExtInfoOrDefault(String str, CommonProto.AnyValue anyValue) {
                str.getClass();
                Map<String, CommonProto.AnyValue> extInfoMap = ((Buried) this.instance).getExtInfoMap();
                return extInfoMap.containsKey(str) ? extInfoMap.get(str) : anyValue;
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public CommonProto.AnyValue getExtInfoOrThrow(String str) {
                str.getClass();
                Map<String, CommonProto.AnyValue> extInfoMap = ((Buried) this.instance).getExtInfoMap();
                if (extInfoMap.containsKey(str)) {
                    return extInfoMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getIp() {
                return ((Buried) this.instance).getIp();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getIpBytes() {
                return ((Buried) this.instance).getIpBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public int getNetworkType() {
                return ((Buried) this.instance).getNetworkType();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public int getOs() {
                return ((Buried) this.instance).getOs();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getOsVersion() {
                return ((Buried) this.instance).getOsVersion();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getOsVersionBytes() {
                return ((Buried) this.instance).getOsVersionBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getSessionId() {
                return ((Buried) this.instance).getSessionId();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getSessionIdBytes() {
                return ((Buried) this.instance).getSessionIdBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getUrl() {
                return ((Buried) this.instance).getUrl();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getUrlBytes() {
                return ((Buried) this.instance).getUrlBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getUserId() {
                return ((Buried) this.instance).getUserId();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getUserIdBytes() {
                return ((Buried) this.instance).getUserIdBytes();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public String getUuid() {
                return ((Buried) this.instance).getUuid();
            }

            @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
            public ByteString getUuidBytes() {
                return ((Buried) this.instance).getUuidBytes();
            }

            public Builder putAllExtInfo(Map<String, CommonProto.AnyValue> map) {
                copyOnWrite();
                ((Buried) this.instance).getMutableExtInfoMap().putAll(map);
                return this;
            }

            public Builder putExtInfo(String str, CommonProto.AnyValue anyValue) {
                str.getClass();
                anyValue.getClass();
                copyOnWrite();
                ((Buried) this.instance).getMutableExtInfoMap().put(str, anyValue);
                return this;
            }

            public Builder removeExtInfo(String str) {
                str.getClass();
                copyOnWrite();
                ((Buried) this.instance).getMutableExtInfoMap().remove(str);
                return this;
            }

            public Builder setAppChannel(String str) {
                copyOnWrite();
                ((Buried) this.instance).setAppChannel(str);
                return this;
            }

            public Builder setAppChannelBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setAppChannelBytes(byteString);
                return this;
            }

            public Builder setAppEnv(int i) {
                copyOnWrite();
                ((Buried) this.instance).setAppEnv(i);
                return this;
            }

            public Builder setAppId(String str) {
                copyOnWrite();
                ((Buried) this.instance).setAppId(str);
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setAppIdBytes(byteString);
                return this;
            }

            public Builder setAppName(String str) {
                copyOnWrite();
                ((Buried) this.instance).setAppName(str);
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setAppNameBytes(byteString);
                return this;
            }

            public Builder setAppVersion(String str) {
                copyOnWrite();
                ((Buried) this.instance).setAppVersion(str);
                return this;
            }

            public Builder setAppVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setAppVersionBytes(byteString);
                return this;
            }

            public Builder setCarrier(String str) {
                copyOnWrite();
                ((Buried) this.instance).setCarrier(str);
                return this;
            }

            public Builder setCarrierBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setCarrierBytes(byteString);
                return this;
            }

            public Builder setDeviceBrand(String str) {
                copyOnWrite();
                ((Buried) this.instance).setDeviceBrand(str);
                return this;
            }

            public Builder setDeviceBrandBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setDeviceBrandBytes(byteString);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((Buried) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            public Builder setDoneAtTime(long j) {
                copyOnWrite();
                ((Buried) this.instance).setDoneAtTime(j);
                return this;
            }

            public Builder setEventId(String str) {
                copyOnWrite();
                ((Buried) this.instance).setEventId(str);
                return this;
            }

            public Builder setEventIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setEventIdBytes(byteString);
                return this;
            }

            public Builder setEventName(String str) {
                copyOnWrite();
                ((Buried) this.instance).setEventName(str);
                return this;
            }

            public Builder setEventNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setEventNameBytes(byteString);
                return this;
            }

            public Builder setEventTime(long j) {
                copyOnWrite();
                ((Buried) this.instance).setEventTime(j);
                return this;
            }

            public Builder setEventType(int i) {
                copyOnWrite();
                ((Buried) this.instance).setEventType(i);
                return this;
            }

            public Builder setIp(String str) {
                copyOnWrite();
                ((Buried) this.instance).setIp(str);
                return this;
            }

            public Builder setIpBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setIpBytes(byteString);
                return this;
            }

            public Builder setNetworkType(int i) {
                copyOnWrite();
                ((Buried) this.instance).setNetworkType(i);
                return this;
            }

            public Builder setOs(int i) {
                copyOnWrite();
                ((Buried) this.instance).setOs(i);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((Buried) this.instance).setOsVersion(str);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((Buried) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setSessionIdBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((Buried) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((Buried) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((Buried) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((Buried) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(Buried.DEFAULT_INSTANCE);
            }
        }

        public static final class ExtInfoDefaultEntryHolder {
            static final MapEntryLite<String, CommonProto.AnyValue> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, CommonProto.AnyValue.getDefaultInstance());

            private ExtInfoDefaultEntryHolder() {
            }
        }

        static {
            Buried buried = new Buried();
            DEFAULT_INSTANCE = buried;
            GeneratedMessageLite.registerDefaultInstance(Buried.class, buried);
        }

        private Buried() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppChannel() {
            this.appChannel_ = getDefaultInstance().getAppChannel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppEnv() {
            this.appEnv_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppName() {
            this.appName_ = getDefaultInstance().getAppName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVersion() {
            this.appVersion_ = getDefaultInstance().getAppVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCarrier() {
            this.carrier_ = getDefaultInstance().getCarrier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceBrand() {
            this.deviceBrand_ = getDefaultInstance().getDeviceBrand();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoneAtTime() {
            this.doneAtTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventName() {
            this.eventName_ = getDefaultInstance().getEventName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventTime() {
            this.eventTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventType() {
            this.eventType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIp() {
            this.ip_ = getDefaultInstance().getIp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkType() {
            this.networkType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static Buried getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, CommonProto.AnyValue> getMutableExtInfoMap() {
            return internalGetMutableExtInfo();
        }

        private MapFieldLite<String, CommonProto.AnyValue> internalGetExtInfo() {
            return this.extInfo_;
        }

        private MapFieldLite<String, CommonProto.AnyValue> internalGetMutableExtInfo() {
            if (!this.extInfo_.isMutable()) {
                this.extInfo_ = this.extInfo_.mutableCopy();
            }
            return this.extInfo_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Buried parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Buried) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Buried parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Buried> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppChannel(String str) {
            str.getClass();
            this.appChannel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppChannelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appChannel_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppEnv(int i) {
            this.appEnv_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppId(String str) {
            str.getClass();
            this.appId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppName(String str) {
            str.getClass();
            this.appName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVersion(String str) {
            str.getClass();
            this.appVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrier(String str) {
            str.getClass();
            this.carrier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrierBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.carrier_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBrand(String str) {
            str.getClass();
            this.deviceBrand_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBrandBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceBrand_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoneAtTime(long j) {
            this.doneAtTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(String str) {
            str.getClass();
            this.eventId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventName(String str) {
            str.getClass();
            this.eventName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTime(long j) {
            this.eventTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventType(int i) {
            this.eventType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIp(String str) {
            str.getClass();
            this.ip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ip_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkType(int i) {
            this.networkType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(int i) {
            this.os_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public boolean containsExtInfo(String str) {
            str.getClass();
            return internalGetExtInfo().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Buried();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0000\u0001\u0016\u0016\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0004\nȈ\u000bȈ\fȈ\rȈ\u000e\u0004\u000fȈ\u0010\u0004\u0011Ȉ\u0012Ȉ\u0013Ȉ\u00142\u0015Ȉ\u0016\u0002", new Object[]{"uuid_", "userId_", "os_", "osVersion_", "eventTime_", "url_", "eventId_", "eventName_", "eventType_", "appId_", "appName_", "appVersion_", "appChannel_", "appEnv_", "ip_", "networkType_", "deviceBrand_", "deviceModel_", "carrier_", "extInfo_", ExtInfoDefaultEntryHolder.defaultEntry, "sessionId_", "doneAtTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Buried> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Buried.class) {
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

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getAppChannel() {
            return this.appChannel_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getAppChannelBytes() {
            return ByteString.copyFromUtf8(this.appChannel_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public int getAppEnv() {
            return this.appEnv_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getAppId() {
            return this.appId_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getAppIdBytes() {
            return ByteString.copyFromUtf8(this.appId_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getAppName() {
            return this.appName_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getAppNameBytes() {
            return ByteString.copyFromUtf8(this.appName_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getAppVersionBytes() {
            return ByteString.copyFromUtf8(this.appVersion_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getCarrier() {
            return this.carrier_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getCarrierBytes() {
            return ByteString.copyFromUtf8(this.carrier_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getDeviceBrand() {
            return this.deviceBrand_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getDeviceBrandBytes() {
            return ByteString.copyFromUtf8(this.deviceBrand_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public long getDoneAtTime() {
            return this.doneAtTime_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getEventId() {
            return this.eventId_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getEventIdBytes() {
            return ByteString.copyFromUtf8(this.eventId_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getEventName() {
            return this.eventName_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getEventNameBytes() {
            return ByteString.copyFromUtf8(this.eventName_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public long getEventTime() {
            return this.eventTime_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public int getEventType() {
            return this.eventType_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        @Deprecated
        public Map<String, CommonProto.AnyValue> getExtInfo() {
            return getExtInfoMap();
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public int getExtInfoCount() {
            return internalGetExtInfo().size();
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public Map<String, CommonProto.AnyValue> getExtInfoMap() {
            return Collections.unmodifiableMap(internalGetExtInfo());
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public CommonProto.AnyValue getExtInfoOrDefault(String str, CommonProto.AnyValue anyValue) {
            str.getClass();
            MapFieldLite<String, CommonProto.AnyValue> mapFieldLiteInternalGetExtInfo = internalGetExtInfo();
            return mapFieldLiteInternalGetExtInfo.containsKey(str) ? mapFieldLiteInternalGetExtInfo.get(str) : anyValue;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public CommonProto.AnyValue getExtInfoOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, CommonProto.AnyValue> mapFieldLiteInternalGetExtInfo = internalGetExtInfo();
            if (mapFieldLiteInternalGetExtInfo.containsKey(str)) {
                return mapFieldLiteInternalGetExtInfo.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getIp() {
            return this.ip_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getIpBytes() {
            return ByteString.copyFromUtf8(this.ip_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public int getNetworkType() {
            return this.networkType_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public int getOs() {
            return this.os_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.common.support.apm.protobuf.BuriedProto.BuriedOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public static Builder newBuilder(Buried buried) {
            return DEFAULT_INSTANCE.createBuilder(buried);
        }

        public static Buried parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Buried) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Buried parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Buried parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Buried parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Buried parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Buried parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Buried parseFrom(InputStream inputStream) throws IOException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Buried parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Buried parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Buried parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Buried) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BuriedOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtInfo(String str);

        String getAppChannel();

        ByteString getAppChannelBytes();

        int getAppEnv();

        String getAppId();

        ByteString getAppIdBytes();

        String getAppName();

        ByteString getAppNameBytes();

        String getAppVersion();

        ByteString getAppVersionBytes();

        String getCarrier();

        ByteString getCarrierBytes();

        String getDeviceBrand();

        ByteString getDeviceBrandBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        long getDoneAtTime();

        String getEventId();

        ByteString getEventIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        long getEventTime();

        int getEventType();

        @Deprecated
        Map<String, CommonProto.AnyValue> getExtInfo();

        int getExtInfoCount();

        Map<String, CommonProto.AnyValue> getExtInfoMap();

        CommonProto.AnyValue getExtInfoOrDefault(String str, CommonProto.AnyValue anyValue);

        CommonProto.AnyValue getExtInfoOrThrow(String str);

        String getIp();

        ByteString getIpBytes();

        int getNetworkType();

        int getOs();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        String getUrl();

        ByteString getUrlBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUuid();

        ByteString getUuidBytes();
    }

    private BuriedProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
