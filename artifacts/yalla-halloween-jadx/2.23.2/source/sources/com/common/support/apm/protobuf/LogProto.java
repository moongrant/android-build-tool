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
public final class LogProto {

    /* JADX INFO: renamed from: com.common.support.apm.protobuf.LogProto$1, reason: invalid class name */
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

    public static final class Log extends GeneratedMessageLite<Log, Builder> implements LogOrBuilder {
        public static final int APPVERSION_FIELD_NUMBER = 5;
        private static final Log DEFAULT_INSTANCE;
        public static final int DONEATTIME_FIELD_NUMBER = 11;
        public static final int IDEN_FIELD_NUMBER = 1;
        public static final int LEVEL_FIELD_NUMBER = 3;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int NETWORKAVAILABLE_FIELD_NUMBER = 6;
        public static final int NETWORKTYPE_FIELD_NUMBER = 7;
        public static final int OPSEXPAND_FIELD_NUMBER = 10;
        public static final int PARAMS_FIELD_NUMBER = 9;
        private static volatile Parser<Log> PARSER = null;
        public static final int TAG_FIELD_NUMBER = 8;
        public static final int TIME_FIELD_NUMBER = 4;
        private long doneAtTime_;
        private boolean networkAvailable_;
        private MapFieldLite<String, CommonProto.AnyValue> params_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, CommonProto.AnyValue> opsExpand_ = MapFieldLite.emptyMapField();
        private String iden_ = "";
        private String message_ = "";
        private String level_ = "";
        private String time_ = "";
        private String appVersion_ = "";
        private String networkType_ = "";
        private String tag_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Log, Builder> implements LogOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppVersion() {
                copyOnWrite();
                ((Log) this.instance).clearAppVersion();
                return this;
            }

            public Builder clearDoneAtTime() {
                copyOnWrite();
                ((Log) this.instance).clearDoneAtTime();
                return this;
            }

            public Builder clearIden() {
                copyOnWrite();
                ((Log) this.instance).clearIden();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((Log) this.instance).clearLevel();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((Log) this.instance).clearMessage();
                return this;
            }

            public Builder clearNetworkAvailable() {
                copyOnWrite();
                ((Log) this.instance).clearNetworkAvailable();
                return this;
            }

            public Builder clearNetworkType() {
                copyOnWrite();
                ((Log) this.instance).clearNetworkType();
                return this;
            }

            public Builder clearOpsExpand() {
                copyOnWrite();
                ((Log) this.instance).getMutableOpsExpandMap().clear();
                return this;
            }

