package p018OooOoo0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import o0000.OooO00o;
import o0000.OooO0O0;
import o0000.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOo extends OooOOO0 implements Menu {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f386OooO0Oo;

    public OooOo(Context context, OooO00o oooO00o) {
        super(context);
        if (oooO00o == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f386OooO0Oo = oooO00o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO0OO(this.f386OooO0Oo.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f386OooO0Oo.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = OooO0OO(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return OooO0Oo(this.f386OooO0Oo.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        p190o00o0O.OooOo<OooO0O0, MenuItem> oooOo = this.f374OooO0O0;
        if (oooOo != null) {
            oooOo.clear();
        }
        p190o00o0O.OooOo<OooO0OO, SubMenu> oooOo2 = this.f375OooO0OO;
        if (oooOo2 != null) {
            oooOo2.clear();
        }
        this.f386OooO0Oo.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f386OooO0Oo.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return OooO0OO(this.f386OooO0Oo.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return OooO0OO(this.f386OooO0Oo.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f386OooO0Oo.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f386OooO0Oo.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f386OooO0Oo.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f386OooO0Oo.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f374OooO0O0 != null) {
            int i2 = 0;
            while (true) {
                p190o00o0O.OooOo<OooO0O0, MenuItem> oooOo = this.f374OooO0O0;
                if (i2 >= oooOo.f38568OooO0o) {
                    break;
                }
                if (oooOo.OooO0oo(i2).getGroupId() == i) {
                    this.f374OooO0O0.OooOO0(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f386OooO0Oo.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f374OooO0O0 != null) {
            int i2 = 0;
            while (true) {
                p190o00o0O.OooOo<OooO0O0, MenuItem> oooOo = this.f374OooO0O0;
                if (i2 >= oooOo.f38568OooO0o) {
                    break;
                }
                if (oooOo.OooO0oo(i2).getItemId() == i) {
                    this.f374OooO0O0.OooOO0(i2);
                    break;
                }
                i2++;
            }
        }
        this.f386OooO0Oo.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f386OooO0Oo.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f386OooO0Oo.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f386OooO0Oo.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f386OooO0Oo.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f386OooO0Oo.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO0OO(this.f386OooO0Oo.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return OooO0Oo(this.f386OooO0Oo.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO0OO(this.f386OooO0Oo.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return OooO0Oo(this.f386OooO0Oo.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO0OO(this.f386OooO0Oo.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return OooO0Oo(this.f386OooO0Oo.addSubMenu(i, i2, i3, i4));
    }
}
