package com.yalla.yalla.base.abs.AbsView;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import java.io.Serializable;
import p398o0Oo0O00.OooO0O0;
import p539o0o0OoOO.z0;
import p629o0ooO0O0.o0000;
import p629o0ooO0O0.o00000OO;
import p629o0ooO0O0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsView<Model, ListenerTag> implements Serializable, o00000OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View f22730OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000<ListenerTag> f22731OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Activity f22732OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0000Ooo<Model, ListenerTag> f22733OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Model f22734OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f22735OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Context f22736OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO0O0 f22737OooOO0O = null;

    public AbsView(Activity activity) {
        this.f22732OooO0o = activity;
        this.f22736OooOO0 = activity.getBaseContext();
        this.f22730OooO = LayoutInflater.from(activity).inflate(OooO0OO(), (ViewGroup) null);
        OooO0o();
        OooO0Oo();
    }

    public final View OooO00o(@IdRes int i) {
        return z0.OooO00o(this.f22730OooO, i, null);
    }

    public final View OooO0O0(@IdRes int i) {
        View view = this.f22730OooO;
        if (this.f22737OooOO0O == null) {
            this.f22737OooOO0O = new OooO0O0(this);
        }
        return z0.OooO00o(view, i, this.f22737OooOO0O);
    }

    public abstract int OooO0OO();

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    /* JADX WARN: Multi-variable type inference failed */
    public void OooO0oO(Object obj) {
        this.f22734OooO0oO = obj;
        this.f22735OooO0oo = -1;
    }
}
