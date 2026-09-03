package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p023Oooo00O.o00O0;
import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @Nullable
        O zac(@NonNull I i);

        @NonNull
        I zad(@NonNull O o2);
    }

    public static final void OooOO0O(StringBuilder sb, Field field, Object obj) {
        int i = field.f15700Oooo0oO;
        if (i == 11) {
            Class<? extends FastJsonResponse> cls = field.f15702OoooO;
            Preconditions.checkNotNull(cls);
            sb.append(cls.cast(obj).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        }
    }

    public static final <O> void OooOO0o(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    @KeepForSdk
    public void OooO(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @Nullable
    @KeepForSdk
    public final Object OooO00o(@NonNull Field field) {
        String str = field.f15703OoooO0;
        if (field.f15702OoooO == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.f15703OoooO0);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(strSubstring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @KeepForSdk
    public final boolean OooO0O0(@NonNull Field field) {
        if (field.f15698Oooo != 11) {
            return isPrimitiveFieldSet(field.f15703OoooO0);
        }
        if (field.f15704OoooO00) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    public void OooO0OO(@NonNull Field field, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void OooO0Oo(@NonNull Field field, @Nullable byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void OooO0o(@NonNull Field field, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void OooO0o0(@NonNull Field field, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void OooO0oO(@NonNull Field field, @Nullable String str) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void OooO0oo(@NonNull Field field, @Nullable Map map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public final <I, O> void OooOO0(Field<I, O> field, @Nullable I i) {
        String str = field.f15703OoooO0;
        O oZae = field.zae(i);
        int i2 = field.f15698Oooo;
        switch (i2) {
            case 0:
                if (oZae != null) {
                    OooO0o0(field, ((Integer) oZae).intValue());
                    return;
                } else {
                    OooOO0o(str);
                    return;
                }
            case 1:
                OooOOOO(field, (BigInteger) oZae);
                return;
            case 2:
                if (oZae != null) {
                    OooO0o(field, ((Long) oZae).longValue());
                    return;
                } else {
                    OooOO0o(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException(Oooo0.OooO00o(44, "Unsupported type for conversion: ", i2));
            case 4:
                if (oZae != null) {
                    OooOOo(field, ((Double) oZae).doubleValue());
                    return;
                } else {
                    OooOO0o(str);
                    return;
                }
            case 5:
                OooOOO0(field, (BigDecimal) oZae);
                return;
            case 6:
                if (oZae != null) {
                    OooO0OO(field, ((Boolean) oZae).booleanValue());
                    return;
                } else {
                    OooOO0o(str);
                    return;
                }
            case 7:
                OooO0oO(field, (String) oZae);
                return;
            case 8:
            case 9:
                if (oZae != null) {
                    OooO0Oo(field, (byte[]) oZae);
                    return;
                } else {
                    OooOO0o(str);
                    return;
                }
        }
    }

    public void OooOOO(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void OooOOO0(@NonNull Field field, @Nullable BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public void OooOOOO(@NonNull Field field, @Nullable BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void OooOOOo(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public void OooOOo(@NonNull Field field, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void OooOOo0(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public void OooOo(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void OooOo0(@NonNull Field field, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void OooOo00(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public void OooOo0o(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void OooOoO0(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull Field field, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull Field field, @NonNull String str, @NonNull T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @NonNull
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @Nullable
    @KeepForSdk
    public abstract Object getValueObject(@NonNull String str);

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@NonNull String str);

    @NonNull
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (OooO0O0(field)) {
                Object objOooO00o = OooO00o(field);
                if (field.f15707OoooOOO != null) {
                    objOooO00o = field.zaf(objOooO00o);
                }
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                o00O0.OooO0OO(sb, "\"", str, "\":");
                if (objOooO00o != null) {
                    switch (field.f15698Oooo) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) objOooO00o));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) objOooO00o));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) objOooO00o);
                            break;
                        default:
                            if (field.f15701Oooo0oo) {
                                ArrayList arrayList = (ArrayList) objOooO00o;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        OooOO0O(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                OooOO0O(sb, field, objOooO00o);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final <O> void zaA(@NonNull Field<String, O> field, @Nullable String str) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, str);
        } else {
            OooO0oO(field, str);
        }
    }

    public final <O> void zaB(@NonNull Field<Map<String, String>, O> field, @Nullable Map<String, String> map) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, map);
        } else {
            OooO0oo(field, map);
        }
    }

    public final <O> void zaC(@NonNull Field<ArrayList<String>, O> field, @Nullable ArrayList<String> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooO(field, arrayList);
        }
    }

    public final <O> void zaa(@NonNull Field<BigDecimal, O> field, @Nullable BigDecimal bigDecimal) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, bigDecimal);
        } else {
            OooOOO0(field, bigDecimal);
        }
    }

    public final <O> void zac(@NonNull Field<ArrayList<BigDecimal>, O> field, @Nullable ArrayList<BigDecimal> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOOO(field, arrayList);
        }
    }

    public final <O> void zae(@NonNull Field<BigInteger, O> field, @Nullable BigInteger bigInteger) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, bigInteger);
        } else {
            OooOOOO(field, bigInteger);
        }
    }

    public final <O> void zag(@NonNull Field<ArrayList<BigInteger>, O> field, @Nullable ArrayList<BigInteger> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOOOo(field, arrayList);
        }
    }

    public final <O> void zai(@NonNull Field<Boolean, O> field, boolean z) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, Boolean.valueOf(z));
        } else {
            OooO0OO(field, z);
        }
    }

    public final <O> void zaj(@NonNull Field<ArrayList<Boolean>, O> field, @Nullable ArrayList<Boolean> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOOo0(field, arrayList);
        }
    }

    public final <O> void zal(@NonNull Field<byte[], O> field, @Nullable byte[] bArr) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, bArr);
        } else {
            OooO0Oo(field, bArr);
        }
    }

    public final <O> void zam(@NonNull Field<Double, O> field, double d) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, Double.valueOf(d));
        } else {
            OooOOo(field, d);
        }
    }

    public final <O> void zao(@NonNull Field<ArrayList<Double>, O> field, @Nullable ArrayList<Double> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOo00(field, arrayList);
        }
    }

    public final <O> void zaq(@NonNull Field<Float, O> field, float f) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, Float.valueOf(f));
        } else {
            OooOo0(field, f);
        }
    }

    public final <O> void zas(@NonNull Field<ArrayList<Float>, O> field, @Nullable ArrayList<Float> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOo0o(field, arrayList);
        }
    }

    public final <O> void zau(@NonNull Field<Integer, O> field, int i) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, Integer.valueOf(i));
        } else {
            OooO0o0(field, i);
        }
    }

    public final <O> void zav(@NonNull Field<ArrayList<Integer>, O> field, @Nullable ArrayList<Integer> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOo(field, arrayList);
        }
    }

    public final <O> void zax(@NonNull Field<Long, O> field, long j) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, Long.valueOf(j));
        } else {
            OooO0o(field, j);
        }
    }

    public final <O> void zay(@NonNull Field<ArrayList<Long>, O> field, @Nullable ArrayList<Long> arrayList) {
        if (field.f15707OoooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOoO0(field, arrayList);
        }
    }

    @VisibleForTesting
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        public final int f15698Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        public final int f15699Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        public final int f15700Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        public final boolean f15701Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @Nullable
        public final Class<? extends FastJsonResponse> f15702OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @NonNull
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        public final String f15703OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        public final boolean f15704OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        public final int f15705OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @Nullable
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        public final String f15706OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        @Nullable
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        public FieldConverter<I, O> f15707OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public zan f15708o000oOoO;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @Nullable @SafeParcelable.Param(id = 8) String str2, @Nullable @SafeParcelable.Param(id = 9) zaa zaaVar) {
            this.f15699Oooo0o = i;
            this.f15700Oooo0oO = i2;
            this.f15701Oooo0oo = z;
            this.f15698Oooo = i3;
            this.f15704OoooO00 = z2;
            this.f15703OoooO0 = str;
            this.f15705OoooO0O = i4;
            if (str2 == null) {
                this.f15702OoooO = null;
                this.f15706OoooOO0 = null;
            } else {
                this.f15702OoooO = SafeParcelResponse.class;
                this.f15706OoooOO0 = str2;
            }
            if (zaaVar == null) {
                this.f15707OoooOOO = null;
            } else {
                this.f15707OoooOOO = (FieldConverter<I, O>) zaaVar.zab();
            }
        }

        @NonNull
        @VisibleForTesting
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(@NonNull String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@NonNull String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        @NonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Double, Double> forDouble(@NonNull String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Float, Float> forFloat(@NonNull String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        @NonNull
        @VisibleForTesting
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(@NonNull String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Long, Long> forLong(@NonNull String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<String, String> forString(@NonNull String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@NonNull String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@NonNull String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field withConverter(@NonNull String str, int i, @NonNull FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z, 0, false, str, i, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.f15705OoooO0O;
        }

        @NonNull
        public final String toString() {
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.f15699Oooo0o)).add("typeIn", Integer.valueOf(this.f15700Oooo0oO)).add("typeInArray", Boolean.valueOf(this.f15701Oooo0oo)).add("typeOut", Integer.valueOf(this.f15698Oooo)).add("typeOutArray", Boolean.valueOf(this.f15704OoooO00)).add("outputFieldName", this.f15703OoooO0).add("safeParcelFieldId", Integer.valueOf(this.f15705OoooO0O));
            String str = this.f15706OoooOO0;
            if (str == null) {
                str = null;
            }
            Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("concreteTypeName", str);
            Class<? extends FastJsonResponse> cls = this.f15702OoooO;
            if (cls != null) {
                toStringHelperAdd2.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f15707OoooOOO;
            if (fieldConverter != null) {
                toStringHelperAdd2.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.f15699Oooo0o);
            SafeParcelWriter.writeInt(parcel, 2, this.f15700Oooo0oO);
            SafeParcelWriter.writeBoolean(parcel, 3, this.f15701Oooo0oo);
            SafeParcelWriter.writeInt(parcel, 4, this.f15698Oooo);
            SafeParcelWriter.writeBoolean(parcel, 5, this.f15704OoooO00);
            SafeParcelWriter.writeString(parcel, 6, this.f15703OoooO0, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            String str = this.f15706OoooOO0;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.writeString(parcel, 8, str, false);
            FieldConverter<I, O> fieldConverter = this.f15707OoooOOO;
            SafeParcelWriter.writeParcelable(parcel, 9, fieldConverter != null ? zaa.zaa(fieldConverter) : null, i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        @NonNull
        public final Field<I, O> zab() {
            int i = this.f15699Oooo0o;
            int i2 = this.f15700Oooo0oO;
            boolean z = this.f15701Oooo0oo;
            int i3 = this.f15698Oooo;
            boolean z2 = this.f15704OoooO00;
            String str = this.f15703OoooO0;
            int i4 = this.f15705OoooO0O;
            String str2 = this.f15706OoooOO0;
            FieldConverter<I, O> fieldConverter = this.f15707OoooOOO;
            return new Field<>(i, i2, z, i3, z2, str, i4, str2, fieldConverter == null ? null : zaa.zaa(fieldConverter));
        }

        @NonNull
        public final FastJsonResponse zad() throws IllegalAccessException, InstantiationException {
            Preconditions.checkNotNull(this.f15702OoooO);
            Class<? extends FastJsonResponse> cls = this.f15702OoooO;
            if (cls != SafeParcelResponse.class) {
                return cls.newInstance();
            }
            Preconditions.checkNotNull(this.f15706OoooOO0);
            Preconditions.checkNotNull(this.f15708o000oOoO, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.f15708o000oOoO, this.f15706OoooOO0);
        }

        @NonNull
        public final O zae(@Nullable I i) {
            Preconditions.checkNotNull(this.f15707OoooOOO);
            return (O) Preconditions.checkNotNull(this.f15707OoooOOO.zac(i));
        }

        @NonNull
        public final I zaf(@NonNull O o2) {
            Preconditions.checkNotNull(this.f15707OoooOOO);
            return this.f15707OoooOOO.zad(o2);
        }

        @NonNull
        public final Map<String, Field<?, ?>> zah() {
            Preconditions.checkNotNull(this.f15706OoooOO0);
            Preconditions.checkNotNull(this.f15708o000oOoO);
            return (Map) Preconditions.checkNotNull(this.f15708o000oOoO.zab(this.f15706OoooOO0));
        }

        public final void zai(zan zanVar) {
            this.f15708o000oOoO = zanVar;
        }

        public final boolean zaj() {
            return this.f15707OoooOOO != null;
        }

        public Field(int i, boolean z, int i2, boolean z2, @NonNull String str, int i3, @Nullable Class<? extends FastJsonResponse> cls, @Nullable FieldConverter<I, O> fieldConverter) {
            this.f15699Oooo0o = 1;
            this.f15700Oooo0oO = i;
            this.f15701Oooo0oo = z;
            this.f15698Oooo = i2;
            this.f15704OoooO00 = z2;
            this.f15703OoooO0 = str;
            this.f15705OoooO0O = i3;
            this.f15702OoooO = cls;
            if (cls == null) {
                this.f15706OoooOO0 = null;
            } else {
                this.f15706OoooOO0 = cls.getCanonicalName();
            }
            this.f15707OoooOOO = fieldConverter;
        }
    }
}
