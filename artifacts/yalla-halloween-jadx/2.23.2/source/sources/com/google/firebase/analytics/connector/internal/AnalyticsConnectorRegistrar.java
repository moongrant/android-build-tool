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
import com.google.firebase.components.Oooo000;
import java.util.Arrays;
import java.util.List;
import o0O0OOO0.OooO;
import o0O0OOO0.OooO00o;
import o0O0o00O.OooO0o;
import p315o0O0oOo.o000OO;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static OooO00o lambda$getComponents$0(OooO0OO oooO0OO) {
        o0OOO0o o0ooo0o2 = (o0OOO0o) oooO0OO.OooO00o(o0OOO0o.class);
        Context context = (Context) oooO0OO.OooO00o(Context.class);
        OooO0o oooO0o = (OooO0o) oooO0OO.OooO00o(OooO0o.class);
        Preconditions.checkNotNull(o0ooo0o2);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(oooO0o);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (o0O0OOO0.OooO0OO.f41371OooO0OO == null) {
            synchronized (o0O0OOO0.OooO0OO.class) {
                if (o0O0OOO0.OooO0OO.f41371OooO0OO == null) {
                    Bundle bundle = new Bundle(1);
                    o0ooo0o2.OooO00o();
                    if ("[DEFAULT]".equals(o0ooo0o2.f57663OooO0O0)) {
                        oooO0o.OooO00o(o0O0OOO0.OooO0o.f41374OooO0Oo, OooO.f41355OooO00o);
                        bundle.putBoolean("dataCollectionDefaultEnabled", o0ooo0o2.OooO0oo());
                    }
                    o0O0OOO0.OooO0OO.f41371OooO0OO = new o0O0OOO0.OooO0OO(zzef.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return o0O0OOO0.OooO0OO.f41371OooO0OO;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(OooO00o.class);
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0OOO0o.class));
        OooO00o2.OooO00o(Oooo000.OooO0O0(Context.class));
        OooO00o2.OooO00o(Oooo000.OooO0O0(OooO0o.class));
        OooO00o2.f19331OooO0o = o0O0OOO.OooO00o.f41344OooO0Oo;
        OooO00o2.OooO0OO(2);
        return Arrays.asList(OooO00o2.OooO0O0(), o000OO.OooO00o("fire-analytics", "21.3.0"));
    }
}
