package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p088o000o00.OooOO0;
import p381o0OOoOOO.o0O00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends Binder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f19196OooO00o;

    public interface OooO00o {
    }

    public OooO0O0(OooO00o oooO00o) {
        this.f19196OooO00o = oooO00o;
    }

    public final void OooO00o(OooO0OO.OooO00o oooO00o) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        OooO00o oooO00o2 = this.f19196OooO00o;
        EnhancedIntentService.this.processIntent(oooO00o.f19203OooO00o).addOnCompleteListener(OooOO0.f28598Oooo0o, new o0O00o0(oooO00o));
    }
}
