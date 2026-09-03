package com.yalla.yalla.model.gift;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftPropTypeUser;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "Hot", "Premium", "Vip", "Flags", "Member", "Wealth", "Backpack", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum GiftPropTypeUser {
    Hot(0),
    Premium(1),
    Vip(2),
    Flags(3),
    Member(4),
    Wealth(5),
    Backpack(101);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftPropTypeUser$Companion;", "", "()V", "of", "Lcom/yalla/yalla/model/gift/GiftPropTypeUser;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/Integer;)Lcom/yalla/yalla/model/gift/GiftPropTypeUser;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GiftPropTypeUser of(@Nullable Integer value) {
            GiftPropTypeUser giftPropTypeUser = GiftPropTypeUser.Hot;
            int value2 = giftPropTypeUser.getValue();
            if (value != null && value.intValue() == value2) {
                return giftPropTypeUser;
            }
            GiftPropTypeUser giftPropTypeUser2 = GiftPropTypeUser.Premium;
            int value3 = giftPropTypeUser2.getValue();
            if (value == null || value.intValue() != value3) {
                giftPropTypeUser2 = GiftPropTypeUser.Vip;
                int value4 = giftPropTypeUser2.getValue();
                if (value == null || value.intValue() != value4) {
                    giftPropTypeUser2 = GiftPropTypeUser.Flags;
                    int value5 = giftPropTypeUser2.getValue();
                    if (value == null || value.intValue() != value5) {
                        giftPropTypeUser2 = GiftPropTypeUser.Member;
                        int value6 = giftPropTypeUser2.getValue();
                        if (value == null || value.intValue() != value6) {
                            giftPropTypeUser2 = GiftPropTypeUser.Wealth;
                            int value7 = giftPropTypeUser2.getValue();
                            if (value == null || value.intValue() != value7) {
                                giftPropTypeUser2 = GiftPropTypeUser.Backpack;
                                int value8 = giftPropTypeUser2.getValue();
                                if (value == null || value.intValue() != value8) {
                                    return giftPropTypeUser;
                                }
                            }
                        }
                    }
                }
            }
            return giftPropTypeUser2;
        }
    }

    GiftPropTypeUser(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
