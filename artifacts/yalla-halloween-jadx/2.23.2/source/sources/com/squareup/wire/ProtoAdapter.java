package com.squareup.wire;

import androidx.appcompat.widget.o0000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.wire.internal.ReflectionKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 g*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002ghBG\u0012\u0006\u00109\u001a\u000208\u0012\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010=\u0012\b\u0010B\u001a\u0004\u0018\u00010-\u0012\u0006\u0010G\u001a\u00020F\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010-¢\u0006\u0004\b[\u0010\\B\u001d\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\n\u0010>\u001a\u0006\u0012\u0002\b\u00030]¢\u0006\u0004\b[\u0010^B'\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\n\u0010>\u001a\u0006\u0012\u0002\b\u00030]\u0012\b\u0010B\u001a\u0004\u0018\u00010-¢\u0006\u0004\b[\u0010_B/\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\n\u0010>\u001a\u0006\u0012\u0002\b\u00030]\u0012\b\u0010B\u001a\u0004\u0018\u00010-\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\b[\u0010`B9\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\n\u0010>\u001a\u0006\u0012\u0002\b\u00030]\u0012\b\u0010B\u001a\u0004\u0018\u00010-\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b[\u0010aB\u001f\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010=¢\u0006\u0004\b[\u0010bB)\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010=\u0012\b\u0010B\u001a\u0004\u0018\u00010-¢\u0006\u0004\b[\u0010cB1\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010=\u0012\b\u0010B\u001a\u0004\u0018\u00010-\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\b[\u0010dB;\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010=\u0012\b\u0010B\u001a\u0004\u0018\u00010-\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b[\u0010eBC\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\n\u0010>\u001a\u0006\u0012\u0002\b\u00030]\u0012\b\u0010B\u001a\u0004\u0018\u00010-\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010O\u001a\u0004\u0018\u00010-¢\u0006\u0004\b[\u0010fJ\u0017\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0018J\u0015\u0010\u000f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010 J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0019¢\u0006\u0004\b#\u0010&J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u001b¢\u0006\u0004\b#\u0010'J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b#\u0010*J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020+¢\u0006\u0004\b#\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u001b\u00104\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u0012\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000050\u0000J\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000050\u0000R\u001a\u00109\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010B\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010G\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010K\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010O\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010ER(\u0010Q\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000005\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR(\u0010U\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000005\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010TR\u0014\u0010Z\u001a\u00020W8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006i"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "encodedSize", "(Ljava/lang/Object;)I", ViewHierarchyConstants.TAG_KEY, "encodedSizeWithTag", "(ILjava/lang/Object;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "", "encode", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "Lo0oooO0O/o0O0o00O;", "sink", "(Lo0oooO0O/o0O0o00O;Ljava/lang/Object;)V", "", "(Ljava/lang/Object;)[B", "Lokio/ByteString;", "encodeByteString", "(Ljava/lang/Object;)Lokio/ByteString;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "bytes", "([B)Ljava/lang/Object;", "(Lokio/ByteString;)Ljava/lang/Object;", "Lo0oooO0O/o0O0o0;", "source", "(Lo0oooO0O/o0O0o0;)Ljava/lang/Object;", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/WireField$Label;", "label", "withLabel$wire_runtime", "(Lcom/squareup/wire/WireField$Label;)Lcom/squareup/wire/ProtoAdapter;", "withLabel", "", "asPacked", "asRepeated", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "getFieldEncoding$wire_runtime", "()Lcom/squareup/wire/FieldEncoding;", "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "typeUrl", "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "Lcom/squareup/wire/Syntax;", "syntax", "Lcom/squareup/wire/Syntax;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "identity", "Ljava/lang/Object;", "getIdentity", "()Ljava/lang/Object;", "sourceFile", "getSourceFile", "packedAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getPackedAdapter$wire_runtime", "()Lcom/squareup/wire/ProtoAdapter;", "repeatedAdapter", "getRepeatedAdapter$wire_runtime", "", "isStruct$wire_runtime", "()Z", "isStruct", "<init>", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "Ljava/lang/Class;", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "Companion", "EnumConstantNotFoundException", "wire-runtime"}, k = 1, mv = {1, 6, 0})
public abstract class ProtoAdapter<E> {

    @JvmField
    @NotNull
    public static final ProtoAdapter<Boolean> BOOL;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Boolean> BOOL_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<ByteString> BYTES;

    @JvmField
    @NotNull
    public static final ProtoAdapter<ByteString> BYTES_VALUE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ProtoAdapter<Double> DOUBLE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Double> DOUBLE_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Duration> DURATION;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Unit> EMPTY;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> FIXED32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> FIXED64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Float> FLOAT;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Float> FLOAT_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Instant> INSTANT;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> INT32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> INT32_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> INT64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> INT64_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> SFIXED32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> SFIXED64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> SINT32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> SINT64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<String> STRING;

    @JvmField
    @NotNull
    public static final ProtoAdapter<String> STRING_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<List<?>> STRUCT_LIST;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;

    @JvmField
    @NotNull
    public static final ProtoAdapter STRUCT_NULL;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Object> STRUCT_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> UINT32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> UINT32_VALUE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> UINT64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> UINT64_VALUE;

    @NotNull
    private final FieldEncoding fieldEncoding;

    @Nullable
    private final E identity;

    @Nullable
    private final ProtoAdapter<List<E>> packedAdapter;

    @Nullable
    private final ProtoAdapter<List<E>> repeatedAdapter;

    @Nullable
    private final String sourceFile;

    @NotNull
    private final Syntax syntax;

    @Nullable
    private final KClass<?> type;

    @Nullable
    private final String typeUrl;

    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001IB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u00102\u001a\b\u0012\u0004\u0012\u0002H30\u0004\"\u0010\b\u0001\u00103*\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003042\u0006\u00105\u001a\u0002H3H\u0007¢\u0006\u0002\u00106J\"\u00102\u001a\b\u0012\u0004\u0012\u0002H30\u0004\"\u0004\b\u0001\u001032\f\u00107\u001a\b\u0012\u0004\u0012\u0002H308H\u0007J\u0014\u00102\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u00109\u001a\u00020%H\u0007J&\u0010:\u001a\b\u0012\u0004\u0012\u0002H<0;\"\b\b\u0001\u0010<*\u00020=2\f\u00107\u001a\b\u0012\u0004\u0012\u0002H<08H\u0007JB\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H@0*0\u0004\"\u0004\b\u0001\u0010?\"\u0004\b\u0002\u0010@2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002H?0\u00042\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0\u0004H\u0007JH\u0010C\u001a\b\u0012\u0004\u0012\u0002H30\u0004\"\u0014\b\u0001\u00103*\u000e\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002HD04\"\u0014\b\u0002\u0010D*\u000e\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002HD0E2\f\u00107\u001a\b\u0012\u0004\u0012\u0002H308H\u0007JP\u0010C\u001a\b\u0012\u0004\u0012\u0002H30\u0004\"\u0014\b\u0001\u00103*\u000e\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002HD04\"\u0014\b\u0002\u0010D*\u000e\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002HD0E2\f\u00107\u001a\b\u0012\u0004\u0012\u0002H3082\u0006\u0010F\u001a\u00020%H\u0007JX\u0010C\u001a\b\u0012\u0004\u0012\u0002H30\u0004\"\u0014\b\u0001\u00103*\u000e\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002HD04\"\u0014\b\u0002\u0010D*\u000e\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002HD0E2\f\u00107\u001a\b\u0012\u0004\u0012\u0002H3082\u0006\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020HH\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010(0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0002\b\u0003\u0018\u00010*0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion;", "", "()V", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "", "BOOL_VALUE", "BYTES", "Lokio/ByteString;", "BYTES_VALUE", "DOUBLE", "", "DOUBLE_VALUE", "DURATION", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "EMPTY", "", "FIXED32", "", "FIXED64", "", "FLOAT", "", "FLOAT_VALUE", "INSTANT", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "INT32", "INT32_VALUE", "INT64", "INT64_VALUE", "SFIXED32", "SFIXED64", "SINT32", "SINT64", "STRING", "", "STRING_VALUE", "STRUCT_LIST", "", "STRUCT_MAP", "", "STRUCT_NULL", "", "STRUCT_VALUE", "UINT32", "UINT32_VALUE", "UINT64", "UINT64_VALUE", "get", "M", "Lcom/squareup/wire/Message;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Lcom/squareup/wire/Message;)Lcom/squareup/wire/ProtoAdapter;", "type", "Ljava/lang/Class;", "adapterString", "newEnumAdapter", "Lcom/squareup/wire/EnumAdapter;", "E", "Lcom/squareup/wire/WireEnum;", "newMapAdapter", "K", "V", "keyAdapter", "valueAdapter", "newMessageAdapter", "B", "Lcom/squareup/wire/Message$Builder;", "typeUrl", "syntax", "Lcom/squareup/wire/Syntax;", "UnsupportedTypeProtoAdapter", "wire-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion$UnsupportedTypeProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "()V", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "encode", "writer", "Lcom/squareup/wire/ProtoWriter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lcom/squareup/wire/ReverseProtoWriter;", "encodedSize", "redact", "wire-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) Reflection.getOrCreateKotlinClass(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void decode(@NotNull ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @NotNull
            public Void encodedSize(@NotNull Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void redact(@NotNull Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void encode(@NotNull ProtoWriter writer, @NotNull Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void encode(@NotNull ReverseProtoWriter writer, @NotNull Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <M extends Message<?, ?>> ProtoAdapter<M> get(@NotNull M message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return get(message.getClass());
        }

        @JvmStatic
        @NotNull
        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(@NotNull Class<E> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new RuntimeEnumAdapter(type);
        }

        @JvmStatic
        @NotNull
        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(@NotNull ProtoAdapter<K> keyAdapter, @NotNull ProtoAdapter<V> valueAdapter) {
            Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
            Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }

        @JvmStatic
        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, null, Syntax.PROTO_2, false, 8, null);
        }

        @JvmStatic
        @NotNull
        public final <M> ProtoAdapter<M> get(@NotNull Class<M> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("failed to access " + ((Object) type.getName()) + "#ADAPTER", e);
            } catch (NoSuchFieldException e2) {
                throw new IllegalArgumentException("failed to access " + ((Object) type.getName()) + "#ADAPTER", e2);
            }
        }

        @JvmStatic
        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type, @NotNull String typeUrl) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, Syntax.PROTO_2, false, 8, null);
        }

        @JvmStatic
        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type, @NotNull String typeUrl, @NotNull Syntax syntax) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            Intrinsics.checkNotNullParameter(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, false, 8, null);
        }

        @JvmStatic
        @NotNull
        public final ProtoAdapter<?> get(@NotNull String adapterString) {
            Intrinsics.checkNotNullParameter(adapterString, "adapterString");
            try {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) adapterString, '#', 0, false, 6, (Object) null);
                String strSubstring = adapterString.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = adapterString.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                Object obj = Class.forName(strSubstring).getField(strSubstring2).get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("failed to access ", adapterString), e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("failed to access ", adapterString), e2);
            } catch (NoSuchFieldException e3) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("failed to access ", adapterString), e3);
            }
        }
    }

    static {
        ProtoAdapter<Duration> unsupportedTypeProtoAdapter;
        ProtoAdapter<Instant> unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> protoAdapterCommonBool = ProtoAdapterKt.commonBool();
        BOOL = protoAdapterCommonBool;
        ProtoAdapter<Integer> protoAdapterCommonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = protoAdapterCommonInt32;
        ProtoAdapter<Integer> protoAdapterCommonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = protoAdapterCommonUint32;
        SINT32 = ProtoAdapterKt.commonSint32();
        FIXED32 = ProtoAdapterKt.commonFixed32();
        SFIXED32 = ProtoAdapterKt.commonSfixed32();
        ProtoAdapter<Long> protoAdapterCommonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = protoAdapterCommonInt64;
        ProtoAdapter<Long> protoAdapterCommonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = protoAdapterCommonUint64;
        SINT64 = ProtoAdapterKt.commonSint64();
        FIXED64 = ProtoAdapterKt.commonFixed64();
        SFIXED64 = ProtoAdapterKt.commonSfixed64();
        ProtoAdapter<Float> protoAdapterCommonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = protoAdapterCommonFloat;
        ProtoAdapter<Double> protoAdapterCommonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = protoAdapterCommonDouble;
        ProtoAdapter<ByteString> protoAdapterCommonBytes = ProtoAdapterKt.commonBytes();
        BYTES = protoAdapterCommonBytes;
        ProtoAdapter<String> protoAdapterCommonString = ProtoAdapterKt.commonString();
        STRING = protoAdapterCommonString;
        EMPTY = ProtoAdapterKt.commonEmpty();
        STRUCT_MAP = ProtoAdapterKt.commonStructMap();
        STRUCT_LIST = ProtoAdapterKt.commonStructList();
        STRUCT_NULL = ProtoAdapterKt.commonStructNull();
        STRUCT_VALUE = ProtoAdapterKt.commonStructValue();
        DOUBLE_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonDouble, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonFloat, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt64, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint64, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt32, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint32, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBool, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonString, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBytes, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = ProtoAdapterKt.commonDuration();
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = ProtoAdapterKt.commonInstant();
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str, @NotNull Syntax syntax, @Nullable E e, @Nullable String str2) {
        PackedProtoAdapter packedProtoAdapter;
        FieldEncoding fieldEncoding2;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e;
        this.sourceFile = str2;
        boolean z = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z || (this instanceof RepeatedProtoAdapter) || fieldEncoding == (fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED)) {
            packedProtoAdapter = null;
        } else {
            if (!(getFieldEncoding() != fieldEncoding2)) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    @JvmStatic
    @NotNull
    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(@NotNull M m) {
        return INSTANCE.get(m);
    }

    @JvmStatic
    @NotNull
    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(@NotNull Class<E> cls) {
        return INSTANCE.newEnumAdapter(cls);
    }

    @JvmStatic
    @NotNull
    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        return INSTANCE.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @JvmStatic
    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls) {
        return INSTANCE.newMessageAdapter(cls);
    }

    @NotNull
    public final ProtoAdapter<List<E>> asPacked() {
        if (!(this.fieldEncoding != FieldEncoding.LENGTH_DELIMITED)) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    @NotNull
    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract E decode(@NotNull ProtoReader reader) throws IOException;

    public final E decode(@NotNull InputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        return decode(o0OO.OooO0O0(o0OO.OooO0oo(stream)));
    }

    public abstract void encode(@NotNull ProtoWriter writer, E value) throws IOException;

    public final void encode(@NotNull OutputStream stream, E value) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(o0OO.OooO0o0(stream));
        encode(o0ooo000OooO00o, value);
        o0ooo000OooO00o.OooOOO0();
    }

    @NotNull
    public final ByteString encodeByteString(E value) throws IOException {
        oo0OOoo oo0oooo = new oo0OOoo();
        encode(oo0oooo, value);
        return oo0oooo.Oooo0o0();
    }

    public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            return;
        }
        writer.writeTag(tag, getFieldEncoding());
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            writer.writeVarint32(encodedSize(value));
        }
        encode(writer, value);
    }

    public abstract int encodedSize(E value);

    public int encodedSizeWithTag(int tag, @Nullable E value) {
        if (value == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(value);
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(iEncodedSize);
        }
        return ProtoWriter.INSTANCE.tagSize$wire_runtime(tag) + iEncodedSize;
    }

    @NotNull
    /* JADX INFO: renamed from: getFieldEncoding$wire_runtime, reason: from getter */
    public final FieldEncoding getFieldEncoding() {
        return this.fieldEncoding;
    }

    @Nullable
    public final E getIdentity() {
        return this.identity;
    }

    @Nullable
    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    @Nullable
    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    @Nullable
    public final String getSourceFile() {
        return this.sourceFile;
    }

    @NotNull
    public final Syntax getSyntax() {
        return this.syntax;
    }

    @Nullable
    public final KClass<?> getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return Intrinsics.areEqual(this, STRUCT_MAP) || Intrinsics.areEqual(this, STRUCT_LIST) || Intrinsics.areEqual(this, STRUCT_VALUE) || Intrinsics.areEqual(this, STRUCT_NULL);
    }

    public abstract E redact(E value);

    @NotNull
    public String toString(E value) {
        return String.valueOf(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ProtoAdapter<?> withLabel$wire_runtime(@NotNull WireField.Label label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (label.isRepeated()) {
            return label.isPacked() ? asPacked() : asRepeated();
        }
        return this;
    }

    @JvmStatic
    @NotNull
    public static final <M> ProtoAdapter<M> get(@NotNull Class<M> cls) {
        return INSTANCE.get(cls);
    }

    @JvmStatic
    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str) {
        return INSTANCE.newMessageAdapter(cls, str);
    }

    public final E decode(@NotNull byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0oooo.o00Ooo(bytes);
        return decode(oo0oooo);
    }

    @JvmStatic
    @NotNull
    public static final ProtoAdapter<?> get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str, @NotNull Syntax syntax) {
        return INSTANCE.newMessageAdapter(cls, str, syntax);
    }

    public final E decode(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0oooo.o00O0O(bytes);
        return decode(oo0oooo);
    }

    public final E decode(@NotNull o0O0o0 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        return decode(new ProtoReader(source));
    }

    public void encode(@NotNull ReverseProtoWriter writer, E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeForward$wire_runtime(new ProtoAdapterKt.C09051(this, value));
    }

    public final void encode(@NotNull o0O0o00O sink, E value) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, value);
        reverseProtoWriter.writeTo(sink);
    }

    public void encodeWithTag(@NotNull ReverseProtoWriter writer, int tag, @Nullable E value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            return;
        }
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = writer.getByteCount();
            encode(writer, value);
            writer.writeVarint32(writer.getByteCount() - byteCount);
        } else {
            encode(writer, value);
        }
        writer.writeTag(tag, getFieldEncoding());
    }

    @NotNull
    public final byte[] encode(E value) throws IOException {
        oo0OOoo oo0oooo = new oo0OOoo();
        encode(oo0oooo, value);
        return oo0oooo.o00ooo();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "type", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "Lkotlin/reflect/KClass;", "(ILkotlin/reflect/KClass;)V", "wire-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {

        @JvmField
        public final int value;

        /* JADX WARN: Illegal instructions before constructor call */
        public EnumConstantNotFoundException(int i, @Nullable KClass<?> kClass) {
            Class javaClass;
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Unknown enum tag ", i, " for ");
            String name = null;
            if (kClass != null && (javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass)) != null) {
                name = javaClass.getName();
            }
            sbOooO0O0.append((Object) name);
            super(sbOooO0O0.toString());
            this.value = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i, @NotNull Class<?> type) {
            this(i, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldEncoding, (KClass<?>) kClass, str, syntax, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> type) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> type, @Nullable String str) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> type, @Nullable String str, @NotNull Syntax syntax) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> type, @Nullable String str, @NotNull Syntax syntax, @Nullable E e) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax, e, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass) {
        this(fieldEncoding, kClass, (String) null, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str) {
        this(fieldEncoding, kClass, str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str, @NotNull Syntax syntax) {
        this(fieldEncoding, kClass, str, syntax, (Object) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str, @NotNull Syntax syntax, @Nullable E e) {
        this(fieldEncoding, kClass, str, syntax, e, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> type, @Nullable String str, @NotNull Syntax syntax, @Nullable E e, @Nullable String str2) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax, e, str2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }
}
