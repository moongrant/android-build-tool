package p256o00ooOO0;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f40295OooO0Oo;

    public o00OO0OO(oo0O oo0o) {
        this.f40295OooO0Oo = oo0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = this.f40295OooO0Oo.f40347OooO00o.f14407OooO0o0;
        client.disconnect(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
