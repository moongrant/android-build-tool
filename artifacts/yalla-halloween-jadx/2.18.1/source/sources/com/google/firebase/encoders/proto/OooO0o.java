package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.EncodingException;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o00O0O;
import p368o0OOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o000oOoO<Map.Entry<Object, Object>> f19092OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Charset f19093OooO0o = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Oooo0 f19094OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Oooo0 f19095OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OutputStream f19096OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, o000oOoO<?>> f19097OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Class<?>, o00O0O<?>> f19098OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000oOoO<Object> f19099OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f19100OooO0o0 = new OooOO0O(this);

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19101OooO00o;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f19101OooO00o = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19101OooO00o[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19101OooO00o[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        AtProtobuf.ProtobufImpl protobufImpl = new AtProtobuf.ProtobufImpl(1, intEncoding);
        HashMap map = new HashMap();
        map.put(protobufImpl.annotationType(), protobufImpl);
        f19094OooO0oO = new Oooo0("key", o00O.OooO00o.OooO00o(map), null);
        AtProtobuf.ProtobufImpl protobufImpl2 = new AtProtobuf.ProtobufImpl(2, intEncoding);
        HashMap map2 = new HashMap();
        map2.put(protobufImpl2.annotationType(), protobufImpl2);
        f19095OooO0oo = new Oooo0(AppMeasurementSdk.ConditionalUserProperty.VALUE, o00O.OooO00o.OooO00o(map2), null);
        f19092OooO = new o000oOoO() { // from class: com.google.firebase.encoders.proto.OooO0OO
            @Override // p368o0OOo0O.Oooo000
            public final void OooO00o(Object obj, o0OoOo0 o0oooo1) throws IOException {
                Map.Entry entry = (Map.Entry) obj;
                o0OoOo0 o0oooo2 = o0oooo1;
                o0oooo2.OooO0Oo(OooO0o.f19094OooO0oO, entry.getKey());
                o0oooo2.OooO0Oo(OooO0o.f19095OooO0oo, entry.getValue());
            }
        };
    }

    public OooO0o(OutputStream outputStream, Map<Class<?>, o000oOoO<?>> map, Map<Class<?>, o00O0O<?>> map2, o000oOoO<Object> o000oooo2) {
        this.f19096OooO00o = outputStream;
        this.f19097OooO0O0 = map;
        this.f19098OooO0OO = map2;
        this.f19099OooO0Oo = o000oooo2;
    }

    public static ByteBuffer OooO0oo(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static Protobuf OooOO0(Oooo0 oooo0) {
        Protobuf protobuf = (Protobuf) ((Annotation) oooo0.f38662OooO0O0.get(Protobuf.class));
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static int OooOO0O(Oooo0 oooo0) {
        Protobuf protobuf = (Protobuf) ((Annotation) oooo0.f38662OooO0O0.get(Protobuf.class));
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final <T> OooO0o OooO(o000oOoO<T> o000oooo2, Oooo0 oooo0, T t, boolean z) throws IOException {
        com.google.firebase.encoders.proto.OooO00o oooO00o = new com.google.firebase.encoders.proto.OooO00o();
        try {
            OutputStream outputStream = this.f19096OooO00o;
            this.f19096OooO00o = oooO00o;
            try {
                o000oooo2.OooO00o(t, this);
                this.f19096OooO00o = outputStream;
                long j = oooO00o.f19090Oooo0o;
                oooO00o.close();
                if (z && j == 0) {
                    return this;
                }
                OooOO0o((OooOO0O(oooo0) << 3) | 2);
                OooOOO0(j);
                o000oooo2.OooO00o(t, this);
                return this;
            } catch (Throwable th) {
                this.f19096OooO00o = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                oooO00o.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO00o(@NonNull Oooo0 oooo0, boolean z) throws IOException {
        OooO0o0(oooo0, z ? 1 : 0, true);
        return this;
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO0O0(@NonNull Oooo0 oooo0, long j) throws IOException {
        OooO0o(oooo0, j, true);
        return this;
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO0OO(@NonNull Oooo0 oooo0, int i) throws IOException {
        OooO0o0(oooo0, i, true);
        return this;
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO0Oo(@NonNull Oooo0 oooo0, @Nullable Object obj) throws IOException {
        return OooO0oO(oooo0, obj, true);
    }

    public final OooO0o OooO0o(@NonNull Oooo0 oooo0, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        Protobuf protobufOooOO0 = OooOO0(oooo0);
        int i = OooO00o.f19101OooO00o[protobufOooOO0.intEncoding().ordinal()];
        if (i == 1) {
            OooOO0o(protobufOooOO0.tag() << 3);
            OooOOO0(j);
        } else if (i == 2) {
            OooOO0o(protobufOooOO0.tag() << 3);
            OooOOO0((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            OooOO0o((protobufOooOO0.tag() << 3) | 1);
            this.f19096OooO00o.write(OooO0oo(8).putLong(j).array());
        }
        return this;
    }

    public final OooO0o OooO0o0(@NonNull Oooo0 oooo0, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        Protobuf protobufOooOO0 = OooOO0(oooo0);
        int i2 = OooO00o.f19101OooO00o[protobufOooOO0.intEncoding().ordinal()];
        if (i2 == 1) {
            OooOO0o(protobufOooOO0.tag() << 3);
            OooOO0o(i);
        } else if (i2 == 2) {
            OooOO0o(protobufOooOO0.tag() << 3);
            OooOO0o((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            OooOO0o((protobufOooOO0.tag() << 3) | 5);
            this.f19096OooO00o.write(OooO0oo(4).putInt(i).array());
        }
        return this;
    }

    public final o0OoOo0 OooO0oO(@NonNull Oooo0 oooo0, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            OooOO0o((OooOO0O(oooo0) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f19093OooO0o);
            OooOO0o(bytes.length);
            this.f19096OooO00o.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                OooO0oO(oooo0, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO(f19092OooO, oooo0, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (!z || dDoubleValue != 0.0d) {
                OooOO0o((OooOO0O(oooo0) << 3) | 1);
                this.f19096OooO00o.write(OooO0oo(8).putDouble(dDoubleValue).array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (!z || fFloatValue != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                OooOO0o((OooOO0O(oooo0) << 3) | 5);
                this.f19096OooO00o.write(OooO0oo(4).putFloat(fFloatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            OooO0o(oooo0, ((Number) obj).longValue(), z);
            return this;
        }
        if (obj instanceof Boolean) {
            OooO0o0(oooo0, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            OooOO0o((OooOO0O(oooo0) << 3) | 2);
            OooOO0o(bArr.length);
            this.f19096OooO00o.write(bArr);
            return this;
        }
        o000oOoO<?> o000oooo2 = this.f19097OooO0O0.get(obj.getClass());
        if (o000oooo2 != null) {
            OooO(o000oooo2, oooo0, obj, z);
            return this;
        }
        o00O0O<?> o00o0o2 = this.f19098OooO0OO.get(obj.getClass());
        if (o00o0o2 != null) {
            OooOO0O oooOO0O = this.f19100OooO0o0;
            oooOO0O.f19108OooO00o = false;
            oooOO0O.f19110OooO0OO = oooo0;
            oooOO0O.f19109OooO0O0 = z;
            o00o0o2.OooO00o(obj, oooOO0O);
            return this;
        }
        if (obj instanceof OooO0O0) {
            OooO0o0(oooo0, ((OooO0O0) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            OooO0o0(oooo0, ((Enum) obj).ordinal(), true);
            return this;
        }
        OooO(this.f19099OooO0Oo, oooo0, obj, z);
        return this;
    }

    public final void OooOO0o(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f19096OooO00o.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f19096OooO00o.write(i & 127);
    }

    public final void OooOOO0(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f19096OooO00o.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f19096OooO00o.write(((int) j) & 127);
    }
}
