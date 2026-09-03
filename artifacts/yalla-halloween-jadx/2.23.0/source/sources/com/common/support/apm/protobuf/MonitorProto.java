package com.common.support.apm.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MonitorProto {

    /* JADX INFO: renamed from: com.common.support.apm.protobuf.MonitorProto$1, reason: invalid class name */
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

    public static final class AppInfo extends GeneratedMessageLite<AppInfo, Builder> implements AppInfoOrBuilder {
        public static final int APP_DEVICE_ID_FIELD_NUMBER = 4;
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int APP_KEY_FIELD_NUMBER = 2;
        public static final int APP_NAMESPACE_FIELD_NUMBER = 9;
        public static final int APP_USER_IDEN_FIELD_NUMBER = 5;
        public static final int APP_VERSION_FIELD_NUMBER = 3;
        public static final int CLIENT_IP_FIELD_NUMBER = 8;
        public static final int CLIENT_TYPE_FIELD_NUMBER = 7;
        private static final AppInfo DEFAULT_INSTANCE;
        private static volatile Parser<AppInfo> PARSER = null;
        public static final int SDK_VERSION_FIELD_NUMBER = 6;
        private int clientType_;
        private String appId_ = "";
        private String appKey_ = "";
        private String appVersion_ = "";
        private String appDeviceId_ = "";
        private String appUserIden_ = "";
        private String sdkVersion_ = "";
        private String clientIp_ = "";
        private String appNamespace_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<AppInfo, Builder> implements AppInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppDeviceId() {
                copyOnWrite();
                ((AppInfo) this.instance).clearAppDeviceId();
                return this;
            }

            public Builder clearAppId() {
                copyOnWrite();
                ((AppInfo) this.instance).clearAppId();
                return this;
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((AppInfo) this.instance).clearAppKey();
                return this;
            }

            public Builder clearAppNamespace() {
                copyOnWrite();
                ((AppInfo) this.instance).clearAppNamespace();
                return this;
            }

            public Builder clearAppUserIden() {
                copyOnWrite();
                ((AppInfo) this.instance).clearAppUserIden();
                return this;
            }

            public Builder clearAppVersion() {
                copyOnWrite();
                ((AppInfo) this.instance).clearAppVersion();
                return this;
            }

            public Builder clearClientIp() {
                copyOnWrite();
                ((AppInfo) this.instance).clearClientIp();
                return this;
            }

            public Builder clearClientType() {
                copyOnWrite();
                ((AppInfo) this.instance).clearClientType();
                return this;
            }

            public Builder clearSdkVersion() {
                copyOnWrite();
                ((AppInfo) this.instance).clearSdkVersion();
                return this;
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getAppDeviceId() {
                return ((AppInfo) this.instance).getAppDeviceId();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getAppDeviceIdBytes() {
                return ((AppInfo) this.instance).getAppDeviceIdBytes();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getAppId() {
                return ((AppInfo) this.instance).getAppId();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getAppIdBytes() {
                return ((AppInfo) this.instance).getAppIdBytes();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getAppKey() {
                return ((AppInfo) this.instance).getAppKey();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getAppKeyBytes() {
                return ((AppInfo) this.instance).getAppKeyBytes();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getAppNamespace() {
                return ((AppInfo) this.instance).getAppNamespace();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getAppNamespaceBytes() {
                return ((AppInfo) this.instance).getAppNamespaceBytes();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getAppUserIden() {
                return ((AppInfo) this.instance).getAppUserIden();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getAppUserIdenBytes() {
                return ((AppInfo) this.instance).getAppUserIdenBytes();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getAppVersion() {
                return ((AppInfo) this.instance).getAppVersion();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getAppVersionBytes() {
                return ((AppInfo) this.instance).getAppVersionBytes();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getClientIp() {
                return ((AppInfo) this.instance).getClientIp();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getClientIpBytes() {
                return ((AppInfo) this.instance).getClientIpBytes();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public int getClientType() {
                return ((AppInfo) this.instance).getClientType();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public String getSdkVersion() {
                return ((AppInfo) this.instance).getSdkVersion();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
            public ByteString getSdkVersionBytes() {
                return ((AppInfo) this.instance).getSdkVersionBytes();
            }

            public Builder setAppDeviceId(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppDeviceId(str);
                return this;
            }

            public Builder setAppDeviceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppDeviceIdBytes(byteString);
                return this;
            }

            public Builder setAppId(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppId(str);
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppIdBytes(byteString);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setAppNamespace(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppNamespace(str);
                return this;
            }

            public Builder setAppNamespaceBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppNamespaceBytes(byteString);
                return this;
            }

            public Builder setAppUserIden(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppUserIden(str);
                return this;
            }

            public Builder setAppUserIdenBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppUserIdenBytes(byteString);
                return this;
            }

            public Builder setAppVersion(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppVersion(str);
                return this;
            }

            public Builder setAppVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setAppVersionBytes(byteString);
                return this;
            }

            public Builder setClientIp(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setClientIp(str);
                return this;
            }

            public Builder setClientIpBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setClientIpBytes(byteString);
                return this;
            }

            public Builder setClientType(int i) {
                copyOnWrite();
                ((AppInfo) this.instance).setClientType(i);
                return this;
            }

            public Builder setSdkVersion(String str) {
                copyOnWrite();
                ((AppInfo) this.instance).setSdkVersion(str);
                return this;
            }

            public Builder setSdkVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((AppInfo) this.instance).setSdkVersionBytes(byteString);
                return this;
            }

            private Builder() {
                super(AppInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            AppInfo appInfo = new AppInfo();
            DEFAULT_INSTANCE = appInfo;
            GeneratedMessageLite.registerDefaultInstance(AppInfo.class, appInfo);
        }

        private AppInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppDeviceId() {
            this.appDeviceId_ = getDefaultInstance().getAppDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppNamespace() {
            this.appNamespace_ = getDefaultInstance().getAppNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppUserIden() {
            this.appUserIden_ = getDefaultInstance().getAppUserIden();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVersion() {
            this.appVersion_ = getDefaultInstance().getAppVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientIp() {
            this.clientIp_ = getDefaultInstance().getClientIp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientType() {
            this.clientType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkVersion() {
            this.sdkVersion_ = getDefaultInstance().getSdkVersion();
        }

        public static AppInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AppInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppDeviceId(String str) {
            str.getClass();
            this.appDeviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppDeviceIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appDeviceId_ = byteString.toStringUtf8();
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
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNamespace(String str) {
            str.getClass();
            this.appNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNamespaceBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appNamespace_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppUserIden(String str) {
            str.getClass();
            this.appUserIden_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppUserIdenBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appUserIden_ = byteString.toStringUtf8();
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
        public void setClientIp(String str) {
            str.getClass();
            this.clientIp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIpBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.clientIp_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientType(int i) {
            this.clientType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersion(String str) {
            str.getClass();
            this.sdkVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sdkVersion_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0004\bȈ\tȈ", new Object[]{"appId_", "appKey_", "appVersion_", "appDeviceId_", "appUserIden_", "sdkVersion_", "clientType_", "clientIp_", "appNamespace_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AppInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AppInfo.class) {
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

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getAppDeviceId() {
            return this.appDeviceId_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getAppDeviceIdBytes() {
            return ByteString.copyFromUtf8(this.appDeviceId_);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getAppId() {
            return this.appId_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getAppIdBytes() {
            return ByteString.copyFromUtf8(this.appId_);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getAppNamespace() {
            return this.appNamespace_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getAppNamespaceBytes() {
            return ByteString.copyFromUtf8(this.appNamespace_);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getAppUserIden() {
            return this.appUserIden_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getAppUserIdenBytes() {
            return ByteString.copyFromUtf8(this.appUserIden_);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getAppVersionBytes() {
            return ByteString.copyFromUtf8(this.appVersion_);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getClientIp() {
            return this.clientIp_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getClientIpBytes() {
            return ByteString.copyFromUtf8(this.clientIp_);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public int getClientType() {
            return this.clientType_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public String getSdkVersion() {
            return this.sdkVersion_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.AppInfoOrBuilder
        public ByteString getSdkVersionBytes() {
            return ByteString.copyFromUtf8(this.sdkVersion_);
        }

        public static Builder newBuilder(AppInfo appInfo) {
            return DEFAULT_INSTANCE.createBuilder(appInfo);
        }

        public static AppInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AppInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AppInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AppInfo parseFrom(InputStream inputStream) throws IOException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AppInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AppInfoOrBuilder extends MessageLiteOrBuilder {
        String getAppDeviceId();

        ByteString getAppDeviceIdBytes();

        String getAppId();

        ByteString getAppIdBytes();

        String getAppKey();

        ByteString getAppKeyBytes();

        String getAppNamespace();

        ByteString getAppNamespaceBytes();

        String getAppUserIden();

        ByteString getAppUserIdenBytes();

        String getAppVersion();

        ByteString getAppVersionBytes();

        String getClientIp();

        ByteString getClientIpBytes();

        int getClientType();

        String getSdkVersion();

        ByteString getSdkVersionBytes();
    }

    public static final class ModuleMetric extends GeneratedMessageLite<ModuleMetric, Builder> implements ModuleMetricOrBuilder {
        private static final ModuleMetric DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 4;
        public static final int FAIL_CNT_FIELD_NUMBER = 3;
        private static volatile Parser<ModuleMetric> PARSER = null;
        public static final int TOTAL_CNT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int errorCode_;
        private int failCnt_;
        private int totalCnt_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<ModuleMetric, Builder> implements ModuleMetricOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((ModuleMetric) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearFailCnt() {
                copyOnWrite();
                ((ModuleMetric) this.instance).clearFailCnt();
                return this;
            }

            public Builder clearTotalCnt() {
                copyOnWrite();
                ((ModuleMetric) this.instance).clearTotalCnt();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((ModuleMetric) this.instance).clearType();
                return this;
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
            public int getErrorCode() {
                return ((ModuleMetric) this.instance).getErrorCode();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
            public int getFailCnt() {
                return ((ModuleMetric) this.instance).getFailCnt();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
            public int getTotalCnt() {
                return ((ModuleMetric) this.instance).getTotalCnt();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
            public int getType() {
                return ((ModuleMetric) this.instance).getType();
            }

            public Builder setErrorCode(int i) {
                copyOnWrite();
                ((ModuleMetric) this.instance).setErrorCode(i);
                return this;
            }

            public Builder setFailCnt(int i) {
                copyOnWrite();
                ((ModuleMetric) this.instance).setFailCnt(i);
                return this;
            }

            public Builder setTotalCnt(int i) {
                copyOnWrite();
                ((ModuleMetric) this.instance).setTotalCnt(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((ModuleMetric) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(ModuleMetric.DEFAULT_INSTANCE);
            }
        }

        static {
            ModuleMetric moduleMetric = new ModuleMetric();
            DEFAULT_INSTANCE = moduleMetric;
            GeneratedMessageLite.registerDefaultInstance(ModuleMetric.class, moduleMetric);
        }

        private ModuleMetric() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFailCnt() {
            this.failCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalCnt() {
            this.totalCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static ModuleMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ModuleMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ModuleMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModuleMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ModuleMetric> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFailCnt(int i) {
            this.failCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalCnt(int i) {
            this.totalCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ModuleMetric();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"type_", "totalCnt_", "failCnt_", "errorCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ModuleMetric> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ModuleMetric.class) {
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

        @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
        public int getErrorCode() {
            return this.errorCode_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
        public int getFailCnt() {
            return this.failCnt_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
        public int getTotalCnt() {
            return this.totalCnt_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.ModuleMetricOrBuilder
        public int getType() {
            return this.type_;
        }

        public static Builder newBuilder(ModuleMetric moduleMetric) {
            return DEFAULT_INSTANCE.createBuilder(moduleMetric);
        }

        public static ModuleMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ModuleMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ModuleMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ModuleMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ModuleMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ModuleMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ModuleMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ModuleMetric parseFrom(InputStream inputStream) throws IOException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModuleMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ModuleMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ModuleMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ModuleMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ModuleMetricOrBuilder extends MessageLiteOrBuilder {
        int getErrorCode();

        int getFailCnt();

        int getTotalCnt();

        int getType();
    }

    public static final class ModuleStatus extends GeneratedMessageLite<ModuleStatus, Builder> implements ModuleStatusOrBuilder {
        private static final ModuleStatus DEFAULT_INSTANCE;
        private static volatile Parser<ModuleStatus> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int status_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<ModuleStatus, Builder> implements ModuleStatusOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((ModuleStatus) this.instance).clearStatus();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((ModuleStatus) this.instance).clearType();
                return this;
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.ModuleStatusOrBuilder
            public int getStatus() {
                return ((ModuleStatus) this.instance).getStatus();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.ModuleStatusOrBuilder
            public int getType() {
                return ((ModuleStatus) this.instance).getType();
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((ModuleStatus) this.instance).setStatus(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((ModuleStatus) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(ModuleStatus.DEFAULT_INSTANCE);
            }
        }

        static {
            ModuleStatus moduleStatus = new ModuleStatus();
            DEFAULT_INSTANCE = moduleStatus;
            GeneratedMessageLite.registerDefaultInstance(ModuleStatus.class, moduleStatus);
        }

        private ModuleStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static ModuleStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ModuleStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ModuleStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModuleStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ModuleStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i) {
            this.status_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ModuleStatus();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"type_", "status_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ModuleStatus> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ModuleStatus.class) {
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

        @Override // com.common.support.apm.protobuf.MonitorProto.ModuleStatusOrBuilder
        public int getStatus() {
            return this.status_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.ModuleStatusOrBuilder
        public int getType() {
            return this.type_;
        }

        public static Builder newBuilder(ModuleStatus moduleStatus) {
            return DEFAULT_INSTANCE.createBuilder(moduleStatus);
        }

        public static ModuleStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ModuleStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ModuleStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ModuleStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ModuleStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ModuleStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ModuleStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ModuleStatus parseFrom(InputStream inputStream) throws IOException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModuleStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ModuleStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ModuleStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ModuleStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ModuleStatusOrBuilder extends MessageLiteOrBuilder {
        int getStatus();

        int getType();
    }

    public static final class Monitor extends GeneratedMessageLite<Monitor, Builder> implements MonitorOrBuilder {
        private static final Monitor DEFAULT_INSTANCE;
        public static final int MODULE_METRIC_FIELD_NUMBER = 2;
        public static final int MODULE_STATUS_FIELD_NUMBER = 1;
        private static volatile Parser<Monitor> PARSER;
        private Internal.ProtobufList<ModuleStatus> moduleStatus_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<ModuleMetric> moduleMetric_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<Monitor, Builder> implements MonitorOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllModuleMetric(Iterable<? extends ModuleMetric> iterable) {
                copyOnWrite();
                ((Monitor) this.instance).addAllModuleMetric(iterable);
                return this;
            }

            public Builder addAllModuleStatus(Iterable<? extends ModuleStatus> iterable) {
                copyOnWrite();
                ((Monitor) this.instance).addAllModuleStatus(iterable);
                return this;
            }

            public Builder addModuleMetric(ModuleMetric moduleMetric) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleMetric(moduleMetric);
                return this;
            }

            public Builder addModuleStatus(ModuleStatus moduleStatus) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleStatus(moduleStatus);
                return this;
            }

            public Builder clearModuleMetric() {
                copyOnWrite();
                ((Monitor) this.instance).clearModuleMetric();
                return this;
            }

            public Builder clearModuleStatus() {
                copyOnWrite();
                ((Monitor) this.instance).clearModuleStatus();
                return this;
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
            public ModuleMetric getModuleMetric(int i) {
                return ((Monitor) this.instance).getModuleMetric(i);
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
            public int getModuleMetricCount() {
                return ((Monitor) this.instance).getModuleMetricCount();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
            public List<ModuleMetric> getModuleMetricList() {
                return Collections.unmodifiableList(((Monitor) this.instance).getModuleMetricList());
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
            public ModuleStatus getModuleStatus(int i) {
                return ((Monitor) this.instance).getModuleStatus(i);
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
            public int getModuleStatusCount() {
                return ((Monitor) this.instance).getModuleStatusCount();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
            public List<ModuleStatus> getModuleStatusList() {
                return Collections.unmodifiableList(((Monitor) this.instance).getModuleStatusList());
            }

            public Builder removeModuleMetric(int i) {
                copyOnWrite();
                ((Monitor) this.instance).removeModuleMetric(i);
                return this;
            }

            public Builder removeModuleStatus(int i) {
                copyOnWrite();
                ((Monitor) this.instance).removeModuleStatus(i);
                return this;
            }

            public Builder setModuleMetric(int i, ModuleMetric moduleMetric) {
                copyOnWrite();
                ((Monitor) this.instance).setModuleMetric(i, moduleMetric);
                return this;
            }

            public Builder setModuleStatus(int i, ModuleStatus moduleStatus) {
                copyOnWrite();
                ((Monitor) this.instance).setModuleStatus(i, moduleStatus);
                return this;
            }

            private Builder() {
                super(Monitor.DEFAULT_INSTANCE);
            }

            public Builder addModuleMetric(int i, ModuleMetric moduleMetric) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleMetric(i, moduleMetric);
                return this;
            }

            public Builder addModuleStatus(int i, ModuleStatus moduleStatus) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleStatus(i, moduleStatus);
                return this;
            }

            public Builder setModuleMetric(int i, ModuleMetric.Builder builder) {
                copyOnWrite();
                ((Monitor) this.instance).setModuleMetric(i, builder.build());
                return this;
            }

            public Builder setModuleStatus(int i, ModuleStatus.Builder builder) {
                copyOnWrite();
                ((Monitor) this.instance).setModuleStatus(i, builder.build());
                return this;
            }

            public Builder addModuleMetric(ModuleMetric.Builder builder) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleMetric(builder.build());
                return this;
            }

            public Builder addModuleStatus(ModuleStatus.Builder builder) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleStatus(builder.build());
                return this;
            }

            public Builder addModuleMetric(int i, ModuleMetric.Builder builder) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleMetric(i, builder.build());
                return this;
            }

            public Builder addModuleStatus(int i, ModuleStatus.Builder builder) {
                copyOnWrite();
                ((Monitor) this.instance).addModuleStatus(i, builder.build());
                return this;
            }
        }

        static {
            Monitor monitor = new Monitor();
            DEFAULT_INSTANCE = monitor;
            GeneratedMessageLite.registerDefaultInstance(Monitor.class, monitor);
        }

        private Monitor() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllModuleMetric(Iterable<? extends ModuleMetric> iterable) {
            ensureModuleMetricIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.moduleMetric_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllModuleStatus(Iterable<? extends ModuleStatus> iterable) {
            ensureModuleStatusIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.moduleStatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModuleMetric(ModuleMetric moduleMetric) {
            moduleMetric.getClass();
            ensureModuleMetricIsMutable();
            this.moduleMetric_.add(moduleMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModuleStatus(ModuleStatus moduleStatus) {
            moduleStatus.getClass();
            ensureModuleStatusIsMutable();
            this.moduleStatus_.add(moduleStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModuleMetric() {
            this.moduleMetric_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModuleStatus() {
            this.moduleStatus_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureModuleMetricIsMutable() {
            if (this.moduleMetric_.isModifiable()) {
                return;
            }
            this.moduleMetric_ = GeneratedMessageLite.mutableCopy(this.moduleMetric_);
        }

        private void ensureModuleStatusIsMutable() {
            if (this.moduleStatus_.isModifiable()) {
                return;
            }
            this.moduleStatus_ = GeneratedMessageLite.mutableCopy(this.moduleStatus_);
        }

        public static Monitor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Monitor parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Monitor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Monitor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Monitor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeModuleMetric(int i) {
            ensureModuleMetricIsMutable();
            this.moduleMetric_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeModuleStatus(int i) {
            ensureModuleStatusIsMutable();
            this.moduleStatus_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModuleMetric(int i, ModuleMetric moduleMetric) {
            moduleMetric.getClass();
            ensureModuleMetricIsMutable();
            this.moduleMetric_.set(i, moduleMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModuleStatus(int i, ModuleStatus moduleStatus) {
            moduleStatus.getClass();
            ensureModuleStatusIsMutable();
            this.moduleStatus_.set(i, moduleStatus);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Monitor();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"moduleStatus_", ModuleStatus.class, "moduleMetric_", ModuleMetric.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Monitor> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Monitor.class) {
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

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
        public ModuleMetric getModuleMetric(int i) {
            return this.moduleMetric_.get(i);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
        public int getModuleMetricCount() {
            return this.moduleMetric_.size();
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
        public List<ModuleMetric> getModuleMetricList() {
            return this.moduleMetric_;
        }

        public ModuleMetricOrBuilder getModuleMetricOrBuilder(int i) {
            return this.moduleMetric_.get(i);
        }

        public List<? extends ModuleMetricOrBuilder> getModuleMetricOrBuilderList() {
            return this.moduleMetric_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
        public ModuleStatus getModuleStatus(int i) {
            return this.moduleStatus_.get(i);
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
        public int getModuleStatusCount() {
            return this.moduleStatus_.size();
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorOrBuilder
        public List<ModuleStatus> getModuleStatusList() {
            return this.moduleStatus_;
        }

        public ModuleStatusOrBuilder getModuleStatusOrBuilder(int i) {
            return this.moduleStatus_.get(i);
        }

        public List<? extends ModuleStatusOrBuilder> getModuleStatusOrBuilderList() {
            return this.moduleStatus_;
        }

        public static Builder newBuilder(Monitor monitor) {
            return DEFAULT_INSTANCE.createBuilder(monitor);
        }

        public static Monitor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Monitor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Monitor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Monitor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModuleMetric(int i, ModuleMetric moduleMetric) {
            moduleMetric.getClass();
            ensureModuleMetricIsMutable();
            this.moduleMetric_.add(i, moduleMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModuleStatus(int i, ModuleStatus moduleStatus) {
            moduleStatus.getClass();
            ensureModuleStatusIsMutable();
            this.moduleStatus_.add(i, moduleStatus);
        }

        public static Monitor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Monitor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Monitor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Monitor parseFrom(InputStream inputStream) throws IOException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Monitor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Monitor parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Monitor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Monitor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MonitorMessage extends GeneratedMessageLite<MonitorMessage, Builder> implements MonitorMessageOrBuilder {
        public static final int APP_INFO_FIELD_NUMBER = 3;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final MonitorMessage DEFAULT_INSTANCE;
        public static final int HEAD_FIELD_NUMBER = 1;
        private static volatile Parser<MonitorMessage> PARSER;
        private AppInfo appInfo_;
        private ByteString body_ = ByteString.EMPTY;
        private int head_;

        public static final class Builder extends GeneratedMessageLite.Builder<MonitorMessage, Builder> implements MonitorMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppInfo() {
                copyOnWrite();
                ((MonitorMessage) this.instance).clearAppInfo();
                return this;
            }

            public Builder clearBody() {
                copyOnWrite();
                ((MonitorMessage) this.instance).clearBody();
                return this;
            }

            public Builder clearHead() {
                copyOnWrite();
                ((MonitorMessage) this.instance).clearHead();
                return this;
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
            public AppInfo getAppInfo() {
                return ((MonitorMessage) this.instance).getAppInfo();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
            public ByteString getBody() {
                return ((MonitorMessage) this.instance).getBody();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
            public int getHead() {
                return ((MonitorMessage) this.instance).getHead();
            }

            @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
            public boolean hasAppInfo() {
                return ((MonitorMessage) this.instance).hasAppInfo();
            }

            public Builder mergeAppInfo(AppInfo appInfo) {
                copyOnWrite();
                ((MonitorMessage) this.instance).mergeAppInfo(appInfo);
                return this;
            }

            public Builder setAppInfo(AppInfo appInfo) {
                copyOnWrite();
                ((MonitorMessage) this.instance).setAppInfo(appInfo);
                return this;
            }

            public Builder setBody(ByteString byteString) {
                copyOnWrite();
                ((MonitorMessage) this.instance).setBody(byteString);
                return this;
            }

            public Builder setHead(int i) {
                copyOnWrite();
                ((MonitorMessage) this.instance).setHead(i);
                return this;
            }

            private Builder() {
                super(MonitorMessage.DEFAULT_INSTANCE);
            }

            public Builder setAppInfo(AppInfo.Builder builder) {
                copyOnWrite();
                ((MonitorMessage) this.instance).setAppInfo(builder.build());
                return this;
            }
        }

        static {
            MonitorMessage monitorMessage = new MonitorMessage();
            DEFAULT_INSTANCE = monitorMessage;
            GeneratedMessageLite.registerDefaultInstance(MonitorMessage.class, monitorMessage);
        }

        private MonitorMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppInfo() {
            this.appInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBody() {
            this.body_ = getDefaultInstance().getBody();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHead() {
            this.head_ = 0;
        }

        public static MonitorMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppInfo(AppInfo appInfo) {
            appInfo.getClass();
            AppInfo appInfo2 = this.appInfo_;
            if (appInfo2 == null || appInfo2 == AppInfo.getDefaultInstance()) {
                this.appInfo_ = appInfo;
            } else {
                this.appInfo_ = AppInfo.newBuilder(this.appInfo_).mergeFrom(appInfo).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MonitorMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitorMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitorMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MonitorMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppInfo(AppInfo appInfo) {
            appInfo.getClass();
            this.appInfo_ = appInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBody(ByteString byteString) {
            byteString.getClass();
            this.body_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHead(int i) {
            this.head_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MonitorMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\t", new Object[]{"head_", "body_", "appInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MonitorMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MonitorMessage.class) {
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

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
        public AppInfo getAppInfo() {
            AppInfo appInfo = this.appInfo_;
            return appInfo == null ? AppInfo.getDefaultInstance() : appInfo;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
        public ByteString getBody() {
            return this.body_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
        public int getHead() {
            return this.head_;
        }

        @Override // com.common.support.apm.protobuf.MonitorProto.MonitorMessageOrBuilder
        public boolean hasAppInfo() {
            return this.appInfo_ != null;
        }

        public static Builder newBuilder(MonitorMessage monitorMessage) {
            return DEFAULT_INSTANCE.createBuilder(monitorMessage);
        }

        public static MonitorMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitorMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MonitorMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MonitorMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MonitorMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MonitorMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitorMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MonitorMessage parseFrom(InputStream inputStream) throws IOException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitorMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MonitorMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MonitorMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitorMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MonitorMessageOrBuilder extends MessageLiteOrBuilder {
        AppInfo getAppInfo();

        ByteString getBody();

        int getHead();

        boolean hasAppInfo();
    }

    public interface MonitorOrBuilder extends MessageLiteOrBuilder {
        ModuleMetric getModuleMetric(int i);

        int getModuleMetricCount();

        List<ModuleMetric> getModuleMetricList();

        ModuleStatus getModuleStatus(int i);

        int getModuleStatusCount();

        List<ModuleStatus> getModuleStatusList();
    }

    private MonitorProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
