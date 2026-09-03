package p147o00Oo00o;

import android.app.Activity;
import android.view.View;
import androidx.annotation.IdRes;
import o00Oo00.OooO00o;
import o00Oo00.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class oo0o0Oo<Model, Tag> implements OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0O0<Model, Tag> f32160Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f32161Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Activity f32162Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Model f32163Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o0OO00O f32164OoooO00;

    public oo0o0Oo(Activity activity, int i) {
        this.f32162Oooo0oO = activity;
        View viewFindViewById = activity.findViewById(i);
        this.f32161Oooo0o = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
        }
        OooO0OO();
        OooO0O0();
    }

    public final View OooO00o(@IdRes int i) {
        return this.f32161Oooo0o.findViewById(i);
    }

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public final void OooO0Oo(int i) {
        View view = this.f32161Oooo0o;
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
