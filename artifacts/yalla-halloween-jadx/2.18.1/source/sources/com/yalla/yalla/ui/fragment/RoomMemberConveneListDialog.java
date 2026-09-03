package com.yalla.yalla.ui.fragment;

import android.content.DialogInterface;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.base.application.App;
import com.app.base.model.InOutRoomModel;
import com.app.base.model.RoomMemberConveneListModel;
import com.app.base.model.RoomMemberListModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.code.android.util.ToastUtil;
import com.facebook.AuthenticationTokenClaims;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.vm.RoomMemberVM;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.DialogTitleView;
import com.yalla.yalla.ui.view.SearchLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0O00;
import p143o00OOooo.o00O0OO0;
import p172o00OooO.o00O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p522o0o0O0o.oOO00O;
import p522o0o0O0o.oo0o0O0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p582o0oOoOoO.a3;
import p582o0oOoOoO.b3;
import p582o0oOoOoO.t2;
import p582o0oOoOoO.u2;
import p582o0oOoOoO.v2;
import p582o0oOoOoO.w2;
import p582o0oOoOoO.x2;
import p582o0oOoOoO.y2;
import p582o0oOoOoO.z2;
import p649o0ooOOoo.dc;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class RoomMemberConveneListDialog extends p502o0o00o0.o00000O {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f24158Ooooooo = new OooO00o();

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f24159OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f24160OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f24161OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public Map<Long, RoomUserInfoModel> f24162OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f24163OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public String f24164OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f24165OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f24166Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Map<Long, RoomUserInfoModel> f24167Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public CheckConveneMemberStatusModel f24168OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f24169OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f24170OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f24171Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f24172Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public b3 f24173OoooooO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24174o000oOoO;

    public static final class OooO extends Lambda implements Function0<Long> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            CheckConveneMemberStatusModel checkConveneMemberStatusModel = RoomMemberConveneListDialog.this.f24168OooooO0;
            long endTime = checkConveneMemberStatusModel != null ? checkConveneMemberStatusModel.getEndTime() : 0L;
            if (p496o0o00OOo.o000oOoO.OooO00o(endTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                endTime *= (long) 1000;
            }
            return Long.valueOf(endTime - System.currentTimeMillis());
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0260OooO00o extends Lambda implements Function1<DialogInterface, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ RoomMemberConveneListDialog f24176Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0260OooO00o(RoomMemberConveneListDialog roomMemberConveneListDialog) {
                super(1);
                this.f24176Oooo0o = roomMemberConveneListDialog;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(DialogInterface dialogInterface) {
                DialogInterface it = dialogInterface;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f24176Oooo0o.OooOOO().f49175OooO0oO.OooO0OO();
                o00O0O0.OooO0O0().OooO00o();
                return Unit.INSTANCE;
            }
        }

        public final void OooO00o(@NotNull FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            o00O.OooO0OO oooO0OO = o00O.OooO0OO.f43208OooO00o;
            CheckConveneMemberStatusModel value = o00O.OooO0OO.f43211OooO0Oo.getValue();
            if (value != null) {
                long jOooO0o = oOO00O.OooO0o(Long.valueOf(value.getEndTime()));
                if (p496o0o00OOo.o000oOoO.OooO00o(jOooO0o, p279o0O00OoO.OooO.OooO00o()) == 3) {
                    jOooO0o *= (long) 1000;
                }
                long jCurrentTimeMillis = jOooO0o - System.currentTimeMillis();
                if (value.getState() == 2 || (value.getState() == 1 && jCurrentTimeMillis <= 0)) {
                    String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_member_convene_finish_toast);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                        return;
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        return;
                    }
                }
                if (!value.getCanConvene()) {
                    if (value.getLastConveneTime().length() > 0) {
                        value.isEndTime(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    }
                } else if (!value.getHasMember()) {
                    String strOooO0OO2 = p254o00ooO0O.o000O0O0.OooO0OO(R.string.no_members_to_call_toast);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                        return;
                    }
                    o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O1.run();
                        return;
                    } else {
                        o00O000 o00o002 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        return;
                    }
                }
                RoomMemberConveneListDialog roomMemberConveneListDialog = new RoomMemberConveneListDialog(activity);
                roomMemberConveneListDialog.OooO00o(new C0260OooO00o(roomMemberConveneListDialog));
                p606o0oo0O.OooOo.OooO0O0("202022");
                roomMemberConveneListDialog.OooOO0();
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o000OO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            return new o000OO(RoomMemberConveneListDialog.this, App.f11458Oooo0oO);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<dc> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final dc invoke() {
            dc dcVarInflate = dc.inflate(LayoutInflater.from(RoomMemberConveneListDialog.this.f41543Oooo0o), RoomMemberConveneListDialog.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(dcVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return dcVarInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Integer> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            CheckConveneMemberStatusModel checkConveneMemberStatusModel = RoomMemberConveneListDialog.this.f24168OooooO0;
            return Integer.valueOf(checkConveneMemberStatusModel != null ? checkConveneMemberStatusModel.getConveneTimeLong() : 10);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<RoomMemberConveneListModel, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24180Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomMemberConveneListDialog f24181Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, RoomMemberConveneListDialog roomMemberConveneListDialog) {
            super(1);
            this.f24180Oooo0o = z;
            this.f24181Oooo0oO = roomMemberConveneListDialog;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, com.yalla.yalla.model.RoomUserInfoModel>] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberConveneListModel roomMemberConveneListModel) {
            List<RoomUserInfoModel> data;
            RoomMemberConveneListModel roomMemberConveneListModel2 = roomMemberConveneListModel;
            if (this.f24180Oooo0o) {
                this.f24181Oooo0oO.f24165OoooOoo.clear();
                this.f24181Oooo0oO.f24167Ooooo0o.clear();
            }
            if (roomMemberConveneListModel2 != null && (data = roomMemberConveneListModel2.getData()) != null) {
                RoomMemberConveneListDialog roomMemberConveneListDialog = this.f24181Oooo0oO;
                p522o0o0O0o.o000O0.OooO00o(roomMemberConveneListDialog.f24165OoooOoo, data, new o0000O(roomMemberConveneListDialog));
                roomMemberConveneListDialog.OooOo00(oOO00O.OooO0Oo(Integer.valueOf(roomMemberConveneListModel2.getDatacount()), 0));
            }
            RoomMemberConveneListDialog roomMemberConveneListDialog2 = this.f24181Oooo0oO;
            roomMemberConveneListDialog2.OooOOo0(roomMemberConveneListDialog2.f24165OoooOoo);
            this.f24181Oooo0oO.OooOOO0().setNewData(this.f24181Oooo0oO.f24165OoooOoo);
            if (this.f24181Oooo0oO.OooOOO0().getData().isEmpty()) {
                SearchLayout searchLayout = this.f24181Oooo0oO.OooOOO().f49175OooO0oO;
                Intrinsics.checkNotNullExpressionValue(searchLayout, "binding.searchView");
                p254o00ooO0O.oOO00O.OooO00o(searchLayout);
                this.f24181Oooo0oO.OooOOO().f49176OooO0oo.OooO0o0();
            } else {
                RoomMemberConveneListDialog roomMemberConveneListDialog3 = this.f24181Oooo0oO;
                if (roomMemberConveneListDialog3.f24169OooooOO) {
                    SearchLayout searchLayout2 = roomMemberConveneListDialog3.OooOOO().f49175OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(searchLayout2, "binding.searchView");
                    p254o00ooO0O.oOO00O.OooO00o(searchLayout2);
                } else {
                    SearchLayout searchLayout3 = roomMemberConveneListDialog3.OooOOO().f49175OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(searchLayout3, "binding.searchView");
                    p254o00ooO0O.oOO00O.OooO(searchLayout3);
                }
                this.f24181Oooo0oO.OooOOO().f49176OooO0oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (RoomMemberConveneListDialog.this.OooOOO0().getData().isEmpty()) {
                RoomMemberConveneListDialog.this.OooOOO().f49176OooO0oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Integer> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            CheckConveneMemberStatusModel checkConveneMemberStatusModel = RoomMemberConveneListDialog.this.f24168OooooO0;
            return Integer.valueOf(checkConveneMemberStatusModel != null ? checkConveneMemberStatusModel.getMaxConveneCount() : 50);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<ApiResult<RoomMemberConveneListModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24185Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(boolean z) {
            super(1);
            this.f24185Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberConveneListModel> apiResult) {
            ApiResult<RoomMemberConveneListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomMemberConveneListModel data = it.getData();
            boolean z = true;
            boolean zOooO0OO = oOO00O.OooO0OO(data != null ? Boolean.valueOf(data.getHasNext()) : null);
            RoomMemberConveneListDialog roomMemberConveneListDialog = RoomMemberConveneListDialog.this;
            if (roomMemberConveneListDialog.f24169OooooOO) {
                XRefreshLayout xRefreshLayout = roomMemberConveneListDialog.OooOOO().f49173OooO0o;
                boolean z2 = this.f24185Oooo0oO;
                boolean zIsSuccess = it.isSuccess();
                RoomMemberConveneListModel data2 = it.getData();
                List<RoomUserInfoModel> data3 = data2 != null ? data2.getData() : null;
                if (data3 != null && !data3.isEmpty()) {
                    z = false;
                }
                xRefreshLayout.Oooo0o0(z2, zIsSuccess, z);
            } else {
                roomMemberConveneListDialog.OooOOO().f49173OooO0o.Oooo0o0(this.f24185Oooo0oO, it.isSuccess(), zOooO0OO);
            }
            if (zOooO0OO) {
                RoomMemberConveneListDialog.this.OooOOOo(false);
            }
            RoomMemberConveneListDialog.this.OooOOoo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<RoomMemberListModel<List<RoomUserInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24186Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomMemberConveneListDialog f24187Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(boolean z, RoomMemberConveneListDialog roomMemberConveneListDialog) {
            super(1);
            this.f24186Oooo0o = z;
            this.f24187Oooo0oO = roomMemberConveneListDialog;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomUserInfoModel>> roomMemberListModel) {
            List<RoomUserInfoModel> list;
            RoomMemberListModel<List<RoomUserInfoModel>> roomMemberListModel2 = roomMemberListModel;
            if (this.f24186Oooo0o) {
                this.f24187Oooo0oO.f24163OoooOo0.clear();
            }
            if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null) {
                p522o0o0O0o.o000O0.OooO00o(this.f24187Oooo0oO.f24163OoooOo0, list, o0000OO0.f24484Oooo0o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24189Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(boolean z) {
            super(1);
            this.f24189Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            XRefreshLayout xRefreshLayout = RoomMemberConveneListDialog.this.OooOOO().f49173OooO0o;
            boolean z = this.f24189Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomUserInfoModel>> data = it.getData();
            List<RoomUserInfoModel> list = data != null ? data.data : null;
            xRefreshLayout.Oooo0o0(z, zIsSuccess, list == null || list.isEmpty());
            RoomMemberConveneListDialog.OooOO0o(RoomMemberConveneListDialog.this);
            RoomMemberConveneListDialog.this.OooOOoo();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomMemberConveneListDialog(@NotNull final FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24159OoooO = activity;
        this.f24160OoooOO0 = LazyKt.lazy(new OooO0OO());
        this.f24174o000oOoO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RoomMemberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24192Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f24192Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f24161OoooOOO = -1L;
        this.f24162OoooOOo = new LinkedHashMap();
        this.f24163OoooOo0 = new ArrayList();
        this.f24164OoooOoO = "";
        this.f24165OoooOoo = new ArrayList();
        this.f24166Ooooo00 = LazyKt.lazy(new OooO0O0());
        this.f24167Ooooo0o = new LinkedHashMap();
        o00O.OooO0OO oooO0OO = o00O.OooO0OO.f43208OooO00o;
        CheckConveneMemberStatusModel value = o00O.OooO0OO.f43211OooO0Oo.getValue();
        this.f24168OooooO0 = value;
        this.f24169OooooOO = !(value != null && value.getState() == 0);
        this.f24170OooooOo = LazyKt.lazy(new OooOOO());
        this.f24172Oooooo0 = LazyKt.lazy(new OooO0o());
        this.f24171Oooooo = LazyKt.lazy(new OooO());
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setSoftInputMode(35);
        }
        LinearLayout linearLayout = OooOOO().f49169OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        Window window2 = this.f41542Oooo;
        if (window2 != null) {
            window2.setGravity(80);
        }
        Long value2 = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        long jLongValue = value2 != null ? value2.longValue() : -1L;
        this.f24161OoooOOO = jLongValue;
        if (jLongValue < 0) {
            OooO0O0();
        }
        DialogTitleView it = OooOOO().f49168OooO;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DialogTitleView.OooO0OO(it, p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_member_convene));
        it.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.ic_room_member_convene_close), new y2(this));
        it.OooO00o(com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.ic_room_member_convene_info), new z2(this));
        OooOo00(0);
        OooOOO().f49176OooO0oo.OooO0oo();
        OooOOO().f49173OooO0o.f12222o000O0Oo = new com.facebook.appevents.ml.OooO(this, 7);
        OooOOO().f49173OooO0o.f12224o000OO0O = new p439o0OoOOo0.o00000O0(this, 3);
        StateLayout stateLayout = OooOOO().f49176OooO0oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new a3(this), 3);
        OooOOO().f49174OooO0o0.setLayoutManager(new LinearLayoutManager(activity));
        OooOOO().f49174OooO0o0.setAdapter(OooOOO0());
        OooOOO().f49171OooO0OO.setOnClickListener(new p564o0oOo00.o000O00(this, 2));
        OooOOO().f49173OooO0o.setOnTouchDownListener(new o00OOO00.OooO0O0(this, 5));
        OooOOoo();
        SearchLayout searchLayout = OooOOO().f49175OooO0oO;
        searchLayout.setEditStateListener(new t2(this));
        searchLayout.setClearListener(new u2(this));
        searchLayout.setCancelListener(new v2(this));
        searchLayout.setEditDelayListener(new w2(this));
        searchLayout.setEditorActionListener(new x2(this));
        OooOOOo(true);
        o00O.OooO0OO.f43211OooO0Oo.observe(activity, new o00O0O00(this, 6));
        LiveEventBus.get("ROOM_IN_OR_OUT", InOutRoomModel.class).observe(activity, new o00O0OO0(this, 4));
    }

    public static final int OooOO0O(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        return ((Number) roomMemberConveneListDialog.f24170OooooOo.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    public static final void OooOO0o(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        roomMemberConveneListDialog.OooOOO().f49176OooO0oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.no_data));
        TextView textView = roomMemberConveneListDialog.OooOOO().f49172OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.memberCount");
        p254o00ooO0O.oOO00O.OooO00o(textView);
        ?? r0 = roomMemberConveneListDialog.f24163OoooOo0;
        int i = -1;
        int i2 = 0;
        for (Object obj : r0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            long userId = ((RoomUserInfoModel) obj).getUserId();
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            if (value != null && userId == value.longValue()) {
                i = i2;
            }
            i2 = i3;
        }
        if (i > 0 && i < r0.size()) {
            r0.remove(i);
        }
        roomMemberConveneListDialog.OooOOo0(roomMemberConveneListDialog.f24163OoooOo0);
        roomMemberConveneListDialog.OooOOO0().setNewData(roomMemberConveneListDialog.f24163OoooOo0);
        if (roomMemberConveneListDialog.OooOOO0().getData().isEmpty()) {
            roomMemberConveneListDialog.OooOOO().f49176OooO0oo.OooO0o0();
        } else {
            roomMemberConveneListDialog.OooOOO().f49176OooO0oo.OooO0Oo();
        }
    }

    public final dc OooOOO() {
        return (dc) this.f24160OoooOO0.getValue();
    }

    public final p188o00o00o0.OooO0OO<RoomUserInfoModel> OooOOO0() {
        return (p188o00o00o0.OooO0OO) this.f24166Ooooo00.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RoomMemberVM OooOOOO() {
        return (RoomMemberVM) this.f24174o000oOoO.getValue();
    }

    public final void OooOOOo(boolean z) {
        this.f24164OoooOoO = "";
        OooOOO().f49176OooO0oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.no_members_to_call));
        OooOOO().f49173OooO0o.Oooo0o0(z, true, false);
        OooOOOO().getMemberList(this.f24161OoooOOO, this.f24169OooooOO, z).observe(this.f24159OoooO, new o0o0000.OooOo(new OooOO0(z, this), new OooOO0O(), new OooOOO0(z), false, 8));
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    public final void OooOOo(String str, boolean z) {
        this.f24164OoooOoO = str;
        if (StringsKt.isBlank(str) && z) {
            this.f24163OoooOo0.clear();
            OooOo0();
            return;
        }
        OooOOO().f49176OooO0oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.no_data));
        if (z) {
            OooOOO().f49176OooO0oo.OooO0oo();
        }
        OooOOO().f49173OooO0o.Oooo0o0(z, true, false);
        OooOOOO().getSingleBarSearch(this.f24161OoooOOO, str, this.f24169OooooOO, z).observe(this.f24159OoooO, new o0o0000.OooOo(new OooOOOO(z, this), null, new OooOo00(z), false, 10));
    }

    public final void OooOOo0(List<RoomUserInfoModel> list) {
        for (RoomUserInfoModel roomUserInfoModel : list) {
            roomUserInfoModel.setSelected(this.f24162OoooOOo.containsKey(Long.valueOf(roomUserInfoModel.getUserId())));
        }
    }

    public final void OooOOoo() {
        if (!this.f24169OooooOO) {
            if (!this.f24162OoooOOo.isEmpty()) {
                OooOOO().f49171OooO0OO.setBackground(com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.bgs_button_green_r360));
                OooOOO().f49171OooO0OO.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.member_convene_select_xxx1_xxx2), String.valueOf(this.f24162OoooOOo.size()), String.valueOf(((Number) this.f24170OooooOo.getValue()).intValue())));
                return;
            }
            OooOOO().f49171OooO0OO.setBackground(com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.bgs_button_aae6e2_r360));
            TextView textView = OooOOO().f49171OooO0OO;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(p254o00ooO0O.o000O0O0.OooO0OO(R.string.member_convene_no_select), Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            textView.setText(str);
            return;
        }
        LinearLayout linearLayout = OooOOO().f49170OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.bottomLayout");
        p254o00ooO0O.oOO00O.OooO(linearLayout);
        OooOOO().f49171OooO0OO.setBackground(com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.bgs_button_aae6e2_r360));
        if (((Number) this.f24171Oooooo.getValue()).longValue() > 0) {
            if (this.f24173OoooooO == null) {
                b3 b3Var = new b3(this, ((Number) this.f24171Oooooo.getValue()).longValue());
                this.f24173OoooooO = b3Var;
                b3Var.start();
                return;
            }
            return;
        }
        b3 b3Var2 = this.f24173OoooooO;
        if (b3Var2 != null) {
            b3Var2.cancel();
        }
        LinearLayout linearLayout2 = OooOOO().f49170OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.bottomLayout");
        p254o00ooO0O.oOO00O.OooO00o(linearLayout2);
        TextView textView2 = OooOOO().f49171OooO0OO;
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(p254o00ooO0O.o000O0O0.OooO0OO(R.string.member_convene_no_select), Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        textView2.setText(str2);
    }

    public final void OooOo0() {
        OooOOO().f49176OooO0oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.no_members_to_call));
        this.f24164OoooOoO = "";
        if (this.f24169OooooOO) {
            TextView textView = OooOOO().f49172OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.memberCount");
            p254o00ooO0O.oOO00O.OooO(textView);
        } else {
            TextView textView2 = OooOOO().f49172OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.memberCount");
            p254o00ooO0O.oOO00O.OooO00o(textView2);
        }
        OooOOO0().setNewData(this.f24165OoooOoo);
        if (OooOOO0().getData().isEmpty()) {
            OooOOO().f49176OooO0oo.OooO0o0();
        } else {
            OooOOO().f49176OooO0oo.OooO0Oo();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    public final void OooOo00(int i) {
        if (!this.f24169OooooOO) {
            OooOOO().f49172OooO0Oo.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_member_convene_title) + i);
            TextView textView = OooOOO().f49172OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.memberCount");
            p254o00ooO0O.oOO00O.OooO00o(textView);
            return;
        }
        String strValueOf = String.valueOf(this.f24167Ooooo0o.size());
        OooOOO().f49172OooO0Oo.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_member_convene_gathered), strValueOf, String.valueOf(this.f24165OoooOoo.size())));
        TextView textView2 = OooOOO().f49172OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.memberCount");
        p254o00ooO0O.oOO00O.OooO(textView2);
        TextView textView3 = OooOOO().f49172OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.memberCount");
        oo0o0O0.OooO0o0(textView3, new String[]{strValueOf}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9));
    }
}
