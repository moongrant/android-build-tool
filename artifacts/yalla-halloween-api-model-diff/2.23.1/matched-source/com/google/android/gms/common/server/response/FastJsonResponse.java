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
import p210o00o0oo.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
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
        I zad(@NonNull O o);
    }

    public static final void OooOO0O(StringBuilder sb, Field field, Object obj) {
        int i = field.f14725OooO0o0;
        if (i == 11) {
            Class<? extends FastJsonResponse> cls = field.f14729OooOO0O;
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
        Class<? extends FastJsonResponse> cls = field.f14729OooOO0O;
        String str = field.f14722OooO;
        if (cls == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", str);
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
        if (field.f14726OooO0oO != 11) {
            return isPrimitiveFieldSet(field.f14722OooO);
        }
        if (field.f14727OooO0oo) {
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
    public void OooO0o0(int i, @NonNull Field field) {
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
        String str = field.f14722OooO;
        O oZae = field.zae(i);
        int i2 = field.f14726OooO0oO;
        switch (i2) {
            case 0:
                if (oZae != null) {
                    OooO0o0(((Integer) oZae).intValue(), field);
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
                throw new IllegalStateException(o0O0000O.OooO00o(44, "Unsupported type for conversion: ", i2));
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
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void OooOo0(@NonNull Field field, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void OooOo00(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public void OooOoO0(@NonNull Field field, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void OooOoOO(@NonNull Field field, @Nullable ArrayList arrayList) {
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
                if (field.f14731OooOOO != null) {
                    objOooO00o = field.zaf(objOooO00o);
                }
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objOooO00o != null) {
                    switch (field.f14726OooO0oO) {
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
                            if (field.f14724OooO0o) {
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
        if (field.f14731OooOOO != null) {
            OooOO0(field, str);
        } else {
            OooO0oO(field, str);
        }
    }

    public final <O> void zaB(@NonNull Field<Map<String, String>, O> field, @Nullable Map<String, String> map) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, map);
        } else {
            OooO0oo(field, map);
        }
    }

    public final <O> void zaC(@NonNull Field<ArrayList<String>, O> field, @Nullable ArrayList<String> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooO(field, arrayList);
        }
    }

    public final <O> void zaa(@NonNull Field<BigDecimal, O> field, @Nullable BigDecimal bigDecimal) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, bigDecimal);
        } else {
            OooOOO0(field, bigDecimal);
        }
    }

    public final <O> void zac(@NonNull Field<ArrayList<BigDecimal>, O> field, @Nullable ArrayList<BigDecimal> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOOO(field, arrayList);
        }
    }

    public final <O> void zae(@NonNull Field<BigInteger, O> field, @Nullable BigInteger bigInteger) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, bigInteger);
        } else {
            OooOOOO(field, bigInteger);
        }
    }

    public final <O> void zag(@NonNull Field<ArrayList<BigInteger>, O> field, @Nullable ArrayList<BigInteger> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOOOo(field, arrayList);
        }
    }

    public final <O> void zai(@NonNull Field<Boolean, O> field, boolean z) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, Boolean.valueOf(z));
        } else {
            OooO0OO(field, z);
        }
    }

    public final <O> void zaj(@NonNull Field<ArrayList<Boolean>, O> field, @Nullable ArrayList<Boolean> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOOo0(field, arrayList);
        }
    }

    public final <O> void zal(@NonNull Field<byte[], O> field, @Nullable byte[] bArr) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, bArr);
        } else {
            OooO0Oo(field, bArr);
        }
    }

    public final <O> void zam(@NonNull Field<Double, O> field, double d) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, Double.valueOf(d));
        } else {
            OooOOo(field, d);
        }
    }

    public final <O> void zao(@NonNull Field<ArrayList<Double>, O> field, @Nullable ArrayList<Double> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOo00(field, arrayList);
        }
    }

    public final <O> void zaq(@NonNull Field<Float, O> field, float f) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, Float.valueOf(f));
        } else {
            OooOo0(field, f);
        }
    }

    public final <O> void zas(@NonNull Field<ArrayList<Float>, O> field, @Nullable ArrayList<Float> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOo(field, arrayList);
        }
    }

    public final <O> void zau(@NonNull Field<Integer, O> field, int i) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, Integer.valueOf(i));
        } else {
            OooO0o0(i, field);
        }
    }

    public final <O> void zav(@NonNull Field<ArrayList<Integer>, O> field, @Nullable ArrayList<Integer> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOoO0(field, arrayList);
        }
    }

    public final <O> void zax(@NonNull Field<Long, O> field, long j) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, Long.valueOf(j));
        } else {
            OooO0o(field, j);
        }
    }

    public final <O> void zay(@NonNull Field<ArrayList<Long>, O> field, @Nullable ArrayList<Long> arrayList) {
        if (field.f14731OooOOO != null) {
            OooOO0(field, arrayList);
        } else {
            OooOoOO(field, arrayList);
        }
    }

    @VisibleForTesting
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NonNull
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        public final String f14722OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        public final int f14723OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        public final boolean f14724OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        public final int f14725OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        public final int f14726OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        public final boolean f14727OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        public final int f14728OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final Class<? extends FastJsonResponse> f14729OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        public final String f14730OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        public final FieldConverter<I, O> f14731OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public zan f14732OooOOO0;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @Nullable @SafeParcelable.Param(id = 8) String str2, @Nullable @SafeParcelable.Param(id = 9) zaa zaaVar) {
            this.f14723OooO0Oo = i;
            this.f14725OooO0o0 = i2;
            this.f14724OooO0o = z;
            this.f14726OooO0oO = i3;
            this.f14727OooO0oo = z2;
            this.f14722OooO = str;
            this.f14728OooOO0 = i4;
            if (str2 == null) {
                this.f14729OooOO0O = null;
                this.f14730OooOO0o = null;
            } else {
                this.f14729OooOO0O = SafeParcelResponse.class;
                this.f14730OooOO0o = str2;
            }
            if (zaaVar == null) {
                this.f14731OooOOO = null;
            } else {
                this.f14731OooOOO = (FieldConverter<I, O>) zaaVar.zab();
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
            return this.f14728OooOO0;
        }

        @NonNull
        public final String toString() {
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.f14723OooO0Oo)).add("typeIn", Integer.valueOf(this.f14725OooO0o0)).add("typeInArray", Boolean.valueOf(this.f14724OooO0o)).add("typeOut", Integer.valueOf(this.f14726OooO0oO)).add("typeOutArray", Boolean.valueOf(this.f14727OooO0oo)).add("outputFieldName", this.f14722OooO).add("safeParcelFieldId", Integer.valueOf(this.f14728OooOO0));
            String str = this.f14730OooOO0o;
            if (str == null) {
                str = null;
            }
            Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("concreteTypeName", str);
            Class<? extends FastJsonResponse> cls = this.f14729OooOO0O;
            if (cls != null) {
                toStringHelperAdd2.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f14731OooOOO;
            if (fieldConverter != null) {
                toStringHelperAdd2.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.f14723OooO0Oo);
            SafeParcelWriter.writeInt(parcel, 2, this.f14725OooO0o0);
            SafeParcelWriter.writeBoolean(parcel, 3, this.f14724OooO0o);
            SafeParcelWriter.writeInt(parcel, 4, this.f14726OooO0oO);
            SafeParcelWriter.writeBoolean(parcel, 5, this.f14727OooO0oo);
            SafeParcelWriter.writeString(parcel, 6, this.f14722OooO, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            String str = this.f14730OooOO0o;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.writeString(parcel, 8, str, false);
            FieldConverter<I, O> fieldConverter = this.f14731OooOOO;
            SafeParcelWriter.writeParcelable(parcel, 9, fieldConverter != null ? zaa.zaa(fieldConverter) : null, i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        @NonNull
        public final Field<I, O> zab() {
            int i = this.f14723OooO0Oo;
            int i2 = this.f14725OooO0o0;
            boolean z = this.f14724OooO0o;
            int i3 = this.f14726OooO0oO;
            boolean z2 = this.f14727OooO0oo;
            String str = this.f14722OooO;
            int i4 = this.f14728OooOO0;
            String str2 = this.f14730OooOO0o;
            FieldConverter<I, O> fieldConverter = this.f14731OooOOO;
            return new Field<>(i, i2, z, i3, z2, str, i4, str2, fieldConverter == null ? null : zaa.zaa(fieldConverter));
        }

        @NonNull
        public final FastJsonResponse zad() throws IllegalAccessException, InstantiationException {
            Class<? extends FastJsonResponse> cls = this.f14729OooOO0O;
            Preconditions.checkNotNull(cls);
            if (cls != SafeParcelResponse.class) {
                return cls.newInstance();
            }
            String str = this.f14730OooOO0o;
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(this.f14732OooOOO0, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.f14732OooOOO0, str);
        }

        @NonNull
        public final O zae(@Nullable I i) {
            FieldConverter<I, O> fieldConverter = this.f14731OooOOO;
            Preconditions.checkNotNull(fieldConverter);
            return (O) Preconditions.checkNotNull(fieldConverter.zac(i));
        }

        @NonNull
        public final I zaf(@NonNull O o) {
            FieldConverter<I, O> fieldConverter = this.f14731OooOOO;
            Preconditions.checkNotNull(fieldConverter);
            return fieldConverter.zad(o);
        }

        @NonNull
        public final Map<String, Field<?, ?>> zah() {
            String str = this.f14730OooOO0o;
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(this.f14732OooOOO0);
            return (Map) Preconditions.checkNotNull(this.f14732OooOOO0.zab(str));
        }

        public final void zai(zan zanVar) {
            this.f14732OooOOO0 = zanVar;
        }

        public final boolean zaj() {
            return this.f14731OooOOO != null;
        }

        public Field(int i, boolean z, int i2, boolean z2, @NonNull String str, int i3, @Nullable Class<? extends FastJsonResponse> cls, @Nullable FieldConverter<I, O> fieldConverter) {
            this.f14723OooO0Oo = 1;
            this.f14725OooO0o0 = i;
            this.f14724OooO0o = z;
            this.f14726OooO0oO = i2;
            this.f14727OooO0oo = z2;
            this.f14722OooO = str;
            this.f14728OooOO0 = i3;
            this.f14729OooOO0O = cls;
            if (cls == null) {
                this.f14730OooOO0o = null;
            } else {
                this.f14730OooOO0o = cls.getCanonicalName();
            }
            this.f14731OooOOO = fieldConverter;
        }
    }
}
