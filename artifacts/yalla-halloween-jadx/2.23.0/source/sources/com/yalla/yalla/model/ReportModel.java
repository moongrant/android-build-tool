package com.yalla.yalla.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR \u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\b¨\u0006."}, d2 = {"Lcom/yalla/yalla/model/ReportModel;", "Landroid/os/Parcelable;", "()V", "catagoryId", "", "getCatagoryId", "()Ljava/lang/Integer;", "setCatagoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "children", "", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "id", "getId", "setId", "needExtendType", "getNeedExtendType", "setNeedExtendType", "nodeType", "getNodeType", "setNodeType", "pId", "getPId", "setPId", "sort", "getSort", "setSort", ViewHierarchyConstants.TEXT_KEY, "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "titleType", "getTitleType", "setTitleType", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReportModel implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ReportModel> CREATOR = new Creator();

    @SerializedName("catagoryId")
    @Nullable
    private Integer catagoryId;

    @SerializedName("children")
    @Nullable
    private List<ReportModel> children;

    @SerializedName("id")
    @Nullable
    private Integer id;

    @SerializedName("needExtendType")
    @Nullable
    private Integer needExtendType;

    @SerializedName("nodeType")
    @Nullable
    private Integer nodeType;

    @SerializedName("pId")
    @Nullable
    private Integer pId;

    @SerializedName("sort")
    @Nullable
    private Integer sort;

    @SerializedName(ViewHierarchyConstants.TEXT_KEY)
    @Nullable
    private String text;

    @SerializedName("titleType")
    @Nullable
    private Integer titleType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReportModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReportModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new ReportModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReportModel[] newArray(int i) {
            return new ReportModel[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Integer getCatagoryId() {
        return this.catagoryId;
    }

    @Nullable
    public final List<ReportModel> getChildren() {
        return this.children;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getNeedExtendType() {
        return this.needExtendType;
    }

    @Nullable
    public final Integer getNodeType() {
        return this.nodeType;
    }

    @Nullable
    public final Integer getPId() {
        return this.pId;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTitleType() {
        return this.titleType;
    }

    public final void setCatagoryId(@Nullable Integer num) {
        this.catagoryId = num;
    }

    public final void setChildren(@Nullable List<ReportModel> list) {
        this.children = list;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setNeedExtendType(@Nullable Integer num) {
        this.needExtendType = num;
    }

    public final void setNodeType(@Nullable Integer num) {
        this.nodeType = num;
    }

    public final void setPId(@Nullable Integer num) {
        this.pId = num;
    }

    public final void setSort(@Nullable Integer num) {
        this.sort = num;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTitleType(@Nullable Integer num) {
        this.titleType = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(1);
    }
}
