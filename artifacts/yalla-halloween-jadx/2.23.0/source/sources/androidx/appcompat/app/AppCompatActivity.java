package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.o00O0000;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AppCompatDelegateImpl f2287OooO0Oo;

    public AppCompatActivity() {
        getSavedStateRegistry().OooO0OO("androidx:appcompat", new OooO0OO(this));
        addOnContextAvailableListener(new OooO0o(this));
    }

    @Override // androidx.appcompat.app.OooO
    @Nullable
    public final void OooO00o() {
    }

    @Override // androidx.appcompat.app.OooO
    @CallSuper
    public final void OooO0O0() {
    }

    @Override // androidx.appcompat.app.OooO
    @CallSuper
    public final void OooO0OO() {
    }

    @NonNull
    public final AppCompatDelegate OooOO0o() {
        if (this.f2287OooO0Oo == null) {
            o000000O.OooO00o oooO00o = AppCompatDelegate.f2289OooO0Oo;
            this.f2287OooO0Oo = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.f2287OooO0Oo;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        OooOO0o().OooO0OO(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(OooOO0o().OooO0o0(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ActionBar actionBarOooOO0 = OooOO0o().OooOO0();
        if (getWindow().hasFeature(0)) {
            if (actionBarOooOO0 == null || !actionBarOooOO0.OooO00o()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar actionBarOooOO0 = OooOO0o().OooOO0();
        if (keyCode == 82 && actionBarOooOO0 != null && actionBarOooOO0.OooOO0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(@IdRes int i) {
        return (T) OooOO0o().OooO0o(i);
    }

    @Override // android.app.Activity
    @NonNull
    public final MenuInflater getMenuInflater() {
        return OooOO0o().OooO();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = o00O0000.f3334OooO00o;
        return super.getResources();
    }

    public final void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        o000OO00.OooO.OooO0O0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView.setTag(androidx.activity.o00O0O.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        OooOO0o().OooOO0o();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooOO0o().OooOOO(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OooOO0o().OooOOOo();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        Intent intentOooO00o;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar actionBarOooOO0 = OooOO0o().OooOO0();
        if (menuItem.getItemId() == 16908332 && actionBarOooOO0 != null && (actionBarOooOO0.OooO0Oo() & 4) != 0 && (intentOooO00o = o00000O.Oooo0.OooO00o(this)) != null) {
            if (!o00000O.Oooo0.OooO00o.OooO0OO(this, intentOooO00o)) {
                o00000O.Oooo0.OooO00o.OooO0O0(this, intentOooO00o);
                return true;
            }
            o00000O.o0O0O00 o0o0o00 = new o00000O.o0O0O00(this);
            Intent intentOooO00o2 = o00000O.Oooo0.OooO00o(this);
            if (intentOooO00o2 == null) {
                intentOooO00o2 = o00000O.Oooo0.OooO00o(this);
            }
            if (intentOooO00o2 != null) {
                ComponentName component = intentOooO00o2.getComponent();
                if (component == null) {
                    component = intentOooO00o2.resolveActivity(o0o0o00.f33967OooO0o0.getPackageManager());
                }
                o0o0o00.OooO00o(component);
                o0o0o00.f33966OooO0Oo.add(intentOooO00o2);
            }
            o0o0o00.OooO0O0();
            try {
                int i2 = o00000O.OooO00o.f33927OooO0OO;
                o00000O.OooO00o.C0392OooO00o.OooO00o(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, @NonNull Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        ((AppCompatDelegateImpl) OooOO0o()).Oooo0o0();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        OooOO0o().OooOOo0();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        OooOO0o().OooOOo();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        OooOO0o().OooOOoo();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        OooOO0o().OooOoo0(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ActionBar actionBarOooOO0 = OooOO0o().OooOO0();
        if (getWindow().hasFeature(0)) {
            if (actionBarOooOO0 == null || !actionBarOooOO0.OooOO0O()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        OooOO0o().OooOo0O(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(@StyleRes int i) {
        super.setTheme(i);
        OooOO0o().OooOoOO(i);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void supportInvalidateOptionsMenu() {
        OooOO0o().OooOO0o();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        OooOO0o().OooOo0o(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        OooOO0o().OooOo(view, layoutParams);
    }
}
