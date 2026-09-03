package p072o000O0o0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.OooOO0O;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class o0000O implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO f28192OooO00o;

    public o0000O(@NonNull o000OO o000oo2) {
        this.f28192OooO00o = o000oo2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0000O) {
            return this.f28192OooO00o.equals(((o0000O) obj).f28192OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28192OooO00o.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        AutoCompleteTextView autoCompleteTextView;
        OooOO0O.OooOOO0 oooOOO0 = (OooOO0O.OooOOO0) this.f28192OooO00o;
        TextInputLayout textInputLayout = OooOO0O.this.f17893OooO00o;
        if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null) {
            return;
        }
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        CheckableImageButton checkableImageButton = OooOO0O.this.f17895OooO0OO;
        int i = z ? 2 : 1;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(checkableImageButton, i);
    }
}
