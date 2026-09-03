package com.facebook.appevents;

import android.content.SharedPreferences;
import com.google.firebase.messaging.o00000OO;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13641OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f13640OooO0Oo = i;
        this.f13641OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13640OooO0Oo) {
            case 0:
                AppEventQueue.m4060flush$lambda2((FlushReason) this.f13641OooO0o0);
                return;
            default:
                o00000OO o00000oo2 = (o00000OO) this.f13641OooO0o0;
                synchronized (o00000oo2.f19840OooO0Oo) {
                    SharedPreferences.Editor editorEdit = o00000oo2.f19837OooO00o.edit();
                    String str = o00000oo2.f19838OooO0O0;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = o00000oo2.f19840OooO0Oo.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(o00000oo2.f19839OooO0OO);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
        }
    }
}
