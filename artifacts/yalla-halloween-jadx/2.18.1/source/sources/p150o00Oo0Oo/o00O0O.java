package p150o00Oo0Oo;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.app.base.framework.view.editTextSpan.MessageEditText;
import java.util.Iterator;
import java.util.Objects;
import p142o00OOooO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MessageEditText f32180Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f32181Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o00Ooo f32182Oooo0oo;

    public class OooO00o implements o00Ooo.OooO00o {
        public OooO00o() {
        }

        @Override // o00Oo0Oo.o00Ooo.OooO00o
        public final void OooO00o(int i, int i2, int i3, String str) {
            o00O0O.this.OooO00o(i, i2, i3);
        }
    }

    public o00O0O(MessageEditText messageEditText) {
        System.currentTimeMillis();
        this.f32181Oooo0oO = 0;
        this.f32180Oooo0o = messageEditText;
        this.f32182Oooo0oo = new o00Ooo(new OooO00o());
    }

    public final void OooO00o(int i, int i2, int i3) {
        OooOo next;
        this.f32180Oooo0o.getText();
        int i4 = i + i2;
        if (i3 != 0) {
            i4 = i + i3;
        }
        int i5 = i3 - i2;
        o000oOoO spanManager = this.f32180Oooo0o.getSpanManager();
        spanManager.OooO0O0();
        Iterator<OooOo> it = spanManager.f32178OooO00o.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (i2 > 0) {
                if (next.f32171Oooo >= i && next.f32176OoooO00 <= i4) {
                    it.remove();
                }
            }
            if ((i2 > 0 && next.f32176OoooO00 >= i4) || (i3 > 0 && next.f32171Oooo >= i)) {
                int i6 = next.f32171Oooo + i5;
                next.f32171Oooo = i6;
                int i7 = next.f32176OoooO00 + i5;
                next.f32176OoooO00 = i7;
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
        this.f32181Oooo0oO = editable.length();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        Editable text = this.f32180Oooo0o.getText();
        this.f32182Oooo0oo.OooO00o(System.currentTimeMillis());
        if (i == 0 && i2 == (i4 = this.f32181Oooo0oO) && i3 == 0 && i4 > 0) {
            o00Ooo o00ooo2 = this.f32182Oooo0oo;
            o00ooo2.f32190OooO0o0 = System.currentTimeMillis();
            o00ooo2.f32185OooO00o = i;
            o00ooo2.f32186OooO0O0 = i2;
            o00ooo2.f32187OooO0OO = i3;
            o00ooo2.f32188OooO0Oo = " onTextChangedSubText 异常删除 ";
        } else if (i <= text.length()) {
            OooO00o(i, i2, i3);
        }
        if (i3 <= 0 || i3 != 1 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        String str = charSequence.toString().charAt(i) + "";
        this.f32180Oooo0o.getSelectionStart();
        MessageEditText messageEditText = this.f32180Oooo0o;
        Objects.requireNonNull(messageEditText);
        if (!(TextUtils.isEmpty(str) ? false : messageEditText.getMaskKeys().containsKey(str)) || this.f32180Oooo0o.getSpanKeyListener() == null) {
            return;
        }
        ((OooOOO0) this.f32180Oooo0o.getSpanKeyListener()).OooO0O0(str);
    }
}
