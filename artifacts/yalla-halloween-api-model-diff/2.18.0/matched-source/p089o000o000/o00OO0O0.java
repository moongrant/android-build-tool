package p089o000o000;

import androidx.paging.LoadType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f29044OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f29045OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f29046OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29047OooO0Oo;

    public static final class OooO00o extends o00OO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f29048OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f29049OooO0o0;

        public OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6);
            this.f29049OooO0o0 = i;
            this.f29048OooO0o = i2;
        }

        @Override // p089o000o000.o00OO0O0
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f29049OooO0o0 == oooO00o.f29049OooO0o0 && this.f29048OooO0o == oooO00o.f29048OooO0o && this.f29044OooO00o == oooO00o.f29044OooO00o && this.f29045OooO0O0 == oooO00o.f29045OooO0O0 && this.f29046OooO0OO == oooO00o.f29046OooO0OO && this.f29047OooO0Oo == oooO00o.f29047OooO0Oo;
        }

        @Override // p089o000o000.o00OO0O0
        public final int hashCode() {
            return super.hashCode() + this.f29049OooO0o0 + this.f29048OooO0o;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("ViewportHint.Access(\n            |    pageOffset=");
            sbOooO0O0.append(this.f29049OooO0o0);
            sbOooO0O0.append(",\n            |    indexInPage=");
            sbOooO0O0.append(this.f29048OooO0o);
            sbOooO0O0.append(",\n            |    presentedItemsBefore=");
            sbOooO0O0.append(this.f29044OooO00o);
            sbOooO0O0.append(",\n            |    presentedItemsAfter=");
            sbOooO0O0.append(this.f29045OooO0O0);
            sbOooO0O0.append(",\n            |    originalPageOffsetFirst=");
            sbOooO0O0.append(this.f29046OooO0OO);
            sbOooO0O0.append(",\n            |    originalPageOffsetLast=");
            sbOooO0O0.append(this.f29047OooO0Oo);
            sbOooO0O0.append(",\n            |)");
            return StringsKt__IndentKt.trimMargin$default(sbOooO0O0.toString(), null, 1, null);
        }
    }

    public static final class OooO0O0 extends o00OO0O0 {
        public OooO0O0(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("ViewportHint.Initial(\n            |    presentedItemsBefore=");
            sbOooO0O0.append(this.f29044OooO00o);
            sbOooO0O0.append(",\n            |    presentedItemsAfter=");
            sbOooO0O0.append(this.f29045OooO0O0);
            sbOooO0O0.append(",\n            |    originalPageOffsetFirst=");
            sbOooO0O0.append(this.f29046OooO0OO);
            sbOooO0O0.append(",\n            |    originalPageOffsetLast=");
            sbOooO0O0.append(this.f29047OooO0Oo);
            sbOooO0O0.append(",\n            |)");
            return StringsKt__IndentKt.trimMargin$default(sbOooO0O0.toString(), null, 1, null);
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.APPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o00OO0O0(int i, int i2, int i3, int i4) {
        this.f29044OooO00o = i;
        this.f29045OooO0O0 = i2;
        this.f29046OooO0OO = i3;
        this.f29047OooO0Oo = i4;
    }

    public final int OooO00o(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = OooO0OO.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i == 2) {
            return this.f29044OooO00o;
        }
        if (i == 3) {
            return this.f29045OooO0O0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OO0O0)) {
            return false;
        }
        o00OO0O0 o00oo0o1 = (o00OO0O0) obj;
        return this.f29044OooO00o == o00oo0o1.f29044OooO00o && this.f29045OooO0O0 == o00oo0o1.f29045OooO0O0 && this.f29046OooO0OO == o00oo0o1.f29046OooO0OO && this.f29047OooO0Oo == o00oo0o1.f29047OooO0Oo;
    }

    public int hashCode() {
        return this.f29044OooO00o + this.f29045OooO0O0 + this.f29046OooO0OO + this.f29047OooO0Oo;
    }
}
