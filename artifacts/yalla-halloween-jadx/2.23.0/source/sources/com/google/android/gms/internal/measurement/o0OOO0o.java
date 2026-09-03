package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f15578OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f15579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Context f15580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Bundle f15581OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ zzef f15582OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(zzef zzefVar, String str, String str2, Context context, Bundle bundle) {
        super(zzefVar, true);
        this.f15582OooOO0o = zzefVar;
        this.f15579OooO0oo = str;
        this.f15578OooO = str2;
        this.f15580OooOO0 = context;
        this.f15581OooOO0O = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() {
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        try {
            zzef zzefVar = this.f15582OooOO0o;
            String str4 = this.f15579OooO0oo;
            String str5 = this.f15578OooO;
            zzefVar.getClass();
            if (str5 == null || str4 == null) {
                z = false;
            } else {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzef.class.getClassLoader());
                    z2 = true;
                } catch (ClassNotFoundException unused) {
                    z2 = false;
                }
                if (z2) {
                    z = false;
                } else {
                    z = true;
                }
            }
            zzcc zzccVarAsInterface = null;
            if (z) {
                str3 = this.f15578OooO;
                str2 = this.f15579OooO0oo;
                str = this.f15582OooOO0o.f15683OooO00o;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.f15580OooOO0);
            zzef zzefVar2 = this.f15582OooOO0o;
            Context context = this.f15580OooOO0;
            zzefVar2.getClass();
            try {
                zzccVarAsInterface = zzcb.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e) {
                zzefVar2.OooO00o(e, true, false);
            }
            zzefVar2.f15682OooO = zzccVarAsInterface;
            if (this.f15582OooOO0o.f15682OooO == null) {
                Log.w(this.f15582OooOO0o.f15683OooO00o, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.f15580OooOO0, ModuleDescriptor.MODULE_ID);
            int remoteVersion = DynamiteModule.getRemoteVersion(this.f15580OooOO0, ModuleDescriptor.MODULE_ID);
            ((zzcc) Preconditions.checkNotNull(this.f15582OooOO0o.f15682OooO)).initialize(ObjectWrapper.wrap(this.f15580OooOO0), new zzcl(79000L, Math.max(localVersion, remoteVersion), remoteVersion < localVersion, str, str2, str3, this.f15581OooOO0O, com.google.android.gms.measurement.internal.zzfv.zza(this.f15580OooOO0)), this.f15452OooO0Oo);
        } catch (Exception e2) {
            this.f15582OooOO0o.OooO00o(e2, true, false);
        }
    }
}
