package p112o000oooo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class oO0O00O<T> extends oO0O00o0<T> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f30045OooO0oo = o0OoOo0.OooO0o0("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f30046OooO0oO;

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                oO0O00O.this.OooO0oO(intent);
            }
        }
    }

    public oO0O00O(@NonNull Context context, @NonNull o00O000.OooO00o oooO00o) {
        super(context, oooO00o);
        this.f30046OooO0oO = new OooO00o();
    }

    @Override // p112o000oooo.oO0O00o0
    public final void OooO0Oo() {
        o0OoOo0.OooO0OO().OooO00o(f30045OooO0oo, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f30050OooO0O0.registerReceiver(this.f30046OooO0oO, OooO0o());
    }

    public abstract IntentFilter OooO0o();

    @Override // p112o000oooo.oO0O00o0
    public final void OooO0o0() {
        o0OoOo0.OooO0OO().OooO00o(f30045OooO0oo, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f30050OooO0O0.unregisterReceiver(this.f30046OooO0oO);
    }

    public abstract void OooO0oO(@NonNull Intent intent);
}
