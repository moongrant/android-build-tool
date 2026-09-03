package p650o0ooo;

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
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.jvm.internal.Intrinsics;
import p371o0OOo0oO.o00O0O;
import p371o0OOo0oO.o0OOO0o;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends OooO<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public EditText f59050OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f59051OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f59052OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f59053OooOO0o;

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            oo0o0O0 oo0o0o0 = oo0o0O0.this;
            String string = oo0o0o0.f59050OooO.getText().toString();
            if (!string.contains("\n")) {
                oo0o0o0.f59051OooOO0.setText(editable.length() + "/100");
                if (editable.length() <= 0 || string.equals(oo0o0o0.f59053OooOO0o)) {
                    oo0o0o0.f59052OooOO0O.setEnabled(false);
                    return;
                } else {
                    oo0o0o0.f59052OooOO0O.setEnabled(true);
                    return;
                }
            }
            int selectionStart = oo0o0o0.f59050OooO.getSelectionStart();
            int length = string.length();
            String strReplaceAll = string.replaceAll("\n", "");
            int length2 = selectionStart - (length - strReplaceAll.length());
            oo0o0o0.f59050OooO.setText(strReplaceAll);
            if (length2 >= 0) {
                EditText editText = oo0o0o0.f59050OooO;
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

    public oo0o0O0(@NonNull MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, 0);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.activity_room_notification_dialog;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        getWindow().setSoftInputMode(4);
        OooO00o(o0OO00O.room_notification_dialog_dismiss);
        this.f59050OooO = (EditText) findViewById(o0OO00O.room_notification_dialog_edit);
        this.f59051OooOO0 = (TextView) findViewById(o0OO00O.room_notification_dialog_text);
        this.f59052OooOO0O = (TextView) OooO00o(o0OO00O.room_notification_dialog_confirm);
        this.f59050OooO.addTextChangedListener(new OooO00o());
        this.f59050OooO.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f59050OooO.requestFocus();
    }

    public final void OooOO0o(String str, Boolean bool) {
        if (!bool.booleanValue() || com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.f48463OooO0o.getValue() != null) {
            this.f59050OooO.setText(str);
        }
        EditText editText = this.f59050OooO;
        editText.setSelection(editText.length());
        this.f59052OooOO0O.setEnabled(false);
        this.f59053OooOO0o = str;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        EditText editText = this.f59050OooO;
        InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
        kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
        super.dismiss();
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == o0OO00O.room_notification_dialog_dismiss) {
            dismiss();
            return;
        }
        if (id == o0OO00O.room_notification_dialog_confirm) {
            String strTrim = this.f59050OooO.getText().toString().trim();
            Room.NoticeContentChangeRequest.Builder builderNewBuilder = Room.NoticeContentChangeRequest.newBuilder();
            builderNewBuilder.setNoticemsg(strTrim);
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
            if (roomLiveService2 != null) {
                roomLiveService2.OooO0oo(10059, builderNewBuilder.build().toByteArray());
            }
            dismiss();
        }
    }

    @Override // p401o0Oo0O00.OooO, android.app.Dialog
    public final void show() {
        super.show();
        EditText view = this.f59050OooO;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }
}
