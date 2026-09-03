package com.app.base.framework.abs.AbsView;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import java.io.Serializable;
import o00Oo00.OooO00o;
import o00Oo00.OooO0O0;
import o00Oo00.OooO0OO;
import p147o00Oo00o.o0Oo0oo;
import p148o00Oo0O.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsView<Model, ListenerTag> implements Serializable, OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Model f11708Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0OO<ListenerTag> f11709Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO0O0<Model, ListenerTag> f11710Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Activity f11711Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public LayoutInflater f11712OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f11713OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f11714OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Context f11715OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public o0Oo0oo f11716OoooOO0 = null;

    public AbsView(Activity activity) {
        this.f11711Oooo0oo = activity;
        this.f11715OoooO0O = activity.getBaseContext();
        this.f11712OoooO = LayoutInflater.from(activity);
        this.f11713OoooO0 = this.f11712OoooO.inflate(OooO0OO(), (ViewGroup) null);
        OooO0o();
        OooO0Oo();
    }

    public final View OooO00o(@IdRes int i) {
        return o00Oo0.OooO00o(this.f11713OoooO0, i, null);
    }

    public final View OooO0O0(@IdRes int i) {
        View view = this.f11713OoooO0;
        if (this.f11716OoooOO0 == null) {
            this.f11716OoooOO0 = new o0Oo0oo(this);
        }
        return o00Oo0.OooO00o(view, i, this.f11716OoooOO0);
    }

    public abstract int OooO0OO();

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public final void OooO0oO(ListenerTag listenertag) {
        OooO0OO<ListenerTag> oooO0OO = this.f11709Oooo0o;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(listenertag);
        }
    }

    public void OooO0oo(Model model, int i) {
        this.f11708Oooo = model;
        this.f11714OoooO00 = -1;
    }
}
