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
import com.app.base.application.App;
import com.app.base.model.RoomMemberListModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.vm.RoomLuckyNumberVM;
import com.yalla.yalla.model.RoomLuckyNumberHistoryModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.o00O00OO;
import p255o00ooO0o.oo0oOO0;
import p295o0O0OoO.o00Ooo;
import p522o0o0O0o.o000O0;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.c8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class RoomLuckyNumberHistoryDialog extends o00O00OO<RoomLuckyNumberHistoryDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23755OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f23756OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f23757OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f23758OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f23759OooOO0O;

    public static final class OooO extends Lambda implements Function0<List<RoomLuckyNumberHistoryModel>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f23760Oooo0o = new OooO();

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
            RoomLuckyNumberHistoryDialog.this.OooO0Oo();
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
            oo0oOO0 oo0ooo0 = new oo0oOO0(RoomLuckyNumberHistoryDialog.this.f23756OooO0oO);
            oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.room_lucky_number_history_tips_message));
            oo0ooo0.OooOo0o(new com.yalla.yalla.ui.dialog.OooO0OO(oo0ooo0));
            oo0ooo0.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomLuckyNumberHistoryDialog.this.OooOOOo().f49082OooO0o.OooO0oo();
            RoomLuckyNumberHistoryDialog.this.OooOOo0(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<com.yalla.yalla.ui.dialog.OooO0o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f23764Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.dialog.OooO0o invoke() {
            return new com.yalla.yalla.ui.dialog.OooO0o(App.f11458Oooo0oO);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<c8> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c8 invoke() {
            c8 c8VarInflate = c8.inflate(LayoutInflater.from(RoomLuckyNumberHistoryDialog.this.f34199OooO00o), RoomLuckyNumberHistoryDialog.this.f34201OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(c8VarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            return c8VarInflate;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f23766Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomLuckyNumberHistoryDialog f23767Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z, RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog) {
            super(1);
            this.f23766Oooo0o = z;
            this.f23767Oooo0oO = roomLuckyNumberHistoryDialog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> roomMemberListModel) {
            List<RoomLuckyNumberHistoryModel> list;
            RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> roomMemberListModel2 = roomMemberListModel;
            if (this.f23766Oooo0o) {
                RoomLuckyNumberHistoryDialog.OooOOOO(this.f23767Oooo0oO).clear();
            }
            if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null) {
                o000O0.OooO00o(RoomLuckyNumberHistoryDialog.OooOOOO(this.f23767Oooo0oO), list, com.yalla.yalla.ui.dialog.OooO.f23740Oooo0o);
            }
            RoomLuckyNumberHistoryDialog.OooOOO(this.f23767Oooo0oO).setNewData(RoomLuckyNumberHistoryDialog.OooOOOO(this.f23767Oooo0oO));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23769Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(boolean z) {
            super(1);
            this.f23769Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            XRefreshLayout xRefreshLayout = RoomLuckyNumberHistoryDialog.this.OooOOOo().f49083OooO0o0;
            boolean z = this.f23769Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomLuckyNumberHistoryModel>> data = it.getData();
            List<RoomLuckyNumberHistoryModel> list = data != null ? data.data : null;
            xRefreshLayout.Oooo0o0(z, zIsSuccess, list == null || list.isEmpty());
            if (RoomLuckyNumberHistoryDialog.OooOOO(RoomLuckyNumberHistoryDialog.this).getData().isEmpty()) {
                RoomLuckyNumberHistoryDialog.this.OooOOOo().f49082OooO0o.OooO0o0();
            } else {
                RoomLuckyNumberHistoryDialog.this.OooOOOo().f49082OooO0o.OooO0Oo();
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
            if (RoomLuckyNumberHistoryDialog.OooOOO(RoomLuckyNumberHistoryDialog.this).getData().isEmpty()) {
                RoomLuckyNumberHistoryDialog.this.OooOOOo().f49082OooO0o.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomLuckyNumberHistoryDialog(@NotNull final FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23756OooO0oO = activity;
        this.f23757OooO0oo = LazyKt.lazy(new OooOO0());
        this.f23755OooO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(RoomLuckyNumberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog$special$$inlined$viewModels$default$2
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

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23773Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f23773Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f23758OooOO0 = LazyKt.lazy(OooO.f23760Oooo0o);
        Lazy lazy = LazyKt.lazy(OooO0o.f23764Oooo0o);
        this.f23759OooOO0O = lazy;
        ConstraintLayout constraintLayout = OooOOOo().f49078OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oo(constraintLayout);
        Window windowOooO0o0 = OooO0o0();
        if (windowOooO0o0 != null) {
            windowOooO0o0.setGravity(80);
        }
        Window window = this.f34200OooO0O0.getWindow();
        if (window != null) {
            window.setDimAmount(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        ImageView imageView = OooOOOo().f49079OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o00O0O.OooO0Oo(imageView, new OooO00o());
        ImageView imageView2 = OooOOOo().f49080OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.doubt");
        o00O0O.OooO0Oo(imageView2, new OooO0O0());
        OooOOOo().f49082OooO0o.OooO0oo();
        OooOOOo().f49082OooO0o.setEmptyImage(R.drawable.ic_empty_transparent);
        StateLayout stateLayout = OooOOOo().f49082OooO0o;
        String text = o000O0O0.OooO0OO(R.string.room_lucky_number_history_no_data);
        int iOooO00o = o000O0O0.OooO00o(R.color.color_white_25);
        Objects.requireNonNull(stateLayout);
        Intrinsics.checkNotNullParameter(text, "text");
        stateLayout.f21021OoooOO0 = text;
        stateLayout.f21031o000oOoO = iOooO00o;
        OooOOOo().f49083OooO0o0.f12222o000O0Oo = new o00Ooo(this, 2);
        OooOOOo().f49083OooO0o0.f12224o000OO0O = new com.facebook.OooOO0(this, 3);
        OooOOOo().f49083OooO0o0.f12221o000O0O0.setNoMoreText(R.string.room_lucky_number_history_bottom);
        OooOOOo().f49083OooO0o0.f12221o000O0O0.setNoMoreTextColor(o000O0O0.OooO00o(R.color.color_white_40));
        StateLayout stateLayout2 = OooOOOo().f49082OooO0o;
        Intrinsics.checkNotNullExpressionValue(stateLayout2, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout2, 0, new OooO0OO(), 3);
        OooOOOo().f49081OooO0Oo.setLayoutManager(new LinearLayoutManager(this.f34199OooO00o));
        OooOOOo().f49081OooO0Oo.setAdapter((p188o00o00o0.OooO0OO) lazy.getValue());
    }

    public static final p188o00o00o0.OooO0OO OooOOO(RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog) {
        return (p188o00o00o0.OooO0OO) roomLuckyNumberHistoryDialog.f23759OooOO0O.getValue();
    }

    public static final List OooOOOO(RoomLuckyNumberHistoryDialog roomLuckyNumberHistoryDialog) {
        return (List) roomLuckyNumberHistoryDialog.f23758OooOO0.getValue();
    }

    @Override // p250o00oo0oO.o000O000
    public final void OooOOO0() {
        OooOOo0(true);
        OooOo.OooO0O0("302011");
        super.OooOOO0();
    }

    public final c8 OooOOOo() {
        return (c8) this.f23757OooO0oo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOo0(boolean z) {
        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        if (value != null) {
            ((RoomLuckyNumberVM) this.f23755OooO.getValue()).luckyNumberRecord(value.longValue(), z).observe(this.f23756OooO0oO, new o0o0000.OooOo(new OooOO0O(z, this), new OooOOO0(), new OooOOO(z), false, 8));
        }
    }
}
