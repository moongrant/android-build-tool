package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator {
    public static void OooO00o(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getServiceRequest.f15064OooO0Oo);
        SafeParcelWriter.writeInt(parcel, 2, getServiceRequest.f15066OooO0o0);
        SafeParcelWriter.writeInt(parcel, 3, getServiceRequest.f15065OooO0o);
        SafeParcelWriter.writeString(parcel, 4, getServiceRequest.f15067OooO0oO, false);
        SafeParcelWriter.writeIBinder(parcel, 5, getServiceRequest.f15068OooO0oo, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, getServiceRequest.f15063OooO, i, false);
        SafeParcelWriter.writeBundle(parcel, 7, getServiceRequest.f15069OooOO0, false);
        SafeParcelWriter.writeParcelable(parcel, 8, getServiceRequest.f15070OooOO0O, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 10, getServiceRequest.f15071OooOO0o, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, getServiceRequest.f15073OooOOO0, i, false);
        SafeParcelWriter.writeBoolean(parcel, 12, getServiceRequest.f15072OooOOO);
        SafeParcelWriter.writeInt(parcel, 13, getServiceRequest.f15074OooOOOO);
        SafeParcelWriter.writeBoolean(parcel, 14, getServiceRequest.f15075OooOOOo);
        SafeParcelWriter.writeString(parcel, 15, getServiceRequest.zza(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Scope[] scopeArr = GetServiceRequest.f15061OooOOo;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f15062OooOOoo;
        Feature[] featureArr2 = featureArr;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String strCreateString = null;
        IBinder iBinder = null;
        Account account = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.createTypedArray(parcel, header, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.createTypedArray(parcel, header, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.createTypedArray(parcel, header, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GetServiceRequest(i, i2, i3, strCreateString, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, strCreateString2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
