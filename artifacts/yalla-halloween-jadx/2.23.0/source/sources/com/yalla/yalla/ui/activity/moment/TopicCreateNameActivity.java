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
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o000OO00;
import p485o0o00O0.oO000O0O;
import p485o0o00O0.oO0Ooooo;
import p485o0o00O0.oO0o0o;
import p579o0oOoo.oOOo0O00;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.d6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicCreateNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicCreateNameActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,93:1\n22#2,2:94\n49#3:96\n65#3,16:97\n93#3,3:113\n*S KotlinDebug\n*F\n+ 1 TopicCreateNameActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity\n*L\n26#1:94,2\n53#1:96\n53#1:97,16\n53#1:113,3\n*E\n"})
public final class TopicCreateNameActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f26302OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26303OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(d6.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TopicEditVM f26304OooOo00;

    public final d6 OooOo() {
        return (d6) this.f26303OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == oO00O0oO.ivClear) {
            OooOo().f57731OooO0O0.setText("");
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57730OooO00o);
        this.f26304OooOo00 = (TopicEditVM) new ViewModelProvider(this).get(TopicEditVM.class);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.Topic_Name);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOoO0(oO00OOo0.Save, new oO0Ooooo(this));
        }
        EditText editText = OooOo().f57731OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etName");
        editText.addTextChangedListener(new oO000O0O(this));
        int i = 1;
        OooOo().f57731OooO0O0.setFilters(new InputFilter[]{new oOOo0O00(), new InputFilter.LengthFilter(32)});
        EditText editText2 = OooOo().f57731OooO0O0;
        Intent intent = getIntent();
        editText2.setText(intent != null ? intent.getStringExtra("name") : null);
        OooOo().f57731OooO0O0.setSelection(OooOo().f57731OooO0O0.getText().length());
        OooOo().f57732OooO0OO.setOnClickListener(this);
        OooOo().f57731OooO0O0.post(new o000OO00(this, i));
        new p367o0OOo0o0.OooOO0(this).f43963OooO0o = new oO0o0o(this);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText view = OooOo().f57731OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
        p367o0OOo0o0.OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
    }
}
