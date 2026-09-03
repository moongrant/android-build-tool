package com.yalla.yalla.ui.activity.account;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.AccountConfirmInfo;
import com.yalla.yalla.model.http.Response;
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
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.o000OOo0;
import p423o0OoO0OO.o00O0O0O;
import p475o0Ooooo0.o0O00oO0;
import p491o0o00O0o.o000O00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/DeleteAccountSubmitActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeleteAccountSubmitActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountSubmitActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountSubmitActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n22#2,2:142\n75#3,13:144\n1#4:157\n*S KotlinDebug\n*F\n+ 1 DeleteAccountSubmitActivity.kt\ncom/yalla/yalla/ui/activity/account/DeleteAccountSubmitActivity\n*L\n37#1:142,2\n38#1:144,13\n*E\n"})
public final class DeleteAccountSubmitActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f24720OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24721OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o000OOo0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24722OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24725OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24725OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final o000OOo0 OooOo() {
        return (o000OOo0) this.f24721OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44236OooO00o);
        OooOOoo(o000000.delete_account);
        OooOOo0(1);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o000O00O(this, null), 3, null);
        OooOo().f44245OooOO0O.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0o.o000O000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = DeleteAccountSubmitActivity.f24720OooOo0;
                DeleteAccountSubmitActivity this$0 = this.f48954OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                o000O o000o = new o000O(this$0);
                o000o.OooOoO(o0000.OooO0OO(o000000.account_delete_account_confirm_dialog2_title));
                o000o.OooOOoo(o000000.delete_account_confirm_content2);
                o000o.OooOOOO(o000000.Continue_);
                o000o.OooOo0(new o000O00(this$0));
                o000o.OooOo(true);
                o000o.OooOO0o();
            }
        });
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ((AccountVM) this.f24722OooOo00.getValue()).getAccountConfirmInfo().observe(this, new Observer() { // from class: o0o00O0o.o000O0o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Response response = (Response) obj;
                int i = DeleteAccountSubmitActivity.f24720OooOo0;
                DeleteAccountSubmitActivity this$0 = this.f48960OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess() && response.getData() != null) {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    AccountConfirmInfo accountConfirmInfo = (AccountConfirmInfo) data;
                    this$0.getClass();
                    if (accountConfirmInfo.getFriendsNum() > 0) {
                        this$0.OooOo().f44249OooOOOO.setText(String.valueOf(accountConfirmInfo.getFriendsNum()));
                    } else {
                        LinearLayout llFriends = this$0.OooOo().f44240OooO0o;
                        Intrinsics.checkNotNullExpressionValue(llFriends, "llFriends");
                        com.code.android.util.o000O.OooO0O0(llFriends);
                    }
                    if (accountConfirmInfo.getFansNum() > 0) {
                        this$0.OooOo().f44247OooOOO.setText(String.valueOf(accountConfirmInfo.getFansNum()));
                    } else {
                        LinearLayout llFans = this$0.OooOo().f44241OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(llFans, "llFans");
                        com.code.android.util.o000O.OooO0O0(llFans);
                    }
                    if (accountConfirmInfo.getUserLevel() > 0) {
                        this$0.OooOo().f44250OooOOOo.setText(String.valueOf(accountConfirmInfo.getUserLevel()));
                    } else {
                        LinearLayout llLevel = this$0.OooOo().f44242OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(llLevel, "llLevel");
                        com.code.android.util.o000O.OooO0O0(llLevel);
                    }
                    if (accountConfirmInfo.getCoinNum() > 0) {
                        this$0.OooOo().f44244OooOO0.setText(o0O0O0Oo.OooO0Oo(String.valueOf(accountConfirmInfo.getCoinNum())));
                    } else {
                        LinearLayout llCoin = this$0.OooOo().f44238OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(llCoin, "llCoin");
                        com.code.android.util.o000O.OooO0O0(llCoin);
                    }
                    if (accountConfirmInfo.getCrystalNum() > 0) {
                        this$0.OooOo().f44246OooOO0o.setText(o0O0O0Oo.OooO0Oo(String.valueOf(accountConfirmInfo.getCrystalNum())));
                    } else {
                        LinearLayout llCrystal = this$0.OooOo().f44239OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(llCrystal, "llCrystal");
                        com.code.android.util.o000O.OooO0O0(llCrystal);
                    }
                    if (accountConfirmInfo.getMedalNum() > 0) {
                        this$0.OooOo().f44243OooO0oo.setText(String.valueOf(accountConfirmInfo.getMedalNum()));
                    } else {
                        LinearLayout llBadge = this$0.OooOo().f44237OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(llBadge, "llBadge");
                        com.code.android.util.o000O.OooO0O0(llBadge);
                    }
                    TextView textView = this$0.OooOo().f44248OooOOO0;
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    String strValueOf = String.valueOf(o0O00oO0.OooOOoo().getValue());
                    textView.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.delete_your_account_prompt_content4), strValueOf));
                    Intrinsics.checkNotNull(textView);
                    o00O0O0O.OooO0Oo(textView, o0000.OooO00o(o0OOO0o.app_color_), strValueOf);
                }
                this$0.OooOo0();
            }
        });
        TextView tvCancel = OooOo().f44235OooO;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        com.code.android.util.o000O.OooO(tvCancel, new p491o0o00O0o.o000O0(this));
    }
}
