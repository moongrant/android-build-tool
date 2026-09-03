package p330o0O0ooo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zaq;
import o00O00O.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"HandlerLeak"})
public final class o000O0o extends zaq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f37057OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f37057OooO0O0 = googleApiAvailability;
        this.f37056OooO00o = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            OooO0OO.OooO0O0(50, "Don't know how to handle this message: ", i, "GoogleApiAvailability");
            return;
        }
        int iIsGooglePlayServicesAvailable = this.f37057OooO0O0.isGooglePlayServicesAvailable(this.f37056OooO00o);
        if (this.f37057OooO0O0.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.f37057OooO0O0.showErrorNotification(this.f37056OooO00o, iIsGooglePlayServicesAvailable);
        }
    }
}
