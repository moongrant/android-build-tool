package com.app.base.dialog.baseDialog;

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
import p025Oooo0O0.o000O0Oo;
import p140o00OOOo0.o000oOoO;
import p140o00OOOo0.o00O000o;
import p140o00OOOo0.o0OOO0o;
import p153o00Oo0o0.o00Oo00;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p393o0OOooOo.o0O00000;
import p472o0Oooo0.o00O000;
import p500o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ResourceAsColor"})
public final class PasswordSettingDialog extends p147o00Oo000.OooO0O0<PasswordSettingModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public RelativeLayout f11493OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f11494OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public LinearLayout f11495OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public LinearLayout f11496OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public LinearLayout f11497OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f11498OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public FrameLayout f11499Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public EditText f11500Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ImageView f11501OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public TableRow f11502OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public ImageView f11503OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ImageView f11504Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ImageView f11505Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public View f11506OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public View f11507Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f11508o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public int f11509o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f11510o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f11511o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public boolean f11512o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public PasswordDialogType f11513o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public boolean f11514o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public String f11515o00000Oo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public int f11516o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public LinearLayout f11517o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public TextView f11518o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public LinearLayout f11519o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public TextView f11520o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public TextView f11521o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f11522o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public TextView f11523o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public TextView f11524o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f11525o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f11526o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public TextView f11527o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public TextView f11528o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public View f11529o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public Drawable f11530o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public Drawable f11531o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public ProgressBar f11532o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public View f11533oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f11534oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public LinearLayout f11535ooOO;

    public class OooO00o implements View.OnFocusChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            if (z) {
                return;
            }
            EditText editText = PasswordSettingDialog.this.f11500Ooooo0o;
            o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
        }
    }

    public class OooO0O0 implements TextWatcher {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f11537Oooo;

        public OooO0O0(ArrayList arrayList) {
            this.f11537Oooo = arrayList;
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
            if (PasswordSettingDialog.this.f32175OoooO00 != 0) {
                if (!TextUtils.isEmpty(string)) {
                    PasswordSettingDialog.this.f11511o000000o = false;
                }
                PasswordSettingDialog passwordSettingDialog = PasswordSettingDialog.this;
                passwordSettingDialog.OooOo0(passwordSettingDialog.f11511o000000o);
                ((PasswordSettingModel) PasswordSettingDialog.this.f32175OoooO00).setPassword(string + "");
                int length = string.length();
                ArrayList arrayList = this.f11537Oooo;
                if (arrayList != null && length <= arrayList.size()) {
                    Iterator it = this.f11537Oooo.iterator();
                    while (it.hasNext()) {
                        ((ImageView) it.next()).setVisibility(4);
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        ((ImageView) this.f11537Oooo.get(i4)).setVisibility(0);
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
        public static final /* synthetic */ int[] f11539OooO00o;

        static {
            int[] iArr = new int[PasswordDialogType.values().length];
            f11539OooO00o = iArr;
            try {
                iArr[PasswordDialogType.PasswordInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11539OooO00o[PasswordDialogType.PasswordAdd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11539OooO00o[PasswordDialogType.PasswordChange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11539OooO00o[PasswordDialogType.PasswordDelete.ordinal()] = 4;
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
        this.f11522o00oO0O = true;
        this.f11530o0ooOO0 = o000O0O0.OooO0O0(R.drawable.icon_password_dialog_top);
        this.f11531o0ooOOo = o000O0O0.OooO0O0(R.drawable.icon_password_dialog_bottom);
        this.f11526o0OO00O = false;
        this.f11534oo0o0Oo = false;
        this.f11525o0O0O00 = R.drawable.icon_lock_close_gray;
        this.f11516o000OOo = R.drawable.icon_lock_close_green;
        this.f11509o000000 = R.drawable.icon_lock_open_gray;
        this.f11510o000000O = R.drawable.icon_lock_open_green;
        this.f11511o000000o = false;
        this.f11508o00000 = false;
        this.f11513o00000O0 = PasswordDialogType.PasswordAdd;
    }

    @Override // p147o00Oo000.OooO0O0
    public final void OooO0O0() {
        this.f11493OoooOO0.setVisibility(0);
        this.f11517o000oOoO.setVisibility(0);
        this.f11499Ooooo00.setVisibility(8);
        if (this.f11526o0OO00O) {
            this.f11499Ooooo00.setVisibility(0);
        }
        this.f11495OoooOOo.setVisibility(8);
        if (this.f11534oo0o0Oo) {
            this.f11495OoooOOo.setVisibility(0);
        }
    }

    @Override // p147o00Oo000.OooO0O0
    public final int OooO0OO() {
        if (this.f11511o000000o) {
            return R.style.dialogWindowAnim;
        }
        return 0;
    }

    @Override // p147o00Oo000.OooO0O0
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // p147o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_pass_layout;
    }

    @Override // p147o00Oo000.OooO0O0
    public final void OooO0oo() {
        this.f11493OoooOO0 = (RelativeLayout) OooO00o(R.id.dialog_pass_layout_layout_bg);
        this.f11517o000oOoO = (LinearLayout) findViewById(R.id.dialog_pass_layout_layout_content);
        this.f11494OoooOOO = (TextView) findViewById(R.id.dialog_pass_layout_tv_title);
        this.f11495OoooOOo = (LinearLayout) findViewById(R.id.dialog_pass_layout_lock_all_layout);
        this.f11496OoooOo0 = (LinearLayout) OooO00o(R.id.dialog_pass_layout_lock_layout);
        this.f11497OoooOoO = (LinearLayout) OooO00o(R.id.dialog_pass_layout_unlock_layout);
        this.f11498OoooOoo = (TextView) findViewById(R.id.dialog_pass_layout_tv_info);
        this.f11499Ooooo00 = (FrameLayout) findViewById(R.id.dialog_pass_layout_edit_frameLayout);
        this.f11500Ooooo0o = (EditText) findViewById(R.id.dialog_pass_layout_edit);
        this.f11502OooooOO = (TableRow) OooO00o(R.id.dialog_pass_layout_table);
        this.f11501OooooO0 = (ImageView) OooO00o(R.id.dialog_pass_layout_table_0_iv);
        this.f11503OooooOo = (ImageView) OooO00o(R.id.dialog_pass_layout_table_1_iv);
        this.f11505Oooooo0 = (ImageView) OooO00o(R.id.dialog_pass_layout_table_2_iv);
        this.f11504Oooooo = (ImageView) OooO00o(R.id.dialog_pass_layout_table_3_iv);
        this.f11506OoooooO = OooO00o(R.id.dialog_pass_layout_table_1_line);
        this.f11507Ooooooo = OooO00o(R.id.dialog_pass_layout_table_2_line);
        this.f11529o0OoOo0 = OooO00o(R.id.dialog_pass_layout_table_3_line);
        this.f11535ooOO = (LinearLayout) OooO00o(R.id.dialog_pass_layout_confirm_layout);
        this.f11532o0ooOoO = (ProgressBar) OooO00o(R.id.dialog_pass_layout_confirm_progress);
        this.f11527o0OOO0o = (TextView) OooO00o(R.id.dialog_pass_layout_tv_confirm);
        this.f11518o00O0O = (TextView) OooO00o(R.id.dialog_pass_layout_tv_more_features);
        this.f11519o00Oo0 = (LinearLayout) findViewById(R.id.dialog_pass_layout_layout_follow);
        this.f11520o00Ooo = (TextView) OooO00o(R.id.dialog_pass_layout_tv_follow_room);
        this.f11521o00o0O = (TextView) OooO00o(R.id.dialog_pass_layout_tv_unfollow_room);
        this.f11524o00ooo = (TextView) OooO00o(R.id.dialog_pass_layout_tv_unjoin_room);
        this.f11533oo000o = findViewById(R.id.dialog_pass_layout_tv_join_line);
        this.f11523o00oO0o = (TextView) OooO00o(R.id.dialog_pass_layout_tv_unjoin_unfollow);
        this.f11519o00Oo0.setVisibility(8);
        this.f11528o0Oo0oo = (TextView) findViewById(R.id.dialog_pass_layout_error_tv);
        this.f11527o0OOO0o.setEnabled(false);
        this.f11535ooOO.setEnabled(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f11501OooooO0);
        arrayList.add(this.f11503OooooOo);
        arrayList.add(this.f11505Oooooo0);
        arrayList.add(this.f11504Oooooo);
        this.f11500Ooooo0o.setOnFocusChangeListener(new OooO00o());
        this.f11500Ooooo0o.addTextChangedListener(new OooO0O0(arrayList));
        this.f11498OoooOoo.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public final void OooOOO() {
        EditText editText = this.f11500Ooooo0o;
        if (editText != null) {
            editText.clearFocus();
        }
        EditText editText2 = this.f11500Ooooo0o;
        o0OOO0o.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText2, "view.context"), new Handler()));
        OooOO0O((PasswordSettingModel) this.f32175OoooO00, AbsListenerTag.Cancel);
        dismiss();
    }

    public final void OooOOOO(final String str) {
        dismiss();
        o000oOoO.f31826OooO00o.OooO00o((BaseFragmentActivity) o00000O.f34276OooO00o.OooO0O0(), str, new Function0() { // from class: o00OOOo0.o00oOoo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f31876Oooo.OooOOO();
                return null;
            }
        }, new Function0() { // from class: o00OOOo0.o00O000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PasswordSettingDialog passwordSettingDialog = this.f31845Oooo;
                String str2 = str;
                Objects.requireNonNull(passwordSettingDialog);
                Objects.requireNonNull(str2);
                switch (str2) {
                    case "unFollow":
                        if (!OooO0OO.OooO00o(passwordSettingDialog.f11515o00000Oo)) {
                            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
                            o00000OO.f32231OooO0Oo.OooO0OO(passwordSettingDialog.f11515o00000Oo, passwordSettingDialog.f11512o00000O, new o00O00(passwordSettingDialog));
                            break;
                        }
                        break;
                    case "unJoin":
                        if (!OooO0OO.OooO00o(passwordSettingDialog.f11515o00000Oo)) {
                            o00oO0o o00oo0o3 = o00000OO.f32228OooO00o;
                            o00000OO.f32231OooO0Oo.OooO00o(passwordSettingDialog.f11515o00000Oo, 0, new o00O00O(passwordSettingDialog));
                            break;
                        }
                        break;
                    case "unJoin&unFollow":
                        if (!OooO0OO.OooO00o(passwordSettingDialog.f11515o00000Oo)) {
                            o00oO0o o00oo0o4 = o00000OO.f32228OooO00o;
                            o00000OO.f32231OooO0Oo.OooO00o(passwordSettingDialog.f11515o00000Oo, 1, new oOO00O(passwordSettingDialog));
                            break;
                        }
                        break;
                }
                return null;
            }
        });
    }

    public final PasswordSettingDialog OooOOOo(boolean z, boolean z2) {
        this.f11512o00000O = z;
        this.f11514o00000OO = z2;
        TextView textView = this.f11520o00Ooo;
        if (textView != null) {
            textView.setVisibility(8);
            this.f11521o00o0O.setVisibility(8);
            this.f11524o00ooo.setVisibility(8);
            this.f11533oo000o.setVisibility(8);
            this.f11523o00oO0o.setVisibility(8);
            if (this.f11514o00000OO) {
                this.f11524o00ooo.setVisibility(0);
                if (this.f11512o00000O) {
                    this.f11533oo000o.setVisibility(0);
                    this.f11523o00oO0o.setVisibility(0);
                }
            } else if (this.f11512o00000O) {
                this.f11521o00o0O.setVisibility(0);
            } else {
                this.f11520o00Ooo.setVisibility(0);
            }
        }
        return this;
    }

    public final PasswordSettingDialog OooOOo(PasswordDialogType passwordDialogType) {
        this.f11513o00000O0 = passwordDialogType;
        this.f11532o0ooOoO.setVisibility(8);
        int i = OooO0o.f11539OooO00o[passwordDialogType.ordinal()];
        if (i == 1) {
            this.f11527o0OOO0o.setText(o000O0O0.OooO0OO(R.string.Enter));
            this.f11518o00O0O.setVisibility(0);
            OooOOoo(false, false);
            OooOo00(OooO0oO(R.string.dialog_lock_tips));
            this.f11526o0OO00O = true;
            this.f11499Ooooo00.setVisibility(8);
            this.f11499Ooooo00.setVisibility(0);
        } else if (i == 2) {
            this.f11527o0OOO0o.setText(o000O0O0.OooO0OO(R.string.button_CONFIRM));
            this.f11518o00O0O.setVisibility(8);
            OooOOoo(false, false);
            OooOo00(OooO0oO(R.string.dialog_lock_title));
            OooOOo0(OooO0oO(R.string.dialog_lock_tips));
        } else if (i == 3) {
            this.f11527o0OOO0o.setText(o000O0O0.OooO0OO(R.string.button_CONFIRM));
            this.f11518o00O0O.setVisibility(8);
            OooOOoo(true, false);
            OooOo00(OooO0oO(R.string.dialog_lock_title));
            OooOOo0(OooO0oO(R.string.Change_Passcode));
        } else if (i == 4) {
            this.f11527o0OOO0o.setText(o000O0O0.OooO0OO(R.string.button_CONFIRM));
            this.f11518o00O0O.setVisibility(8);
            OooOOoo(true, true);
            OooOo00(OooO0oO(R.string.dialog_lock_title));
        }
        return this;
    }

    public final PasswordSettingDialog OooOOo0(String str) {
        TextView textView = this.f11498OoooOoo;
        if (textView != null) {
            textView.setText("");
            this.f11498OoooOoo.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                this.f11498OoooOoo.setText(str);
                this.f11498OoooOoo.setVisibility(0);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PasswordSettingDialog OooOOoo(boolean z, boolean z2) {
        this.f11534oo0o0Oo = z;
        this.f11508o00000 = z2;
        this.f11495OoooOOo.setVisibility(8);
        if (z) {
            this.f11495OoooOOo.setVisibility(0);
        }
        Model model = this.f32175OoooO00;
        if (model != 0) {
            ((PasswordSettingModel) model).setUnLock(z2);
        }
        OooOo0o();
        return this;
    }

    public final PasswordSettingDialog OooOo0(boolean z) {
        this.f11511o000000o = z;
        if (z) {
            this.f11528o0Oo0oo.setVisibility(0);
            this.f11502OooooOO.setBackgroundResource(R.drawable.bg_shape_f61414);
            this.f11506OoooooO.setBackgroundResource(R.color.color_F61414);
            this.f11507Ooooooo.setBackgroundResource(R.color.color_F61414);
            this.f11529o0OoOo0.setBackgroundResource(R.color.color_F61414);
        } else {
            this.f11528o0Oo0oo.setVisibility(8);
            this.f11502OooooOO.setBackgroundResource(R.drawable.bg_shape_d5d5d5);
            this.f11506OoooooO.setBackgroundResource(R.color.color_grey_d5);
            this.f11507Ooooooo.setBackgroundResource(R.color.color_grey_d5);
            this.f11529o0OoOo0.setBackgroundResource(R.color.color_grey_d5);
        }
        return this;
    }

    public final PasswordSettingDialog OooOo00(String str) {
        TextView textView = this.f11494OoooOOO;
        if (textView != null) {
            textView.setText("");
            this.f11494OoooOOO.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                this.f11494OoooOOO.setText(str);
                this.f11494OoooOOO.setVisibility(0);
            }
        }
        return this;
    }

    public final void OooOo0O(boolean z) {
        if (!z) {
            this.f11519o00Oo0.setVisibility(0);
            OooOOOo(this.f11512o00000O, this.f11514o00000OO);
            o00Oo00.OooO00o(this.f11518o00O0O, this.f11530o0ooOO0, ViewLocation.end, false);
            EditText editText = this.f11500Ooooo0o;
            o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
            return;
        }
        this.f11519o00Oo0.setVisibility(8);
        o00Oo00.OooO00o(this.f11518o00O0O, this.f11531o0ooOOo, ViewLocation.end, false);
        EditText view = this.f11500Ooooo0o;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
    }

    public final void OooOo0o() {
        if (this.f11508o00000) {
            this.f11527o0OOO0o.setEnabled(true);
            this.f11535ooOO.setEnabled(true);
            EditText editText = this.f11500Ooooo0o;
            o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
            this.f11499Ooooo00.setVisibility(8);
            this.f11498OoooOoo.setVisibility(8);
            this.f11496OoooOo0.setBackgroundResource(this.f11525o0O0O00);
            this.f11497OoooOoO.setBackgroundResource(this.f11510o000000O);
            return;
        }
        if (this.f11513o00000O0 == PasswordDialogType.PasswordInput) {
            this.f11498OoooOoo.setVisibility(8);
        } else {
            this.f11498OoooOoo.setVisibility(0);
        }
        this.f11496OoooOo0.setBackgroundResource(this.f11516o000OOo);
        this.f11499Ooooo00.setVisibility(0);
        this.f11497OoooOoO.setBackgroundResource(this.f11509o000000);
        if (this.f11500Ooooo0o.getText().length() >= 4) {
            this.f11527o0OOO0o.setEnabled(true);
            this.f11535ooOO.setEnabled(true);
            this.f11500Ooooo0o.postDelayed(new Runnable() { // from class: o00OOOo0.o0O0ooO
                @Override // java.lang.Runnable
                public final void run() {
                    EditText editText2 = this.f31882Oooo.f11500Ooooo0o;
                    o0OOO0o.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText2, "view.context"), new Handler()));
                }
            }, 200L);
        } else {
            this.f11500Ooooo0o.setFocusable(true);
            this.f11500Ooooo0o.setFocusableInTouchMode(true);
            this.f11500Ooooo0o.requestFocus();
            this.f11500Ooooo0o.postDelayed(new o0000O0O(this, 2), 200L);
            this.f11527o0OOO0o.setEnabled(false);
            this.f11535ooOO.setEnabled(false);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        EditText editText = this.f11500Ooooo0o;
        o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
        super.dismiss();
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        Activity activityOooO0O0;
        int id = view.getId();
        if (id == R.id.dialog_pass_layout_tv_confirm || id == R.id.dialog_pass_layout_confirm_layout || id == R.id.dialog_pass_layout_confirm_progress) {
            this.f11532o0ooOoO.setVisibility(0);
            if (this.f11513o00000O0 == PasswordDialogType.PasswordInput) {
                this.f11527o0OOO0o.setText(o000O0O0.OooO0OO(R.string.Entering));
            }
            OooOO0O((PasswordSettingModel) this.f32175OoooO00, AbsListenerTag.Ok);
            return;
        }
        if (id == R.id.dialog_pass_layout_layout_bg) {
            OooOO0O((PasswordSettingModel) this.f32175OoooO00, AbsListenerTag.Bg);
            return;
        }
        if (id == R.id.dialog_pass_layout_iv_cancel) {
            OooOOO();
            return;
        }
        if (id == R.id.dialog_pass_layout_lock_layout || id == R.id.dialog_pass_layout_lock_tv) {
            if (this.f32175OoooO00 == 0) {
                return;
            }
            OooOOo(PasswordDialogType.PasswordChange);
            return;
        }
        if (id == R.id.dialog_pass_layout_unlock_layout || id == R.id.dialog_pass_layout_unlock_tv) {
            if (this.f32175OoooO00 == 0) {
                return;
            }
            OooOOo(PasswordDialogType.PasswordDelete);
            return;
        }
        if (id == R.id.dialog_pass_layout_table || id == R.id.dialog_pass_layout_table_0_iv || id == R.id.dialog_pass_layout_table_1_iv || id == R.id.dialog_pass_layout_table_2_iv || id == R.id.dialog_pass_layout_table_3_iv || id == R.id.dialog_pass_layout_table_1_line || id == R.id.dialog_pass_layout_table_2_line || id == R.id.dialog_pass_layout_table_3_line || id == R.id.dialog_pass_layout_edit || id == R.id.dialog_pass_layout_edit_frameLayout) {
            this.f11500Ooooo0o.setFocusable(true);
            this.f11500Ooooo0o.setFocusableInTouchMode(true);
            this.f11500Ooooo0o.requestFocus();
            this.f11522o00oO0O = true;
            OooOo0O(true);
            return;
        }
        if (id == R.id.dialog_pass_layout_tv_more_features) {
            boolean z = !this.f11522o00oO0O;
            this.f11522o00oO0O = z;
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
        OooOOO oooOOO = OooOOO.f41235OooO00o;
        if (oooOOO.OooOooO().getValue().booleanValue()) {
            if (com.yalla.support.common.util.OooO0OO.OooO00o(this.f11515o00000Oo)) {
                return;
            }
            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
            o00000OO.f32231OooO0Oo.OooO0OO(this.f11515o00000Oo, this.f11512o00000O, new o00O000o(this));
            return;
        }
        OooO0OO onLogin = new OooO0OO();
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE) || (activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0()) == null) {
            return;
        }
        LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
        o00OO0O0.o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
    }

    @Override // p147o00Oo000.OooO0O0, android.app.Dialog
    public final void show() {
        EditText editText = this.f11500Ooooo0o;
        if (editText != null) {
            editText.setText("");
        }
        super.show();
    }
}
