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

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14746OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    public final int f14747OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f14748OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getParcel", id = 2)
    public final Parcel f14749OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    public final zan f14750OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f14751OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f14752OooOO0;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zanVar) {
        this.f14747OooO0Oo = i;
        this.f14749OooO0o0 = (Parcel) Preconditions.checkNotNull(parcel);
        this.f14748OooO0o = 2;
        this.f14750OooO0oO = zanVar;
        this.f14751OooO0oo = zanVar == null ? null : zanVar.zaa();
        this.f14746OooO = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOoo0(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        Iterator<String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            Class<? extends FastJsonResponse> cls2 = fieldMappings.get(it.next()).f14722OooOO0O;
            if (cls2 != null) {
                try {
                    OooOoo0(zanVar, cls2.newInstance());
                } catch (IllegalAccessException e) {
                    String strValueOf = String.valueOf(((Class) Preconditions.checkNotNull(cls2)).getCanonicalName());
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Could not access object of type ".concat(strValueOf) : new String("Could not access object of type "), e);
                } catch (InstantiationException e2) {
                    String strValueOf2 = String.valueOf(((Class) Preconditions.checkNotNull(cls2)).getCanonicalName());
                    throw new IllegalStateException(strValueOf2.length() != 0 ? "Could not instantiate an object of type ".concat(strValueOf2) : new String("Could not instantiate an object of type "), e2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    public static void OooOooO(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).getSafeParcelableFieldId(), entry);
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
                boolean zZaj = field.zaj();
                int i = field.f14719OooO0oO;
                if (zZaj) {
                    Object obj = field.f14724OooOOO;
                    switch (i) {
                        case 0:
                            Object objValueOf = Integer.valueOf(SafeParcelReader.readInt(parcel, header));
                            if (obj != null) {
                                objValueOf = field.zaf(objValueOf);
                            }
                            Oooo000(sb, field, objValueOf);
                            break;
                        case 1:
                            Object objCreateBigInteger = SafeParcelReader.createBigInteger(parcel, header);
                            if (obj != null) {
                                objCreateBigInteger = field.zaf(objCreateBigInteger);
                            }
                            Oooo000(sb, field, objCreateBigInteger);
                            break;
                        case 2:
                            Object objValueOf2 = Long.valueOf(SafeParcelReader.readLong(parcel, header));
                            if (obj != null) {
                                objValueOf2 = field.zaf(objValueOf2);
                            }
                            Oooo000(sb, field, objValueOf2);
                            break;
                        case 3:
                            Object objValueOf3 = Float.valueOf(SafeParcelReader.readFloat(parcel, header));
                            if (obj != null) {
                                objValueOf3 = field.zaf(objValueOf3);
                            }
                            Oooo000(sb, field, objValueOf3);
                            break;
                        case 4:
                            Object objValueOf4 = Double.valueOf(SafeParcelReader.readDouble(parcel, header));
                            if (obj != null) {
                                objValueOf4 = field.zaf(objValueOf4);
                            }
                            Oooo000(sb, field, objValueOf4);
                            break;
                        case 5:
                            Object objCreateBigDecimal = SafeParcelReader.createBigDecimal(parcel, header);
                            if (obj != null) {
                                objCreateBigDecimal = field.zaf(objCreateBigDecimal);
                            }
                            Oooo000(sb, field, objCreateBigDecimal);
                            break;
                        case 6:
                            Object objValueOf5 = Boolean.valueOf(SafeParcelReader.readBoolean(parcel, header));
                            if (obj != null) {
                                objValueOf5 = field.zaf(objValueOf5);
                            }
                            Oooo000(sb, field, objValueOf5);
                            break;
                        case 7:
                            Object objCreateString = SafeParcelReader.createString(parcel, header);
                            if (obj != null) {
                                objCreateString = field.zaf(objCreateString);
                            }
                            Oooo000(sb, field, objCreateString);
                            break;
                        case 8:
                        case 9:
                            Object objCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                            if (obj != null) {
                                objCreateByteArray = field.zaf(objCreateByteArray);
                            }
                            Oooo000(sb, field, objCreateByteArray);
                            break;
                        case 10:
                            Bundle bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            Object map2 = new HashMap();
                            for (String str2 : bundleCreateBundle.keySet()) {
                                map2.put(str2, (String) Preconditions.checkNotNull(bundleCreateBundle.getString(str2)));
                            }
                            if (obj != null) {
                                map2 = field.zaf(map2);
                            }
                            Oooo000(sb, field, map2);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(android.support.v4.media.session.OooO0OO.OooO00o(36, "Unknown field out type = ", i));
                    }
                } else if (field.f14720OooO0oo) {
                    sb.append("[");
                    switch (i) {
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
                                OooOooO(sb, field.zah(), parcelArrCreateParcelArray[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (i) {
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
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(JsonUtils.escapeString(bundleCreateBundle2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel parcelCreateParcel = SafeParcelReader.createParcel(parcel, header);
                            parcelCreateParcel.setDataPosition(0);
                            OooOooO(sb, field.zah(), parcelCreateParcel);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new SafeParcelReader.ParseException(android.support.v4.media.session.OooO0OO.OooO00o(37, "Overread allowed size end=", iValidateObjectHeader), parcel);
        }
        sb.append('}');
    }

    public static final void OooOooo(StringBuilder sb, int i, @Nullable Object obj) {
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
                throw new IllegalArgumentException(android.support.v4.media.session.OooO0OO.OooO00o(26, "Unknown type = ", i));
        }
    }

    public static final void Oooo000(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        boolean z = field.f14717OooO0o;
        int i = field.f14718OooO0o0;
        if (!z) {
            OooOooo(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            OooOooo(sb, i, arrayList.get(i2));
        }
        sb.append("]");
    }

    @NonNull
    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(@NonNull T t) {
        String str = (String) Preconditions.checkNotNull(t.getClass().getCanonicalName());
        zan zanVar = new zan(t.getClass());
        OooOoo0(zanVar, t);
        zanVar.zac();
        zanVar.zad();
        return new SafeParcelResponse(t, zanVar, str);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        SafeParcelWriter.writeStringArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0OO(@NonNull FastJsonResponse.Field field, boolean z) {
        OooOoo(field);
        SafeParcelWriter.writeBoolean(this.f14749OooO0o0, field.getSafeParcelableFieldId(), z);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0Oo(@NonNull FastJsonResponse.Field field, @Nullable byte[] bArr) {
        OooOoo(field);
        SafeParcelWriter.writeByteArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0o(@NonNull FastJsonResponse.Field field, long j) {
        OooOoo(field);
        SafeParcelWriter.writeLong(this.f14749OooO0o0, field.getSafeParcelableFieldId(), j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0o0(int i, @NonNull FastJsonResponse.Field field) {
        OooOoo(field);
        SafeParcelWriter.writeInt(this.f14749OooO0o0, field.getSafeParcelableFieldId(), i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0oO(@NonNull FastJsonResponse.Field field, @Nullable String str) {
        OooOoo(field);
        SafeParcelWriter.writeString(this.f14749OooO0o0, field.getSafeParcelableFieldId(), str, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooO0oo(@NonNull FastJsonResponse.Field field, @Nullable Map map) {
        OooOoo(field);
        Bundle bundle = new Bundle();
        for (String str : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        SafeParcelWriter.writeBundle(this.f14749OooO0o0, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOO(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        SafeParcelWriter.writeBigDecimalArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOO0(@NonNull FastJsonResponse.Field field, @Nullable BigDecimal bigDecimal) {
        OooOoo(field);
        SafeParcelWriter.writeBigDecimal(this.f14749OooO0o0, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOOO(@NonNull FastJsonResponse.Field field, @Nullable BigInteger bigInteger) {
        OooOoo(field);
        SafeParcelWriter.writeBigInteger(this.f14749OooO0o0, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOOo(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        SafeParcelWriter.writeBigIntegerArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOo0(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOOoo(@NonNull FastJsonResponse.Field field, double d) {
        OooOoo(field);
        SafeParcelWriter.writeDouble(this.f14749OooO0o0, field.getSafeParcelableFieldId(), d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOo0O(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOo0o(@NonNull FastJsonResponse.Field field, float f) {
        OooOoo(field);
        SafeParcelWriter.writeFloat(this.f14749OooO0o0, field.getSafeParcelableFieldId(), f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOoO(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        SafeParcelWriter.writeIntArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOoO0(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void OooOoOO(@NonNull FastJsonResponse.Field field, @Nullable ArrayList arrayList) {
        OooOoo(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        SafeParcelWriter.writeLongArray(this.f14749OooO0o0, field.getSafeParcelableFieldId(), jArr, true);
    }

    public final void OooOoo(FastJsonResponse.Field<?, ?> field) {
        if (field.f14721OooOO0 == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f14749OooO0o0;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.f14746OooO;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f14752OooOO0 = SafeParcelWriter.beginObjectHeader(parcel);
            this.f14746OooO = 1;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        OooOoo(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i)).zaE());
        }
        SafeParcelWriter.writeParcelList(this.f14749OooO0o0, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull FastJsonResponse.Field field, @NonNull String str, @NonNull T t) {
        OooOoo(field);
        Parcel parcelZaE = ((SafeParcelResponse) t).zaE();
        SafeParcelWriter.writeParcel(this.f14749OooO0o0, field.getSafeParcelableFieldId(), parcelZaE, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.f14750OooO0oO;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((String) Preconditions.checkNotNull(this.f14751OooO0oo));
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
        zan zanVar = this.f14750OooO0oO;
        Preconditions.checkNotNull(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelZaE = zaE();
        parcelZaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        OooOooO(sb, (Map) Preconditions.checkNotNull(zanVar.zab((String) Preconditions.checkNotNull(this.f14751OooO0oo))), parcelZaE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14747OooO0Oo);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f14748OooO0o != 0 ? this.f14750OooO0oO : null, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final Parcel zaE() {
        int i = this.f14746OooO;
        Parcel parcel = this.f14749OooO0o0;
        if (i == 0) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            this.f14752OooOO0 = iBeginObjectHeader;
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
            this.f14746OooO = 2;
        } else if (i == 1) {
            SafeParcelWriter.finishObjectHeader(parcel, this.f14752OooOO0);
            this.f14746OooO = 2;
        }
        return parcel;
    }

    public SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.f14747OooO0Oo = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.f14749OooO0o0 = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.f14748OooO0o = 1;
        this.f14750OooO0oO = (zan) Preconditions.checkNotNull(zanVar);
        this.f14751OooO0oo = (String) Preconditions.checkNotNull(str);
        this.f14746OooO = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.f14747OooO0Oo = 1;
        this.f14749OooO0o0 = Parcel.obtain();
        this.f14748OooO0o = 0;
        this.f14750OooO0oO = (zan) Preconditions.checkNotNull(zanVar);
        this.f14751OooO0oo = (String) Preconditions.checkNotNull(str);
        this.f14746OooO = 0;
    }
}
