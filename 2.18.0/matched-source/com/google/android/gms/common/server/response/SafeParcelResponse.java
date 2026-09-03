package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p266o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    public final int f15747Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public final String f15748OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f15749OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getParcel", id = 2)
    public final Parcel f15750OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    public final zan f15751OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f15752OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f15753o000oOoO;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zanVar) {
        this.f15747Oooo = i;
        this.f15750OoooO00 = (Parcel) Preconditions.checkNotNull(parcel);
        this.f15749OoooO0 = 2;
        this.f15751OoooO0O = zanVar;
        this.f15748OoooO = zanVar == null ? null : zanVar.zaa();
        this.f15752OoooOO0 = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOoO(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        Iterator<String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            Class<? extends FastJsonResponse> cls2 = field.f15722OoooOOO;
            if (cls2 != null) {
                try {
                    OooOoO(zanVar, cls2.newInstance());
                } catch (IllegalAccessException e) {
                    String strValueOf = String.valueOf(((Class) Preconditions.checkNotNull(field.f15722OoooOOO)).getCanonicalName());
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Could not access object of type ".concat(strValueOf) : new String("Could not access object of type "), e);
                } catch (InstantiationException e2) {
                    String strValueOf2 = String.valueOf(((Class) Preconditions.checkNotNull(field.f15722OoooOOO)).getCanonicalName());
                    throw new IllegalStateException(strValueOf2.length() != 0 ? "Could not instantiate an object of type ".concat(strValueOf2) : new String("Could not instantiate an object of type "), e2);
                }
            }
        }
    }

    public static final void OooOooO(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(Oooo0.OooO00o(26, "Unknown type = ", i));
        }
    }

    public static final void OooOooo(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (!field.f15718OoooO0) {
            OooOooO(sb, field.f15719OoooO00, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            OooOooO(sb, field.f15719OoooO00, arrayList.get(i));
        }
        sb.append("]");
    }

    @NonNull
    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(@NonNull T t) {
        String str = (String) Preconditions.checkNotNull(t.getClass().getCanonicalName());
        zan zanVar = new zan(t.getClass());
        OooOoO(zanVar, t);
        zanVar.zac();
        zanVar.zad();
        return new SafeParcelResponse(t, zanVar, str);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        SafeParcelWriter.writeStringArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0OO(@NonNull FastJsonResponse.Field field, boolean z) {
        OooOoOO(field);
        SafeParcelWriter.writeBoolean(this.f15750OoooO00, field.getSafeParcelableFieldId(), z);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0Oo(@NonNull FastJsonResponse.Field field, @Nullable byte[] bArr) {
        OooOoOO(field);
        SafeParcelWriter.writeByteArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0o(@NonNull FastJsonResponse.Field field, long j) {
        OooOoOO(field);
        SafeParcelWriter.writeLong(this.f15750OoooO00, field.getSafeParcelableFieldId(), j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0o0(@NonNull FastJsonResponse.Field field, int i) {
        OooOoOO(field);
        SafeParcelWriter.writeInt(this.f15750OoooO00, field.getSafeParcelableFieldId(), i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0oO(@NonNull FastJsonResponse.Field field, @Nullable String str) {
        OooOoOO(field);
        SafeParcelWriter.writeString(this.f15750OoooO00, field.getSafeParcelableFieldId(), str, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0oo(@NonNull FastJsonResponse.Field field, @Nullable Map map) {
        OooOoOO(field);
        Bundle bundle = new Bundle();
        for (String str : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        SafeParcelWriter.writeBundle(this.f15750OoooO00, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOO(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        SafeParcelWriter.writeBigDecimalArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOO0(@NonNull FastJsonResponse.Field field, @Nullable BigDecimal bigDecimal) {
        OooOoOO(field);
        SafeParcelWriter.writeBigDecimal(this.f15750OoooO00, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOOO(@NonNull FastJsonResponse.Field field, @Nullable BigInteger bigInteger) {
        OooOoOO(field);
        SafeParcelWriter.writeBigInteger(this.f15750OoooO00, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOOo(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        SafeParcelWriter.writeBigIntegerArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOo(@NonNull FastJsonResponse.Field field, double d) {
        OooOoOO(field);
        SafeParcelWriter.writeDouble(this.f15750OoooO00, field.getSafeParcelableFieldId(), d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOo0(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOo(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        SafeParcelWriter.writeIntArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOo0(@NonNull FastJsonResponse.Field field, float f) {
        OooOoOO(field);
        SafeParcelWriter.writeFloat(this.f15750OoooO00, field.getSafeParcelableFieldId(), f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOo00(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOo0o(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOoO0(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoOO(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        SafeParcelWriter.writeLongArray(this.f15750OoooO00, field.getSafeParcelableFieldId(), jArr, true);
    }

    public final void OooOoOO(FastJsonResponse.Field<?, ?> field) {
        if (field.f15726o000oOoO == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f15750OoooO00;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.f15752OoooOO0;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f15753o000oOoO = SafeParcelWriter.beginObjectHeader(parcel);
            this.f15752OoooOO0 = 1;
        }
    }

    public final void OooOoo0(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().getSafeParcelableFieldId(), entry);
        }
        sb.append('{');
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(header));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.zaj()) {
                    int i = field.f15720OoooO0O;
                    switch (i) {
                        case 0:
                            Object objValueOf = Integer.valueOf(SafeParcelReader.readInt(parcel, header));
                            if (field.f15725OoooOoO != null) {
                                objValueOf = field.zaf(objValueOf);
                            }
                            OooOooo(sb, field, objValueOf);
                            break;
                        case 1:
                            Object objCreateBigInteger = SafeParcelReader.createBigInteger(parcel, header);
                            if (field.f15725OoooOoO != null) {
                                objCreateBigInteger = field.zaf(objCreateBigInteger);
                            }
                            OooOooo(sb, field, objCreateBigInteger);
                            break;
                        case 2:
                            Object objValueOf2 = Long.valueOf(SafeParcelReader.readLong(parcel, header));
                            if (field.f15725OoooOoO != null) {
                                objValueOf2 = field.zaf(objValueOf2);
                            }
                            OooOooo(sb, field, objValueOf2);
                            break;
                        case 3:
                            Object objValueOf3 = Float.valueOf(SafeParcelReader.readFloat(parcel, header));
                            if (field.f15725OoooOoO != null) {
                                objValueOf3 = field.zaf(objValueOf3);
                            }
                            OooOooo(sb, field, objValueOf3);
                            break;
                        case 4:
                            Object objValueOf4 = Double.valueOf(SafeParcelReader.readDouble(parcel, header));
                            if (field.f15725OoooOoO != null) {
                                objValueOf4 = field.zaf(objValueOf4);
                            }
                            OooOooo(sb, field, objValueOf4);
                            break;
                        case 5:
                            Object objCreateBigDecimal = SafeParcelReader.createBigDecimal(parcel, header);
                            if (field.f15725OoooOoO != null) {
                                objCreateBigDecimal = field.zaf(objCreateBigDecimal);
                            }
                            OooOooo(sb, field, objCreateBigDecimal);
                            break;
                        case 6:
                            Object objValueOf5 = Boolean.valueOf(SafeParcelReader.readBoolean(parcel, header));
                            if (field.f15725OoooOoO != null) {
                                objValueOf5 = field.zaf(objValueOf5);
                            }
                            OooOooo(sb, field, objValueOf5);
                            break;
                        case 7:
                            Object objCreateString = SafeParcelReader.createString(parcel, header);
                            if (field.f15725OoooOoO != null) {
                                objCreateString = field.zaf(objCreateString);
                            }
                            OooOooo(sb, field, objCreateString);
                            break;
                        case 8:
                        case 9:
                            Object objCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                            if (field.f15725OoooOoO != null) {
                                objCreateByteArray = field.zaf(objCreateByteArray);
                            }
                            OooOooo(sb, field, objCreateByteArray);
                            break;
                        case 10:
                            Bundle bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleCreateBundle.keySet()) {
                                map2.put(str2, (String) Preconditions.checkNotNull(bundleCreateBundle.getString(str2)));
                            }
                            Object objZaf = map2;
                            if (field.f15725OoooOoO != null) {
                                objZaf = field.zaf(map2);
                            }
                            OooOooo(sb, field, objZaf);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(Oooo0.OooO00o(36, "Unknown field out type = ", i));
                    }
                } else if (field.f15717OoooO) {
                    sb.append("[");
                    switch (field.f15720OoooO0O) {
                        case 0:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createIntArray(parcel, header));
                            break;
                        case 1:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBigIntegerArray(parcel, header));
                            break;
                        case 2:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createLongArray(parcel, header));
                            break;
                        case 3:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createFloatArray(parcel, header));
                            break;
                        case 4:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createDoubleArray(parcel, header));
                            break;
                        case 5:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBigDecimalArray(parcel, header));
                            break;
                        case 6:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBooleanArray(parcel, header));
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb, SafeParcelReader.createStringArray(parcel, header));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] parcelArrCreateParcelArray = SafeParcelReader.createParcelArray(parcel, header);
                            int length = parcelArrCreateParcelArray.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                parcelArrCreateParcelArray[i2].setDataPosition(0);
                                OooOoo0(sb, field.zah(), parcelArrCreateParcelArray[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f15720OoooO0O) {
                        case 0:
                            sb.append(SafeParcelReader.readInt(parcel, header));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.createBigInteger(parcel, header));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.readLong(parcel, header));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.readFloat(parcel, header));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.readDouble(parcel, header));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.createBigDecimal(parcel, header));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.readBoolean(parcel, header));
                            break;
                        case 7:
                            String strCreateString = SafeParcelReader.createString(parcel, header);
                            sb.append("\"");
                            sb.append(JsonUtils.escapeString(strCreateString));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(Base64Utils.encode(bArrCreateByteArray));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe(bArrCreateByteArray2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                            Set<String> setKeySet = bundleCreateBundle2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                p710oo000o.Oooo0.OooO00o(sb, "\"", str3, "\":\"");
                                sb.append(JsonUtils.escapeString(bundleCreateBundle2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel parcelCreateParcel = SafeParcelReader.createParcel(parcel, header);
                            parcelCreateParcel.setDataPosition(0);
                            OooOoo0(sb, field.zah(), parcelCreateParcel);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new SafeParcelReader.ParseException(Oooo0.OooO00o(37, "Overread allowed size end=", iValidateObjectHeader), parcel);
        }
        sb.append('}');
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        OooOoOO(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i)).zaE());
        }
        SafeParcelWriter.writeParcelList(this.f15750OoooO00, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @NonNull T t) {
        OooOoOO(field);
        SafeParcelWriter.writeParcel(this.f15750OoooO00, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t).zaE(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.f15751OoooO0O;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((String) Preconditions.checkNotNull(this.f15748OoooO));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final Object getValueObject(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final String toString() {
        Preconditions.checkNotNull(this.f15751OoooO0O, "Cannot convert to JSON on client side.");
        Parcel parcelZaE = zaE();
        parcelZaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        OooOoo0(sb, (Map) Preconditions.checkNotNull(this.f15751OoooO0O.zab((String) Preconditions.checkNotNull(this.f15748OoooO))), parcelZaE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zan zanVar;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15747Oooo);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        int i2 = this.f15749OoooO0;
        if (i2 != 0) {
            zanVar = i2 != 1 ? this.f15751OoooO0O : this.f15751OoooO0O;
        } else {
            zanVar = null;
        }
        SafeParcelWriter.writeParcelable(parcel, 3, zanVar, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final Parcel zaE() {
        int i = this.f15752OoooOO0;
        if (i == 0) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(this.f15750OoooO00);
            this.f15753o000oOoO = iBeginObjectHeader;
            SafeParcelWriter.finishObjectHeader(this.f15750OoooO00, iBeginObjectHeader);
            this.f15752OoooOO0 = 2;
        } else if (i == 1) {
            SafeParcelWriter.finishObjectHeader(this.f15750OoooO00, this.f15753o000oOoO);
            this.f15752OoooOO0 = 2;
        }
        return this.f15750OoooO00;
    }

    public SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.f15747Oooo = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.f15750OoooO00 = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.f15749OoooO0 = 1;
        this.f15751OoooO0O = (zan) Preconditions.checkNotNull(zanVar);
        this.f15748OoooO = (String) Preconditions.checkNotNull(str);
        this.f15752OoooOO0 = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.f15747Oooo = 1;
        this.f15750OoooO00 = Parcel.obtain();
        this.f15749OoooO0 = 0;
        this.f15751OoooO0O = (zan) Preconditions.checkNotNull(zanVar);
        this.f15748OoooO = (String) Preconditions.checkNotNull(str);
        this.f15752OoooOO0 = 0;
    }
}
