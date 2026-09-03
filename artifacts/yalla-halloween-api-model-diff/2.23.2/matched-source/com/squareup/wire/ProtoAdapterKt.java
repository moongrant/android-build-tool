package com.squareup.wire;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oO0000O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\u001a2\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000f\u001a0\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0012\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0015\u001a(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001c\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0080\b¢\u0006\u0004\b\u001a\u0010\u001f\u001a\u001e\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b!\u0010\"\u001a%\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010$\u001a\u00020#H\u0080\b\u001a%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001aC\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0\u0001\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0080\b\u001a\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0001H\u0000\u001a\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u000e\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0001H\u0000\u001a\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002060\u0001H\u0000\u001a\u000e\u00109\u001a\b\u0012\u0004\u0012\u0002060\u0001H\u0000\u001a\u000e\u0010:\u001a\b\u0012\u0004\u0012\u0002060\u0001H\u0000\u001a\u000e\u0010;\u001a\b\u0012\u0004\u0012\u0002060\u0001H\u0000\u001a\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0001H\u0000\u001a\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0001H\u0000\u001a\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020 0\u0001H\u0000\u001a\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0000\u001a\u0012\u0010D\u001a\f\u0012\b\u0012\u00060Bj\u0002`C0\u0001H\u0000\u001a\u0012\u0010G\u001a\f\u0012\b\u0012\u00060Ej\u0002`F0\u0001H\u0000\u001a\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\t0\u0001H\u0000\u001a\u001a\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0002\b\u0003\u0018\u00010-0\u0001H\u0000\u001a\u0014\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010&0\u0001H\u0000\u001a\u0010\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\u0001H\u0000\u001a\u0010\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0\u0001H\u0000\u001a0\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010O*\u00020M2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010Q\u001a\u00020 H\u0000\"\u0014\u0010S\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010T\"\u0014\u0010U\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010T\"\u0014\u0010V\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010T¨\u0006W"}, d2 = {"E", "Lcom/squareup/wire/ProtoAdapter;", "", ViewHierarchyConstants.TAG_KEY, AppMeasurementSdk.ConditionalUserProperty.VALUE, "commonEncodedSizeWithTag", "(Lcom/squareup/wire/ProtoAdapter;ILjava/lang/Object;)I", "Lcom/squareup/wire/ReverseProtoWriter;", "writer", "", "delegateEncode", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ProtoWriter;", "commonEncodeWithTag", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "Lo0oooO0O/o0O0o00O;", "sink", "commonEncode", "(Lcom/squareup/wire/ProtoAdapter;Lo0oooO0O/o0O0o00O;Ljava/lang/Object;)V", "", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)[B", "Lokio/ByteString;", "commonEncodeByteString", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)Lokio/ByteString;", "bytes", "commonDecode", "(Lcom/squareup/wire/ProtoAdapter;[B)Ljava/lang/Object;", "(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)Ljava/lang/Object;", "Lo0oooO0O/o0O0o0;", "source", "(Lcom/squareup/wire/ProtoAdapter;Lo0oooO0O/o0O0o0;)Ljava/lang/Object;", "", "commonToString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/WireField$Label;", "label", "commonWithLabel", "", "commonCreatePacked", "commonCreateRepeated", "K", "V", "keyAdapter", "valueAdapter", "", "commonNewMapAdapter", "", "commonBool", "commonInt32", "commonUint32", "commonSint32", "commonFixed32", "commonSfixed32", "", "commonInt64", "commonUint64", "commonSint64", "commonFixed64", "commonSfixed64", "", "commonFloat", "", "commonDouble", "commonString", "commonBytes", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "commonDuration", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "commonInstant", "commonEmpty", "commonStructMap", "commonStructList", "", "commonStructNull", "", "commonStructValue", "T", "delegate", "typeUrl", "commonWrapper", "FIXED_BOOL_SIZE", "I", "FIXED_32_SIZE", "FIXED_64_SIZE", "wire-runtime"}, k = 2, mv = {1, 6, 0})
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;

    /* JADX INFO: renamed from: com.squareup.wire.ProtoAdapterKt$delegateEncode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "forwardWriter", "Lcom/squareup/wire/ProtoWriter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class C09051 extends Lambda implements Function1<ProtoWriter, Unit> {
        final /* synthetic */ ProtoAdapter<E> $this_delegateEncode;
        final /* synthetic */ E $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09051(ProtoAdapter<E> protoAdapter, E e) {
            super(1);
            this.$this_delegateEncode = protoAdapter;
            this.$value = e;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProtoWriter protoWriter) throws IOException {
            invoke2(protoWriter);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ProtoWriter forwardWriter) throws IOException {
            Intrinsics.checkNotNullParameter(forwardWriter, "forwardWriter");
            this.$this_delegateEncode.encode(forwardWriter, this.$value);
        }
    }

    @NotNull
    public static final ProtoAdapter<Boolean> commonBool() {
        return new ProtoAdapter<Boolean>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Boolean.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonBool.1
            {
                Boolean bool = Boolean.FALSE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Boolean bool) throws IOException {
                encode(protoWriter, bool.booleanValue());
            }

            public int encodedSize(boolean value) {
                return 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
                return redact(bool.booleanValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Boolean decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Boolean bool) throws IOException {
                encode(reverseProtoWriter, bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
                return encodedSize(bool.booleanValue());
            }

            @NotNull
            public Boolean redact(boolean value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, boolean value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value ? 1 : 0);
            }

            public void encode(@NotNull ReverseProtoWriter writer, boolean value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value ? 1 : 0);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<ByteString> commonBytes() {
        return new ProtoAdapter<ByteString>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(ByteString.class), Syntax.PROTO_2, ByteString.f60193OooO0oO) { // from class: com.squareup.wire.ProtoAdapterKt.commonBytes.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@NotNull ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.OooO0o0();
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public ByteString decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public ByteString redact(@NotNull ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @NotNull ByteString value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @NotNull ByteString value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value);
            }
        };
    }

    @NotNull
    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(@NotNull ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        if (protoAdapter.getFieldEncoding() != FieldEncoding.LENGTH_DELIMITED) {
            return new PackedProtoAdapter(protoAdapter);
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
    }

    @NotNull
    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(@NotNull ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0oooo.o00Ooo(bytes);
        return protoAdapter.decode(oo0oooo);
    }

    @NotNull
    public static final ProtoAdapter<Double> commonDouble() {
        return new ProtoAdapter<Double>(FieldEncoding.FIXED64, Reflection.getOrCreateKotlinClass(Double.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonDouble.1
            {
                Double dValueOf = Double.valueOf(0.0d);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Double d) throws IOException {
                encode(protoWriter, d.doubleValue());
            }

            public int encodedSize(double value) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Double redact(Double d) {
                return redact(d.doubleValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Double decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
                return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Double d) throws IOException {
                encode(reverseProtoWriter, d.doubleValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Double d) {
                return encodedSize(d.doubleValue());
            }

            @NotNull
            public Double redact(double value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, double value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(Double.doubleToLongBits(value));
            }

            public void encode(@NotNull ReverseProtoWriter writer, double value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(Double.doubleToLongBits(value));
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Duration> commonDuration() {
        return new ProtoAdapter<Duration>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(OooOOO0.OooO00o()), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonDuration.1
            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Duration duration) throws IOException {
                encode2(protoWriter, OooOOO.OooO0O0(duration));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Duration duration) {
                return encodedSize2(OooOOO.OooO0O0(duration));
            }

            @NotNull
            /* JADX INFO: renamed from: redact, reason: avoid collision after fix types in other method */
            public Duration redact2(@NotNull Duration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Duration decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(seconds, nano)");
                        return durationOfSeconds;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Duration duration) throws IOException {
                encode2(reverseProtoWriter, OooOOO.OooO0O0(duration));
            }

            /* JADX INFO: renamed from: encodedSize, reason: avoid collision after fix types in other method */
            public int encodedSize2(@NotNull Duration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                int iEncodedSizeWithTag = sameSignSeconds != 0 ? 0 + ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(value);
                return sameSignNanos != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Duration redact(Duration duration) {
                return redact2(OooOOO.OooO0O0(duration));
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(@NotNull ProtoWriter writer, @NotNull Duration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(sameSignNanos));
                }
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(@NotNull ReverseProtoWriter writer, @NotNull Duration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(sameSignSeconds));
                }
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Unit> commonEmpty() {
        return new ProtoAdapter<Unit>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Unit.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonEmpty.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader protoReader) throws IOException {
                decode2(protoReader);
                return Unit.INSTANCE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @NotNull Unit value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@NotNull Unit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return 0;
            }

            /* JADX INFO: renamed from: redact, reason: avoid collision after fix types in other method */
            public void redact2(@NotNull Unit value) {
                Intrinsics.checkNotNullParameter(value, "value");
            }

            /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return;
                    }
                    reader.readUnknownField(iNextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @NotNull Unit value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit redact(Unit unit) {
                redact2(unit);
                return Unit.INSTANCE;
            }
        };
    }

    public static final <E> void commonEncode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull o0O0o00O sink, E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, e);
        reverseProtoWriter.writeTo(sink);
    }

    @NotNull
    public static final <E> ByteString commonEncodeByteString(@NotNull ProtoAdapter<E> protoAdapter, E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        oo0OOoo oo0oooo = new oo0OOoo();
        protoAdapter.encode(oo0oooo, e);
        return oo0oooo.Oooo0o0();
    }

    public static final <E> void commonEncodeWithTag(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ProtoWriter writer, int i, @Nullable E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e == null) {
            return;
        }
        writer.writeTag(i, protoAdapter.getFieldEncoding());
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            writer.writeVarint32(protoAdapter.encodedSize(e));
        }
        protoAdapter.encode(writer, e);
    }

    public static final <E> int commonEncodedSizeWithTag(@NotNull ProtoAdapter<E> protoAdapter, int i, @Nullable E e) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        if (e == null) {
            return 0;
        }
        int iEncodedSize = protoAdapter.encodedSize(e);
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(iEncodedSize);
        }
        return ProtoWriter.INSTANCE.tagSize$wire_runtime(i) + iEncodedSize;
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonFixed32() {
        return new ProtoAdapter<Integer>(FieldEncoding.FIXED32, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            public int encodedSize(int value) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Integer decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @NotNull
            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(value);
            }

            public void encode(@NotNull ReverseProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(value);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonFixed64() {
        return new ProtoAdapter<Long>(FieldEncoding.FIXED64, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) throws IOException {
                encode(protoWriter, l.longValue());
            }

            public int encodedSize(long value) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Long decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) throws IOException {
                encode(reverseProtoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @NotNull
            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(value);
            }

            public void encode(@NotNull ReverseProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(value);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Float> commonFloat() {
        return new ProtoAdapter<Float>(FieldEncoding.FIXED32, Reflection.getOrCreateKotlinClass(Float.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFloat.1
            {
                Float fValueOf = Float.valueOf(0.0f);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Float f) throws IOException {
                encode(protoWriter, f.floatValue());
            }

            public int encodedSize(float value) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Float redact(Float f) {
                return redact(f.floatValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Float decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Float f) throws IOException {
                encode(reverseProtoWriter, f.floatValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Float f) {
                return encodedSize(f.floatValue());
            }

            @NotNull
            public Float redact(float value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, float value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(Float.floatToIntBits(value));
            }

            public void encode(@NotNull ReverseProtoWriter writer, float value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(Float.floatToIntBits(value));
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Instant> commonInstant() {
        return new ProtoAdapter<Instant>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(OooOO0O.OooO00o()), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonInstant.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Instant instant) throws IOException {
                encode2(protoWriter, Oooo0.OooO0O0(instant));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Instant instant) {
                return encodedSize2(Oooo0.OooO0O0(instant));
            }

            @NotNull
            /* JADX INFO: renamed from: redact, reason: avoid collision after fix types in other method */
            public Instant redact2(@NotNull Instant value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Instant decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(epochSecond, nano)");
                        return instantOfEpochSecond;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Instant instant) throws IOException {
                encode2(reverseProtoWriter, Oooo0.OooO0O0(instant));
            }

            /* JADX INFO: renamed from: encodedSize, reason: avoid collision after fix types in other method */
            public int encodedSize2(@NotNull Instant value) {
                Intrinsics.checkNotNullParameter(value, "value");
                long epochSecond = value.getEpochSecond();
                int iEncodedSizeWithTag = epochSecond != 0 ? 0 + ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = value.getNano();
                return nano != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Instant redact(Instant instant) {
                return redact2(Oooo0.OooO0O0(instant));
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(@NotNull ProtoWriter writer, @NotNull Instant value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
                }
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
                }
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(@NotNull ReverseProtoWriter writer, @NotNull Instant value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
                }
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
                }
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonInt32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Integer decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.int32Size$wire_runtime(value);
            }

            @NotNull
            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(value);
            }

            public void encode(@NotNull ReverseProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(value);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonInt64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) throws IOException {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Long decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) throws IOException {
                encode(reverseProtoWriter, l.longValue());
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            @NotNull
            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }

            public void encode(@NotNull ReverseProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }
        };
    }

    @NotNull
    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(@NotNull ProtoAdapter<K> keyAdapter, @NotNull ProtoAdapter<V> valueAdapter) {
        Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
        Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
        return new MapProtoAdapter(keyAdapter, valueAdapter);
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    @NotNull
    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonSint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Integer decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int value) {
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(companion.encodeZigZag32$wire_runtime(value));
            }

            @NotNull
            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            public void encode(@NotNull ReverseProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonSint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) throws IOException {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Long decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) throws IOException {
                encode(reverseProtoWriter, l.longValue());
            }

            public int encodedSize(long value) {
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint64Size$wire_runtime(companion.encodeZigZag64$wire_runtime(value));
            }

            @NotNull
            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            public void encode(@NotNull ReverseProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<String> commonString() {
        return new ProtoAdapter<String>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(String.class), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonString.1
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public String decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return (int) oO0000O.OooO00o(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public String redact(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @NotNull String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @NotNull String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeString(value);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<List<?>> commonStructList() {
        return new ProtoAdapter<List<?>>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructList.1
            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public List<?> decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return arrayList;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@Nullable List<?> value) {
                int iEncodedSizeWithTag = 0;
                if (value == null) {
                    return 0;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    iEncodedSizeWithTag += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public List<Object> redact(@Nullable List<?> value) {
                if (value == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(value));
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @Nullable List<?> value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    return;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, it.next());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @Nullable List<?> value) throws IOException {
                int size;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null || (size = value.size() - 1) < 0) {
                    return;
                }
                while (true) {
                    int i = size - 1;
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, value.get(size));
                    if (i < 0) {
                        return;
                    } else {
                        size = i;
                    }
                }
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        return new ProtoAdapter<Map<String, ?>>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructMap.1
            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public Map<String, ?> decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return linkedHashMap;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        long jBeginMessage2 = reader.beginMessage();
                        String strDecode = null;
                        Object objDecode = null;
                        while (true) {
                            int iNextTag2 = reader.nextTag();
                            if (iNextTag2 == -1) {
                                break;
                            }
                            if (iNextTag2 == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag2 != 2) {
                                reader.readUnknownField(iNextTag2);
                            } else {
                                objDecode = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(jBeginMessage2);
                        if (strDecode != null) {
                            linkedHashMap.put(strDecode, objDecode);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@Nullable Map<String, ?> value) {
                int iVarint32Size$wire_runtime = 0;
                if (value == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    int iEncodedSizeWithTag = ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value2) + ProtoAdapter.STRING.encodedSizeWithTag(1, key);
                    ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                    iVarint32Size$wire_runtime += companion.varint32Size$wire_runtime(iEncodedSizeWithTag) + companion.tagSize$wire_runtime(1) + iEncodedSizeWithTag;
                }
                return iVarint32Size$wire_runtime;
            }

            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public Map<String, Object> redact(@Nullable Map<String, ?> value) {
                if (value == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(value.size()));
                Iterator<T> it = value.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @Nullable Map<String, ?> value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                    ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                    int iEncodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value2) + iEncodedSizeWithTag;
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    writer.writeVarint32(iEncodedSizeWithTag2);
                    protoAdapter.encodeWithTag(writer, 1, key);
                    protoAdapter2.encodeWithTag(writer, 2, value2);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @Nullable Map<String, ?> value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    return;
                }
                int i = 0;
                Object[] array = value.entrySet().toArray(new Map.Entry[0]);
                if (array != null) {
                    Map.Entry[] entryArr = (Map.Entry[]) array;
                    ArraysKt.reverse(entryArr);
                    int length = entryArr.length;
                    while (i < length) {
                        Map.Entry entry = entryArr[i];
                        i++;
                        String str = (String) entry.getKey();
                        Object value2 = entry.getValue();
                        int byteCount = writer.getByteCount();
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, value2);
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, str);
                        writer.writeVarint32(writer.getByteCount() - byteCount);
                        writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        };
    }

    @NotNull
    public static final ProtoAdapter commonStructNull() {
        return new ProtoAdapter(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Void.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructNull.1
            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public Void redact(@Nullable Void value) {
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public Void decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int varint32 = reader.readVarint32();
                if (varint32 == 0) {
                    return null;
                }
                throw new IOException(Intrinsics.stringPlus("expected 0 but was ", Integer.valueOf(varint32)));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@Nullable Void value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, @Nullable Void value) {
                int iEncodedSize = encodedSize(value);
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(iEncodedSize) + companion.tagSize$wire_runtime(tag);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @Nullable Void value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable Void value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeTag(tag, getFieldEncoding());
                encode(writer, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @Nullable Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(@NotNull ReverseProtoWriter writer, int tag, @Nullable Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                encode(writer, value);
                writer.writeTag(tag, getFieldEncoding());
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Object> commonStructValue() {
        return new ProtoAdapter<Object>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Object.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructValue.1
            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public Object decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Object objDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                objDecode = ProtoAdapter.STRUCT_NULL.decode(reader);
                                break;
                            case 2:
                                objDecode = ProtoAdapter.DOUBLE.decode(reader);
                                break;
                            case 3:
                                objDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                objDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                objDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 6:
                                objDecode = ProtoAdapter.STRUCT_LIST.decode(reader);
                                break;
                            default:
                                reader.skip();
                                break;
                        }
                    } else {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return objDecode;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @Nullable Object value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, value);
                } else if (value instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (Map<String, ?>) value);
                } else {
                    if (!(value instanceof List)) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected struct value: ", value));
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, value);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable Object value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value != null) {
                    super.encodeWithTag(writer, tag, value);
                    return;
                }
                writer.writeTag(tag, getFieldEncoding());
                writer.writeVarint32(encodedSize(value));
                encode(writer, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@Nullable Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, value);
                }
                if (value instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) value).doubleValue()));
                }
                if (value instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, value);
                }
                if (value instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, value);
                }
                if (value instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) value);
                }
                if (value instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, value);
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected struct value: ", value));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, @Nullable Object value) {
                if (value != null) {
                    return super.encodedSizeWithTag(tag, value);
                }
                int iEncodedSize = encodedSize(value);
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(iEncodedSize) + companion.tagSize$wire_runtime(tag) + iEncodedSize;
            }

            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public Object redact(@Nullable Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(value);
                }
                if (value instanceof Number) {
                    return value;
                }
                if (value instanceof String) {
                    return null;
                }
                if (value instanceof Boolean) {
                    return value;
                }
                if (value instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.redact((Map) value);
                }
                if (value instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.redact(value);
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected struct value: ", value));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(@NotNull ReverseProtoWriter writer, int tag, @Nullable Object value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    int byteCount = writer.getByteCount();
                    encode(writer, value);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(tag, getFieldEncoding());
                    return;
                }
                super.encodeWithTag(writer, tag, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @Nullable Object value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, value);
                } else if (value instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (Map<String, ?>) value);
                } else {
                    if (!(value instanceof List)) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected struct value: ", value));
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, value);
                }
            }
        };
    }

    @NotNull
    public static final <E> String commonToString(E e) {
        return String.valueOf(e);
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonUint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Integer decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
            }

            @NotNull
            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value);
            }

            public void encode(@NotNull ReverseProtoWriter writer, int value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(value);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonUint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) throws IOException {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Long decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) throws IOException {
                encode(reverseProtoWriter, l.longValue());
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            @NotNull
            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(@NotNull ProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }

            public void encode(@NotNull ReverseProtoWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(value);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> ProtoAdapter<?> commonWithLabel(@NotNull ProtoAdapter<E> protoAdapter, @NotNull WireField.Label label) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        if (label.isRepeated()) {
            return label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated();
        }
        return protoAdapter;
    }

    @NotNull
    public static final <T> ProtoAdapter<T> commonWrapper(@NotNull ProtoAdapter<T> delegate, @NotNull String typeUrl) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
        return new ProtoAdapter<T>(typeUrl, delegate, FieldEncoding.LENGTH_DELIMITED, delegate.getType(), Syntax.PROTO_3, delegate.getIdentity()) { // from class: com.squareup.wire.ProtoAdapterKt.commonWrapper.1
            final /* synthetic */ ProtoAdapter<T> $delegate;
            final /* synthetic */ String $typeUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fieldEncoding, kClass, typeUrl, syntax, t);
                this.$typeUrl = typeUrl;
                this.$delegate = delegate;
            }

            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public T decode(@NotNull ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                T identity = this.$delegate.getIdentity();
                ProtoAdapter<T> protoAdapter = this.$delegate;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return identity;
                    }
                    if (iNextTag == 1) {
                        identity = protoAdapter.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ProtoWriter writer, @Nullable T value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null || Intrinsics.areEqual(value, this.$delegate.getIdentity())) {
                    return;
                }
                this.$delegate.encodeWithTag(writer, 1, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(@Nullable T value) {
                if (value == null || Intrinsics.areEqual(value, this.$delegate.getIdentity())) {
                    return 0;
                }
                return this.$delegate.encodedSizeWithTag(1, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            @Nullable
            public T redact(@Nullable T value) {
                if (value == null) {
                    return null;
                }
                return this.$delegate.redact(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(@NotNull ReverseProtoWriter writer, @Nullable T value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null || Intrinsics.areEqual(value, this.$delegate.getIdentity())) {
                    return;
                }
                this.$delegate.encodeWithTag(writer, 1, value);
            }
        };
    }

    public static final <E> void delegateEncode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ReverseProtoWriter writer, E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeForward$wire_runtime(new C09051(protoAdapter, e));
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0oooo.o00O0O(bytes);
        return protoAdapter.decode(oo0oooo);
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull o0O0o0 source) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return protoAdapter.decode(new ProtoReader(source));
    }

    @NotNull
    public static final <E> byte[] commonEncode(@NotNull ProtoAdapter<E> protoAdapter, E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        oo0OOoo oo0oooo = new oo0OOoo();
        protoAdapter.encode(oo0oooo, e);
        return oo0oooo.o00ooo();
    }

    public static final <E> void commonEncodeWithTag(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ReverseProtoWriter writer, int i, @Nullable E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = writer.getByteCount();
            protoAdapter.encode(writer, e);
            writer.writeVarint32(writer.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(writer, e);
        }
        writer.writeTag(i, protoAdapter.getFieldEncoding());
    }
}
