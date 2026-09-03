package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/model/RedemptionCodeType;", "", "()V", "RewardType", "Unit", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RedemptionCodeType {
    public static final int $stable = 0;

    @NotNull
    public static final RedemptionCodeType INSTANCE = new RedemptionCodeType();

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/RedemptionCodeType$RewardType;", "", "()V", "BackpackGift", "", "getBackpackGift", "()I", "ChatBox", "getChatBox", "Coin", "getCoin", "Driving", "getDriving", "EntrySpecialEffects", "getEntrySpecialEffects", "HeadwearCard", "getHeadwearCard", "RoomTheme", "getRoomTheme", "UserInfoCar", "getUserInfoCar", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RewardType {
        public static final int $stable = 0;

        @NotNull
        public static final RewardType INSTANCE = new RewardType();
        private static final int EntrySpecialEffects = 1;
        private static final int HeadwearCard = 2;
        private static final int UserInfoCar = 3;
        private static final int ChatBox = 4;
        private static final int BackpackGift = 5;
        private static final int Coin = 6;
        private static final int RoomTheme = 7;
        private static final int Driving = 8;

        private RewardType() {
        }

        public final int getBackpackGift() {
            return BackpackGift;
        }

        public final int getChatBox() {
            return ChatBox;
        }

        public final int getCoin() {
            return Coin;
        }

        public final int getDriving() {
            return Driving;
        }

        public final int getEntrySpecialEffects() {
            return EntrySpecialEffects;
        }

        public final int getHeadwearCard() {
            return HeadwearCard;
        }

        public final int getRoomTheme() {
            return RoomTheme;
        }

        public final int getUserInfoCar() {
            return UserInfoCar;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/RedemptionCodeType$Unit;", "", "()V", "Coin", "", "getCoin", "()I", "Count", "getCount", "Days", "getDays", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unit {
        public static final int $stable = 0;

        @NotNull
        public static final Unit INSTANCE = new Unit();
        private static final int Count = 1;
        private static final int Days = 2;
        private static final int Coin = 3;

        private Unit() {
        }

        public final int getCoin() {
            return Coin;
        }

        public final int getCount() {
            return Count;
        }

        public final int getDays() {
            return Days;
        }
    }

    private RedemptionCodeType() {
    }
}
