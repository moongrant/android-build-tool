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
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p449o0OoOoo0.oo00oO;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/module/event/EventModuleServiceInitializer;", "Lcom/yalla/yalla/common/module_service/BaseModuleServiceInitializer;", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class EventModuleServiceInitializer extends BaseModuleServiceInitializer {
    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final Object OooO00o() {
        return new oo00oO();
    }

    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final void OooO0O0() {
        OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
        o00O00.OooO0oo(RoomEventHistoryScreen.INSTANCE);
        o00O00.OooO0oo(EventRuleScreen.INSTANCE);
        o00O00.OooO0oo(EventSettingScreen.INSTANCE);
        o00O00.OooO0oo(EventRoomPreviewScreen.INSTANCE);
        o00O00.OooO0oo(EventCreateScreen.INSTANCE);
        o00O00.OooO0oo(EventDetailScreen.INSTANCE);
    }
}
