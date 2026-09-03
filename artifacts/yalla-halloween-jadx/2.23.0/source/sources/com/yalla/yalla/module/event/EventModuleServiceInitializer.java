package com.yalla.yalla.module.event;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.module_service.BaseModuleServiceInitializer;
import com.yalla.yalla.module.event.ui.screen.EventCreateScreen;
import com.yalla.yalla.module.event.ui.screen.EventDetailScreen;
import com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen;
import com.yalla.yalla.module.event.ui.screen.EventRuleScreen;
import com.yalla.yalla.module.event.ui.screen.EventSettingScreen;
import com.yalla.yalla.module.event.ui.screen.RoomEventHistoryScreen;
import kotlin.Metadata;
import o000O00.o00000O;
import p188o00o0O.OooOO0;
import p436o0OoOo.o0O0O00;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/module/event/EventModuleServiceInitializer;", "Lcom/yalla/yalla/common/module_service/BaseModuleServiceInitializer;", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class EventModuleServiceInitializer extends BaseModuleServiceInitializer {
    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final Object OooO00o() {
        return new o0O0O00();
    }

    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final void OooO0O0() {
        OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
        oo0oOO0.OooO0oo(RoomEventHistoryScreen.INSTANCE);
        oo0oOO0.OooO0oo(EventRuleScreen.INSTANCE);
        oo0oOO0.OooO0oo(EventSettingScreen.INSTANCE);
        oo0oOO0.OooO0oo(EventRoomPreviewScreen.INSTANCE);
        oo0oOO0.OooO0oo(EventCreateScreen.INSTANCE);
        oo0oOO0.OooO0oo(EventDetailScreen.INSTANCE);
    }
}
