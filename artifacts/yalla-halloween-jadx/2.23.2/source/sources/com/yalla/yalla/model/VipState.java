package com.yalla.yalla.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/VipState;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "isFrozen", "", "isNormal", "isNotVip", "NotVip", "Vip", "VipFrozen", "VipHide", "VipFrozenHide", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum VipState {
    NotVip(0),
    Vip(1),
    VipFrozen(2),
    VipHide(3),
    VipFrozenHide(4);

    private int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/VipState$Companion;", "", "()V", "of", "Lcom/yalla/yalla/model/VipState;", "level", "", "(Ljava/lang/Integer;)Lcom/yalla/yalla/model/VipState;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VipState of(@Nullable Integer level) {
            if (level != null && level.intValue() == 0) {
                return VipState.NotVip;
            }
            if (level != null && level.intValue() == 1) {
                return VipState.Vip;
            }
            if (level != null && level.intValue() == 2) {
                return VipState.VipFrozen;
            }
            if (level != null && level.intValue() == 3) {
                return VipState.VipHide;
            }
            return (level != null && level.intValue() == 4) ? VipState.VipFrozenHide : VipState.NotVip;
        }
    }

    VipState(int i) {
        this.value = i;
    }

    @NotNull
    public static EnumEntries<VipState> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isFrozen() {
        return this == VipFrozen || this == VipFrozenHide;
    }

    public final boolean isNormal() {
        return this == Vip || this == VipHide;
    }

    public final boolean isNotVip() {
        return this == NotVip;
    }

    public final void setValue(int i) {
        this.value = i;
    }
}
