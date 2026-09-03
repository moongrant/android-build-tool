package p331o0O0oooO;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0OOoo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f37157Oooo0o;

    public oo0OOoo(o0O0o000 o0o0o000) {
        this.f37157Oooo0o = o0o0o000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = this.f37157Oooo0o.f37106OooO00o.f15384OooO0O0;
        client.disconnect(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
