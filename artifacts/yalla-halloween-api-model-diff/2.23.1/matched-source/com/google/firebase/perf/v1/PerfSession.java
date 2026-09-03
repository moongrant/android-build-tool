package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p677oo0oOOo.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class PerfSession extends GeneratedMessageLite<PerfSession, OooO0OO> implements OooOO0O {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile Parser<PerfSession> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, SessionVerbosity> sessionVerbosity_converter_ = new OooO00o();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    public class OooO00o implements Internal.ListAdapter.Converter<Integer, SessionVerbosity> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final SessionVerbosity convert(Integer num) {
            SessionVerbosity sessionVerbosityOooO00o = SessionVerbosity.OooO00o(num.intValue());
            return sessionVerbosityOooO00o == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosityOooO00o;
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20027OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20027OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20027OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20027OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20027OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20027OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20027OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20027OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageLite.Builder<PerfSession, OooO0OO> implements OooOO0O {
        public OooO0OO() {
            super(PerfSession.DEFAULT_INSTANCE);
        }

        public final void OooO0O0(SessionVerbosity sessionVerbosity) {
            copyOnWrite();
            ((PerfSession) this.instance).addSessionVerbosity(sessionVerbosity);
        }

        public final void OooO0Oo(String str) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionId(str);
        }
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.registerDefaultInstance(PerfSession.class, perfSession);
    }

    private PerfSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
        ensureSessionVerbosityIsMutable();
        Iterator<? extends SessionVerbosity> it = iterable.iterator();
        while (it.hasNext()) {
            this.sessionVerbosity_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionVerbosity(SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.addInt(sessionVerbosity.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureSessionVerbosityIsMutable() {
        Internal.IntList intList = this.sessionVerbosity_;
        if (intList.isModifiable()) {
            return;
        }
        this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static OooO0OO newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PerfSession> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        this.sessionId_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionVerbosity(int i, SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.setInt(i, sessionVerbosity.getNumber());
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (OooO0O0.f20027OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new OooO0OO();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.OooO0O0.f20028OooO00o});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PerfSession> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (PerfSession.class) {
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

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public SessionVerbosity getSessionVerbosity(int i) {
        SessionVerbosity sessionVerbosityOooO00o = SessionVerbosity.OooO00o(this.sessionVerbosity_.getInt(i));
        return sessionVerbosityOooO00o == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosityOooO00o;
    }

    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public List<SessionVerbosity> getSessionVerbosityList() {
        return new Internal.ListAdapter(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static OooO0OO newBuilder(PerfSession perfSession) {
        return DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PerfSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PerfSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PerfSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PerfSession parseFrom(InputStream inputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
