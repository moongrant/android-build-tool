package p015OooOoO;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import o000O0O.OooO00o;
import o000O0O.OooO0O0;
import o000O0O.OooO0OO;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class o00O0O extends Oooo0 implements Menu {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f295OooO0Oo;

    public o00O0O(Context context, OooO00o oooO00o) {
        super(context);
        if (oooO00o == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f295OooO0Oo = oooO00o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO0OO(this.f295OooO0Oo.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f295OooO0Oo.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
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
        return OooO0Oo(this.f295OooO0Oo.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        o00oO0o<OooO0O0, MenuItem> o00oo0o2 = this.f267OooO0O0;
        if (o00oo0o2 != null) {
            o00oo0o2.clear();
        }
        o00oO0o<OooO0OO, SubMenu> o00oo0o3 = this.f268OooO0OO;
        if (o00oo0o3 != null) {
            o00oo0o3.clear();
        }
        this.f295OooO0Oo.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f295OooO0Oo.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return OooO0OO(this.f295OooO0Oo.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return OooO0OO(this.f295OooO0Oo.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f295OooO0Oo.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f295OooO0Oo.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f295OooO0Oo.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f295OooO0Oo.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f267OooO0O0 != null) {
            int i2 = 0;
            while (true) {
                o00oO0o<OooO0O0, MenuItem> o00oo0o2 = this.f267OooO0O0;
                if (i2 >= o00oo0o2.f421Oooo0oo) {
                    break;
                }
                if (o00oo0o2.OooO(i2).getGroupId() == i) {
                    this.f267OooO0O0.OooOO0O(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f295OooO0Oo.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f267OooO0O0 != null) {
            int i2 = 0;
            while (true) {
                o00oO0o<OooO0O0, MenuItem> o00oo0o2 = this.f267OooO0O0;
                if (i2 >= o00oo0o2.f421Oooo0oo) {
                    break;
                }
                if (o00oo0o2.OooO(i2).getItemId() == i) {
                    this.f267OooO0O0.OooOO0O(i2);
                    break;
                }
                i2++;
            }
        }
        this.f295OooO0Oo.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f295OooO0Oo.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f295OooO0Oo.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f295OooO0Oo.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f295OooO0Oo.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f295OooO0Oo.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO0OO(this.f295OooO0Oo.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return OooO0Oo(this.f295OooO0Oo.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO0OO(this.f295OooO0Oo.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return OooO0Oo(this.f295OooO0Oo.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO0OO(this.f295OooO0Oo.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return OooO0Oo(this.f295OooO0Oo.addSubMenu(i, i2, i3, i4));
    }
}
