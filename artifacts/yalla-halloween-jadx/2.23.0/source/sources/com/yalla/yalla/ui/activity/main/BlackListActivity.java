package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p486o0o00O00.o00Ooo;
import p486o0o00O00.o00oO0o;
import p486o0o00O00.o0O0O00;
import p486o0o00O00.o0OOO0o;
import p486o0o00O00.o0ooOOo;
import p486o0o00O00.oo0o0Oo;
import p555o0oOOooO.o0OOo000;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/BlackListActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View;", "v", "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BlackListActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f25368OooOo = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f25369OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f25370OooOOo0 = 1;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public TextView f25371OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public XRefreshLayout f25372OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RecyclerView f25373OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public oo0o0Oo f25374OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public UserBlackVM f25375OooOo0o;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25376OooO0Oo;

        public OooO00o(o0ooOOo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25376OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25376OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25376OooO0Oo;
        }

        public final int hashCode() {
            return this.f25376OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25376OooO0Oo.invoke(obj);
        }
    }

    public static final boolean OooOo0(BlackListActivity blackListActivity) {
        oo0o0Oo oo0o0oo = blackListActivity.f25374OooOo0O;
        if (oo0o0oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o0oo = null;
        }
        if (!com.code.android.util.OooOo00.OooO00o(oo0o0oo.f10111OooOOoo)) {
            TextView textView = blackListActivity.f25371OooOOoo;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            return false;
        }
        TextView textView2 = blackListActivity.f25371OooOOoo;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(blackListActivity.getString(oO00OOo0.Edit));
        TextView textView3 = blackListActivity.f25371OooOOoo;
        Intrinsics.checkNotNull(textView3);
        textView3.setVisibility(8);
        return true;
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1022 || intent == null) {
            return;
        }
        this.f25370OooOOo0 = 1;
        p420o0OoO0OO.o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new o00oO0o(this, null)).observe(this, new OooO00o(new o0ooOOo(this, true)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_black_list);
        this.f25375OooOo0o = (UserBlackVM) new ViewModelProvider(this).get(UserBlackVM.class);
        OooOOoo(oO00OOo0.Blocked_List);
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22755OooOO0;
        Intrinsics.checkNotNull(headerLayout);
        this.f25371OooOOoo = headerLayout.OooOoO(getString(oO00OOo0.Edit), new o0OOO0o(this));
        View viewFindViewById = findViewById(oO00O0oO.rv_black);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.rv_black)");
        this.f25373OooOo00 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.xrl_black);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.xrl_black)");
        this.f25372OooOo0 = (XRefreshLayout) viewFindViewById2;
        oo0o0Oo oo0o0oo = new oo0o0Oo(this, oO00OO0O.item_black_list);
        this.f25374OooOo0O = oo0o0oo;
        oo0o0oo.Oooo000(oO00OOo0.oops_No_one_in_Blocked_list);
        oo0o0Oo oo0o0oo2 = this.f25374OooOo0O;
        if (oo0o0oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o0oo2 = null;
        }
        oo0o0oo2.OooOooo(oOo00OO0.ic_empty_delete);
        oo0o0Oo oo0o0oo3 = this.f25374OooOo0O;
        if (oo0o0oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o0oo3 = null;
        }
        oo0o0oo3.Oooo0OO(new o0O0O00(this));
        XRefreshLayout xRefreshLayout = this.f25372OooOo0;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new o00Ooo(this, 0));
        XRefreshLayout xRefreshLayout2 = this.f25372OooOo0;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new o0000OO.OooO(this));
        RecyclerView recyclerView = this.f25373OooOo00;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f25373OooOo00;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new o0OOo000(this));
        RecyclerView recyclerView3 = this.f25373OooOo00;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView3 = null;
        }
        oo0o0Oo oo0o0oo4 = this.f25374OooOo0O;
        if (oo0o0oo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o0oo4 = null;
        }
        recyclerView3.setAdapter(oo0o0oo4);
        this.f25370OooOOo0 = 1;
        p420o0OoO0OO.o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new o00oO0o(this, null)).observe(this, new OooO00o(new o0ooOOo(this, true)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }
}
