package com.yalla.yalla.module.event.ui.screen;

import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/module/event/ui/screen/EventPage;", "", "Ljava/io/Serializable;", "SquareOngoing", "SquareUpcoming", "MineSubscribe", "MineCreator", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum EventPage implements Serializable {
    SquareOngoing,
    SquareUpcoming,
    MineSubscribe,
    MineCreator;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventPage.values().length];
            try {
                iArr[EventPage.SquareOngoing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventPage.SquareUpcoming.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventPage.MineSubscribe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
