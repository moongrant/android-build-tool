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
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p270o00oooo0.o0O0OO0;
import p474o0OoooOO.oo0oO0;
import p487o0o000oO.o0000;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0Oo0oo;
import p565o0oOo000.o0ooOOo;
import p570o0oOo0o.o000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o000O0<RoomGameBoxDialog.GameType> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27394OooOoo0;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.dialog.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C0330OooO00o {
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
        this.f27394OooOoo0 = roomGameBoxDialog;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        int i;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomGameBoxDialog.GameType gameType = (RoomGameBoxDialog.GameType) obj;
        if (viewHolder == null || gameType == null) {
            return;
        }
        int i2 = o0Oo0oo.ivGameDetail;
        View view = viewHolder.getView(i2);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        o000O.OooOOOO(view);
        int i3 = o0Oo0oo.vMoraPoint;
        viewHolder.setGone(i3, false);
        int i4 = o0Oo0oo.tvLuckyNumberSettings;
        viewHolder.setGone(i4, false);
        int i5 = o0Oo0oo.tvLuckyNumberCost;
        viewHolder.setGone(i5, false);
        int i6 = o0Oo0oo.ivLimit;
        viewHolder.setGone(i6, false);
        switch (C0330OooO00o.$EnumSwitchMapping$0[gameType.ordinal()]) {
            case 1:
                o0000 o0000VarOooO0O0 = o0O0OO0.OooO0O0();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String str = oo0oO0.OooOOo0().getValue() + "MORA_RED_POINT";
                SharedPreferences sharedPreferences = o0000VarOooO0O0.f48716OooO00o;
                viewHolder.setGone(i3, (sharedPreferences == null ? 0L : sharedPreferences.getLong(str, 0L)) != 0);
                ((ImageView) viewHolder.getView(i2)).setImageResource(o0OOO0o.ic_room_game_box_mora);
                viewHolder.setText(o0Oo0oo.tvGameDescribe, com.code.android.util.o0000.OooO0OO(o000OOo.mora));
                break;
            case 2:
                ((ImageView) viewHolder.getView(i2)).setImageResource(o0OOO0o.ic_room_game_box_lucky_golds);
                viewHolder.setGone(i6, true);
                ((ImageView) viewHolder.getView(i6)).setImageResource(o0OOO0o.ic_gift_tag_vip);
                viewHolder.setText(o0Oo0oo.tvGameDescribe, com.code.android.util.o0000.OooO0OO(o000OOo.Lucky_Bag));
                break;
            case 3:
                ((ImageView) viewHolder.getView(i2)).setImageResource(o0OOO0o.ic_room_game_box_turntable);
                viewHolder.setText(o0Oo0oo.tvGameDescribe, com.code.android.util.o0000.OooO0OO(o000OOo.room_game_box_lucky_wheel));
                break;
            case 4:
                ((ImageView) viewHolder.getView(i2)).setImageResource(o0OOO0o.ic_room_game_box_vote);
                viewHolder.setText(o0Oo0oo.tvGameDescribe, com.code.android.util.o0000.OooO0OO(o000OOo.room_vote_game_page_title));
                break;
            case 5:
                ImageView imageView = (ImageView) viewHolder.getView(i2);
                RoomGameBoxDialog roomGameBoxDialog = this.f27394OooOoo0;
                int i7 = roomGameBoxDialog.f27470OooOO0O;
                if (i7 == 1) {
                    i = o0OOO0o.ic_room_game_box_lucky_number_9;
                } else if (i7 != 2) {
                    i = i7 != 3 ? o0OOO0o.ic_room_game_box_lucky_number_9 : o0OOO0o.ic_room_game_box_lucky_number_999;
                } else {
                    i = o0OOO0o.ic_room_game_box_lucky_number_99;
                }
                imageView.setImageResource(i);
                viewHolder.setGone(i5, roomGameBoxDialog.f27469OooOO0);
                TextView textView = (TextView) viewHolder.getView(i5);
                Intrinsics.checkNotNull(textView);
                int i8 = roomGameBoxDialog.f27471OooOO0o;
                textView.setVisibility(0);
                MixedRoomActivity mixedRoomActivity = roomGameBoxDialog.f27467OooO0oO;
                if (i8 == 0) {
                    textView.setText(mixedRoomActivity.getString(o000OOo.Free_lucky_number));
                    int i9 = o0ooOOo.color_CCCCCC;
                    Object obj2 = ContextCompat.f5284OooO00o;
                    textView.setTextColor(ContextCompat.OooO0o.OooO00o(mixedRoomActivity, i9));
                    textView.setCompoundDrawables(null, null, null, null);
                } else if (i8 == 2 || i8 == 5) {
                    textView.setText(String.valueOf(i8));
                    int i10 = o0ooOOo.color_ffe024;
                    Object obj3 = ContextCompat.f5284OooO00o;
                    textView.setTextColor(ContextCompat.OooO0o.OooO00o(mixedRoomActivity, i10));
                    Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(mixedRoomActivity, o0OOO0o.coin_little);
                    if (drawableOooO0O0 != null) {
                        int iOooO00o = o0000O0.OooO00o(12);
                        drawableOooO0O0.setBounds(new Rect(0, 0, iOooO00o, iOooO00o));
                        textView.setCompoundDrawables(drawableOooO0O0, null, null, null);
                    }
                }
                int i11 = o0Oo0oo.tvGameDescribe;
                TextView textView2 = (TextView) viewHolder.getView(i11);
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                textView2.setLayoutParams(layoutParams2);
                viewHolder.setText(i11, com.code.android.util.o0000.OooO0OO(o000OOo.Lucky_Number_GameName));
                TextView textView3 = (TextView) viewHolder.getView(i4);
                Integer value = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24554OooOO0o.getValue();
                if (value != null && value.intValue() == 1) {
                    boolean z = roomGameBoxDialog.f27469OooOO0;
                    Intrinsics.checkNotNull(textView3);
                    if (z) {
                        o000O.OooOOOO(textView3);
                    } else {
                        o000O.OooO0O0(textView3);
                    }
                } else if (value != null && value.intValue() == 2) {
                    boolean z2 = roomGameBoxDialog.f27473OooOOO0;
                    Intrinsics.checkNotNull(textView3);
                    if (z2) {
                        o000O.OooOOOO(textView3);
                    } else {
                        o000O.OooO0O0(textView3);
                    }
                } else {
                    Intrinsics.checkNotNull(textView3);
                    o000O.OooO0O0(textView3);
                }
                o000O.OooO(textView3, new OooO0O0(roomGameBoxDialog));
                break;
            case 6:
                ((ImageView) viewHolder.getView(i2)).setImageResource(o0OOO0o.ic_room_game_box_camel);
                viewHolder.setText(o0Oo0oo.tvGameDescribe, com.code.android.util.o0000.OooO0OO(o000OOo.Camel_racing));
                break;
        }
    }
}
