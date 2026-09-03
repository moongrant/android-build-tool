package com.yalla.yalla.ui.dialog;

import android.view.LayoutInflater;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000O0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o0000OO0;
import p407o0Oo0OOO.r;
import p444o0OoOo0O.o0000O;
import p450o0OoOoo.o0O0ooO;
import p493o0o00O0o.oO00o000;
import p512o0o00ooo.o00O0O00;
import p565o0oOo000.o000000;
import p565o0oOo000.o0OO00O;
import p570o0oOo0o.o000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomGameBoxDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGameBoxDialog.kt\ncom/yalla/yalla/ui/dialog/RoomGameBoxDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n350#2,7:361\n*S KotlinDebug\n*F\n+ 1 RoomGameBoxDialog.kt\ncom/yalla/yalla/ui/dialog/RoomGameBoxDialog\n*L\n246#1:361,7\n*E\n"})
public final class RoomGameBoxDialog extends o0000OO0<RoomGameBoxDialog> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f27466OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f27467OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o0000O f27468OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f27469OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f27470OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f27471OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final List<GameType> f27472OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f27473OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f27474OooOOOO;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 com.yalla.yalla.ui.dialog.RoomGameBoxDialog$GameType[], still in use, count: 1, list:
      (r11v2 com.yalla.yalla.ui.dialog.RoomGameBoxDialog$GameType[]) from 0x004d: INVOKE (r11v2 com.yalla.yalla.ui.dialog.RoomGameBoxDialog$GameType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:78)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomGameBoxDialog$GameType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "GameMora", "GameLuckyGolds", "GameTurntable", "GameVote", "GameLuckyNumber", "GameCamel", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class GameType {
        GameMora(0),
        GameLuckyGolds(1),
        GameTurntable(2),
        GameVote(3),
        GameLuckyNumber(4),
        GameCamel(5);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private final int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(gameTypeArr);
        }

        public GameType(int i) {
            super(str, i);
            this.value = i;
        }

        public static GameType valueOf(String str) {
            return (GameType) Enum.valueOf(GameType.class, str);
        }

        public static GameType[] values() {
            return (GameType[]) $VALUES.clone();
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
            return new com.yalla.yalla.ui.dialog.OooO00o(roomGameBoxDialog, roomGameBoxDialog.f27467OooO0oO, o0OO00O.room_item_game_box_dialog);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27476OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27476OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27476OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27476OooO0Oo;
        }

        public final int hashCode() {
            return this.f27476OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27476OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomGameBoxDialog(@NotNull MixedRoomActivity mActivity, @Nullable o0000O o0000o2) {
        Integer value;
        super(mActivity);
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        this.f27467OooO0oO = mActivity;
        this.f27468OooO0oo = o0000o2;
        r rVarInflate = r.inflate(LayoutInflater.from(mActivity), this.f38484OooO0OO, true);
        Intrinsics.checkNotNullExpressionValue(rVarInflate, "inflate(...)");
        Lazy lazy = LazyKt.lazy(new OooO0O0());
        this.f27466OooO = lazy;
        this.f27470OooOO0O = 1;
        GameType gameType = GameType.GameMora;
        GameType gameType2 = GameType.GameTurntable;
        int i = 2;
        GameType gameType3 = GameType.GameVote;
        GameType gameType4 = GameType.GameCamel;
        List<GameType> listMutableListOf = CollectionsKt.mutableListOf(gameType, GameType.GameLuckyGolds, gameType2, gameType3, GameType.GameLuckyNumber, gameType4);
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
        if (Intrinsics.areEqual(oooO00o.OooO00o().f24563OooOo0.getValue(), Boolean.FALSE)) {
            listMutableListOf.remove(gameType);
        }
        Integer num = (Integer) ((MutableLiveData) oooO00o.OooO00o().f24575Oooo0.getValue()).getValue();
        if (num == null || num.intValue() != 1 || (value = oooO00o.OooO00o().f24554OooOO0o.getValue()) == null || value.intValue() != 1) {
            listMutableListOf.remove(gameType2);
        }
        if (!oooO00o.OooO00o().OooOOO() && !oooO00o.OooO00o().OooOO0o()) {
            listMutableListOf.remove(gameType3);
        }
        if (!Intrinsics.areEqual(oooO00o.OooO00o().f24587OoooO00.getValue(), Boolean.TRUE)) {
            listMutableListOf.remove(gameType4);
        }
        this.f27472OooOOO = listMutableListOf;
        OooO0oo();
        int i2 = o000000.anim_bottom_top_bottom;
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            windowOooO0Oo.setWindowAnimations(i2);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        rVarInflate.f45413OooO0O0.addItemDecoration(new o00O0O00(o0000O0.OooO00o(3)));
        FixGridLayoutManager fixGridLayoutManager = new FixGridLayoutManager(this.f38482OooO00o, listMutableListOf.size() < 4 ? listMutableListOf.size() : 4);
        FixedRecyclerView fixedRecyclerView = rVarInflate.f45413OooO0O0;
        fixedRecyclerView.setLayoutManager(fixGridLayoutManager);
        fixedRecyclerView.setAdapter((o000O0) lazy.getValue());
        ((o000O0) lazy.getValue()).f13187OooO0o = new oO00o000(this, i);
        oooO00o.OooO00o().f24563OooOo0.observe(mActivity, new OooO0OO(new com.yalla.yalla.ui.dialog.OooO0OO(this)));
        ((MutableLiveData) oooO00o.OooO00o().f24575Oooo0.getValue()).observe(mActivity, new OooO0OO(new OooO0o(this)));
        oooO00o.OooO00o().OooO().observe(mActivity, new OooO0OO(new OooO(this)));
        oooO00o.OooO00o().OooO0o().observe(mActivity, new OooO0OO(new OooOO0(this)));
        oooO00o.OooO00o().OooO0oo().observe(mActivity, new OooO0OO(new OooOO0O(this)));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mActivity), null, null, new OooOOO0(this, null), 3, null);
        oooO00o.OooO00o().f24587OoooO00.observe(mActivity, new OooO0OO(new OooOOO(this)));
        LiveEventBus.get("MORA_RED_POINT").observe(mActivity, new o0O0ooO(this, 1));
    }

    public final void OooOOO0(boolean z, GameType gameType) {
        List<GameType> list = this.f27472OooOOO;
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
        ((o000O0) this.f27466OooO.getValue()).OooOoO0(list);
    }
}
