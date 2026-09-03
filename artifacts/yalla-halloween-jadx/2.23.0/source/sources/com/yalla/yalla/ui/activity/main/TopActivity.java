package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.TopFragment;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.main.TopVM;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p486o0o00O00.o0O00;
import p486o0o00O00.o0O000o0;
import p579o0oOoo.oO00O0oO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.w3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TopActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopActivity.kt\ncom/yalla/yalla/ui/activity/main/TopActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n22#2,2:274\n75#3,13:276\n1#4:289\n*S KotlinDebug\n*F\n+ 1 TopActivity.kt\ncom/yalla/yalla/ui/activity/main/TopActivity\n*L\n39#1:274,2\n40#1:276,13\n*E\n"})
public final class TopActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f25568OooOooO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public TopFragment f25570OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public StateButton f25573OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public TopFragment f25574OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public TopFragment f25575OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public TopFragment f25576OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public TopFragment f25577OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public oO00O0oO f25579OooOoo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25569OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(w3.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25572OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.TopActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25582OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25582OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public String f25571OooOo0 = "";

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public String f25578OooOoo = "";

    public final w3 OooOo() {
        return (w3) this.f25569OooOOoo.getValue();
    }

    public final void OooOoO(String str) {
        if (Intrinsics.areEqual(str, this.f25571OooOo0)) {
            return;
        }
        this.f25571OooOo0 = str;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "supportFragmentManager.beginTransaction()");
        TopFragment topFragment = this.f25574OooOo0o;
        if (topFragment != null) {
            p401o0Oo0OO0.o0OoOo0.OooO0O0(oooO00o, topFragment);
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            TopFragment topFragment2 = this.f25570OooOo;
            if (topFragment2 == null) {
                TopFragment.Companion companion = TopFragment.INSTANCE;
                String str2 = TopVM.TYPE_ROOM_GIFT;
                companion.getClass();
                this.f25570OooOo = TopFragment.Companion.OooO00o(str2);
                int id = OooOo().f59132OooO0o.getId();
                TopFragment topFragment3 = this.f25570OooOo;
                Intrinsics.checkNotNull(topFragment3);
                p401o0Oo0OO0.o0OoOo0.OooO00o(oooO00o, id, topFragment3);
            } else {
                Intrinsics.checkNotNull(topFragment2);
                p401o0Oo0OO0.o0OoOo0.OooO0OO(oooO00o, topFragment2);
            }
            this.f25574OooOo0o = this.f25570OooOo;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_SENT)) {
            TopFragment topFragment4 = this.f25576OooOoO0;
            if (topFragment4 == null) {
                TopFragment.Companion companion2 = TopFragment.INSTANCE;
                String str3 = TopVM.TYPE_GIFT_SENT;
                companion2.getClass();
                this.f25576OooOoO0 = TopFragment.Companion.OooO00o(str3);
                int id2 = OooOo().f59132OooO0o.getId();
                TopFragment topFragment5 = this.f25576OooOoO0;
                Intrinsics.checkNotNull(topFragment5);
                p401o0Oo0OO0.o0OoOo0.OooO00o(oooO00o, id2, topFragment5);
            } else {
                Intrinsics.checkNotNull(topFragment4);
                p401o0Oo0OO0.o0OoOo0.OooO0OO(oooO00o, topFragment4);
            }
            this.f25574OooOo0o = this.f25576OooOoO0;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_RECEIVE)) {
            TopFragment topFragment6 = this.f25575OooOoO;
            if (topFragment6 == null) {
                TopFragment.Companion companion3 = TopFragment.INSTANCE;
                String str4 = TopVM.TYPE_GIFT_RECEIVE;
                companion3.getClass();
                this.f25575OooOoO = TopFragment.Companion.OooO00o(str4);
                int id3 = OooOo().f59132OooO0o.getId();
                TopFragment topFragment7 = this.f25575OooOoO;
                Intrinsics.checkNotNull(topFragment7);
                p401o0Oo0OO0.o0OoOo0.OooO00o(oooO00o, id3, topFragment7);
            } else {
                Intrinsics.checkNotNull(topFragment6);
                p401o0Oo0OO0.o0OoOo0.OooO0OO(oooO00o, topFragment6);
            }
            this.f25574OooOo0o = this.f25575OooOoO;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_YALLA_BILLION)) {
            TopFragment topFragment8 = this.f25577OooOoOO;
            if (topFragment8 == null) {
                TopFragment.Companion companion4 = TopFragment.INSTANCE;
                String str5 = TopVM.TYPE_YALLA_BILLION;
                companion4.getClass();
                this.f25577OooOoOO = TopFragment.Companion.OooO00o(str5);
                int id4 = OooOo().f59132OooO0o.getId();
                TopFragment topFragment9 = this.f25577OooOoOO;
                Intrinsics.checkNotNull(topFragment9);
                p401o0Oo0OO0.o0OoOo0.OooO00o(oooO00o, id4, topFragment9);
            } else {
                Intrinsics.checkNotNull(topFragment8);
                p401o0Oo0OO0.o0OoOo0.OooO0OO(oooO00o, topFragment8);
            }
            this.f25574OooOo0o = this.f25577OooOoOO;
        }
        oooO00o.OooO0o0();
        StateButton stateButton = this.f25573OooOo0O;
        if (stateButton != null) {
            stateButton.setEnabled(true);
        }
        Window colorStatusBar = getWindow();
        Intrinsics.checkNotNullExpressionValue(colorStatusBar, "window");
        int widowBgColor = OooOoO0().getWidowBgColor(str);
        Intrinsics.checkNotNullParameter(colorStatusBar, "$this$colorStatusBar");
        colorStatusBar.setStatusBarColor(widowBgColor);
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            this.f25571OooOo0 = TopVM.TYPE_ROOM_GIFT;
            OooOo().f59140OooOOO0.setEnabled(false);
            this.f25573OooOo0O = OooOo().f59140OooOOO0;
            OooOo().f59129OooO0O0.setImageResource(oO00OOO.main_top_room_gift_left);
            OooOo().f59130OooO0OO.setImageResource(oO00OOO.main_top_room_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_SENT)) {
            this.f25571OooOo0 = TopVM.TYPE_GIFT_SENT;
            OooOo().f59138OooOO0o.setEnabled(false);
            this.f25573OooOo0O = OooOo().f59138OooOO0o;
            OooOo().f59129OooO0O0.setImageResource(oO00OOO.main_top_sent_gift_left);
            OooOo().f59130OooO0OO.setImageResource(oO00OOO.main_top_sent_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_RECEIVE)) {
            this.f25571OooOo0 = TopVM.TYPE_GIFT_RECEIVE;
            OooOo().f59137OooOO0O.setEnabled(false);
            this.f25573OooOo0O = OooOo().f59137OooOO0O;
            OooOo().f59129OooO0O0.setImageResource(oO00OOO.main_top_receive_gift_left);
            OooOo().f59130OooO0OO.setImageResource(oO00OOO.main_top_receive_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_YALLA_BILLION)) {
            this.f25571OooOo0 = TopVM.TYPE_YALLA_BILLION;
            OooOo().f59139OooOOO.setEnabled(false);
            this.f25573OooOo0O = OooOo().f59139OooOOO;
            OooOo().f59129OooO0O0.setImageResource(oO00OOO.main_top_yalla_billion_left);
            OooOo().f59130OooO0OO.setImageResource(oO00OOO.main_top_yalla_billion_right);
        }
        OooOo().f59133OooO0o0.setBackgroundResource(OooOoO0().getBgResource(this.f25571OooOo0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopVM OooOoO0() {
        return (TopVM) this.f25572OooOo00.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f59140OooOOO0)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_ROOM_GIFT);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f59138OooOO0o)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_GIFT_SENT);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f59137OooOO0O)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_GIFT_RECEIVE);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f59139OooOOO)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_YALLA_BILLION);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f59131OooO0Oo)) {
            String str = this.f25571OooOo0;
            TopVM.INSTANCE.getClass();
            if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                TopRankData value = OooOoO0().getUpdateTopRank().getValue();
                if (com.code.android.util.OooOo00.OooO0O0(value != null ? value.getId() : null)) {
                    TopRankData value2 = OooOoO0().getUpdateTopRank().getValue();
                    if (com.code.android.util.OooOo00.OooO0O0(value2 != null ? value2.getRoomServerIp() : null)) {
                        RoomModel roomModel = new RoomModel();
                        TopRankData value3 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setId(p590o0oo0.OooOOOO.OooOO0o(value3 != null ? value3.getId() : null));
                        TopRankData value4 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setImage(value4 != null ? value4.getImageUrl() : null);
                        TopRankData value5 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setName(value5 != null ? value5.getName() : null);
                        TopRankData value6 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setRoomIp(value6 != null ? value6.getRoomServerIp() : null);
                        TopRankData value7 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.websocketaddr = value7 != null ? value7.getWebsocketaddr() : null;
                        MutableState mutableState = o0OOO0o.f45698OooO00o;
                        o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Explore_Top);
                    }
                }
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59128OooO00o);
        Intent intent = getIntent();
        TopVM.INSTANCE.getClass();
        String stringExtra = intent.getStringExtra(TopVM.RANK_TYPE_KEY);
        if (stringExtra == null) {
            stringExtra = TopVM.TYPE_ROOM_GIFT;
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(To…) ?: TopVM.TYPE_ROOM_GIFT");
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.tab_top);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(o0000.OooO00o(oO00O0o.transparent));
        }
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(oOo00OO0.icon_aristocracy_doubt, new o0O00(this));
        }
        OooOo().f59140OooOOO0.setOnClickListener(this);
        OooOo().f59138OooOO0o.setOnClickListener(this);
        OooOo().f59137OooOO0O.setOnClickListener(this);
        OooOo().f59139OooOOO.setOnClickListener(this);
        OooOo().f59131OooO0Oo.setOnClickListener(this);
        this.f25579OooOoo0 = new oO00O0oO(this, OooOo().f59141OooOOOO);
        OooOoO(stringExtra);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (!Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.FALSE)) {
            OooOoO0().getUpdateTopRank().observe(this, new o0O000o0(this));
            return;
        }
        ConstraintLayout constraintLayout = OooOo().f59131OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clBottom");
        o000OO00.OooO0O0(constraintLayout);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        o0OO000.OooO0O0("401004", MapsKt.mapOf(new Pair("staytime", oo0ooO.OooO00o(this.f22760OooOOOO))));
    }
}
