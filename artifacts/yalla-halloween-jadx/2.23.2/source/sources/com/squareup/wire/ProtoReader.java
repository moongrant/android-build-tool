package com.squareup.wire;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0007J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\tJ'\u0010\u001f\u001a\u00020\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0002J \u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u0001R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010+R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00067"}, d2 = {"Lcom/squareup/wire/ProtoReader;", "", "", "expectedEndTag", "", "skipGroup", "internalReadVarint32", "fieldEncoding", "afterPackableScalar", "", "beforeLengthDelimitedScalar", "beginMessage", "token", "Lokio/ByteString;", "endMessageAndGetUnknownFields", "endMessage", "nextTag", "Lcom/squareup/wire/FieldEncoding;", "peekFieldEncoding", "skip", "readBytes", "", "readString", "readVarint32", "readVarint64", "readFixed32", "readFixed64", "Lkotlin/Function1;", "tagHandler", "-forEachTag", "(Lkotlin/jvm/functions/Function1;)Lokio/ByteString;", "forEachTag", ViewHierarchyConstants.TAG_KEY, "readUnknownField", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addUnknownField", "Lo0oooO0O/o0O0o0;", "source", "Lo0oooO0O/o0O0o0;", "pos", "J", "limit", "recursionDepth", "I", "state", "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "", "Lo0oooO0O/oo0OOoo;", "bufferStack", "Ljava/util/List;", "<init>", "(Lo0oooO0O/o0O0o0;)V", "Companion", "wire-runtime"}, k = 1, mv = {1, 6, 0})
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

    @NotNull
    private final List<oo0OOoo> bufferStack;
    private long limit;

    @Nullable
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;

    @NotNull
    private final o0O0o0 source;
    private int state;
    private int tag;

    public ProtoReader(@NotNull o0O0o0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.limit = LongCompanionObject.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    private final void afterPackableScalar(int fieldEncoding) throws IOException {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j != j2) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException(Intrinsics.stringPlus("Expected LENGTH_DELIMITED but was ", Integer.valueOf(this.state)));
        }
        long j = this.limit - this.pos;
        this.source.OoooOoO(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    private final int internalReadVarint32() throws IOException {
        int i;
        this.source.OoooOoO(1L);
        this.pos++;
        byte b = this.source.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & ByteCompanionObject.MAX_VALUE;
        this.source.OoooOoO(1L);
        this.pos++;
        byte b2 = this.source.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & ByteCompanionObject.MAX_VALUE) << 7;
            this.source.OoooOoO(1L);
            this.pos++;
            byte b3 = this.source.readByte();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & ByteCompanionObject.MAX_VALUE) << 14;
                this.source.OoooOoO(1L);
                this.pos++;
                byte b4 = this.source.readByte();
                if (b4 < 0) {
                    int i3 = i2 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
                    this.source.OoooOoO(1L);
                    this.pos++;
                    byte b5 = this.source.readByte();
                    int i4 = i3 | (b5 << 28);
                    if (b5 >= 0) {
                        return i4;
                    }
                    int i5 = 0;
                    while (i5 < 5) {
                        i5++;
                        this.source.OoooOoO(1L);
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

    private final void skipGroup(int expectedEndTag) throws IOException {
        while (this.pos < this.limit && !this.source.o00oO0O()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i = iInternalReadVarint32 >> 3;
            int i2 = iInternalReadVarint32 & 7;
            if (i2 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i2 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i2 == 2) {
                long jInternalReadVarint32 = internalReadVarint32();
                this.pos += jInternalReadVarint32;
                this.source.skip(jInternalReadVarint32);
            } else if (i2 == 3) {
                skipGroup(i);
            } else if (i2 == 4) {
                if (i != expectedEndTag) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i2 != 5) {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected field encoding: ", Integer.valueOf(i2)));
                }
                this.state = 5;
                readFixed32();
            }
        }
        throw new EOFException();
    }

    @JvmName(name = "-forEachTag")
    @NotNull
    /* JADX INFO: renamed from: -forEachTag, reason: not valid java name */
    public final ByteString m4191forEachTag(@NotNull Function1<? super Integer, ? extends Object> tagHandler) throws IOException {
        Intrinsics.checkNotNullParameter(tagHandler, "tagHandler");
        long jBeginMessage = beginMessage();
        while (true) {
            int iNextTag = nextTag();
            if (iNextTag == -1) {
                return endMessageAndGetUnknownFields(jBeginMessage);
            }
            tagHandler.invoke(Integer.valueOf(iNextTag));
        }
    }

    public final void addUnknownField(int tag, @NotNull FieldEncoding fieldEncoding, @Nullable Object value) throws IOException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        fieldEncoding.rawProtoAdapter().encodeWithTag(new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1)), tag, value);
    }

    public final long beginMessage() throws IOException {
        if (!(this.state == 2)) {
            throw new IllegalStateException("Unexpected call to beginMessage()".toString());
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new oo0OOoo());
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "prefer endMessageAndGetUnknownFields()", replaceWith = @ReplaceWith(expression = "endMessageAndGetUnknownFields(token)", imports = {}))
    public final void endMessage(long token) throws IOException {
        endMessageAndGetUnknownFields(token);
    }

    @NotNull
    public final ByteString endMessageAndGetUnknownFields(long token) throws IOException {
        if (!(this.state == 6)) {
            throw new IllegalStateException("Unexpected call to endMessage()".toString());
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (!(i >= 0 && this.pushedLimit == -1)) {
            throw new IllegalStateException("No corresponding call to beginMessage()".toString());
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = token;
            oo0OOoo oo0oooo = this.bufferStack.get(i);
            return oo0oooo.f59828OooO0o0 > 0 ? oo0oooo.Oooo0o0() : ByteString.f60193OooO0oO;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public final int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.o00oO0O()) {
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
                    throw new ProtocolException(Intrinsics.stringPlus("Negative length: ", Integer.valueOf(iInternalReadVarint33)));
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
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected field encoding: ", Integer.valueOf(i3)));
                }
                this.nextFieldEncoding = FieldEncoding.FIXED32;
                this.state = 5;
                return i2;
            }
            skipGroup(i2);
        }
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: peekFieldEncoding, reason: from getter */
    public final FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @NotNull
    public final ByteString readBytes() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.OoooOoO(jBeforeLengthDelimitedScalar);
        return this.source.Oooooo0(jBeforeLengthDelimitedScalar);
    }

    public final int readFixed32() throws IOException {
        int i = this.state;
        if (i != 5 && i != 2) {
            throw new ProtocolException(Intrinsics.stringPlus("Expected FIXED32 or LENGTH_DELIMITED but was ", Integer.valueOf(this.state)));
        }
        this.source.OoooOoO(4L);
        this.pos += (long) 4;
        int iO0000Ooo = this.source.o0000Ooo();
        afterPackableScalar(5);
        return iO0000Ooo;
    }

    public final long readFixed64() throws IOException {
        int i = this.state;
        if (i != 1 && i != 2) {
            throw new ProtocolException(Intrinsics.stringPlus("Expected FIXED64 or LENGTH_DELIMITED but was ", Integer.valueOf(this.state)));
        }
        this.source.OoooOoO(8L);
        this.pos += (long) 8;
        long jO000oOoO = this.source.o000oOoO();
        afterPackableScalar(1);
        return jO000oOoO;
    }

    @NotNull
    public final String readString() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.OoooOoO(jBeforeLengthDelimitedScalar);
        return this.source.OooooOO(jBeforeLengthDelimitedScalar);
    }

    public final void readUnknownField(int tag) throws IOException {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        Intrinsics.checkNotNull(nextFieldEncoding);
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    public final int readVarint32() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException(Intrinsics.stringPlus("Expected VARINT or LENGTH_DELIMITED but was ", Integer.valueOf(this.state)));
        }
        int iInternalReadVarint32 = internalReadVarint32();
        afterPackableScalar(0);
        return iInternalReadVarint32;
    }

    public final long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException(Intrinsics.stringPlus("Expected VARINT or LENGTH_DELIMITED but was ", Integer.valueOf(this.state)));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.source.OoooOoO(1L);
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

    public final void skip() throws IOException {
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
