package com.facebook.internal;

import android.content.SharedPreferences;
import java.io.File;
import java.util.Iterator;
import p381o0OOoOOO.o00OOO00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12823Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12824Oooo0oO;

    public /* synthetic */ OooOOO(Object obj, int i) {
        this.f12823Oooo0o = i;
        this.f12824Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12823Oooo0o) {
            case 0:
                FileLruCache.m184clearCache$lambda1((File[]) this.f12824Oooo0oO);
                return;
            default:
                o00OOO00 o00ooo01 = (o00OOO00) this.f12824Oooo0oO;
                synchronized (o00ooo01.f38783OooO0Oo) {
                    SharedPreferences.Editor editorEdit = o00ooo01.f38780OooO00o.edit();
                    String str = o00ooo01.f38781OooO0O0;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = o00ooo01.f38783OooO0Oo.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(o00ooo01.f38782OooO0OO);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
        }
    }
}
