package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.sqlite.db.SupportSQLiteStatement;
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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import p407o0Oo0OOO.o0OO00o0;
import p416o0Oo0oO.oOo00OO0;
import p425o0OoO0OO.o00O0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends p570o0oOo0o.o000O0<GiftPropModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f28425OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(List<GiftPropModel> list, GiftSendFragment giftSendFragment, Context context, int i) {
        super(i, context, list);
        this.f28425OooOoo0 = giftSendFragment;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x042e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0437  */
    /* JADX WARN: Code duplicated, block: B:193:0x0498  */
    /* JADX WARN: Code duplicated, block: B:195:0x049c  */
    /* JADX WARN: Code duplicated, block: B:196:0x049e  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:203:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:211:0x04da  */
    /* JADX WARN: Code duplicated, block: B:214:0x04df  */
    /* JADX WARN: Code duplicated, block: B:215:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:219:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:223:0x054a  */
    /* JADX WARN: Code duplicated, block: B:224:0x054c  */
    /* JADX WARN: Code duplicated, block: B:226:0x054f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0553  */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
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
        String str;
        boolean isNew;
        ImageView imageView;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        GiftPropModel item = (GiftPropModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        final GiftView giftView = view instanceof GiftView ? (GiftView) view : null;
        GiftSendFragment giftSendFragment2 = this.f28425OooOoo0;
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
            String strOooO00o = p187o00o00o0.OooO.OooO00o(item);
            StringBuilder sbOooO00o = p041Ooooo0o.o00000.OooO00o("setData\nposition = ", layoutPosition, "\npageType = ", i2, "\n gift = ");
            sbOooO00o.append(strOooO00o);
            p597o0oo00O.OooOOOO.OooO0O0(sbOooO00o.toString());
            giftView.f29934OooO0o0 = item;
            o0OO00o0 o0oo00o1 = giftView.f29932OooO0Oo;
            if (item == null) {
                View selectBg = o0oo00o1.f44579OooO;
                Intrinsics.checkNotNullExpressionValue(selectBg, "selectBg");
                com.code.android.util.o000O.OooO0OO(selectBg);
                SVGAView sVGAView = o0oo00o1.f44582OooO0OO;
                sVGAView.setImageDrawable(null);
                sVGAView.OooO0o();
                sVGAView.clearAnimation();
                o0oo00o1.f44581OooO0O0.setImageDrawable(null);
                o0oo00o1.f44587OooO0oo.setText("");
                o0oo00o1.f44584OooO0o.setImageDrawable(null);
                ImageView ivGiftNewTag = o0oo00o1.f44585OooO0o0;
                Intrinsics.checkNotNullExpressionValue(ivGiftNewTag, "ivGiftNewTag");
                com.code.android.util.o000O.OooO0O0(ivGiftNewTag);
                giftSendFragment = giftSendFragment2;
            } else {
                giftView.f29935OooO0oO = StringsKt.trim((CharSequence) item.getImageUrl()).toString();
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
                    giftView.f29933OooO0o = strSubstring + ".svga";
                }
                SVGAView sVGAView2 = o0oo00o1.f44582OooO0OO;
                int i4 = p565o0oOo000.o0OOO0o.icon_gift_send_default_gray;
                sVGAView2.f13243OooOooO = i4;
                sVGAView2.setImageResource(i4);
                sVGAView2.OooOO0O(giftView.f29935OooO0oO, null);
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
                    String str2 = String.format(Locale.ENGLISH, "%s", Arrays.copyOf(new Object[]{string2}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                    int length3 = string2.length();
                    if (length3 <= 3) {
                        string = str2;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int i5 = length3 / 3;
                        int i6 = length3 % 3;
                        if (i6 != 0) {
                            String strSubstring2 = str2.substring(0, i6);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(strSubstring2);
                            sb.append(",");
                        }
                        if (1 <= i5) {
                            int i7 = 1;
                            while (true) {
                                int i8 = i6 + 3;
                                String strSubstring3 = str2.substring(i6, i8);
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
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    }
                }
                TextView textView = o0oo00o1.f44587OooO0oo;
                textView.setText(string);
                boolean zIsCoin = item.isCoin();
                ImageView imageView2 = o0oo00o1.f44581OooO0O0;
                if (zIsCoin) {
                    textView.setTextColor(o00O0OO.OooO00o(p565o0oOo000.o0ooOOo.color_coin, giftView));
                    imageView2.setImageResource(p565o0oOo000.o0OOO0o.coin_little);
                } else {
                    imageView2.setImageResource(p565o0oOo000.o0OOO0o.icon_crystal_main_slide);
                    textView.setTextColor(o00O0OO.OooO00o(p565o0oOo000.o0ooOOo.color_crystal, giftView));
                }
                ImageView ivGiftTag = o0oo00o1.f44584OooO0o;
                ivGiftTag.setImageDrawable(null);
                Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                com.code.android.util.o000O.OooO0O0(ivGiftTag);
                TextView tvGiftTag = o0oo00o1.f44590OooOO0o;
                Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
                com.code.android.util.o000O.OooO0O0(tvGiftTag);
                LinearLayoutCompat layoutGiftBackpackTimeTag = o0oo00o1.f44586OooO0oO;
                Intrinsics.checkNotNullExpressionValue(layoutGiftBackpackTimeTag, "layoutGiftBackpackTimeTag");
                com.code.android.util.o000O.OooO0O0(layoutGiftBackpackTimeTag);
                TextView tvGiftBackpackTag = o0oo00o1.f44588OooOO0;
                Intrinsics.checkNotNullExpressionValue(tvGiftBackpackTag, "tvGiftBackpackTag");
                com.code.android.util.o000O.OooO0O0(tvGiftBackpackTag);
                giftSendFragment = giftSendFragment2;
                giftView.f29931OooO = false;
                if (i2 == GiftPropTypeUser.Premium.getValue()) {
                    Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                    com.code.android.util.o000O.OooOOOO(ivGiftTag);
                    ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_nobillity);
                } else if (i2 == GiftPropTypeUser.Wealth.getValue()) {
                    if (item.getSendLvLimit() > 0) {
                        Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
                        com.code.android.util.o000O.OooOOOO(tvGiftTag);
                        tvGiftTag.setText(com.code.android.util.o0000O.OooO00o(o00O0OO.OooO0O0(p565o0oOo000.o000OOo.LV_XXX, giftView), String.valueOf(item.getSendLvLimit())));
                    }
                } else if (i2 == GiftPropTypeUser.Vip.getValue()) {
                    Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                    com.code.android.util.o000O.OooOOOO(ivGiftTag);
                    ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_vip);
                } else {
                    if (i2 == GiftPropTypeUser.Member.getValue()) {
                        if (item.getSendLvLimit() > 0) {
                            Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
                            com.code.android.util.o000O.OooOOOO(tvGiftTag);
                            tvGiftTag.setText(com.code.android.util.o0000O.OooO00o(o00O0OO.OooO0O0(p565o0oOo000.o000OOo.LV_XXX, giftView), String.valueOf(item.getSendLvLimit())));
                        }
                    } else if (i2 == GiftPropTypeUser.Backpack.getValue()) {
                        if (item.getGiftBackpackPropNum() >= 0) {
                            Intrinsics.checkNotNullExpressionValue(tvGiftBackpackTag, "tvGiftBackpackTag");
                            com.code.android.util.o000O.OooOOOO(tvGiftBackpackTag);
                            tvGiftBackpackTag.setText(item.getGiftBackpackPropNum() > 9999 ? "9999+" : String.valueOf(item.getGiftBackpackPropNum()));
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
                        Intrinsics.checkNotNullExpressionValue(timeCalendar, "apply(...)");
                        str = "ivGiftNewTag";
                        Calendar targetCalendar = Calendar.getInstance();
                        targetCalendar.setTimeInMillis(jCurrentTimeMillis);
                        Intrinsics.checkNotNullExpressionValue(targetCalendar, "apply(...)");
                        Intrinsics.checkNotNullParameter(timeCalendar, "timeCalendar");
                        Intrinsics.checkNotNullParameter(targetCalendar, "targetCalendar");
                        boolean z9 = targetCalendar.get(1) - timeCalendar.get(1) == 0;
                        if (j2 < 100 && giftBackpackMinExpirationTimeStamp > 0) {
                            GiftBackpackInfoModel backpackInfo = item.getBackpackInfo();
                            if (!com.code.android.util.o0OoOo0.OooO00o(backpackInfo != null ? Boolean.valueOf(backpackInfo.getIsFrozen()) : null)) {
                                giftView.f29931OooO = true;
                                Intrinsics.checkNotNullExpressionValue(layoutGiftBackpackTimeTag, "layoutGiftBackpackTimeTag");
                                com.code.android.util.o000O.OooOOOO(layoutGiftBackpackTimeTag);
                                String strOooO0OO = p606o0oo0O0.OooOOOO.OooO0OO(giftBackpackMinExpirationTimeStamp, z9 ? "dd/MM HH:mm" : "dd/MM/yyyy");
                                TextView tvGiftBackpackTimeTag = o0oo00o1.f44589OooOO0O;
                                tvGiftBackpackTimeTag.setText(strOooO0OO);
                                Intrinsics.checkNotNullExpressionValue(tvGiftBackpackTimeTag, "tvGiftBackpackTimeTag");
                                int i10 = !p596o0oo000O.OooO0o.OooO0o0() ? 1 : 0;
                                Intrinsics.checkNotNullParameter(tvGiftBackpackTimeTag, "<this>");
                                tvGiftBackpackTimeTag.setLayoutDirection(i10 ^ 1);
                                tvGiftBackpackTimeTag.setTextDirection(i10 != 0 ? 3 : 4);
                                ImageView imageView3 = o0oo00o1.f44583OooO0Oo;
                                if (j > 259200000) {
                                    layoutGiftBackpackTimeTag.setBackgroundResource(p565o0oOo000.o0OOO0o.bg_ff575572_r360);
                                    imageView3.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_backpack_time_gray);
                                } else {
                                    layoutGiftBackpackTimeTag.setBackgroundResource(p565o0oOo000.o0OOO0o.bg_ffff5b48_r360);
                                    imageView3.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_backpack_time_red);
                                }
                            }
                        }
                    } else {
                        str = "ivGiftNewTag";
                        Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                        com.code.android.util.o000O.OooOOOO(ivGiftTag);
                        if (item.getIsWeek()) {
                            ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_week);
                        } else if (item.getIsLuck()) {
                            ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_luck);
                        } else if (item.isCustomMade()) {
                            ivGiftTag.setImageResource(p565o0oOo000.oo0o0Oo.ic_gift_tag_custom_made);
                        } else if (item.isBlind()) {
                            ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_blind);
                        } else if (item.isAllSiteGift()) {
                            if (z6) {
                                ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_diamond);
                            }
                            if (showIn != GiftPropTypeShow.InRoom) {
                                Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                                com.code.android.util.o000O.OooO0O0(ivGiftTag);
                            }
                        } else if (item.getIsDyEffect()) {
                            ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_dy_effect);
                        } else if (item.getIsSoundEffect()) {
                            ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_sound_effect);
                            if (showIn != GiftPropTypeShow.InRoom) {
                                Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                                com.code.android.util.o000O.OooO0O0(ivGiftTag);
                            }
                        } else if (item.getIsHot()) {
                            ivGiftTag.setImageResource(p565o0oOo000.o0OOO0o.ic_gift_tag_activity);
                        }
                    }
                    isNew = item.getIsNew();
                    imageView = o0oo00o1.f44585OooO0o0;
                    if (isNew) {
                        Intrinsics.checkNotNullExpressionValue(imageView, str);
                        com.code.android.util.o000O.OooOOOO(imageView);
                    } else {
                        Intrinsics.checkNotNullExpressionValue(imageView, str);
                        com.code.android.util.o000O.OooO0O0(imageView);
                    }
                }
                str = "ivGiftNewTag";
                isNew = item.getIsNew();
                imageView = o0oo00o1.f44585OooO0o0;
                if (isNew) {
                    Intrinsics.checkNotNullExpressionValue(imageView, str);
                    com.code.android.util.o000O.OooOOOO(imageView);
                } else {
                    Intrinsics.checkNotNullExpressionValue(imageView, str);
                    com.code.android.util.o000O.OooO0O0(imageView);
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
            giftSendFragment3.setCurrentData(giftView2 != null ? giftView2.getF29934OooO0o0() : null);
            LiveEventBus.get("GiftSendDialogSelectGift").post(giftSendFragment3.selectedView);
        }
        if (giftView != null) {
            GiftPropModel giftPropModel6 = giftView.f29934OooO0o0;
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
                    boolean zOooO0o0 = z2 ^ com.code.android.util.o000O.OooO0o0(giftView);
                    oOo00OO0 ooo00oo0OooOO0O = p417o0Oo0oO0.o00Oo0.OooOO0O();
                    giftPropModel = giftView.f29934OooO0o0;
                    if (giftPropModel != null) {
                        numValueOf = Integer.valueOf(giftPropModel.getGiftId());
                    } else {
                        numValueOf = null;
                    }
                    boolean zOooOO0o = ooo00oo0OooOO0O.OooOO0o(String.valueOf(numValueOf));
                    giftPropModel2 = giftView.f29934OooO0o0;
                    if (giftPropModel2 == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (giftPropModel2 != null) {
                        numValueOf2 = Integer.valueOf(giftPropModel2.getGiftId());
                    } else {
                        numValueOf2 = null;
                    }
                    giftPropModel3 = giftView.f29934OooO0o0;
                    if (giftPropModel3 != null) {
                        imageUrl = giftPropModel3.getImageUrl();
                    } else {
                        imageUrl = null;
                    }
                    giftPropModel4 = giftView.f29934OooO0o0;
                    if (giftPropModel4 != null) {
                        boolValueOf = Boolean.valueOf(giftPropModel4.getIsNew());
                    } else {
                        boolValueOf = null;
                    }
                    giftPropModel5 = giftView.f29934OooO0o0;
                    if (giftPropModel5 != null) {
                        boolValueOf2 = Boolean.valueOf(giftPropModel5.getIsNewAnimated());
                    } else {
                        boolValueOf2 = null;
                    }
                    p597o0oo00O.OooOOOO.OooO0O0("wrm setNewGift\nlifecycleOwner.isNull = " + z4 + ", \n!this.isVisible = " + zOooO0o0 + ", \ngiftNewAnimationForEverydayFirstShowGiftIdList = " + zOooOO0o + ", \ngiftPropModel \nisNull = " + z5 + ",  giftId = " + numValueOf2 + ",  imageUrl = " + imageUrl + ",  isNew = " + boolValueOf + ",  isNewAnimated = " + boolValueOf2 + ", ");
                }
                if (giftView.lifecycleOwner == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                }
                if ((giftView.f29934OooO0o0 == null) && com.code.android.util.o000O.OooO0o0(giftView)) {
                    oOo00OO0 ooo00oo0OooOO0O2 = p417o0Oo0oO0.o00Oo0.OooOO0O();
                    GiftPropModel giftPropModel7 = giftView.f29934OooO0o0;
                    if (ooo00oo0OooOO0O2.OooOO0o(String.valueOf(giftPropModel7 != null ? Integer.valueOf(giftPropModel7.getGiftId()) : null))) {
                        return;
                    }
                    GiftPropModel giftPropModel8 = giftView.f29934OooO0o0;
                    if (com.code.android.util.o0OoOo0.OooO00o(giftPropModel8 != null ? Boolean.valueOf(giftPropModel8.getIsNew()) : null)) {
                        GiftPropModel giftPropModel9 = giftView.f29934OooO0o0;
                        if (com.code.android.util.o0OoOo0.OooO00o(giftPropModel9 != null ? Boolean.valueOf(giftPropModel9.getIsNewAnimated()) : null)) {
                            return;
                        }
                        final int i11 = 1;
                        giftView.postDelayed(new Runnable() { // from class: o000ooo0.o000000
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        o000000O o000000o2 = (o000000O) giftView;
                                        synchronized (o000000o2.f35855OooOOO0) {
                                            o000000o2.f35849OooO0oO = false;
                                            o000000o2.f35842OooO.OooO0Oo();
                                            SupportSQLiteStatement supportSQLiteStatement = o000000o2.f35850OooO0oo;
                                            if (supportSQLiteStatement != null) {
                                                supportSQLiteStatement.close();
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            break;
                                        }
                                        return;
                                    default:
                                        GiftView.setNewGift$lambda$0((GiftView) giftView);
                                        return;
                                }
                            }
                        }, 1000L);
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
                boolean zOooO0o1 = z2 ^ com.code.android.util.o000O.OooO0o0(giftView);
                oOo00OO0 ooo00oo0OooOO0O3 = p417o0Oo0oO0.o00Oo0.OooOO0O();
                giftPropModel = giftView.f29934OooO0o0;
                if (giftPropModel != null) {
                    numValueOf = Integer.valueOf(giftPropModel.getGiftId());
                } else {
                    numValueOf = null;
                }
                boolean zOooOO0o2 = ooo00oo0OooOO0O3.OooOO0o(String.valueOf(numValueOf));
                giftPropModel2 = giftView.f29934OooO0o0;
                if (giftPropModel2 == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (giftPropModel2 != null) {
                    numValueOf2 = Integer.valueOf(giftPropModel2.getGiftId());
                } else {
                    numValueOf2 = null;
                }
                giftPropModel3 = giftView.f29934OooO0o0;
                if (giftPropModel3 != null) {
                    imageUrl = giftPropModel3.getImageUrl();
                } else {
                    imageUrl = null;
                }
                giftPropModel4 = giftView.f29934OooO0o0;
                if (giftPropModel4 != null) {
                    boolValueOf = Boolean.valueOf(giftPropModel4.getIsNew());
                } else {
                    boolValueOf = null;
                }
                giftPropModel5 = giftView.f29934OooO0o0;
                if (giftPropModel5 != null) {
                    boolValueOf2 = Boolean.valueOf(giftPropModel5.getIsNewAnimated());
                } else {
                    boolValueOf2 = null;
                }
                p597o0oo00O.OooOOOO.OooO0O0("wrm setNewGift\nlifecycleOwner.isNull = " + z4 + ", \n!this.isVisible = " + zOooO0o1 + ", \ngiftNewAnimationForEverydayFirstShowGiftIdList = " + zOooOO0o2 + ", \ngiftPropModel \nisNull = " + z5 + ",  giftId = " + numValueOf2 + ",  imageUrl = " + imageUrl + ",  isNew = " + boolValueOf + ",  isNewAnimated = " + boolValueOf2 + ", ");
            }
            if (giftView.lifecycleOwner == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (giftView.f29934OooO0o0 == null) {
                }
            }
        }
    }
}
