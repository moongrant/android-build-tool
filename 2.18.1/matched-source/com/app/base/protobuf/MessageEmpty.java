package com.app.base.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.OooOO0O;
import com.google.protobuf.OooOo00;
import com.google.protobuf.o00oO0o;
import com.google.protobuf.o0OOO0o;
import com.google.protobuf.oo000o;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class MessageEmpty {

    /* JADX INFO: renamed from: com.app.base.protobuf.MessageEmpty$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class Empty extends GeneratedMessageLite<Empty, Builder> implements EmptyOrBuilder {
        private static final Empty DEFAULT_INSTANCE;
        private static volatile o0OOO0o<Empty> PARSER;

        public static final class Builder extends GeneratedMessageLite.OooO00o<Empty, Builder> implements EmptyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Empty.DEFAULT_INSTANCE);
            }
        }

        static {
            Empty empty = new Empty();
            DEFAULT_INSTANCE = empty;
            empty.makeImmutable();
        }

        private Empty() {
        }

        public static Empty getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Empty parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Empty) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Empty parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static o0OOO0o<Empty> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Empty();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return this;
                case 6:
                    OooOO0O oooOO0O = (OooOO0O) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iOooOOoo = oooOO0O.OooOOoo();
                            if (iOooOOoo == 0 || !oooOO0O.OooOo0O(iOooOOoo)) {
                                z = true;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Empty.class) {
                            if (PARSER == null) {
                                PARSER = new GeneratedMessageLite.OooO0O0(DEFAULT_INSTANCE);
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    throw new UnsupportedOperationException();
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.oo000o
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.oo000o
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static Builder newBuilder(Empty empty) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(empty);
        }

        public static Empty parseDelimitedFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            return (Empty) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, oooOo00);
        }

        public static Empty parseFrom(ByteString byteString, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, oooOo00);
        }

        public static Empty parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Empty parseFrom(byte[] bArr, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, oooOo00);
        }

        public static Empty parseFrom(InputStream inputStream) throws IOException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Empty parseFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, oooOo00);
        }

        public static Empty parseFrom(OooOO0O oooOO0O) throws IOException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, oooOO0O);
        }

        public static Empty parseFrom(OooOO0O oooOO0O, OooOo00 oooOo00) throws IOException {
            return (Empty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, oooOO0O, oooOo00);
        }
    }

    public interface EmptyOrBuilder extends o00oO0o {
        @Override // com.google.protobuf.o00oO0o
        /* synthetic */ oo000o getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    private MessageEmpty() {
    }

    public static void registerAllExtensions(OooOo00 oooOo00) {
    }
}
