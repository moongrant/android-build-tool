package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.oOO00;
import p493o0o00O0o.l;
import p493o0o00O0o.m;
import p493o0o00O0o.n;
import p587o0oOooO.oOOOoo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicCreateNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicCreateNameActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,93:1\n22#2,2:94\n49#3:96\n65#3,16:97\n93#3,3:113\n*S KotlinDebug\n*F\n+ 1 TopicCreateNameActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity\n*L\n26#1:94,2\n53#1:96\n53#1:97,16\n53#1:113,3\n*E\n"})
public final class TopicCreateNameActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f25853OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25854OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOO00.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TopicEditVM f25855OooOo00;

    public final oOO00 OooOo() {
        return (oOO00) this.f25854OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p402o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == p565o0oOo000.o0Oo0oo.ivClear) {
            OooOo().f45034OooO0O0.setText("");
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45033OooO00o);
        this.f25855OooOo00 = (TopicEditVM) new ViewModelProvider(this).get(TopicEditVM.class);
        HeaderLayout headerLayout = this.f22289OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p565o0oOo000.o000OOo.Topic_Name);
        }
        HeaderLayout headerLayout2 = this.f22289OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOoO0(p565o0oOo000.o000OOo.Save, new m(this));
        }
        EditText etName = OooOo().f45034OooO0O0;
        Intrinsics.checkNotNullExpressionValue(etName, "etName");
        etName.addTextChangedListener(new l(this));
        final int i = 1;
        OooOo().f45034OooO0O0.setFilters(new InputFilter[]{new oOOOoo00(), new InputFilter.LengthFilter(32)});
        EditText editText = OooOo().f45034OooO0O0;
        Intent intent = getIntent();
        editText.setText(intent != null ? intent.getStringExtra("name") : null);
        OooOo().f45034OooO0O0.setSelection(OooOo().f45034OooO0O0.getText().length());
        OooOo().f45035OooO0OO.setOnClickListener(this);
        OooOo().f45034OooO0O0.post(new Runnable() { // from class: androidx.emoji2.text.o000oOoO
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                Object obj = this;
                switch (i2) {
                    case 0:
                        ((Oooo000.OooO0O0) obj).OooO0OO();
                        break;
                    default:
                        TopicCreateNameActivity this$0 = (TopicCreateNameActivity) obj;
                        int i3 = TopicCreateNameActivity.f25853OooOo0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        EditText view = this$0.OooOo().f45034OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(view, "etName");
                        Intrinsics.checkNotNullParameter(view, "view");
                        Context context = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
                        view.setFocusable(true);
                        view.setFocusableInTouchMode(true);
                        view.requestFocus();
                        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                        break;
                }
            }
        });
        new p373o0OOo0oO.o0OoOo0(this).f43179OooO0o = new n(this);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText view = OooOo().f45034OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "etName");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
        p373o0OOo0oO.o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
    }
}
