package com.yalla.yalla.ui.dialog;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import com.yalla.yalla.ui.view.pop.passwordSettingPop.PasswordSettingModel;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p371o0OOo0oO.o00O0O;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.oo000o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p573o0oOoOO.o0O0o0;
import p650o0ooo.o00O000o;
import p650o0ooo.t;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class PasswordSettingDialog extends p401o0Oo0O00.OooO<PasswordSettingModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f27399OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f27400OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f27401OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public LinearLayout f27402OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public LinearLayout f27403OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public LinearLayout f27404OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f27405OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public FrameLayout f27406OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f27407OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public EditText f27408OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TableRow f27409OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f27410OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ImageView f27411OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ImageView f27412OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ImageView f27413OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f27414OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public LinearLayout f27415OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f27416OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TextView f27417OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f27418OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public LinearLayout f27419OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f27420OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f27421OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f27422Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Drawable f27423Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f27424Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f27425Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f27426Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Drawable f27427Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ProgressBar f27428Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f27429Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f27430Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f27431Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f27432Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f27433OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f27434OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f27435OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f27436OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f27437OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f27438OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f27439OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public PasswordDialogType f27440o000oOoO;

    public class OooO00o implements View.OnFocusChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            if (z) {
                return;
            }
            EditText editText = PasswordSettingDialog.this.f27408OooOOo0;
            InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
            kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
        }
    }

    public class OooO0O0 implements TextWatcher {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27442OooO0Oo;

        public OooO0O0(ArrayList arrayList) {
            this.f27442OooO0Oo = arrayList;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string = charSequence.toString();
            PasswordSettingDialog passwordSettingDialog = PasswordSettingDialog.this;
            if (passwordSettingDialog.f43650OooO0o0 != 0) {
                if (!TextUtils.isEmpty(string)) {
                    passwordSettingDialog.f27433OoooO = false;
                }
                boolean z = passwordSettingDialog.f27433OoooO;
                passwordSettingDialog.f27433OoooO = z;
                if (z) {
                    passwordSettingDialog.f27429Oooo0o.setVisibility(0);
                    passwordSettingDialog.f27409OooOOoo.setBackgroundResource(o0Oo0oo.bg_shape_f61414);
                    View view = passwordSettingDialog.f27414OooOo0o;
                    int i4 = o0OOO0o.color_F61414;
                    view.setBackgroundResource(i4);
                    passwordSettingDialog.f27410OooOo.setBackgroundResource(i4);
                    passwordSettingDialog.f27416OooOoO0.setBackgroundResource(i4);
                } else {
                    passwordSettingDialog.f27429Oooo0o.setVisibility(8);
                    passwordSettingDialog.f27409OooOOoo.setBackgroundResource(o0Oo0oo.bg_shape_d5d5d5);
                    View view2 = passwordSettingDialog.f27414OooOo0o;
                    int i5 = o0OOO0o.color_grey_d5;
                    view2.setBackgroundResource(i5);
                    passwordSettingDialog.f27410OooOo.setBackgroundResource(i5);
                    passwordSettingDialog.f27416OooOoO0.setBackgroundResource(i5);
                }
                ((PasswordSettingModel) passwordSettingDialog.f43650OooO0o0).setPassword(string + "");
                int length = string.length();
                ArrayList arrayList = this.f27442OooO0Oo;
                if (arrayList != null && length <= arrayList.size()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ImageView) it.next()).setVisibility(4);
                    }
                    for (int i6 = 0; i6 < length; i6++) {
                        ((ImageView) arrayList.get(i6)).setVisibility(0);
                    }
                }
            }
            passwordSettingDialog.OooOOoo();
        }
    }

    public class OooO0OO implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return null;
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f27444OooO00o;

        static {
            int[] iArr = new int[PasswordDialogType.values().length];
            f27444OooO00o = iArr;
            try {
                iArr[PasswordDialogType.PasswordInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27444OooO00o[PasswordDialogType.PasswordAdd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27444OooO00o[PasswordDialogType.PasswordChange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27444OooO00o[PasswordDialogType.PasswordDelete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum PasswordDialogType {
        PasswordInput,
        PasswordAdd,
        PasswordChange,
        PasswordDelete
    }

    public PasswordSettingDialog(MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, 0);
        this.f27426Oooo00o = true;
        this.f27423Oooo0 = o0000.OooO0O0(o0Oo0oo.icon_password_dialog_top);
        this.f27427Oooo0O0 = o0000.OooO0O0(o0Oo0oo.icon_password_dialog_bottom);
        this.f27431Oooo0oO = false;
        this.f27432Oooo0oo = false;
        this.f27422Oooo = o0Oo0oo.icon_lock_close_gray;
        this.f27435OoooO00 = o0Oo0oo.icon_lock_close_green;
        this.f27434OoooO0 = o0Oo0oo.icon_lock_open_gray;
        this.f27436OoooO0O = o0Oo0oo.icon_lock_open_green;
        this.f27433OoooO = false;
        this.f27437OoooOO0 = false;
        this.f27440o000oOoO = PasswordDialogType.PasswordAdd;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
        this.f27399OooO.setVisibility(0);
        this.f27400OooOO0.setVisibility(0);
        this.f27406OooOOOo.setVisibility(8);
        if (this.f27431Oooo0oO) {
            this.f27406OooOOOo.setVisibility(0);
        }
        this.f27402OooOO0o.setVisibility(8);
        if (this.f27432Oooo0oo) {
            this.f27402OooOO0o.setVisibility(0);
        }
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0OO() {
        if (this.f27433OoooO) {
            return o000000O.dialogWindowAnim;
        }
        return 0;
    }

    @Override // p401o0Oo0O00.OooO
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_pass_layout;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        this.f27399OooO = (RelativeLayout) OooO00o(o0OO00O.dialog_pass_layout_layout_bg);
        this.f27400OooOO0 = (LinearLayout) findViewById(o0OO00O.dialog_pass_layout_layout_content);
        this.f27401OooOO0O = (TextView) findViewById(o0OO00O.dialog_pass_layout_tv_title);
        this.f27402OooOO0o = (LinearLayout) findViewById(o0OO00O.dialog_pass_layout_lock_all_layout);
        this.f27404OooOOO0 = (LinearLayout) OooO00o(o0OO00O.dialog_pass_layout_lock_layout);
        this.f27403OooOOO = (LinearLayout) OooO00o(o0OO00O.dialog_pass_layout_unlock_layout);
        this.f27405OooOOOO = (TextView) findViewById(o0OO00O.dialog_pass_layout_tv_info);
        this.f27406OooOOOo = (FrameLayout) findViewById(o0OO00O.dialog_pass_layout_edit_frameLayout);
        this.f27408OooOOo0 = (EditText) findViewById(o0OO00O.dialog_pass_layout_edit);
        this.f27409OooOOoo = (TableRow) OooO00o(o0OO00O.dialog_pass_layout_table);
        this.f27407OooOOo = (ImageView) OooO00o(o0OO00O.dialog_pass_layout_table_0_iv);
        this.f27412OooOo00 = (ImageView) OooO00o(o0OO00O.dialog_pass_layout_table_1_iv);
        this.f27411OooOo0 = (ImageView) OooO00o(o0OO00O.dialog_pass_layout_table_2_iv);
        this.f27413OooOo0O = (ImageView) OooO00o(o0OO00O.dialog_pass_layout_table_3_iv);
        this.f27414OooOo0o = OooO00o(o0OO00O.dialog_pass_layout_table_1_line);
        this.f27410OooOo = OooO00o(o0OO00O.dialog_pass_layout_table_2_line);
        this.f27416OooOoO0 = OooO00o(o0OO00O.dialog_pass_layout_table_3_line);
        this.f27415OooOoO = (LinearLayout) OooO00o(o0OO00O.dialog_pass_layout_confirm_layout);
        this.f27428Oooo0OO = (ProgressBar) OooO00o(o0OO00O.dialog_pass_layout_confirm_progress);
        this.f27430Oooo0o0 = (TextView) OooO00o(o0OO00O.dialog_pass_layout_tv_confirm);
        this.f27417OooOoOO = (TextView) OooO00o(o0OO00O.dialog_pass_layout_tv_more_features);
        this.f27419OooOoo0 = (LinearLayout) findViewById(o0OO00O.dialog_pass_layout_layout_follow);
        this.f27418OooOoo = (TextView) OooO00o(o0OO00O.dialog_pass_layout_tv_follow_room);
        this.f27420OooOooO = (TextView) OooO00o(o0OO00O.dialog_pass_layout_tv_unfollow_room);
        this.f27421OooOooo = (TextView) OooO00o(o0OO00O.dialog_pass_layout_tv_unjoin_room);
        this.f27424Oooo000 = findViewById(o0OO00O.dialog_pass_layout_tv_join_line);
        this.f27425Oooo00O = (TextView) OooO00o(o0OO00O.dialog_pass_layout_tv_unjoin_unfollow);
        this.f27419OooOoo0.setVisibility(8);
        this.f27429Oooo0o = (TextView) findViewById(o0OO00O.dialog_pass_layout_error_tv);
        this.f27430Oooo0o0.setEnabled(false);
        this.f27415OooOoO.setEnabled(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f27407OooOOo);
        arrayList.add(this.f27412OooOo00);
        arrayList.add(this.f27411OooOo0);
        arrayList.add(this.f27413OooOo0O);
        this.f27408OooOOo0.setOnFocusChangeListener(new OooO00o());
        this.f27408OooOOo0.addTextChangedListener(new OooO0O0(arrayList));
        this.f27405OooOOOO.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public final void OooOO0o() {
        EditText editText = this.f27408OooOOo0;
        if (editText != null) {
            editText.clearFocus();
        }
        EditText editText2 = this.f27408OooOOo0;
        InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
        kotlin.collections.OooO00o.OooO0O0(editText2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText2.getWindowToken(), 0);
        OooOO0((PasswordSettingModel) this.f43650OooO0o0, AbsListenerTag.Cancel);
        dismiss();
    }

    public final void OooOOO(String str) {
        TextView textView = this.f27405OooOOOO;
        if (textView != null) {
            textView.setText("");
            this.f27405OooOOOO.setVisibility(8);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f27405OooOOOO.setText(str);
            this.f27405OooOOOO.setVisibility(0);
        }
    }

    public final void OooOOO0(final String str) {
        dismiss();
        o00O000o.OooO00o((BaseFragmentActivity) com.code.android.util.OooO0O0.OooO0O0(), str, new Function0() { // from class: o0ooo.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f59124OooO0Oo.OooOO0o();
                return null;
            }
        }, new Function0() { // from class: o0ooo.r
            /* JADX WARN: Code duplicated, block: B:19:0x003f  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b;
                PasswordSettingDialog passwordSettingDialog = this.f59141OooO0Oo;
                passwordSettingDialog.getClass();
                String str2 = str;
                str2.getClass();
                int iHashCode = str2.hashCode();
                if (iHashCode != -1298587734) {
                    if (iHashCode != -841454749) {
                        if (iHashCode == 613961165 && str2.equals("unJoin&unFollow")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (str2.equals("unJoin")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals("unFollow")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b != 0) {
                    if (b != 1) {
                        if (b == 2 && !OooOo00.OooO00o(null)) {
                            o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
                            oo000o.OooO00o(1, new w(passwordSettingDialog));
                        }
                    } else if (!OooOo00.OooO00o(null)) {
                        o00oO0o o00oo0o3 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
                        oo000o.OooO00o(0, new v(passwordSettingDialog));
                    }
                } else if (!OooOo00.OooO00o(null)) {
                    o00oO0o o00oo0o4 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
                    oo000o.OooO0O0(null, passwordSettingDialog.f27438OoooOOO, new u(passwordSettingDialog));
                }
                return null;
            }
        });
    }

    public final void OooOOOO(PasswordDialogType passwordDialogType) {
        this.f27440o000oOoO = passwordDialogType;
        this.f27428Oooo0OO.setVisibility(8);
        int i = OooO0o.f27444OooO00o[passwordDialogType.ordinal()];
        if (i == 1) {
            this.f27430Oooo0o0.setText(o0000.OooO0OO(o000000.Enter));
            this.f27417OooOoOO.setVisibility(0);
            OooOOOo(false, false);
            OooOOo0(OooO0oO(o000000.dialog_lock_tips));
            this.f27431Oooo0oO = true;
            this.f27406OooOOOo.setVisibility(8);
            this.f27406OooOOOo.setVisibility(0);
            return;
        }
        if (i == 2) {
            this.f27430Oooo0o0.setText(o0000.OooO0OO(o000000.Confirm));
            this.f27417OooOoOO.setVisibility(8);
            OooOOOo(false, false);
            OooOOo0(OooO0oO(o000000.dialog_lock_title));
            OooOOO(OooO0oO(o000000.dialog_lock_tips));
            return;
        }
        if (i == 3) {
            this.f27430Oooo0o0.setText(o0000.OooO0OO(o000000.Confirm));
            this.f27417OooOoOO.setVisibility(8);
            OooOOOo(true, false);
            OooOOo0(OooO0oO(o000000.dialog_lock_title));
            OooOOO(OooO0oO(o000000.Change_Passcode));
            return;
        }
        if (i != 4) {
            return;
        }
        this.f27430Oooo0o0.setText(o0000.OooO0OO(o000000.Confirm));
        this.f27417OooOoOO.setVisibility(8);
        OooOOOo(true, true);
        OooOOo0(OooO0oO(o000000.dialog_lock_title));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOOo(boolean z, boolean z2) {
        this.f27432Oooo0oo = z;
        this.f27437OoooOO0 = z2;
        this.f27402OooOO0o.setVisibility(8);
        if (z) {
            this.f27402OooOO0o.setVisibility(0);
        }
        Model model = this.f43650OooO0o0;
        if (model != 0) {
            ((PasswordSettingModel) model).setUnLock(z2);
        }
        OooOOoo();
    }

    public final void OooOOo(boolean z) {
        if (z) {
            this.f27419OooOoo0.setVisibility(8);
            o0O0o0.OooO00o(this.f27417OooOoOO, this.f27427Oooo0O0, ViewLocation.end, false);
            EditText view = this.f27408OooOOo0;
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
            return;
        }
        this.f27419OooOoo0.setVisibility(0);
        boolean z2 = this.f27438OoooOOO;
        boolean z3 = this.f27439OoooOOo;
        this.f27438OoooOOO = z2;
        this.f27439OoooOOo = z3;
        TextView textView = this.f27418OooOoo;
        if (textView != null) {
            textView.setVisibility(8);
            this.f27420OooOooO.setVisibility(8);
            this.f27421OooOooo.setVisibility(8);
            this.f27424Oooo000.setVisibility(8);
            this.f27425Oooo00O.setVisibility(8);
            if (this.f27439OoooOOo) {
                this.f27421OooOooo.setVisibility(0);
                if (this.f27438OoooOOO) {
                    this.f27424Oooo000.setVisibility(0);
                    this.f27425Oooo00O.setVisibility(0);
                }
            } else if (this.f27438OoooOOO) {
                this.f27420OooOooO.setVisibility(0);
            } else {
                this.f27418OooOoo.setVisibility(0);
            }
        }
        o0O0o0.OooO00o(this.f27417OooOoOO, this.f27423Oooo0, ViewLocation.end, false);
        EditText editText = this.f27408OooOOo0;
        InputMethodManager inputMethodManagerOooO00o2 = o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
        kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o2, editText.getWindowToken(), 0);
    }

    public final void OooOOo0(String str) {
        TextView textView = this.f27401OooOO0O;
        if (textView != null) {
            textView.setText("");
            this.f27401OooOO0O.setVisibility(8);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f27401OooOO0O.setText(str);
            this.f27401OooOO0O.setVisibility(0);
        }
    }

    public final void OooOOoo() {
        if (this.f27437OoooOO0) {
            this.f27430Oooo0o0.setEnabled(true);
            this.f27415OooOoO.setEnabled(true);
            EditText editText = this.f27408OooOOo0;
            InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
            kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
            this.f27406OooOOOo.setVisibility(8);
            this.f27405OooOOOO.setVisibility(8);
            this.f27404OooOOO0.setBackgroundResource(this.f27422Oooo);
            this.f27403OooOOO.setBackgroundResource(this.f27436OoooO0O);
            return;
        }
        if (this.f27440o000oOoO == PasswordDialogType.PasswordInput) {
            this.f27405OooOOOO.setVisibility(8);
        } else {
            this.f27405OooOOOO.setVisibility(0);
        }
        this.f27404OooOOO0.setBackgroundResource(this.f27435OoooO00);
        this.f27406OooOOOo.setVisibility(0);
        this.f27403OooOOO.setBackgroundResource(this.f27434OoooO0);
        if (this.f27408OooOOo0.getText().length() >= 4) {
            this.f27430Oooo0o0.setEnabled(true);
            this.f27415OooOoO.setEnabled(true);
            this.f27408OooOOo0.postDelayed(new Runnable() { // from class: o0ooo.s
                @Override // java.lang.Runnable
                public final void run() {
                    EditText editText2 = this.f59150OooO0Oo.f27408OooOOo0;
                    InputMethodManager inputMethodManagerOooO00o2 = o00O0O.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
                    OooO00o.OooO0O0(editText2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o2, editText2.getWindowToken(), 0);
                }
            }, 200L);
        } else {
            this.f27408OooOOo0.setFocusable(true);
            this.f27408OooOOo0.setFocusableInTouchMode(true);
            this.f27408OooOOo0.requestFocus();
            this.f27408OooOOo0.postDelayed(new OooO0O0.OooOO0(this, 2), 200L);
            this.f27430Oooo0o0.setEnabled(false);
            this.f27415OooOoO.setEnabled(false);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        EditText editText = this.f27408OooOOo0;
        InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
        kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        Activity activityOooO0O0;
        int id = view.getId();
        if (id == o0OO00O.dialog_pass_layout_tv_confirm || id == o0OO00O.dialog_pass_layout_confirm_layout || id == o0OO00O.dialog_pass_layout_confirm_progress) {
            this.f27428Oooo0OO.setVisibility(0);
            if (this.f27440o000oOoO == PasswordDialogType.PasswordInput) {
                this.f27430Oooo0o0.setText(o0000.OooO0OO(o000000.Entering));
            }
            OooOO0((PasswordSettingModel) this.f43650OooO0o0, AbsListenerTag.Ok);
            return;
        }
        if (id == o0OO00O.dialog_pass_layout_layout_bg) {
            OooOO0((PasswordSettingModel) this.f43650OooO0o0, AbsListenerTag.Bg);
            return;
        }
        if (id == o0OO00O.dialog_pass_layout_iv_cancel) {
            OooOO0o();
            return;
        }
        if (id == o0OO00O.dialog_pass_layout_lock_layout || id == o0OO00O.dialog_pass_layout_lock_tv) {
            if (this.f43650OooO0o0 == 0) {
                return;
            }
            OooOOOO(PasswordDialogType.PasswordChange);
            return;
        }
        if (id == o0OO00O.dialog_pass_layout_unlock_layout || id == o0OO00O.dialog_pass_layout_unlock_tv) {
            if (this.f43650OooO0o0 == 0) {
                return;
            }
            OooOOOO(PasswordDialogType.PasswordDelete);
            return;
        }
        if (id == o0OO00O.dialog_pass_layout_table || id == o0OO00O.dialog_pass_layout_table_0_iv || id == o0OO00O.dialog_pass_layout_table_1_iv || id == o0OO00O.dialog_pass_layout_table_2_iv || id == o0OO00O.dialog_pass_layout_table_3_iv || id == o0OO00O.dialog_pass_layout_table_1_line || id == o0OO00O.dialog_pass_layout_table_2_line || id == o0OO00O.dialog_pass_layout_table_3_line || id == o0OO00O.dialog_pass_layout_edit || id == o0OO00O.dialog_pass_layout_edit_frameLayout) {
            this.f27408OooOOo0.setFocusable(true);
            this.f27408OooOOo0.setFocusableInTouchMode(true);
            this.f27408OooOOo0.requestFocus();
            this.f27426Oooo00o = true;
            OooOOo(true);
            return;
        }
        if (id == o0OO00O.dialog_pass_layout_tv_more_features) {
            boolean z = !this.f27426Oooo00o;
            this.f27426Oooo00o = z;
            OooOOo(z);
            return;
        }
        if (id != o0OO00O.dialog_pass_layout_tv_follow_room) {
            if (id == o0OO00O.dialog_pass_layout_tv_unfollow_room) {
                o0oo0000.OooO00o.OooO0O0("102179");
                OooOOO0("unFollow");
                return;
            } else if (id == o0OO00O.dialog_pass_layout_tv_unjoin_room) {
                o0oo0000.OooO00o.OooO0O0("102180");
                OooOOO0("unJoin");
                return;
            } else {
                if (id == o0OO00O.dialog_pass_layout_tv_unjoin_unfollow) {
                    o0oo0000.OooO00o.OooO0O0("101081");
                    OooOOO0("unJoin&unFollow");
                    return;
                }
                return;
            }
        }
        o0oo0000.OooO00o.OooO0O0("102178");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (((Boolean) o0O00oO0.OooOo0O().getValue()).booleanValue()) {
            if (com.code.android.util.OooOo00.OooO00o(null)) {
                return;
            }
            o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
            oo000o.OooO0O0(null, this.f27438OoooOOO, new t(this));
            return;
        }
        OooO0OO onLogin = new OooO0OO();
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE) || (activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0()) == null) {
            return;
        }
        int i = LoginActivity.f24727OooOo0O;
        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
    }

    @Override // p401o0Oo0O00.OooO, android.app.Dialog
    public final void show() {
        EditText editText = this.f27408OooOOo0;
        if (editText != null) {
            editText.setText("");
        }
        super.show();
    }
}
