package com.yalla.yalla.ui.dialog;

import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.o0000O0O;
import o000O00O.o000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o00O0000;
import p413o0Oo0o0o.o0O00oO0;
import p417o0Oo0oo0.o0000O00;
import p448o0OoOoo.o0O000o0;
import p450o0OoOooO.o0O0O0o0;
import p450o0OoOooO.oo0OOoo;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;
import p650o0ooo.x1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RoomMoraGameListDialog extends p401o0Oo0O00.OooO<String, String> {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ int f27488OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f27489OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final XRefreshLayout f27490OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final TextView f27491OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Oooo000 f27492OooOO0o;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 com.yalla.yalla.ui.dialog.RoomMoraGameListDialog$GuessType[], still in use, count: 1, list:
      (r3v2 com.yalla.yalla.ui.dialog.RoomMoraGameListDialog$GuessType[]) from 0x001d: INVOKE (r3v2 com.yalla.yalla.ui.dialog.RoomMoraGameListDialog$GuessType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:30)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomMoraGameListDialog$GuessType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "PublicGuessing", "ChallengeGuessing", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class GuessType {
        PublicGuessing(0),
        ChallengeGuessing(1);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(guessTypeArr);
        }

        public GuessType(int i) {
            super(str, i);
            this.value = i;
        }

        public static GuessType valueOf(String str) {
            return (GuessType) Enum.valueOf(GuessType.class, str);
        }

        public static GuessType[] values() {
            return (GuessType[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomMoraGameListDialog(MixedRoomActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27489OooO = activity;
        XRefreshLayout xRefreshLayout = (XRefreshLayout) findViewById(o0OO00O.xrl_room_mora_game);
        this.f27490OooOO0 = xRefreshLayout;
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) findViewById(o0OO00O.rv_room_mora_game);
        this.f27491OooOO0O = (TextView) findViewById(o0OO00O.tv_mora_total);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        Oooo000 oooo000 = new Oooo000(this, activity);
        this.f27492OooOO0o = oooo000;
        Oooo0 oooo0 = new Oooo0();
        oooo000.f13192OooOo0O = oooo0;
        oooo0.OooO0O0(GuessType.PublicGuessing.getValue(), oo0o0Oo.dialog_room_bottom_game_box_mora_list_item);
        oooo0.OooO0O0(GuessType.ChallengeGuessing.getValue(), oo0o0Oo.dialog_room_bottom_game_box_mora_list_item_2);
        oooo000.Oooo00O(true);
        oooo000.Oooo0OO(new x1(this));
        oooo000.f13176OooO0o = new o0000O0O(this);
        xRefreshLayout.setNoMoreDataTextColor(o0000.OooO00o(o0OOO0o.color_999999));
        fixedRecyclerView.setLayoutManager(new FixLinearLayoutManager(activity));
        fixedRecyclerView.setAdapter(oooo000);
        int i = 3;
        xRefreshLayout.setOnRefreshListener(new o00O0000(this, i));
        xRefreshLayout.setOnLoadMoreListener(new o000OO(this, i));
        int i2 = 2;
        o0O000o0 o0o000o1 = new o0O000o0(this, i2);
        o0O0O0o0 o0o0o0o0 = new o0O0O0o0(this, i2);
        o0000O00 o0000o00 = new o0000O00(this, i2);
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p391o0OOooo0.oo0o0Oo.f43573OooO00o;
        p391o0OOooo0.oo0o0Oo.OooO0o0(activity, new oo0OOoo(this, i2));
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o();
        oooO0O0OooO00o.f24557OooOo0O.observe(activity, o0o000o1);
        oooO0O0OooO00o.f24558OooOo0o.observe(activity, o0o0o0o0);
        oooO0O0OooO00o.f24556OooOo00.observe(activity, o0000o00);
    }

    public static void OooOO0o(long j, boolean z) {
        Long lValueOf = Long.valueOf(j);
        Room.RoshamboListRequest.Builder builderNewBuilder = Room.RoshamboListRequest.newBuilder();
        builderNewBuilder.setListkind(!z ? 1 : 0);
        Intrinsics.checkNotNull(lValueOf);
        builderNewBuilder.setMorauuid(lValueOf.longValue());
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10065, builderNewBuilder.build().toByteArray());
        }
    }

    public static void OooOOO0(ImageView imageView, int i) {
        if (!(1 <= i && i < 10)) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(o0O00oO0.f46386OooO0Oo[i]);
            imageView.setVisibility(0);
        }
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_room_bottom_game_box_mora_list;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(@Nullable View view) {
    }

    @Override // p401o0Oo0O00.OooO, android.app.Dialog
    public final void show() {
        super.show();
        p391o0OOooo0.oo0o0Oo.OooO0Oo(false);
    }
}
