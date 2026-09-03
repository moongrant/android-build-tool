package com.yalla.yalla.ui.dialog;

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
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.youth.banner.adapter.BannerAdapter;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o0OOO0o;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o0000O0O;
import p254o00ooO0O.oOO00O;
import p502o0o00o0.o00000O;
import p530o0o0OOO.o00OO00O;
import p534o0o0OOo0.o00OOO0O;
import p534o0o0OOo0.o00OOOO0;
import p534o0o0OOo0.o00OOOOo;
import p534o0o0OOo0.o0o0Oo;
import p579o0oOoOOo.f1;
import p579o0oOoOOo.g1;
import p579o0oOoOOo.h1;
import p579o0oOoOOo.i1;
import p607o0oo0O0.o0Oo0oo;
import p607o0oo0O0.o0ooOOo;
import p649o0ooOOoo.of;
import p649o0ooOOoo.tg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class TreasureBoxDialog extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f23784OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23785OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public BannerAdapter<TreasureBoxCarouselInfo, OooO00o> f23786OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final of f23787o000oOoO;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final tg f23788OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull tg binding) {
            super(binding.f50665OooO00o);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f23788OooO00o = binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TreasureBoxDialog(@NotNull final FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23784OoooO = activity;
        ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0Oo0oo.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxDialog$special$$inlined$viewModels$default$2
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

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23791Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f23791Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        this.f23785OoooOO0 = viewModelLazy;
        of ofVarInflate = of.inflate(activity.getLayoutInflater(), this.f41545Oooo0oo, false);
        Intrinsics.checkNotNullExpressionValue(ofVarInflate, "inflate(activity.layoutI…er, getRootView(), false)");
        this.f23787o000oOoO = ofVarInflate;
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        OooO0oo(80);
        LinearLayoutCompat linearLayoutCompat = ofVarInflate.f50189OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.root");
        OooO0oO(linearLayoutCompat);
        if (oo000o.OooO0o0()) {
            ofVarInflate.f50196OooO0oo.setRotationY(180.0f);
            ofVarInflate.f50191OooO0OO.setRotationY(180.0f);
            ofVarInflate.f50192OooO0Oo.setRotationY(180.0f);
        }
        ofVarInflate.f50200OooOOO0.setAdapter(new h1(activity));
        int i = 2;
        ofVarInflate.f50199OooOO0o.setOnClickListener(new o00OOO0O(this, i));
        ofVarInflate.f50200OooOOO0.registerOnPageChangeCallback(new g1(this));
        ofVarInflate.f50194OooO0o0.setOnClickListener(new o0o0Oo(this, i));
        ofVarInflate.f50193OooO0o.setOnClickListener(new o00OOOOo(this, 1));
        ofVarInflate.f50195OooO0oO.setOnClickListener(new o00OOOO0(this, 1));
        OooOO0o();
        f1 f1Var = new f1(this, new ArrayList());
        this.f23786OoooOOO = f1Var;
        ofVarInflate.f50190OooO0O0.setAdapter(f1Var);
        ofVarInflate.f50190OooO0O0.isAutoLoop(true);
        ofVarInflate.f50190OooO0O0.setDelayTime(3000L);
        ofVarInflate.f50190OooO0O0.setUserInputEnabled(false);
        Objects.requireNonNull((o0Oo0oo) viewModelLazy.getValue());
        o0000O0O.OooO00o(new o0ooOOo(null)).observe(activity, new OooOo(new i1(this), null, null, false, 14));
        LiveEventBus.get("ROOM_TREASURE_BOX_OPEN_DIALOG_DISMISS").observe(activity, new o0OOO0o(this, 10));
    }

    @Override // p502o0o00o0.o00000O
    public final void OooO0Oo() {
        this.f23787o000oOoO.f50190OooO0O0.stop();
    }

    @Override // p502o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        TreasureBoxProgressModel value = o00OO00O.f43313OooooOo.OooO00o().f43363OoooOOo.getValue();
        if (value != null) {
            int boxLevel = value.getBoxLevel();
            if (boxLevel == 1) {
                this.f23787o000oOoO.f50200OooOOO0.setCurrentItem(0, false);
            } else if (boxLevel == 5) {
                this.f23787o000oOoO.f50200OooOOO0.setCurrentItem(1, false);
            } else if (boxLevel == 10) {
                this.f23787o000oOoO.f50200OooOOO0.setCurrentItem(2, false);
            }
        }
        this.f23787o000oOoO.f50190OooO0O0.start();
    }

    public final void OooOO0O(int i) {
        ImageView imageView = this.f23787o000oOoO.f50188OooO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCurrentBg1");
        oOO00O.OooO0O0(imageView);
        ImageView imageView2 = this.f23787o000oOoO.f50197OooOO0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivCurrentBg2");
        oOO00O.OooO0O0(imageView2);
        ImageView imageView3 = this.f23787o000oOoO.f50198OooOO0O;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivCurrentBg3");
        oOO00O.OooO0O0(imageView3);
        this.f23787o000oOoO.f50194OooO0o0.setScaleX(0.8f);
        this.f23787o000oOoO.f50194OooO0o0.setScaleY(0.8f);
        this.f23787o000oOoO.f50193OooO0o.setScaleX(0.8f);
        this.f23787o000oOoO.f50193OooO0o.setScaleY(0.8f);
        this.f23787o000oOoO.f50195OooO0oO.setScaleX(0.8f);
        this.f23787o000oOoO.f50195OooO0oO.setScaleY(0.8f);
        this.f23787o000oOoO.f50194OooO0o0.setAlpha(0.8f);
        this.f23787o000oOoO.f50193OooO0o.setAlpha(0.8f);
        this.f23787o000oOoO.f50195OooO0oO.setAlpha(0.8f);
        if (i == 0) {
            ImageView imageView4 = this.f23787o000oOoO.f50188OooO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivCurrentBg1");
            oOO00O.OooO(imageView4);
            this.f23787o000oOoO.f50194OooO0o0.setScaleX(1.0f);
            this.f23787o000oOoO.f50194OooO0o0.setScaleY(1.0f);
            this.f23787o000oOoO.f50194OooO0o0.setAlpha(1.0f);
            return;
        }
        if (i == 1) {
            ImageView imageView5 = this.f23787o000oOoO.f50197OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivCurrentBg2");
            oOO00O.OooO(imageView5);
            this.f23787o000oOoO.f50193OooO0o.setScaleX(1.0f);
            this.f23787o000oOoO.f50193OooO0o.setScaleY(1.0f);
            this.f23787o000oOoO.f50193OooO0o.setAlpha(1.0f);
            return;
        }
        if (i != 2) {
            return;
        }
        ImageView imageView6 = this.f23787o000oOoO.f50198OooOO0O;
        Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivCurrentBg3");
        oOO00O.OooO(imageView6);
        this.f23787o000oOoO.f50195OooO0oO.setScaleX(1.0f);
        this.f23787o000oOoO.f50195OooO0oO.setScaleY(1.0f);
        this.f23787o000oOoO.f50195OooO0oO.setAlpha(1.0f);
    }

    public final void OooOO0o() {
        TreasureBoxProgressModel value = o00OO00O.f43313OooooOo.OooO00o().f43363OoooOOo.getValue();
        if (value == null) {
            return;
        }
        if (value.getBoxLevel() > 1) {
            this.f23787o000oOoO.f50194OooO0o0.setImageResource(R.drawable.room_ic_treasure_box_1_open);
        } else {
            this.f23787o000oOoO.f50194OooO0o0.setImageResource(R.drawable.room_ic_treasure_box_1);
        }
        if (value.getBoxLevel() > 5) {
            this.f23787o000oOoO.f50193OooO0o.setImageResource(R.drawable.room_ic_treasure_box_2_open);
        } else {
            this.f23787o000oOoO.f50193OooO0o.setImageResource(R.drawable.room_ic_treasure_box_2);
        }
        if (value.getBoxLevel() == 10 && value.getPercent() == 100) {
            this.f23787o000oOoO.f50195OooO0oO.setImageResource(R.drawable.room_ic_treasure_box_3_open);
        } else {
            this.f23787o000oOoO.f50195OooO0oO.setImageResource(R.drawable.room_ic_treasure_box_3);
        }
    }
}
