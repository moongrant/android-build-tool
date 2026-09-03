package com.yalla.yalla.ui.view;

import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class NumberSize {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final NumberSize f25021OooO00o = new NumberSize();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final int[] f25022OooO0O0 = {R.drawable.ic_num_s_0, R.drawable.ic_num_s_1, R.drawable.ic_num_s_2, R.drawable.ic_num_s_3, R.drawable.ic_num_s_4, R.drawable.ic_num_s_5, R.drawable.ic_num_s_6, R.drawable.ic_num_s_7, R.drawable.ic_num_s_8, R.drawable.ic_num_s_9};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final int[] f25023OooO0OO = {R.drawable.ic_num_m_0, R.drawable.ic_num_m_1, R.drawable.ic_num_m_2, R.drawable.ic_num_m_3, R.drawable.ic_num_m_4, R.drawable.ic_num_m_5, R.drawable.ic_num_m_6, R.drawable.ic_num_m_7, R.drawable.ic_num_m_8, R.drawable.ic_num_m_9};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final int[] f25024OooO0Oo = {R.drawable.ic_num_h_0, R.drawable.ic_num_h_1, R.drawable.ic_num_h_2, R.drawable.ic_num_h_3, R.drawable.ic_num_h_4, R.drawable.ic_num_h_5, R.drawable.ic_num_h_6, R.drawable.ic_num_h_7, R.drawable.ic_num_h_8, R.drawable.ic_num_h_9};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final int[] f25026OooO0o0 = {R.drawable.ic_num_x_0, R.drawable.ic_num_x_1, R.drawable.ic_num_x_2, R.drawable.ic_num_x_3, R.drawable.ic_num_x_4, R.drawable.ic_num_x_5, R.drawable.ic_num_x_6, R.drawable.ic_num_x_7, R.drawable.ic_num_x_8, R.drawable.ic_num_x_9};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final int[] f25025OooO0o = {R.drawable.ic_num_xx_0, R.drawable.ic_num_xx_1, R.drawable.ic_num_xx_2, R.drawable.ic_num_xx_3, R.drawable.ic_num_xx_4, R.drawable.ic_num_xx_5, R.drawable.ic_num_xx_6, R.drawable.ic_num_xx_7, R.drawable.ic_num_xx_8, R.drawable.ic_num_xx_9};

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            iArr[Size.S.ordinal()] = 1;
            iArr[Size.M.ordinal()] = 2;
            iArr[Size.H.ordinal()] = 3;
            iArr[Size.X.ordinal()] = 4;
            iArr[Size.XX.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/ui/view/NumberSize$Size;", "", "S", "M", "H", "X", "XX", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum Size {
        S,
        M,
        H,
        X,
        XX
    }

    @NotNull
    public final Size OooO00o(@Nullable Integer num) {
        if (num != null && num.intValue() == 0) {
            return Size.S;
        }
        if (num != null && num.intValue() == 1) {
            return Size.M;
        }
        if (num != null && num.intValue() == 2) {
            return Size.H;
        }
        if (num != null && num.intValue() == 3) {
            return Size.X;
        }
        return (num != null && num.intValue() == 4) ? Size.XX : Size.H;
    }
}
