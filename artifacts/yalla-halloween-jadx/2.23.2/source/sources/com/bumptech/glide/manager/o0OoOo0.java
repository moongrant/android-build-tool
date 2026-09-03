package com.bumptech.glide.manager;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<p170o00Ooo0o.Oooo0> f13153OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet f13154OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f13155OooO0OO;

    public final boolean OooO00o(@Nullable p170o00Ooo0o.Oooo0 oooo0) {
        boolean z = true;
        if (oooo0 == null) {
            return true;
        }
        boolean zRemove = this.f13153OooO00o.remove(oooo0);
        if (!this.f13154OooO0O0.remove(oooo0) && !zRemove) {
            z = false;
        }
        if (z) {
            oooo0.clear();
        }
        return z;
    }

    public final void OooO0O0() {
        for (p170o00Ooo0o.Oooo0 oooo0 : o00OO0O0.OooO0Oo(this.f13153OooO00o)) {
            if (!oooo0.OooO0Oo() && !oooo0.OooO0OO()) {
                oooo0.clear();
                if (this.f13155OooO0OO) {
                    this.f13154OooO0O0.add(oooo0);
                } else {
                    oooo0.OooOO0();
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f13153OooO00o.size() + ", isPaused=" + this.f13155OooO0OO + "}";
    }
}
