package com.squareup.okhttp;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayDeque f21101OooO00o;

    public OooOo() {
        new ArrayDeque();
        new ArrayDeque();
        this.f21101OooO00o = new ArrayDeque();
    }

    public final synchronized void OooO00o(OooOO0 oooOO1) {
        this.f21101OooO00o.add(oooOO1);
    }

    public final synchronized void OooO0O0(OooOO0 oooOO1) {
        if (!this.f21101OooO00o.remove(oooOO1)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
