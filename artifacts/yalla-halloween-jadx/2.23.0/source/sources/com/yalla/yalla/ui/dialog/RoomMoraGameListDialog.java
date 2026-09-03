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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203o00o0o0o.o00O0;
import p203o00o0o0o.o00O0O00;
import p385o0OOooOO.oOO00O;
import p485o0o00O0.oOOo0000;
import p519o0o0O0oO.u1;
import p519o0o0O0oO.v1;
import p519o0o0O0oO.w1;
import p519o0o0O0oO.x1;
import p519o0o0O0oO.y1;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RoomMoraGameListDialog extends p391o0Oo0.OooOO0<String, String> {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ int f27951OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f27952OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final XRefreshLayout f27953OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final TextView f27954OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Oooo0 f27955OooOO0o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/dialog/RoomMoraGameListDialog$GuessType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "PublicGuessing", "ChallengeGuessing", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum GuessType {
        PublicGuessing(0),
        ChallengeGuessing(1);

        private int value;

        GuessType(int i) {
            this.value = i;
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
        this.f27952OooO = activity;
        XRefreshLayout xRefreshLayout = (XRefreshLayout) findViewById(oO00O0oO.xrl_room_mora_game);
        this.f27953OooOO0 = xRefreshLayout;
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) findViewById(oO00O0oO.rv_room_mora_game);
        this.f27954OooOO0O = (TextView) findViewById(oO00O0oO.tv_mora_total);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        Oooo0 oooo0 = new Oooo0(this, activity);
        this.f27955OooOO0o = oooo0;
        o000oOoO o000oooo2 = new o000oOoO();
        oooo0.f10114OooOo0O = o000oooo2;
        o000oooo2.OooO0O0(GuessType.PublicGuessing.getValue(), oO00OO0O.dialog_room_bottom_game_box_mora_list_item);
        o000oooo2.OooO0O0(GuessType.ChallengeGuessing.getValue(), oO00OO0O.dialog_room_bottom_game_box_mora_list_item_2);
        oooo0.Oooo00O(true);
        oooo0.Oooo0OO(new u1(this));
        oooo0.f10098OooO0o = new oOOo0000(this);
        xRefreshLayout.setNoMoreDataTextColor(o0000.OooO00o(oO00O0o.color_999999));
        fixedRecyclerView.setLayoutManager(new FixLinearLayoutManager(activity));
        fixedRecyclerView.setAdapter(oooo0);
        xRefreshLayout.setOnRefreshListener(new o00O0(this));
        xRefreshLayout.setOnLoadMoreListener(new o00O0O00(this));
        v1 v1Var = new v1(this);
        w1 w1Var = new w1(this);
        x1 x1Var = new x1(this);
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
        oOO00O.OooO0o0(activity, new y1(this));
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o();
        oooO0O0OooO00o.f25019OooOo0O.observe(activity, v1Var);
        oooO0O0OooO00o.f25020OooOo0o.observe(activity, w1Var);
        oooO0O0OooO00o.f25018OooOo00.observe(activity, x1Var);
    }

    public static void OooOO0o(long j, boolean z) {
        Long lValueOf = Long.valueOf(j);
        Room.RoshamboListRequest.Builder builderNewBuilder = Room.RoshamboListRequest.newBuilder();
        builderNewBuilder.setListkind(!z ? 1 : 0);
        Intrinsics.checkNotNull(lValueOf);
        builderNewBuilder.setMorauuid(lValueOf.longValue());
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10065, builderNewBuilder.build().toByteArray());
        }
    }

    public static void OooOOO0(ImageView imageView, int i) {
        if (!(1 <= i && i < 10)) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(p407o0Oo0o00.OooO0o.f45170OooO0Oo[i]);
            imageView.setVisibility(0);
        }
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_room_bottom_game_box_mora_list;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(@Nullable View view) {
    }

    @Override // p391o0Oo0.OooOO0, android.app.Dialog
    public final void show() {
        super.show();
        oOO00O.OooO0Oo(false);
    }
}
