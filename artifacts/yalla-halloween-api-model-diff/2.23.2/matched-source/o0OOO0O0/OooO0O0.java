package o0OOO0O0;

import com.ss.ugc.android.alpha_player.model.AlphaVideoViewType;
import com.ss.ugc.android.alpha_player.player.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[AlphaVideoViewType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[AlphaVideoViewType.GL_SURFACE_VIEW.ordinal()] = 1;
        iArr[AlphaVideoViewType.GL_TEXTURE_VIEW.ordinal()] = 2;
        int[] iArr2 = new int[PlayerState.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[PlayerState.PREPARED.ordinal()] = 1;
        PlayerState playerState = PlayerState.PAUSED;
        iArr2[playerState.ordinal()] = 2;
        iArr2[PlayerState.NOT_PREPARED.ordinal()] = 3;
        iArr2[PlayerState.STOPPED.ordinal()] = 4;
        int[] iArr3 = new int[PlayerState.values().length];
        $EnumSwitchMapping$2 = iArr3;
        PlayerState playerState2 = PlayerState.STARTED;
        iArr3[playerState2.ordinal()] = 1;
        int[] iArr4 = new int[PlayerState.values().length];
        $EnumSwitchMapping$3 = iArr4;
        iArr4[playerState2.ordinal()] = 1;
        iArr4[playerState.ordinal()] = 2;
    }
}
