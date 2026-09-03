package p050o000000o;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f26740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOO0O f26741OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f26742OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f26743OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f26744OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f26745OooO0o0;

    public OooO(Function0 function0) {
        OooOO0O rect = OooOO0O.f30402OooO0o;
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f26740OooO00o = function0;
        this.f26741OooO0O0 = rect;
        this.f26742OooO0OO = null;
        this.f26743OooO0Oo = null;
        this.f26745OooO0o0 = null;
        this.f26744OooO0o = null;
    }

    public final void OooO00o(@NotNull Menu menu, @NotNull MenuItemOption item) {
        int i;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(item, "item");
        int id = item.getId();
        int order = item.getOrder();
        int i2 = MenuItemOption.OooO00o.$EnumSwitchMapping$0[item.ordinal()];
        if (i2 == 1) {
            i = R.string.copy;
        } else if (i2 == 2) {
            i = R.string.paste;
        } else if (i2 == 3) {
            i = R.string.cut;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.selectAll;
        }
        menu.add(0, id, order, i).setShowAsAction(1);
    }

    public final void OooO0O0(Menu menu, MenuItemOption menuItemOption, Function0<Unit> function0) {
        if (function0 != null && menu.findItem(menuItemOption.getId()) == null) {
            OooO00o(menu, menuItemOption);
        } else {
            if (function0 != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final boolean OooO0OO(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        Intrinsics.checkNotNull(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            Function0<Unit> function0 = this.f26742OooO0OO;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            Function0<Unit> function1 = this.f26743OooO0Oo;
            if (function1 != null) {
                function1.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            Function0<Unit> function2 = this.f26745OooO0o0;
            if (function2 != null) {
                function2.invoke();
            }
        } else {
            if (itemId != MenuItemOption.SelectAll.getId()) {
                return false;
            }
            Function0<Unit> function3 = this.f26744OooO0o;
            if (function3 != null) {
                function3.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final void OooO0Oo(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (this.f26742OooO0OO != null) {
            OooO00o(menu, MenuItemOption.Copy);
        }
        if (this.f26743OooO0Oo != null) {
            OooO00o(menu, MenuItemOption.Paste);
        }
        if (this.f26745OooO0o0 != null) {
            OooO00o(menu, MenuItemOption.Cut);
        }
        if (this.f26744OooO0o != null) {
            OooO00o(menu, MenuItemOption.SelectAll);
        }
    }

    public final boolean OooO0o0(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(menu, "menu");
        OooO0O0(menu, MenuItemOption.Copy, this.f26742OooO0OO);
        OooO0O0(menu, MenuItemOption.Paste, this.f26743OooO0Oo);
        OooO0O0(menu, MenuItemOption.Cut, this.f26745OooO0o0);
        OooO0O0(menu, MenuItemOption.SelectAll, this.f26744OooO0o);
        return true;
    }
}
