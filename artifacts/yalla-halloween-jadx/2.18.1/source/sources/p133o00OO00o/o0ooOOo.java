package p133o00OO00o;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseArray<View> f31344OooO00o = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View f31345OooO0O0;

    public o0ooOOo(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.f31345OooO0O0 = viewInflate;
        viewInflate.setTag(this);
    }

    public final <T extends View> T OooO00o(int i) {
        T t = (T) this.f31344OooO00o.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.f31345OooO0O0.findViewById(i);
        this.f31344OooO00o.put(i, t2);
        return t2;
    }

    public final o0ooOOo OooO0O0(int i, CharSequence charSequence) {
        TextView textView = (TextView) OooO00o(i);
        if (charSequence == null) {
            charSequence = "";
        }
        textView.setText(charSequence);
        return this;
    }
}
