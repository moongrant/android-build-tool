package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f3222OooO0Oo;

    public o00000O(ListPopupWindow listPopupWindow) {
        this.f3222OooO0Oo = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        o000000O o000000o2;
        if (i == -1 || (o000000o2 = this.f3222OooO0Oo.f2914OooO0o) == null) {
            return;
        }
        o000000o2.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
