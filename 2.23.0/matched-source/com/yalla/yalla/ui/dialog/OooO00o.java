package com.yalla.yalla.ui.dialog;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.android.billingclient.api.o0000OO0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;
import p480o0o000Oo.o0OOO0o;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o000O<RoomGameBoxDialog.GameType> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27847OooOoo0;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.dialog.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C0331OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomGameBoxDialog.GameType.values().length];
            try {
                iArr[RoomGameBoxDialog.GameType.GameMora.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomGameBoxDialog.GameType.GameLuckyGolds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoomGameBoxDialog.GameType.GameTurntable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RoomGameBoxDialog.GameType.GameVote.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RoomGameBoxDialog.GameType.GameLuckyNumber.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RoomGameBoxDialog.GameType.GameCamel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(RoomGameBoxDialog roomGameBoxDialog, MixedRoomActivity mixedRoomActivity, int i) {
        super(mixedRoomActivity, i);
        this.f27847OooOoo0 = roomGameBoxDialog;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        int i;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomGameBoxDialog.GameType gameType = (RoomGameBoxDialog.GameType) obj;
        if (viewHolder == null || gameType == null) {
            return;
        }
        int i2 = oO00O0oO.ivGameDetail;
        View view = viewHolder.getView(i2);
        Intrinsics.checkNotNullExpressionValue(view, "helper.getView<ImageView>(R.id.ivGameDetail)");
        o000OO00.OooOOOO(view);
        int i3 = oO00O0oO.vMoraPoint;
        viewHolder.setGone(i3, false);
        int i4 = oO00O0oO.tvLuckyNumberSettings;
        viewHolder.setGone(i4, false);
        int i5 = oO00O0oO.tvLuckyNumberCost;
        viewHolder.setGone(i5, false);
        int i6 = oO00O0oO.ivLimit;
        viewHolder.setGone(i6, false);
        switch (C0331OooO00o.$EnumSwitchMapping$0[gameType.ordinal()]) {
            case 1:
                o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                String str = o000000O.OooOOo0().getValue() + "MORA_RED_POINT";
                SharedPreferences sharedPreferences = o0ooo0oOooO0O0.f47688OooO00o;
                viewHolder.setGone(i3, (sharedPreferences == null ? 0L : sharedPreferences.getLong(str, 0L)) != 0);
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.ic_room_game_box_mora);
                viewHolder.setText(oO00O0oO.tvGameDescribe, o0000.OooO0OO(oO00OOo0.mora));
                break;
            case 2:
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.ic_room_game_box_lucky_golds);
                viewHolder.setGone(i6, true);
                ((ImageView) viewHolder.getView(i6)).setImageResource(oOo00OO0.ic_gift_tag_vip);
                viewHolder.setText(oO00O0oO.tvGameDescribe, o0000.OooO0OO(oO00OOo0.Lucky_Bag));
                break;
            case 3:
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.ic_room_game_box_turntable);
                viewHolder.setText(oO00O0oO.tvGameDescribe, o0000.OooO0OO(oO00OOo0.room_game_box_lucky_wheel));
                break;
            case 4:
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.ic_room_game_box_vote);
                viewHolder.setText(oO00O0oO.tvGameDescribe, o0000.OooO0OO(oO00OOo0.room_vote_game_page_title));
                break;
            case 5:
                ImageView imageView = (ImageView) viewHolder.getView(i2);
                RoomGameBoxDialog roomGameBoxDialog = this.f27847OooOoo0;
                int i7 = roomGameBoxDialog.f27924OooOO0O;
                if (i7 == 1) {
                    i = oOo00OO0.ic_room_game_box_lucky_number_9;
                } else if (i7 != 2) {
                    i = i7 != 3 ? oOo00OO0.ic_room_game_box_lucky_number_9 : oOo00OO0.ic_room_game_box_lucky_number_999;
                } else {
                    i = oOo00OO0.ic_room_game_box_lucky_number_99;
                }
                imageView.setImageResource(i);
                viewHolder.setGone(i5, roomGameBoxDialog.f27923OooOO0);
                TextView tvCenterLuckyNumber = (TextView) viewHolder.getView(i5);
                Intrinsics.checkNotNullExpressionValue(tvCenterLuckyNumber, "tvCenterLuckyNumber");
                int i8 = roomGameBoxDialog.f27925OooOO0o;
                tvCenterLuckyNumber.setVisibility(0);
                MixedRoomActivity mixedRoomActivity = roomGameBoxDialog.f27921OooO0oO;
                if (i8 == 0) {
                    tvCenterLuckyNumber.setText(mixedRoomActivity.getString(oO00OOo0.Free_lucky_number));
                    int i9 = oO00O0o.color_CCCCCC;
                    Object obj2 = ContextCompat.f5271OooO00o;
                    tvCenterLuckyNumber.setTextColor(ContextCompat.OooO0o.OooO00o(mixedRoomActivity, i9));
                    tvCenterLuckyNumber.setCompoundDrawables(null, null, null, null);
                } else if (i8 == 2 || i8 == 5) {
                    tvCenterLuckyNumber.setText(String.valueOf(i8));
                    int i10 = oO00O0o.color_ffe024;
                    Object obj3 = ContextCompat.f5271OooO00o;
                    tvCenterLuckyNumber.setTextColor(ContextCompat.OooO0o.OooO00o(mixedRoomActivity, i10));
                    Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(mixedRoomActivity, oOo00OO0.coin_little);
                    if (drawableOooO0O0 != null) {
                        int iOooO00o = o0000O0.OooO00o(12);
                        drawableOooO0O0.setBounds(new Rect(0, 0, iOooO00o, iOooO00o));
                        tvCenterLuckyNumber.setCompoundDrawables(drawableOooO0O0, null, null, null);
                    }
                }
                int i11 = oO00O0oO.tvGameDescribe;
                TextView textView = (TextView) viewHolder.getView(i11);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                textView.setLayoutParams(layoutParams2);
                viewHolder.setText(i11, o0000.OooO0OO(oO00OOo0.Lucky_Number_GameName));
                TextView it = (TextView) viewHolder.getView(i4);
                Integer value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue();
                if (value != null && value.intValue() == 1) {
                    boolean z = roomGameBoxDialog.f27923OooOO0;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (z) {
                        o000OO00.OooOOOO(it);
                    } else {
                        o000OO00.OooO0O0(it);
                    }
                } else if (value != null && value.intValue() == 2) {
                    boolean z2 = roomGameBoxDialog.f27927OooOOO0;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (z2) {
                        o000OO00.OooOOOO(it);
                    } else {
                        o000OO00.OooO0O0(it);
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    o000OO00.OooO0O0(it);
                }
                o000OO00.OooO(it, new OooO0O0(roomGameBoxDialog));
                break;
            case 6:
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.ic_room_game_box_camel);
                viewHolder.setText(oO00O0oO.tvGameDescribe, o0000.OooO0OO(oO00OOo0.Camel_racing));
                break;
        }
    }
}
