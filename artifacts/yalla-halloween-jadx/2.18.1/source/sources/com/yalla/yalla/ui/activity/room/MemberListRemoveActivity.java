package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.base.model.RoomMemberListModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.room.MemberVM;
import java.util.ArrayList;
import java.util.Collection;
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
import p192o00o0O0.o00000O;
import p192o00o0O0.o00000O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p502o0o00o0.o0000;
import p522o0o0O0o.o000O0Oo;
import p530o0o0OOO.o00OO00O;
import p544o0o0OoOO.a5;
import p649o0ooOOoo.qe;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/MemberListRemoveActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MemberListRemoveActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22886Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22887OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(qe.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22888Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MemberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.MemberListRemoveActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.MemberListRemoveActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.MemberListRemoveActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22901Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22901Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f22889Ooooo0o = -1;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public List<RoomUserInfoModel> f22890OooooO0 = new ArrayList();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f22891OooooOO = 50;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22892OooooOo = LazyKt.lazy(new OooO0O0());

    public static final class OooO extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f22894Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f22894Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MemberListRemoveActivity memberListRemoveActivity = MemberListRemoveActivity.this;
            OooO00o oooO00o = MemberListRemoveActivity.f22886Oooooo0;
            XRefreshLayout xRefreshLayout = memberListRemoveActivity.OooOooO().f50382OooO0OO;
            boolean z = this.f22894Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomUserInfoModel>> data = it.getData();
            List<RoomUserInfoModel> list = data != null ? data.data : null;
            xRefreshLayout.Oooo0o0(z, zIsSuccess, list == null || list.isEmpty());
            MemberListRemoveActivity.this.Oooo000();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooOO0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0O invoke() {
            return new OooOO0O(MemberListRemoveActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<RoomMemberListModel<List<RoomUserInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f22896Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MemberListRemoveActivity f22897Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, MemberListRemoveActivity memberListRemoveActivity) {
            super(1);
            this.f22896Oooo0o = z;
            this.f22897Oooo0oO = memberListRemoveActivity;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomUserInfoModel>> roomMemberListModel) {
            List<RoomUserInfoModel> list;
            RoomMemberListModel<List<RoomUserInfoModel>> roomMemberListModel2 = roomMemberListModel;
            if (this.f22896Oooo0o) {
                this.f22897Oooo0oO.f22890OooooO0.clear();
                MemberListRemoveActivity.OooOoo(this.f22897Oooo0oO).setNewData(roomMemberListModel2 != null ? roomMemberListModel2.data : null);
                if (MemberListRemoveActivity.OooOoo(this.f22897Oooo0oO).getData().isEmpty()) {
                    this.f22897Oooo0oO.OooOooO().f50384OooO0o0.OooO0o0();
                } else {
                    this.f22897Oooo0oO.OooOooO().f50384OooO0o0.OooO0Oo();
                }
            } else if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null) {
                MemberListRemoveActivity.OooOoo(this.f22897Oooo0oO).addData((Collection) list);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            Collection data = MemberListRemoveActivity.OooOoo(MemberListRemoveActivity.this).getData();
            if (data == null || data.isEmpty()) {
                MemberListRemoveActivity.this.OooOooO().f50384OooO0o0.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final p188o00o00o0.OooO0OO OooOoo(MemberListRemoveActivity memberListRemoveActivity) {
        return (p188o00o00o0.OooO0OO) memberListRemoveActivity.f22892OooooOo.getValue();
    }

    public final qe OooOooO() {
        return (qe) this.f22887OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooo(boolean z) {
        ((MemberVM) this.f22888Ooooo00.getValue()).getBatchRoomMemberList(this.f22889Ooooo0o, z).observe(this, new o0o0000.OooOo(new OooO0OO(z, this), new OooO0o(), new OooO(z), false, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    public final void Oooo000() {
        if (this.f22890OooooO0.size() > 0) {
            OooOooO().f50383OooO0Oo.setBackground(o000O0Oo.OooO00o(this, R.drawable.bgs_button_green_r360));
            OooOooO().f50383OooO0Oo.setClickable(true);
        } else {
            OooOooO().f50383OooO0Oo.setBackground(o000O0Oo.OooO00o(this, R.drawable.bgs_button_gray_r360));
            OooOooO().f50383OooO0Oo.setClickable(false);
        }
        OooOooO().f50383OooO0Oo.setText(o000O0O0.OooO0OO(R.string.room_member_remove_button_remove) + '(' + this.f22890OooooO0.size() + '/' + this.f22891OooooOO + ')');
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f50380OooO00o);
        OooOoO0(o000O0O0.OooO0OO(R.string.room_member_remove));
        Oooo000();
        OooOooO().f50384OooO0o0.OooO0oo();
        OooOooO().f50382OooO0OO.f12222o000O0Oo = new o00000O(this);
        OooOooO().f50382OooO0OO.f12224o000OO0O = new o00000O0(this);
        StateLayout stateLayout = OooOooO().f50384OooO0o0;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new a5(this), 3);
        OooOooO().f50381OooO0O0.setLayoutManager(new LinearLayoutManager(this));
        OooOooO().f50381OooO0O0.setAdapter((p188o00o00o0.OooO0OO) this.f22892OooooOo.getValue());
        OooOooO().f50383OooO0Oo.setOnClickListener(new o0000(this, 1));
        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        long jLongValue = value == null ? -1L : value.longValue();
        this.f22889Ooooo0o = jLongValue;
        if (jLongValue < 0) {
            finish();
        }
        OooOooo(true);
    }
}
