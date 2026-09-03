package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o000O0Oo;
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
import p377o0OOoOo.o0000OO0;
import p474o0o00.o00O;
import p474o0o00.o00O0OOO;
import p474o0o00.o00OO000;
import p474o0o00.oo0oOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.t;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneCountryCodeSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneCountryCodeSelectActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,151:1\n22#2,2:152\n75#3,13:154\n49#4:167\n65#4,16:168\n93#4,3:184\n*S KotlinDebug\n*F\n+ 1 PhoneCountryCodeSelectActivity.kt\ncom/yalla/yalla/ui/activity/account/PhoneCountryCodeSelectActivity\n*L\n30#1:152,2\n33#1:154,13\n124#1:167\n124#1:168,16\n124#1:184,3\n*E\n"})
public final class PhoneCountryCodeSelectActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f25251OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o00OO000 f25253OooOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f25255OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f25257OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25252OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(t.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25254OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PhNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25260OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25260OooO0Oo;
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
    public final ArrayList f25256OooOo0O = new ArrayList();

    public final t OooOo() {
        return (t) this.f25252OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58827OooO00o);
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.title_select_country);
        }
        OooOo().f58828OooO0O0.setLayoutManager(new LinearLayoutManager(this));
        OooOo().f58829OooO0OO.f21330OooOooO = false;
        o00OO000 o00oo001 = new o00OO000(this, oO00OO0O.item_country_code_seleted, this.f25256OooOo0O);
        this.f25253OooOo = o00oo001;
        o00oo001.f10101OooO0oo = new BaseQuickAdapter.OooO0O0() { // from class: o0o00.oo0o0O0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
            public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                int i2 = PhoneCountryCodeSelectActivity.f25251OooOoO0;
                PhoneCountryCodeSelectActivity this$0 = this.f47355OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intent intent = new Intent();
                o00OO000 o00oo002 = this$0.f25253OooOo;
                if (o00oo002 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o00oo002 = null;
                }
                intent.putExtra("DATA", (Parcelable) o00oo002.f10111OooOOoo.get(i));
                this$0.setResult(-1, intent);
                this$0.finish();
            }
        };
        o00oo001.Oooo00O(false);
        o00OO000 o00oo002 = this.f25253OooOo;
        if (o00oo002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00oo002 = null;
        }
        o00oo002.Oooo000(oO00OOo0.No_search_results);
        View viewInflate = View.inflate(this, oO00OO0O.account_activity_country_code_select_head, null);
        View viewFindViewById = viewInflate.findViewById(oO00O0oO.etSearch);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "searchHeader.findViewById(R.id.etSearch)");
        this.f25255OooOo00 = (TextView) viewFindViewById;
        o00OO000 o00oo003 = this.f25253OooOo;
        if (o00oo003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00oo003 = null;
        }
        o00oo003.OooOo(viewInflate);
        TextView textView = this.f25255OooOo00;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etSearch");
            textView = null;
        }
        textView.addTextChangedListener(new o00O(this));
        RecyclerView recyclerView = OooOo().f58828OooO0O0;
        o00OO000 o00oo004 = this.f25253OooOo;
        if (o00oo004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00oo004 = null;
        }
        recyclerView.setAdapter(o00oo004);
        OooOo().f58828OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00.o00O0OO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = PhoneCountryCodeSelectActivity.f25251OooOoO0;
                PhoneCountryCodeSelectActivity this$0 = this.f47270OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView textView2 = this$0.f25255OooOo00;
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
        ((PhNumberVM) this.f25254OooOo0.getValue()).getCountry(intent != null ? intent.getIntExtra("source", 1) : 1).observe(this, new o0000OO0(new o00O0OOO(this), null, new oo0oOO0(this), false, 10));
    }
}
