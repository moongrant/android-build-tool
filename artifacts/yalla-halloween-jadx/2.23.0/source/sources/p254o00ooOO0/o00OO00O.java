package p254o00ooOO0;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f40972OooO0Oo;

    public o00OO00O(o00OO0O0 o00oo0o1) {
        this.f40972OooO0Oo = o00oo0o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = this.f40972OooO0Oo.f40973OooO00o.f14883OooO0o0;
        client.disconnect(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
