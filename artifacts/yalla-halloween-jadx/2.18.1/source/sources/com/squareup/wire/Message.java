package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;
import okio.ByteString;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    public transient int cachedSerializedSize = 0;
    public transient int hashCode = 0;
    private final transient ByteString unknownFields;

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        public transient o0oOO unknownFieldsBuffer;
        public transient ByteString unknownFieldsByteString = ByteString.f53046Oooo;
        public transient ProtoWriter unknownFieldsWriter;

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                o0oOO o0ooo2 = new o0oOO();
                this.unknownFieldsBuffer = o0ooo2;
                ProtoWriter protoWriter = new ProtoWriter(o0ooo2);
                this.unknownFieldsWriter = protoWriter;
                try {
                    protoWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = ByteString.f53046Oooo;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final Builder<M, B> addUnknownFields(ByteString byteString) {
            if (byteString.OooO0o0() > 0) {
                prepareForNewUnknownFields();
                try {
                    this.unknownFieldsWriter.writeBytes(byteString);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
            o0oOO o0ooo2 = this.unknownFieldsBuffer;
            if (o0ooo2 != null) {
                this.unknownFieldsByteString = o0ooo2.OooOoo();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() throws EOFException {
            this.unknownFieldsByteString = ByteString.f53046Oooo;
            o0oOO o0ooo2 = this.unknownFieldsBuffer;
            if (o0ooo2 != null) {
                o0ooo2.OooO0Oo();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        Objects.requireNonNull(protoAdapter, "adapter == null");
        Objects.requireNonNull(byteString, "unknownFields == null");
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(oo00oO oo00oo) throws IOException {
        this.adapter.encode(oo00oo, this);
    }

    public abstract Builder<M, B> newBuilder();

    public String toString() {
        return this.adapter.toString(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString != null ? byteString : ByteString.f53046Oooo;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.encode(outputStream, this);
    }
}
