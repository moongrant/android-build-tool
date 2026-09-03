package androidx.compose.ui.graphics.colorspace;

import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.textfield.o0OoOo0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements DoubleFunction, o0000O.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4170OooO0Oo;

    public /* synthetic */ OooOO0O(Object obj) {
        this.f4170OooO0Oo = obj;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb.oetfFunc$lambda$0((Rgb) this.f4170OooO0Oo, d);
    }

    @Override // o0000O.OooO0o
    public final void onTouchExplorationStateChanged(boolean z) {
        o0OoOo0 o0oooo1 = (o0OoOo0) this.f4170OooO0Oo;
        AutoCompleteTextView autoCompleteTextView = o0oooo1.f17641OooO0oo;
        if (autoCompleteTextView != null) {
            if (autoCompleteTextView.getInputType() != 0) {
                return;
            }
            int i = z ? 2 : 1;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOoo(o0oooo1.f17620OooO0Oo, i);
        }
    }
}
