package com.common.support.apm.model;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/common/support/apm/model/CModel;", "", ViewHierarchyConstants.TAG_KEY, "", "data", "(Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toJson", "toString", "apm_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CModel {

    @NotNull
    private final String data;

    @NotNull
    private final String tag;

    public CModel(@NotNull String tag, @NotNull String data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        this.tag = tag;
        this.data = data;
    }

    public static /* synthetic */ CModel copy$default(CModel cModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cModel.tag;
        }
        if ((i & 2) != 0) {
            str2 = cModel.data;
        }
        return cModel.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final CModel copy(@NotNull String tag, @NotNull String data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        return new CModel(tag, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CModel)) {
            return false;
        }
        CModel cModel = (CModel) other;
        return Intrinsics.areEqual(this.tag, cModel.tag) && Intrinsics.areEqual(this.data, cModel.data);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.tag.hashCode() * 31);
    }

    @NotNull
    public final String toJson() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{\"Tag\":\"");
        sbOooO0o0.append(this.tag);
        sbOooO0o0.append("\",\"Data\":");
        return o00oO0o.OooO0O0(sbOooO0o0, this.data, '}');
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CModel(tag=");
        sbOooO0o0.append(this.tag);
        sbOooO0o0.append(", data=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.data, ')');
    }

    public /* synthetic */ CModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
