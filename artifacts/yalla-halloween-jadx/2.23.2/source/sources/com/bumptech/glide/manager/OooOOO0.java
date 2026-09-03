package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p160o00OoOOO.o000000;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(26)
public final class OooOOO0 implements OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Activity> f13112OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile boolean f13113OooO0O0;

    public class OooO00o implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f13114OooO0Oo;

        /* JADX INFO: renamed from: com.bumptech.glide.manager.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0194OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f13116OooO0Oo;

            public RunnableC0194OooO00o(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f13116OooO0Oo = onDrawListener;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o000000 o000000VarOooO00o = o000000.OooO00o();
                o000000VarOooO00o.getClass();
                o00OO0O0.OooO00o();
                o000000VarOooO00o.f38061OooO0Oo.set(true);
                OooOOO0.this.f13113OooO0O0 = true;
                View view = OooO00o.this.f13114OooO0Oo;
                view.getViewTreeObserver().removeOnDrawListener(this.f13116OooO0Oo);
                OooOOO0.this.f13112OooO00o.clear();
            }
        }

        public OooO00o(View view) {
            this.f13114OooO0Oo = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            o00OO0O0.OooO0o0().post(new RunnableC0194OooO00o(this));
        }
    }

    @Override // com.bumptech.glide.manager.OooOOO
    public final void OooO00o(Activity activity) {
        if (!this.f13113OooO0O0 && this.f13112OooO00o.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new OooO00o(decorView));
        }
    }
}
