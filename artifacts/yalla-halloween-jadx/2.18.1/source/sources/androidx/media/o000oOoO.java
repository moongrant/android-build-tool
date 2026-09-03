package androidx.media;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaSessionManager.RemoteUserInfo f8617OooO00o;

    public o000oOoO(String str, int i, int i2) {
        this.f8617OooO00o = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000oOoO) {
            return this.f8617OooO00o.equals(((o000oOoO) obj).f8617OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return o000OO0O.OooO0OO.OooO0O0(this.f8617OooO00o);
    }
}
