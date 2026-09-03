package com.app.base.dialog.baseDialog;

import Oooo000.o00O0O;
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
import androidx.appcompat.widget.o0000O0O;
import com.app.base.base.activity.BaseFragmentActivity;
import com.app.base.dialog.baseDialog.PasswordSettingDialog;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.view.pop.passwordSettingPop.PasswordSettingModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p025Oooo0O0.o000O0Oo;
import p139o00OOOo0.o000oOoO;
import p152o00Oo0o0.o00Oo00;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p470o0Oooo0.o00O000;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ResourceAsColor"})
public final class PasswordSettingDialog extends p146o00Oo000.OooO0O0<PasswordSettingModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f11478OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public RelativeLayout f11479OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public LinearLayout f11480OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public LinearLayout f11481OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public LinearLayout f11482OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public TextView f11483OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public FrameLayout f11484OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public EditText f11485OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ImageView f11486OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TableRow f11487Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ImageView f11488Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ImageView f11489OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ImageView f11490OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public View f11491OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public View f11492Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public View f11493Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public LinearLayout f11494OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public TextView f11495Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f11496o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f11497o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public PasswordDialogType f11498o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f11499o000000o;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public String f11500o00000O0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f11501o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public LinearLayout f11502o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public TextView f11503o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public TextView f11504o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public View f11505o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public TextView f11506o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public ProgressBar f11507o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public Drawable f11508o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f11509o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f11510o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f11511o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f11512o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f11513o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public LinearLayout f11514o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public TextView f11515o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public TextView f11516o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f11517o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public Drawable f11518oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f11519oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public TextView f11520ooOO;

    public class OooO00o implements View.OnFocusChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            if (z) {
                return;
            }
            EditText editText = PasswordSettingDialog.this.f11485OoooOoO;
            o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText, "view.context"), new Handler()));
        }
    }

    public class OooO0O0 implements TextWatcher {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f11522Oooo0o;

        public OooO0O0(ArrayList arrayList) {
            this.f11522Oooo0o = arrayList;
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
            if (PasswordSettingDialog.this.f32153Oooo0oO != 0) {
                if (!TextUtils.isEmpty(string)) {
                    PasswordSettingDialog.this.f11501o000OOo = false;
                }
                PasswordSettingDialog passwordSettingDialog = PasswordSettingDialog.this;
                passwordSettingDialog.OooOo0(passwordSettingDialog.f11501o000OOo);
                ((PasswordSettingModel) PasswordSettingDialog.this.f32153Oooo0oO).setPassword(string + "");
                int length = string.length();
                ArrayList arrayList = this.f11522Oooo0o;
                if (arrayList != null && length <= arrayList.size()) {
                    Iterator it = this.f11522Oooo0o.iterator();
                    while (it.hasNext()) {
                        ((ImageView) it.next()).setVisibility(4);
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        ((ImageView) this.f11522Oooo0o.get(i4)).setVisibility(0);
                    }
                }
            }
            PasswordSettingDialog.this.OooOo0o();
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
        public static final /* synthetic */ int[] f11524OooO00o;

        static {
            int[] iArr = new int[PasswordDialogType.values().length];
            f11524OooO00o = iArr;
            try {
                iArr[PasswordDialogType.PasswordInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11524OooO00o[PasswordDialogType.PasswordAdd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11524OooO00o[PasswordDialogType.PasswordChange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11524OooO00o[PasswordDialogType.PasswordDelete.ordinal()] = 4;
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

    public PasswordSettingDialog(Context context) {
        super(context, 0);
        this.f11509o00ooo = true;
        this.f11518oo000o = o000O0O0.OooO0O0(R.drawable.icon_password_dialog_top);
        this.f11508o00oO0o = o000O0O0.OooO0O0(R.drawable.icon_password_dialog_bottom);
        this.f11517o0ooOoO = false;
        this.f11512o0OOO0o = false;
        this.f11513o0Oo0oo = R.drawable.icon_lock_close_gray;
        this.f11511o0OO00O = R.drawable.icon_lock_close_green;
        this.f11519oo0o0Oo = R.drawable.icon_lock_open_gray;
        this.f11510o0O0O00 = R.drawable.icon_lock_open_green;
        this.f11501o000OOo = false;
        this.f11497o000000 = false;
        this.f11498o000000O = PasswordDialogType.PasswordAdd;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
        this.f11479OoooO0.setVisibility(0);
        this.f11480OoooO0O.setVisibility(0);
        this.f11484OoooOo0.setVisibility(8);
        if (this.f11517o0ooOoO) {
            this.f11484OoooOo0.setVisibility(0);
        }
        this.f11481OoooOO0.setVisibility(8);
        if (this.f11512o0OOO0o) {
            this.f11481OoooOO0.setVisibility(0);
        }
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0OO() {
        if (this.f11501o000OOo) {
            return R.style.dialogWindowAnim;
        }
        return 0;
    }

    @Override // p146o00Oo000.OooO0O0
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_pass_layout;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        this.f11479OoooO0 = (RelativeLayout) OooO00o(R.id.dialog_pass_layout_layout_bg);
        this.f11480OoooO0O = (LinearLayout) findViewById(R.id.dialog_pass_layout_layout_content);
        this.f11478OoooO = (TextView) findViewById(R.id.dialog_pass_layout_tv_title);
        this.f11481OoooOO0 = (LinearLayout) findViewById(R.id.dialog_pass_layout_lock_all_layout);
        this.f11502o000oOoO = (LinearLayout) OooO00o(R.id.dialog_pass_layout_lock_layout);
        this.f11482OoooOOO = (LinearLayout) OooO00o(R.id.dialog_pass_layout_unlock_layout);
        this.f11483OoooOOo = (TextView) findViewById(R.id.dialog_pass_layout_tv_info);
        this.f11484OoooOo0 = (FrameLayout) findViewById(R.id.dialog_pass_layout_edit_frameLayout);
        this.f11485OoooOoO = (EditText) findViewById(R.id.dialog_pass_layout_edit);
        this.f11487Ooooo00 = (TableRow) OooO00o(R.id.dialog_pass_layout_table);
        this.f11486OoooOoo = (ImageView) OooO00o(R.id.dialog_pass_layout_table_0_iv);
        this.f11488Ooooo0o = (ImageView) OooO00o(R.id.dialog_pass_layout_table_1_iv);
        this.f11489OooooO0 = (ImageView) OooO00o(R.id.dialog_pass_layout_table_2_iv);
        this.f11490OooooOO = (ImageView) OooO00o(R.id.dialog_pass_layout_table_3_iv);
        this.f11491OooooOo = OooO00o(R.id.dialog_pass_layout_table_1_line);
        this.f11493Oooooo0 = OooO00o(R.id.dialog_pass_layout_table_2_line);
        this.f11492Oooooo = OooO00o(R.id.dialog_pass_layout_table_3_line);
        this.f11494OoooooO = (LinearLayout) OooO00o(R.id.dialog_pass_layout_confirm_layout);
        this.f11507o00oO0O = (ProgressBar) OooO00o(R.id.dialog_pass_layout_confirm_progress);
        this.f11515o0ooOO0 = (TextView) OooO00o(R.id.dialog_pass_layout_tv_confirm);
        this.f11495Ooooooo = (TextView) OooO00o(R.id.dialog_pass_layout_tv_more_features);
        this.f11514o0OoOo0 = (LinearLayout) findViewById(R.id.dialog_pass_layout_layout_follow);
        this.f11520ooOO = (TextView) OooO00o(R.id.dialog_pass_layout_tv_follow_room);
        this.f11503o00O0O = (TextView) OooO00o(R.id.dialog_pass_layout_tv_unfollow_room);
        this.f11504o00Oo0 = (TextView) OooO00o(R.id.dialog_pass_layout_tv_unjoin_room);
        this.f11505o00Ooo = findViewById(R.id.dialog_pass_layout_tv_join_line);
        this.f11506o00o0O = (TextView) OooO00o(R.id.dialog_pass_layout_tv_unjoin_unfollow);
        this.f11514o0OoOo0.setVisibility(8);
        this.f11516o0ooOOo = (TextView) findViewById(R.id.dialog_pass_layout_error_tv);
        this.f11515o0ooOO0.setEnabled(false);
        this.f11494OoooooO.setEnabled(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f11486OoooOoo);
        arrayList.add(this.f11488Ooooo0o);
        arrayList.add(this.f11489OooooO0);
        arrayList.add(this.f11490OooooOO);
        this.f11485OoooOoO.setOnFocusChangeListener(new OooO00o());
        this.f11485OoooOoO.addTextChangedListener(new OooO0O0(arrayList));
        this.f11483OoooOOo.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public final void OooOOO() {
        EditText editText = this.f11485OoooOoO;
        if (editText != null) {
            editText.clearFocus();
        }
        EditText editText2 = this.f11485OoooOoO;
        o00O0O.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText2, "view.context"), new Handler()));
        OooOO0O((PasswordSettingModel) this.f32153Oooo0oO, AbsListenerTag.Cancel);
        dismiss();
    }

    public final void OooOOOO(final String str) {
        dismiss();
        o000oOoO.f31805OooO00o.OooO00o((BaseFragmentActivity) o00000O.f34254OooO00o.OooO0O0(), str, new Function0() { // from class: o00OOOo0.o0O0ooO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f31847Oooo0o.OooOOO();
                return null;
            }
        }, new Function0() { // from class: o00OOOo0.o00oOoo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PasswordSettingDialog passwordSettingDialog = this.f31844Oooo0o;
                String str2 = str;
                Objects.requireNonNull(passwordSettingDialog);
                Objects.requireNonNull(str2);
                switch (str2) {
                    case "unFollow":
                        if (!OooO0OO.OooO00o(passwordSettingDialog.f11500o00000O0)) {
                            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                            o00000OO.f32210OooO0Oo.OooO0OO(passwordSettingDialog.f11500o00000O0, passwordSettingDialog.f11499o000000o, new o00O000o(passwordSettingDialog));
                            break;
                        }
                        break;
                    case "unJoin":
                        if (!OooO0OO.OooO00o(passwordSettingDialog.f11500o00000O0)) {
                            o00oO0o o00oo0o3 = o00000OO.f32207OooO00o;
                            o00000OO.f32210OooO0Oo.OooO00o(passwordSettingDialog.f11500o00000O0, 0, new o00O00(passwordSettingDialog));
                            break;
                        }
                        break;
                    case "unJoin&unFollow":
                        if (!OooO0OO.OooO00o(passwordSettingDialog.f11500o00000O0)) {
                            o00oO0o o00oo0o4 = o00000OO.f32207OooO00o;
                            o00000OO.f32210OooO0Oo.OooO00o(passwordSettingDialog.f11500o00000O0, 1, new o00O00O(passwordSettingDialog));
                            break;
                        }
                        break;
                }
                return null;
            }
        });
    }

    public final PasswordSettingDialog OooOOOo(boolean z, boolean z2) {
        this.f11499o000000o = z;
        this.f11496o00000 = z2;
        TextView textView = this.f11520ooOO;
        if (textView != null) {
            textView.setVisibility(8);
            this.f11503o00O0O.setVisibility(8);
            this.f11504o00Oo0.setVisibility(8);
            this.f11505o00Ooo.setVisibility(8);
            this.f11506o00o0O.setVisibility(8);
            if (this.f11496o00000) {
                this.f11504o00Oo0.setVisibility(0);
                if (this.f11499o000000o) {
                    this.f11505o00Ooo.setVisibility(0);
                    this.f11506o00o0O.setVisibility(0);
                }
            } else if (this.f11499o000000o) {
                this.f11503o00O0O.setVisibility(0);
            } else {
                this.f11520ooOO.setVisibility(0);
            }
        }
        return this;
    }

    public final PasswordSettingDialog OooOOo(PasswordDialogType passwordDialogType) {
        this.f11498o000000O = passwordDialogType;
        this.f11507o00oO0O.setVisibility(8);
        int i = OooO0o.f11524OooO00o[passwordDialogType.ordinal()];
        if (i == 1) {
            this.f11515o0ooOO0.setText(o000O0O0.OooO0OO(R.string.Enter));
            this.f11495Ooooooo.setVisibility(0);
            OooOOoo(false, false);
            OooOo00(OooO0oO(R.string.dialog_lock_tips));
            this.f11517o0ooOoO = true;
            this.f11484OoooOo0.setVisibility(8);
            this.f11484OoooOo0.setVisibility(0);
        } else if (i == 2) {
            this.f11515o0ooOO0.setText(o000O0O0.OooO0OO(R.string.button_CONFIRM));
            this.f11495Ooooooo.setVisibility(8);
            OooOOoo(false, false);
            OooOo00(OooO0oO(R.string.dialog_lock_title));
            OooOOo0(OooO0oO(R.string.dialog_lock_tips));
        } else if (i == 3) {
            this.f11515o0ooOO0.setText(o000O0O0.OooO0OO(R.string.button_CONFIRM));
            this.f11495Ooooooo.setVisibility(8);
            OooOOoo(true, false);
            OooOo00(OooO0oO(R.string.dialog_lock_title));
            OooOOo0(OooO0oO(R.string.Change_Passcode));
        } else if (i == 4) {
            this.f11515o0ooOO0.setText(o000O0O0.OooO0OO(R.string.button_CONFIRM));
            this.f11495Ooooooo.setVisibility(8);
            OooOOoo(true, true);
            OooOo00(OooO0oO(R.string.dialog_lock_title));
        }
        return this;
    }

    public final PasswordSettingDialog OooOOo0(String str) {
        TextView textView = this.f11483OoooOOo;
        if (textView != null) {
            textView.setText("");
            this.f11483OoooOOo.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                this.f11483OoooOOo.setText(str);
                this.f11483OoooOOo.setVisibility(0);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PasswordSettingDialog OooOOoo(boolean z, boolean z2) {
        this.f11512o0OOO0o = z;
        this.f11497o000000 = z2;
        this.f11481OoooOO0.setVisibility(8);
        if (z) {
            this.f11481OoooOO0.setVisibility(0);
        }
        Model model = this.f32153Oooo0oO;
        if (model != 0) {
            ((PasswordSettingModel) model).setUnLock(z2);
        }
        OooOo0o();
        return this;
    }

    public final PasswordSettingDialog OooOo0(boolean z) {
        this.f11501o000OOo = z;
        if (z) {
            this.f11516o0ooOOo.setVisibility(0);
            this.f11487Ooooo00.setBackgroundResource(R.drawable.bg_shape_f61414);
            this.f11491OooooOo.setBackgroundResource(R.color.color_F61414);
            this.f11493Oooooo0.setBackgroundResource(R.color.color_F61414);
            this.f11492Oooooo.setBackgroundResource(R.color.color_F61414);
        } else {
            this.f11516o0ooOOo.setVisibility(8);
            this.f11487Ooooo00.setBackgroundResource(R.drawable.bg_shape_d5d5d5);
            this.f11491OooooOo.setBackgroundResource(R.color.color_grey_d5);
            this.f11493Oooooo0.setBackgroundResource(R.color.color_grey_d5);
            this.f11492Oooooo.setBackgroundResource(R.color.color_grey_d5);
        }
        return this;
    }

    public final PasswordSettingDialog OooOo00(String str) {
        TextView textView = this.f11478OoooO;
        if (textView != null) {
            textView.setText("");
            this.f11478OoooO.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                this.f11478OoooO.setText(str);
                this.f11478OoooO.setVisibility(0);
            }
        }
        return this;
    }

    public final void OooOo0O(boolean z) {
        if (!z) {
            this.f11514o0OoOo0.setVisibility(0);
            OooOOOo(this.f11499o000000o, this.f11496o00000);
            o00Oo00.OooO00o(this.f11495Ooooooo, this.f11518oo000o, ViewLocation.end, false);
            EditText editText = this.f11485OoooOoO;
            o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText, "view.context"), new Handler()));
            return;
        }
        this.f11514o0OoOo0.setVisibility(8);
        o00Oo00.OooO00o(this.f11495Ooooooo, this.f11508o00oO0o, ViewLocation.end, false);
        EditText view = this.f11485OoooOoO;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }

    public final void OooOo0o() {
        if (this.f11497o000000) {
            this.f11515o0ooOO0.setEnabled(true);
            this.f11494OoooooO.setEnabled(true);
            EditText editText = this.f11485OoooOoO;
            o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText, "view.context"), new Handler()));
            this.f11484OoooOo0.setVisibility(8);
            this.f11483OoooOOo.setVisibility(8);
            this.f11502o000oOoO.setBackgroundResource(this.f11513o0Oo0oo);
            this.f11482OoooOOO.setBackgroundResource(this.f11510o0O0O00);
            return;
        }
        if (this.f11498o000000O == PasswordDialogType.PasswordInput) {
            this.f11483OoooOOo.setVisibility(8);
        } else {
            this.f11483OoooOOo.setVisibility(0);
        }
        this.f11502o000oOoO.setBackgroundResource(this.f11511o0OO00O);
        this.f11484OoooOo0.setVisibility(0);
        this.f11482OoooOOO.setBackgroundResource(this.f11519oo0o0Oo);
        if (this.f11485OoooOoO.getText().length() >= 4) {
            this.f11515o0ooOO0.setEnabled(true);
            this.f11494OoooooO.setEnabled(true);
            this.f11485OoooOoO.postDelayed(new Runnable() { // from class: o00OOOo0.o00O0000
                @Override // java.lang.Runnable
                public final void run() {
                    EditText editText2 = this.f31824Oooo0o.f11485OoooOoO;
                    o00O0O.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText2, "view.context"), new Handler()));
                }
            }, 200L);
        } else {
            this.f11485OoooOoO.setFocusable(true);
            this.f11485OoooOoO.setFocusableInTouchMode(true);
            this.f11485OoooOoO.requestFocus();
            this.f11485OoooOoO.postDelayed(new o0000O0O(this, 2), 200L);
            this.f11515o0ooOO0.setEnabled(false);
            this.f11494OoooooO.setEnabled(false);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        EditText editText = this.f11485OoooOoO;
        o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText, "view.context"), new Handler()));
        super.dismiss();
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        Activity activityOooO0O0;
        int id = view.getId();
        if (id == R.id.dialog_pass_layout_tv_confirm || id == R.id.dialog_pass_layout_confirm_layout || id == R.id.dialog_pass_layout_confirm_progress) {
            this.f11507o00oO0O.setVisibility(0);
            if (this.f11498o000000O == PasswordDialogType.PasswordInput) {
                this.f11515o0ooOO0.setText(o000O0O0.OooO0OO(R.string.Entering));
            }
            OooOO0O((PasswordSettingModel) this.f32153Oooo0oO, AbsListenerTag.Ok);
            return;
        }
        if (id == R.id.dialog_pass_layout_layout_bg) {
            OooOO0O((PasswordSettingModel) this.f32153Oooo0oO, AbsListenerTag.Bg);
            return;
        }
        if (id == R.id.dialog_pass_layout_iv_cancel) {
            OooOOO();
            return;
        }
        if (id == R.id.dialog_pass_layout_lock_layout || id == R.id.dialog_pass_layout_lock_tv) {
            if (this.f32153Oooo0oO == 0) {
                return;
            }
            OooOOo(PasswordDialogType.PasswordChange);
            return;
        }
        if (id == R.id.dialog_pass_layout_unlock_layout || id == R.id.dialog_pass_layout_unlock_tv) {
            if (this.f32153Oooo0oO == 0) {
                return;
            }
            OooOOo(PasswordDialogType.PasswordDelete);
            return;
        }
        if (id == R.id.dialog_pass_layout_table || id == R.id.dialog_pass_layout_table_0_iv || id == R.id.dialog_pass_layout_table_1_iv || id == R.id.dialog_pass_layout_table_2_iv || id == R.id.dialog_pass_layout_table_3_iv || id == R.id.dialog_pass_layout_table_1_line || id == R.id.dialog_pass_layout_table_2_line || id == R.id.dialog_pass_layout_table_3_line || id == R.id.dialog_pass_layout_edit || id == R.id.dialog_pass_layout_edit_frameLayout) {
            this.f11485OoooOoO.setFocusable(true);
            this.f11485OoooOoO.setFocusableInTouchMode(true);
            this.f11485OoooOoO.requestFocus();
            this.f11509o00ooo = true;
            OooOo0O(true);
            return;
        }
        if (id == R.id.dialog_pass_layout_tv_more_features) {
            boolean z = !this.f11509o00ooo;
            this.f11509o00ooo = z;
            OooOo0O(z);
            return;
        }
        if (id != R.id.dialog_pass_layout_tv_follow_room) {
            if (id == R.id.dialog_pass_layout_tv_unfollow_room) {
                o0O00000.OooO0OO("InRoom_roomLock_unfollow");
                OooOOOO("unFollow");
                return;
            } else if (id == R.id.dialog_pass_layout_tv_unjoin_room) {
                o0O00000.OooO0OO("InRoom_roomLock_unjoin");
                OooOOOO("unJoin");
                return;
            } else {
                if (id == R.id.dialog_pass_layout_tv_unjoin_unfollow) {
                    o0O00000.OooO0OO("InRoom_roomLock_UnjoinAndUnfollow");
                    OooOOOO("unJoin&unFollow");
                    return;
                }
                return;
            }
        }
        o0O00000.OooO0OO("InRoom_roomLock_follow");
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        if (oooOOO.OooOooO().getValue().booleanValue()) {
            if (com.yalla.support.common.util.OooO0OO.OooO00o(this.f11500o00000O0)) {
                return;
            }
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o00000OO.f32210OooO0Oo.OooO0OO(this.f11500o00000O0, this.f11499o000000o, new p139o00OOOo0.o00O000(this));
            return;
        }
        OooO0OO onLogin = new OooO0OO();
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE) || (activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0()) == null) {
            return;
        }
        LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
    }

    @Override // p146o00Oo000.OooO0O0, android.app.Dialog
    public final void show() {
        EditText editText = this.f11485OoooOoO;
        if (editText != null) {
            editText.setText("");
        }
        super.show();
    }
}
