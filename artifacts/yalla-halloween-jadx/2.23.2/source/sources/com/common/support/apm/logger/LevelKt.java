package com.common.support.apm.logger;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"LEVEL_D", "", "LEVEL_E", "LEVEL_I", "LEVEL_V", "LEVEL_W", "levelStringValue", "", "level", "sailfish_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LevelKt {
    public static final int LEVEL_D = 2;
    public static final int LEVEL_E = 5;
    public static final int LEVEL_I = 3;
    public static final int LEVEL_V = 1;
    public static final int LEVEL_W = 4;

    @NotNull
    public static final String levelStringValue(int i) {
        if (i == 1) {
            return "Verbose";
        }
        if (i == 2) {
            return "Debug";
        }
        if (i == 3) {
            return "Info";
        }
        if (i != 4) {
            return i != 5 ? "Verbose" : "Error";
        }
        return "Warning";
    }
}
