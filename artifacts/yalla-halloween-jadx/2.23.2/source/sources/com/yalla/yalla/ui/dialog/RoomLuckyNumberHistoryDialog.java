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
import androidx.media3.session.o0000O;
import androidx.media3.session.o000OO;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.code.android.util.o0000;
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
import p205o00o0o0o.o0000OO0;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.o0OoO00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLuckyNumberHistoryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyNumberHistoryDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberHistoryDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,158:1\n75#2,13:159\n*S KotlinDebug\n*F\n+ 1 RoomLuckyNumberHistoryDialog.kt\ncom/yalla/yalla/ui/dialog/RoomLuckyNumberHistoryDialog\n*L\n45#1:159,13\n*E\n"})
public final class RoomLuckyNumberHistoryDialog extends o0000OO0<RoomLuckyNumberHistoryDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27468OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27469OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f27470OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f27471OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f27472OooOO0O;

    public static final class OooO extends Lambda implements Function0<List<RoomLuckyNumberHistoryModel>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f27473OooO0Oo = new OooO();

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
            o000O o000o = new o000O(RoomLuckyNumberHistoryDialog.this.f27469OooO0oO);
            o000o.OooOo00(o0000.OooO0OO(o000000.room_lucky_number_history_tips_message));
            o000o.OooOo0(new OooOOOO(o000o));
            o000o.OooOO0o();
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
            roomLuckyNumberHistoryDialog.OooOOO0().f44657OooO0o.OooO0oo();
            roomLuckyNumberHistoryDialog.OooOOO(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<OooOo00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f27477OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOo00 invoke() {
            return new OooOo00(App.f22232OooO0o, oo0o0Oo.room_lucky_number_history_item);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o0OoO00O> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OoO00O invoke() {
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = RoomLuckyNumberHistoryDialog.this;
            o0OoO00O o0ooo00oInflate = o0OoO00O.inflate(LayoutInflater.from(roomLuckyNumberHistoryDialog.f38487OooO00o), roomLuckyNumberHistoryDialog.f38489OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(o0ooo00oInflate, "inflate(...)");
            return o0ooo00oInflate;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f27479OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomLuckyNumberHistoryDialog f27480OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog, boolean z) {
            super(1);
            this.f27479OooO0Oo = z;
            this.f27480OooO0o0 = roomLuckyNumberHistoryDialog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> roomMemberListModel) {
            List<RoomLuckyNumberHistoryModel> list;
            RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> roomMemberListModel2 = roomMemberListModel;
            boolean z = this.f27479OooO0Oo;
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = this.f27480OooO0o0;
            if (z) {
                ((List) roomLuckyNumberHistoryDialog.f27471OooOO0.getValue()).clear();
            }
            if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null) {
                p423o0OoO0OO.o0000OO0.OooO00o((List) roomLuckyNumberHistoryDialog.f27471OooOO0.getValue(), list, OooOo.f27396OooO0Oo);
            }
            ((o0000oo) roomLuckyNumberHistoryDialog.f27472OooOO0O.getValue()).OooOoO0((List) roomLuckyNumberHistoryDialog.f27471OooOO0.getValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27482OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(boolean z) {
            super(1);
            this.f27482OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog = RoomLuckyNumberHistoryDialog.this;
            XRefreshLayout xRefreshLayout = roomLuckyNumberHistoryDialog.OooOOO0().f44658OooO0o0;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> data = it.getData();
            List<RoomLuckyNumberHistoryModel> list = data != null ? data.data : null;
            xRefreshLayout.OooOooo(this.f27482OooO0o0, zIsSuccess, list == null || list.isEmpty());
            if (((o0000oo) roomLuckyNumberHistoryDialog.f27472OooOO0O.getValue()).f13189OooOOoo.isEmpty()) {
                roomLuckyNumberHistoryDialog.OooOOO0().f44657OooO0o.OooO0o0();
            } else {
                roomLuckyNumberHistoryDialog.OooOOO0().f44657OooO0o.OooO0Oo();
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
            if (((o0000oo) roomLuckyNumberHistoryDialog.f27472OooOO0O.getValue()).f13189OooOOoo.isEmpty()) {
                roomLuckyNumberHistoryDialog.OooOOO0().f44657OooO0o.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomLuckyNumberHistoryDialog(@NotNull final FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27469OooO0oO = activity;
        this.f27470OooO0oo = LazyKt.lazy(new OooOO0());
        this.f27468OooO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RoomLuckyNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog$special$$inlined$viewModels$default$2
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
            public final /* synthetic */ Function0 f27486OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27486OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f27471OooOO0 = LazyKt.lazy(OooO.f27473OooO0Oo);
        Lazy lazy = LazyKt.lazy(OooO0o.f27477OooO0Oo);
        this.f27472OooOO0O = lazy;
        ConstraintLayout constraintLayout = OooOOO0().f44653OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setGravity(80);
        }
        Window window = this.f38488OooO0O0.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        ImageView close = OooOOO0().f44654OooO0O0;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        com.code.android.util.o000O.OooO0oo(close, new OooO00o());
        ImageView doubt = OooOOO0().f44655OooO0OO;
        Intrinsics.checkNotNullExpressionValue(doubt, "doubt");
        com.code.android.util.o000O.OooO0oo(doubt, new OooO0O0());
        OooOOO0().f44657OooO0o.OooO0oo();
        OooOOO0().f44657OooO0o.setEmptyImage(o0Oo0oo.ic_empty_transparent);
        StateLayout stateLayout = OooOOO0().f44657OooO0o;
        String text = o0000.OooO0OO(o000000.room_lucky_number_history_no_data);
        int iOooO00o = o0000.OooO00o(o0OOO0o.color_white_25);
        stateLayout.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        stateLayout.f30146OooOO0o = text;
        stateLayout.f30148OooOOO0 = iOooO00o;
        OooOOO0().f44658OooO0o0.f30717o00000OO = new o000OO(this, 2);
        OooOOO0().f44658OooO0o0.f30718o00000Oo = new o0000O(this, 1);
        OooOOO0().f44658OooO0o0.f30719o00000o0.setNoMoreText(o000000.room_lucky_number_history_bottom);
        OooOOO0().f44658OooO0o0.f30719o00000o0.setNoMoreTextColor(o0000.OooO00o(o0OOO0o.color_white_40));
        StateLayout stateLayout2 = OooOOO0().f44657OooO0o;
        Intrinsics.checkNotNullExpressionValue(stateLayout2, "stateLayout");
        StateLayout.OooOO0(stateLayout2, 0, new OooO0OO(), 3);
        OooOOO0().f44656OooO0Oo.setLayoutManager(new LinearLayoutManager(this.f38487OooO00o));
        OooOOO0().f44656OooO0Oo.setAdapter((o0000oo) lazy.getValue());
    }

    @Override // p185o00o00Oo.o0000oo
    public final void OooOO0o() {
        OooOOO(true);
        o0oo0000.OooO00o.OooO0O0("302011");
        super.OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(boolean z) {
        Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
        if (value != null) {
            ((RoomLuckyNumberVM) this.f27468OooO.getValue()).luckyNumberRecord(value.longValue(), z).observe(this.f27469OooO0oO, new p384o0OOoo0O.o000oOoO(new OooOO0O(this, z), new OooOOO0(), new OooOOO(z), false, 8));
        }
    }

    public final o0OoO00O OooOOO0() {
        return (o0OoO00O) this.f27470OooO0oo.getValue();
    }
}
