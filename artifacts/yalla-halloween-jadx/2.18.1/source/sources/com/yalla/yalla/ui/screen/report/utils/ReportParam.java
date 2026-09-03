package com.yalla.yalla.ui.screen.report.utils;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.ReportModel;
import com.yalla.yalla.common.model.ReportFromData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yalla/yalla/ui/screen/report/utils/ReportParam;", "Landroid/os/Parcelable;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ReportParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReportParam> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public final Integer f24741Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f24742Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final Long f24743Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final List<ReportModel> f24744Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public final Integer f24745OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public final List<ReportFromData> f24746OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public final Integer f24747OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public final Long f24748OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public final Integer f24749OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Integer f24750o000oOoO;

    public static final class OooO00o implements Parcelable.Creator<ReportParam> {
        @Override // android.os.Parcelable.Creator
        public final ReportParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(ReportModel.CREATOR.createFromParcel(parcel));
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList3.add(ReportFromData.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new ReportParam(i, lValueOf, arrayList, numValueOf, numValueOf2, arrayList2, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReportParam[] newArray(int i) {
            return new ReportParam[i];
        }
    }

    public ReportParam(int i, @Nullable Long l, @Nullable List<ReportModel> list, @Nullable Integer num, @Nullable Integer num2, @Nullable List<ReportFromData> list2, @Nullable Long l2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.f24742Oooo0o = i;
        this.f24743Oooo0oO = l;
        this.f24744Oooo0oo = list;
        this.f24741Oooo = num;
        this.f24747OoooO00 = num2;
        this.f24746OoooO0 = list2;
        this.f24748OoooO0O = l2;
        this.f24745OoooO = num3;
        this.f24749OoooOO0 = num4;
        this.f24750o000oOoO = num5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportParam)) {
            return false;
        }
        ReportParam reportParam = (ReportParam) obj;
        return this.f24742Oooo0o == reportParam.f24742Oooo0o && Intrinsics.areEqual(this.f24743Oooo0oO, reportParam.f24743Oooo0oO) && Intrinsics.areEqual(this.f24744Oooo0oo, reportParam.f24744Oooo0oo) && Intrinsics.areEqual(this.f24741Oooo, reportParam.f24741Oooo) && Intrinsics.areEqual(this.f24747OoooO00, reportParam.f24747OoooO00) && Intrinsics.areEqual(this.f24746OoooO0, reportParam.f24746OoooO0) && Intrinsics.areEqual(this.f24748OoooO0O, reportParam.f24748OoooO0O) && Intrinsics.areEqual(this.f24745OoooO, reportParam.f24745OoooO) && Intrinsics.areEqual(this.f24749OoooOO0, reportParam.f24749OoooOO0) && Intrinsics.areEqual(this.f24750o000oOoO, reportParam.f24750o000oOoO);
    }

    public final int hashCode() {
        int i = this.f24742Oooo0o * 31;
        Long l = this.f24743Oooo0oO;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        List<ReportModel> list = this.f24744Oooo0oo;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f24741Oooo;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24747OoooO00;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ReportFromData> list2 = this.f24746OoooO0;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l2 = this.f24748OoooO0O;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.f24745OoooO;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f24749OoooOO0;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f24750o000oOoO;
        return iHashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ReportParam(reportType=");
        sbOooO0o0.append(this.f24742Oooo0o);
        sbOooO0o0.append(", sourceId=");
        sbOooO0o0.append(this.f24743Oooo0oO);
        sbOooO0o0.append(", listData=");
        sbOooO0o0.append(this.f24744Oooo0oo);
        sbOooO0o0.append(", reasonId=");
        sbOooO0o0.append(this.f24741Oooo);
        sbOooO0o0.append(", catagoryId=");
        sbOooO0o0.append(this.f24747OoooO00);
        sbOooO0o0.append(", messagesList=");
        sbOooO0o0.append(this.f24746OoooO0);
        sbOooO0o0.append(", extendSourceId=");
        sbOooO0o0.append(this.f24748OoooO0O);
        sbOooO0o0.append(", parentTitleType=");
        sbOooO0o0.append(this.f24745OoooO);
        sbOooO0o0.append(", viewSourceType=");
        sbOooO0o0.append(this.f24749OoooOO0);
        sbOooO0o0.append(", privateChatReportType=");
        sbOooO0o0.append(this.f24750o000oOoO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f24742Oooo0o);
        Long l = this.f24743Oooo0oO;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        List<ReportModel> list = this.f24744Oooo0oo;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator<ReportModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i);
            }
        }
        Integer num = this.f24741Oooo;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f24747OoooO00;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        List<ReportFromData> list2 = this.f24746OoooO0;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            Iterator<ReportFromData> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(out, i);
            }
        }
        Long l2 = this.f24748OoooO0O;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l2.longValue());
        }
        Integer num3 = this.f24745OoooO;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.f24749OoooOO0;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.f24750o000oOoO;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
    }
}
