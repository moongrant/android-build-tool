package com.ss.ugc.android.alpha_player.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "", "Companion", "OooO00o", "ScaleToFill", "ScaleAspectFitCenter", "ScaleAspectFill", "TopFill", "BottomFill", "LeftFill", "RightFill", "TopFit", "BottomFit", "LeftFit", "RightFit", "alpha_player_release"}, k = 1, mv = {1, 4, 0})
public enum ScaleType {
    ScaleToFill,
    ScaleAspectFitCenter,
    ScaleAspectFill,
    TopFill,
    BottomFill,
    LeftFill,
    RightFill,
    TopFit,
    BottomFit,
    LeftFit,
    RightFit;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.ss.ugc.android.alpha_player.model.ScaleType$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static ScaleType OooO00o(int i) {
            switch (i) {
                case 1:
                    return ScaleType.ScaleAspectFitCenter;
                case 2:
                    return ScaleType.ScaleAspectFill;
                case 3:
                    return ScaleType.TopFill;
                case 4:
                    return ScaleType.BottomFill;
                case 5:
                    return ScaleType.LeftFill;
                case 6:
                    return ScaleType.RightFill;
                case 7:
                    return ScaleType.TopFit;
                case 8:
                    return ScaleType.BottomFit;
                case 9:
                    return ScaleType.LeftFit;
                case 10:
                    return ScaleType.RightFit;
                default:
                    return ScaleType.ScaleToFill;
            }
        }
    }
}
