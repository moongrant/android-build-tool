package com.yalla.yalla.ui.dialog;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.o00000O;
import com.app.base.mixedroom.MixedRoomActivity;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p166o00OoOoo.o0O00O0o;
import p254o00ooO0O.oOO00O;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends p188o00o00o0.OooO0OO<RoomGameBoxDialog.GameType> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f23741OooO00o;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.dialog.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C0259OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomGameBoxDialog.GameType.values().length];
            iArr[RoomGameBoxDialog.GameType.GameMora.ordinal()] = 1;
            iArr[RoomGameBoxDialog.GameType.GameLuckyGolds.ordinal()] = 2;
            iArr[RoomGameBoxDialog.GameType.GameTurntable.ordinal()] = 3;
            iArr[RoomGameBoxDialog.GameType.GameVote.ordinal()] = 4;
            iArr[RoomGameBoxDialog.GameType.GameLuckyNumber.ordinal()] = 5;
            iArr[RoomGameBoxDialog.GameType.GameCamel.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(RoomGameBoxDialog roomGameBoxDialog, MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, R.layout.room_item_game_box_dialog);
        this.f23741OooO00o = roomGameBoxDialog;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
        RoomGameBoxDialog.GameType gameType = (RoomGameBoxDialog.GameType) obj;
        if (oooO0o == null || gameType == null) {
            return;
        }
        View viewOooO0Oo = oooO0o.OooO0Oo(R.id.ivGameDetail);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView<ImageView>(R.id.ivGameDetail)");
        oOO00O.OooO(viewOooO0Oo);
        oooO0o.OooO0oO(R.id.vMoraPoint, false);
        oooO0o.OooO0oO(R.id.tvLuckyNumberSettings, false);
        oooO0o.OooO0oO(R.id.tvLuckyNumberCost, false);
        switch (C0259OooO00o.$EnumSwitchMapping$0[gameType.ordinal()]) {
            case 1:
                o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
                StringBuilder sb = new StringBuilder();
                sb.append(OooOOO.f41216OooO00o.OooOo().getValue());
                sb.append("MORA_RED_POINT");
                oooO0o.OooO0oO(R.id.vMoraPoint, o0o00o0oOooO0O0.OooO0O0(sb.toString(), 0L) != 0);
                ((ImageView) oooO0o.OooO0Oo(R.id.ivGameDetail)).setImageResource(R.drawable.ic_room_game_box_mora);
                oooO0o.OooOO0(R.id.tvGameDescribe, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.mora));
                break;
            case 2:
                ((ImageView) oooO0o.OooO0Oo(R.id.ivGameDetail)).setImageResource(R.drawable.ic_room_game_box_lucky_golds);
                oooO0o.OooOO0(R.id.tvGameDescribe, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Lucky_Bag));
                break;
            case 3:
                ((ImageView) oooO0o.OooO0Oo(R.id.ivGameDetail)).setImageResource(R.drawable.ic_room_game_box_turntable);
                oooO0o.OooOO0(R.id.tvGameDescribe, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_game_box_lucky_wheel));
                break;
            case 4:
                ((ImageView) oooO0o.OooO0Oo(R.id.ivGameDetail)).setImageResource(R.drawable.ic_room_game_box_vote);
                oooO0o.OooOO0(R.id.tvGameDescribe, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_vote_game_page_title));
                break;
            case 5:
                ImageView imageView = (ImageView) oooO0o.OooO0Oo(R.id.ivGameDetail);
                int i = this.f23741OooO00o.f23749OooOO0O;
                int i2 = R.drawable.ic_room_game_box_lucky_number_9;
                if (i != 1) {
                    if (i == 2) {
                        i2 = R.drawable.ic_room_game_box_lucky_number_99;
                    } else if (i == 3) {
                        i2 = R.drawable.ic_room_game_box_lucky_number_999;
                    }
                }
                imageView.setImageResource(i2);
                oooO0o.OooO0oO(R.id.tvLuckyNumberCost, this.f23741OooO00o.f23748OooOO0);
                TextView tvCenterLuckyNumber = (TextView) oooO0o.OooO0Oo(R.id.tvLuckyNumberCost);
                RoomGameBoxDialog roomGameBoxDialog = this.f23741OooO00o;
                Intrinsics.checkNotNullExpressionValue(tvCenterLuckyNumber, "tvCenterLuckyNumber");
                int i3 = this.f23741OooO00o.f23750OooOO0o;
                Objects.requireNonNull(roomGameBoxDialog);
                tvCenterLuckyNumber.setVisibility(0);
                if (i3 == 0) {
                    tvCenterLuckyNumber.setText(roomGameBoxDialog.f23746OooO0oO.getString(R.string.Free_lucky_number));
                    tvCenterLuckyNumber.setTextColor(o000O000.OooO00o.OooO0O0(roomGameBoxDialog.f23746OooO0oO, R.color.color_CCCCCC));
                    tvCenterLuckyNumber.setCompoundDrawables(null, null, null, null);
                } else if (i3 == 2 || i3 == 5) {
                    tvCenterLuckyNumber.setText(String.valueOf(i3));
                    tvCenterLuckyNumber.setTextColor(o000O000.OooO00o.OooO0O0(roomGameBoxDialog.f23746OooO0oO, R.color.color_ffe024));
                    Drawable drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(roomGameBoxDialog.f23746OooO0oO, R.drawable.coin_little);
                    if (drawableOooO0O0 != null) {
                        int iOooO00o = OooOo00.OooO00o(12.0f);
                        drawableOooO0O0.setBounds(new Rect(0, 0, iOooO00o, iOooO00o));
                        tvCenterLuckyNumber.setCompoundDrawables(drawableOooO0O0, null, null, null);
                    }
                }
                TextView textView = (TextView) oooO0o.OooO0Oo(R.id.tvGameDescribe);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                textView.setLayoutParams(layoutParams2);
                oooO0o.OooOO0(R.id.tvGameDescribe, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Lucky_Number_GameName));
                View viewOooO0Oo2 = oooO0o.OooO0Oo(R.id.tvLuckyNumberSettings);
                RoomGameBoxDialog roomGameBoxDialog2 = this.f23741OooO00o;
                TextView it = (TextView) viewOooO0Oo2;
                Integer value = o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue();
                if (value != null && value.intValue() == 1) {
                    boolean z = roomGameBoxDialog2.f23748OooOO0;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (z) {
                        oOO00O.OooO(it);
                    } else {
                        oOO00O.OooO00o(it);
                    }
                } else if (value != null && value.intValue() == 2) {
                    boolean z2 = roomGameBoxDialog2.f23752OooOOO0;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (z2) {
                        oOO00O.OooO(it);
                    } else {
                        oOO00O.OooO00o(it);
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    oOO00O.OooO00o(it);
                }
                oOO00O.OooO0oO(it, new OooO0O0(roomGameBoxDialog2));
                break;
            case 6:
                ((ImageView) oooO0o.OooO0Oo(R.id.ivGameDetail)).setImageResource(R.drawable.ic_room_game_box_camel);
                oooO0o.OooOO0(R.id.tvGameDescribe, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Camel_racing));
                break;
        }
    }
}
