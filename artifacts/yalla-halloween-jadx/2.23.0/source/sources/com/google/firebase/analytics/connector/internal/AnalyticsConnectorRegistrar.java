package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.OooOo;
import java.util.Arrays;
import java.util.List;
import o0O0OO0O.OooO;
import o0O0OO0O.OooO00o;
import o0O0o000.OooO0o;
import p281o0O0O0oO.OooOO0;
import p314o0O0oOo0.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static OooO00o lambda$getComponents$0(OooO0OO oooO0OO) {
        OooOO0 oooOO1 = (OooOO0) oooO0OO.OooO00o(OooOO0.class);
        Context context = (Context) oooO0OO.OooO00o(Context.class);
        OooO0o oooO0o = (OooO0o) oooO0OO.OooO00o(OooO0o.class);
        Preconditions.checkNotNull(oooOO1);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(oooO0o);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (o0O0OO0O.OooO0OO.f42004OooO0OO == null) {
            synchronized (o0O0OO0O.OooO0OO.class) {
                if (o0O0OO0O.OooO0OO.f42004OooO0OO == null) {
                    Bundle bundle = new Bundle(1);
                    oooOO1.OooO00o();
                    if ("[DEFAULT]".equals(oooOO1.f41950OooO0O0)) {
                        oooO0o.OooO0O0(o0O0OO0O.OooO0o.f42007OooO0Oo, OooO.f41988OooO00o);
                        bundle.putBoolean("dataCollectionDefaultEnabled", oooOO1.OooO0oo());
                    }
                    o0O0OO0O.OooO0OO.f42004OooO0OO = new o0O0OO0O.OooO0OO(zzef.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return o0O0OO0O.OooO0OO.f42004OooO0OO;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(OooO00o.class);
        OooO00o2.OooO00o(OooOo.OooO0O0(OooOO0.class));
        OooO00o2.OooO00o(OooOo.OooO0O0(Context.class));
        OooO00o2.OooO00o(OooOo.OooO0O0(OooO0o.class));
        OooO00o2.f19805OooO0o = o0O0OO.OooO00o.f41976OooO0Oo;
        OooO00o2.OooO0OO(2);
        return Arrays.asList(OooO00o2.OooO0O0(), o000O0Oo.OooO00o("fire-analytics", "21.3.0"));
    }
}
