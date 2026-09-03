package com.yalla.yalla.ui.dialog;

import android.view.LayoutInflater;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p144o00OOooo.o00O0OO;
import p144o00OOooo.o00OO00O;
import p144o00OOooo.oo0oOO0;
import p160o00OoOO.o000O;
import p163o00OoOOo.o0OoOoOo;
import p177o00OoooO.oO00o00O;
import p256o00ooO0o.o00O00OO;
import p526o0o0O0oO.oo00oO;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p568o0oOo00O.oO0000o0;
import p572o0oOo0Oo.o000O0;
import p651o0ooOOoo.lf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class RoomGameBoxDialog extends o00O00OO<RoomGameBoxDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f23764OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f23765OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o0OoOoOo f23766OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f23767OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f23768OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f23769OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final List<GameType> f23770OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f23771OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f23772OooOOOO;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomGameBoxDialog$GameType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "GameMora", "GameLuckyGolds", "GameTurntable", "GameVote", "GameLuckyNumber", "GameCamel", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
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
            iArr[GameType.GameMora.ordinal()] = 1;
            iArr[GameType.GameLuckyGolds.ordinal()] = 2;
            iArr[GameType.GameTurntable.ordinal()] = 3;
            iArr[GameType.GameVote.ordinal()] = 4;
            iArr[GameType.GameLuckyNumber.ordinal()] = 5;
            iArr[GameType.GameCamel.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yalla.yalla.ui.dialog.OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.dialog.OooO00o invoke() {
            return new com.yalla.yalla.ui.dialog.OooO00o(RoomGameBoxDialog.this, RoomGameBoxDialog.this.f23765OooO0oO);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomGameBoxDialog(@NotNull MixedRoomActivity mContext, @Nullable o0OoOoOo o0oooooo2) {
        Integer value;
        super(mContext);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f23765OooO0oO = mContext;
        this.f23766OooO0oo = o0oooooo2;
        lf lfVarInflate = lf.inflate(LayoutInflater.from(mContext), this.f34223OooO0OO, true);
        Intrinsics.checkNotNullExpressionValue(lfVarInflate, "inflate(LayoutInflater.f…Context), rootView, true)");
        this.f23764OooO = LazyKt.lazy(new OooO0O0());
        this.f23768OooOO0O = 1;
        int i = 6;
        GameType gameType = GameType.GameMora;
        GameType gameType2 = GameType.GameTurntable;
        GameType gameType3 = GameType.GameVote;
        int i2 = 4;
        GameType gameType4 = GameType.GameCamel;
        List<GameType> listMutableListOf = CollectionsKt.mutableListOf(gameType, GameType.GameLuckyGolds, gameType2, gameType3, GameType.GameLuckyNumber, gameType4);
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
        if (Intrinsics.areEqual(oooO00o.OooO00o().f43366OooOoOO.getValue(), Boolean.FALSE)) {
            listMutableListOf.remove(gameType);
        }
        Integer value2 = oooO00o.OooO00o().OooOO0().getValue();
        if (value2 == null || value2.intValue() != 1 || (value = oooO00o.OooO00o().f43354OooOOOO.getValue()) == null || value.intValue() != 1) {
            listMutableListOf.remove(gameType2);
        }
        if (!oooO00o.OooO00o().OooOOo0() && !oooO00o.OooO00o().OooOOOO()) {
            listMutableListOf.remove(gameType3);
        }
        if (!Intrinsics.areEqual(oooO00o.OooO00o().f43390OoooOoO.getValue(), Boolean.TRUE)) {
            listMutableListOf.remove(gameType4);
        }
        this.f23770OooOOO = listMutableListOf;
        OooO();
        Window windowOooO0o0 = OooO0o0();
        if (windowOooO0o0 != null) {
            windowOooO0o0.setWindowAnimations(R.style.anim_bottom_top_bottom);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        lfVarInflate.f49970OooO0O0.addItemDecoration(new o000O0(OooOo00.OooO00o(3.0f)));
        lfVarInflate.f49970OooO0O0.setLayoutManager(new FixGridLayoutManager(this.f34221OooO00o, listMutableListOf.size() >= 4 ? 4 : listMutableListOf.size()));
        lfVarInflate.f49970OooO0O0.setAdapter(OooOOO());
        OooOOO().setOnItemClickListener(new o00OOO00.OooO0O0(this, 4));
        oooO00o.OooO00o().f43366OooOoOO.observe(mContext, new oO0000o0(this, 1));
        oooO00o.OooO00o().OooOO0().observe(mContext, new oo00oO(this, i2));
        oooO00o.OooO00o().OooOO0O().observe(mContext, new oO00o00O(this, 5));
        oooO00o.OooO00o().OooO0oO().observe(mContext, new o000O(this, i));
        oooO00o.OooO00o().OooO().observe(mContext, new o00OO00O(this, i));
        o00OO000.OooOOO0 oooOOO0 = o00OO000.OooOOO0.f43286OooO00o;
        o00OO000.OooOOO0.f43287OooO0O0.observe(mContext, new o00O0OO(this, 5));
        oooO00o.OooO00o().f43390OoooOoO.observe(mContext, new p144o00OOooo.o00OO000(this, 5));
        LiveEventBus.get("MORA_RED_POINT").observe(mContext, new oo0oOO0(this, 6));
    }

    public final p189o00o00o0.OooO0OO<GameType> OooOOO() {
        return (p189o00o00o0.OooO0OO) this.f23764OooO.getValue();
    }

    public final void OooOOOO(boolean z, GameType gameType) {
        if (z) {
            if (!this.f23770OooOOO.contains(gameType)) {
                Iterator<GameType> it = this.f23770OooOOO.iterator();
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
                    this.f23770OooOOO.add(i, gameType);
                }
            }
        } else if (this.f23770OooOOO.contains(gameType)) {
            this.f23770OooOOO.remove(gameType);
        }
        OooOOO().setNewData(this.f23770OooOOO);
    }
}
