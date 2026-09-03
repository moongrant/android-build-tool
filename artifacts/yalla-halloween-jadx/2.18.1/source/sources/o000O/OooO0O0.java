package o000O;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.o00000O;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Filter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f28037OooO00o;

    public interface OooO00o {
    }

    public OooO0O0(OooO00o oooO00o) {
        this.f28037OooO00o = oooO00o;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((o00000O) this.f28037OooO00o).OooO0Oo((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorOooO0oo;
        o00000O o00000o = (o00000O) this.f28037OooO00o;
        Objects.requireNonNull(o00000o);
        String string = charSequence == null ? "" : charSequence.toString();
        if (o00000o.f5322OoooOOo.getVisibility() == 0 && o00000o.f5322OoooOOo.getWindowVisibility() == 0) {
            try {
                cursorOooO0oo = o00000o.OooO0oo(o00000o.f5323OoooOo0, string);
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
        OooO00o oooO00o = this.f28037OooO00o;
        Cursor cursor = ((o000O.OooO00o) oooO00o).f28030Oooo0oo;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((o00000O) oooO00o).OooO0OO((Cursor) obj);
    }
}