            public Builder clearParams() {
                copyOnWrite();
                ((Log) this.instance).getMutableParamsMap().clear();
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((Log) this.instance).clearTag();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((Log) this.instance).clearTime();
                return this;
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public boolean containsOpsExpand(String str) {
                str.getClass();
                return ((Log) this.instance).getOpsExpandMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public boolean containsParams(String str) {
                str.getClass();
                return ((Log) this.instance).getParamsMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public String getAppVersion() {
                return ((Log) this.instance).getAppVersion();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public ByteString getAppVersionBytes() {
                return ((Log) this.instance).getAppVersionBytes();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public long getDoneAtTime() {
                return ((Log) this.instance).getDoneAtTime();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public String getIden() {
                return ((Log) this.instance).getIden();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public ByteString getIdenBytes() {
                return ((Log) this.instance).getIdenBytes();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public String getLevel() {
                return ((Log) this.instance).getLevel();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public ByteString getLevelBytes() {
                return ((Log) this.instance).getLevelBytes();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public String getMessage() {
                return ((Log) this.instance).getMessage();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public ByteString getMessageBytes() {
                return ((Log) this.instance).getMessageBytes();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public boolean getNetworkAvailable() {
                return ((Log) this.instance).getNetworkAvailable();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public String getNetworkType() {
                return ((Log) this.instance).getNetworkType();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public ByteString getNetworkTypeBytes() {
                return ((Log) this.instance).getNetworkTypeBytes();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            @Deprecated
            public Map<String, CommonProto.AnyValue> getOpsExpand() {
                return getOpsExpandMap();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public int getOpsExpandCount() {
                return ((Log) this.instance).getOpsExpandMap().size();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public Map<String, CommonProto.AnyValue> getOpsExpandMap() {
                return Collections.unmodifiableMap(((Log) this.instance).getOpsExpandMap());
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public CommonProto.AnyValue getOpsExpandOrDefault(String str, CommonProto.AnyValue anyValue) {
                str.getClass();
                Map<String, CommonProto.AnyValue> opsExpandMap = ((Log) this.instance).getOpsExpandMap();
                return opsExpandMap.containsKey(str) ? opsExpandMap.get(str) : anyValue;
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public CommonProto.AnyValue getOpsExpandOrThrow(String str) {
                str.getClass();
                Map<String, CommonProto.AnyValue> opsExpandMap = ((Log) this.instance).getOpsExpandMap();
                if (opsExpandMap.containsKey(str)) {
                    return opsExpandMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            @Deprecated
            public Map<String, CommonProto.AnyValue> getParams() {
                return getParamsMap();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public int getParamsCount() {
                return ((Log) this.instance).getParamsMap().size();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public Map<String, CommonProto.AnyValue> getParamsMap() {
                return Collections.unmodifiableMap(((Log) this.instance).getParamsMap());
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public CommonProto.AnyValue getParamsOrDefault(String str, CommonProto.AnyValue anyValue) {
                str.getClass();
                Map<String, CommonProto.AnyValue> paramsMap = ((Log) this.instance).getParamsMap();
                return paramsMap.containsKey(str) ? paramsMap.get(str) : anyValue;
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public CommonProto.AnyValue getParamsOrThrow(String str) {
                str.getClass();
                Map<String, CommonProto.AnyValue> paramsMap = ((Log) this.instance).getParamsMap();
                if (paramsMap.containsKey(str)) {
                    return paramsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public String getTag() {
                return ((Log) this.instance).getTag();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public ByteString getTagBytes() {
                return ((Log) this.instance).getTagBytes();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public String getTime() {
                return ((Log) this.instance).getTime();
            }

            @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
            public ByteString getTimeBytes() {
                return ((Log) this.instance).getTimeBytes();
            }

            public Builder putAllOpsExpand(Map<String, CommonProto.AnyValue> map) {
                copyOnWrite();
                ((Log) this.instance).getMutableOpsExpandMap().putAll(map);
                return this;
            }

            public Builder putAllParams(Map<String, CommonProto.AnyValue> map) {
                copyOnWrite();
                ((Log) this.instance).getMutableParamsMap().putAll(map);
                return this;
            }

            public Builder putOpsExpand(String str, CommonProto.AnyValue anyValue) {
                str.getClass();
                anyValue.getClass();
                copyOnWrite();
                ((Log) this.instance).getMutableOpsExpandMap().put(str, anyValue);
                return this;
            }

            public Builder putParams(String str, CommonProto.AnyValue anyValue) {
                str.getClass();
                anyValue.getClass();
                copyOnWrite();
                ((Log) this.instance).getMutableParamsMap().put(str, anyValue);
                return this;
            }

            public Builder removeOpsExpand(String str) {
                str.getClass();
                copyOnWrite();
                ((Log) this.instance).getMutableOpsExpandMap().remove(str);
                return this;
            }

            public Builder removeParams(String str) {
                str.getClass();
                copyOnWrite();
                ((Log) this.instance).getMutableParamsMap().remove(str);
                return this;
            }

            public Builder setAppVersion(String str) {
                copyOnWrite();
                ((Log) this.instance).setAppVersion(str);
                return this;
            }

            public Builder setAppVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((Log) this.instance).setAppVersionBytes(byteString);
                return this;
            }

            public Builder setDoneAtTime(long j) {
                copyOnWrite();
                ((Log) this.instance).setDoneAtTime(j);
                return this;
            }

            public Builder setIden(String str) {
                copyOnWrite();
                ((Log) this.instance).setIden(str);
                return this;
            }

            public Builder setIdenBytes(ByteString byteString) {
                copyOnWrite();
                ((Log) this.instance).setIdenBytes(byteString);
                return this;
            }

            public Builder setLevel(String str) {
                copyOnWrite();
                ((Log) this.instance).setLevel(str);
                return this;
            }

            public Builder setLevelBytes(ByteString byteString) {
                copyOnWrite();
                ((Log) this.instance).setLevelBytes(byteString);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((Log) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((Log) this.instance).setMessageBytes(byteString);
                return this;
            }

            public Builder setNetworkAvailable(boolean z) {
                copyOnWrite();
                ((Log) this.instance).setNetworkAvailable(z);
                return this;
            }

            public Builder setNetworkType(String str) {
                copyOnWrite();
                ((Log) this.instance).setNetworkType(str);
                return this;
            }

            public Builder setNetworkTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Log) this.instance).setNetworkTypeBytes(byteString);
                return this;
            }

            public Builder setTag(String str) {
                copyOnWrite();
                ((Log) this.instance).setTag(str);
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                copyOnWrite();
                ((Log) this.instance).setTagBytes(byteString);
                return this;
            }

            public Builder setTime(String str) {
                copyOnWrite();
                ((Log) this.instance).setTime(str);
                return this;
            }

            public Builder setTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((Log) this.instance).setTimeBytes(byteString);
                return this;
            }

            private Builder() {
                super(Log.DEFAULT_INSTANCE);
            }
        }

        public static final class OpsExpandDefaultEntryHolder {
            static final MapEntryLite<String, CommonProto.AnyValue> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, CommonProto.AnyValue.getDefaultInstance());

            private OpsExpandDefaultEntryHolder() {
            }
        }

        public static final class ParamsDefaultEntryHolder {
            static final MapEntryLite<String, CommonProto.AnyValue> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, CommonProto.AnyValue.getDefaultInstance());

            private ParamsDefaultEntryHolder() {
            }
        }

        static {
            Log log = new Log();
            DEFAULT_INSTANCE = log;
            GeneratedMessageLite.registerDefaultInstance(Log.class, log);
        }

        private Log() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVersion() {
            this.appVersion_ = getDefaultInstance().getAppVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoneAtTime() {
            this.doneAtTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIden() {
            this.iden_ = getDefaultInstance().getIden();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = getDefaultInstance().getLevel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkAvailable() {
            this.networkAvailable_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkType() {
            this.networkType_ = getDefaultInstance().getNetworkType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = getDefaultInstance().getTag();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = getDefaultInstance().getTime();
        }

        public static Log getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, CommonProto.AnyValue> getMutableOpsExpandMap() {
            return internalGetMutableOpsExpand();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, CommonProto.AnyValue> getMutableParamsMap() {
            return internalGetMutableParams();
        }

        private MapFieldLite<String, CommonProto.AnyValue> internalGetMutableOpsExpand() {
            if (!this.opsExpand_.isMutable()) {
                this.opsExpand_ = this.opsExpand_.mutableCopy();
            }
            return this.opsExpand_;
        }

        private MapFieldLite<String, CommonProto.AnyValue> internalGetMutableParams() {
            if (!this.params_.isMutable()) {
                this.params_ = this.params_.mutableCopy();
            }
            return this.params_;
        }

        private MapFieldLite<String, CommonProto.AnyValue> internalGetOpsExpand() {
            return this.opsExpand_;
        }

        private MapFieldLite<String, CommonProto.AnyValue> internalGetParams() {
            return this.params_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Log parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Log) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Log parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Log> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setDoneAtTime(long j) {
            this.doneAtTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIden(String str) {
            str.getClass();
            this.iden_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdenBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.iden_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(String str) {
            str.getClass();
            this.level_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.level_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkAvailable(boolean z) {
            this.networkAvailable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkType(String str) {
            str.getClass();
            this.networkType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(String str) {
            str.getClass();
            this.tag_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.tag_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(String str) {
            str.getClass();
            this.time_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.time_ = byteString.toStringUtf8();
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public boolean containsOpsExpand(String str) {
            str.getClass();
            return internalGetOpsExpand().containsKey(str);
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public boolean containsParams(String str) {
            str.getClass();
            return internalGetParams().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Log();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0002\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\t2\n2\u000b\u0002", new Object[]{"iden_", "message_", "level_", "time_", "appVersion_", "networkAvailable_", "networkType_", "tag_", "params_", ParamsDefaultEntryHolder.defaultEntry, "opsExpand_", OpsExpandDefaultEntryHolder.defaultEntry, "doneAtTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Log> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Log.class) {
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

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public String getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public ByteString getAppVersionBytes() {
            return ByteString.copyFromUtf8(this.appVersion_);
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public long getDoneAtTime() {
            return this.doneAtTime_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public String getIden() {
            return this.iden_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public ByteString getIdenBytes() {
            return ByteString.copyFromUtf8(this.iden_);
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public String getLevel() {
            return this.level_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public ByteString getLevelBytes() {
            return ByteString.copyFromUtf8(this.level_);
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public boolean getNetworkAvailable() {
            return this.networkAvailable_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public String getNetworkType() {
            return this.networkType_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public ByteString getNetworkTypeBytes() {
            return ByteString.copyFromUtf8(this.networkType_);
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        @Deprecated
        public Map<String, CommonProto.AnyValue> getOpsExpand() {
            return getOpsExpandMap();
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public int getOpsExpandCount() {
            return internalGetOpsExpand().size();
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public Map<String, CommonProto.AnyValue> getOpsExpandMap() {
            return Collections.unmodifiableMap(internalGetOpsExpand());
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public CommonProto.AnyValue getOpsExpandOrDefault(String str, CommonProto.AnyValue anyValue) {
            str.getClass();
            MapFieldLite<String, CommonProto.AnyValue> mapFieldLiteInternalGetOpsExpand = internalGetOpsExpand();
            return mapFieldLiteInternalGetOpsExpand.containsKey(str) ? mapFieldLiteInternalGetOpsExpand.get(str) : anyValue;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public CommonProto.AnyValue getOpsExpandOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, CommonProto.AnyValue> mapFieldLiteInternalGetOpsExpand = internalGetOpsExpand();
            if (mapFieldLiteInternalGetOpsExpand.containsKey(str)) {
                return mapFieldLiteInternalGetOpsExpand.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        @Deprecated
        public Map<String, CommonProto.AnyValue> getParams() {
            return getParamsMap();
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public int getParamsCount() {
            return internalGetParams().size();
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public Map<String, CommonProto.AnyValue> getParamsMap() {
            return Collections.unmodifiableMap(internalGetParams());
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public CommonProto.AnyValue getParamsOrDefault(String str, CommonProto.AnyValue anyValue) {
            str.getClass();
            MapFieldLite<String, CommonProto.AnyValue> mapFieldLiteInternalGetParams = internalGetParams();
            return mapFieldLiteInternalGetParams.containsKey(str) ? mapFieldLiteInternalGetParams.get(str) : anyValue;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public CommonProto.AnyValue getParamsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, CommonProto.AnyValue> mapFieldLiteInternalGetParams = internalGetParams();
            if (mapFieldLiteInternalGetParams.containsKey(str)) {
                return mapFieldLiteInternalGetParams.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public String getTag() {
            return this.tag_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public ByteString getTagBytes() {
            return ByteString.copyFromUtf8(this.tag_);
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public String getTime() {
            return this.time_;
        }

        @Override // com.common.support.apm.protobuf.LogProto.LogOrBuilder
        public ByteString getTimeBytes() {
            return ByteString.copyFromUtf8(this.time_);
        }

        public static Builder newBuilder(Log log) {
            return DEFAULT_INSTANCE.createBuilder(log);
        }

        public static Log parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Log) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Log parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Log parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Log parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Log parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Log parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Log parseFrom(InputStream inputStream) throws IOException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Log parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Log parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Log parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LogOrBuilder extends MessageLiteOrBuilder {
        boolean containsOpsExpand(String str);

        boolean containsParams(String str);

        String getAppVersion();

        ByteString getAppVersionBytes();

        long getDoneAtTime();

        String getIden();

        ByteString getIdenBytes();

        String getLevel();

        ByteString getLevelBytes();

        String getMessage();

        ByteString getMessageBytes();

        boolean getNetworkAvailable();

        String getNetworkType();

        ByteString getNetworkTypeBytes();

        @Deprecated
        Map<String, CommonProto.AnyValue> getOpsExpand();

        int getOpsExpandCount();

        Map<String, CommonProto.AnyValue> getOpsExpandMap();

        CommonProto.AnyValue getOpsExpandOrDefault(String str, CommonProto.AnyValue anyValue);

        CommonProto.AnyValue getOpsExpandOrThrow(String str);

        @Deprecated
        Map<String, CommonProto.AnyValue> getParams();

        int getParamsCount();

        Map<String, CommonProto.AnyValue> getParamsMap();

        CommonProto.AnyValue getParamsOrDefault(String str, CommonProto.AnyValue anyValue);

        CommonProto.AnyValue getParamsOrThrow(String str);

        String getTag();

        ByteString getTagBytes();

        String getTime();

        ByteString getTimeBytes();
    }

    private LogProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
