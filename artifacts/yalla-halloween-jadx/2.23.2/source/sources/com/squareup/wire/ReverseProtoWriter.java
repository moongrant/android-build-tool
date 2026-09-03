package com.squareup.wire;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oO0Oo;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0013\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J2\u0010\u0012\u001a\u00020\u00042!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0016J\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020 R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00104\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter;", "", "", "minByteCount", "", "require", "emitCurrentSegment", "Lo0oooO0O/o0O0o00O;", "sink", "writeTo", "Lkotlin/Function1;", "Lcom/squareup/wire/ProtoWriter;", "Lkotlin/ParameterName;", "name", "forwardWriter", ReportItem.LogTypeBlock, "writeForward$wire_runtime", "(Lkotlin/jvm/functions/Function1;)V", "writeForward", "Lokio/ByteString;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "writeBytes", "", "writeString", "fieldNumber", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "writeTag", "writeSignedVarint32$wire_runtime", "(I)V", "writeSignedVarint32", "writeVarint32", "", "writeVarint64", "writeFixed32", "writeFixed64", "Lo0oooO0O/oo0OOoo;", "tail", "Lo0oooO0O/oo0OOoo;", "head", "Lo0oooO0O/oo0OOoo$OooO00o;", "cursor", "Lo0oooO0O/oo0OOoo$OooO00o;", "", "array", "[B", "arrayLimit", "I", "forwardBuffer$delegate", "Lkotlin/Lazy;", "getForwardBuffer", "()Lo0oooO0O/oo0OOoo;", "forwardBuffer", "forwardWriter$delegate", "getForwardWriter", "()Lcom/squareup/wire/ProtoWriter;", "getByteCount", "()I", "byteCount", "<init>", "()V", "Companion", "wire-runtime"}, k = 1, mv = {1, 6, 0})
public final class ReverseProtoWriter {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;

