package com.bumptech.glide.manager;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<o00OO.OooO0OO> f10073OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet f10074OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f10075OooO0OO;

    public final boolean OooO00o(@Nullable o00OO.OooO0OO oooO0OO) {
        boolean z = true;
        if (oooO0OO == null) {
            return true;
        }
        boolean zRemove = this.f10073OooO00o.remove(oooO0OO);
        if (!this.f10074OooO0O0.remove(oooO0OO) && !zRemove) {
            z = false;
        }
        if (z) {
            oooO0OO.clear();
        }
        return z;
    }

    public final void OooO0O0() {
        for (o00OO.OooO0OO oooO0OO : o0000oo.OooO0Oo(this.f10073OooO00o)) {
            if (!oooO0OO.OooO0oo() && !oooO0OO.OooO0o()) {
                oooO0OO.clear();
                if (this.f10075OooO0OO) {
                    this.f10074OooO0O0.add(oooO0OO);
                } else {
                    oooO0OO.OooOO0();
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f10073OooO00o.size() + ", isPaused=" + this.f10075OooO0OO + "}";
    }
}
