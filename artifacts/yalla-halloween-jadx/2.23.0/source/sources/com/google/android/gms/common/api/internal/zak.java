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
import p254o00ooOO0.o0oOOo;
import p254o00ooOO0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class zak extends zap {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SparseArray<oo00oO> f14922OooO;

    public zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f14922OooO = new SparseArray<>();
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
        oo00oO oo00oo = this.f14922OooO.get(i);
        if (oo00oo != null) {
            zae(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = oo00oo.f41014OooO0o;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO() {
        for (int i = 0; i < this.f14922OooO.size(); i++) {
            oo00oO oo00ooOooO0Oo = OooO0Oo(i);
            if (oo00ooOooO0Oo != null) {
                oo00ooOooO0Oo.f41015OooO0o0.connect();
            }
        }
    }

    @Nullable
    public final oo00oO OooO0Oo(int i) {
        SparseArray<oo00oO> sparseArray = this.f14922OooO;
        if (sparseArray.size() <= i) {
            return null;
        }
        return sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f14922OooO.size(); i++) {
            oo00oO oo00ooOooO0Oo = OooO0Oo(i);
            if (oo00ooOooO0Oo != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(oo00ooOooO0Oo.f41013OooO0Oo);
                printWriter.println(CertificateUtil.DELIMITER);
                oo00ooOooO0Oo.f41015OooO0o0.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        boolean z = this.f14929OooO0o0;
        String strValueOf = String.valueOf(this.f14922OooO);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(strValueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f14928OooO0o.get() == null) {
            for (int i = 0; i < this.f14922OooO.size(); i++) {
                oo00oO oo00ooOooO0Oo = OooO0Oo(i);
                if (oo00ooOooO0Oo != null) {
                    oo00ooOooO0Oo.f41015OooO0o0.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.f14922OooO.size(); i++) {
            oo00oO oo00ooOooO0Oo = OooO0Oo(i);
            if (oo00ooOooO0Oo != null) {
                oo00ooOooO0Oo.f41015OooO0o0.disconnect();
            }
        }
    }

    public final void zad(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.f14922OooO.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        o0oOOo o0oooo = this.f14928OooO0o.get();
        boolean z2 = this.f14929OooO0o0;
        String strValueOf = String.valueOf(o0oooo);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb2.append(z2);
        sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb2.append(strValueOf);
        Log.d("AutoManageHelper", sb2.toString());
        oo00oO oo00oo = new oo00oO(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(oo00oo);
        this.f14922OooO.put(i, oo00oo);
        if (this.f14929OooO0o0 && o0oooo == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        SparseArray<oo00oO> sparseArray = this.f14922OooO;
        oo00oO oo00oo = sparseArray.get(i);
        sparseArray.remove(i);
        if (oo00oo != null) {
            GoogleApiClient googleApiClient = oo00oo.f41015OooO0o0;
            googleApiClient.unregisterConnectionFailedListener(oo00oo);
            googleApiClient.disconnect();
        }
    }
}
