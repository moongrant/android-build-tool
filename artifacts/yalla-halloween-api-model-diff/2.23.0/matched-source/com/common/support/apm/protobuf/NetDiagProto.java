package com.common.support.apm.protobuf;

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

/* JADX INFO: loaded from: classes2.dex */
public final class NetDiagProto {

    /* JADX INFO: renamed from: com.common.support.apm.protobuf.NetDiagProto$1, reason: invalid class name */
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

    public static final class NetDiag extends GeneratedMessageLite<NetDiag, Builder> implements NetDiagOrBuilder {
        public static final int COUNTRY_FIELD_NUMBER = 7;
        private static final NetDiag DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 5;
        public static final int DNS_FIELD_NUMBER = 11;
        public static final int DONEATTIME_FIELD_NUMBER = 17;
        public static final int ENDTIME_FIELD_NUMBER = 3;
        public static final int ICMPPING_FIELD_NUMBER = 16;
        public static final int IDEN_FIELD_NUMBER = 1;
        public static final int NETWORK_FIELD_NUMBER = 8;
        public static final int OPERATOR_FIELD_NUMBER = 9;
        private static volatile Parser<NetDiag> PARSER = null;
        public static final int PUBLICIP_FIELD_NUMBER = 10;
        public static final int RESOLUTION_FIELD_NUMBER = 12;
        public static final int SPEEDTEST_FIELD_NUMBER = 15;
        public static final int STARTTIME_FIELD_NUMBER = 2;
        public static final int TCPPING_FIELD_NUMBER = 13;
        public static final int TRACEROUTE_FIELD_NUMBER = 14;
        public static final int USERID_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 6;
        private long doneAtTime_;
        private MapFieldLite<String, CommonProto.StringArray> resolution_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, CommonProto.StringArray> tCPPing_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, CommonProto.StringArray> traceroute_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, String> speedTest_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, CommonProto.StringArray> iCMPPing_ = MapFieldLite.emptyMapField();
        private String iden_ = "";
        private String startTime_ = "";
        private String endTime_ = "";
        private String userId_ = "";
        private String device_ = "";
        private String version_ = "";
        private String country_ = "";
        private String network_ = "";
        private Internal.ProtobufList<String> operator_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> publicIp_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> dNS_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<NetDiag, Builder> implements NetDiagOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllDNS(Iterable<String> iterable) {
                copyOnWrite();
                ((NetDiag) this.instance).addAllDNS(iterable);
                return this;
            }

            public Builder addAllOperator(Iterable<String> iterable) {
                copyOnWrite();
                ((NetDiag) this.instance).addAllOperator(iterable);
                return this;
            }

            public Builder addAllPublicIp(Iterable<String> iterable) {
                copyOnWrite();
                ((NetDiag) this.instance).addAllPublicIp(iterable);
                return this;
            }

            public Builder addDNS(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).addDNS(str);
                return this;
            }

