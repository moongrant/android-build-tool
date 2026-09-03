package org.cocos2dx.lib.out.event;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class YLGiftEventManager {
    public static final String KEY_GIFT_EVENT = "key_gift_event";
    private static YLGiftEventManager instance;
    private Map<String, EventHandle> eventHandleMap;

    private YLGiftEventManager() {
    }

    public static YLGiftEventManager getInstance() {
        if (instance == null) {
            synchronized (YLGiftEventManager.class) {
                if (instance == null) {
                    instance = new YLGiftEventManager();
                }
            }
        }
        return instance;
    }

    public EventHandle getEventHandle(String str) {
        Map<String, EventHandle> map = this.eventHandleMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void handleEvent(String str, Object... objArr) {
        synchronized (YLGiftEventManager.class) {
            Map<String, EventHandle> map = this.eventHandleMap;
            if (map != null && map.get(str) != null) {
                this.eventHandleMap.get(str).handleEvent(objArr);
            }
        }
    }

    public void registerEventHandle(String str, EventHandle eventHandle) {
        synchronized (YLGiftEventManager.class) {
            if (this.eventHandleMap == null) {
                this.eventHandleMap = new HashMap();
            }
            this.eventHandleMap.put(str, eventHandle);
        }
    }

    public void unRegisterEventHandle(String str) {
        synchronized (YLGiftEventManager.class) {
            Map<String, EventHandle> map = this.eventHandleMap;
            if (map != null) {
                map.remove(str);
            }
        }
    }
}
