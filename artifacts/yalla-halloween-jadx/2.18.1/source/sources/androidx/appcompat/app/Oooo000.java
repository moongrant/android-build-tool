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
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class Oooo000 extends androidx.activity.OooOOO0 implements OooOO0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooOo f4527Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public AppCompatDelegateImpl f4528Oooo0oo;

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.appcompat.app.OooOo] */
    public Oooo000(@NonNull Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(OooOo00.OooO00o.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f4527Oooo = new o000O0O0.OooO.OooO00o() { // from class: androidx.appcompat.app.OooOo
            @Override // o000O0O0.OooO.OooO00o
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f4525Oooo0o.OooO0oo(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateOooO0oO = OooO0oO();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(OooOo00.OooO00o.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((AppCompatDelegateImpl) appCompatDelegateOooO0oO).f4463o0Oo0oo = i;
        appCompatDelegateOooO0oO.OooOO0o();
    }

    public final boolean OooO() {
        return OooO0oO().OooOOo(1);
    }

    @Override // androidx.appcompat.app.OooOO0O
    @Nullable
    public final void OooO00o() {
    }

    @Override // androidx.appcompat.app.OooOO0O
    public final void OooO0OO() {
    }

    @Override // androidx.appcompat.app.OooOO0O
    public final void OooO0Oo() {
    }

    @NonNull
    public final AppCompatDelegate OooO0oO() {
        if (this.f4528Oooo0oo == null) {
            p021OooOooo.o0OoOo0<WeakReference<AppCompatDelegate>> o0oooo1 = AppCompatDelegate.f4417Oooo0o;
            this.f4528Oooo0oo = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.f4528Oooo0oo;
    }

    public final boolean OooO0oo(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.OooOOO0, android.app.Dialog
    public final void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        OooO0oO().OooO0OO(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        OooO0oO().OooOOO0();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o000O0O0.OooO.OooO0O0(this.f4527Oooo, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public final <T extends View> T findViewById(@IdRes int i) {
        return (T) OooO0oO().OooO0o0(i);
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void invalidateOptionsMenu() {
        OooO0oO().OooOO0();
    }

    @Override // androidx.activity.OooOOO0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        OooO0oO().OooO();
        super.onCreate(bundle);
        OooO0oO().OooOO0o();
    }

    @Override // androidx.activity.OooOOO0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        OooO0oO().OooOOOo();
    }

    @Override // androidx.activity.OooOOO0, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        OooO0oO().OooOOoo(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        OooO0oO().OooOo(charSequence);
    }

    @Override // androidx.activity.OooOOO0, android.app.Dialog
    public void setContentView(@NonNull View view) {
        OooO0oO().OooOo00(view);
    }

    @Override // androidx.activity.OooOOO0, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        OooO0oO().OooOo0(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        OooO0oO().OooOo(getContext().getString(i));
    }
}
