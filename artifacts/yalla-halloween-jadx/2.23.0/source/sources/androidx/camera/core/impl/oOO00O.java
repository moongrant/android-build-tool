package androidx.camera.core.impl;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oOO00O<T> extends o00OO00O<T> {
    public final void OooO0o0(@Nullable androidx.camera.video.OooO0o oooO0o) {
        Iterator<o00OO00O.OooO0O0<T>> it;
        int i;
        synchronized (this.f3729OooO00o) {
            if (Objects.equals(this.f3730OooO0O0.getAndSet(oooO0o), oooO0o)) {
                return;
            }
            int i2 = this.f3731OooO0OO + 1;
            this.f3731OooO0OO = i2;
            if (this.f3732OooO0Oo) {
                return;
            }
            this.f3732OooO0Oo = true;
            Iterator<o00OO00O.OooO0O0<T>> it2 = this.f3733OooO0o.iterator();
            while (true) {
                if (it2.hasNext()) {
                    it2.next().OooO00o(i2);
                } else {
                    synchronized (this.f3729OooO00o) {
                        if (this.f3731OooO0OO == i2) {
                            this.f3732OooO0Oo = false;
                            return;
                        } else {
                            it = this.f3733OooO0o.iterator();
                            i = this.f3731OooO0OO;
                        }
                    }
                    it2 = it;
                    i2 = i;
                }
            }
        }
    }
}
