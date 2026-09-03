package p530o0o0OOOO;

import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.facebook.AuthenticationTokenClaims;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomMemberConveneListModel;
import com.yalla.yalla.model.room.RoomMemberListModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.fragment.OooOOOO;
import com.yalla.yalla.ui.fragment.OooOo;
import com.yalla.yalla.ui.view.DialogTitleView;
import com.yalla.yalla.ui.view.SearchLayout;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.RoomMemberVM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.oO0O0;
import p423o0OoO0OO.o0000OO0;
import p423o0OoO0OO.o00O0O0O;
import p483o0o000Oo.o00000OO;
import p491o0o00O0o.o0OO;
import p559o0oOo.o00O0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberConveneListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberConveneListDialog.kt\ncom/yalla/yalla/ui/fragment/room/RoomMemberConveneListDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,568:1\n75#2,13:569\n1855#3,2:582\n1864#3,3:584\n1855#3,2:587\n1864#3,3:589\n*S KotlinDebug\n*F\n+ 1 RoomMemberConveneListDialog.kt\ncom/yalla/yalla/ui/fragment/room/RoomMemberConveneListDialog\n*L\n58#1:569,13\n346#1:582,2\n496#1:584,3\n507#1:587,2\n163#1:589,3\n*E\n"})
public final class o0O00oO0 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f53398OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f53399OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f53400OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f53401OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f53402OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53403OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53404OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f53405OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f53406OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f53407OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public CheckConveneMemberStatusModel f53408OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f53409OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f53410OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f53411OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public o0OO00OO f53412OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f53413OooOoO0;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f53414OooO0Oo;

        public OooO(o0O0OOOo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53414OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f53414OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f53414OooO0Oo;
        }

        public final int hashCode() {
            return this.f53414OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53414OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@NotNull MixedRoomActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            CheckConveneMemberStatusModel value = com.yalla.yalla.service.room.OooO00o.f24518OooO0oo.f48487OooO0OO.getValue();
            if (value != null) {
                long jOooOO0 = o0OoOo0.OooOO0(Long.valueOf(value.getEndTime()));
                int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(jOooOO0).length();
                boolean z = true;
                if (1 <= length) {
                    int i = 1;
                    while (true) {
                        jOooOO0 *= (long) 10;
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                long jCurrentTimeMillis = jOooOO0 - System.currentTimeMillis();
                if (value.getState() == 2 || (value.getState() == 1 && jCurrentTimeMillis <= 0)) {
                    String strOooO0OO = o0000.OooO0OO(o000000.room_member_convene_finish_toast);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                        return;
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        return;
                    }
                }
                if (!value.getCanConvene()) {
                    if (value.getLastConveneTime().length() > 0) {
                        value.isEndTime(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    }
                } else if (!value.getHasMember()) {
                    String strOooO0OO2 = o0000.OooO0OO(o000000.no_members_to_call_toast);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                        return;
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        return;
                    }
                }
                o0O00oO0 o0o00oo1 = new o0O00oO0(activity);
                o0o00oo1.OooO00o(new o0O00o00(o0o00oo1));
                o0oo0000.OooO00o.OooO0O0("202022");
                o0o00oo1.OooO();
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RoomMemberConveneListModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f53415OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f53416OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00oO0 o0o00oo1, boolean z) {
            super(1);
            this.f53415OooO0Oo = z;
            this.f53416OooO0o0 = o0o00oo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberConveneListModel roomMemberConveneListModel) {
            List<RoomUserInfoDTO> data;
            List<RoomUserInfoModel> listTransformToModel;
            RoomMemberConveneListModel roomMemberConveneListModel2 = roomMemberConveneListModel;
            boolean z = this.f53415OooO0Oo;
            o0O00oO0 o0o00oo1 = this.f53416OooO0o0;
            if (z) {
                o0o00oo1.f53404OooOOo.clear();
                o0o00oo1.f53409OooOo00.clear();
            }
            if (roomMemberConveneListModel2 != null && (data = roomMemberConveneListModel2.getData()) != null && (listTransformToModel = NewRoomUserInfoTransformutilsKt.transformToModel(data)) != null) {
                o0000OO0.OooO00o(o0o00oo1.f53404OooOOo, listTransformToModel, new o0OO000o(o0o00oo1));
                o0o00oo1.OooOOo(o0OoOo0.OooO0o0(0, Integer.valueOf(roomMemberConveneListModel2.getDatacount())));
            }
            o0o00oo1.OooOOOO(o0o00oo1.f53404OooOOo);
            o0o00oo1.OooOO0O().OooOoO0(o0o00oo1.f53404OooOOo);
            if (o0o00oo1.OooOO0O().f13189OooOOoo.isEmpty()) {
                SearchLayout searchView = o0o00oo1.OooOO0o().f44844OooO0oO;
                Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
                o000O.OooO0O0(searchView);
                o0o00oo1.OooOO0o().f44845OooO0oo.OooO0o0();
            } else {
                if (o0o00oo1.f53410OooOo0O) {
                    SearchLayout searchView2 = o0o00oo1.OooOO0o().f44844OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(searchView2, "searchView");
                    o000O.OooO0O0(searchView2);
                } else {
                    SearchLayout searchView3 = o0o00oo1.OooOO0o().f44844OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(searchView3, "searchView");
                    o000O.OooOOOO(searchView3);
                }
                o0o00oo1.OooOO0o().f44845OooO0oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            o0O00oO0 o0o00oo1 = o0O00oO0.this;
            if (o0o00oo1.OooOO0O().f13189OooOOoo.isEmpty()) {
                o0o00oo1.OooOO0o().f44845OooO0oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<RoomMemberConveneListModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f53419OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f53419OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberConveneListModel> apiResult) {
            ApiResult<RoomMemberConveneListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomMemberConveneListModel data = it.getData();
            boolean zOooO00o = o0OoOo0.OooO00o(data != null ? Boolean.valueOf(data.getHasNext()) : null);
            o0O00oO0 o0o00oo1 = o0O00oO0.this;
            boolean z = o0o00oo1.f53410OooOo0O;
            boolean z2 = this.f53419OooO0o0;
            if (z) {
                XRefreshLayout xRefreshLayout = o0o00oo1.OooOO0o().f44842OooO0o;
                boolean zIsSuccess = it.isSuccess();
                RoomMemberConveneListModel data2 = it.getData();
                List<RoomUserInfoDTO> data3 = data2 != null ? data2.getData() : null;
                xRefreshLayout.OooOooo(z2, zIsSuccess, data3 == null || data3.isEmpty());
            } else {
                o0o00oo1.OooOO0o().f44842OooO0o.OooOooo(z2, it.isSuccess(), zOooO00o);
            }
            if (zOooO00o) {
                o0o00oo1.OooOOO(false);
            }
            o0o00oo1.OooOOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<RoomMemberListModel<List<RoomUserInfoDTO>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f53420OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f53421OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0O00oO0 o0o00oo1, boolean z) {
            super(1);
            this.f53420OooO0Oo = z;
            this.f53421OooO0o0 = o0o00oo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomUserInfoDTO>> roomMemberListModel) {
            List<RoomUserInfoDTO> list;
            List<RoomUserInfoModel> listTransformToModel;
            RoomMemberListModel<List<RoomUserInfoDTO>> roomMemberListModel2 = roomMemberListModel;
            boolean z = this.f53420OooO0Oo;
            o0O00oO0 o0o00oo1 = this.f53421OooO0o0;
            if (z) {
                o0o00oo1.f53403OooOOOo.clear();
            }
            if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null && (listTransformToModel = NewRoomUserInfoTransformutilsKt.transformToModel(list)) != null) {
                o0000OO0.OooO00o(o0o00oo1.f53403OooOOOo, listTransformToModel, oo0ooO.f53450OooO0Oo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f53423OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(1);
            this.f53423OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            o0O00oO0 o0o00oo1 = o0O00oO0.this;
            XRefreshLayout xRefreshLayout = o0o00oo1.OooOO0o().f44842OooO0o;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomUserInfoDTO>> data = it.getData();
            List<RoomUserInfoDTO> list = data != null ? data.data : null;
            xRefreshLayout.OooOooo(this.f53423OooO0o0, zIsSuccess, list == null || list.isEmpty());
            o0O00oO0.OooOO0(o0o00oo1);
            o0o00oo1.OooOOo0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(@NotNull final MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f53398OooOO0O = activity;
        this.f53399OooOO0o = LazyKt.lazy(new o0O0O0Oo(this));
        this.f53401OooOOO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RoomMemberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomMemberConveneListDialog$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomMemberConveneListDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomMemberConveneListDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28513OooO0Oo = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28513OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f53400OooOOO = -1L;
        this.f53402OooOOOO = new LinkedHashMap();
        this.f53403OooOOOo = new ArrayList();
        this.f53405OooOOo0 = "";
        this.f53404OooOOo = new ArrayList();
        this.f53406OooOOoo = LazyKt.lazy(new o0O0oo0o(this));
        this.f53409OooOo00 = new LinkedHashMap();
        o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24518OooO0oo;
        CheckConveneMemberStatusModel value = o00000oo2.f48487OooO0OO.getValue();
        this.f53408OooOo0 = value;
        int i = 1;
        this.f53410OooOo0O = !(value != null && value.getState() == 0);
        this.f53411OooOo0o = LazyKt.lazy(new oo0oO0(this));
        this.f53407OooOo = LazyKt.lazy(new o0O0OO0(this));
        this.f53413OooOoO0 = LazyKt.lazy(new o0O0OOO0(this));
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setSoftInputMode(35);
        }
        LinearLayout linearLayout = OooOO0o().f44838OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        Window window2 = this.f58510OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        Long value2 = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
        long jLongValue = value2 != null ? value2.longValue() : -1L;
        this.f53400OooOOO = jLongValue;
        if (jLongValue < 0) {
            OooO0O0();
        }
        DialogTitleView dialogTitleView = OooOO0o().f44837OooO;
        Intrinsics.checkNotNull(dialogTitleView);
        DialogTitleView.OooO0OO(dialogTitleView, o0000.OooO0OO(o000000.room_member_convene));
        dialogTitleView.OooO0O0(o0000.OooO0O0(o0Oo0oo.ic_room_member_convene_close), new o0O0oo00(this));
        dialogTitleView.OooO00o(o0000.OooO0O0(o0Oo0oo.ic_room_member_convene_info), new o0O(this));
        OooOOo(0);
        OooOO0o().f44845OooO0oo.OooO0oo();
        OooOO0o().f44842OooO0o.f30717o00000OO = new o00O0O() { // from class: o0o0OOOO.o0O00OOO
            @Override // p559o0oOo.o00O0O
            public final void OooO0OO() {
                o0O00oO0 this$0 = this.f53396OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!StringsKt.isBlank(this$0.f53405OooOOo0)) {
                    this$0.OooOOOo(this$0.f53405OooOOo0, true);
                } else {
                    this$0.OooOOO(true);
                }
            }
        };
        OooOO0o().f44842OooO0o.f30718o00000Oo = new OooOOOO(this);
        StateLayout stateLayout = OooOO0o().f44845OooO0oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new o0OO000(this), 3);
        OooOO0o().f44843OooO0o0.setLayoutManager(new LinearLayoutManager(activity));
        OooOO0o().f44843OooO0o0.setAdapter(OooOO0O());
        OooOO0o().f44840OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o0OOOO.o0oO0Ooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0O00oO0 this$0 = this.f53446OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o.OooO0O0("102207");
                boolean z = true;
                if (this$0.f53410OooOo0O) {
                    String strOooO0OO = o0000.OooO0OO(o000000.room_member_convene_send_success);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                        return;
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        return;
                    }
                }
                if (!this$0.f53402OooOOOO.isEmpty()) {
                    p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0.f53398OooOO0O);
                    o000o.OooOoO(o0000.OooO0OO(o000000.room_member_convene_dialog_title));
                    o000o.OooOOoo(o000000.room_member_convene_dialog_content);
                    o000o.OooOo0(new o0OO00o0(this$0));
                    o000o.OooOo(true);
                    o000o.OooOO0o();
                    return;
                }
                String strOooO0OO2 = o0000.OooO0OO(o000000.please_select_the_members_to_convene_first);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
        });
        OooOO0o().f44842OooO0o.setOnTouchDownListener(new OooOo(this));
        OooOOo0();
        SearchLayout searchLayout = OooOO0o().f44844OooO0oO;
        searchLayout.setEditStateListener(new oo0OOoo(this));
        searchLayout.setClearListener(new o0O0o000(this));
        searchLayout.setCancelListener(new o0O0o00O(this));
        searchLayout.setEditDelayListener(new o0O0o0(this));
        searchLayout.setEditorActionListener(new o0oOo0O0(this));
        OooOOO(true);
        o00000oo2.f48487OooO0OO.observe(activity, new OooO(new o0O0OOOo(this)));
        LiveEventBus.get("ROOM_IN_OR_OUT", InOutRoomModel.class).observe(activity, new o0OO(i, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOO0(o0O00oO0 o0o00oo1) {
        o0o00oo1.OooOO0o().f44845OooO0oo.setEmptyText(o0000.OooO0OO(o000000.no_data));
        TextView memberCount = o0o00oo1.OooOO0o().f44841OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(memberCount, "memberCount");
        o000O.OooO0O0(memberCount);
        ArrayList arrayList = o0o00oo1.f53403OooOOOo;
        int i = -1;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            long jLongValue = ((RoomUserInfoModel) obj).getUserId().getValue().longValue();
            p475o0Ooooo0.o0O00oO0 o0o00oo2 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            Long l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
            if (l != null && jLongValue == l.longValue()) {
                i = i2;
            }
            i2 = i3;
        }
        if (i > 0 && i < arrayList.size()) {
            arrayList.remove(i);
        }
        o0o00oo1.OooOOOO(arrayList);
        o0o00oo1.OooOO0O().OooOoO0(arrayList);
        if (o0o00oo1.OooOO0O().f13189OooOOoo.isEmpty()) {
            o0o00oo1.OooOO0o().f44845OooO0oo.OooO0o0();
        } else {
            o0o00oo1.OooOO0o().f44845OooO0oo.OooO0Oo();
        }
    }

    public final o0000oo<RoomUserInfoModel> OooOO0O() {
        return (o0000oo) this.f53406OooOOoo.getValue();
    }

    public final oO0O0 OooOO0o() {
        return (oO0O0) this.f53399OooOO0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(boolean z) {
        this.f53405OooOOo0 = "";
        OooOO0o().f44845OooO0oo.setEmptyText(o0000.OooO0OO(o000000.no_members_to_call));
        OooOO0o().f44842OooO0o.OooOooo(z, true, false);
        ((RoomMemberVM) this.f53401OooOOO0.getValue()).getMemberList(this.f53400OooOOO, this.f53410OooOo0O, z).observe(this.f53398OooOO0O, new o000oOoO(new OooO0O0(this, z), new OooO0OO(), new OooO0o(z), false, 8));
    }

    public final int OooOOO0() {
        return ((Number) this.f53411OooOo0o.getValue()).intValue();
    }

    public final void OooOOOO(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) it.next();
            roomUserInfoModel.isSelected().setValue(Boolean.valueOf(this.f53402OooOOOO.containsKey(roomUserInfoModel.getUserId().getValue())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOOo(String str, boolean z) {
        this.f53405OooOOo0 = str;
        if (StringsKt.isBlank(str) && z) {
            this.f53403OooOOOo.clear();
            OooOOoo();
            return;
        }
        OooOO0o().f44845OooO0oo.setEmptyText(o0000.OooO0OO(o000000.no_data));
        if (z) {
            OooOO0o().f44845OooO0oo.OooO0oo();
        }
        OooOO0o().f44842OooO0o.OooOooo(z, true, false);
        ((RoomMemberVM) this.f53401OooOOO0.getValue()).getSingleBarSearch(this.f53400OooOOO, str, this.f53410OooOo0O, z).observe(this.f53398OooOO0O, new o000oOoO(new OooOO0(this, z), null, new OooOO0O(z), false, 10));
    }

    public final void OooOOo(int i) {
        if (!this.f53410OooOo0O) {
            OooOO0o().f44841OooO0Oo.setText(o0000.OooO0OO(o000000.room_member_convene_title) + i);
            TextView memberCount = OooOO0o().f44841OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(memberCount, "memberCount");
            o000O.OooO0O0(memberCount);
            return;
        }
        String strValueOf = String.valueOf(this.f53409OooOo00.size());
        OooOO0o().f44841OooO0Oo.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.room_member_convene_gathered), strValueOf, String.valueOf(this.f53404OooOOo.size())));
        TextView memberCount2 = OooOO0o().f44841OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(memberCount2, "memberCount");
        o000O.OooOOOO(memberCount2);
        TextView memberCount3 = OooOO0o().f44841OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(memberCount3, "memberCount");
        o00O0O0O.OooO0Oo(memberCount3, o0000.OooO00o(o0OOO0o.color_00d8c9), strValueOf);
    }

    public final void OooOOo0() {
        if (!this.f53410OooOo0O) {
            LinkedHashMap linkedHashMap = this.f53402OooOOOO;
            if (!linkedHashMap.isEmpty()) {
                OooOO0o().f44840OooO0OO.setBackground(o0000.OooO0O0(o0Oo0oo.bgs_button_green_r360));
                OooOO0o().f44840OooO0OO.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.member_convene_select_xxx1_xxx2), String.valueOf(linkedHashMap.size()), String.valueOf(OooOOO0())));
                return;
            } else {
                OooOO0o().f44840OooO0OO.setBackground(o0000.OooO0O0(o0Oo0oo.bgs_button_aae6e2_r360));
                TextView textView = OooOO0o().f44840OooO0OO;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(o0000.OooO0OO(o000000.member_convene_no_select), Arrays.copyOf(new Object[0], 0));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                textView.setText(str);
                return;
            }
        }
        LinearLayout bottomLayout = OooOO0o().f44839OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bottomLayout, "bottomLayout");
        o000O.OooOOOO(bottomLayout);
        OooOO0o().f44840OooO0OO.setBackground(o0000.OooO0O0(o0Oo0oo.bgs_button_aae6e2_r360));
        Lazy lazy = this.f53413OooOoO0;
        if (((Number) lazy.getValue()).longValue() > 0) {
            if (this.f53412OooOoO == null) {
                o0OO00OO o0oo00oo2 = new o0OO00OO(this, ((Number) lazy.getValue()).longValue());
                this.f53412OooOoO = o0oo00oo2;
                o0oo00oo2.start();
                return;
            }
            return;
        }
        o0OO00OO o0oo00oo3 = this.f53412OooOoO;
        if (o0oo00oo3 != null) {
            o0oo00oo3.cancel();
        }
        LinearLayout bottomLayout2 = OooOO0o().f44839OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bottomLayout2, "bottomLayout");
        o000O.OooO0O0(bottomLayout2);
        TextView textView2 = OooOO0o().f44840OooO0OO;
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(o0000.OooO0OO(o000000.member_convene_no_select), Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        textView2.setText(str2);
    }

    public final void OooOOoo() {
        OooOO0o().f44845OooO0oo.setEmptyText(o0000.OooO0OO(o000000.no_members_to_call));
        this.f53405OooOOo0 = "";
        if (this.f53410OooOo0O) {
            TextView memberCount = OooOO0o().f44841OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(memberCount, "memberCount");
            o000O.OooOOOO(memberCount);
        } else {
            TextView memberCount2 = OooOO0o().f44841OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(memberCount2, "memberCount");
            o000O.OooO0O0(memberCount2);
        }
        OooOO0O().OooOoO0(this.f53404OooOOo);
        if (OooOO0O().f13189OooOOoo.isEmpty()) {
            OooOO0o().f44845OooO0oo.OooO0o0();
        } else {
            OooOO0o().f44845OooO0oo.OooO0Oo();
        }
    }
}
