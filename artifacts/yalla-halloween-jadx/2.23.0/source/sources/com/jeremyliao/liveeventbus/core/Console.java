package com.jeremyliao.liveeventbus.core;

/* JADX INFO: loaded from: classes4.dex */
public final class Console {
    private Console() {
    }

    public static String getInfo() {
        return LiveEventBusCore.get().console.getConsoleInfo();
    }
}
