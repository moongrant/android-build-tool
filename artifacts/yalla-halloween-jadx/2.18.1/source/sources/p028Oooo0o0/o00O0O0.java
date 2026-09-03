package p028Oooo0o0;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public abstract class o00O0O0 {

    public static final class OooO00o extends o00O0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00OO0O0.OooO0O0 f2064OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull o00OO0O0.OooO0O0 horizontal) {
            super(null);
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            this.f2064OooO00o = horizontal;
        }

        @Override // p028Oooo0o0.o00O0O0
        public final int OooO00o(int i, @NotNull LayoutDirection layoutDirection, @NotNull o000O000 placeable) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return this.f2064OooO00o.OooO00o(0, i, layoutDirection);
        }
    }

    public static final class OooO0O0 extends o00O0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00OO0O0.OooO0OO f2065OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o00OO0O0.OooO0OO vertical) {
            super(null);
            Intrinsics.checkNotNullParameter(vertical, "vertical");
            this.f2065OooO00o = vertical;
        }

        @Override // p028Oooo0o0.o00O0O0
        public final int OooO00o(int i, @NotNull LayoutDirection layoutDirection, @NotNull o000O000 placeable) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return this.f2065OooO00o.OooO00o(0, i);
        }
    }

    public o00O0O0(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract int OooO00o(int i, @NotNull LayoutDirection layoutDirection, @NotNull o000O000 o000o001);
}
