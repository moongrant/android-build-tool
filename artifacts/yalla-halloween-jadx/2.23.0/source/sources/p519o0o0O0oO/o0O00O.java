package p519o0o0O0oO;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.OooO0o;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends OooOO0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public EditText f52633OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f52634OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f52635OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f52636OooOO0o;

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            o0O00O o0o00o2 = o0O00O.this;
            String string = o0o00o2.f52633OooO.getText().toString();
            if (!string.contains("\n")) {
                o0o00o2.f52634OooOO0.setText(editable.length() + "/100");
                if (editable.length() <= 0 || string.equals(o0o00o2.f52636OooOO0o)) {
                    o0o00o2.f52635OooOO0O.setEnabled(false);
                    return;
                } else {
                    o0o00o2.f52635OooOO0O.setEnabled(true);
                    return;
                }
            }
            int selectionStart = o0o00o2.f52633OooO.getSelectionStart();
            int length = string.length();
            String strReplaceAll = string.replaceAll("\n", "");
            int length2 = selectionStart - (length - strReplaceAll.length());
            o0o00o2.f52633OooO.setText(strReplaceAll);
            if (length2 >= 0) {
                EditText editText = o0o00o2.f52633OooO;
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

    public o0O00O(@NonNull MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, 0);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.activity_room_notification_dialog;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        getWindow().setSoftInputMode(4);
        OooO00o(oO00O0oO.room_notification_dialog_dismiss);
        this.f52633OooO = (EditText) findViewById(oO00O0oO.room_notification_dialog_edit);
        this.f52634OooOO0 = (TextView) findViewById(oO00O0oO.room_notification_dialog_text);
        this.f52635OooOO0O = (TextView) OooO00o(oO00O0oO.room_notification_dialog_confirm);
        this.f52633OooO.addTextChangedListener(new OooO00o());
        this.f52633OooO.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f52633OooO.requestFocus();
    }

    public final void OooOO0o(String str, Boolean bool) {
        if (!bool.booleanValue() || com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47490OooO0o.getValue() != null) {
            this.f52633OooO.setText(str);
        }
        EditText editText = this.f52633OooO;
        editText.setSelection(editText.length());
        this.f52635OooOO0O.setEnabled(false);
        this.f52636OooOO0o = str;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        EditText editText = this.f52633OooO;
        InputMethodManager inputMethodManagerOooO00o = OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context");
        OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
        super.dismiss();
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == oO00O0oO.room_notification_dialog_dismiss) {
            dismiss();
            return;
        }
        if (id == oO00O0oO.room_notification_dialog_confirm) {
            String strTrim = this.f52633OooO.getText().toString().trim();
            Room.NoticeContentChangeRequest.Builder builderNewBuilder = Room.NoticeContentChangeRequest.newBuilder();
            builderNewBuilder.setNoticemsg(strTrim);
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
            if (roomLiveService2 != null) {
                roomLiveService2.OooO0oo(10059, builderNewBuilder.build().toByteArray());
            }
            dismiss();
        }
    }

    @Override // p391o0Oo0.OooOO0, android.app.Dialog
    public final void show() {
        super.show();
        EditText view = this.f52633OooO;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }
}
