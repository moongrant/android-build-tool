package com.yalla.yalla.ui.dialog;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.media.session.OooO0o;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.OooOO0O;
import p367o0OOo0o0.Oooo000;
import p377o0OOoOo.o000O00;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.o00O0OO;
import p519o0o0O0oO.q;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class PasswordSettingDialog extends p391o0Oo0.OooOO0<PasswordSettingModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f27862OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f27863OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f27864OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public LinearLayout f27865OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public LinearLayout f27866OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public LinearLayout f27867OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f27868OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public FrameLayout f27869OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f27870OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public EditText f27871OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TableRow f27872OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f27873OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ImageView f27874OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ImageView f27875OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ImageView f27876OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f27877OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public LinearLayout f27878OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f27879OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TextView f27880OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f27881OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public LinearLayout f27882OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f27883OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f27884OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f27885Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Drawable f27886Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f27887Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f27888Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f27889Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Drawable f27890Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ProgressBar f27891Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f27892Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f27893Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f27894Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f27895Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f27896OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f27897OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f27898OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f27899OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f27900OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f27901OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f27902OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public PasswordDialogType f27903o000oOoO;

    public class OooO00o implements View.OnFocusChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            if (z) {
                return;
            }
            EditText editText = PasswordSettingDialog.this.f27871OooOOo0;
            InputMethodManager inputMethodManagerOooO00o = android.support.v4.media.session.OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context");
            p367o0OOo0o0.OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
        }
    }

    public class OooO0O0 implements TextWatcher {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27905OooO0Oo;

        public OooO0O0(ArrayList arrayList) {
            this.f27905OooO0Oo = arrayList;
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
            if (passwordSettingDialog.f44398OooO0o0 != 0) {
                if (!TextUtils.isEmpty(string)) {
                    passwordSettingDialog.f27896OoooO = false;
                }
                boolean z = passwordSettingDialog.f27896OoooO;
                passwordSettingDialog.f27896OoooO = z;
                if (z) {
                    passwordSettingDialog.f27892Oooo0o.setVisibility(0);
                    passwordSettingDialog.f27872OooOOoo.setBackgroundResource(oOo00OO0.bg_shape_f61414);
                    View view = passwordSettingDialog.f27877OooOo0o;
                    int i4 = oO00O0o.color_F61414;
                    view.setBackgroundResource(i4);
                    passwordSettingDialog.f27873OooOo.setBackgroundResource(i4);
                    passwordSettingDialog.f27879OooOoO0.setBackgroundResource(i4);
                } else {
                    passwordSettingDialog.f27892Oooo0o.setVisibility(8);
                    passwordSettingDialog.f27872OooOOoo.setBackgroundResource(oOo00OO0.bg_shape_d5d5d5);
                    View view2 = passwordSettingDialog.f27877OooOo0o;
                    int i5 = oO00O0o.color_grey_d5;
                    view2.setBackgroundResource(i5);
                    passwordSettingDialog.f27873OooOo.setBackgroundResource(i5);
                    passwordSettingDialog.f27879OooOoO0.setBackgroundResource(i5);
                }
                ((PasswordSettingModel) passwordSettingDialog.f44398OooO0o0).setPassword(string + "");
                int length = string.length();
                ArrayList arrayList = this.f27905OooO0Oo;
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
        public static final /* synthetic */ int[] f27907OooO00o;

        static {
            int[] iArr = new int[PasswordDialogType.values().length];
            f27907OooO00o = iArr;
            try {
                iArr[PasswordDialogType.PasswordInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27907OooO00o[PasswordDialogType.PasswordAdd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27907OooO00o[PasswordDialogType.PasswordChange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27907OooO00o[PasswordDialogType.PasswordDelete.ordinal()] = 4;
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
        this.f27889Oooo00o = true;
        this.f27886Oooo0 = o0000.OooO0O0(oOo00OO0.icon_password_dialog_top);
        this.f27890Oooo0O0 = o0000.OooO0O0(oOo00OO0.icon_password_dialog_bottom);
        this.f27894Oooo0oO = false;
        this.f27895Oooo0oo = false;
        this.f27885Oooo = oOo00OO0.icon_lock_close_gray;
        this.f27898OoooO00 = oOo00OO0.icon_lock_close_green;
        this.f27897OoooO0 = oOo00OO0.icon_lock_open_gray;
        this.f27899OoooO0O = oOo00OO0.icon_lock_open_green;
        this.f27896OoooO = false;
        this.f27900OoooOO0 = false;
        this.f27903o000oOoO = PasswordDialogType.PasswordAdd;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
        this.f27862OooO.setVisibility(0);
        this.f27863OooOO0.setVisibility(0);
        this.f27869OooOOOo.setVisibility(8);
        if (this.f27894Oooo0oO) {
            this.f27869OooOOOo.setVisibility(0);
        }
        this.f27865OooOO0o.setVisibility(8);
        if (this.f27895Oooo0oo) {
            this.f27865OooOO0o.setVisibility(0);
        }
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0OO() {
        if (this.f27896OoooO) {
            return oO00Oo00.dialogWindowAnim;
        }
        return 0;
    }

    @Override // p391o0Oo0.OooOO0
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_pass_layout;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        this.f27862OooO = (RelativeLayout) OooO00o(oO00O0oO.dialog_pass_layout_layout_bg);
        this.f27863OooOO0 = (LinearLayout) findViewById(oO00O0oO.dialog_pass_layout_layout_content);
        this.f27864OooOO0O = (TextView) findViewById(oO00O0oO.dialog_pass_layout_tv_title);
        this.f27865OooOO0o = (LinearLayout) findViewById(oO00O0oO.dialog_pass_layout_lock_all_layout);
        this.f27867OooOOO0 = (LinearLayout) OooO00o(oO00O0oO.dialog_pass_layout_lock_layout);
        this.f27866OooOOO = (LinearLayout) OooO00o(oO00O0oO.dialog_pass_layout_unlock_layout);
        this.f27868OooOOOO = (TextView) findViewById(oO00O0oO.dialog_pass_layout_tv_info);
        this.f27869OooOOOo = (FrameLayout) findViewById(oO00O0oO.dialog_pass_layout_edit_frameLayout);
        this.f27871OooOOo0 = (EditText) findViewById(oO00O0oO.dialog_pass_layout_edit);
        this.f27872OooOOoo = (TableRow) OooO00o(oO00O0oO.dialog_pass_layout_table);
        this.f27870OooOOo = (ImageView) OooO00o(oO00O0oO.dialog_pass_layout_table_0_iv);
        this.f27875OooOo00 = (ImageView) OooO00o(oO00O0oO.dialog_pass_layout_table_1_iv);
        this.f27874OooOo0 = (ImageView) OooO00o(oO00O0oO.dialog_pass_layout_table_2_iv);
        this.f27876OooOo0O = (ImageView) OooO00o(oO00O0oO.dialog_pass_layout_table_3_iv);
        this.f27877OooOo0o = OooO00o(oO00O0oO.dialog_pass_layout_table_1_line);
        this.f27873OooOo = OooO00o(oO00O0oO.dialog_pass_layout_table_2_line);
        this.f27879OooOoO0 = OooO00o(oO00O0oO.dialog_pass_layout_table_3_line);
        this.f27878OooOoO = (LinearLayout) OooO00o(oO00O0oO.dialog_pass_layout_confirm_layout);
        this.f27891Oooo0OO = (ProgressBar) OooO00o(oO00O0oO.dialog_pass_layout_confirm_progress);
        this.f27893Oooo0o0 = (TextView) OooO00o(oO00O0oO.dialog_pass_layout_tv_confirm);
        this.f27880OooOoOO = (TextView) OooO00o(oO00O0oO.dialog_pass_layout_tv_more_features);
        this.f27882OooOoo0 = (LinearLayout) findViewById(oO00O0oO.dialog_pass_layout_layout_follow);
        this.f27881OooOoo = (TextView) OooO00o(oO00O0oO.dialog_pass_layout_tv_follow_room);
        this.f27883OooOooO = (TextView) OooO00o(oO00O0oO.dialog_pass_layout_tv_unfollow_room);
        this.f27884OooOooo = (TextView) OooO00o(oO00O0oO.dialog_pass_layout_tv_unjoin_room);
        this.f27887Oooo000 = findViewById(oO00O0oO.dialog_pass_layout_tv_join_line);
        this.f27888Oooo00O = (TextView) OooO00o(oO00O0oO.dialog_pass_layout_tv_unjoin_unfollow);
        this.f27882OooOoo0.setVisibility(8);
        this.f27892Oooo0o = (TextView) findViewById(oO00O0oO.dialog_pass_layout_error_tv);
        this.f27893Oooo0o0.setEnabled(false);
        this.f27878OooOoO.setEnabled(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f27870OooOOo);
        arrayList.add(this.f27875OooOo00);
        arrayList.add(this.f27874OooOo0);
        arrayList.add(this.f27876OooOo0O);
        this.f27871OooOOo0.setOnFocusChangeListener(new OooO00o());
        this.f27871OooOOo0.addTextChangedListener(new OooO0O0(arrayList));
        this.f27868OooOOOO.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public final void OooOO0o() {
        EditText editText = this.f27871OooOOo0;
        if (editText != null) {
            editText.clearFocus();
        }
        EditText editText2 = this.f27871OooOOo0;
        InputMethodManager inputMethodManagerOooO00o = android.support.v4.media.session.OooO0o.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "view.context");
        p367o0OOo0o0.OooOO0O.OooO00o(editText2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText2.getWindowToken(), 0);
        OooOO0((PasswordSettingModel) this.f44398OooO0o0, AbsListenerTag.Cancel);
        dismiss();
    }

    public final void OooOOO(String str) {
        TextView textView = this.f27868OooOOOO;
        if (textView != null) {
            textView.setText("");
            this.f27868OooOOOO.setVisibility(8);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f27868OooOOOO.setText(str);
            this.f27868OooOOOO.setVisibility(0);
        }
    }

    public final void OooOOO0(final String str) {
        dismiss();
        o00O0OO.OooO00o((BaseFragmentActivity) com.code.android.util.OooO0O0.OooO0O0(), str, new Function0() { // from class: o0o0O0oO.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f52412OooO0Oo.OooOO0o();
                return null;
            }
        }, new Function0() { // from class: o0o0O0oO.m
            /* JADX WARN: Code duplicated, block: B:19:0x003f  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b;
                PasswordSettingDialog passwordSettingDialog = this.f52422OooO0Oo;
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
                            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
                            o000O00.OooO00o(1, new t(passwordSettingDialog));
                        }
                    } else if (!OooOo00.OooO00o(null)) {
                        o000O00O o000o00o3 = o000O0O0.f44226OooO00o;
                        o000O00.OooO00o(0, new s(passwordSettingDialog));
                    }
                } else if (!OooOo00.OooO00o(null)) {
                    o000O00O o000o00o4 = o000O0O0.f44226OooO00o;
                    o000O00.OooO0O0(null, passwordSettingDialog.f27901OoooOOO, new r(passwordSettingDialog));
                }
                return null;
            }
        });
    }

    public final void OooOOOO(PasswordDialogType passwordDialogType) {
        this.f27903o000oOoO = passwordDialogType;
        this.f27891Oooo0OO.setVisibility(8);
        int i = OooO0o.f27907OooO00o[passwordDialogType.ordinal()];
        if (i == 1) {
            this.f27893Oooo0o0.setText(o0000.OooO0OO(oO00OOo0.Enter));
            this.f27880OooOoOO.setVisibility(0);
            OooOOOo(false, false);
            OooOOo0(OooO0oO(oO00OOo0.dialog_lock_tips));
            this.f27894Oooo0oO = true;
            this.f27869OooOOOo.setVisibility(8);
            this.f27869OooOOOo.setVisibility(0);
            return;
        }
        if (i == 2) {
            this.f27893Oooo0o0.setText(o0000.OooO0OO(oO00OOo0.Confirm));
            this.f27880OooOoOO.setVisibility(8);
            OooOOOo(false, false);
            OooOOo0(OooO0oO(oO00OOo0.dialog_lock_title));
            OooOOO(OooO0oO(oO00OOo0.dialog_lock_tips));
            return;
        }
        if (i == 3) {
            this.f27893Oooo0o0.setText(o0000.OooO0OO(oO00OOo0.Confirm));
            this.f27880OooOoOO.setVisibility(8);
            OooOOOo(true, false);
            OooOOo0(OooO0oO(oO00OOo0.dialog_lock_title));
            OooOOO(OooO0oO(oO00OOo0.Change_Passcode));
            return;
        }
        if (i != 4) {
            return;
        }
        this.f27893Oooo0o0.setText(o0000.OooO0OO(oO00OOo0.Confirm));
        this.f27880OooOoOO.setVisibility(8);
        OooOOOo(true, true);
        OooOOo0(OooO0oO(oO00OOo0.dialog_lock_title));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOOo(boolean z, boolean z2) {
        this.f27895Oooo0oo = z;
        this.f27900OoooOO0 = z2;
        this.f27865OooOO0o.setVisibility(8);
        if (z) {
            this.f27865OooOO0o.setVisibility(0);
        }
        Model model = this.f44398OooO0o0;
        if (model != 0) {
            ((PasswordSettingModel) model).setUnLock(z2);
        }
        OooOOoo();
    }

    public final void OooOOo(boolean z) {
        if (z) {
            this.f27882OooOoo0.setVisibility(8);
            oO000Oo.OooO00o(this.f27880OooOoOO, this.f27890Oooo0O0, ViewLocation.end, false);
            EditText view = this.f27871OooOOo0;
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
            return;
        }
        this.f27882OooOoo0.setVisibility(0);
        boolean z2 = this.f27901OoooOOO;
        boolean z3 = this.f27902OoooOOo;
        this.f27901OoooOOO = z2;
        this.f27902OoooOOo = z3;
        TextView textView = this.f27881OooOoo;
        if (textView != null) {
            textView.setVisibility(8);
            this.f27883OooOooO.setVisibility(8);
            this.f27884OooOooo.setVisibility(8);
            this.f27887Oooo000.setVisibility(8);
            this.f27888Oooo00O.setVisibility(8);
            if (this.f27902OoooOOo) {
                this.f27884OooOooo.setVisibility(0);
                if (this.f27901OoooOOO) {
                    this.f27887Oooo000.setVisibility(0);
                    this.f27888Oooo00O.setVisibility(0);
                }
            } else if (this.f27901OoooOOO) {
                this.f27883OooOooO.setVisibility(0);
            } else {
                this.f27881OooOoo.setVisibility(0);
            }
        }
        oO000Oo.OooO00o(this.f27880OooOoOO, this.f27886Oooo0, ViewLocation.end, false);
        EditText editText = this.f27871OooOOo0;
        InputMethodManager inputMethodManagerOooO00o2 = android.support.v4.media.session.OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context");
        p367o0OOo0o0.OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o2, editText.getWindowToken(), 0);
    }

    public final void OooOOo0(String str) {
        TextView textView = this.f27864OooOO0O;
        if (textView != null) {
            textView.setText("");
            this.f27864OooOO0O.setVisibility(8);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f27864OooOO0O.setText(str);
            this.f27864OooOO0O.setVisibility(0);
        }
    }

    public final void OooOOoo() {
        if (this.f27900OoooOO0) {
            this.f27893Oooo0o0.setEnabled(true);
            this.f27878OooOoO.setEnabled(true);
            EditText editText = this.f27871OooOOo0;
            InputMethodManager inputMethodManagerOooO00o = android.support.v4.media.session.OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context");
            p367o0OOo0o0.OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
            this.f27869OooOOOo.setVisibility(8);
            this.f27868OooOOOO.setVisibility(8);
            this.f27867OooOOO0.setBackgroundResource(this.f27885Oooo);
            this.f27866OooOOO.setBackgroundResource(this.f27899OoooO0O);
            return;
        }
        if (this.f27903o000oOoO == PasswordDialogType.PasswordInput) {
            this.f27868OooOOOO.setVisibility(8);
        } else {
            this.f27868OooOOOO.setVisibility(0);
        }
        this.f27867OooOOO0.setBackgroundResource(this.f27898OoooO00);
        this.f27869OooOOOo.setVisibility(0);
        this.f27866OooOOO.setBackgroundResource(this.f27897OoooO0);
        if (this.f27871OooOOo0.getText().length() >= 4) {
            this.f27893Oooo0o0.setEnabled(true);
            this.f27878OooOoO.setEnabled(true);
            this.f27871OooOOo0.postDelayed(new Runnable() { // from class: o0o0O0oO.n
                @Override // java.lang.Runnable
                public final void run() {
                    EditText editText2 = this.f52435OooO0Oo.f27871OooOOo0;
                    InputMethodManager inputMethodManagerOooO00o2 = OooO0o.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "view.context");
                    OooOO0O.OooO00o(editText2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o2, editText2.getWindowToken(), 0);
                }
            }, 200L);
        } else {
            this.f27871OooOOo0.setFocusable(true);
            this.f27871OooOOo0.setFocusableInTouchMode(true);
            this.f27871OooOOo0.requestFocus();
            this.f27871OooOOo0.postDelayed(new Runnable() { // from class: o0o0O0oO.p
                @Override // java.lang.Runnable
                public final void run() {
                    EditText view = this.f53065OooO0Oo.f27871OooOOo0;
                    Intrinsics.checkNotNullParameter(view, "view");
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    InputMethodManager inputMethodManagerOooO00o2 = Oooo000.OooO00o(context);
                    view.setFocusable(true);
                    view.setFocusableInTouchMode(true);
                    view.requestFocus();
                    inputMethodManagerOooO00o2.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                }
            }, 200L);
            this.f27893Oooo0o0.setEnabled(false);
            this.f27878OooOoO.setEnabled(false);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        EditText editText = this.f27871OooOOo0;
        InputMethodManager inputMethodManagerOooO00o = android.support.v4.media.session.OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context");
        p367o0OOo0o0.OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        Activity activityOooO0O0;
        int id = view.getId();
        if (id == oO00O0oO.dialog_pass_layout_tv_confirm || id == oO00O0oO.dialog_pass_layout_confirm_layout || id == oO00O0oO.dialog_pass_layout_confirm_progress) {
            this.f27891Oooo0OO.setVisibility(0);
            if (this.f27903o000oOoO == PasswordDialogType.PasswordInput) {
                this.f27893Oooo0o0.setText(o0000.OooO0OO(oO00OOo0.Entering));
            }
            OooOO0((PasswordSettingModel) this.f44398OooO0o0, AbsListenerTag.Ok);
            return;
        }
        if (id == oO00O0oO.dialog_pass_layout_layout_bg) {
            OooOO0((PasswordSettingModel) this.f44398OooO0o0, AbsListenerTag.Bg);
            return;
        }
        if (id == oO00O0oO.dialog_pass_layout_iv_cancel) {
            OooOO0o();
            return;
        }
        if (id == oO00O0oO.dialog_pass_layout_lock_layout || id == oO00O0oO.dialog_pass_layout_lock_tv) {
            if (this.f44398OooO0o0 == 0) {
                return;
            }
            OooOOOO(PasswordDialogType.PasswordChange);
            return;
        }
        if (id == oO00O0oO.dialog_pass_layout_unlock_layout || id == oO00O0oO.dialog_pass_layout_unlock_tv) {
            if (this.f44398OooO0o0 == 0) {
                return;
            }
            OooOOOO(PasswordDialogType.PasswordDelete);
            return;
        }
        if (id == oO00O0oO.dialog_pass_layout_table || id == oO00O0oO.dialog_pass_layout_table_0_iv || id == oO00O0oO.dialog_pass_layout_table_1_iv || id == oO00O0oO.dialog_pass_layout_table_2_iv || id == oO00O0oO.dialog_pass_layout_table_3_iv || id == oO00O0oO.dialog_pass_layout_table_1_line || id == oO00O0oO.dialog_pass_layout_table_2_line || id == oO00O0oO.dialog_pass_layout_table_3_line || id == oO00O0oO.dialog_pass_layout_edit || id == oO00O0oO.dialog_pass_layout_edit_frameLayout) {
            this.f27871OooOOo0.setFocusable(true);
            this.f27871OooOOo0.setFocusableInTouchMode(true);
            this.f27871OooOOo0.requestFocus();
            this.f27889Oooo00o = true;
            OooOOo(true);
            return;
        }
        if (id == oO00O0oO.dialog_pass_layout_tv_more_features) {
            boolean z = !this.f27889Oooo00o;
            this.f27889Oooo00o = z;
            OooOOo(z);
            return;
        }
        if (id != oO00O0oO.dialog_pass_layout_tv_follow_room) {
            if (id == oO00O0oO.dialog_pass_layout_tv_unfollow_room) {
                o0OO000.OooO00o("102179");
                OooOOO0("unFollow");
                return;
            } else if (id == oO00O0oO.dialog_pass_layout_tv_unjoin_room) {
                o0OO000.OooO00o("102180");
                OooOOO0("unJoin");
                return;
            } else {
                if (id == oO00O0oO.dialog_pass_layout_tv_unjoin_unfollow) {
                    o0OO000.OooO00o("101081");
                    OooOOO0("unJoin&unFollow");
                    return;
                }
                return;
            }
        }
        o0OO000.OooO00o("102178");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (((Boolean) o000000O.OooOo0O().getValue()).booleanValue()) {
            if (com.code.android.util.OooOo00.OooO00o(null)) {
                return;
            }
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            o000O00.OooO0O0(null, this.f27901OoooOOO, new q(this));
            return;
        }
        OooO0OO onLogin = new OooO0OO();
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE) || (activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0()) == null) {
            return;
        }
        int i = LoginActivity.f25186OooOo0O;
        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
    }

    @Override // p391o0Oo0.OooOO0, android.app.Dialog
    public final void show() {
        EditText editText = this.f27871OooOOo0;
        if (editText != null) {
            editText.setText("");
        }
        super.show();
    }
}
