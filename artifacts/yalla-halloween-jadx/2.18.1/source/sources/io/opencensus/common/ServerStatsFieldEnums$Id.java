package io.opencensus.common;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public enum ServerStatsFieldEnums$Id {
    SERVER_STATS_LB_LATENCY_ID(0),
    SERVER_STATS_SERVICE_LATENCY_ID(1),
    SERVER_STATS_TRACE_OPTION_ID(2);

    private static final TreeMap<Integer, ServerStatsFieldEnums$Id> map = new TreeMap<>();
    private final int value;

    static {
        for (ServerStatsFieldEnums$Id serverStatsFieldEnums$Id : values()) {
            map.put(Integer.valueOf(serverStatsFieldEnums$Id.value), serverStatsFieldEnums$Id);
        }
    }

    ServerStatsFieldEnums$Id(int i) {
        this.value = i;
    }
}
