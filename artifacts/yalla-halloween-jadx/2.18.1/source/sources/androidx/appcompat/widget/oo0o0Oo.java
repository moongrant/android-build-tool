package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f5487Oooo0o;

    public oo0o0Oo(ListPopupWindow listPopupWindow) {
        this.f5487Oooo0o = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        o0OOO0o o0ooo0o2;
        if (i == -1 || (o0ooo0o2 = this.f5487Oooo0o.f5023Oooo0oo) == null) {
            return;
        }
        o0ooo0o2.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
