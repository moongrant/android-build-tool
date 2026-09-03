package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import o0O0000O.OooOO0;
import o0O0000O.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public class CancellationTokenSource {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f16155OooO00o = new OooOO0();

    public void cancel() {
        o0O0O00 o0o0o00 = this.f16155OooO00o.f41602OooO00o;
        synchronized (o0o0o00.f41633OooO00o) {
            if (o0o0o00.f41635OooO0OO) {
                return;
            }
            o0o0o00.f41635OooO0OO = true;
            o0o0o00.f41638OooO0o0 = null;
            o0o0o00.f41634OooO0O0.OooO0O0(o0o0o00);
        }
    }

    @NonNull
    public CancellationToken getToken() {
        return this.f16155OooO00o;
    }
}
