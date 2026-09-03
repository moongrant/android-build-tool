package com.yalla.yalla.ui.dialog;

import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.util.o000O;
import com.code.android.util.o00oO0o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.TreasureBoxProgressModel;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.youth.banner.Banner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.s;
import p405o0Oo0OOO.x0;
import p471o0OoooO0.o0O000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0Oo0oo;
import p581o0oOoo.o0000OO0;
import p581o0oOoo.o000OO;
import p650o0ooo.d4;
import p650o0ooo.e4;
import p650o0ooo.f4;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTreasureBoxDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreasureBoxDialog.kt\ncom/yalla/yalla/ui/dialog/TreasureBoxDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,205:1\n75#2,13:206\n*S KotlinDebug\n*F\n+ 1 TreasureBoxDialog.kt\ncom/yalla/yalla/ui/dialog/TreasureBoxDialog\n*L\n33#1:206,13\n*E\n"})
public final class TreasureBoxDialog extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27502OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final s f27503OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o000oOoO f27504OooOOO0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/dialog/TreasureBoxDialog$BannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "Lo0Oo0OOO/x0;", "binding", "Lo0Oo0OOO/x0;", "getBinding", "()Lo0Oo0OOO/x0;", "<init>", "(Lo0Oo0OOO/x0;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class BannerViewHolder extends RecyclerView.o0O0O00 {
        public static final int $stable = 8;

        @NotNull
        private final x0 binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerViewHolder(@NotNull x0 binding) {
            super(binding.f45678OooO00o);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        @NotNull
        public final x0 getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TreasureBoxDialog(@NotNull final MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27502OooOO0O = activity;
        ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0000OO0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxDialog$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27507OooO0Oo = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27507OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        s sVarInflate = s.inflate(activity.getLayoutInflater(), this.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(sVarInflate, "inflate(...)");
        this.f27503OooOO0o = sVarInflate;
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        OooO0oo(80);
        LinearLayoutCompat linearLayoutCompat = sVarInflate.f45473OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "getRoot(...)");
        OooO0oO(linearLayoutCompat);
        if (p595o0oo00O.OooOo00.OooO0o0()) {
            sVarInflate.f45480OooO0oo.setRotationY(180.0f);
            sVarInflate.f45475OooO0OO.setRotationY(180.0f);
            sVarInflate.f45476OooO0Oo.setRotationY(180.0f);
        }
        e4 e4Var = new e4(activity);
        ViewPager2 viewPager2 = sVarInflate.f45484OooOOO0;
        viewPager2.setAdapter(e4Var);
        sVarInflate.f45483OooOO0o.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f59249OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                new k4(this$0.f27502OooOO0O).OooO();
            }
        });
        viewPager2.registerOnPageChangeCallback(new d4(this));
        sVarInflate.f45478OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.a4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f58154OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0(0);
                this$0.f27503OooOO0o.f45484OooOOO0.setCurrentItem(0, true);
            }
        });
        sVarInflate.f45477OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.b4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f58162OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0(1);
                this$0.f27503OooOO0o.f45484OooOOO0.setCurrentItem(1, true);
            }
        });
        sVarInflate.f45479OooO0oO.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f58175OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0(2);
                this$0.f27503OooOO0o.f45484OooOOO0.setCurrentItem(2, true);
            }
        });
        OooOO0O();
        o000oOoO o000oooo2 = new o000oOoO(this, new ArrayList());
        this.f27504OooOOO0 = o000oooo2;
        Banner banner = sVarInflate.f45474OooO0O0;
        banner.setAdapter(o000oooo2);
        banner.isAutoLoop(true);
        banner.setDelayTime(3000L);
        banner.setUserInputEnabled(false);
        ((o0000OO0) viewModelLazy.getValue()).getClass();
        o00oO0o.OooO00o(new o000OO(null)).observe(activity, new p384o0OOoo0O.o000oOoO(new f4(this), null, null, false, 14));
        LiveEventBus.get("ROOM_TREASURE_BOX_OPEN_DIALOG_DISMISS").observe(activity, new o0O000(2, this));
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO() {
        super.OooO();
        TreasureBoxProgressModel value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24576Oooo0oo.getValue();
        s sVar = this.f27503OooOO0o;
        if (value != null) {
            int boxLevel = value.getBoxLevel();
            if (boxLevel == 1) {
                sVar.f45484OooOOO0.setCurrentItem(0, false);
            } else if (boxLevel == 5) {
                sVar.f45484OooOOO0.setCurrentItem(1, false);
            } else if (boxLevel == 10) {
                sVar.f45484OooOOO0.setCurrentItem(2, false);
            }
        }
        sVar.f45474OooO0O0.start();
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0Oo() {
        this.f27503OooOO0o.f45474OooO0O0.stop();
    }

    public final void OooOO0(int i) {
        s sVar = this.f27503OooOO0o;
        ImageView ivCurrentBg1 = sVar.f45472OooO;
        Intrinsics.checkNotNullExpressionValue(ivCurrentBg1, "ivCurrentBg1");
        o000O.OooO0OO(ivCurrentBg1);
        ImageView ivCurrentBg2 = sVar.f45481OooOO0;
        Intrinsics.checkNotNullExpressionValue(ivCurrentBg2, "ivCurrentBg2");
        o000O.OooO0OO(ivCurrentBg2);
        ImageView ivCurrentBg3 = sVar.f45482OooOO0O;
        Intrinsics.checkNotNullExpressionValue(ivCurrentBg3, "ivCurrentBg3");
        o000O.OooO0OO(ivCurrentBg3);
        sVar.f45478OooO0o0.setScaleX(0.8f);
        sVar.f45478OooO0o0.setScaleY(0.8f);
        sVar.f45477OooO0o.setScaleX(0.8f);
        sVar.f45477OooO0o.setScaleY(0.8f);
        sVar.f45479OooO0oO.setScaleX(0.8f);
        sVar.f45479OooO0oO.setScaleY(0.8f);
        sVar.f45478OooO0o0.setAlpha(0.8f);
        sVar.f45477OooO0o.setAlpha(0.8f);
        sVar.f45479OooO0oO.setAlpha(0.8f);
        if (i == 0) {
            ImageView ivCurrentBg4 = sVar.f45472OooO;
            Intrinsics.checkNotNullExpressionValue(ivCurrentBg4, "ivCurrentBg1");
            o000O.OooOOOO(ivCurrentBg4);
            sVar.f45478OooO0o0.setScaleX(1.0f);
            sVar.f45478OooO0o0.setScaleY(1.0f);
            sVar.f45478OooO0o0.setAlpha(1.0f);
            return;
        }
        if (i == 1) {
            ImageView ivCurrentBg5 = sVar.f45481OooOO0;
            Intrinsics.checkNotNullExpressionValue(ivCurrentBg5, "ivCurrentBg2");
            o000O.OooOOOO(ivCurrentBg5);
            sVar.f45477OooO0o.setScaleX(1.0f);
            sVar.f45477OooO0o.setScaleY(1.0f);
            sVar.f45477OooO0o.setAlpha(1.0f);
            return;
        }
        if (i != 2) {
            return;
        }
        ImageView ivCurrentBg6 = sVar.f45482OooOO0O;
        Intrinsics.checkNotNullExpressionValue(ivCurrentBg6, "ivCurrentBg3");
        o000O.OooOOOO(ivCurrentBg6);
        sVar.f45479OooO0oO.setScaleX(1.0f);
        sVar.f45479OooO0oO.setScaleY(1.0f);
        sVar.f45479OooO0oO.setAlpha(1.0f);
    }

    public final void OooOO0O() {
        TreasureBoxProgressModel value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24576Oooo0oo.getValue();
        if (value == null) {
            return;
        }
        int boxLevel = value.getBoxLevel();
        s sVar = this.f27503OooOO0o;
        if (boxLevel > 1) {
            sVar.f45478OooO0o0.setImageResource(o0Oo0oo.room_ic_treasure_box_1_open);
        } else {
            sVar.f45478OooO0o0.setImageResource(o0Oo0oo.room_ic_treasure_box_1);
        }
        if (value.getBoxLevel() > 5) {
            sVar.f45477OooO0o.setImageResource(o0Oo0oo.room_ic_treasure_box_2_open);
        } else {
            sVar.f45477OooO0o.setImageResource(o0Oo0oo.room_ic_treasure_box_2);
        }
        if (value.getBoxLevel() == 10 && value.getPercent() == 100) {
            sVar.f45479OooO0oO.setImageResource(o0Oo0oo.room_ic_treasure_box_3_open);
        } else {
            sVar.f45479OooO0oO.setImageResource(o0Oo0oo.room_ic_treasure_box_3);
        }
    }
}
