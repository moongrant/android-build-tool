package com.yalla.yalla.common.ui.dialog;

import android.view.LayoutInflater;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.LiveRoomVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o00OO0O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p502o0o00o0.o000;
import p502o0o00o0.o00000O;
import p502o0o00o0.o000O000;
import p502o0o00o0.o000O0o;
import p502o0o00o0.o000Oo0;
import p649o0ooOOoo.b8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class RoomBlackListUnJoinAndUnFollowDialog extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f20878OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f20879OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f20880o000oOoO;

    public static final class OooO00o extends Lambda implements Function0<b8> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b8 invoke() {
            b8 b8VarInflate = b8.inflate(LayoutInflater.from(RoomBlackListUnJoinAndUnFollowDialog.this.f41543Oooo0o), RoomBlackListUnJoinAndUnFollowDialog.this.f41545Oooo0oo, true);
            Intrinsics.checkNotNullExpressionValue(b8VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
            return b8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomBlackListUnJoinAndUnFollowDialog(@NotNull final FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = 0;
        this.f20878OoooO = activity;
        this.f20879OoooOO0 = LazyKt.lazy(new OooO00o());
        this.f20880o000oOoO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LiveRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f20884Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f20884Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        LinearLayout linearLayout = OooOO0O().f48997OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        OooO0oo(17);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        Button button = OooOO0O().f49000OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(button, "binding.btUnFollow");
        oOO00O.OooO00o(button);
        OooOO0O().f49001OooO0o.setOnClickListener(new o000O000(this, i));
        OooOO0O().f49002OooO0o0.setOnClickListener(new o000O0o(this, i));
        OooOO0O().f49000OooO0Oo.setOnClickListener(new o000Oo0(this, i));
        OooOO0O().f48999OooO0OO.setOnClickListener(new o000(this, 0));
        OooOO0O().f48998OooO0O0.setOnClickListener(new OooO0O0(this, 2));
    }

    public final b8 OooOO0O() {
        return (b8) this.f20879OoooOO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final LiveRoomVM OooOO0o() {
        return (LiveRoomVM) this.f20880o000oOoO.getValue();
    }

    public final void OooOOO0(boolean z, boolean z2) {
        TextView textView = OooOO0O().f49004OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTitle");
        oOO00O.OooO00o(textView);
        OooOO0O().f49003OooO0oO.setText(o000O0O0.OooO0OO(R.string.BlackList_UnJoin_And_UnFollow_Title));
        Button button = OooOO0O().f49001OooO0o;
        Intrinsics.checkNotNullExpressionValue(button, "binding.btUnJoinAndUnFollow");
        oOO00O.OooO00o(button);
        Button button2 = OooOO0O().f49002OooO0o0;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.btUnJoin");
        oOO00O.OooO00o(button2);
        Button button3 = OooOO0O().f49000OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.btUnFollow");
        oOO00O.OooO00o(button3);
        TextView textView2 = OooOO0O().f48999OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.btOk");
        oOO00O.OooO00o(textView2);
        if (z && z2) {
            OooOO0O().f49003OooO0oO.setText(o000O0O0.OooO0OO(R.string.BlackList_UnJoin_And_UnFollow_Title));
            Button button4 = OooOO0O().f49001OooO0o;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.btUnJoinAndUnFollow");
            oOO00O.OooO(button4);
            Button button5 = OooOO0O().f49002OooO0o0;
            Intrinsics.checkNotNullExpressionValue(button5, "binding.btUnJoin");
            oOO00O.OooO(button5);
            return;
        }
        if (z) {
            OooOO0O().f49003OooO0oO.setText(o000O0O0.OooO0OO(R.string.BlackList_UnJoin_And_UnFollow_Title));
            Button button6 = OooOO0O().f49002OooO0o0;
            Intrinsics.checkNotNullExpressionValue(button6, "binding.btUnJoin");
            oOO00O.OooO(button6);
            return;
        }
        if (z2) {
            OooOO0O().f49003OooO0oO.setText(o000O0O0.OooO0OO(R.string.BlackList_UnFollow_Title));
            Button button7 = OooOO0O().f49000OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(button7, "binding.btUnFollow");
            oOO00O.OooO(button7);
            return;
        }
        ImageView imageView = OooOO0O().f48998OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.btCancel");
        oOO00O.OooO00o(imageView);
        TextView textView3 = OooOO0O().f49004OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTitle");
        oOO00O.OooO(textView3);
        OooOO0O().f49004OooO0oo.setText(o000O0O0.OooO0OO(R.string.room_ban_title));
        OooOO0O().f49003OooO0oO.setText(o000O0O0.OooO0OO(R.string.room_ban_toast));
        TextView textView4 = OooOO0O().f48999OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.btOk");
        oOO00O.OooO(textView4);
    }
}
