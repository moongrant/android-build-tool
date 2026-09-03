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
import p190o00o0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class oo000o extends ActionMode {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0 f352OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class OooO00o implements o0OoOo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ActionMode.Callback f353OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Context f354OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<oo000o> f355OooO0OO = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOo<Menu, Menu> f356OooO0Oo = new OooOo<>();

        public OooO00o(Context context, ActionMode.Callback callback) {
            this.f354OooO0O0 = context;
            this.f353OooO00o = callback;
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO00o(o0OoOo0 o0oooo1, OooO oooO) {
            oo000o oo000oVarOooO0o0 = OooO0o0(o0oooo1);
            OooOo<Menu, Menu> oooOo = this.f356OooO0Oo;
            Menu orDefault = oooOo.getOrDefault(oooO, null);
            if (orDefault == null) {
                orDefault = new p018OooOoo0.OooOo(this.f354OooO0O0, oooO);
                oooOo.put(oooO, orDefault);
            }
            return this.f353OooO00o.onPrepareActionMode(oo000oVarOooO0o0, orDefault);
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final void OooO0O0(o0OoOo0 o0oooo1) {
            this.f353OooO00o.onDestroyActionMode(OooO0o0(o0oooo1));
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO0OO(o0OoOo0 o0oooo1, MenuItem menuItem) {
            return this.f353OooO00o.onActionItemClicked(OooO0o0(o0oooo1), new OooOOOO(this.f354OooO0O0, (OooO0O0) menuItem));
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO0Oo(o0OoOo0 o0oooo1, OooO oooO) {
            oo000o oo000oVarOooO0o0 = OooO0o0(o0oooo1);
            OooOo<Menu, Menu> oooOo = this.f356OooO0Oo;
            Menu orDefault = oooOo.getOrDefault(oooO, null);
            if (orDefault == null) {
                orDefault = new p018OooOoo0.OooOo(this.f354OooO0O0, oooO);
                oooOo.put(oooO, orDefault);
            }
            return this.f353OooO00o.onCreateActionMode(oo000oVarOooO0o0, orDefault);
        }

        public final oo000o OooO0o0(o0OoOo0 o0oooo1) {
            ArrayList<oo000o> arrayList = this.f355OooO0OO;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                oo000o oo000oVar = arrayList.get(i);
                if (oo000oVar != null && oo000oVar.f352OooO0O0 == o0oooo1) {
                    return oo000oVar;
                }
            }
            oo000o oo000oVar2 = new oo000o(this.f354OooO0O0, o0oooo1);
            arrayList.add(oo000oVar2);
            return oo000oVar2;
        }
    }

    public oo000o(Context context, o0OoOo0 o0oooo1) {
        this.f351OooO00o = context;
        this.f352OooO0O0 = o0oooo1;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f352OooO0O0.OooO0OO();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f352OooO0O0.OooO0Oo();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new p018OooOoo0.OooOo(this.f351OooO00o, this.f352OooO0O0.OooO0o0());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f352OooO0O0.OooO0o();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f352OooO0O0.OooO0oO();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f352OooO0O0.f340OooO0Oo;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f352OooO0O0.OooO0oo();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f352OooO0O0.f341OooO0o0;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f352OooO0O0.OooO();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f352OooO0O0.OooOO0();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f352OooO0O0.OooOO0O(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f352OooO0O0.OooOOO0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f352OooO0O0.f340OooO0Oo = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f352OooO0O0.OooOOOO(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f352OooO0O0.OooOOOo(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f352OooO0O0.OooOO0o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f352OooO0O0.OooOOO(i);
    }
}
