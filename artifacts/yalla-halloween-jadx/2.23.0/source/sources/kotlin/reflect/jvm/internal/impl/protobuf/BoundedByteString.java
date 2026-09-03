package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p166o00Ooo00.o0OOO0o;

/* JADX INFO: loaded from: classes5.dex */
class BoundedByteString extends LiteralByteString {
    private final int bytesLength;
    private final int bytesOffset;

    public class BoundedByteIterator implements ByteString.ByteIterator {
        private final int limit;
        private int position;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i = this.position;
            if (i >= this.limit) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.bytes;
            this.position = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private BoundedByteIterator() {
            int offsetIntoBytes = BoundedByteString.this.getOffsetIntoBytes();
            this.position = offsetIntoBytes;
            this.limit = offsetIntoBytes + BoundedByteString.this.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    public BoundedByteString(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            throw new IllegalArgumentException(o0OOO0o.OooO00o(29, "Offset too small: ", i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(o0OOO0o.OooO00o(29, "Length too small: ", i));
        }
        if (((long) i) + ((long) i2) <= bArr.length) {
            this.bytesOffset = i;
            this.bytesLength = i2;
            return;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("Offset+Length too large: ");
        sb.append(i);
        sb.append("+");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public byte byteAt(int i) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(o0OOO0o.OooO00o(28, "Index too small: ", i));
        }
        if (i < size()) {
            return this.bytes[this.bytesOffset + i];
        }
        int size = size();
        StringBuilder sb = new StringBuilder(41);
        sb.append("Index too large: ");
        sb.append(i);
        sb.append(", ");
        sb.append(size);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.bytesLength;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new BoundedByteIterator();
    }
}
