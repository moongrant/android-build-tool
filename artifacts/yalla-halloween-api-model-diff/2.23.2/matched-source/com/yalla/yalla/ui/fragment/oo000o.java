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
import p405o0Oo0OOO.o0OO00OO;
import p414o0Oo0oO.oOo00OO0;
import p423o0OoO0OO.o00O0OOO;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends p571o0oOoO0.o0000oo<GiftPropModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f28424OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(List<GiftPropModel> list, GiftSendFragment giftSendFragment, Context context, int i) {
        super(i, context, list);
        this.f28424OooOoo0 = giftSendFragment;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0426  */
    /* JADX WARN: Code duplicated, block: B:165:0x042f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0490  */
    /* JADX WARN: Code duplicated, block: B:195:0x0494  */
    /* JADX WARN: Code duplicated, block: B:196:0x0496  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:200:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:204:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:206:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:210:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:215:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:223:0x0542  */
    /* JADX WARN: Code duplicated, block: B:224:0x0544  */
    /* JADX WARN: Code duplicated, block: B:226:0x0547  */
    /* JADX WARN: Code duplicated, block: B:228:0x054b  */
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
        GiftSendFragment giftSendFragment2 = this.f28424OooOoo0;
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
            p598o0oo00Oo.o0000O00.OooO0O0(sbOooO00o.toString());
            giftView.f29924OooO0o0 = item;
            o0OO00OO o0oo00oo2 = giftView.f29922OooO0Oo;
            if (item == null) {
                View selectBg = o0oo00oo2.f44577OooO;
                Intrinsics.checkNotNullExpressionValue(selectBg, "selectBg");
                com.code.android.util.o000O.OooO0OO(selectBg);
                SVGAView sVGAView = o0oo00oo2.f44580OooO0OO;
                sVGAView.setImageDrawable(null);
                sVGAView.OooO0o();
                sVGAView.clearAnimation();
                o0oo00oo2.f44579OooO0O0.setImageDrawable(null);
                o0oo00oo2.f44585OooO0oo.setText("");
                o0oo00oo2.f44582OooO0o.setImageDrawable(null);
                ImageView ivGiftNewTag = o0oo00oo2.f44583OooO0o0;
                Intrinsics.checkNotNullExpressionValue(ivGiftNewTag, "ivGiftNewTag");
                com.code.android.util.o000O.OooO0O0(ivGiftNewTag);
                giftSendFragment = giftSendFragment2;
            } else {
                giftView.f29925OooO0oO = StringsKt.trim((CharSequence) item.getImageUrl()).toString();
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
                    giftView.f29923OooO0o = strSubstring + ".svga";
                }
                SVGAView sVGAView2 = o0oo00oo2.f44580OooO0OO;
                int i4 = p562o0oOo000.o0Oo0oo.icon_gift_send_default_gray;
                sVGAView2.f13232OooOooO = i4;
                sVGAView2.setImageResource(i4);
                sVGAView2.OooOO0O(giftView.f29925OooO0oO, null);
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
                TextView textView = o0oo00oo2.f44585OooO0oo;
                textView.setText(string);
                boolean zIsCoin = item.isCoin();
                ImageView imageView2 = o0oo00oo2.f44579OooO0O0;
                if (zIsCoin) {
                    textView.setTextColor(o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_coin, giftView));
                    imageView2.setImageResource(p562o0oOo000.o0Oo0oo.coin_little);
                } else {
                    imageView2.setImageResource(p562o0oOo000.o0Oo0oo.icon_crystal_main_slide);
                    textView.setTextColor(o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_crystal, giftView));
                }
                ImageView ivGiftTag = o0oo00oo2.f44582OooO0o;
                ivGiftTag.setImageDrawable(null);
                Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                com.code.android.util.o000O.OooO0O0(ivGiftTag);
                TextView tvGiftTag = o0oo00oo2.f44588OooOO0o;
                Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
                com.code.android.util.o000O.OooO0O0(tvGiftTag);
                LinearLayoutCompat layoutGiftBackpackTimeTag = o0oo00oo2.f44584OooO0oO;
                Intrinsics.checkNotNullExpressionValue(layoutGiftBackpackTimeTag, "layoutGiftBackpackTimeTag");
                com.code.android.util.o000O.OooO0O0(layoutGiftBackpackTimeTag);
                TextView tvGiftBackpackTag = o0oo00oo2.f44586OooOO0;
                Intrinsics.checkNotNullExpressionValue(tvGiftBackpackTag, "tvGiftBackpackTag");
                com.code.android.util.o000O.OooO0O0(tvGiftBackpackTag);
                giftSendFragment = giftSendFragment2;
                giftView.f29921OooO = false;
                if (i2 == GiftPropTypeUser.Premium.getValue()) {
                    Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                    com.code.android.util.o000O.OooOOOO(ivGiftTag);
                    ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_nobillity);
                } else if (i2 == GiftPropTypeUser.Wealth.getValue()) {
                    if (item.getSendLvLimit() > 0) {
                        Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
                        com.code.android.util.o000O.OooOOOO(tvGiftTag);
                        tvGiftTag.setText(com.code.android.util.o0000O.OooO00o(o00O0OOO.OooO0O0(p562o0oOo000.o000000.LV_XXX, giftView), String.valueOf(item.getSendLvLimit())));
                    }
                } else if (i2 == GiftPropTypeUser.Vip.getValue()) {
                    Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                    com.code.android.util.o000O.OooOOOO(ivGiftTag);
                    ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_vip);
                } else {
                    if (i2 == GiftPropTypeUser.Member.getValue()) {
                        if (item.getSendLvLimit() > 0) {
                            Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
                            com.code.android.util.o000O.OooOOOO(tvGiftTag);
                            tvGiftTag.setText(com.code.android.util.o0000O.OooO00o(o00O0OOO.OooO0O0(p562o0oOo000.o000000.LV_XXX, giftView), String.valueOf(item.getSendLvLimit())));
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
                                giftView.f29921OooO = true;
                                Intrinsics.checkNotNullExpressionValue(layoutGiftBackpackTimeTag, "layoutGiftBackpackTimeTag");
                                com.code.android.util.o000O.OooOOOO(layoutGiftBackpackTimeTag);
                                String strOooO0OO = o0O0O0o0.OooO0OO(giftBackpackMinExpirationTimeStamp, z9 ? "dd/MM HH:mm" : "dd/MM/yyyy");
                                TextView tvGiftBackpackTimeTag = o0oo00oo2.f44587OooOO0O;
                                tvGiftBackpackTimeTag.setText(strOooO0OO);
                                Intrinsics.checkNotNullExpressionValue(tvGiftBackpackTimeTag, "tvGiftBackpackTimeTag");
                                int i10 = !p595o0oo00O.OooOo00.OooO0o0() ? 1 : 0;
                                Intrinsics.checkNotNullParameter(tvGiftBackpackTimeTag, "<this>");
                                tvGiftBackpackTimeTag.setLayoutDirection(i10 ^ 1);
                                tvGiftBackpackTimeTag.setTextDirection(i10 != 0 ? 3 : 4);
                                ImageView imageView3 = o0oo00oo2.f44581OooO0Oo;
                                if (j > 259200000) {
                                    layoutGiftBackpackTimeTag.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_ff575572_r360);
                                    imageView3.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_backpack_time_gray);
                                } else {
                                    layoutGiftBackpackTimeTag.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_ffff5b48_r360);
                                    imageView3.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_backpack_time_red);
                                }
                            }
                        }
                    } else {
                        str = "ivGiftNewTag";
                        Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                        com.code.android.util.o000O.OooOOOO(ivGiftTag);
                        if (item.getIsWeek()) {
                            ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_week);
                        } else if (item.getIsLuck()) {
                            ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_luck);
                        } else if (item.isCustomMade()) {
                            ivGiftTag.setImageResource(p562o0oOo000.o0O0O00.ic_gift_tag_custom_made);
                        } else if (item.isBlind()) {
                            ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_blind);
                        } else if (item.isAllSiteGift()) {
                            if (z6) {
                                ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_diamond);
                            }
                            if (showIn != GiftPropTypeShow.InRoom) {
                                Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                                com.code.android.util.o000O.OooO0O0(ivGiftTag);
                            }
                        } else if (item.getIsDyEffect()) {
                            ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_dy_effect);
                        } else if (item.getIsSoundEffect()) {
                            ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_sound_effect);
                            if (showIn != GiftPropTypeShow.InRoom) {
                                Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
                                com.code.android.util.o000O.OooO0O0(ivGiftTag);
                            }
                        } else if (item.getIsHot()) {
                            ivGiftTag.setImageResource(p562o0oOo000.o0Oo0oo.ic_gift_tag_activity);
                        }
                    }
                    isNew = item.getIsNew();
                    imageView = o0oo00oo2.f44583OooO0o0;
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
                imageView = o0oo00oo2.f44583OooO0o0;
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
            giftSendFragment3.setCurrentData(giftView2 != null ? giftView2.getF29924OooO0o0() : null);
            LiveEventBus.get("GiftSendDialogSelectGift").post(giftSendFragment3.selectedView);
        }
        if (giftView != null) {
            GiftPropModel giftPropModel6 = giftView.f29924OooO0o0;
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
                    oOo00OO0 ooo00oo0OooOO0O = p415o0Oo0oO0.o00Ooo.OooOO0O();
                    giftPropModel = giftView.f29924OooO0o0;
                    if (giftPropModel != null) {
                        numValueOf = Integer.valueOf(giftPropModel.getGiftId());
                    } else {
                        numValueOf = null;
                    }
                    boolean zOooOO0o = ooo00oo0OooOO0O.OooOO0o(String.valueOf(numValueOf));
                    giftPropModel2 = giftView.f29924OooO0o0;
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
                    giftPropModel3 = giftView.f29924OooO0o0;
                    if (giftPropModel3 != null) {
                        imageUrl = giftPropModel3.getImageUrl();
                    } else {
                        imageUrl = null;
                    }
                    giftPropModel4 = giftView.f29924OooO0o0;
                    if (giftPropModel4 != null) {
                        boolValueOf = Boolean.valueOf(giftPropModel4.getIsNew());
                    } else {
                        boolValueOf = null;
                    }
                    giftPropModel5 = giftView.f29924OooO0o0;
                    if (giftPropModel5 != null) {
                        boolValueOf2 = Boolean.valueOf(giftPropModel5.getIsNewAnimated());
                    } else {
                        boolValueOf2 = null;
                    }
                    p598o0oo00Oo.o0000O00.OooO0O0("wrm setNewGift\nlifecycleOwner.isNull = " + z4 + ", \n!this.isVisible = " + zOooO0o0 + ", \ngiftNewAnimationForEverydayFirstShowGiftIdList = " + zOooOO0o + ", \ngiftPropModel \nisNull = " + z5 + ",  giftId = " + numValueOf2 + ",  imageUrl = " + imageUrl + ",  isNew = " + boolValueOf + ",  isNewAnimated = " + boolValueOf2 + ", ");
                }
                if (giftView.lifecycleOwner == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                }
                if ((giftView.f29924OooO0o0 == null) && com.code.android.util.o000O.OooO0o0(giftView)) {
                    oOo00OO0 ooo00oo0OooOO0O2 = p415o0Oo0oO0.o00Ooo.OooOO0O();
                    GiftPropModel giftPropModel7 = giftView.f29924OooO0o0;
                    if (ooo00oo0OooOO0O2.OooOO0o(String.valueOf(giftPropModel7 != null ? Integer.valueOf(giftPropModel7.getGiftId()) : null))) {
                        return;
                    }
                    GiftPropModel giftPropModel8 = giftView.f29924OooO0o0;
                    if (com.code.android.util.o0OoOo0.OooO00o(giftPropModel8 != null ? Boolean.valueOf(giftPropModel8.getIsNew()) : null)) {
                        GiftPropModel giftPropModel9 = giftView.f29924OooO0o0;
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
                                        synchronized (o000000o2.f35848OooOOO0) {
                                            o000000o2.f35842OooO0oO = false;
                                            o000000o2.f35835OooO.OooO0Oo();
                                            SupportSQLiteStatement supportSQLiteStatement = o000000o2.f35843OooO0oo;
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
                oOo00OO0 ooo00oo0OooOO0O3 = p415o0Oo0oO0.o00Ooo.OooOO0O();
                giftPropModel = giftView.f29924OooO0o0;
                if (giftPropModel != null) {
                    numValueOf = Integer.valueOf(giftPropModel.getGiftId());
                } else {
                    numValueOf = null;
                }
                boolean zOooOO0o2 = ooo00oo0OooOO0O3.OooOO0o(String.valueOf(numValueOf));
                giftPropModel2 = giftView.f29924OooO0o0;
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
                giftPropModel3 = giftView.f29924OooO0o0;
                if (giftPropModel3 != null) {
                    imageUrl = giftPropModel3.getImageUrl();
                } else {
                    imageUrl = null;
                }
                giftPropModel4 = giftView.f29924OooO0o0;
                if (giftPropModel4 != null) {
                    boolValueOf = Boolean.valueOf(giftPropModel4.getIsNew());
                } else {
                    boolValueOf = null;
                }
                giftPropModel5 = giftView.f29924OooO0o0;
                if (giftPropModel5 != null) {
                    boolValueOf2 = Boolean.valueOf(giftPropModel5.getIsNewAnimated());
                } else {
                    boolValueOf2 = null;
                }
                p598o0oo00Oo.o0000O00.OooO0O0("wrm setNewGift\nlifecycleOwner.isNull = " + z4 + ", \n!this.isVisible = " + zOooO0o1 + ", \ngiftNewAnimationForEverydayFirstShowGiftIdList = " + zOooOO0o2 + ", \ngiftPropModel \nisNull = " + z5 + ",  giftId = " + numValueOf2 + ",  imageUrl = " + imageUrl + ",  isNew = " + boolValueOf + ",  isNewAnimated = " + boolValueOf2 + ", ");
            }
            if (giftView.lifecycleOwner == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (giftView.f29924OooO0o0 == null) {
                }
            }
        }
    }
}
