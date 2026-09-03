package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p254o00ooO0O.o00O000o;
import p470o0Oooo0.o00;
import p470o0Oooo0.o00O000;
import p538o0o0Oo0.o0O;
import p538o0o0Oo0.o0O0o00O;
import p538o0o0Oo0.o0O0oo00;
import p538o0o0Oo0.o0OO000;
import p649o0ooOOoo.ad;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicEditDescActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicEditDescActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final /* synthetic */ int f22601OooooOO = 0;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f22604Ooooo0o;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22602OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ad.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public String f22603Ooooo00 = "";

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22605OooooO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicEditDescActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicEditDescActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicEditDescActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22608Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22608Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final ad OooOoo() {
        return (ad) this.f22602OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO(String str) {
        ((TopicEditVM) this.f22605OooooO0.getValue()).changeTopicDesc(this.f22604Ooooo0o, str).observe(this, new o0O0o00O(str, this, 0));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == R.id.ivClear) {
            OooOoo().f48938OooO0O0.setText("");
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f48937OooO00o);
        this.f22604Ooooo0o = getIntent().getLongExtra("edit_topic_id", 0L);
        String stringExtra = getIntent().getStringExtra("desc");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f22603Ooooo00 = stringExtra;
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Topic_Description);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoo0(R.string.Save, new o0O(this));
        }
        EditText editText = OooOoo().f48938OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etDesc");
        editText.addTextChangedListener(new o0O0oo00(this));
        OooOoo().f48938OooO0O0.setText(this.f22603Ooooo00);
        OooOoo().f48938OooO0O0.setSelection(this.f22603Ooooo00.length());
        OooOoo().f48939OooO0OO.setOnClickListener(this);
        new o00(this).f40619OooO0o0 = new o0OO000(this);
        OooOoo().f48938OooO0O0.post(new Runnable() { // from class: o0o0Oo0.o0oOo0O0
            @Override // java.lang.Runnable
            public final void run() {
                TopicEditDescActivity this$0 = this.f44071Oooo0o;
                int i = TopicEditDescActivity.f22601OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOoo().f48938OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etDesc");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
            }
        });
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText view = OooOoo().f48938OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etDesc");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }
}
