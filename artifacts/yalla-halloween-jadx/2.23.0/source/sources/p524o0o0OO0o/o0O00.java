package p524o0o0OO0o;

import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.facebook.AuthenticationTokenClaims;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ext.KeyboardExtKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p417o0OoO0.o000O0o;
import p417o0OoO0.oo000o;
import p464o0Oooo.o000000O;
import p475o0o000.o0OO00O;
import p519o0o0O0oO.o00O00OO;
import p519o0o0O0oO.oOO0OOO;
import p562o0oOo0O.o000oOoO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.ac;
import p641o0ooOOOO.k5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberConveneListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberConveneListDialog.kt\ncom/yalla/yalla/ui/fragment/room/RoomMemberConveneListDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,568:1\n75#2,13:569\n1855#3,2:582\n1864#3,3:584\n1855#3,2:587\n*S KotlinDebug\n*F\n+ 1 RoomMemberConveneListDialog.kt\ncom/yalla/yalla/ui/fragment/room/RoomMemberConveneListDialog\n*L\n58#1:569,13\n346#1:582,2\n496#1:584,3\n507#1:587,2\n*E\n"})
public final class o0O00 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f53464OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f53465OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f53466OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f53467OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f53468OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53469OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53470OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f53471OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f53472OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f53473OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public CheckConveneMemberStatusModel f53474OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f53475OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f53476OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f53477OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public o0oOo0O0 f53478OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f53479OooOoO0;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f53480OooO0Oo;

        public OooO(o0O00oO0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53480OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f53480OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f53480OooO0Oo;
        }

        public final int hashCode() {
            return this.f53480OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53480OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@NotNull MixedRoomActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            CheckConveneMemberStatusModel value = com.yalla.yalla.service.room.OooO00o.f24980OooO0oo.f47469OooO0OO.getValue();
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
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_member_convene_finish_toast);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                        return;
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        return;
                    }
                }
                if (!value.getCanConvene()) {
                    if (value.getLastConveneTime().length() > 0) {
                        value.isEndTime(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    }
                } else if (!value.getHasMember()) {
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.no_members_to_call_toast);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                        return;
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        return;
                    }
                }
                o0O00 o0o01 = new o0O00(activity);
                o0o01.OooO00o(new o0O000o0(o0o01));
                o0OO000.OooO00o("202022");
                o0o01.OooO();
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RoomMemberConveneListModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f53481OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O00 f53482OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00 o0o01, boolean z) {
            super(1);
            this.f53481OooO0Oo = z;
            this.f53482OooO0o0 = o0o01;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberConveneListModel roomMemberConveneListModel) {
            List<RoomUserInfoDTO> data;
            List<RoomUserInfoModel> listTransformToModel;
            RoomMemberConveneListModel roomMemberConveneListModel2 = roomMemberConveneListModel;
            boolean z = this.f53481OooO0Oo;
            o0O00 o0o01 = this.f53482OooO0o0;
            if (z) {
                o0o01.f53470OooOOo.clear();
                o0o01.f53475OooOo00.clear();
            }
            if (roomMemberConveneListModel2 != null && (data = roomMemberConveneListModel2.getData()) != null && (listTransformToModel = NewRoomUserInfoTransformutilsKt.transformToModel(data)) != null) {
                oo000o.OooO00o(o0o01.f53470OooOOo, listTransformToModel, new o0O0o000(o0o01));
                o0o01.OooOOo(o0OoOo0.OooO0o0(0, Integer.valueOf(roomMemberConveneListModel2.getDatacount())));
            }
            o0o01.OooOOOO(o0o01.f53470OooOOo);
            o0o01.OooOO0O().OooOoO0(o0o01.f53470OooOOo);
            if (o0o01.OooOO0O().f10111OooOOoo.isEmpty()) {
                SearchLayout searchLayout = o0o01.OooOO0o().f58263OooO0oO;
                Intrinsics.checkNotNullExpressionValue(searchLayout, "binding.searchView");
                o000OO00.OooO0O0(searchLayout);
                o0o01.OooOO0o().f58264OooO0oo.OooO0o0();
            } else {
                if (o0o01.f53476OooOo0O) {
                    SearchLayout searchLayout2 = o0o01.OooOO0o().f58263OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(searchLayout2, "binding.searchView");
                    o000OO00.OooO0O0(searchLayout2);
                } else {
                    SearchLayout searchLayout3 = o0o01.OooOO0o().f58263OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(searchLayout3, "binding.searchView");
                    o000OO00.OooOOOO(searchLayout3);
                }
                o0o01.OooOO0o().f58264OooO0oo.OooO0Oo();
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
            o0O00 o0o01 = o0O00.this;
            if (o0o01.OooOO0O().f10111OooOOoo.isEmpty()) {
                o0o01.OooOO0o().f58264OooO0oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<RoomMemberConveneListModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f53485OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f53485OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberConveneListModel> apiResult) {
            ApiResult<RoomMemberConveneListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomMemberConveneListModel data = it.getData();
            boolean zOooO00o = o0OoOo0.OooO00o(data != null ? Boolean.valueOf(data.getHasNext()) : null);
            o0O00 o0o01 = o0O00.this;
            boolean z = o0o01.f53476OooOo0O;
            boolean z2 = this.f53485OooO0o0;
            if (z) {
                XRefreshLayout xRefreshLayout = o0o01.OooOO0o().f58261OooO0o;
                boolean zIsSuccess = it.isSuccess();
                RoomMemberConveneListModel data2 = it.getData();
                List<RoomUserInfoDTO> data3 = data2 != null ? data2.getData() : null;
                xRefreshLayout.OooOooo(z2, zIsSuccess, data3 == null || data3.isEmpty());
            } else {
                o0o01.OooOO0o().f58261OooO0o.OooOooo(z2, it.isSuccess(), zOooO00o);
            }
            if (zOooO00o) {
                o0o01.OooOOO(false);
            }
            o0o01.OooOOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<RoomMemberListModel<List<RoomUserInfoDTO>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f53486OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O00 f53487OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0O00 o0o01, boolean z) {
            super(1);
            this.f53486OooO0Oo = z;
            this.f53487OooO0o0 = o0o01;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomUserInfoDTO>> roomMemberListModel) {
            List<RoomUserInfoDTO> list;
            List<RoomUserInfoModel> listTransformToModel;
            RoomMemberListModel<List<RoomUserInfoDTO>> roomMemberListModel2 = roomMemberListModel;
            boolean z = this.f53486OooO0Oo;
            o0O00 o0o01 = this.f53487OooO0o0;
            if (z) {
                o0o01.f53469OooOOOo.clear();
            }
            if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null && (listTransformToModel = NewRoomUserInfoTransformutilsKt.transformToModel(list)) != null) {
                oo000o.OooO00o(o0o01.f53469OooOOOo, listTransformToModel, o0O0o0.f53508OooO0Oo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f53489OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(1);
            this.f53489OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            o0O00 o0o01 = o0O00.this;
            XRefreshLayout xRefreshLayout = o0o01.OooOO0o().f58261OooO0o;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomUserInfoDTO>> data = it.getData();
            List<RoomUserInfoDTO> list = data != null ? data.data : null;
            xRefreshLayout.OooOooo(this.f53489OooO0o0, zIsSuccess, list == null || list.isEmpty());
            o0O00.OooOO0(o0o01);
            o0o01.OooOOo0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(@NotNull final MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f53464OooOO0O = activity;
        this.f53465OooOO0o = LazyKt.lazy(new o0O00OO(this));
        this.f53467OooOOO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RoomMemberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomMemberConveneListDialog$special$$inlined$viewModels$default$2
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
            public final /* synthetic */ Function0 f29045OooO0Oo = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f29045OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f53466OooOOO = -1L;
        this.f53468OooOOOO = new LinkedHashMap();
        this.f53469OooOOOo = new ArrayList();
        this.f53471OooOOo0 = "";
        this.f53470OooOOo = new ArrayList();
        this.f53472OooOOoo = LazyKt.lazy(new o0O00O(this));
        this.f53475OooOo00 = new LinkedHashMap();
        o0OO00O o0oo00o2 = com.yalla.yalla.service.room.OooO00o.f24980OooO0oo;
        CheckConveneMemberStatusModel value = o0oo00o2.f47469OooO0OO.getValue();
        this.f53474OooOo0 = value;
        this.f53476OooOo0O = !(value != null && value.getState() == 0);
        this.f53477OooOo0o = LazyKt.lazy(new o0O0o00O(this));
        this.f53473OooOo = LazyKt.lazy(new o0oO0Ooo(this));
        this.f53479OooOoO0 = LazyKt.lazy(new o0O00o00(this));
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setSoftInputMode(35);
        }
        LinearLayout linearLayout = OooOO0o().f58257OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        Window window2 = this.f52535OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        Long value2 = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
        long jLongValue = value2 != null ? value2.longValue() : -1L;
        this.f53466OooOOO = jLongValue;
        if (jLongValue < 0) {
            OooO0O0();
        }
        DialogTitleView it = OooOO0o().f58256OooO;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DialogTitleView.OooO0OO(it, o0000.OooO0OO(oO00OOo0.room_member_convene));
        it.OooO0O0(o0000.OooO0O0(oOo00OO0.ic_room_member_convene_close), new o0O0OOO0(this));
        it.OooO00o(o0000.OooO0O0(oOo00OO0.ic_room_member_convene_info), new o0O0OOOo(this));
        OooOOo(0);
        OooOO0o().f58264OooO0oo.OooO0oo();
        OooOO0o().f58261OooO0o.f31258o00000OO = new o000oOoO() { // from class: o0o0OO0o.o0O000O
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                o0O00 this$0 = this.f53492OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!StringsKt.isBlank(this$0.f53471OooOOo0)) {
                    this$0.OooOOOo(this$0.f53471OooOOo0, true);
                } else {
                    this$0.OooOOO(true);
                }
            }
        };
        OooOO0o().f58261OooO0o.f31259o00000Oo = new oOO0OOO(this);
        StateLayout stateLayout = OooOO0o().f58264OooO0oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new oo0OOoo(this), 3);
        OooOO0o().f58262OooO0o0.setLayoutManager(new LinearLayoutManager(activity));
        OooOO0o().f58262OooO0o0.setAdapter(OooOO0O());
        OooOO0o().f58259OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o0OO0o.o0OoOoOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0O00 this$0 = this.f53516OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("102207");
                boolean z = true;
                if (this$0.f53476OooOo0O) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_member_convene_send_success);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                        return;
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        return;
                    }
                }
                if (!this$0.f53468OooOOOO.isEmpty()) {
                    p157o00OoOO0.o0OO00O o0oo00o3 = new p157o00OoOO0.o0OO00O(this$0.f53464OooOO0O);
                    o0oo00o3.OooOoO(o0000.OooO0OO(oO00OOo0.room_member_convene_dialog_title));
                    o0oo00o3.OooOOoo(oO00OOo0.room_member_convene_dialog_content);
                    o0oo00o3.OooOo0(new o0O0oo00(this$0));
                    o0oo00o3.OooOo(true);
                    o0oo00o3.OooOO0o();
                    return;
                }
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.please_select_the_members_to_convene_first);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
        });
        OooOO0o().f58261OooO0o.setOnTouchDownListener(new XRefreshLayout.OooO0OO() { // from class: o0o0OO0o.o0O000Oo
            @Override // com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout.OooO0OO
            public final void OooO00o() {
                o0O00 this$0 = this.f53493OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ac acVar = this$0.OooOO0o().f58263OooO0oO.binding;
                KeyboardExtKt.OooO00o(acVar.f57529OooO0Oo);
                acVar.f57529OooO0Oo.clearFocus();
            }
        });
        OooOOo0();
        SearchLayout searchLayout = OooOO0o().f58263OooO0oO;
        searchLayout.setEditStateListener(new o0oO0O0o(this));
        searchLayout.setClearListener(new o0O0oo0o(this));
        searchLayout.setCancelListener(new o0O0O0Oo(this));
        searchLayout.setEditDelayListener(new o0O0O0o0(this));
        searchLayout.setEditorActionListener(new o0O0OO0(this));
        OooOOO(true);
        o0oo00o2.f47469OooO0OO.observe(activity, new OooO(new o0O00oO0(this)));
        LiveEventBus.get("ROOM_IN_OR_OUT", InOutRoomModel.class).observe(activity, new o0O0O0O(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOO0(o0O00 o0o01) {
        o0o01.OooOO0o().f58264OooO0oo.setEmptyText(o0000.OooO0OO(oO00OOo0.no_data));
        TextView textView = o0o01.OooOO0o().f58260OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.memberCount");
        o000OO00.OooO0O0(textView);
        ArrayList arrayList = o0o01.f53469OooOOOo;
        int i = -1;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            long jLongValue = ((RoomUserInfoModel) obj).getUserId().getValue().longValue();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && jLongValue == l.longValue()) {
                i = i2;
            }
            i2 = i3;
        }
        if (i > 0 && i < arrayList.size()) {
            arrayList.remove(i);
        }
        o0o01.OooOOOO(arrayList);
        o0o01.OooOO0O().OooOoO0(arrayList);
        if (o0o01.OooOO0O().f10111OooOOoo.isEmpty()) {
            o0o01.OooOO0o().f58264OooO0oo.OooO0o0();
        } else {
            o0o01.OooOO0o().f58264OooO0oo.OooO0Oo();
        }
    }

    public final o000O<RoomUserInfoModel> OooOO0O() {
        return (o000O) this.f53472OooOOoo.getValue();
    }

    public final k5 OooOO0o() {
        return (k5) this.f53465OooOO0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(boolean z) {
        this.f53471OooOOo0 = "";
        OooOO0o().f58264OooO0oo.setEmptyText(o0000.OooO0OO(oO00OOo0.no_members_to_call));
        OooOO0o().f58261OooO0o.OooOooo(z, true, false);
        ((RoomMemberVM) this.f53467OooOOO0.getValue()).getMemberList(this.f53466OooOOO, this.f53476OooOo0O, z).observe(this.f53464OooOO0O, new o0000OO0(new OooO0O0(this, z), new OooO0OO(), new OooO0o(z), false, 8));
    }

    public final int OooOOO0() {
        return ((Number) this.f53477OooOo0o.getValue()).intValue();
    }

    public final void OooOOOO(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) it.next();
            roomUserInfoModel.isSelected().setValue(Boolean.valueOf(this.f53468OooOOOO.containsKey(roomUserInfoModel.getUserId().getValue())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOOo(String str, boolean z) {
        this.f53471OooOOo0 = str;
        if (StringsKt.isBlank(str) && z) {
            this.f53469OooOOOo.clear();
            OooOOoo();
            return;
        }
        OooOO0o().f58264OooO0oo.setEmptyText(o0000.OooO0OO(oO00OOo0.no_data));
        if (z) {
            OooOO0o().f58264OooO0oo.OooO0oo();
        }
        OooOO0o().f58261OooO0o.OooOooo(z, true, false);
        ((RoomMemberVM) this.f53467OooOOO0.getValue()).getSingleBarSearch(this.f53466OooOOO, str, this.f53476OooOo0O, z).observe(this.f53464OooOO0O, new o0000OO0(new OooOO0(this, z), null, new OooOO0O(z), false, 10));
    }

    public final void OooOOo(int i) {
        if (!this.f53476OooOo0O) {
            OooOO0o().f58260OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.room_member_convene_title) + i);
            TextView textView = OooOO0o().f58260OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.memberCount");
            o000OO00.OooO0O0(textView);
            return;
        }
        String strValueOf = String.valueOf(this.f53475OooOo00.size());
        OooOO0o().f58260OooO0Oo.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_member_convene_gathered), strValueOf, String.valueOf(this.f53470OooOOo.size())));
        TextView textView2 = OooOO0o().f58260OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.memberCount");
        o000OO00.OooOOOO(textView2);
        TextView textView3 = OooOO0o().f58260OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.memberCount");
        o000O0o.OooO0Oo(textView3, o0000.OooO00o(oO00O0o.color_00d8c9), strValueOf);
    }

    public final void OooOOo0() {
        if (!this.f53476OooOo0O) {
            LinkedHashMap linkedHashMap = this.f53468OooOOOO;
            if (!linkedHashMap.isEmpty()) {
                OooOO0o().f58259OooO0OO.setBackground(o0000.OooO0O0(oOo00OO0.bgs_button_green_r360));
                OooOO0o().f58259OooO0OO.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.member_convene_select_xxx1_xxx2), String.valueOf(linkedHashMap.size()), String.valueOf(OooOOO0())));
                return;
            } else {
                OooOO0o().f58259OooO0OO.setBackground(o0000.OooO0O0(oOo00OO0.bgs_button_aae6e2_r360));
                TextView textView = OooOO0o().f58259OooO0OO;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(o0000.OooO0OO(oO00OOo0.member_convene_no_select), Arrays.copyOf(new Object[0], 0));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                textView.setText(str);
                return;
            }
        }
        LinearLayout linearLayout = OooOO0o().f58258OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.bottomLayout");
        o000OO00.OooOOOO(linearLayout);
        OooOO0o().f58259OooO0OO.setBackground(o0000.OooO0O0(oOo00OO0.bgs_button_aae6e2_r360));
        Lazy lazy = this.f53479OooOoO0;
        if (((Number) lazy.getValue()).longValue() > 0) {
            if (this.f53478OooOoO == null) {
                o0oOo0O0 o0ooo0o1 = new o0oOo0O0(this, ((Number) lazy.getValue()).longValue());
                this.f53478OooOoO = o0ooo0o1;
                o0ooo0o1.start();
                return;
            }
            return;
        }
        o0oOo0O0 o0ooo0o2 = this.f53478OooOoO;
        if (o0ooo0o2 != null) {
            o0ooo0o2.cancel();
        }
        LinearLayout linearLayout2 = OooOO0o().f58258OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.bottomLayout");
        o000OO00.OooO0O0(linearLayout2);
        TextView textView2 = OooOO0o().f58259OooO0OO;
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(o0000.OooO0OO(oO00OOo0.member_convene_no_select), Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        textView2.setText(str2);
    }

    public final void OooOOoo() {
        OooOO0o().f58264OooO0oo.setEmptyText(o0000.OooO0OO(oO00OOo0.no_members_to_call));
        this.f53471OooOOo0 = "";
        if (this.f53476OooOo0O) {
            TextView textView = OooOO0o().f58260OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.memberCount");
            o000OO00.OooOOOO(textView);
        } else {
            TextView textView2 = OooOO0o().f58260OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.memberCount");
            o000OO00.OooO0O0(textView2);
        }
        OooOO0O().OooOoO0(this.f53470OooOOo);
        if (OooOO0O().f10111OooOOoo.isEmpty()) {
            OooOO0o().f58264OooO0oo.OooO0o0();
        } else {
            OooOO0o().f58264OooO0oo.OooO0Oo();
        }
    }
}
