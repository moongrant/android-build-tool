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
public final class SecDetectProto {

    /* JADX INFO: renamed from: com.common.support.apm.protobuf.SecDetectProto$1, reason: invalid class name */
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

    public static final class SecDetect extends GeneratedMessageLite<SecDetect, Builder> implements SecDetectOrBuilder {
        public static final int ACCESSIBILITYS_FIELD_NUMBER = 28;
        public static final int ACSPACKAGES_FIELD_NUMBER = 44;
        public static final int ANTIBYPASSJAILBREAK_FIELD_NUMBER = 40;
        public static final int APPINSTALLS_FIELD_NUMBER = 13;
        public static final int APPVIRTUALPKG_FIELD_NUMBER = 33;
        public static final int APPVIRTUAL_FIELD_NUMBER = 22;
        public static final int ATTACHPORT_FIELD_NUMBER = 25;
        public static final int BOOTID_FIELD_NUMBER = 45;
        public static final int CERTMD5_FIELD_NUMBER = 39;
        public static final int DEBUG_FIELD_NUMBER = 6;
        private static final SecDetect DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 5;
        public static final int DONEATTIME_FIELD_NUMBER = 42;
        public static final int EMULATOR_FIELD_NUMBER = 7;
        public static final int FILEINTEGRITY_FIELD_NUMBER = 9;
        public static final int FISHHOOK_FIELD_NUMBER = 8;
        public static final int FRIDA_FIELD_NUMBER = 18;
        public static final int HASFLASH_FIELD_NUMBER = 24;
        public static final int HASSIM_FIELD_NUMBER = 34;
        public static final int HTTPPROXY_FIELD_NUMBER = 29;
        public static final int IDEN_FIELD_NUMBER = 1;
        public static final int INJECTION_FIELD_NUMBER = 16;
        public static final int INLINEHOOK_FIELD_NUMBER = 37;
        public static final int LANGUAGE_FIELD_NUMBER = 30;
        public static final int LIGHTSENSOR_FIELD_NUMBER = 27;
        public static final int MAGISK_FIELD_NUMBER = 36;
        public static final int MSHOOKFUN_FIELD_NUMBER = 12;
        public static final int NETWORKTYPE_FIELD_NUMBER = 31;
        private static volatile Parser<SecDetect> PARSER = null;
        public static final int PTRACE_FIELD_NUMBER = 21;
        public static final int RESERVETOOLNAME_FIELD_NUMBER = 35;
        public static final int RESERVETOOL_FIELD_NUMBER = 10;
        public static final int RESIGNATURE_FIELD_NUMBER = 41;
        public static final int RISKFILE_FIELD_NUMBER = 43;
        public static final int ROOT_FIELD_NUMBER = 14;
        public static final int RUNTIMEHOOK_FIELD_NUMBER = 11;
        public static final int SENSOR_FIELD_NUMBER = 23;
        public static final int SMID_FIELD_NUMBER = 46;
        public static final int SUBSTRATE_FIELD_NUMBER = 19;
        public static final int TIMEZONE_FIELD_NUMBER = 32;
        public static final int TIME_FIELD_NUMBER = 2;
        public static final int USB_FIELD_NUMBER = 26;
        public static final int USERID_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 4;
        public static final int VPN_FIELD_NUMBER = 15;
        public static final int WIFIPROXY_FIELD_NUMBER = 20;
        public static final int XPOSED_FIELD_NUMBER = 17;
        public static final int ZYGISK_FIELD_NUMBER = 38;
        private boolean accessibilityS_;
        private boolean antiBypassJailbreak_;
        private boolean appVirtual_;
        private boolean debug_;
        private long doneAtTime_;
        private boolean emulator_;
        private boolean fileIntegrity_;
        private boolean fishHook_;
        private boolean frida_;
        private boolean hasFlash_;
        private boolean hasSim_;
        private boolean httpProxy_;
        private boolean injection_;
        private boolean inlineHook_;
        private boolean lightSensor_;
        private boolean magisk_;
        private boolean msHookFun_;
        private boolean ptrace_;
        private boolean reSignature_;
        private boolean reserveTool_;
        private boolean root_;
        private boolean runtimeHook_;
        private int sensor_;
        private boolean substrate_;
        private boolean uSB_;
        private boolean vPN_;
        private boolean xposed_;
        private boolean zygisk_;
        private int attachPortMemoizedSerializedSize = -1;
        private String iden_ = "";
        private String time_ = "";
        private String userId_ = "";
        private String version_ = "";
        private String device_ = "";
        private String appInstallS_ = "";
        private String wifiProxy_ = "";
        private Internal.IntList attachPort_ = GeneratedMessageLite.emptyIntList();
        private String language_ = "";
        private String networkType_ = "";
        private String timeZone_ = "";
        private String appVirtualPkg_ = "";
        private String reserveToolName_ = "";
        private String certMD5_ = "";
        private String riskFile_ = "";
        private String acsPackages_ = "";
        private String bootId_ = "";
        private String smid_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<SecDetect, Builder> implements SecDetectOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllAttachPort(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((SecDetect) this.instance).addAllAttachPort(iterable);
                return this;
            }

