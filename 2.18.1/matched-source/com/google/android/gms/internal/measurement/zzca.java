package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzca extends zzbm implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeLong(j);
        OooOOo(23, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzbo.zze(parcelOooOOOo, bundle);
        OooOOo(9, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeLong(j);
        OooOOo(43, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeLong(j);
        OooOOo(24, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(22, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(20, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(19, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(10, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(17, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(16, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(21, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(6, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        parcelOooOOOo.writeInt(i);
        OooOOo(38, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzbo.zzd(parcelOooOOOo, z);
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        OooOOo(5, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        zzbo.zze(parcelOooOOOo, zzclVar);
        parcelOooOOOo.writeLong(j);
        OooOOo(1, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzbo.zze(parcelOooOOOo, bundle);
        zzbo.zzd(parcelOooOOOo, z);
        zzbo.zzd(parcelOooOOOo, z2);
        parcelOooOOOo.writeLong(j);
        OooOOo(2, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(5);
        parcelOooOOOo.writeString(str);
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        zzbo.zzf(parcelOooOOOo, iObjectWrapper2);
        zzbo.zzf(parcelOooOOOo, iObjectWrapper3);
        OooOOo(33, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        zzbo.zze(parcelOooOOOo, bundle);
        parcelOooOOOo.writeLong(j);
        OooOOo(27, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        parcelOooOOOo.writeLong(j);
        OooOOo(28, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        parcelOooOOOo.writeLong(j);
        OooOOo(29, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        parcelOooOOOo.writeLong(j);
        OooOOo(30, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        parcelOooOOOo.writeLong(j);
        OooOOo(31, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        parcelOooOOOo.writeLong(j);
        OooOOo(25, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        parcelOooOOOo.writeLong(j);
        OooOOo(26, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zze(parcelOooOOOo, bundle);
        zzbo.zzf(parcelOooOOOo, zzcfVar);
        parcelOooOOOo.writeLong(j);
        OooOOo(32, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzciVar);
        OooOOo(35, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeLong(j);
        OooOOo(12, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zze(parcelOooOOOo, bundle);
        parcelOooOOOo.writeLong(j);
        OooOOo(8, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zze(parcelOooOOOo, bundle);
        parcelOooOOOo.writeLong(j);
        OooOOo(44, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zze(parcelOooOOOo, bundle);
        parcelOooOOOo.writeLong(j);
        OooOOo(45, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeLong(j);
        OooOOo(15, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzd(parcelOooOOOo, z);
        OooOOo(39, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zze(parcelOooOOOo, bundle);
        OooOOo(42, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzciVar);
        OooOOo(34, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzd(parcelOooOOOo, z);
        parcelOooOOOo.writeLong(j);
        OooOOo(11, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeLong(j);
        OooOOo(14, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeLong(j);
        OooOOo(7, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzbo.zzf(parcelOooOOOo, iObjectWrapper);
        zzbo.zzd(parcelOooOOOo, z);
        parcelOooOOOo.writeLong(j);
        OooOOo(4, parcelOooOOOo);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        zzbo.zzf(parcelOooOOOo, zzciVar);
        OooOOo(36, parcelOooOOOo);
    }
}
