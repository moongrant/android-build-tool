package com.facebook.appevents.ondeviceprocessing;

import com.facebook.appevents.AppEvent;
import p358o0OOOo0O.o0000Ooo;
import p377o0OOo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12784Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12785OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12786OoooO00;

    public /* synthetic */ OooO00o(Object obj, Object obj2, int i) {
        this.f12784Oooo = i;
        this.f12786OoooO00 = obj;
        this.f12785OoooO0 = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12784Oooo) {
            case 0:
                OnDeviceProcessingManager.m155sendCustomEventAsync$lambda1((String) this.f12786OoooO00, (AppEvent) this.f12785OoooO0);
                return;
            default:
                o0000Ooo o0000ooo = (o0000Ooo) this.f12786OoooO00;
                o0OOO0o o0ooo0o2 = (o0OOO0o) this.f12785OoooO0;
                synchronized (o0000ooo) {
                    if (o0000ooo.f38369OooO0O0 == 0) {
                        o0000ooo.f38368OooO00o.add((o0OOO0o<T>) o0ooo0o2);
                    } else {
                        o0000ooo.f38369OooO0O0.add((T) o0ooo0o2.get());
                    }
                }
                return;
        }
    }
}
