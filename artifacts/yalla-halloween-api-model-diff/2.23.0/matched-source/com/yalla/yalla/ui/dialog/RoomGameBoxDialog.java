package com.yalla.yalla.ui.dialog;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000O0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p433o0OoOOo.o00OOO00;
import p464o0Oooo.o000000O;
import p495o0o00Ooo.o00Oo00;
import p495o0o00Ooo.o0oOOo;
import p504o0o00oo.o00000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.c8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomGameBoxDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGameBoxDialog.kt\ncom/yalla/yalla/ui/dialog/RoomGameBoxDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n350#2,7:361\n*S KotlinDebug\n*F\n+ 1 RoomGameBoxDialog.kt\ncom/yalla/yalla/ui/dialog/RoomGameBoxDialog\n*L\n246#1:361,7\n*E\n"})
public final class RoomGameBoxDialog extends p157o00OoOO0.Oooo0<RoomGameBoxDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f27920OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f27921OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o00OOO00 f27922OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f27923OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f27924OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f27925OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final List<GameType> f27926OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f27927OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f27928OooOOOO;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomGameBoxDialog$GameType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "GameMora", "GameLuckyGolds", "GameTurntable", "GameVote", "GameLuckyNumber", "GameCamel", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum GameType {
        GameMora(0),
        GameLuckyGolds(1),
        GameTurntable(2),
        GameVote(3),
        GameLuckyNumber(4),
        GameCamel(5);

        private final int value;

