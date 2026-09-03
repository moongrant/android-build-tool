package com.yalla.yalla.model.gift;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yalla.yalla.model.LanguageThemeModel;
import com.yalla.yalla.service.room.OooO00o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p591o0oo000O.OooO;
import p591o0oo000O.OooOO0;
import p591o0oo000O.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u000e\u0010%\u001a\u00020&2\u0006\u0010%\u001a\u00020'J\b\u0010(\u001a\u00020!H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftPropAll;", "Ljava/io/Serializable;", "()V", "backpackInfo", "Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;", "getBackpackInfo", "()Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;", "setBackpackInfo", "(Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;)V", "giftPropTypeUser", "", "getGiftPropTypeUser", "()I", "setGiftPropTypeUser", "(I)V", "isNewTimeStamp", "", "()J", "setNewTimeStamp", "(J)V", "list", "", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "propTitleNames", "Lcom/yalla/yalla/model/gift/GiftPropTitleModel;", "redPostCountLocal", "getRedPostCountLocal", "setRedPostCountLocal", "showArea", "getListAll", "getListForRegion", "region", "getTitleNameForRegion", "", "initBackpack", "", "initTitleNamesAndShowArea", "showIn", "", "Lcom/yalla/yalla/model/gift/GiftPropTypeShow;", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGiftPropAll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPropAll.kt\ncom/yalla/yalla/model/gift/GiftPropAll\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1864#2,3:151\n1864#2,3:154\n1855#2,2:157\n1855#2,2:159\n*S KotlinDebug\n*F\n+ 1 GiftPropAll.kt\ncom/yalla/yalla/model/gift/GiftPropAll\n*L\n55#1:151,3\n70#1:154,3\n116#1:157,2\n133#1:159,2\n*E\n"})
public final class GiftPropAll implements Serializable {
    public static final int $stable = 8;

    @SerializedName("backpackInfo")
    @Nullable
    private GiftBackpackInfoModel backpackInfo;

    @SerializedName("propUserType")
    private int giftPropTypeUser;

    @SerializedName("isNewTimeStamp")
    private long isNewTimeStamp;
    private long redPostCountLocal;

    @SerializedName("propUserTypeNames")
    @Nullable
    private List<GiftPropTitleModel> propTitleNames = new ArrayList();

    @SerializedName("showArea")
    @Nullable
    private List<Integer> showArea = new ArrayList();

    @SerializedName(alternate = {"propInventory"}, value = "list")
    @Nullable
    private List<GiftPropModel> list = new ArrayList();

    @Nullable
    public final GiftBackpackInfoModel getBackpackInfo() {
        return this.backpackInfo;
    }

    public final int getGiftPropTypeUser() {
        return this.giftPropTypeUser;
    }

    @Nullable
    public final List<GiftPropModel> getListAll() {
        return this.list;
    }

