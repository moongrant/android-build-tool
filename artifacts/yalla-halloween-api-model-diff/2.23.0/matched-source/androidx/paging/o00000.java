package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f7272OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f7273OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f7274OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f7275OooO0Oo;

    public static final class OooO00o extends o00000 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f7276OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f7277OooO0o0;

        public OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6);
            this.f7277OooO0o0 = i;
            this.f7276OooO0o = i2;
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
            if (this.f7277OooO0o0 == oooO00o.f7277OooO0o0 && this.f7276OooO0o == oooO00o.f7276OooO0o) {
                if (this.f7272OooO00o == oooO00o.f7272OooO00o) {
                    if (this.f7273OooO0O0 == oooO00o.f7273OooO0O0) {
                        if (this.f7274OooO0OO == oooO00o.f7274OooO0OO) {
                            if (this.f7275OooO0Oo == oooO00o.f7275OooO0Oo) {
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
            return super.hashCode() + this.f7277OooO0o0 + this.f7276OooO0o;
        }

        @NotNull
        public final String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Access(\n            |    pageOffset=" + this.f7277OooO0o0 + ",\n            |    indexInPage=" + this.f7276OooO0o + ",\n            |    presentedItemsBefore=" + this.f7272OooO00o + ",\n            |    presentedItemsAfter=" + this.f7273OooO0O0 + ",\n            |    originalPageOffsetFirst=" + this.f7274OooO0OO + ",\n            |    originalPageOffsetLast=" + this.f7275OooO0Oo + ",\n            |)", null, 1, null);
        }
    }

    public static final class OooO0O0 extends o00000 {
        @NotNull
        public final String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f7272OooO00o + ",\n            |    presentedItemsAfter=" + this.f7273OooO0O0 + ",\n            |    originalPageOffsetFirst=" + this.f7274OooO0OO + ",\n            |    originalPageOffsetLast=" + this.f7275OooO0Oo + ",\n            |)", null, 1, null);
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
        this.f7272OooO00o = i;
        this.f7273OooO0O0 = i2;
        this.f7274OooO0OO = i3;
        this.f7275OooO0Oo = i4;
    }

    public final int OooO00o(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = OooO0OO.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i == 2) {
            return this.f7272OooO00o;
        }
        if (i == 3) {
            return this.f7273OooO0O0;
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
        return this.f7272OooO00o == o00000Var.f7272OooO00o && this.f7273OooO0O0 == o00000Var.f7273OooO0O0 && this.f7274OooO0OO == o00000Var.f7274OooO0OO && this.f7275OooO0Oo == o00000Var.f7275OooO0Oo;
    }

    public int hashCode() {
        return this.f7272OooO00o + this.f7273OooO0O0 + this.f7274OooO0OO + this.f7275OooO0Oo;
    }
}
