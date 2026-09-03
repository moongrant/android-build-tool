package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca extends zzbm implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzbo.zzd(parcelOooOOo, bundle);
        OooOo00(parcelOooOOo, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 43);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 20);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getSessionId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 46);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzcfVar);
        parcelOooOOo.writeInt(i);
        OooOo00(parcelOooOOo, 38);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        ClassLoader classLoader = zzbo.f15671OooO00o;
        parcelOooOOo.writeInt(z ? 1 : 0);
        zzbo.zze(parcelOooOOo, zzcfVar);
        OooOo00(parcelOooOOo, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        zzbo.zzd(parcelOooOOo, zzclVar);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzbo.zzd(parcelOooOOo, bundle);
        parcelOooOOo.writeInt(z ? 1 : 0);
        parcelOooOOo.writeInt(z2 ? 1 : 0);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeInt(5);
        parcelOooOOo.writeString(str);
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        zzbo.zze(parcelOooOOo, iObjectWrapper2);
        zzbo.zze(parcelOooOOo, iObjectWrapper3);
        OooOo00(parcelOooOOo, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        zzbo.zzd(parcelOooOOo, bundle);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 27);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 28);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 29);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 30);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        zzbo.zze(parcelOooOOo, zzcfVar);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 26);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zzd(parcelOooOOo, bundle);
        zzbo.zze(parcelOooOOo, zzcfVar);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 32);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzciVar);
        OooOo00(parcelOooOOo, 35);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 12);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zzd(parcelOooOOo, bundle);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zzd(parcelOooOOo, bundle);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 44);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zzd(parcelOooOOo, bundle);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 45);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 15);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        ClassLoader classLoader = zzbo.f15671OooO00o;
        parcelOooOOo.writeInt(z ? 1 : 0);
        OooOo00(parcelOooOOo, 39);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zzd(parcelOooOOo, bundle);
        OooOo00(parcelOooOOo, 42);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzciVar);
        OooOo00(parcelOooOOo, 34);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        ClassLoader classLoader = zzbo.f15671OooO00o;
        parcelOooOOo.writeInt(z ? 1 : 0);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 14);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzbo.zze(parcelOooOOo, iObjectWrapper);
        parcelOooOOo.writeInt(z ? 1 : 0);
        parcelOooOOo.writeLong(j);
        OooOo00(parcelOooOOo, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOo = OooOOo();
        zzbo.zze(parcelOooOOo, zzciVar);
        OooOo00(parcelOooOOo, 36);
    }
}
