package o000O;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ao;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o extends BaseAdapter implements Filterable, o000O.OooO0O0.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context f28027Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o000O.OooO0O0 f28031OoooO;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f28029Oooo0oO = true;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Cursor f28030Oooo0oo = null;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f28028Oooo0o = false;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int f28033OoooO00 = -1;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C0292OooO00o f28032OoooO0 = new C0292OooO00o();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooO0O0 f28034OoooO0O = new OooO0O0();

    /* JADX INFO: renamed from: o000O.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0292OooO00o extends ContentObserver {
        public C0292OooO00o() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            OooO00o oooO00o = OooO00o.this;
            if (!oooO00o.f28029Oooo0oO || (cursor = oooO00o.f28030Oooo0oo) == null || cursor.isClosed()) {
                return;
            }
            oooO00o.f28028Oooo0o = oooO00o.f28030Oooo0oo.requery();
        }
    }

    public class OooO0O0 extends DataSetObserver {
        public OooO0O0() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f28028Oooo0o = true;
            oooO00o.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f28028Oooo0o = false;
            oooO00o.notifyDataSetInvalidated();
        }
    }

    public OooO00o(Context context) {
        this.f28027Oooo = context;
    }

    public abstract void OooO0O0(View view, Cursor cursor);

    public void OooO0OO(Cursor cursor) {
        Cursor cursor2 = this.f28030Oooo0oo;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0292OooO00o c0292OooO00o = this.f28032OoooO0;
                if (c0292OooO00o != null) {
                    cursor2.unregisterContentObserver(c0292OooO00o);
                }
                OooO0O0 oooO0O0 = this.f28034OoooO0O;
                if (oooO0O0 != null) {
                    cursor2.unregisterDataSetObserver(oooO0O0);
                }
            }
            this.f28030Oooo0oo = cursor;
            if (cursor != null) {
                C0292OooO00o c0292OooO00o2 = this.f28032OoooO0;
                if (c0292OooO00o2 != null) {
                    cursor.registerContentObserver(c0292OooO00o2);
                }
                OooO0O0 oooO0O1 = this.f28034OoooO0O;
                if (oooO0O1 != null) {
                    cursor.registerDataSetObserver(oooO0O1);
                }
                this.f28033OoooO00 = cursor.getColumnIndexOrThrow(ao.d);
                this.f28028Oooo0o = true;
                notifyDataSetChanged();
            } else {
                this.f28033OoooO00 = -1;
                this.f28028Oooo0o = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence OooO0Oo(Cursor cursor);

    public abstract View OooO0o0(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f28028Oooo0o || (cursor = this.f28030Oooo0oo) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f28028Oooo0o) {
            return null;
        }
        this.f28030Oooo0oo.moveToPosition(i);
        if (view == null) {
            OooO0OO oooO0OO = (OooO0OO) this;
            view = oooO0OO.f28039OoooOOO.inflate(oooO0OO.f28040o000oOoO, viewGroup, false);
        }
        OooO0O0(view, this.f28030Oooo0oo);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f28031OoooO == null) {
            this.f28031OoooO = new o000O.OooO0O0(this);
        }
        return this.f28031OoooO;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f28028Oooo0o || (cursor = this.f28030Oooo0oo) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f28030Oooo0oo;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f28028Oooo0o && (cursor = this.f28030Oooo0oo) != null && cursor.moveToPosition(i)) {
            return this.f28030Oooo0oo.getLong(this.f28033OoooO00);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f28028Oooo0o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f28030Oooo0oo.moveToPosition(i)) {
            throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = OooO0o0(viewGroup);
        }
        OooO0O0(view, this.f28030Oooo0oo);
        return view;
    }
}
