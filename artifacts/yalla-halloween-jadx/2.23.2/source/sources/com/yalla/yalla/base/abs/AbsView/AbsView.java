package com.yalla.yalla.base.abs.AbsView;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import java.io.Serializable;
import p400o0Oo0O0.OooOO0O;
import p400o0Oo0O0.OooOOO;
import p400o0Oo0O0.OooOOO0;
import p402o0Oo0O0O.o0000;
import p587o0oOooOO.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsView<Model, ListenerTag> implements Serializable, OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View f22257OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO<ListenerTag> f22258OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Activity f22259OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOOO0<Model, ListenerTag> f22260OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Model f22261OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f22262OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Context f22263OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o0000 f22264OooOO0O = null;

    public AbsView(Activity activity) {
        this.f22259OooO0o = activity;
        this.f22263OooOO0 = activity.getBaseContext();
        this.f22257OooO = LayoutInflater.from(activity).inflate(OooO0OO(), (ViewGroup) null);
        OooO0o();
        OooO0Oo();
    }

    public final View OooO00o(@IdRes int i) {
        return u.OooO00o(this.f22257OooO, i, null);
    }

    public final View OooO0O0(@IdRes int i) {
        View view = this.f22257OooO;
        if (this.f22264OooOO0O == null) {
            this.f22264OooOO0O = new o0000(this);
        }
        return u.OooO00o(view, i, this.f22264OooOO0O);
    }

    public abstract int OooO0OO();

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    /* JADX WARN: Multi-variable type inference failed */
    public void OooO0oO(Object obj) {
        this.f22261OooO0oO = obj;
        this.f22262OooO0oo = -1;
    }
}
