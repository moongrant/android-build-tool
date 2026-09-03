package com.yalla.yalla.ui.dialog;

import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog.OooO00o;
import com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog.OooO0O0;
import com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog.OooO0OO;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0O00;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p650o0ooo.o000OO00;
import p650o0ooo.u0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomBlackListUnJoinAndUnFollowDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBlackListUnJoinAndUnFollowDialog.kt\ncom/yalla/yalla/ui/dialog/RoomBlackListUnJoinAndUnFollowDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,135:1\n75#2,13:136\n*S KotlinDebug\n*F\n+ 1 RoomBlackListUnJoinAndUnFollowDialog.kt\ncom/yalla/yalla/ui/dialog/RoomBlackListUnJoinAndUnFollowDialog\n*L\n36#1:136,13\n*E\n"})
public final class RoomBlackListUnJoinAndUnFollowDialog extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27445OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f27446OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27447OooOOO0;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27448OooO0Oo;

        public OooO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27448OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27448OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27448OooO0Oo;
        }

        public final int hashCode() {
            return this.f27448OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27448OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<ApiResult<Object>, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<Object> apiResult) {
            if (apiResult.isSuccess()) {
                LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                String strOooO0OO = o0000.OooO0OO(o000000.member_getOut);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                RoomBlackListUnJoinAndUnFollowDialog.this.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<Object>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<Object> apiResult) {
            if (apiResult.isSuccess()) {
                LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                String strOooO0OO = o0000.OooO0OO(o000000.member_getOut);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                RoomBlackListUnJoinAndUnFollowDialog.this.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiResult<Object>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<Object> apiResult) {
            if (apiResult.isSuccess()) {
                LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                String strOooO0OO = o0000.OooO0OO(o000000.Unfollowed);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                RoomBlackListUnJoinAndUnFollowDialog.this.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O00> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00 invoke() {
            RoomBlackListUnJoinAndUnFollowDialog roomBlackListUnJoinAndUnFollowDialog = RoomBlackListUnJoinAndUnFollowDialog.this;
            o0O00 o0o00Inflate = o0O00.inflate(LayoutInflater.from(roomBlackListUnJoinAndUnFollowDialog.f58507OooO0Oo), roomBlackListUnJoinAndUnFollowDialog.f58508OooO0o, true);
            Intrinsics.checkNotNullExpressionValue(o0o00Inflate, "inflate(...)");
            return o0o00Inflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomBlackListUnJoinAndUnFollowDialog(@NotNull final FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27445OooOO0O = activity;
        this.f27446OooOO0o = LazyKt.lazy(new OooO0o());
        this.f27447OooOOO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LiveRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27455OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27455OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        LinearLayout linearLayout = OooOO0().f44390OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        OooO0oo(17);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.WindowAnimScaleWithAlpha);
        }
        Button btUnFollow = OooOO0().f44393OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(btUnFollow, "btUnFollow");
        o000O.OooO0O0(btUnFollow);
        OooOO0().f44394OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.q0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomBlackListUnJoinAndUnFollowDialog this$0 = this.f59125OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o.OooO0O0("101021");
                Long value = OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
                if (value != null) {
                    ((LiveRoomVM) this$0.f27447OooOOO0.getValue()).unJoinRoomAndUnFollowRoom(String.valueOf(value.longValue())).observe(this$0.f27445OooOO0O, new RoomBlackListUnJoinAndUnFollowDialog.OooO(this$0.new OooO00o()));
                }
                this$0.getClass();
            }
        });
        OooOO0().f44395OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.r0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomBlackListUnJoinAndUnFollowDialog this$0 = this.f59143OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0oo0000.OooO00o.OooO0O0("101022");
                ((LiveRoomVM) this$0.f27447OooOOO0.getValue()).unJoinRoom(String.valueOf(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0())).observe(this$0.f27445OooOO0O, new RoomBlackListUnJoinAndUnFollowDialog.OooO(this$0.new OooO0O0()));
            }
        });
        OooOO0().f44393OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.s0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomBlackListUnJoinAndUnFollowDialog this$0 = this.f59151OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((LiveRoomVM) this$0.f27447OooOOO0.getValue()).unFollowRoom(String.valueOf(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0())).observe(this$0.f27445OooOO0O, new RoomBlackListUnJoinAndUnFollowDialog.OooO(this$0.new OooO0OO()));
            }
        });
        OooOO0().f44392OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomBlackListUnJoinAndUnFollowDialog this$0 = this.f59160OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
        OooOO0().f44391OooO0O0.setOnClickListener(new u0(this, 0));
    }

    public final o0O00 OooOO0() {
        return (o0O00) this.f27446OooOO0o.getValue();
    }
}
