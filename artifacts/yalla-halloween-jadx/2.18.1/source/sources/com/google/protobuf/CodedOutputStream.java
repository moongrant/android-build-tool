package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedOutputStream extends OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f19326OooO00o = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f19327OooO0O0 = o000000.f19387OooO0OO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f19328OooO0OO = o000000.f19388OooO0Oo;

    public static abstract class OooO0O0 extends CodedOutputStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f19329OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19330OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f19331OooO0o0;

        public OooO0O0(int i) {
            super(null);
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f19329OooO0Oo = bArr;
            this.f19331OooO0o0 = bArr.length;
        }

        public final void OooOOo(int i) {
            OooOOoo((i << 3) | 0);
        }

        public final void OooOOoo(int i) {
            if (CodedOutputStream.f19327OooO0O0) {
                long j = CodedOutputStream.f19328OooO0OO + ((long) this.f19330OooO0o);
                long j2 = j;
                while ((i & (-128)) != 0) {
                    o000000.OooO0o(this.f19329OooO0Oo, j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                    j2 = 1 + j2;
                }
                o000000.OooO0o(this.f19329OooO0Oo, j2, (byte) i);
                this.f19330OooO0o += (int) ((1 + j2) - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f19329OooO0Oo;
                int i2 = this.f19330OooO0o;
                this.f19330OooO0o = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            byte[] bArr2 = this.f19329OooO0Oo;
            int i3 = this.f19330OooO0o;
            this.f19330OooO0o = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        public final void OooOo00(long j) {
            if (CodedOutputStream.f19327OooO0O0) {
                long j2 = CodedOutputStream.f19328OooO0OO + ((long) this.f19330OooO0o);
                long j3 = j;
                long j4 = j2;
                while ((j3 & (-128)) != 0) {
                    o000000.OooO0o(this.f19329OooO0Oo, j4, (byte) ((((int) j3) & 127) | 128));
                    j3 >>>= 7;
                    j4 = 1 + j4;
                }
                o000000.OooO0o(this.f19329OooO0Oo, j4, (byte) j3);
                this.f19330OooO0o += (int) ((1 + j4) - j2);
                return;
            }
            long j5 = j;
            while ((j5 & (-128)) != 0) {
                byte[] bArr = this.f19329OooO0Oo;
                int i = this.f19330OooO0o;
                this.f19330OooO0o = i + 1;
                bArr[i] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            }
            byte[] bArr2 = this.f19329OooO0Oo;
            int i2 = this.f19330OooO0o;
            this.f19330OooO0o = i2 + 1;
            bArr2[i2] = (byte) j5;
        }
    }

    public static class OooO0OO extends CodedOutputStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f19332OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19333OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f19334OooO0o0;

        public OooO0OO(byte[] bArr, int i) {
            super(null);
            int i2 = i + 0;
            if ((i | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f19332OooO0Oo = bArr;
            this.f19333OooO0o = 0;
            this.f19334OooO0o0 = i2;
        }

        @Override // com.google.protobuf.OooO
        public final void OooO00o(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f19332OooO0Oo, this.f19333OooO0o, i2);
                this.f19333OooO0o += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19333OooO0o), Integer.valueOf(this.f19334OooO0o0), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOO0O(int i, boolean z) throws IOException {
            OooOOo(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            try {
                byte[] bArr = this.f19332OooO0Oo;
                int i2 = this.f19333OooO0o;
                this.f19333OooO0o = i2 + 1;
                bArr[i2] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19333OooO0o), Integer.valueOf(this.f19334OooO0o0), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOO0o(ByteString byteString) throws IOException {
            OooOOo(3, 2);
            OooOOOo(byteString.size());
            byteString.OooOO0(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOO(int i, oo000o oo000oVar) throws IOException {
            OooOOo(i, 2);
            OooOOOo(oo000oVar.getSerializedSize());
            oo000oVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOO0(int i, int i2) throws IOException {
            OooOOo(i, 0);
            if (i2 >= 0) {
                OooOOOo(i2);
            } else {
                OooOOoo(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOOO(int i, String str) throws IOException {
            OooOOo(i, 2);
            int i2 = this.f19333OooO0o;
            try {
                int iOooO = CodedOutputStream.OooO(str.length() * 3);
                int iOooO2 = CodedOutputStream.OooO(str.length());
                if (iOooO2 == iOooO) {
                    int i3 = i2 + iOooO2;
                    this.f19333OooO0o = i3;
                    int iOooO0Oo = o000000O.OooO0Oo(str, this.f19332OooO0Oo, i3, this.f19334OooO0o0 - i3);
                    this.f19333OooO0o = i2;
                    OooOOOo((iOooO0Oo - i2) - iOooO2);
                    this.f19333OooO0o = iOooO0Oo;
                } else {
                    OooOOOo(o000000O.OooO0o0(str));
                    byte[] bArr = this.f19332OooO0Oo;
                    int i4 = this.f19333OooO0o;
                    this.f19333OooO0o = o000000O.OooO0Oo(str, bArr, i4, this.f19334OooO0o0 - i4);
                }
            } catch (o000000O.OooO0OO e) {
                this.f19333OooO0o = i2;
                OooOO0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOOo(int i) throws IOException {
            if (CodedOutputStream.f19327OooO0O0) {
                int i2 = this.f19334OooO0o0;
                int i3 = this.f19333OooO0o;
                if (i2 - i3 >= 10) {
                    long j = CodedOutputStream.f19328OooO0OO + ((long) i3);
                    while ((i & (-128)) != 0) {
                        o000000.OooO0o(this.f19332OooO0Oo, j, (byte) ((i & 127) | 128));
                        this.f19333OooO0o++;
                        i >>>= 7;
                        j = 1 + j;
                    }
                    o000000.OooO0o(this.f19332OooO0Oo, j, (byte) i);
                    this.f19333OooO0o++;
                    return;
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.f19332OooO0Oo;
                    int i4 = this.f19333OooO0o;
                    this.f19333OooO0o = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19333OooO0o), Integer.valueOf(this.f19334OooO0o0), 1), e);
                }
            }
            byte[] bArr2 = this.f19332OooO0Oo;
            int i5 = this.f19333OooO0o;
            this.f19333OooO0o = i5 + 1;
            bArr2[i5] = (byte) i;
        }

        public final void OooOOo(int i, int i2) throws IOException {
            OooOOOo((i << 3) | i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOo0(int i, long j) throws IOException {
            OooOOo(i, 0);
            OooOOoo(j);
        }

        public final void OooOOoo(long j) throws IOException {
            if (CodedOutputStream.f19327OooO0O0) {
                int i = this.f19334OooO0o0;
                int i2 = this.f19333OooO0o;
                if (i - i2 >= 10) {
                    long j2 = CodedOutputStream.f19328OooO0OO + ((long) i2);
                    while ((j & (-128)) != 0) {
                        o000000.OooO0o(this.f19332OooO0Oo, j2, (byte) ((((int) j) & 127) | 128));
                        this.f19333OooO0o++;
                        j >>>= 7;
                        j2 = 1 + j2;
                    }
                    o000000.OooO0o(this.f19332OooO0Oo, j2, (byte) j);
                    this.f19333OooO0o++;
                    return;
                }
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.f19332OooO0Oo;
                    int i3 = this.f19333OooO0o;
                    this.f19333OooO0o = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19333OooO0o), Integer.valueOf(this.f19334OooO0o0), 1), e);
                }
            }
            byte[] bArr2 = this.f19332OooO0Oo;
            int i4 = this.f19333OooO0o;
            this.f19333OooO0o = i4 + 1;
            bArr2[i4] = (byte) j;
        }
    }

    public static final class OooO0o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OutputStream f19335OooO0oO;

        public OooO0o(OutputStream outputStream, int i) {
            super(i);
            Objects.requireNonNull(outputStream, "out");
            this.f19335OooO0oO = outputStream;
        }

        @Override // com.google.protobuf.OooO
        public final void OooO00o(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f19331OooO0o0;
            int i4 = this.f19330OooO0o;
            int i5 = i3 - i4;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, this.f19329OooO0Oo, i4, i2);
                this.f19330OooO0o += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f19329OooO0Oo, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f19330OooO0o = this.f19331OooO0o0;
            OooOo0();
            if (i7 > this.f19331OooO0o0) {
                this.f19335OooO0oO.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, this.f19329OooO0Oo, 0, i7);
                this.f19330OooO0o = i7;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOO0O(int i, boolean z) throws IOException {
            OooOo0O(11);
            OooOOo(i);
            byte b = z ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f19329OooO0Oo;
            int i2 = this.f19330OooO0o;
            this.f19330OooO0o = i2 + 1;
            bArr[i2] = b;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOO0o(ByteString byteString) throws IOException {
            OooOo0o(3, 2);
            OooOOOo(byteString.size());
            byteString.OooOO0(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOO(int i, oo000o oo000oVar) throws IOException {
            OooOo0o(i, 2);
            OooOOOo(oo000oVar.getSerializedSize());
            oo000oVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOO0(int i, int i2) throws IOException {
            OooOo0O(20);
            OooOOo(i);
            if (i2 >= 0) {
                OooOOoo(i2);
            } else {
                OooOo00(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOOO(int i, String str) throws IOException {
            OooOo0o(i, 2);
            try {
                int length = str.length() * 3;
                int iOooO = CodedOutputStream.OooO(length);
                int i2 = iOooO + length;
                int i3 = this.f19331OooO0o0;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iOooO0Oo = o000000O.OooO0Oo(str, bArr, 0, length);
                    OooOOOo(iOooO0Oo);
                    OooO00o(bArr, 0, iOooO0Oo);
                    return;
                }
                if (i2 > i3 - this.f19330OooO0o) {
                    OooOo0();
                }
                int iOooO2 = CodedOutputStream.OooO(str.length());
                int i4 = this.f19330OooO0o;
                try {
                    if (iOooO2 == iOooO) {
                        int i5 = i4 + iOooO2;
                        this.f19330OooO0o = i5;
                        int iOooO0Oo2 = o000000O.OooO0Oo(str, this.f19329OooO0Oo, i5, this.f19331OooO0o0 - i5);
                        this.f19330OooO0o = i4;
                        OooOOoo((iOooO0Oo2 - i4) - iOooO2);
                        this.f19330OooO0o = iOooO0Oo2;
                    } else {
                        int iOooO0o0 = o000000O.OooO0o0(str);
                        OooOOoo(iOooO0o0);
                        this.f19330OooO0o = o000000O.OooO0Oo(str, this.f19329OooO0Oo, this.f19330OooO0o, iOooO0o0);
                    }
                } catch (o000000O.OooO0OO e) {
                    this.f19330OooO0o = i4;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (o000000O.OooO0OO e3) {
                OooOO0(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOOo(int i) throws IOException {
            OooOo0O(10);
            OooOOoo(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void OooOOo0(int i, long j) throws IOException {
            OooOo0O(20);
            OooOOo(i);
            OooOo00(j);
        }

        public final void OooOo0() throws IOException {
            this.f19335OooO0oO.write(this.f19329OooO0Oo, 0, this.f19330OooO0o);
            this.f19330OooO0o = 0;
        }

        public final void OooOo0O(int i) throws IOException {
            if (this.f19331OooO0o0 - this.f19330OooO0o < i) {
                OooOo0();
            }
        }

        public final void OooOo0o(int i, int i2) throws IOException {
            OooOOOo((i << 3) | 2);
        }
    }

    public CodedOutputStream() {
    }

    public static int OooO(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int OooO0O0(int i) {
        return OooO0oo(i) + 1;
    }

    public static int OooO0OO(int i, int i2) {
        return OooO0oo(i) + (i2 >= 0 ? OooO(i2) : 10);
    }

    public static int OooO0Oo(int i, long j) {
        return OooO0o0(j) + OooO0oo(i);
    }

    public static int OooO0o(int i, oo000o oo000oVar) {
        int iOooO0oo = OooO0oo(i);
        int serializedSize = oo000oVar.getSerializedSize();
        return OooO(serializedSize) + serializedSize + iOooO0oo;
    }

    public static int OooO0o0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            i++;
        }
        return i;
    }

    public static int OooO0oO(int i, String str) {
        int length;
        int iOooO0oo = OooO0oo(i);
        try {
            length = o000000O.OooO0o0(str);
        } catch (o000000O.OooO0OO unused) {
            length = str.getBytes(o000oOoO.f19395OooO00o).length;
        }
        return OooO(length) + length + iOooO0oo;
    }

    public static int OooO0oo(int i) {
        return OooO((i << 3) | 0);
    }

    public final void OooOO0(String str, o000000O.OooO0OO oooO0OO) throws IOException {
        f19326OooO00o.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) oooO0OO);
        byte[] bytes = str.getBytes(o000oOoO.f19395OooO00o);
        try {
            OooOOOo(bytes.length);
            OooO00o(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public abstract void OooOO0O(int i, boolean z) throws IOException;

    public abstract void OooOO0o(ByteString byteString) throws IOException;

    public abstract void OooOOO(int i, oo000o oo000oVar) throws IOException;

    public abstract void OooOOO0(int i, int i2) throws IOException;

    public abstract void OooOOOO(int i, String str) throws IOException;

    public abstract void OooOOOo(int i) throws IOException;

    public abstract void OooOOo0(int i, long j) throws IOException;

    public CodedOutputStream(OooO00o oooO00o) {
    }

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str, Throwable th) {
            super(p016OooOoO0.OooOo00.OooO0Oo("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }
}
