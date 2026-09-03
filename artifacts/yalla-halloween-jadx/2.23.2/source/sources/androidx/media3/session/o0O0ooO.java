package androidx.media3.session;

import androidx.media3.common.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO implements com.google.common.util.concurrent.OooO0OO<SessionResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f9482OooO00o;

    public o0O0ooO(String str) {
        this.f9482OooO00o = str;
    }

    @Override // com.google.common.util.concurrent.OooO0OO
    public final void OooO00o(Throwable th) {
        Log.OooO0oO("MediaNtfMng", "custom command " + this.f9482OooO00o + " produced an error: " + th.getMessage(), th);
    }

    @Override // com.google.common.util.concurrent.OooO0OO
    public final /* bridge */ /* synthetic */ void onSuccess(SessionResult sessionResult) {
    }
}