    /* JADX INFO: renamed from: forwardBuffer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy forwardBuffer;

    /* JADX INFO: renamed from: forwardWriter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy forwardWriter;

    @NotNull
    private oo0OOoo tail = new oo0OOoo();

    @NotNull
    private oo0OOoo head = new oo0OOoo();

    @NotNull
    private final oo0OOoo.OooO00o cursor = new oo0OOoo.OooO00o();

    @NotNull
    private byte[] array = EMPTY_ARRAY;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter$Companion;", "", "()V", "EMPTY_ARRAY", "", "wire-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReverseProtoWriter() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.forwardBuffer = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<oo0OOoo>() { // from class: com.squareup.wire.ReverseProtoWriter$forwardBuffer$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final oo0OOoo invoke() {
                return new oo0OOoo();
            }
        });
        this.forwardWriter = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ProtoWriter>() { // from class: com.squareup.wire.ReverseProtoWriter$forwardWriter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ProtoWriter invoke() {
                return new ProtoWriter(this.this$0.getForwardBuffer());
            }
        });
    }

    private final void emitCurrentSegment() throws IOException {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.o00Oo0(this.tail);
        oo0OOoo oo0oooo = this.tail;
        this.tail = this.head;
        this.head = oo0oooo;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oo0OOoo getForwardBuffer() {
        return (oo0OOoo) this.forwardBuffer.getValue();
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter.getValue();
    }

    private final void require(int minByteCount) throws IOException {
        if (this.arrayLimit >= minByteCount) {
            return;
        }
        emitCurrentSegment();
        this.head.Oooo0O0(this.cursor);
        oo0OOoo.OooO00o oooO00o = this.cursor;
        oooO00o.getClass();
        boolean z = false;
        if (!(minByteCount > 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("minByteCount <= 0: ", minByteCount).toString());
        }
        if (!(minByteCount <= 8192)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("minByteCount > Segment.SIZE: ", minByteCount).toString());
        }
        oo0OOoo oo0oooo = oooO00o.f59830OooO0Oo;
        if (oo0oooo == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!oooO00o.f59832OooO0o0) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long j = oo0oooo.f59828OooO0o0;
        oO0Oo oo0ooOooooo = oo0oooo.Oooooo(minByteCount);
        int i = 8192 - oo0ooOooooo.f59822OooO0OO;
        oo0ooOooooo.f59822OooO0OO = 8192;
        oo0oooo.f59828OooO0o0 = ((long) i) + j;
        oooO00o.f59831OooO0o = oo0ooOooooo;
        oooO00o.f59833OooO0oO = j;
        oooO00o.f59834OooO0oo = oo0ooOooooo.f59820OooO00o;
        oooO00o.f59829OooO = 8192 - i;
        oooO00o.f59835OooOO0 = 8192;
        oo0OOoo.OooO00o oooO00o2 = this.cursor;
        if (oooO00o2.f59833OooO0oO == 0) {
            int i2 = oooO00o2.f59835OooOO0;
            byte[] bArr = oooO00o2.f59834OooO0oo;
            Intrinsics.checkNotNull(bArr);
            if (i2 == bArr.length) {
                z = true;
            }
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
        byte[] bArr2 = this.cursor.f59834OooO0oo;
        Intrinsics.checkNotNull(bArr2);
        this.array = bArr2;
        this.arrayLimit = this.cursor.f59835OooOO0;
    }

    public final int getByteCount() {
        return (this.array.length - this.arrayLimit) + ((int) this.tail.f59828OooO0o0);
    }

    public final void writeBytes(@NotNull ByteString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iOooO0o0 = value.OooO0o0();
        while (iOooO0o0 != 0) {
            require(1);
            int iMin = Math.min(this.arrayLimit, iOooO0o0);
            int i = this.arrayLimit - iMin;
            this.arrayLimit = i;
            iOooO0o0 -= iMin;
            value.OooO0OO(iOooO0o0, this.array, i, iMin);
        }
    }

    public final void writeFixed32(int value) {
        require(4);
        int i = this.arrayLimit - 4;
        this.arrayLimit = i;
        byte[] bArr = this.array;
        int i2 = i + 1;
        bArr[i] = (byte) (value & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((value >>> 8) & 255);
        bArr[i3] = (byte) ((value >>> 16) & 255);
        bArr[i3 + 1] = (byte) ((value >>> 24) & 255);
    }

    public final void writeFixed64(long value) {
        require(8);
        int i = this.arrayLimit - 8;
        this.arrayLimit = i;
        byte[] bArr = this.array;
        int i2 = i + 1;
        bArr[i] = (byte) (value & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((value >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((value >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((value >>> 24) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((value >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((value >>> 40) & 255);
        bArr[i7] = (byte) ((value >>> 48) & 255);
        bArr[i7 + 1] = (byte) ((value >>> 56) & 255);
    }

    public final void writeForward$wire_runtime(@NotNull Function1<? super ProtoWriter, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(getForwardWriter());
        writeBytes(getForwardBuffer().Oooo0o0());
    }

    public final void writeSignedVarint32$wire_runtime(int value) {
        if (value >= 0) {
            writeVarint32(value);
        } else {
            writeVarint64(value);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    public final void writeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int length = value.length() - 1;
        while (length >= 0) {
            int i = length - 1;
            char cCharAt = value.charAt(length);
            if (cCharAt < 128) {
                require(1);
                int i2 = this.arrayLimit;
                byte[] bArr = this.array;
                int i3 = i2 - 1;
                bArr[i3] = (byte) cCharAt;
                int iMax = Math.max(-1, i - i3);
                while (i > iMax) {
                    char cCharAt2 = value.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    i--;
                    i3--;
                    bArr[i3] = (byte) cCharAt2;
                }
                this.arrayLimit = i3;
            } else if (cCharAt < 2048) {
                require(2);
                byte[] bArr2 = this.array;
                int i4 = this.arrayLimit - 1;
                bArr2[i4] = (byte) (128 | (cCharAt & '?'));
                int i5 = i4 - 1;
                this.arrayLimit = i5;
                bArr2[i5] = (byte) ((cCharAt >> 6) | 192);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                require(3);
                byte[] bArr3 = this.array;
                int i6 = this.arrayLimit - 1;
                bArr3[i6] = (byte) ((cCharAt & '?') | 128);
                int i7 = i6 - 1;
                bArr3[i7] = (byte) (128 | (63 & (cCharAt >> 6)));
                int i8 = i7 - 1;
                this.arrayLimit = i8;
                bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
            } else {
                char cCharAt3 = i >= 0 ? value.charAt(i) : CharCompanionObject.MAX_VALUE;
                if (cCharAt3 <= 56319) {
                    boolean z = false;
                    if (56320 <= cCharAt && cCharAt < 57344) {
                        z = true;
                    }
                    if (z) {
                        i--;
                        int i9 = ((cCharAt & 1023) | ((cCharAt3 & 1023) << 10)) + 65536;
                        require(4);
                        byte[] bArr4 = this.array;
                        int i10 = this.arrayLimit - 1;
                        bArr4[i10] = (byte) ((i9 & 63) | 128);
                        int i11 = i10 - 1;
                        bArr4[i11] = (byte) (((i9 >> 6) & 63) | 128);
                        int i12 = i11 - 1;
                        bArr4[i12] = (byte) (128 | (63 & (i9 >> 12)));
                        int i13 = i12 - 1;
                        this.arrayLimit = i13;
                        bArr4[i13] = (byte) ((i9 >> 18) | 240);
                    } else {
                        require(1);
                        byte[] bArr5 = this.array;
                        int i14 = this.arrayLimit - 1;
                        this.arrayLimit = i14;
                        bArr5[i14] = 63;
                    }
                } else {
                    require(1);
                    byte[] bArr6 = this.array;
                    int i15 = this.arrayLimit - 1;
                    this.arrayLimit = i15;
                    bArr6[i15] = 63;
                }
            }
            length = i;
        }
    }

    public final void writeTag(int fieldNumber, @NotNull FieldEncoding fieldEncoding) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        writeVarint32(ProtoWriter.INSTANCE.makeTag$wire_runtime(fieldNumber, fieldEncoding));
    }

    public final void writeTo(@NotNull o0O0o00O sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        emitCurrentSegment();
        sink.o00Oo0(this.tail);
    }

    public final void writeVarint32(int value) {
        int iVarint32Size$wire_runtime = ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
        require(iVarint32Size$wire_runtime);
        int i = this.arrayLimit - iVarint32Size$wire_runtime;
        this.arrayLimit = i;
        while ((value & (-128)) != 0) {
            this.array[i] = (byte) ((value & 127) | 128);
            value >>>= 7;
            i++;
        }
        this.array[i] = (byte) value;
    }

    public final void writeVarint64(long value) {
        int iVarint64Size$wire_runtime = ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
        require(iVarint64Size$wire_runtime);
        int i = this.arrayLimit - iVarint64Size$wire_runtime;
        this.arrayLimit = i;
        while (((-128) & value) != 0) {
            this.array[i] = (byte) ((127 & value) | 128);
            value >>>= 7;
            i++;
        }
        this.array[i] = (byte) value;
    }
}
