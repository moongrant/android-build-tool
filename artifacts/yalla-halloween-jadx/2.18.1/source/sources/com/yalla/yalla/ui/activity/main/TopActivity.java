package com.yalla.yalla.ui.activity.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.model.RoomModel;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.TopFragment;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o0ooOOo;
import p168o00Ooo0.o00O0O;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p462o0Ooo0o.o0000Ooo;
import p535o0o0OOoO.oOOOoo00;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.na;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TopActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopActivity extends BaseActivityK {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22092ooOO = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public StateButton f22096OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public TopFragment f22097OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public TopFragment f22098OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public TopFragment f22099Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public TopFragment f22100Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public TopFragment f22101OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o00O0O f22102Ooooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22093OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(na.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22094Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.TopActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.TopActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.TopActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22106Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22106Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public String f22095Ooooo0o = "";

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public String f22103o0OoOo0 = "";

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @NotNull String rankType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intent intent = new Intent(context, (Class<?>) TopActivity.class);
            Objects.requireNonNull(TopVM.INSTANCE);
            intent.putExtra(TopVM.RANK_TYPE_KEY, rankType);
            context.startActivity(intent);
        }
    }

    public final na OooOoo() {
        return (na) this.f22093OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopVM OooOooO() {
        return (TopVM) this.f22094Ooooo00.getValue();
    }

    public final void OooOooo(String str) {
        if (Intrinsics.areEqual(str, this.f22095Ooooo0o)) {
            return;
        }
        this.f22095Ooooo0o = str;
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(getSupportFragmentManager());
        Intrinsics.checkNotNullExpressionValue(oooO00o, "supportFragmentManager.beginTransaction()");
        TopFragment topFragment = this.f22097OooooOO;
        if (topFragment != null) {
            o0000Ooo.OooO0O0(oooO00o, topFragment);
        }
        Objects.requireNonNull(TopVM.INSTANCE);
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            TopFragment topFragment2 = this.f22098OooooOo;
            if (topFragment2 == null) {
                this.f22098OooooOo = TopFragment.INSTANCE.OooO00o(TopVM.TYPE_ROOM_GIFT);
                int id = OooOoo().f50088OooO0o.getId();
                TopFragment topFragment3 = this.f22098OooooOo;
                Intrinsics.checkNotNull(topFragment3);
                o0000Ooo.OooO00o(oooO00o, id, topFragment3);
            } else {
                Intrinsics.checkNotNull(topFragment2);
                o0000Ooo.OooO0OO(oooO00o, topFragment2);
            }
            this.f22097OooooOO = this.f22098OooooOo;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_SENT)) {
            TopFragment topFragment4 = this.f22100Oooooo0;
            if (topFragment4 == null) {
                this.f22100Oooooo0 = TopFragment.INSTANCE.OooO00o(TopVM.TYPE_GIFT_SENT);
                int id2 = OooOoo().f50088OooO0o.getId();
                TopFragment topFragment5 = this.f22100Oooooo0;
                Intrinsics.checkNotNull(topFragment5);
                o0000Ooo.OooO00o(oooO00o, id2, topFragment5);
            } else {
                Intrinsics.checkNotNull(topFragment4);
                o0000Ooo.OooO0OO(oooO00o, topFragment4);
            }
            this.f22097OooooOO = this.f22100Oooooo0;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_RECEIVE)) {
            TopFragment topFragment6 = this.f22099Oooooo;
            if (topFragment6 == null) {
                this.f22099Oooooo = TopFragment.INSTANCE.OooO00o(TopVM.TYPE_GIFT_RECEIVE);
                int id3 = OooOoo().f50088OooO0o.getId();
                TopFragment topFragment7 = this.f22099Oooooo;
                Intrinsics.checkNotNull(topFragment7);
                o0000Ooo.OooO00o(oooO00o, id3, topFragment7);
            } else {
                Intrinsics.checkNotNull(topFragment6);
                o0000Ooo.OooO0OO(oooO00o, topFragment6);
            }
            this.f22097OooooOO = this.f22099Oooooo;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_YALLA_BILLION)) {
            TopFragment topFragment8 = this.f22101OoooooO;
            if (topFragment8 == null) {
                this.f22101OoooooO = TopFragment.INSTANCE.OooO00o(TopVM.TYPE_YALLA_BILLION);
                int id4 = OooOoo().f50088OooO0o.getId();
                TopFragment topFragment9 = this.f22101OoooooO;
                Intrinsics.checkNotNull(topFragment9);
                o0000Ooo.OooO00o(oooO00o, id4, topFragment9);
            } else {
                Intrinsics.checkNotNull(topFragment8);
                o0000Ooo.OooO0OO(oooO00o, topFragment8);
            }
            this.f22097OooooOO = this.f22101OoooooO;
        }
        oooO00o.OooO0oO();
        StateButton stateButton = this.f22096OooooO0;
        if (stateButton != null) {
            stateButton.setEnabled(true);
        }
        Window colorStatusBar = getWindow();
        Intrinsics.checkNotNullExpressionValue(colorStatusBar, "window");
        int widowBgColor = OooOooO().getWidowBgColor(str);
        Intrinsics.checkNotNullParameter(colorStatusBar, "$this$colorStatusBar");
        colorStatusBar.setStatusBarColor(widowBgColor);
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            this.f22095Ooooo0o = TopVM.TYPE_ROOM_GIFT;
            OooOoo().f50096OooOOO0.setEnabled(false);
            this.f22096OooooO0 = OooOoo().f50096OooOOO0;
            OooOoo().f50085OooO0O0.setImageResource(R.mipmap.main_top_room_gift_left);
            OooOoo().f50086OooO0OO.setImageResource(R.mipmap.main_top_room_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_SENT)) {
            this.f22095Ooooo0o = TopVM.TYPE_GIFT_SENT;
            OooOoo().f50094OooOO0o.setEnabled(false);
            this.f22096OooooO0 = OooOoo().f50094OooOO0o;
            OooOoo().f50085OooO0O0.setImageResource(R.mipmap.main_top_sent_gift_left);
            OooOoo().f50086OooO0OO.setImageResource(R.mipmap.main_top_sent_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_RECEIVE)) {
            this.f22095Ooooo0o = TopVM.TYPE_GIFT_RECEIVE;
            OooOoo().f50093OooOO0O.setEnabled(false);
            this.f22096OooooO0 = OooOoo().f50093OooOO0O;
            OooOoo().f50085OooO0O0.setImageResource(R.mipmap.main_top_receive_gift_left);
            OooOoo().f50086OooO0OO.setImageResource(R.mipmap.main_top_receive_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_YALLA_BILLION)) {
            this.f22095Ooooo0o = TopVM.TYPE_YALLA_BILLION;
            OooOoo().f50095OooOOO.setEnabled(false);
            this.f22096OooooO0 = OooOoo().f50095OooOOO;
            OooOoo().f50085OooO0O0.setImageResource(R.mipmap.main_top_yalla_billion_left);
            OooOoo().f50086OooO0OO.setImageResource(R.mipmap.main_top_yalla_billion_right);
        }
        OooOoo().f50089OooO0o0.setBackgroundResource(OooOooO().getBgResource(this.f22095Ooooo0o));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f50096OooOOO0)) {
            Objects.requireNonNull(TopVM.INSTANCE);
            OooOooo(TopVM.TYPE_ROOM_GIFT);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50094OooOO0o)) {
            Objects.requireNonNull(TopVM.INSTANCE);
            OooOooo(TopVM.TYPE_GIFT_SENT);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50093OooOO0O)) {
            Objects.requireNonNull(TopVM.INSTANCE);
            OooOooo(TopVM.TYPE_GIFT_RECEIVE);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50095OooOOO)) {
            Objects.requireNonNull(TopVM.INSTANCE);
            OooOooo(TopVM.TYPE_YALLA_BILLION);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f50087OooO0Oo)) {
            String str = this.f22095Ooooo0o;
            Objects.requireNonNull(TopVM.INSTANCE);
            if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                TopRankData value = OooOooO().getUpdateTopRank().getValue();
                if (com.yalla.support.common.util.OooO0OO.OooO0O0(value != null ? value.getId() : null)) {
                    TopRankData value2 = OooOooO().getUpdateTopRank().getValue();
                    if (com.yalla.support.common.util.OooO0OO.OooO0O0(value2 != null ? value2.getRoomServerIp() : null)) {
                        RoomModel roomModel = new RoomModel();
                        TopRankData value3 = OooOooO().getUpdateTopRank().getValue();
                        roomModel.setId(o0O0O00.OooOOO0(value3 != null ? value3.getId() : null));
                        TopRankData value4 = OooOooO().getUpdateTopRank().getValue();
                        roomModel.setImage(value4 != null ? value4.getImageUrl() : null);
                        TopRankData value5 = OooOooO().getUpdateTopRank().getValue();
                        roomModel.setName(value5 != null ? value5.getName() : null);
                        TopRankData value6 = OooOooO().getUpdateTopRank().getValue();
                        roomModel.setRoomIp(value6 != null ? value6.getRoomServerIp() : null);
                        RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Explore_Top);
                    }
                }
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50084OooO00o);
        Intent intent = getIntent();
        Objects.requireNonNull(TopVM.INSTANCE);
        String stringExtra = intent.getStringExtra(TopVM.RANK_TYPE_KEY);
        if (stringExtra == null) {
            stringExtra = TopVM.TYPE_ROOM_GIFT;
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(To…) ?: TopVM.TYPE_ROOM_GIFT");
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.tab_top);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(OooOOO.OooO00o(R.color.transparent));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        if (headerLayout3 != null) {
            headerLayout3.OooOoOO(R.drawable.icon_aristocracy_doubt, new oOOOoo00(this));
        }
        OooOoo().f50096OooOOO0.setOnClickListener(this);
        OooOoo().f50094OooOO0o.setOnClickListener(this);
        OooOoo().f50093OooOO0O.setOnClickListener(this);
        OooOoo().f50095OooOOO.setOnClickListener(this);
        OooOoo().f50087OooO0Oo.setOnClickListener(this);
        this.f22102Ooooooo = new o00O0O(this, OooOoo().f50097OooOOOO);
        OooOooo(stringExtra);
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.FALSE)) {
            ConstraintLayout constraintLayout = OooOoo().f50087OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clBottom");
            com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout);
        } else {
            OooOooO().getUpdateTopRank().observe(this, new o0ooOOo(this, 1));
        }
        o0O00000.OooO0OO("Room_top");
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
        sbOooO0o0.append(this.f11468OoooOOO);
        OooOo.OooO0OO("401004", MapsKt.mapOf(new Pair("staytime", sbOooO0o0.toString())));
    }
}
