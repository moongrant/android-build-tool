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
import p424o0OoO0Oo.o00O;
import p487o0o00O.o000000;
import p487o0o00O.o000000O;
import p487o0o00O.o0OO00O;
import p487o0o00O.o0Oo0oo;
import p487o0o00O.o0ooOOo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/BlackListActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View;", "v", "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class BlackListActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f24914OooOo = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f24915OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f24916OooOOo0 = 1;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public TextView f24917OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public XRefreshLayout f24918OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RecyclerView f24919OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o000000 f24920OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public UserBlackVM f24921OooOo0o;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24922OooO0Oo;

        public OooO00o(o0OO00O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24922OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24922OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24922OooO0Oo;
        }

        public final int hashCode() {
            return this.f24922OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24922OooO0Oo.invoke(obj);
        }
    }

    public static final boolean OooOo0(BlackListActivity blackListActivity) {
        o000000 o000000Var = blackListActivity.f24920OooOo0O;
        if (o000000Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000000Var = null;
        }
        if (!com.code.android.util.OooOo00.OooO00o(o000000Var.f13189OooOOoo)) {
            TextView textView = blackListActivity.f24917OooOOoo;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            return false;
        }
        TextView textView2 = blackListActivity.f24917OooOOoo;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(blackListActivity.getString(p562o0oOo000.o000000.Edit));
        TextView textView3 = blackListActivity.f24917OooOOoo;
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
        this.f24916OooOOo0 = 1;
        o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new o0Oo0oo(this, null)).observe(this, new OooO00o(new o0OO00O(this, true)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_black_list);
        this.f24921OooOo0o = (UserBlackVM) new ViewModelProvider(this).get(UserBlackVM.class);
        OooOOoo(p562o0oOo000.o000000.Blocked_List);
        int i = 1;
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22282OooOO0;
        Intrinsics.checkNotNull(headerLayout);
        this.f24917OooOOoo = headerLayout.OooOoO(getString(p562o0oOo000.o000000.Edit), new p487o0o00O.oo0o0Oo(this));
        View viewFindViewById = findViewById(p562o0oOo000.o0OO00O.rv_black);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f24919OooOo00 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(p562o0oOo000.o0OO00O.xrl_black);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f24918OooOo0 = (XRefreshLayout) viewFindViewById2;
        o000000 o000000Var = new o000000(this, oo0o0Oo.item_black_list);
        this.f24920OooOo0O = o000000Var;
        o000000Var.Oooo000(p562o0oOo000.o000000.oops_No_one_in_Blocked_list);
        o000000 o000000Var2 = this.f24920OooOo0O;
        if (o000000Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000000Var2 = null;
        }
        o000000Var2.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_delete);
        o000000 o000000Var3 = this.f24920OooOo0O;
        if (o000000Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000000Var3 = null;
        }
        o000000Var3.Oooo0OO(new o000000O(this));
        XRefreshLayout xRefreshLayout = this.f24918OooOo0;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new o0ooOOo(this, 0));
        XRefreshLayout xRefreshLayout2 = this.f24918OooOo0;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new o000O0O0.Oooo0(this, i));
        RecyclerView recyclerView = this.f24919OooOo00;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f24919OooOo00;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new p560o0oOo0.Oooo000(this));
        RecyclerView recyclerView3 = this.f24919OooOo00;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView3 = null;
        }
        o000000 o000000Var4 = this.f24920OooOo0O;
        if (o000000Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000000Var4 = null;
        }
        recyclerView3.setAdapter(o000000Var4);
        this.f24916OooOOo0 = 1;
        o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new o0Oo0oo(this, null)).observe(this, new OooO00o(new o0OO00O(this, true)));
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
