package com.google.protobuf;

import com.google.protobuf.OooOo.OooO0O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo<FieldDescriptorType extends OooO0O0<FieldDescriptorType>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo<FieldDescriptorType, Object> f19391OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f19392OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f19393OooO0OO = false;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19394OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f19395OooO0O0;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f19395OooO0O0 = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19395OooO0O0[WireFormat$FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat$JavaType.values().length];
            f19394OooO00o = iArr2;
            try {
                iArr2[WireFormat$JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19394OooO00o[WireFormat$JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface OooO0O0<T extends OooO0O0<T>> extends Comparable<T> {
        oo000o.OooO00o OooO0OO(oo000o.OooO00o oooO00o, oo000o oo000oVar);

        WireFormat$JavaType getLiteJavaType();

        WireFormat$FieldType getLiteType();

        boolean isRepeated();
    }

    static {
        new OooOo(true);
    }

    public OooOo() {
        int i = oo0o0Oo.f19424OoooOO0;
        this.f19391OooO00o = new o0OO00O(16);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    public static void OooO0o0(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        Objects.requireNonNull(obj);
        boolean z = true;
        boolean z2 = false;
        switch (OooO00o.f19394OooO00o[wireFormat$FieldType.OooO00o().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof o000oOoO.OooO0OO)) {
                    z = false;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof oo000o) && !(obj instanceof o0OoOo0)) {
                    z = false;
                }
                z2 = z;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final OooOo<FieldDescriptorType> clone() {
        OooOo<FieldDescriptorType> oooOo = new OooOo<>();
        for (int i = 0; i < this.f19391OooO00o.OooO0Oo(); i++) {
            Map.Entry<K, Object> entryOooO0OO = this.f19391OooO00o.OooO0OO(i);
            oooOo.OooO0Oo((OooO0O0) entryOooO0OO.getKey(), entryOooO0OO.getValue());
        }
        Iterator it = this.f19391OooO00o.OooO0o0().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            oooOo.OooO0Oo((OooO0O0) entry.getKey(), entry.getValue());
        }
        oooOo.f19393OooO0OO = this.f19393OooO0OO;
        return oooOo;
    }

    public final Object OooO0O0(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final void OooO0OO(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof o0OoOo0) {
            value = ((o0OoOo0) value).OooO00o();
        }
        if (key.isRepeated()) {
            Object arrayList = this.f19391OooO00o.get(key);
            if (arrayList instanceof o0OoOo0) {
                arrayList = ((o0OoOo0) arrayList).OooO00o();
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) arrayList).add(OooO0O0(it.next()));
            }
            this.f19391OooO00o.put(key, arrayList);
            return;
        }
        if (key.getLiteJavaType() != WireFormat$JavaType.MESSAGE) {
            this.f19391OooO00o.put(key, OooO0O0(value));
            return;
        }
        Object objOooO00o = this.f19391OooO00o.get(key);
        if (objOooO00o instanceof o0OoOo0) {
            objOooO00o = ((o0OoOo0) objOooO00o).OooO00o();
        }
        if (objOooO00o == null) {
            this.f19391OooO00o.put(key, OooO0O0(value));
        } else {
            this.f19391OooO00o.put(key, key.OooO0OO(((oo000o) objOooO00o).toBuilder(), (oo000o) value).build());
        }
    }

    public final void OooO0Oo(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            OooO0o0(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OooO0o0(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof o0OoOo0) {
            this.f19393OooO0OO = true;
        }
        this.f19391OooO00o.put(fielddescriptortype, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOo) {
            return this.f19391OooO00o.equals(((OooOo) obj).f19391OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19391OooO00o.hashCode();
    }

    public OooOo(boolean z) {
        int i = oo0o0Oo.f19424OoooOO0;
        o0OO00O o0oo00o2 = new o0OO00O(0);
        this.f19391OooO00o = o0oo00o2;
        if (this.f19392OooO0O0) {
            return;
        }
        o0oo00o2.OooO0oo();
        this.f19392OooO0O0 = true;
    }
}
