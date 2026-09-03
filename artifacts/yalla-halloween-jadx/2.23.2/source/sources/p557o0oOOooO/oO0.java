package p557o0oOOooO;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import java.util.Iterator;
import o000O00O.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MessageEditText f56161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO0O000o f56162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f56163OooO0o0;

    public class OooO00o implements oO0O000o.OooO00o {
        public OooO00o() {
        }

        @Override // o0oOOooO.oO0O000o.OooO00o
        public final void OooO00o(int i, int i2, int i3, String str) {
            oO0.this.OooO00o(i, i2, i3);
        }
    }

    public oO0(MessageEditText messageEditText) {
        System.currentTimeMillis();
        this.f56163OooO0o0 = 0;
        this.f56161OooO0Oo = messageEditText;
        this.f56162OooO0o = new oO0O000o(new OooO00o());
    }

    public final void OooO00o(int i, int i2, int i3) {
        oOo00ooO next;
        MessageEditText messageEditText = this.f56161OooO0Oo;
        messageEditText.getText();
        int i4 = i + i2;
        if (i3 != 0) {
            i4 = i + i3;
        }
        int i5 = i3 - i2;
        oOo0000O spanManager = messageEditText.getSpanManager();
        spanManager.OooO00o();
        Iterator<oOo00ooO> it = spanManager.f56176OooO00o.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (i2 > 0) {
                if (next.f56183OooO0oO >= i && next.f56184OooO0oo <= i4) {
                    it.remove();
                }
            }
            if ((i2 > 0 && next.f56184OooO0oo >= i4) || (i3 > 0 && next.f56183OooO0oO >= i)) {
                int i6 = next.f56183OooO0oO + i5;
                next.f56183OooO0oO = i6;
                int i7 = next.f56184OooO0oo + i5;
                next.f56184OooO0oo = i7;
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
        this.f56163OooO0o0 = editable.length();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        MessageEditText messageEditText = this.f56161OooO0Oo;
        Editable text = messageEditText.getText();
        long jCurrentTimeMillis = System.currentTimeMillis();
        oO0O000o oo0o000o = this.f56162OooO0o;
        oo0o000o.OooO00o(jCurrentTimeMillis);
        if (i == 0 && i2 == (i4 = this.f56163OooO0o0) && i3 == 0 && i4 > 0) {
            oo0o000o.f56175OooO0o0 = System.currentTimeMillis();
            oo0o000o.f56170OooO00o = i;
            oo0o000o.f56171OooO0O0 = i2;
            oo0o000o.f56172OooO0OO = i3;
            oo0o000o.f56173OooO0Oo = " onTextChangedSubText 异常删除 ";
        } else if (i <= text.length()) {
            OooO00o(i, i2, i3);
        }
        if (i3 <= 0 || i3 != 1 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        String str = charSequence.toString().charAt(i) + "";
        messageEditText.getSelectionStart();
        if (!(TextUtils.isEmpty(str) ? false : messageEditText.getMaskKeys().containsKey(str)) || messageEditText.getSpanKeyListener() == null) {
            return;
        }
        ((o0000O0O) messageEditText.getSpanKeyListener()).OooO00o(str);
    }
}
