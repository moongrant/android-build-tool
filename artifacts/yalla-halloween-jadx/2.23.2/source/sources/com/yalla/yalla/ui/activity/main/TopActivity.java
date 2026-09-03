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
import androidx.media3.session.o0000O00;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
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
import p405o0Oo0OOO.oO0o0o;
import p429o0OoOO.o0Oo0oo;
import p475o0Ooooo0.o0O00oO0;
import p487o0o00O.o0O000O;
import p487o0o00O.o0OoOoOo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0OOO0o;
import p586o0oOooO0.oO0OO0O;
import p590o0oOooo0.oOOO00Oo;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/TopActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopActivity.kt\ncom/yalla/yalla/ui/activity/main/TopActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n22#2,2:274\n75#3,13:276\n1#4:289\n*S KotlinDebug\n*F\n+ 1 TopActivity.kt\ncom/yalla/yalla/ui/activity/main/TopActivity\n*L\n39#1:274,2\n40#1:276,13\n*E\n"})
public final class TopActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f25114OooOooO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public TopFragment f25116OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public StateButton f25119OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public TopFragment f25120OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public TopFragment f25121OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public TopFragment f25122OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public TopFragment f25123OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public oOOO00Oo f25125OooOoo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25115OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO0o0o.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25118OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.TopActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25128OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25128OooO0Oo;
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
    public String f25117OooOo0 = "";

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public String f25124OooOoo = "";

    public final oO0o0o OooOo() {
        return (oO0o0o) this.f25115OooOOoo.getValue();
    }

    public final void OooOoO(String str) {
        if (Intrinsics.areEqual(str, this.f25117OooOo0)) {
            return;
        }
        this.f25117OooOo0 = str;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "beginTransaction(...)");
        TopFragment topFragment = this.f25120OooOo0o;
        if (topFragment != null) {
            oO0OO0O.OooO0O0(oooO00o, topFragment);
        }
        TopVM.INSTANCE.getClass();
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            TopFragment topFragment2 = this.f25116OooOo;
            if (topFragment2 == null) {
                TopFragment.Companion companion = TopFragment.INSTANCE;
                String str2 = TopVM.TYPE_ROOM_GIFT;
                companion.getClass();
                this.f25116OooOo = TopFragment.Companion.OooO00o(str2);
                int id = OooOo().f44985OooO0o.getId();
                TopFragment topFragment3 = this.f25116OooOo;
                Intrinsics.checkNotNull(topFragment3);
                oO0OO0O.OooO00o(oooO00o, id, topFragment3);
            } else {
                Intrinsics.checkNotNull(topFragment2);
                oO0OO0O.OooO0OO(oooO00o, topFragment2);
            }
            this.f25120OooOo0o = this.f25116OooOo;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_SENT)) {
            TopFragment topFragment4 = this.f25122OooOoO0;
            if (topFragment4 == null) {
                TopFragment.Companion companion2 = TopFragment.INSTANCE;
                String str3 = TopVM.TYPE_GIFT_SENT;
                companion2.getClass();
                this.f25122OooOoO0 = TopFragment.Companion.OooO00o(str3);
                int id2 = OooOo().f44985OooO0o.getId();
                TopFragment topFragment5 = this.f25122OooOoO0;
                Intrinsics.checkNotNull(topFragment5);
                oO0OO0O.OooO00o(oooO00o, id2, topFragment5);
            } else {
                Intrinsics.checkNotNull(topFragment4);
                oO0OO0O.OooO0OO(oooO00o, topFragment4);
            }
            this.f25120OooOo0o = this.f25122OooOoO0;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_RECEIVE)) {
            TopFragment topFragment6 = this.f25121OooOoO;
            if (topFragment6 == null) {
                TopFragment.Companion companion3 = TopFragment.INSTANCE;
                String str4 = TopVM.TYPE_GIFT_RECEIVE;
                companion3.getClass();
                this.f25121OooOoO = TopFragment.Companion.OooO00o(str4);
                int id3 = OooOo().f44985OooO0o.getId();
                TopFragment topFragment7 = this.f25121OooOoO;
                Intrinsics.checkNotNull(topFragment7);
                oO0OO0O.OooO00o(oooO00o, id3, topFragment7);
            } else {
                Intrinsics.checkNotNull(topFragment6);
                oO0OO0O.OooO0OO(oooO00o, topFragment6);
            }
            this.f25120OooOo0o = this.f25121OooOoO;
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_YALLA_BILLION)) {
            TopFragment topFragment8 = this.f25123OooOoOO;
            if (topFragment8 == null) {
                TopFragment.Companion companion4 = TopFragment.INSTANCE;
                String str5 = TopVM.TYPE_YALLA_BILLION;
                companion4.getClass();
                this.f25123OooOoOO = TopFragment.Companion.OooO00o(str5);
                int id4 = OooOo().f44985OooO0o.getId();
                TopFragment topFragment9 = this.f25123OooOoOO;
                Intrinsics.checkNotNull(topFragment9);
                oO0OO0O.OooO00o(oooO00o, id4, topFragment9);
            } else {
                Intrinsics.checkNotNull(topFragment8);
                oO0OO0O.OooO0OO(oooO00o, topFragment8);
            }
            this.f25120OooOo0o = this.f25123OooOoOO;
        }
        oooO00o.OooO0o0();
        StateButton stateButton = this.f25119OooOo0O;
        if (stateButton != null) {
            stateButton.setEnabled(true);
        }
        Window colorStatusBar = getWindow();
        Intrinsics.checkNotNullExpressionValue(colorStatusBar, "getWindow(...)");
        int widowBgColor = OooOoO0().getWidowBgColor(str);
        Intrinsics.checkNotNullParameter(colorStatusBar, "$this$colorStatusBar");
        colorStatusBar.setStatusBarColor(widowBgColor);
        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
            this.f25117OooOo0 = TopVM.TYPE_ROOM_GIFT;
            OooOo().f44993OooOOO0.setEnabled(false);
            this.f25119OooOo0O = OooOo().f44993OooOOO0;
            OooOo().f44982OooO0O0.setImageResource(o0O0O00.main_top_room_gift_left);
            OooOo().f44983OooO0OO.setImageResource(o0O0O00.main_top_room_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_SENT)) {
            this.f25117OooOo0 = TopVM.TYPE_GIFT_SENT;
            OooOo().f44991OooOO0o.setEnabled(false);
            this.f25119OooOo0O = OooOo().f44991OooOO0o;
            OooOo().f44982OooO0O0.setImageResource(o0O0O00.main_top_sent_gift_left);
            OooOo().f44983OooO0OO.setImageResource(o0O0O00.main_top_sent_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_GIFT_RECEIVE)) {
            this.f25117OooOo0 = TopVM.TYPE_GIFT_RECEIVE;
            OooOo().f44990OooOO0O.setEnabled(false);
            this.f25119OooOo0O = OooOo().f44990OooOO0O;
            OooOo().f44982OooO0O0.setImageResource(o0O0O00.main_top_receive_gift_left);
            OooOo().f44983OooO0OO.setImageResource(o0O0O00.main_top_receive_gift_right);
        } else if (Intrinsics.areEqual(str, TopVM.TYPE_YALLA_BILLION)) {
            this.f25117OooOo0 = TopVM.TYPE_YALLA_BILLION;
            OooOo().f44992OooOOO.setEnabled(false);
            this.f25119OooOo0O = OooOo().f44992OooOOO;
            OooOo().f44982OooO0O0.setImageResource(o0O0O00.main_top_yalla_billion_left);
            OooOo().f44983OooO0OO.setImageResource(o0O0O00.main_top_yalla_billion_right);
        }
        OooOo().f44986OooO0o0.setBackgroundResource(OooOoO0().getBgResource(this.f25117OooOo0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopVM OooOoO0() {
        return (TopVM) this.f25118OooOo00.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f44993OooOOO0)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_ROOM_GIFT);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44991OooOO0o)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_GIFT_SENT);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44990OooOO0O)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_GIFT_RECEIVE);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44992OooOOO)) {
            TopVM.INSTANCE.getClass();
            OooOoO(TopVM.TYPE_YALLA_BILLION);
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44984OooO0Oo)) {
            String str = this.f25117OooOo0;
            TopVM.INSTANCE.getClass();
            if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                TopRankData value = OooOoO0().getUpdateTopRank().getValue();
                if (com.code.android.util.OooOo00.OooO0O0(value != null ? value.getId() : null)) {
                    TopRankData value2 = OooOoO0().getUpdateTopRank().getValue();
                    if (com.code.android.util.OooOo00.OooO0O0(value2 != null ? value2.getRoomServerIp() : null)) {
                        RoomModel roomModel = new RoomModel();
                        TopRankData value3 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setId(o0O0O0Oo.OooOO0o(value3 != null ? value3.getId() : null));
                        TopRankData value4 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setImage(value4 != null ? value4.getImageUrl() : null);
                        TopRankData value5 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setName(value5 != null ? value5.getName() : null);
                        TopRankData value6 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.setRoomIp(value6 != null ? value6.getRoomServerIp() : null);
                        TopRankData value7 = OooOoO0().getUpdateTopRank().getValue();
                        roomModel.websocketaddr = value7 != null ? value7.getWebsocketaddr() : null;
                        MutableState mutableState = o0Oo0oo.f46817OooO00o;
                        o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Explore_Top);
                    }
                }
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44981OooO00o);
        Intent intent = getIntent();
        TopVM.INSTANCE.getClass();
        String stringExtra = intent.getStringExtra(TopVM.RANK_TYPE_KEY);
        if (stringExtra == null) {
            stringExtra = TopVM.TYPE_ROOM_GIFT;
        }
        Intrinsics.checkNotNull(stringExtra);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(o000000.tab_top);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(o0000.OooO00o(o0OOO0o.transparent));
        }
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(p562o0oOo000.o0Oo0oo.icon_aristocracy_doubt, new o0OoOoOo(this));
        }
        OooOo().f44993OooOOO0.setOnClickListener(this);
        OooOo().f44991OooOO0o.setOnClickListener(this);
        OooOo().f44990OooOO0O.setOnClickListener(this);
        OooOo().f44992OooOOO.setOnClickListener(this);
        OooOo().f44984OooO0Oo.setOnClickListener(this);
        this.f25125OooOoo0 = new oOOO00Oo(this, OooOo().f44994OooOOOO);
        OooOoO(stringExtra);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (!Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.FALSE)) {
            OooOoO0().getUpdateTopRank().observe(this, new o0O000O(this, 0));
            return;
        }
        ConstraintLayout clBottom = OooOo().f44984OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(clBottom, "clBottom");
        o000O.OooO0O0(clBottom);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        o0oo0000.OooO00o.OooO0OO("401004", MapsKt.mapOf(new Pair("staytime", o0000O00.OooO00o(this.f22287OooOOOO))));
    }
}
