package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.gift.GiftBackpackInfoModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.view.GiftView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.t2;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends p564o0oOo0OO.o000O<GiftPropModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f28935OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(List<GiftPropModel> list, GiftSendFragment giftSendFragment, Context context, int i) {
        super(i, context, list);
        this.f28935OooOoo0 = giftSendFragment;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x048b  */
    /* JADX WARN: Code duplicated, block: B:194:0x048f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0491  */
    /* JADX WARN: Code duplicated, block: B:198:0x049f  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:203:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:205:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:209:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:210:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:213:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:214:0x04db  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:222:0x053d  */
    /* JADX WARN: Code duplicated, block: B:223:0x053f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0542  */
    /* JADX WARN: Code duplicated, block: B:227:0x0546  */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        GiftSendFragment giftSendFragment;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        GiftPropModel giftPropModel;
        Integer numValueOf;
        GiftPropModel giftPropModel2;
        boolean z5;
        Integer numValueOf2;
        GiftPropModel giftPropModel3;
        String imageUrl;
        GiftPropModel giftPropModel4;
        Boolean boolValueOf;
        GiftPropModel giftPropModel5;
        Boolean boolValueOf2;
        String string;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        GiftPropModel item = (GiftPropModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        GiftView giftView = view instanceof GiftView ? (GiftView) view : null;
        GiftSendFragment giftSendFragment2 = this.f28935OooOoo0;
        if (giftView != null) {
            giftView.setLifecycleOwner(giftSendFragment2);
        }
        int i = 0;
        if (giftView != null) {
            int layoutPosition = helper.getLayoutPosition();
            int i2 = giftSendFragment2.pageTypeUser;
            GiftPropTypeShow showIn = giftSendFragment2.showIn;
            boolean z6 = giftSendFragment2.showAllSiteGift;
            Intrinsics.checkNotNullParameter(showIn, "showIn");
            String strOooO00o = p140o00OOooo.OooOO0.OooO00o(item);
            StringBuilder sbOooO00o = p041Ooooo0o.o00000.OooO00o("setData\nposition = ", layoutPosition, "\npageType = ", i2, "\n gift = ");
            sbOooO00o.append(strOooO00o);
            p592o0oo00O.OooOOO0.OooO0O0(sbOooO00o.toString());
            giftView.f30469OooO0o0 = item;
            t2 t2Var = giftView.f30467OooO0Oo;
            if (item == null) {
                View view2 = t2Var.f58844OooO;
                Intrinsics.checkNotNullExpressionValue(view2, "binding.selectBg");
                com.code.android.util.o000OO00.OooO0OO(view2);
                SVGAView sVGAView = t2Var.f58847OooO0OO;
                sVGAView.setImageDrawable(null);
                sVGAView.OooO0o();
                sVGAView.clearAnimation();
                t2Var.f58846OooO0O0.setImageDrawable(null);
                t2Var.f58852OooO0oo.setText("");
                t2Var.f58849OooO0o.setImageDrawable(null);
                ImageView imageView = t2Var.f58850OooO0o0;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivGiftNewTag");
                com.code.android.util.o000OO00.OooO0O0(imageView);
                giftSendFragment = giftSendFragment2;
            } else {
                giftView.f30470OooO0oO = StringsKt.trim((CharSequence) item.getImageUrl()).toString();
                if (item.isAllSiteGift()) {
                    String imageUrl2 = item.getImageUrl();
                    int length = imageUrl2.length() - 1;
                    if (length < 0) {
                        length = -1;
                        break;
                    }
                    while (true) {
                        int i3 = length - 1;
                        if (imageUrl2.charAt(length) == '.') {
                            break;
                        }
                        if (i3 < 0) {
                            length = -1;
                            break;
                        }
                        length = i3;
                    }
                    String strSubstring = imageUrl2.substring(0, length);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    giftView.f30468OooO0o = strSubstring + ".svga";
                }
                SVGAView sVGAView2 = t2Var.f58847OooO0OO;
                int i4 = oOo00OO0.icon_gift_send_default_gray;
                sVGAView2.f10172OooOooO = i4;
                sVGAView2.setImageResource(i4);
                sVGAView2.OooOO0O(giftView.f30470OooO0oO, null);
                String strOooOO0o = com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(item.getPrice()), "");
                if (strOooOO0o == null || strOooOO0o.length() == 0) {
                    string = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                } else {
                    int length2 = strOooOO0o.length() - 1;
                    boolean z7 = false;
                    while (i <= length2) {
                        boolean z8 = Intrinsics.compare((int) strOooOO0o.charAt(!z7 ? i : length2), 32) <= 0;
                        if (z7) {
                            if (!z8) {
                                break;
                            } else {
                                length2--;
                            }
                        } else if (z8) {
                            i++;
                        } else {
                            z7 = true;
                        }
                    }
                    String string2 = strOooOO0o.subSequence(i, length2 + 1).toString();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(Locale.ENGLISH, "%s", Arrays.copyOf(new Object[]{string2}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                    int length3 = string2.length();
                    if (length3 <= 3) {
                        string = str;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int i5 = length3 / 3;
                        int i6 = length3 % 3;
                        if (i6 != 0) {
                            String strSubstring2 = str.substring(0, i6);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(strSubstring2);
                            sb.append(",");
                        }
                        if (1 <= i5) {
                            int i7 = 1;
                            while (true) {
                                int i8 = i6 + 3;
                                String strSubstring3 = str.substring(i6, i8);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb.append(strSubstring3);
                                if (i7 != i5) {
                                    sb.append(",");
                                }
                                if (i7 == i5) {
                                    break;
                                }
                                i7++;
                                i6 = i8;
                            }
                        }
                        string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "sbr.toString()");
                    }
                }
                TextView textView = t2Var.f58852OooO0oo;
                textView.setText(string);
                boolean zIsCoin = item.isCoin();
                ImageView imageView2 = t2Var.f58846OooO0O0;
                if (zIsCoin) {
                    textView.setTextColor(p417o0OoO0.o000O0.OooO00o(oO00O0o.color_coin, giftView));
                    imageView2.setImageResource(oOo00OO0.coin_little);
                } else {
                    imageView2.setImageResource(oOo00OO0.icon_crystal_main_slide);
                    textView.setTextColor(p417o0OoO0.o000O0.OooO00o(oO00O0o.color_crystal, giftView));
                }
                ImageView imageView3 = t2Var.f58849OooO0o;
                imageView3.setImageDrawable(null);
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
                com.code.android.util.o000OO00.OooO0O0(imageView3);
                TextView textView2 = t2Var.f58855OooOO0o;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvGiftTag");
                com.code.android.util.o000OO00.OooO0O0(textView2);
                LinearLayoutCompat linearLayoutCompat = t2Var.f58851OooO0oO;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.layoutGiftBackpackTimeTag");
                com.code.android.util.o000OO00.OooO0O0(linearLayoutCompat);
                TextView textView3 = t2Var.f58853OooOO0;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvGiftBackpackTag");
                com.code.android.util.o000OO00.OooO0O0(textView3);
                giftSendFragment = giftSendFragment2;
                giftView.f30466OooO = false;
                if (i2 == GiftPropTypeUser.Premium.getValue()) {
                    Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
                    com.code.android.util.o000OO00.OooOOOO(imageView3);
                    imageView3.setImageResource(oOo00OO0.ic_gift_tag_nobillity);
                } else if (i2 == GiftPropTypeUser.Wealth.getValue()) {
                    if (item.getSendLvLimit() > 0) {
                        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvGiftTag");
                        com.code.android.util.o000OO00.OooOOOO(textView2);
                        textView2.setText(com.code.android.util.o0000O.OooO00o(p417o0OoO0.o000O0.OooO0O0(oO00OOo0.LV_XXX, giftView), String.valueOf(item.getSendLvLimit())));
                    }
                } else if (i2 == GiftPropTypeUser.Vip.getValue()) {
                    Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
                    com.code.android.util.o000OO00.OooOOOO(imageView3);
                    imageView3.setImageResource(oOo00OO0.ic_gift_tag_vip);
                } else if (i2 == GiftPropTypeUser.Member.getValue()) {
                    if (item.getSendLvLimit() > 0) {
                        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvGiftTag");
                        com.code.android.util.o000OO00.OooOOOO(textView2);
                        textView2.setText(com.code.android.util.o0000O.OooO00o(p417o0OoO0.o000O0.OooO0O0(oO00OOo0.LV_XXX, giftView), String.valueOf(item.getSendLvLimit())));
                    }
                } else if (i2 == GiftPropTypeUser.Backpack.getValue()) {
                    if (item.getGiftBackpackPropNum() >= 0) {
                        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvGiftBackpackTag");
                        com.code.android.util.o000OO00.OooOOOO(textView3);
                        textView3.setText(item.getGiftBackpackPropNum() > 9999 ? "9999+" : String.valueOf(item.getGiftBackpackPropNum()));
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long giftBackpackMinExpirationTimeStamp = (long) (item.getGiftBackpackMinExpirationTimeStamp() * 0.01d);
                    int length4 = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(giftBackpackMinExpirationTimeStamp).length();
                    if (1 <= length4) {
                        int i9 = 1;
                        while (true) {
                            giftBackpackMinExpirationTimeStamp *= (long) 10;
                            if (i9 == length4) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                    long j = giftBackpackMinExpirationTimeStamp - jCurrentTimeMillis;
                    long j2 = j / 31536000000L;
                    Calendar timeCalendar = Calendar.getInstance();
                    timeCalendar.setTimeInMillis(giftBackpackMinExpirationTimeStamp);
                    Intrinsics.checkNotNullExpressionValue(timeCalendar, "getInstance().apply { timeInMillis = taskTime }");
                    Calendar targetCalendar = Calendar.getInstance();
                    targetCalendar.setTimeInMillis(jCurrentTimeMillis);
                    Intrinsics.checkNotNullExpressionValue(targetCalendar, "getInstance().apply { timeInMillis = targetTime }");
                    Intrinsics.checkNotNullParameter(timeCalendar, "timeCalendar");
                    Intrinsics.checkNotNullParameter(targetCalendar, "targetCalendar");
                    boolean z9 = targetCalendar.get(1) - timeCalendar.get(1) == 0;
                    if (j2 < 100 && giftBackpackMinExpirationTimeStamp > 0) {
                        GiftBackpackInfoModel backpackInfo = item.getBackpackInfo();
                        if (!com.code.android.util.o0OoOo0.OooO00o(backpackInfo != null ? Boolean.valueOf(backpackInfo.getIsFrozen()) : null)) {
                            giftView.f30466OooO = true;
                            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.layoutGiftBackpackTimeTag");
                            com.code.android.util.o000OO00.OooOOOO(linearLayoutCompat);
                            String strOooO0OO = p601o0oo0O0.o0000oo.OooO0OO(giftBackpackMinExpirationTimeStamp, z9 ? "dd/MM HH:mm" : "dd/MM/yyyy");
                            TextView textView4 = t2Var.f58854OooOO0O;
                            textView4.setText(strOooO0OO);
                            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvGiftBackpackTimeTag");
                            int i10 = !p591o0oo000O.OooO.OooO0o0() ? 1 : 0;
                            Intrinsics.checkNotNullParameter(textView4, "<this>");
                            textView4.setLayoutDirection(i10 ^ 1);
                            textView4.setTextDirection(i10 != 0 ? 3 : 4);
                            ImageView imageView4 = t2Var.f58848OooO0Oo;
                            if (j > 259200000) {
                                linearLayoutCompat.setBackgroundResource(oOo00OO0.bg_ff575572_r360);
                                imageView4.setImageResource(oOo00OO0.ic_gift_backpack_time_gray);
                            } else {
                                linearLayoutCompat.setBackgroundResource(oOo00OO0.bg_ffff5b48_r360);
                                imageView4.setImageResource(oOo00OO0.ic_gift_backpack_time_red);
                            }
                        }
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
                    com.code.android.util.o000OO00.OooOOOO(imageView3);
                    if (item.getIsWeek()) {
                        imageView3.setImageResource(oOo00OO0.ic_gift_tag_week);
                    } else if (item.getIsLuck()) {
                        imageView3.setImageResource(oOo00OO0.ic_gift_tag_luck);
                    } else if (item.isCustomMade()) {
                        imageView3.setImageResource(oO00OOO.ic_gift_tag_custom_made);
                    } else if (item.isBlind()) {
                        imageView3.setImageResource(oOo00OO0.ic_gift_tag_blind);
                    } else if (item.isAllSiteGift()) {
                        if (z6) {
                            imageView3.setImageResource(oOo00OO0.ic_gift_tag_diamond);
                        }
                        if (showIn != GiftPropTypeShow.InRoom) {
                            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
                            com.code.android.util.o000OO00.OooO0O0(imageView3);
                        }
                    } else if (item.getIsDyEffect()) {
                        imageView3.setImageResource(oOo00OO0.ic_gift_tag_dy_effect);
                    } else if (item.getIsSoundEffect()) {
                        imageView3.setImageResource(oOo00OO0.ic_gift_tag_sound_effect);
                        if (showIn != GiftPropTypeShow.InRoom) {
                            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
                            com.code.android.util.o000OO00.OooO0O0(imageView3);
                        }
                    } else if (item.getIsHot()) {
                        imageView3.setImageResource(oOo00OO0.ic_gift_tag_activity);
                    }
                }
                boolean isNew = item.getIsNew();
                ImageView imageView5 = t2Var.f58850OooO0o0;
                if (isNew) {
                    Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivGiftNewTag");
                    com.code.android.util.o000OO00.OooOOOO(imageView5);
                } else {
                    Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivGiftNewTag");
                    com.code.android.util.o000OO00.OooO0O0(imageView5);
                }
            }
        } else {
            giftSendFragment = giftSendFragment2;
        }
        if (giftView != null) {
            giftView.setSelectedGift(false);
        }
        GiftPropModel currentData = giftSendFragment.getCurrentData();
        if (currentData != null && item.getGiftId() == currentData.getGiftId()) {
            if (giftView != null) {
                giftView.setSelectedGift(true);
            }
            GiftSendFragment giftSendFragment3 = giftSendFragment;
            giftSendFragment3.selectedView = giftView;
            GiftView giftView2 = giftSendFragment3.selectedView;
            giftSendFragment3.setCurrentData(giftView2 != null ? giftView2.getF30469OooO0o0() : null);
            LiveEventBus.get("GiftSendDialogSelectGift").post(giftSendFragment3.selectedView);
        }
        if (giftView != null) {
            GiftPropModel giftPropModel6 = giftView.f30469OooO0o0;
            if (giftPropModel6 != null) {
                z = true;
                if (giftPropModel6.getIsNew()) {
                    z2 = true;
                }
                if (z) {
                    if (giftView.lifecycleOwner == null) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    boolean zOooO0o0 = com.code.android.util.o000OO00.OooO0o0(giftView) ^ z2;
                    p409o0Oo0o0o.o00000OO o00000ooOooOO0O = p408o0Oo0o0O.o00Oo0.OooOO0O();
                    giftPropModel = giftView.f30469OooO0o0;
                    if (giftPropModel != null) {
                        numValueOf = Integer.valueOf(giftPropModel.getGiftId());
                    } else {
                        numValueOf = null;
                    }
                    boolean zOooOO0o = o00000ooOooOO0O.OooOO0o(String.valueOf(numValueOf));
                    giftPropModel2 = giftView.f30469OooO0o0;
                    if (giftPropModel2 == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (giftPropModel2 != null) {
                        numValueOf2 = Integer.valueOf(giftPropModel2.getGiftId());
                    } else {
                        numValueOf2 = null;
                    }
                    giftPropModel3 = giftView.f30469OooO0o0;
                    if (giftPropModel3 != null) {
                        imageUrl = giftPropModel3.getImageUrl();
                    } else {
                        imageUrl = null;
                    }
                    giftPropModel4 = giftView.f30469OooO0o0;
                    if (giftPropModel4 != null) {
                        boolValueOf = Boolean.valueOf(giftPropModel4.getIsNew());
                    } else {
                        boolValueOf = null;
                    }
                    giftPropModel5 = giftView.f30469OooO0o0;
                    if (giftPropModel5 != null) {
                        boolValueOf2 = Boolean.valueOf(giftPropModel5.getIsNewAnimated());
                    } else {
                        boolValueOf2 = null;
                    }
                    p592o0oo00O.OooOOO0.OooO0O0("wrm setNewGift\nlifecycleOwner.isNull = " + z4 + ", \n!this.isVisible = " + zOooO0o0 + ", \ngiftNewAnimationForEverydayFirstShowGiftIdList = " + zOooOO0o + ", \ngiftPropModel \nisNull = " + z5 + ",  giftId = " + numValueOf2 + ",  imageUrl = " + imageUrl + ",  isNew = " + boolValueOf + ",  isNewAnimated = " + boolValueOf2 + ", ");
                }
                if (giftView.lifecycleOwner == null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                }
                if ((giftView.f30469OooO0o0 == null ? z2 : false) && com.code.android.util.o000OO00.OooO0o0(giftView)) {
                    p409o0Oo0o0o.o00000OO o00000ooOooOO0O2 = p408o0Oo0o0O.o00Oo0.OooOO0O();
                    GiftPropModel giftPropModel7 = giftView.f30469OooO0o0;
                    if (o00000ooOooOO0O2.OooOO0o(String.valueOf(giftPropModel7 != null ? Integer.valueOf(giftPropModel7.getGiftId()) : null))) {
                        return;
                    }
                    GiftPropModel giftPropModel8 = giftView.f30469OooO0o0;
                    if (com.code.android.util.o0OoOo0.OooO00o(giftPropModel8 != null ? Boolean.valueOf(giftPropModel8.getIsNew()) : null)) {
                        GiftPropModel giftPropModel9 = giftView.f30469OooO0o0;
                        if (com.code.android.util.o0OoOo0.OooO00o(giftPropModel9 != null ? Boolean.valueOf(giftPropModel9.getIsNewAnimated()) : null)) {
                            return;
                        }
                        giftView.postDelayed(new p037OoooOo0.o0000O0(giftView, 2), 1000L);
                        return;
                    }
                    return;
                }
            }
            z = true;
            z2 = z;
            z = false;
            if (z) {
                if (giftView.lifecycleOwner == null) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                boolean zOooO0o1 = com.code.android.util.o000OO00.OooO0o0(giftView) ^ z2;
                p409o0Oo0o0o.o00000OO o00000ooOooOO0O3 = p408o0Oo0o0O.o00Oo0.OooOO0O();
                giftPropModel = giftView.f30469OooO0o0;
                if (giftPropModel != null) {
                    numValueOf = Integer.valueOf(giftPropModel.getGiftId());
                } else {
                    numValueOf = null;
                }
                boolean zOooOO0o2 = o00000ooOooOO0O3.OooOO0o(String.valueOf(numValueOf));
                giftPropModel2 = giftView.f30469OooO0o0;
                if (giftPropModel2 == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (giftPropModel2 != null) {
                    numValueOf2 = Integer.valueOf(giftPropModel2.getGiftId());
                } else {
                    numValueOf2 = null;
                }
                giftPropModel3 = giftView.f30469OooO0o0;
                if (giftPropModel3 != null) {
                    imageUrl = giftPropModel3.getImageUrl();
                } else {
                    imageUrl = null;
                }
                giftPropModel4 = giftView.f30469OooO0o0;
                if (giftPropModel4 != null) {
                    boolValueOf = Boolean.valueOf(giftPropModel4.getIsNew());
                } else {
                    boolValueOf = null;
                }
                giftPropModel5 = giftView.f30469OooO0o0;
                if (giftPropModel5 != null) {
                    boolValueOf2 = Boolean.valueOf(giftPropModel5.getIsNewAnimated());
                } else {
                    boolValueOf2 = null;
                }
                p592o0oo00O.OooOOO0.OooO0O0("wrm setNewGift\nlifecycleOwner.isNull = " + z4 + ", \n!this.isVisible = " + zOooO0o1 + ", \ngiftNewAnimationForEverydayFirstShowGiftIdList = " + zOooOO0o2 + ", \ngiftPropModel \nisNull = " + z5 + ",  giftId = " + numValueOf2 + ",  imageUrl = " + imageUrl + ",  isNew = " + boolValueOf + ",  isNewAnimated = " + boolValueOf2 + ", ");
            }
            if (giftView.lifecycleOwner == null) {
                z3 = z2;
            } else {
                z3 = false;
            }
            if (z3) {
                if (giftView.f30469OooO0o0 == null ? z2 : false) {
                }
            }
        }
    }
}
