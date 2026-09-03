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
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzbo.zzd(parcelOooOOoo, bundle);
        OooOo0(parcelOooOOoo, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 43);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 20);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getSessionId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 46);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzcfVar);
        parcelOooOOoo.writeInt(i);
        OooOo0(parcelOooOOoo, 38);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        ClassLoader classLoader = zzbo.f15202OooO00o;
        parcelOooOOoo.writeInt(z ? 1 : 0);
        zzbo.zze(parcelOooOOoo, zzcfVar);
        OooOo0(parcelOooOOoo, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        zzbo.zzd(parcelOooOOoo, zzclVar);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzbo.zzd(parcelOooOOoo, bundle);
        parcelOooOOoo.writeInt(z ? 1 : 0);
        parcelOooOOoo.writeInt(z2 ? 1 : 0);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeInt(5);
        parcelOooOOoo.writeString(str);
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        zzbo.zze(parcelOooOOoo, iObjectWrapper2);
        zzbo.zze(parcelOooOOoo, iObjectWrapper3);
        OooOo0(parcelOooOOoo, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        zzbo.zzd(parcelOooOOoo, bundle);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 27);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 28);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 29);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 30);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        zzbo.zze(parcelOooOOoo, zzcfVar);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 26);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zzd(parcelOooOOoo, bundle);
        zzbo.zze(parcelOooOOoo, zzcfVar);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 32);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzciVar);
        OooOo0(parcelOooOOoo, 35);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 12);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zzd(parcelOooOOoo, bundle);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zzd(parcelOooOOoo, bundle);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 44);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zzd(parcelOooOOoo, bundle);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 45);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 15);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        ClassLoader classLoader = zzbo.f15202OooO00o;
        parcelOooOOoo.writeInt(z ? 1 : 0);
        OooOo0(parcelOooOOoo, 39);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zzd(parcelOooOOoo, bundle);
        OooOo0(parcelOooOOoo, 42);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzciVar);
        OooOo0(parcelOooOOoo, 34);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        ClassLoader classLoader = zzbo.f15202OooO00o;
        parcelOooOOoo.writeInt(z ? 1 : 0);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 14);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzbo.zze(parcelOooOOoo, iObjectWrapper);
        parcelOooOOoo.writeInt(z ? 1 : 0);
        parcelOooOOoo.writeLong(j);
        OooOo0(parcelOooOOoo, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelOooOOoo = OooOOoo();
        zzbo.zze(parcelOooOOoo, zzciVar);
        OooOo0(parcelOooOOoo, 36);
    }
}