        GameType(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GameType.values().length];
            try {
                iArr[GameType.GameMora.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameType.GameLuckyGolds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GameType.GameTurntable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GameType.GameVote.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GameType.GameLuckyNumber.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GameType.GameCamel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yalla.yalla.ui.dialog.OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.dialog.OooO00o invoke() {
            RoomGameBoxDialog roomGameBoxDialog = RoomGameBoxDialog.this;
            return new com.yalla.yalla.ui.dialog.OooO00o(roomGameBoxDialog, roomGameBoxDialog.f27921OooO0oO, oO00OO0O.room_item_game_box_dialog);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27930OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27930OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27930OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27930OooO0Oo;
        }

        public final int hashCode() {
            return this.f27930OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27930OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomGameBoxDialog(@NotNull MixedRoomActivity mActivity, @Nullable o00OOO00 o00ooo01) {
        Integer value;
        super(mActivity);
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        this.f27921OooO0oO = mActivity;
        this.f27922OooO0oo = o00ooo01;
        c8 c8VarInflate = c8.inflate(LayoutInflater.from(mActivity), this.f10135OooO0OO, true);
        Intrinsics.checkNotNullExpressionValue(c8VarInflate, "inflate(LayoutInflater.f…ctivity), rootView, true)");
        Lazy lazy = LazyKt.lazy(new OooO0O0());
        this.f27920OooO = lazy;
        this.f27924OooOO0O = 1;
        GameType gameType = GameType.GameMora;
        GameType gameType2 = GameType.GameTurntable;
        GameType gameType3 = GameType.GameVote;
        GameType gameType4 = GameType.GameCamel;
        List<GameType> listMutableListOf = CollectionsKt.mutableListOf(gameType, GameType.GameLuckyGolds, gameType2, gameType3, GameType.GameLuckyNumber, gameType4);
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        if (Intrinsics.areEqual(oooO00o.OooO00o().f25017OooOo0.getValue(), Boolean.FALSE)) {
            listMutableListOf.remove(gameType);
        }
        Integer num = (Integer) ((MutableLiveData) oooO00o.OooO00o().f25029Oooo0.getValue()).getValue();
        if (num == null || num.intValue() != 1 || (value = oooO00o.OooO00o().f25008OooOO0o.getValue()) == null || value.intValue() != 1) {
            listMutableListOf.remove(gameType2);
        }
        if (!oooO00o.OooO00o().OooOOO() && !oooO00o.OooO00o().OooOO0o()) {
            listMutableListOf.remove(gameType3);
        }
        if (!Intrinsics.areEqual(oooO00o.OooO00o().f25041OoooO00.getValue(), Boolean.TRUE)) {
            listMutableListOf.remove(gameType4);
        }
        this.f27926OooOOO = listMutableListOf;
        OooO0oo();
        int i = oO00Oo00.anim_bottom_top_bottom;
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setWindowAnimations(i);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        c8VarInflate.f57668OooO0O0.addItemDecoration(new o00000O(o0000O0.OooO00o(3)));
        FixGridLayoutManager fixGridLayoutManager = new FixGridLayoutManager(this.f10133OooO00o, listMutableListOf.size() < 4 ? listMutableListOf.size() : 4);
        FixedRecyclerView fixedRecyclerView = c8VarInflate.f57668OooO0O0;
        fixedRecyclerView.setLayoutManager(fixGridLayoutManager);
        fixedRecyclerView.setAdapter((o000O) lazy.getValue());
        ((o000O) lazy.getValue()).f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o0O0oO.x0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                RoomGameBoxDialog this$0 = this.f53204OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object obj = baseQuickAdapter.f10111OooOOoo.get(i2);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.ui.dialog.RoomGameBoxDialog.GameType");
                int i3 = RoomGameBoxDialog.OooO00o.$EnumSwitchMapping$0[((RoomGameBoxDialog.GameType) obj).ordinal()];
                OooO0O0.OooO00o oooO00o2 = OooO0O0.f24995OoooOOO;
                boolean z = false;
                switch (i3) {
                    case 1:
                        o0OO000.OooO00o("102026");
                        new ooooO0O0(this$0.f27921OooO0oO, true).OooO();
                        this$0.OooO0OO();
                        break;
                    case 2:
                        long timeInMillis = Calendar.getInstance().getTimeInMillis();
                        if (timeInMillis - this$0.f27928OooOOOO > 1000) {
                            this$0.f27928OooOOOO = timeInMillis;
                            if (MixedRoomDataSource.OooO0o0().f23460OooO0o != null) {
                                o0OO000.OooO00o("102027");
                                new oO0o0000(this$0.f27921OooO0oO).OooO();
                            }
                        }
                        this$0.OooO0OO();
                        break;
                    case 3:
                        o0OO000.OooO00o("102028");
                        LiveEventBus.get("OPEN_TURNTABKE_GAME").post(Boolean.TRUE);
                        this$0.OooO0OO();
                        break;
                    case 4:
                        o0OO000.OooO00o("102029");
                        RoomGameConfig.Vote value2 = oooO00o2.OooO00o().f25037Oooo0oO.getValue();
                        if (value2 != null && value2.getStatus() == RoomVoteDialog.VoteStatus.Running.OooO00o()) {
                            z = true;
                        }
                        if (z) {
                            LiveEventBus.get("PARTICIPATE_IN_THE_GAME").post(null);
                        } else {
                            int i4 = VoteGameCreateActivity.f26755OooOo;
                            MixedRoomActivity context = this$0.f27921OooO0oO;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) VoteGameCreateActivity.class));
                        }
                        this$0.OooO0OO();
                        break;
                    case 5:
                        MutableLiveData<Long> mutableLiveData = oooO00o2.OooO00o().f25001OooO0Oo;
                        Long value3 = oooO00o2.OooO00o().OooO0oO().getValue();
                        o0OO000.OooO0O0("102030", MapsKt.hashMapOf(new Pair("lucknum", Integer.valueOf((value3 != null && value3.longValue() == -1) ? 0 : 1)), new Pair("source", mutableLiveData)));
                        if (this$0.f27922OooO0oo != null) {
                            OooOo.OooO0OO(113, null);
                        }
                        this$0.OooO0OO();
                        break;
                    case 6:
                        o0OO000.OooO00o("102032");
                        o00Oo00 o00oo00 = this$0.f27921OooO0oO.f23452OoooO0.f48476OooO0Oo;
                        if (o00oo00 != null) {
                            o0oOOo onLogin = new o0oOOo(o00oo00);
                            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                            o000000O o000000o2 = o000000O.f46674OooO00o;
                            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                                onLogin.invoke();
                            } else {
                                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                                if (activityOooO0O0 != null) {
                                    int i5 = LoginActivity.f25186OooOo0O;
                                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                                }
                            }
                        }
                        this$0.OooO0OO();
                        break;
                }
            }
        };
        oooO00o.OooO00o().f25017OooOo0.observe(mActivity, new OooO0OO(new com.yalla.yalla.ui.dialog.OooO0OO(this)));
        ((MutableLiveData) oooO00o.OooO00o().f25029Oooo0.getValue()).observe(mActivity, new OooO0OO(new OooO0o(this)));
        oooO00o.OooO00o().OooO().observe(mActivity, new OooO0OO(new OooO(this)));
        oooO00o.OooO00o().OooO0o().observe(mActivity, new OooO0OO(new OooOO0(this)));
        oooO00o.OooO00o().OooO0oo().observe(mActivity, new OooO0OO(new OooOO0O(this)));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mActivity), null, null, new OooOOO0(this, null), 3, null);
        oooO00o.OooO00o().f25041OoooO00.observe(mActivity, new OooO0OO(new OooOOO(this)));
        LiveEventBus.get("MORA_RED_POINT").observe(mActivity, new OooOOOO(this));
    }

    public static final void OooOOO0(RoomGameBoxDialog roomGameBoxDialog, boolean z, GameType gameType) {
        List<GameType> list = roomGameBoxDialog.f27926OooOOO;
        if (z) {
            if (!list.contains(gameType)) {
                Iterator<GameType> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        if (it.next().getValue() > gameType.getValue()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (i > -1) {
                    list.add(i, gameType);
                }
            }
        } else if (list.contains(gameType)) {
            list.remove(gameType);
        }
        ((o000O) roomGameBoxDialog.f27920OooO.getValue()).OooOoO0(list);
    }
}
