package o00000O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooO00o implements CharSequence {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final List<OooO0O0<? extends Object>> f26755Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final String f26756Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final List<OooO0O0<o00Oo0>> f26757Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final List<OooO0O0<OooOo00>> f26758Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(@NotNull String text, @NotNull List<OooO0O0<o00Oo0>> spanStyles, @NotNull List<OooO0O0<OooOo00>> paragraphStyles, @NotNull List<? extends OooO0O0<? extends Object>> annotations) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f26756Oooo0o = text;
        this.f26757Oooo0oO = spanStyles;
        this.f26758Oooo0oo = paragraphStyles;
        this.f26755Oooo = annotations;
        int size = paragraphStyles.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0<OooOo00> oooO0O0 = paragraphStyles.get(i2);
            if (!(oooO0O0.f26769OooO0O0 >= i)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (!(oooO0O0.f26770OooO0OO <= this.f26756Oooo0o.length())) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ParagraphStyle range [");
                sbOooO0o0.append(oooO0O0.f26769OooO0O0);
                sbOooO0o0.append(", ");
                throw new IllegalArgumentException(o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, oooO0O0.f26770OooO0OO, ") is out of boundary").toString());
            }
            i = oooO0O0.f26770OooO0OO;
        }
    }

    @NotNull
    public final List<OooO0O0<String>> OooO00o(@NotNull String tag, int i, int i2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<OooO0O0<? extends Object>> list = this.f26755Oooo;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            OooO0O0<? extends Object> oooO0O0 = list.get(i3);
            OooO0O0<? extends Object> oooO0O1 = oooO0O0;
            if ((oooO0O1.f26768OooO00o instanceof String) && Intrinsics.areEqual(tag, oooO0O1.f26771OooO0Oo) && o00000O.OooO0O0.OooO0OO(i, i2, oooO0O1.f26769OooO0O0, oooO0O1.f26770OooO0OO)) {
                arrayList.add(oooO0O0);
            }
        }
        return arrayList;
    }

    @Stable
    @NotNull
    public final OooO00o OooO0O0(@NotNull OooO00o other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(this, "text");
        C0282OooO00o c0282OooO00o = new C0282OooO00o();
        c0282OooO00o.OooO0OO(this);
        c0282OooO00o.OooO0OO(other);
        return c0282OooO00o.OooO0oo();
    }

    @Override // java.lang.CharSequence
    @NotNull
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final OooO00o subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.f26756Oooo0o.length()) {
                return this;
            }
            String strSubstring = this.f26756Oooo0o.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new OooO00o(strSubstring, o00000O.OooO0O0.OooO00o(this.f26757Oooo0oO, i, i2), o00000O.OooO0O0.OooO00o(this.f26758Oooo0oo, i, i2), o00000O.OooO0O0.OooO00o(this.f26755Oooo, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f26756Oooo0o.charAt(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return Intrinsics.areEqual(this.f26756Oooo0o, oooO00o.f26756Oooo0o) && Intrinsics.areEqual(this.f26757Oooo0oO, oooO00o.f26757Oooo0oO) && Intrinsics.areEqual(this.f26758Oooo0oo, oooO00o.f26758Oooo0oo) && Intrinsics.areEqual(this.f26755Oooo, oooO00o.f26755Oooo);
    }

    public final int hashCode() {
        return this.f26755Oooo.hashCode() + ((this.f26758Oooo0oo.hashCode() + ((this.f26757Oooo0oO.hashCode() + (this.f26756Oooo0o.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f26756Oooo0o.length();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final String toString() {
        return this.f26756Oooo0o;
    }

    @Immutable
    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f26768OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f26769OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f26770OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f26771OooO0Oo;

        public OooO0O0(T t, int i, int i2, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f26768OooO00o = t;
            this.f26769OooO0O0 = i;
            this.f26770OooO0OO = i2;
            this.f26771OooO0Oo = tag;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f26768OooO00o, oooO0O0.f26768OooO00o) && this.f26769OooO0O0 == oooO0O0.f26769OooO0O0 && this.f26770OooO0OO == oooO0O0.f26770OooO0OO && Intrinsics.areEqual(this.f26771OooO0Oo, oooO0O0.f26771OooO0Oo);
        }

        public final int hashCode() {
            T t = this.f26768OooO00o;
            return this.f26771OooO0Oo.hashCode() + ((((((t == null ? 0 : t.hashCode()) * 31) + this.f26769OooO0O0) * 31) + this.f26770OooO0OO) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Range(item=");
            sbOooO0o0.append(this.f26768OooO00o);
            sbOooO0o0.append(", start=");
            sbOooO0o0.append(this.f26769OooO0O0);
            sbOooO0o0.append(", end=");
            sbOooO0o0.append(this.f26770OooO0OO);
            sbOooO0o0.append(", tag=");
            return Oooo000.o00oO0o.OooO0O0(sbOooO0o0, this.f26771OooO0Oo, ')');
        }

        public OooO0O0(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    /* JADX INFO: renamed from: o00000O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0282OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final StringBuilder f26759OooO00o = new StringBuilder(16);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<C0283OooO00o<o00Oo0>> f26760OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final List<C0283OooO00o<OooOo00>> f26761OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final List<C0283OooO00o<? extends Object>> f26762OooO0Oo = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final List<C0283OooO00o<? extends Object>> f26763OooO0o0 = new ArrayList();

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void OooO00o(@NotNull o00Oo0 style, int i, int i2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f26760OooO0O0.add(new C0283OooO00o<>(style, i, i2, null, 8));
        }

        public final void OooO0O0(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f26759OooO00o.append(text);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void OooO0OO(@NotNull OooO00o text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = this.f26759OooO00o.length();
            this.f26759OooO00o.append(text.f26756Oooo0o);
            List<OooO0O0<o00Oo0>> list = text.f26757Oooo0oO;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                OooO0O0<o00Oo0> oooO0O0 = list.get(i);
                OooO00o(oooO0O0.f26768OooO00o, oooO0O0.f26769OooO0O0 + length, oooO0O0.f26770OooO0OO + length);
            }
            List<OooO0O0<OooOo00>> list2 = text.f26758Oooo0oo;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                OooO0O0<OooOo00> oooO0O1 = list2.get(i2);
                OooOo00 style = oooO0O1.f26768OooO00o;
                int i3 = length + oooO0O1.f26769OooO0O0;
                int i4 = length + oooO0O1.f26770OooO0OO;
                Intrinsics.checkNotNullParameter(style, "style");
                this.f26761OooO0OO.add(new C0283OooO00o<>(style, i3, i4, null, 8));
            }
            List<OooO0O0<? extends Object>> list3 = text.f26755Oooo;
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                OooO0O0<? extends Object> oooO0O2 = list3.get(i5);
                this.f26762OooO0Oo.add(new C0283OooO00o<>(oooO0O2.f26768OooO00o, oooO0O2.f26769OooO0O0 + length, oooO0O2.f26770OooO0OO + length, oooO0O2.f26771OooO0Oo));
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<? extends java.lang.Object>>] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<? extends java.lang.Object>>] */
        public final void OooO0Oo() {
            if (!(!this.f26763OooO0o0.isEmpty())) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            ?? r0 = this.f26763OooO0o0;
            ((C0283OooO00o) r0.remove(r0.size() - 1)).f26766OooO0OO = this.f26759OooO00o.length();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final int OooO0o(@NotNull String tag, @NotNull String annotation) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            C0283OooO00o<? extends Object> c0283OooO00o = new C0283OooO00o<>(annotation, this.f26759OooO00o.length(), 0, tag, 4);
            this.f26763OooO0o0.add(c0283OooO00o);
            this.f26762OooO0Oo.add(c0283OooO00o);
            return this.f26763OooO0o0.size() - 1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<? extends java.lang.Object>>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<? extends java.lang.Object>>] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<? extends java.lang.Object>>] */
        public final void OooO0o0(int i) {
            if (i < this.f26763OooO0o0.size()) {
                while (this.f26763OooO0o0.size() - 1 >= i) {
                    OooO0Oo();
                }
            } else {
                throw new IllegalStateException((i + " should be less than " + this.f26763OooO0o0.size()).toString());
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final int OooO0oO(@NotNull o00Oo0 style) {
            Intrinsics.checkNotNullParameter(style, "style");
            C0283OooO00o<o00Oo0> c0283OooO00o = new C0283OooO00o<>(style, this.f26759OooO00o.length(), 0, null, 12);
            this.f26763OooO0o0.add(c0283OooO00o);
            this.f26760OooO0O0.add(c0283OooO00o);
            return this.f26763OooO0o0.size() - 1;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<o00000O.o00Oo0>>] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<o00000O.OooOo00>>] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooO00o$OooO00o$OooO00o<? extends java.lang.Object>>] */
        @NotNull
        public final OooO00o OooO0oo() {
            String string = this.f26759OooO00o.toString();
            Intrinsics.checkNotNullExpressionValue(string, "text.toString()");
            ?? r1 = this.f26760OooO0O0;
            ArrayList arrayList = new ArrayList(r1.size());
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C0283OooO00o) r1.get(i)).OooO00o(this.f26759OooO00o.length()));
            }
            ?? r2 = this.f26761OooO0OO;
            ArrayList arrayList2 = new ArrayList(r2.size());
            int size2 = r2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(((C0283OooO00o) r2.get(i2)).OooO00o(this.f26759OooO00o.length()));
            }
            ?? r3 = this.f26762OooO0Oo;
            ArrayList arrayList3 = new ArrayList(r3.size());
            int size3 = r3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(((C0283OooO00o) r3.get(i3)).OooO00o(this.f26759OooO00o.length()));
            }
            return new OooO00o(string, arrayList, arrayList2, arrayList3);
        }

        /* JADX INFO: renamed from: o00000O.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0283OooO00o<T> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final T f26764OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f26765OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f26766OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @NotNull
            public final String f26767OooO0Oo;

            /* JADX WARN: Multi-variable type inference failed */
            public C0283OooO00o(Object obj, int i, int i2, String tag, int i3) {
                i2 = (i3 & 4) != 0 ? Integer.MIN_VALUE : i2;
                tag = (i3 & 8) != 0 ? "" : tag;
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.f26764OooO00o = obj;
                this.f26765OooO0O0 = i;
                this.f26766OooO0OO = i2;
                this.f26767OooO0Oo = tag;
            }

            @NotNull
            public final OooO0O0<T> OooO00o(int i) {
                int i2 = this.f26766OooO0OO;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new OooO0O0<>(this.f26764OooO00o, this.f26765OooO0O0, i, this.f26767OooO0Oo);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0283OooO00o)) {
                    return false;
                }
                C0283OooO00o c0283OooO00o = (C0283OooO00o) obj;
                return Intrinsics.areEqual(this.f26764OooO00o, c0283OooO00o.f26764OooO00o) && this.f26765OooO0O0 == c0283OooO00o.f26765OooO0O0 && this.f26766OooO0OO == c0283OooO00o.f26766OooO0OO && Intrinsics.areEqual(this.f26767OooO0Oo, c0283OooO00o.f26767OooO0Oo);
            }

            public final int hashCode() {
                T t = this.f26764OooO00o;
                return this.f26767OooO0Oo.hashCode() + ((((((t == null ? 0 : t.hashCode()) * 31) + this.f26765OooO0O0) * 31) + this.f26766OooO0OO) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MutableRange(item=");
                sbOooO0o0.append(this.f26764OooO00o);
                sbOooO0o0.append(", start=");
                sbOooO0o0.append(this.f26765OooO0O0);
                sbOooO0o0.append(", end=");
                sbOooO0o0.append(this.f26766OooO0OO);
                sbOooO0o0.append(", tag=");
                return Oooo000.o00oO0o.OooO0O0(sbOooO0o0, this.f26767OooO0Oo, ')');
            }

            public C0283OooO00o(T t, int i, int i2, @NotNull String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.f26764OooO00o = t;
                this.f26765OooO0O0 = i;
                this.f26766OooO0OO = i2;
                this.f26767OooO0Oo = tag;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooO00o(String text, List spanStyles, int i) {
        spanStyles = (i & 2) != 0 ? CollectionsKt.emptyList() : spanStyles;
        List paragraphStyles = (i & 4) != 0 ? CollectionsKt.emptyList() : null;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
        this(text, spanStyles, paragraphStyles, CollectionsKt.emptyList());
    }
}
