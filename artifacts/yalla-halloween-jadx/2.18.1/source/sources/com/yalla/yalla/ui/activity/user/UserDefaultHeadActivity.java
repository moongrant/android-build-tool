package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.app.base.view.HeaderLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.model.UserEditResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p192o00o0O0.o0OOO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p534o0o0OOo0.o0O0o;
import p563o0oOo0.o00O000;
import p566o0oOo00O.o00OO000;
import p566o0oOo00O.o00OO00O;
import p566o0oOo00O.o00OO0O0;
import p566o0oOo00O.oo0O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.lh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserDefaultHeadActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23427Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public UserDefaultHeadListModel.UserDefaultHeadItemModel f23431OooooO0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23428OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(lh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23429Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23439Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23439Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f23430Ooooo0o = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public List<p563o0oOo0.o00O000o> f23432OooooOO = new ArrayList();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f23433OooooOo = -1;

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function1<UserEditResult, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ UserDefaultHeadListModel.UserDefaultHeadItemModel f23434Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ UserDefaultHeadActivity f23435Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel, UserDefaultHeadActivity userDefaultHeadActivity) {
            super(1);
            this.f23434Oooo0o = userDefaultHeadItemModel;
            this.f23435Oooo0oO = userDefaultHeadActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UserEditResult userEditResult) {
            o0O00000.OooO0OO("Me_profile_DefaultAvatar_save");
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0oo().postValue(this.f23434Oooo0o.getUrl());
            LiveEventBus.get("UserHeaderUrl").post(this.f23434Oooo0o.getUrl());
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Userinfo_edit_success));
            this.f23435Oooo0oO.finish();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00O000> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O000 invoke() {
            UserDefaultHeadActivity userDefaultHeadActivity = UserDefaultHeadActivity.this;
            final o00O000 o00o001 = new o00O000(userDefaultHeadActivity, userDefaultHeadActivity.f23432OooooOO);
            final UserDefaultHeadActivity userDefaultHeadActivity2 = UserDefaultHeadActivity.this;
            o00o001.setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o0oOo00O.o00OO0OO
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    TextView f12044o000000;
                    TextView f12044o000001;
                    TextView f12044o000002;
                    UserDefaultHeadActivity this$0 = userDefaultHeadActivity2;
                    o00O000 this_apply = o00o001;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    Object item = baseQuickAdapter.getItem(i);
                    Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.yalla.yalla.ui.adapter.UserDefaultHeadAdapterItem");
                    UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = ((p563o0oOo0.o00O000o) item).f45074OooO0O0;
                    if (userDefaultHeadItemModel != null) {
                        this$0.f23433OooooOo = i;
                        this_apply.f45069OooO0OO = i;
                        this$0.f23431OooooO0 = userDefaultHeadItemModel;
                        if (Intrinsics.areEqual(CloudImageUtilKt.imgFormat(userDefaultHeadItemModel.getUrl()), CloudImageUtilKt.imgFormat(OooOOO.f41216OooO00o.OooO0oo().getValue()))) {
                            HeaderLayout headerLayout = this$0.f11463OoooO;
                            f12044o000000 = headerLayout != null ? headerLayout.getF12044o000000() : null;
                            if (f12044o000000 != null) {
                                f12044o000000.setClickable(false);
                            }
                            HeaderLayout headerLayout2 = this$0.f11463OoooO;
                            if (headerLayout2 != null && (f12044o000001 = headerLayout2.getF12044o000000()) != null) {
                                f12044o000001.setTextColor(-1962934273);
                            }
                        } else {
                            HeaderLayout headerLayout3 = this$0.f11463OoooO;
                            f12044o000000 = headerLayout3 != null ? headerLayout3.getF12044o000000() : null;
                            if (f12044o000000 != null) {
                                f12044o000000.setClickable(true);
                            }
                            HeaderLayout headerLayout4 = this$0.f11463OoooO;
                            if (headerLayout4 != null && (f12044o000002 = headerLayout4.getF12044o000000()) != null) {
                                f12044o000002.setTextColor(-1);
                            }
                            this$0.Oooo000(userDefaultHeadItemModel.getUrl());
                        }
                        ((o00O000) this$0.f23430Ooooo0o.getValue()).notifyDataSetChanged();
                    }
                }
            });
            userDefaultHeadActivity2.OooOooo().f49983OooO0OO.setAdapter(o00o001);
            o00o001.setSpanSizeLookup(new o0OOO0o(o00o001));
            return o00o001;
        }
    }

    public static final o00O000 OooOoo(UserDefaultHeadActivity userDefaultHeadActivity) {
        return (o00O000) userDefaultHeadActivity.f23430Ooooo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO(UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel) {
        ((UserInfoEditVM) this.f23429Ooooo00.getValue()).changeDefaultUrl(userDefaultHeadItemModel.getId()).observe(this, new o0o0000.OooOo(new OooO0O0(userDefaultHeadItemModel, this), null, null, false, 14));
    }

    public final lh OooOooo() {
        return (lh) this.f23428OoooOoo.getValue();
    }

    public final void Oooo000(String str) {
        if (str != null) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(str);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(OooOooo().f49982OooO0O0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        TextView f12044o000000;
        HeaderLayout headerLayout = this.f11463OoooO;
        if (!((headerLayout == null || (f12044o000000 = headerLayout.getF12044o000000()) == null || !f12044o000000.isClickable()) ? false : true)) {
            finish();
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOo0(R.string.UserInfoTag_ChangeTag_HintContent);
        oo0ooo0.OooOOOo(R.string.Save);
        oo0ooo0.OooOoO0(o000O0O0.OooO0OO(R.string.Discard));
        oo0ooo0.OooOOOo(R.string.Save);
        oo0ooo0.OooOo0o(new oo0O(this));
        oo0ooo0.OooOOO0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TextView f12044o000000;
        super.onCreate(bundle);
        setContentView(OooOooo().f49981OooO00o);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.header_default_url_title);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoo0(R.string.Save, new o0O0o(this, 2));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        TextView f12044o000001 = headerLayout3 != null ? headerLayout3.getF12044o000000() : null;
        if (f12044o000001 != null) {
            f12044o000001.setClickable(false);
        }
        HeaderLayout headerLayout4 = this.f11463OoooO;
        if (headerLayout4 != null && (f12044o000000 = headerLayout4.getF12044o000000()) != null) {
            f12044o000000.setTextColor(-1962934273);
        }
        OooOooo().f49983OooO0OO.setLayoutManager(new GridLayoutManager(this, 4));
        Oooo000(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0oo().getValue());
        OooOooo().f49984OooO0Oo.OooO0oo();
        ((UserInfoEditVM) this.f23429Ooooo00.getValue()).getAvatarList().observe(this, new o0o0000.OooOo(new o00OO000(this), new o00OO00O(this), new o00OO0O0(this), false, 8));
    }
}
