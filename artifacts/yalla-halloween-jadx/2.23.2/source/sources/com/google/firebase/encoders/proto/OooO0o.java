package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
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
import p297o0O0OooO.o0000O0;
import p297o0O0OooO.o0000O00;
import p297o0O0OooO.o0000O0O;
import p297o0O0OooO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements o0000O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO0OO f19683OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Charset f19684OooO0o = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0000O00 f19685OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o0000O00 f19686OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OutputStream f19687OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, o0000oo<?>> f19688OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Class<?>, o0000O0O<?>> f19689OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000oo<Object> f19690OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f19691OooO0o0 = new OooOO0O(this);

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19692OooO00o;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f19692OooO00o = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19692OooO00o[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19692OooO00o[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        AtProtobuf.ProtobufImpl protobufImpl = new AtProtobuf.ProtobufImpl(1, intEncoding);
        HashMap map = new HashMap();
        map.put(protobufImpl.annotationType(), protobufImpl);
        f19685OooO0oO = new o0000O00("key", o00OOOO0.OooO00o.OooO00o(map));
        AtProtobuf.ProtobufImpl protobufImpl2 = new AtProtobuf.ProtobufImpl(2, intEncoding);
        HashMap map2 = new HashMap();
        map2.put(protobufImpl2.annotationType(), protobufImpl2);
        f19686OooO0oo = new o0000O00(AppMeasurementSdk.ConditionalUserProperty.VALUE, o00OOOO0.OooO00o.OooO00o(map2));
        f19683OooO = new OooO0OO();
    }

    public OooO0o(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, o0000oo o0000ooVar) {
        this.f19687OooO00o = byteArrayOutputStream;
        this.f19688OooO0O0 = map;
        this.f19689OooO0OO = map2;
        this.f19690OooO0Oo = o0000ooVar;
    }

    public static int OooO(o0000O00 o0000o00) {
        Protobuf protobuf = (Protobuf) ((Annotation) o0000o00.f41708OooO0O0.get(Protobuf.class));
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p297o0O0OooO.o0000O0
    @NonNull
    public final o0000O0 OooO00o(@NonNull o0000O00 o0000o00, boolean z) throws IOException {
        OooO0o(o0000o00, z ? 1 : 0, true);
        return this;
    }

    @Override // p297o0O0OooO.o0000O0
    @NonNull
    public final o0000O0 OooO0O0(@NonNull o0000O00 o0000o00, int i) throws IOException {
        OooO0o(o0000o00, i, true);
        return this;
    }

    @Override // p297o0O0OooO.o0000O0
    @NonNull
    public final o0000O0 OooO0OO(@NonNull o0000O00 o0000o00, long j) throws IOException {
        OooO0oO(o0000o00, j, true);
        return this;
    }

    @Override // p297o0O0OooO.o0000O0
    @NonNull
    public final o0000O0 OooO0Oo(@NonNull o0000O00 o0000o00, @Nullable Object obj) throws IOException {
        OooO0o0(o0000o00, obj, true);
        return this;
    }

    public final void OooO0o(@NonNull o0000O00 o0000o00, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) o0000o00.f41708OooO0O0.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i2 = OooO00o.f19692OooO00o[protobuf.intEncoding().ordinal()];
        if (i2 == 1) {
            OooOO0(protobuf.tag() << 3);
            OooOO0(i);
        } else if (i2 == 2) {
            OooOO0(protobuf.tag() << 3);
            OooOO0((i << 1) ^ (i >> 31));
        } else {
            if (i2 != 3) {
                return;
            }
            OooOO0((protobuf.tag() << 3) | 5);
            this.f19687OooO00o.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final OooO0o OooO0o0(@NonNull o0000O00 o0000o00, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            OooOO0((OooO(o0000o00) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f19684OooO0o);
            OooOO0(bytes.length);
            this.f19687OooO00o.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                OooO0o0(o0000o00, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO0oo(f19683OooO, o0000o00, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (!z || dDoubleValue != 0.0d) {
                OooOO0((OooO(o0000o00) << 3) | 1);
                this.f19687OooO00o.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (!z || fFloatValue != 0.0f) {
                OooOO0((OooO(o0000o00) << 3) | 5);
                this.f19687OooO00o.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            OooO0oO(o0000o00, ((Number) obj).longValue(), z);
            return this;
        }
        if (obj instanceof Boolean) {
            OooO0o(o0000o00, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            OooOO0((OooO(o0000o00) << 3) | 2);
            OooOO0(bArr.length);
            this.f19687OooO00o.write(bArr);
            return this;
        }
        o0000oo<?> o0000ooVar = this.f19688OooO0O0.get(obj.getClass());
        if (o0000ooVar != null) {
            OooO0oo(o0000ooVar, o0000o00, obj, z);
            return this;
        }
        o0000O0O<?> o0000o0o2 = this.f19689OooO0OO.get(obj.getClass());
        if (o0000o0o2 != null) {
            OooOO0O oooOO0O = this.f19691OooO0o0;
            oooOO0O.f19697OooO00o = false;
            oooOO0O.f19699OooO0OO = o0000o00;
            oooOO0O.f19698OooO0O0 = z;
            o0000o0o2.OooO00o(obj, oooOO0O);
            return this;
        }
        if (obj instanceof OooO0O0) {
            OooO0o(o0000o00, ((OooO0O0) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            OooO0o(o0000o00, ((Enum) obj).ordinal(), true);
            return this;
        }
        OooO0oo(this.f19690OooO0Oo, o0000o00, obj, z);
        return this;
    }

    public final void OooO0oO(@NonNull o0000O00 o0000o00, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) o0000o00.f41708OooO0O0.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i = OooO00o.f19692OooO00o[protobuf.intEncoding().ordinal()];
        if (i == 1) {
            OooOO0(protobuf.tag() << 3);
            OooOO0O(j);
        } else if (i == 2) {
            OooOO0(protobuf.tag() << 3);
            OooOO0O((j >> 63) ^ (j << 1));
        } else {
            if (i != 3) {
                return;
            }
            OooOO0((protobuf.tag() << 3) | 1);
            this.f19687OooO00o.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void OooO0oo(o0000oo o0000ooVar, o0000O00 o0000o00, Object obj, boolean z) throws IOException {
        com.google.firebase.encoders.proto.OooO00o oooO00o = new com.google.firebase.encoders.proto.OooO00o();
        try {
            OutputStream outputStream = this.f19687OooO00o;
            this.f19687OooO00o = oooO00o;
            try {
                o0000ooVar.OooO00o(obj, this);
                this.f19687OooO00o = outputStream;
                long j = oooO00o.f19682OooO0Oo;
                oooO00o.close();
                if (z && j == 0) {
                    return;
                }
                OooOO0((OooO(o0000o00) << 3) | 2);
                OooOO0O(j);
                o0000ooVar.OooO00o(obj, this);
            } catch (Throwable th) {
                this.f19687OooO00o = outputStream;
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

    public final void OooOO0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f19687OooO00o.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f19687OooO00o.write(i & 127);
    }

    public final void OooOO0O(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f19687OooO00o.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f19687OooO00o.write(((int) j) & 127);
    }
}
