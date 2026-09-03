package androidx.media3.ui;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o0;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9638OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f9639OooO0o0;

    public /* synthetic */ OooO0O0(int i, View view) {
        this.f9638OooO0Oo = i;
        this.f9639OooO0o0 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0 o0VarOooO0oo;
        int i = this.f9638OooO0Oo;
        View view = this.f9639OooO0o0;
        switch (i) {
            case 0:
                int i2 = DefaultTimeBar.f9542OoooO0O;
                ((DefaultTimeBar) view).OooO0o(false);
                break;
            default:
                SearchView searchView = (SearchView) view;
                EditText editText = searchView.f17071OooOOO0;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.f17082OooOoO && (o0VarOooO0oo = ViewCompat.OooO0oo(editText)) != null) {
                    o0VarOooO0oo.f5423OooO00o.OooO0oO(8);
                } else {
                    Context context = editText.getContext();
                    Object obj = ContextCompat.f5284OooO00o;
                    ((InputMethodManager) ContextCompat.OooO0o.OooO0O0(context, InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
        }
    }
}