    @NotNull
    public final List<GiftPropModel> getListForRegion(int region) {
        ArrayList arrayList = new ArrayList();
        List<GiftPropModel> list = this.list;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GiftPropModel giftPropModel = (GiftPropModel) obj;
                if (giftPropModel.getRegion() == 0 || giftPropModel.getRegion() == region) {
                    arrayList.add(giftPropModel);
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public final long getRedPostCountLocal() {
        return this.redPostCountLocal;
    }

    @NotNull
    public final String getTitleNameForRegion() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Object value = o000000O.OooOOO0().getValue();
        Integer num = (Integer) value;
        if (num != null && num.intValue() == -1) {
            value = Integer.valueOf(OooO.OooO0OO());
        }
        List<GiftPropTitleModel> list = this.propTitleNames;
        String name = "";
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GiftPropTitleModel giftPropTitleModel = (GiftPropTitleModel) obj;
                int region = giftPropTitleModel.getRegion();
                Integer num2 = (Integer) value;
                if (num2 != null && region == num2.intValue()) {
                    name = giftPropTitleModel.getName();
                }
                i = i2;
            }
        }
        return this.giftPropTypeUser == GiftPropTypeUser.Hot.getValue() ? o0000.OooO0OO(oO00OOo0.dialog_gift_send_hot) : name;
    }

    public final void initBackpack() {
        this.giftPropTypeUser = GiftPropTypeUser.Backpack.getValue();
        this.redPostCountLocal = 0L;
        boolean z = true;
        if (o00Oo0.OooOO0O().OooOO0O(this.giftPropTypeUser)) {
            this.redPostCountLocal = 1L;
            OooO00o.f24989OooOOo0.OooO0Oo(true);
        }
        List<GiftPropTitleModel> list = this.propTitleNames;
        if (list == null || list.isEmpty()) {
            this.propTitleNames = new ArrayList();
        }
        Context context = o000O0.f10354OooO00o;
        Context contextOooO0O0 = OooO0O0.OooO0O0();
        if (contextOooO0O0 == null) {
            contextOooO0O0 = o000O0.OooO00o();
        }
        int i = oO00OOo0.Backpack;
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        ArrayList<OooOO0.OooO00o> arrayList = new ArrayList();
        LanguageThemeModel languageThemeModel = OooOO0O.f56801OooO00o;
        int code = languageThemeModel.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel.getLanguage(), languageThemeModel.getCountry()))));
        LanguageThemeModel languageThemeModel2 = OooOO0O.f56802OooO0O0;
        int code2 = languageThemeModel2.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code2, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel2.getLanguage(), languageThemeModel2.getCountry()))));
        LanguageThemeModel languageThemeModel3 = OooOO0O.f56803OooO0OO;
        int code3 = languageThemeModel3.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code3, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel3.getLanguage(), languageThemeModel3.getCountry()))));
        LanguageThemeModel languageThemeModel4 = OooOO0O.f56804OooO0Oo;
        int code4 = languageThemeModel4.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code4, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel4.getLanguage(), languageThemeModel4.getCountry()))));
        LanguageThemeModel languageThemeModel5 = OooOO0O.f56806OooO0o0;
        int code5 = languageThemeModel5.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code5, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel5.getLanguage(), languageThemeModel5.getCountry()))));
        LanguageThemeModel languageThemeModel6 = OooOO0O.f56805OooO0o;
        int code6 = languageThemeModel6.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code6, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel6.getLanguage(), languageThemeModel6.getCountry()))));
        LanguageThemeModel languageThemeModel7 = OooOO0O.f56807OooO0oO;
        int code7 = languageThemeModel7.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code7, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel7.getLanguage(), languageThemeModel7.getCountry()))));
        LanguageThemeModel languageThemeModel8 = OooOO0O.f56808OooO0oo;
        int code8 = languageThemeModel8.getCode();
        Intrinsics.checkNotNullParameter(contextOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
        arrayList.add(new OooOO0.OooO00o(code8, OooOO0.OooO00o(contextOooO0O0, i, "", new Locale(languageThemeModel8.getLanguage(), languageThemeModel8.getCountry()))));
        for (OooOO0.OooO00o oooO00o : arrayList) {
            List<GiftPropTitleModel> list2 = this.propTitleNames;
            if (list2 != null) {
                GiftPropTitleModel giftPropTitleModel = new GiftPropTitleModel();
                giftPropTitleModel.setRegion(oooO00o.f56799OooO00o);
                giftPropTitleModel.setName(oooO00o.f56800OooO0O0);
                list2.add(giftPropTitleModel);
            }
        }
        List<Integer> list3 = this.showArea;
        if (list3 != null && !list3.isEmpty()) {
            z = false;
        }
        if (z) {
            this.showArea = new ArrayList();
        }
        if (this.giftPropTypeUser == GiftPropTypeUser.Backpack.getValue()) {
            List<Integer> list4 = this.showArea;
            if (list4 != null) {
                list4.add(Integer.valueOf(GiftPropTypeShow.InRoom.getValue()));
            }
            List<Integer> list5 = this.showArea;
            if (list5 != null) {
                list5.add(Integer.valueOf(GiftPropTypeShow.InMomentDetail.getValue()));
            }
            List<Integer> list6 = this.showArea;
            if (list6 != null) {
                list6.add(Integer.valueOf(GiftPropTypeShow.InMomentList.getValue()));
            }
            List<Integer> list7 = this.showArea;
            if (list7 != null) {
                list7.add(Integer.valueOf(GiftPropTypeShow.InChat.getValue()));
            }
        }
        List<GiftPropModel> list8 = this.list;
        if (list8 != null) {
            for (GiftPropModel giftPropModel : list8) {
                giftPropModel.setTypeUser(this.giftPropTypeUser);
                giftPropModel.setBackpackInfo(this.backpackInfo);
            }
        }
    }

    public final void initTitleNamesAndShowArea() {
        boolean z;
        List<GiftPropTitleModel> list = this.propTitleNames;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            this.propTitleNames = new ArrayList();
            z = true;
        } else {
            z = false;
        }
        List<Integer> list2 = this.showArea;
        if (list2 == null || list2.isEmpty()) {
            this.showArea = new ArrayList();
        } else {
            z2 = z;
        }
        if (z2 && this.giftPropTypeUser == GiftPropTypeUser.Hot.getValue()) {
            List<Integer> list3 = this.showArea;
            if (list3 != null) {
                list3.add(Integer.valueOf(GiftPropTypeShow.InRoom.getValue()));
            }
            List<Integer> list4 = this.showArea;
            if (list4 != null) {
                list4.add(Integer.valueOf(GiftPropTypeShow.InMomentDetail.getValue()));
            }
            List<Integer> list5 = this.showArea;
            if (list5 != null) {
                list5.add(Integer.valueOf(GiftPropTypeShow.InMomentList.getValue()));
            }
            List<Integer> list6 = this.showArea;
            if (list6 != null) {
                list6.add(Integer.valueOf(GiftPropTypeShow.InChat.getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: isNewTimeStamp, reason: from getter */
    public final long getIsNewTimeStamp() {
        return this.isNewTimeStamp;
    }

    public final void setBackpackInfo(@Nullable GiftBackpackInfoModel giftBackpackInfoModel) {
        this.backpackInfo = giftBackpackInfoModel;
    }

    public final void setGiftPropTypeUser(int i) {
        this.giftPropTypeUser = i;
    }

    public final void setNewTimeStamp(long j) {
        this.isNewTimeStamp = j;
    }

    public final void setRedPostCountLocal(long j) {
        this.redPostCountLocal = j;
    }

    public final boolean showIn(@NotNull GiftPropTypeShow showIn) {
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        List<Integer> list = this.showArea;
        return list != null && list.contains(Integer.valueOf(showIn.getValue()));
    }

    @NotNull
    public String toString() {
        return "GiftPropType(\n\tgiftPropTypeUser = " + this.giftPropTypeUser + ", \n\tpropTitleNames = " + this.propTitleNames + ", \n\tshowArea = " + this.showArea + ", \n\tlist = " + this.list + ")";
    }
}
