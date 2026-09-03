package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends com.google.android.gms.internal.common.zzi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f15610OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f15610OooO00o = baseGmsClient;
    }

    public static final void OooO00o(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.OooO0O0();
        zzcVar.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0115  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f15610OooO00o.f15540OooOoo.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                OooO00o(message);
                return;
            }
            return;
        }
        int i2 = message.what;
        if (i2 != 1 && i2 != 7) {
            if (i2 == 4) {
                java.util.Objects.requireNonNull(this.f15610OooO00o);
            } else if (i2 == 5) {
            }
            if (!this.f15610OooO00o.isConnecting()) {
                OooO00o(message);
                return;
            }
        } else if (!this.f15610OooO00o.isConnecting()) {
            OooO00o(message);
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.f15610OooO00o.f15537OooOoO = new ConnectionResult(message.arg2);
            if (BaseGmsClient.OooOO0(this.f15610OooO00o)) {
                BaseGmsClient baseGmsClient = this.f15610OooO00o;
                if (!baseGmsClient.f15539OooOoOO) {
                    baseGmsClient.OooOO0O(3, null);
                    return;
                }
            }
            ConnectionResult connectionResult = this.f15610OooO00o.f15537OooOoO;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            this.f15610OooO00o.f15528OooOOOo.onReportServiceBinding(connectionResult);
            this.f15610OooO00o.OooO0o(connectionResult);
            return;
        }
        if (i3 == 5) {
            ConnectionResult connectionResult2 = this.f15610OooO00o.f15537OooOoO;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            this.f15610OooO00o.f15528OooOOOo.onReportServiceBinding(connectionResult2);
            this.f15610OooO00o.OooO0o(connectionResult2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f15610OooO00o.f15528OooOOOo.onReportServiceBinding(connectionResult3);
            this.f15610OooO00o.OooO0o(connectionResult3);
            return;
        }
        if (i3 == 6) {
            this.f15610OooO00o.OooOO0O(5, null);
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = this.f15610OooO00o.f15533OooOo0;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks.onConnectionSuspended(message.arg2);
            }
            BaseGmsClient baseGmsClient2 = this.f15610OooO00o;
            baseGmsClient2.f15514OooO00o = message.arg2;
            baseGmsClient2.f15515OooO0O0 = System.currentTimeMillis();
            BaseGmsClient.OooO(this.f15610OooO00o, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.f15610OooO00o.isConnected()) {
            OooO00o(message);
            return;
        }
        int i4 = message.what;
        if (i4 == 2 || i4 == 1 || i4 == 7) {
            ((zzc) message.obj).zze();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + i4, new Exception());
    }
}
