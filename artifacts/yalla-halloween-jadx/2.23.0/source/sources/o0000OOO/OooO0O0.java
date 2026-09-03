package o0000OOO;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.o000OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Filter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f34133OooO00o;

    public interface OooO00o {
    }

    public OooO0O0(OooO00o oooO00o) {
        this.f34133OooO00o = oooO00o;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((o000OO) this.f34133OooO00o).OooO0Oo((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorOooO0oo;
        o000OO o000oo2 = (o000OO) this.f34133OooO00o;
        if (charSequence == null) {
            string = "";
        } else {
            o000oo2.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = o000oo2.f3274OooOOO;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorOooO0oo = o000oo2.OooO0oo(o000oo2.f3275OooOOOO, string);
                if (cursorOooO0oo != null) {
                    cursorOooO0oo.getCount();
                } else {
                    cursorOooO0oo = null;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorOooO0oo = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorOooO0oo != null) {
            filterResults.count = cursorOooO0oo.getCount();
            filterResults.values = cursorOooO0oo;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        OooO00o oooO00o = this.f34133OooO00o;
        Cursor cursor = ((o0000OOO.OooO00o) oooO00o).f34126OooO0o;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((o000OO) oooO00o).OooO0OO((Cursor) obj);
    }
}
