package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p474o0o00.o000000;
import p474o0o00.o000OOo;
import p474o0o00.o0O0O00;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.v;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/DeleteAccountSubmitActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeleteAccountSubmitActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountSubmitActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountSubmitActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n22#2,2:142\n75#3,13:144\n1#4:157\n*S KotlinDebug\n*F\n+ 1 DeleteAccountSubmitActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountSubmitActivity\n*L\n37#1:142,2\n38#1:144,13\n*E\n"})
public final class DeleteAccountSubmitActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f25179OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25180OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(v.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25181OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25184OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25184OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final v OooOo() {
        return (v) this.f25180OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59007OooO00o);
        OooOOoo(oO00OOo0.delete_account);
        OooOOo0(1);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o0O0O00(this, null), 3, null);
        OooOo().f59016OooOO0O.setOnClickListener(new View.OnClickListener() { // from class: o0o00.o0Oo0oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = DeleteAccountSubmitActivity.f25179OooOo0;
                DeleteAccountSubmitActivity this$0 = this.f47335OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                o0OO00O o0oo00o2 = new o0OO00O(this$0);
                o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.account_delete_account_confirm_dialog2_title));
                o0oo00o2.OooOOoo(oO00OOo0.delete_account_confirm_content2);
                o0oo00o2.OooOOOO(oO00OOo0.Continue_);
                o0oo00o2.OooOo0(new oo0o0Oo(this$0));
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOO0o();
            }
        });
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((AccountVM) this.f25181OooOo00.getValue()).getAccountConfirmInfo().observe(this, new o000OOo(this));
        TextView textView = OooOo().f59006OooO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvCancel");
        o000OO00.OooO(textView, new o000000(this));
    }
}
