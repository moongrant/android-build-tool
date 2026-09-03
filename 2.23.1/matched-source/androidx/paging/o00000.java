package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f10377OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f10378OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f10379OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f10380OooO0Oo;

    public static final class OooO00o extends o00000 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f10381OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f10382OooO0o0;

        public OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6);
            this.f10382OooO0o0 = i;
            this.f10381OooO0o = i2;
        }

        @Override // androidx.paging.o00000
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (this.f10382OooO0o0 == oooO00o.f10382OooO0o0 && this.f10381OooO0o == oooO00o.f10381OooO0o) {
                if (this.f10377OooO00o == oooO00o.f10377OooO00o) {
                    if (this.f10378OooO0O0 == oooO00o.f10378OooO0O0) {
                        if (this.f10379OooO0OO == oooO00o.f10379OooO0OO) {
                            if (this.f10380OooO0Oo == oooO00o.f10380OooO0Oo) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.paging.o00000
        public final int hashCode() {
            return super.hashCode() + this.f10382OooO0o0 + this.f10381OooO0o;
        }

        @NotNull
        public final String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Access(\n            |    pageOffset=" + this.f10382OooO0o0 + ",\n            |    indexInPage=" + this.f10381OooO0o + ",\n            |    presentedItemsBefore=" + this.f10377OooO00o + ",\n            |    presentedItemsAfter=" + this.f10378OooO0O0 + ",\n            |    originalPageOffsetFirst=" + this.f10379OooO0OO + ",\n            |    originalPageOffsetLast=" + this.f10380OooO0Oo + ",\n            |)", null, 1, null);
        }
    }

    public static final class OooO0O0 extends o00000 {
        @NotNull
        public final String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f10377OooO00o + ",\n            |    presentedItemsAfter=" + this.f10378OooO0O0 + ",\n            |    originalPageOffsetFirst=" + this.f10379OooO0OO + ",\n            |    originalPageOffsetLast=" + this.f10380OooO0Oo + ",\n            |)", null, 1, null);
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o00000(int i, int i2, int i3, int i4) {
        this.f10377OooO00o = i;
        this.f10378OooO0O0 = i2;
        this.f10379OooO0OO = i3;
        this.f10380OooO0Oo = i4;
    }

    public final int OooO00o(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = OooO0OO.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i == 2) {
            return this.f10377OooO00o;
        }
        if (i == 3) {
            return this.f10378OooO0O0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000)) {
            return false;
        }
        o00000 o00000Var = (o00000) obj;
        return this.f10377OooO00o == o00000Var.f10377OooO00o && this.f10378OooO0O0 == o00000Var.f10378OooO0O0 && this.f10379OooO0OO == o00000Var.f10379OooO0OO && this.f10380OooO0Oo == o00000Var.f10380OooO0Oo;
    }

    public int hashCode() {
        return this.f10377OooO00o + this.f10378OooO0O0 + this.f10379OooO0OO + this.f10380OooO0Oo;
    }
}
