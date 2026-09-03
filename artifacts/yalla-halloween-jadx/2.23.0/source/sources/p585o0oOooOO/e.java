package p585o0oOooOO;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.camera.core.impl.o000OOo0;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EditTextSpan f56763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p f56764OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f56765OooO0o0;

    public class OooO00o implements p.OooO00o {
        public OooO00o() {
        }

        @Override // o0oOooOO.p.OooO00o
        public final void OooO00o(int i, int i2, int i3, String str) {
            e.this.OooO00o(i, i2, i3);
        }
    }

    public e(EditTextSpan editTextSpan) {
        System.currentTimeMillis();
        this.f56765OooO0o0 = 0;
        this.f56763OooO0Oo = editTextSpan;
        this.f56764OooO0o = new p(new OooO00o());
    }

    public final void OooO00o(int i, int i2, int i3) {
        h next;
        EditTextSpan editTextSpan = this.f56763OooO0Oo;
        editTextSpan.getText();
        int i4 = i + i2;
        if (i3 != 0) {
            i4 = i + i3;
        }
        int i5 = i3 - i2;
        k spanManager = editTextSpan.getSpanManager();
        spanManager.OooO00o();
        Iterator<h> it = spanManager.f56774OooO00o.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (i2 > 0) {
                if (next.f56772OooO0oO >= i && next.f56773OooO0oo <= i4) {
                    it.remove();
                }
            }
            if ((i2 > 0 && next.f56773OooO0oo >= i4) || (i3 > 0 && next.f56772OooO0oO >= i)) {
                int i6 = next.f56772OooO0oO + i5;
                next.f56772OooO0oO = i6;
                int i7 = next.f56773OooO0oo + i5;
                next.f56773OooO0oo = i7;
                if (i7 < i6) {
                    i6 = i7;
                }
                if (i6 < 0) {
                    it.remove();
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f56765OooO0o0 = editable.length();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        EditTextSpan editTextSpan = this.f56763OooO0Oo;
        Editable text = editTextSpan.getText();
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVar = this.f56764OooO0o;
        pVar.OooO00o(jCurrentTimeMillis);
        if (i == 0 && i2 == (i4 = this.f56765OooO0o0) && i3 == 0 && i4 > 0) {
            pVar.f56786OooO0o0 = System.currentTimeMillis();
            pVar.f56781OooO00o = i;
            pVar.f56782OooO0O0 = i2;
            pVar.f56783OooO0OO = i3;
            pVar.f56784OooO0Oo = " onTextChangedSubText 异常删除 ";
        } else if (i <= text.length()) {
            OooO00o(i, i2, i3);
        }
        if (i3 <= 0 || i3 != 1 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        String str = charSequence.toString().charAt(i) + "";
        editTextSpan.getSelectionStart();
        if (!(TextUtils.isEmpty(str) ? false : editTextSpan.getMaskKeys().containsKey(str)) || editTextSpan.getSpanKeyListener() == null) {
            return;
        }
        ((o000OOo0) editTextSpan.getSpanKeyListener()).OooO00o(str);
    }
}
