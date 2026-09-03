package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.account.PhNumberVM;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.o000O;
import p491o0o00O0o.o00OOOO0;
import p491o0o00O0o.o00Oo00;
import p491o0o00O0o.o0O00o0;
import p491o0o00O0o.o0oOO;
import p491o0o00O0o.oo00oO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPhoneCountryCodeSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneCountryCodeSelectActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,151:1\n22#2,2:152\n75#3,13:154\n49#4:167\n65#4,16:168\n93#4,3:184\n*S KotlinDebug\n*F\n+ 1 PhoneCountryCodeSelectActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity\n*L\n30#1:152,2\n33#1:154,13\n124#1:167\n124#1:168,16\n124#1:184,3\n*E\n"})
public final class PhoneCountryCodeSelectActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f24796OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oo00oO f24798OooOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f24800OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f24802OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24797OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o000O.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24799OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PhNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24805OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24805OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f24801OooOo0O = new ArrayList();

    public final o000O OooOo() {
        return (o000O) this.f24797OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44214OooO00o);
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(o000000.title_select_country);
        }
        OooOo().f44215OooO0O0.setLayoutManager(new LinearLayoutManager(this));
        OooOo().f44216OooO0OO.f20857OooOooO = false;
        oo00oO oo00oo = new oo00oO(this, oo0o0Oo.item_country_code_seleted, this.f24801OooOo0O);
        this.f24798OooOo = oo00oo;
        oo00oo.f13179OooO0oo = new o00OOOO0(this);
        oo00oo.Oooo00O(false);
        oo00oO oo00oo2 = this.f24798OooOo;
        if (oo00oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo00oo2 = null;
        }
        oo00oo2.Oooo000(o000000.No_search_results);
        View viewInflate = View.inflate(this, oo0o0Oo.account_activity_country_code_select_head, null);
        View viewFindViewById = viewInflate.findViewById(o0OO00O.etSearch);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f24800OooOo00 = (TextView) viewFindViewById;
        oo00oO oo00oo3 = this.f24798OooOo;
        if (oo00oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo00oo3 = null;
        }
        oo00oo3.OooOo(viewInflate);
        TextView textView = this.f24800OooOo00;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etSearch");
            textView = null;
        }
        textView.addTextChangedListener(new o0O00o0(this));
        RecyclerView recyclerView = OooOo().f44215OooO0O0;
        oo00oO oo00oo4 = this.f24798OooOo;
        if (oo00oo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo00oo4 = null;
        }
        recyclerView.setAdapter(oo00oo4);
        OooOo().f44215OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00O0o.o00OOOOo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = PhoneCountryCodeSelectActivity.f24796OooOoO0;
                PhoneCountryCodeSelectActivity this$0 = this.f48994OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView textView2 = this$0.f24800OooOo00;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etSearch");
                    textView2 = null;
                }
                textView2.clearFocus();
                return false;
            }
        });
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        Intent intent = getIntent();
        ((PhNumberVM) this.f24799OooOo0.getValue()).getCountry(intent != null ? intent.getIntExtra("source", 1) : 1).observe(this, new o000oOoO(new o00Oo00(this), null, new o0oOO(this), false, 10));
    }
}
