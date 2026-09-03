package p016OooOoOO;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO;
import java.util.ArrayList;
import o0000.OooO0O0;
import p018OooOoo0.OooOOOO;
import p018OooOoo0.OooOo;
import p188o00o0O.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class oo000o extends ActionMode {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f352OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0 f353OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class OooO00o implements o0OoOo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ActionMode.Callback f354OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Context f355OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<oo000o> f356OooO0OO = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Oooo000<Menu, Menu> f357OooO0Oo = new Oooo000<>();

        public OooO00o(Context context, ActionMode.Callback callback) {
            this.f355OooO0O0 = context;
            this.f354OooO00o = callback;
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO00o(o0OoOo0 o0oooo0, OooO oooO) {
            oo000o oo000oVarOooO0o0 = OooO0o0(o0oooo0);
            Oooo000<Menu, Menu> oooo000 = this.f357OooO0Oo;
            Menu orDefault = oooo000.getOrDefault(oooO, null);
            if (orDefault == null) {
                orDefault = new OooOo(this.f355OooO0O0, oooO);
                oooo000.put(oooO, orDefault);
            }
            return this.f354OooO00o.onPrepareActionMode(oo000oVarOooO0o0, orDefault);
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final void OooO0O0(o0OoOo0 o0oooo0) {
            this.f354OooO00o.onDestroyActionMode(OooO0o0(o0oooo0));
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO0OO(o0OoOo0 o0oooo0, MenuItem menuItem) {
            return this.f354OooO00o.onActionItemClicked(OooO0o0(o0oooo0), new OooOOOO(this.f355OooO0O0, (OooO0O0) menuItem));
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO0Oo(o0OoOo0 o0oooo0, OooO oooO) {
            oo000o oo000oVarOooO0o0 = OooO0o0(o0oooo0);
            Oooo000<Menu, Menu> oooo000 = this.f357OooO0Oo;
            Menu orDefault = oooo000.getOrDefault(oooO, null);
            if (orDefault == null) {
                orDefault = new OooOo(this.f355OooO0O0, oooO);
                oooo000.put(oooO, orDefault);
            }
            return this.f354OooO00o.onCreateActionMode(oo000oVarOooO0o0, orDefault);
        }

        public final oo000o OooO0o0(o0OoOo0 o0oooo0) {
            ArrayList<oo000o> arrayList = this.f356OooO0OO;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                oo000o oo000oVar = arrayList.get(i);
                if (oo000oVar != null && oo000oVar.f353OooO0O0 == o0oooo0) {
                    return oo000oVar;
                }
            }
            oo000o oo000oVar2 = new oo000o(this.f355OooO0O0, o0oooo0);
            arrayList.add(oo000oVar2);
            return oo000oVar2;
        }
    }

    public oo000o(Context context, o0OoOo0 o0oooo0) {
        this.f352OooO00o = context;
        this.f353OooO0O0 = o0oooo0;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f353OooO0O0.OooO0OO();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f353OooO0O0.OooO0Oo();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new OooOo(this.f352OooO00o, this.f353OooO0O0.OooO0o0());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f353OooO0O0.OooO0o();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f353OooO0O0.OooO0oO();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f353OooO0O0.f341OooO0Oo;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f353OooO0O0.OooO0oo();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f353OooO0O0.f342OooO0o0;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f353OooO0O0.OooO();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f353OooO0O0.OooOO0();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f353OooO0O0.OooOO0O(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f353OooO0O0.OooOOO0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f353OooO0O0.f341OooO0Oo = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f353OooO0O0.OooOOOO(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f353OooO0O0.OooOOOo(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f353OooO0O0.OooOO0o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f353OooO0O0.OooOOO(i);
    }
}
