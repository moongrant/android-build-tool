package com.google.protobuf;

import com.google.protobuf.OooO00o;
import com.google.protobuf.OooO00o.AbstractC0157OooO00o;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o<MessageType extends OooO00o<MessageType, BuilderType>, BuilderType extends AbstractC0157OooO00o<MessageType, BuilderType>> implements oo000o {
    public int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0157OooO00o.addAll(iterable, collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.OooO0OO()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Serializing ");
        sbOooO0o0.append(getClass().getName());
        sbOooO0o0.append(" to a ");
        sbOooO0o0.append(str);
        sbOooO0o0.append(" threw an IOException (should never happen).");
        return sbOooO0o0.toString();
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.f19326OooO00o;
            CodedOutputStream.OooO0OO oooO0OO = new CodedOutputStream.OooO0OO(bArr, serializedSize);
            writeTo(oooO0OO);
            if (oooO0OO.f19334OooO0o0 - oooO0OO.f19333OooO0o == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public ByteString toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ByteString.OooO0o oooO0o = ByteString.f19322Oooo0oO;
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.f19326OooO00o;
            CodedOutputStream.OooO0OO oooO0OO = new CodedOutputStream.OooO0OO(bArr, serializedSize);
            writeTo(oooO0OO);
            if (oooO0OO.f19334OooO0o0 - oooO0OO.f19333OooO0o == 0) {
                return new ByteString.OooO0o(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iOooO = CodedOutputStream.OooO(serializedSize) + serializedSize;
        if (iOooO > 4096) {
            iOooO = 4096;
        }
        CodedOutputStream.OooO0o oooO0o = new CodedOutputStream.OooO0o(outputStream, iOooO);
        oooO0o.OooOOOo(serializedSize);
        writeTo(oooO0o);
        if (oooO0o.f19330OooO0o > 0) {
            oooO0o.OooOo0();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = CodedOutputStream.f19326OooO00o;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream.OooO0o oooO0o = new CodedOutputStream.OooO0o(outputStream, serializedSize);
        writeTo(oooO0o);
        if (oooO0o.f19330OooO0o > 0) {
            oooO0o.OooOo0();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractC0157OooO00o<MessageType extends OooO00o<MessageType, BuilderType>, BuilderType extends AbstractC0157OooO00o<MessageType, BuilderType>> implements oo000o.OooO00o {
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            Objects.requireNonNull(iterable);
            if (iterable instanceof o00Oo0) {
                checkForNullValues(((o00Oo0) iterable).getUnderlyingElements());
                collection.addAll((Collection) iterable);
            } else {
                if (iterable instanceof Collection) {
                    checkForNullValues(iterable);
                    collection.addAll((Collection) iterable);
                    return;
                }
                for (T t : iterable) {
                    Objects.requireNonNull(t);
                    collection.add(t);
                }
            }
        }

        private static void checkForNullValues(Iterable<?> iterable) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
        }

        private String getReadingExceptionMessage(String str) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Reading ");
            sbOooO0o0.append(getClass().getName());
            sbOooO0o0.append(" from a ");
            sbOooO0o0.append(str);
            sbOooO0o0.append(" threw an IOException (should never happen).");
            return sbOooO0o0.toString();
        }

        public static UninitializedMessageException newUninitializedMessageException(oo000o oo000oVar) {
            return new UninitializedMessageException();
        }

        @Override // 
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo240clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            int i = inputStream.read();
            if (i == -1) {
                return false;
            }
            m246mergeFrom((InputStream) new C0158OooO00o(inputStream, OooOO0O.OooOOOO(i, inputStream)), oooOo00);
            return true;
        }

        @Override // 
        /* JADX INFO: renamed from: mergeFrom */
        public abstract BuilderType mo241mergeFrom(OooOO0O oooOO0O, OooOo00 oooOo00) throws IOException;

        /* JADX INFO: renamed from: com.google.protobuf.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0158OooO00o extends FilterInputStream {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f19350Oooo0o;

            public C0158OooO00o(InputStream inputStream, int i) {
                super(inputStream);
                this.f19350Oooo0o = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.f19350Oooo0o);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f19350Oooo0o <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f19350Oooo0o--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f19350Oooo0o));
                if (jSkip >= 0) {
                    this.f19350Oooo0o = (int) (((long) this.f19350Oooo0o) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f19350Oooo0o;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f19350Oooo0o -= i4;
                }
                return i4;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, OooOo00.OooO00o());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m244mergeFrom(OooOO0O oooOO0O) throws IOException {
            return (BuilderType) mo241mergeFrom(oooOO0O, OooOo00.OooO00o());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m242mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                OooOO0O oooOO0OOooO0o0 = byteString.OooO0o0();
                m244mergeFrom(oooOO0OOooO0o0);
                oooOO0OOooO0o0.OooO00o(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m243mergeFrom(ByteString byteString, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            try {
                OooOO0O oooOO0OOooO0o0 = byteString.OooO0o0();
                mo241mergeFrom(oooOO0OOooO0o0, oooOo00);
                oooOO0OOooO0o0.OooO00o(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // com.google.protobuf.oo000o.OooO00o
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) m247mergeFrom(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m247mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                OooOO0O oooOO0OOooO0Oo = OooOO0O.OooO0Oo(bArr, i, i2);
                m244mergeFrom(oooOO0OOooO0Oo);
                oooOO0OOooO0Oo.OooO00o(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m249mergeFrom(byte[] bArr, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return (BuilderType) m248mergeFrom(bArr, 0, bArr.length, oooOo00);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m248mergeFrom(byte[] bArr, int i, int i2, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            try {
                OooOO0O oooOO0OOooO0Oo = OooOO0O.OooO0Oo(bArr, i, i2);
                mo241mergeFrom(oooOO0OOooO0Oo, oooOo00);
                oooOO0OOooO0Oo.OooO00o(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m245mergeFrom(InputStream inputStream) throws IOException {
            OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO(inputStream);
            m244mergeFrom(oooOO0OOooO0OO);
            oooOO0OOooO0OO.OooO00o(0);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m246mergeFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO(inputStream);
            mo241mergeFrom(oooOO0OOooO0OO, oooOo00);
            oooOO0OOooO0OO.OooO00o(0);
            return this;
        }

        @Override // com.google.protobuf.oo000o.OooO00o
        public BuilderType mergeFrom(oo000o oo000oVar) {
            if (getDefaultInstanceForType().getClass().isInstance(oo000oVar)) {
                return (BuilderType) internalMergeFrom((OooO00o) oo000oVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }
}
