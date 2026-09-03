package androidx.media;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f8579Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8580Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f8581Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f8582Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8583OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Bundle f8584OoooO00;

    public OooO0O0(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, int i, int i2, Bundle bundle) {
        this.f8583OoooO0 = oooOOO0;
        this.f8580Oooo0o = oooOOO;
        this.f8581Oooo0oO = str;
        this.f8582Oooo0oo = i;
        this.f8579Oooo = i2;
        this.f8584OoooO00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.this.f8559Oooo0oO.remove(((MediaBrowserServiceCompat.OooOOOO) this.f8580Oooo0o).OooO00o());
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f8581Oooo0oO;
        int i = this.f8582Oooo0oo;
        int i2 = this.f8579Oooo;
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            new o000oOoO(str, i, i2);
        }
        Objects.requireNonNull(MediaBrowserServiceCompat.this);
        MediaBrowserServiceCompat.this.OooO00o();
        Objects.requireNonNull(MediaBrowserServiceCompat.this);
        Log.i("MBServiceCompat", "No root for client " + this.f8581Oooo0oO + " from service " + OooO0O0.class.getName());
        try {
            ((MediaBrowserServiceCompat.OooOOOO) this.f8580Oooo0o).OooO0O0(2, null);
        } catch (RemoteException unused) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Calling onConnectFailed() failed. Ignoring. pkg=");
            sbOooO0o0.append(this.f8581Oooo0oO);
            Log.w("MBServiceCompat", sbOooO0o0.toString());
        }
    }
}
