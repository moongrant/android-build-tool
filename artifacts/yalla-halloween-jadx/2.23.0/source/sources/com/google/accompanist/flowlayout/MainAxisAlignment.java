package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Center' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "arrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getArrangement$flowlayout_release", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Center", "Start", "End", "SpaceEvenly", "SpaceBetween", "SpaceAround", "flowlayout_release"}, k = 1, mv = {1, 8, 0})
public final class MainAxisAlignment {
    private static final /* synthetic */ MainAxisAlignment[] $VALUES;
    public static final MainAxisAlignment Center;
    public static final MainAxisAlignment End;
    public static final MainAxisAlignment SpaceAround;
    public static final MainAxisAlignment SpaceBetween;
    public static final MainAxisAlignment SpaceEvenly;
    public static final MainAxisAlignment Start;

    @NotNull
    private final Arrangement.Vertical arrangement;

    static {
        Arrangement arrangement = Arrangement.INSTANCE;
        MainAxisAlignment mainAxisAlignment = new MainAxisAlignment("Center", 0, arrangement.getCenter());
        Center = mainAxisAlignment;
        MainAxisAlignment mainAxisAlignment2 = new MainAxisAlignment("Start", 1, arrangement.getTop());
        Start = mainAxisAlignment2;
        MainAxisAlignment mainAxisAlignment3 = new MainAxisAlignment("End", 2, arrangement.getBottom());
        End = mainAxisAlignment3;
        MainAxisAlignment mainAxisAlignment4 = new MainAxisAlignment("SpaceEvenly", 3, arrangement.getSpaceEvenly());
        SpaceEvenly = mainAxisAlignment4;
        MainAxisAlignment mainAxisAlignment5 = new MainAxisAlignment("SpaceBetween", 4, arrangement.getSpaceBetween());
        SpaceBetween = mainAxisAlignment5;
        MainAxisAlignment mainAxisAlignment6 = new MainAxisAlignment("SpaceAround", 5, arrangement.getSpaceAround());
        SpaceAround = mainAxisAlignment6;
        $VALUES = new MainAxisAlignment[]{mainAxisAlignment, mainAxisAlignment2, mainAxisAlignment3, mainAxisAlignment4, mainAxisAlignment5, mainAxisAlignment6};
    }

    public MainAxisAlignment(String str, int i, Arrangement.Vertical vertical) {
        super(str, i);
        this.arrangement = vertical;
    }

    public static MainAxisAlignment valueOf(String str) {
        return (MainAxisAlignment) Enum.valueOf(MainAxisAlignment.class, str);
    }

    public static MainAxisAlignment[] values() {
        return (MainAxisAlignment[]) $VALUES.clone();
    }
}
