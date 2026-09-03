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
import p331o0O0oooO.o0OO0O0;
import p331o0O0oooO.o0OOooO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zak extends zap {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final SparseArray<o0OO0O0> f15424OoooO0;

    public zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f15424OoooO0 = new SparseArray<>();
        lifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment lifecycleFragmentOooO00o = LifecycleCallback.OooO00o(lifecycleActivity);
        zak zakVar = (zak) lifecycleFragmentOooO00o.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(lifecycleFragmentOooO00o);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0OO(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        o0OO0O0 o0oo0o1 = this.f15424OoooO0.get(i);
        if (o0oo0o1 != null) {
            zae(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = o0oo0o1.f37125OooO0OO;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void OooO0Oo() {
        for (int i = 0; i < this.f15424OoooO0.size(); i++) {
            o0OO0O0 o0oo0o0OooO0o = OooO0o(i);
            if (o0oo0o0OooO0o != null) {
                o0oo0o0OooO0o.f37124OooO0O0.connect();
            }
        }
    }

    @Nullable
    public final o0OO0O0 OooO0o(int i) {
        if (this.f15424OoooO0.size() <= i) {
            return null;
        }
        SparseArray<o0OO0O0> sparseArray = this.f15424OoooO0;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f15424OoooO0.size(); i++) {
            o0OO0O0 o0oo0o0OooO0o = OooO0o(i);
            if (o0oo0o0OooO0o != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(o0oo0o0OooO0o.f37123OooO00o);
                printWriter.println(CertificateUtil.DELIMITER);
                o0oo0o0OooO0o.f37124OooO0O0.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        boolean z = this.f15431Oooo0oO;
        String strValueOf = String.valueOf(this.f15424OoooO0);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(strValueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f15432Oooo0oo.get() == null) {
            for (int i = 0; i < this.f15424OoooO0.size(); i++) {
                o0OO0O0 o0oo0o0OooO0o = OooO0o(i);
                if (o0oo0o0OooO0o != null) {
                    o0oo0o0OooO0o.f37124OooO0O0.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.f15424OoooO0.size(); i++) {
            o0OO0O0 o0oo0o0OooO0o = OooO0o(i);
            if (o0oo0o0OooO0o != null) {
                o0oo0o0OooO0o.f37124OooO0O0.disconnect();
            }
        }
    }

    public final void zad(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.f15424OoooO0.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        o0OOooO0 o0ooooo1 = this.f15432Oooo0oo.get();
        boolean z2 = this.f15431Oooo0oO;
        String strValueOf = String.valueOf(o0ooooo1);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb2.append(z2);
        sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb2.append(strValueOf);
        Log.d("AutoManageHelper", sb2.toString());
        o0OO0O0 o0oo0o1 = new o0OO0O0(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(o0oo0o1);
        this.f15424OoooO0.put(i, o0oo0o1);
        if (this.f15431Oooo0oO && o0ooooo1 == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        o0OO0O0 o0oo0o1 = this.f15424OoooO0.get(i);
        this.f15424OoooO0.remove(i);
        if (o0oo0o1 != null) {
            o0oo0o1.f37124OooO0O0.unregisterConnectionFailedListener(o0oo0o1);
            o0oo0o1.f37124OooO0O0.disconnect();
        }
    }
}
