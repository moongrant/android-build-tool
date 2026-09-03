package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class oo0o0Oo extends androidx.activity.OooOo implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AppCompatDelegateImpl f2490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OO00O f2491OooO0o0;

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.appcompat.app.o0OO00O] */
    public oo0o0Oo(@NonNull Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f2491OooO0o0 = new androidx.core.view.o0OoOo0.OooO00o() { // from class: androidx.appcompat.app.o0OO00O
            @Override // androidx.core.view.o0OoOo0.OooO00o
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f2488OooO0Oo.OooO0o(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateOooO0o0 = OooO0o0();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((AppCompatDelegateImpl) appCompatDelegateOooO0o0).f2335OoooOOo = i;
        appCompatDelegateOooO0o0.OooOOOO();
    }

    @Override // androidx.appcompat.app.OooO
    @Nullable
    public final void OooO00o() {
    }

    @Override // androidx.appcompat.app.OooO
    public final void OooO0O0() {
    }

    @Override // androidx.appcompat.app.OooO
    public final void OooO0OO() {
    }

    final boolean OooO0o(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @NonNull
    public final AppCompatDelegate OooO0o0() {
        if (this.f2490OooO0Oo == null) {
            o000000O.OooO00o oooO00o = AppCompatDelegate.f2287OooO0Oo;
            this.f2490OooO0Oo = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.f2490OooO0Oo;
    }

    @Override // androidx.activity.OooOo, android.app.Dialog
    public final void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        OooO0o0().OooO0OO(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        OooO0o0().OooOOOo();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.o0OoOo0.OooO0O0(this.f2491OooO0o0, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public final <T extends View> T findViewById(@IdRes int i) {
        return (T) OooO0o0().OooO0o(i);
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void invalidateOptionsMenu() {
        OooO0o0().OooOO0o();
    }

    @Override // androidx.activity.OooOo, android.app.Dialog
    public void onCreate(Bundle bundle) {
        OooO0o0().OooOO0O();
        super.onCreate(bundle);
        OooO0o0().OooOOOO();
    }

    @Override // androidx.activity.OooOo, android.app.Dialog
    public final void onStop() {
        super.onStop();
        OooO0o0().OooOOoo();
    }

    @Override // androidx.activity.OooOo, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        OooO0o0().OooOo0O(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        OooO0o0().OooOoo0(charSequence);
    }

    @Override // androidx.activity.OooOo, android.app.Dialog
    public void setContentView(@NonNull View view) {
        OooO0o0().OooOo0o(view);
    }

    @Override // androidx.activity.OooOo, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        OooO0o0().OooOo(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        OooO0o0().OooOoo0(getContext().getString(i));
    }
}
