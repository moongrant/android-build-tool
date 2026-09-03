package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p256o00ooOO0.o0;
import p256o00ooOO0.o0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zak extends zap {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SparseArray<o0O0o> f14446OooO;

    public zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f14446OooO = new SparseArray<>();
        lifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment lifecycleFragmentOooO00o = LifecycleCallback.OooO00o(lifecycleActivity);
        zak zakVar = (zak) lifecycleFragmentOooO00o.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(lifecycleFragmentOooO00o);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0O0(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        o0O0o o0o0o = this.f14446OooO.get(i);
        if (o0o0o != null) {
            zae(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = o0o0o.f40326OooO0o;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO() {
        for (int i = 0; i < this.f14446OooO.size(); i++) {
            o0O0o o0o0oOooO0Oo = OooO0Oo(i);
            if (o0o0oOooO0Oo != null) {
                o0o0oOooO0Oo.f40327OooO0o0.connect();
            }
        }
    }

    @Nullable
    public final o0O0o OooO0Oo(int i) {
        SparseArray<o0O0o> sparseArray = this.f14446OooO;
        if (sparseArray.size() <= i) {
            return null;
        }
        return sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f14446OooO.size(); i++) {
            o0O0o o0o0oOooO0Oo = OooO0Oo(i);
            if (o0o0oOooO0Oo != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(o0o0oOooO0Oo.f40325OooO0Oo);
                printWriter.println(CertificateUtil.DELIMITER);
                o0o0oOooO0Oo.f40327OooO0o0.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        boolean z = this.f14453OooO0o0;
        String strValueOf = String.valueOf(this.f14446OooO);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(strValueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f14452OooO0o.get() == null) {
            for (int i = 0; i < this.f14446OooO.size(); i++) {
                o0O0o o0o0oOooO0Oo = OooO0Oo(i);
                if (o0o0oOooO0Oo != null) {
                    o0o0oOooO0Oo.f40327OooO0o0.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.f14446OooO.size(); i++) {
            o0O0o o0o0oOooO0Oo = OooO0Oo(i);
            if (o0o0oOooO0Oo != null) {
                o0o0oOooO0Oo.f40327OooO0o0.disconnect();
            }
        }
    }

    public final void zad(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.f14446OooO.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        o0 o0Var = this.f14452OooO0o.get();
        boolean z2 = this.f14453OooO0o0;
        String strValueOf = String.valueOf(o0Var);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb2.append(z2);
        sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb2.append(strValueOf);
        Log.d("AutoManageHelper", sb2.toString());
        o0O0o o0o0o = new o0O0o(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(o0o0o);
        this.f14446OooO.put(i, o0o0o);
        if (this.f14453OooO0o0 && o0Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        SparseArray<o0O0o> sparseArray = this.f14446OooO;
        o0O0o o0o0o = sparseArray.get(i);
        sparseArray.remove(i);
        if (o0o0o != null) {
            GoogleApiClient googleApiClient = o0o0o.f40327OooO0o0;
            googleApiClient.unregisterConnectionFailedListener(o0o0o);
            googleApiClient.disconnect();
        }
    }
}
