package com.yalla.yalla.ui.view.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.BarInfoModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.k3;
import p423o0OoO0OO.o00O00OO;
import p423o0OoO0OO.o00O0O0O;
import p423o0OoO0OO.o00O0OOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p570o0oOoO.o000000O;
import p590o0oOooo0.oOOO00Oo;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomBroadcastViewVip6;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/RoomBroadcastModel;", "data", "", "setData", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "OooO0o0", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "getActivity", "()Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "setActivity", "(Lcom/yalla/yalla/mixedroom/MixedRoomActivity;)V", "activity", "Lkotlin/Function0;", "OooO0o", "Lkotlin/jvm/functions/Function0;", "getGoListener", "()Lkotlin/jvm/functions/Function0;", "setGoListener", "(Lkotlin/jvm/functions/Function0;)V", "goListener", "Lo0oOooo0/oOOO00Oo;", "OooO0oo", "Lkotlin/Lazy;", "getHeaderFrameLoad", "()Lo0oOooo0/oOOO00Oo;", "headerFrameLoad", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class RoomBroadcastViewVip6 extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final k3 f30770OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> goListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MixedRoomActivity activity;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public RoomBroadcastModel f30773OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy headerFrameLoad;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> goListener = RoomBroadcastViewVip6.this.getGoListener();
            if (goListener != null) {
                goListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> goListener = RoomBroadcastViewVip6.this.getGoListener();
            if (goListener != null) {
                goListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oOOO00Oo> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOOO00Oo invoke() {
            RoomBroadcastViewVip6 roomBroadcastViewVip6 = RoomBroadcastViewVip6.this;
            return new oOOO00Oo(roomBroadcastViewVip6.getActivity(), roomBroadcastViewVip6.f30770OooO0Oo.f44095OooOO0o);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastViewVip6(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final oOOO00Oo getHeaderFrameLoad() {
        return (oOOO00Oo) this.headerFrameLoad.getValue();
    }

    public final void OooO0O0() {
        k3 k3Var = this.f30770OooO0Oo;
        SVGAView sVGAView = k3Var.f44084OooO;
        Intrinsics.checkNotNull(sVGAView);
        o000O.OooOOOO(sVGAView);
        sVGAView.setBackgroundResource(o0Oo0oo.ic_broadcast_bg_vip6_middle_high);
        ViewGroup.LayoutParams layoutParams = sVGAView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(o0000O0.OooO00o(19));
        }
        SVGAView sVGAView2 = k3Var.f44093OooOO0;
        Intrinsics.checkNotNull(sVGAView2);
        o000O.OooOOOO(sVGAView2);
        sVGAView2.setBackgroundResource(o0Oo0oo.ic_broadcast_bg_vip6_content_middle);
        SVGAView sVGAView3 = k3Var.f44094OooOO0O;
        Intrinsics.checkNotNull(sVGAView3);
        o000O.OooOOOO(sVGAView3);
        sVGAView3.setImageResource(o0Oo0oo.ic_broadcast_bg_vip6_star_low);
        k3Var.f44088OooO0Oo.setImageResource(o0Oo0oo.ic_broadcast_go_middle);
    }

    @Nullable
    public final MixedRoomActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Function0<Unit> getGoListener() {
        return this.goListener;
    }

    public final void setActivity(@Nullable MixedRoomActivity mixedRoomActivity) {
        this.activity = mixedRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x035f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0448  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0238  */
    /* JADX WARN: Code duplicated, block: B:64:0x023e  */
    /* JADX WARN: Code duplicated, block: B:76:0x026d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b7  */
    public final void setData(@Nullable RoomBroadcastModel data) {
        String str;
        String userHeader;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String strOooO00o;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        View view;
        String str2;
        ImageView ivGo;
        boolean z12;
        boolean z13;
        this.f30773OooO0oO = data;
        k3 k3Var = this.f30770OooO0Oo;
        k3Var.f44098OooOOOO.setText("");
        TextView tvTitle = k3Var.f44098OooOOOO;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        o000O.OooOO0O(tvTitle, 30);
        NetImageView netImageView = k3Var.f44090OooO0o0;
        netImageView.setImageDrawable(null);
        Intrinsics.checkNotNull(netImageView);
        o000O.OooO0O0(netImageView);
        SVGAView sVGAView = k3Var.f44095OooOO0o;
        sVGAView.setImageDrawable(null);
        Intrinsics.checkNotNull(sVGAView);
        o000O.OooO0O0(sVGAView);
        SVGAView sVGAView2 = k3Var.f44091OooO0oO;
        sVGAView2.clearAnimation();
        sVGAView2.setImageDrawable(null);
        Intrinsics.checkNotNull(sVGAView2);
        o000O.OooO0O0(sVGAView2);
        o000O.OooO00o(sVGAView2);
        SVGAView sVGAView3 = k3Var.f44084OooO;
        sVGAView3.clearAnimation();
        sVGAView3.setImageDrawable(null);
        Intrinsics.checkNotNull(sVGAView3);
        o000O.OooO0O0(sVGAView3);
        o000O.OooO00o(sVGAView3);
        SVGAView sVGAView4 = k3Var.f44093OooOO0;
        sVGAView4.clearAnimation();
        sVGAView4.setImageDrawable(null);
        Intrinsics.checkNotNull(sVGAView4);
        o000O.OooO0O0(sVGAView4);
        o000O.OooO00o(sVGAView4);
        SVGAView sVGAView5 = k3Var.f44094OooOO0O;
        sVGAView5.clearAnimation();
        sVGAView5.setImageDrawable(null);
        Intrinsics.checkNotNull(sVGAView5);
        o000O.OooO0O0(sVGAView5);
        o000O.OooO00o(sVGAView5);
        View viewEnd = k3Var.f44100OooOOo;
        Intrinsics.checkNotNullExpressionValue(viewEnd, "viewEnd");
        o000O.OooO0O0(viewEnd);
        SVGAView sVGAView6 = k3Var.f44092OooO0oo;
        sVGAView6.clearAnimation();
        sVGAView6.setImageDrawable(null);
        Intrinsics.checkNotNull(sVGAView6);
        o000O.OooO0O0(sVGAView6);
        o000O.OooO00o(sVGAView6);
        TextView tvFromUser = k3Var.f44097OooOOO0;
        tvFromUser.setText("");
        Intrinsics.checkNotNullExpressionValue(tvFromUser, "tvFromUser");
        o000O.OooO0O0(tvFromUser);
        TextView tvTo = k3Var.f44099OooOOOo;
        tvTo.setText("");
        int i = o0OOO0o.white;
        tvTo.setTextColor(o00O0OOO.OooO00o(i, this));
        Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
        o000O.OooO0O0(tvTo);
        TextView tvToUser = k3Var.f44101OooOOo0;
        tvToUser.setText("");
        Intrinsics.checkNotNullExpressionValue(tvToUser, "tvToUser");
        o000O.OooO0O0(tvToUser);
        NetImageView netImageView2 = k3Var.f44086OooO0O0;
        netImageView2.setImageDrawable(null);
        Intrinsics.checkNotNull(netImageView2);
        o000O.OooO0O0(netImageView2);
        GiftNumberView layoutGiftNumber = k3Var.f44089OooO0o;
        Intrinsics.checkNotNullExpressionValue(layoutGiftNumber, "layoutGiftNumber");
        o000O.OooO0O0(layoutGiftNumber);
        ImageView ivGo2 = k3Var.f44088OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivGo2, "ivGo");
        o000O.OooO0O0(ivGo2);
        TextView tvGiftEnd = k3Var.f44096OooOOO;
        tvGiftEnd.setText("");
        tvGiftEnd.setTextColor(o00O0OOO.OooO00o(i, this));
        Intrinsics.checkNotNullExpressionValue(tvGiftEnd, "tvGiftEnd");
        o000O.OooO0O0(tvGiftEnd);
        NetImageView netImageView3 = k3Var.f44087OooO0OO;
        netImageView3.setImageDrawable(null);
        Intrinsics.checkNotNull(netImageView3);
        o000O.OooO0O0(netImageView3);
        RoomBroadcastModel roomBroadcastModel = this.f30773OooO0oO;
        if (roomBroadcastModel != null) {
            tvTitle.setText(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.room_gift, this), o0OoOo0.OooOOO0("", Long.valueOf(roomBroadcastModel.getBaridx()))));
            RoomUserInfoDTO from = roomBroadcastModel.getFrom();
            if (from == null || (userHeader = from.getUserHeader()) == null) {
                userHeader = "";
            }
            if (o00O00OO.OooO0o(userHeader)) {
                Intrinsics.checkNotNull(netImageView);
                o000O.OooOOOO(netImageView);
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
                oooO00o.OooO00o(d1.OooO00o());
                int iOooO00o = o00O0OOO.OooO00o(o0OOO0o.tr_00, this);
                oooO00o.f43152OooOooO = o0000O0.OooO00o(1);
                oooO00o.f43153OooOooo = iOooO00o;
                oooO00o.f43155Oooo00O = true;
                int i2 = o0Oo0oo.ic_logo;
                oooO00o.f43128OooO0o = i2;
                oooO00o.f43138OooOOOo = i2;
                oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(userHeader);
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO0Oo(netImageView);
            }
            RoomUserInfoDTO from2 = roomBroadcastModel.getFrom();
            if (from2 != null) {
                from2.getUserHeaderFrame();
            }
            Intrinsics.checkNotNull(sVGAView);
            o000O.OooOOOO(sVGAView);
            sVGAView.OooOO0O("svga/ic_vip6_head_frame.svga", this.activity);
            sVGAView.OooOO0o();
            RoomUserInfoDTO from3 = roomBroadcastModel.getFrom();
            String strOooOOO = o0OoOo0.OooOOO(from3 != null ? from3.getUserName() : null, "");
            String strOooO0O0 = o00O0OOO.OooO0O0(o000000.room_broadcast_sent, this);
            RoomUserInfoDTO to = roomBroadcastModel.getTo();
            String strOooOOO2 = o0OoOo0.OooOOO(to != null ? to.getUserName() : null, "");
            RoomBroadcastModel roomBroadcastModel2 = this.f30773OooO0oO;
            if (roomBroadcastModel2 == null) {
                z = false;
            } else {
                if (roomBroadcastModel2.getType() == 14) {
                    z13 = true;
                } else {
                    if (roomBroadcastModel2.getType() == 15) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                tvFromUser.setText(strOooOOO);
                Intrinsics.checkNotNullExpressionValue(tvFromUser, "tvFromUser");
                o000O.OooOOOO(tvFromUser);
                tvTo.setText(o00O0OOO.OooO0O0(o000000.room_broadcast_send_gift_all_in_room, this));
                Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                o000O.OooOOOO(tvTo);
            } else {
                RoomBroadcastModel roomBroadcastModel3 = this.f30773OooO0oO;
                if (roomBroadcastModel3 == null) {
                    z2 = false;
                } else {
                    if (roomBroadcastModel3.getType() == 21) {
                        z10 = true;
                    } else {
                        if (roomBroadcastModel3.getType() == 22) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    tvFromUser.setText(strOooOOO);
                    Intrinsics.checkNotNullExpressionValue(tvFromUser, "tvFromUser");
                    o000O.OooOOOO(tvFromUser);
                    tvTo.setText(o00O0OOO.OooO0O0(o000000.room_broadcast_send_gift_all_in_mic, this));
                    Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                    o000O.OooOOOO(tvTo);
                } else {
                    RoomBroadcastModel roomBroadcastModel4 = this.f30773OooO0oO;
                    if (roomBroadcastModel4 == null) {
                        z3 = false;
                    } else {
                        if (roomBroadcastModel4.getType() == 17) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        tvTo.setText(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.room_broadcast_send_red_package, this), strOooOOO));
                        Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                        o000O.OooOOOO(tvTo);
                    } else {
                        RoomBroadcastModel roomBroadcastModel5 = this.f30773OooO0oO;
                        if (roomBroadcastModel5 != null && o000000O.OooO00o(roomBroadcastModel5)) {
                            RoomBroadcastModel roomBroadcastModel6 = this.f30773OooO0oO;
                            if (roomBroadcastModel6 == null) {
                                z5 = false;
                            } else {
                                if (o000000O.OooO00o(roomBroadcastModel6)) {
                                    z8 = true;
                                    z9 = roomBroadcastModel6.getBlindBoxLevel() == 1;
                                    if (z9 == z8) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                } else {
                                    z8 = true;
                                }
                                if (z9 == z8) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            }
                            if (z5) {
                                strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.blind_gift_Junior_broadcast_XXX1_XXX2, this), strOooOOO), strOooOOO2);
                            } else {
                                RoomBroadcastModel roomBroadcastModel7 = this.f30773OooO0oO;
                                if (roomBroadcastModel7 == null) {
                                    z6 = false;
                                } else {
                                    if (o000000O.OooO00o(roomBroadcastModel7)) {
                                        if (roomBroadcastModel7.getBlindBoxLevel() == 10) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                                strOooO00o = z6 ? o0000O.OooO00o(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.blind_gift_Premium_broadcast_XXX1_XXX2, this), strOooOOO), strOooOOO2) : o0000O.OooO00o(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.XXX1_presentedInARomanticGiftBox_XXX2, this), strOooOOO), strOooOOO2);
                            }
                            tvTo.setText(strOooO00o);
                            Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                            int i3 = o0OOO0o.rec_color_FFF990;
                            o00O0O0O.OooO0Oo(tvTo, o00O0OOO.OooO00o(i3, this), strOooOOO);
                            Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                            o00O0O0O.OooO0Oo(tvTo, o00O0OOO.OooO00o(i3, this), strOooOOO2);
                            Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                            o000O.OooOOOO(tvTo);
                        } else {
                            RoomBroadcastModel roomBroadcastModel8 = this.f30773OooO0oO;
                            if (roomBroadcastModel8 == null) {
                                z4 = false;
                            } else {
                                if (roomBroadcastModel8.getType() == 16) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            if (z4) {
                                tvTo.setText(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.lucky_gift_broadcast, this), strOooOOO));
                                Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                                o000O.OooOOOO(tvTo);
                                String strOooO0O1 = o00O0OOO.OooO0O0(o000000.lucky_gift_broadcast_get_xxx_times_reward_a_total_of_xxx_gold_coins, this);
                                RoomBroadcastModel roomBroadcastModel9 = this.f30773OooO0oO;
                                String str3 = "<font color='#FFC339' size='13sp'><b>" + (roomBroadcastModel9 != null ? Long.valueOf(roomBroadcastModel9.getLuckymultiple()) : null) + "</b></font> ";
                                RoomBroadcastModel roomBroadcastModel10 = this.f30773OooO0oO;
                                tvGiftEnd.setText(Html.fromHtml(o0000O.OooO00o(o0000O.OooO00o(strOooO0O1, str3), "<font color='#FFC339' size='13sp'><b>" + (roomBroadcastModel10 != null ? Long.valueOf(roomBroadcastModel10.getLuckymoney()) : null) + "</b></font> ")));
                                Intrinsics.checkNotNullExpressionValue(tvGiftEnd, "tvGiftEnd");
                                o000O.OooOOOO(tvGiftEnd);
                            } else {
                                tvFromUser.setText(strOooOOO);
                                Intrinsics.checkNotNullExpressionValue(tvFromUser, "tvFromUser");
                                o000O.OooOOOO(tvFromUser);
                                tvTo.setText(strOooO0O0);
                                Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                                o000O.OooOOOO(tvTo);
                                tvToUser.setText(strOooOOO2);
                                Intrinsics.checkNotNullExpressionValue(tvToUser, "tvToUser");
                                o000O.OooOOOO(tvToUser);
                            }
                        }
                    }
                }
            }
            BarInfoModel.giftClass gift = roomBroadcastModel.getGift();
            String image = gift != null ? gift.getImage() : null;
            int num = roomBroadcastModel.getNum();
            Intrinsics.checkNotNull(netImageView2);
            o000O.OooOOOO(netImageView2);
            if (!o00O00OO.OooO0o(image) || num <= 0) {
                z11 = false;
                o000O.OooO0O0(netImageView2);
            } else {
                Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(getContext());
                oooO00o2.OooO00o(d1.OooO0O0());
                oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(image);
                z11 = false;
                oooO00o2.f43124OooO00o = 0;
                oooO00o2.OooO0Oo(netImageView2);
                RoomBroadcastModel roomBroadcastModel11 = this.f30773OooO0oO;
                if (roomBroadcastModel11 == null) {
                    z12 = false;
                } else {
                    if (roomBroadcastModel11.getType() == 16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    Intrinsics.checkNotNull(layoutGiftNumber);
                    o000O.OooO0O0(layoutGiftNumber);
                } else {
                    Intrinsics.checkNotNull(layoutGiftNumber);
                    o000O.OooOOOO(layoutGiftNumber);
                    layoutGiftNumber.setNumber(num);
                }
            }
            Intrinsics.checkNotNull(netImageView3);
            o000O.OooOOOO(netImageView3);
            RoomBroadcastModel roomBroadcastModel12 = this.f30773OooO0oO;
            if ((roomBroadcastModel12 == null || roomBroadcastModel12.getMoraflag() != 1) ? z11 : true) {
                netImageView3.setImageResource(o0Oo0oo.icon_room_bottom_game_box_mora);
            } else {
                RoomBroadcastModel roomBroadcastModel13 = this.f30773OooO0oO;
                if ((roomBroadcastModel13 == null || roomBroadcastModel13.getEnvelopflag() != 1) ? z11 : true) {
                    netImageView3.setImageResource(o0Oo0oo.icon_room_bottom_game_box_lucky_golds);
                } else {
                    RoomBroadcastModel roomBroadcastModel14 = this.f30773OooO0oO;
                    if ((roomBroadcastModel14 == null || roomBroadcastModel14.getType() != 17) ? z11 : true) {
                        netImageView3.setImageResource(o0Oo0oo.icon_room_bottom_game_box_lucky_golds);
                    } else {
                        o000O.OooO0O0(netImageView3);
                    }
                }
            }
            if (o0OoOo0.OooO00o(Boolean.valueOf(!Intrinsics.areEqual(Long.valueOf(roomBroadcastModel.getBarid()), com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue())))) {
                ivGo = ivGo2;
                Intrinsics.checkNotNullExpressionValue(ivGo, "ivGo");
                o000O.OooOOOO(ivGo);
                view = viewEnd;
                str2 = "viewEnd";
                Intrinsics.checkNotNullExpressionValue(view, str2);
                o000O.OooOOOO(view);
            } else {
                view = viewEnd;
                str2 = "viewEnd";
                ivGo = ivGo2;
            }
            if (((data == null || data.getShoweffectflag() != 1) ? z11 : true) && o000000O.OooO0O0(data)) {
                Intrinsics.checkNotNull(sVGAView2);
                o000O.OooOOOO(sVGAView2);
                sVGAView2.OooOO0O("svga/bg_broadcast_vip6_box_high.svga", this.activity);
                sVGAView2.OooOO0o();
                Intrinsics.checkNotNull(sVGAView3);
                o000O.OooOOOO(sVGAView3);
                sVGAView3.setBackgroundResource(o0Oo0oo.ic_broadcast_bg_vip6_middle_high);
                ViewGroup.LayoutParams layoutParams = sVGAView3.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(o0000O0.OooO00o(65));
                }
                Intrinsics.checkNotNull(sVGAView4);
                o000O.OooOOOO(sVGAView4);
                sVGAView4.setBackgroundResource(o0Oo0oo.ic_broadcast_bg_vip6_content_high);
                Intrinsics.checkNotNull(sVGAView5);
                o000O.OooOOOO(sVGAView5);
                sVGAView5.OooOO0O("svga/bg_broadcast_vip6_star_high.svga", this.activity);
                sVGAView5.OooOO0o();
                Intrinsics.checkNotNullExpressionValue(view, str2);
                o000O.OooOOOO(view);
                Intrinsics.checkNotNull(sVGAView6);
                o000O.OooOOOO(sVGAView6);
                sVGAView6.OooOO0O("svga/bg_broadcast_vip6_go_low.svga", this.activity);
                sVGAView6.OooOO0o();
                ivGo.setImageResource(o0Oo0oo.ic_broadcast_go_high);
                str = "highUI";
            } else {
                if ((data == null || data.getShoweffectflag() != 1) ? z11 : true) {
                    Intrinsics.checkNotNull(sVGAView2);
                    o000O.OooOOOO(sVGAView2);
                    sVGAView2.OooOO0O("svga/bg_broadcast_vip6_box_middle.svga", this.activity);
                    sVGAView2.OooOO0o();
                    Intrinsics.checkNotNull(sVGAView3);
                    o000O.OooOOOO(sVGAView3);
                    sVGAView3.setBackgroundResource(o0Oo0oo.ic_broadcast_bg_vip6_middle_high);
                    ViewGroup.LayoutParams layoutParams3 = sVGAView3.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.setMarginStart(o0000O0.OooO00o(19));
                    }
                    Intrinsics.checkNotNull(sVGAView4);
                    o000O.OooOOOO(sVGAView4);
                    sVGAView4.setBackgroundResource(o0Oo0oo.ic_broadcast_bg_vip6_content_middle);
                    ivGo.setImageResource(o0Oo0oo.ic_broadcast_go_middle);
                    str = "middleUI";
                } else if (o000000O.OooO0OO(data)) {
                    OooO0O0();
                    str = "";
                } else {
                    OooO0O0();
                    str = "elseUI";
                }
            }
        } else {
            str = "";
        }
        o0000O00.OooO0O0("RoomBroadcastView VIP6 setData \nui = " + ((Object) str) + " \ndata = " + OooO.OooO00o(data));
    }

    public final void setGoListener(@Nullable Function0<Unit> function0) {
        this.goListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastViewVip6(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomBroadcastViewVip6(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastViewVip6(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        k3 k3VarInflate = k3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(k3VarInflate, "inflate(...)");
        this.f30770OooO0Oo = k3VarInflate;
        ConstraintLayout constraintLayout = k3VarInflate.f44085OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        o000O.OooO(constraintLayout, new OooO00o());
        ImageView ivGo = k3VarInflate.f44088OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivGo, "ivGo");
        o000O.OooO(ivGo, new OooO0O0());
        this.headerFrameLoad = LazyKt.lazy(new OooO0OO());
    }
}
