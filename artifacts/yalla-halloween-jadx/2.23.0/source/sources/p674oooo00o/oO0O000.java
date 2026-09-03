package p674oooo00o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p084o000Ooo0.o000oOoO;
import p096o000o0o0.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class oO0O000<T> extends oO0O000o<T> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f60977OooO0oo = o000oOoO.OooO0o0("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f60978OooO0oO;

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                oO0O000.this.OooO0oO(intent);
            }
        }
    }

    public oO0O000(@NonNull Context context, @NonNull o0000O0 o0000o1) {
        super(context, o0000o1);
        this.f60978OooO0oO = new OooO00o();
    }

    @Override // p674oooo00o.oO0O000o
    public final void OooO0Oo() {
        o000oOoO.OooO0OO().OooO00o(f60977OooO0oo, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f60982OooO0O0.registerReceiver(this.f60978OooO0oO, OooO0o());
    }

    public abstract IntentFilter OooO0o();

    @Override // p674oooo00o.oO0O000o
    public final void OooO0o0() {
        o000oOoO.OooO0OO().OooO00o(f60977OooO0oo, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f60982OooO0O0.unregisterReceiver(this.f60978OooO0oO);
    }

    public abstract void OooO0oO(@NonNull Intent intent);
}
