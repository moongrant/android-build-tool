package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p351o0OOOOo.OooOOO;
import p356o0OOOo00.OooO0O0;
import p356o0OOOo00.OooO0OO;
import p357o0OOOo0O.o00000;
import p357o0OOOo0O.o00oO0o;
import p357o0OOOo0O.oo000o;
import p373o0OOo0o0.o0000;
import p373o0OOo0o0.o00000O;
import p373o0OOo0o0.o00000OO;
import p382o0OOoOo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static OooO0O0 lambda$getComponents$0(o00oO0o o00oo0o2) {
        OooOOO oooOOO = (OooOOO) o00oo0o2.OooO00o(OooOOO.class);
        Context context = (Context) o00oo0o2.OooO00o(Context.class);
        o0000 o0000Var = (o0000) o00oo0o2.OooO00o(o0000.class);
        Preconditions.checkNotNull(oooOOO);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(o0000Var);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (OooO0OO.f38315OooO0OO == null) {
            synchronized (OooO0OO.class) {
                if (OooO0OO.f38315OooO0OO == null) {
                    Bundle bundle = new Bundle(1);
                    if (oooOOO.OooO0oo()) {
                        o0000Var.OooO0O0(new Executor() { // from class: o0OOOo00.OooO0o
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new o00000OO() { // from class: o0OOOo00.OooO
                            @Override // p373o0OOo0o0.o00000OO
                            public final void OooO00o(o00000O o00000o) {
                                Objects.requireNonNull(o00000o);
                                throw null;
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", oooOOO.OooO0oO());
                    }
                    OooO0OO.f38315OooO0OO = new OooO0OO(zzee.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return OooO0OO.f38315OooO0OO;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<oo000o<?>> getComponents() {
        oo000o.OooO0O0 oooO0O0OooO00o = oo000o.OooO00o(OooO0O0.class);
        oooO0O0OooO00o.OooO00o(new o00000(OooOOO.class, 1, 0));
        oooO0O0OooO00o.OooO00o(new o00000(Context.class, 1, 0));
        oooO0O0OooO00o.OooO00o(new o00000(o0000.class, 1, 0));
        oooO0O0OooO00o.f38378OooO0o0 = com.android.billingclient.api.o0000.f11258OooO00o;
        oooO0O0OooO00o.OooO0OO();
        return Arrays.asList(oooO0O0OooO00o.OooO0O0(), o000000O.OooO00o("fire-analytics", "21.1.1"));
    }
}
