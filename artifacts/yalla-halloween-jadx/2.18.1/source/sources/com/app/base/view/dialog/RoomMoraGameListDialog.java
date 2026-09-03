package com.app.base.view.dialog;

import android.util.SparseIntArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.protobuf.room.Room;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o00OOO00.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0O0O;
import p143o00OOooo.o00O0OO0;
import p143o00OOooo.o00oOoo;
import p146o00Oo000.OooO0O0;
import p159o00OoOO.o00000;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p176o00OoooO.oO000Oo;
import p176o00OoooO.oO000Oo0;
import p176o00OoooO.oO000o00;
import p176o00OoooO.oO00O0o0;
import p176o00OoooO.oO0O0OoO;
import p188o00o00o0.OooO0OO;
import p248o00oo0o.o000000O;
import p254o00ooO0O.o000O0O0;
import p530o0o0OOO.o00OO00O;
import p530o0o0OOO.o00OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class RoomMoraGameListDialog extends OooO0O0<String, String> {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f12160OoooOo0 = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final TextView f12161OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f12162OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final XRefreshLayout f12163OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0OO<Room.RoshamboModel> f12164OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Observer<Integer> f12165OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final Observer<List<Room.RoshamboModel>> f12166OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final Observer<o00OOO00> f12167o000oOoO;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/app/base/view/dialog/RoomMoraGameListDialog$GuessType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "PublicGuessing", "ChallengeGuessing", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
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
        int i = 0;
        this.f12162OoooO0 = activity;
        XRefreshLayout xRefreshLayout = (XRefreshLayout) findViewById(R.id.xrl_room_mora_game);
        this.f12163OoooO0O = xRefreshLayout;
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) findViewById(R.id.rv_room_mora_game);
        this.f12161OoooO = (TextView) findViewById(R.id.tv_mora_total);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        oO000o00 oo000o00 = new oO000o00(this, activity);
        this.f12164OoooOO0 = oo000o00;
        oo000o00.setMultiTypeDelegate(new oO0O0OoO());
        o000000O<Room.RoshamboModel> multiTypeDelegate = oo000o00.getMultiTypeDelegate();
        int value = GuessType.PublicGuessing.getValue();
        if (multiTypeDelegate.f34189OooO00o == null) {
            multiTypeDelegate.f34189OooO00o = new SparseIntArray();
        }
        multiTypeDelegate.f34189OooO00o.put(value, R.layout.dialog_room_bottom_game_box_mora_list_item);
        int value2 = GuessType.ChallengeGuessing.getValue();
        if (multiTypeDelegate.f34189OooO00o == null) {
            multiTypeDelegate.f34189OooO00o = new SparseIntArray();
        }
        multiTypeDelegate.f34189OooO00o.put(value2, R.layout.dialog_room_bottom_game_box_mora_list_item_2);
        int i2 = 1;
        oo000o00.setFirstLoading(true);
        oo000o00.setLoadErrorClickListener(new oO00O0o0(this));
        oo000o00.setOnItemClickListener(new oO000Oo0(this));
        xRefreshLayout.setNoMoreDataTextColor(o000O0O0.OooO00o(R.color.color_999999));
        fixedRecyclerView.setLayoutManager(new FixLinearLayoutManager(activity));
        fixedRecyclerView.setAdapter(oo000o00);
        xRefreshLayout.setOnRefreshListener(new oO000Oo(this, i));
        xRefreshLayout.setOnLoadMoreListener(new o00000(this, i2));
        o00O0OO0 o00o0oo1 = new o00O0OO0(this, i2);
        this.f12165OoooOOO = o00o0oo1;
        o00oOoo o00oooo2 = new o00oOoo(this, i2);
        this.f12167o000oOoO = o00oooo2;
        o00O0O0O o00o0o0o2 = new o00O0O0O(this, i2);
        this.f12166OoooOOo = o00o0o0o2;
        oo0O.OooO0OO.f53327OooO00o.OooO0o0(activity, new OooO00o(this, 2));
        o00OO00O o00oo00oOooO00o = o00OO00O.f43313OooooOo.OooO00o();
        o00oo00oOooO00o.f43343OooOoo0.observe(activity, o00o0oo1);
        o00oo00oOooO00o.f43342OooOoo.observe(activity, o00oooo2);
        o00oo00oOooO00o.f43339OooOoO.observe(activity, o00o0o0o2);
    }

    public static void OooOOO(RoomMoraGameListDialog roomMoraGameListDialog) {
        Objects.requireNonNull(roomMoraGameListDialog);
        o00O000.OooO().OooOOo0(0L, true);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_room_bottom_game_box_mora_list;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
    }

    public final void OooOOOO(int i, ImageView imageView) {
        if (!(1 <= i && i < 10)) {
            imageView.setVisibility(8);
            return;
        }
        Object obj = ((ArrayList) o000O00O.OooO().OooOO0o()).get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "MixedRoomDataSource.getI….numberImageList[giftNum]");
        imageView.setImageResource(((Number) obj).intValue());
        imageView.setVisibility(0);
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(@Nullable View view) {
    }

    @Override // p146o00Oo000.OooO0O0, android.app.Dialog
    public final void show() {
        super.show();
        oo0O.OooO0OO.f53327OooO00o.OooO0Oo(false);
    }
}
