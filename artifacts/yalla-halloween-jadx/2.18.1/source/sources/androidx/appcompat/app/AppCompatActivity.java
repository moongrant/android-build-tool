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
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o000O00;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.lang.ref.WeakReference;
import p070o0000ooO.o000OO;
import p070o0000ooO.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements OooOO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public AppCompatDelegateImpl f4416Oooo0o;

    public AppCompatActivity() {
        getSavedStateRegistry().OooO0OO("androidx:appcompat", new OooO(this));
        addOnContextAvailableListener(new OooOO0(this));
    }

    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        p094o000o0OO.o00Ooo.OooO0O0(getWindow().getDecorView(), this);
    }

    @Override // androidx.appcompat.app.OooOO0O
    @Nullable
    public final void OooO00o() {
    }

    @Override // androidx.appcompat.app.OooOO0O
    @CallSuper
    public final void OooO0OO() {
    }

    @Override // androidx.appcompat.app.OooOO0O
    @CallSuper
    public final void OooO0Oo() {
    }

    @NonNull
    public final AppCompatDelegate OooOO0O() {
        if (this.f4416Oooo0o == null) {
            p021OooOooo.o0OoOo0<WeakReference<AppCompatDelegate>> o0oooo1 = AppCompatDelegate.f4417Oooo0o;
            this.f4416Oooo0o = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.f4416Oooo0o;
    }

    @Nullable
    public final ActionBar OooOO0o() {
        return OooOO0O().OooO0oo();
    }

    public final void OooOOO(@Nullable Toolbar toolbar) {
        OooOO0O().OooOo0O(toolbar);
    }

    @Nullable
    public final Intent OooOOO0() {
        return o0O0O00.OooO00o(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        OooOO0O().OooO0OO(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(OooOO0O().OooO0Oo(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ActionBar actionBarOooOO0o = OooOO0o();
        if (getWindow().hasFeature(0)) {
            if (actionBarOooOO0o == null || !actionBarOooOO0o.OooO00o()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar actionBarOooOO0o = OooOO0o();
        if (keyCode == 82 && actionBarOooOO0o != null && actionBarOooOO0o.OooOO0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(@IdRes int i) {
        return (T) OooOO0O().OooO0o0(i);
    }

    @Override // android.app.Activity
    @NonNull
    public final MenuInflater getMenuInflater() {
        return OooOO0O().OooO0oO();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = o000O00.f5375OooO00o;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        OooOO0O().OooOO0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooOO0O().OooOO0O(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OooOO0O().OooOOO0();
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
        ActionBar actionBarOooOO0o = OooOO0o();
        if (menuItem.getItemId() != 16908332 || actionBarOooOO0o == null || (actionBarOooOO0o.OooO0Oo() & 4) == 0 || (intentOooO00o = o0O0O00.OooO00o(this)) == null) {
            return false;
        }
        if (!o0O0O00.OooO00o.OooO0OO(this, intentOooO00o)) {
            o0O0O00.OooO00o.OooO0O0(this, intentOooO00o);
            return true;
        }
        o000OO o000oo2 = new o000OO(this);
        Intent intentOooOOO0 = OooOOO0();
        if (intentOooOOO0 == null) {
            intentOooOOO0 = o0O0O00.OooO00o(this);
        }
        if (intentOooOOO0 != null) {
            ComponentName component = intentOooOOO0.getComponent();
            if (component == null) {
                component = intentOooOOO0.resolveActivity(o000oo2.f27999Oooo0oO.getPackageManager());
            }
            o000oo2.OooO00o(component);
            o000oo2.f27998Oooo0o.add(intentOooOOO0);
        }
        o000oo2.OooO0O0();
        try {
            int i2 = p070o0000ooO.o00Oo0.f28002OooO0OO;
            o0000ooO.o00Oo0.OooO0O0.OooO00o(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
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
        ((AppCompatDelegateImpl) OooOO0O()).Oooo0();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        OooOO0O().OooOOO();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        OooOO0O().OooOOOO();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        OooOO0O().OooOOOo();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        OooOO0O().OooOo(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ActionBar actionBarOooOO0o = OooOO0o();
        if (getWindow().hasFeature(0)) {
            if (actionBarOooOO0o == null || !actionBarOooOO0o.OooOO0O()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        OooOO0O().OooOOoo(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(@StyleRes int i) {
        super.setTheme(i);
        OooOO0O().OooOo0o(i);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void supportInvalidateOptionsMenu() {
        OooOO0O().OooOO0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        OooOO0O().OooOo00(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        OooOO0O().OooOo0(view, layoutParams);
    }
}
