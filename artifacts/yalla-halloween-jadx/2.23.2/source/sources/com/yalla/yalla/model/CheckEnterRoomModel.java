package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/CheckEnterRoomModel;", "", "code", "", "toast", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToast", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/yalla/yalla/model/CheckEnterRoomModel;", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckEnterRoomModel {
    public static final int $stable = 0;

    @Nullable
    private final Integer code;

    @Nullable
    private final String toast;

    public CheckEnterRoomModel(@Nullable Integer num, @Nullable String str) {
        this.code = num;
        this.toast = str;
    }

    public static /* synthetic */ CheckEnterRoomModel copy$default(CheckEnterRoomModel checkEnterRoomModel, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = checkEnterRoomModel.code;
        }
        if ((i & 2) != 0) {
            str = checkEnterRoomModel.toast;
        }
        return checkEnterRoomModel.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToast() {
        return this.toast;
    }

    @NotNull
    public final CheckEnterRoomModel copy(@Nullable Integer code, @Nullable String toast) {
        return new CheckEnterRoomModel(code, toast);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckEnterRoomModel)) {
            return false;
        }
        CheckEnterRoomModel checkEnterRoomModel = (CheckEnterRoomModel) other;
        return Intrinsics.areEqual(this.code, checkEnterRoomModel.code) && Intrinsics.areEqual(this.toast, checkEnterRoomModel.toast);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getToast() {
        return this.toast;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.toast;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckEnterRoomModel(code=" + this.code + ", toast=" + this.toast + ")";
    }
}
