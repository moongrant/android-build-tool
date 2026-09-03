package p334o0OO00o;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzfq;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Bundle f37420OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Context f37421OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ zzee f37422OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.f37422OoooO0O = zzeeVar;
        this.f37421OoooO00 = context;
        this.f37420OoooO0 = bundle;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() {
        zzcc zzccVarAsInterface;
        try {
            Preconditions.checkNotNull(this.f37421OoooO00);
            zzee zzeeVar = this.f37422OoooO0O;
            Context context = this.f37421OoooO00;
            Objects.requireNonNull(zzeeVar);
            try {
                zzccVarAsInterface = zzcb.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e) {
                zzeeVar.OooO00o(e, true, false);
                zzccVarAsInterface = null;
            }
            zzeeVar.f15923OooO0oo = zzccVarAsInterface;
            if (this.f37422OoooO0O.f15923OooO0oo == null) {
                Objects.requireNonNull(this.f37422OoooO0O);
                Log.w("FA", "Failed to connect to measurement client.");
            } else {
                int localVersion = DynamiteModule.getLocalVersion(this.f37421OoooO00, ModuleDescriptor.MODULE_ID);
                int remoteVersion = DynamiteModule.getRemoteVersion(this.f37421OoooO00, ModuleDescriptor.MODULE_ID);
                ((zzcc) Preconditions.checkNotNull(this.f37422OoooO0O.f15923OooO0oo)).initialize(ObjectWrapper.wrap(this.f37421OoooO00), new zzcl(73000L, Math.max(localVersion, remoteVersion), remoteVersion < localVersion, null, null, null, this.f37420OoooO0, zzfq.zza(this.f37421OoooO00)), this.f37305Oooo0o);
            }
        } catch (Exception e2) {
            this.f37422OoooO0O.OooO00o(e2, true, false);
        }
    }
}
