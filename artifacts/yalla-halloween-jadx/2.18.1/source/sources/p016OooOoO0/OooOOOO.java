package p016OooOoO0;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import o000O0O.OooO0O0;
import p015OooOoO.o000oOoO;
import p015OooOoO.o00O0O;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOOO extends ActionMode {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f312OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f313OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class OooO00o implements OooOO0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ActionMode.Callback f314OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Context f315OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<OooOOOO> f316OooO0OO = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00oO0o<Menu, Menu> f317OooO0Oo = new o00oO0o<>();

        public OooO00o(Context context, ActionMode.Callback callback) {
            this.f315OooO0O0 = context;
            this.f314OooO00o = callback;
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final boolean OooO00o(OooOO0 oooOO1, Menu menu) {
            return this.f314OooO00o.onPrepareActionMode(OooO0o0(oooOO1), OooO0o(menu));
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final boolean OooO0O0(OooOO0 oooOO1, Menu menu) {
            return this.f314OooO00o.onCreateActionMode(OooO0o0(oooOO1), OooO0o(menu));
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final void OooO0OO(OooOO0 oooOO1) {
            this.f314OooO00o.onDestroyActionMode(OooO0o0(oooOO1));
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final boolean OooO0Oo(OooOO0 oooOO1, MenuItem menuItem) {
            return this.f314OooO00o.onActionItemClicked(OooO0o0(oooOO1), new o000oOoO(this.f315OooO0O0, (OooO0O0) menuItem));
        }

        public final Menu OooO0o(Menu menu) {
            Menu orDefault = this.f317OooO0Oo.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o00O0O o00o0o2 = new o00O0O(this.f315OooO0O0, (o000O0O.OooO00o) menu);
            this.f317OooO0Oo.put(menu, o00o0o2);
            return o00o0o2;
        }

        public final ActionMode OooO0o0(OooOO0 oooOO1) {
            int size = this.f316OooO0OO.size();
            for (int i = 0; i < size; i++) {
                OooOOOO oooOOOO = this.f316OooO0OO.get(i);
                if (oooOOOO != null && oooOOOO.f313OooO0O0 == oooOO1) {
                    return oooOOOO;
                }
            }
            OooOOOO oooOOOO2 = new OooOOOO(this.f315OooO0O0, oooOO1);
            this.f316OooO0OO.add(oooOOOO2);
            return oooOOOO2;
        }
    }

    public OooOOOO(Context context, OooOO0 oooOO1) {
        this.f312OooO00o = context;
        this.f313OooO0O0 = oooOO1;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f313OooO0O0.OooO0OO();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f313OooO0O0.OooO0Oo();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new o00O0O(this.f312OooO00o, (o000O0O.OooO00o) this.f313OooO0O0.OooO0o0());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f313OooO0O0.OooO0o();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f313OooO0O0.OooO0oO();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f313OooO0O0.f298Oooo0o;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f313OooO0O0.OooO0oo();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f313OooO0O0.f299Oooo0oO;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f313OooO0O0.OooO();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f313OooO0O0.OooOO0();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f313OooO0O0.OooOO0O(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f313OooO0O0.OooOOO0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f313OooO0O0.f298Oooo0o = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f313OooO0O0.OooOOOO(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f313OooO0O0.OooOOOo(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f313OooO0O0.OooOO0o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f313OooO0O0.OooOOO(i);
    }
}