            public Builder addAttachPort(int i) {
                copyOnWrite();
                ((SecDetect) this.instance).addAttachPort(i);
                return this;
            }

            public Builder clearAccessibilityS() {
                copyOnWrite();
                ((SecDetect) this.instance).clearAccessibilityS();
                return this;
            }

            public Builder clearAcsPackages() {
                copyOnWrite();
                ((SecDetect) this.instance).clearAcsPackages();
                return this;
            }

            public Builder clearAntiBypassJailbreak() {
                copyOnWrite();
                ((SecDetect) this.instance).clearAntiBypassJailbreak();
                return this;
            }

            public Builder clearAppInstallS() {
                copyOnWrite();
                ((SecDetect) this.instance).clearAppInstallS();
                return this;
            }

            public Builder clearAppVirtual() {
                copyOnWrite();
                ((SecDetect) this.instance).clearAppVirtual();
                return this;
            }

            public Builder clearAppVirtualPkg() {
                copyOnWrite();
                ((SecDetect) this.instance).clearAppVirtualPkg();
                return this;
            }

            public Builder clearAttachPort() {
                copyOnWrite();
                ((SecDetect) this.instance).clearAttachPort();
                return this;
            }

            public Builder clearBootId() {
                copyOnWrite();
                ((SecDetect) this.instance).clearBootId();
                return this;
            }

            public Builder clearCertMD5() {
                copyOnWrite();
                ((SecDetect) this.instance).clearCertMD5();
                return this;
            }

            public Builder clearDebug() {
                copyOnWrite();
                ((SecDetect) this.instance).clearDebug();
                return this;
            }

            public Builder clearDevice() {
                copyOnWrite();
                ((SecDetect) this.instance).clearDevice();
                return this;
            }

            public Builder clearDoneAtTime() {
                copyOnWrite();
                ((SecDetect) this.instance).clearDoneAtTime();
                return this;
            }

            public Builder clearEmulator() {
                copyOnWrite();
                ((SecDetect) this.instance).clearEmulator();
                return this;
            }

            public Builder clearFileIntegrity() {
                copyOnWrite();
                ((SecDetect) this.instance).clearFileIntegrity();
                return this;
            }

            public Builder clearFishHook() {
                copyOnWrite();
                ((SecDetect) this.instance).clearFishHook();
                return this;
            }

            public Builder clearFrida() {
                copyOnWrite();
                ((SecDetect) this.instance).clearFrida();
                return this;
            }

            public Builder clearHasFlash() {
                copyOnWrite();
                ((SecDetect) this.instance).clearHasFlash();
                return this;
            }

            public Builder clearHasSim() {
                copyOnWrite();
                ((SecDetect) this.instance).clearHasSim();
                return this;
            }

            public Builder clearHttpProxy() {
                copyOnWrite();
                ((SecDetect) this.instance).clearHttpProxy();
                return this;
            }

            public Builder clearIden() {
                copyOnWrite();
                ((SecDetect) this.instance).clearIden();
                return this;
            }

            public Builder clearInjection() {
                copyOnWrite();
                ((SecDetect) this.instance).clearInjection();
                return this;
            }

            public Builder clearInlineHook() {
                copyOnWrite();
                ((SecDetect) this.instance).clearInlineHook();
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((SecDetect) this.instance).clearLanguage();
                return this;
            }

            public Builder clearLightSensor() {
                copyOnWrite();
                ((SecDetect) this.instance).clearLightSensor();
                return this;
            }

            public Builder clearMagisk() {
                copyOnWrite();
                ((SecDetect) this.instance).clearMagisk();
                return this;
            }

            public Builder clearMsHookFun() {
                copyOnWrite();
                ((SecDetect) this.instance).clearMsHookFun();
                return this;
            }

