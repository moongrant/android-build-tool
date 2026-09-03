package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends Binder {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f20362OooO0Oo;

    public interface OooO00o {
    }

    public o000Oo0(EnhancedIntentService.OooO00o oooO00o) {
        this.f20362OooO0Oo = oooO00o;
    }

    public final void OooO00o(final o000O0.OooO00o oooO00o) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        EnhancedIntentService.this.processIntent(oooO00o.f20348OooO00o).addOnCompleteListener(new o000O0Oo.OooO(), new OnCompleteListener() { // from class: com.google.firebase.messaging.o000O0o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                oooO00o.f20349OooO0O0.trySetResult(null);
            }
        });
    }
}
