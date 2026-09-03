package p177o00o;

import com.common.statuslayout.StatusLayout;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0o {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[StatusLayout.State.values().length];
        $EnumSwitchMapping$0 = iArr;
        StatusLayout.State state = StatusLayout.State.Loading;
        iArr[state.ordinal()] = 1;
        StatusLayout.State state2 = StatusLayout.State.Empty;
        iArr[state2.ordinal()] = 2;
        StatusLayout.State state3 = StatusLayout.State.Error;
        iArr[state3.ordinal()] = 3;
        StatusLayout.State state4 = StatusLayout.State.Content;
        iArr[state4.ordinal()] = 4;
        int[] iArr2 = new int[StatusLayout.State.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[state.ordinal()] = 1;
        iArr2[state2.ordinal()] = 2;
        iArr2[state3.ordinal()] = 3;
        iArr2[state4.ordinal()] = 4;
    }
}
