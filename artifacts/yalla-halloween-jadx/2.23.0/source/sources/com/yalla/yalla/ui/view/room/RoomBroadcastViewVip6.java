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
import com.code.android.util.o000OO00;
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
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.o000O0;
import p417o0OoO0.o000O0o;
import p543o0oO0O00.OooO;
import p557o0oOo.OooOO0O;
import p579o0oOoo.oO00O0oO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p592o0oo00O.OooOOO0;
import p641o0ooOOOO.vb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomBroadcastViewVip6;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/RoomBroadcastModel;", "data", "", "setData", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "OooO0o0", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "getActivity", "()Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "setActivity", "(Lcom/yalla/yalla/mixedroom/MixedRoomActivity;)V", "activity", "Lkotlin/Function0;", "OooO0o", "Lkotlin/jvm/functions/Function0;", "getGoListener", "()Lkotlin/jvm/functions/Function0;", "setGoListener", "(Lkotlin/jvm/functions/Function0;)V", "goListener", "Lo0oOoo/oO00O0oO;", "OooO0oo", "Lkotlin/Lazy;", "getHeaderFrameLoad", "()Lo0oOoo/oO00O0oO;", "headerFrameLoad", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class RoomBroadcastViewVip6 extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final vb f31311OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> goListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MixedRoomActivity activity;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public RoomBroadcastModel f31314OooO0oO;

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

    public static final class OooO0OO extends Lambda implements Function0<oO00O0oO> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO00O0oO invoke() {
            RoomBroadcastViewVip6 roomBroadcastViewVip6 = RoomBroadcastViewVip6.this;
            return new oO00O0oO(roomBroadcastViewVip6.getActivity(), roomBroadcastViewVip6.f31311OooO0Oo.f59098OooOO0o);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastViewVip6(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final oO00O0oO getHeaderFrameLoad() {
        return (oO00O0oO) this.headerFrameLoad.getValue();
    }

    public final void OooO0O0() {
        vb vbVar = this.f31311OooO0Oo;
        SVGAView it = vbVar.f59087OooO;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000OO00.OooOOOO(it);
        it.setBackgroundResource(oOo00OO0.ic_broadcast_bg_vip6_middle_high);
        ViewGroup.LayoutParams layoutParams = it.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(o0000O0.OooO00o(19));
        }
        SVGAView it2 = vbVar.f59096OooOO0;
        Intrinsics.checkNotNullExpressionValue(it2, "it");
        o000OO00.OooOOOO(it2);
        it2.setBackgroundResource(oOo00OO0.ic_broadcast_bg_vip6_content_middle);
        SVGAView it3 = vbVar.f59097OooOO0O;
        Intrinsics.checkNotNullExpressionValue(it3, "it");
        o000OO00.OooOOOO(it3);
        it3.setImageResource(oOo00OO0.ic_broadcast_bg_vip6_star_low);
        vbVar.f59091OooO0Oo.setImageResource(oOo00OO0.ic_broadcast_go_middle);
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

    /* JADX WARN: Code duplicated, block: B:100:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:131:0x0362  */
    /* JADX WARN: Code duplicated, block: B:159:0x044d  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:42:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x023b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:76:0x0270  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ba  */
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
        ImageView imageView;
        boolean z12;
        boolean z13;
        this.f31314OooO0oO = data;
        vb vbVar = this.f31311OooO0Oo;
        vbVar.f59101OooOOOO.setText("");
        TextView textView = vbVar.f59101OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTitle");
        o000OO00.OooOO0O(textView, 30);
        NetImageView it = vbVar.f59093OooO0o0;
        it.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000OO00.OooO0O0(it);
        SVGAView it2 = vbVar.f59098OooOO0o;
        it2.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it2, "it");
        o000OO00.OooO0O0(it2);
        SVGAView it3 = vbVar.f59094OooO0oO;
        it3.clearAnimation();
        it3.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it3, "it");
        o000OO00.OooO0O0(it3);
        o000OO00.OooO00o(it3);
        SVGAView it4 = vbVar.f59087OooO;
        it4.clearAnimation();
        it4.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it4, "it");
        o000OO00.OooO0O0(it4);
        o000OO00.OooO00o(it4);
        SVGAView it5 = vbVar.f59096OooOO0;
        it5.clearAnimation();
        it5.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it5, "it");
        o000OO00.OooO0O0(it5);
        o000OO00.OooO00o(it5);
        SVGAView it6 = vbVar.f59097OooOO0O;
        it6.clearAnimation();
        it6.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it6, "it");
        o000OO00.OooO0O0(it6);
        o000OO00.OooO00o(it6);
        View view2 = vbVar.f59103OooOOo;
        Intrinsics.checkNotNullExpressionValue(view2, "binding.viewEnd");
        o000OO00.OooO0O0(view2);
        SVGAView it7 = vbVar.f59095OooO0oo;
        it7.clearAnimation();
        it7.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it7, "it");
        o000OO00.OooO0O0(it7);
        o000OO00.OooO00o(it7);
        TextView textView2 = vbVar.f59100OooOOO0;
        textView2.setText("");
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvFromUser");
        o000OO00.OooO0O0(textView2);
        TextView textView3 = vbVar.f59102OooOOOo;
        textView3.setText("");
        int i = oO00O0o.white;
        textView3.setTextColor(o000O0.OooO00o(i, this));
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
        o000OO00.OooO0O0(textView3);
        TextView textView4 = vbVar.f59104OooOOo0;
        textView4.setText("");
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvToUser");
        o000OO00.OooO0O0(textView4);
        NetImageView it8 = vbVar.f59089OooO0O0;
        it8.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it8, "it");
        o000OO00.OooO0O0(it8);
        GiftNumberView giftNumView = vbVar.f59092OooO0o;
        Intrinsics.checkNotNullExpressionValue(giftNumView, "binding.layoutGiftNumber");
        o000OO00.OooO0O0(giftNumView);
        ImageView imageView2 = vbVar.f59091OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivGo");
        o000OO00.OooO0O0(imageView2);
        TextView textView5 = vbVar.f59099OooOOO;
        textView5.setText("");
        textView5.setTextColor(o000O0.OooO00o(i, this));
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvGiftEnd");
        o000OO00.OooO0O0(textView5);
        NetImageView it9 = vbVar.f59090OooO0OO;
        it9.setImageDrawable(null);
        Intrinsics.checkNotNullExpressionValue(it9, "it");
        o000OO00.OooO0O0(it9);
        RoomBroadcastModel roomBroadcastModel = this.f31314OooO0oO;
        if (roomBroadcastModel != null) {
            textView.setText(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.room_gift, this), o0OoOo0.OooOOO0("", Long.valueOf(roomBroadcastModel.getBaridx()))));
            RoomUserInfoDTO from = roomBroadcastModel.getFrom();
            if (from == null || (userHeader = from.getUserHeader()) == null) {
                userHeader = "";
            }
            if (o0000O0O.OooO0o(userHeader)) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o000OO00.OooOOOO(it);
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
                oooO00o.OooO00o(OooO.OooO00o());
                int iOooO00o = o000O0.OooO00o(oO00O0o.tr_00, this);
                oooO00o.f43937OooOooO = o0000O0.OooO00o(1);
                oooO00o.f43938OooOooo = iOooO00o;
                oooO00o.f43940Oooo00O = true;
                int i2 = oOo00OO0.ic_logo;
                oooO00o.f43913OooO0o = i2;
                oooO00o.f43923OooOOOo = i2;
                oooO00o.f43911OooO0OO = OooOOO.OooO00o(userHeader);
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo(it);
            }
            RoomUserInfoDTO from2 = roomBroadcastModel.getFrom();
            if (from2 != null) {
                from2.getUserHeaderFrame();
            }
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            o000OO00.OooOOOO(it2);
            it2.OooOO0O("svga/ic_vip6_head_frame.svga", this.activity);
            it2.OooOO0o();
            RoomUserInfoDTO from3 = roomBroadcastModel.getFrom();
            String strOooOOO = o0OoOo0.OooOOO(from3 != null ? from3.getUserName() : null, "");
            String strOooO0O0 = o000O0.OooO0O0(oO00OOo0.room_broadcast_sent, this);
            RoomUserInfoDTO to = roomBroadcastModel.getTo();
            String strOooOOO2 = o0OoOo0.OooOOO(to != null ? to.getUserName() : null, "");
            RoomBroadcastModel roomBroadcastModel2 = this.f31314OooO0oO;
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
                textView2.setText(strOooOOO);
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvFromUser");
                o000OO00.OooOOOO(textView2);
                textView3.setText(o000O0.OooO0O0(oO00OOo0.room_broadcast_send_gift_all_in_room, this));
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                o000OO00.OooOOOO(textView3);
            } else {
                RoomBroadcastModel roomBroadcastModel3 = this.f31314OooO0oO;
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
                    textView2.setText(strOooOOO);
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvFromUser");
                    o000OO00.OooOOOO(textView2);
                    textView3.setText(o000O0.OooO0O0(oO00OOo0.room_broadcast_send_gift_all_in_mic, this));
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                    o000OO00.OooOOOO(textView3);
                } else {
                    RoomBroadcastModel roomBroadcastModel4 = this.f31314OooO0oO;
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
                        textView3.setText(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.room_broadcast_send_red_package, this), strOooOOO));
                        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                        o000OO00.OooOOOO(textView3);
                    } else {
                        RoomBroadcastModel roomBroadcastModel5 = this.f31314OooO0oO;
                        if (roomBroadcastModel5 != null && OooOO0O.OooO00o(roomBroadcastModel5)) {
                            RoomBroadcastModel roomBroadcastModel6 = this.f31314OooO0oO;
                            if (roomBroadcastModel6 == null) {
                                z5 = false;
                            } else {
                                if (OooOO0O.OooO00o(roomBroadcastModel6)) {
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
                                strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.blind_gift_Junior_broadcast_XXX1_XXX2, this), strOooOOO), strOooOOO2);
                            } else {
                                RoomBroadcastModel roomBroadcastModel7 = this.f31314OooO0oO;
                                if (roomBroadcastModel7 == null) {
                                    z6 = false;
                                } else {
                                    if (OooOO0O.OooO00o(roomBroadcastModel7)) {
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
                                strOooO00o = z6 ? o0000O.OooO00o(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.blind_gift_Premium_broadcast_XXX1_XXX2, this), strOooOOO), strOooOOO2) : o0000O.OooO00o(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.XXX1_presentedInARomanticGiftBox_XXX2, this), strOooOOO), strOooOOO2);
                            }
                            textView3.setText(strOooO00o);
                            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                            int i3 = oO00O0o.rec_color_FFF990;
                            o000O0o.OooO0Oo(textView3, o000O0.OooO00o(i3, this), strOooOOO);
                            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                            o000O0o.OooO0Oo(textView3, o000O0.OooO00o(i3, this), strOooOOO2);
                            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                            o000OO00.OooOOOO(textView3);
                        } else {
                            RoomBroadcastModel roomBroadcastModel8 = this.f31314OooO0oO;
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
                                textView3.setText(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.lucky_gift_broadcast, this), strOooOOO));
                                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                                o000OO00.OooOOOO(textView3);
                                String strOooO0O1 = o000O0.OooO0O0(oO00OOo0.lucky_gift_broadcast_get_xxx_times_reward_a_total_of_xxx_gold_coins, this);
                                RoomBroadcastModel roomBroadcastModel9 = this.f31314OooO0oO;
                                String str3 = "<font color='#FFC339' size='13sp'><b>" + (roomBroadcastModel9 != null ? Long.valueOf(roomBroadcastModel9.getLuckymultiple()) : null) + "</b></font> ";
                                RoomBroadcastModel roomBroadcastModel10 = this.f31314OooO0oO;
                                textView5.setText(Html.fromHtml(o0000O.OooO00o(o0000O.OooO00o(strOooO0O1, str3), "<font color='#FFC339' size='13sp'><b>" + (roomBroadcastModel10 != null ? Long.valueOf(roomBroadcastModel10.getLuckymoney()) : null) + "</b></font> ")));
                                Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvGiftEnd");
                                o000OO00.OooOOOO(textView5);
                            } else {
                                textView2.setText(strOooOOO);
                                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvFromUser");
                                o000OO00.OooOOOO(textView2);
                                textView3.setText(strOooO0O0);
                                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                                o000OO00.OooOOOO(textView3);
                                textView4.setText(strOooOOO2);
                                Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvToUser");
                                o000OO00.OooOOOO(textView4);
                            }
                        }
                    }
                }
            }
            BarInfoModel.giftClass gift = roomBroadcastModel.getGift();
            String image = gift != null ? gift.getImage() : null;
            int num = roomBroadcastModel.getNum();
            Intrinsics.checkNotNullExpressionValue(it8, "it");
            o000OO00.OooOOOO(it8);
            if (!o0000O0O.OooO0o(image) || num <= 0) {
                z11 = false;
                o000OO00.OooO0O0(it8);
            } else {
                OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(getContext());
                oooO00o2.OooO00o(OooO.OooO0O0());
                oooO00o2.f43911OooO0OO = OooO0o.OooO0Oo(image);
                z11 = false;
                oooO00o2.f43909OooO00o = 0;
                oooO00o2.OooO0Oo(it8);
                RoomBroadcastModel roomBroadcastModel11 = this.f31314OooO0oO;
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
                    Intrinsics.checkNotNullExpressionValue(giftNumView, "giftNumView");
                    o000OO00.OooO0O0(giftNumView);
                } else {
                    Intrinsics.checkNotNullExpressionValue(giftNumView, "giftNumView");
                    o000OO00.OooOOOO(giftNumView);
                    giftNumView.setNumber(num);
                }
            }
            Intrinsics.checkNotNullExpressionValue(it9, "it");
            o000OO00.OooOOOO(it9);
            RoomBroadcastModel roomBroadcastModel12 = this.f31314OooO0oO;
            if ((roomBroadcastModel12 == null || roomBroadcastModel12.getMoraflag() != 1) ? z11 : true) {
                it9.setImageResource(oOo00OO0.icon_room_bottom_game_box_mora);
            } else {
                RoomBroadcastModel roomBroadcastModel13 = this.f31314OooO0oO;
                if ((roomBroadcastModel13 == null || roomBroadcastModel13.getEnvelopflag() != 1) ? z11 : true) {
                    it9.setImageResource(oOo00OO0.icon_room_bottom_game_box_lucky_golds);
                } else {
                    RoomBroadcastModel roomBroadcastModel14 = this.f31314OooO0oO;
                    if ((roomBroadcastModel14 == null || roomBroadcastModel14.getType() != 17) ? z11 : true) {
                        it9.setImageResource(oOo00OO0.icon_room_bottom_game_box_lucky_golds);
                    } else {
                        o000OO00.OooO0O0(it9);
                    }
                }
            }
            if (o0OoOo0.OooO00o(Boolean.valueOf(!Intrinsics.areEqual(Long.valueOf(roomBroadcastModel.getBarid()), com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue())))) {
                imageView = imageView2;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivGo");
                o000OO00.OooOOOO(imageView);
                view = view2;
                str2 = "binding.viewEnd";
                Intrinsics.checkNotNullExpressionValue(view, str2);
                o000OO00.OooOOOO(view);
            } else {
                view = view2;
                str2 = "binding.viewEnd";
                imageView = imageView2;
            }
            if (((data == null || data.getShoweffectflag() != 1) ? z11 : true) && OooOO0O.OooO0O0(data)) {
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                o000OO00.OooOOOO(it3);
                it3.OooOO0O("svga/bg_broadcast_vip6_box_high.svga", this.activity);
                it3.OooOO0o();
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                o000OO00.OooOOOO(it4);
                it4.setBackgroundResource(oOo00OO0.ic_broadcast_bg_vip6_middle_high);
                ViewGroup.LayoutParams layoutParams = it4.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(o0000O0.OooO00o(65));
                }
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                o000OO00.OooOOOO(it5);
                it5.setBackgroundResource(oOo00OO0.ic_broadcast_bg_vip6_content_high);
                Intrinsics.checkNotNullExpressionValue(it6, "it");
                o000OO00.OooOOOO(it6);
                it6.OooOO0O("svga/bg_broadcast_vip6_star_high.svga", this.activity);
                it6.OooOO0o();
                Intrinsics.checkNotNullExpressionValue(view, str2);
                o000OO00.OooOOOO(view);
                Intrinsics.checkNotNullExpressionValue(it7, "it");
                o000OO00.OooOOOO(it7);
                it7.OooOO0O("svga/bg_broadcast_vip6_go_low.svga", this.activity);
                it7.OooOO0o();
                imageView.setImageResource(oOo00OO0.ic_broadcast_go_high);
                str = "highUI";
            } else {
                if ((data == null || data.getShoweffectflag() != 1) ? z11 : true) {
                    Intrinsics.checkNotNullExpressionValue(it3, "it");
                    o000OO00.OooOOOO(it3);
                    it3.OooOO0O("svga/bg_broadcast_vip6_box_middle.svga", this.activity);
                    it3.OooOO0o();
                    Intrinsics.checkNotNullExpressionValue(it4, "it");
                    o000OO00.OooOOOO(it4);
                    it4.setBackgroundResource(oOo00OO0.ic_broadcast_bg_vip6_middle_high);
                    ViewGroup.LayoutParams layoutParams3 = it4.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.setMarginStart(o0000O0.OooO00o(19));
                    }
                    Intrinsics.checkNotNullExpressionValue(it5, "it");
                    o000OO00.OooOOOO(it5);
                    it5.setBackgroundResource(oOo00OO0.ic_broadcast_bg_vip6_content_middle);
                    imageView.setImageResource(oOo00OO0.ic_broadcast_go_middle);
                    str = "middleUI";
                } else if (OooOO0O.OooO0OO(data)) {
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
        OooOOO0.OooO0O0("RoomBroadcastView VIP6 setData \nui = " + ((Object) str) + " \ndata = " + p140o00OOooo.OooOO0.OooO00o(data));
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
        vb vbVarInflate = vb.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(vbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31311OooO0Oo = vbVarInflate;
        ConstraintLayout constraintLayout = vbVarInflate.f59088OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o000OO00.OooO(constraintLayout, new OooO00o());
        ImageView imageView = vbVarInflate.f59091OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivGo");
        o000OO00.OooO(imageView, new OooO0O0());
        this.headerFrameLoad = LazyKt.lazy(new OooO0OO());
    }
}
