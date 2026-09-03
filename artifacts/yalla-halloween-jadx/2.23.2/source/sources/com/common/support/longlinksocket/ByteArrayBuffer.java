package com.common.support.longlinksocket;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u001dR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0006¨\u0006 "}, d2 = {"Lcom/common/support/longlinksocket/ByteArrayBuffer;", "", "len", "", "oldBuffer", "(ILcom/common/support/longlinksocket/ByteArrayBuffer;)V", "(I)V", "array", "", "getArray", "()[B", "setArray", "([B)V", "length", "getLength", "()I", "setLength", "offset", "getOffset", "setOffset", "realSize", "getRealSize", "setRealSize", "append", "data", "readLean", "flush", "position", "reSize", "", "totalSize", "reset", "longlink-socket_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ByteArrayBuffer {

    @NotNull
    private byte[] array;
    private final int len;
    private int length;
    private int offset;
    private int realSize;

    public ByteArrayBuffer(int i) {
        this.len = i;
        this.array = new byte[i];
        this.length = i;
    }

    public final int append(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        System.arraycopy(data, 0, this.array, this.offset, data.length);
        int length = this.offset + data.length;
        this.offset = length;
        this.realSize = length;
        return length;
    }

    public final int flush(int position) {
        this.offset = position;
        return position;
    }

    @NotNull
    public final byte[] getArray() {
        return this.array;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getRealSize() {
        return this.realSize;
    }

    public final void reSize(int totalSize) {
        byte[] bArr = this.array;
        byte[] bArr2 = new byte[totalSize];
        this.array = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, this.offset);
        this.length = totalSize;
    }

    public final void reset() {
        int i = this.len;
        this.array = new byte[i];
        this.length = i;
        this.offset = 0;
        this.realSize = 0;
    }

    public final void setArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.array = bArr;
    }

    public final void setLength(int i) {
        this.length = i;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setRealSize(int i) {
        this.realSize = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteArrayBuffer(int i, @NotNull ByteArrayBuffer oldBuffer) {
        this(i);
        Intrinsics.checkNotNullParameter(oldBuffer, "oldBuffer");
        if (i >= 0) {
            int i2 = oldBuffer.length;
            int i3 = i + i2;
            byte[] bArr = new byte[i3];
            this.array = bArr;
            System.arraycopy(oldBuffer.array, 0, bArr, 0, i2);
            this.offset = i;
            this.realSize = i;
            this.length = i3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public final ByteArrayBuffer append(int readLean, @NotNull ByteArrayBuffer oldBuffer) {
        Intrinsics.checkNotNullParameter(oldBuffer, "oldBuffer");
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(oldBuffer.length + readLean);
        System.arraycopy(oldBuffer.array, 0, byteArrayBuffer.array, 0, oldBuffer.offset);
        byteArrayBuffer.offset = oldBuffer.offset;
        byteArrayBuffer.realSize = oldBuffer.realSize;
        return byteArrayBuffer;
    }
}
