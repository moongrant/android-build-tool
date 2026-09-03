package p016OooOoOO;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00Ooo extends o0OoOo0 implements OooO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public WeakReference<View> f294OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f295OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ActionBarContextView f296OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OoOo0.OooO00o f297OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f298OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO f299OooOO0O;

    public o00Ooo(Context context, ActionBarContextView actionBarContextView, o0OoOo0.OooO00o oooO00o) {
        this.f295OooO0o = context;
        this.f296OooO0oO = actionBarContextView;
        this.f297OooO0oo = oooO00o;
        OooO oooO = new OooO(actionBarContextView.getContext());
        oooO.f2582OooOO0o = 1;
        this.f299OooOO0O = oooO;
        oooO.f2577OooO0o0 = this;
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooO() {
        this.f297OooO0oo.OooO00o(this, this.f299OooOO0O);
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final boolean OooO00o(@NonNull OooO oooO, @NonNull MenuItem menuItem) {
        return this.f297OooO0oo.OooO0OO(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final void OooO0O0(@NonNull OooO oooO) {
        OooO();
        ActionMenuPresenter actionMenuPresenter = this.f296OooO0oO.f2959OooO0oO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooOOOO();
        }
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooO0OO() {
        if (this.f298OooOO0) {
            return;
        }
        this.f298OooOO0 = true;
        this.f297OooO0oo.OooO0O0(this);
    }

    @Override // p016OooOoOO.o0OoOo0
    public final View OooO0Oo() {
        WeakReference<View> weakReference = this.f294OooO;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p016OooOoOO.o0OoOo0
    public final MenuInflater OooO0o() {
        return new o00oO0o(this.f296OooO0oO.getContext());
    }

    @Override // p016OooOoOO.o0OoOo0
    public final OooO OooO0o0() {
        return this.f299OooOO0O;
    }

    @Override // p016OooOoOO.o0OoOo0
    public final CharSequence OooO0oO() {
        return this.f296OooO0oO.getSubtitle();
    }

    @Override // p016OooOoOO.o0OoOo0
    public final CharSequence OooO0oo() {
        return this.f296OooO0oO.getTitle();
    }

    @Override // p016OooOoOO.o0OoOo0
    public final boolean OooOO0() {
        return this.f296OooO0oO.f2714OooOo0O;
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooOO0O(View view) {
        this.f296OooO0oO.setCustomView(view);
        this.f294OooO = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooOO0o(int i) {
        OooOOO0(this.f295OooO0o.getString(i));
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooOOO(int i) {
        OooOOOO(this.f295OooO0o.getString(i));
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooOOO0(CharSequence charSequence) {
        this.f296OooO0oO.setSubtitle(charSequence);
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooOOOO(CharSequence charSequence) {
        this.f296OooO0oO.setTitle(charSequence);
    }

    @Override // p016OooOoOO.o0OoOo0
    public final void OooOOOo(boolean z) {
        this.f342OooO0o0 = z;
        this.f296OooO0oO.setTitleOptional(z);
    }
}
