package p054o00000oo;

import androidx.compose.runtime.Immutable;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o00O0O;
import o00000O.o0OO00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0O0;
import p045OooooOo.o00O;
import p045OooooOo.o00OO000;
import p045OooooOo.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f27234OooO0Oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o00O<oo0oOO0, Object> f27235OooO0o0 = (o00OO000.OooO0OO) o00OO000.OooO00o(OooO00o.f27239Oooo0o, OooO0O0.f27240Oooo0o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000O.OooO00o f27236OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f27237OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0OO00O f27238OooO0OO;

    public static final class OooO00o extends Lambda implements Function2<o00OO00O, oo0oOO0, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f27239Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO00O o00oo00o, oo0oOO0 oo0ooo0) {
            o00OO00O Saver = o00oo00o;
            oo0oOO0 it = oo0ooo0;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO00O o0oo00o2 = new o0OO00O(it.f27237OooO0O0);
            Intrinsics.checkNotNullParameter(o0OO00O.f26874OooO0O0, "<this>");
            return CollectionsKt.arrayListOf(o00O0O.OooO00o(it.f27236OooO00o, o00O0O.f26805OooO00o, Saver), o00O0O.OooO00o(o0oo00o2, o00O0O.f26815OooOO0o, Saver));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Object, oo0oOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f27240Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final oo0oOO0 invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            o00O<o00000O.OooO00o, Object> o00o2 = o00O0O.f26805OooO00o;
            Boolean bool = Boolean.FALSE;
            o00000O.OooO00o OooO00o2 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : o00o2.OooO00o(obj);
            Intrinsics.checkNotNull(OooO00o2);
            Object obj2 = list.get(1);
            Intrinsics.checkNotNullParameter(o0OO00O.f26874OooO0O0, "<this>");
            o0OO00O o0oo00oOooO00o = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : o00O0O.f26815OooOO0o.OooO00o(obj2);
            Intrinsics.checkNotNull(o0oo00oOooO00o);
            return new oo0oOO0(OooO00o2, o0oo00oOooO00o.f26876OooO00o, (o0OO00O) null);
        }
    }

    public static final class OooO0OO {
    }

    public oo0oOO0(o00000O.OooO00o oooO00o, long j, o0OO00O o0oo00o2) {
        this.f27236OooO00o = oooO00o;
        this.f27237OooO0O0 = o000O0O0.OooO0O0(j, oooO00o.f26756Oooo0o.length());
        this.f27238OooO0OO = o0oo00o2 != null ? new o0OO00O(o000O0O0.OooO0O0(o0oo00o2.f26876OooO00o, oooO00o.f26756Oooo0o.length())) : null;
    }

    public static oo0oOO0 OooO00o(oo0oOO0 oo0ooo0, o00000O.OooO00o annotatedString, long j, int i) {
        if ((i & 1) != 0) {
            annotatedString = oo0ooo0.f27236OooO00o;
        }
        if ((i & 2) != 0) {
            j = oo0ooo0.f27237OooO0O0;
        }
        o0OO00O o0oo00o2 = (i & 4) != 0 ? oo0ooo0.f27238OooO0OO : null;
        Objects.requireNonNull(oo0ooo0);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        return new oo0oOO0(annotatedString, j, o0oo00o2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0oOO0)) {
            return false;
        }
        oo0oOO0 oo0ooo0 = (oo0oOO0) obj;
        return o0OO00O.OooO0O0(this.f27237OooO0O0, oo0ooo0.f27237OooO0O0) && Intrinsics.areEqual(this.f27238OooO0OO, oo0ooo0.f27238OooO0OO) && Intrinsics.areEqual(this.f27236OooO00o, oo0ooo0.f27236OooO00o);
    }

    public final int hashCode() {
        int iOooO = (o0OO00O.OooO(this.f27237OooO0O0) + (this.f27236OooO00o.hashCode() * 31)) * 31;
        o0OO00O o0oo00o2 = this.f27238OooO0OO;
        return iOooO + (o0oo00o2 != null ? o0OO00O.OooO(o0oo00o2.f26876OooO00o) : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextFieldValue(text='");
        sbOooO0o0.append((Object) this.f27236OooO00o);
        sbOooO0o0.append("', selection=");
        sbOooO0o0.append((Object) o0OO00O.OooOO0(this.f27237OooO0O0));
        sbOooO0o0.append(", composition=");
        sbOooO0o0.append(this.f27238OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oo0oOO0(String str, long j, int i) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
            j = o0OO00O.f26875OooO0OO;
        }
        this(new o00000O.OooO00o(str, null, 6), j, (o0OO00O) null);
    }
}
