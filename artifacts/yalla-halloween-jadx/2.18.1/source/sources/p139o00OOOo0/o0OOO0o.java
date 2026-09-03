package p139o00OOOo0;

import Oooo000.o00O0O;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p146o00Oo000.OooO0O0;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends OooO0O0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f31850OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public EditText f31851OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public TextView f31852OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public String f31853OoooOO0;

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string = o0OOO0o.this.f31851OoooO0.getText().toString();
            if (!string.contains("\n")) {
                o0OOO0o.this.f31852OoooO0O.setText(editable.length() + "/100");
                if (editable.length() <= 0 || string.equals(o0OOO0o.this.f31853OoooOO0)) {
                    o0OOO0o.this.f31850OoooO.setEnabled(false);
                    return;
                } else {
                    o0OOO0o.this.f31850OoooO.setEnabled(true);
                    return;
                }
            }
            int selectionStart = o0OOO0o.this.f31851OoooO0.getSelectionStart();
            int length = string.length();
            String strReplaceAll = string.replaceAll("\n", "");
            int length2 = selectionStart - (length - strReplaceAll.length());
            o0OOO0o.this.f31851OoooO0.setText(strReplaceAll);
            if (length2 >= 0) {
                EditText editText = o0OOO0o.this.f31851OoooO0;
                if (length2 > strReplaceAll.length()) {
                    length2 = strReplaceAll.length();
                }
                editText.setSelection(length2);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public o0OOO0o(@NonNull Context context) {
        super(context, 0);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.activity_room_notification_dialog;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        getWindow().setSoftInputMode(4);
        OooO00o(R.id.room_notification_dialog_dismiss);
        this.f31851OoooO0 = (EditText) findViewById(R.id.room_notification_dialog_edit);
        this.f31852OoooO0O = (TextView) findViewById(R.id.room_notification_dialog_text);
        this.f31850OoooO = (TextView) OooO00o(R.id.room_notification_dialog_confirm);
        this.f31851OoooO0.addTextChangedListener(new OooO00o());
        this.f31851OoooO0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f31851OoooO0.requestFocus();
    }

    public final void OooOOO(String str, Boolean bool) {
        if (!bool.booleanValue() || o000O00O.OooO().f32427Oooo.getNotice() != null) {
            this.f31851OoooO0.setText(str);
        }
        EditText editText = this.f31851OoooO0;
        editText.setSelection(editText.length());
        this.f31850OoooO.setEnabled(false);
        this.f31853OoooOO0 = str;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        EditText editText = this.f31851OoooO0;
        o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText, "view.context"), new Handler()));
        super.dismiss();
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.room_notification_dialog_dismiss) {
            dismiss();
        } else if (id == R.id.room_notification_dialog_confirm) {
            o00O000.OooO().OooO0OO(this.f31851OoooO0.getText().toString().trim());
            dismiss();
        }
    }

    @Override // p146o00Oo000.OooO0O0, android.app.Dialog
    public final void show() {
        super.show();
        EditText view = this.f31851OoooO0;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p470o0Oooo0.o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }
}
