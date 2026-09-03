package com.squareup.wire;

import OooO00o.OooO00o;
import com.umeng.analytics.pro.bz;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.ByteCompanionObject;
import okio.ByteString;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoReader {
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private FieldEncoding nextFieldEncoding;
    private int recursionDepth;
    private final o0oOOo source;
    private long pos = 0;
    private long limit = Long.MAX_VALUE;
    private int state = 2;
    private int tag = -1;
    private long pushedLimit = -1;

    public ProtoReader(o0oOOo o0oooo2) {
        this.source = o0oooo2;
    }

    private void afterPackableScalar(int i) throws IOException {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Expected to end at ");
            sbOooO0o0.append(this.limit);
            sbOooO0o0.append(" but was ");
            sbOooO0o0.append(this.pos);
            throw new IOException(sbOooO0o0.toString());
        }
        if (j != j2) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Expected LENGTH_DELIMITED but was ");
            sbOooO0o0.append(this.state);
            throw new ProtocolException(sbOooO0o0.toString());
        }
        long j = this.limit - this.pos;
        this.source.o0000oo(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    private int internalReadVarint32() throws IOException {
        int i;
        this.source.o0000oo(1L);
        this.pos++;
        byte b = this.source.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & ByteCompanionObject.MAX_VALUE;
        this.source.o0000oo(1L);
        this.pos++;
        byte b2 = this.source.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & ByteCompanionObject.MAX_VALUE) << 7;
            this.source.o0000oo(1L);
            this.pos++;
            byte b3 = this.source.readByte();
            if (b3 >= 0) {
                i = b3 << bz.l;
            } else {
                i2 |= (b3 & ByteCompanionObject.MAX_VALUE) << 14;
                this.source.o0000oo(1L);
                this.pos++;
                byte b4 = this.source.readByte();
                if (b4 < 0) {
                    int i3 = i2 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
                    this.source.o0000oo(1L);
                    this.pos++;
                    byte b5 = this.source.readByte();
                    int i4 = i3 | (b5 << 28);
                    if (b5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.source.o0000oo(1L);
                        this.pos++;
                        if (this.source.readByte() >= 0) {
                            return i4;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i = b4 << 21;
            }
        }
        return i2 | i;
    }

    private void skipGroup(int i) throws IOException {
        while (this.pos < this.limit && !this.source.OooOooo()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iInternalReadVarint32 >> 3;
            int i3 = iInternalReadVarint32 & 7;
            if (i3 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i3 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i3 == 2) {
                long jInternalReadVarint32 = internalReadVarint32();
                this.pos += jInternalReadVarint32;
                this.source.skip(jInternalReadVarint32);
            } else if (i3 == 3) {
                skipGroup(i2);
            } else if (i3 == 4) {
                if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i3 != 5) {
                    throw new ProtocolException(android.support.v4.media.OooO00o.OooO00o("Unexpected field encoding: ", i3));
                }
                this.state = 5;
                readFixed32();
            }
        }
        throw new EOFException();
    }

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    public void endMessage(long j) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = j;
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Expected to end at ");
        sbOooO0o0.append(this.limit);
        sbOooO0o0.append(" but was ");
        sbOooO0o0.append(this.pos);
        throw new IOException(sbOooO0o0.toString());
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.OooOooo()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iInternalReadVarint32 >> 3;
            this.tag = i2;
            int i3 = iInternalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i2;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i2;
            }
            if (i3 == 2) {
                this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                this.state = 2;
                int iInternalReadVarint33 = internalReadVarint32();
                if (iInternalReadVarint33 < 0) {
                    throw new ProtocolException(android.support.v4.media.OooO00o.OooO00o("Negative length: ", iInternalReadVarint33));
                }
                if (this.pushedLimit != -1) {
                    throw new IllegalStateException();
                }
                long j = this.limit;
                this.pushedLimit = j;
                long j2 = this.pos + ((long) iInternalReadVarint33);
                this.limit = j2;
                if (j2 <= j) {
                    return this.tag;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 != 5) {
                    throw new ProtocolException(android.support.v4.media.OooO00o.OooO00o("Unexpected field encoding: ", i3));
                }
                this.nextFieldEncoding = FieldEncoding.FIXED32;
                this.state = 5;
                return i2;
            }
            skipGroup(i2);
        }
        return -1;
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public ByteString readBytes() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.o0000oo(jBeforeLengthDelimitedScalar);
        return this.source.OooOOOo(jBeforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i != 5 && i != 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Expected FIXED32 or LENGTH_DELIMITED but was ");
            sbOooO0o0.append(this.state);
            throw new ProtocolException(sbOooO0o0.toString());
        }
        this.source.o0000oo(4L);
        this.pos += 4;
        int iO0ooOoO = this.source.o0ooOoO();
        afterPackableScalar(5);
        return iO0ooOoO;
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i != 1 && i != 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Expected FIXED64 or LENGTH_DELIMITED but was ");
            sbOooO0o0.append(this.state);
            throw new ProtocolException(sbOooO0o0.toString());
        }
        this.source.o0000oo(8L);
        this.pos += 8;
        long jO00000O0 = this.source.o00000O0();
        afterPackableScalar(1);
        return jO00000O0;
    }

    public String readString() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.o0000oo(jBeforeLengthDelimitedScalar);
        return this.source.OooOOO0(jBeforeLengthDelimitedScalar);
    }

    public int readVarint32() throws IOException {
        int i = this.state;
        if (i == 0 || i == 2) {
            int iInternalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return iInternalReadVarint32;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Expected VARINT or LENGTH_DELIMITED but was ");
        sbOooO0o0.append(this.state);
        throw new ProtocolException(sbOooO0o0.toString());
    }

    public long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Expected VARINT or LENGTH_DELIMITED but was ");
            sbOooO0o0.append(this.state);
            throw new ProtocolException(sbOooO0o0.toString());
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.source.o0000oo(1L);
            this.pos++;
            byte b = this.source.readByte();
            j |= ((long) (b & ByteCompanionObject.MAX_VALUE)) << i2;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }
}
