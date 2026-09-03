package com.yalla.yalla.ui.view;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class NumberSize {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f29958OooO00o = o0Oo0oo.ic_chatline_gift_x;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f29959OooO0O0 = o0Oo0oo.ic_x_number_space;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Size.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Size.X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Size.XX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Size.RunWay.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 com.yalla.yalla.ui.view.NumberSize$Size[], still in use, count: 1, list:
      (r11v2 com.yalla.yalla.ui.view.NumberSize$Size[]) from 0x004d: INVOKE (r11v2 com.yalla.yalla.ui.view.NumberSize$Size[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:78)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/view/NumberSize$Size;", "", "S", "M", "H", "X", "XX", "RunWay", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Size {
        S,
        M,
        H,
        X,
        XX,
        RunWay;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(sizeArr);
        }

        public Size() {
            super(str, i);
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    @NotNull
    public static Size OooO00o(@Nullable Integer num) {
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
        if (num != null && num.intValue() == 4) {
            return Size.XX;
        }
        return (num != null && num.intValue() == 5) ? Size.RunWay : Size.H;
    }
}
