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
import com.code.android.util.o000OO00;
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
import p377o0OOoOo.o0000OO0;
import p519o0o0O0oO.e4;
import p519o0o0O0oO.f4;
import p519o0o0O0oO.g4;
import p519o0o0O0oO.h4;
import p519o0o0O0oO.o00O00OO;
import p577o0oOoOoO.oOO00O0;
import p577o0oOoOoO.ooooO000;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.e8;
import p641o0ooOOOO.i9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTreasureBoxDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreasureBoxDialog.kt\ncom/yalla/yalla/ui/dialog/TreasureBoxDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,205:1\n75#2,13:206\n*S KotlinDebug\n*F\n+ 1 TreasureBoxDialog.kt\ncom/yalla/yalla/ui/dialog/TreasureBoxDialog\n*L\n33#1:206,13\n*E\n"})
public final class TreasureBoxDialog extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27965OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final e8 f27966OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o0OoOo0 f27967OooOOO0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/dialog/TreasureBoxDialog$BannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "Lo0ooOOOO/i9;", "binding", "Lo0ooOOOO/i9;", "getBinding", "()Lo0ooOOOO/i9;", "<init>", "(Lo0ooOOOO/i9;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public static final class BannerViewHolder extends RecyclerView.o0O0O00 {
        public static final int $stable = 8;

        @NotNull
        private final i9 binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerViewHolder(@NotNull i9 binding) {
            super(binding.f58141OooO00o);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        @NotNull
        public final i9 getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TreasureBoxDialog(@NotNull final MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27965OooOO0O = activity;
        ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ooooO000.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxDialog$special$$inlined$viewModels$default$2
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
            public final /* synthetic */ Function0 f27970OooO0Oo = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27970OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        e8 e8VarInflate = e8.inflate(activity.getLayoutInflater(), this.f52533OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(e8VarInflate, "inflate(activity.layoutI…er, getRootView(), false)");
        this.f27966OooOO0o = e8VarInflate;
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        OooO0oo(80);
        LinearLayoutCompat linearLayoutCompat = e8VarInflate.f57832OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.root");
        OooO0oO(linearLayoutCompat);
        if (p591o0oo000O.OooO.OooO0o0()) {
            e8VarInflate.f57839OooO0oo.setRotationY(180.0f);
            e8VarInflate.f57834OooO0OO.setRotationY(180.0f);
            e8VarInflate.f57835OooO0Oo.setRotationY(180.0f);
        }
        g4 g4Var = new g4(activity);
        ViewPager2 viewPager2 = e8VarInflate.f57843OooOOO0;
        viewPager2.setAdapter(g4Var);
        e8VarInflate.f57842OooOO0o.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.a4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f52171OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                new l4(this$0.f27965OooOO0O).OooO();
            }
        });
        viewPager2.registerOnPageChangeCallback(new f4(this));
        e8VarInflate.f57837OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.b4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f52179OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0(0);
                this$0.f27966OooOO0o.f57843OooOOO0.setCurrentItem(0, true);
            }
        });
        e8VarInflate.f57836OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f52190OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0(1);
                this$0.f27966OooOO0o.f57843OooOOO0.setCurrentItem(1, true);
            }
        });
        e8VarInflate.f57838OooO0oO.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxDialog this$0 = this.f52202OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOO0(2);
                this$0.f27966OooOO0o.f57843OooOOO0.setCurrentItem(2, true);
            }
        });
        OooOO0O();
        o0OoOo0 o0oooo0 = new o0OoOo0(this, new ArrayList());
        this.f27967OooOOO0 = o0oooo0;
        Banner banner = e8VarInflate.f57833OooO0O0;
        banner.setAdapter(o0oooo0);
        banner.isAutoLoop(true);
        banner.setDelayTime(3000L);
        banner.setUserInputEnabled(false);
        ((ooooO000) viewModelLazy.getValue()).getClass();
        o00oO0o.OooO00o(new oOO00O0(null)).observe(activity, new o0000OO0(new h4(this), null, null, false, 14));
        LiveEventBus.get("ROOM_TREASURE_BOX_OPEN_DIALOG_DISMISS").observe(activity, new e4(this));
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO() {
        super.OooO();
        TreasureBoxProgressModel value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25038Oooo0oo.getValue();
        e8 e8Var = this.f27966OooOO0o;
        if (value != null) {
            int boxLevel = value.getBoxLevel();
            if (boxLevel == 1) {
                e8Var.f57843OooOOO0.setCurrentItem(0, false);
            } else if (boxLevel == 5) {
                e8Var.f57843OooOOO0.setCurrentItem(1, false);
            } else if (boxLevel == 10) {
                e8Var.f57843OooOOO0.setCurrentItem(2, false);
            }
        }
        e8Var.f57833OooO0O0.start();
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0Oo() {
        this.f27966OooOO0o.f57833OooO0O0.stop();
    }

    public final void OooOO0(int i) {
        e8 e8Var = this.f27966OooOO0o;
        ImageView imageView = e8Var.f57831OooO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCurrentBg1");
        o000OO00.OooO0OO(imageView);
        ImageView imageView2 = e8Var.f57840OooOO0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivCurrentBg2");
        o000OO00.OooO0OO(imageView2);
        ImageView imageView3 = e8Var.f57841OooOO0O;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivCurrentBg3");
        o000OO00.OooO0OO(imageView3);
        e8Var.f57837OooO0o0.setScaleX(0.8f);
        e8Var.f57837OooO0o0.setScaleY(0.8f);
        e8Var.f57836OooO0o.setScaleX(0.8f);
        e8Var.f57836OooO0o.setScaleY(0.8f);
        e8Var.f57838OooO0oO.setScaleX(0.8f);
        e8Var.f57838OooO0oO.setScaleY(0.8f);
        e8Var.f57837OooO0o0.setAlpha(0.8f);
        e8Var.f57836OooO0o.setAlpha(0.8f);
        e8Var.f57838OooO0oO.setAlpha(0.8f);
        if (i == 0) {
            ImageView imageView4 = e8Var.f57831OooO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivCurrentBg1");
            o000OO00.OooOOOO(imageView4);
            e8Var.f57837OooO0o0.setScaleX(1.0f);
            e8Var.f57837OooO0o0.setScaleY(1.0f);
            e8Var.f57837OooO0o0.setAlpha(1.0f);
            return;
        }
        if (i == 1) {
            ImageView imageView5 = e8Var.f57840OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivCurrentBg2");
            o000OO00.OooOOOO(imageView5);
            e8Var.f57836OooO0o.setScaleX(1.0f);
            e8Var.f57836OooO0o.setScaleY(1.0f);
            e8Var.f57836OooO0o.setAlpha(1.0f);
            return;
        }
        if (i != 2) {
            return;
        }
        ImageView imageView6 = e8Var.f57841OooOO0O;
        Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivCurrentBg3");
        o000OO00.OooOOOO(imageView6);
        e8Var.f57838OooO0oO.setScaleX(1.0f);
        e8Var.f57838OooO0oO.setScaleY(1.0f);
        e8Var.f57838OooO0oO.setAlpha(1.0f);
    }

    public final void OooOO0O() {
        TreasureBoxProgressModel value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25038Oooo0oo.getValue();
        if (value == null) {
            return;
        }
        int boxLevel = value.getBoxLevel();
        e8 e8Var = this.f27966OooOO0o;
        if (boxLevel > 1) {
            e8Var.f57837OooO0o0.setImageResource(oOo00OO0.room_ic_treasure_box_1_open);
        } else {
            e8Var.f57837OooO0o0.setImageResource(oOo00OO0.room_ic_treasure_box_1);
        }
        if (value.getBoxLevel() > 5) {
            e8Var.f57836OooO0o.setImageResource(oOo00OO0.room_ic_treasure_box_2_open);
        } else {
            e8Var.f57836OooO0o.setImageResource(oOo00OO0.room_ic_treasure_box_2);
        }
        if (value.getBoxLevel() == 10 && value.getPercent() == 100) {
            e8Var.f57838OooO0oO.setImageResource(oOo00OO0.room_ic_treasure_box_3_open);
        } else {
            e8Var.f57838OooO0oO.setImageResource(oOo00OO0.room_ic_treasure_box_3);
        }
    }
}
