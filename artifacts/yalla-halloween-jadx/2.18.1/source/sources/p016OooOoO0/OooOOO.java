package p016OooOoO0;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOO extends OooOO0 implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ActionBarContextView f300Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Context f301Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO0o f302OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public WeakReference<View> f303OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooOO0.OooO00o f304OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f305OoooO0O;

    public OooOOO(Context context, ActionBarContextView actionBarContextView, OooOO0.OooO00o oooO00o) {
        this.f301Oooo0oo = context;
        this.f300Oooo = actionBarContextView;
        this.f304OoooO00 = oooO00o;
        OooO0o oooO0o = new OooO0o(actionBarContextView.getContext());
        oooO0o.f4716OooOO0o = 1;
        this.f302OoooO = oooO0o;
        oooO0o.f4711OooO0o0 = this;
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooO() {
        this.f304OoooO00.OooO00o(this, this.f302OoooO);
    }

    @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
    public final boolean OooO00o(@NonNull OooO0o oooO0o, @NonNull MenuItem menuItem) {
        return this.f304OoooO00.OooO0Oo(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
    public final void OooO0O0(@NonNull OooO0o oooO0o) {
        OooO();
        ActionMenuPresenter actionMenuPresenter = this.f300Oooo.f5062Oooo;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooOOOO();
        }
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooO0OO() {
        if (this.f305OoooO0O) {
            return;
        }
        this.f305OoooO0O = true;
        this.f304OoooO00.OooO0OO(this);
    }

    @Override // p016OooOoO0.OooOO0
    public final View OooO0Oo() {
        WeakReference<View> weakReference = this.f303OoooO0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p016OooOoO0.OooOO0
    public final MenuInflater OooO0o() {
        return new OooOo(this.f300Oooo.getContext());
    }

    @Override // p016OooOoO0.OooOO0
    public final Menu OooO0o0() {
        return this.f302OoooO;
    }

    @Override // p016OooOoO0.OooOO0
    public final CharSequence OooO0oO() {
        return this.f300Oooo.getSubtitle();
    }

    @Override // p016OooOoO0.OooOO0
    public final CharSequence OooO0oo() {
        return this.f300Oooo.getTitle();
    }

    @Override // p016OooOoO0.OooOO0
    public final boolean OooOO0() {
        return this.f300Oooo.f4816OooooOO;
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooOO0O(View view) {
        this.f300Oooo.setCustomView(view);
        this.f303OoooO0 = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooOO0o(int i) {
        this.f300Oooo.setSubtitle(this.f301Oooo0oo.getString(i));
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooOOO(int i) {
        this.f300Oooo.setTitle(this.f301Oooo0oo.getString(i));
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooOOO0(CharSequence charSequence) {
        this.f300Oooo.setSubtitle(charSequence);
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooOOOO(CharSequence charSequence) {
        this.f300Oooo.setTitle(charSequence);
    }

    @Override // p016OooOoO0.OooOO0
    public final void OooOOOo(boolean z) {
        this.f299Oooo0oO = z;
        this.f300Oooo.setTitleOptional(z);
    }
}