            public Builder clearNetworkType() {
                copyOnWrite();
                ((SecDetect) this.instance).clearNetworkType();
                return this;
            }

            public Builder clearPtrace() {
                copyOnWrite();
                ((SecDetect) this.instance).clearPtrace();
                return this;
            }

            public Builder clearReSignature() {
                copyOnWrite();
                ((SecDetect) this.instance).clearReSignature();
                return this;
            }

            public Builder clearReserveTool() {
                copyOnWrite();
                ((SecDetect) this.instance).clearReserveTool();
                return this;
            }

            public Builder clearReserveToolName() {
                copyOnWrite();
                ((SecDetect) this.instance).clearReserveToolName();
                return this;
            }

            public Builder clearRiskFile() {
                copyOnWrite();
                ((SecDetect) this.instance).clearRiskFile();
                return this;
            }

            public Builder clearRoot() {
                copyOnWrite();
                ((SecDetect) this.instance).clearRoot();
                return this;
            }

            public Builder clearRuntimeHook() {
                copyOnWrite();
                ((SecDetect) this.instance).clearRuntimeHook();
                return this;
            }

            public Builder clearSensor() {
                copyOnWrite();
                ((SecDetect) this.instance).clearSensor();
                return this;
            }

            public Builder clearSmid() {
                copyOnWrite();
                ((SecDetect) this.instance).clearSmid();
                return this;
            }

            public Builder clearSubstrate() {
                copyOnWrite();
                ((SecDetect) this.instance).clearSubstrate();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((SecDetect) this.instance).clearTime();
                return this;
            }

            public Builder clearTimeZone() {
                copyOnWrite();
                ((SecDetect) this.instance).clearTimeZone();
                return this;
            }

            public Builder clearUSB() {
                copyOnWrite();
                ((SecDetect) this.instance).clearUSB();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((SecDetect) this.instance).clearUserId();
                return this;
            }

            public Builder clearVPN() {
                copyOnWrite();
                ((SecDetect) this.instance).clearVPN();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((SecDetect) this.instance).clearVersion();
                return this;
            }

            public Builder clearWifiProxy() {
                copyOnWrite();
                ((SecDetect) this.instance).clearWifiProxy();
                return this;
            }

            public Builder clearXposed() {
                copyOnWrite();
                ((SecDetect) this.instance).clearXposed();
                return this;
            }