            public Builder addDNSBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).addDNSBytes(byteString);
                return this;
            }

            public Builder addOperator(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).addOperator(str);
                return this;
            }

            public Builder addOperatorBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).addOperatorBytes(byteString);
                return this;
            }

            public Builder addPublicIp(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).addPublicIp(str);
                return this;
            }

            public Builder addPublicIpBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).addPublicIpBytes(byteString);
                return this;
            }

            public Builder clearCountry() {
                copyOnWrite();
                ((NetDiag) this.instance).clearCountry();
                return this;
            }

            public Builder clearDNS() {
                copyOnWrite();
                ((NetDiag) this.instance).clearDNS();
                return this;
            }

            public Builder clearDevice() {
                copyOnWrite();
                ((NetDiag) this.instance).clearDevice();
                return this;
            }

            public Builder clearDoneAtTime() {
                copyOnWrite();
                ((NetDiag) this.instance).clearDoneAtTime();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((NetDiag) this.instance).clearEndTime();
                return this;
            }

            public Builder clearICMPPing() {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableICMPPingMap().clear();
                return this;
            }

            public Builder clearIden() {
                copyOnWrite();
                ((NetDiag) this.instance).clearIden();
                return this;
            }

            public Builder clearNetwork() {
                copyOnWrite();
                ((NetDiag) this.instance).clearNetwork();
                return this;
            }

            public Builder clearOperator() {
                copyOnWrite();
                ((NetDiag) this.instance).clearOperator();
                return this;
            }

            public Builder clearPublicIp() {
                copyOnWrite();
                ((NetDiag) this.instance).clearPublicIp();
                return this;
            }

            public Builder clearResolution() {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableResolutionMap().clear();
                return this;
            }

            public Builder clearSpeedTest() {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableSpeedTestMap().clear();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((NetDiag) this.instance).clearStartTime();
                return this;
            }

            public Builder clearTCPPing() {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTCPPingMap().clear();
                return this;
            }

            public Builder clearTraceroute() {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTracerouteMap().clear();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((NetDiag) this.instance).clearUserId();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((NetDiag) this.instance).clearVersion();
                return this;
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public boolean containsICMPPing(String str) {
                str.getClass();
                return ((NetDiag) this.instance).getICMPPingMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public boolean containsResolution(String str) {
                str.getClass();
                return ((NetDiag) this.instance).getResolutionMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public boolean containsSpeedTest(String str) {
                str.getClass();
                return ((NetDiag) this.instance).getSpeedTestMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public boolean containsTCPPing(String str) {
                str.getClass();
                return ((NetDiag) this.instance).getTCPPingMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public boolean containsTraceroute(String str) {
                str.getClass();
                return ((NetDiag) this.instance).getTracerouteMap().containsKey(str);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getCountry() {
                return ((NetDiag) this.instance).getCountry();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getCountryBytes() {
                return ((NetDiag) this.instance).getCountryBytes();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getDNS(int i) {
                return ((NetDiag) this.instance).getDNS(i);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getDNSBytes(int i) {
                return ((NetDiag) this.instance).getDNSBytes(i);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getDNSCount() {
                return ((NetDiag) this.instance).getDNSCount();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public List<String> getDNSList() {
                return Collections.unmodifiableList(((NetDiag) this.instance).getDNSList());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getDevice() {
                return ((NetDiag) this.instance).getDevice();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getDeviceBytes() {
                return ((NetDiag) this.instance).getDeviceBytes();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public long getDoneAtTime() {
                return ((NetDiag) this.instance).getDoneAtTime();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getEndTime() {
                return ((NetDiag) this.instance).getEndTime();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getEndTimeBytes() {
                return ((NetDiag) this.instance).getEndTimeBytes();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            @Deprecated
            public Map<String, CommonProto.StringArray> getICMPPing() {
                return getICMPPingMap();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getICMPPingCount() {
                return ((NetDiag) this.instance).getICMPPingMap().size();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public Map<String, CommonProto.StringArray> getICMPPingMap() {
                return Collections.unmodifiableMap(((NetDiag) this.instance).getICMPPingMap());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getICMPPingOrDefault(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                Map<String, CommonProto.StringArray> iCMPPingMap = ((NetDiag) this.instance).getICMPPingMap();
                return iCMPPingMap.containsKey(str) ? iCMPPingMap.get(str) : stringArray;
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getICMPPingOrThrow(String str) {
                str.getClass();
                Map<String, CommonProto.StringArray> iCMPPingMap = ((NetDiag) this.instance).getICMPPingMap();
                if (iCMPPingMap.containsKey(str)) {
                    return iCMPPingMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getIden() {
                return ((NetDiag) this.instance).getIden();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getIdenBytes() {
                return ((NetDiag) this.instance).getIdenBytes();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getNetwork() {
                return ((NetDiag) this.instance).getNetwork();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getNetworkBytes() {
                return ((NetDiag) this.instance).getNetworkBytes();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getOperator(int i) {
                return ((NetDiag) this.instance).getOperator(i);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getOperatorBytes(int i) {
                return ((NetDiag) this.instance).getOperatorBytes(i);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getOperatorCount() {
                return ((NetDiag) this.instance).getOperatorCount();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public List<String> getOperatorList() {
                return Collections.unmodifiableList(((NetDiag) this.instance).getOperatorList());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getPublicIp(int i) {
                return ((NetDiag) this.instance).getPublicIp(i);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getPublicIpBytes(int i) {
                return ((NetDiag) this.instance).getPublicIpBytes(i);
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getPublicIpCount() {
                return ((NetDiag) this.instance).getPublicIpCount();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public List<String> getPublicIpList() {
                return Collections.unmodifiableList(((NetDiag) this.instance).getPublicIpList());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            @Deprecated
            public Map<String, CommonProto.StringArray> getResolution() {
                return getResolutionMap();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getResolutionCount() {
                return ((NetDiag) this.instance).getResolutionMap().size();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public Map<String, CommonProto.StringArray> getResolutionMap() {
                return Collections.unmodifiableMap(((NetDiag) this.instance).getResolutionMap());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getResolutionOrDefault(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                Map<String, CommonProto.StringArray> resolutionMap = ((NetDiag) this.instance).getResolutionMap();
                return resolutionMap.containsKey(str) ? resolutionMap.get(str) : stringArray;
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getResolutionOrThrow(String str) {
                str.getClass();
                Map<String, CommonProto.StringArray> resolutionMap = ((NetDiag) this.instance).getResolutionMap();
                if (resolutionMap.containsKey(str)) {
                    return resolutionMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            @Deprecated
            public Map<String, String> getSpeedTest() {
                return getSpeedTestMap();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getSpeedTestCount() {
                return ((NetDiag) this.instance).getSpeedTestMap().size();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public Map<String, String> getSpeedTestMap() {
                return Collections.unmodifiableMap(((NetDiag) this.instance).getSpeedTestMap());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getSpeedTestOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> speedTestMap = ((NetDiag) this.instance).getSpeedTestMap();
                return speedTestMap.containsKey(str) ? speedTestMap.get(str) : str2;
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getSpeedTestOrThrow(String str) {
                str.getClass();
                Map<String, String> speedTestMap = ((NetDiag) this.instance).getSpeedTestMap();
                if (speedTestMap.containsKey(str)) {
                    return speedTestMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getStartTime() {
                return ((NetDiag) this.instance).getStartTime();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getStartTimeBytes() {
                return ((NetDiag) this.instance).getStartTimeBytes();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            @Deprecated
            public Map<String, CommonProto.StringArray> getTCPPing() {
                return getTCPPingMap();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getTCPPingCount() {
                return ((NetDiag) this.instance).getTCPPingMap().size();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public Map<String, CommonProto.StringArray> getTCPPingMap() {
                return Collections.unmodifiableMap(((NetDiag) this.instance).getTCPPingMap());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getTCPPingOrDefault(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                Map<String, CommonProto.StringArray> tCPPingMap = ((NetDiag) this.instance).getTCPPingMap();
                return tCPPingMap.containsKey(str) ? tCPPingMap.get(str) : stringArray;
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getTCPPingOrThrow(String str) {
                str.getClass();
                Map<String, CommonProto.StringArray> tCPPingMap = ((NetDiag) this.instance).getTCPPingMap();
                if (tCPPingMap.containsKey(str)) {
                    return tCPPingMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            @Deprecated
            public Map<String, CommonProto.StringArray> getTraceroute() {
                return getTracerouteMap();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public int getTracerouteCount() {
                return ((NetDiag) this.instance).getTracerouteMap().size();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public Map<String, CommonProto.StringArray> getTracerouteMap() {
                return Collections.unmodifiableMap(((NetDiag) this.instance).getTracerouteMap());
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getTracerouteOrDefault(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                Map<String, CommonProto.StringArray> tracerouteMap = ((NetDiag) this.instance).getTracerouteMap();
                return tracerouteMap.containsKey(str) ? tracerouteMap.get(str) : stringArray;
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public CommonProto.StringArray getTracerouteOrThrow(String str) {
                str.getClass();
                Map<String, CommonProto.StringArray> tracerouteMap = ((NetDiag) this.instance).getTracerouteMap();
                if (tracerouteMap.containsKey(str)) {
                    return tracerouteMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getUserId() {
                return ((NetDiag) this.instance).getUserId();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getUserIdBytes() {
                return ((NetDiag) this.instance).getUserIdBytes();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public String getVersion() {
                return ((NetDiag) this.instance).getVersion();
            }

            @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
            public ByteString getVersionBytes() {
                return ((NetDiag) this.instance).getVersionBytes();
            }

            public Builder putAllICMPPing(Map<String, CommonProto.StringArray> map) {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableICMPPingMap().putAll(map);
                return this;
            }

            public Builder putAllResolution(Map<String, CommonProto.StringArray> map) {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableResolutionMap().putAll(map);
                return this;
            }

            public Builder putAllSpeedTest(Map<String, String> map) {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableSpeedTestMap().putAll(map);
                return this;
            }

            public Builder putAllTCPPing(Map<String, CommonProto.StringArray> map) {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTCPPingMap().putAll(map);
                return this;
            }

            public Builder putAllTraceroute(Map<String, CommonProto.StringArray> map) {
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTracerouteMap().putAll(map);
                return this;
            }

            public Builder putICMPPing(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                stringArray.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableICMPPingMap().put(str, stringArray);
                return this;
            }

            public Builder putResolution(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                stringArray.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableResolutionMap().put(str, stringArray);
                return this;
            }

            public Builder putSpeedTest(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableSpeedTestMap().put(str, str2);
                return this;
            }

            public Builder putTCPPing(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                stringArray.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTCPPingMap().put(str, stringArray);
                return this;
            }

            public Builder putTraceroute(String str, CommonProto.StringArray stringArray) {
                str.getClass();
                stringArray.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTracerouteMap().put(str, stringArray);
                return this;
            }

            public Builder removeICMPPing(String str) {
                str.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableICMPPingMap().remove(str);
                return this;
            }

            public Builder removeResolution(String str) {
                str.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableResolutionMap().remove(str);
                return this;
            }

            public Builder removeSpeedTest(String str) {
                str.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableSpeedTestMap().remove(str);
                return this;
            }

            public Builder removeTCPPing(String str) {
                str.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTCPPingMap().remove(str);
                return this;
            }

            public Builder removeTraceroute(String str) {
                str.getClass();
                copyOnWrite();
                ((NetDiag) this.instance).getMutableTracerouteMap().remove(str);
                return this;
            }

            public Builder setCountry(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setCountry(str);
                return this;
            }

            public Builder setCountryBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setCountryBytes(byteString);
                return this;
            }

            public Builder setDNS(int i, String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setDNS(i, str);
                return this;
            }

            public Builder setDevice(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setDevice(str);
                return this;
            }

            public Builder setDeviceBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setDeviceBytes(byteString);
                return this;
            }

            public Builder setDoneAtTime(long j) {
                copyOnWrite();
                ((NetDiag) this.instance).setDoneAtTime(j);
                return this;
            }

            public Builder setEndTime(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setEndTime(str);
                return this;
            }

            public Builder setEndTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setEndTimeBytes(byteString);
                return this;
            }

            public Builder setIden(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setIden(str);
                return this;
            }

            public Builder setIdenBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setIdenBytes(byteString);
                return this;
            }

            public Builder setNetwork(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setNetwork(str);
                return this;
            }

            public Builder setNetworkBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setNetworkBytes(byteString);
                return this;
            }

            public Builder setOperator(int i, String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setOperator(i, str);
                return this;
            }

            public Builder setPublicIp(int i, String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setPublicIp(i, str);
                return this;
            }

            public Builder setStartTime(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setStartTime(str);
                return this;
            }

            public Builder setStartTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setStartTimeBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((NetDiag) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((NetDiag) this.instance).setVersionBytes(byteString);
                return this;
            }

            private Builder() {
                super(NetDiag.DEFAULT_INSTANCE);
            }
        }

        public static final class ICMPPingDefaultEntryHolder {
            static final MapEntryLite<String, CommonProto.StringArray> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, CommonProto.StringArray.getDefaultInstance());

            private ICMPPingDefaultEntryHolder() {
            }
        }

        public static final class ResolutionDefaultEntryHolder {
            static final MapEntryLite<String, CommonProto.StringArray> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, CommonProto.StringArray.getDefaultInstance());

            private ResolutionDefaultEntryHolder() {
            }
        }

        public static final class SpeedTestDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private SpeedTestDefaultEntryHolder() {
            }
        }

        public static final class TCPPingDefaultEntryHolder {
            static final MapEntryLite<String, CommonProto.StringArray> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, CommonProto.StringArray.getDefaultInstance());

            private TCPPingDefaultEntryHolder() {
            }
        }

        public static final class TracerouteDefaultEntryHolder {
            static final MapEntryLite<String, CommonProto.StringArray> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, CommonProto.StringArray.getDefaultInstance());

            private TracerouteDefaultEntryHolder() {
            }
        }

        static {
            NetDiag netDiag = new NetDiag();
            DEFAULT_INSTANCE = netDiag;
            GeneratedMessageLite.registerDefaultInstance(NetDiag.class, netDiag);
        }

        private NetDiag() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDNS(Iterable<String> iterable) {
            ensureDNSIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dNS_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOperator(Iterable<String> iterable) {
            ensureOperatorIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.operator_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPublicIp(Iterable<String> iterable) {
            ensurePublicIpIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.publicIp_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDNS(String str) {
            str.getClass();
            ensureDNSIsMutable();
            this.dNS_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDNSBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureDNSIsMutable();
            this.dNS_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOperator(String str) {
            str.getClass();
            ensureOperatorIsMutable();
            this.operator_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOperatorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureOperatorIsMutable();
            this.operator_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublicIp(String str) {
            str.getClass();
            ensurePublicIpIsMutable();
            this.publicIp_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublicIpBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensurePublicIpIsMutable();
            this.publicIp_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountry() {
            this.country_ = getDefaultInstance().getCountry();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDNS() {
            this.dNS_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevice() {
            this.device_ = getDefaultInstance().getDevice();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoneAtTime() {
            this.doneAtTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = getDefaultInstance().getEndTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIden() {
            this.iden_ = getDefaultInstance().getIden();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetwork() {
            this.network_ = getDefaultInstance().getNetwork();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperator() {
            this.operator_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublicIp() {
            this.publicIp_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = getDefaultInstance().getStartTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        private void ensureDNSIsMutable() {
            if (this.dNS_.isModifiable()) {
                return;
            }
            this.dNS_ = GeneratedMessageLite.mutableCopy(this.dNS_);
        }

        private void ensureOperatorIsMutable() {
            if (this.operator_.isModifiable()) {
                return;
            }
            this.operator_ = GeneratedMessageLite.mutableCopy(this.operator_);
        }

        private void ensurePublicIpIsMutable() {
            if (this.publicIp_.isModifiable()) {
                return;
            }
            this.publicIp_ = GeneratedMessageLite.mutableCopy(this.publicIp_);
        }

        public static NetDiag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, CommonProto.StringArray> getMutableICMPPingMap() {
            return internalGetMutableICMPPing();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, CommonProto.StringArray> getMutableResolutionMap() {
            return internalGetMutableResolution();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableSpeedTestMap() {
            return internalGetMutableSpeedTest();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, CommonProto.StringArray> getMutableTCPPingMap() {
            return internalGetMutableTCPPing();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, CommonProto.StringArray> getMutableTracerouteMap() {
            return internalGetMutableTraceroute();
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetICMPPing() {
            return this.iCMPPing_;
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetMutableICMPPing() {
            if (!this.iCMPPing_.isMutable()) {
                this.iCMPPing_ = this.iCMPPing_.mutableCopy();
            }
            return this.iCMPPing_;
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetMutableResolution() {
            if (!this.resolution_.isMutable()) {
                this.resolution_ = this.resolution_.mutableCopy();
            }
            return this.resolution_;
        }

        private MapFieldLite<String, String> internalGetMutableSpeedTest() {
            if (!this.speedTest_.isMutable()) {
                this.speedTest_ = this.speedTest_.mutableCopy();
            }
            return this.speedTest_;
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetMutableTCPPing() {
            if (!this.tCPPing_.isMutable()) {
                this.tCPPing_ = this.tCPPing_.mutableCopy();
            }
            return this.tCPPing_;
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetMutableTraceroute() {
            if (!this.traceroute_.isMutable()) {
                this.traceroute_ = this.traceroute_.mutableCopy();
            }
            return this.traceroute_;
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetResolution() {
            return this.resolution_;
        }

        private MapFieldLite<String, String> internalGetSpeedTest() {
            return this.speedTest_;
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetTCPPing() {
            return this.tCPPing_;
        }

        private MapFieldLite<String, CommonProto.StringArray> internalGetTraceroute() {
            return this.traceroute_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NetDiag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NetDiag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetDiag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NetDiag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountry(String str) {
            str.getClass();
            this.country_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.country_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDNS(int i, String str) {
            str.getClass();
            ensureDNSIsMutable();
            this.dNS_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevice(String str) {
            str.getClass();
            this.device_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.device_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoneAtTime(long j) {
            this.doneAtTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(String str) {
            str.getClass();
            this.endTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTimeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.endTime_ = byteString.toStringUtf8();
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
        public void setNetwork(String str) {
            str.getClass();
            this.network_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.network_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperator(int i, String str) {
            str.getClass();
            ensureOperatorIsMutable();
            this.operator_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicIp(int i, String str) {
            str.getClass();
            ensurePublicIpIsMutable();
            this.publicIp_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(String str) {
            str.getClass();
            this.startTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.startTime_ = byteString.toStringUtf8();
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
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public boolean containsICMPPing(String str) {
            str.getClass();
            return internalGetICMPPing().containsKey(str);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public boolean containsResolution(String str) {
            str.getClass();
            return internalGetResolution().containsKey(str);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public boolean containsSpeedTest(String str) {
            str.getClass();
            return internalGetSpeedTest().containsKey(str);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public boolean containsTCPPing(String str) {
            str.getClass();
            return internalGetTCPPing().containsKey(str);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public boolean containsTraceroute(String str) {
            str.getClass();
            return internalGetTraceroute().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NetDiag();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0005\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȚ\f2\r2\u000e2\u000f2\u00102\u0011\u0002", new Object[]{"iden_", "startTime_", "endTime_", "userId_", "device_", "version_", "country_", "network_", "operator_", "publicIp_", "dNS_", "resolution_", ResolutionDefaultEntryHolder.defaultEntry, "tCPPing_", TCPPingDefaultEntryHolder.defaultEntry, "traceroute_", TracerouteDefaultEntryHolder.defaultEntry, "speedTest_", SpeedTestDefaultEntryHolder.defaultEntry, "iCMPPing_", ICMPPingDefaultEntryHolder.defaultEntry, "doneAtTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NetDiag> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NetDiag.class) {
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

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getCountry() {
            return this.country_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getCountryBytes() {
            return ByteString.copyFromUtf8(this.country_);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getDNS(int i) {
            return this.dNS_.get(i);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getDNSBytes(int i) {
            return ByteString.copyFromUtf8(this.dNS_.get(i));
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getDNSCount() {
            return this.dNS_.size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public List<String> getDNSList() {
            return this.dNS_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getDevice() {
            return this.device_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getDeviceBytes() {
            return ByteString.copyFromUtf8(this.device_);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public long getDoneAtTime() {
            return this.doneAtTime_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getEndTime() {
            return this.endTime_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getEndTimeBytes() {
            return ByteString.copyFromUtf8(this.endTime_);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        @Deprecated
        public Map<String, CommonProto.StringArray> getICMPPing() {
            return getICMPPingMap();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getICMPPingCount() {
            return internalGetICMPPing().size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public Map<String, CommonProto.StringArray> getICMPPingMap() {
            return Collections.unmodifiableMap(internalGetICMPPing());
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getICMPPingOrDefault(String str, CommonProto.StringArray stringArray) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetICMPPing = internalGetICMPPing();
            return mapFieldLiteInternalGetICMPPing.containsKey(str) ? mapFieldLiteInternalGetICMPPing.get(str) : stringArray;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getICMPPingOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetICMPPing = internalGetICMPPing();
            if (mapFieldLiteInternalGetICMPPing.containsKey(str)) {
                return mapFieldLiteInternalGetICMPPing.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getIden() {
            return this.iden_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getIdenBytes() {
            return ByteString.copyFromUtf8(this.iden_);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getNetwork() {
            return this.network_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getNetworkBytes() {
            return ByteString.copyFromUtf8(this.network_);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getOperator(int i) {
            return this.operator_.get(i);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getOperatorBytes(int i) {
            return ByteString.copyFromUtf8(this.operator_.get(i));
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getOperatorCount() {
            return this.operator_.size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public List<String> getOperatorList() {
            return this.operator_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getPublicIp(int i) {
            return this.publicIp_.get(i);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getPublicIpBytes(int i) {
            return ByteString.copyFromUtf8(this.publicIp_.get(i));
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getPublicIpCount() {
            return this.publicIp_.size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public List<String> getPublicIpList() {
            return this.publicIp_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        @Deprecated
        public Map<String, CommonProto.StringArray> getResolution() {
            return getResolutionMap();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getResolutionCount() {
            return internalGetResolution().size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public Map<String, CommonProto.StringArray> getResolutionMap() {
            return Collections.unmodifiableMap(internalGetResolution());
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getResolutionOrDefault(String str, CommonProto.StringArray stringArray) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetResolution = internalGetResolution();
            return mapFieldLiteInternalGetResolution.containsKey(str) ? mapFieldLiteInternalGetResolution.get(str) : stringArray;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getResolutionOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetResolution = internalGetResolution();
            if (mapFieldLiteInternalGetResolution.containsKey(str)) {
                return mapFieldLiteInternalGetResolution.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        @Deprecated
        public Map<String, String> getSpeedTest() {
            return getSpeedTestMap();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getSpeedTestCount() {
            return internalGetSpeedTest().size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public Map<String, String> getSpeedTestMap() {
            return Collections.unmodifiableMap(internalGetSpeedTest());
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getSpeedTestOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetSpeedTest = internalGetSpeedTest();
            return mapFieldLiteInternalGetSpeedTest.containsKey(str) ? mapFieldLiteInternalGetSpeedTest.get(str) : str2;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getSpeedTestOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetSpeedTest = internalGetSpeedTest();
            if (mapFieldLiteInternalGetSpeedTest.containsKey(str)) {
                return mapFieldLiteInternalGetSpeedTest.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getStartTime() {
            return this.startTime_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getStartTimeBytes() {
            return ByteString.copyFromUtf8(this.startTime_);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        @Deprecated
        public Map<String, CommonProto.StringArray> getTCPPing() {
            return getTCPPingMap();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getTCPPingCount() {
            return internalGetTCPPing().size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public Map<String, CommonProto.StringArray> getTCPPingMap() {
            return Collections.unmodifiableMap(internalGetTCPPing());
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getTCPPingOrDefault(String str, CommonProto.StringArray stringArray) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetTCPPing = internalGetTCPPing();
            return mapFieldLiteInternalGetTCPPing.containsKey(str) ? mapFieldLiteInternalGetTCPPing.get(str) : stringArray;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getTCPPingOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetTCPPing = internalGetTCPPing();
            if (mapFieldLiteInternalGetTCPPing.containsKey(str)) {
                return mapFieldLiteInternalGetTCPPing.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        @Deprecated
        public Map<String, CommonProto.StringArray> getTraceroute() {
            return getTracerouteMap();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public int getTracerouteCount() {
            return internalGetTraceroute().size();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public Map<String, CommonProto.StringArray> getTracerouteMap() {
            return Collections.unmodifiableMap(internalGetTraceroute());
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getTracerouteOrDefault(String str, CommonProto.StringArray stringArray) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetTraceroute = internalGetTraceroute();
            return mapFieldLiteInternalGetTraceroute.containsKey(str) ? mapFieldLiteInternalGetTraceroute.get(str) : stringArray;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public CommonProto.StringArray getTracerouteOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, CommonProto.StringArray> mapFieldLiteInternalGetTraceroute = internalGetTraceroute();
            if (mapFieldLiteInternalGetTraceroute.containsKey(str)) {
                return mapFieldLiteInternalGetTraceroute.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.common.support.apm.protobuf.NetDiagProto.NetDiagOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        public static Builder newBuilder(NetDiag netDiag) {
            return DEFAULT_INSTANCE.createBuilder(netDiag);
        }

        public static NetDiag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetDiag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetDiag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetDiag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetDiag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetDiag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetDiag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetDiag parseFrom(InputStream inputStream) throws IOException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetDiag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetDiag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetDiag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NetDiag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface NetDiagOrBuilder extends MessageLiteOrBuilder {
        boolean containsICMPPing(String str);

        boolean containsResolution(String str);

        boolean containsSpeedTest(String str);

        boolean containsTCPPing(String str);

        boolean containsTraceroute(String str);

        String getCountry();

        ByteString getCountryBytes();

        String getDNS(int i);

        ByteString getDNSBytes(int i);

        int getDNSCount();

        List<String> getDNSList();

        String getDevice();

        ByteString getDeviceBytes();

        long getDoneAtTime();

        String getEndTime();

        ByteString getEndTimeBytes();

        @Deprecated
        Map<String, CommonProto.StringArray> getICMPPing();

        int getICMPPingCount();

        Map<String, CommonProto.StringArray> getICMPPingMap();

        CommonProto.StringArray getICMPPingOrDefault(String str, CommonProto.StringArray stringArray);

        CommonProto.StringArray getICMPPingOrThrow(String str);

        String getIden();

        ByteString getIdenBytes();

        String getNetwork();

        ByteString getNetworkBytes();

        String getOperator(int i);

        ByteString getOperatorBytes(int i);

        int getOperatorCount();

        List<String> getOperatorList();

        String getPublicIp(int i);

        ByteString getPublicIpBytes(int i);

        int getPublicIpCount();

        List<String> getPublicIpList();

        @Deprecated
        Map<String, CommonProto.StringArray> getResolution();

        int getResolutionCount();

        Map<String, CommonProto.StringArray> getResolutionMap();

        CommonProto.StringArray getResolutionOrDefault(String str, CommonProto.StringArray stringArray);

        CommonProto.StringArray getResolutionOrThrow(String str);

        @Deprecated
        Map<String, String> getSpeedTest();

        int getSpeedTestCount();

        Map<String, String> getSpeedTestMap();

        String getSpeedTestOrDefault(String str, String str2);

        String getSpeedTestOrThrow(String str);

        String getStartTime();

        ByteString getStartTimeBytes();

        @Deprecated
        Map<String, CommonProto.StringArray> getTCPPing();

        int getTCPPingCount();

        Map<String, CommonProto.StringArray> getTCPPingMap();

        CommonProto.StringArray getTCPPingOrDefault(String str, CommonProto.StringArray stringArray);

        CommonProto.StringArray getTCPPingOrThrow(String str);

        @Deprecated
        Map<String, CommonProto.StringArray> getTraceroute();

        int getTracerouteCount();

        Map<String, CommonProto.StringArray> getTracerouteMap();

        CommonProto.StringArray getTracerouteOrDefault(String str, CommonProto.StringArray stringArray);

        CommonProto.StringArray getTracerouteOrThrow(String str);

        String getUserId();

        ByteString getUserIdBytes();

        String getVersion();

        ByteString getVersionBytes();
    }

    private NetDiagProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
