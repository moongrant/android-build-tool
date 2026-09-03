package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import io.opentelemetry.proto.common.v1.internal.ArrayValue;
import io.opentelemetry.proto.common.v1.internal.KeyValue;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class KeyValueMarshaler extends MarshalerWithSize {

    /* JADX INFO: renamed from: io.opentelemetry.exporter.otlp.internal.KeyValueMarshaler$1, reason: invalid class name */
    class AnonymousClass1 implements BiConsumer<AttributeKey<?>, Object> {
        /* JADX WARN: Code duplicated, block: B:41:0x014c  */
        @Override // io.opentelemetry.compat.BiConsumer
        public final void accept(AttributeKey<?> attributeKey, Object obj) {
            byte[] bytes;
            byte[] bytes2;
            AttributeKey<?> attributeKey2 = attributeKey;
            if (attributeKey2.getKey().isEmpty()) {
                bytes = MarshalerUtil.f32585OooO00o;
            } else if (attributeKey2 instanceof InternalAttributeKeyImpl) {
                InternalAttributeKeyImpl internalAttributeKeyImpl = (InternalAttributeKeyImpl) attributeKey2;
                byte[] bytes3 = internalAttributeKeyImpl.f32505OooO0Oo;
                if (bytes3 == null) {
                    bytes3 = internalAttributeKeyImpl.f32503OooO0O0.getBytes(StandardCharsets.UTF_8);
                    internalAttributeKeyImpl.f32505OooO0Oo = bytes3;
                }
                bytes = bytes3;
            } else {
                bytes = attributeKey2.getKey().getBytes(StandardCharsets.UTF_8);
            }
            int i = 0;
            switch (AnonymousClass2.f32584OooO00o[attributeKey2.getType().ordinal()]) {
                case 1:
                    String str = (String) obj;
                    if (str != null) {
                        byte[] bArr = MarshalerUtil.f32585OooO00o;
                        if (str.isEmpty()) {
                            bytes2 = MarshalerUtil.f32585OooO00o;
                        } else {
                            bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        }
                    } else {
                        bytes2 = MarshalerUtil.f32585OooO00o;
                    }
                    new KeyValueMarshaler(bytes, new StringAnyValueMarshaler(bytes2));
                    break;
                case 2:
                    new KeyValueMarshaler(bytes, new Int64AnyValueMarshaler(((Long) obj).longValue()));
                    break;
                case 3:
                    ((Boolean) obj).booleanValue();
                    new KeyValueMarshaler(bytes, new BoolAnyValueMarshaler());
                    break;
                case 4:
                    ((Double) obj).doubleValue();
                    new KeyValueMarshaler(bytes, new AnyDoubleFieldMarshaler());
                    break;
                case 5:
                    List list = (List) obj;
                    int size = list.size();
                    StringAnyValueMarshaler[] stringAnyValueMarshalerArr = new StringAnyValueMarshaler[size];
                    while (i < size) {
                        stringAnyValueMarshalerArr[i] = new StringAnyValueMarshaler(((String) list.get(i)).getBytes(StandardCharsets.UTF_8));
                        i++;
                    }
                    new KeyValueMarshaler(bytes, new ArrayAnyValueMarshaler(new ArrayValueMarshaler(stringAnyValueMarshalerArr)));
                    break;
                case 6:
                    List list2 = (List) obj;
                    int size2 = list2.size();
                    Int64AnyValueMarshaler[] int64AnyValueMarshalerArr = new Int64AnyValueMarshaler[size2];
                    while (i < size2) {
                        int64AnyValueMarshalerArr[i] = new Int64AnyValueMarshaler(((Long) list2.get(i)).longValue());
                        i++;
                    }
                    new KeyValueMarshaler(bytes, new ArrayAnyValueMarshaler(new ArrayValueMarshaler(int64AnyValueMarshalerArr)));
                    break;
                case 7:
                    List list3 = (List) obj;
                    int size3 = list3.size();
                    BoolAnyValueMarshaler[] boolAnyValueMarshalerArr = new BoolAnyValueMarshaler[size3];
                    while (i < size3) {
                        ((Boolean) list3.get(i)).booleanValue();
                        boolAnyValueMarshalerArr[i] = new BoolAnyValueMarshaler();
                        i++;
                    }
                    new KeyValueMarshaler(bytes, new ArrayAnyValueMarshaler(new ArrayValueMarshaler(boolAnyValueMarshalerArr)));
                    break;
                case 8:
                    List list4 = (List) obj;
                    int size4 = list4.size();
                    AnyDoubleFieldMarshaler[] anyDoubleFieldMarshalerArr = new AnyDoubleFieldMarshaler[size4];
                    while (i < size4) {
                        ((Double) list4.get(i)).doubleValue();
                        anyDoubleFieldMarshalerArr[i] = new AnyDoubleFieldMarshaler();
                        i++;
                    }
                    new KeyValueMarshaler(bytes, new ArrayAnyValueMarshaler(new ArrayValueMarshaler(anyDoubleFieldMarshalerArr)));
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported attribute type.");
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: io.opentelemetry.exporter.otlp.internal.KeyValueMarshaler$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32584OooO00o;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f32584OooO00o = iArr;
            try {
                iArr[AttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32584OooO00o[AttributeType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32584OooO00o[AttributeType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32584OooO00o[AttributeType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32584OooO00o[AttributeType.STRING_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32584OooO00o[AttributeType.LONG_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32584OooO00o[AttributeType.BOOLEAN_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32584OooO00o[AttributeType.DOUBLE_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class AnyDoubleFieldMarshaler extends MarshalerWithSize {
        /* JADX WARN: Illegal instructions before constructor call */
        public AnyDoubleFieldMarshaler() {
            int i = ((AutoValue_ProtoFieldInfo) AnyValue.f32615OooO0Oo).f32579OooO0OO;
            int i2 = CodedOutputStream.f32581OooO00o;
            super(i + 8);
        }
    }

    public static class ArrayAnyValueMarshaler extends MarshalerWithSize {
        /* JADX WARN: Illegal instructions before constructor call */
        public ArrayAnyValueMarshaler(Marshaler marshaler) {
            ProtoFieldInfo protoFieldInfo = AnyValue.f32616OooO0o0;
            byte[] bArr = MarshalerUtil.f32585OooO00o;
            int i = ((AutoValue_ProtoFieldInfo) protoFieldInfo).f32579OooO0OO;
            int i2 = ((MarshalerWithSize) marshaler).f32586OooO00o;
            super(i + CodedOutputStream.OooO00o(i2) + i2);
        }
    }

    public static class ArrayValueMarshaler extends MarshalerWithSize {
        /* JADX WARN: Illegal instructions before constructor call */
        public ArrayValueMarshaler(Marshaler[] marshalerArr) {
            ProtoFieldInfo protoFieldInfo = ArrayValue.f32617OooO00o;
            byte[] bArr = MarshalerUtil.f32585OooO00o;
            int i = ((AutoValue_ProtoFieldInfo) protoFieldInfo).f32579OooO0OO;
            int iOooO00o = 0;
            for (Marshaler marshaler : marshalerArr) {
                int iOooO00o2 = marshaler.OooO00o();
                iOooO00o += CodedOutputStream.OooO00o(iOooO00o2) + i + iOooO00o2;
            }
            super(iOooO00o);
        }
    }

    public static class BoolAnyValueMarshaler extends MarshalerWithSize {
        /* JADX WARN: Illegal instructions before constructor call */
        public BoolAnyValueMarshaler() {
            int i = ((AutoValue_ProtoFieldInfo) AnyValue.f32613OooO0O0).f32579OooO0OO;
            int i2 = CodedOutputStream.f32581OooO00o;
            super(i + 1);
        }
    }

    public static class Int64AnyValueMarshaler extends MarshalerWithSize {
        /* JADX WARN: Illegal instructions before constructor call */
        public Int64AnyValueMarshaler(long j) {
            int i;
            int i2;
            int i3 = ((AutoValue_ProtoFieldInfo) AnyValue.f32614OooO0OO).f32579OooO0OO;
            if (((-128) & j) == 0) {
                i2 = 1;
            } else if (j < 0) {
                i2 = 10;
            } else {
                if (((-34359738368L) & j) != 0) {
                    j >>>= 28;
                    i = 6;
                } else {
                    i = 2;
                }
                if (((-2097152) & j) != 0) {
                    i += 2;
                    j >>>= 14;
                }
                i2 = (j & (-16384)) != 0 ? i + 1 : i;
            }
            super(i3 + i2);
        }
    }

    public static class StringAnyValueMarshaler extends MarshalerWithSize {
        /* JADX WARN: Illegal instructions before constructor call */
        public StringAnyValueMarshaler(byte[] bArr) {
            int i = ((AutoValue_ProtoFieldInfo) AnyValue.f32612OooO00o).f32579OooO0OO;
            int length = bArr.length;
            super(CodedOutputStream.OooO00o(length) + length + i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyValueMarshaler(byte[] bArr, Marshaler marshaler) {
        int iOooO00o;
        ProtoFieldInfo protoFieldInfo = KeyValue.f32618OooO00o;
        byte[] bArr2 = MarshalerUtil.f32585OooO00o;
        if (bArr.length == 0) {
            iOooO00o = 0;
        } else {
            int i = ((AutoValue_ProtoFieldInfo) protoFieldInfo).f32579OooO0OO;
            int length = bArr.length;
            iOooO00o = CodedOutputStream.OooO00o(length) + length + i;
        }
        int i2 = ((AutoValue_ProtoFieldInfo) KeyValue.f32619OooO0O0).f32579OooO0OO;
        int i3 = ((MarshalerWithSize) marshaler).f32586OooO00o;
        super(i2 + CodedOutputStream.OooO00o(i3) + i3 + iOooO00o + 0);
    }
}
