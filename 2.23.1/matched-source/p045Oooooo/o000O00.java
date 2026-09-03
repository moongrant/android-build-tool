package p045Oooooo;

import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o00000OO;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o000000O;
import p110o000ooo0.o00000O;
import p110o000ooo0.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1957OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f1956OooO0Oo = i;
        this.f1957OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        int i = this.f1956OooO0Oo;
        Object obj = this.f1957OooO0o0;
        switch (i) {
            case 0:
                ((o00Oo0) obj).OooO0OO();
                return;
            case 1:
                o00000O this$0 = (o00000O) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    o0O0O00 o0o0o00 = this$0.f35872OooO0o;
                    if (o0o0o00 != null) {
                        this$0.f35871OooO0Oo = o0o0o00.OooO0o(this$0.f35874OooO0oO, this$0.f35868OooO00o);
                        o000000O o000000o2 = this$0.f35869OooO0O0;
                        o000000O.OooO0OO oooO0OO = this$0.f35873OooO0o0;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("observer");
                            oooO0OO = null;
                        }
                        o000000o2.OooO00o(oooO0OO);
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
                o00000OO o00000oo2 = FirebaseMessaging.f19763OooOOO0;
                FirebaseMessaging.OooO00o oooO00o = firebaseMessaging.f19772OooO0oO;
                synchronized (oooO00o) {
                    oooO00o.OooO00o();
                    Boolean bool = oooO00o.f19778OooO0OO;
                    zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f19766OooO00o.OooO0oo();
                }
                if (zBooleanValue) {
                    firebaseMessaging.OooO();
                    return;
                }
                return;
        }
    }
}
