package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.vm.main.SearchVM;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p177o00Ooooo.oOo000Oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p478o0OooooO.oO0OoOO0;
import p524o0o0O0oO.o0O00OO;
import p535o0o0OOoO.oO0O0Oo0;
import p535o0o0OOoO.oOo0o0oO;
import p535o0o0OOoO.ooOOO00O;
import p535o0o0OOoO.ooOOO0Oo;
import p649o0ooOOoo.ja;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/MainSearchActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainSearchActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21967Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public MainSearchRoomFragment f21970Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public MainSearchUserFragment f21971OooooO0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21968OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ja.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final List<Fragment> f21969Ooooo00 = new ArrayList();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21972OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.MainSearchActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.MainSearchActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.MainSearchActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21976Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21976Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final int[] f21973OooooOo = {R.string.tag_rooms, R.string.users};

    public static final class OooO00o {
    }

    public final ja OooOoo() {
        return (ja) this.f21968OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SearchVM OooOooO() {
        return (SearchVM) this.f21972OooooOO.getValue();
    }

    public final void OooOooo() {
        String string = StringsKt.trim((CharSequence) OooOoo().f49734OooO0O0.getText().toString()).toString();
        if (string.length() == 0) {
            return;
        }
        Intrinsics.checkNotNullParameter(this, "activity");
        Object systemService = getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        OooOooO().saveNewSearchText(string);
        OooOooO().getSearchText().setValue(string);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f49735OooO0OO)) {
            OooOoo().f49734OooO0O0.setText("");
        } else if (Intrinsics.areEqual(view, OooOoo().f49738OooO0o0)) {
            o0O00000.OooO0OO("Search_search");
            OooOooo();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49733OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        ConstraintLayout constraintLayout = OooOoo().f49737OooO0o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.vSearch");
        oO0OoOO0.OooO00o(constraintLayout, true, false);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setNavigationOnClickListener(new oOo000Oo(this, 3));
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(o000O0O0.OooO00o(R.color.transparent));
        }
        MainSearchRoomFragment mainSearchRoomFragment = new MainSearchRoomFragment();
        this.f21970Ooooo0o = mainSearchRoomFragment;
        mainSearchRoomFragment.setOnScrollListener(new oOo0o0oO(this));
        List<Fragment> list = this.f21969Ooooo00;
        MainSearchRoomFragment mainSearchRoomFragment2 = this.f21970Ooooo0o;
        Intrinsics.checkNotNull(mainSearchRoomFragment2);
        list.add(mainSearchRoomFragment2);
        MainSearchUserFragment mainSearchUserFragment = new MainSearchUserFragment();
        this.f21971OooooO0 = mainSearchUserFragment;
        mainSearchUserFragment.setOnScrollListener(new ooOOO0Oo(this));
        List<Fragment> list2 = this.f21969Ooooo00;
        MainSearchUserFragment mainSearchUserFragment2 = this.f21971OooooO0;
        Intrinsics.checkNotNull(mainSearchUserFragment2);
        list2.add(mainSearchUserFragment2);
        OooOoo().f49739OooO0oO.setAdapter(new ooOOO00O(this, getSupportFragmentManager(), this.f21969Ooooo00));
        EditText editText = OooOoo().f49734OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etSearch");
        editText.addTextChangedListener(new oO0O0Oo0(this));
        OooOoo().f49734OooO0O0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0OOoO.oOo0oooO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                MainSearchActivity this$0 = this.f43731OooO00o;
                MainSearchActivity.OooO00o oooO00o = MainSearchActivity.f21967Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 3) {
                    return true;
                }
                this$0.OooOooo();
                return true;
            }
        });
        OooOoo().f49738OooO0o0.setOnClickListener(this);
        OooOoo().f49735OooO0OO.setOnClickListener(this);
        OooOoo().f49736OooO0Oo.setupWithViewPager(OooOoo().f49739OooO0oO);
        OooOoo().f49736OooO0Oo.setTabMode(1);
        OooOooO().getSearchText().observe(this, new o0O00OO(this, 2));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }
}
