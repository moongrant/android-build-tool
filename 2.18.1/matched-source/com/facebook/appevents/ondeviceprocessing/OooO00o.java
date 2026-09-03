package com.facebook.appevents.ondeviceprocessing;

import com.facebook.appevents.AppEvent;
import p357o0OOOo0O.o0000Ooo;
import p375o0OOo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12768Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12769Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12770Oooo0oo;

    public /* synthetic */ OooO00o(Object obj, Object obj2, int i) {
        this.f12768Oooo0o = i;
        this.f12769Oooo0oO = obj;
        this.f12770Oooo0oo = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12768Oooo0o) {
            case 0:
                OnDeviceProcessingManager.m155sendCustomEventAsync$lambda1((String) this.f12769Oooo0oO, (AppEvent) this.f12770Oooo0oo);
                return;
            default:
                o0000Ooo o0000ooo = (o0000Ooo) this.f12769Oooo0oO;
                o0OOO0o o0ooo0o2 = (o0OOO0o) this.f12770Oooo0oo;
                synchronized (o0000ooo) {
                    if (o0000ooo.f38349OooO0O0 == 0) {
                        o0000ooo.f38348OooO00o.add((o0OOO0o<T>) o0ooo0o2);
                    } else {
                        o0000ooo.f38349OooO0O0.add((T) o0ooo0o2.get());
                    }
                }
                return;
        }
    }
}
