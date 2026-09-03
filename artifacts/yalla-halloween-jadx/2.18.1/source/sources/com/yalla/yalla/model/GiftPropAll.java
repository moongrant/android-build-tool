package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.weieyu.yalla.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/model/GiftPropAll;", "Ljava/io/Serializable;", "()V", "list", "", "Lcom/yalla/yalla/model/GiftPropModel;", "propTitleNames", "Lcom/yalla/yalla/model/GiftPropTitleModel;", "propUserType", "", "getPropUserType", "()I", "setPropUserType", "(I)V", "showArea", "getListAll", "getListForRegion", "region", "getTitleNameForRegion", "", "initTitleNamesAndShowArea", "", "showIn", "", "Lcom/yalla/yalla/model/GiftPropTypeShow;", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GiftPropAll implements Serializable {
    public static final int $stable = 8;
    private int propUserType;

    @SerializedName("propUserTypeNames")
    @Nullable
    private List<GiftPropTitleModel> propTitleNames = new ArrayList();

    @SerializedName("showArea")
    @Nullable
    private List<Integer> showArea = new ArrayList();

    @SerializedName("list")
    @Nullable
    private List<GiftPropModel> list = new ArrayList();

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

    public final int getPropUserType() {
        return this.propUserType;
    }

    @NotNull
    public final String getTitleNameForRegion() {
        Integer value = OooOOO.f41216OooO00o.OooOOO().getValue();
        Integer num = value;
        if (num != null && num.intValue() == -1) {
            value = Integer.valueOf(oo000o.OooO0O0());
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
                Integer num2 = value;
                if (num2 != null && region == num2.intValue()) {
                    name = giftPropTitleModel.getName();
                }
                i = i2;
            }
        }
        return this.propUserType == GiftPropTypeUser.Hot.getValue() ? o000O0O0.OooO0OO(R.string.dialog_gift_send_hot) : name;
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
        if (z2 && this.propUserType == GiftPropTypeUser.Hot.getValue()) {
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

    public final void setPropUserType(int i) {
        this.propUserType = i;
    }

    public final boolean showIn(@NotNull GiftPropTypeShow showIn) {
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        List<Integer> list = this.showArea;
        return list != null && list.contains(Integer.valueOf(showIn.getValue()));
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("GiftPropType(\n\tpropUserType = ");
        sbOooO0o0.append(this.propUserType);
        sbOooO0o0.append(", \n\tpropTitleNames = ");
        sbOooO0o0.append(this.propTitleNames);
        sbOooO0o0.append(", \n\tshowArea = ");
        sbOooO0o0.append(this.showArea);
        sbOooO0o0.append(", \n\tlist = ");
        return o000O0Oo.OooO00o(sbOooO0o0, this.list, ')');
    }
}
