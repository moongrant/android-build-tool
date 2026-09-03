package com.yalla.yalla.ui.screen.report.utils;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.ReportFromData;
import com.yalla.yalla.model.ReportModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yalla/yalla/ui/screen/report/utils/ReportParam;", "Landroid/os/Parcelable;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ReportParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReportParam> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final List<ReportFromData> f29649OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final List<ReportModel> f29651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Long f29652OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Integer f29653OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Integer f29654OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Long f29655OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Integer f29656OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Integer f29657OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final String f29658OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final Integer f29659OooOOO0;

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
            return new ReportParam(i, lValueOf, arrayList, numValueOf, numValueOf2, arrayList2, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportParam[] newArray(int i) {
            return new ReportParam[i];
        }
    }

    public ReportParam(int i, @Nullable Long l, @Nullable List<ReportModel> list, @Nullable Integer num, @Nullable Integer num2, @Nullable List<ReportFromData> list2, @Nullable Long l2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str) {
        this.f29650OooO0Oo = i;
        this.f29652OooO0o0 = l;
        this.f29651OooO0o = list;
        this.f29653OooO0oO = num;
        this.f29654OooO0oo = num2;
        this.f29649OooO = list2;
        this.f29655OooOO0 = l2;
        this.f29656OooOO0O = num3;
        this.f29657OooOO0o = num4;
        this.f29659OooOOO0 = num5;
        this.f29658OooOOO = str;
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
        return this.f29650OooO0Oo == reportParam.f29650OooO0Oo && Intrinsics.areEqual(this.f29652OooO0o0, reportParam.f29652OooO0o0) && Intrinsics.areEqual(this.f29651OooO0o, reportParam.f29651OooO0o) && Intrinsics.areEqual(this.f29653OooO0oO, reportParam.f29653OooO0oO) && Intrinsics.areEqual(this.f29654OooO0oo, reportParam.f29654OooO0oo) && Intrinsics.areEqual(this.f29649OooO, reportParam.f29649OooO) && Intrinsics.areEqual(this.f29655OooOO0, reportParam.f29655OooOO0) && Intrinsics.areEqual(this.f29656OooOO0O, reportParam.f29656OooOO0O) && Intrinsics.areEqual(this.f29657OooOO0o, reportParam.f29657OooOO0o) && Intrinsics.areEqual(this.f29659OooOOO0, reportParam.f29659OooOOO0) && Intrinsics.areEqual(this.f29658OooOOO, reportParam.f29658OooOOO);
    }

    public final int hashCode() {
        int i = this.f29650OooO0Oo * 31;
        Long l = this.f29652OooO0o0;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        List<ReportModel> list = this.f29651OooO0o;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f29653OooO0oO;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f29654OooO0oo;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ReportFromData> list2 = this.f29649OooO;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l2 = this.f29655OooOO0;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.f29656OooOO0O;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f29657OooOO0o;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f29659OooOOO0;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.f29658OooOOO;
        return iHashCode9 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportParam(reportType=");
        sb.append(this.f29650OooO0Oo);
        sb.append(", sourceId=");
        sb.append(this.f29652OooO0o0);
        sb.append(", listData=");
        sb.append(this.f29651OooO0o);
        sb.append(", reasonId=");
        sb.append(this.f29653OooO0oO);
        sb.append(", catagoryId=");
        sb.append(this.f29654OooO0oo);
        sb.append(", messagesList=");
        sb.append(this.f29649OooO);
        sb.append(", extendSourceId=");
        sb.append(this.f29655OooOO0);
        sb.append(", parentTitleType=");
        sb.append(this.f29656OooOO0O);
        sb.append(", viewSourceType=");
        sb.append(this.f29657OooOO0o);
        sb.append(", privateChatReportType=");
        sb.append(this.f29659OooOOO0);
        sb.append(", friendRequestMessage=");
        return o0O00o0.OooO0O0(sb, this.f29658OooOOO, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f29650OooO0Oo);
        Long l = this.f29652OooO0o0;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        List<ReportModel> list = this.f29651OooO0o;
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
        Integer num = this.f29653OooO0oO;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f29654OooO0oo;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        List<ReportFromData> list2 = this.f29649OooO;
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
        Long l2 = this.f29655OooOO0;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l2.longValue());
        }
        Integer num3 = this.f29656OooOO0O;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.f29657OooOO0o;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.f29659OooOOO0;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        out.writeString(this.f29658OooOOO);
    }
}
