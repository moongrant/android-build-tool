package p133o00OO00o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO<T> extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Context f31185Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<T> f31186Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f31187Oooo0oo;

    public OooO0OO(Context context, List<T> list, int i) {
        this.f31185Oooo0o = context;
        this.f31186Oooo0oO = list;
        this.f31187Oooo0oo = i;
    }

    public abstract void OooO0O0(o0ooOOo o0ooooo2, Object obj);

    @Override // android.widget.Adapter
    public final int getCount() {
        List<T> list = this.f31186Oooo0oO;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final T getItem(int i) {
        int size = this.f31186Oooo0oO.size();
        if (i >= this.f31186Oooo0oO.size()) {
            return this.f31186Oooo0oO.get(i == 0 ? 0 : size - 1);
        }
        return this.f31186Oooo0oO.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        o0ooOOo o0ooooo2 = view == null ? new o0ooOOo(this.f31185Oooo0o, viewGroup, this.f31187Oooo0oo) : (o0ooOOo) view.getTag();
        OooO0O0(o0ooooo2, getItem(i));
        return o0ooooo2.f31345OooO0O0;
    }
}
