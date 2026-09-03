package com.facebook.internal;

import android.content.SharedPreferences;
import java.io.File;
import java.util.Iterator;
import p383o0OOoOOO.o00OOO00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12839Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12840OoooO00;

    public /* synthetic */ OooOOO(Object obj, int i) {
        this.f12839Oooo = i;
        this.f12840OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12839Oooo) {
            case 0:
                FileLruCache.m184clearCache$lambda1((File[]) this.f12840OoooO00);
                return;
            default:
                o00OOO00 o00ooo01 = (o00OOO00) this.f12840OoooO00;
                synchronized (o00ooo01.f38803OooO0Oo) {
                    SharedPreferences.Editor editorEdit = o00ooo01.f38800OooO00o.edit();
                    String str = o00ooo01.f38801OooO0O0;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = o00ooo01.f38803OooO0Oo.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(o00ooo01.f38802OooO0OO);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
        }
    }
}
