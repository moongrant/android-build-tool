package com.yalla.yalla.ui.activity.account;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o0000;
import p159o00OoOO.o00000O;
import p159o00OoOO.o0000Ooo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p617o0oo0o.Oooo000;
import p649o0ooOOoo.q6;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/account/PhoneBindActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PhoneBindActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f21800OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21801OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(q6.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21802Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AccountVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.account.PhoneBindActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.account.PhoneBindActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.account.PhoneBindActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21806Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21806Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public AccountBindInfo f21803Ooooo0o;

    public final q6 OooOoo() {
        return (q6) this.f21801OoooOoo.getValue();
    }

    public final void OooOooO(AccountBindInfo accountBindInfo) {
        if (!Oooo000.OooO0O0(accountBindInfo.getIsPh())) {
            FrameLayout frameLayout = OooOoo().f50337OooO0O0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flChangePwd");
            oOO00O.OooO00o(frameLayout);
            OooOoo().f50338OooO0OO.setImageResource(R.drawable.ic_account_phone_gray);
            OooOoo().f50342OooO0oO.setText(o000O0O0.OooO0OO(R.string.title_Phone_noBind));
            OooOoo().f50340OooO0o.setText(o000O0O0.OooO0OO(R.string.title_Phone_connectPhone));
            return;
        }
        FrameLayout frameLayout2 = OooOoo().f50337OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.flChangePwd");
        oOO00O.OooO(frameLayout2);
        OooOoo().f50338OooO0OO.setImageResource(R.drawable.ic_account_phone_green);
        TextView textView = OooOoo().f50342OooO0oO;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("\u202d+");
        sbOooO0o0.append(accountBindInfo.getIsPh());
        sbOooO0o0.append((char) 8236);
        textView.setText(sbOooO0o0.toString());
        OooOoo().f50340OooO0o.setText(o000O0O0.OooO0OO(R.string.title_Phone_changePhone));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102 && i2 == -1) {
            setResult(-1);
            BaseActivityK.OooOoo0(this, null, 0L, 3, null);
            ((AccountVM) this.f21802Ooooo00.getValue()).getAccountBindInfo().observe(this, new o00000O(this, 1));
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (this.f21803Ooooo0o == null) {
            return;
        }
        if (!Intrinsics.areEqual(view, OooOoo().f50339OooO0Oo)) {
            if (Intrinsics.areEqual(view, OooOoo().f50341OooO0o0)) {
                Intrinsics.checkNotNullParameter(this, "activity");
                startActivity(new Intent(this, (Class<?>) ChangePasswordActivity.class));
                return;
            }
            return;
        }
        AccountBindInfo accountBindInfo = this.f21803Ooooo0o;
        if (accountBindInfo != null) {
            if (!Oooo000.OooO0O0(accountBindInfo.getIsPh())) {
                ClientCodeType clientCodeType = ClientCodeType.BingingPhone;
                Intrinsics.checkNotNullParameter(this, "context");
                Intent intent = new Intent(this, (Class<?>) PhoneNumberActivity.class);
                intent.putExtra("PHONE_NUMBER", (String) null);
                intent.putExtra("TYPE_ACCOUNT", clientCodeType);
                startActivity(intent);
                return;
            }
            String isPh = accountBindInfo.getIsPh();
            String countryCode = accountBindInfo.getCountryCode();
            ClientCodeType clientCodeType2 = ClientCodeType.ChangeOld;
            int i = (112 & 16) != 0 ? -1 : 0;
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent2 = new Intent(this, (Class<?>) SmsCodeActivity.class);
            intent2.putExtra("PHONE_NUMBER", isPh);
            intent2.putExtra("COUNTRY_AREA_CODE", countryCode);
            intent2.putExtra("TYPE_ACCOUNT", clientCodeType2);
            intent2.putExtra("TYPE_UNBIND", i);
            intent2.putExtra("DELETE_REASON_TYPE", (Parcelable) null);
            intent2.putExtra("IS_ACTIVATE", 0);
            startActivity(intent2);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50336OooO00o);
        Serializable serializableExtra = getIntent().getSerializableExtra("ACCOUNT_BIND_INFO");
        if (serializableExtra instanceof AccountBindInfo) {
            this.f21803Ooooo0o = (AccountBindInfo) serializableExtra;
        }
        OooOo(R.string.title_Phone_Phone);
        int i = 1;
        OooOo0O(1);
        AccountBindInfo accountBindInfo = this.f21803Ooooo0o;
        if (accountBindInfo != null) {
            OooOooO(accountBindInfo);
            OooOoo().f50339OooO0Oo.setOnClickListener(this);
            OooOoo().f50341OooO0o0.setOnClickListener(this);
        }
        LiveEventBus.get("BIND_PH_SUCCESS").observe(this, new o0000(this, i));
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new o0000Ooo(this, i));
    }
}