            public Builder clearZygisk() {
                copyOnWrite();
                ((SecDetect) this.instance).clearZygisk();
                return this;
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getAccessibilityS() {
                return ((SecDetect) this.instance).getAccessibilityS();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getAcsPackages() {
                return ((SecDetect) this.instance).getAcsPackages();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getAcsPackagesBytes() {
                return ((SecDetect) this.instance).getAcsPackagesBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getAntiBypassJailbreak() {
                return ((SecDetect) this.instance).getAntiBypassJailbreak();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getAppInstallS() {
                return ((SecDetect) this.instance).getAppInstallS();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getAppInstallSBytes() {
                return ((SecDetect) this.instance).getAppInstallSBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getAppVirtual() {
                return ((SecDetect) this.instance).getAppVirtual();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getAppVirtualPkg() {
                return ((SecDetect) this.instance).getAppVirtualPkg();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getAppVirtualPkgBytes() {
                return ((SecDetect) this.instance).getAppVirtualPkgBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public int getAttachPort(int i) {
                return ((SecDetect) this.instance).getAttachPort(i);
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public int getAttachPortCount() {
                return ((SecDetect) this.instance).getAttachPortCount();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public List<Integer> getAttachPortList() {
                return Collections.unmodifiableList(((SecDetect) this.instance).getAttachPortList());
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getBootId() {
                return ((SecDetect) this.instance).getBootId();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getBootIdBytes() {
                return ((SecDetect) this.instance).getBootIdBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getCertMD5() {
                return ((SecDetect) this.instance).getCertMD5();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getCertMD5Bytes() {
                return ((SecDetect) this.instance).getCertMD5Bytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getDebug() {
                return ((SecDetect) this.instance).getDebug();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getDevice() {
                return ((SecDetect) this.instance).getDevice();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getDeviceBytes() {
                return ((SecDetect) this.instance).getDeviceBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public long getDoneAtTime() {
                return ((SecDetect) this.instance).getDoneAtTime();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getEmulator() {
                return ((SecDetect) this.instance).getEmulator();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getFileIntegrity() {
                return ((SecDetect) this.instance).getFileIntegrity();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getFishHook() {
                return ((SecDetect) this.instance).getFishHook();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getFrida() {
                return ((SecDetect) this.instance).getFrida();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getHasFlash() {
                return ((SecDetect) this.instance).getHasFlash();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getHasSim() {
                return ((SecDetect) this.instance).getHasSim();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getHttpProxy() {
                return ((SecDetect) this.instance).getHttpProxy();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getIden() {
                return ((SecDetect) this.instance).getIden();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getIdenBytes() {
                return ((SecDetect) this.instance).getIdenBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getInjection() {
                return ((SecDetect) this.instance).getInjection();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getInlineHook() {
                return ((SecDetect) this.instance).getInlineHook();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getLanguage() {
                return ((SecDetect) this.instance).getLanguage();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getLanguageBytes() {
                return ((SecDetect) this.instance).getLanguageBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getLightSensor() {
                return ((SecDetect) this.instance).getLightSensor();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getMagisk() {
                return ((SecDetect) this.instance).getMagisk();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getMsHookFun() {
                return ((SecDetect) this.instance).getMsHookFun();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getNetworkType() {
                return ((SecDetect) this.instance).getNetworkType();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getNetworkTypeBytes() {
                return ((SecDetect) this.instance).getNetworkTypeBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getPtrace() {
                return ((SecDetect) this.instance).getPtrace();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getReSignature() {
                return ((SecDetect) this.instance).getReSignature();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getReserveTool() {
                return ((SecDetect) this.instance).getReserveTool();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getReserveToolName() {
                return ((SecDetect) this.instance).getReserveToolName();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getReserveToolNameBytes() {
                return ((SecDetect) this.instance).getReserveToolNameBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getRiskFile() {
                return ((SecDetect) this.instance).getRiskFile();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getRiskFileBytes() {
                return ((SecDetect) this.instance).getRiskFileBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getRoot() {
                return ((SecDetect) this.instance).getRoot();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getRuntimeHook() {
                return ((SecDetect) this.instance).getRuntimeHook();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public int getSensor() {
                return ((SecDetect) this.instance).getSensor();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getSmid() {
                return ((SecDetect) this.instance).getSmid();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getSmidBytes() {
                return ((SecDetect) this.instance).getSmidBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getSubstrate() {
                return ((SecDetect) this.instance).getSubstrate();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getTime() {
                return ((SecDetect) this.instance).getTime();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getTimeBytes() {
                return ((SecDetect) this.instance).getTimeBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getTimeZone() {
                return ((SecDetect) this.instance).getTimeZone();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getTimeZoneBytes() {
                return ((SecDetect) this.instance).getTimeZoneBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getUSB() {
                return ((SecDetect) this.instance).getUSB();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getUserId() {
                return ((SecDetect) this.instance).getUserId();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getUserIdBytes() {
                return ((SecDetect) this.instance).getUserIdBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getVPN() {
                return ((SecDetect) this.instance).getVPN();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getVersion() {
                return ((SecDetect) this.instance).getVersion();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getVersionBytes() {
                return ((SecDetect) this.instance).getVersionBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public String getWifiProxy() {
                return ((SecDetect) this.instance).getWifiProxy();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public ByteString getWifiProxyBytes() {
                return ((SecDetect) this.instance).getWifiProxyBytes();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getXposed() {
                return ((SecDetect) this.instance).getXposed();
            }

            @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
            public boolean getZygisk() {
                return ((SecDetect) this.instance).getZygisk();
            }

            public Builder setAccessibilityS(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setAccessibilityS(z);
                return this;
            }

            public Builder setAcsPackages(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setAcsPackages(str);
                return this;
            }

            public Builder setAcsPackagesBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setAcsPackagesBytes(byteString);
                return this;
            }

            public Builder setAntiBypassJailbreak(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setAntiBypassJailbreak(z);
                return this;
            }

            public Builder setAppInstallS(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setAppInstallS(str);
                return this;
            }

            public Builder setAppInstallSBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setAppInstallSBytes(byteString);
                return this;
            }

            public Builder setAppVirtual(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setAppVirtual(z);
                return this;
            }

            public Builder setAppVirtualPkg(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setAppVirtualPkg(str);
                return this;
            }

            public Builder setAppVirtualPkgBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setAppVirtualPkgBytes(byteString);
                return this;
            }

            public Builder setAttachPort(int i, int i2) {
                copyOnWrite();
                ((SecDetect) this.instance).setAttachPort(i, i2);
                return this;
            }

            public Builder setBootId(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setBootId(str);
                return this;
            }

            public Builder setBootIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setBootIdBytes(byteString);
                return this;
            }

            public Builder setCertMD5(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setCertMD5(str);
                return this;
            }

            public Builder setCertMD5Bytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setCertMD5Bytes(byteString);
                return this;
            }

            public Builder setDebug(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setDebug(z);
                return this;
            }

            public Builder setDevice(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setDevice(str);
                return this;
            }

            public Builder setDeviceBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setDeviceBytes(byteString);
                return this;
            }

            public Builder setDoneAtTime(long j) {
                copyOnWrite();
                ((SecDetect) this.instance).setDoneAtTime(j);
                return this;
            }

            public Builder setEmulator(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setEmulator(z);
                return this;
            }

            public Builder setFileIntegrity(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setFileIntegrity(z);
                return this;
            }

            public Builder setFishHook(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setFishHook(z);
                return this;
            }

            public Builder setFrida(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setFrida(z);
                return this;
            }

            public Builder setHasFlash(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setHasFlash(z);
                return this;
            }

            public Builder setHasSim(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setHasSim(z);
                return this;
            }

            public Builder setHttpProxy(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setHttpProxy(z);
                return this;
            }

            public Builder setIden(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setIden(str);
                return this;
            }

            public Builder setIdenBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setIdenBytes(byteString);
                return this;
            }

            public Builder setInjection(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setInjection(z);
                return this;
            }

            public Builder setInlineHook(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setInlineHook(z);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setLanguage(str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setLanguageBytes(byteString);
                return this;
            }

            public Builder setLightSensor(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setLightSensor(z);
                return this;
            }

            public Builder setMagisk(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setMagisk(z);
                return this;
            }

            public Builder setMsHookFun(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setMsHookFun(z);
                return this;
            }

            public Builder setNetworkType(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setNetworkType(str);
                return this;
            }

            public Builder setNetworkTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setNetworkTypeBytes(byteString);
                return this;
            }

            public Builder setPtrace(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setPtrace(z);
                return this;
            }

            public Builder setReSignature(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setReSignature(z);
                return this;
            }

            public Builder setReserveTool(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setReserveTool(z);
                return this;
            }

            public Builder setReserveToolName(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setReserveToolName(str);
                return this;
            }

            public Builder setReserveToolNameBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setReserveToolNameBytes(byteString);
                return this;
            }

            public Builder setRiskFile(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setRiskFile(str);
                return this;
            }

            public Builder setRiskFileBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setRiskFileBytes(byteString);
                return this;
            }

            public Builder setRoot(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setRoot(z);
                return this;
            }

            public Builder setRuntimeHook(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setRuntimeHook(z);
                return this;
            }

            public Builder setSensor(int i) {
                copyOnWrite();
                ((SecDetect) this.instance).setSensor(i);
                return this;
            }

            public Builder setSmid(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setSmid(str);
                return this;
            }

            public Builder setSmidBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setSmidBytes(byteString);
                return this;
            }

            public Builder setSubstrate(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setSubstrate(z);
                return this;
            }

            public Builder setTime(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setTime(str);
                return this;
            }

            public Builder setTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setTimeBytes(byteString);
                return this;
            }

            public Builder setTimeZone(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setTimeZone(str);
                return this;
            }

            public Builder setTimeZoneBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setTimeZoneBytes(byteString);
                return this;
            }

            public Builder setUSB(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setUSB(z);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setVPN(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setVPN(z);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setVersionBytes(byteString);
                return this;
            }

            public Builder setWifiProxy(String str) {
                copyOnWrite();
                ((SecDetect) this.instance).setWifiProxy(str);
                return this;
            }

            public Builder setWifiProxyBytes(ByteString byteString) {
                copyOnWrite();
                ((SecDetect) this.instance).setWifiProxyBytes(byteString);
                return this;
            }

            public Builder setXposed(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setXposed(z);
                return this;
            }

            public Builder setZygisk(boolean z) {
                copyOnWrite();
                ((SecDetect) this.instance).setZygisk(z);
                return this;
            }

            private Builder() {
                super(SecDetect.DEFAULT_INSTANCE);
            }
        }

        static {
            SecDetect secDetect = new SecDetect();
            DEFAULT_INSTANCE = secDetect;
            GeneratedMessageLite.registerDefaultInstance(SecDetect.class, secDetect);
        }

        private SecDetect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttachPort(Iterable<? extends Integer> iterable) {
            ensureAttachPortIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.attachPort_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttachPort(int i) {
            ensureAttachPortIsMutable();
            this.attachPort_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessibilityS() {
            this.accessibilityS_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAcsPackages() {
            this.acsPackages_ = getDefaultInstance().getAcsPackages();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAntiBypassJailbreak() {
            this.antiBypassJailbreak_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppInstallS() {
            this.appInstallS_ = getDefaultInstance().getAppInstallS();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVirtual() {
            this.appVirtual_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVirtualPkg() {
            this.appVirtualPkg_ = getDefaultInstance().getAppVirtualPkg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttachPort() {
            this.attachPort_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBootId() {
            this.bootId_ = getDefaultInstance().getBootId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCertMD5() {
            this.certMD5_ = getDefaultInstance().getCertMD5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebug() {
            this.debug_ = false;
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
        public void clearEmulator() {
            this.emulator_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileIntegrity() {
            this.fileIntegrity_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFishHook() {
            this.fishHook_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrida() {
            this.frida_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasFlash() {
            this.hasFlash_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasSim() {
            this.hasSim_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHttpProxy() {
            this.httpProxy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIden() {
            this.iden_ = getDefaultInstance().getIden();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInjection() {
            this.injection_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInlineHook() {
            this.inlineHook_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLightSensor() {
            this.lightSensor_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMagisk() {
            this.magisk_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsHookFun() {
            this.msHookFun_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkType() {
            this.networkType_ = getDefaultInstance().getNetworkType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPtrace() {
            this.ptrace_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReSignature() {
            this.reSignature_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReserveTool() {
            this.reserveTool_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReserveToolName() {
            this.reserveToolName_ = getDefaultInstance().getReserveToolName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRiskFile() {
            this.riskFile_ = getDefaultInstance().getRiskFile();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoot() {
            this.root_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRuntimeHook() {
            this.runtimeHook_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSensor() {
            this.sensor_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSmid() {
            this.smid_ = getDefaultInstance().getSmid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubstrate() {
            this.substrate_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = getDefaultInstance().getTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeZone() {
            this.timeZone_ = getDefaultInstance().getTimeZone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUSB() {
            this.uSB_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVPN() {
            this.vPN_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiProxy() {
            this.wifiProxy_ = getDefaultInstance().getWifiProxy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXposed() {
            this.xposed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZygisk() {
            this.zygisk_ = false;
        }

        private void ensureAttachPortIsMutable() {
            if (this.attachPort_.isModifiable()) {
                return;
            }
            this.attachPort_ = GeneratedMessageLite.mutableCopy(this.attachPort_);
        }

        public static SecDetect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SecDetect parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SecDetect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecDetect parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SecDetect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessibilityS(boolean z) {
            this.accessibilityS_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAcsPackages(String str) {
            str.getClass();
            this.acsPackages_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAcsPackagesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.acsPackages_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAntiBypassJailbreak(boolean z) {
            this.antiBypassJailbreak_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppInstallS(String str) {
            str.getClass();
            this.appInstallS_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppInstallSBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appInstallS_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVirtual(boolean z) {
            this.appVirtual_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVirtualPkg(String str) {
            str.getClass();
            this.appVirtualPkg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVirtualPkgBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appVirtualPkg_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttachPort(int i, int i2) {
            ensureAttachPortIsMutable();
            this.attachPort_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBootId(String str) {
            str.getClass();
            this.bootId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBootIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bootId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCertMD5(String str) {
            str.getClass();
            this.certMD5_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCertMD5Bytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.certMD5_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebug(boolean z) {
            this.debug_ = z;
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
        public void setEmulator(boolean z) {
            this.emulator_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileIntegrity(boolean z) {
            this.fileIntegrity_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFishHook(boolean z) {
            this.fishHook_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrida(boolean z) {
            this.frida_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasFlash(boolean z) {
            this.hasFlash_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasSim(boolean z) {
            this.hasSim_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHttpProxy(boolean z) {
            this.httpProxy_ = z;
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
        public void setInjection(boolean z) {
            this.injection_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInlineHook(boolean z) {
            this.inlineHook_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLightSensor(boolean z) {
            this.lightSensor_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMagisk(boolean z) {
            this.magisk_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsHookFun(boolean z) {
            this.msHookFun_ = z;
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
        public void setPtrace(boolean z) {
            this.ptrace_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReSignature(boolean z) {
            this.reSignature_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReserveTool(boolean z) {
            this.reserveTool_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReserveToolName(String str) {
            str.getClass();
            this.reserveToolName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReserveToolNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.reserveToolName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRiskFile(String str) {
            str.getClass();
            this.riskFile_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRiskFileBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.riskFile_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoot(boolean z) {
            this.root_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRuntimeHook(boolean z) {
            this.runtimeHook_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSensor(int i) {
            this.sensor_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSmid(String str) {
            str.getClass();
            this.smid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSmidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.smid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubstrate(boolean z) {
            this.substrate_ = z;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZone(String str) {
            str.getClass();
            this.timeZone_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZoneBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.timeZone_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUSB(boolean z) {
            this.uSB_ = z;
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
        public void setVPN(boolean z) {
            this.vPN_ = z;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiProxy(String str) {
            str.getClass();
            this.wifiProxy_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiProxyBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.wifiProxy_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXposed(boolean z) {
            this.xposed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZygisk(boolean z) {
            this.zygisk_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SecDetect();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000.\u0000\u0000\u0001..\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\rȈ\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014Ȉ\u0015\u0007\u0016\u0007\u0017\u0004\u0018\u0007\u0019'\u001a\u0007\u001b\u0007\u001c\u0007\u001d\u0007\u001eȈ\u001fȈ Ȉ!Ȉ\"\u0007#Ȉ$\u0007%\u0007&\u0007'Ȉ(\u0007)\u0007*\u0002+Ȉ,Ȉ-Ȉ.Ȉ", new Object[]{"iden_", "time_", "userId_", "version_", "device_", "debug_", "emulator_", "fishHook_", "fileIntegrity_", "reserveTool_", "runtimeHook_", "msHookFun_", "appInstallS_", "root_", "vPN_", "injection_", "xposed_", "frida_", "substrate_", "wifiProxy_", "ptrace_", "appVirtual_", "sensor_", "hasFlash_", "attachPort_", "uSB_", "lightSensor_", "accessibilityS_", "httpProxy_", "language_", "networkType_", "timeZone_", "appVirtualPkg_", "hasSim_", "reserveToolName_", "magisk_", "inlineHook_", "zygisk_", "certMD5_", "antiBypassJailbreak_", "reSignature_", "doneAtTime_", "riskFile_", "acsPackages_", "bootId_", "smid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SecDetect> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SecDetect.class) {
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

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getAccessibilityS() {
            return this.accessibilityS_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getAcsPackages() {
            return this.acsPackages_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getAcsPackagesBytes() {
            return ByteString.copyFromUtf8(this.acsPackages_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getAntiBypassJailbreak() {
            return this.antiBypassJailbreak_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getAppInstallS() {
            return this.appInstallS_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getAppInstallSBytes() {
            return ByteString.copyFromUtf8(this.appInstallS_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getAppVirtual() {
            return this.appVirtual_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getAppVirtualPkg() {
            return this.appVirtualPkg_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getAppVirtualPkgBytes() {
            return ByteString.copyFromUtf8(this.appVirtualPkg_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public int getAttachPort(int i) {
            return this.attachPort_.getInt(i);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public int getAttachPortCount() {
            return this.attachPort_.size();
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public List<Integer> getAttachPortList() {
            return this.attachPort_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getBootId() {
            return this.bootId_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getBootIdBytes() {
            return ByteString.copyFromUtf8(this.bootId_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getCertMD5() {
            return this.certMD5_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getCertMD5Bytes() {
            return ByteString.copyFromUtf8(this.certMD5_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getDebug() {
            return this.debug_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getDevice() {
            return this.device_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getDeviceBytes() {
            return ByteString.copyFromUtf8(this.device_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public long getDoneAtTime() {
            return this.doneAtTime_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getEmulator() {
            return this.emulator_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getFileIntegrity() {
            return this.fileIntegrity_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getFishHook() {
            return this.fishHook_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getFrida() {
            return this.frida_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getHasFlash() {
            return this.hasFlash_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getHasSim() {
            return this.hasSim_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getHttpProxy() {
            return this.httpProxy_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getIden() {
            return this.iden_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getIdenBytes() {
            return ByteString.copyFromUtf8(this.iden_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getInjection() {
            return this.injection_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getInlineHook() {
            return this.inlineHook_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getLightSensor() {
            return this.lightSensor_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getMagisk() {
            return this.magisk_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getMsHookFun() {
            return this.msHookFun_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getNetworkType() {
            return this.networkType_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getNetworkTypeBytes() {
            return ByteString.copyFromUtf8(this.networkType_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getPtrace() {
            return this.ptrace_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getReSignature() {
            return this.reSignature_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getReserveTool() {
            return this.reserveTool_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getReserveToolName() {
            return this.reserveToolName_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getReserveToolNameBytes() {
            return ByteString.copyFromUtf8(this.reserveToolName_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getRiskFile() {
            return this.riskFile_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getRiskFileBytes() {
            return ByteString.copyFromUtf8(this.riskFile_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getRoot() {
            return this.root_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getRuntimeHook() {
            return this.runtimeHook_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public int getSensor() {
            return this.sensor_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getSmid() {
            return this.smid_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getSmidBytes() {
            return ByteString.copyFromUtf8(this.smid_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getSubstrate() {
            return this.substrate_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getTime() {
            return this.time_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getTimeBytes() {
            return ByteString.copyFromUtf8(this.time_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getTimeZone() {
            return this.timeZone_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getTimeZoneBytes() {
            return ByteString.copyFromUtf8(this.timeZone_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getUSB() {
            return this.uSB_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getVPN() {
            return this.vPN_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public String getWifiProxy() {
            return this.wifiProxy_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public ByteString getWifiProxyBytes() {
            return ByteString.copyFromUtf8(this.wifiProxy_);
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getXposed() {
            return this.xposed_;
        }

        @Override // com.common.support.apm.protobuf.SecDetectProto.SecDetectOrBuilder
        public boolean getZygisk() {
            return this.zygisk_;
        }

        public static Builder newBuilder(SecDetect secDetect) {
            return DEFAULT_INSTANCE.createBuilder(secDetect);
        }

        public static SecDetect parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SecDetect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecDetect parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SecDetect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SecDetect parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SecDetect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SecDetect parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SecDetect parseFrom(InputStream inputStream) throws IOException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecDetect parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecDetect parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SecDetect parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SecDetect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SecDetectOrBuilder extends MessageLiteOrBuilder {
        boolean getAccessibilityS();

        String getAcsPackages();

        ByteString getAcsPackagesBytes();

        boolean getAntiBypassJailbreak();

        String getAppInstallS();

        ByteString getAppInstallSBytes();

        boolean getAppVirtual();

        String getAppVirtualPkg();

        ByteString getAppVirtualPkgBytes();

        int getAttachPort(int i);

        int getAttachPortCount();

        List<Integer> getAttachPortList();

        String getBootId();

        ByteString getBootIdBytes();

        String getCertMD5();

        ByteString getCertMD5Bytes();

        boolean getDebug();

        String getDevice();

        ByteString getDeviceBytes();

        long getDoneAtTime();

        boolean getEmulator();

        boolean getFileIntegrity();

        boolean getFishHook();

        boolean getFrida();

        boolean getHasFlash();

        boolean getHasSim();

        boolean getHttpProxy();

        String getIden();

        ByteString getIdenBytes();

        boolean getInjection();

        boolean getInlineHook();

        String getLanguage();

        ByteString getLanguageBytes();

        boolean getLightSensor();

        boolean getMagisk();

        boolean getMsHookFun();

        String getNetworkType();

        ByteString getNetworkTypeBytes();

        boolean getPtrace();

        boolean getReSignature();

        boolean getReserveTool();

        String getReserveToolName();

        ByteString getReserveToolNameBytes();

        String getRiskFile();

        ByteString getRiskFileBytes();

        boolean getRoot();

        boolean getRuntimeHook();

        int getSensor();

        String getSmid();

        ByteString getSmidBytes();

        boolean getSubstrate();

        String getTime();

        ByteString getTimeBytes();

        String getTimeZone();

        ByteString getTimeZoneBytes();

        boolean getUSB();

        String getUserId();

        ByteString getUserIdBytes();

        boolean getVPN();

        String getVersion();

        ByteString getVersionBytes();

        String getWifiProxy();

        ByteString getWifiProxyBytes();

        boolean getXposed();

        boolean getZygisk();
    }

    private SecDetectProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
