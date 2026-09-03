package com.squareup.wire;

import java.io.IOException;
import okio.ByteString;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoWriter {
    private final oo00oO sink;

    public ProtoWriter(oo00oO oo00oo) {
        this.sink = oo00oo;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int int32Size(int i) {
        if (i >= 0) {
            return varint32Size(i);
        }
        return 10;
    }

    private static int makeTag(int i, FieldEncoding fieldEncoding) {
        return (i << 3) | fieldEncoding.value;
    }

    public static int tagSize(int i) {
        return varint32Size(makeTag(i, FieldEncoding.VARINT));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    public static int utf8Length(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                i3++;
            } else if (cCharAt < 2048) {
                i3 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i3 += 3;
            } else if (cCharAt > 56319 || (i = i2 + 1) >= length || str.charAt(i) < 56320 || str.charAt(i) > 57343) {
                i3++;
            } else {
                i3 += 4;
                i2 = i;
            }
            i2++;
        }
        return i3;
    }

    public static int varint32Size(int i) {
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

    public static int varint64Size(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public void writeBytes(ByteString byteString) throws IOException {
        this.sink.o000000(byteString);
    }

    public void writeFixed32(int i) throws IOException {
        this.sink.OooOooO(i);
    }

    public void writeFixed64(long j) throws IOException {
        this.sink.OooOoO0(j);
    }

    public void writeSignedVarint32(int i) throws IOException {
        if (i >= 0) {
            writeVarint32(i);
        } else {
            writeVarint64(i);
        }
    }

    public void writeString(String str) throws IOException {
        this.sink.OoooOoo(str);
    }

    public void writeTag(int i, FieldEncoding fieldEncoding) throws IOException {
        writeVarint32(makeTag(i, fieldEncoding));
    }

    public void writeVarint32(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.sink.Oooo000((i & 127) | 128);
            i >>>= 7;
        }
        this.sink.Oooo000(i);
    }

    public void writeVarint64(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.sink.Oooo000((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.sink.Oooo000((int) j);
    }
}
