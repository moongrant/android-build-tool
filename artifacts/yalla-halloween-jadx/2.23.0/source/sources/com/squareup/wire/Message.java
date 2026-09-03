package com.squareup.wire;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000 '*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002('B\u001f\b\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0004J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001d8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001f¨\u0006)"}, d2 = {"Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/io/Serializable;", "newBuilder", "()Lcom/squareup/wire/Message$Builder;", "withoutUnknownFields", "()Lcom/squareup/wire/Message;", "", "toString", "", "writeReplace", "Lo0oooO00/o0000Ooo;", "sink", "", "encode", "", "Lokio/ByteString;", "encodeByteString", "Ljava/io/OutputStream;", "stream", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "unknownFields", "Lokio/ByteString;", "()Lokio/ByteString;", "", "cachedSerializedSize", "I", "getCachedSerializedSize$wire_runtime", "()I", "setCachedSerializedSize$wire_runtime", "(I)V", "hashCode", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)V", "Companion", "Builder", "wire-runtime"}, k = 1, mv = {1, 6, 0})
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;

    @NotNull
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;

    @JvmField
    protected transient int hashCode;

    @NotNull
    private final transient ByteString unknownFields;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0004B\t\b\u0004¢\u0006\u0004\b(\u0010)J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\b\u001a\u00020\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000J\u0006\u0010\u0011\u001a\u00020\u0007J\u000f\u0010\u0012\u001a\u00028\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/Message;", "M", "B", "", "", "prepareForNewUnknownFields", "Lokio/ByteString;", "unknownFields", "addUnknownFields", "", ViewHierarchyConstants.TAG_KEY, "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addUnknownField", "clearUnknownFields", "buildUnknownFields", "build", "()Lcom/squareup/wire/Message;", "unknownFieldsByteString", "Lokio/ByteString;", "getUnknownFieldsByteString$wire_runtime", "()Lokio/ByteString;", "setUnknownFieldsByteString$wire_runtime", "(Lokio/ByteString;)V", "Lo0oooO00/o00000O;", "unknownFieldsBuffer", "Lo0oooO00/o00000O;", "getUnknownFieldsBuffer$wire_runtime", "()Lo0oooO00/o00000O;", "setUnknownFieldsBuffer$wire_runtime", "(Lo0oooO00/o00000O;)V", "Lcom/squareup/wire/ProtoWriter;", "unknownFieldsWriter", "Lcom/squareup/wire/ProtoWriter;", "getUnknownFieldsWriter$wire_runtime", "()Lcom/squareup/wire/ProtoWriter;", "setUnknownFieldsWriter$wire_runtime", "(Lcom/squareup/wire/ProtoWriter;)V", "<init>", "()V", "wire-runtime"}, k = 1, mv = {1, 6, 0})
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {

        @Nullable
        private transient o00000O unknownFieldsBuffer;

        @NotNull
        private transient ByteString unknownFieldsByteString = ByteString.f60866OooO0oO;

        @Nullable
        private transient ProtoWriter unknownFieldsWriter;

        private final void prepareForNewUnknownFields() throws IOException {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new o00000O();
                o00000O o00000o = this.unknownFieldsBuffer;
                Intrinsics.checkNotNull(o00000o);
                ProtoWriter protoWriter = new ProtoWriter(o00000o);
                this.unknownFieldsWriter = protoWriter;
                Intrinsics.checkNotNull(protoWriter);
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.f60866OooO0oO;
            }
        }

        @NotNull
        public final Builder<M, B> addUnknownField(int tag, @NotNull FieldEncoding fieldEncoding, @Nullable Object value) throws IOException {
            Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
            prepareForNewUnknownFields();
            ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
            ProtoWriter unknownFieldsWriter = getUnknownFieldsWriter();
            Intrinsics.checkNotNull(unknownFieldsWriter);
            protoAdapterRawProtoAdapter.encodeWithTag(unknownFieldsWriter, tag, value);
            return this;
        }

        @NotNull
        public final Builder<M, B> addUnknownFields(@NotNull ByteString unknownFields) throws IOException {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            if (unknownFields.OooO0o0() > 0) {
                prepareForNewUnknownFields();
                ProtoWriter unknownFieldsWriter = getUnknownFieldsWriter();
                Intrinsics.checkNotNull(unknownFieldsWriter);
                unknownFieldsWriter.writeBytes(unknownFields);
            }
            return this;
        }

        @NotNull
        public abstract M build();

        @NotNull
        public final ByteString buildUnknownFields() {
            o00000O o00000o = this.unknownFieldsBuffer;
            if (o00000o != null) {
                Intrinsics.checkNotNull(o00000o);
                this.unknownFieldsByteString = o00000o.Oooo0o0();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        @NotNull
        public final Builder<M, B> clearUnknownFields() throws EOFException {
            setUnknownFieldsByteString$wire_runtime(ByteString.f60866OooO0oO);
            if (getUnknownFieldsBuffer() != null) {
                o00000O unknownFieldsBuffer = getUnknownFieldsBuffer();
                Intrinsics.checkNotNull(unknownFieldsBuffer);
                unknownFieldsBuffer.OooO0oO();
                setUnknownFieldsBuffer$wire_runtime(null);
            }
            setUnknownFieldsWriter$wire_runtime(null);
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: getUnknownFieldsBuffer$wire_runtime, reason: from getter */
        public final o00000O getUnknownFieldsBuffer() {
            return this.unknownFieldsBuffer;
        }

        @NotNull
        /* JADX INFO: renamed from: getUnknownFieldsByteString$wire_runtime, reason: from getter */
        public final ByteString getUnknownFieldsByteString() {
            return this.unknownFieldsByteString;
        }

        @Nullable
        /* JADX INFO: renamed from: getUnknownFieldsWriter$wire_runtime, reason: from getter */
        public final ProtoWriter getUnknownFieldsWriter() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(@Nullable o00000O o00000o) {
            this.unknownFieldsBuffer = o00000o;
        }

        public final void setUnknownFieldsByteString$wire_runtime(@NotNull ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "<set-?>");
            this.unknownFieldsByteString = byteString;
        }

        public final void setUnknownFieldsWriter$wire_runtime(@Nullable ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    public Message(@NotNull ProtoAdapter<M> adapter, @NotNull ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    @JvmName(name = "adapter")
    @NotNull
    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(@NotNull o0000Ooo sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.adapter.encode(sink, this);
    }

    @NotNull
    public final ByteString encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    /* JADX INFO: renamed from: getCachedSerializedSize$wire_runtime, reason: from getter */
    public final int getCachedSerializedSize() {
        return this.cachedSerializedSize;
    }

    @NotNull
    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    @NotNull
    public String toString() {
        return this.adapter.toString(this);
    }

    @JvmName(name = "unknownFields")
    @NotNull
    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.f60866OooO0oO : byteString;
    }

    @NotNull
    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    @NotNull
    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    @NotNull
    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(@NotNull OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.adapter.encode(stream, this);
    }
}
