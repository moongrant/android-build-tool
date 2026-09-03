package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.o000;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p168o00Ooo0.o000OOo;
import p254o00ooO0O.o00O000o;
import p470o0Oooo0.o00;
import p470o0Oooo0.o00O000;
import p538o0o0Oo0.o0O0O0O;
import p538o0o0Oo0.o0O0oo0o;
import p538o0o0Oo0.o0oO0O0o;
import p649o0ooOOoo.yc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicCreateNameActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicCreateNameActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f22564Ooooo0o = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22565OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(yc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TopicEditVM f22566Ooooo00;

    public final yc OooOoo() {
        return (yc) this.f22565OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == R.id.ivClear) {
            OooOoo().f51022OooO0O0.setText("");
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f51021OooO00o);
        this.f22566Ooooo00 = (TopicEditVM) new ViewModelProvider(this).get(TopicEditVM.class);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Topic_Name);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoo0(R.string.Save, new o0oO0O0o(this));
        }
        EditText editText = OooOoo().f51022OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etName");
        editText.addTextChangedListener(new o0O0O0O(this));
        OooOoo().f51022OooO0O0.setFilters(new InputFilter[]{new o000OOo(), new InputFilter.LengthFilter(32)});
        EditText editText2 = OooOoo().f51022OooO0O0;
        Intent intent = getIntent();
        editText2.setText(intent != null ? intent.getStringExtra("name") : null);
        OooOoo().f51022OooO0O0.setSelection(OooOoo().f51022OooO0O0.getText().length());
        OooOoo().f51023OooO0OO.setOnClickListener(this);
        OooOoo().f51022OooO0O0.post(new o000(this, 1));
        new o00(this).f40619OooO0o0 = new o0O0oo0o(this);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText view = OooOoo().f51022OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }
}
