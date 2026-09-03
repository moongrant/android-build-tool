package com.yalla.yalla.model.event;

import OooO0OO.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/event/EventSettingModel;", "", "isAddToCalendar", "", "(I)V", "()I", "setAddToCalendar", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EventSettingModel {
    public static final int $stable = 8;
    private int isAddToCalendar;

    public EventSettingModel() {
        this(0, 1, null);
    }

    public static /* synthetic */ EventSettingModel copy$default(EventSettingModel eventSettingModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventSettingModel.isAddToCalendar;
        }
        return eventSettingModel.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIsAddToCalendar() {
        return this.isAddToCalendar;
    }

    @NotNull
    public final EventSettingModel copy(int isAddToCalendar) {
        return new EventSettingModel(isAddToCalendar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventSettingModel) && this.isAddToCalendar == ((EventSettingModel) other).isAddToCalendar;
    }

    public int hashCode() {
        return this.isAddToCalendar;
    }

    public final int isAddToCalendar() {
        return this.isAddToCalendar;
    }

    public final void setAddToCalendar(int i) {
        this.isAddToCalendar = i;
    }

    @NotNull
    public String toString() {
        return OooO00o.OooO00o("EventSettingModel(isAddToCalendar=", this.isAddToCalendar, ")");
    }

    public EventSettingModel(int i) {
        this.isAddToCalendar = i;
    }

    public /* synthetic */ EventSettingModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
