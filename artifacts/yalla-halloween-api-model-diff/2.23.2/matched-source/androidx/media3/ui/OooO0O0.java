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
    public final /* synthetic */ int f9628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f9629OooO0o0;

    public /* synthetic */ OooO0O0(int i, View view) {
        this.f9628OooO0Oo = i;
        this.f9629OooO0o0 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0 o0VarOooO0oo;
        int i = this.f9628OooO0Oo;
        View view = this.f9629OooO0o0;
        switch (i) {
            case 0:
                int i2 = DefaultTimeBar.f9532OoooO0O;
                ((DefaultTimeBar) view).OooO0o(false);
                break;
            default:
                SearchView searchView = (SearchView) view;
                EditText editText = searchView.f17063OooOOO0;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.f17074OooOoO && (o0VarOooO0oo = ViewCompat.OooO0oo(editText)) != null) {
                    o0VarOooO0oo.f5420OooO00o.OooO0oO(8);
                } else {
                    Context context = editText.getContext();
                    Object obj = ContextCompat.f5281OooO00o;
                    ((InputMethodManager) ContextCompat.OooO0o.OooO0O0(context, InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
        }
    }
}
