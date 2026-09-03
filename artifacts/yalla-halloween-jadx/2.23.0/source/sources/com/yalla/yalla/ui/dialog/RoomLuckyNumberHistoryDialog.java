package com.yalla.yalla.ui.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomLuckyNumberHistoryModel;
import com.yalla.yalla.model.room.RoomMemberListModel;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.RoomLuckyNumberVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000OO0;
import p417o0OoO0.oo000o;
import p485o0o00O0.oOO0OO;
import p485o0o00O0.oOO0OO0O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.r1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLuckyNumberHistoryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyNumberHistoryDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberHistoryDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,158:1\n75#2,13:159\n*S KotlinDebug\n*F\n+ 1 RoomLuckyNumberHistoryDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberHistoryDialog\n*L\n45#1:159,13\n*E\n"})
public final class RoomLuckyNumberHistoryDialog extends p157o00OoOO0.Oooo0<RoomLuckyNumberHistoryDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27931OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27932OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f27933OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f27934OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f27935OooOO0O;

    public static final class OooO extends Lambda implements Function0<List<RoomLuckyNumberHistoryModel>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f27936OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<RoomLuckyNumberHistoryModel> invoke() {
            return new ArrayList();
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            RoomLuckyNumberHistoryDialog.this.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0OO00O o0oo00o2 = new o0OO00O(RoomLuckyNumberHistoryDialog.this.f27932OooO0oO);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.room_lucky_number_history_tips_message));
            o0oo00o2.OooOo0(new OooOo00(o0oo00o2));
            o0oo00o2.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = RoomLuckyNumberHistoryDialog.this;
            roomLuckyNumberHistoryDialog.OooOOO0().f58711OooO0o.OooO0oo();
            roomLuckyNumberHistoryDialog.OooOOO(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<OooOo> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f27940OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOo invoke() {
            return new OooOo(App.f22702OooO0o, oO00OO0O.room_lucky_number_history_item);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<r1> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r1 invoke() {
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = RoomLuckyNumberHistoryDialog.this;
            r1 r1VarInflate = r1.inflate(LayoutInflater.from(roomLuckyNumberHistoryDialog.f10133OooO00o), roomLuckyNumberHistoryDialog.f10135OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(r1VarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            return r1VarInflate;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f27942OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomLuckyNumberHistoryDialog f27943OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog, boolean z) {
            super(1);
            this.f27942OooO0Oo = z;
            this.f27943OooO0o0 = roomLuckyNumberHistoryDialog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> roomMemberListModel) {
            List<RoomLuckyNumberHistoryModel> list;
            RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> roomMemberListModel2 = roomMemberListModel;
            boolean z = this.f27942OooO0Oo;
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = this.f27943OooO0o0;
            if (z) {
                ((List) roomLuckyNumberHistoryDialog.f27934OooOO0.getValue()).clear();
            }
            if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null) {
                oo000o.OooO00o((List) roomLuckyNumberHistoryDialog.f27934OooOO0.getValue(), list, Oooo000.f27861OooO0Oo);
            }
            ((o000O) roomLuckyNumberHistoryDialog.f27935OooOO0O.getValue()).OooOoO0((List) roomLuckyNumberHistoryDialog.f27934OooOO0.getValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27945OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(boolean z) {
            super(1);
            this.f27945OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = RoomLuckyNumberHistoryDialog.this;
            XRefreshLayout xRefreshLayout = roomLuckyNumberHistoryDialog.OooOOO0().f58712OooO0o0;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> data = it.getData();
            List<RoomLuckyNumberHistoryModel> list = data != null ? data.data : null;
            xRefreshLayout.OooOooo(this.f27945OooO0o0, zIsSuccess, list == null || list.isEmpty());
            if (((o000O) roomLuckyNumberHistoryDialog.f27935OooOO0O.getValue()).f10111OooOOoo.isEmpty()) {
                roomLuckyNumberHistoryDialog.OooOOO0().f58711OooO0o.OooO0o0();
            } else {
                roomLuckyNumberHistoryDialog.OooOOO0().f58711OooO0o.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = RoomLuckyNumberHistoryDialog.this;
            if (((o000O) roomLuckyNumberHistoryDialog.f27935OooOO0O.getValue()).f10111OooOOoo.isEmpty()) {
                roomLuckyNumberHistoryDialog.OooOOO0().f58711OooO0o.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomLuckyNumberHistoryDialog(@NotNull final FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27932OooO0oO = activity;
        this.f27933OooO0oo = LazyKt.lazy(new OooOO0());
        this.f27931OooO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RoomLuckyNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27949OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27949OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f27934OooOO0 = LazyKt.lazy(OooO.f27936OooO0Oo);
        Lazy lazy = LazyKt.lazy(OooO0o.f27940OooO0Oo);
        this.f27935OooOO0O = lazy;
        ConstraintLayout constraintLayout = OooOOO0().f58707OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setGravity(80);
        }
        Window window = this.f10134OooO0O0.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        ImageView imageView = OooOOO0().f58708OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o000OO00.OooO0oo(imageView, new OooO00o());
        ImageView imageView2 = OooOOO0().f58709OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.doubt");
        o000OO00.OooO0oo(imageView2, new OooO0O0());
        OooOOO0().f58711OooO0o.OooO0oo();
        OooOOO0().f58711OooO0o.setEmptyImage(oOo00OO0.ic_empty_transparent);
        StateLayout stateLayout = OooOOO0().f58711OooO0o;
        String text = o0000.OooO0OO(oO00OOo0.room_lucky_number_history_no_data);
        int iOooO00o = o0000.OooO00o(oO00O0o.color_white_25);
        stateLayout.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        stateLayout.f30691OooOO0o = text;
        stateLayout.f30693OooOOO0 = iOooO00o;
        OooOOO0().f58712OooO0o0.f31258o00000OO = new oOO0OO0O(this);
        OooOOO0().f58712OooO0o0.f31259o00000Oo = new oOO0OO(this);
        OooOOO0().f58712OooO0o0.f31260o00000o0.setNoMoreText(oO00OOo0.room_lucky_number_history_bottom);
        OooOOO0().f58712OooO0o0.f31260o00000o0.setNoMoreTextColor(o0000.OooO00o(oO00O0o.color_white_40));
        StateLayout stateLayout2 = OooOOO0().f58711OooO0o;
        Intrinsics.checkNotNullExpressionValue(stateLayout2, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout2, 0, new OooO0OO(), 3);
        OooOOO0().f58710OooO0Oo.setLayoutManager(new LinearLayoutManager(this.f10133OooO00o));
        OooOOO0().f58710OooO0Oo.setAdapter((o000O) lazy.getValue());
    }

    @Override // com.code.android.easydialog.OooO
    public final void OooOO0o() {
        OooOOO(true);
        o0OO000.OooO00o("302011");
        super.OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(boolean z) {
        Long value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
        if (value != null) {
            ((RoomLuckyNumberVM) this.f27931OooO.getValue()).luckyNumberRecord(value.longValue(), z).observe(this.f27932OooO0oO, new o0000OO0(new OooOO0O(this, z), new OooOOO0(), new OooOOO(z), false, 8));
        }
    }

    public final r1 OooOOO0() {
        return (r1) this.f27933OooO0oo.getValue();
    }
}
